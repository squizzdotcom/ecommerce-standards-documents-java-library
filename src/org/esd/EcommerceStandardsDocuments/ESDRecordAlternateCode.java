/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single alternate code for a product, download, or labour. An alternate code is a different code that could be used to identify a product, download, or labour.
*/
public class ESDRecordAlternateCode   
{
    /**
    * Key of the product record that the alternate code is assigned to.
    */
    public String keyProductID = new String();

    /**
    * Key of the download record that the alternate code is assigned to.
    */
    public String keyDownloadID = new String();

    /**
    * Key of the labour record that the alternate code is assigned to.
    */
    public String keyLabourID = new String();

    /**
    * Alternate code. May or may not be a unique identifier
    */
    public String alternateCode = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the alternate code may be used to directly link to the product, download, or labour.
    */
    public String isUseCode = new String(); 

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the alternate code has been defined by another entity who supplies the product, download, or labour.
    */
    public String isSupplierCode = new String();

    /**
    * Key of the supplier account record that the code is linked to.
    */
    public String keySupplierAccountID = new String();

    /**
    * Key of the customer account record that the code is linked to.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();

    /**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;
}