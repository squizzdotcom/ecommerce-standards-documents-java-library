/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of attachment file records associated with products, downloads or labour
* 
* An example of the Attachment Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The product attachment data has been successfully obtained.",
* "configs":{"dataFields":"keyProductAttachmentID,keyProductID,fileName,fileExtension,fullFilePath"},
* "dataTransferMode": "COMPLETE",
* "version": 1.3,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keyProductAttachmentID":"1",
* "keyProductID":"1234",
* "fileName":"product-image",
* "fileExtension":"jpg",
* "fullFilePath":"C://product/images/product-image.jpg"
* },
* {
* "keyProductAttachmentID":"2",
* "keyProductID":"1234",
* "fileName":"product-image2",
* "fileExtension":"png",
* "fullFilePath":"C://product/images/product-image2.png"
* },
* {
* "keyProductAttachmentID":"33A",
* "keyProductID":"123A",
* "fileName":"12345",
* "fileExtension":"gif",
* "fullFilePath":"D://products2/images/12345.gif"
* }
* ]
* }
* }
*/
public class ESDocumentAttachment  extends ESDocument 
{
    /**
    * List of attachment records
    */
    public ESDRecordAttachment[] dataRecords = new ESDRecordAttachment[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentAttachment(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the attachment data
    *  @param message message to accompany the result status
    *  @param attachmentRecords list of attachment records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the attachment record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentAttachment(int resultStatus, String message, ESDRecordAttachment[] attachmentRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = attachmentRecords;
        this.configs = configs;
        if (attachmentRecords != null)
        {
            this.totalDataRecords = attachmentRecords.length;
        }    
    }
}
