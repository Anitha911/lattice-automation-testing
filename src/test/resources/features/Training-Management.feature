@trainingManagement
Feature: Training Management Module Automation

  @addCompany
  Scenario: Should be able to add cooperate type company
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    Then User fills up the 'Corporate' type company details
    Then User clicks on save button
    Then User verify if the company is created

  @addCompany
  Scenario: Should be able to add Technical type company
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    Then User fills up the 'Technical' type company details
    Then User clicks on save button
    Then User verify if the company is created

  @addCompany
  Scenario: Should be able to add Audit type company
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    Then User fills up the 'Audit' type company details
    Then User clicks on save button
    Then User verify if the company is created

  @CompanyEdit
  Scenario: Should be able to edit a company
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Company' tab
    Then User clicks on first available company to edit
    Then User fills up the 'Audit' type company details
    Then User clicks on save button
    Then User verify if the company is created

  @CompanyDelete
  Scenario: Should be able to delete a company
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Company' tab
    Then User clicks on first available company to edit
    Then User fills up the 'Audit' type company details
    Then User clicks on save button
    Then User verify if the company is created
    Then User waits for 3 seconds
    Then User clicks on first available company to delete
    Then User verify if the company is deleted

  @trainingCourses
  Scenario: Should be able to add a course
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Courses' tab
    Then User clicks on button 'Add Course'
    Then User fills up the course details for '15' days validity
    Then User clicks on save button
    Then User verify if the course is created

  @trainingLevel
  Scenario: Should be able to add a course
    Given User is on "lattice.url" page
    Then User is at home screen after login with "username" and "password"
    Then User is on "trainingManagement.url" page
    Then User clicks on the 'Training Levels' tab
    Then User clicks on button 'Add Level'
    Then User fills up the level details
    Then User clicks on save button
#    Then User verify if the course is created