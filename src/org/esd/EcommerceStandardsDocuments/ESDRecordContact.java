/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;


/**
* Ecommerce Standards record that contains data for a single contact. A contact contains information about a person on how they can be communicated with. The contact record may be linked to a customer account, or supplier account
*/
public class ESDRecordContact   
{
    /**
    * Key that allows the contact record to be uniquely identified and linked to.
    */
    public String keyContactID = new String();

    /**
    * Key of the customer account record that the contact record is linked to.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Key of the supplier account record that the contact record is linked to.
    */
    public String keySupplierAccountID = new String();
	
	/**
    * Key of the location record that the contact record is linked to.
    */
    public String keyLocationID = new String();

    /**
    * Code of the contact. May or may not be a unqiue identifier.
    */
    public String contactCode = new String();

    /**
    * Title of the contact person. Eg. Mrs, Mr, Miss, Doctor
    */
    public String title = new String();

    /**
    * First name field of the contact.
    */
    public String name1 = new String();

    /**
    * Second name field of the contact.
    */
    public String name2 = new String();

    /**
    * Third name field of the contact.
    */
    public String name3 = new String();

    /**
    * Email address of the contact.
    */
    public String email = new String();

    /**
    * First phone number of the contact.
    */
    public String phone1 = new String();

    /**
    * Second phone number of the contact.
    */
    public String phone2 = new String();

    /**
    * Third phone number of the contact.
    */
    public String phone3 = new String();

    /**
    * fax number of the contact.
    */
    public String fax = new String();

    /**
    * URL of the website that the contact is associated to.
    */
    public String website = new String();

    /**
    * Name of the organisation associated to the contact.
    */
    public String orgName = new String();

    /**
    * Name of the employment position of the contact within the organisation.
    */
    public String orgPosition = new String();
	
	/**
    * 'N'-No or 'Y'-Yes If 'Y' then indicates that the contact is the primary person from a list of contacts.
	*/
	public String isPrimary = new String();

	/**
    * Either 'N'-No or 'Y'-Yes If 'Y' then indicates that the contact is allowed to receive marketing media.
	*/
	public String allowMarketing = new String();

	/**
    * codes of marketing categories to assign the contact to, allowing them to receive marketing media for relevant categories of media
	*/
	public String[] marketingCategoryCodes = new String[0];
	
	/**
    * Code used to authenticate or provide authentication for the contact.
	*/
	public String authCode = new String();

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
