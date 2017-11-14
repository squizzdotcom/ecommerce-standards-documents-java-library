/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import org.esd.EcommerceStandardsDocuments.ESDRecordCustomerAccountEnquiryPaymentLine;

/**
* Ecommerce Standards record that contains the data of a single Payment that can be queried for a customer account. A payment record contains information about a positive monetary amount paid to the customer account's balance. The account enquiry aspect denotes that the record may be queried in real time and contain additional information associated with the record.
*/
public class ESDRecordCustomerAccountEnquiryPayment   
{
    /**
    * Key that allows the customer account payment record to be uniquely identified and linked to.
    */
    public String keyPaymentID = new String();

    /**
    * ID that allows the payment to be identified with. May or may not be unique.
    */
    public String paymentID = new String();

    /**
    * Number that is associated to the payment. This number can be used for referencing purposes.
    */
    public String paymentNumber = new String();

    /**
    * Key of the customer account record assigned to the payment.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Code of the customer account assigned to the payment.
    */
    public String customerAccountCode = new String();

    /**
    * Date that the payment record was created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long creationDate = 0;

    /**
    * Date set to the payment. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long paymentDate = 0;

    /**
    * Key of an entity that is linked to the payment as a reference. A Reference could be an ID of a record such as a sales order or invoice
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
    * total monetary amount the payment applies
    */
    public double totalAmount = 0;
	
	/**
	* Total number of surcharges applied to the payment
	*/
	public int totalSurchargeItems = 0;
	
	/**
	* Total monetary amount of surcharges applied to the payment exclusive of taxes
	*/
	public double totalSurchargeExTax = 0;
	
	/**
	* Total monetary amount of surcharges applied to the payment inclusive of taxes
	*/
	public double totalSurchargeIncTax = 0;
	
	/**
	* Total monetary amount of taxes applied to surcharges in the payment
	*/
	public double totalSurchargeTax = 0;

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored in the payment with
    */
    public String currencyCode = new String();

    /**
    * Text that describes any information associated with the payment
    */
    public String description = new String();

    /**
    * Text that contains additional comments that have been made for the payment
    */
    public String comment = new String();

    /**
    * Language that all text is described in. Set it to one of the LANG constants in the ESDocumentConstants class
    */
    public String language = new String();

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
    * List of lines in the payment
    */
    public ESDRecordCustomerAccountEnquiryPaymentLine[] lines = new ESDRecordCustomerAccountEnquiryPaymentLine[]{};
}