@AuditManagement
Feature: Audit Management Module Automation

#  /////////////////////// @AuditMasterCategory
    @AuditMasterCategory @Add
    Scenario: User Should be able to add it in AMC
        Given User navigates to 'lattice.url' page
        When User is at home screen after login with "username" and "password"
        When User clicks on 'Data Configurations' in navigation panel
        And User clicks on hamburger icon
        And User clicks on the 'Audit Management' tab in data configuration page
        And User clicks on button 'Add'
        When User Enters Short Name
        When User selects Audit type as ''
        When User Enters Category Name
        And User 'check' active checkbox
        And User clicks on Save button in Audit Management Elements Section
        Then User verifies added short name in table

    @AuditMasterCategory @Edit
    Scenario: User Should be able to edit existing AMC
      Given User navigates to 'lattice.url' page
      When User is at home screen after login with "username" and "password"
      When User clicks on 'Data Configurations' in navigation panel
      And User clicks on hamburger icon
      And User clicks on the 'Audit Management' tab in data configuration page
      When User select the '' Audit management record to edit
      When User Enters Short Name
      When User selects Audit type as ''
      When User Enters Category Name
      And User clicks on Update button
      Then User verifies modified details in table

    @AuditMasterCategory @Delete
    Scenario: User Should be able to delete a Audit
      Given User navigates to 'lattice.url' page
      When User is at home screen after login with "username" and "password"
      When User clicks on 'Data Configurations' in navigation panel
      And User clicks on hamburger icon
      And User clicks on the 'Audit Management' tab in data configuration page
      And User clicks on button 'Add'
      When User Enters Short Name
      When User selects Audit type as ''
      When User Enters Category Name
      And User 'check' active checkbox
      And User clicks on Save button in Audit Management Elements Section
      Then User verifies added short name in table
      When User clicks on first available audit to delete
      Then User waits for 2 seconds
      Then User verify if the audit is deleted


  @AuditMasterCategory @InActive
  Scenario: User Should be able to in activate existing AMC
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    When User select the '' Audit management record to edit
    And User 'uncheck' active checkbox
    And User clicks on Update button
    Then User verifies inactive Short is not in records table


  @AuditMasterCategory @ErrorValidationMaxLength
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on button 'Add'
    When user verify the chars and max len as 10 for Short Name
    When user verify the chars and max len as 100 for Audit Master Category Name
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Short Name' on Audit Mastery Category
    Then user verify the inline error message 'Select Audit Type' on Audit Mastery Category
    Then user verify the inline error message 'Enter Audit Master Category Name' on Audit Mastery Category



#  /////////////////////// @EnforcingAuthority
  @EnforcingAuthority @Add
  Scenario: User Should be able to add it in EA
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Enforcing Authority' tab in Audit Management page
    And User clicks on button 'Add'
    And User Enters Authority Name
    And User Enters Authority Description
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Authority details in table

  @EnforcingAuthority @Edit
  Scenario: User Should be able to edit it in EA
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Enforcing Authority' tab in Audit Management page
    When User select the '' Enforce Authority record to edit
    And User Enters Authority Name
    And User Enters Authority Description
    And User clicks on Update button
    Then User verifies Editable details in table

  @EnforcingAuthority @Delete
  Scenario: User Should be able to delete it in EA
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Enforcing Authority' tab in Audit Management page
    And User clicks on button 'Add'
    And User Enters Authority Name
    And User Enters Authority Description
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Authority details in table
    When User clicks on first available audit to delete
    Then User waits for 2 seconds
    Then User verify if the authority is deleted

  @EnforcingAuthority @ErrorValidationMaxLength
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Enforcing Authority' tab in Audit Management page
    And User clicks on button 'Add'
    When user verify the chars and max len as 50 for Authority Name
    When user verify the chars and max len as 500 for Authority Description
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Enter Authority' on Audit Mastery Category
    Then user verify the inline error message 'Enter Enforcing authority Description' on Audit Mastery Category

