/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import java.util.ArrayList;

/**
* Ecommerce Standards Record that holds data for a single invoice raised against a customer. A customer invoice specifies goods and/or services that have been purchased from a customer, and the monetary amount that the customer owes.
*/
public class ESDRecordCustomerInvoice
{
    /**
    * List of lines  to the invoice
    */
    public ArrayList<ESDRecordCustomerInvoiceLine> lines = new ArrayList<ESDRecordCustomerInvoiceLine>();

    /**
    * List of surcharge lines  to the invoice
    */
    public ArrayList<ESDRecordInvoiceSurcharge> surcharges = new ArrayList<ESDRecordInvoiceSurcharge>();

    /**
    * List of payment lines  to the invoice
    */
    public ArrayList<ESDRecordInvoicePayment> payments = new ArrayList<ESDRecordInvoicePayment>();

    /**
    * Key that allows the customer invoice record to be uniquely identified and linked to.
    */
    public String keyCustomerInvoiceID = new String();

    /**
    * Code of the customer invoice, may or may not be a unique identifier, the code may be made up of the customer invoice number and any prefix or suffix text
    */
    public String customerInvoiceCode = new String();

    /**
    * Number of the customer invoice, may or may not be a unique identifier
    */
    public String customerInvoiceNumber = new String();

    /**
    * Key of the customer account record that is assigned to the invoice. The customer indicates the the entity supplying the invoice.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Code of the customer account, may or not be a unique identifier of the account. human known identifier of the customer account.
    */
    public String customerAccountCode = new String();

    /**
    * Name of the customer account. Could be an organisation name, person's name, or an other label.
    */
    public String customerAccountName = new String();
	
	/**
    * Key of the sales order record that allows the customer invoice record to be linked to an associated sales order originally raised
    */
    public String keySalesOrderID = new String();

    /**
    * Code of the sales order record that may be linked to the customer invoice
    */
    public String salesOrderCode = new String();

    /**
    * Number of the sales order record that may be linked to the customer invoice
    */
    public String salesOrderNumber = new String();

    /**
    * Date that the invoice was sent
    */
    public long sentDate = 0;

    /**
    * Date that the invoice was processed. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long processedDate = 0;

    /**
    * Date that the invoiced goods were sent out. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long dispatchedDate = 0;

    /**
    * Date that the invoiced goods were received. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long receivedDate = 0;

    /**
    * Date that the customer invoice was last modified. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long modifiedDate = 0;

    /**
    * Date that the invoice was created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long createdDate = 0;
	
	/**
    * Date that the invoice is due to be paid. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long paymentDueDate = 0;
	
	/**
    * Date that the invoice was fully paid. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long fullyPaidDate = 0;

    /**
    * ID of the user in the associated Ecommerce system where the invoice was created.
    */
    public String eCommerceUserID = new String();

    /**
    * Name of the user in the associated Ecommerce system where the order was created. Ideally this is  to a label of the user, and not the credentials used for a user to login (since that could be a security issue passing around such information).
    */
    public String eCommerceUserName = new String();

    /**
    * ID of the associated Ecommerce system where the invoice was created. Ideally each system s its own unique identifier, formatted such as ORG_NAME.SYSTEM_NAME
    */
    public String eCommerceSystemID = new String();

    /**
    * Key of the sales representative record linked to the customer invoice. May indicate the person, organisation or other entity who raised the invoice, or sold the goods/services for the supplier
    */
    public String keySalesRepID = new String();

    /**
    * Code of the sales representative
    */
    public String salesRepCode = new String();

    /**
    * Name of the sales representative. It could be the name of the organisation, person, or other entity who raised in the invoice, or sold the goods/services  for the supplier
    */
    public String salesRepName = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the sales representative is an individual person, otherwise is a organisation or other entity.
    */
    public String salesRepIndividual = new String();

    /**
    * Type of entity purchasing goods/services in the invoice. Set it to one of the constants in the ESDocumentConstants class prefixed with ENTITY_TYPE_
    */
    public String customerEntity = new String();

    /**
    * Name of the person who is the customer of the invoice.
    */
    public String customerPersonName = new String();

    /**
    * Name of the organisation who is the customer of the invoice.
    */
    public String customerOrgName = new String();

    /**
    * Authority numbers of the customer of the invoice.
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
    * Currency that all monetary amounts of the invoice are made with. This currency code must be the 3 digit ISO currency code.
    */
    public String currencyISOCode = new String();

    /**
    * Status indicating how the invoice has been paid for. Set it to one of the constants in the class prefixed with PAYMENT_STATUS_
    */
    public String paymentStatus = new String();

