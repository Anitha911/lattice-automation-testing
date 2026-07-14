@LocationManagement
Feature: Location Management Module Automation

#  /////////////////////// @City
  @City @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on button 'Add'
    When User get City default code field value
    When User verify special characters are not allowed in 'radtxtCityName'
    And User Enters City Name
    And User clicks on Save button in Location Management Section
    Then User verifies added City details in table

  @City @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    Then User Select the page size 50
    When User select the City Type record to edit
    When User get City default code field value
    And User Enters City Name
    And User clicks on Save button in Location Management Section
    Then User verifies added City details in table

  @City @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on button 'Add'
    When User get City default code field value
    When User verify special characters are not allowed in 'radtxtCityName'
    And User Enters City Name
    And User clicks on Save button in Location Management Section
    Then User verifies added City details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @City @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 50 for City Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter City Name' on Data Configuration

#  /////////////////////// @Area group
  @AreaGroup @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Area Group' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Area Group default code field value
    When User verify special characters are not allowed in 'radtxtAreaGroupName'
    And User Enters Area Group Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Area Group details in table

  @AreaGroup @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Area Group' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Area Group record to edit
    When User get Area Group default code field value
    And User Enters Area Group Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Area Group details in table

  @AreaGroup @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Area Group' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Area Group default code field value
    When User verify special characters are not allowed in 'radtxtAreaGroupName'
    And User Enters Area Group Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Area Group details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @AreaGroup @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Area Group' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Area Group
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Area Group Name' on Data Configuration

#  /////////////////////// @Area
  @Area @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Area' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Area default code field value
    When User verify special characters are not allowed in 'radtxtAreaName'
    And User select the Area Group Area dropdown
    And User Enters Area Name
    And User select the City Area dropdown
    And User clicks on Save button in Location Management Section
    Then User verifies added Area details in table

  @Area @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Area' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Area record to edit
    When User get Area default code field value
    And User select the Area Group Area dropdown
    And User Enters Area Name
    And User select the City Area dropdown
    And User clicks on Save button in Location Management Section
    Then User verifies added Area details in table

  @Area @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Area' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Area default code field value
    When User verify special characters are not allowed in 'radtxtAreaName'
    And User select the Area Group Area dropdown
    And User Enters Area Name
    And User select the City Area dropdown
    And User clicks on Save button in Location Management Section
    Then User verifies added Area details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Area @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Area' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 50 for Area
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Select Area Group' on Data Configuration
    Then user verify the inline error message 'Enter Area' on Data Configuration
    Then user verify the inline error message 'Select City' on Data Configuration

#  /////////////////////// @Property
  @Property @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Property' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Property default code field value
    When User verify special characters are not allowed in 'radtxtPropName'
    And User select the Client Name dropdown
    And User Enters Property Name
    And User select the Area dropdown in Property
    And User select the Property Type dropdown in Property
    And User select the Criticality dropdown in Property
    And User select the Ownership Type dropdown in Property
    And User Enters Project Number Plot Number Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Property details in table

  @Property @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Property' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Property record to edit
    When User get Property default code field value
    And User select the Client Name dropdown
    And User Enters Property Name
    And User select the Area dropdown in Property
    And User select the Property Type dropdown in Property
    And User select the Criticality dropdown in Property
    And User select the Ownership Type dropdown in Property
    And User Enters Project Number Plot Number Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Property details in table

  @Property @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Property' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Property default code field value
    When User verify special characters are not allowed in 'radtxtPropName'
    And User select the Client Name dropdown
    And User Enters Property Name
    And User select the Area dropdown in Property
    And User select the Property Type dropdown in Property
    And User select the Criticality dropdown in Property
    And User select the Ownership Type dropdown in Property
    And User Enters Project Number Plot Number Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Property details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Property @ErrorValidationMaxLength
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Property' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Property Name
    When user verify the chars max len as 50 for Property Project NO
    When user verify the chars max len as 6 for Property Plot NO
    When user verify the chars min len as 3 and max len as 6 for Property Reference Code
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Property' on Data Configuration

#  /////////////////////// @Zone Group
  @ZoneGroup @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Group' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtZoneGroupCode'
    When User verify special characters are not allowed in 'radtxtZoneGroupName'
    And User Enters Zone Group Code
    And User Enters Zone Group Name
    And User select the Property dropdown in Zone Group
    And User Enters Zone Group Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Group details in table

  @ZoneGroup @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Group' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Zone Group record to edit
    And User Enters Zone Group Code
    And User Enters Zone Group Name
    And User select the Property dropdown in Zone Group
    And User Enters Zone Group Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Group details in table

  @ZoneGroup @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Group' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtZoneGroupCode'
    When User verify special characters are not allowed in 'radtxtZoneGroupName'
    And User Enters Zone Group Code
    And User Enters Zone Group Name
    And User select the Property dropdown in Zone Group
    And User Enters Zone Group Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Group details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @ZoneGroup @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Group' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 10 for Zone Group Code
    When user verify the chars min len as 3 and max len as 50 for Zone Group Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Zone Group Code' on Data Configuration
    Then user verify the inline error message 'Enter Zone Group Name' on Data Configuration
    Then user verify the inline error message 'Select Property' on Data Configuration

