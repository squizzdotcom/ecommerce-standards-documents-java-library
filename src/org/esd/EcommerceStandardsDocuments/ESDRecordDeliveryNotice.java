/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import java.util.ArrayList;

/**
* Ecommerce Standards Record that holds data for a single delivery notice. The delivery notice (also known as an Advanced Ship Notice (ASN)) advises of the delivery of products being made by the supplier. The notice can advise when goods are being packed, dispatched, in-transit, held in storage, delivered, lost, or cancelled
*/
public class ESDRecordDeliveryNotice
{
	/**
    * List of lines  to the invoice
    */
    public ArrayList<ESDRecordDeliveryNoticeLine> lines = new ArrayList<ESDRecordDeliveryNoticeLine>();
	
	/**
    * Unique identifier of the delivery notice.
    */
    public String keyDeliveryNoticeID = new String();
	
	/**
    * Code of the delivery. May or may not be a unique identifier. The code is a human known identifier of the delivery notice
    */
    public String deliveryCode = new String();
	
	/**
    * message that advises of the status of the delivery. The message could contain details specific to status of where the delivery is at
    */
    public String deliveryStatusMessage = new String();
	
	/**
    * Key of the customer account record that the delivery notice is associated to. The customer indicates the entity of the goods being delivered for.
    */
    public String keyCustomerAccountID = new String();
	
	/**
    * Key of the supplier account record that the delivery notice is associated to. The supplier indicates the entity of the goods being delivered from.
    */
    public String keySupplierAccountID = new String();
	
	/**
    * Language that the delivery notice text is written in. Set it to a constant prefixed with LANG_ in the ESDocumentConstants class
    */
    public String language = new String();
	
	/**
    * status of the delivery, indicates where the goods are located at within the delivery/shipping process.
	* Set it to one of the DELIVERY_STATUS_ constants in the ESDocumentConstants class.
    */
	public String deliveryStatus = ESDocumentConstants.DELIVERY_STATUS_AWAITING_PACKAGING;
	
	/**
    * Date that the products being delivered were packed for safe delivery. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long packedDate = 0;
	
	/**
    * Date that the products being delivered were loaded onto transport for delivery. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long loadedDate = 0;
	
	/**
    * Date that the order's goods were sent out. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long dispatchedDate = 0;
	
	/**
    * Date that the products were successfully delivered to the final destination. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long deliveredDate = 0;
	
	/**
    * Date that the products were unpacked from any packaging after being delivered to the final destination. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long unpackedDate = 0;
	
	/**
    * Date that the products were marked as being lost after being unable to be delivered. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long lostDate = 0;
	
	/**
    * Date that the products were marked as being damaged. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long damagedDate = 0;

    /**
    * Date that the products were delivered. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long deliveryDate = 0;
	
	/**
    * Date that the products were delivered and received by the final receiving entity. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long receivedDate = 0;
	
	/**
    * Date that the products were cancelled from being delivered. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
    */
    public long cancelledDate = 0;
	
	/**
    * Either 'N'-No or 'Y'-Yes
    * If 'Y' then indicates that the goods are at a known geographic location, based on the latitude and longitude coordinates
    */
    public String atGeographicLocation = ESDocumentConstants.ESD_VALUE_NO;
	
	/**
    * Latitude co-ordinate of the geographic location where the goods are located at. The number must be between 90 and -90
    */
    public double locationLatitude = 0;

    /**
    * longitude co-ordinate of the geographic location the goods are located at. The number must be between 180 and -180
    */
    public double locationLongitude = 0;
	
	/**
    * Text describing instructions on how to handle the order.
    */
    public String instructions = new String();

    /**
    * Code of the freight carrier delivering the ordered goods
    */
    public String freightCarrierCode = new String();

    /**
    * Name of the freight carrier delivering the orders goods
    */
    public String freightCarrierName = new String();

    /**
    * Reference code to the system used to process the freight order
    */
    public String freightSystemRefCode = new String();

    /**
    * Consignment code issued by the freight carrier to deliver the ordered goods
    */
    public String freightCarrierConsignCode = new String();

    /**
    * Code to track the freight carrier delivering the ordered goods
    */
    public String freightCarrierTrackingCode = new String();

    /**
    * Code of the service provided by the freight carrier to deliver the ordered goods
    */
    public String freightCarrierServiceCode = new String();
	
    /**
    * Code of the account in the freight carrier's system
    */
    public String freightCarrierAccountCode = new String();

    /**
    * Either 'N'-No or 'Y'-Yes
    * If 'Y' then indicates that the order is being delivered to a different entity from the customer who purchased the products.
    */
    public String isDropship = new String();

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
    public void setDefaultValuesForNullMembers()
	{
		if (lines == null)
        {
            lines = new ArrayList<ESDRecordDeliveryNoticeLine>();
        }
		
        if (keyDeliveryNoticeID == null)
        {
            keyDeliveryNoticeID = "";
        }
		
		if (deliveryCode == null)
        {
            deliveryCode = "";
        }
		
		if(deliveryStatus == null)
		{
			deliveryStatus = ESDocumentConstants.DELIVERY_STATUS_AWAITING_PACKAGING;
		}
		
		if (deliveryStatusMessage== null)
        {
            deliveryStatusMessage = "";
        }
		
		if (atGeographicLocation== null)
        {
            atGeographicLocation = ESDocumentConstants.ESD_VALUE_NO;
        }
		
		if (freightCarrierCode== null)
        {
            freightCarrierCode = "";
        }
		
		if (freightCarrierName== null)
        {
            freightCarrierName = "";
        }
		
		if (freightSystemRefCode== null)
        {
            freightSystemRefCode = "";
        }
		
		if (freightCarrierConsignCode== null)
        {
            freightCarrierConsignCode = "";
        }
		
		if (freightCarrierTrackingCode== null)
        {
            freightCarrierTrackingCode = "";
        }
		
		if (freightCarrierServiceCode == null)
        {
            freightCarrierServiceCode = "";
        }
		
		if (freightCarrierAccountCode == null)
        {
            freightCarrierAccountCode = "";
        }
		
		if (isDropship == null)
        {
            isDropship = ESDocumentConstants.ESD_VALUE_NO;
        }
		
		if (instructions== null)
        {
            instructions = "";
        }
		
		if (language== null)
        {
            language = "";
        }
         
        if (internalID == null)
        {
            internalID = "";
        }        
    }
}
