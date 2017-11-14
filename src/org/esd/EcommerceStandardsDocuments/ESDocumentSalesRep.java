/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of sales representative records
* 
* An example of the Sales Representative Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The sales representative data has been successfully obtained.",
* "configs":{"dataFields":"keySalesRepID,name,salesRepCode,contact,isIndividual"},
* "dataTransferMode": "COMPLETE",
* "version": 1.1,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keySalesRepID":"REP-1"
* },
* {
* "keySalesRepID":"REP-2",
* "salesRepCode": "JD",
* "contact": "John Doe",
* "isIndividual": "Y"
* },
* {
* "keySalesRepID":"4533",
* "salesRepCode": "AI",
* "name": "Acme Industries",
* "contact": "Kevin Peterson",
* "isIndividual": "N"
* }
* ]
* }
* }
*/
public class ESDocumentSalesRep  extends ESDocument 
{
    /**
    * List of sales representative records
    */
    public ESDRecordSalesRep[] dataRecords = new ESDRecordSalesRep[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentSalesRep(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the sales representative data
    *  @param message message to accompany the result status
    *  @param salesRepresentativeRecords list of sales representative records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the sales representative record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentSalesRep(int resultStatus, String message, ESDRecordSalesRep[] salesRepresentativeRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = salesRepresentativeRecords;
        this.configs = configs;
        if (salesRepresentativeRecords != null)
        {
            this.totalDataRecords = salesRepresentativeRecords.length;
        }    
    }
}