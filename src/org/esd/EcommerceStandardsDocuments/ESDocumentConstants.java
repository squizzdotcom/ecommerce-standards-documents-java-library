/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;


/**
* Contains a list of variable constants that can be used in Ecommerce Standards Documents and records
*/
public class ESDocumentConstants   
{
    /**
    * result status denoting that data was successfully obtained
    */
    public static final int RESULT_SUCCESS = 1;
    /**
    * result status denoting that an error occurred when trying to obtain/process data
    */
    public static final int RESULT_ERROR = 2;
    /**
    * result status denoting that an unknown error occurred when trying to obtain/process data
    */
    public static final int RESULT_ERROR_UNKNOWN = 3;
    /**
    * result status denoting that an error occurred when a connection could not be made to a data source to obtain/process data
    */
    public static final int RESULT_ERROR_DATA_SOURCE_CONNECTION_MISSING = 4;
    /**
    * result status denoting that an error occurred when a connection was unexpectedly lost from a data source when trying to obtain/process data
    */
    public static final int RESULT_ERROR_DATA_SOURCE_CONNECTION_LOST = 5;
    /**
    * result status denoting that an error occurred when trying to access a data source because of incorrect credentials given.
    */
    public static final int RESULT_ERROR_DATA_SOURCE_INVALID_CREDENTIALS = 6;
    /**
    * result status denoting that an error occurred when trying to process data from a data source to obtain/process data.
    */
    public static final int RESULT_ERROR_DATA_SOURCE_PROCESSING = 7;
    /**
    * result status denoting that an error occurred when a data source was given or sent invalid data.
    */
    public static final int RESULT_ERROR_DATA_SOURCE_INVALID_DATA = 8;
    /**
    * result status denoting that an error occurred when trying to access a data source because it denied access.
    */
    public static final int RESULT_ERROR_DATA_SOURCE_PERMISSION_DENIED = 13;
    /**
    * result status denoting that an error occurred when requesting access a data source too many times.
    */
    public static final int RESULT_ERROR_DATA_SOURCE_MAXIMUM_REQUESTS_EXCEEDED = 14;
    /**
    * result status denoting that an error occurred because incorrect credials were given to a connecting system to obtain/process data.
    */
    public static final int RESULT_ERROR_CONNECTOR_INVALID_CREDENTIALS = 9;
    /**
    * result status denoting that an error occurred because a connecting system could not process data.
    */
    public static final int RESULT_ERROR_CONNECTOR_PROCESSING = 10;
    /**
    * result status denoting that an error occurred because incorrect data was sent to or received from a connecting system.
    */
    public static final int RESULT_ERROR_CONNECTOR_INVALID_DATA = 11;
    /**
    * result status denoting that an error occurred because a connecting system was incorrectly configured to obtain/process data.
    */
    public static final int RESULT_ERROR_CONNECTOR_INCORRECT_CONFIGURATION = 12;
    /**
    * Result response status denoting the type of data returned is in the JSON format (JavaScript Object Notation)
    */
    public static final String RESULT_RESPONSE_TYPE_JSON = "JSON";
    /**
    * Result response status denoting the type of data returned is in a raw binary format.
    */
    public static final String RESULT_RESPONSE_TYPE_RAW = "RAW";
    /**
    * Data mode of the Ecommerce Standards Document is incremental, meaning only changes to data are contained within the document.
    */
    public static final String ESD_DATA_MODE_INCREMENT = "INCREMENT";
    /**
    * Data mode of the Ecommerce Standards Document is incremental if possible, meaning only changes to data need be contained within the document, but if it is not possible then all the data can be contained in the document.
    */
    public static final String ESD_DATA_MODE_INCREMENT_IF_AVAILABLE = "INCREMENT_AVAILABLE";
    /**
    * Data mode of the Ecommerce Standards Document is complete, and all the data available is contained within the document.
    */
    public static final String ESD_DATA_MODE_COMPLETE = "COMPLETE";
    /**
    * Yes value that can be embedded in an ESD document
    */
    public static final String ESD_VALUE_YES = "Y";
    /**
    * No value that can be embedded in an ESD document
    */
    public static final String ESD_VALUE_NO = "N";
    /**
    * Denotes that the record in the Ecommerce Standard Document has no record operation associated to it.
    */
    public static final int ESD_RECORD_OPERATION_NA = 0;
    /**
    * Denotes that the record in the Ecommerce Standard Document needs to be inserted into the requesting data source because it is a new record.
    */
    public static final int ESD_RECORD_OPERATION_INSERT = 1;
    /**
    * Denotes that the record in the Ecommerce Standard Document needs to be updated in the requesting data source because the record has changed.
    */
    public static final int ESD_RECORD_OPERATION_UPDATE = 2;
    /**
    * Denotes that the record in the Ecommerce Standard Document needs to be deleted from the requesting data source because the record no longer exists.
    */
    public static final int ESD_RECORD_OPERATION_DELETE = 3;
    /**
    * Denotes that the record in the Ecommerce Standard Document needs can be ignored in the requesting data source from being modified because the record's data has not changed.
    */
    public static final int ESD_RECORD_OPERATION_IGNORE = 4;
    /**
    * Contains the version that the Ecommerce Standards Documents library is currently at.
    */
    public static final double ESD_DOCUMENT_VERSION = 1.1;
    /**
    * Denotes that the location is a warehouse
    */
    public static final String LOCATION_TYPE_WAREHOUSE = "WAREHOUSE";
    /**
    * Denotes that the location is a store
    */
    public static final String LOCATION_TYPE_STORE = "STORE";
    /**
    * Denotes that the location is a site
    */
    public static final String LOCATION_TYPE_SITE = "SITE";
    /**
    * Denotes that the location is an office
    */
    public static final String LOCATION_TYPE_OFFICE = "OFFICE";
    /**
    * Language - English Australia
    */
    public static final String LANG_EN_AU = "EN_AU";
    /**
    * Language - English USA
    */
    public static final String LANG_EN_US = "EN_US";
    /**
    * Authority Number - Australian Business Number
    */
    public static final int AUTHORITY_NUM_AUS_ABN = 1;
    /**
    * Authority Number - Australian Company Number
    */
    public static final int AUTHORITY_NUM_AUS_ACN = 2;
    /**
    * Authority Number - Great Britain Company Registration Number
    */
    public static final int AUTHORITY_NUM_GBR_CRN = 3;
    /**
    * Authority Number - New Zealand Business Number
    */
    public static final int AUTHORITY_NUM_NZL_NZBN = 4;
    /**
    * Authority Number - United States Employer Identification Number
    */
    public static final int AUTHORITY_NUM_USA_EIN = 5;
    /**
    * Order Line Type - Text
    */
    public static final String ORDER_LINE_TYPE_TEXT = "TEXT";
    /**
    * Order Line Type - Product
    */
    public static final String ORDER_LINE_TYPE_PRODUCT = "PRODUCT";
    /**
    * Order Line Type - Download
    */
    public static final String ORDER_LINE_TYPE_DOWNLOAD = "DOWNLOAD";
    /**
    * Order Line Type - Labour
    */
    public static final String ORDER_LINE_TYPE_LABOUR = "LABOUR";
    /**
    * Entity Type - Org, denotes an organisation
    */
    public static final String ENTITY_TYPE_ORG = "ORG";
    /**
    * Entity Type - Personal, denotes a human individual
    */
    public static final String ENTITY_TYPE_PERSON = "PERSON";
    /**
    * Entity Set Price - system automatically calculated the price
    */
    public static final String ENTITY_SET_PRICE_SYSTEM = "SYSTEM";
    /**
    * Entity Set Price - price set by a sales representative
    */
    public static final String ENTITY_SET_PRICE_SALESREP = "SALESREP";
    /**
    * Entity Set Price - price set by an employee
    */
    public static final String ENTITY_SET_PRICE_EMPLOYEE = "EMPLOYEE";
    /**
    * Surcharge Type - Freight
    */
    public static final String SURCHARGE_TYPE_FREIGHT = "FREIGHT";
    /**
    * Surcharge Type - Credit Card
    */
    public static final String SURCHARGE_TYPE_CREDIT_CARD = "CREDITCARD";
    /**
    * Surcharge Type - Minimum Order Total
    */
    public static final String SURCHARGE_TYPE_MIN_ORDER = "MINORDER";
    /**
    * Surcharge Type - Other
    */
    public static final String SURCHARGE_TYPE_OTHER = "OTHER";
    /**
    * Payment method - UNPAID - No payment was received as yet
    */
    public static final String PAYMENT_METHOD_UNPAID = "UNPAID";
    /**
    * Payment method - CREDIT - A payment was made with a credit card
    */
    public static final String PAYMENT_METHOD_CREDIT = "CREDITCARD";
    /**
    * Payment method - COD - Payment will be made with cash when the goods are delivered to the delivery location
    */
    public static final String PAYMENT_METHOD_CASHONDELIVERY = "COD";
    /**
    * Payment method - DIRECTDEPOSIT - Payment has been made with a direct bank transfer
    */
    public static final String PAYMENT_METHOD_DIRECTDEPOSIT = "DIRECTDEPOSIT";
    /**
    * Payment method - QUOTE - No payment was made as a quote was only required
    */
    public static final String PAYMENT_METHOD_QUOTE = "QUOTE";
    /**
    * Payment method - NONE - No payment was made or needed
    */
    public static final String PAYMENT_METHOD_NONE = "NONE";
    /**
    * Payment method - PROPRIETARY - A payment was made using a proprietary payment system. PayPal could be one example of this.
    */
    public static final String PAYMENT_METHOD_PROPRIETARY = "PROPRIETARY";
    /**
    * Payment method - ACCOUNT - A payment will be assigned to a customer account and paid based on the agreed payment terms
    */
    public static final String PAYMENT_METHOD_ACCOUNT = "ACCOUNT";
    /**
    * Record Type - Invoice
    */
    public static final String RECORD_TYPE_INVOICE = "INVOICE";
    /**
    * Record Type - Transaction
    */
    public static final String RECORD_TYPE_TRANSACTION = "TRANSACTION";
    /**
    * Record Type - Sales Order
    */
    public static final String RECORD_TYPE_ORDER_SALE = "ORDER_SALE";
    /**
    * Record Type - Purchase Order
    */
    public static final String RECORD_TYPE_ORDER_PURCHASE = "ORDER_PURCHASE";
    /**
    * Record Type - Back Order
    */
    public static final String RECORD_TYPE_BACKORDER = "BACKORDER";
    /**
    * Record Type - Credit
    */
    public static final String RECORD_TYPE_CREDIT = "CREDIT";
    /**
    * Record Type - Payment
    */
    public static final String RECORD_TYPE_PAYMENT = "PAYMENT";
    /**
    * Record Line Type - Item
    */
    public static final String RECORD_LINE_TYPE_ITEM = "ITEM";
    /**
    * Record Line Type - Text
    */
    public static final String RECORD_LINE_TYPE_TEXT = "TEXT";
    /**
    * Record Line Type - Invoice
    */
    public static final String RECORD_LINE_TYPE_INVOICE = "INVOICE";
    /**
    * Record Line Type - Sales Order
    */
    public static final String RECORD_LINE_TYPE_ORDER_SALE = "ORDER_SALE";
    /**
    * Record Line Type - Sales Order
    */
    public static final String RECORD_LINE_TYPE_ORDER_PURCHASE = "ORDER_PURCHASE";
    /**
     * Price reference Type - Contract
     */
    public static final String PRICE_REFERENCE_TYPE_CONTRACT = "C";
    /**
    * Price reference Type - Contract With Forced Pricing
    */
    public static final String PRICE_REFERENCE_TYPE_CONTRACT_FORCED = "CF";
    /**
    * Price reference Type - Promotion
    */
    public static final String PRICE_REFERENCE_TYPE_PROMOTION = "P";
}


