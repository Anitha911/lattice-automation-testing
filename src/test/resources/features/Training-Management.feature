@trainingManagement
Feature: Training Management Module Automation

  @addCompany
  Scenario: Should be able to add cooperate type company
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Company' tab
    Then User clicks on button 'Add Company'
    Then User fills up the 'Corporate' type company details
    Then User clicks on save button
    Then User verify if the company is created

  @CompanyEdit
  Scenario: Should be able to edit a company
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Company' tab
    Then User clicks on first available company to edit
    Then User fills up the 'Audit' type company details
    Then User clicks on save button
    Then User verify if the company is created

  @trainingCourses
  Scenario: Should be able to add a course
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Courses' tab
    Then User clicks on button 'Add Course'
    Then User fills up the course details for '15' days validity
    Then User clicks on save button
    Then User verify if the course is created

  @trainingLevel
  Scenario: Should be able to add a training level
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Levels' tab
    Then User clicks on button 'Add Level'
    Then User fills up the level details
    Then User clicks on save button
    Then User verify if the training level is created

  @trainingFrequency
  Scenario: Should be able to add a training frequency
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Frequency' tab
    Then User clicks on button 'Add Frequency'
    Then User fills up the training frequency level details
    Then User clicks on save button
    Then User verify if the training frequency is created

  @trainingVenues
  Scenario: Should be able to add a Training Venues
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Venues' tab
    Then User clicks on button 'Add Venue'
    Then User fills up the training venue details
    Then User clicks on save button
    Then User verify if the training frequency is created

  @TrainersAssessors
  Scenario: Should be able to add a Trainers Assessors
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Trainers/Assessors' tab
    Then User clicks on button 'Add Trainers/Assessors'
    Then User fills up the Trainers Assessors details
    Then User clicks on save button
    Then User verify if the training frequency is created


  @CompanyDelete
  Scenario: Should be able to delete a company
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Company' tab
    Then User clicks on first available company to edit
    Then User fills up the 'Audit' type company details
    Then User clicks on save button
    Then User verify if the company is created
    Then User waits for 3 seconds
    Then User clicks on first available company to delete
    Then User verify if the company is deleted


  @TrainingSchedules1231
  Scenario: Should be able to add a Training Schedules
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Training Management' in navigation panel
    Then User clicks on the 'Training Schedules' tab
    Then User clicks on button 'Add Schedule'
    Then User fills up the Training Schedules details
    Then User fills start and end time and date
    Then User clicks on save button

    @ClosedScheduleWithoutEffectiveness
    Scenario: Should be able to Close the schedule
      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on 'Training Management' in navigation panel
      Then User clicks on the 'Training Schedules' tab
#      Then User clicks on button 'Add Schedule'
#      And User fills up the training schedule details
#      Then User clicks on save button
      Then User clicks on first available schedule record
      Then User clicks on the 'Participants Planning' tab in training schedule page
      Then User clicks on 'Include Participants' button in training Schedule page
      And User waits for 5 seconds
      And User selects the planned participants
      Then User clicks on save button
      Then User clicks on button 'Status Update'
      And User updates the training status to 'Scheduled'
      And User clicks on update button
      Then User clicks on button 'Status Update'
      And User updates the training status to 'Active'
      And User clicks on update button
      Then User clicks on the 'Actual Participants' tab in training schedule page
      Then User clicks on 'Include Staff from Planned Participants' button in training Schedule page
      And User selects the planned participants
      Then User clicks on save button
      Then User clicks on 'Include Staff From Others' button in training Schedule page
      And User selects the planned participants
      Then User clicks on save button
      Then User clicks on button 'Status Update'
      And User updates the training status to 'Training Completed'
      Then User clicks on button 'Closure'