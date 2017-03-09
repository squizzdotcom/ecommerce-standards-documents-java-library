/**
* Copyright (C) 2017 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.ArrayList;

/**
* Ecommerce Standards record that contains the data of a single Sales Order that can be queried for a customer account. A sales order record contains information about items ordered by a customer account. The account enquiry aspect denotes that the record may be queried in real time and contain additional information associated with the record.
*/
public class ESDRecordCustomerAccountEnquiryOrderSale   
{
    /**
    * Key that allows the customer account sales order record to be uniquely identified and linked to.
    */
    public String keyOrderSaleID = new String();

    /**
    * ID that allows the sales order to be identified with. May or may not be unique.
    */
    public String orderID = new String();

    /**
    * Number that is associated to the sales order. This number can be used for referencing purposes.
    */
    public String orderNumber = new String();

    /**
    * Key of the customer account record assigned to the sales order.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Code of the customer account assigned to the sales order.
    */
    public String customerAccountCode = new String();

    /**
    * Date that the sales order record was created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long creationDate = 0;

    /**
    * Date set to the sales order. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long orderDate = 0;

    /**
    * Date that the sales order is due. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long dueDate = 0;

    /**
    * Date that the ordered goods/services are expected to be delivered. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long expectedDeliveryDate = 0;

    /**
    * Date that the ordered goods/services were delivered. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long deliveredDate = 0;

    /**
    * Key of the location record associated to the sales order.
    */
    public String keyLocationID = new String();

    /**
    * Code of the location associated to the sales order.
    */
    public String locationCode = new String();

    /**
    * Label of the location associated to the sales order.
    */
    public String locationLabel = new String();

    /**
    * The type of location associated to the sales order. Set it to one of the LOCATION_TYPE constants in the ESDocumentConstants class
    */
    public String locationType = new String();

    /**
    * Key of an entity that is linked to the sales order as a reference. A Reference could be an ID of a record such as a sales order or invoice
    */
    public String referenceKeyID = new String();

    /**
    * Type of entity that is linked to the sales order as a reference.  A Reference could be a record such as a sales order or invoice
    */
    public String referenceType = new String();

    /**
    * Number that provides a reference to the sales order.
    */
    public String referenceNumber = new String();

    /**
    * Code of the sales representative associated to the sales order.
    */
    public String salesRepCode = new String();

    /**
    * Name of the sales representative associated to the sales order.
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
    * First address field that the sales order is being delivered to.
    */
    public String deliveryAddress1 = new String();

    /**
    * Second address field that the sales order is being delivered to.
    */
    public String deliveryAddress2 = new String();

    /**
    * Third address field that the sales order is being delivered to.
    */
    public String deliveryAddress3 = new String();


    /**
    * Name of the state/province/region that the sales order is being delivered to.
    */
    public String deliveryStateProvince = new String();

    /**
    * Name of the country that the sales order is being delivered to.
    */
    public String deliveryCountry = new String();

    /**
    * Code of the country at the address that the ordered goods are being delivered to as a 2 digit code set by ISO standards.
    */
    public String deliveryCountryCodeISO2 = new String();

    /**
    * Code of the country at the address that the ordered goods are being delivered to as a 3 digit code set by ISO standards.
    */
    public String deliveryCountryCodeISO3 = new String();


    /**
    * Post code of the address that the ordered goods are being delivered to
    */
    public String deliveryPostcode = new String();

    /**
    * Name of the contact person at the address associated with the billing of the order.
    */
    public String billingContact = new String();

    /**
    * Name of the organisation that the orders goods are being billed to
    */
    public String billingOrgName = new String();

    /**
    * First address field of the billing address set for the sales order.
    */
    public String billingAddress1 = new String();

    /**
    * Second address field of the billing address set for the sales order.
    */
    public String billingAddress2 = new String();

    /**
    * Third address field of the billing address set for the sales order.
    */
    public String billingAddress3 = new String();

    /**
    * Name of the region/state/province that the sales order is being billed to.
    */
    public String billingStateProvince = new String();

    /**
    * Name of the country that the sales order is being billed to.
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
    * Tax number displayed on the sales order
    */
    public String taxNumber = new String();
    
    /**
    * Label of the taxes assigned to the sales order's total
    */
    public String taxLabel = new String();

    /**
    * Percentage amount of tax that the applied to the sales order's total
    */
    public double taxRate = 0;

