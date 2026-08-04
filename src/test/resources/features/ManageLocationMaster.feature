@LocationMasters
Feature: Location Management Module Automation

  @AddCity
  Scenario: Should be able to add City
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    Then User clicks on action button 'Add'
    Then User enters the 'City' details
    Then User waits for 3 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the city is created
    Then User waits for 10 seconds

   @EditCity
   Scenario: Should be able to edit City
     Given User navigates to 'lattice.url' page
     Then User is at home screen after login with "username" and "password"
     Then User clicks on 'Data Configurations' icon in side panel
     Then User clicks on respective 'Location Management' tab
     Then User clicks on first available city to edit
     Then User edits the 'City' details
     Then User waits for 10 seconds
     Then User clicks on update button
     Then User waits for 20 seconds
     Then User verify if the city is updated

   @DeleteCity
   Scenario: Should be able to delete City
     Given User navigates to 'lattice.url' page
     Then User is at home screen after login with "username" and "password"
     Then User clicks on 'Data Configurations' icon in side panel
     Then User clicks on respective 'Location Management' tab
     Then User waits for 20 seconds
     Then User clicks on first available delete icon
     Then User waits for 15 seconds
     #Then User verify if the city is deleted
     #Then User waits for 10 seconds

  @AddAreaGroup
  Scenario: Should be able to add Area Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    Then User clicks on 'Area Group' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the Area Group details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the Area Group is created
    Then User waits for 10 seconds

  @EditAreaGroup
  Scenario: Should be able to edit AreaGroup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    Then User clicks on first available Area Group
    Then User edits the 'Area Group' details
    Then User waits for 10 seconds
    Then User clicks on update button
    Then User waits for 20 seconds
    Then User verify if the Area Group is updated

  @AddArea
  Scenario: Should be able to add Area
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'Area' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the Area details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the Area is created
    Then User waits for 10 seconds

  @AddProperty
  Scenario: Should be able to add Property
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'Property' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the Property details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the Property is created
    Then User waits for 10 seconds

  @AddZone
  Scenario: Should be able to add Zone
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'Zone' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the Zone details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the Zone is created
    Then User waits for 10 seconds

  @AddSubZone
  Scenario: Should be able to add SubZone
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'Sub Zone' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the Sub Zone details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the Sub Zone is created
    Then User waits for 10 seconds

  @AddBaseunit
  Scenario: Should be able to add Base Unit
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'Base Unit' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the Base Unit details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the Base Unit is created
    Then User waits for 10 seconds

  @AddZoneCriticality
  Scenario: Should be able to add ZoneCriticality
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'Zone Criticality' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the Zone Criticality details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the Zone Criticality is created
    Then User waits for 10 seconds

  @AddZoneGroupCriticality
  Scenario: Should be able to add ZoneGroupCriticality
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'Zone Group Criticality' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the Zone Group Criticality details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the Zone Group Criticality is created
    Then User waits for 10 seconds

  @AddBUFunctionalType
  Scenario: Should be able to add BUFunctionalType
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'BU Functional Type' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the BU Functional Type details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the BU Functional Type is created
    Then User waits for 10 seconds

  @AddBUFunctionalSubType
  Scenario: Should be able to add BUFunctionalSubType
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'BU Functional Sub Type' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the BU Functional Sub Type details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the BU Functional Sub Type is created
    Then User waits for 10 seconds

  @AddBUSizeAttribute
  Scenario: Should be able to add BUSizeAttribute
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'BU Size Attribute' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the BU Size Attribute details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the BU Size Attribute is created
    Then User waits for 10 seconds

  @AddBUSizeType
  Scenario: Should be able to add BUSizeType
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'BU Size Type' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the BU Size Type Attribute details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the BU Size Attribute Type is created
    Then User waits for 10 seconds

  @AddBUCriticality
  Scenario: Should be able to add BUCriticality
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' icon in side panel
    Then User clicks on respective 'Location Management' tab
    #Then User waits for 2 seconds
    Then User clicks on 'BU Criticality' menu
    Then User waits for 3 seconds
    Then User clicks on action button 'Add'
    Then User waits for 3 seconds
    Then User enters the BU Criticality details
    Then User waits for 10 seconds
    Then User clicks on save action button
    Then User waits for 10 seconds
    Then User verify if the BU Size Criticality is created
    Then User waits for 10 seconds