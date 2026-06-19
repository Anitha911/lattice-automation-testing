@dataconfigsalesEnquiry
Feature: Sales Enquiry data configuration Module Automation

  @SalesMasteraddClientTypes
  Scenario: Should be able to add Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on button Sales client types add 'Add'
    Then User fills up the 'Client Type Name' details
    Then User clicks on Client Type save button
    Then User verify if the Client Type is created

  @SalesMasterEditClientTypes
  Scenario: Should be able to add Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on active Client Type in the grid
    Then User clicks on Client Type save button
    Then User verify if the Client Type is created

  @SalesMasterDeleteClientTypes
  Scenario: Should be able to Delete Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on active Client Type in the grid to delete
    Then User verify if the Client Type is deleted

    @ExporttoExcelClientTypes
    Scenario: Should be able to export to Excel Sales Client Type
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on Data Config 'Data configuration' in side menu
      Then User clicks on the additional masters Sales 'string' tab
      Then User clicks on Sales Client Type Export to Excel button

    @SalesMasteraddEnquiryTypes
    Scenario: Should be able to Add Sales Enquiry Type
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on Data Config 'Data configuration' in side menu
      Then User clicks on the additional masters Sales 'string' tab
      Then User clicks on the sales master 'Sales Enquiry Types' in side menu
      Then User clicks on button Sales Enquiry types add 'Add'
      Then User fills up the Enquiry type 'Enquiry Type Name' details
      Then User clicks on Enquiry Type save button
      Then User verify if the Enquiry Type is created

    @SalesMasterEditEnquiryTypes
    Scenario: Should be able to Edit Sales Enquiry Type
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on Data Config 'Data configuration' in side menu
      Then User clicks on the additional masters Sales 'string' tab
      Then User clicks on the sales master 'Sales Enquiry Types' in side menu
      Then User clicks on active Enquiry Type in the grid
      Then User clicks on Enquiry Type save button
      Then User verify if the Enquiry Type is created

  @SalesMasterDeleteEnquiryTypes
  Scenario: Should be able to Delete Sales Enquiry Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master 'Sales Enquiry Types' in side menu
    Then User clicks on active Enquiry Type in the grid to delete
    Then User verify if the Enquiry Type is deleted

  @ExporttoExcelEnquiryTypes
  Scenario: Should be able to export to Excel Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master 'Sales Enquiry Types' in side menu
    Then User clicks on Sales Enquiry Type Export to Excel button

  @SalesMasteraddEnquirySources
  Scenario: Should be able to Add Sales Enquiry Sources
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on button Sales Enquiry Source add 'Add'
    Then User fills up the Enquiry Source 'Enquiry Source Name' details
    Then User clicks on Enquiry Source save button
    Then User verify if the Enquiry Source is created

  @SalesMasterEditEnquirySources
  Scenario: Should be able to Edit Sales Enquiry Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on active Enquiry Source in the grid
    Then User clicks on Enquiry Source save button
    Then User verify if the Enquiry Source is created

  @SalesMasterDeleteEnquirySources
  Scenario: Should be able to delete Sales Enquiry Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on active Enquiry Source in the grid to delete
    Then User verify if the Enquiry Source is deleted

  @ExporttoExcelEnquirySources
  Scenario: Should be able to delete Sales Enquiry Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on Sales Enquiry Source Export to Excel button

  @SalesMasteraddTermsandConditions
  Scenario: Should be able to Add Sales Terms and Conditions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on button Sales Terms and Conditions add 'Add'
    Then User fills up the Enquiry Terms and Conditions 'Sales T and C' details
    Then User clicks on Sales T and C save button
    Then User verify if the Sales T and C is created

  @SalesMasterEditTermsandConditions
  Scenario: Should be able to Edit Sales Terms and Conditions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on active T and C in the grid
    Then User clicks on Sales T and C update button
    Then User verify if the Sales T and C is created

  @SalesMasterDeleteTermsandConditions
  Scenario: Should be able to Delete Terms and Conditions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on active T and C in the grid to delete
    Then User verify if the T and C is deleted

  @SalesMasterExporttoExcelTermsandConditions
  Scenario: Should be able to Export To Excel Terms and Conditions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on T and C Export to Excel Button

  @SalesMasteraddExclusions
  Scenario: Should be able to Add Sales Exclusions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on button Sales Sales Exclusion add 'Add'
    Then User fills up the Enquiry Sales Exclusion 'Sales Exclusion' details
    Then User clicks on Sales Exclusion save button
    Then User verify if the Sales Exclusion is created

  @SalesMasterEditExclusions
  Scenario: Should be able to Edit Sales Exclusions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on active Enquiry Exclusion in the grid
    Then User clicks on Sales Exclusion save button
    Then User verify if the Sales Exclusion is created

  @SalesMasterDeleteExclusions
  Scenario: Should be able to Delete Sales Exclusions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on active sales master Exclusions in the grid to delete
    Then User verify if the sales master Exclusions is deleted

  @SalesMasterExportToExcelExclusions
  Scenario: Should be able to Export to Excel Sales Exclusions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on Exclusions Export to Excel Button

  @SalesMasteraddPaymentTerms
  Scenario: Should be able to Add Sales Payment Terms
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User clicks on button Sales Payment Terms add 'Add'
    Then User fills up the Enquiry Payment Terms 'Payment Terms' details
    Then User clicks on Payment Terms save button
    Then User verify if the Payment Terms is created

  @SalesMasterEditPaymentTerms
  Scenario: Should be able to Edit Sales Payment Terms
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User clicks on active Enquiry Payment Terms in the grid
    Then User clicks on Payment Terms update button
    Then User verify if the Payment Terms is created

  @SalesMasterDeletePaymentTerms
  Scenario: Should be able to Delete Sales Payment Terms
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User clicks on active sales master Payment Terms in the grid to delete
    Then User verify if the sales master Payment Terms is deleted

  @SalesMasterExportToExcelPaymentTerms
  Scenario: Should be able to Export to Excel Sales Payment Terms
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User Clicks on Export to Excel Button

  @SalesMasterEditQuotationTypes
  Scenario: Should be able to Edit Sales Quotation Types
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Types 'Quotation Types' in side menu
    Then User clicks on active Enquiry Quotation Type in the grid to Edit
    Then User clicks on Quotation Types update button

  @SalesMasterDeleteQuotationTypes
  Scenario: Should be able to Delete Sales Quotation Types
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Types 'Quotation Types' in side menu
    Then User clicks on active sales master Quotation Types in the grid to delete

  @SalesMasterExportToExcelQuotationTypes
  Scenario: Should be able to Export to Excel Sales Quotation Types
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Types 'Quotation Types' in side menu
    Then User Clicks on Export to Excel Button

  @SalesMasterExportToExcelQuotationLineTypes
  Scenario: Should be able to Export to Excel Sales Quotation Line Types
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Line Types 'Quotation Line Types' in side menu
    Then User Clicks on Export to Excel Button

  @SalesMasterExportToExcelOtherCost
  Scenario: Should be able to Export to Excel Sales Other Cost
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Other Cost 'Quotation Other Cost' in side menu
    Then User Clicks on Export to Excel Button

  @SalesMasterOtherCostSortitemCode
  Scenario: Should be able to Export to Excel Sales Other Cost
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Other Cost 'Quotation Other Cost' in side menu
    Then User Clicks on the S M Other Cost sort on item code 'Other Cost Sort Item Code'


