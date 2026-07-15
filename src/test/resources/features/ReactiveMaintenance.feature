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

  @RMRequestDetailPageCheckWOStatus
  Scenario: Should be able to Open RM Detail Page and Add Check WO Status
    #handled scenarios are--
      # NotDespatched-Assign Technician-Appointment Booked-SiteAttended-WorkStarted-Completed
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    Then User Checks the WO Status in the WO detail page

  @RMRequestDetailPageModifyFaultCode
  Scenario: Should be able to Open RM Detail Page and Click Modify Fault Code and change Fault Code
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    When User clicks Modify Fault Code button 'Modify FC' if available
    When User select the '' Service Group dropdown
    When User select the '' Fault Category dropdown
    When User select the '' Fault Code dropdown
    #When User select the '' Priority dropdown
    #When User enters the details in the Modify Fault Code pop up
    Then User Clicks the Save Fault Code button

  @RMRequestDetailPageMarkADuplicate
  Scenario: Should be able to Open RM Detail Page and Mark a Duplicate WO when Mark Duplicate is clicked and saved
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    When User clicks Mark A Duplicate button 'Mark A Duplicate' if available
    When User Selects Primary WO from the Mark A Duplicate 'Mark A Duplicate' pop up
    Then User clicks on RM New Request save button
    #same save function for duplicate WO save

  @RMRequestDetailPageAddChildWO
    #Not Working as Date Picker is not accepting direct typing of values in the field.
  Scenario: Should be able to Open RM Detail Page and Add Child WO
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    When User clicks the Add Child WO in the side menu if available and click Add Child WO 'Add Child WO' button
    When User enters details in the Child WO pop up 'child WO'
    When User select the Child WO '' Service Group dropdown
    When User select the Child WO '' Fault Category dropdown
    When User select the Child WO '' Fault Code dropdown
    When User select the Child WO '' Technician dropdown
    Then User clicks on RM New Request save button
    #same save function for Child WO save

  @RMRequestDetailPageCancelWO
  Scenario: Should be able to Open RM Detail Page and Cancel WO
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    When User Clicks the Cancel WO Button if available and Add Cancel WO 'Cancel WO'
    When User enters details in the Cancel WO pop up 'Remarks for Cancel WO'
    When User select the Cancel WO '' Reason for Cancellation dropdown
    Then User clicks on RM Cancel WO Save button 'Save Cancel WO'

  @RMRequestDetailPageAddMaterialRequest
  Scenario: Should be able to Open RM Detail Page and Add Material Request
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM Transactions 'Reactive Maintenance' in side menu
    When User clicks on the RM Console Window Reactive WO 'Console Window Reactive WO' tab
    When User clicks the first WO to open the detail page
    When User clicks the Add Material Request in the side menu if available and click Add Material Request 'Add Material Request' button


