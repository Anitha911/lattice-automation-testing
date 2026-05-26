@HelpDeskB2CService
Feature: HelpDeskB2C Service Module Automation

  @ViewHelpDesk
  Scenario: Should be able to View Help Desk page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab

  @HelpDeskDirectWOBookingButtonClick
  Scenario: Should be able to Click Direct WO Booking button and detail page to be displayed
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Direct WO Booking Button

  @HelpDeskAddNewContactButtonClick
  Scenario: Should be able to View Help Desk page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Help Desk Add New Contact Button

  @HelpDeskSaveNewContactDetails
  Scenario: Should be able to View Help Desk page and enter the details and Save
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Help Desk Add New Contact Button
    Then User enter the details in Add New Contact pop up
    When User clicks the Help Desk New Contact Save button

  @HelpDeskNewContactDetailsCancelClick
  Scenario: Should be able to View Help Desk page and click Cancel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Help Desk Add New Contact Button
    When User clicks the Help Desk New Contact Cancel button

  @HelpDeskSearchCheck
  Scenario: Should be able to search in Help Desk page using dropdown Option
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    Then User selects Help Desk option from the search dropdown
    When User Help Desk enters search term
    Then User clicks Search button

  @HelpDeskGridPagination
  Scenario: Should be able to check pagination in HelpDesk Grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User Clicks on Help Desk grid 'pagination'

  @HelpDeskGridDataPerPage
  Scenario: Should be able to check data per page in the grid in the Help desk Grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks the Help Desk no of data per page 10 in the grid

  @B2CServiceDeskPageDisplayProduct
  Scenario: Should be able to Open B2C Service Desk page and display Product Section
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section

  @B2CServiceDeskProductExportToExcel
  Scenario: Should be able to Open B2C Service Desk page Product Section and export To Excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    Then User Clicks Export To Excel

  @B2CServiceDeskProductDataPerPage
  Scenario: Should be able to check data per page B2CServiceDeskProduct Grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    When User clicks the B2CServiceDesk Product no of data per page 10 in the grid

  @B2CServiceDeskProductPaginationCheck
  Scenario: Should be able to Open B2C Service Desk page Product Section and export To Excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    When User Clicks on B2CServiceDesk Product grid 'pagination'

  @B2CServiceDeskProductAddB2CProdButtonClick
  Scenario: Should be able to Open B2C Service Desk page Product Section and Click Product Add Button
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    When User Clicks on B2CServiceDesk Add Product 'Add Product' Button

  @B2CServiceDeskProductAddB2CProd
  Scenario: Should be able to Add B2C Service Desk page Product
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    When User Clicks on B2CServiceDesk Add Product 'Add Product' Button
    Then User Enters the details in the Add New Product Pop Up
    When User clicks the B2C Product Save Button

  @B2CServiceDeskProductB2CProdFirstData
  Scenario: Should be able to Get B2C Service Desk Product Detail Page When clicking the first data in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    When User clicks B2CServiceDesk first data in the Product grid to Open the Detail page

  @B2CServiceDeskProductB2CProdUpdate
  Scenario: Should be able to Get B2C Service Desk Product Detail Page and Edit
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    When User clicks B2CServiceDesk first data in the Product grid to Open the Detail page
    When User Clicks the Edit Product Store Front 'Edit Product' Button
    Then User Clicks the Product Store Front Update Button

  @B2CServiceDeskProdAddProdPricing
  Scenario: Should be able to Open Prod Package detail page and add Product Pricing
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    When User clicks B2CServiceDesk first data in the Product grid to Open the Detail page
    When User clicks Product Pricing 'Product Pricing' in the side menu
    Then User clicks Add New Product Pricing 'Add New' Button
    When User enters Product Pricing details
    Then User Clicks on Product Pricing Save Button

  @B2CServiceDeskProdEditProdPricing
  Scenario: Should be able to Open Prod Package detail page and Edit Product Pricing
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk Product 'B2CServiceDeskProduct' section
    When User clicks B2CServiceDesk first data in the Product grid to Open the Detail page
    When User clicks Product Pricing 'Product Pricing' in the side menu
    Then User clicks Add New Product Pricing 'Add New' Button
    When User enters Product Pricing details
    Then User Clicks on Product Pricing Save Button
    When User clicks Product Pricing Edit 'Pricing Edit' button
    Then User Clicks on Product Pricing Save Button

  @B2CServiceDeskHelpDeskPageDisplay
  Scenario: Should be able to Open B2C ServiceDesk Help Desk Section
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk HelpDesk 'B2CServiceDeskHelpDesk' section

  @B2CServiceDeskHelpDeskPageAddClientButtonClick
  Scenario: Should be able to Open B2C ServiceDesk Help Desk Section Add Client Click
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk HelpDesk 'B2CServiceDeskHelpDesk' section
    Then User Clicks Add Client Button click

  @B2CServiceDeskHelpDeskPageAddClient
  Scenario: Should be able to Open B2C ServiceDesk Help Desk Section Add Client Click
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on B2CServiceDesk 'B2C ServiceDesk' in Navigation panel
    When User clicks the B2CServiceDesk HelpDesk 'B2CServiceDeskHelpDesk' section
    Then User Clicks Add Client Button click
    When User Enters details in B2CServiceDeskHelpDesk pop up
    Then User clicks B2CServiceDeskHelpDesk Save Button






