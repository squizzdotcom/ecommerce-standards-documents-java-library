/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of image file records associated with products, downloads, or labour
* 
* An example of the Images Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The product image data has been successfully obtained.",
* "configs":{"dataFields":"keyProductImageID,keyProductID,imageFullFilePath,imageFileName,imageFileExtension,title,description"},
* "dataTransferMode": "COMPLETE",
* "version": 1.3,
* "totalDataRecords": 2,
* "dataRecords":
* [
* {
* "keyProductImageID":"11",
* "keyProductID":"PROD-123"
* },
* {
* "keyProductImageID":"22",
* "keyProductID":"PROD-456",
* "imageFullFilePath":"C://location/to/the/product/images/Image-PROD-456.jpg",
* "imageFileName":"Image-PROD-456",
* "imageFileExtension":"jpg",
* "title":"Black Lounge Chair Front View",
* "description":"View from the front the quality styling of this modern lounge chair."
* }
* ]
* }
* }
*/
public class ESDocumentImage  extends ESDocument 
{
    /**
    * List of image records
    */
    public ESDRecordImage[] dataRecords = new ESDRecordImage[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentImage(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the image data
    *  @param message message to accompany the result status
    *  @param imageRecords list of image records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the image record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentImage(int resultStatus, String message, ESDRecordImage[] imageRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = imageRecords;
        this.configs = configs;
        if (imageRecords != null)
        {
            this.totalDataRecords = imageRecords.length;
        }    
    }
}
