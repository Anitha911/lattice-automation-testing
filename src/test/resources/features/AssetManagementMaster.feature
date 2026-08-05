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
    Then User waits for 10 seconds
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
    Then User waits for 10 seconds

 # Asset Master Category - Add , Update And Delete
  @addAssetMasterCategory
  Scenario: Should be able to create a new Asset Master Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Master Category' Asset Management Element
    Then User waits for 20 seconds
    Then User clicks on button Add in Asset Master Category page
    Then User fills the Asset Master Category details
    Then User waits for 10 seconds
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds
    Then User verify if the Asset Master Category is created
    Then User waits for 10 seconds

  @updateAssetMasterCategory
  Scenario: Should be able to edit a Asset Master Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Master Category' Asset Management Element
    Then User waits for 20 seconds
    Then User clicks on first available Asset Master Category to edit
    Then User waits for 10 seconds
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
    Then User move to 'Asset Master Category' Asset Management Element
    Then User waits for 3 seconds
    Then User clicks on first available Asset Master Category to delete
    Then User waits for 10 seconds

  # Asset Category - Add , Update And Delete
  @addAssetCategory
  Scenario: Should be able to create a new Asset Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Category' Asset Management Element
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Asset Category details
    Then User waits for 10 seconds
    And User clicks on Asset Management Save button
    Then User waits for 5 seconds
    Then User verify if the Asset Category is created
    Then User waits for 3 seconds

  @updateAssetCategory
  Scenario: Should be able to edit a Asset Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Category' Asset Management Element
    Then User clicks on first available Asset Category to edit
    Then User waits for 10 seconds
    Then User updates the Asset Category details
    Then User waits for 20 seconds
    Then User clicks on Asset Management Save button
    Then User waits for 10 seconds
    Then User verify if the Asset Category is updated
    Then User waits for 10 seconds
    Then User waits for 3 seconds

  @deleteAssetCategory
  Scenario: Should be able to delete a Asset Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Category' Asset Management Element
    Then User waits for 10 seconds
    Then User clicks on first available Asset Category to delete
    Then User waits for 10 seconds

     # Asset Sub Category - Add , Update And Delete
  @addAssetSubCategory
  Scenario: Should be able to create a new Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Asset Sub Category details
    And User clicks on Asset Management Save button
    Then User waits for 3 seconds
    Then User verify if the Asset Sub Category is created
    Then User waits for 3 seconds

  @updateAssetSubCategory
  Scenario: Should be able to edit a Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on first available Asset Sub Category to edit
    Then User waits for 10 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    When User click on the Manage Asset Subcategory button
    Then User waits for 10 seconds
    Then User updates the Asset Sub Category details
    Then User waits for 5 seconds
    Then User clicks on Asset Management Save button
    Then User waits for 5 seconds
    Then User need to click the back icon to move to the Asset Sub Category grid list
    Then User waits for 5 seconds
    Then User verify if the Asset Sub Category is updated
    Then User waits for 3 seconds

     # Asset Sub Category -  Applicable Fault Category
  @AssetSubCategoryApplicableFaultCategory
  Scenario: Should be able to link Fault Category to Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on first available Asset Sub Category to edit
    Then User waits for 5 seconds
    When User switches to new tab
    When User click on the "Applicable Fault Category" section in the Asset Sub Category detail page
    Then User waits for 10 seconds
    Then User click Manage Applicable Fault Category icon in the Fault Category of the Asset Sub Category detail page
    Then User waits for 5 seconds
    Then User fill the Fault Category details in the Fault Category section of the Asset Sub Category detail page
    Then User waits for 5 seconds
    Then User click Fault Category save button in the Fault Category pop up of the Asset Sub Category detail page
    Then User waits for 10 seconds


     # Asset Sub Category -  Technical Parameters
  @AssetSubCategoryTechnicalParameter
  Scenario: Should be able to link Technical Parameter to Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on first available Asset Sub Category to edit
    Then User waits for 5 seconds
    When User switches to new tab
    When User click on the "Technical Parameters" section in the Asset Sub Category detail page
    Then User waits for 10 seconds
    Then User click Manage Technical Parameter icon in the Technical Parameter of the Asset Sub Category detail page
    Then User waits for 20 seconds
    Then User fill the Link Technical Parameter details in the Technical Parameter section
    Then User waits for 5 seconds
    Then User click Technical Parameter save button in the Technical Parameter of the Asset Sub Category detail page
    Then User waits for 10 seconds

    # Asset Sub Category -  Link Metering Parameters
  @AssetSubCategoryMeteringParameter
  Scenario: Should be able to link Metering Parameter to Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on first available Asset Sub Category to edit
    Then User waits for 5 seconds
    When User switches to new tab
    When User click on the "Metering Parameters" section in the Asset Sub Category detail page
    Then User waits for 5 seconds
    Then User click Link Parameter Setup in the Metering Parameters of the Asset Sub Category detail page
    Then User fill the Link Parameter Setup details in the Metering Parameter section
    Then User waits for 5 seconds
    Then User click Link Parameter Setup save button in the Asset Sub Category Metering Parameters section
    Then User waits for 10 seconds

      # Asset Sub Category -  Link Trigger
  @AssetSubCategoryTrigger
  Scenario: Should be able to create Trigger to Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on first available Asset Sub Category to edit
    Then User waits for 5 seconds
    When User switches to new tab
    When User click on the "Triggers" section in the Asset Sub Category detail page
    Then User waits for 5 seconds
    Then User click on the Add button in the Asset Sub Category Trigger section
    Then User waits for 5 seconds
    Then User fill the Trigger details in the Asset Sub Category detail page
    Then User waits for 5 seconds
    Then User click Trigger save button in the Asset Sub Category Trigger section
    Then User waits for 10 seconds

   # Asset Sub Category -  Link Life Cycle Setup
  @AssetSubCategoryLinkLifeCycleSetUp
  Scenario: Should be able to Link Life Cycle to Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on first available Asset Sub Category to edit
    Then User waits for 5 seconds
    When User switches to new tab
    When User click on the "Life Cycle Setup" section in the Asset Sub Category detail page
    Then User waits for 5 seconds
    Then User click on the Add button in the Asset Sub Category Life Cycle Setup section
    Then User waits for 5 seconds
    Then User fill the Life Cycle details in the Asset Sub Category Life Cycle Setup section
    Then User waits for 5 seconds
    Then User click Life Cycle save button in the Asset Sub Category Life Cycle Setup section
    Then User waits for 10 seconds

 # Asset Sub Category -  Link Applicable Trades
  @AssetSubCategoryLinkApplicableTrades
  Scenario: Should be able to Link Applicable Trades to Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on first available Asset Sub Category to edit
    Then User waits for 5 seconds
    When User switches to new tab
    When User click on the "Applicable Trades" section in the Asset Sub Category detail page
    Then User waits for 5 seconds
    Then User click on the Manage Applicable Trade button in the Applicable Trades section
    Then User waits for 5 seconds
    Then User link the Applicable Trade detail in the Applicable Trades section
    Then User waits for 5 seconds
    Then User click Applicable Trade save button in the Asset Sub Category detail page
    Then User waits for 10 seconds

  @deleteAssetSubCategory
  Scenario: Should be able to delete a Asset Sub Category
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User clicks on first available Asset Sub Category to delete
    Then User waits for 5 seconds

    # OEM - Add , Update And Delete
  @addOEM
  Scenario: Should be able to create a new OEM
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'OEM' Asset Management Element
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the OEM details
    Then User waits for 10 seconds
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
    Then User move to 'OEM' Asset Management Element
    Then User clicks on first available OEM to edit
    Then User waits for 3 seconds
    Then User updates the OEM details
    Then User waits for 10 seconds
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
    Then User move to 'OEM' Asset Management Element
    Then User waits for 3 seconds
    Then User clicks on first available OEM to delete
    Then User waits for 10 seconds

    # Make / Brand - Add , Update And Delete
  @addMake/Brand
  Scenario: Should be able to create a new Make / Brand
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Make' Asset Management Element
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Make details
    Then User waits for 10 seconds
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds
    Then User verify if the Make is created
    Then User waits for 3 seconds

  @updateMake/Brand
  Scenario: Should be able to edit a Make / Brand
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Make' Asset Management Element
    Then User clicks on first available Make to edit
    Then User waits for 3 seconds
    Then User updates the Make details
    Then User waits for 15 seconds
    Then User clicks on Asset Management Save button
    Then User waits for 10 seconds
    Then User verify if the Make is updated
    Then User waits for 3 seconds

  @deleteMake/Brand
  Scenario: Should be able to delete a Make / Brand
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Make' Asset Management Element
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
    Then User move to 'Model' Asset Management Element
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Model details
    Then User waits for 10 seconds
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds
    Then User verify if the Model is created
    Then User waits for 3 seconds

  @updateModel
  Scenario: Should be able to edit a Model
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Model' Asset Management Element
    Then User clicks on first available Model to edit
    Then User waits for 3 seconds
    Then User updates the Model details
    Then User waits for 10 seconds
    Then User clicks on Asset Management Save button
    Then User waits for 10 seconds
    Then User verify if the Model is updated
    Then User waits for 3 seconds

  @deleteModel
  Scenario: Should be able to delete a Model
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Model' Asset Management Element
    Then User waits for 3 seconds
    Then User clicks on first available Model to delete
    Then User waits for 10 seconds

 # Derating Factor - Add , Update And Delete
  @addDeratingFactor
  Scenario: Should be able to create a new Derating Factor
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Derating Factor' Asset Management Element
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Derating Factor details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds
    Then User verify if the Derating Factor is created
    Then User waits for 10 seconds
    Then User waits for 3 seconds

  @updateDeratingFactor
  Scenario: Should be able to edit a Derating Factor
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Derating Factor' Asset Management Element
    Then User clicks on first available Derating Factor to edit
    Then User waits for 3 seconds
    Then User updates the Derating Factor details
    Then User waits for 10 seconds
    Then User clicks on Asset Management Save button
    Then User waits for 10 seconds
    Then User verify if the Derating Factor is updated
    Then User waits for 10 seconds


  @deleteDeratingFactor
  Scenario: Should be able to delete a Derating Factor
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Derating Factor' Asset Management Element
    Then User waits for 3 seconds
    Then User clicks on first available Derating Factor to delete
    Then User waits for 13 seconds

