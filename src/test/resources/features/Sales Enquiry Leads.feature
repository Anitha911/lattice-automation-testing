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
    When User selects value in the "Customer Name" dropdown
    When User selects value in the "Enquiry Source" dropdown
    When User selects value in the "Sales person" dropdown
    Then User Clicks Enquiry Save Button

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
    When User selects value in the "Type" dropdown
    When User selects value in the "Country" dropdown
    When User selects value in the "City" dropdown
    When User selects value in the "Customer Importance" dropdown
    Then User Clicks on Add Customer Save Button

  @TransLeadsSalesOpenEnquiryDetailPage
  Scenario: Should be able to add Open Enquiry Detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on first data in the grid to Open the Detail page
    Then User Clicks on status Update Button 'Status Update' in Enquiry Detail Page
    Then User fills the Enquiry Update Status Pop Up details
    Then User Clicks on Enquiry Update Status Save Button

  @TransLeadsSalesEnquiryDetailPageAddCustomerFollowUp
  Scenario: Should be able to Open Enquiry Detail page and Add Customer Follow Up
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on first data in the grid to Open the Detail page
    When User clicks on Customer Follow Up Button 'Add Follow Up' in Enquiry Detail Page
    Then User enters the Customer Follow Up Details
    Then User clicks the Customer Follow Up Button

  @TransLeadsSalesEnquiryDetailPageAddNotes
  Scenario: Should be able to Open Enquiry Detail page and Add Enquiry Notes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    When User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on first data in the grid to Open the Detail page
    When User clicks on Notes 'Notes' in Enquiry Detail Page
    Then User Clicks on Add Notes 'Notes'
    Then User enters the Notes Details
    Then User clicks the Notes Save Button

  @TransLeadsSalesEnquiryAddQuotationDraft
  Scenario: Should be able to add Quotation and Save as Draft
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on Sales Enquiry Management My Pending Actions Opportunities 'My Pending Actions Opportunities' in side menu
    Then User clicks on first data in the opportunities grid to Open the Detail page
    Then User Clicks on Quotation section in the left side menu 'Quotation' in Opportunities page
    When User Clicks on Add Quotation 'Add New Quotation' Button
    When User Clicks on Quotation Details 'Add Lines' Button
    Then User enters on Quotation Add Lines Details
    Then User clicks the Quotation Save 'Draft' Button

  @TransLeadsSalesEnquiryAddQuotationFinalize
  Scenario: Should be able to add Quotation and Finalize
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on Sales Enquiry Management My Pending Actions Opportunities 'My Pending Actions Opportunities' in side menu
    Then User clicks on first data in the opportunities grid to Open the Detail page
    Then User Clicks on Quotation section in the left side menu 'Quotation' in Opportunities page
    Then User clicks on first data in the Quotations grid to Open the Detail page
    Then User Clicks Scope Of Work data in the 'Scope of Work' Tab
    Then User enters Scope Of Work data Details
    Then User clicks the Quotation Save Finalize 'Finalize' Button
    Then User clicks the Quotation Submit 'Submit' Button

  @TransSalesProductStoreFrontAdd
  Scenario: Should be able to add B2C Product
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Package Product 'Product Store Front' in side menu
    When User clicks on Sales Enquiry Management Package Product Add 'Add'
    When User enters Product Master Category details
    When User selects value in the "Product Master Category" dropdown
    When User selects value in the "Product Category" dropdown
    When User selects value in the "Product SubCategory" dropdown
    When User selects value in the "Payment Schedule" dropdown
    When User selects value in the "WO Type" dropdown
    When User selects value in the "Fault Code" dropdown
    When User selects value in the "First PPM After" dropdown
    Then User Clicks on Add Product Save Button

  @TransSalesRateCardAdd
  Scenario: Should be able to add Rate Card
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Rate Card 'Product Rate Card' in side menu
    When User clicks on Sales Enquiry Management Rate Card Add 'Add'
    When User enters Rate Card details
    Then User Clicks on Add RateCard Save Button





