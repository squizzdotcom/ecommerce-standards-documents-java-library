/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;


/**
* Holds a product's price based on a specific account price that is used for the web
*/
public class ESDRecordCustomerAccountEnquiryProductPrice   
{
    /**
    * Key of the product record that links the price to the product
    */
    public String keyProductID = new String();

    /**
    * Code of the product record
    */
    public String productCode = new String();

    /**
    * Quantity of units that the price applies against
    */
    public double quantity = 0;

    /**
    * Monetary price for each unit excluding tax
    */
    public double unitPriceExTax = 0;

    /**
    * Monetary price for each unit including tax
    */
    public double unitPriceIncTax = 0;

    /**
    * Monetary price of tax applied to a single unit
    */
    public double unitPriceTax = 0;

    /**
    * Monetary price for for total quantity of units, excluding tax
    */
    public double totalPriceExTax = 0;

    /**
    * Monetary price for for total quantity of units, including tax
    */
    public double totalPriceIncTax = 0;

    /**
    * Monetary tax price for for total quantity of units
    */
    public double totalPriceTax = 0;

    /**
    * Tax rate as a percentage that is used to calculate the tax price
    */
    public double taxRate = 0;

    /**
    * ISO currency code that denotes the currency that all monetary amounts stored in
    */
    public String currencyCode = new String();

    /**
    * Either Y or N. If Y then denotes that the pricing has been discounted.
    */
    public boolean isDiscounted = false;

    /**
    * Type of discount applied to the pricing.
    */
    public String discountType = new String();

    /**
    * Code of the entity that the pricing was discounted with.
    */
    public String discountCode = new String();

    /**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();
}