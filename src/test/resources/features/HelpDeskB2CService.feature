@HelpDeskB2CService
Feature: HelpDeskB2C Service Module Automation

  @ViewHelpDesk
  Scenario: Should be able to View Help Desk page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab

  @HelpDeskDirectWOBookingButtonClick
  Scenario: Should be able to View Help Desk page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on HelpDesk 'Help Desk' in navigation panel
    Then User clicks on the Call Centre 'Help Desk' tab
    When User clicks Direct WO Booking Button