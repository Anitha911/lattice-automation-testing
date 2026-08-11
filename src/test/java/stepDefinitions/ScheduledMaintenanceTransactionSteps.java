package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.ScheduledMaintenanceTransactionPage;
import utils.DriverFactory;
import utils.TestDataGenerator;

public class ScheduledMaintenanceTransactionSteps {

    private final WebDriver driver = DriverFactory.getDriver();
    ScheduledMaintenanceTransactionPage tmp = new ScheduledMaintenanceTransactionPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    public static String SS_Task_Sheet_Type;
    public static String SS_Task_Sheet_Name;
    public static String PPM_Task_Sheet_Type;
    public static String PPM_Task_Sheet_Name;
    public static String Task_Sheet_Contract_Group;
    public static String Task_Sheet_Service_Group;
    public static String Task_Header_Name;
    public static String Task_Line_Description;
    public static String Task_Sheet_Approval_Comments;
    public static String Task_Sheet_Number;

    @Then("User click on the {string} in the Scheduled Maintenance section")
    public void userclickonScheduledMaintenanceTitle(String ScheduledMaintenanceTitle) {
        tmp.userclickonScheduledMaintenanceTitle(ScheduledMaintenanceTitle);
    }

    @Then("User click {string} Preventive WO")
    public void userClickPreventiveWO(String sectionName) {
        tmp.clickPreventiveWO(sectionName);
    }

    @Then("User click {string} Routine WO")
    public void userClickRoutineWO(String sectionName) {
        tmp.clickRoutineWO(sectionName);
    }

   @Then("User clicks on the Add Task Sheet button")
    public void userclickonAddTaskSheetbutton() {
        tmp.userclickonAddTaskSheetbutton();
     }

    @Then("User select SS Task Sheet type and enter Name")
    public void UserselectSSTaskSheetTypeandEnterName () {
        SS_Task_Sheet_Type = dataGen.generateSS_Task_Sheet_Type();
        tmp.select_SS_Task_Sheet_Type(SS_Task_Sheet_Type);
        SS_Task_Sheet_Name = dataGen.generateSS_Task_Sheet_Name();
        tmp.enter_SS_Task_Sheet_Name(SS_Task_Sheet_Name);
    }

    @Then("User select PPM Task Sheet type and enter Name")
    public void UserselectPPMTaskSheetTypeandEnterName () {
        PPM_Task_Sheet_Type = dataGen.generatePPM_Task_Sheet_Type();
        tmp.select_PPM_Task_Sheet_Type(PPM_Task_Sheet_Type);
        PPM_Task_Sheet_Name = dataGen.generatePPM_Task_Sheet_Name();
        tmp.enter_PPM_Task_Sheet_Name(PPM_Task_Sheet_Name);
    }

    @Then("User fill the Task Sheet details")
    public void UserfillTaskSheetdetail() {
            Task_Sheet_Contract_Group = dataGen.generateTask_Sheet_Contract_Group();
            tmp.selectTask_Sheet_Contract_Group(Task_Sheet_Contract_Group);
            Task_Sheet_Service_Group = dataGen.generateTask_Sheet_Service_Group();
            tmp.selectTask_Sheet_Service_Group(Task_Sheet_Service_Group);
            tmp.selectTask_Sheet_Asset_Class();
            tmp.selectTask_Sheet_Asset_Master_Category();
            tmp.selectTask_Sheet_Asset_Category();
            tmp.selectTask_Sheet_Asset_Sub_Category();
        }

    @Then("User click the Task Sheet Save button")
        public void UserclickTaskSheetSavebutton () {
            tmp.UserclickTaskSheetSavebutton();
        }

    @Then("User capture the saved Task Sheet Number")
    public void userCaptureTheSavedTaskSheetNumber() {
        tmp.captureSavedTaskSheetNumber();
    }

// Creation of TasK Header and Task Lines

    @Then("User click on the first record in the Task Sheet grid list")
    public void UserclickfirstrecordintheTaskSheetgridlist () {
        tmp.UserclickfirstrecordTaskSheetgridlist();
    }

      @Then("User click on the Task Detail Section")
    public void UserclickTaskDetailsection () {
        tmp.UserclickTaskDetailsection();
    }

    @Then("User fill the Task Header Details")
    public void UserfillTaskHeaderDetail () {
        tmp.UserclickAddTaskHeader();
        Task_Header_Name = dataGen.generateTask_Header_Name();
        tmp.UserenterTaskHeaderName(Task_Header_Name);
        tmp.UserclickTaskHeadersavebutton();
    }

