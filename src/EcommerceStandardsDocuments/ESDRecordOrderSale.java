/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;

import java.util.ArrayList;

/**
* Ecommerce Standards Record that holds data for a single sales order. A sales order indicates an intent of a customer account to make a purchase.
*/
public class ESDRecordOrderSale   
{
    /**
    * UNPAID - No payment was received as yet
    */
    public static final String PAYMENT_METHOD_UNPAID = "UNPAID";
    /**
    * CREDIT - A payment was made with a credit card
    */
    public static final String PAYMENT_METHOD_CREDIT = "CREDITCARD";
    /**
    * COD - Payment will be made with cash when the goods are delivered to the delivery location
    */
    public static final String PAYMENT_METHOD_CASHONDELIVERY = "COD";
    /**
    * DIRECTDEPOSIT - Payment has been made with a direct bank transfer
    */
    public static final String PAYMENT_METHOD_DIRECTDEPOSIT = "DIRECTDEPOSIT";
    /**
    * QUOTE - No payment was made as a quote was only required
    */
    public static final String PAYMENT_METHOD_QUOTE = "QUOTE";
    /**
    * NONE - No payment was made or needed
    */
    public static final String PAYMENT_METHOD_NONE = "NONE";
    /**
    * PROPRIETARY - A payment was made using a proprietary payment system. PayPal could be one example of this.
    */
    public static final String PAYMENT_METHOD_PROPRIETARY = "PROPRIETARY";
    /**
    * ACCOUNT - A payment will be assigned to a customer account and paid based on the agreed payment terms
    */
    public static final String PAYMENT_METHOD_ACCOUNT = "ACCOUNT";
    /**
    * UNPAID - The order has not been paid for
    */
    public static final String PAYMENT_STATUS_UNPAID = "UNPAID";
    /**
    * PENDING - A payment is currently in the process of being paid for, or is waiting on a process to complete
    */
    public static final String PAYMENT_STATUS_PENDING = "PENDING";
    /**
    * PAID - The order has been paid
    */
    public static final String PAYMENT_STATUS_PAID = "PAID";
    /**
    * DECLINED - A payment failed when trying to be paid
    */
    public static final String PAYMENT_STATUS_DECLINED = "DECLINED";
    /**
    * NONREQUIRED - No payment is required to pay for the order
    */
    public static final String PAYMENT_STATUS_NONREQUIRED = "NONREQUIRED";
    /**
    * ArrayList of lines  to the order
    */
    public ArrayList<ESDRecordOrderSaleLine> lines = new ArrayList<ESDRecordOrderSaleLine>();

    /**
    * ArrayList of surcharge lines  to the order
    */
    public ArrayList<ESDRecordOrderSurcharge> surcharges = new ArrayList<ESDRecordOrderSurcharge>();

    /**
    * ArrayList of payments  to the order
    */
    public ArrayList<ESDRecordOrderPayment> payments = new ArrayList<ESDRecordOrderPayment>();

    /**
    * Key that allows the sale order record to be uniquely identified and linked to.
    */
    public String keySalesOrderID = new String();

    /**
    * Code of the sales order, may or may not be a unqiue indentifier
    */
    public String salesOrderCode = new String();

    /**
    * Number of the sales order, may or may not be a unique identifier
    */
    public String salesOrderNumber = new String();

    /**
    * Key of the customer account record that is assigned to the order. The customer indicates the purchaser of the order.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Code of the customer account, may or not be a unique identifier of the account.
    */
    public String customerAccountCode = new String();

    /**
    * Name of the customer account
    */
    public String customerAccountName = new String();

    /**
    * Date that the order was sent
    */
    public long sentDate = 0;

    /**
    * Date that the order was processed. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long processedDate = 0;

    /**
    * Date that the order's goods were sent out. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long dispatchedDate = 0;

    /**
    * Date that the order's goods were received by the purchaser. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long receivedDate = 0;

    /**
    * Date that the order was last modified. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long modifiedDate = 0;

    /**
    * Date that the order was created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long createdDate = 0;

    /**
    * ID of the user in the associated Ecommerce system where the order was created.
    */
    public String eCommerceUserID = new String();

    /**
    * Name of the user in the associated Ecommerce system where the order was created. Ideally this is  to a label of the user, and not the credentials used for a user to login (since that could be a security issue passing around such information).
    */
    public String eCommerceUserName = new String();

    /**
    * ID of the associated Ecommerce system where the order was created. Ideally each system s its own unique identifier, formatted such as ORG_NAME.SYSTEM_NAME
    */
    public String eCommerceSystemID = new String();

