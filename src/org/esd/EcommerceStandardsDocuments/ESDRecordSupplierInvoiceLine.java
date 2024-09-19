/**
* Copyright (C) Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import java.util.ArrayList;

/**
* Ecommerce Standards Record that holds data for a single line in a supplier's invoice.
*/
public class ESDRecordSupplierInvoiceLine
{
    /**
    * list of attributes associated with the line
    */
    public ArrayList<ESDRecordInvoiceLineAttributeProfile> attributes = new ArrayList<ESDRecordInvoiceLineAttributeProfile>();

    /**
    * list of taxes applied to the line
    */
    public ArrayList<ESDRecordInvoiceLineTax> taxes = new ArrayList<ESDRecordInvoiceLineTax>();

    /**
    * Type of line in the invoice. Set it to a constant prefixed with INVOICE_LINE_TYPE_ in the ESDocumentConstants class
    */
    public String lineType = new String();

	/**
    * Code of the line in the original purchase order associated to the supplier's invoice line
    */
    public String purchaseOrderLineCode = new String();

    /**
    * number of the line in original purchase order associated to the supplier's invoice line
    */
    public String purchaseOrderLineNumber = new String();
	
    /**
    * Code of the line in the supplier's customer invoice associated to the line
    */
    public String customerInvoiceLineCode = new String();

    /**
    * number of the line in the supplier's customer invoice associated to the invoice line
    */
    public String customerInvoiceLineNumber = new String();
	
	/**
    * Code of the line in the supplier's sales order associated to the invoice line
    */
    public String salesOrderLineCode = new String();

    /**
    * number of the line in the supplier's sales order associated to the invoice line
    */
    public String salesOrderLineNumber = new String();

    /**
    * Code of the location that invoice line is assigned to.
    */
    public String locationCode = new String();

    /**
    * Name of the location that the invoice line is assigned to.
    */
    public String locationName = new String();

    /**
    * Key of the location record that the invoice line is assigned to. Indicates the location that the invoiced goods are being delivered to
    */
    public String keyLocationID = new String();
	
	/**
	 * key of the external location where the products for the invoice can be found. This external location may be the location where goods are being delivered to or held at.
	 */
	public String externalKeyLocationID = new String();
	
	/**
	 * Code of the external location. This external location may be the location where goods are being delivered to or held at.
	 */
	public String externalLocationCode = new String();
	
	/**
	 * Name of the external location. This external location may be the location where goods are being delivered to or held at.
	 */
	public String externalLocationName = new String();

    /**
    * United Nations Standard Products and Service Code. Stores a standard code defined by the United Nations classifying objects.
    */
    public String UNSPSC = new String();

    /**
    * Language that the descriptive text of the line is  in. Set it to a constant prefixed with LANG_ in the ESDocumentConstants class
    */
    public String language = new String();
	
	/**
    * Either
    * N-No, Y-Yes
    * If 'Y' then indicates that the product purchased should be stored in inventory and kept track of.
    */
    public String isInventoried = ESDocumentConstants.ESD_VALUE_NO;

    /**
    * Quantity of units invoiced.
    */
    public double quantityInvoiced = 0;
	
	/**
    * Quantity of units delivered.
    */
    public double quantityDelivered = 0;
	
	/**
    * Quantity of units back ordered.
    */
    public double quantityBackordered = 0;
	
	/**
    * Quantity of units that were ordered.
    */
    public double quantityOrdered = 0;

    /**
    * Monetary price of the line's unit, excluding tax.
    */
    public double priceExTax = 0;

    /**
    * Monetary price of the line's unit, including tax.
    */
    public double priceIncTax = 0;

    /**
    * Monetary price of the tax applied to the line's unit.
    */
    public double priceTax = 0;

    /**
    * Monetary price of the line's unit before any discounting was applied, exclusive of tax.
    */
    public double priceUndiscountedExTax = 0;

    /**
    * Monetary price of the line's unit before any discounting was applied, inclusive of tax.
    */
    public double priceUndiscountedIncTax = 0;

    /**
    * Monetary price of tax applied the line's unit before any discounting was applied.
    */
    public double priceUndiscountedTax = 0;

    /**
    * Total monetary price of the quantity of unit's invoiced, excluding tax.
    */
    public double priceTotalExTax = 0;

    /**
    * Total monetary price of the quantity of unit's invoiced, including tax.
    */
    public double priceTotalIncTax = 0;

