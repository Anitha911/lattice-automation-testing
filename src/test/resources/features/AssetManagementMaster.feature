@AssetManagementMaster
Feature: Asset Management Master Module Automation

# Asset Class - Add , Update And Delete
  @addAssetClass
  Scenario: Should be able to create a new Asset Class
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User clicks on button 'Add'
    Then User fills the Asset Class details
    Then User waits for 10 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Asset Class is created
    Then User waits for 3 seconds

  @updateAssetClass
  Scenario: Should be able to edit a Asset Class
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User clicks on first available Asset Class to edit
    Then User waits for 3 seconds
    Then User updates the Asset Class details
    Then User clicks on Asset Management Save button
    Then User verify if the Asset Class is updated
    Then User waits for 3 seconds

  @deleteAssetClass
  Scenario: Should be able to delete a Asset Class
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User clicks on first available Asset Class to delete


  # Asset Master Category - Add , Update And Delete
  @addAssetMasterCategory
  Scenario: Should be able to create a new Asset Master Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Master Category' Elements
    Then User clicks on button 'Add'
    Then User fills the Asset Master Category details
    Then User waits for 10 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Asset Master Category is created
    Then User waits for 3 seconds

  @updateAssetMasterCategory
  Scenario: Should be able to edit a Asset Master Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User clicks on first available Asset Master Category to edit
    Then User waits for 3 seconds
    Then User updates the Asset Master Category details
    Then User clicks on Asset Management Save button
    Then User verify if the Asset Master Category is updated
    Then User waits for 3 seconds

  @deleteAssetMasterCategory
  Scenario: Should be able to delete a Asset Master Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User clicks on first available Asset Master Category to delete


  # Asset Category - Add , Update And Delete
  @addAssetCategory
  Scenario: Should be able to create a new Asset Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Category' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Asset Category details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Asset Category is created
    Then User waits for 3 seconds

  @updateAssetCategory
  Scenario: Should be able to edit a Asset Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Category' Elements
    Then User clicks on first available Asset Category to edit
    Then User waits for 3 seconds
    Then User updates the Asset Category details
    Then User clicks on Asset Management Save button
    Then User verify if the Asset Category is updated
    Then User waits for 3 seconds

  @deleteAssetCategory
  Scenario: Should be able to delete a Asset Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Category' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Asset Category to delete

     # Asset Sub Category - Add , Update And Delete
  @addAssetSubCategory
  Scenario: Should be able to create a new Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Asset Sub Category details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Asset Sub Category is created
    Then User waits for 3 seconds

#  @updateAssetSubCategory
#  Scenario: Should be able to edit a Asset Sub Category
#    Given User navigates to 'lattice.url' page
#    Then User is at home screen after login with "username" and "password"
#    Then User clicks on 'Data Configurations' in navigation panel
#    Then User clicks on hamburger icon
#    And User clicks on the 'Asset Management' tab in data configuration page
#    Then User move to 'Asset Sub Category' Elements
#    Then User clicks on first available Asset Sub Category to edit
#    Then User waits for 3 seconds
#    Then User updates the Asset Sub Category details
#    Then User clicks on Asset Management Save button
#    Then User verify if the Asset Sub Category is updated
#    Then User waits for 3 seconds

  @deleteAssetSubCategory
  Scenario: Should be able to delete a Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Asset Sub Category to delete

# OEM - Add , Update And Delete
  @addOEM
  Scenario: Should be able to create a new OEM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'OEM' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the OEM details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the OEM is created
    Then User waits for 3 seconds

  @updateOEM
  Scenario: Should be able to edit a OEM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'OEM' Elements
    Then User clicks on first available OEM to edit
    Then User waits for 3 seconds
    Then User updates the OEM details
    Then User clicks on Asset Management Save button
    Then User verify if the OEM is updated
    Then User waits for 3 seconds

  @deleteOEM
  Scenario: Should be able to delete a OEM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'OEM' Elements
    Then User waits for 3 seconds
    Then User clicks on first available OEM to delete

    # Make / Brand - Add , Update And Delete
  @addMake/Brand
  Scenario: Should be able to create a new Make / Brand
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Make' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Make details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Make is created
    Then User waits for 3 seconds

  @updateMake/Brand
  Scenario: Should be able to edit a Make / Brand
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Make' Elements
    Then User clicks on first available Make to edit
    Then User waits for 3 seconds
    Then User updates the Make details
    Then User clicks on Asset Management Save button
    Then User verify if the Make is updated
    Then User waits for 3 seconds

  @deleteMake/Brand
  Scenario: Should be able to delete a Make / Brand
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Make' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Make to delete

   # Model - Add , Update And Delete
  @addModel
  Scenario: Should be able to create a new Model
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Model' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Model details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Model is created
    Then User waits for 3 seconds

  @updateModel
  Scenario: Should be able to edit a Model
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Model' Elements
    Then User clicks on first available Model to edit
    Then User waits for 3 seconds
    Then User updates the Model details
    Then User clicks on Asset Management Save button
    Then User verify if the Model is updated
    Then User waits for 3 seconds

  @deleteModel
  Scenario: Should be able to delete a Model
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Model' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Model to delete

 # Derating Factor - Add , Update And Delete
  @addDeratingFactor
  Scenario: Should be able to create a new Derating Factor
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Derating Factor' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Derating Factor details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Derating Factor is created
    Then User waits for 3 seconds

  @updateDeratingFactor
  Scenario: Should be able to edit a Derating Factor
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Derating Factor' Elements
    Then User clicks on first available Derating Factor to edit
    Then User waits for 3 seconds
    Then User updates the Derating Factor details
    Then User clicks on Asset Management Save button
    Then User verify if the Derating Factor is updated
    Then User waits for 3 seconds

  @deleteDeratingFactor
  Scenario: Should be able to delete a Derating Factor
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Derating Factor' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Derating Factor to delete

