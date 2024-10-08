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
* Ecommerce standards document that contains a list of surcharge records
* An example of the Surcharge Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The surcharge data has been successfully obtained.",
* "configs":{"dataFields":"keySurchargeID,surchargeCode,surchargeLabel,description,surchargeType"},
* "dataTransferMode": "COMPLETE",
* "version": 1.5,
* "totalDataRecords": 4,
* "dataRecords":
* [
* {
* "keySurchargeID":"123"
* },
* {
* "keySurchargeID":"456",
* "surchargeCode": "WEB_FREIGHT",
* "surchargeLabel":"Web Order Freight",
* "description": "Costs to deliver orders created through the website.",
* "surchargeType": "FREIGHT"
* },
* {
* "keySurchargeID":"765",
* "surchargeCode": "WEB_CC_SURCHARGE",
* "surchargeLabel": "Web Credit Card Surcharge",
* "description": "Transaction cost for payment made by credit card.",
* "surchargeType": "CREDITCARD"
* },
* {
* "keySurchargeID":"6765",
* "surchargeCode": "WEB_MIN_ORDER",
* "surchargeLabel": "Web Minimum Order Surcharge",
* "description": "Cost to handle orders when an order's total price is under the allowed minimum.",
* "surchargeType": "MINORDER"
* }
* ]
* }
* }
*/
public class ESDocumentSurcharge  extends ESDocument 
{
    /**
    * List of surcharge records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordSurcharge[] dataRecords = new ESDRecordSurcharge[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentSurcharge(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the surcharge data
    *  @param message message to accompany the result status
    *  @param surchargeRecords list of surcharge records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the surcharge record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentSurcharge(int resultStatus, String message, ESDRecordSurcharge[] surchargeRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = surchargeRecords;
        this.configs = configs;
        if (surchargeRecords != null)
        {
            this.totalDataRecords = surchargeRecords.length;
        }
    }
}