    /**
    * Method on how the invoice is being paid for. The field must be one of the class's constants prefixed by PAYMENT_METHOD_
    */
    public String paymentMethod = new String();

    /**
    * Code the proprietary system that is used as the payment method for the invoice.
    */
    public String paymentProprietaryCode = new String();

    /**
    * Number that contains a reference to the payment applied against the invoice
    */
    public String paymentReceipt = new String();

    /**
    * Monetary amount paid for the invoice.
    */
    public double paymentAmount = 0;

    /**
    * Key of the payment type record that is associated to the payment. The payment type record indicates how the payment was made for the invoice.
    */
    public String keyPaymentTypeID = new String();

    /**
    * Number of the customer's purchase order that may be associated to the customer invoice. This may be used for referencing purposes.
    */
    public String purchaseOrderNumber = new String();
	
	/**
    * Code of the customer's purchase order that may be associated to the customer invoice. The code may contain the purchase order number and any prefix or suffix text.
    */
    public String purchaseOrderCode = new String();

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
    * Description of the address that the invoiced goods are being delivered to
    */
    public String deliveryDescription = new String();

    /**
    * Name of the organisation at the address that the invoiced goods are being delivered to
    */
    public String deliveryOrgName = new String();

    /**
    * Name of the contact person at the address that the invoiced goods are being delivered to
    */
    public String deliveryContact = new String();

    /**
    * Email of the contact person at the address that the invoiced goods are being delivered to
    */
    public String deliveryEmail = new String();

    /**
    * Phone number at the address that the invoiced goods are being delivered to
    */
    public String deliveryPhone = new String();

    /**
    * Fax number at the address that the invoiced goods are being delivered to
    */
    public String deliveryFax = new String();

    /**
    * First delivery address field that the invoiced goods are being delivered to
    */
    public String deliveryAddress1 = new String();

    /**
    * Second delivery address field that the invoiced goods are being delivered to
    */
    public String deliveryAddress2 = new String();

    /**
    * Third delivery address field that the invoiced goods are being delivered to
    */
    public String deliveryAddress3 = new String();

    /**
    * Post code of the address that the invoiced goods are being delivered to
    */
    public String deliveryPostcode = new String();

    /**
    * Name of the region/state/province at the address that the invoiced goods are being delivered to
    */
    public String deliveryRegionName = new String();

    /**
    * Name of the country at the address that the invoiced goods are being delivered to
    */
    public String deliveryCountryName = new String();

    /**
    * Code of the country at the address that the invoiced goods are being delivered to as a 2 digit code  by ISO standards.
    */
    public String deliveryCountryCodeISO2 = new String();

    /**
    * Code of the country at the address that the invoiced goods are being delivered to as a 3 digit code  by ISO standards.
    */
    public String deliveryCountryCodeISO3 = new String();

	/**
    * Code of the purchase order to include in the delivery information, that is contains the code of the purchase order associated to the delivery of the goods
    */
    public String deliveryPurchaseOrderCode = new String();
    
	/**
    * Description of the address associated with the billing of the invoice.
    */
    public String billingDescription = new String();

    /**
    * Name of the contact person at the address associated with the billing of the invoiced.
    */
    public String billingContact = new String();

    /**
    * Name of the organisation that the invoiced goods are being billing to
    */
    public String billingOrgName = new String();

    /**
    * Email address at the address associated with the billing of the invoice.
    */
    public String billingEmail = new String();

    /**
    * Phone number at the address associated with the billing of the invoice.
    */
    public String billingPhone = new String();

    /**
    * Fax number at the address associated with the billing of the invoice.
    */
    public String billingFax = new String();

    /**
    * First address field associated with the billing of the invoice.
    */
    public String billingAddress1 = new String();

    /**
    * Second address field associated with the billing of the invoice.
    */
    public String billingAddress2 = new String();

    /**
    * Third address field associated with the billing of the invoice.
    */
    public String billingAddress3 = new String();

    /**
    * Postcode of the address associated with the billing of the invoice.
    */
    public String billingPostcode = new String();

    /**
    * Name of the region/state/province of the address associated with the billing of the invoice.
    */
    public String billingRegionName = new String();

    /**
    * Name of the country of the address associated with the billing of the invoice.
    */
    public String billingCountryName = new String();

    /**
    * Code of the country of the address associated with the billing of the invoice as a two digit code  by the ISO standards.
    */
    public String billingCountryCodeISO2 = new String();

    /**
    * Code of the country of the address associated with the billing of the invoice as a three digit code  by the ISO standards.
    */
    public String billingCountryCodeISO3 = new String();

    /**
    * Email address  for the invoice.
    */
    public String email = new String();