    /**
    * Total monetary amount of the sales order excluding taxes
    */
    public double totalExTax = 0;

    /**
    * Total monetary amount of the sales order including taxes
    */
    public double totalIncTax = 0;

    /**
    * Total monetary amount of tax applied to the sale order's total
    */
    public double totalTax = 0;

    /**
    * Total monetary amount of freight inclusive of tax applied to the sales order's total
    */
    public double totalFreightIncTax = 0;

    /**
    * Total monetary amount of freight excluding tax applied to the sales order's total
    */
    public double totalFreightExTax = 0;


    /**
    * Total monetary amount of extra charges inclusive of tax applied to the sales order's total
    */
    public double totalExtraChargesIncTax = 0;

    /**
    * Total monetary amount of extra charges exclusive of tax applied to the sales order's total
    */
    public double totalExtraChargesExTax = 0;

    /**
    * Total monetary amount of discounts inclusive of tax discounted off the sales order's total
    */
    public double totalDiscountsIncTax = 0;

    /**
    * Total monetary amount of discounts exclusive of tax discounted off the sales order's total
    */
    public double totalDiscountsExTax = 0;

    /**
    * Total monetary amount of levies inclusive of tax applied to the sales order's total
    */
    public double totalLeviesIncTax = 0;

    /**
    * Total monetary amount of levies exclusive of tax applied to the sales order's total
    */
    public double totalLeviesExTax = 0;

    /**
    * Total monetary amount paid for the sales order
    */
    public double totalPaid = 0;

    /**
    * Total monetary amount still to be paid for the sales order
    */
    public double balance = 0;

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored in the sales order with
    */
    public String currencyCode = new String();

    /**
    * Total quantity across all the sales order lines
    */
    public double totalQuantity = 0;

    /**
    * Text that describes any information associated with the sales order
    */
    public String description = new String();

    /**
    * Language that all text is described in. Set it to one of the LANG constants in the ESDocumentConstants class
    */
    public String language = new String();

    /**
    * Text that contains additional comments that have been made for the sales order
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
    * List of lines in the sales order
    */
    public ESDRecordCustomerAccountEnquiryOrderSaleLine[] lines = new ESDRecordCustomerAccountEnquiryOrderSaleLine[]{};
    
