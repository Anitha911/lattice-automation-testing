@ResourceManagement
Feature: Resource Management Module Automation

#  /////////////////////// @Trade
  @Trade @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on button 'Add'
    When User get Trade default code field value
    When User verify special characters are not allowed in 'radtxtTrade'
    And User Enters Trade Name
    And User select the Service Group Trade dropdown
    When User Enters the Cost Per Hour
    And User clicks on Save button in Resource Management Section
    Then User verifies added Trade details in table

  @Trade @Edit
  Scenario: User Should be able to Edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    Then User Select the page size 50
    When User select the Trade Type record to edit
    When User get Trade default code field value
    And User Enters Trade Name
    And User select the Service Group Trade dropdown
    When User Enters the Cost Per Hour
    And User clicks on Save button in Resource Management Section
    Then User verifies added Trade details in table

  @Trade @Delete
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on button 'Add'
    When User get Trade default code field value
    When User verify special characters are not allowed in 'radtxtTrade'
    And User Enters Trade Name
    And User select the Service Group Trade dropdown
    When User Enters the Cost Per Hour
    And User clicks on Save button in Resource Management Section
    Then User verifies added Trade details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Trade @ErrorValidationMaxLength
  Scenario: User Should be able to errorvaliadtion it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Trade Name
    When user verify the chars min len as 3 and max len as 100 for Cost Perhr
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Enter Trade Name' on Data Configuration
    Then user verify the inline error message 'Select Service Group' on Data Configuration
    Then user verify the inline error message 'Enter Cost Per Hour' on Data Configuration

#  /////////////////////// @Department
  @Department @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Department' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Department default code field value
    When User verify special characters are not allowed in 'radtxtDeptName'
    When User verify special characters are not allowed in 'radtxtContactPerson'
    When User verify special characters are not allowed in 'radtxtFaxNo'
    And User Enters Department Name
    And User Enters Department Contact details
    When User click Contract Group Check box
    And User clicks on Save button in Resource Management Section
    Then User verifies added Department details in table

  @Department @Edit
  Scenario: User Should be able to edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Department' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Department Type record to edit
    When User get Department default code field value
    And User Enters Department Name
    And User Enters Department Contact details
    And User clicks on Save button in Resource Management Section
    Then User verifies added Department details in table

  @Department @Delete
  Scenario: User Should be able to delete it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Department' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Department default code field value
    When User verify special characters are not allowed in 'radtxtDeptName'
    When User verify special characters are not allowed in 'radtxtContactPerson'
    When User verify special characters are not allowed in 'radtxtFaxNo'
    And User Enters Department Name
    And User Enters Department Contact details
    When User click Contract Group Check box
    And User clicks on Save button in Resource Management Section
    Then User verifies added Department details in table
    Then User waits for 4 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Department @ErrorValidationMaxLength
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Department' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Department Name
    When user verify the chars min len as 3 and max len as 100 for Contact Person
    When user verify the chars min len as 3 and max len as 100 for Email
    When user verify the chars min len as 8 and max len as 10 for Contact Number
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Enter Department Name' on Data Configuration

#  /////////////////////// @Designation
  @Designation @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Designation' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Designation default code field value
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtDesi'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtdesrate'
    And User Enters Designation Name
    When User Enters the Rate Per Hour
    When User click Designation Radio button and Check box
    And User clicks on Save button in Resource Management Section
    Then User verifies added Designation details in table

  @Designation @Edit
  Scenario: User Should be able to Edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Designation' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Designation Type record to edit
    When User get Designation default code field value
    And User Enters Designation Name
    When User Enters the Rate Per Hour
    And User clicks on Save button in Resource Management Section
    Then User verifies edited Designation details in table

  @Designation @Delete
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Designation' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Designation default code field value
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtDesi'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtdesrate'
    And User Enters Designation Name
    When User Enters the Rate Per Hour
    When User click Designation Radio button and Check box
    And User clicks on Save button in Resource Management Section
    Then User verifies added Designation details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Designation @ErrorValidationMaxLength
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Designation' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Designation Name
    When user verify the chars min len as 3 and max len as 10 for Rate Hour
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Enter Designation Name' on Data Configuration
    Then user verify the inline error message 'Enter Rate/Hour' on Data Configuration

