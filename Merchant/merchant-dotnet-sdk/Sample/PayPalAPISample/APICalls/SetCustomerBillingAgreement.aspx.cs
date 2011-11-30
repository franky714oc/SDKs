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

using PayPal.Manager;
using PayPal.PayPalAPIInterfaceService;
using PayPal.PayPalAPIInterfaceService.Model;

namespace PayPalAPISample.APICalls
{
    public partial class SetCustomerBillingAgreement : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            UriBuilder uriBuilder = new UriBuilder(Request.Url.ToString());
            uriBuilder.Path = "APICalls/GetBillingAgreementCustomerDetails.aspx";
            returnUrl.Value = uriBuilder.Uri.ToString();
        }

        protected void Submit_Click(object sender, EventArgs e)
        {
            // Create request object
            SetCustomerBillingAgreementRequestType request = new SetCustomerBillingAgreementRequestType();
            SetCustomerBillingAgreementRequestDetailsType requestDetails = new SetCustomerBillingAgreementRequestDetailsType();
            requestDetails.BuyerEmail = buyerEmail.Value;
            requestDetails.ReturnURL = returnUrl.Value;
            requestDetails.CancelURL = cancelUrl.Value;
            BillingAgreementDetailsType baDetails = new BillingAgreementDetailsType();
            baDetails.BillingAgreementDescription = billingAgreementText.Value;
            baDetails.BillingType = (BillingCodeType)
                Enum.Parse( typeof(BillingCodeType), billingType.SelectedValue);
            requestDetails.BillingAgreementDetails = baDetails;
            request.SetCustomerBillingAgreementRequestDetails = requestDetails;

            // Invoke the API
            SetCustomerBillingAgreementReq wrapper = new SetCustomerBillingAgreementReq();
            wrapper.SetCustomerBillingAgreementRequest = request;
            PayPalAPIInterfaceServiceService service = new PayPalAPIInterfaceServiceService();
            SetCustomerBillingAgreementResponseType setCustomerBillingAgreementResponse =
                    service.SetCustomerBillingAgreement(wrapper);

            // Check for API return status
            setKeyResponseObjects(service, setCustomerBillingAgreementResponse);
        }

        private void setKeyResponseObjects(PayPalAPIInterfaceServiceService service, SetCustomerBillingAgreementResponseType response)
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
                keyResponseParameters.Add("Token", response.Token);
                Session["Response_redirectURL"] = ConfigManager.Instance.GetProperty("paypalUrl")
                    + "_customer-billing-agreement&token=" + response.Token;
            }            
            Session["Response_keyResponseObject"] = keyResponseParameters;
            Session["Response_apiName"] = "SetCustomerBillingAgreement";
            Session["Response_requestPayload"] = service.getLastRequest();
            Session["Response_responsePayload"] = service.getLastResponse();
            Response.Redirect("../APIResponse.aspx");
        }

    }
}
