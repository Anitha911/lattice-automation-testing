@IncidentManagementMaster
Feature: Incident Management Master Module Automation
# Incident Type- Add , Update And Delete
  @addIncidentType
  Scenario: Should be able to create a new Incident Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on button 'Add'
    Then User fills the Incident Type details
    And User clicks on Incident Save button
    Then User verify if the Incident Type is created

  @updateIncidentType
  Scenario: Should be able to edit a Incident Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on first available Incident Type to edit
    Then User waits for 3 seconds
    Then User updates the Incident Type details
    Then User clicks on Incident Save button
    Then User waits for 10 seconds
    Then User verify if the Incident Type is updated

  @deleteIncidentType
  Scenario: Should be able to delete a Incident Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User clicks on first available Incident Type to delete
    Then User waits for 3 seconds

    # Incident Sub Type - Add , Update And Delete
    @addIncidentSubType
    Scenario: Should be able to create a new Incident Sub Type
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on 'Data Configurations' in navigation panel
      Then User clicks on hamburger icon
      And User clicks on the 'Incident Management' tab in data configuration page
      Then User clicks on Incident 'Incident Sub-Type' tab
      Then User clicks on button 'Add'
      Then User fills the Incident Sub-Type details
      Then User waits for 10 seconds
      And User clicks on Incident Save button
      Then User waits for 10 seconds
      Then User verify if the Incident Sub-Type is created

  @updateIncidentSubType
  Scenario: Should be able to edit a Incident Sub Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident Sub-Type' tab
    Then User clicks on first available Incident Sub-Type to edit
    Then User waits for 10 seconds
    Then User updates the Incident Sub-Type details
    Then User waits for 10 seconds
    Then User clicks on Incident Save button
    Then User waits for 10 seconds
    Then User verify if the Incident Sub-Type is updated
    Then User waits for 3 seconds

  @deleteIncidentSubType
  Scenario: Should be able to delete a Incident Sub Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident Sub-Type' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident Sub-Type to delete

   # Incident Severity- Add , Update And Delete
  @addIncidentSeverity
  Scenario: Should be able to create a new Incident Severity
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident Severity' tab
    Then User clicks on button 'Add'
    Then User fills the Incident Severity details
    Then User waits for 5 seconds
    And User clicks on Incident Save button
    Then User waits for 5 seconds
    Then User verify if the Incident Severity is created

  @updateIncidentSeverity
  Scenario: Should be able to edit a Incident Severity
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident Severity' tab
    Then User clicks on first available Incident Severity to edit
    Then User updates the Incident Severity details
    Then User waits for 5 seconds
    Then User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident Severity is updated
    Then User waits for 3 seconds

  @deleteIncidentSeverity
  Scenario: Should be able to delete a Incident Severity
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident Severity' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident Severity to delete
    Then User waits for 3 seconds

