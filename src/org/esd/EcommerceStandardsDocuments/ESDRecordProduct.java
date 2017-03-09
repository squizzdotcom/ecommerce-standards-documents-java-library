/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import org.esd.EcommerceStandardsDocuments.ESDRecordSellUnit;

/**
* Ecommerce Standards Record that holds data for a single product. A product can be a physical or non-physical item that can be sold in quantities.
*/
public class ESDRecordProduct   
{
    /**
    * Key that allows the product record to be uniquely identified and linked to.
    */
    public String keyProductID = new String();

    /**
    * Code of the product.  May or may not be a unqiue identifier.
    */
    public String productCode = new String();

    /**
    * Key of the Taxcode record that the product is assigned to. The taxcode may control the amount of tax applied to the product.
    */
    public String keyTaxcodeID = new String();

    /**
    * Code that allows the product to searched on. This search code may or may not be unique, and would typically contain key words that allows the product to found.
    */
    public String productSearchCode = new String();

    /**
    * Barcode set for the product. A barcode is typically displayed on a product and requires a reader to decipher an image that turns it into a sequence of characters.
    */
    public String barcode = new String();

    /**
    * Inner barcode set for the product. Multiple barcodes be assigned to a product, and the inner barcode could denote one of these barcodes, or it could be a portion of a single barcode.
    */
    public String barcodeInner = new String();

    /**
    * Branding of the product.
    */
    public String brand = new String();

    /**
    * Name of the product
    */
    public String name = new String();

    /**
    * First description of the product. May contain any text used to describe the product.
    */
    public String description1 = new String();

    /**
    * Second description of the product. May contain any text used to describe the product.
    */
    public String description2 = new String();

    /**
    * Third description of the product. May contain any text used to describe the product.
    */
    public String description3 = new String();

    /**
    * Fourth description of the product. May contain any text used to describe the product.
    */
    public String description4 = new String();

    /**
    * Class of the product. A class may contain any text that can be set for multiple products as a classifier of the type of product.
    */
    public String productClass = new String();

    /**
    * United Nations Standard Products and Service Code. Stores a standard code defined by the United Nations classifying objects.
    */
    public String UNSPSC = new String();

    /**
    * Key of the sell unit record that denotes the default unit that the product is sold in.
    */
    public String keySellUnitID = new String();

    /**
    * Label of the default unit that the product is sold individually as.
    */
    public String unit = new String();

    /**
    * Quantity of units that allow the product to bought as a pack. This is deprecated in favour of using sell units.
    */
    public double packQuantity = 0;

    /**
    * Label of the pack that the product may be bought as.  This is deprecated in favour of using sell units.
    */
    public String packUnit = new String();

    /**
    * Weight of a single product unit.
    */
    public double weight = 0;

    /**
    * Width dimension of a single product unit.
    */
    public double width = 0;

    /**
    * Height dimension of a single product unit.
    */
    public double height = 0;

    /**
    * Depth dimension of a single product unit.
    */
    public double depth = 0;

    /**
    * Monetary value that denotes the average cost to purchase a single product unit.
    */
    public double averageCost = 0;

    /**
    * Label of the warehouse location that the product is assigned to.
    */
    public String warehouse = new String();

    /**
    * Label of the supplier that the product is purchased from.
    */
    public String supplier = new String();

    /**
    * Label of the amount of time that it would typically take for the product to be delivered when it is out of stock
    */
    public String deliveryTimeNoStock = new String();

    /**
    * Label of the amount of time that it would typically take for the product to be delivered when it is in stock
    */
    public String deliveryTimeInStock = new String();

    /**
    * The amount of product units that are in stock and available for purchase.
    */
    public double stockQuantity = 0;

    /**
    * The amount of product units that indicate when the product is no longer in stock.
    */
    public double stockNoneQuantity = 0;

    /**
    * The amount of product units that indicate when the product is low in stock.
    */
    public double stockLowQuantity = 0;

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that any pricing set for the product is inclusive of tax applied to the price, based the rate of taxcode assigned to the product.
    */
    public String isPriceTaxInclusive = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates product is a kit, and is representative of a number of individual products bundled together.
    */
    public String isKitted = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that if the product is marked as a kit then when its pricing is calculated, that the pricing assigned to the product is for the cost of kit.
    * If 'N' then indicated that if the product is marked as a kit then when its pricing is calculated, that the price of the product should be calculated by combining the price of all the component products assignd to the kit.
    */
    public String kitProductsSetPrice = new String();

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
    * Stores a list of sell units that denote different quantities the the product can be sold in
    */
    public ESDRecordSellUnit[] sellUnits = new ESDRecordSellUnit[]{};
}


