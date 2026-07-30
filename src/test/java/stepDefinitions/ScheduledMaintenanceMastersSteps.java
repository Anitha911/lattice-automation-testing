package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ScheduledMaintenanceMasterspage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import utils.HelperUtils;

import java.io.IOException;

public class ScheduledMaintenanceMastersSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    ScheduledMaintenanceMasterspage tmp = new ScheduledMaintenanceMasterspage(driver);
    HelperUtils helperUtils = new HelperUtils(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    public static String Task_Frequency_Code_Master_Scheduled_Maintenance;
    public static String Task_Frequency_Name_Master_Scheduled_Maintenance;
    public static String Frequency_Period_Master_Scheduled_Maintenance;
    public static String First_Run_Period_Master_Scheduled_Maintenance;
    public static String Update_Task_Frequency_Name_Master_Scheduled_Maintenance;
    public static String Parameter_Master_ScheduledMaintenance;
    public static String Update_parameter_Master_ScheduledMaintenance;

//    Task Frequency - Add

    @Then("User fills the Task Frequency details")
    public void UserfillstheTaskFrequencydetails() {
        Task_Frequency_Code_Master_Scheduled_Maintenance = dataGen.generateTask_Frequency_Code_Master_Scheduled_Maintenance();
        tmp.enterMasterTaskFrequencyCode(Task_Frequency_Code_Master_Scheduled_Maintenance);
        Task_Frequency_Name_Master_Scheduled_Maintenance = dataGen.generateTask_Frequency_Name_Master_Scheduled_Maintenance();
        tmp.enterMasterTaskFrequencyName(Task_Frequency_Name_Master_Scheduled_Maintenance);
        Frequency_Period_Master_Scheduled_Maintenance = String.valueOf(dataGen.generateFrequency_Period_Master_Scheduled_Maintenance());
        tmp.enterMasterFrequencyPeriod(Frequency_Period_Master_Scheduled_Maintenance);
        tmp.selectMasterFrequencyUnit();
        First_Run_Period_Master_Scheduled_Maintenance = String.valueOf(dataGen.generateFirst_Run_Period_Master_Scheduled_Maintenance());
        tmp.enterMasterFirstRunPeriod(First_Run_Period_Master_Scheduled_Maintenance);
    }
//    Task Frequency - Verify -Add

    @And("User verify if the Task Frequency is created")
    public void User_verify_created_Task_Frequency() {
        tmp.VerifycreatedTaskFrequencyName(Task_Frequency_Name_Master_Scheduled_Maintenance);
    }

//   Task Frequency - Update

    @Then("User clicks on first available Task Frequency to edit")
    public void user_clicks_on_first_available_Task_Frequency_to_edit() {
        tmp.clickTaskFrequencyNametoEdit();
    }

    @And("User updates the Task Frequency details")
    public void user_Updates_Task_Frequency_details() throws IOException {
        Update_Task_Frequency_Name_Master_Scheduled_Maintenance  = dataGen.generateTask_Frequency_Name_Master_Scheduled_Maintenance();
        tmp.updateTaskFrequencyName (Update_Task_Frequency_Name_Master_Scheduled_Maintenance);
    }

    @Then("User verify if the Task Frequency is updated")
    public void user_verify_the_success_message_after_updating_Task_Frequency () {
        tmp.verifyUpdateTaskFrequencyName (Update_Task_Frequency_Name_Master_Scheduled_Maintenance);
    }

//  Task Frequency - Delete

    @Then("User clicks on first available Task Frequency to delete")
    public void user_clicks_on_first_available_Task_Frequency_to_delete() {
        tmp.clickTaskFrequencyToDelete();
    }

//   Parameter Response Values - Add

    @Then("User move to Parameter Response Values section")
    public void userMoveToParameterResponseValuesSection() {
        tmp.moveToParameterResponseValuesSection();
    }

    @Then("User fills the Parameter Response Values details")
    public void UserfillstheParameterResponseValuesdetails() {
        Parameter_Master_ScheduledMaintenance = dataGen.generateParameter_Master_ScheduledMaintenance();
        tmp.enterParameterResponseValuesdetails(Parameter_Master_ScheduledMaintenance);  }

    @And("User clicks on Scheduled Maintenance Save button")
    public void User_clicks_on_button_Scheduled_Maintenance_save() {
        tmp.clickScheduledMaintenanceSaveButton();
    }

    @And("User verify if the Parameter Response Value is created")
    public void User_verify_created_Parameter_Response_Value() {
        tmp.VerifycreatedParameterResponseValue(Parameter_Master_ScheduledMaintenance);
    }


//    Parameter Response Values - Update

    @Then("User clicks on first available Parameter Response Value to edit")
    public void user_clicks_on_first_available_Parameter_Response_Value_to_edit() {
        tmp.clickParameterResponseValuetoEdit();
    }

    @And("User updates the Parameter Response Value details")
    public void user_Updates_Parameter_Response_Value_details() throws IOException {
        Update_parameter_Master_ScheduledMaintenance  = dataGen.generateParameter_Master_ScheduledMaintenance();
        tmp.updateParameterResponseValue (Update_parameter_Master_ScheduledMaintenance);
    }

    @Then("User verify if the Parameter Response Value is updated")
    public void user_verify_the_success_message_after_updating_Parameter_Response_Value () {
        tmp.verifyUpdateParameterResponseValue (Update_parameter_Master_ScheduledMaintenance);
    }


//    Parameter Response Values - Delete
    @Then("User clicks on first available Parameter Response Value to delete")
    public void user_clicks_on_first_available_Parameter_Response_Value_to_delete() {
        tmp.clickParameterResponseValueToDelete();
    }

//    Export to Excel
    @Then("User click on the Master Scheduled Maintenance Export to Excel button")
    public void user_clicks_on_Master_ScheduledMaintenance_Export_to_Excel_button() {
        tmp.MasterScheduledMaintenanceExporttoExcel();
    }

//    ValidationTaskFrequency
     @Then("User verify the inline error message {string} on Task Frequency Code")
    public void user_verify_inline_error_message_on_Task_Frequency_Code(String expectedMessage) {
        System.out.println("Verifying inline error message for Task Frequency Code. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPPM_C_rfvMarkingChar");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Task Frequency Name")
    public void user_verify_inline_error_message_on_Task_Frequency_Name(String expectedMessage) {
        System.out.println("Verifying inline error message for Task Frequency Name. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPPM_C_rfvFreqName");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Frequency Period")
    public void user_verify_inline_error_message_on_Frequency_Period(String expectedMessage) {
        System.out.println("Verifying inline error message for Frequency Period. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPPM_C_RequiredFieldValidator3");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Frequency Unit")
    public void user_verify_inline_error_message_on_Frequency_Unit(String expectedMessage) {
        System.out.println("Verifying inline error message for Frequency Unit. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPPM_C_rfvFreqUnit");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on First Run Period")
    public void user_verify_inline_error_message_on_First_Run_Period(String expectedMessage) {
        System.out.println("Verifying inline error message for First Run Period. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPPM_C_rfvFirstRun");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Task Frequency Code")
    public void user_verify_chars_len_Task_Frequency_Code(int minLen, int maxLen) {
        System.out.println("Verifying Task Frequency Code field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtMarkingChar"),maxLen, minLen);
        System.out.println("Task Frequency Code field length validation verified successfully.");
    }

    @When("User verify the chars min len as {int} and max len as {int} for Task Frequency Name")
    public void user_verify_chars_len_Task_Frequency_Name(int minLen, int maxLen) {
        System.out.println("Verifying Task Frequency Name field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtFreqName"),maxLen, minLen);
        System.out.println("Task Frequency Name field length validation verified successfully.");
    }

//    ValidationParameterResponseValue
    @Then("User verify the inline error message {string} on Parameter")
    public void user_verify_inline_error_message_on_Parameter(String expectedMessage) {
        System.out.println("Verifying inline error message for Parameter. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinParameterResVal_C_RequiredFieldValidator4");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Parameter")
    public void user_verify_chars_len_Parameter(int minLen, int maxLen) {
        System.out.println("Verifying Parameter field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtParameter"),maxLen, minLen);
        System.out.println("Parameter field length validation verified successfully.");
    }

    @When("User enters special characters in Parameter")
    public void enter_SpecialCharactersInParameter() {
        System.out.println("Verifying Parameter field accepts/rejects special characters");
        helperUtils.verifySpecialCharactersNotAllowed(By.id("radtxtParameter"));
        System.out.println("Special character validation completed for Parameter");
    }

}
