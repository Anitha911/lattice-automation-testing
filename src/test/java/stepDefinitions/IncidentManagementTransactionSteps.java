package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.IncidentManagementTransactionPage;
import pages.TrainingManagementPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class IncidentManagementTransactionSteps {

    private final WebDriver driver = DriverFactory.getDriver();
    ElementUtils elementUtils = new ElementUtils(driver);
    HelperUtils helperUtils = new HelperUtils(driver);
    IncidentManagementTransactionPage tmp = new IncidentManagementTransactionPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();
    public static String incidentNumber;

    public static String Incident_Location;
    public static String Incident_Department;
    public static String Incident_Remarks;
    public static String Incident_Approval_Comments;


    @Then("User clicks on the {string} section")
    public void userClicksOnThesection(String tabTitle) {
        tmp.userClicksOnThesection(tabTitle);
    }

    @When("User selects value in the {string} dropdown")
    public void user_incident_selects_dropdown_and_options(String dropdownName) {
        By field;
        By options;

        if (dropdownName.equalsIgnoreCase("Incident Type")) {
            field = By.id("ctl00_ContentPlaceHolder1_ddlIncidentType_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ddlIncidentType_DropDown']//li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Incident SubType")) {
            field = By.id("ctl00_ContentPlaceHolder1_ddlIncidentSubType_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ddlIncidentSubType_DropDown']//li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Incident Time")) {
            field = By.id("ctl00_ContentPlaceHolder1_txtTime_dateInput");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_txtTime_timeView_wrapper']//li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Incident Severity")) {
            field = By.id("ctl00_ContentPlaceHolder1_drpSeverity_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_drpSeverity_DropDown']//li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Incident Caused By")) {
            field = By.id("ctl00_ContentPlaceHolder1_DrpCausedby_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_DrpCausedby_DropDown']//li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Affected Group")) {
            field = By.id("ctl00_ContentPlaceHolder1_DrpAffectingType_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_DrpAffectingType_DropDown']//li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Client")) {
            field = By.id("ctl00_ContentPlaceHolder1_raddrpClient_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_raddrpClient_DropDown'] //li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Client Contract")) {
            field = By.id("ctl00_ContentPlaceHolder1_raddrpContract_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_raddrpContract_DropDown']//li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Area / Master Community")) {
            field = By.id("ctl00_ContentPlaceHolder1_ddlMasterCommunity_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ddlMasterCommunity_DropDown']//li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Property / Sub Community")) {
            field = By.id("ctl00_ContentPlaceHolder1_ddlSubCommunity_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ddlSubCommunity_DropDown'] //li[contains(@class,'rcbItem')]");
        } else if (dropdownName.equalsIgnoreCase("Base Unit")) {
            field = By.id("ctl00_ContentPlaceHolder1_DrpBaseUnit_Input");
            options = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_DrpBaseUnit_DropDown'] //li[contains(@class,'rcbItem')]");
        } else {
            throw new IllegalArgumentException("Unknown dropdown name: " + dropdownName);
        }
        elementUtils.click(field);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(options, 0));
        helperUtils.clickRandomElement(options);
    }

    @Then("User fills the Location and Department details")
    public void user_fills_the_Location_and_Department_details() throws IOException {
        Incident_Location = dataGen.generateIncident_Location();
        Incident_Department = dataGen.generateIncident_Department();
        tmp.enterIncident_Location(Incident_Location);
        tmp.enterIncident_Department(Incident_Department);
    }

    @Then("User click on the Incident Save button")
    public void userClicksOnIncidentSaveButton() {
        tmp.clickIncidentSaveButton();
    }

    //    Open Incidents
    @Then("User click on the Register Incident button")
    public void userClicksOnRegisterIncidentbutton() {
        tmp.clickOnRegisterIncidentbutton();
    }

    @Then("User click on the Submit button in the detail page")
    public void clickontheSubmitbuttoninthedetailpage() {
        tmp.clickontheSubmitbuttoninthedetailpage();
    }

    @Then("User fill the Approval Submission pop up")
    public void userFillApprovalSubmissionIncidentPopup() {
        tmp.selectIncidentApprovalReason("TestIncidentApproval-1");
        Incident_Remarks = dataGen.generateincident_Remarks();
        tmp.enterIncident_Remarks_Approval(Incident_Remarks);
    }

    @Then("User click the Submit button in the Approval Submission Incident pop up")
    public void userClicksonSubmitApprovalSubmissionButton() {
        tmp.ClicksonSubmitApprovalSubmissionButton();
    }


    //    Export to Excel
    @Then("user click on the Export to Excel button")
    public void userClicksOnExporttoExcelButton() {
        tmp.clickIncidentExportToExcelButton();
    }

    @Then("User click on the Draft section")
    public void userClicksOnDraftSection() {
        tmp.clickOnDraftSection();
    }


    //  Incident - Awaiting Preliminary Reviews - StakeholderEdit
    @When("User switches to new tab")
    public void user_switches_to_new_tab() {

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }

    @Then("User click on the Stakeholder Edit icon")
    public void userClicksonStakeholderEditicon() {
        tmp.clickonStakeholderEditicon();
    }

    @Then("User fills the Stakeholder details")
    public void user_fills_the_stakeholder_details() {

        tmp.selectDropdownValue("Person reporting the incident", "Ada Kim (ST6007),HK Attendant");

        tmp.selectDropdownValue("Name and Designation of injured person", "Addison Lee (ST3742),Housekeeping Supervisor");

        tmp.selectDropdownValue("Name of responsible manager", "Caldwell Paul (ST8032),AC Supervisor");

        tmp.selectDropdownValue("Airline report written by", "Tyler Duke (ST6925),HVAC TECHNICIAN");

        tmp.selectDropdownValue("Incident Related To", "Smoking Materials");
    }

    @Then("User click on the Stakeholder submit button")
    public void userClickOnStakeholderSubmitButton() {
        tmp.clickonStakeholdersubmitbutton();
    }


    @When("User selects {string} checkbox from Incident Related To")
    public void user_selects_checkbox(String checkboxValue) {
        tmp.selectIncidentRelatedCheckbox(checkboxValue);
    }

    @Then("User click the Edit Base Unit icon in the Incident Detail page")
    public void userclickEditBaseUnitIcon() {
        tmp.userclickEditBaseUniticon();
    }

    @Then("User fills the Base Unit details")
    public void fillBaseUnitDetail() {
        tmp.selectBaseUnitDetail("ALPH D R1063/GROUND FLOOR/LULU-R1063-GF-GENERATOR ROOM");
    }

    @Then("User click the Base Unit Submit button")
    public void clicktheBaseUnitSubmitbutton() {
        tmp.clickonBaseUnitSubmitButton();
    }

