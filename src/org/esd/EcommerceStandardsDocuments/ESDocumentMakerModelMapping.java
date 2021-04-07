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
* Ecommerce standards document that contains a list of maker model mappings records that associate product, download, or labour records to categories within models manufactured or assembled by makers/manufacturers
* An example of the Maker Model Item Ecommerce Standards document in its JSON serialised form
* 
* {
*     "version": 1.4,
*     "resultStatus": 1,
*     "message":"The maker-model-mapping data has been successfully obtained.",
*     "dataTransferMode": "COMPLETE",
*     "totalDataRecords": 3,
*     "configs":{"dataFields":"keyMakerModelID,keyCategoryID,keyProductID,quantity,attributes"},
*     "dataRecords":
*      [
*         {
*             "keyMakerModelID":"2",
*             "keyCategoryID":"CAR-TYRE",
*             "keyProductID":"CAR-TYRE-LONG-LASTING",
*             "quantity": 4,
*             "attributes":
*             [
*                 {
*                     "keyAttributeProfileID":"MAKEMODELCAR",
*                     "keyAttributeID":"MMCAR-WHEELSIZE-RADIUS-INCH",
*                     "numberValue": 21
*                 },
*                 {
*                     "keyAttributeProfileID":"MAKEMODELCAR",
*                     "keyAttributeID":"MMCAR-WHEELSIZE-TREAD",
*                     "stringValue": "All Weather"
*                 }
*             ]
*         },
*         {
*             "keyMakerModelID":"2",
*             "keyCategoryID":"CAR-TYRE",
*             "keyProductID":"CAR-TYRE-CHEAP",
*             "quantity": 4,
*             "attributes":
*             [
*                 {
*                     "keyAttributeProfileID":"MAKEMODELCAR",
*                     "keyAttributeID":"MMCAR-WHEELSIZE-RADIUS-INCH",
*                     "numberValue": 20
*                 },
*                 {
*                     "keyAttributeProfileID":"MAKEMODELCAR",
*                     "keyAttributeID":"MMCAR-WHEELSIZE-TREAD",
*                     "stringValue": "BITUMEN"
*                 }
*             ]
*         }
*     ]
* }
*/
@JsonPropertyOrder({ "version", "resultStatus","message","dataTransferMode","totalDataRecords","configs","dataRecords"})
public class ESDocumentMakerModelMapping  extends ESDocument 
{
    /**
    * List of maker/manufacturer model mapping records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordMakerModelMapping[] dataRecords = new ESDRecordMakerModelMapping[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentMakerModelMapping(){
    }
    
    /**
    * Constructor
    * @param resultStatus status of obtaining the model mapping data
    * @param message message describing the status of obtaining the data for the document
    * @param modelMappingRecords list of model mapping records
    * @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the model mapping record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentMakerModelMapping(int resultStatus, String message, ESDRecordMakerModelMapping[] modelMappingRecords, HashMap<String, String> configs)
	{
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = modelMappingRecords;
        this.configs = configs;
        if (modelMappingRecords != null)
        {
            this.totalDataRecords = modelMappingRecords.length;
        }   
    }
}
