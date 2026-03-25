@AdministrationMaster
Feature: Administration Master Module Automation

# Note Type / Category - Add , Update And Delete
  @addNoteType/Category
  Scenario: Should be able to create a new Note Type / Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Note Type / Category' section
    Then User clicks on button 'Add'
    Then User fills the Note Type Category details
    Then User waits for 10 seconds
    And User clicks on Administration Save button
    Then User verify if the Note Type Category is created
    Then User waits for 3 seconds

  @updateNoteType/Category
  Scenario: Should be able to edit a Note Type / Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Note Type / Category' section
    Then User clicks on first available Note Type Category to edit
    Then User waits for 3 seconds
    Then User updates the Note Type Category details
    Then User clicks on Administration Save button
    Then User verify if the Note Type Category is updated
    Then User waits for 3 seconds

  @deleteNoteType/Category
  Scenario: Should be able to delete a Note Type / Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Note Type / Category' section
    Then User waits for 3 seconds
    Then User clicks on first available Note Type Category to delete


  # Document Type - Add , Update And Delete
  @addDocumentType
  Scenario: Should be able to create a new Document Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Document Type' section
    Then User clicks on button 'Add'
    Then User fills the Document Type details
    Then User waits for 10 seconds
    And User clicks on Administration Save button
    Then User verify if the Document Type is created
    Then User waits for 3 seconds

  @updateDocumentType
  Scenario: Should be able to edit a Document Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Document Type' section
    Then User clicks on first available Document Type to edit
    Then User waits for 3 seconds
    Then User updates the Document Type details
    Then User clicks on Administration Save button
    Then User verify if the Document Type is updated
    Then User waits for 3 seconds

  @deleteDocumentType
  Scenario: Should be able to delete a Document Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Document Type' section
    Then User waits for 3 seconds
    Then User clicks on first available Document Type to delete

#  Annual Holiday List - Add , Update And Delete

  @addAnnualHolidayList
  Scenario: Should be able to create a new Annual Holiday List
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Annual Holiday List' section
    Then User clicks on button 'Add'
    Then User fills the Annual Holiday List details
    Then User waits for 10 seconds
    And User clicks on Administration Save button
    Then User verify if the Annual Holiday List is created
    Then User waits for 3 seconds

 @updateAnnualHolidayList

  Scenario: Should be able to edit a Annual Holiday List
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Annual Holiday List' section
    Then User clicks on first available Annual Holiday List to edit
    Then User waits for 3 seconds
    Then User updates the Annual Holiday details
    Then User clicks on Administration Save button
    Then User verify if the Annual Holiday List is updated
    Then User waits for 3 seconds

@deleteAnnualHolidayList

  Scenario: Should be able to delete a Annual Holiday List
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Annual Holiday List' section
    Then User waits for 3 seconds
    Then User clicks on first available Annual Holiday List to delete

#  Announcement - Add , Update And Delete
  @addAnnouncement
  Scenario: Should be able to create a new Announcement
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Announcement' section
    Then User clicks on button 'Add'
    Then User fills the Announcement details
    Then User waits for 10 seconds
    And User clicks on Administration Save button
    Then User verify if the Announcement is created
    Then User waits for 3 seconds

  @updateAnnouncement
  Scenario: Should be able to edit a Announcement
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Announcement' section
    Then User clicks on first available Announcement to edit
    Then User waits for 3 seconds
    Then User updates the Announcement details
    Then User clicks on Administration Save button
    Then User verify if the Announcement is updated
    Then User waits for 3 seconds

@deleteAnnouncement
Scenario: Should be able to delete a Announcement
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Announcement' section
    Then User waits for 3 seconds
    Then User clicks on first available Announcement to delete

  #Email Listener Setup - Add , Update And Delete

  @addEmailListenerSetup
  Scenario: Should be able to create a new Email Listener Setup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Email Listener Setup' section
    Then User clicks on button 'Add'
    Then User fills the Email Listener Setup details
    Then User waits for 10 seconds
    And User clicks on Administration Save button
    Then User verify if the Email Listener Setup is created
    Then User waits for 3 seconds

@updateEmailListenerSetup
Scenario: Should be able to edit a Email Listener Setup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Email Listener Setup' section
    Then User clicks on first available Email Listener Setup to edit
    Then User waits for 3 seconds
    Then User updates the Email Listener Setup details
    Then User clicks on Administration Save button
    Then User verify if the Email Listener Setup is updated
    Then User waits for 3 seconds

  @deleteEmailListenerSetup
  Scenario: Should be able to delete a Email Listener Setup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Email Listener Setup' section
    Then User waits for 3 seconds
    Then User clicks on first available Email Listener Setup to delete