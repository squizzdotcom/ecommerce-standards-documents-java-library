/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that holds a list of general ledger account records
* 
* An example of the Customer Account Ecommerce Standards document in its JSON serialised form
* 
* @code 
* {
*     "version": 1.3,
*     "resultStatus": 1,
*     "message":"The general ledger account data has been successfully obtained.",
*     "dataTransferMode": "COMPLETE",
*     "totalDataRecords": 3,
*     "configs":{"dataFields":"keyGLAccountID,glAccountCode,name,description,accountClass,balance,keyTaxcodeID,keyParentGLAccountID,accountType"},
*     "dataRecords":
*      [
*         {
*             "keyGLAccountID":"GL1",
*         },
*         {
*             "keyGLAccountID":"111",
*             "glAccountCode":"3000",
*             "name":"Operating Revenue Account",
*             "description":"Records transactions for revenue that is generated in day-to-day trading activities",
*             "accountClass":"Revenue",
*             "balance":200123.34,
*             "keyTaxcodeID": "TAXGST",
*             "keyParentGLAccountID": "3",
*             "accountType":"OPERATING_REVENUE"
*         },
*         {
*             "keyGLAccountID":"2",
*             "glAccountCode":"1150",
*             "name":"Buildings and land assets",
*             "description":"Records transactions associated with building and land assets owned by the business",
*             "accountClass":"Asset",
*             "balance":100023.43,
*             "keyTaxcodeID": "TAXGST",
*             "keyParentGLAccountID": "1",
*             "accountType":"ASSET"
*         }
*     ]
* }
*/
public class ESDocumentGeneralLedgerAccount  extends ESDocument 
{
    /**
    * List of general ledger account records
    */
    public ESDRecordGeneralLedgerAccount[] dataRecords = new ESDRecordGeneralLedgerAccount[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentGeneralLedgerAccount(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the general ledger account data
    *  @param message message to accompany the result status
    *  @param generalLedgerAccountRecords list of general ledger account records
    *  @param configs A list of key value pairs that contain additional information about the document.
    */
    public ESDocumentGeneralLedgerAccount(int resultStatus, String message, ESDRecordGeneralLedgerAccount[] generalLedgerAccountRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = generalLedgerAccountRecords;
        this.configs = configs;
        if (generalLedgerAccountRecords != null)
        {
            this.totalDataRecords = generalLedgerAccountRecords.length;
        }    
    }
}