#  /////////////////////// @Designation
  @TechnicianShift @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Technician Shifts' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Shift default code field value
    And User Enters Shift Name
    And User clicks on TimeIn and TimeOut
    And User enable enable check box
    When User click Random Shift Type Radio button
    And User clicks on Save button in Resource Management Section
    Then User verifies added Shift details in table

  @TechnicianShiftNon-Duty @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Technician Shifts' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Shift default code field value
    And User Enters Shift Name
    And User enable DayOff toggle on
    And User enable enable check box
    When User click Random Shift Type Radio button
    And User clicks on Save button in Resource Management Section
    Then User verifies added Shift details in table

  @TechnicianShift @Edit
  Scenario: User Should be able to edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Technician Shifts' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Technician Shift record to edit
    When User get Shift default code field value
    When User get Shift Name field value
    And User clicks on TimeIn and TimeOut
    When User click Random Shift Type Radio button
    And User clicks on Save button in Resource Management Section
    Then User verifies edited Shift details in table

  @TechnicianShift @Delete
  Scenario: User Should be able to delete it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Technician Shifts' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User get Shift default code field value
    And User Enters Shift Name
    And User clicks on TimeIn and TimeOut
    And User enable enable check box
    When User click Random Shift Type Radio button
    And User clicks on Save button in Resource Management Section
    Then User verifies added Shift details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @TechnicianShift @ErrorValidationMaxLength
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Technician Shifts' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars and max len as 50 for Shift Name
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Please enter Shift Name!' on Data Configuration
    Then user verify the inline error message 'Select Time In' on Data Configuration
    Then user verify the inline error message 'Select Time Out' on Data Configuration
    Then user verify the inline error message 'Select Client Contract' on Data Configuration
    And User clicks on TimeIn and TimeOut for greater time message
    Then user verify the inline error message 'Select Time Out greater than Time In' on Data Configuration

#  /////////////////////// @Domain
  @Domain @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Domain' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinDomain_C_radtxtDomain'
    And User Enters Domain Name
    And User select the Supplier Name dropdown
    And User clicks on Save button in Resource Management Section
    Then User verifies added Domain details in table

  @Domain @Edit
  Scenario: User Should be able to edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Domain' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Domain record to edit
    And User Enters Domain Name
    And User select the Supplier Name dropdown
    And User clicks on Save button in Resource Management Section
    Then User verifies added Domain details in table

  @Domain @Delete
  Scenario: User Should be able to delete it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Domain' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinDomain_C_radtxtDomain'
    And User Enters Domain Name
    And User select the Supplier Name dropdown
    And User clicks on Save button in Resource Management Section
    Then User verifies added Domain details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Domain @ErrorValidationMaxLength
  Scenario: User Should be able to ErrorValidation it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Domain' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Domain Name
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Enter Domain Name' on Data Configuration
    Then user verify the inline error message 'Select Supplier Name' on Data Configuration
    And User Enters Invalid Domain Name for Error
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Invalid domain name' on Data Configuration

#  /////////////////////// @Time Slot
  @TimeSlot @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Time Slot' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtTimeSlotCode'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtTimeSlotName'
    And User Enters Time Slot Code and Name
    And User select the Time Slot Department dropdown
    And User clicks on FromTime and ToTime
    And User clicks on Save button in Resource Management Section
    Then User verifies added Time Slot details in table

  @TimeSlot @Edit
  Scenario: User Should be able to edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Time Slot' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Time Slot record to edit
    And User Enters Time Slot Code and Name
    And User select the Time Slot Department dropdown
    And User clicks on FromTime and ToTime
    And User clicks on Save button in Resource Management Section
    Then User verifies added Time Slot details in table

  @TimeSlot @Delete
  Scenario: User Should be able to delete it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Time Slot' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtTimeSlotCode'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtTimeSlotName'
    And User Enters Time Slot Code and Name
    And User select the Time Slot Department dropdown
    And User clicks on FromTime and ToTime
    And User clicks on Save button in Resource Management Section
    Then User verifies added Time Slot details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @TimeSlot @ErrorValidationMaxLength
  Scenario: User Should be able to Errorvaliadtion it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Time Slot' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 5 for Slot Code
    When user verify the chars min len as 3 and max len as 100 for Slot Name
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Enter Time Slot Code' on Data Configuration
    Then user verify the inline error message 'Enter Time Slot Name' on Data Configuration
    Then user verify the inline error message 'Select Department' on Data Configuration
    Then user verify the inline error message 'Select From Time' on Data Configuration
    Then user verify the inline error message 'Select To Time' on Data Configuration
    And User clicks on FromTime and ToTime for greater time message
    Then user verify the inline error message 'Select To Time greater than From Time' on Data Configuration