#  /////////////////////// @Zone
  @Zone @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Zone default code field value
    When User verify special characters are not allowed in 'radtxtZoneName'
    And User Enters Zone Name
    And User select the Property dropdown in Zone
    And User Enters Zone Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone details in table

  @Zone @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Zone record to edit
    When User get Zone default code field value
    And User Enters Zone Name
    And User select the Property dropdown in Zone
    And User Enters Zone Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone details in table

  @Zone @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Zone default code field value
    When User verify special characters are not allowed in 'radtxtZoneName'
    And User Enters Zone Name
    And User select the Property dropdown in Zone
    And User Enters Zone Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Zone @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Zone Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Zone' on Data Configuration
    Then user verify the inline error message 'Select Property' on Data Configuration

#  /////////////////////// @Sub Zone
  @SubZone @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Sub Zone' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Sub Zone default code field value
    When User verify special characters are not allowed in 'radtxtsubzonename'
    And User Enters Sub Zone Name
    And User select the Property Zone dropdown in Sub Zone
    And User Enters Sub Zone Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Sub Zone details in table

  @SubZone @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Sub Zone' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Sub Zone record to edit
    When User get Sub Zone default code field value
    And User Enters Sub Zone Name
    And User select the Property Zone dropdown in Sub Zone
    And User Enters Sub Zone Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Sub Zone details in table

  @SubZone @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Sub Zone' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Sub Zone default code field value
    When User verify special characters are not allowed in 'radtxtsubzonename'
    And User Enters Sub Zone Name
    And User select the Property Zone dropdown in Sub Zone
    And User Enters Sub Zone Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Sub Zone details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @SubZone @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Sub Zone' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Sub Zone Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Sub Zone Name' on Data Configuration
    Then user verify the inline error message 'Select Property' on Data Configuration
    Then user verify the inline error message 'Select Zone' on Data Configuration

#  /////////////////////// @Base Unit
  @BaseUnit @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Base Unit' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Base Unit default code field value
    When User verify special characters are not allowed in 'radtxtBUName'
    And User Enters Base Unit Name
    And User select the Property Zone SubZone dropdown in Base Unit
    And User select the BUF Type and BUF SubType dropdown in Base Unit
    And User select the BU Size Type and BU Criticality dropdown in Base Unit
    And User Enters Remarks in Base Unit
    And User Enters Base Unit Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Base Unit details in table

  @BaseUnit @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Base Unit' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Base Unit record to edit
    When User get Base Unit default code field value
    And User Enters Base Unit Name
    And User select the Property Zone SubZone dropdown in Base Unit
    And User select the BUF Type and BUF SubType dropdown in Base Unit
    And User select the BU Size Type and BU Criticality dropdown in Base Unit
    And User Enters Remarks in Base Unit
    And User Enters Base Unit Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Base Unit details in table

  @BaseUnit @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Base Unit' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Base Unit default code field value
    When User verify special characters are not allowed in 'radtxtBUName'
    And User Enters Base Unit Name
    And User select the Property Zone SubZone dropdown in Base Unit
    And User select the BUF Type and BUF SubType dropdown in Base Unit
    And User select the BU Size Type and BU Criticality dropdown in Base Unit
    And User Enters Remarks in Base Unit
    And User Enters Base Unit Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Base Unit details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @BaseUnit @ErrorValidationMaxLength
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Base Unit' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Base Unit Name
    When user verify the chars min len as 3 and max len as 250 for Base Unit Remarks
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Base Unit Name' on Data Configuration
    Then user verify the inline error message 'Select Property' on Data Configuration
    Then user verify the inline error message 'Select Zone' on Data Configuration
    Then user verify the inline error message 'Select Sub Zone' on Data Configuration
    Then user verify the inline error message 'Select BU Functional Type' on Data Configuration
    Then user verify the inline error message 'Select BU Functional Sub Type' on Data Configuration
    Then user verify the inline error message 'Select BU Criticality' on Data Configuration
    Then user verify the inline error message 'Remarks is required' on Data Configuration

