@EssentialServicesMaster
Feature: Essential Services Master Module Automation
# Regulatory Body - Add , Update And Delete
  @addRegulatoryBody
  Scenario: Should be able to create a new Regulatory Body
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on button 'Add'
    Then User fills the Regulatory Body details
    And User clicks on Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Regulatory Body is created
    Then User waits for 3 seconds

  @updateRegulatoryBody
  Scenario: Should be able to edit a Regulatory Body
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on first available Regulatory Body to edit
    Then User waits for 3 seconds
    Then User updates the Regulatory Body details
    Then User clicks on Essential Services Save button
    Then User verify if the Regulatory Body is updated
    Then User waits for 3 seconds

  @deleteRegulatoryBody
  Scenario: Should be able to delete a Regulatory Body
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User waits for 3 seconds
    Then User clicks on first available Regulatory Body to delete

# Connectivity Category- Add , Update And Delete
  @addConnectivityCategory
  Scenario: Should be able to create a new Connectivity Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity Category' section
    Then User clicks on button 'Add'
    Then User fills the Connectivity Category details
    And User clicks on Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Connectivity Category is created
    Then User waits for 3 seconds

  @updateConnectivityCategory
  Scenario: Should be able to edit a Connectivity Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on first available Connectivity Category to edit
    Then User waits for 3 seconds
    Then User updates the Regulatory Body details
    Then User clicks on Essential Services Save button
    Then User verify if the Regulatory Body is updated
    Then User waits for 3 seconds

  @deleteConnectivityCategory
  Scenario: Should be able to delete a Connectivity Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User waits for 3 seconds
    Then User clicks on first available Connectivity Category to delete