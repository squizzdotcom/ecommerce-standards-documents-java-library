/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of category records
* 
* An example of the Category Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The category data has been successfully obtained.",
* "configs":{"dataFields":"keyCategoryID,categoryCode,keyCategoryParentID,name,description1,description2,description3,description4,metaTitle,metaKeywords,metaDescription,ordering"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keyCategoryID":"2",
* "categoryCode":"Home and Stationery"
* },
* {
* "keyCategoryID":"123",
* "categoryCode":"tables-chairs",
* "keyCategoryParentID":"2",
* "name":"Tables and Chairs",
* "description1":"View our extensive range of tables and chairs",
* "description2":"Range includes products from the ESD designers",
* "description3":"",
* "description4":"",
* "metaTitle":"Tables and Chairs From ESD Designers",
* "metaKeywords":"tables chairs esd furniture designers",
* "metaDescription":"Tables and chairs from the ESD designers",
* "ordering": 2,
* "keyProductIDs":["TAB-1","53432","CHAIR-5"],
* "keyDownloadIDs":[],
* "keyLabourIDs":[]
* },
* {
* "keyCategoryID":"124",
* "categoryCode":"paper",
* "keyCategoryParentID":"2",
* "name":"Paper Products",
* "description1":"View our extensive range of paper",
* "description2":"Range includes paper only sources from sustainable environments",
* "description3":"",
* "description4":"",
* "metaTitle":"Paper Products",
* "metaKeywords":"paper products environmental",
* "metaDescription":"Paper products from sustainable environments",
* "ordering": 1,
* "keyProductIDs":["PROD-001","PROD-002"],
* "keyDownloadIDs":["DOWN-1", "DOWN-2","DOWN-3"],
* "keyLabourIDs":[]
* }
* ]
* }
* }
*/
public class ESDocumentCategory  extends ESDocument 
{
    /**
    * List of category records
    */
    public ESDRecordCategory[] dataRecords = new ESDRecordCategory[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentCategory(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the category data
    *  @param message message to accompany the result status
    *  @param categoryRecords list of category records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the category record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentCategory(int resultStatus, String message, ESDRecordCategory[] categoryRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = categoryRecords;
        this.configs = configs;
        if (categoryRecords != null)
        {
            this.totalDataRecords = categoryRecords.length;
        }
         
    }

}


