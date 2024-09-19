/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import java.util.ArrayList;
import org.esd.EcommerceStandardsDocuments.ESDRecordCustomerAccountEnquiryInvoiceLine;

/**
* Ecommerce Standards record that contains the data of a single Invoice that can be queried for a customer account. An invoice record contains information about items ordered by a customer account. The account enquiry aspect denotes that the record may be queried in real time and contain additional information associated with the record.
*/
public class ESDRecordCustomerAccountEnquiryInvoice   
{
    /**
    * Key that allows the customer account invoice record to be uniquely identified and linked to.
    */
    public String keyInvoiceID = new String();

    /**
    * ID that allows the invoice to be identified with. May or may not be unique.
    */
    public String invoiceID = new String();

    /**
    * Key of the customer account record assigned to the invoice.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Code of the customer account assigned to the invoice.
    */
    public String customerAccountCode = new String();

    /**
    * Number that is associated to the invoice. This number can be used for referencing purposes.
    */
    public String invoiceNumber = new String();

    /**
    * Date that the invoice record was created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long creationDate = 0;

    /**
    * Date set to the invoice. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long invoiceDate = 0;


    /**
    * Date that the invoice is due. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long dueDate = 0;

    /**
    * Date that the invoiced goods/services were expected to be delivered. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long expectedDeliveryDate = 0;

    /**
    * Date that the invoiced goods/services were delivered. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long deliveredDate = 0;

    /**
    * Key of the location record associated to the invoice.
    */
    public String keyLocationID = new String();

    /**
    * Code of the location associated to the invoice.
    */
    public String locationCode = new String();

    /**
    * Label of the location associated to the invoice.
    */
    public String locationLabel = new String();

    /**
    * The type of location associated to the invoice. Set it to one of the LOCATION_TYPE constants in the ESDocumentConstants class
    */
    public String locationType = new String();

    /**
    * Key of an entity that is linked to the invoice as a reference. A Reference could be a record such as a sales order or invoice
    */
    public String referenceKeyID = new String();

    /**
    * Type of entity that is linked to the invoice as a reference.  A Reference could be a record such as a sales order or invoice
    */
    public String referenceType = new String();

    /**
    * Number that provides a reference to the invoice.
    */
    public String referenceNumber = new String();

    /**
    * Number that allows a customer to reference the invoice.
    */
    public String customerReference = new String();

    /**
    * Code of the sales representative associated to the invoice.
    */
    public String salesRepCode = new String();

    /**
    * Name of the sales representative associated to the invoice.
    */
    public String salesRepName = new String();

    /**
    * Name of the contact person at the address that the ordered goods are being delivered to
    */
    public String deliveryContact = new String();

    /**
    * Name of the organisation that the ordered goods are being delivered to
    */
    public String deliveryOrgName = new String();

    /**
    * First address field that the invoice is being delivered to.
    */
    public String deliveryAddress1 = new String();

    /**
    * Second address field that the invoice is being delivered to.
    */
    public String deliveryAddress2 = new String();

    /**
    * Third address field that the invoice is being delivered to.
    */
    public String deliveryAddress3 = new String();

    /**
    * Name of the state/province/region that the invoice is being delivered to.
    */
    public String deliveryStateProvince = new String();

    /**
    * Name of the country that the invoice is being delivered to.
    */
    public String deliveryCountry = new String();

    /**
    * Code of the country at the address that the invoiced goods are being delivered to as a 2 digit code set by ISO standards.
    */
    public String deliveryCountryCodeISO2 = new String();

    /**
    * Code of the country at the address that the invoiced goods are being delivered to as a 3 digit code set by ISO standards.
    */
    public String deliveryCountryCodeISO3 = new String();

    /**
    * Post code of the address that the invoiced goods are being delivered to
    */
    public String deliveryPostcode = new String();
	
	/**
    * Code of the purchase order to include in the delivery information, that is contains the code of the purchase order associated to the delivery of the goods
    */
    public String deliveryPurchaseOrderCode = new String();

