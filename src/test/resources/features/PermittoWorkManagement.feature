@PermittoWorkManagement
Feature: Permit to Work Management Module Automation

  @AddPTWType
  Scenario: Should be able to add PTW Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on PTW icon in side panel
    Then User clicks on PTW Checklist by Type tab
    Then User clicks on the action button 'Add PTW Type'
    Then User enters 'PTW Type' details
    Then User waits for 3 seconds
    Then User clicks on the save action button
    Then User waits for 10 seconds
    Then User verify if the type is created
    Then User waits for 10 seconds

  @AddChecklistforPTWType
  Scenario: Should be able to add checklists for PTW Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on PTW icon in side panel
    Then User clicks on PTW Checklist by Type tab
    Then User filters and clicks the Draft status record
    Then User waits for 3 seconds
    Then User adds required checklist
    Then User waits for 10 seconds
#    Then User fills in the necessary checklist details
#    Then User clicks on save
#    Then User verify if the checklist is created
    Then User waits for 10 seconds
