/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
 * Ecommerce Standards Record that holds data for a single asset. An asset can be single instance of a tangible or intangible product/service/resource that is created, owned, traded, and may ultimately be destroyed.
 */
public class ESDRecordAsset {
	/**
    * Key that allows the asset record to be uniquely identified and linked to.
	*/
	public String keyAssetID = new String();
	
	/**
    * Code of the asset.  May or may not be a unqiue identifier.
	*/
	public String assetCode = new String();
	
	/**
    * Key of the Product record that the asset is represented by and linked to.
	*/
	public String keyProductID = new String();
	
	/**
    * Key of the Taxcode record that the asset is assigned to. The taxcode may control the amount of tax applied to the asset.
	*/
	public String keyTaxcodeID = new String();
	
	/**
    * Code that allows the asset to searched on. This search code may or may not be unique, and would typically contain key words that allows the asset to found.
	*/
	public String assetSearchCode = new String();
	/**
    * Barcode set for the asset. A barcode is typically displayed on a asset and requires a reader to decipher an image that turns it into a sequence of characters.
	*/
	public String barcode = new String();
	/**
    * Inner barcode set for the asset. Multiple barcodes be assigned to a asset, and the inner barcode could denote one of these barcodes, or it could be a portion of a single barcode.
	*/
	public String barcodeInner = new String();
	/**
    * name of brand that the asset belongs to.
	*/
	public String brand = new String();
	/**
    * Name of the asset. The name provides a label to desribe the overall nature of the asset, making it more easily identifiable to humans
	*/
	public String name = new String();
	/**
    * First description of the asset. May contain any text used to describe the asset.
	*/
	public String description1 = new String();
	/**
    * Second description of the asset. May contain any text used to describe the asset.
	*/
	public String description2 = new String();
	/**
    * Third description of the asset. May contain any text used to describe the asset.
	*/
	public String description3 = new String();
	/**
    * Fourth description of the asset. May contain any text used to describe the asset.
	*/
	public String description4 = new String();
	/**
    * Meta title of the asset. This would typically be used in the meta data of a web page or user interface that may be hidden from being viewed, but contains a label of the asset that systems could utilise or be displayed in an application's header. The data in this field is typically targeted for online search engines.
	*/
	public String metaTitle = new String();
	/**
    * A list of words that describe the asset. This would typically be used in the meta data of a web page or user interface that may be hidden from being viewed, but contains a space delimited list of keywords used by systems to index and allow for searching on the asset. The data in this field is typically targeted for online search engines.
	*/
	public String metaKeywords = new String();
	/**
    * Meta description the asset. This would typically be used in the meta data of a web page or user interface that may be hidden from being viewed, but contains a paragraph of text describing the details of a asset that may be used to index, or display in search listings. The data in this field is typically targeted for online search engines.
	*/
	public String metaDescription = new String();
	/**
    * primary resource path of the asset's Uniform Resource Locator (URL) that allows the asset to be communicated to or found within a public or private computer network
	*/
	public String assetResourceURL = new String();
	/**
    * Class of the asset. A class may contain any text that can be set for multiple assets as a classifier of the type of asset.
	*/
	public String assetClass = new String();
	/**
    * United Nations Standard Assets and Service Code. Stores a standard code defined by the United Nations classifying objects.
	*/
	public String UNSPSC = new String();
	/**
    * Key of the sell unit record that denotes the unit that the asset is sold in.
	*/
	public String keySellUnitID = new String();
	/**
    * Label of the unit that the asset is sold as.
	*/
	public String unit = new String();
	/**
    * Weight of a single asset unit.
	*/
	public double weight = 0d;
	/**
    * Width dimension of the asset.
	*/
	public double width = 0d;
	/**
    * Height dimension of the asset.
	*/
	public double height = 0d;
	/**
    * Depth dimension of the asset.
	*/
	public double depth = 0d;
	/**
    * Weight of the package that the sell unit is contained within.
	*/
	public double packageWeight = 0d;
	/**
    * Width dimension of the package that the sell unit is contained within.
	*/
	public double packageWidth = 0d;
	/**
    * Height dimension of the package that the sell unit is contained within.
	*/
	public double packageHeight = 0d;
	/**
    * Depth dimension of the package that the sell unit is contained within.
	*/
	public double packageDepth = 0d;
	/**
    * Code of the asset's width measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_LENGTH_ in the ESDocumentConstants class
	*/
	public String widthUnitMeasureCode = new String();
	/**
    * Code of the asset's height measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_LENGTH_ in the ESDocumentConstants class
	*/
	public String heightUnitMeasureCode = new String();
	/**
    * Code of the asset's depth measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_LENGTH_ in the ESDocumentConstants class
	*/
	public String depthUnitMeasureCode = new String();
	/**
    * Code of the asset's weight measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_MASS_ in the ESDocumentConstants class
	*/
	public String weightUnitMeasureCode = new String();
	/**
    * Either 'N'-No or 'Y'-Yes
	* If 'Y' then indicates that any pricing set for the asset is inclusive of tax applied to the price, based the rate of taxcode assigned to the asset.
	*/
	public String isPriceTaxInclusive = new String();
	/**
    * Either 'N'-No or 'Y'-Yes
	* If 'Y' then indicates asset is a kit, and is representative of a number of individual assets bundled together.
	*/
	public String isKitted = new String();
	/**
    * Either 'N'-No or 'Y'-Yes
	* If 'N' then indicated that if the asset is marked as a kit then when its pricing is calculated, that the price of the asset should be calculated by combining the price of all the component assets assignd to the kit. 
	*/
	public String kitAssetsSetPrice = new String();
	/**
    * Number to order the asset by. This may be used to order a number of assets within a list.
	*/
	public int ordering = 0;
	/**
    * Date time that the asset was first created. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
	*/
	public long createdDate = 0;
	/**
    * Date time that the asset was destroyed. Date is in the form of a number in milliseconds since the 01-01-1970 12:00am Epoch in UTC time-zone
	*/
	public long destroyedDate = 0;
	/**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed. 
	*  Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
	*/
	public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;
	/**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
	*/
	public String internalID = new String();

	/**
    * Stores a list of sell units that denote different quantities the the asset can be sold in
	*/
	public ESDRecordSellUnit[] sellUnits = new ESDRecordSellUnit[]{};
}