    /**
    * Key of the sales representative record linked to the order.
    */
    public String keySalesRepID = new String();

    /**
    * Code of the sales representative.
    */
    public String salesRepCode = new String();

    /**
    * Name of the sales representative.
    */
    public String salesRepName = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the sales representative is an individual person.
    */
    public String salesRepIndividual = new String();

    /**
    * Customer entity buying the order. Set it to one of the constants in the ESDocumentConstants class prefixed with ENTITY_TYPE_
    */
    public String customerEntity = new String();

    /**
    * Name of the person who is the customer of the order.
    */
    public String customerPersonName = new String();

    /**
    * Name of the organisation who is the customer of the order.
    */
    public String customerOrgName = new String();

    /**
    * Authority numbers of the customer of the order.
    */
    public String[] customerAuthorityNumbers = new String[]{};

    /**
    * list of Labels  for the customer authority numbers. Ensure that the array length is the same as the authorityNumbers property, or left empty
    */
    public String[] customerAuthorityNumberLabels = new String[]{};

    /**
    * list of authority number types matching the customer authority numbers. If , must use the ESDocumentConstants that are prefixed with "AUTHORITY_NUM_". Ensure that the array length is the same as the authorityNumbers property, or left empty.
    */
    public int[] customerAuthorityNumberTypes = new int[]{};

    /**
    * Currency that all monetary amounts of the order are  with. This currency code must be the 3 digit ISO currency code.
    */
    public String currencyISOCode = new String();

    /**
    * Status indicating how the order has been paid for. Set it to one of the constants in the class prefixed with PAYMENT_STATUS_
    */
    public String paymentStatus = new String();

    /**
    * Method on how the order is being paid for. The field must be  to one of the class's constants prefixed by PAYMENT_METHOD_
    */
    public String paymentMethod = new String();

    /**
    * Code the proprietary system that is used as the payment method for the order.
    */
    public String paymentProprietaryCode = new String();

    /**
    * Number that contains a reference to the payment applied against the order
    */
    public String paymentReceipt = new String();

    /**
    * Monetary amount already paid for the order.
    */
    public double paymentAmount = 0;

    /**
    * Key of the payment type record that is associated to the payment. The payment type record indicates how the payment was made for the order.
    */
    public String keyPaymentTypeID = new String();

    /**
    * Number of the purchase order that may be associated to the sales order. This may be used for referencing purposes.
    */
    public String purchaseOrderNumber = new String();

    /**
    * ID of the system that the purchasing entity stores its data within.
    */
    public String purchaserSystemID = new String();

    /**
    * Name of the system that the purchasing entity stores its data within.
    */
    public String purchaserSystemName = new String();

    /**
    * Code of the system that the purchasing entity stores its data within.
    */
    public String purchaserSystemCode = new String();

    /**
    * ID of the system that the selling entity stores its data within.
    */
    public String sellerSystemID = new String();

    /**
    * Name of the system that the selling entity stores its data within.
    */
    public String sellerSystemName = new String();

    /**
    * Code of the system that the selling entity stores its data within.
    */
    public String sellerSystemCode = new String();

    /**
    * ArrayList of the invoice numbers linked to this sales order.
    */
    public String[] invoiceNumbers = new String[0];
    /**
    * Description of the address that the ordered goods are being delivered to
    */
    public String deliveryDescription = new String();

    /**
    * Name of the contact person at the address that the ordered goods are being delivered to
    */
    public String deliveryContact = new String();

    /**
    * Name of the organisation that the orders goods are being delivered to
    */
    public String deliveryOrgName = new String();

    /**
    * Email of the contact person at the address that the ordered goods are being delivered to
    */
    public String deliveryEmail = new String();

    /**
    * Phone number at the address that the ordered goods are being delivered to
    */
    public String deliveryPhone = new String();

    /**
    * Fax number at the address that the ordered goods are being delivered to
    */
    public String deliveryFax = new String();

    /**
    * First delivery address field that the ordered goods are being delivered to
    */
    public String deliveryAddress1 = new String();

    /**
    * Second delivery address field that the ordered goods are being delivered to
    */
    public String deliveryAddress2 = new String();

    /**
    * Third delivery address field that the ordered goods are being delivered to
    */
    public String deliveryAddress3 = new String();

    /**
    * Post code of the address that the ordered goods are being delivered to
    */
    public String deliveryPostcode = new String();

    /**
    * Name of the region/state/province at the address that the ordered goods are being delivered to
    */
    public String deliveryRegionName = new String();

    /**
    * Name of the country at the address that the ordered goods are being delivered to
    */
    public String deliveryCountryName = new String();

