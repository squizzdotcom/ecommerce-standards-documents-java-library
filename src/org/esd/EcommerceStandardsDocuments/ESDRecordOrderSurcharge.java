/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import java.util.ArrayList;

/**
* Details of a surcharge assigned to an order record within a Ecommerce Standards Document
*/
public class ESDRecordOrderSurcharge   
{
    /**
    * List of tax records applied to the surcharge.
    */
    public ArrayList<ESDRecordOrderLineTax> taxes = new ArrayList<ESDRecordOrderLineTax>();

    /**
    * Key of the surcharge record that the order line surcharge record is linked to.
    */
    public String keySurchargeID = new String();

    /**
    * Code of the surcharge. May or may not be a unique identifier
    */
    public String surchargeCode = new String();

    /**
    * Label of the surcharge
    */
    public String surchargeLabel = new String();

    /**
    * Text description of the surcharge
    */
    public String surchargeDescription = new String();

    /**
    * Language that the descriptive text of the line is  in. Set it to a constant prefixed with LANG_ in the ESDocumentConstants class
    */
    public String language = new String();

    /**
    * Monetary price of the surcharge, excluding tax.
    */
    public double priceExTax = 0;

    /**
    * Monetary price of the surcharge, including tax.
    */
    public double priceIncTax = 0;

    /**
    * Monetary price of the tax applied to the surcharge
    */
    public double priceTax = 0;

    /**
    * Monetary price of the surcharge before any discounting was applied, exclusive of tax.
    */
    public double priceUndiscountedExTax = 0;

    /**
    * Monetary price of the surcharge before any discounting was applied, inclusive of tax.
    */
    public double priceUndiscountedIncTax = 0;

    /**
    * Monetary price of tax applied the surcharge before any discounting was applied.
    */
    public double priceUndiscountedTax = 0;

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
        if (taxes == null)
        {
            taxes = new ArrayList<ESDRecordOrderLineTax>();
        }
        else
        {
            for (ESDRecordOrderLineTax tax : taxes)
            {
                tax.setDefaultValuesForNullMembers();
            }
        } 
        if (keySurchargeID == null)
        {
            keySurchargeID = "";
        }
         
        if (surchargeCode == null)
        {
            surchargeCode = "";
        }
         
        if (surchargeLabel == null)
        {
            surchargeLabel = "";
        }
         
        if (surchargeDescription == null)
        {
            surchargeDescription = "";
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
