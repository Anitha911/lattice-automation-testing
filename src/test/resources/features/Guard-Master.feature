@dataconfigguard
Feature: Guard data configuration Module Automation

  @addPatrolModes
  Scenario: Should be able to add Patrolling modes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on button patrol add 'Add'
    Then User fills up the 'Mode' Patrol mode details
    Then User clicks on Patrol Mode save button
    Then User verify if the Patrol Mode is created

  @PatrolModesEdit
    Scenario: Should be able to edit a company/prevent duplicate
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on 'Data configuration' in side menu
      Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
      Then User clicks on active Patrol mode in the grid
      Then User clicks on Patrol Mode save button
      Then User verify if the Patrol Mode is created

  @PatrolModesDelete
    Scenario: Should be able to delete a Patrol Mode
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on first Valid Patrol Mode to delete
    Then User verify if the Mode is deleted

  @ExportToExcelMode
    Scenario: Should be able to export to excel  Patrol Mode
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on Mode Export to Excel button

  @addPatrolGuardShifts
  Scenario: Should be able to add Patrolling Shifts
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on button shifts add 'Add'
    Then User fills up the 'Shift' Patrol Shift details
    Then User clicks on Patrol Shift save button
    Then User verify if the Patrol Shift is created

  @PatrolShiftEdit
  Scenario: Should be able to edit a company
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on active Patrol Shift in the grid
    Then User clicks on Patrol Shift save button
    Then User verify if the Patrol Shift is created

  @PatrolShiftDelete
  Scenario: Should be able to delete a Patrol Mode
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on first Valid Patrol Shift to delete
    Then User verify if the Shift is deleted

  @ExportToExcelShift
  Scenario: Should be able to export to excel  Patrol Mode
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on Mode Export to Excel button