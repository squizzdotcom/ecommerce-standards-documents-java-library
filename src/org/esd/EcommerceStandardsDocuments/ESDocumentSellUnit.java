/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of sell unit records
* 
* An example of the Sell Unit Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The sell unit data has been successfully obtained.",
* "configs":{"dataFields":"keySellUnitID,sellUnitCode,sellUnitLabel,isBaseUnit,baseQuantity,parentQuantity,keySellUnitParentID"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keySellUnitID":"1"
* },
* {
* "keySellUnitID":"2",
* "sellUnitCode":"EA",
* "sellUnitLabel":"EACH",
* "isBaseUnit":"Y"
* },
* {
* "keySellUnitID":"3",
* "sellUnitCode":"PK",
* "sellUnitLabel":"Pack",
* "isBaseUnit":"N",
* "keySellUnitParentID":"2"
* },
* {
* "keySellUnitID":"4",
* "sellUnitCode":"CT",
* "sellUnitLabel":"Carton",
* "isBaseUnit":"N",
* "keySellUnitParentID":"3"
* },
* {
* "keySellUnitID":"5",
* "sellUnitCode":"CN",
* "sellUnitLabel":"Container",
* "isBaseUnit":"N",
* "keySellUnitParentID":"4"
* },
* {
* "keySellUnitID":"6",
* "sellUnitCode":"SHIP",
* "sellUnitLabel":"Ship Load",
* "isBaseUnit":"N",
* "keySellUnitParentID":"5"
* },
* {
* "keySellUnitID":"7",
* "sellUnitCode":"TRAIN",
* "sellUnitLabel":"Train Load",
* "isBaseUnit":"N",
* "keySellUnitParentID":"5"
* },
* {
* "keySellUnitID":"8",
* "sellUnitCode":"HOUR",
* "sellUnitLabel":"Hour",
* "isBaseUnit":"Y"
* },
* {
* "keySellUnitID":"9",
* "sellUnitCode":"LABOUR PACK",
* "sellUnitLabel":"Pack Of Labour Hours",
* "keySellUnitParentID":"8",
* "isBaseUnit":"N"
* }
* ]
* }
* }
*/
public class ESDocumentSellUnit  extends ESDocument 
{
    /**
    * List of sell unit records
    */
    public ESDRecordSellUnit[] dataRecords = new ESDRecordSellUnit[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentSellUnit(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the product data
    *  @param message message to accompany the result status
    *  @param sellUnitRecords list of sell unit records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the sell unit record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentSellUnit(int resultStatus, String message, ESDRecordSellUnit[] sellUnitRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = sellUnitRecords;
        this.configs = configs;
        if (sellUnitRecords != null)
        {
            this.totalDataRecords = sellUnitRecords.length;
        }    
    }
}