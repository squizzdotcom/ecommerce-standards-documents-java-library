/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that holds a list of supplier account records
* 
* An example of the Supplier Account Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The supplier account data has been successfully obtained.",
* "configs":{"dataFields":"keySupplierAccountID,keyPriceLevelID,supplierAccountCode,accountName,contactName,orgName,authorityNumbers,authorityNumberLabels,authorityNumberTypes,email,accountClass,paymentTypes,territory,shippingMethod,isOnHold,isOutsideBalance,isOutsideTerms,balance,limit,termsType,termsDescription,termsValue1,termsValue2"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keySupplierAccountID":"SUP1",
* "keyPriceLevelID":"PL001",
* "supplierAccountCode":"SUP001"
* },
* {
* "keySupplierAccountID":"SUP2",
* "keyPriceLevelID":"PL004",
* "supplierAccountCode":"SUPL004",
* "accountName":"Suppliers Inc.",
* "contactName":"John Smith",
* "orgName":"Suppliers Inc.",
* "authorityNumbers":["2342342334","3432424424243"],
* "authorityNumberLabels":["ABN", "ACN"],
* "authorityNumberTypes":[1,2],
* "email":"js@esdstandards.somewhere",
* "accountClass":"primary",
* "paymentTypes":"CC",
* "territory":"Melb Rural",
* "shippingMethod":"Truck",
* "isOnHold":"N",
* "isOutsideBalance":"N",
* "isOutsideTerms":"N",
* "balance":1000.00,
* "limit":0,
* "termsType":"GND",
* "termsDescription":"Pay before 14 days",
* "termsValue1":"14",
* "termsValue2":""
* },
* {
* "keySupplierAccountID":"SUP3",
* "keyPriceLevelID":"PL001",
* "supplierAccountCode":"SUP003",
* "accountName":"ESD Industries",
* "contactName":"Joey Joe Joe",
* "orgName":"ESD Industries",
* "authorityNumber":"1234567890",
* "authorityNumberLabel":"ABN",
* "email":"esd@esdstandards.somewhere",
* "accountClass":"secondary",
* "paymentTypes":"AC,CC,DD",
* "territory":"Melb Metro",
* "discount":0,
* "shippingMethod":"",
* "isOnHold":"N",
* "isOutsideBalance":"Y",
* "isOutsideTerms":"N",
* "balance":-2000.00,
* "limit":1000,
* "termsType":"DOM",
* "termsDescription":"Pay on the 15th day of the month",
* "termsValue1":"15",
* "termsValue2":""
* }
* ]
* }
* }
*/
public class ESDocumentSupplierAccount  extends ESDocument 
{
    /**
    * List of supplier account records
    */
    public ESDRecordSupplierAccount[] dataRecords = new ESDRecordSupplierAccount[]{};
    /**
    * Constructor
    *  @param resultStatus status of obtaining the supplier account record data
    *  @param message message describing the status of obtaining the data for the document
    *  @param supplierAccountRecords list of supplier account records
    *  @param configs A list of key value pairs that contain additionally information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the supplier account record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentSupplierAccount(int resultStatus, String message, ESDRecordSupplierAccount[] supplierAccountRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = supplierAccountRecords;
        this.configs = configs;
        if (supplierAccountRecords != null)
        {
            this.totalDataRecords = supplierAccountRecords.length;
        }
    }
}


