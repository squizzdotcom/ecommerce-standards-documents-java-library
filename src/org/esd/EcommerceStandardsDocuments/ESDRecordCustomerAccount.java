/**
* Copyright (C) 2018 Squizz PTY LTD
* This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
*/
package org.esd.EcommerceStandardsDocuments;


/**
* Ecommerce Standards record that contains data for a single customer account. A customer account represents an entity (such as a person or organisation) that purchases from another entity where the account exists. The customer account may also known as a "debtor".
*/
public class ESDRecordCustomerAccount   
{
    /**
    * Key that allows the customer account record to be uniquely identified and linked to. In other records it may be referred to keyAccountID where appropriate.
    */
    public String keyCustomerAccountID = new String();

    /**
    * Key of the Price Level record that the customer account is assigned to. The price level record may control the price-level pricing available to the account.
    */
    public String keyPriceLevelID = new String();

    /**
    * Code that allows the account to be identified with. May or may not be unique.
    */
    public String customerAccountCode = new String();

    /**
    * list of Ley Location IDs that link any number of locations to the customer account. This may be used to control the locations where customer accounts can purchase from.
    */
    public String[] keyLocationIDs = new String[]{};

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
    * Email address that may be used to contact the entity associated with the customer account.
    */
    public String email = new String();

    /**
    * Field that classifies the customer account.
    */
    public String accountClass = new String();

    /**
    * A comma delimited list of payment types that may be used to pay for the customer account's debts.
    */
    public String paymentTypes = new String();

    /**
    * A list of payment types that may be used to pay for the customer account's debts. Each key relates to a ESDRecordPaymentType record
    */
    public String[] keyPaymentTypeIDs = new String[]{};

    /**
    * Key of the Sales Representative record that links a sales representative to the customer account. The assigned sales representative typically services the account.
    */
    public String keySalesRepID = new String();

    /**
    * Name of the area that is customer account is associated to.
    */
    public String territory = new String();

    /**
    * Percentage amount that the the customer account receives off any applicable pricing.
    */
    public double discount = 0d;

    /**
    * Method that goods ordered by the customer account may be delivered by.
    */
    public String shippingMethod = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the customer account is On Hold and may not be allowed to make any more purchases until it has paid its outstanding debts, or any other conditions.
    */
    public String isOnHold = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the customer account's debt balance is outside of its allowed credit limits.
    */
    public String isOutsideBalance = new String();

    /**
    * Either 'N'-No or
    * 'Y'-Yes
    * If 'Y' then indicates that the customer account is operating outside of the payment terms of its debts, or other predefined terms.
    */
    public String isOutsideTerms = new String();

    /**
    * Either 'OFF'
    * 'BLOCK'
    * 'WARN'
    * 'WARNCC'
    * Sets the action to take if the customer account is being used while it is On Hold. Either it's blocked from further use (BLOCK), or is allowed to be used but a warning is displayed (WARN), or is allowed to be used but a warning is displayed and only new debts may be created when paid with credit card (WARNCC), or no actions need to be taken (OFF)
    */
    public String onHoldAction = new String();

    /**
    * Either 'OFF'
    * 'BLOCK'
    * 'WARN'
    * 'WARNCC'
    * Sets the action to take if the customer account is being used while it is Outside Terms. Either it's blocked from further use (BLOCK), or is allowed to be used but a warning is displayed (WARN), or is allowed to be used but a warning is displayed and only new debts may be created when paid with credit card (WARNCC), or no actions need to be taken (OFF)
    */
    public String outTermsAction = new String();

    /**
    * Either 'OFF'
    * 'BLOCK'
    * 'WARN'
    * 'WARNCC'
    * Sets the action to take if the customer account is being used while it is Outside Its Credit balance. Either it's blocked from further use (BLOCK), or is allowed to be used but a warning is displayed (WARN), or is allowed to be used but a warning is displayed and only new debts may be created when paid with credit card (WARNCC), or no actions need to be taken (OFF)
    */
    public String outCreditAction = new String();

    /**
    * Monetary balance of customer account. If the balance is negative then customer account owes money and is in debt, if the balance is positive then the customer account is owed money and is in credit.
    */
    public double balance = 0d;

    /**
    * Maximum monetary amount that the customer account is allowed to purchase debts to. A positive amount denotes that the account's balance may be in placed in debt. A negative amount denots that the account's balance must stay within positive credit.
    */
    public double limit = 0d;

    /**
    * Either 'GND'-Given Number of Days
    * 'DOM'-Date OF the Month
    * 'NDAE'-Number of Days After the End of the month
    * 'DMAE'-Date of the Month After the End of the month
    * 'COD'-Cash On Delivery
    * 'NA'-Not Applicable
    * Defines the type of terms required by the customer account to pay off its debts, and the length that the terms apply for. Use the ACCOUNT PAYMENT constants of the record to set this value.
    */
    public String termsType = new String();

    /**
    * Readable description of the type of terms required by the customer accounts to pay off its debts
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