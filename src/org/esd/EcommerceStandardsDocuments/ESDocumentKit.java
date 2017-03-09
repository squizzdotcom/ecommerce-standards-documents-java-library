/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of kit records
* An example of the Kit Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The product kit data has been successfully obtained.",
* "configs":{"dataFields":"keyKitProductID,keyComponentProductID,quantity,ordering"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 4,
* "dataRecords":
* [
* {
* "keyKitProductID":"PROD-432",
* "keyComponentProductID":"PROD-123"
* },
* {
* "keyKitProductID":"PROD-444",
* "keyComponentProductID":"PROD-123",
* "quantity": 3,
* "ordering": 3
* },
* {
* "keyKitProductID":"PROD-444",
* "keyComponentProductID":"PROD-456",
* "quantity": 10,
* "ordering": 1
* },
* {
* "keyKitProductID":"PROD-444",
* "keyComponentProductID":"PROD-789",
* "quantity": 1,
* "ordering": 2
* }
* ]
* }
* }
*/
public class ESDocumentKit  extends ESDocument 
{
    /**
    * List of kit records
    */
    public ESDRecordKitComponent[] dataRecords = new ESDRecordKitComponent[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentKit(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the kit data
    *  @param message message to accompany the result status
    *  @param kitComponentRecords list of kit component records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the kit component record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentKit(int resultStatus, String message, ESDRecordKitComponent[] kitComponentRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = kitComponentRecords;
        this.configs = configs;
        if (kitComponentRecords != null)
        {
            this.totalDataRecords = kitComponentRecords.length;
        }
         
    }

}


