package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ReactiveMaintainancePage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class ReactiveMaintainanceSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    HelperUtils helperUtils = new HelperUtils(driver);
    ReactiveMaintainancePage tmp = new ReactiveMaintainancePage(driver);
    ElementUtils elementUtils= new ElementUtils(driver);

    @Then("User clicks on RM Transactions {string} in side menu")
    public void user_click_on_ReactiveM(String title) throws InterruptedException {
        String id = "4";
        tmp.MenuRM(id);
    }
    @Then("User clicks on the RM New Request {string} tab")
    public void user_click_on_RMNewRequest(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-graphs']/div[2]/div/ul[1]/li[2]/a";
        tmp.RMNewRequest(xpath);
    }
    @Then("User fills up the New Request details")
    public void userFillsNewRequestDetails() {
        tmp.selectPropertyOwner("Alpha Properties");
        tmp.selectPropertyContract("ABC Tower");
        tmp.selectProperty("ABC Tower");
        tmp.selectZone("ABC Tower");
        tmp.selectSubZone("ROOF TOP");
        tmp.selectBaseUnit("ABC110-ABC110-RF-17 TO H12 CORR [BU1001910]");
        tmp.selectSG("Carpentry");
        tmp.selectFaultCategory("Carpentry");
        tmp.selectFaultCode("12012026RK FC");
    }
    @Then("User clicks on RM New Request save button")
    public void user_click_on_NewRequestSaveButton() {
        tmp.ClickNewRequestSave();
    }
    //RM Detail Page
    @Then("User clicks on the RM Console Window Reactive WO {string} tab")
    public void user_click_on_RMRequestDetail(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-graphs']/div[2]/div/ul[2]/li[2]/a";
        tmp.RMRequestDetail(xpath);
    }
    @Then("User clicks the first WO to open the detail page")
    public void user_click_on_RMRequestDetailOpen() throws InterruptedException {
        tmp.RMRequestDetailOpen();
    }
    @When("user verify the inline error message {string} on New Request RM")
    public void userVerifyInlineErrorMessageOnNewRequestWorkDesc(String expectedErrorMessage) {
        By NewRequestWorkDescErrorLocator = By.id("ContentPlaceHolder1_RequiredFieldValidator17");
        helperUtils.verifyInlineErrorMessage(NewRequestWorkDescErrorLocator, expectedErrorMessage);
    }
    //Add Notes
    @Then("User Clicks on Add RM Notes {string}")
    public void user_click_on_RM_Addnotes(String AddNotes) throws InterruptedException {
        tmp.clickOnAddRMNotes(AddNotes);
    }
    @Then("User enters the RM Notes Details")
    public void userFillsRMNotesDetails() {
        tmp.enterRMNotesComments(dataGen.generateComments());
        tmp.selectRMNoteType("Commercial");
    }
    @Then("User Clicks RM Notes Save Button")
    public void user_click_on_RMNotesSaveButton() {
        tmp.ClickRMNotesSave();
    }
    //PTW Add
    @Then("User clicks Permit To Work section in the left side")
    public void user_click_on_RMDetailPTWSection() throws InterruptedException {
        tmp.RMDetailPTWSection();
    }
    @Then("User Clicks on Add RM Permit To Work {string}")
    public void user_click_on_RM_AddPermitToWork(String AddPTW) throws InterruptedException {
        tmp.clickOnAddRMPTW(AddPTW);
    }
    @Then("User enters the RM Permit To Work Details")
    public void userFillsRMPTWDetails() {
        tmp.selectRMPTWType("12052026RK PTW");
    }
    @Then("User Clicks RM Permit To Work Save Button")
    public void user_click_on_RMPTWSaveButton() {
        tmp.ClickRMPTWSave();
    }
}
