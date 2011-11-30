using System;
using System.Data;
using System.Configuration;
using System.Collections;
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
    public partial class DoReferenceTransaction : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Submit_Click(object sender, EventArgs e)
        {
            // Create request object
            DoReferenceTransactionRequestType request = new DoReferenceTransactionRequestType();
            request.Version = "84.0";
            populateRequestObject(request);

            // Invoke the API
            DoReferenceTransactionReq wrapper = new DoReferenceTransactionReq();
            wrapper.DoReferenceTransactionRequest = request;
            PayPalAPIInterfaceServiceService service = new PayPalAPIInterfaceServiceService();
            DoReferenceTransactionResponseType doReferenceTxnResponse = service.DoReferenceTransaction(wrapper);

            // Check for API return status

        }

        private void populateRequestObject(DoReferenceTransactionRequestType request)
        {
            DoReferenceTransactionRequestDetailsType referenceTransactionDetails = new DoReferenceTransactionRequestDetailsType();
            request.DoReferenceTransactionRequestDetails = referenceTransactionDetails;
            referenceTransactionDetails.ReferenceID = referenceId.Value;
            referenceTransactionDetails.PaymentAction = (PaymentActionCodeType)
                Enum.Parse(typeof(PaymentActionCodeType), paymentAction.SelectedValue);

            // Populate payment requestDetails. 
            PaymentDetailsType paymentDetails = new PaymentDetailsType();
            referenceTransactionDetails.PaymentDetails = paymentDetails;
            double orderTotal = 0.0;
            double itemTotal = 0.0;
            CurrencyCodeType currency = (CurrencyCodeType)
                Enum.Parse(typeof(CurrencyCodeType), currencyCode.SelectedValue);

            if (shippingTotal.Value != "")
            {
                paymentDetails.ShippingTotal = new BasicAmountType(currency, shippingTotal.Value);
                orderTotal += Double.Parse(shippingTotal.Value);
            }
            if (insuranceTotal.Value != "")
            {
                paymentDetails.InsuranceTotal = new BasicAmountType(currency, insuranceTotal.Value);
                paymentDetails.InsuranceOptionOffered = "true";
                orderTotal += Double.Parse(insuranceTotal.Value);
            }
            if (handlingTotal.Value != "")
            {
                paymentDetails.HandlingTotal = new BasicAmountType(currency, handlingTotal.Value);
                orderTotal += Double.Parse(handlingTotal.Value);
            }
            if (taxTotal.Value != "")
            {
                paymentDetails.TaxTotal = new BasicAmountType(currency, taxTotal.Value);
                orderTotal += Double.Parse(taxTotal.Value);
            }
            if (orderDescription.Value != "")
            {
                paymentDetails.OrderDescription = orderDescription.Value;
            }
            paymentDetails.PaymentAction = (PaymentActionCodeType)
                Enum.Parse(typeof(PaymentActionCodeType), paymentAction.SelectedValue);


            // Each payment can include requestDetails about multiple payment items
            // This example shows just one payment item
            if (itemName.Value != null && itemAmount.Value != null && itemQuantity.Value != null)
            {
                PaymentDetailsItemType itemDetails = new PaymentDetailsItemType();
                itemDetails.Name = itemName.Value;
                itemDetails.Amount = new BasicAmountType(currency, itemAmount.Value);
                itemDetails.Quantity = Int32.Parse(itemQuantity.Value);
                itemDetails.ItemCategory = (ItemCategoryType)
                    Enum.Parse(typeof(ItemCategoryType), itemCategory.SelectedValue);
                itemTotal += Double.Parse(itemDetails.Amount.value) * itemDetails.Quantity.Value;
                if (salesTax.Value != "")
                {
                    itemDetails.Tax = new BasicAmountType(currency, salesTax.Value);
                    orderTotal += Double.Parse(salesTax.Value);
                }
                if (itemDescription.Value != "")
                {
                    itemDetails.Description = itemDescription.Value;
                }
                paymentDetails.PaymentDetailsItem.Add(itemDetails);
            }
            orderTotal += itemTotal;
            paymentDetails.ItemTotal = new BasicAmountType(currency, itemTotal.ToString());
            paymentDetails.OrderTotal = new BasicAmountType(currency, orderTotal.ToString());

        }

    }
}
