@Property&ContractManagement
Feature: Property Management Transaction Module Automation

#  /////////////////////// @Clients
  @Clients @Add
  Scenario: User Should be able to add it in PCM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Property & Contract Management' in navigation panel
    And User clicks on hamburger icon
    And User clicks on 'Clients' in sidebar menu
    And User clicks on button 'Add Client'
    When User get Client default code field value
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_radtxtCustomerName'
    When User verify special characters are not allowed in 'radtxtReferenceCode'
    When User verify special characters are not allowed in 'radtxtContactPerson'
    When User verify special characters are not allowed in 'radtxtAddressLine1'
    And User Enters Client Name and Ext Ref Code
    And User select the Client ClientType dropdown
    And User Enters Client contact details
    And User select the Client Country City CustomerImprotance dropdown
    And User clicks on Save button in Property Management Transaction Section
    Then User verifies added Client details in table

#  /////////////////////// @Contacts
  @Contacts @Add
  Scenario: User Should be able to add it in PCM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Property & Contract Management' in navigation panel
    And User clicks on hamburger icon
    And User clicks on 'Contacts' in sidebar menu
    And User clicks on button 'Add Contact'
    When User verify special characters are not allowed in 'radtxtCustomerName'
    When User verify special characters are not allowed in 'radtxtPhone'
    When User verify special characters are not allowed in 'radtxtExt'
    When User verify special characters are not allowed in 'radtxtMobileNumber'
    And User Enters Contact Name and Ext Ref Code
    And User select the Contact ContactType dropdown
    And User Enters Contacts contact details
    And User clicks on Save button in Property Management Transaction Section
    Then User verifies added Contacts details in table

#  /////////////////////// @Parameter Steup
  @Parameter @Add
  Scenario: User Should be able to add it in PCM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Property & Contract Management' in navigation panel
    And User clicks on hamburger icon
    And User clicks on 'PMS Parameter Setup' in sidebar menu
    And User clicks on button 'Add Measurement Parameter'
    When User get Parameter default code field value
    When User verify special characters are not allowed in 'radtxtMeasurementParaName'
    And User select the Measurement Category SubCategory dropdown
    And User Enters Parameter Name and Default Severity dropdown
    And User clicks Parameter Options and Description
    And User select the Service Parameter dropdowns
    And User Enters SLA Parameter duration mins
    And User clicks on Save button in Property Management Transaction Section
    Then User verifies added Parameter details in table

