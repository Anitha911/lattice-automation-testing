@InventoryManagementModule
Feature: Inventory Management Module Automation

  @TransInventoryMgmtSupplierDisplayAndExportToExcel
  Scenario: Should be able to display Supplier and Export To excel
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Supplier 'Supplier' in side menu
    Then User Clicks on Export to Excel Button

  @TransInventoryMgmtSupplierInactiveSupplierCheckbox
  Scenario: Should be able to display Inactive Suppliers when the Include Inactive Supplier Checkbox is checked
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Supplier 'Supplier' in side menu
    Then User Clicks on Include Inactive Supplier Checkbox

  @TransInventoryMgmtSupplierGridPagination
  Scenario: Should be able to move to next page in the grid in Supplier Grid
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Supplier 'Supplier' in side menu
    Then User Clicks on Inventory Management Supplier grid 'pagination'

  @TransInventoryMgmtSupplierGridDataPerPage
  Scenario: Should be able to Open Supplier Grid and check data per page
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Supplier 'Supplier' in side menu
    Then User clicks the Inventory Management Supplier no of data per page 10 in the grid

  @TransInventoryMgmtSupplierAddSupplier
  Scenario: Should be able to Add New Supplier
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User Clicks Add Supplier Button 'Add Supplier'
    When User enters the Supplier Details in the Supplier Pop up
    Then User clicks the Supplier Save button

  @TransInventoryMgmtSupplierEditSupplier
  Scenario: Should be able to Edit Supplier
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User clicks the first active Supplier to Edit
    When User clicks the Edit Supplier Button
    Then User clicks the Supplier Save button

  @TransInventoryMgmtSupplierDeactivateSupplier
  Scenario: Should be able to Deactivate Supplier on deactivate Button
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User clicks the first active Supplier to Edit
    When User clicks the DeActivate Supplier Button
    Then User clicks the DeActivate Supplier Yes Button

  @TransInventoryMgmtSupplierAddEmailDomain
  Scenario: Should be able to Add Supplier Email Domain
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User clicks the first active Supplier to Edit
    When User clicks EmailDomain section
    When USer Clicks the Add Email Domain Button
    When User Enters Email Domain Name
    Then User clicks Add Email Domain Save Button

  @TransInventoryMgmtAddItemDefinition
  Scenario: Should be able to Add Inventory Item
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Item Definition 'Item Definition' in side menu
    When User clicks Inventory Management Item Definition Add 'Item Definition Add' Button
    #When User select the Item Type '' from Item Type dropdown
    #When User select the Item Category '' from Item Category dropdown
    #When User select the Item SubCategory '' from Item SubCategory dropdown
    #When User select the Issuing Unit '' from Issuing Unit dropdown
    #When User select the Default Receiving Unit '' from Default Receiving dropdown
    When User enters the Item Name Item definition details 'Item Name'
    Then User clicks the Save button

  @TransInventoryMgmtEditItemDefinition
  Scenario: Should be able to Edit Inventory Item Definition
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Item Definition 'Item Definition' in side menu
    When User clicks Active Item Definition
    When User clicks Item Definition Edit
    When User enters the Item definition details EDIT 'Edit'
    Then User clicks Item Definition Edit Update Button Click 'Update'

  @TransInventoryMgmtAddStore
  Scenario: Should be able to Add Inventory Store
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    When User clicks Inventory Management Add Store button 'Add Store'
    When User enters details in Store pop up 'Store Pop up Details'







