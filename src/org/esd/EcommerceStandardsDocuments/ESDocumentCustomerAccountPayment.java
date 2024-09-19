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
* Ecommerce standards document that holds a list of customer account payment records
* 
* An example of the Customer Account Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The customer account payment data has been successfully obtained.",
* "configs":{"dataFields":"keyCustomerAccountPaymentID,paymentID,paymentCode,referenceNumber,keyCustomerAccountID,customerAccountCode,eCommerceUserID,eCommerceSystemID,paymentMethod,eCommerceUserName,paymentAmount,paymentReceipt,paymentDate,creationDate,currencyCode"},
* "dataTransferMode": "COMPLETE",
* "version": 1.5,
* "totalDataRecords": 2,
* "dataRecords":
* [
* {
* "keyCustomerAccountPaymentID":"PAY1"
* },
* {
* "keyCustomerAccountPaymentID":"43",
* "paymentID":"678",
* "paymentCode":"PAYMENT-678",
* "referenceNumber":"624324235",
* "keyCustomerAccountID":"222",
* "customerAccountCode":"CUST004",
* "eCommerceUserID":"243",
* "eCommerceSystemID":"SQUIZZ.PLATFORM",
* "paymentMethod":"CREDITCARD",
* "eCommerceUserName":"John Smith",
* "paymentAmount": 60.00,
* "paymentReceipt":"567586765",
* "paymentDate": 1449132083084,
* "creationDate": 1449132083084,
* "currencyCode":"AUD",
* "records":
* [
* {
* "keyCustomerAccountPaymentRecordID":"5343",
* "keyRecordID":"112",
* "recordID":"INVOICE-112",
* "amount": 60.00,
* "recordType":"INVOICE"
* }
* ],
* "surcharges":
* [
* {
* "surchargeCode":"WEB_INVOICE_FEE"
* },
* {
* "keySurchargeID":"765",
* "surchargeCode":"WEB_CC_SURCHARGE",
* "surchargeLabel":"Web Credit Card Surcharge",
* "surchargeDescription":"Credit card processing fee",
* "priceExTax": 20.00,
* "priceIncTax": 22.00,
* "priceTax": 2.00,
* "taxes":
* [
* {
* "keyTaxcodeID":"456",
* "taxcode":"GST",
* "taxcodeLabel":"Goods And Services Tax",
* "taxRate": 10.00,
* "language": "EN_AU",
* "priceTax": 2.00
* }
* ]
* }
* }
* ]
* }
* }
*/
public class ESDocumentCustomerAccountPayment  extends ESDocument 
{
    /**
    * List of customer account records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordCustomerAccountPayment[] dataRecords = new ESDRecordCustomerAccountPayment[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentCustomerAccountPayment(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the customer account payment record data
    *  @param message message to accompany the result status
    *  @param paymentRecords list of payment records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the payment record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentCustomerAccountPayment(int resultStatus, String message, ESDRecordCustomerAccountPayment[] paymentRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = paymentRecords;
        this.configs = configs;
        if (paymentRecords != null)
        {
            this.totalDataRecords = paymentRecords.length;
        }    
    }
}
