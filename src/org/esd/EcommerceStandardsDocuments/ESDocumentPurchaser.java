/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of purchaser records
* 
* An example of the Purchaser Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The purchaser data has been successfully obtained.",
* "configs":{"dataFields":"keyPurchaserID,purchaserCode,contact,isIndividual"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keyPurchaserID":"PUR-1"
* },
* {
* "keyPurchaserID":"PUR-2",
* "purchaserCode": "JD",
* "contact": "John Doe",
* "isIndividual": "Y"
* },
* {
* "keyPurchaserID":"4533",
* "purchaserCode": "AI",
* "name": "Acme Industries",
* "contact": "Kevin Peterson",
* "isIndividual": "N"
* }
* ]
* }
* }
*/
public class ESDocumentPurchaser  extends ESDocument 
{
    /**
    * List of purchaser records
    */
    public ESDRecordPurchaser[] dataRecords = new ESDRecordPurchaser[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentPurchaser(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the purchaser data
    *  @param message message to accompany the result status
    *  @param purchaserRecords list of purchaser records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the purchaser record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentPurchaser(int resultStatus, String message, ESDRecordPurchaser[] purchaserRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = purchaserRecords;
        this.configs = configs;
        if (purchaserRecords != null)
        {
            this.totalDataRecords = purchaserRecords.length;
        }    
    }
}