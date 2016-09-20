/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single product delivery associated to an order.
*/
public class ESDRecordOrderProductDelivery   
{
    /**
    * Quantity of product units delivered
    */
    public double quantity = 0;

    /**
    * Date that the products were delivered. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long deliveryDate = 0;

    /**
    * Code of the invoice that the product delivery is associated with.
    */
    public String invoiceCode = new String();

    /**
    * Code of the line in the invoice that the product delivery is associated with.
    */
    public String invoiceLineCode = new String();

    /**
    * Code of the delivery. May or may not be a unique identifier
    */
    public String deliveryCode = new String();

    /**
    * Code of the line in the delivery. May or may not be a unique identifier
    */
    public String deliveryLineCode = new String();

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
        if (invoiceCode == null)
        {
            invoiceCode = "";
        }
         
        if (invoiceLineCode == null)
        {
            invoiceLineCode = "";
        }
         
        if (deliveryCode == null)
        {
            deliveryCode = "";
        }
         
        if (deliveryLineCode== null)
        {
            deliveryLineCode = "";
        }
         
        if (internalID == null)
        {
            internalID = "";
        }        
    }
}