    /**
    * Name of the contact person at the address associated with the billing of the invoice.
    */
    public String billingContact = new String();

    /**
    * Name of the organisation that the orders goods are being billed to
    */
    public String billingOrgName = new String();

    /**
    * First address field of the billing address set for the invoice.
    */
    public String billingAddress1 = new String();

    /**
    * Second address field of the billing address set for the invoice.
    */
    public String billingAddress2 = new String();

    /**
    * Third address field of the billing address set for the invoice.
    */
    public String billingAddress3 = new String();

    /**
    * Name of the region/state/province that the invoice is being billed to.
    */
    public String billingStateProvince = new String();

    /**
    * Name of the country that the invoice is being billed to.
    */
    public String billingCountry = new String();

    /**
    * Code of the country at the billing address as a 2 digit code set by ISO standards.
    */
    public String billingCountryCodeISO2 = new String();

    /**
    * Code of the country at the billing address as a 3 digit code set by ISO standards.
    */
    public String billingCountryCodeISO3 = new String();

    /**
    * Post code at the billing address
    */
    public String billingPostcode = new String();

    /**
    * Tax number displayed on the invoice
    */
    public String taxNumber = new String();

    /**
    * Label of the taxes assigned to the invoice's total
    */
    public String taxLabel = new String();

    /**
    * Percentage amount of tax that the applied to the invoice's total
    */
    public double taxRate = 0;

    /**
    * Total monetary amount of the invoice excluding taxes
    */
    public double totalExTax = 0;

    /**
    * Total monetary amount of the invoice including taxes
    */
    public double totalIncTax = 0;

    /**
    * Total monetary amount of tax applied to the invoice's total
    */
    public double totalTax = 0;

    /**
    * Total monetary amount of freight inclusive of tax applied to the invoice's total
    */
    public double totalFreightIncTax = 0;

    /**
    * Total monetary amount of freight excluding tax applied to the invoice's total
    */
    public double totalFreightExTax = 0;

    /**
    * Total monetary amount of extra charges inclusive of tax applied to the invoice's total
    */
    public double totalExtraChargesIncTax = 0;

    /**
    * Total monetary amount of extra charges exclusive of tax applied to the invoice's total
    */
    public double totalExtraChargesExTax = 0;

    /**
    * Total monetary amount of discounts inclusive of tax discounted off the invoice's total
    */
    public double totalDiscountsIncTax = 0;

    /**
    * Total monetary amount of discounts exclusive of tax discounted off the invoice's total
    */
    public double totalDiscountsExTax = 0;

    /**
    * Total monetary amount of levies inclusive of tax applied to the invoice's total
    */
    public double totalLeviesIncTax = 0;

    /**
    * Total monetary amount of levies exclusive of tax applied to the invoice's total
    */
    public double totalLeviesExTax = 0;

    /**
    * Total monetary amount paid for the invoice
    */
    public double totalPaid = 0;

    /**
    * Total monetary amount still to be paid for the invoice
    */
    public double balance = 0;

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored in the invoice with
    */
    public String currencyCode = new String();

    /**
    * Total quantity across all the invoice lines
    */
    public double totalQuantity = 0;

    /**
    * Text that describes any information associated with the invoice
    */
    public String description = new String();

    /**
    * Language that all text is described in. Set it to one of the LANG constants in the ESDocumentConstants class
    */
    public String language = new String();

    /**
    * Text that contains additional comments that have been made for the invoice
    */
    public String comment = new String();

    /**
    * Code of the freight carrier who delivered the ordered goods
    */
    public String freightCarrierCode = new String();

    /**
    * Name of the freight carrier who delivered the orders goods
    */
    public String freightCarrierName = new String();

    /**
    * Reference code to the system used to process the freight
    */
    public String freightSystemRefCode = new String();

    /**
    * Consignment code issued by the freight carrier to delivery the ordered goods
    */
    public String freightCarrierConsignCode = new String();

