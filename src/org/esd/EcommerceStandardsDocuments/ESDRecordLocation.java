/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single location. Location could be a physical geographical location or a virtual place.
*/
public class ESDRecordLocation   
{
    /**
    * Key that allows the location record to be uniquely identified and linked to.
    */
    public String keyLocationID = new String();

    /**
    * Code of the location. May or may not be a unqiue identifier.
    */
    public String locationCode = new String();

    /**
    * Name of the location.
    */
    public String locationName = new String();

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
    * Name of the region/province/state where the location exists
    */
    public String region = new String();

    /**
    * Name of the country where the location exists.
    */
    public String country = new String();

    /**
    * Postcode or zip code of the location's address.
    */
    public String postcode = new String();

    /**
    * Name of the contact at the location
    */
    public String contact = new String();

    /**
    * Phone number of the location
    */
    public String phone = new String();

    /**
    * Fax number of the location
    */
    public String fax = new String();
	
	/**
    * URL of the website that is associated to the location
    */
    public String website = new String();
	
	/**
    * address of the email that is handles communications for the location
    */
    public String email = new String();

    /**
    * Either
    * NNoYYes
    * If 'Y' then indicates that the location is being used actively.
    */
    public String isActive = new String();

    /**
    * Either
    * NNoYYes
    * If 'Y' then indicates that the location physically exists at a geographic location in the world.
    */
    public String isGeographic = new String();

    /**
    * Latitude co-ordinate of the geographic location. The number must be between 90 and -90
    */
    public double latitude = 0;

    /**
    * longitude co-ordinate of the geographic location. The number must be between 180 and -180
    */
    public double longitude = 0;
	
	/**
	* Specifies the kind of the location that it represents
	*
	* HEAD_OFFICE - Location is the main head office of an organisational entity
	* WAREHOUSE - Location is a warehouse that may store an amount of stock
	* STORE - Location is a store that may sell goods and services
	* OFFICE - Location is an office where work is performed
	* SITE - Location is a site that has a defined area managed or used for business purposes.
	* THIRD_PARTY - Location is external to an organisation and may be owned or run by a separate entity
	* OTHER - The location type is not specified
	* The location type defaults to OTHER if no value is set.
	*/
	public String locationType = ESDocumentConstants.LOCATION_TYPE_OTHER;

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
    * list of products stock level records that denote the products assigned to the location, and the quantity of product stock available for each
    */
    public ESDRecordStockQuantity[] productStock = new ESDRecordStockQuantity[]{};
	
	/**
    * list of attributes and values associated to the location. This allows almost any kind of data to be set against the location in the form of attribute key value pairs
    */
    public ESDRecordAttributeValue[] attributes = new ESDRecordAttributeValue[]{};
}
