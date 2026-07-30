@AssetManagementTransaction
Feature: Asset Management Transaction Module Automation

  @CreateAsset
  Scenario: Should be able to create a new Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the Add Asset button
    Then User waits for 10 seconds
    Then User store the Asset Code in the Add Asset form
    Then User waits for 10 seconds
    Then User fill the Asset Details
    Then User waits for 20 seconds
    Then User click on Add Asset Save button
    Then User waits for 30 seconds
    Then User searches using stored asset code
    Then User waits for 20 seconds
    Then User verifies asset is created
    Then User waits for 30 seconds

    @AssetApprovalFlow
    Scenario: Should be able to Approve the Asset

      Given User navigates to 'lattice.url' page
      Then User is at home screen after login with "username" and "password"
      Then User clicks on 'Asset Management' in navigation panel
      Then User waits for 10 seconds
      Then User click on the first Asset record
      Then User waits for 30 seconds
      When User switches to new tab
      Then User clicks the Asset "Contract Group" menu in the left pane of Asset Detail page
      Then User link the Contract Group
      Then User waits for 30 seconds
      Then User click on the Finalised button
      Then User waits for 30 seconds

  @AssetTransfer
  Scenario: Should be able to Transfer the Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User click the "Asset Transfer" button in the Asset Detail page
    Then User waits for 20 seconds
    Then User fill the Asset Transfer details
    Then User waits for 30 seconds
    Then User click the Send for Approval button in the Asset transfer pop up
    Then User waits for 20 seconds


  @AssetAssignOwner
  Scenario: Should be able to Assign the Asset to Owner

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User click the "Assign Owner" button in the Asset Detail page
    Then User waits for 20 seconds
    Then User select any Owner in the Asset Owner pop up
    Then User waits for 20 seconds
    Then User click the Assign Owner save button
    Then User waits for 20 seconds

  @AssetPPMApplicabilityChange
  Scenario: Should be able to Change the PPM Applicability to Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User click the "PPM Applicability Change" button in the Asset Detail page
    Then User waits for 20 seconds
    Then User fill the details in the PPM Applicability Change pop up
    Then User click the PPM Applicability Change save button
    Then User waits for 30 seconds
    Then User click the PPM Applicability Confirm button in the warning pop up
    Then User waits for 20 seconds

  @AssetClassificationChange
  Scenario: Should be able to Change the Classification to Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User click the "Asset Classification Change" button in the Asset Detail page
    Then User waits for 20 seconds
    Then User click the Yes button in the Classification pop up
    Then User waits for 30 seconds

  @CloneAsset
  Scenario: Should be able to Clone the Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User click the "Clone Asset" button in the Asset Detail page
    Then User waits for 10 seconds
    Then User click the ok button in the clone pop up
    Then User waits for 20 seconds



  @CommercialDetailsAsset
  Scenario: Should be able to add the Commercial Details to the Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 20 seconds
    When User switches to new tab
    Then User waits for 20 seconds
    Then User click the Modify Commercials button
    Then User waits for 20 seconds
    Then User fill the details in the MODIFY COMMERCIALS pop up
    Then User waits for 20 seconds
    Then User click the save button in the MODIFY COMMERCIALS pop up
    Then User waits for 20 seconds

  @AssetrelatedContacts
  Scenario: Should be able to add Asset Contacts

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User clicks the Asset "Asset Contacts" menu in the left pane of Asset Detail page
    Then User click the Asset Link Contact button
    Then User waits for 20 seconds
    Then User fill the details in the Asset Contact pop up
    Then User waits for 20 seconds
    Then User click the select button in the Asset Contact pop up
    Then User waits for 20 seconds



  @Attachments
  Scenario: Should be able to add Attachment

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User clicks the Asset "Attachments" menu in the left pane of Asset Detail page
    Then User click the Asset Add Attachment button
    Then User waits for 20 seconds
    Then User fill the details in the Asset Attachments pop up
    Then User waits for 20 seconds
    Then User click the save button in the Asset Attachment pop up
    Then User waits for 20 seconds

  @NotifyingUsers
  Scenario: Should be able to add Notifying Users

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User clicks the Asset "Notifying Users" menu in the left pane of Asset Detail page
    Then User click the Add Asset Notifying Users button
    Then User waits for 20 seconds
    Then User fill the details in the Asset Notifying Users pop up
    Then User waits for 20 seconds
    Then User click the save button in the Asset Notifying Users pop up
    Then User waits for 20 seconds

  @AssetNotes
  Scenario: Should be able to add Notes

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User clicks the Asset "Notes" menu in the left pane of Asset Detail page
    Then User click the Asset Add Notes button
    Then User waits for 20 seconds
    Then User fill the details in the Asset Notes pop up
    Then User waits for 20 seconds
    Then User click the save button in the Asset Notes pop up
    Then User waits for 20 seconds

  @MeteringParameters
  Scenario: Should be able to link Metering Parameter to the Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User clicks the Asset "Metering Parameters" menu in the left pane of Asset Detail page
    Then User click the Asset Add Metering Parameter button
    Then User waits for 20 seconds
    Then User fill the details in the Asset Metering Parameter pop up
    Then User waits for 30 seconds
    Then User click the save button in the Asset Metering Parameter pop up
    Then User waits for 20 seconds

  @Triggers
  Scenario: Should be able to add Trigger to the Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User clicks the Asset "Triggers" menu in the left pane of Asset Detail page
    Then User click the Asset Add Trigger button
    Then User waits for 20 seconds
    Then User fill the details in the Asset Trigger pop up
    Then User waits for 30 seconds
    Then User click the save button in the Asset Trigger pop up
    Then User waits for 20 seconds

  @Schedules
  Scenario: Should be able to link PPM/SS Schedules to the Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User clicks the Asset "Schedules" menu in the left pane of Asset Detail page
    Then User click the Asset Add Schedule button
    Then User waits for 20 seconds
    Then User fill the details in the Asset Schedule pop up
    Then User waits for 40 seconds
    Then User click the save button in the Asset Schedule pop up
    Then User waits for 20 seconds


  @ConditionalPictures
  Scenario: Should be able to Update the Conditional Pictures

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User clicks the Asset "Conditional Pictures" menu in the left pane of Asset Detail page
    Then User click the Add Conditional Picture button
    Then User waits for 20 seconds
    Then User fill the details in the Conditional Pictures pop up
    Then User waits for 20 seconds
    Then User click the save button in the Condition Picture pop up
    Then User waits for 20 seconds

    @ConditionUpdateAsset
  Scenario: Should be able to Update the Condition of the Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User click the Condition Update section in the Asset Detail page
    Then User fill the details in the Condition Update pop up
    Then User waits for 20 seconds
    Then User click the save button in the Condition Update pop up
    Then User waits for 20 seconds

  @FunctionalUpdateAsset
  Scenario: Should be able to Update the Function of the Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 10 seconds
    Then User click the Functional Update section in the Asset Detail page
    Then User fill the details in the Functional Update pop up
    Then User waits for 20 seconds
    Then User click the save button in the Functional Update pop up
    Then User waits for 20 seconds

  @UnscheduledAssets
  Scenario: Should be able to verify the Asset is appears in Unscheduled Assets when no work orders exist

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User get the Asset Code
    Then User waits for 30 seconds
    Then User verifies work order counts

    Then User switches back to incident list tab
    Then User clicks on hamburger icon
    Then User waits for 10 seconds

    Then User click on the "Unscheduled Assets" title
    Then User verifies asset is present in Unscheduled Assets

