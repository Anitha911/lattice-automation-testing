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
     Then User gets the total record count
     Then User clicks on first available delete icon
     Then User verify if the city is deleted


