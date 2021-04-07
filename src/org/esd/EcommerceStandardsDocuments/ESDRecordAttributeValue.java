/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single product, download, or labour attribute value.
*/
public class ESDRecordAttributeValue   
{
    /**
    * Key of the product record that the attribute value is set for.
    */
    public String keyProductID = new String();

    /**
    * Key of the download record that the attribute value is set for.
    */
    public String keyDownloadID = new String();

    /**
    * Key of the labour record that the attribute value is set for.
    */
    public String keyLabourID = new String();
	
	/**
    * Key of the location record that the attribute value is set for.
    */
    public String keyLocationID = new String();

    /**
    * Key of the attribute profile record that the attribute assigned to the value is set to.
    */
    public String keyAttributeProfileID = new String();

    /**
    * Key of the attribute record that the value is set to.
    */
    public String keyAttributeID = new String();

    /**
    * text of the attribute value, if its attribute data type is set to string.
    */
    public String stringValue = new String();

    /**
    * number of the attribute value, if its attribute data type is set to number.
    */
    public double numberValue = 0d;

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
