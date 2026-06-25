@dataconfigReactiveServiceMaster
Feature: Reactive Service data a configuration Module Automation

  @addServiceGroup
  Scenario: Should be able to add Service Group
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on button Service Group add 'Add'
    When User fills up the 'Service Group' Service Group details
    #
    #When User select the '' Service Group Department dropdown
    #
    #When User clicks on Service Group save button
    When User clicks on RM Master save button
    Then User verify if the Service Group is created

  @EditServiceGroup
  Scenario: Should be able to Edit Service Group
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on button Service Group add 'Add'
    When User fills up the 'Service Group' Service Group details
    When User clicks on Service Group save button
    When User verify if the Service Group is created
    When User clicks on active Service Group in the grid
    When User fills up the 'Service Group' Service Group details
    #
    #When User select the '' Service Group Department dropdown
    #
    When User clicks on Service Group save button
    Then User verify if the Service Group is created

  @DeleteServiceGroup
  Scenario: Should be able to Delete RM Service Group
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Data Config 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    #When User clicks on active Service Group in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the Service Group is deleted

  @ExporttoExcelServiceGroup
  Scenario: Should be able to export to Excel RM ServiceGroup
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on Data Config 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    Then User clicks on RM Export to Excel button

  @addServiceGroupValidationInput
  Scenario: User should not be able to save RM Service Group form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on button Service Group add 'Add'
    When user verify the chars min len as 3 and max len as 255 on Service Group Name
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Service Group Name' on Service Group

  @addFaultCategory
  Scenario: Should be able to add Fault Category
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Category 'string' tab
    When User clicks on button Fault Category add 'Add'
    When User fills up the 'Fault Category' Fault Category details
    #
    When User select the '' Fault Category Service Group dropdown
    #
    #When User clicks on Fault Category save button
    When User clicks on RM Master save button
    Then User verify if the Fault Category is created

  @EditFaultCategory
  Scenario: Should be able to add Fault Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Category 'string' tab
    When User clicks on active Fault Category in the grid
    When User fills up the 'Fault Category' Fault Category details
    #
    When User select the '' Fault Category Service Group dropdown
    #
    When User clicks on Fault Category save button
    Then User verify if the Fault Category is created

  @DeleteFaultCategory
  Scenario: Should be able to add Fault Category
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Category 'string' tab
    #When User clicks on active Fault Category in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the Fault Category is deleted

  @ExportToExcelFaultCategory
  Scenario: Should be able to add Fault Category
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on RM Export to Excel button

  @addFaultCategoryValidationInput
  Scenario: User should not be able to save RM Fault Category form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Category 'string' tab
    When User clicks on button Fault Category add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault Category Name
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Fault Category Name' on Fault Category

  @addFaultCode
  Scenario: Should be able to add Fault Code
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Code 'string' tab
    When User clicks on button Fault Code add 'Add'
    When User fills up the 'Fault Code' Fault Code details
    #
    #When User select the '' Fault Code Service Group dropdown
    When User select the '' Fault Code Fault Category dropdown
    #When User select the '' Fault Code Work Order Type dropdown
    #When User select the '' Fault Code Root Cause Category dropdown
    #
    #When User clicks on Fault Code save button
    When User clicks on RM Master save button
    Then User verify if the Fault Code is created

  @EditFaultCode
  Scenario: Should be able to Edit Fault Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    When User Clicks on first data in the FaultCode Grid
    Then User clicks the manage Fault Code Button
    When User clicks the Update Button

  @DeleteFaultCode
  Scenario: Should be able to Delete Fault Code
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Code 'string' tab
   # When User clicks on active Fault Code in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the Fault Code is deleted

  @ExportToExcelFaultCode
  Scenario: Should be able to Export to excel Fault Code
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Code 'string' tab
    Then User clicks on RM Export to Excel button

  @addFaultCodeValidationInput
  Scenario: User should not be able to save RM Fault Code form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Code 'string' tab
    When User clicks on button Fault Code add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault Code Name
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Fault Code Name' on Fault Code


  @addFaultPriority
  Scenario: Should be able to add Fault Priority
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Priority 'string' tab
    When User clicks on button Fault Priority add 'Add'
    When User fills up the 'Fault Priority' Fault Priority details
    When User clicks on Fault Priority save button
    #When User clicks on RM Master save button
    Then User verify if the Fault Priority is created

  @EditFaultPriority
  Scenario: Should be able to Edit Fault Priority
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Priority 'string' tab
    #When User clicks on button Fault Priority add 'Add'
    #When User fills up the 'Fault Priority' Fault Priority details
    #When User clicks on Fault Priority save button
    #When User verify if the Fault Priority is created
    When User clicks on active Fault Priority in the grid
    When User fills up the 'Fault Priority' Fault Priority details
    When User clicks on Fault Priority save button
    Then User verify if the Fault Priority is created

  @DeleteFaultPriority
  Scenario: Should be able to Delete Fault Priority
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Priority 'string' tab
    #When User clicks on active Fault Priority in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the Fault Priority is deleted

  @ExportToExcelFaultPriority
  Scenario: Should be able to Export to excel Fault Priority
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on RM Export to Excel button

  @addPriorityValidationInput
  Scenario: User should not be able to save RM Priority form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Fault Priority 'string' tab
    When User clicks on button Fault Priority add 'Add'
    When user verify the chars min len as 3 and max len as 10 on Fault Priority Name
    When user verify the chars min len as 3 and max len as 5000 on Fault Priority Notes
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Priority Name' on Fault Priority
    Then user verify the inline error message 'Enter Notes' on Fault Priority Notes

  @addWOSource
  Scenario: Should be able to add WO Source
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM WO Source 'string' tab
    When User clicks on button WO Source add 'Add'
    When User fills up the 'WO Source' WO Source details
    #When User clicks on WO Source save button
    When User clicks on RM Master save button
    Then User verify if the WO Source is created

  @editWOSource
  Scenario: Should be able to edit WO Source
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM WO Source 'string' tab
    When User clicks on button WO Source add 'Add'
    When User fills up the 'WO Source' WO Source details
    When User clicks on WO Source save button
    When User verify if the WO Source is created
    When User clicks on active WO Source in the grid
    When User clicks on WO Source save button
    Then User verify if the WO Source is created

  @DeleteWOSource
  Scenario: Should be able to Delete WO Source
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM WO Source 'string' tab
    #When User clicks on active RM WO Source in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the RM WO Source is deleted

  @ExportToExcelWOSOurce
  Scenario: Should be able to Export to excel WO Source
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on RM Export to Excel button

  @addWOSOurceValidationInput
  Scenario: User should not be able to save RM WO source form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM WO Source 'string' tab
    When User clicks on button WO Source add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault WO Source Name
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Work Order Source Name' on Fault WO Source

  @addRootCause
  Scenario: Should be able to add Root Cause
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Root Cause 'string' tab
    When User clicks on button Root Cause add 'Add'
    When User fills up the 'Root Cause' Root Cause details
    #When User clicks on RC save button
    When User clicks on RM Master save button
    Then User verify if the RC is created

  @EditRootCause
  Scenario: Should be able to Edit Root Cause
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Root Cause 'string' tab
    When User clicks on button Root Cause add 'Add'
    When User fills up the 'Root Cause' Root Cause details
    When User clicks on RC save button
    When User verify if the RC is created
    When User clicks on active RC in the grid
    When User clicks on RC save button
    Then User verify if the RC is created

  @DeleteRootCause
  Scenario: Should be able to Delete Root Cause
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Root Cause 'string' tab
   # When User clicks on active RM Root Cause in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the RM Root Cause is deleted

  @ExportToExcelRC
  Scenario: Should be able to Export to excel Root Cause
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on RM Export to Excel button

  @addRootCauseValidationInput
  Scenario: User should not be able to save RM Root Cause form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Root Cause 'string' tab
    When User clicks on button Root Cause add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault Root Cause
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Fault Root Cause' on Fault Root Cause

  @addResolutionCode
  Scenario: Should be able to Add Resolution Code
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Resolution Code 'string' tab
    When User clicks on button Resolution Code add 'Add'
    When User fills up the 'Resolution Code' Resolution Code details
    When User select the '' Resolution Code Root Cause dropdown
    #When User clicks on ResolutionCode save button
    When User clicks on RM Master save button
    Then User verify if the ResolutionCode is created

  @EditResolutionCode
  Scenario: Should be able to Edit Resolution Code
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Resolution Code 'string' tab
    When User clicks on button Resolution Code add 'Add'
    When User fills up the 'Resolution Code' Resolution Code details
    When User clicks on ResolutionCode save button
    When User verify if the ResolutionCode is created
    When User clicks on active ResolutionCode in the grid
    When User clicks on ResolutionCode save button
    Then User verify if the ResolutionCode is created

  @DeleteRosolutionCode
  Scenario: Should be able to Delete Resolution Code
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Resolution Code 'string' tab
    #When User clicks on active RM Resolution Code in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    #Then User verify if the RM Resolution Code is deleted

  @ExportToExcelResCde
  Scenario: Should be able to Export to excel Resolution Code
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on RM Export to Excel button

  @addResolutionCodeValidationInput
  Scenario: User should not be able to save RM Resolution Code form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM Resolution Code 'string' tab
    When User clicks on button Resolution Code add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault Resolution Code
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Resolution Code' on Fault Resolution Code

  @ExportToExcelSLAType
  Scenario: Should be able to Export to excel SLA Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLA Type 'string' tab
    Then User clicks on RM Export to Excel button

  @addPriorityChangeReasons
  Scenario: Should be able to Add PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    When User clicks on button PriorityChangeReasons add 'Add'
    When User fills up the 'string' PriorityChangeReasons details
    #When User clicks on PriorityChangeReasons save button
    When User clicks on RM Master save button
    Then User verify if the PriorityChangeReasons is created

  @EditPriorityChangeReasons
  Scenario: Should be able to Edit PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    When User clicks on button PriorityChangeReasons add 'Add'
    When User fills up the 'string' PriorityChangeReasons details
    When User clicks on PriorityChangeReasons save button
    When User verify if the PriorityChangeReasons is created
    When User clicks on active PriorityChangeReasons in the grid
    When User clicks on PriorityChangeReasons save button
    Then User verify if the PriorityChangeReasons is created

  @DeletePriorityChangeReasons
  Scenario: Should be able to Delete PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    #When User clicks on active RM PriorityChangeReasons in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the RM PriorityChangeReasons is deleted

  @ExportToExcelPCR
  Scenario: Should be able to Export to excel PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on RM Export to Excel button

  @addPriorityChangeReasonValidationInput
  Scenario: User should not be able to save RM Priority Change Reason form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    When User clicks on button PriorityChangeReasons add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault Priority Change Reasons
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Priority Change Reasons' on Fault Priority Change Reasons

  @addContractGroupChangeReasons
  Scenario: Should be able to Add ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    When User clicks on button ContractGroupChangeReasons add 'Add'
    When User fills up the 'string' ContractGroupChangeReasons details
    #When User clicks on ContractGroupChangeReasons save button
    When User clicks on RM Master save button
    Then User verify if the ContractGroupChangeReasons is created

  @EditContractGroupChangeReasons
  Scenario: Should be able to Edit ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    When User clicks on button ContractGroupChangeReasons add 'Add'
    When User fills up the 'string' ContractGroupChangeReasons details
    When User clicks on ContractGroupChangeReasons save button
    When User verify if the ContractGroupChangeReasons is created
    When User clicks on active ContractGroupChangeReasons in the grid
    When User clicks on ContractGroupChangeReasons save button
    Then User verify if the ContractGroupChangeReasons is created

  @DeleteContractGroupChangeReasons
  Scenario: Should be able to Delete ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    #When User clicks on active RM ContractGroupChangeReasons in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the RM ContractGroupChangeReasons is deleted

  @ExportToExcelContractGroupChangeReasons
  Scenario: Should be able to Export to excel ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    Then User clicks on RM Export to Excel button

  @addContractGroupChangeReasonValidationInput
  Scenario: User should not be able to save RM Contract Group Change Reason form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    When User clicks on button ContractGroupChangeReasons add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault Contract Group Change Reasons
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Contract Group Change Reason' on Fault Contract Group Change Reasons


  @ADDSLAFailureJustificationReasons
  Scenario: Should be able to Add SLA Failure Justification
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM SLAFailureJustification 'string' tab
    When User clicks on button SLAFailureJustification add 'Add'
    When User fills up the 'string' SLAFailureJustification details
    When User select the '' SLA Type SLAFailureJustification dropdown
    #When User clicks on SLAFailureJustification save button
    When User clicks on RM Master save button
    Then User verify if the SLAFailureJustification is created

  @EditSLAFailureJustificationReasons
  Scenario: Should be able to Edit SLA Failure Justification
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM SLAFailureJustification 'string' tab
    When User clicks on button SLAFailureJustification add 'Add'
    When User fills up the 'string' SLAFailureJustification details
    When User clicks on SLAFailureJustification save button
    #When User verify if the SLAFailureJustification is created
    When User clicks on active SLAFailureJustification in the grid
    When User clicks on SLAFailureJustification save button
    Then User verify if the SLAFailureJustification is created

  @DeleteSLAFailureJustificationReasons
  Scenario: Should be able to Delete SLA Failure Justification
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM SLAFailureJustification 'string' tab
    #When User clicks on active RM SLAFailureJustification in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the RM SLAFailureJustification is deleted

  @ExportToExcelSLAFailureJustificationReasons
  Scenario: Should be able to Export to excel SLA Failure Justification
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on RM Export to Excel button

  @addSLAFailureJustificationValidationInput
  Scenario: User should not be able to save RM SLA Failure Justification form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM SLAFailureJustification 'string' tab
    When User clicks on button SLAFailureJustification add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault SLA Failure Justification
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter SLA Failure Justification' on SLA Failure Justification


  @ADDCTIReasons
  Scenario: Should be able to Add CTI Reasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM CTI Reasons 'string' tab
    When User clicks on button CTIReasons add 'Add'
    When User fills up the 'string' CTIReasons details
    #When User clicks on CTIReasons save button
    When User clicks on RM Master save button
    Then User verify if the CTIReasons is created

  @EditCTIReasons
  Scenario: Should be able to Edit CTI Reasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM CTI Reasons 'string' tab
    When User clicks on button CTIReasons add 'Add'
    When User fills up the 'string' CTIReasons details
    When User clicks on CTIReasons save button
    When User clicks on active CTIReasons in the grid
    When User verify if the CTIReasons is created
    When User clicks on CTIReasons save button
    Then User verify if the CTIReasons is created

  @DeleteCTIReasons
  Scenario: Should be able to Delete CTI Reasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM CTI Reasons 'string' tab
    #When User clicks on active RM CTIReasons in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the RM CTIReasons is deleted

  @ExportToExcelCTIReasons
  Scenario: Should be able to Export to excel CTIReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on RM Export to Excel button

  @addCTIReasonsValidationInput
  Scenario: User should not be able to save RM CTIReasons form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM CTI Reasons 'string' tab
    When User clicks on button CTIReasons add 'Add'
    When user verify the chars min len as 3 and max len as 100 on Fault CTIReasons
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter CTI Reasons' on CTIReasons

  @ADDServiceRequestReasons
  Scenario: Should be able to Add ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    When User clicks on RM 'Data configuration' in side menu
    When User is at home screen after login with "username" and "password"
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    When User clicks on button ServiceRequestReasons add 'Add'
    When User fills up the 'string' ServiceRequestReasons details
    When User select the '' Type ServiceRequestReasons dropdown
    #When User clicks on ServiceRequestReasons save button
    When User clicks on RM Master save button
    Then User verify if the ServiceRequestReasons is created

  @EditServiceRequestReasons
  Scenario: Should be able to Edit ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    When User clicks on button ServiceRequestReasons add 'Add'
    When User fills up the 'string' ServiceRequestReasons details
    When User clicks on ServiceRequestReasons save button
    When User verify if the ServiceRequestReasons is created
    When User clicks on active ServiceRequestReasons in the grid
    When User clicks on ServiceRequestReasons save button
    Then User verify if the ServiceRequestReasons is created

  @DeleteServiceRequestReasons
  Scenario: Should be able to Delete ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    #When User clicks on active RM ServiceRequestReasons in the grid to delete
    When User clicks on active RM in the grid to delete
    Then User waits for 2 seconds
    Then User verify if the RM ServiceRequestReasons is deleted

  @ExportToExcelServiceRequestReasons
  Scenario: Should be able to Export to excel ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    When User is at home screen after login with "username" and "password"
    When User clicks on RM 'Data configuration' in side menu
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    Then User clicks on RM Export to Excel button

  @ServiceRequestReasonsValidationInput
  Scenario: User should not be able to save RM Service Requests form with invalid inputs
    Given User navigates to 'lattice.url' page
    When User clicks on RM 'Data configuration' in side menu
    When User is at home screen after login with "username" and "password"
    When User clicks on the Core masters RM 'string' tab
    When User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    When User clicks on button ServiceRequestReasons add 'Add'
    When user verify the chars min len as 3 and max len as 255 on Fault ServiceRequestReasons
    When User clicks on Save button For InLine Error RM
    Then user verify the inline error message 'Enter Service Request Reasons' on Fault ServiceRequestReasons
