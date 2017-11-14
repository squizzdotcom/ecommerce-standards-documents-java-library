/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Details of a tax applied against a payment within a Ecommerce Standards Document
*/
public class ESDRecordPaymentTax
{
    /**
    * Key of the taxcode record that the payment tax record is linked to.
    */
    public String keyTaxcodeID = new String();

    /**
    * Taxcode.  May or may not be a unique identifier
    */
    public String taxcode = new String();

    /**
    * Label of the taxcode
    */
    public String taxcodeLabel = new String();

    /**
    * Numeric amount as a percentage rate that the taxcode applies to. Eg. if  to 10, then a 10% tax will be applied on top of the payment price.
    */
    public double taxRate = 0;

    /**
    * Language that the descriptive text of the line is  in. Set it to a constant prefixed with LANG_ in the ESDocumentConstants class
    */
    public String language = new String();

    /**
    * Number of units that the tax applies to
    */
    public double quantity = 0;

    /**
    * Monetary amount of tax priced for each unit
    */
    public double priceTax = 0;

    /**
    * Monetary amount of tax priced for the total quantity of units
    */
    public double priceTotalTax = 0;

    /**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or  it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();

    /**
    * s default values for members that have no values 
    */
    public void setDefaultValuesForNullMembers(){
        if (taxcodeLabel == null)
        {
            taxcodeLabel = "";
        }
         
        if (keyTaxcodeID == null)
        {
            keyTaxcodeID = "";
        }
         
        if (taxcode == null)
        {
            taxcode = "";
        }
         
        if (language == null)
        {
            language = "";
        }
         
        if (internalID == null)
        {
            internalID = "";
        }
    }
}