   @Then("User fill the Task Line Details")
   public void UserfillTaskLineDetail () {
            tmp.UserclickAddTaskLine();
            tmp.UserselectRandomTaskHeader();
            tmp.UserselectRandomTaskLineFrequency();
            tmp.UserselectTaskTypeAndDependentFields();
            Task_Line_Description = dataGen.generateTask_Line_Description();
            tmp.UserenterTask_Line_Description(Task_Line_Description);
            tmp.UserclickTaskLinesavebutton();
           }

    @Then("User click on the Task Sheet Finalised button")
    public void UserclickTaskSheetFinalisedbutton() {
        tmp.UserclickTaskSheetFinalisedbutton();
    }

    @Then("User click on the Task Sheet Verification Submit button")
    public void UserclickTaskSheetVerificationSubmitbutton() {
        tmp.UserclickTaskSheetVerificationSubmitbutton();
    }


//Task Sheet Approval Flow

    @Then("User click the TasK Sheet Approve button")
    public void UserclickTaskSheetApprovebutton() {
        tmp.UserclickTaskSheetApprovebutton();
    }


    @Then("User fill the TasK Sheet Approval pop up details")
    public void UserfillTaskSheetApprovalpopupDetails() {
        Task_Sheet_Approval_Comments = dataGen.generateTask_Sheet_Approval_Comments();
        tmp.UserenterTask_Sheet_Approval_Comments(Task_Sheet_Approval_Comments);
        tmp.UserclickTaskSheetApprovalSavebutton();
    }


    // Link Task Sheets to Contract Group

    @Then("User Search a Contract Code in the Client Contract grid list")
    public void UserSearchContractCodeClientContractgridlist() {
        tmp.UserSearchContractCodeClientContractgridlist();
    }

    @Then("User Click on the Client Contract Group")
    public void UserClickonClientContractGroup() {
        tmp.UserclickonClientContractGroup();
    }

    @Then("User link the stored Task Sheet to Contract Group")
    public void userLinkTheStoredTaskSheetToContractGroup(){
         tmp.linkStoredTaskSheetToContractGroup();
    }


    // PPM / SCM Scheduling

    @Then("User Search a Contract Code in the Scheduling grid list")
    public void UserSearchContractCodeSchedulinggridlist() {
        tmp.UserSearchContractCodeSchedulinggridlist();
    }

    @Then("User Click on the Client Contract in the Scheduling grid list")
    public void UserclickonClientContractPPMSchedulinggridlist() {
        tmp.UserclickonClientContractSchedulinggridlist();
    }

    @Then("User search the capture Task Sheet Number in the Contract Details grid list")
    public void UsersearchcaptureTaskSheetNumber() {
        tmp.UsersearchcaptureTaskSheetNumberContractDetailsgridList();
        tmp.UserclickSchedulebuttontoScheduleAssets();
    }

    @Then("User Schedule the Assets for PPM Scheduling")
    public void UserScheduletheAssetsforPPMScheduling() {
                tmp.scheduleAssetsForPPM();
    }

    @Then("User click on the Save button in the PPM Scheduling pop up")
    public void UserClickSaveinthePPMSchedulingpopup() {
        tmp.UserClickSaveinthePPMSchedulingpopup();
    }


    // SS Scheduling

    @Then("User Schedule the Assets for SS Scheduling")
    public void UserScheduletheAssetsForTheSSScheduling() {
        tmp.scheduleAssetsForSS();
    }

    @Then("User click on the Save button in the SS Scheduling pop up")
    public void UserClickSaveinSSSchedulingpopup() {
        tmp.UserClickSaveinSSSchedulingpopup();
    }

   // PPM/SCM Asset Activation

    @Then("User capture the Schedule No for the first asset")
    public void Usercapturetheschedulenoforthefirstasset() {
        tmp.captureFirstScheduleNo();
    }

    @Then("User select the Asset to activate the Schedule")
    public void UserselectAssettoactivateSchedule() {
        tmp.UserselectAssettoactivateSchedule();
    }

    @Then("User click on the Activate Schedule button")
    public void UserclickonActivateSchedulebutton() {
        tmp.UserclickonActivateSchedulebutton();
    }

//    PPMConsoleWindow

    @Then("User searches the captured Schedule Number")
    public void UserSearchCapturedScheduleNumber() {
        tmp.searchCapturedScheduleNo();
    }

    @Then("User double clicks the captured Schedule Number record")
    public void userDoubleClicksTheCapturedScheduleNumberRecord() {
        tmp.doubleClickCapturedScheduleRecord();
    }


    //    Export To Excel

    @Then("User click on the Scheduled Maintenance Export To Excel button")
    public void userClicksOnExportToExcelButton() {
        tmp.clickonScheduledMaintenanceExportToExcelButton();
    }

   }