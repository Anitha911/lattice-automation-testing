@ScheduledMaintenanceMaster
Feature: Scheduled Maintenance Master Module Automation

  # Task Frequency - Add , Update , Delete and Export to Excel
  @addTaskFrequency
  Scenario: Should be able to create a new Task Frequency
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User clicks on button 'Add'
    Then User fills the Task Frequency details
    Then User waits for 20 seconds
    And User clicks on Scheduled Maintenance Save button
    Then User waits for 10 seconds
    Then User verify if the Task Frequency is created
    Then User waits for 5 seconds

  @updateTaskFrequency
  Scenario: Should be able to edit a Task Frequency
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User clicks on first available Task Frequency to edit
    Then User waits for 3 seconds
    Then User updates the Task Frequency details
    Then User waits for 20 seconds
    Then User clicks on Scheduled Maintenance Save button
    Then User waits for 10 seconds
    Then User verify if the Task Frequency is updated
    Then User waits for 3 seconds


  @deleteTaskFrequency
  Scenario: Should be able to delete a Task Frequency
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User clicks on first available Task Frequency to delete
    Then User waits for 10 seconds

  @ExporttoExcelTaskFrequency
  Scenario: Should be able to download Task Frequency File
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
#    Then User waits for 3 seconds
    Then User click on the Master Scheduled Maintenance Export to Excel button
    Then User waits for 20 seconds


# Parameter Response Values - Add , Update And Delete
  @addParameterResponseValue
  Scenario: Should be able to create a new Parameter Response Value
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User move to Parameter Response Values section
    Then User clicks on button 'Add'
    Then User fills the Parameter Response Values details
    Then User waits for 10 seconds
    And User clicks on Scheduled Maintenance Save button
    Then User waits for 20 seconds
    Then User verify if the Parameter Response Value is created
    Then User waits for 10 seconds

  @updateParameterResponseValue
  Scenario: Should be able to edit a Parameter Response Value
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User move to Parameter Response Values section
    Then User clicks on first available Parameter Response Value to edit
#    Then User waits for 3 seconds
    Then User updates the Parameter Response Value details
    Then User waits for 10 seconds
    Then User clicks on Scheduled Maintenance Save button
    Then User waits for 10 seconds
    Then User verify if the Parameter Response Value is updated
    Then User waits for 3 seconds

  @deleteParameterResponseValue
  Scenario: Should be able to delete a Parameter Response Value
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User move to Parameter Response Values section
    Then User waits for 3 seconds
    Then User clicks on first available Parameter Response Value to delete
    Then User waits for 10 seconds

  @ExporttoExcelParameterResponseValue
  Scenario: Should be able to download Parameter Response Value File
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User move to Parameter Response Values section
    Then User click on the Master Scheduled Maintenance Export to Excel button
    Then User waits for 20 seconds

  @ValidationTaskFrequency
  Scenario: User should not be able to save Task Frequency form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User clicks on button 'Add'
    Then User waits for 3 seconds
    And User clicks on Scheduled Maintenance Save button
    When User verify the inline error message 'Enter Task Frequency Code' on Task Frequency Code
    When User verify the inline error message 'Enter Task Frequency Name' on Task Frequency Name
    When User verify the inline error message 'Enter Frequency Period' on Frequency Period
    When User verify the inline error message 'Select Frequency Unit' on Frequency Unit
    When User verify the inline error message 'Enter First Run Period' on First Run Period
#   Then User waits for 10 seconds
    When User verify the chars min len as 1 and max len as 2 for Task Frequency Code
    When User verify the chars min len as 3 and max len as 100 for Task Frequency Name
    Then User waits for 10 seconds

  @ValidationParameterResponseValue
  Scenario: User should not be able to save Parameter Response Value form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Scheduled Service Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User move to Parameter Response Values section
    Then User clicks on button 'Add'
    And User clicks on Scheduled Maintenance Save button
    When User verify the inline error message 'Enter Parameter' on Parameter
    When User verify the chars min len as 3 and max len as 100 for Parameter
   Then User waits for 10 seconds
   When User enters special characters in Parameter
   And User clicks on Scheduled Maintenance Save button
   Then User waits for 10 seconds
