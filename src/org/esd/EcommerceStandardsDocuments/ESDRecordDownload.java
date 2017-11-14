/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards Record that holds data for a single download. A download represents a piece of digital information, that may be stored, sold, or transferred.
*/
public class ESDRecordDownload   
{
    /**
    * Key that allows the download record to be uniquely identified and linked to.
    */
    public String keyDownloadID = new String();

    /**
    * Code of the download.  May or may not be a unqiue identifier.
    */
    public String downloadCode = new String();

    /**
    * Key of the Taxcode record that the download is assigned to. The taxcode may control the amount of tax applied to the download.
    */
    public String keyTaxcodeID = new String();

    /**
    * Code that allows the download to searched on. This search code may or may not be unique, and would typically contain key words that allows the download to be found.
    */
    public String downloadSearchCode = new String();

    /**
    * Branding of the download.
    */
    public String brand = new String();

    /**
    * Name of the download
    */
    public String name = new String();

    /**
    * location where the data can be downloaded from
    */
    public String downloadLocation = new String();

    /**
    * key that allows the file to be accessed and downloaded
    */
    public String downloadKey = new String();

    /**
    * First description of the download. May contain any text used to describe the download.
    */
    public String description1 = new String();

    /**
    * Second description of the download. May contain any text used to describe the download.
    */
    public String description2 = new String();

    /**
    * Third description of the download. May contain any text used to describe the download.
    */
    public String description3 = new String();

    /**
    * Fourth description of the download. May contain any text used to describe the download.
    */
    public String description4 = new String();

    /**
    * Class of the download. A class may contain any text that can be set for multiple downloads as a classifier of the type of download.
    */
    public String downloadClass = new String();

    /**
    * United Nations Standard Products and Service Code. Stores a standard code defined by the United Nations classifying objects.
    */
    public String UNSPSC = new String();

    /**
    * Size of the download, in bytes.
    */
    public long downloadSize = 0;

    /**
    * Monetary value that denotes the average cost to purchase a single download unit.
    */
    public double averageCost = 0;

    /**
    * Label of the supplier that the download is purchased from.
    */
    public String supplier = new String();

    /**
    * The amount of download units that are available for purchase.
    */
    public double downloadQuantity = 0;

    /**
    * The amount of download units that indicate when the download is no longer available.
    */
    public double downloadNoneQuantity = 0;

    /**
    * The amount of download units that indicate when the download is no longer available.
    */
    public double downloadLowQuantity = 0;

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that any pricing set for the download is inclusive of tax applied to the price, based the rate of taxcode assigned to the download.
    */
    public String isPriceTaxInclusive = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates download is a kit, and is representative of a number of individual downloads bundled together.
    */
    public String isKitted = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that if the download is marked as a kit then when its pricing is calculated, that the pricing assigned to the download is for the cost of kit.
    * If 'N' then indicated that if the download is marked as a kit then when its pricing is calculated, that the price of the download should be calculated by combining the price of all the component downloads assigned to the kit.
    */
    public String kitSetPrice = new String();
	
	/**
	 * Number to order the download by. This may be used to order a number of downloads within a list.
	 */
	public int ordering = 0;

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