/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;

import EcommerceStandardsDocuments.ESDRecordSellUnit;

/**
* Ecommerce Standards Record that holds data for a single labour record. Labour describes the different kinds of effort required to perform a piece of work.
*/
public class ESDRecordLabour   
{
    /**
    * Key that allows the labour record to be uniquely identified and linked to.
    */
    public String keyLabourID = new String();

    /**
    * Code of the labour.  May or may not be a unqiue identifier.
    */
    public String labourCode = new String();

    /**
    * Key of the Taxcode record that the labour is assigned to. The taxcode may control the amount of tax applied to the labour.
    */
    public String keyTaxcodeID = new String();

    /**
    * Code that allows the labour to searched on. This search code may or may not be unique, and would typically contain key words that allows the labour to found.
    */
    public String labourSearchCode = new String();

    /**
    * Name of the labour
    */
    public String name = new String();

    /**
    * First description of the labour. May contain any text used to describe the labour.
    */
    public String description1 = new String();

    /**
    * Second description of the labour. May contain any text used to describe the labour.
    */
    public String description2 = new String();

    /**
    * Third description of the labour. May contain any text used to describe the labour.
    */
    public String description3 = new String();

    /**
    * Fourth description of the labour. May contain any text used to describe the labour.
    */
    public String description4 = new String();

    /**
    * Class of the labour. A class may contain any text that can be set for multiple labour records as a classifier of the type of labour.
    */
    public String labourClass = new String();

    /**
    * United Nations Standard Products and Service Code. Stores a standard code defined by the United Nations classifying objects.
    */
    public String UNSPSC = new String();

    /**
    * Key of the sell unit record that denotes the default unit that the labour is sold in.
    */
    public String keySellUnitID = new String();

    /**
    * Label of the default unit that the labour is sold individually as.
    */
    public String unit = new String();

    /**
    * Monetary value that denotes the average cost to purchase a single labour unit.
    */
    public double averageCost = 0;

    /**
    * The amount of labour units that are available for purchase.
    */
    public double labourQuantity = 0;

    /**
    * The amount of labour units that indicate when the labour is no longer available.
    */
    public double labourNoneQuantity = 0;

    /**
    * The amount of labour units that indicate when the labour is low in availability.
    */
    public double labourLowQuantity = 0;

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that any pricing set for the labour is inclusive of tax applied to the price, based the rate of taxcode assigned to the labour.
    */
    public String isPriceTaxInclusive = new String();

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
    * Stores a list of sell units that different units of labour can be sold in. Eg labour could be sold by the hour, or in packs
    */
    public ESDRecordSellUnit[] sellUnits = new ESDRecordSellUnit[]{};
}