#  /////////////////////// @IndustryStandard
  @IndustryStandard @Add
  Scenario: User Should be able to add it in IS
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Industry Standard' tab in Audit Management page
    And User clicks on button 'Add'
    And User Enters Industry Standard Code
    And User Enters Industry Standard Description
    When User select the '' Enforcing Authority dropdown
    And User selects SME type as ''
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Industry Standard details in table


  @IndustryStandard @Edit
  Scenario: User Should be able to Edit it in IS
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Industry Standard' tab in Audit Management page
    And User select the '' Industry Standard record to edit
    And User Enters Industry Standard Code
    And User Enters Industry Standard Description
    When User select the '' Enforcing Authority dropdown
    And User selects SME type as 'Emaar'
    And User clicks on Update button
    Then User waits for 2 seconds
    Then User verifies added Industry Standard details in table

  @IndustryStandard @Delete
  Scenario: User Should be able to Delete it in IS
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Industry Standard' tab in Audit Management page
    And User clicks on button 'Add'
    And User Enters Industry Standard Code
    And User Enters Industry Standard Description
    When User select the '' Enforcing Authority dropdown
    And User selects SME type as 'Emaar'
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Industry Standard details in table
    When User clicks on first available audit to delete
    Then User waits for 2 seconds
    Then User verify if the Industry Standard record is deleted

  @IndustryStandard @ErrorValidationMaxLength
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Industry Standard' tab in Audit Management page
    And User clicks on button 'Add'
    When user verify the chars and max len as 15 for Industry Standard Code
    When user verify the chars and max len as 500 for Industry Standard Description
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Enter Industry Standard Code' on Audit Mastery Category
    Then user verify the inline error message 'Enter Industry Standard Description' on Audit Mastery Category
    Then user verify the inline error message 'Select Enforcing Authority' on Audit Mastery Category
    Then user verify the inline error message 'Select Subject Matter Expertise' on Audit Mastery Category

#  /////////////////////// @Clause
  @Clause @Add
  Scenario: User Should be able to add it in Clause
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Clause' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' Industry Standards dropdown
    And User Enters Clause Name
    And User Enters Clause Description
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Clause details in table

  @Clause @Edit
  Scenario: User Should be able to Edit it in Clause
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Clause' tab in Audit Management page
    And User select the '' Clause record to edit
    When User select the '' Industry Standards dropdown
    And User Enters Clause Name
    And User Enters Clause Description
    And User clicks on Update button
    Then User waits for 2 seconds
    Then User verifies added Clause details in table

  @Clause @Delete
  Scenario: User Should be able to Delete it in Clause
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Clause' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' Industry Standards dropdown
    And User Enters Clause Name
    And User Enters Clause Description
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Clause details in table
    When User clicks on first available audit to delete
    Then User waits for 2 seconds
    Then User verify if the Clause record is deleted

  @Clause @ErrorValidationMaxLength
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Clause' tab in Audit Management page
    And User clicks on button 'Add'
    When user verify the chars and max len as 50 for Clause Name
    When user verify the chars and max len as 500 for Clause Description
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Select Industry Standard' on Audit Mastery Category
    Then user verify the inline error message 'Enter Clause Name' on Audit Mastery Category
    Then user verify the inline error message 'Enter Clause Description' on Audit Mastery Category

#  /////////////////////// @LegalRequirement
  @LegalRequirement @Add
  Scenario: User Should be able to add it in LegalRequirements
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Legal & Other Requirements' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' Legal Enforcing Authority dropdown
    And User Enters Legal Requirement Name
    And User Enters Legal Requirement Description
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Legal Requirement details in table

  @LegalRequirement @Edit
  Scenario: User Should be able to Edit it in LegalRequirements
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Legal & Other Requirements' tab in Audit Management page
    And User select the '' Legal Requirement record to edit
    When User select the '' Legal Enforcing Authority dropdown
    And User Enters Legal Requirement Name
    And User Enters Legal Requirement Description
    And User clicks on Update button
    Then User waits for 2 seconds
    Then User verifies added Legal Requirement details in table

  @LegalRequirement @Delete
  Scenario: User Should be able to Delete it in LegalRequirements
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Legal & Other Requirements' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' Legal Enforcing Authority dropdown
    And User Enters Legal Requirement Name
    And User Enters Legal Requirement Description
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Legal Requirement details in table
    When User clicks on first available audit to delete
    Then User waits for 2 seconds
    Then User verify if the Legal Requirement record is deleted

  @LegalRequirement @ErrorValidationMaxLength
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Legal & Other Requirements' tab in Audit Management page
    And User clicks on button 'Add'
    When user verify the chars and max len as 100 for Legal Requirement Name
    When user verify the chars and max len as 100 for Legal Requirement Description
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Select Authority' on Audit Mastery Category
    Then user verify the inline error message 'Enter Legal & Other Requirements Name' on Audit Mastery Category
    Then user verify the inline error message 'Enter Legal & Other Requirements Description' on Audit Mastery Category

