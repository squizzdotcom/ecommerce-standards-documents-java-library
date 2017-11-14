/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
 * Ecommerce Standards Record that holds data for a single maker/manufacturer. A maker/manufacturer builds and/or assembles models which contain a collection of products or raw materials.
 */
public class ESDRecordMaker
{
	/** 
	 * Key that allows the maker record to be uniquely identified and linked to.
	 */
	public String keyMakerID = new String();
	
	/**
	 * Code of the maker. May or may not be a unqiue identifier.
	 */
	public String makerCode = new String();
	
	/**
	 * Name of the maker.
	 */
	public String name = new String();
	
	/**
	 * Code that allows the maker to searched on. This search code may or may not be unique, and would typically contain key words that allows the maker to be found.
	 */
	public String makerSearchCode = new String();
	
	/**
	 * Class that allows the maker to be grouped with other makers of the same type.
	 */
	public String groupClass = new String();
	
	/**
	 * Numeric value that may be set to control how the maker is ordered with other makers within a list
	 */
	public double ordering = 0;
	
	/**
	 * Date that the maker was established. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
	 */
	public long establishedDate = 0;
	
	/**
	 * Name of the organisation, if the maker is an organisation.
	 */
	public String orgName = new String();
	
	/**
	 * list of numbers of the government, or any other entity records that is associated with the maker. Ensure that the array length is the same as the authorityNumberLabels property, or left empty
	 */
	public String[] authorityNumbers = new String[]{};
	
	/**
	 * list of Labels set for the authority numbers. Ensure that the array length is the same as the authorityNumbers property, or left empty
	 */
	public String[] authorityNumberLabels = new String[]{};
	
	/**
	 * list of authority number types matching the authority numbers. If set must use the ESDocumentConstants that are prefixed with "AUTHORITY_NUM_". Ensure that the array length is the same as the authorityNumbers property, or left empty.
	 */
	public int[] authorityNumberTypes  = new int[]{};
	
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