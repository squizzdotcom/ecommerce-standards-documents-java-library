/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of pricing records applicable to a customer account for a number of products
*/
public class ESDocumentCustomerAccountEnquiryProductPrice  extends ESDocument 
{
    /**
    * List of account enquiry pricing records.
    */
    public ESDRecordCustomerAccountEnquiryProductPrice[] dataRecords = new ESDRecordCustomerAccountEnquiryProductPrice[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentCustomerAccountEnquiryProductPrice(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the customer account enquiry product price record data
    *  @param message message to accompany the result status
    *  @param accountProductPrices list of customer account product pricing records
    *  @param configs A list of key value pairs that contain additional information about the document.
    */
    public ESDocumentCustomerAccountEnquiryProductPrice(int resultStatus, String message, ESDRecordCustomerAccountEnquiryProductPrice[] accountProductPrices, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = accountProductPrices;
        this.configs = configs;
        if (accountProductPrices != null)
        {
            this.totalDataRecords = accountProductPrices.length;
        }
         
    }

}