    /**
    * Total monetary price of the tax applied over the total quantity of unit's invoiced.
    */
    public double priceTotalTax = 0;

    /**
    * Total monetary price of the quantity of unit's invoiced before discounting, excluding tax.
    */
    public double priceTotalUndiscountedExTax = 0;

    /**
    * Total monetary price of the quantity of unit's invoiced before discounting, including tax.
    */
    public double priceTotalUndiscountedIncTax = 0;

    /**
    * Total monetary price of the tax applied over the total quantity of unit's invoiced before discounting.
    */
    public double priceTotalUndiscountedTax = 0;

    /**
    * Either
    * N-No, Y-Yes
    * If 'Y' then indicates that the price of the line was explicitly priced at 0.
    */
    public String isPriceFree = new String();

    /**
    * Sets which system or person  the pricing of the line. Set it to a constant prefixed with ENTITY_SET_PRICE_ in the ESDocumentConstants class
    */
    public String entitySetPrice = new String();

    /**
    * Name of the unit  for the line.
    */
    public String unitName = new String();

    /**
    * Key of the sell unit that the line is assigned to.
    */
    public String keySellUnitID = new String();

    /**
    * Sets the unit quantity of the invoiced line that makes up the base quantity. Eg. if the line was bought as a pack, this would indicate that a pack sell unit type consists of "6" individual units.
    */
    public double sellUnitBaseQuantity = 0;

    /**
    * Code that the pricing references.
    */
    public String priceReferenceCode = new String();

    /**
    * Type of entity that the price is referenced to. Typically use one of the PRICE constants in th ESDRecordProductPrice class to  this field, or leave it empty.
    */
    public String priceReferenceType = new String();

    /**
    * Either
    * NNoYYes
    * If 'Y' then indicates that the line is associated to a product that is the parent of a kit.
    */
    public String isKitted = new String();

    /**
    * Either
    * NNoYYes
    * If 'Y' then indicates that the line has been priced based on the component product of a product kit.
    */
    public String kittedProductSetPrice = new String();

    /**
    * Either
    * NNoYYes
    * If 'Y' then indicates quantity in the line should be reserved.
    */
    public String isReserved = new String();

    // product fields
    /**
    * Key of the product record associated to the line. Only relevent when the lineType has been  to product
    */
    public String keyProductID = new String();

    /**
    * Code the product in the line.
    */
    public String productCode = new String();

    /**
    * name of the product in the line
    */
    public String productName = new String();

    /**
    * text to describe details of the product in the line
    */
    public String productDescription = new String();
	
	/**
    * code of the product in the supplier's customer invoice, that stores the code of the customer's product
    */
    public String customerInvoiceProductCode = new String();
	
	/**
    * code of the product in the supplier's sales order, that stores the code of the supplier's product originally ordered
    */
    public String salesOrderProductCode = new String();
	
	/**
    * code of the product in the customer's purchase order, that stores the code of the customer's product originally ordered
    */
    public String purchaseOrderProductCode = new String();

    /**
    * Width measurement of the product.
    */
    public double width = 0;

    /**
    * Height measurement of the product.
    */
    public double height = 0;

    /**
    * Depth measurement of the product.
    */
    public double depth = 0;

    /**
    * Volume measurement of the product.
    */
    public double volume = 0;

    /**
    * Weight measurement of the product.
    */
    public double weight = 0;

    /**
    * Code of the product's width measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_LENGTH_ in the ESDocumentConstants class
    */
    public String widthUnitMeasureCode = new String();

    /**
    * Code of the product's height measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_LENGTH_ in the ESDocumentConstants class
    */
    public String heightUnitMeasureCode = new String();

    /**
    * Code of the product's depth measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_LENGTH_ in the ESDocumentConstants class
    */
    public String depthUnitMeasureCode = new String();

    /**
    * Code of the product's volume measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_VOLUME_ in the ESDocumentConstants class
    */
    public String volumeUnitMeasureCode = new String();

    /**
    * Code of the product's weight measurement to define the unit of measurement. Set it to a constant prefixed with UNIT_MEASURE_MASS_ in the ESDocumentConstants class
    */
    public String weightUnitMeasureCode = new String();

    // download fields
    /**
    * Key of the download record associated to the line. Only relevent when the lineType has been  to download
    */
    public String keyDownloadID = new String();

    /**
    * Code the download in the line.
    */
    public String downloadCode = new String();

    /**
    * name the download in the line.
    */
    public String downloadName = new String();