# Affected Group- Add , Update And Delete
  @addAffectedGroup
  Scenario: Should be able to create a new Affected Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Affected Group' tab
    Then User clicks on button 'Add'
    Then User fills the Affected Group details
    Then User waits for 3 seconds
    And User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Affected Group is created
    Then User waits for 3 seconds

  @updateAffectedGroup
  Scenario: Should be able to edit a Affected Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Affected Group' tab
    Then User clicks on first available Affected Group to edit
    Then User updates the Affected Group details
    Then User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Affected Group is updated
    Then User waits for 3 seconds

  @deleteAffectedGroup
  Scenario: Should be able to delete a Affected Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Affected Group' tab
    Then User waits for 3 seconds
    Then User clicks on first available Affected Group to delete
    Then User waits for 3 seconds

  #Incident - Caused By- Add , Update And Delete
  @addIncidentCausedBy
  Scenario: Should be able to create a new Incident-Caused By
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Caused By' tab
    Then User clicks on button 'Add'
    Then User fills the Incident-Caused By details
    And User clicks on Incident Save button
    Then User verify if the Incident-Caused By is created

  @updateIncidentCausedBy
  Scenario: Should be able to edit a Incident-Caused By
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Caused By' tab
    Then User clicks on first available Incident-Caused By to edit
    Then User updates the Incident-Caused By details
    Then User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident-Caused By is updated
    Then User waits for 3 seconds

  @deleteIncidentCausedBy
  Scenario: Should be able to delete a Incident-Caused By
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Caused By' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident-Caused By to delete
    Then User waits for 3 seconds

  #Impact Type - Add , Update And Delete
  @addIncidentImpactType
  Scenario: Should be able to create a new Incident-Impact Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Impact Type' tab
    Then User clicks on button 'Add'
    Then User waits for 3 seconds
    Then User fills the Incident-Impact Type details
    Then User waits for 3 seconds
    And User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident-Impact Type is created
    Then User waits for 3 seconds

  @updateIncidentImpactType
  Scenario: Should be able to edit a Incident-Impact Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Impact Type' tab
    Then User clicks on first available Incident-Impact Type to edit
    Then User updates the Incident-Impact Type details
    Then User waits for 3 seconds
    Then User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident-Impact Type is updated
    Then User waits for 3 seconds

  @deleteIncidentImpactType
  Scenario: Should be able to delete a Incident-Impact Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Impact Type' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident-Impact Type to delete
    Then User waits for 3 seconds

 #Incident - Section - Add , Update And Delete
  @addIncidentSection
  Scenario: Should be able to create a new Incident-Section
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Section' tab
    Then User clicks on button 'Add'
    Then User fills the Incident-Section details
    Then User waits for 10 seconds
    And User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident-Section is created
    Then User waits for 10 seconds

  @updateIncidentSection
  Scenario: Should be able to edit a Incident-Section
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Section' tab
    Then User clicks on first available Incident-Section to edit
    Then User updates the Incident-Section details
    Then User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident-Section is updated
    Then User waits for 3 seconds

  @deleteIncidentSection
  Scenario: Should be able to delete a Incident-Section
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Section' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident-Section to delete
    Then User waits for 3 seconds

  #Incident - Field - Add , Update And Delete
  @addIncidentField
  Scenario: Should be able to create a new Incident-Field
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Field' tab
    Then User clicks on button 'Add'
    Then User fills the Incident-Field details
    And User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident-Field is created
    Then User waits for 10 seconds

  @updateIncidentField
  Scenario: Should be able to edit a Incident-Field
   Given User navigates to 'lattice.url' page
   Then User is at home screen after login with "username" and "password"
   Then User clicks on 'Data Configurations' in navigation panel
   Then User clicks on hamburger icon
   And User clicks on the 'Incident Management' tab in data configuration page
   Then User clicks on Incident 'Incident-Field' tab
   Then User clicks on first available Incident-Field to edit
   Then User updates the Incident-Field details
   Then User clicks on Incident Save button
   Then User waits for 3 seconds
   Then User verify if the Incident-Field is updated
   Then User waits for 3 seconds

  @deleteIncidentField
  Scenario: Should be able to delete a Incident-Field
  Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Field' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident-Field to delete
    Then User waits for 3 seconds

  #Incident - List of Values - Add , Update And Delete
  @addIncidentListOfValues
  Scenario: Should be able to create a new Incident-List of Values
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-List of Values' tab
    Then User clicks on button 'Add'
    Then User fills the Incident-List of Values details
    And User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident-List of Values is created
    Then User waits for 10 seconds

  @updateIncidentListOfValues
  Scenario: Should be able to edit a Incident-List of Values
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-List of Values' tab
    Then User clicks on first available Incident-List of Values to edit
    Then User updates the Incident-List of Values details
    Then User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident-List of Values is updated
    Then User waits for 3 seconds

  @deleteIncidentListOfValues
  Scenario: Should be able to delete a Incident-List of Values
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-List of Values' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident-List of Values to delete
    Then User waits for 3 seconds

  @ExporttoExcelIncidentManagement
  Scenario: Should be able to download Master Incident Files
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on Incident 'Incident Sub-Type' tab
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on Incident 'Incident Severity' tab
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on Incident 'Affected Group' tab
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on Incident 'Incident-Caused By' tab
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on Incident 'Incident-Impact Type' tab
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on Incident 'Incident-Section' tab
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on Incident 'Incident-Field' tab
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on Incident 'Incident-List of Values' tab
    Then User click on the Master Incident Management Export to Excel button
    Then User waits for 15 seconds

  @ValidationIncidentType
  Scenario: User should not be able to save Incident Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Enter Incident Type Code' on Incident Type Code field
    When User verify the inline error message 'Enter Incident type' on Incident Type field
    When User verify the chars max len as 10 for Incident Type Code field
    When User verify the chars max len as 50 for Incident Type field
    Then User waits for 2 seconds
    When User enters special characters in Incident Type Code field
    When User enters special characters in Incident Type field
    And User clicks on Incident Save button
    Then User waits for 10 seconds

  @ValidationIncidentSubType
  Scenario: User should not be able to save Incident Sub Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident Sub-Type' tab
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Enter Incident Sub-Type Code' on Incident Sub-Type Code field
    When User verify the inline error message 'Enter Incident Sub-Type' on Incident Sub-Type field
    When User verify the inline error message 'Select Incident Type' on Incident Type field in the Sub-Type form
    When User verify the chars max len as 10 for Incident Sub-Type Code field
    When User verify the chars max len as 10 for Incident Sub-Type field
    Then User waits for 2 seconds
    When User enters special characters in Incident Sub-Type Code field
    When User enters special characters in Incident Sub-Type field
    And User clicks on Incident Save button
    Then User waits for 10 seconds

  @ValidationIncidentSeverity
  Scenario: User should not be able to save Incident Severity form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident Severity' tab
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Enter Severity' on Incident Severity field
    When User verify the chars max len as 30 for Incident Severity field
    Then User waits for 2 seconds
    When User enters special characters in Incident Severity field
    And User clicks on Incident Save button
    Then User waits for 10 seconds

  @ValidationIncidentAffectedGroup
  Scenario: User should not be able to save Incident Affected Group form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Affected Group' tab
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Enter Affected Group Name' on Incident Affected Group field
    When User verify the chars max len as 30 for Incident Affected Group field
    Then User waits for 2 seconds
    When User enters special characters in Incident Affected Group field
    And User clicks on Incident Save button
    Then User waits for 10 seconds

  @ValidationIncidentCausedBy
  Scenario: User should not be able to save Incident Caused By form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Caused By' tab
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Enter Caused by' on Incident Caused By field
    When User verify the chars max len as 50 for Incident Caused By field
    Then User waits for 2 seconds
    When User enters special characters in Incident Caused By field
    And User clicks on Incident Save button
    Then User waits for 10 seconds

  @ValidationIncidentImpactType
  Scenario: User should not be able to save Incident Impact Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Impact Type' tab
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Enter Impact type' on Incident Impact Type field
    When User verify the inline error message 'Enter Sort order' on Incident Impact Type Sort Order field
    When User verify the chars max len as 30 for Incident Impact Type field
    Then User waits for 2 seconds
    When User enters special characters in Incident Impact Type field
    And User clicks on Incident Save button
    Then User waits for 10 seconds

  @ValidationIncidentSection
  Scenario: User should not be able to save Incident Section form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Section' tab
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Enter Section' on Incident Section field
    When User verify the inline error message 'Select Type' on Incident Section Type field
    When User verify the inline error message 'Enter Sort order' on Incident Section Sort Order field
    When User verify the chars max len as 30 for Incident Section field
    When User verify the chars max len as 4 for Incident Section Sort Order field
    Then User waits for 2 seconds
    When User enters special characters in Incident Section field
    When User enters special characters in Incident Section Sort Order field
    And User clicks on Incident Save button
    Then User waits for 10 seconds

  @ValidationIncidentField
  Scenario: User should not be able to save Incident Field form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-Field' tab
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Select Type' on Incident Field Type field
    When User verify the inline error message 'Select Section' on Incident Field Section field
    When User verify the inline error message 'Enter Field name' on Incident Field Field Name field
    When User verify the inline error message 'Select Datatype' on Incident Field Data Type field
    When User verify the inline error message 'Enter Sort order' on Incident Field Sort Order field
    When User verify the chars max len as 40 for Incident Field Field Name field
    Then User waits for 2 seconds
    When User enters special characters in Incident Field Field Name field
    And User clicks on Incident Save button
    Then User waits for 10 seconds

  @ValidationIncidentListOfValues
  Scenario: User should not be able to save Incident LOV form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on Incident 'Incident-List of Values' tab
    Then User clicks on button 'Add'
    And User clicks on Incident Save button
    When User verify the inline error message 'Select Field' on Incident LOV field
    When User verify the inline error message 'Enter Value' on Incident LOV Value field
    When User verify the chars max len as 200 for Incident LOV Value field
    Then User waits for 2 seconds
    When User enters special characters in Incident LOV Value field
    And User clicks on Incident Save button
    Then User waits for 10 seconds