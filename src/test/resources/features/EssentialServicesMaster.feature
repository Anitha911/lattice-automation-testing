@EssentialServicesMaster
Feature: Essential Services Master Module Automation
# Regulatory Body - Add , Update And Delete
  @addRegulatoryBody
  Scenario: Should be able to create a new Regulatory Body
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on button 'Add'
    Then User fills the Regulatory Body details
    And User clicks on Master Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Regulatory Body is created
    Then User waits for 3 seconds

  @updateRegulatoryBody
  Scenario: Should be able to edit a Regulatory Body
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on first available Regulatory Body to edit
    Then User waits for 3 seconds
    Then User updates the Regulatory Body details
    Then User clicks on Master Essential Services Save button
    Then User verify if the Regulatory Body is updated
    Then User waits for 3 seconds

  @deleteRegulatoryBody
  Scenario: Should be able to delete a Regulatory Body
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User waits for 3 seconds
    Then User clicks on first available Regulatory Body to delete

# Connectivity Category - Add , Update And Delete
  @addConnectivityCategory
  Scenario: Should be able to create a new Connectivity Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity Category' section in Essential Services
    Then User clicks on button 'Add'
    Then User fills the Connectivity Category details
    And User clicks on Master Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Connectivity Category is created
    Then User waits for 3 seconds

  @updateConnectivityCategory
  Scenario: Should be able to edit a Connectivity Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity Category' section in Essential Services
    Then User clicks on first available Connectivity Category to edit
    Then User waits for 3 seconds
    Then User updates the Connectivity Category details
    Then User clicks on Master Essential Services Save button
    Then User verify if the Connectivity Category is updated
    Then User waits for 3 seconds

  @deleteConnectivityCategory
  Scenario: Should be able to delete a Connectivity Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity Category' section in Essential Services
    Then User waits for 3 seconds
    Then User clicks on first available Connectivity Category to delete

 # Connectivity - Add , Update And Delete
  @addConnectivity
  Scenario: Should be able to create a new Connectivity
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity' section in Essential Services
    Then User clicks on button 'Add'
    Then User fills the Connectivity details
    And User clicks on Master Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Connectivity is created
    Then User waits for 3 seconds

  @updateConnectivity
  Scenario: Should be able to edit a Connectivity
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity' section in Essential Services
    Then User clicks on first available Connectivity to edit
    Then User waits for 3 seconds
    Then User updates the Connectivity details
    Then User clicks on Master Essential Services Save button
    Then User verify if the Connectivity is updated
    Then User waits for 3 seconds

  @deleteConnectivity
  Scenario: Should be able to delete a Connectivity
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity' section in Essential Services
    Then User waits for 3 seconds
    Then User clicks on first available Connectivity to delete

  #Building Category - Add , Update And Delete
  @addBuildingCategory
  Scenario: Should be able to create a new Building Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Building Category' section in Essential Services
    Then User clicks on button 'Add'
    Then User fills the Building Category details
    And User clicks on Master Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Building Category is created
    Then User waits for 3 seconds

  @updateBuildingCategory
  Scenario: Should be able to edit a Building Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Building Category' section in Essential Services
    Then User clicks on first available Building Category to edit
    Then User waits for 3 seconds
    Then User updates the Building Category details
    Then User clicks on Master Essential Services Save button
    Then User verify if the Building Category is updated
    Then User waits for 3 seconds

  @deleteBuildingCategory
  Scenario: Should be able to delete a Building Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Building Category' section in Essential Services
    Then User waits for 3 seconds
    Then User clicks on first available Building Category to delete
    Then User waits for 3 seconds

  #Structure Type - Add , Update And Delete
  @addStructureType
  Scenario: Should be able to create a new Structure Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Structure Type' section in Essential Services
    Then User clicks on button 'Add'
    Then User fills the Structure Type details
    Then User waits for 3 seconds
    And User clicks on Master Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Structure Type is created
    Then User waits for 3 seconds

  @updateStructureType
  Scenario: Should be able to edit a Structure Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Structure Type' section in Essential Services
    Then User clicks on first available Structure Type to edit
    Then User waits for 3 seconds
    Then User updates the Structure Type details
    Then User clicks on Master Essential Services Save button
    Then User verify if the Structure Type is updated
    Then User waits for 3 seconds

  @deleteStructureType
  Scenario: Should be able to delete a Structure Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Structure Type' section in Essential Services
    Then User waits for 3 seconds
    Then User clicks on first available Structure Type to delete
    Then User waits for 3 seconds

  #Building Type - Add , Update And Delete
  @addBuildingType
  Scenario: Should be able to create a new Building Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Building Type' section in Essential Services
    Then User clicks on button 'Add'
    Then User fills the Building Type details
    Then User waits for 3 seconds
    And User clicks on Master Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Building Type is created
    Then User waits for 10 seconds

  @updateBuildingType
  Scenario: Should be able to edit a Building Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Building Type' section in Essential Services
    Then User clicks on first available Building Type to edit
    Then User waits for 3 seconds
    Then User updates the Building Type details
    Then User clicks on Master Essential Services Save button
    Then User waits for 3 seconds
    Then User verify if the Building Type is updated
    Then User waits for 10 seconds

  @deleteBuildingType
  Scenario: Should be able to delete a Building Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Building Type' section in Essential Services
    Then User waits for 3 seconds
    Then User clicks on first available Building Type to delete
    Then User waits for 3 seconds

  #SP Classification - Add , Update And Delete
  @addSPClassification
  Scenario: Should be able to create a new SP Classification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'SP Classification' section in Essential Services
    Then User clicks on button 'Add'
    Then User fills the SP Classification details
    Then User waits for 3 seconds
    And User clicks on Master Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the SP Classification is created
    Then User waits for 3 seconds

  @updateSPClassification
  Scenario: Should be able to edit a SP Classification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'SP Classification' section in Essential Services
    Then User clicks on first available SP Classification to edit
    Then User waits for 3 seconds
    Then User updates the SP Classification details
    Then User clicks on Master Essential Services Save button
    Then User verify if the SP Classification is updated
    Then User waits for 3 seconds

  @deleteSPClassification
  Scenario: Should be able to delete a SP Classification
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'SP Classification' section in Essential Services
    Then User waits for 3 seconds
    Then User clicks on first available SP Classification to delete
    Then User waits for 3 seconds

   #Violation Type - Add , Update And Delete
  @addViolationType
  Scenario: Should be able to create a new Violation Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Violation Type' section in Essential Services
    Then User clicks on button 'Add'
    Then User fills the Violation Type details
    Then User waits for 3 seconds
    And User clicks on Master Essential Services Save button
    Then User waits for 5 seconds
    Then User verify if the Violation Type is created
    Then User waits for 3 seconds

  @updateViolationType
  Scenario: Should be able to edit a Violation Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Violation Type' section in Essential Services
    Then User clicks on first available Violation Type to edit
    Then User waits for 3 seconds
    Then User updates the Violation Type details
    Then User clicks on Master Essential Services Save button
    Then User verify if the Violation Type is updated
    Then User waits for 3 seconds

  @deleteViolationType
  Scenario: Should be able to delete a Violation Type
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Violation Type' section in Essential Services
    Then User waits for 3 seconds
    Then User clicks on first available Violation Type to delete
    Then User waits for 3 seconds

  @ExporttoExcelEssentialService
  Scenario: Should be able to download Master Essential Services Files
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User click on the Master Essential Service Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on 'Connectivity Category' section in Essential Services
    Then User click on the Master Essential Service Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on 'Connectivity' section in Essential Services
    Then User click on the Master Essential Service Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on 'Building Category' section in Essential Services
    Then User click on the Master Essential Service Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on 'Structure Type' section in Essential Services
    Then User click on the Master Essential Service Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on 'Building Type' section in Essential Services
    Then User click on the Master Essential Service Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on 'SP Classification' section in Essential Services
    Then User click on the Master Essential Service Export to Excel button
    Then User waits for 3 seconds
    Then User clicks on 'Violation Type' section in Essential Services
    Then User click on the Master Essential Service Export to Excel button
    Then User waits for 3 seconds

  @ValidationRegulatoryBody
  Scenario: User should not be able to save Regulatory Body form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on button 'Add'
    And User clicks on Master Essential Services Save button
    When User verify the inline error message 'Enter Regulatory Body' on Regulatory Body field in the Essential Services module
