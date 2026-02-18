@dataconfigReactiveServiceMaster
Feature: Reactive Service data a configuration Module Automation

  @addServiceGroup
  Scenario: Should be able to add Service Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on button Service Group add 'Add'
    Then User fills up the 'Service Group' Service Group details
    Then User clicks on Service Group save button
    Then User verify if the Service Group is created

  @EditServiceGroup
  Scenario: Should be able to Edit Service Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on button Service Group add 'Add'
    Then User fills up the 'Service Group' Service Group details
    Then User clicks on Service Group save button
    Then User verify if the Service Group is created
    Then User clicks on active Service Group in the grid
    Then User clicks on Service Group save button
    Then User verify if the Service Group is created

  @DeleteServiceGroup
  Scenario: Should be able to Delete RM Service Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on active Service Group in the grid to delete
    Then User verify if the Service Group is deleted

  @ExporttoExcelServiceGroup
  Scenario: Should be able to export to Excel RM ServiceGroup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on RM Export to Excel button

  @addFaultCategory
  Scenario: Should be able to add Fault Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on button Fault Category add 'Add'
    Then User fills up the 'Fault Category' Fault Category details
    Then User clicks on Fault Category save button
    Then User verify if the Fault Category is created

  @EditFaultCategory
  Scenario: Should be able to add Fault Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on button Fault Category add 'Add'
    Then User fills up the 'Fault Category' Fault Category details
    Then User clicks on Fault Category save button
    Then User verify if the Fault Category is created
    Then User clicks on active Fault Category in the grid
    Then User clicks on Fault Category save button
    Then User verify if the Fault Category is created

  @DeleteFaultCategory
  Scenario: Should be able to add Fault Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on active Fault Category in the grid to delete
    Then User verify if the Fault Category is deleted

  @ExportToExcelFaultCategory
  Scenario: Should be able to add Fault Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on RM Export to Excel button

  @addFaultCode
  Scenario: Should be able to add Fault Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    Then User clicks on button Fault Code add 'Add'
    Then User fills up the 'Fault Code' Fault Code details
    Then User clicks on Fault Code save button
    Then User verify if the Fault Code is created

  @DeleteFaultCode
  Scenario: Should be able to add Fault Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    Then User clicks on active Fault Code in the grid to delete
    Then User verify if the Fault Code is deleted

  @ExportToExcelFaultCode
  Scenario: Should be able to Export to excel Fault Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    Then User clicks on RM Export to Excel button

  @addFaultPriority
  Scenario: Should be able to add Fault Priority
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on button Fault Priority add 'Add'
    Then User fills up the 'Fault Priority' Fault Priority details
    Then User clicks on Fault Priority save button
    Then User verify if the Fault Priority is created

  @EditFaultPriority
  Scenario: Should be able to Edit Fault Priority
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on button Fault Priority add 'Add'
    Then User fills up the 'Fault Priority' Fault Priority details
    Then User clicks on Fault Priority save button
    Then User verify if the Fault Priority is created
    Then User clicks on active Fault Priority in the grid
    Then User clicks on Fault Priority save button
    Then User verify if the Fault Priority is created

  @DeleteFaultPriority
  Scenario: Should be able to Edit Fault Priority
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on active Fault Priority in the grid to delete
    Then User verify if the Fault Priority is deleted

  @ExportToExcelFaultPriority
  Scenario: Should be able to Export to excel Fault Priority
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on RM Export to Excel button

  @addWOSource
  Scenario: Should be able to add WO Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on button WO Source add 'Add'
    Then User fills up the 'WO Source' WO Source details
    Then User clicks on WO Source save button
    Then User verify if the WO Source is created

  @editWOSource
  Scenario: Should be able to edit WO Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on button WO Source add 'Add'
    Then User fills up the 'WO Source' WO Source details
    Then User clicks on WO Source save button
    Then User verify if the WO Source is created
    Then User clicks on active WO Source in the grid
    Then User clicks on WO Source save button
    Then User verify if the WO Source is created

  @DeleteWOSource
  Scenario: Should be able to Delete WO Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on active RM WO Source in the grid to delete
    Then User verify if the RM WO Source is deleted

  @ExportToExcelWOSOurce
  Scenario: Should be able to Export to excel WO Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on RM Export to Excel button

  @addRootCause
  Scenario: Should be able to add Root Cause
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on button Root Cause add 'Add'
    Then User fills up the 'Root Cause' Root Cause details
    Then User clicks on RC save button
    Then User verify if the RC is created

  @EditRootCause
  Scenario: Should be able to Edit Root Cause
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on button Root Cause add 'Add'
    Then User fills up the 'Root Cause' Root Cause details
    Then User clicks on RC save button
    Then User verify if the RC is created
    Then User clicks on active RC in the grid
    Then User clicks on RC save button
    Then User verify if the RC is created

  @DeleteRootCause
  Scenario: Should be able to Delete Root Cause
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on active RM Root Cause in the grid to delete
    Then User verify if the RM Root Cause is deleted

  @ExportToExcelRC
  Scenario: Should be able to Export to excel Root Cause
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on RM Export to Excel button

  @addResolutionCode
  Scenario: Should be able to Add Resolution Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on button Resolution Code add 'Add'
    Then User fills up the 'Resolution Code' Resolution Code details
    Then User clicks on ResolutionCode save button
    Then User verify if the ResolutionCode is created

  @EditResolutionCode
  Scenario: Should be able to Edit Resolution Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on button Resolution Code add 'Add'
    Then User fills up the 'Resolution Code' Resolution Code details
    Then User clicks on ResolutionCode save button
    Then User verify if the ResolutionCode is created
    Then User clicks on active ResolutionCode in the grid
    Then User clicks on ResolutionCode save button
    Then User verify if the ResolutionCode is created

  @DeleteRosolutionCode
  Scenario: Should be able to Delete Resolution Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on active RM Resolution Code in the grid to delete
    Then User verify if the RM Resolution Code is deleted

  @ExportToExcelResCde
  Scenario: Should be able to Export to excel Resolution Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on RM Export to Excel button

  @addPriorityChangeReasons
  Scenario: Should be able to Add PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on button PriorityChangeReasons add 'Add'
    Then User fills up the 'string' PriorityChangeReasons details
    Then User clicks on PriorityChangeReasons save button
    Then User verify if the PriorityChangeReasons is created

  @EditPriorityChangeReasons
  Scenario: Should be able to Edit PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on button PriorityChangeReasons add 'Add'
    Then User fills up the 'string' PriorityChangeReasons details
    Then User clicks on PriorityChangeReasons save button
    Then User verify if the PriorityChangeReasons is created
    Then User clicks on active PriorityChangeReasons in the grid
    Then User clicks on PriorityChangeReasons save button
    Then User verify if the PriorityChangeReasons is created

  @DeletePriorityChangeReasons
  Scenario: Should be able to Delete PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on active RM PriorityChangeReasons in the grid to delete
    Then User verify if the RM PriorityChangeReasons is deleted

  @ExportToExcelPCR
  Scenario: Should be able to Export to excel PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on RM Export to Excel button

  @addContractGroupChangeReasons
  Scenario: Should be able to Add ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    Then User clicks on button ContractGroupChangeReasons add 'Add'
    Then User fills up the 'string' ContractGroupChangeReasons details
    Then User clicks on ContractGroupChangeReasons save button
    Then User verify if the ContractGroupChangeReasons is created

  @EditContractGroupChangeReasons
  Scenario: Should be able to Edit ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    Then User clicks on button ContractGroupChangeReasons add 'Add'
    Then User fills up the 'string' ContractGroupChangeReasons details
    Then User clicks on ContractGroupChangeReasons save button
    Then User verify if the ContractGroupChangeReasons is created
    Then User clicks on active ContractGroupChangeReasons in the grid
    Then User clicks on ContractGroupChangeReasons save button
    Then User verify if the ContractGroupChangeReasons is created

  @DeleteContractGroupChangeReasons
  Scenario: Should be able to Delete ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    Then User clicks on active RM ContractGroupChangeReasons in the grid to delete
    Then User verify if the RM ContractGroupChangeReasons is deleted

  @ExportToExcelContractGroupChangeReasons
  Scenario: Should be able to Export to excel ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    Then User clicks on RM Export to Excel button

  @ADDSLAFailureJustificationReasons
  Scenario: Should be able to Add SLA Failure Justification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on button SLAFailureJustification add 'Add'
    Then User fills up the 'string' SLAFailureJustification details
    Then User clicks on SLAFailureJustification save button
    Then User verify if the SLAFailureJustification is created

  @EditSLAFailureJustificationReasons
  Scenario: Should be able to Edit SLA Failure Justification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on button SLAFailureJustification add 'Add'
    Then User fills up the 'string' SLAFailureJustification details
    Then User clicks on SLAFailureJustification save button
    Then User verify if the SLAFailureJustification is created
    Then User clicks on active SLAFailureJustification in the grid
    Then User clicks on SLAFailureJustification save button
    Then User verify if the SLAFailureJustification is created

  @DeleteSLAFailureJustificationReasons
  Scenario: Should be able to Delete SLA Failure Justification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on active RM SLAFailureJustification in the grid to delete
    Then User verify if the RM SLAFailureJustification is deleted

  @ExportToExcelSLAFailureJustificationReasons
  Scenario: Should be able to Export to excel SLA Failure Justification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on RM Export to Excel button

  @ADDCTIReasons
  Scenario: Should be able to Add CTI Reasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on button CTIReasons add 'Add'
    Then User fills up the 'string' CTIReasons details
    Then User clicks on CTIReasons save button
    Then User verify if the CTIReasons is created

  @EditCTIReasons
  Scenario: Should be able to Edit CTI Reasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on button CTIReasons add 'Add'
    Then User fills up the 'string' CTIReasons details
    Then User clicks on CTIReasons save button
    Then User verify if the CTIReasons is created
    Then User clicks on active CTIReasons in the grid
    Then User clicks on CTIReasons save button
    Then User verify if the CTIReasons is created

  @DeleteCTIReasons
  Scenario: Should be able to Delete CTI Reasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on active RM CTIReasons in the grid to delete
    Then User verify if the RM CTIReasons is deleted

  @ExportToExcelCTIReasons
  Scenario: Should be able to Export to excel CTIReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on RM Export to Excel button

