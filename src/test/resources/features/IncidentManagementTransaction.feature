@IncidentManagementTransaction
Feature: Incident Management Transaction Module Automation


# Register Incident - Create
  @CreateRegisterIncident
  Scenario: Should be able to create a new Register Incident
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Incident Management' in navigation panel
