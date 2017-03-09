/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;


/**
* Ecommerce Standards record that contains the data of a single address associated to a customer account.
*/
public class ESDRecordCustomerAccountAddress   
{
    /**
    * Key that allows the customer account address record to be uniquely identified and linked to.
    */
    public String keyAddressID = new String();

    /**
    * Key of the customer account record that the address record is linked to.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Description of the customer account address. This may be used as a label to help a person identify with the address.
    */
    public String description = new String();

    /**
    * Name of the organisation that the address is associated to.
    */
    public String orgName = new String();

    /**
    * Name of the person who can be contacted at the address.
    */
    public String contact = new String();

    /**
    * Phone number of the address. Its preferable to set phone numbers that can be dialled from anywhere internationally.
    */
    public String phone = new String();

    /**
    * Fax number of the address. Its preferable to set fax numbers that can be dialled from anywhere internationally.
    */
    public String fax = new String();

    /**
    * First address field. Typically this could be a unit number or street number.
    */
    public String address1 = new String();

    /**
    * Second address field. Typically this could be the street name.
    */
    public String address2 = new String();

    /**
    * Third address field. Typically this could be the suburb, city or town.
    */
    public String address3 = new String();

    /**
    * Name of the region/province/state that the address exists within.
    */
    public String region = new String();

    /**
    * Name of the country that the address exists within.
    */
    public String country = new String();

    /**
    * Postcode or zipcode of the address.
    */
    public String postcode = new String();

    /**
    * Code that denotes the freight location or freight data associated to the address.
    */
    public String freightCode = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the address is the primary address assigned to the customer account. Typically a primary address would be the account's billing address.
    */
    public String isPrimary = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the address may be used by the customer account to have goods delivered to.
    */
    public String isDelivery = new String();

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


