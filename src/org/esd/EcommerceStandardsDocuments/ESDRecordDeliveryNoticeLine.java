/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single line in a delivery notice record. The line indicates the quantity of a product that is being delivered, or in the process thereof.
*/
public class ESDRecordDeliveryNoticeLine
{
	/**
    * Unique identifier of the delivery notice line.
    */
    public String keyDeliveryNoticeLineID = new String();
	
	/**
    * Unique identifier of the customer invoice within the supplier's system that the delivery is associated with.
    */
    public String keyCustomerInvoiceID = new String();
	
	/**
    * Unique identifier of the supplier invoice within the customer's system that the delivery is associated with.
    */
    public String keySupplierInvoiceID = new String();
	
	/**
    * Unique identifier of the sales order within the supplier's system that the delivery is associated with.
    */
    public String keySalesOrderID = new String();
	
	/**
    * Unique identifier of the purchase order within the customer's system that the delivery is associated with.
    */
    public String keyPurchaseOrderID = new String();

    /**
    * Code of the line in the delivery. May or may not be a unique identifier. Contains a human known identifier of the delivery notice
    */
    public String deliveryLineCode = new String();

    /**
    * Code of the invoice that the delivery is associated with. The code is the human known identifier of the invoice that the delivery line is associated to
    */
    public String invoiceCode = new String();

    /**
    * Code of the line in the invoice that the product delivery is associated with. THe code is the human known identifier of the invoice line associated to this delivery notice line
    */
    public String invoiceLineCode = new String();
	
	/**
    * Code of the line in the original purchase order associated to this delivery notice line
    */
    public String purchaseOrderLineCode = new String();

    /**
    * number of the line in original purchase order associated to this delivery notice line
    */
    public String purchaseOrderLineNumber = new String();
	
	/**
    * Key of the sell unit that indicates the kind of unit that the quantity being delivered is
    */
    public String keySellUnitID = new String();
	
	/**
    * Key of the product record associated to the line. Specifies the product that is linked to the line being delivered
    */
    public String keyProductID = new String();

    /**
    * Code the product in the line.
    */
    public String productCode = new String();

    /**
    * name of the product in the line
    */
    public String productName = new String();
	
	/**
    * Code of the customer's product that the line is associated to
    */
    public String customerProductCode = new String();
	
	/**
    * Code of the supplier's product that the line is associated to
    */
    public String supplierProductCode = new String();
	
	/**
    * quantity of the product's units being delivered
    */
    public double quantityOnDelivery = 0;

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
    public void setDefaultValuesForNullMembers()
	{
        if (keyDeliveryNoticeLineID == null)
        {
            keyDeliveryNoticeLineID = "";
        }
		
		if (keyCustomerInvoiceID == null)
        {
            keyCustomerInvoiceID = "";
        }
		
		if (keySupplierInvoiceID == null)
        {
            keySupplierInvoiceID = "";
        }
		
		if (keySalesOrderID == null)
        {
            keySalesOrderID = "";
        }
		
		if (keyPurchaseOrderID == null)
        {
            keyPurchaseOrderID = "";
        }
		
		if (invoiceCode == null)
        {
            invoiceCode = "";
        }
         
        if (invoiceLineCode == null)
        {
            invoiceLineCode = "";
        }
         
        if (deliveryLineCode== null)
        {
            deliveryLineCode = "";
        }
		
		if (purchaseOrderLineCode== null)
        {
            purchaseOrderLineCode = "";
        }
		
		if (purchaseOrderLineNumber== null)
        {
            purchaseOrderLineNumber = "";
        }
		
		if (keySellUnitID== null)
        {
            keySellUnitID = "";
        }
		
		if (keyProductID== null)
        {
            keyProductID = "";
        }
		
		if (productCode== null)
        {
            productCode = "";
        }
		
		if (productName== null)
        {
            productName = "";
        }
		
		if (customerProductCode== null)
        {
            customerProductCode = "";
        }
         
        if (internalID == null)
        {
            internalID = "";
        }
		
		if (supplierProductCode == null)
        {
            supplierProductCode = "";
        }
    }
}
