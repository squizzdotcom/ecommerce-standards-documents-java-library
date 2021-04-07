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
* Ecommerce standards document that contains a list of product combination records, and a list of product combination profile records
* An example of the Product Combinations Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The product combination data has been successfully obtained.",
* "configs":{},
* "dataTransferMode": "COMPLETE",
* "version": 1.4,
* "totalDataRecords": 2,
* "combinationProfiles":
* [
* {
* "keyComboProfileID":"PROF-123",
* "combinationFields":[]
* },
* {
* "keyComboProfileID":"PROF-456",
* "profileName":"Furniture Styling",
* "description":"Styling of Furniture Products",
* "combinationFields":
* [
* {
* "keyComboProfileFieldID":"PROF-456-1",
* "fieldValues":[],
* "fieldValueIDs":[]
* },
* {
* "keyComboProfileFieldID":"PROF-456-2",
* "fieldName":"Size",
* "ordering": 2,
* "fieldValues": ["Small","Medium","Large","Jumbo"],
* "fieldValueIDs": ["PROF-456-2-SM","PROF-456-2-MED","PROF-456-2-LARG","PROF-456-2-JUM"]
* },
* {
* "keyComboProfileFieldID":"PROF-456-4",
* "fieldName":"Style",
* "ordering": 1,
* "fieldValues": ["Classic","Modern","Vintage","Minimalist"],
* "fieldValueIDs": ["COMBO-VAL-CL","COMBO-VAL-MOD","COMBO-VAL-VINT","COMBO-VAL-MIN"]
* }
* ]
* }
* ],
* "dataRecords":
* [
* {
* "keyProductID":"678",
* "keyComboProfileID":"PROF-123",
* "productCombinations":[]
* },
* {
* "keyProductID": "679",
* "keyComboProfileID": "PROF-456",
* "productCombinations":
* [
* {
* "keyProductID":"SOFTA-123",
* "keyComboProfileID":"PROF-456",
* "fieldValueCombinations":[
* ["PROF-456-2","PROF-456-2-SM"],
* ["PROF-456-4","COMBO-VAL-CL"]
* ]
* },
* {
* "keyProductID":"SOFTA-456",
* "keyComboProfileID":"PROF-456",
* "fieldValueCombinations":[
* ["PROF-456-2","PROF-456-2-SM"],
* ["PROF-456-4","COMBO-VAL-CL"]
* ]
* },
* {
* "keyProductID":"SOFTA-098",
* "keyComboProfileID":"PROF-456",
* "fieldValueCombinations":[
* ["PROF-456-2","PROF-456-2-MED"],
* ["PROF-456-4","COMBO-VAL-CL"]
* ]
* }
* ],
* "defaultCombination": 2
* }
* ]
* }
* }
*/
public class ESDocumentProductCombination  extends ESDocument 
{
    /**
    * List of product combination profile records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordCombinationProfile[] combinationProfiles = new ESDRecordCombinationProfile[]{};
    /**
    * List of product combination records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordProductCombinationParent[] dataRecords = new ESDRecordProductCombinationParent[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentProductCombination(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the product combination data
    *  @param message message to accompany the result status
    *  @param productCombinationParentRecords list of product combination parent records
    *  @param combinationProfileRecords list of product combination profile records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the product combination record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentProductCombination(int resultStatus, String message, ESDRecordProductCombinationParent[] productCombinationParentRecords, ESDRecordCombinationProfile[] combinationProfileRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = productCombinationParentRecords;
        this.configs = configs;
        this.combinationProfiles = combinationProfileRecords;
        if (productCombinationParentRecords != null)
        {
            this.totalDataRecords = productCombinationParentRecords.length;
        }  
    }
}
