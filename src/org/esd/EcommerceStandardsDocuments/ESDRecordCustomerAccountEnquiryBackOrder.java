/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards record that contains the data of a single Back Order that can be queried for a customer account. A back order record contains information about goods ordered by a customer account that needed to be ordered from an external supplier. The account enquiry aspect denotes that the record may be queried in real time and contain additional information associated with the record.
*/
public class ESDRecordCustomerAccountEnquiryBackOrder   
{
    /**
    * Key that allows the customer account back order record to be uniquely identified and linked to.
    */
    public String keyBackOrderID = new String();

    /**
    * ID that allows the back order to be identified with. May or may not be unique.
    */
    public String backOrderID = new String();

    /**
    * Key of the customer account record assigned to the back order.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Code of the customer account assigned to the back order.
    */
    public String customerAccountCode = new String();

    /**
    * Number that is associated to the back order. This number can be used for referencing purposes.
    */
    public String backOrderNumber = new String();

    /**
    * Date that the back order record was created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long creationDate = 0;

    /**
    * Date set to the back order. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long backOrderDate = 0;

    /**
    * Date that the back order is due. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long dueDate = 0;

    /**
    * Key of the location record associated to the back order.
    */
    public String keyLocationID = new String();

    /**
    * Code of the location associated to the back order.
    */
    public String locationCode = new String();

    /**
    * Label of the location associated to the back order.
    */
    public String locationLabel = new String();

    /**
    * The type of location associated to the back order. Set it to one of the LOCATION_TYPE constants in the ESDocumentConstants class
    */
    public String locationType = new String();

    /**
    * Key of an entity that is linked to the back order as a reference. A Reference could be a record such as a sales order or invoice
    */
    public String referenceKeyID = new String();

    /**
    * Type of entity that is linked to the back order as a reference.  A Reference could be a record such as a sales order or invoice
    */
    public String referenceType = new String();

    /**
    * Number that provides a reference to the back order.
    */
    public String referenceNumber = new String();
	
	/**
    * Text, number or code that the customer uses to identify the back order record. This could be the customer's purchase order order, supplier invoice code, or an other identifier.
	*/
	public String customerReference = new String();

    /**
    * Code of the sales representative associated to the back order.
    */
    public String salesRepCode = new String();

    /**
    * Name of the sales representative associated to the back order.
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
    * First address field that the back order is being delivered to.
    */
    public String deliveryAddress1 = new String();

    /**
    * Second address field that the back order is being delivered to.
    */
    public String deliveryAddress2 = new String();

    /**
    * Third address field that the back order is being delivered to.
    */
    public String deliveryAddress3 = new String();

    /**
    * Name of the state/province/region that the back order is being delivered to.
    */
    public String deliveryStateProvince = new String();

    /**
    * Name of the country that the back order is being delivered to.
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
    * Name of the contact person associated to the billing address set for the order.
    */
    public String billingContact = new String();

    /**
    * Name of the organisation associated to the billing address set for the order.
    */
    public String billingOrgName = new String();

    /**
    * First address field of the billing address set for the order.
    */
    public String billingAddress1 = new String();

    /**
    * Second address field of the billing address set for the order.
    */
    public String billingAddress2 = new String();

    /**
    * Third address field of the billing address set for the order.
    */
    public String billingAddress3 = new String();

    /**
    * Name of the region/state/province that the back order is being billed to.
    */
    public String billingStateProvince = new String();

    /**
    * Name of the country that the back order is being billed to.
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
    * Tax number displayed on the back order
    */
    public String taxNumber = new String();

    /**
    * Label of the taxes assigned to the order's total
    */
    public String taxLabel = new String();

    /**
    * Percentage amount of tax that the applied to the order's total
    */
    public double taxRate = 0;

    /**
    * Total monetary amount of the order excluding taxes
    */
    public double totalExTax = 0;

    /**
    * Total monetary amount of the order including taxes
    */
    public double totalIncTax = 0;

    /**
    * Total monetary amount of tax applied to the order's total
    */
    public double totalTax = 0;

    /**
    * Total monetary amount of freight inclusive of tax applied to the order's total
    */
    public double totalFreightIncTax = 0;

    /**
    * Total monetary amount of freight excluding tax applied to the order's total
    */
    public double totalFreightExTax = 0;

    /**
    * Total monetary amount of extra charges inclusive of tax applied to the order's total
    */
    public double totalExtraChargesIncTax = 0;

    /**
    * Total monetary amount of extra charges exclusive of tax applied to the order's total
    */
    public double totalExtraChargesExTax = 0;

    /**
    * Total monetary amount of discounts inclusive of tax discounted off the order's total
    */
    public double totalDiscountsIncTax = 0;

    /**
    * Total monetary amount of discounts exclusive of tax discounted off the order's total
    */
    public double totalDiscountsExTax = 0;

    /**
    * Total monetary amount of levies inclusive of tax applied to the order's total
    */
    public double totalLeviesIncTax = 0;

    /**
    * Total monetary amount of levies exclusive of tax applied to the order's total
    */
    public double totalLeviesExTax = 0;

    /**
    * Total monetary amount paid for the back order
    */
    public double totalPaid = 0;

    /**
    * Total monetary amount still to be paid for the back order
    */
    public double balance = 0;

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored with
    */
    public String currencyCode = new String();

    /**
    * Total quantity across all the ordered lines
    */
    public double totalQuantity = 0;

    /**
    * Text that describes any information associated with the back order
    */
    public String description = new String();

    /**
    * Language that all text is described in. Set it to one of the LANG constants in the ESDocumentConstants class
    */
    public String language = new String();

    /**
    * Text that contains additional comments that have been made for the back order
    */
    public String comment = new String();

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
    * List of lines in the back order
    */
    public ESDRecordCustomerAccountEnquiryBackOrderLine[] lines = new ESDRecordCustomerAccountEnquiryBackOrderLine[]{};
}
