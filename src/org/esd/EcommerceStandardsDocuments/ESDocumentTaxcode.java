/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of taxcode records
* An example of the Taxcode Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The taxcode data has been successfully obtained.",
* "configs":{"dataFields":"keyTaxcodeID,taxcode,taxcodeLabel,description,taxcodePercentageRate"},
* "dataTransferMode": "COMPLETE",
* "version": 1.3,
* "totalDataRecords": 4,
* "dataRecords":
* [
* {
* "keyTaxcodeID":"123"
* },
* {
* "keyTaxcodeID":"456",
* "taxcode": "GST",
* "taxcodeLabel":"Goods And Services Tax",
* "description": "Australian Goods And Services Tax",
* "taxcodePercentageRate": 10
* },
* {
* "keyTaxcodeID":"765",
* "taxcode": "WINE",
* "description": "Wine Tax",
* "taxcodePercentageRate": 15
* },
* {
* "keyTaxcodeID":"6765",
* "taxcode": "FREE",
* "description": "Tax Free",
* "taxcodePercentageRate": 0
* }
* ]
* }
* }
*/
public class ESDocumentTaxcode  extends ESDocument 
{
    /**
    * List of taxcode records
    */
    public ESDRecordTaxcode[] dataRecords = new ESDRecordTaxcode[]{};
    /**
    * Contructor
    */
    public ESDocumentTaxcode(){
    }

    /**
    * Constructor
    *  @param resultStatus status of obtaining the taxcode data
    *  @param message message to accompany the result status
    *  @param taxcodeRecords list of taxcode records
    */
    public ESDocumentTaxcode(int resultStatus, String message, ESDRecordTaxcode[] taxcodeRecords){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = taxcodeRecords;
    }

    /**
    * Constructor
    *  @param resultStatus status of obtaining the taxcode data
    *  @param message message to accompany the result status
    *  @param taxcodeRecords list of taxcode records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the taxcode record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentTaxcode(int resultStatus, String message, ESDRecordTaxcode[] taxcodeRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = taxcodeRecords;
        this.configs = configs;
        if (taxcodeRecords != null)
        {
            this.totalDataRecords = taxcodeRecords.length;
        }      
    }
}
