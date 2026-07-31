package stepDefinitions;
import io.cucumber.java.PendingException;
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
    public static String generateMRQuantity;

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
        tmp.selectPropertyOwner("Lattice Demo Client");
        tmp.selectPropertyContract("EMRILL DEMO CONTRACT");
        tmp.selectProperty("EMRILL DEMO CONTRACT");
        tmp.selectZone("Head Office");
        tmp.selectSubZone("GROUND FLOOR");
        tmp.selectBaseUnit("EDC-HO-GF-Center of excellence [EDC-BU1000002]");
        tmp.selectSG("Chemical Dozing Systems");
        tmp.selectFaultCategory("Card Reader");
        tmp.selectFaultCode("07102025RK FC");
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
    //WO Status from Not Despached to Completed
    @Then("User Checks the WO Status in the WO detail page")
    public void user_click_on_RMRequestDetailWOStatusNotDespatched() throws InterruptedException {
        tmp.RMRequestDetailWOStatusNotDespatched();
    }
    //Modify Fault Code in WO detail Page
    @Then("User clicks Modify Fault Code button {string} if available")
    public void user_click_on_RMRequestDetailModifyFC(String ModifyFC) throws InterruptedException {
        tmp.RMRequestDetailModifyFC(ModifyFC);
    }
    @When("User select the {string} RM Service Group dropdown")
    public void user_select_the_RMDetailSG_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailSG_Dropdown();
        }
    }
    @When("User select the {string} RM Fault Category dropdown")
    public void user_select_the_ReactiveMaintRMDetailFautCategory_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailFaultCategory_Dropdown();
        }
    }
    @When("User select the {string} RM Fault Code dropdown")
    public void user_select_the_RMDetailFautCode_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailFaultCode_Dropdown();
        }
    }
    @When("User select the RM {string} Priority dropdown")
//    public void user_select_the_RMDetailPriority_Dropdown(String value) throws InterruptedException {
//        if(value == null || value.isEmpty()){
//            tmp.getRandomRMDetailPriority_Dropdown();
//        }
//    }
    //Common function for Save in RM TRANSACTION
    @Then("User Clicks the Save Fault Code button")
    public void userClicksRMTransactionSaveButton() {
        tmp.userClicksRMTransactionSaveButton();
    }
    //Mark As Duplicate in WO detail Page
    @Then("User clicks Mark A Duplicate button {string} if available")
    public void user_click_on_RMRequestDetailMarkADuplicate(String RMRequestDetailMarkADuplicate) throws InterruptedException {
        tmp.RMRequestDetailMarkADuplicate(RMRequestDetailMarkADuplicate);
    }
    @Then("User Selects Primary WO from the Mark A Duplicate {string} pop up")
    public void user_click_on_RMRequestDetailMarkADuplicateSelectPrimaryWO(String RMRequestDetailMarkADuplicateSelectPrimaryWO) throws InterruptedException {
        tmp.RMRequestDetailMarkADuplicateSelectPrimaryWO(RMRequestDetailMarkADuplicateSelectPrimaryWO);
    }
    //Create Child WO in WO Detail Page
    @Then("User clicks the Add Child WO in the side menu if available and click Add Child WO {string} button")
    public void user_click_on_RMRequestDetailAddChildWO(String RMRequestDetailAddChildWO) throws InterruptedException {
        tmp.RMRequestDetailAddChildWO(RMRequestDetailAddChildWO);
    }
    @Then("User enters details in the Child WO pop up {string}")
    public void user_click_on_RMRequestDetailChildWODetail(String RMRequestDetailChildWODetail) throws InterruptedException {
        tmp.RMRequestDetailChildWODetail(RMRequestDetailChildWODetail);
    }
    @When("User select the Child WO {string} Service Group dropdown")
    public void user_select_the_RMDetailChildWOSG_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailChildWOSG_Dropdown();
        }
    }
    @When("User select the Child WO {string} Fault Category dropdown")
    public void user_select_the_RMDetailChildWOFaultCategory_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailChildWOFaultCategory_Dropdown();
        }
    }
    @When("User select the Child WO {string} Fault Code dropdown")
    public void user_select_the_RMDetailChildWOFaultCode_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailChildWOFaultCode_Dropdown();
        }
    }
    @When("User select the Child WO {string} Technician dropdown")
    public void user_select_the_RMDetailChildWOTechnician_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailChildWOTechnician_Dropdown();
        }
    }
    //Cancel WO in WO detail page
    @Then("User Clicks the Cancel WO Button if available and Add Cancel WO {string}")
    public void user_click_on_RMRequestDetailCancelWO(String RMRequestDetailCancelWO) throws InterruptedException {
        tmp.RMRequestDetailCancelWO(RMRequestDetailCancelWO);
    }
    @Then("User enters details in the Cancel WO pop up {string}")
    public void user_click_on_RMRequestDetailCancelWODetail(String RMRequestDetailCancelWODetail) throws InterruptedException {
        tmp.RMRequestDetailCancelWODetail(RMRequestDetailCancelWODetail);
    }
    @When("User select the Cancel WO {string} Reason for Cancellation dropdown")
    public void user_select_the_RMDetailCancelWOReason_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailCancelWOReason_Dropdown();
        }
    }
    @Then("User clicks on RM Cancel WO Save button {string}")
    public void user_click_on_RMRequestDetailSaveCancelWO(String RMRequestDetailSaveCancelWO) throws InterruptedException {
        tmp.RMRequestDetailSaveCancelWO(RMRequestDetailSaveCancelWO);
    }
    //Add Material Request in WO detail page
    @Then("User clicks the Add Material Request in the side menu if available and click Add Material Request {string} button")
    public void user_click_on_RMRequestDetailMR(String RMRequestDetailMR) throws InterruptedException {
        tmp.RMRequestDetailMR(RMRequestDetailMR);
    }
    @Then("User Enters details in the Material Request pop up {string}")
    public void user_click_on_RMRequestDetailMRDetail(String RMRequestDetailMRDetail) throws InterruptedException {
        generateMRQuantity=dataGen.generateMaxNoParticipants();
        tmp.generateMRQuantity(generateMRQuantity);
        tmp.selectItemName("10022026 Item RK");
        tmp.selectStore("09012026Rk");
    }
    @When("User select the Item name {string} from Item Name dropdown")
    public void user_select_the_RMDetailMRItemName_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailMRItemName_Dropdown();
        }
    }
    @When("User select the Store {string} from Store dropdown")
    public void user_select_the_RMDetailStore_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomRMDetailStore_Dropdown();
        }
    }
    @Then("User Clicks the Add Material Request Button {string}")
    public void user_click_on_RMRequestDetailADDMR(String RMRequestDetailADDMR) throws InterruptedException {
        tmp.RMRequestDetailADDMR(RMRequestDetailADDMR);
    }
    @Then("User clicks the Submit Request Button {string}")
    public void user_click_on_RMRequestDetailSubmitMR(String RMRequestDetailSubmitMR) throws InterruptedException {
        tmp.RMRequestDetailSubmitMR(RMRequestDetailSubmitMR);
    }
    //New SR in WO detail page
    @Then("User clicks New Service Request With Same Base Unit {string} and click Yes")
    public void user_click_on_RMRequestDetailNewServiceRequest(String RMRequestDetailNewServiceRequest) throws InterruptedException {
        tmp.RMRequestDetailNewServiceRequest(RMRequestDetailNewServiceRequest);
    }
}