# Reading Unit - Add , Update And Delete
  @addReadingUnit
  Scenario: Should be able to create a new Reading Unit
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Reading Unit' Asset Management Element
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
    Then User move to 'Reading Unit' Asset Management Element
    Then User clicks on first available Reading Unit to edit
    Then User waits for 3 seconds
    Then User updates the Reading Unit details
    Then User clicks on Asset Management Save button
    Then User waits for 3 seconds
    Then User verify if the Reading Unit is updated
    Then User waits for 10 seconds
    Then User waits for 3 seconds

  @deleteReadingUnit
  Scenario: Should be able to delete a Reading Unit
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Reading Unit' Asset Management Element
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
    Then User move to 'Technical Parameters' Asset Management Element
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Technical Parameters details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User waits for 5 seconds
    Then User verify if the Technical Parameters is created
    Then User waits for 10 seconds

  @updateTechnicalParameters
  Scenario: Should be able to edit a Technical Parameters
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Technical Parameters' Asset Management Element
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
    Then User move to 'Technical Parameters' Asset Management Element
    Then User waits for 3 seconds
    Then User clicks on first available Technical Parameters to delete
    Then User waits for 10 seconds

# Metering Attributes - Add , Update And Delete
  @addMeteringAttributes
  Scenario: Should be able to create a new Metering Attributes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Attributes' Asset Management Element
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
    Then User move to 'Metering Attributes' Asset Management Element
    Then User clicks on first available Metering Attributes to edit
    Then User waits for 3 seconds
    Then User updates the Metering Attributes details
    Then User clicks on Asset Management Save button
    Then User verify if the Metering Attributes is updated
    Then User waits for 10 seconds

  @deleteMeteringAttributes
  Scenario: Should be able to delete a Metering Attributes
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Attributes' Asset Management Element
    Then User waits for 3 seconds
    Then User clicks on first available Metering Attributes to delete
    Then User waits for 10 seconds

