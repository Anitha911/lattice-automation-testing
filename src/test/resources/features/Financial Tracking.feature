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