    /**
    * Total number of lines in the invoice.
    */
    public int totalLines = 0;

    /**
    * Total number of product lines in the invoice
    */
    public int totalProducts = 0;

    /**
    * Total number of labour lines in the invoice
    */
    public int totalLabour = 0;


    /**
    * Total number of download lines in the invoice
    */
    public int totalDownloads = 0;

    /**
    * Total monetary price of the invoice exclusive of tax
    */
    public double totalPriceExTax = 0;

    /**
    * Total monetary price of the invoice inclusive of tax
    */
    public double totalPriceIncTax = 0;

    /**
    * Total monetary amount of taxes applied to the invoice
    */
    public double totalTax = 0;

    /**
    * Total volume of the invoiced goods.
    */
    public double totalVolume = 0;

    /**
    * Total weight of the invoiced goods
    */
    public double totalWeight = 0;

    /**
    * Total number of surcharges applied to the invoice
    */
    public int totalSurchargeItems = 0;

    /**
    * Total monetary amount of surcharges applied to the invoice exclusive of taxes
    */
    public double totalSurchargeExTax = 0;

    /**
    * Total monetary amount of surcharges applied to the invoice inclusive of taxes
    */
    public double totalSurchargeIncTax = 0;

    /**
    * Total monetary amount of taxes applied to surcharges in the invoice
    */
    public double totalSurchargeTax = 0;

    /**
    * Total monetary amount of the invoice before discounts were applied, exclusive of taxes. This amount may be useful when showing discounts applied to an order.
    */
    public double totalPriceUndiscountedExTax = 0;

    /**
    * Total monetary amount of the invoice before discounts were applied, inclusive of taxes. This amount may be useful when showing discounts applied to an order.
    */
    public double totalPriceUndiscountedIncTax = 0;

    /**
    * Total monetary amount of taxes applied to the invoice before discounts were applied. This amount may be useful when showing discounts applied to an order.
    */
    public double totalPriceUndiscountedTax = 0;

    /**
    * Text describing instructions on how to handle the invoice.
    */
    public String instructions = new String();

    /**
    * Code of the freight carrier delivering the invoiced goods
    */
    public String freightCarrierCode = new String();

    /**
    * Name of the freight carrier delivering the invoiced goods
    */
    public String freightCarrierName = new String();

    /**
    * Reference code to the system used to process the freight invoice
    */
    public String freightSystemRefCode = new String();

    /**
    * Consignment code issued by the freight carrier to delivery the invoiced goods
    */
    public String freightCarrierConsignCode = new String();

    /**
    * Code to track the freight carrier delivering the invoiced goods
    */
    public String freightCarrierTrackingCode = new String();

    /**
    * Code of the service provided by the freight carrier to deliver the invoiced goods
    */
    public String freightCarrierServiceCode = new String();

    /**
    * Code of the account in the freight carrier's system
    */
    public String freightCarrierAccountCode = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the is being delivered to a different entity from the customer assigned to the invoice.
    */
    public String isDropship = new String();

    /**
    * key of the location where the products for the invoice can be found. The key stores the unique identifier of the location. The location may be a warehouse, site, office or other location.
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
    * If 'Y' then indicates that the invoiced goods are to be obtained across multiple locations.
    */
    public String isMultiLocation = new String();
	
	/**
	 * key of the external location where the products for the invoice can be found. This external location may be the location where goods are being delivered to or held at.
	 */
	public String externalKeyLocationID = new String();
	
	/**
	 * Code of the external location. This external location may be the location where goods are being delivered to or held at.
	 */
	public String externalLocationCode = new String();
	
	/**
	 * Name of the external location. This external location may be the location where goods are being delivered to or held at.
	 */
	public String externalLocationName = new String();

    /**
    * Method that the invoice is being shipped by
    */
    public String shippingMethod = new String();

    /**
    * Percentage rate discounted off the invoice monetary total.
    */
    public double accountDiscountRate = 0;

    /**
    * Territory associated with the customer account
    */
    public String accountTerritory = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that all products for the invoice have been delivered.
    */
    public String isProductsDelivered = new String();

    /**
    * Code of the unit of measure for the volume. Set it to a constant prefixed with UNIT_MEASURE_VOLUME_ in the ESDocumentConstants class
    */
    public String totalVolumeMeasureCode = new String();

    /**
    * Code of the unit of measure for the weight. Set it to a constant prefixed with UNIT_MEASURE_MASS_ in the ESDocumentConstants class
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
    * Constructor
    */
    public ESDRecordCustomerInvoice()
    {
        lines = new ArrayList<ESDRecordCustomerInvoiceLine>();
        surcharges = new ArrayList<ESDRecordInvoiceSurcharge>();
        payments = new ArrayList<ESDRecordInvoicePayment>();
    }

