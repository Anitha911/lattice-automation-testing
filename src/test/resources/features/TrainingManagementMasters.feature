@trainingManagementMasters
Feature: Training Management Masters Automation

  @addTrainingCompanyTypeMasters
  Scenario: Should be able to add Training company type
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    And User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Training Company' tab in data configuration page
    And User clicks on button 'Add'
    And User fills up the company type details
    And User clicks on save button
    Then User verify if the company type is created or updated

  @EditTrainingCompanyTypeMasters
  Scenario: Should be able to add Training company type
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    And User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Training Company' tab in data configuration page
    And User clicks on button 'Add'
    And User fills up the company type details
    Then User clicks on save button
    Then User verify if the company type is created or updated
    Then User clicks on first available company type to edit
    And User fills up the company type details
    Then User waits for 10 seconds
    And User clicks on update button
    Then User waits for 10 seconds
    Then User verify if the company type is created or updated

  @DeleteTrainingCompanyTypeMasters
  Scenario: Should be able to delete a company
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    And User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Training Company' tab in data configuration page
    And User clicks on button 'Add'
    And User fills up the company type details
    Then User clicks on save button
    Then User verify if the company type is created or updated
    Then User clicks on first available company type to delete
    Then User verify if the record is deleted

  @CheckingDuplicateCompanyTypeMasters
  Scenario: Should be able to delete a company
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    And User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Training Company' tab in data configuration page
    And User clicks on button 'Add'
    And User fills up the company type details
    Then User waits for 10 seconds
    Then User clicks on save button
    Then User verify if the company type is created or updated
    And User clicks on button 'Add'
    And User fills up the duplicate company type details
    Then User waits for 10 seconds
    Then User clicks on save button
#    Then verify the message as "Record Saved Successfully"
#    Then User clicks on first available company type to delete
#    Then User verify if the record is deleted