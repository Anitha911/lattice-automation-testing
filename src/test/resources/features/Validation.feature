@validation
Feature: Validate input fields before saving the form

  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    When user verify the chars min len as 3 and max len as 100 on Company Name
    When user verify the chars min len as 3 and max len as 100 on Contact Name
    When user verify the chars max len as 20 on Contact Number
    When user verify the chars max len as 100 on Company Address
    When user verify the chars max len as 100 on Email
    Then User clicks on save button
    When user verify the inline error message 'Enter Training Company Name' on Company Name
    When user verify the inline error message 'Select company type' on Company Type

  @addPatrolModesValidation
  Scenario: User should not be able to save PatrolModes form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on button patrol add 'Add'
    When user verify the chars min len as 3 and max len as 50 on Patrol Mode
    Then User clicks on Patrol Mode save button
    When user verify the inline error message 'Enter Mode' on Patrol Mode

  @addPatrolShiftValidation
  Scenario: User should not be able to save PatrolShift form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on button shifts add 'Add'
    When user verify the chars max len as 3 on Patrol Shift Code
    When user verify the chars max len as 50 on Patrol Shift Name
    Then User clicks on Patrol Shift save button
    When user verify the inline error message 'Enter Shift Code' on Patrol Shift Code
    When user verify the inline error message 'Enter Shift Name' on Patrol Shift Name
    When user verify the inline error message 'Select Start Time' on Patrol Shift Start Time
    When user verify the inline error message 'Select End Time' on Patrol Shift End Time

  @addSalesClientTypeValidation
  Scenario: User should not be able to save Sales Client Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on button Sales client types add 'Add'
    When user verify the chars min len as 3 and max len as 50 on Sales Client Type
    Then User clicks on Client Type save button
    When user verify the inline error message 'Enter Client Type Name' on Sales Client Type

  @addSalesEnquiryTypeValidation
  Scenario: User should not be able to save Sales Enquiry Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master 'Sales Enquiry Types' in side menu
    Then User clicks on button Sales Enquiry types add 'Add'
    When user verify the chars min len as 3 and max len as 50 on Sales Enquiry Type
    Then User clicks on Enquiry Type save button
    When user verify the inline error message 'Enter Enquiry Type Name' on Sales Enquiry Type

  @addSalesEnquirySourceValidation
  Scenario: User should not be able to save Sales Enquiry Source  form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on button Sales Enquiry Source add 'Add'
    When user verify the chars min len as 3 and max len as 50 on Sales Enquiry Source
    Then User clicks on Enquiry Source save button
    When user verify the inline error message 'Enter Enquiry Source Name' on Sales Enquiry Source

  @addSalesTermsAndConditionValidation
  Scenario: User should not be able to save Sales Terms And Condition form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on button Sales Terms and Conditions add 'Add'
    When user verify the chars min len as 3 and max len as 50 on Terms and Conditions
    When user verify the chars min len as 2 and max len as 50 on Default Value
    Then User clicks on Sales T and C save button
    When user verify the inline error message 'Enter Terms And Conditions' on Sales Terms And Conditions

  @addSalesExclusionsValidation
  Scenario: User should not be able to save Sales Exclusions form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on button Sales Sales Exclusion add 'Add'
    When user verify the chars min len as 3 and max len as 50 on Exclusions
    Then User clicks on Sales Exclusion save button
    When user verify the inline error message 'Enter Exclusions' on Sales Exclusions

  @addSalesPaymentTermsValidation
  Scenario: User should not be able to save Sales Payment Terms form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User clicks on button Sales Payment Terms add 'Add'
    When user verify the chars min len as 3 and max len as 50 on Payment Terms
    When user verify the chars min len as 2 and max len as 50 on P T Default Value
    Then User clicks on Payment Terms save button
    When user verify the inline error message 'Enter Payment Terms' on Sales Payment Terms

  @addInventoryItemTypeValidation
  Scenario: User should not be able to save Inventory Item Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on button Item Type add 'Add'
    When user verify the chars min len as 3 and max len as 10 on Item Type Code
    When user verify the chars min len as 3 and max len as 100 on Item Type Name
    Then User clicks on Item Type save button
    When user verify the inline error message 'Enter Type Code' on Inventory Item Type
    When user verify the inline error message 'Enter Type Name' on Inventory Item Name

  @addInventoryItemCategoryValidation
  Scenario: User should not be able to save Inventory Item Category form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item Category 'string' in side menu
    Then User clicks on button Item Category add 'Add'
    When user verify the chars min len as 3 and max len as 10 on Item Category Code
    When user verify the chars min len as 3 and max len as 100 on Item Category Name
    Then User clicks on Item Category save button
    When user verify the inline error message 'Enter Item Category Code' on Inventory Item Category Code
    When user verify the inline error message 'Enter Item Category Name' on Inventory Item Category Name

  @addInventoryItemSubCategoryValidation
  Scenario: User should not be able to save Inventory Item SubCategory form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item SubCategory 'string' in side menu
    Then User clicks on button Item SubCategory add 'Add'
    When user verify the chars min len as 3 and max len as 10 on Item SubCategory Code
    When user verify the chars min len as 3 and max len as 100 on Item SubCategory Name
    Then User clicks on Item SubCategory save button
    When user verify the inline error message 'Select Item Category' on Inventory Item Category
    When user verify the inline error message 'Enter Item Subcategory Code' on Inventory Item SubCategory Code
    When user verify the inline error message 'Enter Item Subcategory Name' on Inventory Item SubCategory Name


