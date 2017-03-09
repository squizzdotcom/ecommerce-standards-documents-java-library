/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
* Ecommerce Standards Record that holds data for a single attachment file associated to a product, download, or labour.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single attachment file associated to a product, download, or labour.
*/
public class ESDRecordAttachment   
{
    /**
    * Key that allows the attachment record to be uniquely identified and linked to.
    */
    public String keyAttachmentID = new String();
    /**
    * Key of the product record that the attachment record is assigned to.
    */
    public String keyProductID = new String();

    /**
    * Key of the download record that the attachment record is assigned to.
    */
    public String keyDownloadID = new String();

    /**
    * Key of the labour record that the attachment record is assigned to.
    */
    public String keyLabourID = new String();

    /**
    * name of the attachment's file
    */
    public String fileName = new String();

    /**
    * extension of the attachment's file
    */
    public String fileExtension = new String();

    /**
    * full file path to location where the attachment file is located
    */
    public String fullFilePath = new String();

    /**
    * Title that allows the attachment to be labelled.
    */
    public String title = new String();

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


