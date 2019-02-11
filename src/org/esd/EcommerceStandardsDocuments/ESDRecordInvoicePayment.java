/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single payment associated to an invoice.
*/
public class ESDRecordInvoicePayment   
{
    /**
    * Method on how the payment was made. The field must be set to one of the class's constants prefixed by PAYMENT_METHOD_ within the ESDocument CONSTANTS
    */
    public String paymentMethod = new String();
    /**
    * Monetary amount the payment applies to
    */
    public double paymentAmount = 0;
    /**
    * Receipt number associated to the payment.
    */
    public String paymentReceipt = new String();
    /**
    * Code the proprietary system that is used as the payment method.
    */
    public String paymentProprietaryCode = new String();

    /**
    * Key of the payment type record that is assigned to the payment. The payment type record indicates how the payment was made.
    */
    public String keyPaymentTypeID = new String();
	
	/**
    * Date that the payment was made. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long paidDate = 0;

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
    * s default values for members that have no values 
    */
    public void setDefaultValuesForNullMembers(){
        if (paymentMethod == null)
        {
            paymentMethod = "";
        }
         
        if (paymentReceipt == null)
        {
            paymentReceipt = "";
        }
         
        if (paymentProprietaryCode== null)
        {
            paymentProprietaryCode = "";
        }
         
        if (keyPaymentTypeID== null)
        {
            keyPaymentTypeID = "";
        }
         
        if (internalID== null)
        {
            internalID = "";
        }
    }
}
