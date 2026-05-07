@GuardPatrolManagementTransaction
Feature: Guard Patrol Management Transaction Module Automation

  @addPatrolRoute
  Scenario: Should be able to add a Patrol Route
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    Then User clicks on Patrol Route button 'Add patrol Route'
    Then User fills up the Patrol Route button details
    Then User waits patrol route 2 seconds
    Then User clicks on Patrol Route save button
    Then User verify if the Guard Patrol Route is created

  @EditPatrolRoute
  Scenario: Should be able to Edit a Patrol Route
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    Then User clicks on active Patrol Route in the grid
    Then User clicks on Patrol Route Edit button
    Then User clicks on Patrol Route Update button

  @EditPatrolRouteUpdateStatus
  Scenario: Should be able to Edit a Patrol Route Status
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    Then User clicks on active Patrol Route in the grid
    Then User clicks on Patrol Route Update Status button
    Then User fills up the Patrol Route Update Status details
    Then User clicks on Patrol Route Status Save button

  @EditPatrolRouteAddRouteCheckPoints
  Scenario: Should be able to Add a Patrol Route Checkpoint in the Patrol Route Edit screen
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    Then User clicks on active Patrol Route in the grid
    Then User clicks on active Patrol Route Check Points in the grid
    Then User fills up the Patrol Route Check Points details
    Then User clicks the Patrol Route Check Points Save Button

  @EditPatrolRouteAddRouteTimings
  Scenario: Should be able to Add a Patrol Route Timings in the Patrol Route Edit screen
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    Then User clicks on active Patrol Route in the grid
    Then User clicks on  Patrol Route Timings ADD Button
    Then User fills up the Patrol Route Timings details
    Then User fills up the Patrol Route Timings Save Button

  @DeletePatrolRoute
  Scenario: Should be able to delete a Patrol Route
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    Then User clicks on valid Patrol Route to Delete
    Then User verify if the Guard Patrol Route is deleted

  @ExportToExcelPatrolRoute
  Scenario: Should be able to export to excel  Patrol Route
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    Then User clicks on PatrolRoute Export to Excel button

  @PatrolRouteGridPagination
  Scenario: Should be able to check pagination in Patrol Route Grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    When User Clicks on Guard Patrol Route grid 'pagination'

  @PatrolRouteGridDataPerPage
  Scenario: Should be able to Open Patrol Route check data per page in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard 'Patrol Route' tab
    When User clicks the Guard Patrol Route no of data per page 10 in the grid

  @AddPatrolSchedule
    #Issues are there
  Scenario: Should be able to add a Patrol Schedule
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Schedule 'Patrol Schedule' tab
    Then User clicks on Patrol Schedule button 'Add patrol Schedule'
    Then User fills up the Patrol Schedule details
    Then User fills up Patrol Schedule Start and End Dates
    Then User clicks on Patrol Schedule save button
    Then User verify if the Guard Patrol Schedule is created

  @ExportToExcelPatrolSchedule
  Scenario: Should be able to export to excel a Patrol Schedule
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Schedule 'Patrol Schedule' tab
    Then User Clicks on Patrol Schedule Export to Excel Button

  @PatrolScheduleGridPagination
  Scenario: Should be able to check pagination in Patrol Schedule Grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Schedule 'Patrol Schedule' tab
    When User Clicks on Guard Patrol Schedule grid Pagination 'pagination'

  @PatrolScheduleGridDataPerPage
  Scenario: Should be able to Open Patrol Schedule check data per page in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Schedule 'Patrol Schedule' tab
    When User clicks the Guard Patrol Schedule no of data per page 10 in the grid

  @EditPatrolSchedule
  Scenario: Should be able to Edit a Patrol Schedule
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Schedule 'Patrol Schedule' tab
    Then User clicks on active Patrol Schedule in the grid
    Then User clicks on Patrol Schedule Edit button
    Then User clicks on Patrol Schedule Update button

  @PatrolScheduleDetailPageViewUpdateStatusButtonClick
  Scenario: Should be able to Update Status Button in detail page Patrol Schedule
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Schedule 'Patrol Schedule' tab
    Then User clicks on active Patrol Schedule in the grid
    Then User clicks on Update Patrol Schedule Status
    Then User Enters data in Patrol Schedule Status
    Then User clicks on Patrol Schedule Status Save button

  @PatrolScheduleLeftSideMenu
  Scenario: Should be able to Left Status Button in detail page Patrol Schedule
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Schedule 'Patrol Schedule' tab
    Then User clicks on active Patrol Schedule in the grid
    Then User clicks on Left side menus
