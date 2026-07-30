@IncidentManagementTransaction
Feature: Incident Management Transaction Module Automation


# Register Incident - Create
  @CreateRegisterIncident
  Scenario: Should be able to create a new Register Incident
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Incident Management' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on the 'Register Incident' section
    When User selects value in the "Incident Type" dropdown
    When User selects value in the "Incident SubType" dropdown
    Then User selects value in the "Incident Time" dropdown
    When User selects value in the "Incident Severity" dropdown
    When User selects value in the "Incident Caused By" dropdown
    When User selects value in the "Affected Group" dropdown
    When User selects value in the "Client" dropdown
    When User selects value in the "Client Contract" dropdown
    When User selects value in the "Area / Master Community" dropdown
    When User selects value in the "Property / Sub Community" dropdown
    When User selects value in the "Base Unit" dropdown
    Then User fills the Location and Department details
    Then User waits for 20 seconds
    Then User click on the Incident Save button
    Then User waits for 50 seconds

# Console Window - Open Incidents
  @OpenIncidents
  Scenario: Should be able to click,view, update status - Open Incidents
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Incident Management' in navigation panel
    Then User waits for 10 seconds
    Then User click the first incident in the open Incident page
#    Then User click on the Register Incident button
    Then User waits for 20 seconds
    Then User click on the Submit button in the detail page
    Then User fill the Approval Submission pop up
    Then User click the Submit button in the Approval Submission Incident pop up
    Then User waits for 50 seconds

# My Pending Actions
# My Pending Actions -  Awaiting Preliminary Reviews
  @AwaitingPreliminaryReviews(Draft_Incidents)
  Scenario: Should be able to view the draft incidents(update,change status)
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Incident Management' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on the 'Awaiting Preliminary Review' section
    Then User waits for 10 seconds
    Then User click the first incident in the open Incident page
    Then User waits for 30 seconds
    When User switches to new tab
#    Then User click on the Stakeholder Edit icon
#    Then User fills the Stakeholder details
#    Then User click on the Stakeholder submit button
    When User selects "Smoking Materials" checkbox from Incident Related To
#    Then User click the Edit Base Unit icon in the Incident Detail page
#    Then User fills the Base Unit details
#    Then User click the Base Unit Submit button
#    Then User edit the Incident Location Details in the Incident Detail page
#    Then User fills the Location details
#    Then User click the Location Submit button
#    Then User edit the Incident Department Details in the Incident Detail page
#    Then User fills the Department details
#    Then User click the Department Submit button
#    Then User click on the Submit button in the detail page
#    Then User fill the Approval Submission pop up
#    Then User click the Submit button in the Approval Submission Incident pop up
#    Then User scrolls down the Incident details page
    Then User waits for 50 seconds

# My Pending Actions - Approval Flow
# Console Window - Open Incidents
  @ConsoleWindowApproval
  Scenario: Should be able to Approve the Incidents(change status)
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits for 10 seconds

    Then User clicks on 'Incident Management' in navigation panel
    Then User waits for 10 seconds
    Then User move to the Awaiting ECM Approval tab
    Then User waits for 30 seconds

    Then User stores the first Incident Number
    Then User click the first incident in the open Incident page
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User click the Approve button in the Approval Login
    Then User fills the Comments in the Approval pop up
    Then User click the Save button in the Approval popup
    Then User waits for 30 seconds
    When User switches to new tab

    Then User switches back to incident list tab
    Then User waits for 30 seconds
    Then User move to the WO Generated tab
    Then User waits for 30 seconds
    Then User verifies the incident is present in WO Generated list
    Then User waits for 30 seconds



# Archives
# Archives - Closed Incidents
  @ClosedIncidents
  Scenario: Should be able to click and view , Archive Incident
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Incident Management' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on the 'Closed Incidents' section
    Then user click on the Export to Excel button
    Then User waits for 30 seconds

  @CancelledIncidents
  Scenario: Should be able to Cancel incident and Verify
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Incident Management' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on the 'Awaiting Preliminary Review' section
    Then User waits for 30 seconds

    Then User stores the first Incident Number
    Then User click the first incident in the open Incident page
    Then User waits for 30 seconds
    When User switches to new tab
    Then User click on the Cancel Incident button in the Incident detail page
    Then User fill the Cancel Incident pop up
    Then User click the Submit button in the Cancel Incident pop up

    Then User switches back to incident list tab
    Then User clicks on the 'Cancelled Incidents' section
    Then User waits for 30 seconds
    Then User verifies the cancelled incident number is displayed
    Then User waits for 30 seconds

@ExportToExcel_Incidents
Scenario: Should be able to download incident file
  Given User navigates to 'lattice.url' page
  Then User is at home screen after login with "username" and "password"
  Then User clicks on 'Incident Management' in navigation panel
  Then User waits for 10 seconds
  Then user click on the Export to Excel button
  Then User clicks on the 'Awaiting Preliminary Review' section
  Then User waits for 10 seconds
  Then user click on the Export to Excel button
  Then User waits for 30 seconds
  Then User clicks on the 'Closed Incidents' section
  Then user click on the Export to Excel button
  Then User waits for 30 seconds
  Then User clicks on the 'Cancelled Incidents' section
  Then user click on the Export to Excel button
  Then User waits for 30 seconds