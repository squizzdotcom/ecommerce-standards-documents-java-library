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
* Ecommerce standards document that contains a list of attribute records associated with products, download, and labour, as well as a list of attribute profile records
* 
* An example of the Attribute Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The product attribute data has been successfully obtained.",
* "configs":{},
* "dataTransferMode": "COMPLETE",
* "version": 1.5,
* "totalDataRecords": 4,
* "attributeProfiles":
* [
* {
* "keyAttributeProfileID":"PAP-001"
* },
* {
* "keyAttributeProfileID":"PAP002",
* "name":"Clothing Styling",
* "description":"View the styling details of clothes",
* "attributes":
* [
* {
* "keyAttributeID":"PAP002-0"
* },
* {
* "keyAttributeID":"PAP002-1",
* "name":"Colour"
* },
* {
* "keyAttributeID":"PAP002-2",
* "name":"Size",
* "dataType":"NUMBER"
* },
* {
* "keyAttributeID":"PAP002-3",
* "name":"Texture",
* "dataType":"STRING"
* }
* ]
* }
* ],
* "dataRecords":
* [
* {
* "keyProductID":"PROD-001",
* "keyAttributeProfileID":"PAP002",
* "keyAttributeID":"PAP002-0"
* },
* {
* "keyProductID":"PROD-001",
* "keyAttributeProfileID":"PAP002",
* "keyAttributeID":"PAP002-1",
* "stringValue":"RED"
* },
* {
* "keyProductID":"PROD-001",
* "keyAttributeProfileID":"PAP002",
* "keyAttributeID":"PAP002-2",
* "numberValue": 8
* },
* {
* "keyProductID":"PROD-001",
* "keyAttributeProfileID":"PAP002",
* "keyAttributeID":"PAP002-3",
* "stringValue": "soft"
* },
* {
* "keyAttributeProfileID":"BD",
* "name":"Brand Details",
* "description":"Details of brands that our company sells",
* "attributes":
* [
* {
* "keyAttributeID":"BRAND-NAME",
* "name":"Brand Name",
* "dataType":"STRING"
* },
* {
* "keyAttributeID":"BRAND-COUNTRY",
* "name":"Brand Country Of Origin",
* "dataType":"STRING"
* }
* ]
* }
* }
*/
public class ESDocumentAttribute  extends ESDocument 
{
    /**
    * List of attribute profile records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordAttributeProfile[] attributeProfiles = new ESDRecordAttributeProfile[]{};
    /**
    * List of attribute value records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordAttributeValue[] dataRecords = new ESDRecordAttributeValue[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentAttribute(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the attribute data
    *  @param message message to accompany the result status
    *  @param attributeProfileRecords list of attribute profile records
    *  @param attributeValueRecords list of attribute value records that assign attribute values to products, downloads, and labour
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the attribute record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentAttribute(int resultStatus, String message, ESDRecordAttributeProfile[] attributeProfileRecords, ESDRecordAttributeValue[] attributeValueRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.attributeProfiles = attributeProfileRecords;
        this.dataRecords = attributeValueRecords;
        this.configs = configs;
        if (attributeValueRecords != null)
        {
            this.totalDataRecords = attributeValueRecords.length;
        }    
    }
}