#  Metering Parameters - Add , Update And Delete
  @addMeteringParameters
  Scenario: Should be able to create a new Metering Parameters
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Parameters' Asset Management Element
    Then User clicks on button 'Add'
    Then User waits for 5 seconds
    Then User fills the Metering Parameters details
    Then User waits for 3 seconds
    And User clicks on Asset Management Save button
    Then User verify if the Metering Parameters is created
    Then User waits for 3 seconds

  @updateMeteringParameters
  Scenario: Should be able to edit a Metering Parameters
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Parameters' Asset Management Element
    Then User clicks on first available Metering Parameters to edit
    Then User waits for 3 seconds
    Then User updates the Metering Parameters details
    Then User clicks on Asset Management Save button
    Then User verify if the Metering Parameters is updated
    Then User waits for 3 seconds
#
  @deleteMeteringParameters
  Scenario: Should be able to delete a Metering Parameters
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Parameters' Asset Management Element
    Then User waits for 3 seconds
    Then User clicks on first available Metering Parameter to delete
    Then User waits for 10 seconds

  # Tools & Equipments - Add , Update And Delete
  @addTools&Equipments
  Scenario: Should be able to create a new Tools & Equipments
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Tools & Equipments' Asset Management Element
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
    Then User move to 'Tools & Equipments' Asset Management Element
    Then User clicks on first available Tools & Equipments to edit
    Then User waits for 3 seconds
    Then User updates the Tools & Equipments details
    Then User waits for 10 seconds
    Then User clicks on Asset Management Save button
    Then User verify if the Tools & Equipments is updated
    Then User waits for 10 seconds

  @deleteTools&Equipments
  Scenario: Should be able to delete a Tools & Equipments
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Tools & Equipments' Asset Management Element
    Then User waits for 3 seconds
    Then User clicks on first available Tools & Equipments to delete

  @ExporttoExcelAssetMManagement
  Scenario: Should be able to download Asset Files
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User waits for 3 seconds
    Then User click on the Master Asset Management Export to Excel button
    Then User move to 'Asset Master Category' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 20 seconds
    Then User move to 'Asset Category' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 20 seconds
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 20 seconds
    Then User move to 'OEM' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 20 seconds
    Then User move to 'Make' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 20 seconds
    Then User move to 'Model' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 20 seconds
    Then User move to 'Derating Factor' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 20 seconds
    Then User move to 'Reading Unit' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 20 seconds
    Then User move to 'Technical Parameters' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 10 seconds
    Then User move to 'Metering Attributes' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 10 seconds
    Then User move to 'Metering Parameters' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 10 seconds
    Then User move to 'Tools & Equipments' Asset Management Element
    Then User click on the Master Asset Management Export to Excel button
    Then User waits for 30 seconds

  @ValidationAssetClass
  Scenario: User should not be able to save Asset Class form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Asset Class' on Asset Class field
    When User verify the chars min len as 3 and max len as 100 for Asset Class field
    Then User waits for 2 seconds
    When User enters special characters in Asset Class field
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationAssetMasterCategory
  Scenario: User should not be able to save Asset Master Category form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Master Category' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button Add in Asset Master Category page
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Asset Master Category' on Asset Master Category field
    When User verify the inline error message 'Select Asset Class' on Asset Class field in Asset Master Category page
    When User verify the chars min len as 3 and max len as 100 for Asset Master Category field
    Then User waits for 2 seconds
    When User enters special characters in Asset Master Category field
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationAssetCategory
  Scenario: User should not be able to save Asset Category form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Category' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Asset Category' on Asset Category field
    When User verify the inline error message 'Select Asset Master Category' on Asset Master Category field in Asset Category page
    When User verify the chars min len as 3 and max len as 100 for Asset Category field
    Then User waits for 2 seconds
    When User enters special characters in Asset Category field
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationAssetSubcategory
  Scenario: User should not be able to save Asset Subcategory form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Asset Subcategory' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Asset Subcategory' on Asset Subcategory field
    When User verify the inline error message 'Select Asset Master Category' on Asset Master Category field in Asset Subcategory page
    When User verify the inline error message 'Select Asset Category' on Asset Category field in Asset Subcategory page
    When User verify the inline error message 'Select Asset Criticality' on Asset Criticality field in Asset Subcategory page
    When User verify the chars min len as 3 and max len as 100 for Asset Subcategory field
    Then User waits for 2 seconds
    When User enters special characters in Asset Subcategory field
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationOEM
  Scenario: User should not be able to save OEM form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'OEM' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter OEM' on OEM field
    When User verify the chars min len as 3 and max len as 100 for OEM field
    Then User waits for 2 seconds
    When User enters special characters in OEM field
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationMake
  Scenario: User should not be able to save Make form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Make' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Make/Brand' on Make field
    When User verify the inline error message 'Select OEM' on OEM field in Make page
    When User verify the chars min len as 3 and max len as 50 for Make field
    Then User waits for 2 seconds
    When User enters special characters in Make field
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationModel
  Scenario: User should not be able to save Model form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Model' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Model' on Model field
    When User verify the inline error message 'Select OEM' on OEM field in Model page
    When User verify the inline error message 'Select Make / Brand' on Make field in Model page
    When User verify the inline error message 'Select Asset Master Category' on Asset Master Category field in Model page
    When User verify the inline error message 'Select Asset Category' on Asset Category field in Model page
    When User verify the inline error message 'Select Asset Subcategory ' on Asset Subcategory field in Model page
    When User verify the chars min len as 3 and max len as 50 for Model field
    Then User waits for 2 seconds
    When User enters special characters in Model field
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationDeratingFactor
  Scenario: User should not be able to save Derating Factors form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Derating Factor' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Code' on Code field in Derating Factor page
    When User verify the inline error message 'Enter Description' on Description field in Derating Factor page
    When User verify the chars min len as 3 and max len as 4 for Code field in Derating Factor page
    When User verify the chars min len as 3 and max len as 100 for Description field in Derating Factor page
    Then User waits for 2 seconds
    When User enters special characters in Description field in Derating Factor page
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationReadingUnit
  Scenario: User should not be able to save Reading Unit form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Reading Unit' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Short Code' on Short Code field in Reading Unit page
    When User verify the inline error message 'Enter Reading Unit' on Reading Unit field in Reading Unit page
    When User verify the inline error message 'Select Symbol' on Symbol field in Reading Unit page
    When User verify the chars min len as 3 and max len as 4 for Short Code field in Reading Unit page
    When User verify the chars min len as 3 and max len as 100 for Reading Unit field in Reading Unit page
    Then User waits for 2 seconds
    When User enters special characters in Short Code field in Reading Unit page
    When User enters special characters in Reading Unit field in Reading Unit page
    And User clicks on Asset Management Save button
    Then User waits for 10 seconds

  @ValidationTechnicalParameters
  Scenario: User should not be able to save Technical Parameters form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Technical Parameters' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Parameter' on Parameter field in Technical Parameter page
    When User verify the inline error message 'Select Parameter Type' on Parameter Type field in Technical Parameter page
    When User verify the inline error message 'Select Box Name' on Box Name field in Technical Parameter page
     When User verify the chars min len as 3 and max len as 100 for Parameter field in Technical Parameter page
     Then User waits for 2 seconds
     When User enters special characters in Parameter field in Technical Parameter page
     And User clicks on Asset Management Save button
     Then User waits for 10 seconds

  @ValidationMeteringAttributes
  Scenario: User should not be able to save Metering Attributes form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Attributes' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Attribute' on Attribute field in Metering Attributes page
    When User verify the inline error message 'Select Reading Unit' on Reading Unit field in Metering Attributes page
    When User verify the chars min len as 3 and max len as 100 for Attribute field in Metering Attributes page
    Then User waits for 2 seconds
    When User enters special characters in Attribute field in Metering Attributes page
    And User clicks on Asset Management Save button
    Then User verify Active checkbox is selected by default in Metering Attributes page
    Then User waits for 10 seconds

  @ValidationMeteringParameters
  Scenario: User should not be able to save Metering Parameters form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Metering Parameters' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Parameter' on Parameter field in Metering Parameters page
    When User verify the inline error message 'Select Attribute' on Attribute field in Metering Parameters page
    When User verify the inline error message 'Select Input Type' on Input Type field in Metering Parameters page
    When User verify the inline error message 'Select Reading Type' on Reading Type field in Metering Parameters page
    When User verify the chars min len as 3 and max len as 100 for Parameter field in Metering Parameters page
    Then User waits for 2 seconds
    When User enters special characters in Parameter field in Metering Parameters page
    And User clicks on Asset Management Save button
    Then User verify Active checkbox is selected by default in Metering Parameters page
    Then User waits for 5 seconds

  @ValidationToolsAndEquipments
  Scenario: User should not be able to save Tools / Equipments form with invalid inputs
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Data Configurations' in navigation panel
    Then User clicks on hamburger icon
    And User clicks on the 'Asset Management' tab in data configuration page
    Then User move to 'Tools & Equipments' Asset Management Element
    Then User waits for 5 seconds
    Then User clicks on button 'Add'
    And User clicks on Asset Management Save button
    When User verify the inline error message 'Enter Equipment Name' on Equipment Name field in Tools page
    When User verify the inline error message 'Enter Hourly Charges' on Hourly Charges field in Tools page
    When User verify the inline error message 'Select Unit' on Unit field in Tools page
    When User verify the chars min len as 3 and max len as 100 for Equipment Name field in Tools page
    When User verify the chars min len as 3 and max len as 10 for Hourly Charges field in Tools page
    Then User waits for 2 seconds
    When User enters special characters in Equipment Name field in Tools page
    When User enters special characters in Hourly Charges field in Tools page
    And User clicks on Asset Management Save button
    Then User waits for 5 seconds