    /**
    * Code of the country at the address that the ordered goods are being delivered to as a 2 digit code  by ISO standards.
    */
    public String deliveryCountryCodeISO2 = new String();

    /**
    * Code of the country at the address that the ordered goods are being delivered to as a 3 digit code  by ISO standards.
    */
    public String deliveryCountryCodeISO3 = new String();

    /**
    * Description of the address associated with the billing of the order.
    */
    public String billingDescription = new String();

    /**
    * Name of the contact person at the address associated with the billing of the order.
    */
    public String billingContact = new String();

    /**
    * Name of the organisation that the orders goods are being billing to
    */
    public String billingOrgName = new String();

    /**
    * Email address at the address associated with the billing of the order.
    */
    public String billingEmail = new String();

    /**
    * Phone number at the address associated with the billing of the order.
    */
    public String billingPhone = new String();

    /**
    * Fax number at the address associated with the billing of the order.
    */
    public String billingFax = new String();

    /**
    * First address field associated with the billing of the order.
    */
    public String billingAddress1 = new String();

    /**
    * Second address field associated with the billing of the order.
    */
    public String billingAddress2 = new String();

    /**
    * Third address field associated with the billing of the order.
    */
    public String billingAddress3 = new String();

    /**
    * Postcode of the address associated with the billing of the order.
    */
    public String billingPostcode = new String();

    /**
    * Name of the region/state/province of the address associated with the billing of the order.
    */
    public String billingRegionName = new String();

    /**
    * Name of the country of the address associated with the billing of the order.
    */
    public String billingCountryName = new String();

    /**
    * Code of the country of the address associated with the billing of the order as a two digit code  by the ISO standards.
    */
    public String billingCountryCodeISO2 = new String();

    /**
    * Code of the country of the address associated with the billing of the order as a three digit code  by the ISO standards.
    */
    public String billingCountryCodeISO3 = new String();

    /**
    * Email address  for the order.
    */
    public String email = new String();

    /**
    * Total number of lines in the order.
    */
    public int totalLines = 0;

    /**
    * Total number of product lines in the order
    */
    public int totalProducts = 0;

    /**
    * Total number of labour lines in the order
    */
    public int totalLabour = 0;

    /**
    * Total number of download lines in the order
    */
    public int totalDownloads = 0;

    /**
    * Total monetary price of the order exclusive of tax
    */
    public double totalPriceExTax = 0;

    /**
    * Total monetary price of the order inclusive of tax
    */
    public double totalPriceIncTax = 0;

    /**
    * Total monetary amount of taxes applied to the order
    */
    public double totalTax = 0;

    /**
    * Total weight of the ordered goods
    */
    public double totalWeight = 0;

    /**
    * Total volume of the ordered goods
    */
    public double totalVolume = 0;

    /**
    * Total number of surcharges applied to the order
    */
    public int totalSurchargeItems = 0;

    /**
    * Total monetary amount of surcharges applied to the order exclusive of taxes
    */
    public double totalSurchargeExTax = 0;

    /**
    * Total monetary amount of surcharges applied to the order inclusive of taxes
    */
    public double totalSurchargeIncTax = 0;
    /**
    * Total monetary amount of taxes applied to surcharges in the order
    */
    public double totalSurchargeTax = 0;

    /**
    * Total monetary amount of the order before discounts were applied, exclusive of taxes. This amount may be useful when showing discounts applied to an order.
    */
    public double totalPriceUndiscountedExTax = 0;

    /**
    * Total monetary amount of the order before discounts were applied, inclusive of taxes. This amount may be useful when showing discounts applied to an order.
    */
    public double totalPriceUndiscountedIncTax = 0;

    /**
    * Total monetary amount of taxes applied to the order before discounts were applied. This amount may be useful when showing discounts applied to an order.
    */
    public double totalPriceUndiscountedTax = 0;

    /**
    * Text describing instructions on how to handle the order.
    */
    public String instructions = new String();

    /**
    * Code of the freight carrier delivering the ordered goods
    */
    public String freightCarrierCode = new String();

    /**
    * Name of the freight carrier delivering the orders goods
    */
    public String freightCarrierName = new String();

    /**
    * Reference code to the system used to process the freight order
    */
    public String freightSystemRefCode = new String();

    /**
    * Consignment code issued by the freight carrier to delivery the ordered goods
    */
    public String freightCarrierConsignCode = new String();

    /**
    * Code to track the freight carrier delivering the ordered goods
    */
    public String freightCarrierTrackingCode = new String();

