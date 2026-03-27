@SalesEnquiryLeadsTransaction
Feature: Sales Enquiry Management Leads Transaction Module Automation

  @TransLeadsSalesAddEnquiry
  Scenario: Should be able to add Enquiry
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on button Sales Add Enquiry 'Add'
    Then User fills the Enquiry details
    Then User Clicks Enquiry Save Button
    Then User clicks on first data in the grid to Open the Detail page

  @TransLeadsSalesEnquiryExportToExcel
  Scenario: Should be able to Export to Excel Enquiry
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on Sales Enquiry Management Export to Excel button

  @TransLeadsSalesAddEnquiryAddCustomer
  Scenario: Should be able to add Enquiry add Customer
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on button Sales Add Enquiry 'Add'
    Then User clicks on button Sales Add Enquiry Add Customer 'AddCustomer'
    Then User fills the Customer details
    Then User Clicks on Add Customer Save Button



