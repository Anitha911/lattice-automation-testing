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

  @TransFinancialTrackingScheduledInvoiceGridPagination
  Scenario: Should be able to move to next page in the grid in Scheduled Invoice
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Scheduled Invoices 'Scheduled Invoices' in side menu
    When User Clicks on Financial Transactions Tracking Scheduled Invoices grid 'pagination'

  @TransFinancialTrackingScheduledInvoiceDataPerPage
  Scenario: Should be able to Open Scheduled Invoice and check data per page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Scheduled Invoices 'Scheduled Invoices' in side menu
    When User clicks the Financial Transactions Tracking Scheduled Invoice no of data per page 10 in the grid

  @TransFinancialTrackingReceiptsExportToExcel
  Scenario: Should be able to Open Receipts and Export to Excel
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
    When User Clicks on Financial Transactions Tracking Print Button

  @TransFinancialTrackingReceiptsAddCustomerReceipts
  Scenario: Should be able to Add Customer Receipts
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Receipts 'Receipts' in side menu
    When User Clicks on 'Add Customer Receipt' Add Receipt Button
    When User enters the details in the Add Customer Receipt pop up Including Grid Data
    Then User clicks Receipts Save Button

  @TransFinancialTrackingReceiptsGridPagination
  Scenario: Should be able to move to Receipts next page when Grid Pagination is done
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Receipts 'Receipts' in side menu
    When User Clicks on Financial Transactions Tracking Receipts grid 'pagination'

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

  @TransFinancialTrackingInvoiceAdvicesBulkGridPagination
  Scenario: Should be able to Open Invoice Advice Bulk and Navigate to next page in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Invoice Advices Bulk 'Invoice Advices Bulk' in side menu
    When User Clicks on Financial Transactions Tracking Invoice Advices Bulk grid 'pagination'

  @TransFinancialTrackingCreditNotesExportToExcel
  Scenario: Should be able to Open Credit Notes and Export to Excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Credit Notes 'Credit Notes' in side menu
    When User Clicks on Financial Transactions Tracking  Export to Excel Button

  @TransFinancialTrackingCreditNotesPrint
  Scenario: Should be able to Print Credit Notes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Credit Notes 'Credit Notes' in side menu
    When User Clicks on Financial Transactions Tracking Print Button

  @TransFinancialTrackingCreditNotesPagination
  Scenario: Should be able to Do Credit Notes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Credit Notes 'Credit Notes' in side menu
    When User Clicks on Financial Transactions Tracking Credit Notes grid 'pagination'

  @TransFinancialTrackingAdhocPurchaseTileClick
  Scenario: Should be able to Click the Adhoc Purchase Tile
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Adhoc Purchase 'Adhoc Purchase' in side menu
    When User clicks the Claimed 'Claimed' Tile
    When User clicks the Pending 'Pending' Tile

  @TransFinancialTrackingAdhocPurchaseExportToExcel
  Scenario: Should be able to Open Adhoc Purchase and Export to Excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Adhoc Purchase 'Adhoc Purchase' in side menu
    When User Clicks on Financial Transactions Tracking Adhoc Purchase Export to Excel Button

  @TransFinancialTrackingAdhocPurchaseApplyFilterAndClaim
  Scenario: Should be able to Apply Filter and Claim
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Adhoc Purchase 'Adhoc Purchase' in side menu
    When User selects value in the Technician Name Adhoc Purchase dropdown
    When User clicks Adhoc Purchase Apply Filter button
    Then User clicks the Adhoc Purchase Claim Button

  @TransFinancialTrackingAdhocPurchaseGridPagination
  Scenario: Should be able to Open Adhoc Purchase and Navigate to next page in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Adhoc Purchase 'Adhoc Purchase' in side menu
    When User Clicks on Financial Transactions Tracking Adhoc Purchase grid 'pagination'

  @TransFinancialTrackingAdhocPurchaseGridDataPerPage
  Scenario: Should be able to Open Adhoc Purchase check data per page in the  grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Adhoc Purchase 'Adhoc Purchase' in side menu
    When User clicks the Financial Transactions Tracking Adhoc Purchase no of data per page 10 in the grid

  @TransFinancialTrackingBulkInvoiceGridDataPerPage
  Scenario: Should be able to Open Bulk Invoice check data per page in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Financial Transactions Tracking 'Financial Transactions Tracking' in side menu
    Then User Clicks on Financial Transactions Tracking Invoice Advices Bulk 'Invoice Advices Bulk' in side menu
    When User clicks the Financial Transactions Tracking Bulk Invoice Advice no of data per page 10 in the grid