    /**
    * Code of the service provided by the freight carrier to deliver the ordered goods
    */
    public String freightCarrierServiceCode = new String();


    /**
    * Code of the account in the freight carrier's system
    */
    public String freightCarrierAccountCode = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the order is being supplied by a different entity from supplier assigned to the order.
    */
    public String isDropship = new String();

    /**
    * key of the location where the products for the order can be found.
    */
    public String keyLocationID = new String();

    /**
    * Code of the location
    */
    public String locationCode = new String();

    /**
    * Name of the location
    */
    public String locationName = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the ordered goods are to be obtained across multiple locations.
    */
    public String isMultiLocation = new String();

    /**
    * Method that the order is being shipped by
    */
    public String shippingMethod = new String();

    /**
    * Percentage rate discounted off the order monetary total based on the discount assigned to the order's customer account.
    */
    public double accountDiscountRate = 0;

    /**
    * Territory associated with the customer account
    */
    public String accountTerritory = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that all products for the order have been delivered.
    */
    public String isProductsDelivered = new String();

    /**
    * Code of the unit of measure for the volume
    */
    public String totalVolumeMeasureCode = new String();

    /**
    * Code of the unit of measure for the weight
    */
    public String totalWeightMeasureCode = new String();

    /**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or  it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();

    /**
    * constructor
    */
    public ESDRecordOrderSale()
    {
        lines = new ArrayList<ESDRecordOrderSaleLine>();
        surcharges = new ArrayList<ESDRecordOrderSurcharge>();
        payments = new ArrayList<ESDRecordOrderPayment>();
    }