    /**
    * description the download in the line.
    */
    public String downloadDescription = new String();
	
	/**
    * code of the download in the supplier's customer invoice, that stores the code of the customer's download
    */
    public String customerInvoiceDownloadCode = new String();
	
	/**
    * code of the download in the supplier's sales order, that stores the code of the supplier's download originally ordered
    */
    public String salesOrderDownloadCode = new String();
	
	/**
    * code of the download in the customer's purchase order, that stores the code of the customer's download originally ordered
    */
    public String purchaseOrderDownloadCode = new String();
	
	// asset fields
    /**
    * Key of the asset record associated to the line. Only relevent when the lineType has been to asset
    */
    public String keyAssetID = new String();

    /**
    * Code the asset in the line.
    */
    public String assetCode = new String();

    /**
    * name the asset in the line.
    */
    public String assetName = new String();

    /**
    * description the asset in the line.
    */
    public String assetDescription = new String();
	
	/**
    * code of the asset in the supplier's customer invoice, that stores the code of the customer's asset
    */
    public String customerInvoiceAssetCode = new String();
	
	/**
    * code of the asset in the supplier's sales order, that stores the code of the supplier's asset originally ordered
    */
    public String salesOrderAssetCode = new String();
	
	/**
    * code of the asset in the purchase order associated to the sales order
    */
    public String purchaseOrderAssetCode = new String();

    // labour fields
    /**
    * Key of the labour record associated to the line. Only relevent when the lineType has been  to labour
    */
    public String keyLabourID = new String();

    /**
    * Code the labour in the line.
    */
    public String labourCode = new String();

    /**
    * name the labour in the line.
    */
    public String labourName = new String();

    /**
    * text to describe details of the labour in the line
    */
    public String labourDescription = new String();
	
	/**
    * code of the labour in the supplier's customer invoice, that stores the code of the labour's download
    */
    public String customerInvoiceLabourCode = new String();
	
	/**
    * code of the labour in the supplier's sales order, that stores the code of the supplier's labour originally ordered
    */
    public String salesOrderLabourCode = new String();
	
	/**
    * code of the labour in the customer's purchase order, that stores the code of the customer's labour originally ordered
    */
    public String purchaseOrderLabourCode = new String();
    
    /**
    * text to describe details or comment of a text line
    */
    public String textDescription = new String();
    
    /**
    * Code of the supplier's product/labour/download that the line is associated to
    */
    public String supplierItemCode = new String();
	
	/**
    * Key of the general ledger account that the line is assigned to. This links the invoice line to the general ledger account that the purchase may be reported against for accounting purposes.
	*/
	public String keyGLAccountID = new String();

	/**
    * Code of the general ledger account that the line is assigned to. The code can be used to identify the general ledger account that the purchase may be reported against for accounting purposes.
	*/
	public String glAccountCode = new String();

	/**
    * Name of the general ledger account that the line is assigned to. The name can be used to identify the general ledger account that the purchase may be reported against for accounting purposes.
	*/
	public String glAccountName = new String();

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
        if (attributes == null)
        {
            attributes = new ArrayList<ESDRecordInvoiceLineAttributeProfile>();
        }
        else
        {
            for (ESDRecordInvoiceLineAttributeProfile lineAttributeProfile : attributes)
            {
                lineAttributeProfile.setDefaultValuesForNullMembers();
            }
        } 
        if (taxes == null)
        {
            taxes = new ArrayList<ESDRecordInvoiceLineTax>();
        }
        else
        {
            for (ESDRecordInvoiceLineTax lineTax : taxes)
            {
                lineTax.setDefaultValuesForNullMembers();
            }
        }
		
        if (lineType == null)
        {
            lineType = "";
        }
         
        if (locationCode == null)
        {
            locationCode = "";
        }
         
        if (locationName == null)
        {
            locationName = "";
        }
         
        if (keyLocationID == null)
        {
            keyLocationID = "";
        }
		
		if (externalKeyLocationID == null)
		{
			externalKeyLocationID = "";
		}

		if (externalLocationCode == null)
		{
			externalLocationCode = "";
		}

		if (externalLocationName == null)
		{
			externalLocationName = "";
		}
         
        if (UNSPSC == null)
        {
            UNSPSC = "";
        }
         
        if (language == null)
        {
            language = "";
        }
         
        if (salesOrderLineCode == null)
        {
            salesOrderLineCode = "";
        }
         
        if (salesOrderLineNumber == null)
        {
            salesOrderLineNumber = "";
        }
         
