@FinancialTrackingModule
Feature: FinancialTracking Module Automation

  @TransFinancialTrackingOnlineOrdersExportToExcel
  Scenario: Should be able to display Online Orders and Export To excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Online Order 'Online Order' in side menu
    When User Clicks on Export to Excel Button

  @TransFinancialTrackingInvoiceAdvices
  Scenario: Should be able to display Invoice Advices
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Invoice Advices 'Invoice Advices' in side menu

  @TransFinancialTrackingInvoiceAdvicesExportToExcel
  Scenario: Should be able to Export to Excel Invoice Advices
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Invoice Advices 'Invoice Advices' in side menu
    When User Clicks on Export to Excel Button

  @TransFinancialTrackingInvoiceAdvicesPrint
  Scenario: Should be able to Print Invoice Advices
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Invoice Advices 'Invoice Advices' in side menu
    When User Clicks on Print Invoice Advices 'Print Invoice Advices' Button

  @TransFinancialTrackingInvoiceReversalSave
  Scenario: Should be able to Do Invoice Reversal
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Invoice Advices 'Invoice Advices' in side menu
    When User Clicks on  Invoice Advice Reversal 'Invoice Advice Reversal' Button
    Then User enters the details in the Invoice Advice Reversal pop up
    When User selects value in the "FinancialTransReason" dropdown
    When User clicks ths Invoice Advice Reversal Save button

  @TransFinancialTrackingScheduledInvoiceExportToExcel
  Scenario: Should be able to Export To Excel Scheduled Invoice
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Scheduled Invoices 'Scheduled Invoices' in side menu
    When User Clicks on Financial Transactions Tracking  Export to Excel Button

  @TransFinancialTrackingScheduledInvoiceGenerateInvoiceClick
  Scenario: Should be able to Generate Scheduled Invoice
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Scheduled Invoices 'Scheduled Invoices' in side menu
    When User Clicks Generate Invoice button 'Generate Invoice Button'

  @TransFinancialTrackingReceiptsExportToExcel
  Scenario: Should be able to Open Receipts
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Receipts 'Receipts' in side menu
    When User Clicks on Financial Transactions Tracking  Export to Excel Button

  @TransFinancialTrackingReceiptsPrint
  Scenario: Should be able to Print Receipts
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Receipts 'Receipts' in side menu
    When User Clicks on Financial Transactions Tracking 'Receipts' Print Button

  @TransFinancialTrackingReceiptsAddCustomerReceipts
  Scenario: Should be able to Add Customer Receipts
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Receipts 'Receipts' in side menu
    When User Clicks on 'Add Customer Receipt' Add Receipt Button
    When User enters the details in the Add Customer Receipt pop up Including Grid Data
    Then User clicks Receipts Save Button

  @TransFinancialTrackingInvoiceAdvicesBulk
  Scenario: Should be able to Open Invoice Advice Bulk and issue Bulk Invoices
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Invoice Advices Bulk 'Invoice Advices Bulk' in side menu
    When User Enters Financial Transactions Tracking Invoice Advices Bulk
    When User Clicks Financial Tracking Apply Filter 'Apply Filter' Button and Check grid first data
    Then User clicks Invoice Advices generate Bulk Invoice 'Generate Bulk Invoice' Button
    When User Clicks generate Bulk Invoice Save Button








