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
    Then User Clicks on Patrol Export to Excel Button

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

  @OpenPatrolPageDisplay
  Scenario: Should be able to display Open Patrol page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Open Patrol 'Open Patrol' tab

  @OpenPatrolExportToExcel
  Scenario: Should be able to display Open Patrol page and Export to Excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Open Patrol 'Open Patrol' tab
    Then User Clicks on Patrol Export to Excel Button

  @OpenPatrolGroupMessageSend
  Scenario: Should be able to display Open Patrol page and Click Group Message button to open the pop up
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Open Patrol 'Open Patrol' tab
    Then User Clicks on Open Patrol Group Message 'Group Message' Button
    When User selects Open Patrol Group Message Guard 'Select Guard' from the pop up
    When User Types message in the Message Textbox Open Patrol Send Message
    Then User clicks Open Patrol Group Message Send 'Group Message Send' Button

  @OpenPatrolDetailPage
  Scenario: Should be able to display Open Patrol Detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Open Patrol 'Open Patrol' tab
    When User clicks the first active Open Patrol in the grid to display detail page
    Then User clicks on Open Patrol page Left side menus

  @OpenPatrolDetailPageAddNote
  Scenario: Should be able to display Open Patrol Detail page and add Note
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Open Patrol 'Open Patrol' tab
    When User clicks the first active Open Patrol in the grid to display detail page
    Then User clicks on Open Patrol page Left side menu Note
    When User clicks on Open Patrol Add Notes
    Then User enters the Open Patrol Notes Details
    When User clicks Open Patrol Note Save Button

  @OpenPatrolDetailPageAssignSecGuard
  Scenario: Should be able to display Open Patrol Detail page and Assign Security Guard if guard is assigned in duty roaster
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Guard Open Patrol 'Open Patrol' tab
    When User clicks the first active Open Patrol in the grid to display detail page
    When User clicks the Assign Security Guard Button
    Then Security Guard is assigned if Duty roaster is set up properly
    Then User clicks Security Guard Save button

  @ConsoleWindowGuards
  Scenario: Should be able to display Console Window Guards
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Console Window Guards 'Guards' tab

  @ConsoleWindowGuardsLocationRefresh
  Scenario: Should be able to display Console Window Guards Location Refresh Button
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Console Window Guards 'Guards' tab
    When User clicks the Console Window Guard Locations Refresh 'Refresh' button

  @LiveGuardMonitoringMapView
  Scenario: Should be able to display Live Guard Monitoring MapView on selecting contract
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Live Guard Monitoring 'Map View'
    When User selects the Client details from the dropdown

  @PendingAssignment
  Scenario: Should be able to display Pending Assignment
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the My Pending Actions Pending Assignment 'Pending Assignment' tab

  @PendingAssignmentExportToExcel
  Scenario: Should be able to display Pending Assignment and Do Export To Excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the My Pending Actions Pending Assignment 'Pending Assignment' tab
    Then User Clicks on Patrol Export to Excel Button

  @PendingAssignmentDetailedView
  Scenario: Should be able to Open Pending Assignment detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the My Pending Actions Pending Assignment 'Pending Assignment' tab
    When User clicks the First active patrol in the grid

  @PendingAssignmentMapIconClick
  Scenario: Should be able to click Pending Assignment Map View Icon
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the My Pending Actions Pending Assignment 'Pending Assignment' tab
    When User clicks the Map View Icon to display the Map

  @PendingAssignmentAssignClick
  Scenario: Should be able to display Pending Assignment page and Assign Security Guard if guard is assigned in duty roaster
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the My Pending Actions Pending Assignment 'Pending Assignment' tab
    When User clicks the Assign Link in Pending Assignment Grid
    Then Security Guard is assigned if Duty roaster is set up properly
    Then User clicks Security Guard Save button

  @AwaitingSOSTriggered
  Scenario: Should be able to display Awaiting SOS triggered
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Awaiting SOS triggered 'Awaiting SOS triggered' tab

  @AwaitingSOSTriggeredMapClick
  Scenario: Should be able to display Awaiting SOS triggered and click Map Icon
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Awaiting SOS triggered 'Awaiting SOS triggered' tab
    When User clicks the First active SOS in the grid
    When User clicks Awaiting SOS Triggered Map Icon 'Map Icon' click

  @ArchivesElapsedPatrolPageDisplay
  Scenario: Should be able to display Elapsed Patrol Page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives Elapsed Patrol 'Elapsed Patrol' tab

  @ElapsedPatrolExportToExcel
  Scenario: Should be able to display Elapsed Patrol page and Export to Excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives Elapsed Patrol 'Elapsed Patrol' tab
    Then User Clicks on Patrol Export to Excel Button

  @ElapsedPatrolPagination
  Scenario: Should be able to display Elapsed Patrol page and Pagination should work in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives Elapsed Patrol 'Elapsed Patrol' tab
    When User Clicks on Archives Elapsed Patrol grid Pagination 'pagination'

  @ElapsedPatrolDataPerPage
  Scenario: Should be able to Elapsed Patrol check data per page in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives Elapsed Patrol 'Elapsed Patrol' tab
    When User clicks Archives Elapsed Patrol no of data per page 10 in the grid

  @ElapsedPatrolDetailedView
  Scenario: Should be able to Open Elapsed Patrol detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives Elapsed Patrol 'Elapsed Patrol' tab
    When User clicks the First active Elapsed patrol in the grid

  @ArchivesSOSTriggeredPageDisplay
  Scenario: Should be able to display SOS triggered Page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives SOS Triggered 'SOS Triggered' tab

  @ArchivesSOSTriggeredPagePagination
  Scenario: Should be able to display SOS Triggered and Pagination should work in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives SOS Triggered 'SOS Triggered' tab
    When User Clicks on Archives SOS Triggered Grid Pagination 'pagination'

  @ArchivesSOSTriggeredPageDataPerPage
  Scenario: Should be able to Check  SOS Triggered data per page in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives SOS Triggered 'SOS Triggered' tab
    When User clicks Archives SOS Triggered no of data per page 10 in the grid

  @ArchivesClosedPatrolDetailedView
  Scenario: Should be able to Open Closed Patrol detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives Closed Patrol 'Closed Patrol' tab
    When User clicks the First active Closed patrol in the grid

  @ClosedPatrolExportToExcel
  Scenario: Should be able to display Closed Patrol page and Export to Excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Guard 'Guard Patrol Management' in navigation panel
    Then User clicks on the Archives Closed Patrol 'Closed Patrol' tab
    Then User clicks on PatrolRoute Export to Excel button
