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
