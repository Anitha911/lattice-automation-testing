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
