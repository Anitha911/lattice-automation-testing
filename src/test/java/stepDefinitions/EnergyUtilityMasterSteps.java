package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EnergyUtilityMasterPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;

import java.io.IOException;

public class EnergyUtilityMasterSteps {
    public static String generateEnergyType;
    public static String generateEnergyTypeShortName;
    public static String generateEnergyGroupName;

    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    EnergyUtilityMasterPage tmp = new EnergyUtilityMasterPage(driver);

    @Then("User clicks on the Energy TrackingMgmt {string} tab")
    public void user_click_on_GuardOptional(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-datasetup']/div[2]/div/ul[3]/li[6]/a";
        tmp.clickOnEnergyTrackingOpt(xpath);
    }
    @Then("User clicks on button Energy Types add {string}")
    public void user_click_on_AddEnergyType(String btnAddEnergyType) throws InterruptedException {
        tmp.clickOnAddEnergyType(btnAddEnergyType);
    }
    @Then("User fills up the {string} Energy Types details")
    public void user_fill_up_the_Energy_Types_details(String type) throws IOException {
        generateEnergyType = dataGen.generateEnergyType();
        tmp.enterEnergyType(generateEnergyType);
        generateEnergyTypeShortName = dataGen.generateEnergyTypeShortName();
        tmp.enterEnergyTypeShortName(generateEnergyTypeShortName);
        tmp.selectUOM("rk1506");
    }
    @Then("User clicks on Energy Types save button")
    public void user_click_on_EnergyTypeSaveButton() {
        tmp.ClickEnergyTypeSave();
    }
    @Then("User verify if the Energy Type is created")
    public void verifyEnergyTypeSaveButton() {
        tmp.verifyEnergyTypeSaveButton(generateEnergyType);
    }
    @Then("User clicks on active Energy Type in the grid")
    public void user_clicks_on_first_active_Energy_Type_to_edit() {
        tmp.clickActiveEnergyTypetoEdit();
    }
    @Then("User clicks on active Energy Type in the grid to Delete")
    public void user_clicks_on_first_active_Energy_Type_to_delete() {
        tmp.clickActiveEnergyTypetoDelete();
    }
    @Then("User verify if the Energy Type is deleted")
    public void user_Verify_first_active_Energy_Type_to_delete() {
        tmp.verifyEnergyTypeDelete(generateEnergyType);
    }
    //Reporting Group
    @Then("User clicks on the Reporting Group {string} in side menu")
    public void user_click_on_ReportingGroup(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div[1]/div/div/div[1]/div/div/div/a[2]";
        tmp.clickOnEnergyTrackingOptReportingGrp(xpath);
    }
    @Then("User clicks on button Reporting group add {string}")
    public void user_click_on_AddReportingGroup(String btnAddReportingGroup) throws InterruptedException {
        tmp.clickOnAddReportingGroup(btnAddReportingGroup);
    }
    @Then("User fills up the {string} Reporting Group details")
    public void user_fill_up_the_Reporting_Group_details(String type) throws IOException {
        generateEnergyGroupName = dataGen.generateEnergyGrpName();
        tmp.enterEnergyGroupName(generateEnergyGroupName);
        tmp.selectArea("The Garden Apartments");
        tmp.selectProperty("Lake View Apartments");
    }
    @Then("User clicks on Reporting Group save button")
    public void user_click_on_ReportingGrpSaveButton() {
        tmp.ClickReportingGrpSave();
    }
    @Then("User verify if the Reporting Group is created")
    public void verifyReportingGrpSaveButton() {
        tmp.verifyReportingGroupSaveButton(generateEnergyGroupName);
    }
}
