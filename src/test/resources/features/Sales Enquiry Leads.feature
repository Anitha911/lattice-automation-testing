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

  @TransLeadsSalesEnquiryOpenTileClick
  Scenario: Should be able to Click Open Tile and corresponding data should be populated in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    When User Clicks the Open Tile in Enquiry page

    #check again
  @TransLeadsSalesEnquirySiteSurveyTitleClick
  Scenario: Should be able to Click SiteSurvey Requested Tile and corresponding data should be populated in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    When User Clicks the Site Survey Requested Tile in Enquiry page

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

  @TransLeadsSalesOpenEnquiryDetailPageEditContact
  Scenario: Should be able to add Open Enquiry Detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on first data in the grid to Open the Detail page
    When User Clicks on Edit Contact 'Edit Contact' in Enquiry Detail Page
    Then User clicks on Update button Edit Contact


  @TransLeadsSalesOpenEnquiryDetailPageStatusSkipSiteSurvey
  Scenario: Should be able to add Open Enquiry Detail page and click Skip Site Survey
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on button Sales Add Enquiry 'Add'
    Then User fills the Enquiry details
    When User selects value in the "Enquiry Source" dropdown
    When User selects value in the "Sales person" dropdown
    Then User Clicks Enquiry Save Button
    Then User clicks on first data in the grid to Open the Detail page
    Then User Clicks on status Update Button 'Status Update' in Enquiry Detail Page
    Then User fills the Enquiry Update Status Pop Up details
    Then User Clicks on Enquiry Update Status Save Button

  @TransLeadsSalesOpenEnquiryDetailPageStatusSiteSurveyRequested
  Scenario: Should be able to add Open Enquiry Detail page and Move enquiry to Site Survey Requested
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on button Sales Add Enquiry 'Add'
    Then User fills the Enquiry details
    When User selects value in the "Enquiry Source" dropdown
    When User selects value in the "Sales person" dropdown
    Then User Clicks Enquiry Save Button
    Then User clicks on first data in the grid to Open the Detail page
    Then User Clicks on status Update Button 'Status Update' in Enquiry Detail Page
    Then User fills the Enquiry Site Survey Requested Update Status Pop Up details
    When User selects value in the "Property" dropdown
    When User selects value in the "Zone" dropdown
    When User selects value in the "Sub Zone" dropdown
    When User selects value in the "Base Unit" dropdown
    #When User selects value in the "Assigned To" dropdown
    Then User Clicks on Enquiry Update Status Save Button

  @TransLeadsSalesOpenEnquiryDetailPageStatusNotToBid
  Scenario: Should be able to add Open Enquiry Detail page and Move enquiry to Not To Bid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    #Then User clicks on button Sales Add Enquiry 'Add'
    #Then User fills the Enquiry details
    #When User selects value in the "Enquiry Source" dropdown
    #When User selects value in the "Sales person" dropdown
    #Then User Clicks Enquiry Save Button
    Then User clicks on first data in the grid to Open the Detail page
    Then User Clicks on status Update Button 'Status Update' in Enquiry Detail Page
    Then User fills the Enquiry Update Status Pop Up Not To Bid details
    Then User Clicks on Enquiry Update Status Save Button

  @TransLeadsSalesOpenEnquiryDetailPageStatusCancelled
  Scenario: Should be able to add Open Enquiry Detail page and Move enquiry to Cancelled
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on button Sales Add Enquiry 'Add'
    Then User fills the Enquiry details
    When User selects value in the "Enquiry Source" dropdown
    When User selects value in the "Sales person" dropdown
    Then User Clicks Enquiry Save Button
    Then User clicks on first data in the grid to Open the Detail page
    Then User Clicks on status Update Button 'Status Update' in Enquiry Detail Page
    Then User fills the Enquiry Update Status Pop Up Cancelled details
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
    #Open Quotations
  @TransConsoleWindowOpenQuotationExportToExcel
  Scenario: Should be able to Open Console Window and Export to Exel Open Quotation
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    When User clicks on Sales Enquiry Management Console Window 'Open Quotations' in side menu
    Then User clicks on Export To Excel Console Window Open Quotations
    # Open Quotations
#Opportunities
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

  @TransLeadsSalesEnquiryQuotationCancelQuoDetailPage
  Scenario: Should be able to add Quotation and Cancel in Quotation Detail Page
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
    Then User Clicks on Quotation section in the left side menu 'Quotation' in Opportunities page
    Then User clicks on first data in the Quotations grid to Open the Detail page
    Then User clicks on Cancel Quotation 'Cancel Quotation' Button

  @TransPendingActionsOpportunitiesExportToExcel
  Scenario: Should be able to Export To Excel Opportunities
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on Sales Enquiry Management My Pending Actions Opportunities 'My Pending Actions Opportunities' in side menu
    Then User clicks on Export To Excel My Pending Actions Opportunities

