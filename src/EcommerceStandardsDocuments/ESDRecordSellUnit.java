/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;


/**
* Ecommerce Standards Record that holds data for a single sell unit. The unit defines how a product, download, or labour is sold individually.
*/
public class ESDRecordSellUnit   
{
    /**
    * Key that allows the sell unit record to be uniquely identified and linked to.
    */
    public String keySellUnitID = new String();

    /**
    * Code of the sell unit. May or may not be a unqiue identifier.
    */
    public String sellUnitCode = new String();

    /**
    * Label of the sell unit.
    */
    public String sellUnitLabel = new String();

    /**
    * Either
    * NNoYYes
    * If 'Y' then indicates that the selling unit is the base selling unit. The base selling unit may be the unit stored in the system that all other units reference off. Typically only one sell unit would be set as the base.
    */
    public String isBaseUnit = new String();

    /**
    * quantity of the unit that makes up the base unit. If not set then the default would be 1.
    */
    public double baseQuantity = 0;

    /**
    * quantity of the unit that makes up its parent unit. If not set then the default would be 1.
    */
    public double parentQuantity = 0;

    /**
    * Either
    * NNoYYes
    * If 'Y' then indicates that the pricing of the sell unit should occur off the base sell unit. This could be set if a sell unit is assigned to a product for a given quantity, and all the pricing of the product is set in the base sell unit, not the assigned sell unit.
    */
    public String isPricedOffBaseUnit = new String();

    /**
    * Key of the sell unit linked as a parent. This allows the parentQuantity to be related to another unit.
    */
    public String keySellUnitParentID = new String();

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