#   When User verify the chars max len as 30 for Regulatory Body field in the Essential Services module
    Then User waits for 2 seconds
    When User enters special characters in Regulatory Body field in the Essential Services module
    And User clicks on Master Essential Services Save button
    Then User waits for 10 seconds

  @ValidationConnectivityCategory
  Scenario: User should not be able to save Connectivity Category form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity Category' section in Essential Services
    Then User clicks on button 'Add'
    And User clicks on Master Essential Services Save button
    When User verify the inline error message 'Enter Connectivity Category' on Connectivity Category field in the Essential Services module
   When User verify the chars max len as 30 for Connectivity Category field in the Essential Services module
    Then User waits for 2 seconds
    When User enters special characters in Connectivity Category field in the Essential Services module
    And User clicks on Master Essential Services Save button
    Then User waits for 10 seconds

  @ValidationConnectivity
  Scenario: User should not be able to save Connectivity form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Connectivity' section in Essential Services
    Then User clicks on button 'Add'
    And User clicks on Master Essential Services Save button
#   When User verify the inline error message 'Select Connectivity Category' on Connectivity Category field in the Connectivity Essential Services module
    When User verify the inline error message 'Enter Connectivity' on Connectivity field in the Essential Services module
#   When User verify the chars max len as 30 for Connectivity field in the Essential Services module
    Then User waits for 2 seconds
    When User enters special characters in Connectivity field in the Essential Services module
    And User clicks on Master Essential Services Save button
    Then User waits for 10 seconds

  @ValidationBuildingCategory
  Scenario: User should not be able to save Building Category form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Building Category' section in Essential Services
    Then User clicks on button 'Add'
    And User clicks on Master Essential Services Save button
    When User verify the inline error message 'Enter Building Category' on Building Category field in the Essential Services module
