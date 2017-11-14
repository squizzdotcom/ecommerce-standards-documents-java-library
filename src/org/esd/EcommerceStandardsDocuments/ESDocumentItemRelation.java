/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of item relation records
* An example of the item relation Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The item relation data has been successfully obtained.",
* "configs":{"dataFields":"keyProductID,keyDownloadID,keyLabourID,keyRelatedDownloadID,keyRelatedProductID,keyRelatedLabourID"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 4,
* "dataRecords":
* [
* {
* "keyProductID":"123",
* "keyRelatedProductID":"456"
* },
* {
* "keyProductID":"123",
* "keyRelatedDownloadID": "DWN1"
* },
* {
* "keyDownloadID":"DWN1",
* "keyRelatedLabourID": "LAB2"
* },
* {
* "keyLabourID":"LAB1",
* "keyRelatedProductID": "123"
* }
* ]
* }
* }
*/
public class ESDocumentItemRelation  extends ESDocument 
{
    /**
    * List of item relation records
    */
    public ESDRecordItemRelation[] dataRecords = new ESDRecordItemRelation[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentItemRelation(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the item relation data
    *  @param message message to accompany the result status
    *  @param itemRelationRecords list of item relation records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the item relation record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentItemRelation(int resultStatus, String message, ESDRecordItemRelation[] itemRelationRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = itemRelationRecords;
        this.configs = configs;
        if (itemRelationRecords != null)
        {
            this.totalDataRecords = itemRelationRecords.length;
        }    
    }
}