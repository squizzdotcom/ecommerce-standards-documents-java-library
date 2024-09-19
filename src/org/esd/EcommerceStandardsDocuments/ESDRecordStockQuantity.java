/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a stock unit quantity of a product, download or labour. This record typically stores stock quantity data that can updated on a frequent basis.
*/
public class ESDRecordStockQuantity   
{
    /**
    * Key of the product record that the stock level quantity is set for
    */
    public String keyProductID = new String();

    /**
    * Key of the download record that the stock level quantity is set for
    */
    public String keyDownloadID = new String();

    /**
    * Key of the labour record that the stock level quantity is set for
    */
    public String keyLabourID = new String();

    /**
    * Base unit quantity of stock available to be purchased
    */
    public double qtyAvailable = 0;

    /**
    * Base unit quantity of stock on hand at its location
    */
    public double qtyOnHand = 0;

    /**
    * Base unit quantity of stock that has been ordered by a purchaser
    */
    public double qtyOrdered = 0;
	
	/**
	 * Base unit quantity of stock that is the maximum amount that can be ordered by a purchaser
	 */
	public double qtyOrderable = 0;

    /**
    * Base unit quantity of stock that has been back ordered from a supplier
    */
    public double qtyBackordered = 0;

    /**
    * Base unit quantity of stock that has been reserved for given purchasers
    */
    public double qtyReserved = 0;

    /**
    * Base unit quantity of stock that has been placed at an external location (consigned)
    */
    public double qtyConsigned = 0;
	
	/**
    * Date time that indicates when the product's stock has been available or in-stock since. If the product currently has no stock available then ignore setting. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone</summary>
    */
	public long stockAvailableSinceDate = 0;
	
	/**
    * Date time that indicates when the product's stock has been on hand at its location since. If the product currently has no stock on hand then ignore setting. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
	public long stockOnHandSinceDate = 0;
	
	/**
    * Date time that indicates when the product's stock has been on order by purchaser(s) since. If the product currently has no stock on order then ignore setting. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
	public long stockOrderedSinceDate = 0;
	
	/**
    * Date time that indicates when the product's stock has been on back order from supplier(s). If the product currently has no stock on back order then ignore setting. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
	public long stockBackorderedSinceDate = 0;
	
	/**
    * Date time that indicates when the product's stock has been reserved by purchaser(s). If the product currently has no stock reserved then ignore setting. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
	public long stockReservedSinceDate = 0;
	
	/**
    * Date time that indicates when the product's stock has been on consignment for. If the product currently has no stock consigned then ignore setting. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
	public long stockConsignedSinceDate = 0;

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