    /**
    * sets default values for members that have no values 
    */
    public void setDefaultValuesForNullMembers(){
        if (lines == null)
        {
            lines = new ArrayList<ESDRecordCustomerInvoiceLine>();
        }
         
        if (surcharges == null)
        {
            surcharges = new ArrayList<ESDRecordInvoiceSurcharge>();
        }
         
        if (payments == null)
        {
            payments = new ArrayList<ESDRecordInvoicePayment>();
        }
        else
        {
            for (ESDRecordInvoicePayment payment : payments)
            {
                payment.setDefaultValuesForNullMembers();
            }
        }
		
        if (keyCustomerInvoiceID== null)
        {
            keyCustomerInvoiceID = "";
        }
		
		if (customerInvoiceCode== null)
        {
            customerInvoiceCode = "";
        }
		
		if (customerInvoiceNumber== null)
        {
            customerInvoiceNumber = "";
        }

		if (keySalesOrderID== null)
        {
            keySalesOrderID = "";
        }
         
        if (salesOrderCode == null)
        {
            salesOrderCode = "";
        }
         
        if (purchaseOrderNumber == null)
        {
            purchaseOrderNumber = "";
        }
         
        if (salesRepIndividual == null)
        {
            salesRepIndividual = "";
        }
         
        if (currencyISOCode == null)
        {
            currencyISOCode = "";
        }
         
        if (customerAuthorityNumbers == null)
        {
            customerAuthorityNumbers = new String[0];
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
         
        if (paymentStatus == null)
        {
            paymentStatus = ESDocumentConstants.PAYMENT_STATUS_UNPAID;
        }
         
        if (paymentMethod == null)
        {
            paymentMethod = ESDocumentConstants.PAYMENT_METHOD_UNPAID;
        }
         
        if (paymentProprietaryCode == null)
        {
            paymentProprietaryCode = "";
        }
         
        if (paymentReceipt == null)
        {
            paymentReceipt = "";
        }
         
        if (instructions == null)
        {
            instructions = "";
        }
         
        if (salesOrderNumber == null)
        {
            salesOrderNumber = "";
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
		
		if (externalKeyLocationID == null)
		{
			externalKeyLocationID = "";
		}

		if (externalLocationCode == null)
		{
			externalLocationCode = "";
		}

		if (externalLocationName == null)
		{
			externalLocationName = "";
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
         
        if (deliveryDescription == null)
        {
            deliveryDescription = "";
        }
         
        if (deliveryOrgName == null)
        {
            deliveryOrgName = "";
        }
         
        if (deliveryContact == null)
        {
            deliveryContact = "";
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
         
        if (email == null)
        {
            email = "";
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
         
        if (deliveryPostcode == null)
        {
            deliveryPostcode = "";
        }
         
        if (deliveryCountryCodeISO2 == null)
        {
            deliveryCountryCodeISO2 = "";
        }
         
        if (deliveryCountryCodeISO3 == null)
        {
            deliveryCountryCodeISO3 = "";
        }
		
		if (deliveryPurchaseOrderCode == null)
        {
            deliveryPurchaseOrderCode = "";
        }
         
        if (billingDescription == null)
        {
            billingDescription = "";
        }
         
        if (billingOrgName == null)
        {
            billingOrgName = "";
        }
         
        if (billingContact == null)
        {
            billingContact = "";
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
         
        if (billingCountryCodeISO3 == null)
        {
            billingCountryCodeISO3 = "";
        }
         
        if (totalVolumeMeasureCode == null)
        {
            totalVolumeMeasureCode = "";
        }
         
        if (totalWeightMeasureCode == null)
        {
            totalWeightMeasureCode = "";
        }
         
        if (isProductsDelivered == null)
        {
            isProductsDelivered = ESDocumentConstants.ESD_VALUE_NO;
        }
         
        if (isDropship == null)
        {
            isDropship = ESDocumentConstants.ESD_VALUE_NO;
        }
         
        if (isMultiLocation== null)
        {
            isMultiLocation= ESDocumentConstants.ESD_VALUE_NO;
        }
         
        if (shippingMethod== null)
        {
            shippingMethod = "";
        }
         
        if (accountTerritory== null)
        {
            accountTerritory = "";
        }
         
        if (isProductsDelivered== null)
        {
            isProductsDelivered = ESDocumentConstants.ESD_VALUE_NO;
        }
         
        if (internalID== null)
        {
            internalID = "";
        }        
    }
}
