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
* Ecommerce standards document that contains a list of purchase order records
* 
* An example of the Order Purchase Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The purchase order data has been successfully obtained.",
* "configs":{},
* "dataTransferMode": "COMPLETE",
* "version": 1.5,
* "totalDataRecords": 2,
* "dataRecords":
* [
* {
* "keyPurchaseOrderID":"SAL-1"
* },
* {
* "keyPurchaseOrderID":"2231321",
* "purchaseOrderCode":"PURCHASE-123",
* "purchaseOrderNumber":"123",
* "keyCustomerAccountID":"222",
* "supplierAccountCode":"CUST004",
* "supplierAccountName":"John Smith",
* "accountDiscountRate": 0,
* "accountTerritory":"",
* "sentDate": 1448132083084,
* "processedDate": 1449132083084,
* "dispatchedDate": 1450132083084,
* "receivedDate": 1451132083084,
* "modifiedDate": 1452132083084,
* "createdDate": 1447132083084,
* "keySalesRepID":"REP-2",
* "salesRepCode":"JD",
* "salesRepName": "John Doe",
* "salesRepIndividual":"Y",
* "currencyISOCode": "AUD",
* "paymentStatus": "PAID",
* "paymentMethod": "CREDITCARD",
* "paymentProprietaryCode": "",
* "paymentReceipt": "32423RES3432",
* "paymentAmount": 110.00,
* "salesOrderNumber":"SALE-123",
* "purchaserSystemID":"ACME-123",
* "purchaserSystemName":"ACME ACCOUNTING SYSTEM",
* "purchaserSystemCode":"AAS",
* "sellerSystemID":"ERP-1",
* "sellerSystemName":"ENTERPRISE RESOURCE PLANNING SYS",
* "sellerSystemCode":"ERPS",
* "invoiceNumbers": ["INV-001","INV-002"],
* "deliveryDescription":"Primary Delivery Address",
* "deliveryContact":"John Smith",
* "deliveryOrgName":"",
* "deliveryEmail":"js@someemailaddress.comm",
* "deliveryPhone":"+6144433332222",
* "deliveryFax":"+6144433332221",
* "deliveryAddress1":"Unit 5",
* "deliveryAddress2":"22 Bourkie Street",
* "deliveryAddress3":"Melbourne",
* "deliveryPostcode":"3000",
* "deliveryRegionName":"Victoria",
* "deliveryCountryName":"Australia",
* "deliveryCountryCodeISO2":"AU",
* "deliveryCountryCodeISO3":"AUS",
* "billingDescription":"Head Office",
* "billingContact":"Mary Smith",
* "billingOrgName":"Imports Organisation",
* "billingEmail":"ms@someemailaddress.comm",
* "billingPhone":"+61445242323423",
* "billingFax":"+61445242323421",
* "billingAddress1":"15",
* "billingAddress2":"Bourkie Street",
* "billingAddress3":"Melbourne",
* "billingPostcode":"3000",
* "billingRegionName":"Victoria",
* "billingCountryName":"Australia",
* "billingCountryCodeISO2":"AU",
* "billingCountryCodeISO3":"AUS",
* "email":"hs@someemailaddress.comm",
* "totalLines": 4,
* "totalProducts": 2,
* "totalLabour": 1,
* "totalDownloads": 1,
* "totalPriceExTax": 100.00,
* "totalPriceIncTax": 110.00,
* "totalTax": 10.00,
* "totalWeight": 35,
* "totalVolume": 10,
* "totalVolumeMeasureCode": "KG",
* "totalWeightMeasureCode":"M3",
* "totalSurchargeItems": 1,
* "totalSurchargeExTax": 20.00,
* "totalSurchargeIncTax": 22.00,
* "totalSurchargeTax": 2.00,
* "totalPriceUndiscountedExTax": 140.00,
* "totalPriceUndiscountedIncTax": 154.00,
* "totalPriceUndiscountedTax": 14.00,
* "instructions":"Please leave the goods at the back door",
* "freightCarrierCode": "ACME-F",
* "freightCarrierName":"Acme Freight Carrier",
* "freightSystemRefCode":"334234-23423-234-343242",
* "freightCarrierConsignCode":"34423423424",
* "freightCarrierTrackingCode":"767567-56765-5676567",
* "freightCarrierServiceCode":"ROUTING-FREIGHT",
* "freightCarrierAccountCode":"FREI-1234",
* "isDropship":"N",
* "keyLocationID":"456",
* "locationCode":"LCT-456",
* "locationName":"Warehouse",
* "isMultiLocation":"N",
* "shippingMethod":"N",
* "isProductsDelivered":"N",
* "lines":
* [
* {
* "lineType":"PRODUCT"
* },
* {
* "lineType":"PRODUCT",
* "salesOrderLineCode": "SWISH-001",
* "salesOrderOrderLineNumber": "2",
* "locationCode": "LCT-456",
* "locationName": "Warehouse",
* "keyLocationID": "456",
* "language": "EN_AU",
* "quantity": 2,
* "priceExTax": 10.00,
* "priceIncTax": 11.00,
* "priceTax": 1.00,
* "priceUndiscountedExTax": 40.00,
* "priceUndiscountedIncTax": 44.00,
* "priceUndiscountedTax": 4.00,
* "priceTotalExTax": 20.00,
* "priceTotalIncTax": 22.00,
* "priceTotalTax": 2.00,
* "priceTotalUndiscountedExTax": 80.00,
* "priceTotalUndiscountedIncTax": 88.00,
* "priceTotalUndiscountedTax": 8.00,
* "isPriceFree": "N",
* "entitySetPrice": "SYSTEM",
* "unitName": "REAM",
* "priceReferenceCode": "SALE-34",
* "priceReferenceType": "C",
* "isKitted": "N",
* "kittedProductSetPrice": "N",
* "isReserved": "N",
* "keyProductID": "1234",
* "productCode": "PROD-001",
* "productName": "Swisho Green Paper",
* "productDescription": "Swisho green coloured paper is the ultimate green paper.",
* "purchaseOrderProductCode": "SWISH-001",
* "width": 20.1,
* "height": 21,
* "depth": 29.7,
* "volume": 10,
* "weight": 10.00,
* "widthUnitMeasureCode": "M",
* "heightUnitMeasureCode": "M",
* "depthUnitMeasureCode": "M",
* "volumeUnitMeasureCode": "M3",
* "weightUnitMeasureCode": "KG",
* "keyGLAccountID": "GLA2",
* "glAccountCode": "570",
* "glAccountName": "Office Expense",
* "taxes":
* [
* {
* "keyTaxcodeID":"456",
* "taxcode":"GST",
* "taxcodeLabel":"Goods And Services Tax",
* "taxRate": 10.00,
* "language": "EN_AU",
* "quantity": 2,
* "priceTax": 1.00,
* "priceTotalTax": 2.00
* }
* ],
* "attributes":
* [
* {
* "keyProfileID":"1234123",
* "profileCode":"ORD-PROF-1",
* "profileName":"Style",
* "values":
* [
* {
* "keyAttributeID":"3423423",
* "attributeCode":"coating-paper-1",
* "attributeName":"Coating",
* "attributeValue":"Glossy"
* },
* {
* "keyAttributeID":"45345345",
* "attributeCode":"coating-paper-comment",
* "attributeName":"Comment",
* "attributeValue":"Make sure that the edges are not too sharp"
* }
* ]
* }
* ],
* "productDeliveries":
* [
* {
* "quantity":1,
* "deliveryDate": 1447132083084,
* "customerAccountInvoiceCode":"INV-001",
* "customerAccountInvoiceLineCode":"2",
* "customerAccountDeliveryCode":"DEL-1234",
* "customerAccountDeliveryLineCode":"1"
* },
* {
* "quantity":1,
* "deliveryDate": 1448132083084,
* "customerAccountInvoiceCode":"INV-002",
* "customerAccountInvoiceLineCode":"1",
* "customerAccountDeliveryCode":"DEL-1235",
* "customerAccountDeliveryLineCode":"1"
* }
* ]
* },
* {
* "lineType":"DOWNLOAD",
* "purchaseOrderLineCode": "SWISH-002",
* "purchaseOrderLineNumber": "1",
* "language": "EN_AU",
* "quantity": 1,
* "priceExTax": 20.00,
* "priceIncTax": 22.00,
* "priceTax": 2.00,
* "priceTotalExTax": 20.00,
* "priceTotalIncTax": 22.00,
* "priceTotalTax": 2.00,
* "isPriceFree": "N",
* "entitySetPrice": "SALESREP",
* "unitName": "file",
* "keyDownloadID": "DOW2",
* "downloadCode": "Download 2",
* "downloadName": "Track01 - Standards",
* "downloadDescription": "Listen to My Rock Band's first track off their new album called Standards.",
* "purchaseOrderDownloadCode": "DOWN-1234",
* "taxes":
* [
* {
* "keyTaxcodeID":"456",
* "taxcode":"GST",
* "taxcodeLabel":"Goods And Services Tax",
* "taxRate": 10.00,
* "language": "EN_AU",
* "quantity": 1,
* "priceTax": 2.00,
* "priceTotalTax": 2.00
* }
* ]
* },
* {
* "lineType":"LABOUR",
* "purchaseOrderLineCode": "SWISH-002",
* "purchaseOrderLineNumber": "1",
* "language": "EN_AU",
* "quantity": 1,
* "priceExTax": 40.00,
* "priceIncTax": 44.00,
* "priceTax": 4.00,
* "priceTotalExTax": 40.00,
* "priceTotalIncTax": 44.00,
* "priceTotalTax": 4.00,
* "isPriceFree": "N",
* "entitySetPrice": "SYSTEM",
* "unitName": "hour",
* "keylabourID": "LAB1",
* "labourCode": "DELIVERY-HELP",
* "labourName": "Paper Delivery Help",
* "labourDescription": "Service to help deliver and place paper products internally at the delivery address",
* "purchaseOrderLabourCode": "LAB-1234",
* "taxes":
* [
* {
* "keyTaxcodeID":"456",
* "taxcode":"GST",
* "taxcodeLabel":"Goods And Services Tax",
* "taxRate": 10.00,
* "language": "EN_AU",
* "quantity": 1,
* "priceTax": 4.00,
* "priceTotalTax": 4.00
* }
* ]
* }
* ],
* "surcharges":
* [
* {
* "surchargeCode":"WEB_CC_SURCHARGE"
* },
* {
* "surchargeCode":"WEB_FREIGHT",
* "name":"Freight Surcharge",
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
* "quantity": 1,
* "priceTax": 2.00,
* "priceTotalTax": 2.00
* }
* ]
* }
* ]
* }
* ],
* "payments": 
* [
* {
*	"paymentMethod": "PROPRIETARY",
*	"paymentAmount": 20.00,
*	"paymentReceipt": "PP-12321-543221",
*	"paymentProprietaryCode": "PAYPAL",
*	"keyPaymentTypeID": "943",
*  	"paidDate": 1451739600000
* },
* {
*	"paymentMethod": "PROPRIETARY",
*	"paymentAmount": 10.00,
*	"paymentReceipt": "ZP-12321",
*	"paymentProprietaryCode": "ZIPPAY",
*	"keyPaymentTypeID": "432",
*	"paidDate": 1451739600000
* }
* ]
* }
* }
*/
public class ESDocumentOrderPurchase  extends ESDocument 
{
    /**
    * List of purchase order records
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordOrderPurchase[] dataRecords = new ESDRecordOrderPurchase[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentOrderPurchase(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the purchase order data
    *  @param message message to accompany the result status
    *  @param purchaseOrders list of purchase order records
    *  @param configs A list of key value pairs that contain additional information about the document.
    */
    public ESDocumentOrderPurchase(int resultStatus, String message, ESDRecordOrderPurchase[] purchaseOrders, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = purchaseOrders;
        this.configs = configs;
        if (purchaseOrders != null)
        {
            this.totalDataRecords = purchaseOrders.length;
        }    
    }
}