    /**
    * Code to track the freight carrier who delivered the ordered goods
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
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();

    /**
    * List of lines in the invoice
    */
    public ESDRecordCustomerAccountEnquiryInvoiceLine[] lines = new ESDRecordCustomerAccountEnquiryInvoiceLine[]{};
	
	/**
     * Converts the customer account enquiry invoice record into a customer invoice record
     * @return customer invoice record and its lines
     */
    public ESDRecordCustomerInvoice convertToCustomerInvoiceRecord()
    {
        ESDRecordCustomerInvoice customerInvoiceRecord = new ESDRecordCustomerInvoice();
        
        customerInvoiceRecord.keyCustomerInvoiceID = keyInvoiceID;
        customerInvoiceRecord.customerInvoiceCode = invoiceID;
        customerInvoiceRecord.customerInvoiceNumber = invoiceNumber;
        customerInvoiceRecord.keyCustomerAccountID = keyCustomerAccountID;
        customerInvoiceRecord.customerAccountCode = customerAccountCode;
        customerInvoiceRecord.createdDate = creationDate;
        customerInvoiceRecord.sentDate = invoiceDate;
        customerInvoiceRecord.processedDate = invoiceDate;
        customerInvoiceRecord.dispatchedDate = deliveredDate;
		customerInvoiceRecord.paymentDueDate = dueDate;
        customerInvoiceRecord.keyLocationID = keyLocationID;
        customerInvoiceRecord.locationCode = locationCode;
        customerInvoiceRecord.locationName = locationLabel;
		customerInvoiceRecord.purchaseOrderNumber = customerReference;
		customerInvoiceRecord.purchaseOrderCode = customerReference;
        
        if(referenceType.equalsIgnoreCase(ESDocumentConstants.RECORD_TYPE_ORDER_SALE)){
            customerInvoiceRecord.salesOrderNumber = referenceNumber;
			customerInvoiceRecord.salesOrderCode = referenceNumber;
			customerInvoiceRecord.keySalesOrderID = referenceKeyID;
        }else if(referenceType.equalsIgnoreCase(ESDocumentConstants.RECORD_TYPE_ORDER_PURCHASE)){
            customerInvoiceRecord.purchaseOrderNumber = referenceNumber;
			customerInvoiceRecord.purchaseOrderCode = referenceNumber;
        }
        
        customerInvoiceRecord.salesRepCode = salesRepCode;
        customerInvoiceRecord.salesRepName = salesRepName;
        customerInvoiceRecord.deliveryContact = deliveryContact;
        customerInvoiceRecord.deliveryOrgName = deliveryOrgName;
        customerInvoiceRecord.deliveryAddress1 = deliveryAddress1;
        customerInvoiceRecord.deliveryAddress2 = deliveryAddress2;
        customerInvoiceRecord.deliveryAddress3 = deliveryAddress3;
        customerInvoiceRecord.deliveryRegionName = deliveryStateProvince;
        customerInvoiceRecord.deliveryCountryName = deliveryCountry;
        customerInvoiceRecord.deliveryCountryCodeISO2 = deliveryCountryCodeISO2;
        customerInvoiceRecord.deliveryCountryCodeISO3 = deliveryCountryCodeISO3;
        customerInvoiceRecord.deliveryPostcode = deliveryPostcode;
        customerInvoiceRecord.billingContact = billingContact;
        customerInvoiceRecord.billingOrgName = billingOrgName;
        customerInvoiceRecord.deliveryAddress1 = billingAddress1;
        customerInvoiceRecord.deliveryAddress2 = billingAddress2;
        customerInvoiceRecord.deliveryAddress3 = billingAddress3;
        customerInvoiceRecord.billingRegionName = billingStateProvince;
        customerInvoiceRecord.billingCountryName = billingCountry;
        customerInvoiceRecord.billingCountryCodeISO2 = billingCountryCodeISO2;
        customerInvoiceRecord.billingCountryCodeISO3 = billingCountryCodeISO3;
        customerInvoiceRecord.billingPostcode = billingPostcode;
        customerInvoiceRecord.totalPriceExTax = totalExTax;
        customerInvoiceRecord.totalPriceIncTax = totalIncTax;
        customerInvoiceRecord.totalTax = totalTax;
		customerInvoiceRecord.totalPriceUndiscountedExTax = totalExTax + totalDiscountsExTax;
		customerInvoiceRecord.totalPriceUndiscountedIncTax = totalIncTax + totalDiscountsIncTax;
		customerInvoiceRecord.totalPriceUndiscountedTax = customerInvoiceRecord.totalPriceUndiscountedIncTax - customerInvoiceRecord.totalPriceUndiscountedExTax;
        customerInvoiceRecord.paymentAmount = totalPaid;
        customerInvoiceRecord.currencyISOCode = currencyCode;
        customerInvoiceRecord.instructions = comment;
        customerInvoiceRecord.freightCarrierCode = freightCarrierCode;
        customerInvoiceRecord.freightCarrierName = freightCarrierName;
        customerInvoiceRecord.freightSystemRefCode = freightSystemRefCode;
        customerInvoiceRecord.freightCarrierConsignCode = freightCarrierConsignCode;
        customerInvoiceRecord.freightCarrierTrackingCode = freightCarrierTrackingCode;
        customerInvoiceRecord.freightCarrierServiceCode = freightCarrierServiceCode;
        customerInvoiceRecord.freightCarrierAccountCode = freightCarrierAccountCode;
		double linesTotalPriceIncTax = 0;
        
        //add lines for customer invoice
        ArrayList<ESDRecordCustomerInvoiceLine> customerInvoiceLines = new ArrayList<ESDRecordCustomerInvoiceLine>();
		
        if(lines != null){
            for(int i = 0; i < lines.length; i++){
				//set item line as a product line
                if(lines[i].lineType.equalsIgnoreCase(ESDocumentConstants.RECORD_LINE_TYPE_ITEM))
                {
                    ESDRecordCustomerInvoiceLine invoiceline = new ESDRecordCustomerInvoiceLine();
					invoiceline.lineType = ESDocumentConstants.INVOICE_LINE_TYPE_PRODUCT;
					invoiceline.keyProductID = lines[i].lineItemID;
					invoiceline.productCode = lines[i].lineItemCode;
					invoiceline.productDescription = lines[i].description;
                    invoiceline.language = lines[i].language;
                    invoiceline.unitName = lines[i].unit;
                    invoiceline.UNSPSC = lines[i].UNSPSC;
                    invoiceline.quantityBackordered = lines[i].quantityBackordered;
					invoiceline.quantityInvoiced = lines[i].quantityDelivered;
					invoiceline.quantityDelivered = lines[i].quantityDelivered;
					invoiceline.quantityOrdered = lines[i].quantityOrdered;
                    invoiceline.priceExTax = lines[i].priceExTax;
                    invoiceline.priceIncTax = lines[i].priceIncTax;
                    invoiceline.priceTax = lines[i].priceTax;
                    invoiceline.priceTotalExTax = lines[i].totalPriceExTax;
                    invoiceline.priceTotalIncTax = lines[i].totalPriceIncTax;
                    invoiceline.priceTotalTax = lines[i].totalPriceTax;
                    invoiceline.locationCode = lines[i].locationCode;
                    invoiceline.keyLocationID = lines[i].keyLocationID;
                    invoiceline.purchaseOrderProductCode = lines[i].referenceLineItemCode;
                    invoiceline.purchaseOrderLineCode = lines[i].referenceLineCode;
					invoiceline.attributes = new ArrayList<ESDRecordInvoiceLineAttributeProfile>();
                    invoiceline.taxes = new ArrayList<ESDRecordInvoiceLineTax>();
					linesTotalPriceIncTax += invoiceline.priceTotalIncTax;
                    
                    if(lines[i].taxCode != null && !lines[i].taxCode.isEmpty()){
                        ESDRecordInvoiceLineTax tax = new ESDRecordInvoiceLineTax();
                        tax.taxcode = lines[i].taxCode;
                        tax.priceTax = lines[i].priceTax;
                        tax.priceTotalTax = lines[i].totalPriceTax;
                        tax.language = lines[i].language;
                        tax.quantity = lines[i].quantityOrdered;
                        invoiceline.taxes.add(tax);
                    }
                    
                    customerInvoiceLines.add(invoiceline);
                }
				//add text line to the invoice
				else if(lines[i].lineType.equalsIgnoreCase(ESDocumentConstants.RECORD_LINE_TYPE_TEXT))
				{
					ESDRecordCustomerInvoiceLine invoiceline = new ESDRecordCustomerInvoiceLine();
					invoiceline.lineType = ESDocumentConstants.INVOICE_LINE_TYPE_TEXT;
					invoiceline.textDescription = lines[i].description;
                    invoiceline.language = lines[i].language;
                    invoiceline.unitName = lines[i].unit;
                    invoiceline.UNSPSC = lines[i].UNSPSC;
                    invoiceline.quantityBackordered = lines[i].quantityBackordered;
					invoiceline.quantityInvoiced = lines[i].quantityDelivered;
					invoiceline.quantityDelivered = lines[i].quantityDelivered;
					invoiceline.quantityOrdered = lines[i].quantityOrdered;
                    invoiceline.priceExTax = lines[i].priceExTax;
                    invoiceline.priceIncTax = lines[i].priceIncTax;
                    invoiceline.priceTax = lines[i].priceTax;
                    invoiceline.priceTotalExTax = lines[i].totalPriceExTax;
                    invoiceline.priceTotalIncTax = lines[i].totalPriceIncTax;
                    invoiceline.priceTotalTax = lines[i].totalPriceTax;
                    invoiceline.locationCode = lines[i].locationCode;
                    invoiceline.keyLocationID = lines[i].keyLocationID;
                    invoiceline.purchaseOrderProductCode = lines[i].referenceLineItemCode;
                    invoiceline.purchaseOrderLineCode = lines[i].referenceLineCode;
					invoiceline.attributes = new ArrayList<ESDRecordInvoiceLineAttributeProfile>();
                    invoiceline.taxes = new ArrayList<ESDRecordInvoiceLineTax>();
                    customerInvoiceLines.add(invoiceline);
				}
            }
        }
		
		//if a freight amount is applied against the invoice then add the surcharge to it if a line didn't already cover the surcharge
		if(totalFreightIncTax > 0 && totalFreightIncTax <= totalIncTax - linesTotalPriceIncTax)
		{
			ESDRecordInvoiceSurcharge surcharge = new ESDRecordInvoiceSurcharge();
			surcharge.priceExTax = totalFreightExTax;
			surcharge.priceIncTax = totalFreightIncTax;
			surcharge.priceTax = totalFreightIncTax - totalFreightExTax;
			surcharge.surchargeDescription = "Freight";
			surcharge.taxes = new ArrayList<ESDRecordInvoiceLineTax>();
			
			if(surcharge.priceIncTax > 0){
				ESDRecordInvoiceLineTax tax = new ESDRecordInvoiceLineTax();
				tax.taxcode = "";
				tax.priceTax = surcharge.priceTax;
				tax.priceTotalTax = surcharge.priceTax;
				tax.quantity = 1;
				surcharge.taxes.add(tax);
			}
		}		
        
		//add lines, surcharges and payments to the invoice record
		customerInvoiceRecord.lines = customerInvoiceLines;
		customerInvoiceRecord.surcharges = new ArrayList<ESDRecordInvoiceSurcharge>();
		customerInvoiceRecord.payments = new ArrayList<ESDRecordInvoicePayment>();
		
		//remove null values from invoice record properties
		customerInvoiceRecord.setDefaultValuesForNullMembers();
		
        return customerInvoiceRecord;
    }
}
