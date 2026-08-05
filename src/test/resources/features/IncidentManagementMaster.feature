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

    # Incident Sub-Type - Add , Update And Delete
    @addIncidentSub-Type
    Scenario: Should be able to create a new Incident Sub-Type
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on 'Data Configurations' in navigation panel
      Then User clicks on hamburger icon
      And User clicks on the 'Incident Management' tab in data configuration page
      Then User clicks on 'Incident Sub-Type' tab
      Then User clicks on button 'Add'
      Then User fills the Incident Sub-Type details
      And User clicks on Incident Save button
      Then User verify if the Incident Sub-Type is created

  @updateIncidentSub-Type
  Scenario: Should be able to edit a Incident Sub-Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on 'Incident Sub-Type' tab
    Then User clicks on first available Incident Sub-Type to edit
    Then User updates the Incident Sub-Type details
    Then User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident Sub-Type is updated

  @deleteIncidentSub-Type
  Scenario: Should be able to delete a Incident Sub-Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on 'Incident Sub-Type' tab
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
    Then User clicks on 'Incident Severity' tab
    Then User clicks on button 'Add'
    Then User fills the Incident Severity details
    And User clicks on Incident Save button
    Then User verify if the Incident Severity is created

  @updateIncidentSeverity
  Scenario: Should be able to edit a Incident Severity
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on 'Incident Severity' tab
    Then User clicks on first available Incident Severity to edit
    Then User updates the Incident Severity details
    Then User clicks on Incident Save button
    Then User waits for 3 seconds
    Then User verify if the Incident Severity is updated

  @deleteIncidentSeverity
  Scenario: Should be able to delete a Incident Severity
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on 'Incident Severity' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident Severity to delete

# Affected Group- Add , Update And Delete
  @addAffectedGroup
  Scenario: Should be able to create a new Affected Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on 'Affected Group' tab
    Then User clicks on button 'Add'
    Then User fills the Affected Group details
    And User clicks on Incident Save button
    Then User verify if the Affected Group is created

  @updateAffectedGroup
  Scenario: Should be able to edit a Affected Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on 'Affected Group' tab
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
    Then User clicks on 'Affected Group' tab
    Then User waits for 3 seconds
    Then User clicks on first available Affected Group to delete

    #Incident - Caused By- Add , Update And Delete
  @addIncidentCausedBy
  Scenario: Should be able to create a new Incident-Caused By
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on 'Incident-Caused By' tab
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
    Then User clicks on 'Incident-Caused By' tab
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
    Then User clicks on 'Incident-Caused By' tab
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
    Then User clicks on 'Incident-Impact Type' tab
    Then User clicks on button 'Add'
    Then User fills the Incident-Impact Type details
    And User clicks on Incident Save button
    Then User verify if the Incident-Impact Type is created

  @updateIncidentImpactType
  Scenario: Should be able to edit a Incident-Impact Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Incident Management' tab in data configuration page
    Then User clicks on 'Incident-Impact Type' tab
    Then User clicks on first available Incident-Impact Type to edit
    Then User updates the Incident-Impact Type details
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
    Then User clicks on 'Incident-Impact Type' tab
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
    Then User clicks on 'Incident-Section' tab
    Then User clicks on button 'Add'
    Then User fills the Incident-Section details
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
    Then User clicks on 'Incident-Section' tab
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
    Then User clicks on 'Incident-Section' tab
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
    Then User clicks on 'Incident-Field' tab
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
   Then User clicks on 'Incident-Field' tab
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
    Then User clicks on 'Incident-Field' tab
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
    Then User clicks on 'Incident-List of Values' tab
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
    Then User clicks on 'Incident-List of Values' tab
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
    Then User clicks on 'Incident-List of Values' tab
    Then User waits for 3 seconds
    Then User clicks on first available Incident-List of Values to delete
    Then User waits for 3 seconds