#  /////////////////////// @Sub Unit
  @SubUnit @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Sub Unit' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtSubUnitCode'
    When User verify special characters are not allowed in 'radtxtSubUnitName'
    And User Enters Sub Unit Code
    And User Enters Sub Unit Name
    And User select the Property ZoneGroup Zone SubZone BaseUnit dropdown in Sub Zone
    And User Enters Sub Unit Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Sub Unit details in table

  @SubUnit @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Sub Unit' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Sub Unit record to edit
    And User Enters Sub Unit Code
    And User Enters Sub Unit Name
    And User select the Property ZoneGroup Zone SubZone BaseUnit dropdown in Sub Zone
    And User Enters Sub Unit Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Sub Unit details in table

  @SubUnit @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Sub Unit' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtSubUnitCode'
    When User verify special characters are not allowed in 'radtxtSubUnitName'
    And User Enters Sub Unit Code
    And User Enters Sub Unit Name
    And User select the Property ZoneGroup Zone SubZone BaseUnit dropdown in Sub Zone
    And User Enters Sub Unit Reference Code
    And User clicks on Save button in Location Management Section
    Then User verifies added Sub Unit details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @SubUnit @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Sub Unit' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 10 for Sub Unit Code
    When user verify the chars min len as 3 and max len as 50 for Sub Unit Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Sub Unit code' on Data Configuration
    Then user verify the inline error message 'Enter Sub Unit Name' on Data Configuration
    Then user verify the inline error message 'Select Property' on Data Configuration
    Then user verify the inline error message 'Select Zone Group' on Data Configuration
    Then user verify the inline error message 'Select Zone' on Data Configuration
    Then user verify the inline error message 'Select Sub Zone' on Data Configuration
    Then user verify the inline error message 'Select Base Unit' on Data Configuration

#  /////////////////////// @Space
  @Space @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Space' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtSpName'
    And User Enters Space Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Space details in table

  @Space @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Space' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Space record to edit
    And User Enters Space Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Space details in table

  @Space @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Space' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtSpName'
    And User Enters Space Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Space details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Space @ErrorValidationMaxLength
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Space' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Space Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Space Name' on Data Configuration

#  /////////////////////// @Zone Criticality
  @ZoneCriticality @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtZoneCriticality'
    And User Enters Zone Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Criticality details in table

  @ZoneCriticality @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Criticality' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Zone Criticality record to edit
    And User Enters Zone Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Criticality details in table

  @ZoneCriticality @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtZoneCriticality'
    And User Enters Zone Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Criticality details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @ZoneCriticality @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Zone Criticality
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Zone Criticality' on Data Configuration

#  /////////////////////// @Zone Group Criticality
  @ZoneGroupCriticality @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Group Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtZoneGroupCriticality'
    And User Enters Zone Group Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Group Criticality details in table

  @ZoneGroupCriticality @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Group Criticality' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Zone Group Criticality record to edit
    And User Enters Zone Group Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Group Criticality details in table

  @ZoneGroupCriticality @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Group Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtZoneGroupCriticality'
    And User Enters Zone Group Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added Zone Group Criticality details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @ZoneGroupCriticality @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'Zone Group Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Zone Group Criticality
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter Zone Group Criticality' on Data Configuration

#  /////////////////////// @BU Functional Type
  @BUFunctionalType @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Functional Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtBusinesstype'
    And User Enters BU Functionality Type Name
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Functionality Type details in table

  @BUFunctionalType @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Functional Type' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the BU Functional Type record to edit
    And User Enters BU Functionality Type Name
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Functionality Type details in table

  @BUFunctionalType @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Functional Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtBusinesstype'
    And User Enters BU Functionality Type Name
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Functionality Type details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @BUFunctionalType @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Functional Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for BU Functional Type Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter BU Functional Type' on Data Configuration

#  /////////////////////// @BU Functional Sub Type
  @BUFunctionalSubType @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Functional Sub Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtBussubtypename'
    When User verify special characters are not allowed in 'radtxtTotalSqft'
    And User Enters BU Functionality Sub Type Name
    And User select the BU Functional Type BUFunctionalSubType dropdown
    And User Enters Total Area SQFT
    And User clicks on Service Group Check box
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Functionality Sub Type details in table

  @BUFunctionalSubType @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Functional Sub Type' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the BU Functional Sub Type record to edit
    And User Enters BU Functionality Sub Type Name
    And User select the BU Functional Type BUFunctionalSubType dropdown
    And User Enters Total Area SQFT
    And User clicks on Service Group Check box
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Functionality Sub Type details in table

  @BUFunctionalSubType @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Functional Sub Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtBussubtypename'
    When User verify special characters are not allowed in 'radtxtTotalSqft'
    And User Enters BU Functionality Sub Type Name
    And User select the BU Functional Type BUFunctionalSubType dropdown
    And User Enters Total Area SQFT
    And User clicks on Service Group Check box
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Functionality Sub Type details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @BUFunctionalSubType @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Functional Sub Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for BU Functional Sub Type Name
    When user verify the chars min len as 3 and max len as 10 for BU Functional Sub Type Area SQFT
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter BU Functional Sub Type' on Data Configuration
    Then user verify the inline error message 'Select BU Functional Type' on Data Configuration
    Then user verify the inline error message 'Enter Total Area' on Data Configuration

