@HelpDeskB2CService
Feature: HelpDeskB2C Service Module Automation

  @ViewHelpDesk
  Scenario: Should be able to View Help Desk page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab

  @HelpDeskDirectWOBookingButtonClick
  Scenario: Should be able to Click Direct WO Booking button and detail page to be displayed
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Direct WO Booking Button

  @HelpDeskAddNewContactButtonClick
  Scenario: Should be able to View Help Desk page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Help Desk Add New Contact Button

  @HelpDeskSaveNewContactDetails
  Scenario: Should be able to View Help Desk page and enter the details and Save
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Help Desk Add New Contact Button
    Then User enter the details in Add New Contact pop up
    When User clicks the Help Desk New Contact Save button

  @HelpDeskNewContactDetailsCancelClick
  Scenario: Should be able to View Help Desk page and click Cancel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Help Desk Add New Contact Button
    When User clicks the Help Desk New Contact Cancel button

  @HelpDeskSearchCheck
  Scenario: Should be able to search in Help Desk page using dropdown Option
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    Then User selects Help Desk option from the search dropdown
    When User Help Desk enters search term
    Then User clicks Search button

  @HelpDeskGridPagination
  Scenario: Should be able to check pagination in HelpDesk Grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User Clicks on Help Desk grid 'pagination'

  @HelpDeskGridDataPerPage
  Scenario: Should be able to check data per page in the grid in the Help desk Grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks the Help Desk no of data per page 10 in the grid

