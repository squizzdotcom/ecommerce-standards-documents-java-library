/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package EcommerceStandardsDocuments;


/**
* Ecommerce Standards Record that holds data for a single attribute and value within a order line. This allows any additional fields and field values to be  with the order line.
*/
public class ESDRecordOrderLineAttribute   
{
    /**
    * Key of the order attribute record
    */
    public String keyAttributeID = new String();

    /**
    * Code of the attribute.  May or may not be a unqiue identifier.
    */
    public String attributeCode = new String();

    /**
    * name of the attribute.
    */
    public String attributeName = new String();

    /**
    * value of the attribute.
    */
    public String attributeValue = new String();

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
        if (attributeCode== null)
        {
            attributeCode = "";
        }
         
        if (attributeName== null)
        {
            attributeName = "";
        }
         
        if (keyAttributeID== null)
        {
            keyAttributeID = "";
        }
         
        if (attributeValue== null)
        {
            attributeValue = "";
        }
         
        if (internalID== null)
        {
            internalID = "";
        }
    }
}