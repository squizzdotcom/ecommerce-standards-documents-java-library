/**
* Copyright (C) Squizz PTY LTD
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
    public static final double ESD_DOCUMENT_VERSION = 1.4;
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
    * Denotes that the location is the head office of an organisation
    */
    public static final String LOCATION_TYPE_HEAD_OFFICE = "HEAD_OFFICE";
	/**
    * Denotes that the location is the belongs to or is associated with another third party entity 
    */
    public static final String LOCATION_TYPE_THIRD_PARTY = "THIRD_PARTY";
	/**
    * Denotes that the location is an unspecified kind of location
    */
    public static final String LOCATION_TYPE_OTHER = "OTHER";
    /**
    * Language - English Australia
    */
    public static final String LANG_EN_AU = "EN_AU";
    /**
    * Language - English USA
    */
    public static final String LANG_EN_US = "EN_US";
	/**
    * Language - French France
    */
    public static final String LANG_FR_FR = "FR_FR";
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
    * Invoice Line Type - Text - indicates that textual details and comments have been set against an invoice line
	*/
	public static final String INVOICE_LINE_TYPE_TEXT = "TEXT";
	/**
    * Invoice Line Type - Product - indicates that a physical or non-physical product has been sold or purchased within an invoice line.
	*/
	public static final String INVOICE_LINE_TYPE_PRODUCT = "PRODUCT";
	/**
    * Invoice Line Type - Download - indicates that a digital file or asset has been sold or purchased within an invoice line.
	*/
	public static final String INVOICE_LINE_TYPE_DOWNLOAD = "DOWNLOAD";
	/**
    * Invoice Line Type - Labour - indicates that labour or work effort has been sold or purchased within in an invoice line.
	*/
	public static final String INVOICE_LINE_TYPE_LABOUR = "LABOUR";
	/**
    * Invoice Line Type - Miscellaneous - indicates that a non-specified sale or purchase has been made within an invoice line. Use this if no product/download/labour has been sold or purchased.
	*/
	public static final String INVOICE_LINE_TYPE_MISC = "MISC";
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
    * Payment method - MULTIPLE - Payment has been made using multiple payment methods
    */
    public static final String PAYMENT_METHOD_MULTIPLE = "MULTIPLE";
    /**
    * Payment method - PROPRIETARY - A payment was made using a proprietary payment system. PayPal could be one example of this.
    */
    public static final String PAYMENT_METHOD_PROPRIETARY = "PROPRIETARY";
    /**
    * Payment method - ACCOUNT - A payment will be assigned to a customer account and paid based on the agreed payment terms
    */
    public static final String PAYMENT_METHOD_ACCOUNT = "ACCOUNT";
	
    /**
    * UNPAID - The invoice has not been paid for
    */
    public static final String PAYMENT_STATUS_UNPAID = "UNPAID";
    /**
    * PENDING - A payment is currently in the process of being paid for, or is waiting on a process to complete
    */
    public static final String PAYMENT_STATUS_PENDING = "PENDING";
    /**
    * PAID - The invoice has been paid
    */
    public static final String PAYMENT_STATUS_PAID = "PAID";
    /**
    * DECLINED - A payment failed when trying to be paid
    */
    public static final String PAYMENT_STATUS_DECLINED = "DECLINED";
    /**
    * NONREQUIRED - No payment is required to pay for the invoice
    */
    public static final String PAYMENT_STATUS_NONREQUIRED = "NONREQUIRED";
	
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
    * Record Type - Quote
    */
    public static final String RECORD_TYPE_QUOTE = "QUOTE";
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
	
	/**
    * Delivery Status - Awaiting Packaging - The ordered goods are awaiting to be packaged up for delivery
    */
	public static final String DELIVERY_STATUS_AWAITING_PACKAGING = "AWAITING_PACKAGING";
	/**
    * Delivery Status - Packed - The ordered goods have been packaged up and awaiting to be loaded on transport for delivery
    */
	public static final String DELIVERY_STATUS_PACKED = "PACKED";
	/**
    * Delivery Status - Loaded - The ordered goods have been packaged up and have been loaded on transport for delivery. The transport has not yet left with the packaged goods.
    */
	public static final String DELIVERY_STATUS_LOADED = "LOADED";
	/**
	 * Delivery Status - In Transit - The ordered goods have been packaged up, loaded and are in transit on transport.
	 */
	public static final String DELIVERY_STATUS_IN_TRANSIT = "IN_TRANSIT";
	/**
	 * Delivery Status - In Storage - The ordered goods have been packaged up and are being stored at a location for later delivery.
	 */
	public static final String DELIVERY_STATUS_IN_STORAGE = "IN_STORAGE";
	/**
	 * Delivery Status - Delivered - The ordered goods have been packaged up, transported and delivered to a final location.
	 */
	public static final String DELIVERY_STATUS_DELIVERED = "DELIVERED";
	/**
	 * Delivery Status - Unpacked - The ordered goods have been packaged up, transported and delivered to a final location, then unpacked at that location.
	 */
	public static final String DELIVERY_STATUS_UNPACKED = "UNPACKED";
	/**
	 * Delivery Status - Delivery Missed - The ordered goods have been packaged up, transported to a final location, however they were not able to be received due to the authorized person(s) not being available to accept the goods.
	 */
	public static final String DELIVERY_STATUS_DELIVERY_MISSED = "DELIVERY_MISSED";
	/**
	 * Delivery Status - Received - The ordered goods have been packaged up, transported to a final location, delivered and able to be received by the authorised person(s).
	 */
	public static final String DELIVERY_STATUS_RECEIVED = "RECEIVED";
	/**
	 * Delivery Status - Lost In Transit - The ordered goods have been packaged up, and transported, however they were lost in transit. They may have been been lost in an accident, by an act of nature, or any other unforseen circumstance.
	 */
	public static final String DELIVERY_STATUS_LOST_IN_TRANSIT = "LOST_IN_TRANSIT";
	/**
	 * Delivery Status - Damaged In Transit - The ordered goods have been packaged up, and transported, however they were damaged in transit. They may have been been damaged in an accident, by an act of nature, or any other unforseen circumstance.
	 */
	public static final String DELIVERY_STATUS_DAMAGED_IN_TRANSIT = "DAMAGED_IN_TRANSIT";
	/**
	 * Delivery Status - Cancelled - The delivery of the ordered goods was cancelled and will no longer be delivered.
	 */
	public static final String DELIVERY_STATUS_CANCELLED = "CANCELLED";
	/**
	 * Delivery Status - Awaiting Receiver Pickup - The ordered goods are at a location reading to be picked up by the receiver of the goods.
	 */
	public static final String DELIVERY_STATUS_AWAITING_RECEIVER_PICKUP = "AWAITING_RECEIVER_PICKUP";
	/**
	 * General Ledger Account Type - Asset - a type of general ledger account that represents the different types of economic resources owned or controlled by an entity. Common examples of asset accounts are cash in hand, cash in bank, real estate, inventory, prepaid expenses, goodwill, and accounts receivable.
	 */
	public static final String GENERAL_LEDGER_ACCOUNT_TYPE_ASSET = "ASSET";
	/**
	 * General Ledger Account Type - Liability - a type of general ledger account that represents the different types of economic obligations of an entity, such as accounts payable, bank loans, bonds payable, and accrued expenses.
	 */
	public static final String GENERAL_LEDGER_ACCOUNT_TYPE_LIABILITY = "LIABILITY";
	/**
	 * General Ledger Account Type - Equity - a type of general ledger account that represents the residual equity of an entity (the value of assets after deducting the value of all liabilities). Equity accounts include common stock, paid-in capital, and retained earnings.
	 */
	public static final String GENERAL_LEDGER_ACCOUNT_TYPE_EQUITY = "EQUITY";
	/**
	 * General Ledger Account Type - Operating Revenue - a type of general ledger account that represents an entity's earnings from operating and trading activities, such as sales and service revenue.
	 */
	public static final String GENERAL_LEDGER_ACCOUNT_TYPE_OPERATING_REVENUE = "OPERATING_REVENUE";
	/**
	 * General Ledger Account Type - Non Operating Expense - a type of general ledger account that represent an entity's expenditures from operating and trading activities, such as utilities, rents and insurance.
	 */
	public static final String GENERAL_LEDGER_ACCOUNT_TYPE_OPERATING_EXPENSE = "OPERATING_EXPENSE";
	/**
	 * General Ledger Account Type - Non Operating Revenue - a type of general ledger account that represents an entity's earnings from non-operating or trading activities, such as investments, property or asset sales, currency exchange, or non-recurring sales.
	 */
	public static final String GENERAL_LEDGER_ACCOUNT_TYPE_NON_OPERATING_REVENUE = "NON_OPERATING_REVENUE";
	/**
	 * General Ledger Account Type - Non Operating Expenses - a type of general ledger account that represent an entity's expenditures from non-operating or trading activities, such as paying interest of loans, depreciation, losses on property or assets, legal fees
	 */
	public static final String GENERAL_LEDGER_ACCOUNT_TYPE_NON_OPERATING_EXPENSE = "NON_OPERATING_EXPENSE";
	/**
	 * Currency Type - Fiat - currency that is issued and controlled by a central authority, such as a government
	 */
	public static final String CURRENCY_TYPE_FIAT = "FIAT";
	/**
	 * Currency Type - Cryptographic - currency that is stored and generated through cryptographic, digital mechanisms and not controlled by any one central authority.
	 */
	public static final String CURRENCY_TYPE_CRYPTO = "CRYPTO";
	/**
	 * Currency Type - Virtual - currency that is stored and created through digital mechanisms, and may be invented and/or controlled by a single organisation or other entity.
	 */
	public static final String CURRENCY_TYPE_VIRTUAL = "VIRTUAL";
	
	/**
	 * Unit Of Measure - Length - Metre. Base unit of length in the International System of Units (SI). Consists of 100 centimetres
	 */
	public static final String UNIT_MEASURE_LENGTH_METRE = "M";
	/**
	 * Unit Of Measure - Length - Centimetre. Metric unit. Each centimetre consists of 10 millimetres
	 */
	public static final String UNIT_MEASURE_LENGTH_CENTIMETRE = "CM";
	/**
	 * Unit Of Measure - Length - Millimetre. Metric unit. Each millimetre consists of 1000 micrometres
	 */
	public static final String UNIT_MEASURE_LENGTH_MILLIMETRE = "MM";
	/**
	 * Unit Of Measure - Length - Micrometre. Metric unit. Each micrometre consists of 1000 nanomentres
	 */
	public static final String UNIT_MEASURE_LENGTH_MICROMETRE = "UM";
	/**
	 * Unit Of Measure - Length - Nanometre. Metric unit. Each nanometre consists of 1000 picometres
	 */
	public static final String UNIT_MEASURE_LENGTH_NANOMETRE = "NM";
	/**
	 * Unit Of Measure - Length - Picometre. Metric unit. Each picometre consists of 1000 femtometres
	 */
	public static final String UNIT_MEASURE_LENGTH_PICOMETRE = "PM";
	/**
	 * Unit Of Measure - Length - Hectometre. Metric unit. Each hectometre consists of 100 metres
	 */
	public static final String UNIT_MEASURE_LENGTH_HECTOMETRE = "HM";
	/**
	 * Unit Of Measure - Length - Kilometre. Metric unit. Each kilometre consists of 1000 metres
	 */
	public static final String UNIT_MEASURE_LENGTH_KILOMETRE = "KM";
	/**
	 * Unit Of Measure - Length - Thou. Imperial unit. 1000 thou's makes up an inch
	 */
	public static final String UNIT_MEASURE_LENGTH_THOU = "TH";
	/**
	 * Unit Of Measure - Length - Inch. Imperial unit. Each inch consists of 2.54 centimetres
	 */
	public static final String UNIT_MEASURE_LENGTH_INCH = "IN";
	/**
	 * Unit Of Measure - Length - Foot. Imperial unit. Each foot consists of 12 inches
	 */
	public static final String UNIT_MEASURE_LENGTH_FOOT = "FT";
	/**
	 * Unit Of Measure - Length - Yard. Imperial unit. Each yard consists of 3 feet
	 */
	public static final String UNIT_MEASURE_LENGTH_YARD = "YD";
	/**
	 * Unit Of Measure - Length - Chain. Imperial unit. Each chain consists of 22 yards.
	 */
	public static final String UNIT_MEASURE_LENGTH_CHAIN = "CH";
	/**
	 * Unit Of Measure - Length - Furlong. Imperial unit. Each furlong consists of 10 chains
	 */
	public static final String UNIT_MEASURE_LENGTH_FURLONG = "FUR";
	/**
	 * Unit Of Measure - Length - Mile. Imperial unit. Each mile consists of 8 furlongs
	 */
	public static final String UNIT_MEASURE_LENGTH_MILE = "MI";
	
	/**
	 * Unit Of Measure - Mass - Kilogram. Metric unit. Base unit of length in the International System of Units (SI). Consists of 1000 grams
	 */
	public static final String UNIT_MEASURE_MASS_KILOGRAM = "KG";
	/**
	 * Unit Of Measure - Mass - gram. Metric unit. Each gram consists of 1000 milligrams
	 */
	public static final String UNIT_MEASURE_MASS_GRAM = "G";
	/**
	 * Unit Of Measure - Mass - Milligram. Metric unit. Each milligram consists of 1000 micrograms
	 */
	public static final String UNIT_MEASURE_MASS_MILLIGRAM = "MG";
	/**
	 * Unit Of Measure - Mass - Microgram. Metric unit. Each microgram consists of 1000 nanograms
	 */
	public static final String UNIT_MEASURE_MASS_MICROGRAM = "UG";
	/**
	 * Unit Of Measure - Mass - Nanogram. Metric unit. Each nanogram consists of 1000 picograms
	 */
	public static final String UNIT_MEASURE_MASS_NANOGRAM = "NG";
	/**
	 * Unit Of Measure - Mass - Picogram. Metric unit. Each picogram consists of 1000 femtograms
	 */
	public static final String UNIT_MEASURE_MASS_PICOGRAM = "PG";
	/**
	 * Unit Of Measure - Mass - Metric Tonne. Metric unit. Less widely known as a Megagram. Each metric tonne consists of 1000 kilograms
	 */
	public static final String UNIT_MEASURE_MASS_TONNE_METRIC = "T";
	/**
	 * Unit Of Measure - Mass - Mega Tonne. Metric unit. Each mega tonne consists of 1000 metric tonnes
	 */
	public static final String UNIT_MEASURE_MASS_MEGATONNE = "MT";
	/**
	 * Unit Of Measure - Mass - Giga Tonne. Metric unit. Each giga tonne consists of 1000 mega tonnes
	 */
	public static final String UNIT_MEASURE_MASS_GIGATONNE = "GT";
	/**
	 * Unit Of Measure - Mass - Grain. Imperial unit. 7000 grains make up a pound
	 */
	public static final String UNIT_MEASURE_MASS_GRAIN = "GR";
	/**
	 * Unit Of Measure - Mass - Ounce. Imperial unit. Each once consists of 16 drams
	 */
	public static final String UNIT_MEASURE_MASS_OUNCE = "OZ";
	/**
	 * Unit Of Measure - Mass - Pound. Imperial unit. Each pound consists of 16 ounces
	 */
	public static final String UNIT_MEASURE_MASS_POUND = "LB";
	/**
	 * Unit Of Measure - Mass - Stone. Imperial unit. Each stone consists of 14 pounds
	 */
	public static final String UNIT_MEASURE_MASS_STONE = "ST";
	/**
	 * Unit Of Measure - Mass - Quarter. Imperial unit. Each quarter consists of 28 pounds
	 */
	public static final String UNIT_MEASURE_MASS_QUARTER = "QR";
	/**
	 * Unit Of Measure - Mass - Hundredweight (Long). Imperial unit. Each long hundredweight consists of 8 stone, 112 pounds
	 */
	public static final String UNIT_MEASURE_MASS_HUNDREDWEIGHT_LONG = "CWTL";
	/**
	 * Unit Of Measure - Mass - Hundredweight (Short). Imperial unit. Each short hundredweight consists of 100 pounds
	 */
	public static final String UNIT_MEASURE_MASS_HUNDREDWEIGHT_SHORT = "CWTS";
	/**
	 * Unit Of Measure - Mass - Imperial Ton (Long). Imperial unit. Each long ton consists of 2240 pounds
	 */
	public static final String UNIT_MEASURE_MASS_TON_LONG = "TONL";
	/**
	 * Unit Of Measure - Mass - Imperial Ton (Short). Imperial unit. Each short ton consists of 2000 pounds
	 */
	public static final String UNIT_MEASURE_MASS_TON_SHORT = "TONS";
	
	/**
	 * Unit Of Measure - Volume - Cubic Metre. Base unit of volume in the International System of Units (SI).
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_METRE = "M3";
	/**
	 * Unit Of Measure - Volume - Cubic Centimetre. Metric unit. Each cubic centimetre consists of 1000 cubic millimetres
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_CENTIMETRE = "CM3";
	/**
	 * Unit Of Measure - Volume - Millimetre. Metric unit. Each cubic millimetre consists of 1,000,000,000 cubic micrometres
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_MILLIMETRE = "MM3";
	/**
	 * Unit Of Measure - Volume - Micrometre. Metric unit. Each cubic micrometre consists of 1000,000,000 cubic nanomentres
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_MICROMETRE = "UM3";
	/**
	 * Unit Of Measure - Volume - Nanometre. Metric unit. Each cubic nanometre consists of 1,000,000,000 cubic picometres
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_NANOMETRE = "NM3";
	/**
	 * Unit Of Measure - Volume - Picometre. Metric unit. Each cubic picometre consists of 1,000,000,000 cubic femtometres
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_PICOMETRE = "PM3";
	/**
	 * Unit Of Measure - Volume - Hectometre. Metric unit. Each hectometre consists of 1,000,000 cubic metres
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_HECTOMETRE = "HM3";
	/**
	 * Unit Of Measure - Volume - Kilometre. Metric unit. Each kilometre consists of 1,000,000,000 cubic metres
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_KILOMETRE = "KM3";
	/**
	 * Unit Of Measure - Volume - Cubic Inch. Imperial unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_INCH = "IN3";
	/**
	 * Unit Of Measure - Volume - Cubic Foot. Imperial unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_FOOT = "FT3";
	/**
	 * Unit Of Measure - Volume - Cubic Yard. Imperial unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_YARD = "YD3";
	/**
	 * Unit Of Measure - Volume - Cubic Mile. Imperial unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_CUBIC_MILE = "MI3";
	/**
	 * Unit Of Measure - Volume - Measurement tone. Imperial unit. Also known as a shipping ton.
	 */
	public static final String UNIT_MEASURE_VOLUME_MEASUREMENT_TON = "MTON";
	
	/**
	 * Unit Of Measure - Volume - Litre. Metric liquid unit. Each litre conists of 100 centilitres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_LITRE = "L";
	/**
	 * Unit Of Measure - Volume - Cubic Centilitre. Metric liquid unit. Each cubic centilitre consists of 1000 millilitres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_CENTILITRE = "CL";
	/**
	 * Unit Of Measure - Volume - Millilitre. Metric liquid unit. Each cubic millilitre consists of 1000 microlitres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_MILLILITRE = "ML";
	/**
	 * Unit Of Measure - Volume - Microlitre. Metric liquid unit. Each cubic microlitre consists of 1000 nanolitres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_MICROLITRE = "UL";
	/**
	 * Unit Of Measure - Volume - Nanolitre. Metric liquid unit. Each cubic nanolitre consists of 1000 picolitres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_NANOLITRE = "NL";
	/**
	 * Unit Of Measure - Volume - Picolitre. Metric liquid unit. Each cubic picolitre consists of 1000 femtolitres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_PICOLITRE = "PL";
	/**
	 * Unit Of Measure - Volume - Hectolitre. Metric liquid unit. Each hectolitre consists of 1000 litres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_HECTOLITRE = "HL";
	/**
	 * Unit Of Measure - Volume - Kilolitre. Metric liquid unit. Each kilolitre consists of 1000 litres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_KILOLITRE = "KL";
	/**
	 * Unit Of Measure - Volume - Megalitre. Metric liquid unit. Each kilolitre consists of 1000 kilolitres
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_MEGALITRE = "MGL";
	/**
	 * Unit Of Measure - Volume - Gigalitre. Metric liquid unit. Each gigalitre consists of 1000 gigalitre
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_GIGALITRE = "GL";
	/**
	 * Unit Of Measure - Volume - Fluid Ounce. Imperial liquid unit. Each fluid ounce consists of 1 imperial ounce
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_IMPERIAL_FLUID_OUNCE = "IMPFLOZ";
	/**
	 * Unit Of Measure - Volume - Gill. Imperial liquid unit. Each gill consists of 5 imperial ounces
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_IMPERIAL_GILL = "IMPGI";
	/**
	 * Unit Of Measure - Volume - Pint. Imperial liquid unit. Each pint consists of 20 imperial ounces
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_IMPERIAL_PINT = "IMPPT";
	/**
	 * Unit Of Measure - Volume - Quart. Imperial liquid unit. Each quart consists of 2 imperial pints
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_IMPERIAL_QUART = "IMPQT";
	/**
	 * Unit Of Measure - Volume - Gallon. Imperial liquid unit. Each gallon consists of 8 imperial pints
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_IMPERIAL_GALLON = "IMPGAL";
	/**
	 * Unit Of Measure - Volume - Fluid Ounce. United States liquid unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_US_FLUID_OUNCE = "USFLOZ";
	/**
	 * Unit Of Measure - Volume - Gill. United States liquid unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_US_GILL = "USGI";
	/**
	 * Unit Of Measure - Volume - Pint. United States liquid unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_US_PINT = "USPT";
	/**
	 * Unit Of Measure - Volume - Quart. United States liquid unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_US_QUART = "USQT";
	/**
	 * Unit Of Measure - Volume - Gallon. United States liquid unit.
	 */
	public static final String UNIT_MEASURE_VOLUME_LIQUID_US_GALLON = "USGAL";
}