//@Then("User edit the Incident Location Details in the Incident Detail page")
//    public void userclickEditLocationDetailsIcon() {
//        tmp.userclickEditLocationDetailsicon();    }
//
// @Then("User fills the Location details")
//    public void fillstheLocationdetails() {
//        tmp.selectBaseUnitDetail("ALPH D R1063/GROUND FLOOR/LULU-R1063-GF-GENERATOR ROOM");    }
//
// @Then("User click the Location Submit button")
//    public void  clickonLocationSubmitbutton() {
//        tmp.clickonLocationSubmitbutton();    }


    @Then("User scrolls down the Incident details page")
    public void userScrollsDownIncidentPage() {
        tmp.scrollDownIncidentPage();
    }

    //  Cancel Incidents
    @Then("User click the first incident in the open Incident page")
    public void userClicksonfirstincident() {
        tmp.clickonFirstIncident();
    }

    @Then("User click on the Cancel Incident button in the Incident detail page")
    public void userclicksonCancelIncident() {
        tmp.clickonCancelIncidentButton();
    }


    @Then("User fill the Cancel Incident pop up")
    public void userFillCancelIncidentPopup() {
        tmp.selectIncidentCancelReason("TestIncidentCancel-1");
        Incident_Remarks = dataGen.generateincident_Remarks();
        tmp.enterIncident_Remarks(Incident_Remarks);
    }

    @Then("User click the Submit button in the Cancel Incident pop up")
    public void userClicksonSubmitCancelIncidentButton() {
        tmp.ClicksonSubmitCancelIncidentButton();
    }

//Verify The Cancel Incident

    @Then("User verifies the cancelled incident number is displayed")
    public void verifyCancelledIncident() {
        tmp.verifyCancelledIncidentNumber();
    }

//Approval Window

    @Then("User move to the Awaiting ECM Approval tab")
    public void userClicksonAwaitingECMApprovaltab() {
        tmp.ClicksonAwaitingECMApprovaltab();
    }

    @Then("User click the Approve button in the Approval Login")
    public void userClicksonApprovebuttonApprovalLogin() {
        tmp.ClicksonApprovebuttonApprovalLogin();
    }

    @Then("User fills the Comments in the Approval pop up")
    public void userfillstheCommentsApprovalpopup() {
         Incident_Approval_Comments = dataGen.generateIncident_Approval_Comments();
        tmp.enterIncident_Approval_Comments(Incident_Approval_Comments);
    }

    @Then("User click the Save button in the Approval popup")
    public void userclickSavebuttonintheApprovalpopup() {
        tmp.ClickSavebuttonintheApprovalpopup();
    }

//Verify the Approval Incident
    @Then("User stores the first Incident Number")
    public void userStoresTheFirstIncidentNumber() {
        tmp.storeFirstIncidentNumber();
    }

    @Then("User switches back to incident list tab")
    public void userSwitchesBackToIncidentListTab() {
        tmp.switchToMainTab(driver);
    }

    @Then("User move to the WO Generated tab")
    public void userClicksonWOGeneratedtab() {
        tmp.ClicksonWOGeneratedtab();
    }

    @Then("User verifies the incident is present in WO Generated list")
    public void userVerifiesIncidentPresentInWOGeneratedList() {
        tmp.verifyIncidentPresentInWOGeneratedList(driver);
    }
}