        if (isPriceFree == null)
        {
            isPriceFree  = ESDocumentConstants.ESD_VALUE_NO;
        }
         
        if (entitySetPrice == null)
        {
            entitySetPrice = ESDocumentConstants.ENTITY_SET_PRICE_SYSTEM;
        }
         
        if (unitName == null)
        {
            unitName = "";
        }
		
		if(isInventoried == null)
		{
			isInventoried = ESDocumentConstants.ESD_VALUE_NO;
		}
         
        if (priceReferenceCode == null)
        {
            priceReferenceCode = "";
        }
         
        if (priceReferenceType == null)
        {
            priceReferenceType = "";
        }
         
        if (keySellUnitID == null)
        {
            keySellUnitID = "";
        }
         
        if (productCode == null)
        {
            productCode = "";
        }
         
        if (productName == null)
        {
            productName = "";
        }
         
        if (keyProductID == null)
        {
            keyProductID = "";
        }
         
        if (productDescription == null)
        {
            productDescription = "";
        }
		
		if (customerInvoiceProductCode == null)
        {
            customerInvoiceProductCode = "";
        }
		
		if (salesOrderProductCode == null)
        {
            salesOrderProductCode = "";
        }
		
		if (purchaseOrderProductCode == null)
        {
            purchaseOrderProductCode = "";
        }
         
        if (widthUnitMeasureCode == null)
        {
            widthUnitMeasureCode = "";
        }
         
        if (heightUnitMeasureCode == null)
        {
            heightUnitMeasureCode = "";
        }
         
        if (depthUnitMeasureCode == null)
        {
            depthUnitMeasureCode = "";
        }
         
        if (volumeUnitMeasureCode == null)
        {
            volumeUnitMeasureCode = "";
        }
         
        if (weightUnitMeasureCode == null)
        {
            weightUnitMeasureCode = "";
        }
         
        if (downloadCode == null)
        {
            downloadCode = "";
        }
         
        if (keyDownloadID == null)
        {
            keyDownloadID = "";
        }
         
        if (downloadName == null)
        {
            downloadName = "";
        }
         
        if (downloadDescription == null)
        {
            downloadDescription = "";
        }
		
		if (customerInvoiceDownloadCode == null)
        {
            customerInvoiceDownloadCode = "";
        }
		
		if (salesOrderDownloadCode == null)
        {
            salesOrderDownloadCode = "";
        }
		
		if (purchaseOrderDownloadCode == null)
        {
            purchaseOrderDownloadCode = "";
        }
		
		if (assetCode == null){
			assetCode = "";
		}

		if (keyAssetID == null){
			keyAssetID = "";
		}

		if (assetName == null){
			assetName = "";
		}

		if (assetDescription == null){
			assetDescription = "";
		}

		if (salesOrderAssetCode == null){
			salesOrderAssetCode = "";
		}
		
		if (customerInvoiceAssetCode == null)
        {
            customerInvoiceAssetCode = "";
        }
		
		if (salesOrderAssetCode == null)
        {
            salesOrderAssetCode = "";
        }
		
		if (purchaseOrderAssetCode == null)
        {
            purchaseOrderAssetCode = "";
        }
         
        if (labourCode == null)
        {
            labourCode = "";
        }
         
        if (keyLabourID == null)
        {
            keyLabourID = "";
        }
         
        if (labourName == null)
        {
            labourName = "";
        }
         
        if (labourDescription == null)
        {
            labourDescription = "";
        }
		
		if (customerInvoiceLabourCode == null)
        {
            customerInvoiceLabourCode = "";
        }
		
		if (salesOrderLabourCode == null)
        {
            salesOrderLabourCode = "";
        }
		
		if (purchaseOrderLabourCode == null)
        {
            purchaseOrderLabourCode = "";
        }
         
        if (isKitted == null)
        {
            isKitted = ESDocumentConstants.ESD_VALUE_NO;
        }
         
        if (kittedProductSetPrice == null)
        {
            kittedProductSetPrice = ESDocumentConstants.ESD_VALUE_NO;
        }
         
        if (isReserved == null)
        {
            isReserved = ESDocumentConstants.ESD_VALUE_NO;
        }
        
        if(textDescription == null)
        {
            textDescription = "";
        }
         
        if (internalID == null)
        {
            internalID = "";
        }     
		
		if(supplierItemCode == null)
		{
			supplierItemCode = "";
		}
    }
}