#  /////////////////////// @Skill Level
  @SkillLevel @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Skill Level' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtSkill'
    And User Enters Skill Level Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Skill Level details in table

  @SkillLevel @Edit
  Scenario: User Should be able to edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Skill Level' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Skill level record to edit
    And User Enters Skill Level Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Skill Level details in table

  @SkillLevel @Delete
  Scenario: User Should be able to delete it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Skill Level' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'radtxtSkill'
    And User Enters Skill Level Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Skill Level details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @SkillLevel @ErrorValidationMaxLength
  Scenario: User Should be able to delete it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Skill Level' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 50 for Skill Level Name
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Enter Skill Level Name' on Data Configuration

#  /////////////////////// @Language
  @Language @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Language' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinLanguage_C_radtxtLanguage'
    And User Enters Language Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Language details in table

  @Language @Edit
  Scenario: User Should be able to edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Language' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Language record to edit
    And User Enters Language Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Language details in table

  @Language @Delete
  Scenario: User Should be able to delete it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Language' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinLanguage_C_radtxtLanguage'
    And User Enters Language Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Language details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Language @ErrorValidationMaxLength
  Scenario: User Should be able to Errorvalidation it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Language' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Language
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Enter Language' on Data Configuration

#  /////////////////////// @Nationality
  @Nationality @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Nationality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinNationality_C_radtxtNationalityCode'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinNationality_C_radtxtNationality'
    And User Enters Country Code
    And User Enters Country Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Country details in table

  @Nationality @Edit
  Scenario: User Should be able to edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Nationality' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Nationality record to edit
    And User Enters Country Code
    And User Enters Country Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Country details in table

  @Nationality @Delete
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Nationality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinNationality_C_radtxtNationalityCode'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinNationality_C_radtxtNationality'
    And User Enters Country Code
    And User Enters Country Name
    And User clicks on Save button in Resource Management Section
    Then User verifies added Country details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @Nationality @ErrorValidationMaxLength
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Nationality' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 10 for Nationality Code
    When user verify the chars min len as 3 and max len as 100 for Nationality Name
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Enter Country Code' on Data Configuration
    Then user verify the inline error message 'Enter Country Name' on Data Configuration

#  /////////////////////// @Attendance Reason
  @AttendanceReason @Add
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Attendance Reasons' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinAttendanceReason_C_radtxtReason'
    And User select the Resource Action dropdown
    And User Enters Attendance Reason
    And User clicks on Save button in Resource Management Section
    Then User verifies added Attendance details in table

  @AttendanceReason @Edit
  Scenario: User Should be able to edit it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Attendance Reasons' Child tab in Data Configuration Page
    Then User Select the page size 50
    When User select the Attendance record to edit
    And User select the Resource Action dropdown
    And User Enters Attendance Reason
    And User clicks on Save button in Resource Management Section
    Then User verifies added Attendance details in table

  @AttendanceReason @Delete
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Attendance Reasons' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When User verify special characters are not allowed in 'ctl00_ContentPlaceHolder1_RadWinAttendanceReason_C_radtxtReason'
    And User select the Resource Action dropdown
    And User Enters Attendance Reason
    And User clicks on Save button in Resource Management Section
    Then User verifies added Attendance details in table
    Then User waits for 2 seconds
    When User clicks on first available Record to delete
    Then User verify if the Property Record is deleted

  @AttendanceReason @ErrorValidationMaxLength
  Scenario: User Should be able to add it in RM
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Resource Management' tab in data configuration page
    And User clicks on the 'Attendance Reasons' Child tab in Data Configuration Page
    And User clicks on button 'Add'
    When user verify the chars min len as 3 and max len as 100 for Attendance
    And User clicks on Resource Save button For InLine Error
    Then user verify the inline error message 'Select Resource Action Type' on Data Configuration
    Then user verify the inline error message 'Enter Attendance Reason' on Data Configuration







