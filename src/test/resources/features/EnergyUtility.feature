@EnergyUtilityModule
Feature: EnergyUtility Module Automation

  @EnergyUtilityAccountMeterSetUpExportToExcel
  Scenario: Should be able to display Account Meter set up and Export To excel
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    When User Clicks on Export to Excel Button

  @EnergyUtilityAccountMeterSetUpPagination
  Scenario: Should be able to display Account Meter set up and do pagination in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    When User clicks the AccountMeterSet Up Pagination arrow 'Pagination' in the grid

  @EnergyUtilityAccountMeterSetUpNoOfDataPerPage
  Scenario: Should be displaying number of data per page according to data selected in the grid
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    When User clicks the AccountMeterSet Up no of data per page 10 in the grid

  @EnergyUtilityAccountMeterSetUpAdd
  Scenario: Should be able to display Account Meter set up and Add
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    Then User clicks on button Energy Utility Account Meter Set Up Add 'Acc meter SetUp Add'
