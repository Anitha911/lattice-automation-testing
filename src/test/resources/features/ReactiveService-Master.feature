@dataconfigReactiveServiceMaster
Feature: Reactive Service data a configuration Module Automation

  @addServiceGroup
  Scenario: Should be able to add Service Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on button Service Group add 'Add'
    Then User fills up the 'Service Group' Service Group details
    Then User clicks on Service Group save button
    Then User verify if the Service Group is created

  @EditServiceGroup
  Scenario: Should be able to add Service Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on button Service Group add 'Add'
    Then User fills up the 'Service Group' Service Group details
    Then User clicks on Service Group save button
    Then User verify if the Service Group is created
    Then User clicks on active Service Group in the grid
    Then User clicks on Service Group save button
    Then User verify if the Service Group is created
