/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of stock quantity records
* An example of the Stock Quantity Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The product stock quantity data has been successfully obtained.",
* "configs":{"dataFields":"keyProductID,qtyAvailable,qtyOnHand,qtyOrdered,qtyOrdered,qtyBackordered,qtyReserved,qtyConsigned"},
* "dataTransferMode": "COMPLETE",
* "version": 1.3,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keyProductID":"123A",
* "qtyAvailable": 22
* },
* {
* "keyProductID":"1234",
* "qtyAvailable": 16,
* "qtyOnHand": 20,
* "qtyOrdered": 15,
* "qtyBackordered": 10,
* "qtyReserved": 2,
* "qtyConsigned": 12
* },
* {
* "keyProductID":"7890",
* "qtyAvailable": -23,
* "qtyOnHand": 20,
* "qtyOrdered": 15
* }
* ]
* }
* }
*/
public class ESDocumentStockQuantity  extends ESDocument 
{
    /**
    * List of stock quantity records
    */
    public ESDRecordStockQuantity[] dataRecords = new ESDRecordStockQuantity[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentStockQuantity(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the stock quantity data
    *  @param message message to accompany the result status
    *  @param stockQuantityRecords list of stock quantity records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the stock quantity record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentStockQuantity(int resultStatus, String message, ESDRecordStockQuantity[] stockQuantityRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = stockQuantityRecords;
        this.configs = configs;
        if (stockQuantityRecords != null)
        {
            this.totalDataRecords = stockQuantityRecords.length;
        }    
    }
}
