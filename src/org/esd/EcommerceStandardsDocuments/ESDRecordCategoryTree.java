/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards record that contains data for a single category tree. A category tree represents an overall hierarchical collection of categories, used to navigate and find associated products, maker models etc.. assigned to each category
*/
public class ESDRecordCategoryTree   
{
    /**
    * Key that allows the category record to be uniquely identified and linked to.
    */
    public String keyCategoryTreeID = new String();

    /**
    * Code of the category tree. May or may not be a unique identifier.
    */
    public String categoryTreeCode = new String();

    /**
    * Description field of the category tree. It may contain any text used to describe the category tree.
    */
    public String name = new String();

    /**
    * Description field of the category tree. It may contain any text used to describe the category tree.
    */
    public String description = new String();
	
	/**
	 * Number to order the category tree by. This may be used to order a number of category trees that appear within a list.
	 */
	public int ordering = 0;
	
	/**
	 * Either 'N'-No or 'Y'-Yes. If 'Y' then indicates that the category tree is used for navigation of maker/model data, and grouping of products assigned to each model through the tree's catgories.
	*/
	public String isMakerModelCategoryTree = new String();

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
