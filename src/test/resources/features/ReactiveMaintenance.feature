@dataconfigReactiveMaintenance
Feature: Reactive Service data a configuration Module Automation

  @addNewRMRequest
  Scenario: Should be able to add New Request RM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM Transactions 'Reactive Maintenance' in side menu
    Then User clicks on the RM New Request 'New Request' tab
    Then User fills up the New Request details
    Then User clicks on RM New Request save button