# Asset Inventory - Create
  @CreateAssetInventory
  Scenario: Should be able to create a new Asset Inventory

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User clicks on hamburger icon
    Then User waits for 10 seconds
    Then User click on the "Asset Inventory" title
    Then User clicks on the Add Asset Inventory button
    Then User waits for 20 seconds
    Then User fill the Asset Inventory details
    Then User waits for 10 seconds
   Then User click the Asset Inventory Save button
    Then User waits for 30 seconds

# Alert Code Setup - Create
  @AlertCodeSetup-Create
  Scenario: Should be able to create Alert Code Setup
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User click on the "Alert Code Setup" title
    Then User waits for 10 seconds
    Then User clicks on the Add Alert Code Setup button

    Then User fill the Alert Code Setup details
    Then User waits for 20 seconds
    Then User click the Alert Code Setup Save button
    Then User waits for 30 seconds

#  Alert Code - Verify
    Then User verify if the Asset Alert Code is created
    Then User waits for 30 seconds

 #  Alert Code - Delete

  @AlertCodeSetup-Delete
  Scenario: Should be able to delete Alert Code Setup

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User click on the "Alert Code Setup" title
    Then User waits for 10 seconds
    Then User click on the first Alert Code Setup record to delete
    Then User waits for 30 seconds

  @DecommissionedAssets
  Scenario: Should be able to verify the asset is decommissioned and moved to the Decommissioned Assets grid list

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then User click on the first Asset record
    Then User waits for 30 seconds
    When User switches to new tab
    Then User get the Asset Code
    Then User waits for 30 seconds

    Then User click the "Decommission" button in the Asset Detail page
    Then User waits for 20 seconds
    Then User fill the Decommission field details
    Then User waits for 20 seconds
    Then User update the Decommission Photo
    Then User waits for 20 seconds

    Then User click on the Request Sent For Approval Button
    Then User waits for 20 seconds

    # Verification
    Then User switches back to incident list tab
    Then User waits for 20 seconds
    Then User clicks on hamburger icon
    Then User waits for 10 seconds
    Then User click on the "Decommissioned Assets" title
    Then User verifies the asset is present in Decommissioned Asset grid list

  @ExportToExcel_Asset
  Scenario: Should be able to download Asset file
    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Asset Management' in navigation panel
    Then User waits for 10 seconds
    Then user click on the Asset Export to Excel button
    Then User clicks on hamburger icon
    Then User click on the "Asset Inventory" title
    Then User waits for 10 seconds
    Then user click on the Asset Export to Excel button
    Then User waits for 30 seconds
    Then User click on the "Unscheduled Assets" title
    Then user click on the Asset Export to Excel button
    Then User waits for 30 seconds
    Then User clicks on hamburger icon
    Then User click on the 'Alert Code Setup' title
    Then user click on the Asset Export to Excel button
    Then User waits for 30 seconds
    Then User click on the 'Decommissioned Assets' title
    Then user click on the Asset Export to Excel button
    Then User waits for 30 seconds


