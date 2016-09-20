/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;


/**
* Ecommerce Standards Record that holds data for a single item group. Each record represents a group of assigned products, downloads and/or labour.
*/
public class ESDRecordItemGroup   
{
    /**
    * Key of the item Group record
    */
    public String keyItemGroupID = new String();

    /**
    * Code of the group, may or may not be a unique identifier.
    */
    public String groupCode = new String();

    /**
    * Label of item group.
    */
    public String groupLabel = new String();

    /**
    * Description of the item group.
    */
    public String groupDescription = new String();

    /**
    * List of key product record IDs that link product records to the group
    */
    public String[] keyProductIDs = new String[]{};

    /**
    * List of key download IDs that link download records to the group
    */
    public String[] keyDownloadIDs = new String[]{};

    /**
    * List of key labour IDs that link labour records to the group
    */
    public String[] keyLabourIDs = new String[]{};

    /**
    * Key product ID that denotes one product record in the group that is the default or primary representative of the group.
    */
    public String keyDefaultProductID = new String();

    /**
    * Key download ID that denotes one download record in the group that is the default or primary representative of the group.
    */
    public String keyDefaultDownloadID = new String();

    /**
    * Key labour ID that denotes one labour record in the group that is the default or primary representative of the group.
    */
    public String keyDefaultLabourID = new String();

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