    /**
    * s default values for members that have no values 
    */
    public void DefaultValuesForNullMembers(){
        if (lines == null)
        {
            lines = new ArrayList<ESDRecordOrderSaleLine>();
        }
         
        if (surcharges == null)
        {
            surcharges = new ArrayList<ESDRecordOrderSurcharge>();
        }
         
        if (payments == null)
        {
            payments = new ArrayList<ESDRecordOrderPayment>();
        }
         
        if (keySalesOrderID == null)
        {
            keySalesOrderID = "";
        }
         
        if (billingDescription == null)
        {
            billingDescription = "";
        }
         
        if (billingContact == null)
        {
            billingContact = "";
        }
         
        if (billingOrgName == null)
        {
            billingOrgName = "";
        }
         
        if (billingEmail == null)
        {
            billingEmail = "";
        }
         
        if (billingPhone == null)
        {
            billingPhone = "";
        }
         
        if (billingFax == null)
        {
            billingFax = "";
        }
         
        if (billingAddress1 == null)
        {
            billingAddress1 = "";
        }
         
        if (billingAddress2 == null)
        {
            billingAddress2 = "";
        }
         
        if (billingAddress3 == null)
        {
            billingAddress3 = "";
        }
         
        if (billingPostcode == null)
        {
            billingPostcode = "";
        }
         
        if (billingRegionName == null)
        {
            billingRegionName = "";
        }
         
        if (billingCountryName == null)
        {
            billingCountryName = "";
        }
         
        if (billingCountryCodeISO2 == null)
        {
            billingCountryCodeISO2 = "";
        }
         
        if (billingCountryCodeISO3 == null)
        {
            billingCountryCodeISO3 = "";
        }
         
        if (deliveryDescription == null)
        {
            deliveryDescription = "";
        }
         
        if (deliveryContact == null)
        {
            deliveryContact = "";
        }
         
        if (deliveryOrgName == null)
        {
            deliveryOrgName = "";
        }
         
        if (deliveryEmail == null)
        {
            deliveryEmail = "";
        }
         
        if (deliveryPhone == null)
        {
            deliveryPhone = "";
        }
         
        if (deliveryFax == null)
        {
            deliveryFax = "";
        }
         
        if (deliveryAddress1 == null)
        {
            deliveryAddress1 = "";
        }
         
        if (deliveryAddress2 == null)
        {
            deliveryAddress2 = "";
        }
         
        if (deliveryAddress3 == null)
        {
            deliveryAddress3 = "";
        }
         
        if (deliveryPostcode == null)
        {
            deliveryPostcode = "";
        }
         
        if (deliveryRegionName == null)
        {
            deliveryRegionName = "";
        }
         
        if (deliveryCountryName == null)
        {
            deliveryCountryName = "";
        }
         
        if (deliveryCountryCodeISO2 == null)
        {
            deliveryCountryCodeISO2 = "";
        }
         
        if (deliveryCountryCodeISO3 == null)
        {
            deliveryCountryCodeISO3 = "";
        }
         
        if (salesOrderCode == null)
        {
            salesOrderCode = "";
        }
         
        if (keyCustomerAccountID == null)
        {
            keyCustomerAccountID = "";
        }
         
        if (customerAccountCode == null)
        {
            customerAccountCode = "";
        }
         
        if (customerAccountName == null)
        {
            customerAccountName = "";
        }
         
        if (salesOrderNumber == null)
        {
            salesOrderNumber = "";
        }
         
        if (customerAuthorityNumbers == null)
        {
            customerAuthorityNumbers = new String[0];
        }
         
        if (customerAuthorityNumberLabels == null)
        {
            customerAuthorityNumberLabels = new String[0];
        }
         
        if (customerAuthorityNumberTypes == null)
        {
            customerAuthorityNumberTypes = new int[0];
        }
         
        if (eCommerceUserID == null)
        {
            eCommerceUserID = "";
        }
         
        if (eCommerceUserName == null)
        {
            eCommerceUserName = "";
        }
         
        if (eCommerceSystemID == null)
        {
            eCommerceSystemID = "";
        }
         
        if (keySalesRepID == null)
        {
            keySalesRepID = "";
        }
         
        if (salesRepCode == null)
        {
            salesRepCode = "";
        }
         
        if (salesRepName == null)
        {
            salesRepName = "";
        }
         
        if (salesRepIndividual == null)
        {
            salesRepIndividual = "";
        }
         
        if (customerEntity == null)
        {
            customerEntity = "";
        }
         
        if (customerPersonName == null)
        {
            customerPersonName = "";
        }
         
        if (customerOrgName == null)
        {
            customerOrgName = "";
        }
         
        if (currencyISOCode == null)
        {
            currencyISOCode = "";
        }
         
        if (paymentStatus == null)
        {
            paymentStatus = "";
        }
         
        if (purchaseOrderNumber == null)
        {
            purchaseOrderNumber = "";
        }
         
        if (purchaserSystemID == null)
        {
            purchaserSystemID = "";
        }
         
        if (purchaserSystemName == null)
        {
            purchaserSystemName = "";
        }
         
        if (purchaserSystemCode == null)
        {
            purchaserSystemCode = "";
        }
         
        if (sellerSystemID == null)
        {
            sellerSystemID = "";
        }
         
        if (sellerSystemName == null)
        {
            sellerSystemName = "";
        }
         
        if (sellerSystemCode == null)
        {
            sellerSystemCode = "";
        }
         
        if (invoiceNumbers == null)
        {
            invoiceNumbers = new String[0];
        }
         
        if (email == null)
        {
            email = "";
        }
         
        if (instructions == null)
        {
            instructions = "";
        }
         
        if (paymentMethod == null)
        {
            paymentMethod = "";
        }
         
        if (paymentProprietaryCode == null)
        {
            paymentProprietaryCode = "";
        }
         
        if (paymentReceipt == null)
        {
            paymentReceipt = "";
        }
         
        if (freightCarrierCode == null)
        {
            freightCarrierCode = "";
        }
         
        if (freightCarrierName == null)
        {
            freightCarrierName = "";
        }
         
        if (freightSystemRefCode == null)
        {
            freightSystemRefCode = "";
        }
         
        if (freightCarrierConsignCode == null)
        {
            freightCarrierConsignCode = "";
        }
         
        if (freightCarrierTrackingCode == null)
        {
            freightCarrierTrackingCode = "";
        }
         
        if (freightCarrierServiceCode == null)
        {
            freightCarrierServiceCode = "";
        }
         
        if (freightCarrierAccountCode == null)
        {
            freightCarrierAccountCode = "";
        }
         
        if (isDropship == null)
        {
            isDropship = "N";
        }
         
        if (keyLocationID == null)
        {
            keyLocationID = "";
        }
         
        if (locationCode == null)
        {
            locationCode = "";
        }
         
        if (locationName == null)
        {
            locationName = "";
        }
         
        if (isMultiLocation == null)
        {
            isMultiLocation = "N";
        }
         
        if (shippingMethod == null)
        {
            shippingMethod = "";
        }
         
        if (accountTerritory == null)
        {
            accountTerritory = "";
        }
         
        if (isProductsDelivered == null)
        {
            isProductsDelivered = "N";
        }
         
        if (totalVolumeMeasureCode == null)
        {
            totalVolumeMeasureCode = "";
        }
         
        if (totalWeightMeasureCode == null)
        {
            totalWeightMeasureCode = "";
        }
         
        if (internalID == null)
        {
            internalID = "";
        }
    }
}