#  /////////////////////// @AuditFrequency
  @AuditFrequency @Add
  Scenario: User Should be able to add it in AuditFrequency
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Task Frequency' tab in Audit Management page
    And User clicks on button 'Add'
    And User Enters Audit Task Frequency Code Name Period Colour
    And User Enters Pre Post Tolerance details
    When User select the '' Audit Schedule Elapse dropdown
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Audit Frequency details in table


  @AuditFrequency @Edit
  Scenario: User Should be able to add it in AuditFrequency
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Task Frequency' tab in Audit Management page
    And User select the '' Audit Frequency record to edit
    And User Enters Audit Task Frequency Code Name Period Colour
    And User Enters Pre Post Tolerance details
    When User select the '' Audit Schedule Elapse dropdown
    And User clicks on Update button
    Then User waits for 2 seconds
    Then User verifies added Audit Frequency details in table

  @AuditFrequency @Delete
  Scenario: User Should be able to add it in AuditFrequency
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Task Frequency' tab in Audit Management page
    And User clicks on button 'Add'
    And User Enters Audit Task Frequency Code Name Period Colour
    And User Enters Pre Post Tolerance details
    When User select the '' Audit Schedule Elapse dropdown
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Audit Frequency details in table
    When User clicks on first available audit to delete
    Then User waits for 3 seconds
    Then User verify if the Audit Frequency record is deleted

  @AuditFrequency @ErrorValidationMaxLength
  Scenario: User Should be able to add it in AuditFrequency
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Task Frequency' tab in Audit Management page
    And User clicks on button 'Add'
    When user verify the chars and max len as 2 for Audit Frequency Code
    When user verify the chars and max len as 100 for Audit Frequency Name
    When user verify the chars and max len as 100 for Frequency Period
    When user verify the chars and max len as 3 for Pre Tolerance
    When user verify the chars and max len as 3 for Post Tolerance
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Enter Audit Task Frequency Code' on Audit Mastery Category
    Then user verify the inline error message 'Enter Audit Task Frequency Name' on Audit Mastery Category
    Then user verify the inline error message 'Enter Frequency Period' on Audit Mastery Category
    Then user verify the inline error message 'Enter Pre Tolerance (-days)' on Audit Mastery Category
    Then user verify the inline error message 'Enter Post Tolerance (+days)' on Audit Mastery Category
    Then user verify the inline error message 'Select Audit Schedule Elapse' on Audit Mastery Category


#  //////////////////// @AuditReason
  @AuditReason @Add
  Scenario: User Should be able to add it in AuditReason
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Reason' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' Audit Reason Type dropdown
    And User Enters Audit Reason
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Audit Reason details in table

  @AuditReason @Edit
  Scenario: User Should be able to Edit it in AuditReason
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Reason' tab in Audit Management page
    And User select the '' Audit Reason record to edit
    When User select the '' Audit Reason Type dropdown
    And User Enters Audit Reason
    And User clicks on Update button
    Then User waits for 2 seconds
    Then User verifies added Audit Reason details in table

  @AuditReason @Delete
  Scenario: User Should be able to Delete it in AuditReason
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Reason' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' Audit Reason Type dropdown
    And User Enters Audit Reason
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added Audit Reason details in table
    When User clicks on first available audit to delete
    Then User waits for 3 seconds
    Then User verify if the Audit Reason record is deleted

  @AuditReason @ErrorValidationMaxLength
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Reason' tab in Audit Management page
    And User clicks on button 'Add'
    When user verify the chars and max len as 50 for Audit Reason
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Select Audit Reason Type' on Audit Mastery Category
    Then user verify the inline error message 'Enter Audit Reason' on Audit Mastery Category

