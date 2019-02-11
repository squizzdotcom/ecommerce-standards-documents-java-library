/**
* Copyright (C) 2019 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;
import java.util.HashMap;

/**
* Ecommerce standards document that contains a list of flag records and products, dowloads, or labour assigned to flags
* An example of the Flag Ecommerce Standards document in its JSON serialised form
* 
*  {@code 
* {
* "resultStatus":"1",
* "message":"The flag data has been successfully obtained.",
* "configs":{"dataFields":"keyProductID,keyDownloadID,keyLabourID,keyFlagID"},
* "dataTransferMode": "COMPLETE",
* "version": 1.3,
* "totalDataRecords": 5,
* "flagRecords":
* [
* {"keyFlagID":"FLAG-123"},
* {
* "keyFlagID":"FLAG-456",
* "flagCode":"DIS",
* "flagName":"Discounted",
* "description":"Denotes products that are marked as having a discounted price."
* },
* {
* "keyFlagID":"FLAG-789",
* "flagCode":"ENV",
* "flagName":"Environmentally Friendly",
* "description":"Denotes products that are marked as being manufacturered using environmentally friendly materials and methods."
* }
* ],
* "dataRecords":
* [
* {"keyProductID":"PROD-123","keyFlagID":"FLAG-123"},
* {"keyProductID":"PROD-123","keyFlagID":"FLAG-456"},
* {"keyProductID":"PROD-123","keyFlagID":"FLAG-789"},
* {"keyProductID":"PROD-456","keyFlagID":"FLAG-123"},
* {"keyProductID":"PROD-789","keyFlagID":"FLAG-456"},
* {"keyDownloadID":"DOW2","keyFlagID":"FLAG-456"},
* {"keyLabourID":"LAB1","keyFlagID":"FLAG-456"}
* ]
* }
* }
*/
public class ESDocumentFlag  extends ESDocument 
{
    /**
    * list of flag records
    */
    public ESDRecordFlag[] flagRecords = new ESDRecordFlag[]{};
    /**
    * list of flag mapping records that assign flags to products, downloads, or labour
    */
    public ESDRecordFlagMapping[] dataRecords = new ESDRecordFlagMapping[]{};
    
    /**
    * Constructor
    * Creates a new Ecommerce Standards document instance
    */
    public ESDocumentFlag(){
    }
    
    /**
    * Constructor
    *  @param resultStatus status of obtaining the flag data
    *  @param message message to accompany the result status
    *  @param flagMappingRecords list of flag mapping records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the product flag record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentFlag(int resultStatus, String message, ESDRecordFlagMapping[] flagMappingRecords, HashMap<String, String> configs){
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = flagMappingRecords;
        this.configs = configs;
        if (flagMappingRecords != null)
        {
            this.totalDataRecords = flagMappingRecords.length;
        }
         
        this.flagRecords = new ESDRecordFlag[]{  };
    }

    /**
    * Constructor
    *  @param resultStatus status of obtaining the flag data
    *  @param message message to accompany the result status
    *  @param flagRecords list of flag records
    *  @param flagMappingRecords list of flag mapping records
    *  @param configs A list of key value pairs that contain additional information about the document.
    * Ensure that a key "dataFields" exists that contains a comma delimited list of the product flag record properties that have data set. This advises systems processing the data which properties should be read and have defaults set if not included in each record.
    */
    public ESDocumentFlag(int resultStatus, String message, ESDRecordFlag[] flagRecords, ESDRecordFlagMapping[] flagMappingRecords, HashMap<String, String> configs) {
        this.resultStatus = resultStatus;
        this.message = message;
        this.dataRecords = flagMappingRecords;
        this.configs = configs;
        if (flagMappingRecords != null)
        {
            this.totalDataRecords = flagMappingRecords.length;
        }
         
        this.flagRecords = flagRecords;
    }
}
