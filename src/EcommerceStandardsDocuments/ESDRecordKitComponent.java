/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single product, download, or labour assigned to a kit. A kit allows any number of products, downloads, or labour to be assigned it.
*/
public class ESDRecordKitComponent   
{
    /**
    * Key of the product record that is identified as the parent of the kit
    */
    public String keyKitProductID = new String();

    /**
    * Key of the download record that is identified as the parent of the kit
    */
    public String keyKitDownloadID = new String();

    /**
    * Key of the labour record that is identified as the parent of the kit
    */
    public String keyKitLabourID = new String();

    /**
    * Key of the product record that linked as a child, or component product of the kit
    */
    public String keyComponentProductID = new String();

    /**
    * Key of the download record that linked as a child, or component download of the kit
    */
    public String keyComponentDownloadID = new String();

    /**
    * Key of the labour record that linked as a child, or component labour of the kit
    */
    public String keyComponentLabourID = new String();

    /**
    * Amount of units of the components that are added to the kit
    */
    public double quantity = 0;

    /**
    * Numeric value to order the components by. If multiple component products, downloads, or labour are assigned to a kit then this field may be used to sort the components.
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
}