#  //////////////////// @Audit Question LOV Group
  @AuditLOVGroup @Add
  Scenario: Should be able to add it in LOVGroup
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Group' tab in Audit Management page
    And User clicks on button 'Add'
    And User Enters '' LOV Group
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added LOV Group details in table

  @AuditLOVGroup @Edit
  Scenario: Should be able to Edit it in LOVGroup
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Group' tab in Audit Management page
    When User select the '' LOV Group record to edit
    And User Enters '' LOV Group
    And User clicks on Update button
    Then User waits for 2 seconds
    Then User verifies added LOV Group details in table

  @AuditLOVGroup @RecordCannotbeDeleted
  Scenario: Should be able to delete LOVGroup record
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Group' tab in Audit Management page
    When User select the '' LOV Group record to try deleting
    Then User waits for 2 seconds
    When User clicks on first available LOV Group trying to delete
    Then User verifies deleted LOV Group details in table

  @AuditLOVGroup @ErrorValidationMaxLength
  Scenario: User should not be able to save form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Group' tab in Audit Management page
    And User clicks on button 'Add'
    When user verify the chars and max len as 50 for LOV Group
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Enter LOV Group' on Audit Mastery Category


#  //////////////////// @Audit Question LOV Value
  @AuditLOVValue @Add @Positive
  Scenario: Should be able to add it in LOVValue
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Value' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' LOV Group dropdown
    When User enters '' LOV Value
    When User enters '' LOV Description
    When User select the 'Positive' LOV Type dropdown
    When User enters '' Result Score
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added LOV Value details in table

  @AuditLOVValue @Add @Negative
  Scenario: Should be able to add it in LOVValue
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Value' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' LOV Group dropdown
    When User enters '' LOV Value
    When User enters '' LOV Description
    When User select the 'Negative' LOV Type dropdown
    When User enters '' Result Score
    When User select the '' Service Group dropdown
    When User select the '' Fault Category dropdown
    When User select the '' Fault Code dropdown
    When User select the '' Priority dropdown
    When User select the '' Contract Group dropdown
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added LOV Value details in table
    Then User verifies added LOV Value Negative Action details in table

  @AuditLOVValue @Add @NA
  Scenario: Should be able to add it in LOVValue
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Value' tab in Audit Management page
    And User clicks on button 'Add'
    When User select the '' LOV Group dropdown
    When User enters '' LOV Value
    When User enters '' LOV Description
    When User select the 'NA' LOV Type dropdown
    When User enters '' Result Score
    And User clicks on Save button in Audit Management Elements Section
    Then User verifies added LOV Value details in table


  @AuditLOVValue @Edit @PositiveNANegative
  Scenario: Should be able to add it in LOVValue
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Value' tab in Audit Management page
    And User select the '' Audit LOV Value record to edit
    When User select the '' LOV Group dropdown
    When User enters '' LOV Value
    When User enters '' LOV Description
    When User select the '' LOV Type dropdown Edit
    When User enters '' Result Score
    And User clicks on Update button
    Then User verifies added LOV Value details in table


  @AuditLOVValue @Delete
  Scenario: Should be able to add it in LOVValue
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Value' tab in Audit Management page
    And User select the '' Random Audit LOV Value record to Delete
    When User clicks on first available LOV Value to delete
    Then User waits for 3 seconds
    Then User verify if the LOV Value record is deleted


  @AuditLOVValue @ErrorValidationMaxLength
  Scenario: Should be able to add it in LOVValue
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on 'Data Configurations' in navigation panel
    And User clicks on hamburger icon
    And User clicks on the 'Audit Management' tab in data configuration page
    And User clicks on the 'Audit Question - LOV Value' tab in Audit Management page
    And User clicks on button 'Add'
#    When user verify the chars min len as 1 and max len as 25 for LOV Value
#    When user verify the chars min len as 1 and max len as 499 for LOV Value Description
    And User clicks on Save button For InLine Error
    Then user verify the inline error message 'Select LOV Group' on Audit Mastery Category
    Then user verify the inline error message 'Enter LOV Value' on Audit Mastery Category
    Then user verify the inline error message 'Enter LOV Value Description' on Audit Mastery Category
    Then user verify the inline error message 'Enter Answer Type' on Audit Mastery Category
    Then user verify the inline error message 'Enter Result Score' on Audit Mastery Category




























