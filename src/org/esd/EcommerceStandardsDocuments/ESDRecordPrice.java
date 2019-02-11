/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single product price. The price may be assigned to a price-level, a price-group, or a customer account
*/
public class ESDRecordPrice   
{
    /**
    * Key of the product record that links the price to the product
    */
    public String keyProductID = new String();

    /**
    * Key of the download record that links the price to the download
    */
    public String keyDownloadID = new String();

    /**
    * Key of the labour record that links the price to the labour
    */
    public String keyLabourID = new String();

    /**
    * Key of the price level record that the price is linked to. This can be set to null if the price is not linked to a price level
    */
    public String keyPriceLevelID = new String();

    /**
    * Key of the customer account record that the price is linked to. This can be set to null if the price is not linked to any customer account.
    */
    public String keyAccountID = new String();

    /**
    * Key of the price group that the price is linked. This can be set to null if the price is not assigned to any price group.
    */
    public String keyPriceGroupID = new String();

    /**
    * Key of the sell unit that the price is linked to. This can be set to null, and if so then the price should be assigned to the the default unit of a product.
    */
    public String keySellUnitID = new String();

    /**
    * The amount of product units that the price is set to. This should always be a positive number.
    */
    public double quantity = 0;

    /**
    * The tax rate that applies to the price. This can be set to null, and if so then the tax rate of taxcode assigned to the product should be used instead to calculate the product's price.
    */
    public double taxRate = 0;

    /**
    * ID of an entity that the price is referenced to. Typically it could be an ID of a contract, or promotion
    */
    public String referenceID = new String();

    /**
    * Type of entity that the price is referenced to. Typically use one of the PRICE constants in this class to set this field, or leave it empty.
    */
    public String referenceType = new String();

    /**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();

    /**
    * Monetary amount of the price. This price may be exclusive or inclusive of tax, depending on the IsInclusive settings of a product. The currency of the price is based on the system where the price was set.
    */
    public double price = 0;

    /**
    * Price has been set in a contract
    */
    public static final String PRICE_CONTRACT = "C";
    /**
    * Price has been set in a contract, and it the price should override other pricing (Contract Forced Pricing)
    */
    public static final String PRICE_CONTRACT_FORCED = "CF";
    /**
    * Price has been set in a promotion
    */
    public static final String PRICE_PROMOTION = "P";
}
