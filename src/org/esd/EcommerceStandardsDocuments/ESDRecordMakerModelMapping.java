/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.ArrayList;

/**
 * Ecommerce Standards Record that holds data for a single mapping between a maker/manufacturer's model, a category, and either a product, download, or labour entity. Each mapping may also contain any number of attribute values to contain more data about the mapped entity in relation to the model
 */
public class ESDRecordMakerModelMapping
{
	/** 
	 *Key of the maker/manufacturer model record.
	 */
	public String keyMakerModelID = new String();

	/**
	 *Hey of the category record, that is used to denote the category that the product, labour, or download is associated to for a given model
	 */
	public String keyCategoryID = new String();

	/** 
	 *Key of the Product record. 
	 */
	public String keyProductID = new String();

	/** 
	 *Key of the Labour record that the flag is assigned to.
	 */
	public String keyLabourID = new String();

	/**
	 *Key of the Download record that the flag is assigned to.
	 */
	public String keyDownloadID = new String();

	/**
	 *Quantity of the product assigned to the model for the given category. The default is 1 if the quantity has not been set.
	 */
	public double quantity = 0;

	/**
	 * list of attributes and values associated to the product, download, or labour assigned to the model in the particular category.
	 */
	public ArrayList<ESDRecordAttributeValue> attributes = new ArrayList<ESDRecordAttributeValue>();

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
