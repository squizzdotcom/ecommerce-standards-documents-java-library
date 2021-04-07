/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of maker/manufacturer records
* An example of the Maker Ecommerce Standards document in its JSON serialised form
* 
* {
*     "version": 1.4,
*     "resultStatus": 1,
*     "message":"The maker data has been successfully obtained.",
*     "dataTransferMode": "COMPLETE",
*     "totalDataRecords": 3,
*     "configs":{"dataFields":"keyMakerID,makerCode,name,makerSearchCode,groupClass,ordering,establishedDate,orgName,authorityNumbers,authorityNumberLabels,authorityNumberTypes"},
*     "dataRecords":
*      [
*         {
*             "keyMakerID":"1"
*         },
*         {
*             "keyMakerID":"2",
*             "makerCode":"CAR1",
*             "name":"Car Manufacturer A",
*             "makerSearchCode":"Car-Manufacturer-A",
*             "groupClass":"POPULAR CARS",
*             "ordering": 2,
*             "establishedDate": 1449132083084,
*             "orgName":"Car Manufacturer A",
*             "authorityNumbers":["123456789 1234"],
*             "authorityNumberLabels":["Australian Business Number"],
*             "authorityNumberTypes":[1]
*         },
*         {
*             "keyMakerID":"3",
*             "makerCode":"CAR3",
*             "name":"Car Manufacturer B",
*             "makerSearchCode":"Car-Manufacturer-B-Sedans-Wagons",
*             "groupClass":"CUSTOM CARS",
*             "ordering": 1,
*             "establishedDate": 1449132083084,
*             "orgName":"Car Manufacturer B",
*             "authorityNumbers":["98877664322"],
*             "authorityNumberLabels":["Australian Business Number"],
*             "authorityNumberTypes":[1]
*         }
*     ]
* }
*/
@JsonPropertyOrder({ "version", "resultStatus","message","dataTransferMode","totalDataRecords","configs","dataRecords"})
public class ESDocumentMaker  extends ESDocument 
{
    /**
    * List of maker/manufacturer records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordMaker[] dataRecords = new ESDRecordMaker[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentMaker(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the maker data
    *  @param message message to accompany the result status
    *  @param makerRecords list of maker records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the maker record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentMaker(int resultStatus, String message, ESDRecordMaker[] makerRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = makerRecords;
        this.configs = configs;
        if (makerRecords != null)
        {
            this.totalDataRecords = makerRecords.length;
        }
    }
}
