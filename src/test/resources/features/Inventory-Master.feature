@dataconfigInventory
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
  Scenario: Should be able to export to Excel Inventory Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on Inventory Item Type Export to Excel button

  @addItemCategory
  Scenario: Should be able to add Item Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item Category 'string' in side menu
    Then User clicks on button Item Category add 'Add'
    Then User fills up the 'Item Category' Item Category details
    Then User clicks on Item Category save button
    Then User verify if the Item Category is created

    @EditItemCategory
    Scenario: Should be able to Edit Item Category
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on Inventory 'Data configuration' in side menu
      Then User clicks on the additional masters Inventory 'string' tab
      Then User clicks on the Inventory master Item Category 'string' in side menu
      Then User clicks on button Item Category add 'Add'
      Then User fills up the 'Item Category' Item Category details
      Then User clicks on Item Category save button
      Then User verify if the Item Category is created
      Then User clicks on active Item Category in the grid
      Then User clicks on Item Category save button
      Then User verify if the Item Category is created

@DeleteItemCategory
    Scenario: Should be able to Edit Item Category
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on Inventory 'Data configuration' in side menu
      Then User clicks on the additional masters Inventory 'string' tab
      Then User clicks on the Inventory master Item Category 'string' in side menu
      Then User clicks on active Item Category in the grid to delete
      Then User verify if the Item Category is deleted

  @ExporttoExcelItemCategory
  Scenario: Should be able to export to Excel Inventory Item Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item Category 'string' in side menu
    Then User clicks on Inventory Item Category Export to Excel button

  @addItemSubCategory
  Scenario: Should be able to add Item SubCategory
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item SubCategory 'string' in side menu
    Then User clicks on button Item SubCategory add 'Add'
    Then User fills up the 'Item SubCategory' Item SubCategory details
    Then User clicks on Item SubCategory save button
    Then User verify if the Item SubCategory is created