    /**
     * Converts the customer account enquiry order sale record into a order sale record
     * @return sales order record and its lines
     */
    public ESDRecordOrderSale convertToOrderSaleRecord()
    {
        ESDRecordOrderSale orderSaleRecord = new ESDRecordOrderSale();
        
        orderSaleRecord.keySalesOrderID = keyOrderSaleID;
        orderSaleRecord.salesOrderCode = orderID;
        orderSaleRecord.salesOrderNumber = orderNumber;
        orderSaleRecord.keyCustomerAccountID = keyCustomerAccountID;
        orderSaleRecord.customerAccountCode = customerAccountCode;
        orderSaleRecord.createdDate = creationDate;
        orderSaleRecord.sentDate = orderDate;
        orderSaleRecord.processedDate = orderDate;
        orderSaleRecord.dispatchedDate = deliveredDate;
        orderSaleRecord.keyLocationID = keyLocationID;
        orderSaleRecord.locationCode = locationCode;
        orderSaleRecord.locationName = locationLabel;
        orderSaleRecord.purchaseOrderNumber = referenceKeyID;
        
        if(referenceType.equalsIgnoreCase(ESDocumentConstants.RECORD_TYPE_INVOICE)){
            orderSaleRecord.invoiceNumbers = new String[]{referenceNumber};
        }else if(referenceType.equalsIgnoreCase(ESDocumentConstants.RECORD_TYPE_ORDER_PURCHASE)){
            orderSaleRecord.purchaseOrderNumber = referenceNumber;
        }
        
        orderSaleRecord.salesRepCode = salesRepCode;
        orderSaleRecord.salesRepName = salesRepName;
        orderSaleRecord.deliveryContact = deliveryContact;
        orderSaleRecord.deliveryOrgName = deliveryOrgName;
        orderSaleRecord.deliveryAddress1 = deliveryAddress1;
        orderSaleRecord.deliveryAddress2 = deliveryAddress2;
        orderSaleRecord.deliveryAddress3 = deliveryAddress3;
        orderSaleRecord.deliveryRegionName = deliveryStateProvince;
        orderSaleRecord.deliveryCountryName = deliveryCountry;
        orderSaleRecord.deliveryCountryCodeISO2 = deliveryCountryCodeISO2;
        orderSaleRecord.deliveryCountryCodeISO3 = deliveryCountryCodeISO3;
        orderSaleRecord.deliveryPostcode = deliveryPostcode;
        orderSaleRecord.billingContact = billingContact;
        orderSaleRecord.billingOrgName = billingOrgName;
        orderSaleRecord.deliveryAddress1 = billingAddress1;
        orderSaleRecord.deliveryAddress2 = billingAddress2;
        orderSaleRecord.deliveryAddress3 = billingAddress3;
        orderSaleRecord.billingRegionName = billingStateProvince;
        orderSaleRecord.billingCountryName = billingCountry;
        orderSaleRecord.billingCountryCodeISO2 = billingCountryCodeISO2;
        orderSaleRecord.billingCountryCodeISO3 = billingCountryCodeISO3;
        orderSaleRecord.billingPostcode = billingPostcode;
        orderSaleRecord.totalPriceExTax = totalExTax;
        orderSaleRecord.totalPriceIncTax = totalIncTax;
        orderSaleRecord.totalTax = totalTax;
        orderSaleRecord.paymentAmount = totalPaid;
        orderSaleRecord.currencyISOCode = currencyCode;
        orderSaleRecord.instructions = comment;
        orderSaleRecord.freightCarrierCode = freightCarrierCode;
        orderSaleRecord.freightCarrierName = freightCarrierName;
        orderSaleRecord.freightSystemRefCode = freightSystemRefCode;
        orderSaleRecord.freightCarrierConsignCode = freightCarrierConsignCode;
        orderSaleRecord.freightCarrierTrackingCode = freightCarrierTrackingCode;
        orderSaleRecord.freightCarrierServiceCode = freightCarrierServiceCode;
        orderSaleRecord.freightCarrierAccountCode = freightCarrierAccountCode;
        
        //add lines for sales order
        ArrayList<ESDRecordOrderSaleLine> salesOrderLines = new ArrayList<ESDRecordOrderSaleLine>();
        if(lines != null){
            for(int i = 0; i < lines.length; i++){
                if(lines[i].lineType.equalsIgnoreCase(ESDocumentConstants.RECORD_LINE_TYPE_ITEM))
                {
                    ESDRecordOrderSaleLine orderline = new ESDRecordOrderSaleLine();
                    orderline.keyProductID = lines[i].lineItemID;
                    orderline.productCode = lines[i].lineItemCode;
                    orderline.productDescription = lines[i].description;
                    orderline.language = lines[i].language;
                    orderline.unitName = lines[i].unit;
                    orderline.UNSPSC = lines[i].UNSPSC;
                    orderline.quantity = lines[i].quantityOrdered;
                    orderline.priceExTax = lines[i].priceExTax;
                    orderline.priceIncTax = lines[i].priceIncTax;
                    orderline.priceTax = lines[i].priceTax;
                    orderline.priceTotalExTax = lines[i].totalPriceExTax;
                    orderline.priceTotalIncTax = lines[i].totalPriceIncTax;
                    orderline.priceTotalTax = lines[i].totalPriceTax;
                    orderline.locationCode = lines[i].locationCode;
                    orderline.keyLocationID = lines[i].keyLocationID;
                    orderline.purchaseOrderProductCode = lines[i].referenceLineItemCode;
                    orderline.purchaseOrderLineCode = lines[i].referenceLineCode;
                    orderline.taxes = new ArrayList<ESDRecordOrderLineTax>();
                    
                    if(lines[i].taxCode != null && !lines[i].taxCode.isEmpty()){
                        ESDRecordOrderLineTax tax = new ESDRecordOrderLineTax();
                        tax.taxcode = lines[i].taxCode;
                        tax.priceTax = lines[i].priceTax;
                        tax.priceTotalTax = lines[i].totalPriceTax;
                        tax.language = lines[i].language;
                        tax.quantity = lines[i].quantityOrdered;
                        orderline.taxes.add(tax);
                    }
                    
                    salesOrderLines.add(orderline);
                }
            }
        }
        orderSaleRecord.lines = salesOrderLines;
        
        return orderSaleRecord;
    }
}


