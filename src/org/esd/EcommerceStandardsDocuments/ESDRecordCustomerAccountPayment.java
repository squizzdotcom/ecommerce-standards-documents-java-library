/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import java.util.ArrayList;

/**
* Ecommerce Standard Document that holds details of a payment made by a customer account for a given record type
*/
public class ESDRecordCustomerAccountPayment   
{
    /**
    * list of records that the payment applies to
    */
    public ArrayList<ESDRecordCustomerAccountPaymentRecord> records = new ArrayList<ESDRecordCustomerAccountPaymentRecord>();

    /**
    * Key that allows the customer account payment record to be uniquely identified and linked to.
    */
    public String keyCustomerAccountPaymentID = new String();

    /**
    * ID that allows the payment to be identified with. May or may not be unique.
    */
    public String paymentID = new String();

    /**
    * Code that allows the payment to be identified with. May or may not be unique.
    */
    public String paymentCode = new String();

    /**
    * Number  for reference purposes to the payment.
    */
    public String referenceNumber = new String();

    /**
    * Key of the customer account record assigned to the payment.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Code of the customer account assigned to the invoice.
    */
    public String customerAccountCode = new String();

    /**
    * ID of the user in the associated Ecommerce system where the payment was made from.
    */
    public String eCommerceUserID = new String();

    /**
    * ID of the associated Ecommerce system where the payment was made from.
    */
    public String eCommerceSystemID = new String();

    /**
    * Method on how the order is being paid for. The field must be  to one of the class's constants prefixed by PAYMENT_METHOD_
    */
    public String paymentMethod = new String();

    /**
    * Name of the user in the associated Ecommerce system where the payment was created. Ideally this is  to a label of the user, and not the credentials used for a user to login (since that could be a security issue passing around such information).
    */
    public String eCommerceUserName = new String();

    /**
    * Monetary amount of the payment
    */
    public double paymentAmount = 0;

    /**
    * text that contains a receipt number associated with the payment
    */
    public String paymentReceipt = new String();

    /**
    * Key of the payment type record that is associated to the payment. The payment type record indicates how the payment was made.
    */
    public String keyPaymentTypeID = new String();

    /**
    * Date of the payment record. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long paymentDate = 0;

    /**
    * Date that the payment record was created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long creationDate = 0;

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored in the invoice with
    */
    public String currencyCode = new String();

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
    * Record Type - Invoice
    */
    public static final String RECORD_TYPE_INVOICE = "INVOICE";
    /**
    * Record Type - Sales Order
    */
    public static final String RECORD_TYPE_ORDER_SALE = "ORDER_SALE";
    /**
    * Record Type - Purchase Order
    */
    public static final String RECORD_TYPE_ORDER_PURCHASE = "ORDER_PURCHASE";
    /**
    * Record Type - Back Order
    */
    public static final String RECORD_TYPE_BACKORDER = "BACKORDER";
    /**
    * UNPAID - No payment was received as yet
    */
    public static final String PAYMENT_METHOD_UNPAID = "UNPAID";
    /**
    * CREDIT - Payment was made with a credit card
    */
    public static final String PAYMENT_METHOD_CREDIT = "CREDITCARD";
    /**
    * DIRECTDEPOSIT - Payment has been made with a direct bank transfer
    */
    public static final String PAYMENT_METHOD_DIRECTDEPOSIT = "DIRECTDEPOSIT";
    /**
    * PROPRIETARY - A payment was made using a proprietary payment system. PayPal could be one example of this.
    */
    public static final String PAYMENT_METHOD_PROPRIETARY = "PROPRIETARY";
    /**
    * ACCOUNT - A payment was not applicable
    */
    public static final String PAYMENT_METHOD_NA = "NA";
    /**
    * Creates a Customer Account Payment Ecommerce Standard Document record
    */
    public ESDRecordCustomerAccountPayment(){
        this.records = new ArrayList<ESDRecordCustomerAccountPaymentRecord>();
    }

    /**
    * s default values for members that have no values 
    */
    public void setDefaultValuesForNullMembers(){
        if (records == null)
        {
            records = new ArrayList<ESDRecordCustomerAccountPaymentRecord>();
        }
        else
        {
            for (ESDRecordCustomerAccountPaymentRecord paymentRecord : records)
            {
                paymentRecord.setDefaultValuesForNullMembers();
            }
        } 
        if (paymentID == null)
        {
            paymentID = "";
        }
         
        if (paymentCode== null)
        {
            paymentCode = "";
        }
         
        if (keyCustomerAccountID == null)
        {
            keyCustomerAccountID = "";
        }
         
        if (customerAccountCode == null)
        {
            customerAccountCode = "";
        }
         
        if (eCommerceUserID == null)
        {
            eCommerceUserID = "";
        }
         
        if (eCommerceSystemID == null)
        {
            eCommerceSystemID = "";
        }
         
        if (eCommerceUserName== null)
        {
            eCommerceUserName = "";
        }
         
        if (referenceNumber== null)
        {
            referenceNumber = "";
        }
         
        if (paymentMethod == null)
        {
            paymentMethod = "";
        }
         
        if (paymentReceipt == null)
        {
            paymentReceipt= "";
        }
         
        if (paymentDate == 0)
        {
            // the date to the current time milliseconds since the epoch
            paymentDate = System.currentTimeMillis();
        }
         
        if (creationDate == 0)
        {
            // the date to the milliseconds since the epoch
            creationDate = System.currentTimeMillis();
        }
         
        if (currencyCode == null)
        {
            currencyCode = "";
        }
    }
}


