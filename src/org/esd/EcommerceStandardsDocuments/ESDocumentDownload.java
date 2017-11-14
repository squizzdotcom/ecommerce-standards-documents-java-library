/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of download records.
* An example of the Download Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The download data has been successfully obtained.",
* "configs":{"dataFields":"keyDownloadID,downloadCode,keyTaxcodeID,downloadSearchCode,downloadLocation,downloadKey,downloadSize,brand,name,description1,description2,description3,description4,downloadClass,averageCost,supplier,deliveryTimeNoStock,deliveryTimeInStock,downloadQuantity,downloadNoneQuantity,downloadLowQuantity,isPriceTaxInclusive,isKitted,kitSetPrice"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 2,
* "dataRecords":
* [
* {
* "keyDownloadID":"DWN1",
* "downloadCode":"Download 123",
* "keyTaxcodeID":"FREE"
* },
* {
* "keyDownloadID":"DOW2",
* "downloadCode":"Download 2",
* "keyTaxcodeID":"GST",
* "downloadSearchCode":"Music-My-Rock-Band-Standards-Track",
* "downloadLocation":"http://www.somelocation.com/MyRockBand/Track01.mp3",
* "downloadKey":"234234wASFD#EF#2342342S23432234324332ASAFSD",
* "downloadSize": 123451235123,
* "brand":"My Rock Band",
* "name":"Track01 - Standards",
* "description1":"Listen to My Rock Band's first track off their new album called Standards.",
* "description2":"",
* "description3":"",
* "description4":"",
* "downloadClass":"ABC",
* "averageCost": 10.00,
* "supplier":"ESD Music Distributor",
* "deliveryTimeNoStock": 112112,
* "deliveryTimeInStock": 1212,
* "downloadQuantity": 200,
* "downloadNoneQuantity": 0,
* "downloadLowQuantity": 10,
* "isPriceTaxInclusive": "N",
* "isKitted":"N",
* "kitSetPrice":"N"
* }
* ]
* }
* }
*/
public class ESDocumentDownload  extends ESDocument 
{
    /**
    * List of download records
    */
    public ESDRecordDownload[] dataRecords = new ESDRecordDownload[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentDownload(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the download data
    *  @param message message to accompany the result status
    *  @param downloadRecords list of download records
    */
    public ESDocumentDownload(int resultStatus, String message, ESDRecordDownload[] downloadRecords){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = downloadRecords;
        configs = new HashMap<String, String>();
    }

    /**
    * Constructor
    *  @param resultStatus status of obtaining the download data
    *  @param message message to accompany the result status
    *  @param downloadRecords list of download records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the download record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentDownload(int resultStatus, String message, ESDRecordDownload[] downloadRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = downloadRecords;
        this.configs = configs;
        if (downloadRecords != null)
        {
            this.totalDataRecords = downloadRecords.length;
        }        
    }
}