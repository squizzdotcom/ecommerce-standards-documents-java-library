/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;


/**
* Ecommerce Standard Record holding data for a customer account enquiry payment line
*/
public class ESDRecordCustomerAccountEnquiryPaymentLine   
{
    /**
    * Key that allows the customer account payment line record to be uniquely identified and linked to.
    */
    public String keyPaymentLineID = new String();

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
    * ISO currency code that denotes the currency that all monetary amounts stored as in the line
    */
    public String currencyCode = new String();

    /**
    * Monetary amount that the payment line applies to
    */
    public double amount = 0;

    /**
    * Key of an entity that is linked to the payment as a reference. A Reference could be a record such as a sales order or invoice
    */
    public String referenceKeyID = new String();

    /**
    * Type of entity that is linked to the payment as a reference.  A Reference could be a record such as a sales order or invoice
    */
    public String referenceType = new String();

    /**
    * Number that provides a reference to the payment.
    */
    public String referenceNumber = new String();

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


