/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;


/**
* Ecommerce Standard Record holding line data for a customer account credit enquiry
*/
public class ESDRecordCustomerAccountEnquiryCreditLine   
{
    /**
    * Key that allows the customer account credit line record to be uniquely identified and linked to.
    */
    public String keyCreditLineID = new String();

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
    * Key of an entity that is linked to the credit as a reference. A Reference could be a record such as a sales order or invoice
    */
    public String referenceKeyID = new String();

    /**
    * Type of entity that is linked to the credit as a reference.  A Reference could be a record such as a sales order or invoice
    */
    public String referenceType = new String();

    /**
    * Number that provides a reference to the credit.
    */
    public String referenceNumber = new String();

    /**
    * Quantity of the line.
    */
    public double quantity = 0;

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
    * percentage amount associated with the taxcode that has been used to calculate the line tax.
    */
    public double taxCodeRatePercent = 0;

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored as in the line
    */
    public String currencyCode = new String();

    /**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int __drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();
}


