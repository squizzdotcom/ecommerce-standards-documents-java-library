/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of price level records
* 
* An example of the Price Level Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The price level data has been successfully obtained.",
* "configs":{"dataFields":"keyPriceLevelID,label"},
* "dataTransferMode": "COMPLETE",
* "version": 1.4,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keyPriceLevelID":"PL-001",
* "label":"Price Level 001"
* },
* {
* "keyPriceLevelID":"PL-002",
* "label":"Price Level 002"
* },
* {
* "keyPriceLevelID":"PL-003",
* "label":"Price Level 003"
* }
* ]
* }
* }
*/
public class ESDocumentPriceLevel  extends ESDocument 
{
    /**
    * List of price level records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordPriceLevel[] dataRecords = new ESDRecordPriceLevel[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentPriceLevel(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the price level data
    *  @param message message describing the status of obtaining the data for the document
    *  @param priceLevelRecords list of price level records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the price level record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentPriceLevel(int resultStatus, String message, ESDRecordPriceLevel[] priceLevelRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = priceLevelRecords;
        this.configs = configs;
        if (priceLevelRecords != null)
        {
            this.totalDataRecords = priceLevelRecords.length;
        }   
    }
}
