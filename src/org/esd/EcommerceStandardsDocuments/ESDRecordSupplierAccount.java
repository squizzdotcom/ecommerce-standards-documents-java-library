/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;

/**
* Ecommerce Standards record that contains data for a single supplier account. A supplier account represents an entity (such as a person or organisation) that supplies goods/services/items from another external entity. The supplier account may also known as a "creditor".
*/
public class ESDRecordSupplierAccount   
{
    /**
    * Key that allows the supplier account record to be uniquely identified and linked to. In other records it may be referred to keyAccountID where appropriate.
    */
    public String keySupplierAccountID = new String();

    /**
    * Key of the Price Level record that the supplier account is assigned to. The price level record may reflect the price-level pricing associated to the account.
    */
    public String keyPriceLevelID = new String();

    /**
    * Code that allows the account to be identified with. May or may not be unique.
    */
    public String supplierAccountCode = new String();

    /**
    * Name of the account.
    */
    public String accountName = new String();

    /**
    * Name of person associated to the account that can be contacted.
    */
    public String contactName = new String();

    /**
    * Name of the organisation associated to the account.
    */
    public String orgName = new String();

    /**
    * list of numbers of the government, or any other entity records that is associated with the entity. Ensure that the array length is the same as the authorityNumberLabels property, or left empty
    */
    public String[] authorityNumbers = new String[]{};

    /**
    * list of Labels set for the authority numbers. Ensure that the array length is the same as the authorityNumbers property, or left empty
    */
    public String[] authorityNumberLabels = new String[]{};

    /**
    * list of authority number types matching the authority numbers. If set must use the ESDocumentConstants that are prefixed with "AUTHORITY_NUM_". Ensure that the array length is the same as the authorityNumbers property, or left empty.
    */
    public int[] authorityNumberTypes = new int[]{};

    /**
    * Email address that may be used to contact the entity associated with the supplier account.
    */
    public String email = new String();

    /**
    * Field that classifies the supplier account.
    */
    public String accountClass = new String();

    /**
    * A comma delimited list of payment types that may be used to pay for the supplier account's debts.
    */
    public String paymentTypes = new String();

    /**
    * Key of the Purchaser record that links a purchaser to the supplier account. The assigned purchaser typically is in charge of the account.
    */
    public String keyPurchaserID = new String();

    /**
    * Name of the area that is supplier account is associated to.
    */
    public String territory = new String();

    /**
    * Method that goods ordered by the supplier account may be delivered by.
    */
    public String shippingMethod = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the supplier account is On Hold and may not be allowed to make any more purchases with it until its outstanding debts have been paid, or any other conditions.
    */
    public String isOnHold = new String();
    
    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the supplier account's debt balance is outside of its allowed credit limits.
    */
    public String isOutsideBalance = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the supplier account is operating outside of the payment terms of its debts, or other predefined terms.
    */
    public String isOutsideTerms = new String();

    /**
    * Monetary balance of supplier account. If the balance is negative then supplier account owes money and is in debt, if the balance is positive then the supplier account is owed money and is in credit.
    */
    public double balance = 0;

    /**
    * Maximum monetary amount that the supplier account is allowed to purchase debts to. A positive amount denotes that the account's balance may be in placed in debt. A negative amount denots that the account's balance must stay within positive credit.
    */
    public double limit = 0;

    /**
    * Either 'GND'-Given Number of Days
    * 'DOM'-Date OF the Month
    * 'NDAE'-Number of Days After the End of the month
    * 'DMAE'-Date of the Month After the End of the month
    * 'COD'-Cash On Delivery
    * 'NA'-Not Applicable
    * Defines the type of terms required by the supplier account to pay off its debts, and the length that the terms apply for. Use the ACCOUNT PAYMENT constants of the record to set this value.
    */
    public String termsType = new String();

    /**
    * Readable description of the type of terms required by the supplier accounts to pay off its debts
    */
    public String termsDescription = new String();

    /**
    * First value that may be used to calculate the payment terms of the account
    */
    public String termsValue1 = new String();

    /**
    * Second value that may be used to calculate the payment terms of the account
    */
    public String termsValue2 = new String();

    /**
    * Data Record OPeration. Denotes an operation that may need to be performed on the record when it is being processed.
    * Set null, or set it to one of the ESD_RECORD_OPERATION constants in the ESDocumentConstants class to allow the record to be inserted, updated, deleted, or ignored.
    */
    public int drop = ESDocumentConstants.ESD_RECORD_OPERATION_NA;

    /**
    * Stores an identifier that is relevant only to the system referencing and storing the record for its own needs.
    */
    public String internalID = new String();

    /**
    * Payment Terms - Given Number of Days
    */
    public static final String ACCOUNT_PAYMENT_TERMS_GIVEN_NO_DAYS = "GND";
    /**
    * Payment Terms - Day Of the Month
    */
    public static final String ACCOUNT_PAYMENT_TERMS_DAY_OF_MONTH = "DOM";
    /**
    * Payment Terms - Number of Days After the End of the month
    */
    public static final String ACCOUNT_PAYMENT_TERMS_NO_DAYS_AFTER_END_OF_MONTH = "NDAE";
    /**
    * Payment Terms - Date of the Month After the End of the month
    */
    public static final String ACCOUNT_PAYMENT_TERMS_DAY_OF_MONTH_AFTER_DAY_OF_MONTH = "DMAE";
    /**
    * Payment Terms - Cash On Delivery
    */
    public static final String ACCOUNT_PAYMENT_TERMS_CASH_ON_DELIVERY = "COD";
    /**
    * Payment Terms - Not Applicable
    */
    public static final String ACCOUNT_PAYMENT_TERMS_NA = "MA";
}