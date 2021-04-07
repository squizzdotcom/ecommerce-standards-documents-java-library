/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;


/**
* Ecommerce Standards record that contains the data of a single transaction that can be queried for a customer account. A transaction record contains information about a positive or negative amount applied against the customer account's balance, as well the balance after the amount was applied. The account enquiry aspect denotes that the record may be queried in real time and contain additional information associated with the record.
*/
public class ESDRecordCustomerAccountEnquiryTransaction   
{
    /**
    * Key that allows the customer account transaction record to be uniquely identified and linked to.
    */
    public String keyTransactionID = new String();

    /**
    * ID that allows the transaction to be identified with. May or may not be unique.
    */
    public String transactionID = new String();

    /**
    * Number that is associated to the transaction. This number can be used for referencing purposes.
    */
    public String transactionNumber = new String();

    /**
    * Key of the customer account record assigned to the transaction.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Code of the customer account assigned to the transaction.
    */
    public String customerAccountCode = new String();

    /**
    * Text that describes any information associated with the transaction
    */
    public String description = new String();

    /**
    * Date that the transaction record was created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long creationDate = 0;

    /**
    * Date set to the transaction. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long transactionDate = 0;

    /**
    * Key of an entity that is linked to the transaction as a reference. A Reference could be an ID of a record such as a sales order or invoice
    */
    public String referenceKeyID = new String();

    /**
    * Type of entity that is linked to the transaction as a reference.  A Reference could be a record such as a sales order or invoice
    */
    public String referenceType = new String();

    /**
    * Number that provides a reference to the transaction.
    */
    public String referenceNumber = new String();

    /**
    * Monetary amount that denotes the balance of the customer account's after the transaction was applied.
    */
    public double balance = 0;

    /**
    * Monetary amount negated from the customer account's balance. If set then the creditAmount property should not contain a value.
    */
    public double debitAmount = 0;

    /**
    * Monetary amount added to the customer account's balance. If set then the debitAmount property should not contain a value.
    */
    public double creditAmount = 0;

    /**
    * Language that all text is described in. Set it to one of the LANG constants in the ESDocumentConstants class
    */
    public String language = new String();

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored in the transaction with
    */
    public String currencyCode = new String();

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