#   When User verify the chars max len as 30 for Building Category field in the Essential Services module
    Then User waits for 2 seconds
    When User enters special characters in Building Category field in the Essential Services module
    And User clicks on Master Essential Services Save button
    Then User waits for 10 seconds

  @ValidationStructureType
  Scenario: User should not be able to save Structure Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Structure Type' section in Essential Services
    Then User clicks on button 'Add'
    And User clicks on Master Essential Services Save button
    When User verify the inline error message 'Enter Structure Type' on Structure Type field in the Essential Services module
#   When User verify the chars max len as 30 for Structure Type field in the Essential Services module
    Then User waits for 2 seconds
    When User enters special characters in Structure Type field in the Essential Services module
    And User clicks on Master Essential Services Save button
    Then User waits for 10 seconds

  @ValidationBuildingType
  Scenario: User should not be able to save Building Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Building Type' section in Essential Services
    Then User clicks on button 'Add'
    And User clicks on Master Essential Services Save button
    When User verify the inline error message 'Enter Building Type' on Building Type field in the Essential Services module
    When User verify the chars max len as 200 for Building Type field in the Essential Services module
    Then User waits for 2 seconds
    When User enters special characters in Building Type field in the Essential Services module
    And User clicks on Master Essential Services Save button
    Then User waits for 10 seconds

  @ValidationSPClassification
  Scenario: User should not be able to save SP Classification form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'SP Classification' section in Essential Services
    Then User clicks on button 'Add'
    And User clicks on Master Essential Services Save button
    When User verify the inline error message 'Enter SP Classification' on SP Classification field in the Essential Services module
    When User verify the inline error message 'Select Building Category' on Building Category field in the SP Classification of Essential Services module
    When User verify the chars max len as 200 for SP Classification field in the Essential Services module
    When User enters special characters in SP Classification field in the Essential Services module
    And User clicks on Master Essential Services Save button
    Then User waits for 10 seconds

  @ValidationViolationType
  Scenario: User should not be able to save Violation Type form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Essential Services' tab in data configuration page
    Then User clicks on 'Violation Type' section in Essential Services
    Then User clicks on button 'Add'
    And User clicks on Master Essential Services Save button
#    When User verify the inline error message 'Enter Question' on Question field in the Essential Services module
#    When User verify the inline error message 'Select Service Group' on Service Group field in the Essential Services module
#    When User verify the inline error message 'Select Fault Category' on Fault Category field in the Essential Services module
#    When User verify the inline error message 'Select Fault Code' on Fault Code field in the Essential Services module
#    When User verify the inline error message 'Select Priority' on Priority field in the Essential Services module
#    When User verify the inline error message 'Select Generate Wo On' on Generate Wo On field in the Essential Services module
    When User verify the chars max len as 200 for Question field in the Essential Services module
    When User enters special characters in Question field in the Essential Services module
    And User clicks on Master Essential Services Save button
    Then User waits for 10 seconds