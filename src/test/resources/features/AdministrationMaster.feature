@AdministrationMaster
Feature: Administration Master Module Automation

# Note Type Category - Add , Update And Delete
  @addNoteTypeCategory
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
    Then User waits for 10 seconds
    Then User verify if the Note Type Category is created
    Then User waits for 10 seconds

  @updateNoteTypeCategory
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
    Then User waits for 10 seconds
    Then User verify if the Note Type Category is updated
    Then User waits for 10 seconds

  @deleteNoteTypeCategory
  Scenario: Should be able to delete a Note Type / Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Note Type / Category' section
#    Then User waits for 3 seconds
    Then User clicks on first available Note Type Category to delete
    Then User waits for 10 seconds

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
    Then User waits for 20 seconds
    And User clicks on Administration Save button
    Then User waits for 10 seconds
    Then User verify if the Document Type is created
    Then User waits for 10 seconds

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
    Then User move to 'Document Type' section
    Then User waits for 10 seconds

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
   Then User waits for 10 seconds
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
    Then User waits for 10 seconds

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
#    Then User waits for 10 seconds
    Then User verify if the Announcement is created
    Then User waits for 10 seconds

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
#    Then User waits for 10 seconds
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
    Then User waits for 10 seconds
    Then User clicks on Administration Save button
#    Then User waits for 10 seconds
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
    Then User waits for 10 seconds

  @ExportToExcelAdministration
  Scenario: Should be able to download Administration files
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
#    Then User waits for 3 seconds
    Then User click on the Master Administration Export to Excel button
#    Then User waits for 5 seconds
    Then User move to 'Note Type / Category' section
    Then User click on the Master Administration Export to Excel button
#    Then User waits for 5 seconds
    Then User move to 'Document Type' section
    Then User click on the Master Administration Export to Excel button
#    Then User waits for 5 seconds
    Then User move to 'Annual Holiday List' section
    Then User click on the Master Administration Export to Excel button
    Then User move to 'Announcement' section
    Then User click on the Master Administration Export to Excel button
    Then User move to 'Email Listener Setup' section
    Then User waits for 5 seconds
    Then User click on the Master Administration Export to Excel button
    Then User waits for 5 seconds
    Then User move to 'Working Days / Time' section
#    Then User waits for 5 seconds
    Then User click on the Master Administration Export to Excel button
    Then User waits for 20 seconds

  @ValidationNoteTypeCategory
  Scenario: User should not be able to save NoteType/Category form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Note Type / Category' section
    Then User waits for 3 seconds
    Then User clicks on button 'Add'
#    Then User waits for 3 seconds
    And User clicks on Administration Save button
    When User verify the inline error message 'Enter Note Type / Category' on Note Type Category
    Then User waits for 10 seconds
    When user verify the chars min len as 3 and max len as 100 for Note Type Category
    Then User waits for 10 seconds
    When User enters special characters in Note Type Category
    And User clicks on Administration Save button
    Then User waits for 10 seconds

  @ValidationDocumentType
  Scenario: User should not be able to save Document Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Document Type' section
#   Then User waits for 3 seconds
    Then User clicks on button 'Add'
    Then User verify Active checkbox is selected by default in Document Type
    Then User waits for 5 seconds
    And User clicks on Administration Save button
    When User verify the inline error message 'Enter Document Type' on Document Type
    Then User waits for 10 seconds
    When User verify the inline error message 'Select Document Related To' on Document Related To
    Then User waits for 10 seconds
    When user verify the chars min len as 3 and max len as 100 for Document Type
    Then User waits for 10 seconds
    When User enters special characters in Document Type
    And User clicks on Administration Save button
    Then User waits for 10 seconds

  @ValidationAnnualHoliday
  Scenario: User should not be able to save Annual Holiday form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Annual Holiday List' section
    Then User waits for 3 seconds
    Then User clicks on button 'Add'
    Then User waits for 3 seconds
    And User clicks on Administration Save button
    When User verify the inline error message 'Enter From Date' on From Date
    When User verify the inline error message 'Enter To Date' on To Date
    When User verify the inline error message 'Enter Holiday' on Holiday
    When user verify the chars min len as 3 and max len as 4000 for Holiday
#    Then User waits for 10 seconds
#    When User enters special characters in Holiday
#    And User clicks on Administration Save button
    Then User waits for 10 seconds

  @ValidationAnnouncement
  Scenario: User should not be able to save Announcement form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Announcement' section
    Then User waits for 3 seconds
    Then User clicks on button 'Add'
    Then User waits for 3 seconds
    And User clicks on Administration Save button
    When User verify the inline error message 'Enter Announcement Title' on Announcement Title
    Then User waits for 10 seconds
    When User verify the inline error message 'Enter Start Date' on Start Date
    When User verify the inline error message 'Enter End Date' on End Date
    When User verify the inline error message 'Enter Description' on Description
    Then User waits for 10 seconds
    When user verify the chars min len as 3 and max len as 100 for Announcement Title
    When user verify the chars min len as 3 and max len as 5000 for Description
    When User enters special characters in Announcement Title
    When User enters special characters in Description
    And User clicks on Administration Save button
    Then User waits for 10 seconds

  @ValidationEmailListenerSetup
  Scenario: User should not be able to save Email Listener Setup form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Administration' tab in data configuration page
    Then User move to 'Email Listener Setup' section
#    Then User waits for 3 seconds
    Then User clicks on button 'Add'
    Then User waits for 3 seconds
    And User clicks on Administration Save button
    When User verify the inline error message 'Enter Email Server' on Email Server
    When User verify the inline error message 'Enter Port Number' on Port Number
    When User verify the inline error message 'Enter Client Id' on Client Id
    When User verify the inline error message 'Enter Client Secret' on Client Secret
    When User verify the inline error message 'Enter Email Account' on Email Account
    When User verify the inline error message 'Enter Account Password' on Account Password
    When User verify the inline error message 'Enter Redirection URL' on Redirection URL
    When User verify the inline error message 'Enter Auth Code URL' on Auth Code URL
    When User verify the inline error message 'Enter Token Exchange URL' on Token Exchange URL
    When User verify the inline error message 'Enter Device URL' on Device URL
    When User verify the inline error message 'Select Encryption Method' on Encryption Method
    When User verify the inline error message 'Enter Scope' on Scope
    When user verify the chars min len as 3 and max len as 100 for Email Server
    When user verify the chars min len as 3 and max len as 100 for Port Number
    When user verify the chars min len as 3 and max len as 100 for Email Account
    When user verify the chars min len as 3 and max len as 100 for Account Password
    Then User waits for 10 seconds
    When User enters special characters in Email Server
    When User enters special characters in Port Number
    And User clicks on Administration Save button
    Then User waits for 10 seconds

