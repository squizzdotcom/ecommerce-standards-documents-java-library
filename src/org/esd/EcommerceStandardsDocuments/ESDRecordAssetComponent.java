/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.ArrayList;

/**
 * Ecommerce Standards Record that holds data for a single relationship between an asset belonging to another parent asset. This allows an asset to be made of many component assets to make a single collective larger asset/resource
 */
public class ESDRecordAssetComponent {
	/**
	 * Key of the asset record.
	 */
	public String keyAssetID = new String();

	/**
	 * Hey of the category record, that is used to denote the category that the child asset is associated to for a given parent asset
	 */
	public String keyCategoryID = new String();

	/**
	 * Key of the asset record  that is the child asset that belongs to, or is a component of the parent asset.</summary>
	 */
	public String keyChildAssetID = new String();

	/**
	 * list of attributes and values associated to the child asset for the particular category.
	 */
	public ArrayList<ESDRecordAttributeValue> attributes = new ArrayList<ESDRecordAttributeValue>();

	/**
	 * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed. Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
	 */
	public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

	/**
	 * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
	 */
	public String internalID = new String();
}