# Reading Unit - Add , Update And Delete
  @addReadingUnit
  Scenario: Should be able to create a new Reading Unit
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Reading Unit' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Reading Unit details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Reading Unit is created
    Then User waits for 3 seconds

  @updateReadingUnit
  Scenario: Should be able to edit a Reading Unit
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Reading Unit' Elements
    Then User clicks on first available Reading Unit to edit
    Then User waits for 3 seconds
    Then User updates the Reading Unit details
    Then User clicks on Asset Management Save button
    Then User verify if the Reading Unit is updated
    Then User waits for 3 seconds

  @deleteReadingUnit
  Scenario: Should be able to delete a Reading Unit
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Reading Unit' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Reading Unit to delete

# Technical Parameters - Add , Update And Delete
  @addTechnicalParameters
  Scenario: Should be able to create a new Technical Parameters
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Technical Parameters' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Technical Parameters details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Technical Parameters is created
    Then User waits for 3 seconds

  @updateTechnicalParameters
  Scenario: Should be able to edit a Technical Parameters
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Technical Parameters' Elements
    Then User clicks on first available Technical Parameters to edit
    Then User waits for 3 seconds
    Then User updates the Technical Parameters details
    Then User clicks on Asset Management Save button
    Then User verify if the Technical Parameters is updated
    Then User waits for 3 seconds

  @deleteTechnicalParameters
  Scenario: Should be able to delete a Technical Parameters
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Technical Parameters' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Technical Parameters to delete


# Metering Attributes - Add , Update And Delete
  @addMeteringAttributes
  Scenario: Should be able to create a new Metering Attributes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Attributes' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Metering Attributes details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Metering Attributes is created
    Then User waits for 3 seconds

  @updateMeteringAttributes
  Scenario: Should be able to edit a Metering Attributes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Attributes' Elements
    Then User clicks on first available Metering Attributes to edit
    Then User waits for 3 seconds
    Then User updates the Metering Attributes details
    Then User clicks on Asset Management Save button
    Then User verify if the Metering Attributes is updated
    Then User waits for 3 seconds

  @deleteMeteringAttributes
  Scenario: Should be able to delete a Metering Attributes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Attributes' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Metering Attributes to delete


#    # Metering Parameters - Add , Update And Delete
#  @addMeteringParameters
#  Scenario: Should be able to create a new Metering Parameters
#    Given User navigates to 'lattice.url' page
#    Then User is at home screen after login with "username" and "password"
#    Then User clicks on 'Data Configurations' in navigation panel
#    Then User clicks on hamburger icon
#    And User clicks on the 'Asset Management' tab in data configuration page
#    Then User move to 'Metering Parameters' Elements
#    Then User clicks on button 'Add'
#    Then User waits for 5 seconds
#    Then User fills the Metering Parameters details
#    Then User waits for 3 seconds
#    And User clicks on Asset Management Save button
#    Then User verify if the Metering Parameters is created
#    Then User waits for 3 seconds
#
#  @updateMeteringParameters
#  Scenario: Should be able to edit a Metering Parameters
#    Given User navigates to 'lattice.url' page
#    Then User is at home screen after login with "username" and "password"
#    Then User clicks on 'Data Configurations' in navigation panel
#    Then User clicks on hamburger icon
#    And User clicks on the 'Asset Management' tab in data configuration page
#    Then User move to 'Metering Parameters' Elements
#    Then User clicks on first available Metering Parameters to edit
#    Then User waits for 3 seconds
#    Then User updates the Metering Parameters details
#    Then User clicks on Asset Management Save button
#    Then User verify if the Metering Parameters is updated
#    Then User waits for 3 seconds
#
#  @deleteMeteringParameters
#  Scenario: Should be able to delete a Metering Parameters
#    Given User navigates to 'lattice.url' page
#    Then User is at home screen after login with "username" and "password"
#    Then User clicks on 'Data Configurations' in navigation panel
#    Then User clicks on hamburger icon
#    And User clicks on the 'Asset Management' tab in data configuration page
#    Then User move to 'Metering Parameters' Elements
#    Then User waits for 3 seconds
#    Then User clicks on first available Metering Attributes to delete



  # Tools & Equipments - Add , Update And Delete
  @addTools&Equipments
  Scenario: Should be able to create a new Tools & Equipments
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Tools & Equipments' Elements
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Tools & Equipments details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Tools & Equipments is created
    Then User waits for 3 seconds

  @updateTools&Equipments
  Scenario: Should be able to edit a Tools & Equipments
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Tools & Equipments' Elements
    Then User clicks on first available Tools & Equipments to edit
    Then User waits for 3 seconds
    Then User updates the Tools & Equipments details
    Then User clicks on Asset Management Save button
    Then User verify if the Tools & Equipments is updated
    Then User waits for 3 seconds

  @deleteTools&Equipments
  Scenario: Should be able to delete a Tools & Equipments
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Tools & Equipments' Elements
    Then User waits for 3 seconds
    Then User clicks on first available Tools & Equipments to delete
