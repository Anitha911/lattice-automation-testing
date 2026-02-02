@dataconfiginventory
Feature: Inventory data configuration Module Automation

  @addItemType
  Scenario: Should be able to add Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on button Item Type add 'Add'
    Then User fills up the 'Item type' Item Type details
    Then User clicks on Item Type save button
    Then User verify if the Item Type is created

  @EditItemType
  Scenario: Should be able to Edit Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on button Item Type add 'Add'
    Then User fills up the 'Item type' Item Type details
    Then User clicks on Item Type save button
    Then User verify if the Item Type is created
    Then User clicks on active Item Type in the grid
    Then User clicks on Item Type save button
    Then User verify if the Item Type is created

  @DeleteItemType
  Scenario: Should be able to Delete Inventory Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on active Item Type in the grid to delete
    Then User verify if the Item Type is deleted

  @ExporttoExcelItemTypes
  Scenario: Should be able to export to Excel Sales Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on Inventory Item Type Export to Excel button


