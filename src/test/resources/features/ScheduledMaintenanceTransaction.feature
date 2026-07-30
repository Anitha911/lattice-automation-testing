@ScheduledMaintenanceTransaction
Feature: Scheduled Maintenance Transaction Module Automation

  @CreateSSTaskSheets
  Scenario: Should be able to create a new SS Task Sheets

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "SS Task Sheet" in the Scheduled Maintenance section
    Then User clicks on the Add Task Sheet button
    Then User waits for 20 seconds
    Then User select SS Task Sheet type and enter Name
    Then User fill the Task Sheet details
    Then User waits for 10 seconds
    Then User click the Task Sheet Save button
    Then User waits for 20 seconds
    Then User capture the saved Task Sheet Number
    Then User waits for 30 seconds


  @CreatePPMTaskSheets
  Scenario: Should be able to create a new PPM Task Sheets

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "PPM Task Sheet" in the Scheduled Maintenance section
    Then User clicks on the Add Task Sheet button
    Then User waits for 20 seconds
    Then User select PPM Task Sheet type and enter Name
    Then User fill the Task Sheet details
    Then User waits for 30 seconds
    Then User click the Task Sheet Save button
    Then User waits for 30 seconds
    Then User capture the saved Task Sheet Number
    Then User waits for 20 seconds

  @SSCreateTaskHeaderAndTaskLines
  Scenario: Should be able to Create the SS Task Header and Task Lines

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "SS Task Sheet" in the Scheduled Maintenance section
    Then User click on the first record in the Task Sheet grid list
    Then User waits for 20 seconds
    Then User waits for 20 seconds
    Then User click on the Task Detail Section
    Then User fill the Task Header Details
    Then User waits for 20 seconds
    Then User fill the Task Line Details
    Then User waits for 20 seconds
    Then User click on the Task Sheet Finalised button
    Then User click on the Task Sheet Verification Submit button
    Then User waits for 20 seconds

  @PPMCreateTaskHeaderAndTaskLines
  Scenario: Should be able to Create the PPM Task Header and Task Lines

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "PPM Task Sheet" in the Scheduled Maintenance section
    Then User click on the first record in the Task Sheet grid list
    Then User waits for 20 seconds
    Then User click on the Task Detail Section
    Then User fill the Task Header Details
    Then User waits for 20 seconds
    Then User fill the Task Line Details
    Then User waits for 20 seconds
    Then User click on the Task Sheet Finalised button
    Then User click on the Task Sheet Verification Submit button
    Then User waits for 20 seconds


  @TaskSheetApprovalFlow
  Scenario: Should be able to Approve the Task Sheets

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "Awaiting Approval Tasksheet" in the Scheduled Maintenance section
    Then User click on the first record in the Task Sheet grid list
    Then User waits for 20 seconds
    When User switches to new tab
    Then User capture the saved Task Sheet Number
    Then User click the TasK Sheet Approve button
    Then User fill the TasK Sheet Approval pop up details
    Then User waits for 20 seconds

  @LinkTaskSheetsToContractGroup
  Scenario: Should be able to link the Task Sheet to Contract Group

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Property & Contract Management' in navigation panel
    Then User waits for 10 seconds
    Then User Search a Contract Code in the Client Contract grid list
    Then User waits for 10 seconds
    Then User Click on the Client Contract Group
    Then User waits for 30 seconds
    When User switches to new tab
    Then User waits for 30 seconds
    Then User link the stored Task Sheet to Contract Group
    Then User waits for 30 seconds

  @PPM/SCMScheduling
  Scenario: Should be able to Schedule the PPM/SCM Assets

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "PPM Schedule" in the Scheduled Maintenance section
    Then User waits for 20 seconds
    Then User Search a Contract Code in the Scheduling grid list
    Then User waits for 10 seconds
    Then User Click on the Client Contract in the Scheduling grid list
    Then User waits for 10 seconds
    Then User search the capture Task Sheet Number in the Contract Details grid list
    Then User waits for 10 seconds
    Then User Schedule the Assets for PPM Scheduling
    Then User waits for 20 seconds
    Then User click on the Save button in the PPM Scheduling pop up
    Then User waits for 30 seconds


  @SSScheduling
  Scenario: Should be able to Schedule the SS Assets

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "SS Schedule" in the Scheduled Maintenance section
    Then User waits for 20 seconds
    Then User Search a Contract Code in the Scheduling grid list
    Then User waits for 10 seconds
    Then User Click on the Client Contract in the Scheduling grid list
    Then User waits for 10 seconds
    Then User search the capture Task Sheet Number in the Contract Details grid list
    Then User waits for 10 seconds
    Then User Schedule the Assets for SS Scheduling
    Then User waits for 20 seconds
    Then User click on the Save button in the SS Scheduling pop up
    Then User waits for 30 seconds

  @PPM/SCMActivation
  Scenario: Should be able to activate the PPM/SCM Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "PPM Schedules" in the Scheduled Maintenance section
    Then User waits for 20 seconds
    Then User capture the Schedule No for the first asset
    Then User select the Asset to activate the Schedule
    Then User waits for 20 seconds
    Then User click on the Activate Schedule button
    Then User waits for 20 seconds

  @SSActivation
  Scenario: Should be able to activate the SS Asset

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "SS Schedules" in the Scheduled Maintenance section
    Then User waits for 20 seconds
    Then User capture the Schedule No for the first asset
    Then User select the Asset to activate the Schedule
    Then User waits for 20 seconds
    Then User click on the Activate Schedule button
    Then User waits for 20 seconds

  @PPMConsoleWindow
  Scenario: Should be able to view and access PPM Work Order functionalities

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 20 seconds
    Then User searches the captured Schedule Number
    Then User waits for 30 seconds
    Then User double clicks the captured Schedule Number record
    Then User waits for 40 seconds

  @SSConsoleWindow
  Scenario: Should be able to view and access SS Work Order functionalities

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 20 seconds
    Then User clicks on hamburger icon
    Then User click "Console Window" Routine WO
    Then User waits for 20 seconds
    Then User searches the captured Schedule Number
    Then User waits for 30 seconds
    Then User double clicks the captured Schedule Number record
    Then User waits for 40 seconds


  @ExportToExcelPPM
  Scenario: Should be able to download the PPM files

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "PPM Task Sheet" in the Scheduled Maintenance section
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User click on the "PPM Schedule" in the Scheduled Maintenance section
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User click on the "PPM Schedules" in the Scheduled Maintenance section
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User click "Console Window" Preventive WO
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User clicks on hamburger icon
    Then User click "My Pending Actions" Preventive WO
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User clicks on hamburger icon
    Then User click "Bulk Assignments" Preventive WO
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User click "Archives" Preventive WO
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds


  @ExportToExcelSS
  Scenario: Should be able to download the SS files

    Given User navigates to 'lattice.url' page
    Then User is at home screen after login with "username" and "password"
    Then User clicks on 'Scheduled Maintenance' in navigation panel
    Then User waits for 10 seconds
    Then User clicks on hamburger icon
    Then User waits for 20 seconds
    Then User click on the "SS Task Sheet" in the Scheduled Maintenance section
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User click on the "SS Schedule" in the Scheduled Maintenance section
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User click on the "SS Schedules" in the Scheduled Maintenance section
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User click "Console Window" Routine WO
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User clicks on hamburger icon
    Then User click "My Pending Actions" Routine WO
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User clicks on hamburger icon
    Then User click "Bulk Assignments" Routine WO
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds
    Then User click "Archives" Routine WO
    Then User click on the Scheduled Maintenance Export To Excel button
    Then User waits for 20 seconds