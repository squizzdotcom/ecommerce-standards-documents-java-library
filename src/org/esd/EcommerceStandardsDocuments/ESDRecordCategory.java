/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards record that contains data for a single category. A category is a representation of a collection of objects, and can be linked in a hierarchical data structure.
*/
public class ESDRecordCategory   
{
    /**
    * Key that allows the category record to be uniquely identified and linked to.
    */
    public String keyCategoryID = new String();

    /**
    * Code of the category. May or may not be a unqiue identifier.
    */
    public String categoryCode = new String();

    /**
    * Key of the category record that it is assigned to in a hierarchical data structure.
    */
    public String keyCategoryParentID = new String();
	
	/**
    * Key of the category tree that the category record may reside within. The category tree defines a collection of categories that can be navigated within.
	*/
	public String keyCategoryTreeID = new String();

    /**
    * Name of the category.
    */
    public String name = new String();

    /**
    * First description field of the category. It may contain any text used to describe the category.
    */
    public String description1 = new String();

    /**
    * Second description field of the category. It may contain any text used to describe the category.
    */
    public String description2 = new String();

    /**
    * Third description field of the category. It may contain any text used to describe the category.
    */
    public String description3 = new String();

    /**
    * Fourth description field of the category. It may contain any text used to describe the category.
    */
    public String description4 = new String();

    /**
    * Meta title of the category. This would typically be used in the meta data of a web page.
    */
    public String metaTitle = new String();

    /**
    * A list of words that describe the category. This would typically be used in the meta data of a web page.
    */
    public String metaKeywords = new String();

    /**
    * Meta description the category. This would typically be used in the meta data of a web page.
    */
    public String metaDescription = new String();

    /**
    * Number to order the category by. This may be used to order a number of categories in a hierarchical tree that are all assigned to the same parent category.
    */
    public int ordering = 0;

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
    * List of Key Product IDs, that link any number of Product records to the category.
    */
    public String[] keyProductIDs = new String[]{};

    /**
    * List of Key Download IDs, that link any number of Download records to the category.
    */
    public String[] keyDownloadIDs = new String[]{};

    /**
    * List of Key Labour IDs, that link any number of Labour records to the category.
    */
    public String[] keyLabourIDs = new String[]{};
}
