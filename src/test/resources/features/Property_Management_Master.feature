@PropertyManagement
Feature: Property Management Module Automation

#  /////////////////////// @Contact Type
  @ContactType @Add
  Scenario: User Should be able to add it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on button 'Add'
    When User get Contact Type default code field value
    When User verify special characters are not allowed in Contact Type
    And User Enters Contact Type Name
    And User clicks on Save button in Property Management Section
    Then User verifies added ContactType details in table

  @ContactType @Edit
  Scenario: User Should be able to edit it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    Then User Select the page size 50
    When User select the Contact Type record to edit
    When User get Contact Type default code field value
    And User Enters Contact Type Name
    And User clicks on Save button in Property Management Section
    Then User verifies added ContactType details in table

  @ContactType @Delete
  Scenario: User Should be able to delete it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on button 'Add'
    When User get Contact Type default code field value
    And User Enters Contact Type Name
    And User clicks on Save button in Property Management Section
    Then User verifies added ContactType details in table
    When User clicks on first available Record to delete
    Then User waits for 2 seconds
    Then User verify if the Property Record is deleted

  @ContactType @ErrorValidationMaxLength
  Scenario: User Should be able to ErrorValidation it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 50 for Contact Type Code
    When user verify the chars min len as 3 and max len as 100 for Contact Type
    And User clicks on Property Save button For InLine Error
    Then user verify the inline error message 'Enter Contact Type Name' on Data Configuration


#   /////////////// Property Manager
  @PropertyManager @Add
  Scenario: User Should be able to add it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Property Manager / Client Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user get Client Type default code field value
    When User verify special characters are not allowed in Property Manager
    And User Enters Property Manager Name
    And User clicks on Save button in Property Management Section
    Then User verifies added Property Manager details in table

  @PropertyManager @Edit
  Scenario: User Should be able to edit it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Property Manager / Client Type' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Property Manager record to edit
    When user get Client Type default code field value
    And User Enters Property Manager Name
    And User clicks on Save button in Property Management Section
    Then User verifies added Property Manager details in table

  @PropertyManager @Delete
  Scenario: User Should be able to delete it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Property Manager / Client Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user get Client Type default code field value
    And User Enters Property Manager Name
    And User clicks on Save button in Property Management Section
    Then User verifies added Property Manager details in table
    When User clicks on first available Record to delete
    Then User waits for 2 seconds
    Then User verify if the Property Record is deleted

  @PropertyManager @ErrorValidationMaxLength
  Scenario: User Should be able to errorvalidation it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Property Manager / Client Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 50 for Property Manager Code
    When user verify the chars min len as 3 and max len as 50 for Property Manager
    And User clicks on Property Save button For InLine Error
    Then user verify the inline error message 'Enter Property Manager/ Client Type' on Data Configuration


#  /////////////// Contract Type
  @ContractType @Add
  Scenario: User Should be able to add it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Contract Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user get Contract Type default code field value
    When User verify special characters are not allowed in Contract Type
    And User Enters Contract Type Name
#    And User clicks random checkbox in Document Type ----- PENDING
    And User clicks on applicable Check boxes
    And User clicks on Save button in Property Management Section
    Then User verifies added Contract Type details in table

  @ContractType @Edit
  Scenario: User Should be able to edit it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Contract Type' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Contract Type record to edit
    When user get Contract Type default code field value
    And User Enters Contract Type Name
#    And User clicks random checkbox in Document Type ----- PENDING
    And User clicks on applicable Check boxes
    And User clicks on Save button in Property Management Section
    Then User verifies added Contract Type details in table

  @ContractType @Delete
  Scenario: User Should be able to delete it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Contract Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user get Contract Type default code field value
    And User Enters Contract Type Name
#    And User clicks random checkbox in Document Type ----- PENDING
    And User clicks on applicable Check boxes
    And User clicks on Save button in Property Management Section
    Then User verifies added Contract Type details in table
    When User clicks on first available Record to delete
    Then User waits for 2 seconds
    Then User verify if the Property Record is deleted

  @ContractType @ErrorValidationMaxLength
  Scenario: User Should be able to errorvalidation it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Contract Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 50 for Contract Type Code
    When user verify the chars min len as 3 and max len as 50 for Contract Type
    And User clicks on Property Save button For InLine Error
    Then user verify the inline error message 'Enter Contract Type' on Data Configuration


#   /////////////// Costing Type
  @CostingType @Add
  Scenario: User Should be able to add it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Costing Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user get Costing Type default code field value
    When User verify special characters are not allowed in Costing Type
    And User Enters Costing Type Name and check box
    And User clicks on Save button in Property Management Section
    Then User verifies added Costing Type details in table

  @CostingType @Edit
  Scenario: User Should be able to edit it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Costing Type' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Costing Type record to edit
    When user get Costing Type default code field value
    And User Enters Costing Type Name and check box
    And User clicks on Save button in Property Management Section
    Then User verifies Edited Costing Type details in table

  @CostingType @Delete
  Scenario: User Should be able to delete it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Costing Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user get Costing Type default code field value
    And User Enters Costing Type Name and check box
    And User clicks on Save button in Property Management Section
    Then User verifies added Costing Type details in table
    When User clicks on first available Record to delete
    Then User waits for 2 seconds
    Then User verify if the Property Record is deleted

  @CostingType @ErrorValidationMaxLength
  Scenario: User Should be able to errorvaliadtion it in PM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Property Management' tab in data configuration page
    And User clicks on the 'Costing Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 50 for Costing Type Code
    When user verify the chars min len as 3 and max len as 50 for Costing Type
    And User clicks on Property Save button For InLine Error
    Then user verify the inline error message 'Enter Costing Type' on Data Configuration




