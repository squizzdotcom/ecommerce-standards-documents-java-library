/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;


/**
* Ecommerce Standards Record that holds data for a single surcharge. Each surcharge defines a type of monetary amount that may be added or substracted which is factored into the final price of purchasing goods or services.
*/
public class ESDRecordSurcharge   
{
    /**
    * Key of the surcharge record to be uniquely identified and linked to.
    */
    public String keySurchargeID = new String();

    /**
    * Code of the surcharge.  May or may not be a unique identifier
    */
    public String surchargeCode = new String();

    /**
    * Label of the surcharge
    */
    public String surchargeLabel = new String();

    /**
    * Text to describe the surcharge
    */
    public String description = new String();

    /**
    * Type of surcharge that it relates to. Set null, or set it to ine of the SURCHARGE_TYPE constants in the ESDocumentConstants class.
    */
    public String surchargeType = new String();

    /**
    * Key of the Taxcode record that the surcharge is assigned to. The taxcode may control the amount of tax applied to the surcharge.
    */
    public String keyTaxcodeID = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the surcharge should always be included with sales orders and purchase orders even if it has 0 monetary amount applied to the order
    */
    public String alwaysShowInOrders = new String();

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


