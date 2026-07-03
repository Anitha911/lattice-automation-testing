@dataconfigReactiveMaintenance
Feature: Reactive Service data a configuration Module Automation

  @addNewRMRequest
  Scenario: Should be able to add New Request RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM New Request 'New Request' tab
    When User fills up the New Request details
    Then User clicks on RM New Request save button

  @addNewRMRequestValidationInput
  Scenario: User should not be able to save RM New Request with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM New Request 'New Request' tab
    Then User clicks on RM New Request save button
    Then user verify the inline error message 'Work Description is Required' on New Request RM

  @RMRequestDetailPage
  Scenario: Should be able to Open RM Detail Page
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    Then User clicks the first WO to open the detail page

  @RMRequestDetailPageAddNotes
  Scenario: Should be able to Open RM Detail Page and Add Notes
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    When User Clicks on Add RM Notes 'Add RM Notes'
    When User enters the RM Notes Details
    Then User Clicks RM Notes Save Button

  @RMRequestDetailPageAddPermitToWork
  Scenario: Should be able to Open RM Detail Page and Add Permit To Work
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    When User clicks Permit To Work section in the left side
    When User Clicks on Add RM Permit To Work 'Permit To Work'
    When User enters the RM Permit To Work Details
    Then User Clicks RM Permit To Work Save Button

  @RMRequestDetailPageCheckWOStatusNotDespatchedAndClickAssignSiteAttented
  Scenario: Should be able to Open RM Detail Page and Add Check WO Status whether it is NotDespatched and Assign Technician
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    When User Checks the WO Status in the WO detail page NotDespatched and Assign to Technician and Site Attented




