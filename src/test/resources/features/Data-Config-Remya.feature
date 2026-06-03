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