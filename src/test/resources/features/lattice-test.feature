@trainingManagement
Feature: Training Management Module Automation

  @addCompany
  Scenario: Should be able to cooperate type company
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    Then User fills up the 'Corporate' type company details
    Then User waits for 150 seconds


  @addCompany
  Scenario: Should be able to cooperate type company
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    Then User fills up the 'Technical' type company details

  @addCompany
  Scenario: Should be able to cooperate type company
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    Then User fills up the 'Audit' type company details
