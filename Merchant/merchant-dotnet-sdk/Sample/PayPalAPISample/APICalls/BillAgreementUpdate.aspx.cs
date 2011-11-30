using System;
using System.Data;
using System.Configuration;
using System.Collections;
using System.Collections.Generic;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;

using PayPal.PayPalAPIInterfaceService;
using PayPal.PayPalAPIInterfaceService.Model;

namespace PayPalAPISample.APICalls
{
    public partial class BAUpdate : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Submit_Click(object sender, EventArgs e)
        {
            // Create request object
            BAUpdateRequestType request = new BAUpdateRequestType();            
            request.ReferenceID = referenceId.Value;
            if (billingAgreementStatus.SelectedIndex != 0)
            {
                request.BillingAgreementStatus = (MerchantPullStatusCodeType)
                    Enum.Parse(typeof(MerchantPullStatusCodeType), billingAgreementStatus.SelectedValue);
            }
            if (billingAgreementText.Value != "")
            {
                request.BillingAgreementDescription = billingAgreementText.Value;
            }


            // Invoke the API
            BillAgreementUpdateReq wrapper = new BillAgreementUpdateReq();
            wrapper.BAUpdateRequest = request;
            PayPalAPIInterfaceServiceService service = new PayPalAPIInterfaceServiceService();
            BAUpdateResponseType billingAgreementResponse =
                    service.BillAgreementUpdate(wrapper);

            // Check for API return status
            setKeyResponseObjects(service, billingAgreementResponse);
        }

        private void setKeyResponseObjects(PayPalAPIInterfaceServiceService service, BAUpdateResponseType response)
        {
            Dictionary<string, string> keyResponseParameters = new Dictionary<string, string>();
            keyResponseParameters.Add("API Status", response.Ack.ToString());
            if (response.Ack.Equals(AckCodeType.FAILURE) ||
                (response.Errors != null && response.Errors.Count > 0))
            {
                Session["Response_error"] = response.Errors;
            }
            else
            {
                Session["Response_error"] = null;
                keyResponseParameters.Add("Billing Agreement Status", response.BAUpdateResponseDetails.BillingAgreementStatus.ToString());
                keyResponseParameters.Add("Billing Agreement description", response.BAUpdateResponseDetails.BillingAgreementDescription);
            }
            Session["Response_keyResponseObject"] = keyResponseParameters;
            Session["Response_apiName"] = "BillAgreementUpdate";
            Session["Response_requestPayload"] = service.getLastRequest();
            Session["Response_responsePayload"] = service.getLastResponse();
            Session["Response_redirectURL"] = null;
            Response.Redirect("../APIResponse.aspx");

        }

    }
}
