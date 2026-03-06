package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.GuardMasterPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;

public class GuardMasterSteps {
    public static String generatePatrolMode;
    public static String generatePatrolShiftName;
    private final WebDriver driver = DriverFactory.getDriver();
    GuardMasterPage tmp = new GuardMasterPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();
    HelperUtils helperUtils = new HelperUtils(driver);


    @Then("User waits {int} seconds")
    public void user_waits_seconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
            System.out.println("Waited for " + seconds + " seconds.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Wait interrupted: " + e.getMessage());
        }
    }

    @Then("User clicks on {string} in side menu")
    public void user_click_on_DataConfig(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//a[contains(@class,'nav-link active') and @id='10']";
        String id = "10";

        tmp.clickOnDataConfiguration(id);
    }

    @Then("User clicks on the guard optional {string} tab")
    public void user_click_on_GuardOptional(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//*[@id='tab-datasetup']/div[2]/div/ul[3]/li[3]/a";
        tmp.clickOnGuardOptional(xpath);
    }

    @Then("User clicks on button patrol add {string}")
    public void user_click_on_AddPatrolMode(String btnAddPatrolMode) throws InterruptedException {
        tmp.clickOnAddPatrolMode(btnAddPatrolMode);
    }

    @Then("User fills up the {string} Patrol mode details")
    public void user_fill_up_the_patrol_mode_details(String type) throws IOException {
         generatePatrolMode = dataGen.generatePatrolMode();
        tmp.enterPatrolMode(generatePatrolMode);
    }

    @Then("User clicks on Patrol Mode save button")
    public void userClicksOnPatrolModeSaveButton() {
        tmp.userClicksOnPatrolModeSaveButton();
    }

    @Then("User verify if the Patrol Mode is created")
    public void user_verify_the_success_message_after_creating_patrolMode() {
        tmp.verifyPatrolModecreation(generatePatrolMode);
    }
    @Then("User clicks on first Valid Patrol Mode to delete")
    public void user_clicks_on_first_active_patrol_mode_to_delete() {
        tmp.clickActiveModetoDelete();
    }

    @Then("User verify if the Mode is deleted")
    public void user_Verify_first_active_patrol_mode_to_delete() {
        tmp.verifyPatrolModeDelete(generatePatrolMode);
    }

    @Then("User clicks on active Patrol mode in the grid")
    public void user_clicks_on_first_active_patrol_mode_to_edit() {
        tmp.clickActiveModetoEdit();
    }

    @Then ("User clicks on Mode Export to Excel button")
    public void user_clicks_on_mode_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.ModeclickExportToExcel(xpath);
    }
//guard shift
    @Then ("User clicks on the {string} in side menu")
    public void user_click_on_Guardshift(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div[1]/div/div/div[1]/div/div/div/a[2]";
        tmp.clickOnGuardShift(xpath);
    }
    @Then("User clicks on button shifts add {string}")
    public void GuardshiftAdd(String btnAddPatrolShift) throws InterruptedException {
        tmp.GuardshiftAdd(btnAddPatrolShift);
    }
    @Then("User fills up the {string} Patrol Shift details")
    public void user_fill_up_the_patrol_shift_details(String shift) throws IOException {
        generatePatrolShiftName = dataGen.generatePatrolShiftName();
        String generatePatrolShiftCode = dataGen.generatePatrolShiftCode();
        tmp.generatePatrolShiftName(generatePatrolShiftName);
        tmp.generatePatrolShiftCode(generatePatrolShiftCode);
        tmp.generatePatrolStartTime("12.00 AM");
        tmp.generatePatrolEndTime("5.00 PM");
    }
    @Then("User clicks on Patrol Shift save button")
    public void userClicksOnPatrolShiftSaveButton() {
        tmp.userClicksOnPatrolModeShiftSaveButton();
    }
    @Then("User verify if the Patrol Shift is created")
    public void verifyPatrolShiftSaveButton() {
        tmp.verifyPatrolShiftSaveButton(generatePatrolShiftName);
    }
    @Then("User clicks on active Patrol Shift in the grid")
    public void user_clicks_on_first_active_patrol_shift_to_edit() {
        tmp.clickActiveShifttoEdit();
    }

    @Then("User clicks on first Valid Patrol Shift to delete")
    public void user_clicks_on_first_active_patrol_shift_to_delete() {
        tmp.clickActiveShifttoDelete();
    }

    @Then("User verify if the Shift is deleted")
    public void user_Verify_first_active_patrol_shift_to_delete() {
        tmp.verifyPatrolShiftDelete(generatePatrolShiftName);
    }

    //Negative scenario
    @When("user verify the chars min len as {int} and max len as {int} on Patrol Mode")
    public void user_verify_chars_len_PatrolMode(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingMode_C_radtxtMode"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Patrol Mode")
    public void userVerifyInlineErrorMessageOnPatrolMode(String expectedErrorMessage) {
        By PatolModeErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingMode_C_RequiredFieldValidator12");
        helperUtils.verifyInlineErrorMessage(PatolModeErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars max len as {int} on Patrol Shift Code")
    public void PatrolShiftCodeUser_verify_chars_len_3(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_radtxtShiftCode"),maxLen, null);
    }
    @When("user verify the chars max len as {int} on Patrol Shift Name")
    public void PatrolShiftNameUser_verify_chars_len_50(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtShiftName"),maxLen, null);
    }
    @When("user verify the inline error message {string} on Patrol Shift Code")
    public void userVerifyInlineErrorMessageOnPatrolShiftCode(String expectedErrorMessage) {
        By PatolShiftCodeErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_rfvShiftcode");
        helperUtils.verifyInlineErrorMessage(PatolShiftCodeErrorLocator, expectedErrorMessage);
    }
    @When("user verify the inline error message {string} on Patrol Shift Name")
    public void userVerifyInlineErrorMessageOnPatrolShiftName(String expectedErrorMessage) {
        By PatolShiftNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_rfvShiftname");
        helperUtils.verifyInlineErrorMessage(PatolShiftNameErrorLocator, expectedErrorMessage);
    }
    @When("user verify the inline error message {string} on Patrol Shift Start Time")
    public void userVerifyInlineErrorMessageOnPatrolShiftST(String expectedErrorMessage) {
        By PatolShiftSTErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_RequiredFieldValidator2");
        helperUtils.verifyInlineErrorMessage(PatolShiftSTErrorLocator, expectedErrorMessage);
    }
    @When("user verify the inline error message {string} on Patrol Shift End Time")
    public void userVerifyInlineErrorMessageOnPatrolShiftET(String expectedErrorMessage) {
        By PatolShiftETErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_RequiredFieldValidator1");
        helperUtils.verifyInlineErrorMessage(PatolShiftETErrorLocator, expectedErrorMessage);
    }
    //Negative scenario
}


