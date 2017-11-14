/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce Standards Document that contains the base set of properties for all documents
*/
public class ESDocument   
{
    /**
    * Version of the Ecommerce Standards Document.
    * Verifying the version of the document is critical for systems transferring and manipulating the data.
    */
    public double version = ESDocumentConstants.ESD_DOCUMENT_VERSION;
    /**
    * Code that denotes if the data could be successfully obtained for the document, and if not why.
    * See ESDocumentConstants Class for the list of status codes
    */
    public int resultStatus = ESDocumentConstants.RESULT_SUCCESS;
    /**
    * Message providing details of if the data could be obtained when requesting the document. The message gives meaning to the result status.
    */
    public String message = new String();
    /**
    * Denotes if the data being placed into document is a complete data set, or partial data being transferred containing only data changes.
    */
    public String dataTransferMode = new String();
    /**
    * The total number of records placed within document.
    * For documents that contain multiple record lists, please check the relevant documentation to see how this number applies.
    */
    public int totalDataRecords = 0;
    /**
    * A dictionary of additional configurations and settings to include with each Ecommerce Standard Document. Typically documents would contain the "dataFields" key that would have a comma delimited list of record properties that are expected to contain data when reading the document's records. Any records not containing data for properties in list could then have the data set to a default when saved to a database.
    */
    public HashMap<String, String> configs = new HashMap<String, String>();
    /**
    * Constructor that sets that initialises the document's properties
    */
    public ESDocument(){
        resultStatus = 0;
        totalDataRecords = 0;
        message = "";
        configs = new HashMap<String, String>();
        version = ESDocumentConstants.ESD_DOCUMENT_VERSION;
        dataTransferMode = ESDocumentConstants.ESD_DATA_MODE_COMPLETE;
    }

    /**
    * Constructor
    *  @param resultStatus Status of the document
    *  @param message Message to explain the status
    */
    public ESDocument(int resultStatus, String message){
        this.resultStatus = resultStatus;
        this.message = message;
    }

}