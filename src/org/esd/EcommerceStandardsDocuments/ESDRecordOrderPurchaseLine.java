/**
* Copyright (C) 2016 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

import java.util.ArrayList;

/**
* Ecommerce Standards Record that holds data for a single line in a purchase order.
*/
public class ESDRecordOrderPurchaseLine   
{
    /**
    * list of product delivery records for the order
    */
    public ArrayList<ESDRecordOrderProductDelivery> productDeliveries = new ArrayList<ESDRecordOrderProductDelivery>();

    /**
    * list of attributes associated with the line
    */
    public ArrayList<ESDRecordOrderLineAttributeProfile> attributes = new ArrayList<ESDRecordOrderLineAttributeProfile>();

    /**
    * list of taxes applied to the line
    */
    public ArrayList<ESDRecordOrderLineTax> taxes = new ArrayList<ESDRecordOrderLineTax>();

    /**
    * Type of line  in the order. Set it to a constant prefixed with ORDER_LINE_TYPE_ in the ESDocumentConstants class
    */
    public String lineType = new String();

    /**
    * Code of the line in the sales order associated to the purchase order.
    */
    public String salesOrderLineCode = new String();

    /**
    * number of the line in the sales order associated to the purchase order.
    */
    public String salesOrderLineNumber = new String();

    /**
    * Code of the location that order line is assigned to.
    */
    public String locationCode = new String();

    /**
    * Name of the location that the order line is assigned to.
    */
    public String locationName = new String();

    /**
    * Key of the location record that the order line is assigned to.
    */
    public String keyLocationID = new String();

    /**
    * United Nations Standard Products and Service Code. Stores a standard code defined by the United Nations classifying objects.
    */
    public String UNSPSC = new String();

    /**
    * Language that the descriptive text of the line is  in. Set it to a constant prefixed with LANG_ in the ESDocumentConstants class
    */
    public String language = new String();

    /**
    * Quantity of units ordered.
    */
    public double quantity = 0;

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
    * Total monetary price of the quantity of unit's ordered, excluding tax.
    */
    public double priceTotalExTax = 0;

    /**
    * Total monetary price of the quantity of unit's ordered, including tax.
    */
    public double priceTotalIncTax = 0;

    /**
    * Total monetary price of the tax applied over the total quantity of unit's ordered.
    */
    public double priceTotalTax = 0;

    /**
    * Total monetary price of the quantity of unit's ordered before discounting, excluding tax.
    */
    public double priceTotalUndiscountedExTax = 0;

    /**
    * Total monetary price of the quantity of unit's ordered before discounting, including tax.
    */
    public double priceTotalUndiscountedIncTax = 0;

    /**
    * Total monetary price of the tax applied over the total quantity of unit's ordered before discounting.
    */
    public double priceTotalUndiscountedTax = 0;

    /**
    * Either
    * NNoYYes
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
    * Sets the unit quantity of the ordered line that makes up the base quantity. Eg. if the line was bought as a pack, this would indicate that a pack sell unit type consists of "6" individual units.
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
    * code of the product in the purchase order associated to the sales order
    */
    public String salesOrderProductCode = new String();

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
    * Code of the product's width measurement to define the unit of measurement.
    */
    public String widthUnitMeasureCode = new String();

    /**
    * Code of the product's height measurement to define the unit of measurement.
    */
    public String heightUnitMeasureCode = new String();

    /**
    * Code of the product's depth measurement to define the unit of measurement.
    */
    public String depthUnitMeasureCode = new String();

    /**
    * Code of the product's volume measurement to define the unit of measurement.
    */
    public String volumeUnitMeasureCode = new String();

    /**
    * Code of the product's weight measurement to define the unit of measurement.
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
    * code of the download in the purchase order associated to the sales order
    */
    public String salesOrderDownloadCode = new String();

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
    * code of the labour in the purchase order associated to the sales order
    */
    public String salesOrderLabourCode = new String();

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
    public void DefaultValuesForNullMembers(){
        if (attributes == null)
        {
            attributes = new ArrayList<ESDRecordOrderLineAttributeProfile>();
        }
        else
        {
            for (ESDRecordOrderLineAttributeProfile lineAttributeProfile : attributes)
            {
                lineAttributeProfile.setDefaultValuesForNullMembers();
            }
        } 
        if (taxes == null)
        {
            taxes = new ArrayList<ESDRecordOrderLineTax>();
        }
        else
        {
            for (ESDRecordOrderLineTax lineTax : taxes)
            {
                lineTax.setDefaultValuesForNullMembers();
            }
        } 
        if (productDeliveries == null)
        {
            productDeliveries = new ArrayList<ESDRecordOrderProductDelivery>();
        }
        else
        {
            for (ESDRecordOrderProductDelivery delivery : productDeliveries)
            {
                delivery.setDefaultValuesForNullMembers();
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
            isPriceFree  = "N";
        }
         
        if (entitySetPrice == null)
        {
            entitySetPrice = "SYSTEM";
        }
         
        if (unitName == null)
        {
            unitName = "";
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
         
        if (salesOrderProductCode == null)
        {
            salesOrderProductCode = "";
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
         
        if (salesOrderDownloadCode == null)
        {
            salesOrderDownloadCode = "";
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
         
        if (salesOrderLabourCode == null)
        {
            salesOrderLabourCode = "";
        }
         
        if (isKitted == null)
        {
            isKitted = "N";
        }
         
        if (kittedProductSetPrice == null)
        {
            kittedProductSetPrice = "N";
        }
         
        if (isReserved == null)
        {
            isReserved = "N";
        }
         
        if (internalID == null)
        {
            internalID = "";
        }         
    }
}