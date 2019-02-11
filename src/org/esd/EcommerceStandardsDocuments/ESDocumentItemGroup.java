/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of item group records
* An example of the item group Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The item group data has been successfully obtained.",
* "configs":{"dataFields":"keyItemGroupID,groupCode,groupLabel,groupDescription,keyDefaultProductID,keyDefaultDownloadID,keyDefaultLabourID"},
* "dataTransferMode": "COMPLETE",
* "version": 1.3,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keyItemGroupID":"1"
* },
* {
* "keyItemGroupID":"2",
* "groupCode": "COL-TEATOWEL",
* "groupLabel": "Coloured Teatowels",
* "groupDescription": "Group contains an assorted number of teatowels, each styled with vibrant colours.",
* "keyDefaultProductID": "456",
* "keyDefaultDownloadID": "",
* "keyDefaultLabourID": "",
* "keyProductIDs": ["123","456","789","1000"],
* "keyDownloadIDs": [],
* "keyLabourIDs": []
* },
* {
* "keyItemGroupID":"3",
* "groupCode": "GRP-TV-SETUP",
* "groupLabel": "Amazing TV Bundle",
* "groupDescription": "Bundle contains everything you need to get a TV. It contains a television, labour to install the TV, and a downloadable manual to be able to use the TV.",
* "keyDefaultProductID": "0987",
* "keyDefaultDownloadID": "",
* "keyDefaultLabourID": "",
* "keyProductIDs": ["0987"],
* "keyDownloadIDs": ["DOWN-9898"],
* "keyLabourIDs": ["LAB-INSTALL"]
* }
* ]
* }
* }
*/
public class ESDocumentItemGroup  extends ESDocument 
{
    /**
    * List of item group records
    */
    public ESDRecordItemGroup[] dataRecords = new ESDRecordItemGroup[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentItemGroup(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the item group data
    *  @param message message to accompany the result status
    *  @param itemGroupRecords list of item group records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the item group record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentItemGroup(int resultStatus, String message, ESDRecordItemGroup[] itemGroupRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = itemGroupRecords;
        this.configs = configs;
        if (itemGroupRecords != null)
        {
            this.totalDataRecords = itemGroupRecords.length;
        }    
    }
}
