/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data associated with a single product, download, or labour image.
*/
public class ESDRecordImage   
{
    /**
    * Key that allows the image record to be uniquely identified and linked to.
    */
    public String keyImageID = new String();

    /**
    * Key of the product record that the image is set for.
    */
    public String keyProductID = new String();

    /**
    * Key of the download record that the image is set for.
    */
    public String keyDownloadID = new String();

    /**
    * Key of the labour record that the image is set for.
    */
    public String keyLabourID = new String();

    /**
    * Full file path to locate the image, including the image file name and extension. The file path may be a URL, or could be a path to the file in a local machine, or network file store.
    */
    public String imageFullFilePath = new String();

    /**
    * Name of the image file excluding its extension. The name should match the name in the imageFullFilePath property if set.
    */
    public String imageFileName = new String();
    /**
    * Extension of the image file. The extension should match the extension in the imageFullFilePath property if set.
    */
    public String imageFileExtension = new String();

    /**
    * Title to label the image.
    */
    public String title = new String();

    /**
    * Text to decribe details about the image
    */
    public String description = new String();

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