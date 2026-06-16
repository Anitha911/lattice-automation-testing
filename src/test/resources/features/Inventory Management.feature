@InventoryManagementModule
Feature: Inventory Management Module Automation

  @TransInventoryMgmtSupplierDisplayAndExportToExcel
  Scenario: Should be able to display Supplier and Export To excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory Management 'Inventory Management' in side menu
    Then User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User Clicks on Export to Excel Button

  @TransInventoryMgmtSupplierInactiveSupplierCheckbox
  Scenario: Should be able to display Inactive Suppliers when the Include Inactive Supplier Checkbox is checked
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory Management 'Inventory Management' in side menu
    Then User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User Clicks on Include Inactive Supplier Checkbox

  @TransInventoryMgmtSupplierGridPagination
  Scenario: Should be able to move to next page in the grid in Supplier Grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory Management 'Inventory Management' in side menu
    Then User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User Clicks on Inventory Management Supplier grid 'pagination'

  @TransInventoryMgmtSupplierGridDataPerPage
  Scenario: Should be able to Open Supplier Grid and check data per page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory Management 'Inventory Management' in side menu
    Then User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User clicks the Inventory Management Supplier no of data per page 10 in the grid

  @TransInventoryMgmtSupplierAddSupplier
  Scenario: Should be able to Add New Supplier
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory Management 'Inventory Management' in side menu
    Then User Clicks on Inventory Management Supplier 'Supplier' in side menu
    When User Clicks Add Supplier Button 'Add Supplier'
    When User enters the Supplier Details in the Supplier Pop up
    Then User clicks the Supplier Save button