#  /////////////////////// @BU Size Attribute
  @BUSizeAttribute @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Size Attribute' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtAttributeCode'
    When User verify special characters are not allowed in 'radtxtAttributeName'
    When User verify special characters are not allowed in 'radtxtMeasuringValue'
    And User Enters Size Attribute Code
    And User Enters Size Attribute Name
    And User Enters Size Attribute Measuring Value
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Sub Attribute details in table

  @BUSizeAttribute @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Size Attribute' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the BU Size Attribute record to edit
    And User Enters Size Attribute Code
    And User Enters Size Attribute Name
    And User Enters Size Attribute Measuring Value
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Sub Attribute details in table

  @BUSizeAttribute @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Size Attribute' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtAttributeCode'
    When User verify special characters are not allowed in 'radtxtAttributeName'
    When User verify special characters are not allowed in 'radtxtMeasuringValue'
    And User Enters Size Attribute Code
    And User Enters Size Attribute Name
    And User Enters Size Attribute Measuring Value
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Sub Attribute details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @BUSizeAttribute @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Size Attribute' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 10 for BU Size Attribute Code
    When user verify the chars min len as 3 and max len as 100 for BU Size Attribute Name
    When user verify the chars min len as 3 and max len as 3 for BU Size Attribute Measuring Value
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter BU Size Attribute Code' on Data Configuration
    Then user verify the inline error message 'Enter BU Size Attribute Name' on Data Configuration
    Then user verify the inline error message 'Enter Measuring Value' on Data Configuration

#  /////////////////////// @BU Size Type
  @BUSizeType @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Size Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtBUSizeTypeCode'
    When User verify special characters are not allowed in 'radtxtBUSizeTypeName'
    And User Enters Size Type Code
    And User Enters Size Type Name
    And User select the BU Size Attribute BUSizeType dropdown
    And User select the BU Functional Type BUSizeType dropdown
    And User select the BU Functional Sub Type BUSizeType dropdown
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Sub Type details in table

  @BUSizeType @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Size Type' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the BU Size Type record to edit
    And User Enters Size Type Code
    And User Enters Size Type Name
    And User select the BU Size Attribute BUSizeType dropdown
    And User select the BU Functional Type BUSizeType dropdown
    And User select the BU Functional Sub Type BUSizeType dropdown
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Sub Type details in table

  @BUSizeType @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Size Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtBUSizeTypeCode'
    When User verify special characters are not allowed in 'radtxtBUSizeTypeName'
    And User Enters Size Type Code
    And User Enters Size Type Name
    And User select the BU Size Attribute BUSizeType dropdown
    And User select the BU Functional Type BUSizeType dropdown
    And User select the BU Functional Sub Type BUSizeType dropdown
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Sub Type details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @BUSizeType @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Size Type' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 10 for BU Size Type Code
    When user verify the chars min len as 3 and max len as 100 for BU Size Type Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter BU Size Type Code' on Data Configuration
    Then user verify the inline error message 'Enter BU SizeType Name' on Data Configuration
    Then user verify the inline error message 'Enter Attribute' on Data Configuration
    Then user verify the inline error message 'Enter BU Functional Type' on Data Configuration
    Then user verify the inline error message 'Enter BU Functional Sub Type' on Data Configuration

#  /////////////////////// @BU Criticality
  @BUCriticality @Add
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtBUCriticalityName'
    And User Enters BU Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Criticality details in table

  @BUCriticality @Edit
  Scenario: User Should be able to edit it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Criticality' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the BU Criticality record to edit
    And User Enters BU Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Criticality details in table

  @BUCriticality @Delete
  Scenario: User Should be able to delete it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtBUCriticalityName'
    And User Enters BU Criticality Name
    And User clicks on Save button in Location Management Section
    Then User verifies added BU Criticality details in table
    Then User waits for 3 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @BUCriticality @ErrorValidationMaxLength
  Scenario: User Should be able to add it in LM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Location Management' tab in data configuration page
    And User clicks on the 'BU Criticality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for BU Criticality Name
    And User clicks on Location Save button For InLine Error
    Then user verify the inline error message 'Enter BU Criticality Name' on Data Configuration