@DataConfigRemya
Feature: Reactive,Sales,Inventory,Guard,Energy Data Config Feature Files

  #Reactive Service Management Data Config
  @addServiceGroupConsolidated
  Scenario: Should be able to add Service Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on button Service Group add 'Add'
    Then User fills up the 'Service Group' Service Group details
    Then User clicks on Service Group save button
    Then User verify if the Service Group is created

  @EditServiceGroupConsolidated
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

  @DeleteServiceGroupConsolidated
  Scenario: Should be able to Delete RM Service Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on active Service Group in the grid to delete
    Then User verify if the Service Group is deleted

  @ExporttoExcelServiceGroupConsolidated
  Scenario: Should be able to export to Excel RM ServiceGroup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on RM Export to Excel button

  @ServiceGroupPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM ServiceGroup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on Service Group grid pagination 'Pagination'

  @ServiceGroupDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page  in RM ServiceGroup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on Service Group grid Data Per Page 10

  @addFaultCategoryConsolidated
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

  @EditFaultCategoryConsolidated
  Scenario: Should be able to Edit Fault Category
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

  @DeleteFaultCategoryConsolidated
  Scenario: Should be able to Delete Fault Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on active Fault Category in the grid to delete
    Then User verify if the Fault Category is deleted

  @ExportToExcelFaultCategoryConsolidated
  Scenario: Should be able to Export To Excel Fault Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on RM Export to Excel button

  @FaultCategoryPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM FaultCategory
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on FaultCategory grid pagination 'Pagination'

  @FaultCategoryDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM FaultCategory
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Category 'string' tab
    Then User clicks on FaultCategory grid Data Per Page 10

  @addFaultCodeConsolidated
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

  @EditFaultCodeConsolidated
  Scenario: Should be able to Edit Fault Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    When User Clicks on first data in the FaultCode Grid
    Then User clicks the manage Fault Code Button
    When User clicks the Update Button

  @DeleteFaultCodeConsolidated
  Scenario: Should be able to Delete Fault Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    Then User clicks on active Fault Code in the grid to delete
    Then User verify if the Fault Code is deleted

  @ExportToExcelFaultCodeConsolidated
  Scenario: Should be able to Export to excel Fault Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    Then User clicks on RM Export to Excel button

  @FaultCodePaginationConsolidated
  Scenario: Should be able to Check Pagination in RM FaultCode
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    Then User clicks on FaultCode grid pagination 'Pagination'

  @FaultCodeDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM FaultCode
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Code 'string' tab
    Then User clicks on FaultCode grid Data Per Page 10

  @addFaultPriorityConsolidated
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

  @EditFaultPriorityConsolidated
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

  @DeleteFaultPriorityConsolidated
  Scenario: Should be able to Delete Fault Priority
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on active Fault Priority in the grid to delete
    Then User verify if the Fault Priority is deleted

  @ExportToExcelFaultPriorityConsolidated
  Scenario: Should be able to Export to excel Fault Priority
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on RM Export to Excel button

  @PriorityPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM Priority
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on Priority grid pagination 'Pagination'

  @FaultPriorityDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM Priority
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Fault Priority 'string' tab
    Then User clicks on Priority grid Data Per Page 10

  @addWOSourceConsolidated
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

  @EditWOSourceConsolidated
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

  @DeleteWOSourceConsolidated
  Scenario: Should be able to Delete WO Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on active RM WO Source in the grid to delete
    Then User verify if the RM WO Source is deleted

  @ExportToExcelWOSource
  Scenario: Should be able to Export to excel WO Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on RM Export to Excel button

  @WOSourcePaginationConsolidated
  Scenario: Should be able to Check Pagination in RM WO Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on WOSource grid pagination 'Pagination'

  @WOSourceDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM WOSource
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM WO Source 'string' tab
    Then User clicks on WO Source grid Data Per Page 10

  @addRootCauseConsolidated
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

  @EditRootCauseConsolidated
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

  @DeleteRootCauseConsolidated
  Scenario: Should be able to Delete Root Cause
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on active RM Root Cause in the grid to delete
    Then User verify if the RM Root Cause is deleted

  @ExportToExcelRCConsolidated
  Scenario: Should be able to Export to excel Root Cause
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on RM Export to Excel button

  @RootCauseCPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM Root Cause
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on Root Cause grid pagination 'Pagination'

  @RootCauseCDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM Root Cause
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Root Cause 'string' tab
    Then User clicks on Root Cause grid Data Per Page 10

  @addResolutionCodeConsolidated
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

  @EditResolutionCodeConsolidated
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

  @DeleteResolutionCodeConsolidated
  Scenario: Should be able to Delete Resolution Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on active RM Resolution Code in the grid to delete
    Then User verify if the RM Resolution Code is deleted

  @ExportToExcelResolutionCdeConsolidated
  Scenario: Should be able to Export to excel Resolution Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on RM Export to Excel button

  @ResolutionCodePaginationConsolidated
  Scenario: Should be able to Check Pagination in RM Resolution Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on Resolution Code grid pagination 'Pagination'

  @ResolutionCodeDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM Resolution Code
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM Resolution Code 'string' tab
    Then User clicks on Resolution Code grid Data Per Page 10

  @ExportToExcelSLATypeConsolidated
  Scenario: Should be able to Export to excel SLA Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLA Type 'string' tab
    Then User clicks on RM Export to Excel button

  @addPriorityChangeReasonsConsolidated
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

  @EditPriorityChangeReasonsConsolidated
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

  @DeletePriorityChangeReasonsConsolidated
  Scenario: Should be able to Delete PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on active RM PriorityChangeReasons in the grid to delete
    Then User verify if the RM PriorityChangeReasons is deleted

  @ExportToExcelPriorityChangeReasonsConsolidated
  Scenario: Should be able to Export to excel PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on RM Export to Excel button

  @PriorityChangeReasonsPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on PriorityChangeReasons grid pagination 'Pagination'

  @PriorityChangeReasonsDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM PriorityChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM PriorityChangeReasons 'string' tab
    Then User clicks on PriorityChangeReasons grid Data Per Page 10

  @addContractGroupChangeReasonsConsolidated
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

  @EditContractGroupChangeReasonsConsolidated
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

  @DeleteContractGroupChangeReasonsConsolidated
  Scenario: Should be able to Delete ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    Then User clicks on active RM ContractGroupChangeReasons in the grid to delete
    Then User verify if the RM ContractGroupChangeReasons is deleted

  @ExportToExcelContractGroupChangeReasonsConsolidated
  Scenario: Should be able to Export to excel ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab

    #only one page data is available hence will not work
  @ContractGroupChangeReasonsPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    Then User clicks on ContractGroupChangeReasons grid pagination 'Pagination'

  @ContractGroupChangeReasonsDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM ContractGroupChangeReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ContractGroupChangeReasons 'string' tab
    Then User clicks on ContractGroupChangeReasons grid Data Per Page 10

  @ADDSLAFailureJustificationReasonsConsolidated
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

  @EditSLAFailureJustificationReasonsConsolidated
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

  @DeleteSLAFailureJustificationReasonsConsolidated
  Scenario: Should be able to Delete SLA Failure Justification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on active RM SLAFailureJustification in the grid to delete
    Then User verify if the RM SLAFailureJustification is deleted

  @ExportToExcelSLAFailureJustificationReasonsConsolidated
  Scenario: Should be able to Export to excel SLA Failure Justification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on RM Export to Excel button

  @SLAFailureJustificationPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM SLAFailureJustification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on SLAFailureJustification grid pagination 'Pagination'

  @SLAFailureJustificationDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM SLAFailureJustification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM SLAFailureJustification 'string' tab
    Then User clicks on SLAFailureJustification grid Data Per Page 10

  @ADDCTIReasonsConsolidated
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

  @EditCTIReasonsConsolidated
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

  @DeleteCTIReasonsConsolidated
  Scenario: Should be able to Delete CTI Reasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on active RM CTIReasons in the grid to delete
    Then User verify if the RM CTIReasons is deleted

  @ExportToExcelCTIReasonsConsolidated
  Scenario: Should be able to Export to excel CTIReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on RM Export to Excel button

  @CTIReasonsPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM CTIReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on CTIReasons grid pagination 'Pagination'

  @CTIReasonsDataPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM CTIReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM CTI Reasons 'string' tab
    Then User clicks on CTIReasons grid Data Per Page 10

  @ADDServiceRequestReasonsConsolidated
  Scenario: Should be able to Add ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    Then User clicks on button ServiceRequestReasons add 'Add'
    Then User fills up the 'string' ServiceRequestReasons details
    Then User clicks on ServiceRequestReasons save button
    Then User verify if the ServiceRequestReasons is created

  @EditServiceRequestReasonsConsolidated
  Scenario: Should be able to Edit ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    Then User clicks on button ServiceRequestReasons add 'Add'
    Then User fills up the 'string' ServiceRequestReasons details
    Then User clicks on ServiceRequestReasons save button
    Then User verify if the ServiceRequestReasons is created
    Then User clicks on active ServiceRequestReasons in the grid
    Then User clicks on ServiceRequestReasons save button
    Then User verify if the ServiceRequestReasons is created

  @DeleteServiceRequestReasonsConsolidated
  Scenario: Should be able to Delete ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    Then User clicks on active RM ServiceRequestReasons in the grid to delete
    Then User verify if the RM ServiceRequestReasons is deleted

  @ExportToExcelServiceRequestReasonsConsolidated
  Scenario: Should be able to Export to excel ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on RM 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    Then User clicks on RM Export to Excel button

  @ServiceRequestReasonsPaginationConsolidated
  Scenario: Should be able to Check Pagination in RM ServiceRequestReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    Then User clicks on ServiceRequestReasons grid pagination 'Pagination'

  @ServiceRequestReasonsPerPageConsolidated
  Scenario: Should be able to Check Data Per Page in RM CTIReasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the Core masters RM 'string' tab
    Then User clicks on the Core masters RM ServiceRequestReasons 'string' tab
    Then User clicks on ServiceRequestReasons grid Data Per Page 10

  #Sales Enquiry Management Data Config
  @SalesMasteraddClientTypesConsolidated
  Scenario: Should be able to add Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on button Sales client types add 'Add'
    Then User fills up the 'Client Type Name' details
    Then User clicks on Client Type save button
    Then User verify if the Client Type is created

  @SalesMasterEditClientTypesConsolidated
  Scenario: Should be able to Edit Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on active Client Type in the grid
    Then User clicks on Client Type save button
    Then User verify if the Client Type is created

  @SalesMasterDeleteClientTypesConsolidated
  Scenario: Should be able to Delete Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on active Client Type in the grid to delete
    Then User verify if the Client Type is deleted

  @ExporttoExcelClientTypesConsolidated
  Scenario: Should be able to export to Excel Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on Sales Client Type Export to Excel button

  @SalesMasteraddEnquiryTypesConsolidated
  Scenario: Should be able to Add Sales Enquiry Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master 'Sales Enquiry Types' in side menu
    Then User clicks on button Sales Enquiry types add 'Add'
    Then User fills up the Enquiry type 'Enquiry Type Name' details
    Then User clicks on Enquiry Type save button
    Then User verify if the Enquiry Type is created

  @SalesMasterEditEnquiryTypesConsolidated
  Scenario: Should be able to Edit Sales Enquiry Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master 'Sales Enquiry Types' in side menu
    Then User clicks on active Enquiry Type in the grid
    Then User clicks on Enquiry Type save button
    Then User verify if the Enquiry Type is created

  @SalesMasterDeleteEnquiryTypesConsolidated
  Scenario: Should be able to Edit Sales Enquiry Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master 'Sales Enquiry Types' in side menu
    Then User clicks on active Enquiry Type in the grid to delete
    Then User verify if the Enquiry Type is deleted

  @ExporttoExcelEnquiryTypesConsolidated
  Scenario: Should be able to export to Excel Sales Client Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master 'Sales Enquiry Types' in side menu
    Then User clicks on Sales Enquiry Type Export to Excel button

  @SalesMasteraddEnquirySourcesConsolidated
  Scenario: Should be able to Add Sales Enquiry Sources
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on button Sales Enquiry Source add 'Add'
    Then User fills up the Enquiry Source 'Enquiry Source Name' details
    Then User clicks on Enquiry Source save button
    Then User verify if the Enquiry Source is created

  @SalesMasterEditEnquirySourcesConsolidated
  Scenario: Should be able to Edit Sales Enquiry Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on active Enquiry Source in the grid
    Then User clicks on Enquiry Source save button
    Then User verify if the Enquiry Source is created

  @SalesMasterDeleteEnquirySourcesConsolidated
  Scenario: Should be able to delete Sales Enquiry Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on active Enquiry Source in the grid to delete
    Then User verify if the Enquiry Source is deleted

  @ExporttoExcelEnquirySourcesConsolidated
  Scenario: Should be able to Export To Excel Sales Enquiry Source
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master source 'Sales Source' in side menu
    Then User clicks on Sales Enquiry Source Export to Excel button

  @SalesMasteraddTermsandConditionsConsolidated
  Scenario: Should be able to Add Sales Terms and Conditions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on button Sales Terms and Conditions add 'Add'
    Then User fills up the Enquiry Terms and Conditions 'Sales T and C' details
    Then User clicks on Sales T and C save button
    Then User verify if the Sales T and C is created

  @SalesMasterEditTermsandConditionsConsolidated
  Scenario: Should be able to Edit Sales Terms and Conditions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on active T and C in the grid
    Then User clicks on Sales T and C update button
    Then User verify if the Sales T and C is created

  @SalesMasterDeleteTermsandConditionsConsolidated
  Scenario: Should be able to Delete Terms and Conditions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on active T and C in the grid to delete
    Then User verify if the T and C is deleted

  @SalesMasterExporttoExcelTermsandConditions
  Scenario: Should be able to Export To Excel T and C
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Terms and Conditions 'Sales T and C' in side menu
    Then User clicks on T and C Export to Excel Button

  @SalesMasteraddExclusionsConsolidated
  Scenario: Should be able to Add Sales Exclusions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on button Sales Sales Exclusion add 'Add'
    Then User fills up the Enquiry Sales Exclusion 'Sales Exclusion' details
    Then User clicks on Sales Exclusion save button
    Then User verify if the Sales Exclusion is created

  @SalesMasterEditExclusionsConsolidated
  Scenario: Should be able to Edit Sales Exclusions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on active Enquiry Exclusion in the grid
    Then User clicks on Sales Exclusion save button
    Then User verify if the Sales Exclusion is created

  @SalesMasterDeleteExclusionConsolidateds
  Scenario: Should be able to Delete Sales Exclusions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on active sales master Exclusions in the grid to delete
    Then User verify if the sales master Exclusions is deleted

  @SalesMasterExportToExcelExclusionsConsolidated
  Scenario: Should be able to Export to Excel Sales Exclusions
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Exclusions 'Sales Exclusion' in side menu
    Then User clicks on Exclusions Export to Excel Button

  @SalesMasteraddPaymentTermsConsolidated
  Scenario: Should be able to Add Sales Payment Terms
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User clicks on button Sales Payment Terms add 'Add'
    Then User fills up the Enquiry Payment Terms 'Payment Terms' details
    Then User clicks on Payment Terms save button
    Then User verify if the Payment Terms is created

  @SalesMasterEditPaymentTermsConsolidated
  Scenario: Should be able to Edit Sales Payment Terms
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User clicks on active Enquiry Payment Terms in the grid
    Then User clicks on Payment Terms update button
    Then User verify if the Payment Terms is created

  @SalesMasterDeletePaymentTermsConsolidated
  Scenario: Should be able to Delete Sales Payment Terms
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User clicks on active sales master Payment Terms in the grid to delete
    Then User verify if the sales master Payment Terms is deleted

  @SalesMasterExportToExcelPaymentTermsConsolidated
  Scenario: Should be able to Export to Excel Sales Payment Terms
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Payment Terms 'Payment terms' in side menu
    Then User Clicks on Export to Excel Button

  @SalesMasterEditQuotationTypesConsolidated
  Scenario: Should be able to Edit Sales Quotation Types
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Types 'Quotation Types' in side menu
    Then User clicks on active Enquiry Quotation Type in the grid to Edit
    Then User clicks on Quotation Types update button

  @SalesMasterDeleteQuotationTypesConsolidated
  Scenario: Should be able to Delete Sales Quotation Types
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Types 'Quotation Types' in side menu
    Then User clicks on active sales master Quotation Types in the grid to delete

  @SalesMasterExportToExcelQuotationTypesConsolidated
  Scenario: Should be able to Export to Excel Sales Quotation Types
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Types 'Quotation Types' in side menu
    Then User Clicks on Export to Excel Button

  @SalesMasterExportToExcelQuotationLineTypesConsolidated
  Scenario: Should be able to Export to Excel Sales Quotation Line Types
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Line Types 'Quotation Line Types' in side menu
    Then User Clicks on Export to Excel Button

  @SalesMasterExportToExcelOtherCostConsolidated
  Scenario: Should be able to Export to Excel Sales Other Cost
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Sales 'string' tab
    Then User clicks on the sales master Quotation Other Cost 'Quotation Other Cost' in side menu
    Then User Clicks on Export to Excel Button

    #Inventory Module Data Configuration
  @addItemTypeConsolidated
  Scenario: Should be able to add Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on button Item Type add 'Add'
    Then User fills up the 'Item type' Item Type details
    Then User clicks on Item Type save button
    Then User verify if the Item Type is created

  @EditItemTypeConsolidated
  Scenario: Should be able to Edit Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on button Item Type add 'Add'
    Then User fills up the 'Item type' Item Type details
    Then User clicks on Item Type save button
    Then User verify if the Item Type is created
    Then User clicks on active Item Type in the grid
    Then User clicks on Item Type save button
    Then User verify if the Item Type is created

  @DeleteItemTypeConsolidated
  Scenario: Should be able to Delete Inventory Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on active Item Type in the grid to delete
    Then User verify if the Item Type is deleted

  @ExporttoExcelItemTypesConsolidated
  Scenario: Should be able to export to Excel Inventory Item Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on Inventory Item Type Export to Excel button

  @addItemCategoryConsolidated
  Scenario: Should be able to add Item Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item Category 'string' in side menu
    Then User clicks on button Item Category add 'Add'
    Then User fills up the 'Item Category' Item Category details
    Then User clicks on Item Category save button
    Then User verify if the Item Category is created

  @EditItemCategoryConsolidated
  Scenario: Should be able to Edit Item Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item Category 'string' in side menu
    Then User clicks on button Item Category add 'Add'
    Then User fills up the 'Item Category' Item Category details
    Then User clicks on Item Category save button
    Then User verify if the Item Category is created
    Then User clicks on active Item Category in the grid
    Then User clicks on Item Category save button
    Then User verify if the Item Category is created

  @DeleteItemCategoryConsolidated
  Scenario: Should be able to Delete Item Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item Category 'string' in side menu
    Then User clicks on active Item Category in the grid to delete
    Then User verify if the Item Category is deleted

  @ExporttoExcelItemCategoryConsolidated
  Scenario: Should be able to export to Excel Inventory Item Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Data Config 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item Category 'string' in side menu
    Then User clicks on Inventory Item Category Export to Excel button

  @addItemSubCategoryConsolidated
  Scenario: Should be able to add Item SubCategory
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item SubCategory 'string' in side menu
    Then User clicks on button Item SubCategory add 'Add'
    Then User fills up the 'Item SubCategory' Item SubCategory details
    Then User clicks on Item SubCategory save button
    Then User verify if the Item SubCategory is created

  @EditItemSubCategoryConsolidated
  Scenario: Should be able to Edit Item SubCategory
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item SubCategory 'string' in side menu
    Then User clicks on button Item SubCategory add 'Add'
    Then User fills up the 'Item SubCategory' Item SubCategory details
    Then User clicks on Item SubCategory save button
    Then User verify if the Item SubCategory is created
    Then User clicks on active Item SubCategory in the grid
    Then User clicks on Item SubCategory save button
    Then User verify if the Item SubCategory is created

  @DeleteItemSubCategoryConsolidated
  Scenario: Should be able to Delete Item SubCategory
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item SubCategory 'string' in side menu
    Then User clicks on active Item SubCategory in the grid to delete
    Then User verify if the Item SubCategory is deleted

  @ExportToExcelItemSubCategoryConsolidated
  Scenario: Should be able to Export to Excel Item SubCategory
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Item SubCategory 'string' in side menu
    Then User clicks on Inventory Item SubCategory Export to Excel button

  @addUnitConversionConsolidated
  Scenario: Should be able to add Unit Conversion
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Unit Conversion 'string' in side menu
    Then User clicks on button Unit Conversion add 'Add'
    Then User fills up the 'Unit Conversion' Unit Conversion details
    Then User clicks on Unit Conversion save button
    Then User verify if the Unit Conversion is created

  @EditUnitConversionConsolidated
  Scenario: Should be able to Edit Unit Conversion
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Unit Conversion 'string' in side menu
    Then User clicks on button Unit Conversion add 'Add'
    Then User fills up the 'Unit Conversion' Unit Conversion details
    Then User clicks on Unit Conversion save button
    Then User verify if the Unit Conversion is created
    Then User clicks on active Unit Conversion in the grid
    Then User clicks on Unit Conversion save button
    Then User verify if the Unit Conversion is created

  @DeleteUnitConversionConsolidated
  Scenario: Should be able to Delete Unit Conversion
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Unit Conversion 'string' in side menu
    Then User clicks on active Unit Conversion in the grid to delete
    Then User verify if the Unit Conversion is deleted

  @ExportToExcelUnitConversionConsolidated
  Scenario: Should be able to Export to Excel Unit Conversion
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Unit Conversion 'string' in side menu
    Then User clicks on Inventory Export to Excel button

  @addStoreGroupConsolidated
  Scenario: Should be able to add Store Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Store Group 'string' in side menu
    Then User clicks on button Store Group add 'Add'
    Then User fills up the 'Store Group' Store Group details
    Then User clicks on Store Group save button
    Then User verify if the Store Group is created

  @EditStoreGroupConsolidated
  Scenario: Should be able to Edit Store Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Store Group 'string' in side menu
    Then User clicks on button Store Group add 'Add'
    Then User fills up the 'Store Group' Store Group details
    Then User clicks on Store Group save button
    Then User verify if the Store Group is created
    Then User clicks on active Store Group in the grid
    Then User clicks on Store Group save button
    Then User verify if the Store Group is created

  @DeleteStoreGroupConsolidated
  Scenario: Should be able to Delete Store Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Store Group 'string' in side menu
    Then User clicks on active Store Group in the grid to delete
    Then User verify if the Store Group is deleted

  @ExportToExcelStoreGroupConsolidated
  Scenario: Should be able to Export To Excel Store Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Store Group 'string' in side menu
    Then User clicks on Inventory Export to Excel button

  @addUOMConsolidated
  Scenario: Should be able to add UOM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master UOM 'string' in side menu
    Then User clicks on button UOM add 'Add'
    Then User fills up the 'UOM' UOM details
    Then User clicks on UOM save button
    Then User verify if the UOM is created

  @EditUOMConsolidated
  Scenario: Should be able to Edit UOM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master UOM 'string' in side menu
    Then User clicks on button UOM add 'Add'
    Then User fills up the 'UOM' UOM details
    Then User clicks on UOM save button
    Then User clicks on active UOM in the grid
    Then User clicks on UOM save button
    Then User verify if the UOM is created

  @DeleteUOMConsolidated
  Scenario: Should be able to delete UOM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master UOM 'string' in side menu
    Then User clicks on active UOM in the grid to delete
    Then User verify if the UOM is deleted

  @ExportToExcelUOMConsolidated
  Scenario: Should be able to Export to Excel UOM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master UOM 'string' in side menu
    Then User clicks on Inventory Export to Excel button

  @addSupplierTypeConsolidated
  Scenario: Should be able to add Supplier Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Supplier Type 'string' in side menu
    Then User clicks on button Supplier Type add 'Add'
    Then User fills up the 'Supplier Type' Supplier Type details
    Then User clicks on Supplier Type save button
    Then User verify if the Supplier Type is created

  @EditSupplierTypeConsolidated
  Scenario: Should be able to Edit Supplier Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Supplier Type 'string' in side menu
    Then User clicks on button Supplier Type add 'Add'
    Then User fills up the 'Supplier Type' Supplier Type details
    Then User clicks on Supplier Type save button
    Then User verify if the Supplier Type is created
    Then User clicks on active Supplier Type in the grid
    Then User clicks on Supplier Type save button
    Then User verify if the Supplier Type is created

  @DeleteSupplierTypeConsolidated
  Scenario: Should be able to Delete Supplier Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Supplier Type 'string' in side menu
    Then User clicks on active Supplier Type in the grid to delete
    Then User verify if the Supplier Type is deleted

  @ExportToExcelSuppliertypeConsolidated
  Scenario: Should be able to Export to Excel Supplier Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Supplier Type 'string' in side menu
    Then User clicks on Inventory Export to Excel button

  @addActionReasonsConsolidated
  Scenario: Should be able to add Action Reasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Action Reasons 'string' in side menu
    Then User clicks on button Action Reasons add 'Add'
    Then User fills up the 'Action Reasons' Action Reasons details
    Then User clicks on Action Reasons save button
    Then User verify if the Action Reasons is created

  @EditActionReasonsConsolidated
  Scenario: Should be able to Edit Action Reasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Action Reasons 'string' in side menu
    Then User clicks on button Action Reasons add 'Add'
    Then User fills up the 'Action Reasons' Action Reasons details
    Then User clicks on Action Reasons save button
    Then User verify if the Action Reasons is created
    Then User clicks on active Action Reasons in the grid
    Then User clicks on Action Reasons save button
    Then User verify if the Action Reasons is created

  @DeleteActionReasonsConsolidated
  Scenario: Should be able to Delete Action Reasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Action Reasons 'string' in side menu
    Then User clicks on active Action Reasons in the grid to delete
    Then User verify if the Action Reasons is deleted

  @ExportToExcelActionReasonsConsolidated
  Scenario: Should be able to Delete Action Reasons
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Inventory 'Data configuration' in side menu
    Then User clicks on the additional masters Inventory 'string' tab
    Then User clicks on the Inventory master Action Reasons 'string' in side menu
    Then User clicks on Inventory Export to Excel button

        #Guard Patrol Module Data Configuration
  @addPatrolModesConsolidated
  Scenario: Should be able to add Patrolling modes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on button patrol add 'Add'
    Then User fills up the 'Mode' Patrol mode details
    Then User clicks on Patrol Mode save button
    Then User verify if the Patrol Mode is created

  @PatrolModesEditConsolidated
  Scenario: Should be able to edit a company/prevent duplicate
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on active Patrol mode in the grid
    Then User clicks on Patrol Mode save button
    Then User verify if the Patrol Mode is created

  @PatrolModesDeleteConsolidated
  Scenario: Should be able to delete a Patrol Mode
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on first Valid Patrol Mode to delete
    Then User verify if the Mode is deleted

  @ExportToExcelModeConsolidated
  Scenario: Should be able to export to excel  Patrol Mode
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on Mode Export to Excel button

  @addPatrolGuardShiftsConsolidated
  Scenario: Should be able to add Patrolling Shifts
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on button shifts add 'Add'
    Then User fills up the 'Shift' Patrol Shift details
    Then User clicks on Patrol Shift save button
    Then User verify if the Patrol Shift is created

  @PatrolShiftEditConsolidated
  Scenario: Should be able to edit a Patrol Shift
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on active Patrol Shift in the grid
    Then User clicks on Patrol Shift save button
    Then User verify if the Patrol Shift is created

  @PatrolShiftDeleteConsolidated
  Scenario: Should be able to delete a Patrol Shift
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on first Valid Patrol Shift to delete
    Then User verify if the Shift is deleted

  @ExportToExcelShiftConsolidated
  Scenario: Should be able to export to excel Patrol Shift
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the guard optional 'Optional Masters-Guard patrolling Management' tab
    Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on Mode Export to Excel button

    #Energy Utility DataConfiguration
  @addEnergyTypeConsolidated
  Scenario: Should be able to add Energy Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the Energy TrackingMgmt 'Energy Tracking Management' tab
    #Then User clicks on the 'Patrol Guard Shifts' in side menu
    Then User clicks on button Energy Types add 'Add'
    Then User fills up the 'Energy Types' Energy Types details
    Then User clicks on Energy Types save button
    Then User verify if the Energy Type is created

  @EditEnergyTypeConsolidated
  Scenario: Should be able to Edit Energy Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the Energy TrackingMgmt 'Energy Tracking Management' tab
    Then User clicks on active Energy Type in the grid
    Then User clicks on Energy Types save button
    Then User verify if the Energy Type is created

  @DeleteEnergyTypeConsolidated
  Scenario: Should be able to Delete Energy Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the Energy TrackingMgmt 'Energy Tracking Management' tab
    Then User clicks on active Energy Type in the grid to Delete
    Then User verify if the Energy Type is deleted

  @ExportToExcelEnergyTypeConsolidated
  Scenario: Should be able to Export To Excel Energy Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the Energy TrackingMgmt 'Energy Tracking Management' tab
    Then User clicks on Mode Export to Excel button

  @addReportingGroupConsolidated
  Scenario: Should be able to add Reporting Group
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User waits 2 seconds
    Then User clicks on 'Data configuration' in side menu
    Then User clicks on the Energy TrackingMgmt 'Energy Tracking Management' tab
    Then User clicks on the Reporting Group 'Reporting Group' in side menu
    Then User clicks on button Reporting group add 'Add'
    Then User fills up the 'Reporting Group' Reporting Group details
    Then User clicks on Reporting Group save button
    Then User verify if the Reporting Group is created