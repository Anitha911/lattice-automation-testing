@assetManagement
Feature: Asset Register - Asset Management

  Background:
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel

  @AM1
  Scenario: AM1 - Validate click action for Asset Register menu
    Then the "Asset Register" page should be opened successfully

  @AM2
  Scenario: AM2 - Validate the Page size label on the Asset Register page
    Then the user should be able to view the label "Page size:" at the end of the Asset Register page

  @AM3
  Scenario: AM3 - Validate the "Asset Classification View" label on the left pane
    Then the user should be able to view the label "Asset Classification View" on the left pane of the Asset Register page

  @AssetRegister @AM4 @AM6 @AM8 @AM10 @AM12 @AM14 @AM16 @AM18 @AM20 @AM22 @AM24 @AM26 @AM28 @AM30 @AM32 @AM34 @AM36 @AM38 @AM40 @AM42 @AM44 @AM46 @AM48 @AM50 @AM52 @AM54 @AM56 @AM58 @AM60 @AM62 @AM64 @AM66 @AM68 @AM70 @AM72 @AM74 @AM76 @AM78 @AM80 @AM82 @AM84 @AM86 @AM88 @AM90
  Scenario: Validate the grid field labels on the Asset Register page
    Then the user should be able to view the grid field label "Asset Code" on the Asset Register page
    Then the user should be able to view the grid field label "Tag Code" on the Asset Register page
    Then the user should be able to view the grid field label "External Ref Code" on the Asset Register page
    Then the user should be able to view the grid field label "Asset Name" on the Asset Register page
    Then the user should be able to view the grid field label "Asset Class" on the Asset Register page
    Then the user should be able to view the grid field label "Asset Master Category" on the Asset Register page
    Then the user should be able to view the grid field label "Asset Category" on the Asset Register page
    Then the user should be able to view the grid field label "Asset Sub Category" on the Asset Register page
    Then the user should be able to view the grid field label "OEM" on the Asset Register page
    Then the user should be able to view the grid field label "Brand" on the Asset Register page
    Then the user should be able to view the grid field label "Model" on the Asset Register page
    Then the user should be able to view the grid field label "Serial No" on the Asset Register page
    Then the user should be able to view the grid field label "MFG. Year" on the Asset Register page
    Then the user should be able to view the grid field label "Location Level" on the Asset Register page
    Then the user should be able to view the grid field label "Property Code" on the Asset Register page
    Then the user should be able to view the grid field label "Property Name" on the Asset Register page
    Then the user should be able to view the grid field label "Zone Group Code" on the Asset Register page
    Then the user should be able to view the grid field label "Zone Group Name" on the Asset Register page
    Then the user should be able to view the grid field label "Zone Code" on the Asset Register page
    Then the user should be able to view the grid field label "Zone Name" on the Asset Register page
    Then the user should be able to view the grid field label "Sub Zone Code" on the Asset Register page
    Then the user should be able to view the grid field label "Sub Zone Name" on the Asset Register page
    Then the user should be able to view the grid field label "Base Unit Code" on the Asset Register page
    Then the user should be able to view the grid field label "Base Unit Name" on the Asset Register page
    Then the user should be able to view the grid field label "Sub Unit Code" on the Asset Register page
    Then the user should be able to view the grid field label "Sub Unit Name" on the Asset Register page
    Then the user should be able to view the grid field label "Asset Condition" on the Asset Register page
    Then the user should be able to view the grid field label "Functional Status" on the Asset Register page
    Then the user should be able to view the grid field label "Permit Required (Y/N)" on the Asset Register page
    Then the user should be able to view the grid field label "PPM Applicable (Y/N)" on the Asset Register page
    Then the user should be able to view the grid field label "Asset Criticality" on the Asset Register page
    Then the user should be able to view the grid field label "Warranty End Date" on the Asset Register page
    Then the user should be able to view the grid field label "Vendor" on the Asset Register page
    Then the user should be able to view the grid field label "PO Number" on the Asset Register page
    Then the user should be able to view the grid field label "PO Date" on the Asset Register page
    Then the user should be able to view the grid field label "Invoice No." on the Asset Register page
    Then the user should be able to view the grid field label "Invoice Date" on the Asset Register page
    Then the user should be able to view the grid field label "Delivery Date" on the Asset Register page
    Then the user should be able to view the grid field label "Commissioning Date" on the Asset Register page
    Then the user should be able to view the grid field label "Purchase Value" on the Asset Register page
    Then the user should be able to view the grid field label "Original Expected Life (Y)" on the Asset Register page
    Then the user should be able to view the grid field label "Asset Status" on the Asset Register page
    Then the user should be able to view the grid field label "Client Contract / Facility" on the Asset Register page

    # @AM5
# Scenario: AM5 - Validate the grid field value for "Asset Code"
#   Then the user should be able to view a value under the "Asset Code" field in the Asset List

# @AM7
# Scenario: AM7 - Validate the grid field value for "Tag Code"
#   Then the user should be able to view a value under the "Tag Code" field in the Asset List

# @AM9
# Scenario: AM9 - Validate the grid field value for "Third Party Code"
#   Then the user should be able to view a value under the "Third Party Code" field in the Asset List

# @AM11
# Scenario: AM11 - Validate the grid field value for "Asset Name"
#   Then the user should be able to view a value under the "Asset Name" field in the Asset List

# @AM13
# Scenario: AM13 - Validate the grid field value for "Asset Master Category"
#   Then the user should be able to view a value under the "Asset Master Category" field in the Asset List

# @AM15
# Scenario: AM15 - Validate the grid field value for "Asset Category"
#   Then the user should be able to view a value under the "Asset Category" field in the Asset List

# @AM17
# Scenario: AM17 - Validate the grid field value for "Asset Sub Category"
#   Then the user should be able to view a value under the "Asset Sub Category" field in the Asset List

# @AM19
# Scenario: AM19 - Validate the grid field value for "Zone Code"
#   Then the user should be able to view a value under the "Zone Code" field in the Asset List

# @AM21
# Scenario: AM21 - Validate the grid field value for "Zone"
#   Then the user should be able to view a value under the "Zone" field in the Asset List

# @AM23
# Scenario: AM23 - Validate the grid field value for "Sub Zone Code"
#   Then the user should be able to view a value under the "Sub Zone Code" field in the Asset List

# @AM25
# Scenario: AM25 - Validate the grid field value for "Sub Zone"
#   Then the user should be able to view a value under the "Sub Zone" field in the Asset List

# @AM27
# Scenario: AM27 - Validate the grid field value for "Base Unit Code"
#   Then the user should be able to view a value under the "Base Unit Code" field in the Asset List

# @AM29
# Scenario: AM29 - Validate the grid field value for "Base Unit"
#   Then the user should be able to view a value under the "Base Unit" field in the Asset List

# @AM31
# Scenario: AM31 - Validate the grid field value for "OEM"
#   Then the user should be able to view a value under the "OEM" field in the Asset List

# @AM33
# Scenario: AM33 - Validate the grid field value for "Brand"
#   Then the user should be able to view a value under the "Brand" field in the Asset List

# @AM35
# Scenario: AM35 - Validate the grid field value for "Model"
#   Then the user should be able to view a value under the "Model" field in the Asset List

# @AM37
# Scenario: AM37 - Validate the grid field value for "Serial No"
#   Then the user should be able to view a value under the "Serial No" field in the Asset List

# @AM39
# Scenario: AM39 - Validate the grid field value for "MFG.Year"
#   Then the user should be able to view a value under the "MFG.Year" field in the Asset List