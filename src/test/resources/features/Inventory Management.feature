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
    Then User clicks the Item Definition Save button

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

  @TransInventoryMgmItemDefinitionValidationInput
  Scenario: User should not be able to save Item Definition With invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Item Definition 'Item Definition' in side menu
    When User clicks Inventory Management Item Definition Add 'Item Definition Add' Button
    #When user verify the chars min len as 3 and max len as 200 on RateCard Number textbox
    Then User clicks the Item Definition Save button
    When user verify the inline error message 'Enter Item Name!' on Item Name

  @TransInventoryMgmtAddStore
  Scenario: Should be able to Add Inventory Store
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    When User clicks Inventory Management Add Store button 'Add Store'
    When User enters details in Store pop up 'Store Pop up Details'
    Then User clicks the Store Save button

  @TransInventoryMgmtStoreValidationInput
  Scenario: User should not be able to save Store With invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    When User clicks Inventory Management Add Store button 'Add Store'
    #When user verify the chars min len as 3 and max len as 250 on Store Name textbox
    Then User clicks the Store Save button
    When user verify the inline error message 'Enter Store name' on Store Name
    When user verify the inline error message 'Enter Location Details' on Store Location Details

  @TransInventoryMgmtStoreExportToExcel
  Scenario: Should be able to Export To Excel Store
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    Then User clicks on Export To Excel Inventory Management Store

  @TransInventoryMgmtStoreDelete
  Scenario: User should  be able to Delete Store
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    Then User Clicks the Store Delete button

  @TransInventoryMgmtStoreDeactivate
  Scenario: User should  be able to Deactivate a Store
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    When User clicks an active Store from the grid 'Active Store'
    Then User clicks Deactivate Active Button 'ActivateDeactivate'

  @TransInventoryMgmtStoreIncludeInactiveStore
  Scenario: User should be able to check include Inactive Store Checkbox and corresponding data should be displayed
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    Then User clicks the Include Inactive Store Checkbox 'Include Inactive Store'

  @TransInventoryMgmtEditStore
  Scenario: Should be able to Edit Inventory Store
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    When User clicks an active Store from the grid 'Active Store'
    When User clicks the Edit Store Button
    When User enters details in Store pop up 'Store Pop up Details'
    Then User clicks the Store Save button

  @TransInventoryMgmtEditStoreAddNote
  Scenario: Should be able to Add Note in Inventory Store Detail Page
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Store 'Store' in side menu
    When User clicks an active Store from the grid 'Active Store'
    When User clicks the Note in the left side menu 'Note in left side'
    When User clicks the Add Note Button
    When User enters details in the Notes pop up 'Notes Details'
    Then User Clicks the Notes Save

  @TransInventoryMgmtPRExportToExcel
  Scenario: Should be able to Export To Excel PR
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Inventory Management 'Inventory Management' in side menu
    When User Clicks on Inventory Management Purchase Request 'PR' in side menu
    Then User clicks the PR Export To Excel

