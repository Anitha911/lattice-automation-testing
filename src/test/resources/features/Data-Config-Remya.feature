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