#prod Package
  @TransSalesProductStoreFrontAdd
  Scenario: Should be able to add B2C Product
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Package Product 'Product Store Front' in side menu
    When User clicks on Sales Enquiry Management Package Product Add 'Add'
    When User enters Product Master Category details
    #When User selects value in the "Product Master Category" dropdown
    #When User selects value in the "Product Category" dropdown
    #When User selects value in the "Product SubCategory" dropdown
    #When User selects value in the "Payment Schedule" dropdown
    #When User selects value in the "WO Type" dropdown
    #When User selects value in the "Fault Code" dropdown
    #When User selects value in the "First PPM After" dropdown
    Then User Clicks on Add Product Save Button

  @TransSalesPackageProductExportToExcel
  Scenario: Should be able to Export to Excel Package Product
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Package Product 'Product Store Front' in side menu
    Then User clicks on Export To Excel Product Store Front

  @TransSalesProdPackageDetailPageUpdate
  Scenario: Should be able to Open Prod Package detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Package Product 'Product Store Front' in side menu
    Then User clicks on first data in the Product Store Front grid to Open the Detail page
    When User Clicks the Edit Product Store Front 'Edit' Button
    Then User Clicks the Product Store Front Update Button

  @TransSalesProdPackageDetailPageAddProdPricing
  Scenario: Should be able to Open Prod Package detail page and add Product Pricing
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Package Product 'Product Store Front' in side menu
    Then User clicks on first data in the Product Store Front grid to Open the Detail page
    When User clicks Product Pricing 'Product Pricing' in the side menu
    Then User clicks Add New Product Pricing 'Add New' Button
    When User enters Product Pricing details
    Then User Clicks on Product Pricing Save Button

  @TransSalesProdPackageDetailPageEditProdPricing
  Scenario: Should be able to Open Prod Package detail page and Edit Product Pricing
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Package Product 'Product Store Front' in side menu
    Then User clicks on first data in the Product Store Front grid to Open the Detail page
    When User clicks Product Pricing 'Product Pricing' in the side menu
    Then User clicks Add New Product Pricing 'Add New' Button
    When User enters Product Pricing details
    Then User Clicks on Product Pricing Save Button
    When User clicks Product Pricing Edit 'Pricing Edit' button
    Then User Clicks on Product Pricing Save Button

#prod Package
#Rate Card
  @TransSalesRateCardAdd
  Scenario: Should be able to add Rate Card
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Rate Card 'Product Rate Card' in side menu
    When User clicks on Sales Enquiry Management Rate Card Add 'Add'
    When User enters Rate Card details
    Then User Clicks on Add RateCard Save Button
    Then User clicks on first data in the Rate Card grid to Open the Detail page

  @TransSalesRateCardEditUpdate
  Scenario: Should be able to Edit Rate Card
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Rate Card 'Product Rate Card' in side menu
    Then User clicks on first data in the Rate Card grid to Open the Detail page
    When User Clicks the Edit RateCard 'Edit' Button
    Then User Clicks the Rate Card Update Button

  @TransSalesRateCardDelete
  Scenario: Should be able to Delete Rate Card
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Rate Card 'Product Rate Card' in side menu
    Then User clicks on first Valid Product Rate Card to delete

  @TransSalesRateCardExportToExcel
  Scenario: Should be able to Export To Excel Rate Card
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Rate Card 'Product Rate Card' in side menu
    Then User clicks on Export To Excel Product Rate Card
#Rate Card

  @TransSalesAwaitingApprovalDetailPage
  Scenario: Should be able to Open Awaiting Approval Detail Page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Awaiting Approval 'Awaiting Approval' in side menu
    Then User clicks on first data in the Awaiting Approval grid to Open the Detail page

  @TransPendingActionsAwaitingApprovalExportToExcel
  Scenario: Should be able to Export To Excel Awaiting Approval
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on Sales Enquiry Management Awaiting Approval 'My Pending Actions Awaiting Approval' in side menu
    Then User clicks on Export To Excel My Pending Actions Awaiting Approval

  @TransSalesAwaitingQuotationApprovalDetailPage
  Scenario: Should be able to Open Awaiting Quotation Approval Detail Page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Awaiting Quotation Approval 'Awaiting Quotation Approval' in side menu
    Then User clicks on first data in the Awaiting Quotation Approval grid to Open the Detail page

  @TransPendingActionsAwaitingQuotationApprovalExportToExcel
  Scenario: Should be able to Export To Excel Awaiting Approval
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    Then User clicks on Sales Enquiry Management Leads 'Sales Enquiry Management Leads' in side menu
    Then User clicks on Sales Enquiry Management Awaiting Quotation Approval 'Awaiting Quotation Approval' in side menu
    Then User clicks on Export To Excel My Pending Actions Awaiting Quotation Approval
    #my Pending Actions

  @TransSalesUpcomingFollowUpDetailPage
  Scenario: Should be able to Open Upcoming Follow Up Detail Page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    When User clicks on Sales Enquiry Management Upcoming Follow Up 'Upcoming Follow Up' in side menu
    Then User clicks on first data in the Upcoming Follow Up grid to Open the Detail page

  @TransSalesAwaitingOrderDetailPage
  Scenario: Should be able to Open Awaiting Order Detail Page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    When User clicks on Sales Enquiry Management Awaiting Order 'Awaiting Order' in side menu
    Then User clicks on first data in the Awaiting Order grid to Open the Detail page

  @TransSalesArchivesSalesOrderDetailPage
  Scenario: Should be able to Open Archives Sales Order Detail Page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    When User clicks on Sales Enquiry Management Archives Sales Order 'Archives Sales Order' in side menu
    Then User clicks on first data in the Archives Sales Order grid to Open the Detail page

  @TransSalesArchivesOrderLostDetailPage
  Scenario: Should be able to Open Order Lost Detail Page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Sales Enquiry Management 'Sales Enquiry Management' in side menu
    When User clicks on Sales Enquiry Management Sales Order lost 'Sales Order lost' in side menu
    Then User clicks on first data in the Sales Order lost grid to Open the Detail page


