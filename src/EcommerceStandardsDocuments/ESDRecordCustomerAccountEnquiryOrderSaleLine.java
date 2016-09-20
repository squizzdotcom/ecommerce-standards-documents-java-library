/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;


/**
* Ecommerce Standard Record holding data for a customer account order line
*/
public class ESDRecordCustomerAccountEnquiryOrderSaleLine   
{
    /**
    * Key that allows the customer account sales order line record to be uniquely identified and linked to.
    */
    public String keyOrderSaleLineID = new String();

    /**
    * ID that allows the line to be identified with. May or may not be unique.
    */
    public String lineItemID = new String();

    /**
    * Code that allows the line to be identified with. May or may not be unique.
    */
    public String lineItemCode = new String();

    /**
    * Defines the type of data that the line represents. Set it to one of the constants prefixed with RECORD_LINE_TYPE_ in the ESDocumentCustomerAccountEnquiry class
    */
    public String lineType = new String();

    /**
    * text to describe any details of the line.
    */
    public String description = new String();

    /**
    * Language that all text is described in. Set it to one of the LANG constants in the ESDocumentConstants class
    */
    public String language = new String();

    /**
    * label of the unit that any quantities set to the line represent.
    */
    public String unit = new String();

    /**
    * United Nations Standard Products and Service Code. Stores a standard code defined by the United Nations classifying objects.
    */
    public String UNSPSC = new String();

    /**
    * Quantity ordered for the line.
    */
    public double quantityOrdered = 0;

    /**
    * Quantity delivered for the line.
    */
    public double quantityDelivered = 0;

    /**
    * Quantity back ordered for the line.
    */
    public double quantityBackordered = 0;

    /**
    * monetary price for a single unit excluding tax amount.
    */
    public double priceExTax = 0;

    /**
    * monetary price for a single unit including tax amount.
    */
    public double priceIncTax = 0;

    /**
    * monetary price for the amount of tax applied to a single unit.
    */
    public double priceTax = 0;

    /**
    * monetary price for the total quantity of units excluding tax amount.
    */
    public double totalPriceExTax = 0;

    /**
    * monetary price for the total quantity of units including tax amount.
    */
    public double totalPriceIncTax = 0;

    /**
    * monetary price for the amount of tax applied to the total quantity of units.
    */
    public double totalPriceTax = 0;

    /**
    * tax code set for the line
    */
    public String taxCode = new String();

    /**
    * Key of the location record associated to the line.
    */
    public String keyLocationID = new String();

    /**
    * Code of the location associated to the line.
    */
    public String locationCode = new String();

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored as in the line
    */
    public String currencyCode = new String();

    /**
    * Item code of a line that it may reference from another record
    */
    public String referenceLineItemCode = new String();

    /**
    * Code of the line that it may reference from another record
    */
    public String referenceLineCode = new String();

    /**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();
}


