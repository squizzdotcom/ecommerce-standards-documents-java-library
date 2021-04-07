/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of location records
* An example of the Location Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The location data has been successfully obtained.",
* "configs":{
* "dataFieldsLocation":"keyLocationID,locationCode,locationName,address1,address2,address3,region,country,postcode,contact,phone,fax,isActive,isGeographic,latitude,longitude",
* "dataFieldsLocationStock":"keyProductID,qtyAvailable,qtyOnHand,qtyOrdered,qtyBackordered,qtyReserved,qtyConsigned"
* },
* "dataTransferMode": "COMPLETE",
* "version": 1.4,
* "totalDataRecords": 3,
* "dataRecords":
* [
* {
* "keyLocationID":"111",
* "locationCode":"LOC-111",
* "locationName":"Local Store"
* },
* {
* "keyLocationID":"123",
* "locationCode":"LOC-123",
* "locationName":"Head Office",
* "address1":"234",
* "address2":"Bourke Street",
* "address3":"Melbourne",
* "region":"Victoria",
* "country":"Australia",
* "postcode":"3000",
* "contact":"John Doe",
* "phone":"+614001112222",
* "fax":"+614002223333",
* "isActive":"Y",
* "isGeographic":"Y",
* "latitude":45.123,
* "longitude":-72.123,
* "productStock":[],
* "attributes":[]
* },
* {
* "keyLocationID":"456",
* "locationCode":"LCT-456",
* "locationName":"Warehouse",
* "address1":"237",
* "address2":"Bourke Street",
* "address3":"Melbourne",
* "region":"Victoria",
* "country":"Australia",
* "postcode":"3000",
* "contact":"Max Smith",
* "phone":"+614003334444",
* "fax":"+614005556666",
* "isActive":"Y",
* "isGeographic":"Y",
* "latitude":45.423,
* "longitude":-72.823,
* "productStock":
* [
* {
* "keyProductID":"ABC",
* "qtyAvailable":432
* },
* {
* "keyProductID":"DEF",
* "qtyAvailable":0,
* "qtyOnHand":0,
* "qtyOrdered":5,
* "qtyBackordered":10,
* "qtyReserved":11,
* "qtyConsigned":3
* }
* ],
* "attributes":
* [
* {
* "keyAttributeProfileID":"BD",
* "keyAttributeID":"BRAND-NAME",
* "stringValue": "Acme Shoes"
* },
* {
* "keyAttributeProfileID":"BD",
* "keyAttributeID":"BRAND-NAME",
* "stringValue": "Swisho Shoes"
* },
* {
* "keyAttributeProfileID":"BD",
* "keyAttributeID":"BRAND-NAME",
* "stringValue": "Budgety Shoes"
* }
* ]
* }
* ]
* }
* }
*/
public class ESDocumentLocation  extends ESDocument 
{
    /**
    * List of Location records. The data records property must be the last property in the JSON data when serialised.
    */
	@JsonInclude(JsonInclude.Include.ALWAYS)
    public ESDRecordLocation[] dataRecords = new ESDRecordLocation[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentLocation(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the location data
    *  @param message message to accompany the result status
    *  @param locations array of warehouses mapped to stock levels
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the location properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentLocation(int resultStatus, String message, ESDRecordLocation[] locations, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = locations;
        this.configs = configs;
        if (locations != null)
        {
            this.totalDataRecords = locations.length;
        }    
    }
}
