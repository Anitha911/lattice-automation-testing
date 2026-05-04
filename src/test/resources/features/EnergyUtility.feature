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
    When User enters details in Energy Utility Account Meter Set Up Pop up
    Then User Clicks AccountMeterSetUp Save Button

  @EnergyUtilityAccountMeterSetUpDetailPageUpdate
  Scenario: Should be able to display Account Meter set up Open detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    Then User clicks on button Energy Utility Account Meter Set Up Add 'Acc meter SetUp Add'
    When User enters details in Energy Utility Account Meter Set Up Pop up
    Then User Clicks AccountMeterSetUp Save Button
    When User clicks on first data in the grid
    Then User clicks the Edit Account Set Up Button
    When User clicks the Update Button in the Edit Account Set Up Detail page

  @EnergyUtilityAcctMtrSetUpDtlPageSideMenuConnLocation
  Scenario: Should be able to display Account Meter set up Open detail page
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    Then User clicks on button Energy Utility Account Meter Set Up Add 'Acc meter SetUp Add'
    When User enters details in Energy Utility Account Meter Set Up Pop up
    Then User Clicks AccountMeterSetUp Save Button
    When User clicks on first data in the grid
    Then User Clicks the Connection Location Menu in the Left side
    When User Clicks the Add Connection Location Button
    Then User checks the checkbox in the Connection Location grid details
    When User Clicks the Connection Location Save Button

  @EnergyUtilityAcctMtrSetUpDtlPageSideMenuSubMeterSave
  Scenario: Should be able to display Account Meter set up Open detail page and save Submeter
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    Then User clicks on button Energy Utility Account Meter Set Up Add 'Acc meter SetUp Add'
    When User enters details in Energy Utility Account Meter Set Up Pop up
    Then User Clicks AccountMeterSetUp Save Button
    When User clicks on first data in the grid
    Then User Clicks the SubMeter Menu in the Left side
    When User Clicks the Add SubMeter Button
    Then User SubMeter pop up details
    When User Clicks the SubMeter Save Button

  @EnergyUtilityAcctMtrSetUpDtlPageSideMenuSubMeterDelete
  Scenario: Should be able to display Account Meter set up Open detail page and Delete Submeter
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    #Then User clicks on button Energy Utility Account Meter Set Up Add 'Acc meter SetUp Add'
    #When User enters details in Energy Utility Account Meter Set Up Pop up
    #Then User Clicks AccountMeterSetUp Save Button
    When User clicks on first data in the grid
    Then User Clicks the SubMeter Menu in the Left side
    When User Clicks the SubMeter Delete Button

  @EnergyUtilityAcctMtrSetUpDtlPageHideClick
  Scenario: Should be able to display Account Meter set up Open detail page and Check Hide button in Submeter
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    #Then User clicks on button Energy Utility Account Meter Set Up Add 'Acc meter SetUp Add'
    #When User enters details in Energy Utility Account Meter Set Up Pop up
    #Then User Clicks AccountMeterSetUp Save Button
    When User clicks on first data in the grid
    Then User Clicks the Connection Location Menu in the Left side
    When User Clicks the SubMeter 'Connection Location' Hide Button click
    Then User Clicks the SubMeter Menu in the Left side
    When User Clicks the SubMeter 'Sub Meter' Hide Button click
    Then User Clicks the Consumption History Menu in the Left side
    When User Clicks the SubMeter 'Consumption' Hide Button click

  @EnergyUtilityAcctMtrSetUpDtlPageConsumptionHistView
  Scenario: Should be able to display Account Meter set up Open detail page and View Consump History
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on Energy Utility 'Energy Utility' in side menu
    Then User Clicks on Energy Utility Account Meter Set Up 'Account Meter Set Up' in side menu
    When User clicks on first data in the grid
    Then User Clicks the Consumption History Menu in the Left side





