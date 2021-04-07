/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single purchaser. A purchaser represents an entity (person or organisation) that may buy products, manage supplier accounts, and place purchase orders with suppliers.
*/
public class ESDRecordPurchaser   
{
    /**
    * Key of the purchaser record to be uniquely identified and linked to.
    */
    public String keyPurchaserID = new String();

    /**
    * Code of the purchaser. May or may not be a unique identifier
    */
    public String purchaserCode = new String();

    /**
    * Name of purchaser
    */
    public String name = new String();

    /**
    * Name of contact person
    */
    public String contact = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the purchaser is an individual person.
    */
    public boolean isIndividual = false;

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
