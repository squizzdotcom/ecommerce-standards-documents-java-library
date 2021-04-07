/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import java.util.ArrayList;

/**
* Ecommerce Standards Record that holds data for a single attribute profile  for a order line. This allows any additional attribute data to be  for the line.
*/
public class ESDRecordOrderLineAttributeProfile   
{
    /**
    * Key of the order attribute profile record
    */
    public String keyAttributeProfileID = new String();

    /**
    * Code of the attribute profile.  May or may not be a unqiue identifier.
    */
    public String profileCode = new String();

    /**
    * Name of the attribute profile.
    */
    public String profileName = new String();

    /**
    * List of attributes and values  for the order attribute profile
    */
    public ArrayList<ESDRecordOrderLineAttribute> values = new ArrayList<ESDRecordOrderLineAttribute>();


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
        if (values== null)
        {
            values = new ArrayList<ESDRecordOrderLineAttribute>();
        }
        else
        {
            for (ESDRecordOrderLineAttribute attributeValue : values)
            {
                attributeValue.setDefaultValuesForNullMembers();
            }
        } 
        if (profileCode == null)
        {
            profileCode = "";
        }
         
        if (profileName == null)
        {
            profileName = "";
        }
         
        if (keyAttributeProfileID == null)
        {
            keyAttributeProfileID = "";
        }
         
        if (internalID == null)
        {
            internalID = "";
        }
         
    }

}


