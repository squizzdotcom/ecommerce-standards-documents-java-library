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
* Ecommerce standards document that contains a list of product records
* 
* An example of the Product Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The product data has been successfully obtained.",
* "configs":{"dataFields":"keyProductID,productCode,keyTaxcodeID,productSearchCode,barcode,barcodeInner,brand,name,description1,description2,description3,description4,productClass,keySellUnitID,unit,weight,width,height,depth,averageCost,warehouse,supplier,deliveryTimeNoStock,deliveryTimeInStock,stockQuantity,stockNoneQuantity,stockLowQuantity,stockLowQuantity,isPriceTaxInclusive,isKitted,kitProductsSetPrice"},
* "dataTransferMode": "COMPLETE",
* "version": 1.5,
* "totalDataRecords": 2,
* "dataRecords":
* [
* {
* "keyProductID":"123A",
* "productCode":"PROD-123",
* "keyTaxcodeID":"FREE"
* },
* {
* "keyProductID":"1234",
* "productCode":"PROD-001",
* "keyTaxcodeID":"GST",
* "productSearchCode":"Green-Recycled-Paper-Swisho",
* "barcode":"03423404230",
* "barcodeInner":"234234",
* "brand":"Swisho Paper",
* "name":"Swisho Green Paper",
* "description1":"Swisho green coloured paper is the ultimate green paper.",
* "description2":"Paper built strong and tough by Swisho",
* "description3":"Recommended to be used with dark inks.",
* "description4":"",
* "productClass":"paper",
* "unit":"REAM",
* "weight": 20.1,
* "width": 21,
* "height": 29.7,
* "depth": 10,
* "widthUnitMeasureCode": "CM",
* "heightUnitMeasureCode": "CM",
* "depthUnitMeasureCode": "CM",
* "weightUnitMeasureCode": "KG",
* "averageCost": 10.00,
* "warehouse":"Swisho Warehouse",
* "supplier":"Swisho",
* "deliveryTimeNoStock": 112112,
* "deliveryTimeInStock": 1212,
* "stockQuantity": 200,
* "stockNoneQuantity": 0,
* "stockLowQuantity": 10,
* "isPriceTaxInclusive": "N",
* "isKitted":"N",
* "kitProductsSetPrice":"N",
* "keySellUnitID": 2,
* "sellUnits":[
* {
* "keySellUnitID":"2",
* "minOrderQuantity": 1,
* "incrementOrderQuantity": 1,
* "weight": 1.2,
* "width": 6.1,
* "height": 4.4,
* "depth": 2.9,
* "packageWeight": 2.3,
* "packageWidth": 8.0,
* "packageHeight": 9.2,
* "packageDepth": 10.1,
* "widthUnitMeasureCode":"CM",
* "heightUnitMeasureCode":"CM",
* "depthUnitMeasureCode":"CM",
* "weightUnitMeasureCode":"KG"
* },
* {
* "keySellUnitID":"3",
* "keySellUnitParentID":"2",
* "baseQuantity": 6,
* "minOrderQuantity": 2,
* "incrementOrderQuantity": 2,
* "weight": 7.3,
* "width": 6.1,
* "height": 4.4,
* "depth": 14,
* "packageWeight": 14.7,
* "packageWidth": 8.0,
* "packageHeight": 9.2,
* "packageDepth": 70.2,
* "widthUnitMeasureCode":"CM",
* "heightUnitMeasureCode":"CM",
* "depthUnitMeasureCode":"CM",
* "weightUnitMeasureCode":"KG"
* },
* {
* "keySellUnitID":"4",
* "keySellUnitParentID":"3",
* "baseQuantity": 24,
* "parentQuantity": 4
* }
* ]
* }
* ]
* }
* }
*/
public class ESDocumentProduct  extends ESDocument 
{
    /**
    * List of product records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordProduct[] dataRecords = new ESDRecordProduct[]{};
    
    /**
    * Constructor
    */
    public ESDocumentProduct(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the product data
    *  @param message message to accompany the result status
    *  @param productRecords list of product records
    */
    public ESDocumentProduct(int resultStatus, String message, ESDRecordProduct[] productRecords){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = productRecords;
        configs = new HashMap<String, String>();
    }

    /**
    * Constructor
    *  @param resultStatus status of obtaining the product data
    *  @param message message to accompany the result status
    *  @param productRecords list of product records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the product record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentProduct(int resultStatus, String message, ESDRecordProduct[] productRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = productRecords;
        this.configs = configs;
        if (productRecords != null)
        {
            this.totalDataRecords = productRecords.length;
        }      
    }
}
