/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of alternate code records associated with products, downloads, or labour
* 
* An example of the Alternate Code Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The product alternate code data has been successfully obtained.",
* "configs":{"dataFields":"keyProductID,alternateCode,isUseCode,isSupplierCode"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keyProductID":"123A",
* "alternateCode":"043432-IND"
* },
* {
* "keyProductID":"123A",
* "alternateCode":"SWISH-1234",
* "isUseCode":"N",
* "isSupplierCode":"Y",
* "keySupplierAccountID":"SUP2"
* },
* {
* "keyProductID":"1234",
* "alternateCode":"SWISH-4567",
* "isUseCode":"Y",
* "isSupplierCode":"N",
* "keyCustomerAccountID":"222"
* }
* ]
* }
* }
*/
public class ESDocumentAlternateCode  extends ESDocument 
{
    /**
    * List of alternate code records
    */
    public ESDRecordAlternateCode[] dataRecords = new ESDRecordAlternateCode[]{};
    /**
    * Constructor
    *  @param resultStatus status of obtaining the alternate code data
    *  @param message message describing the status of obtaining the data for the document
    *  @param alternateCodeRecords list of alternate code records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the alternate code record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentAlternateCode(int resultStatus, String message, ESDRecordAlternateCode[] alternateCodeRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = alternateCodeRecords;
        this.configs = configs;
        if (alternateCodeRecords != null)
        {
            this.totalDataRecords = alternateCodeRecords.length;
        }    
    }
}


