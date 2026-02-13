package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InventoryMasterPage;
import pages.ReactiveServiceMasterPage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import java.io.IOException;

public class ReactiveServiceMasterSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    ReactiveServiceMasterPage tmp = new ReactiveServiceMasterPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();
    public static String generateSG;
    public static String generateFC;
    public static String generateFCode;
    public static String generatePriority;
    public static String generatePriorityNote;
    public static String generateWOSourceName;
    public static String generateRCName;
    public static String generateResolutionCodeName;
    public static String generatePCRName;


    @Then("User clicks on RM {string} in side menu")
    public void user_click_on_DataConfig(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//a[contains(@class,'nav-link active') and @id='10']";
        String id = "10";
        tmp.clickOnDataConfiguration(id);
    }
    @Then("User clicks on the Core masters RM {string} tab")
    public void user_click_on_core_masters_RM(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-datasetup']/div[2]/div/ul[1]/li[7]/a";
        tmp.clickOnCoremastersRM(xpath);
    }
    @Then("User clicks on button Service Group add {string}")
    public void user_click_on_SGAdd(String btnAddSG) throws InterruptedException {
        tmp.clickOnAddSG(btnAddSG);
    }
    @Then("User fills up the {string} Service Group details")
    public void user_fills_up_the_SG(String type) throws IOException {
        generateSG = dataGen.generateSGName();
        tmp.enterSGName(generateSG);
        tmp.selectDepartment("Finance");
    }
    @Then("User clicks on Service Group save button")
    public void userClicksOnSGSaveButton() {
        tmp.userClicksOnSGSaveButton();
    }
    @Then ("User verify if the Service Group is created")
    public void userVerifyIfTheSGIsCreated() throws InterruptedException {
        tmp.verifySGcreation(generateSG);
    }
    @Then("User clicks on active Service Group in the grid")
    public void user_clicks_on_first_active_SG_to_edit() {
        tmp.clickActiveSGtoEdit();
    }
    @Then("User clicks on active Service Group in the grid to delete")
    public void user_clicks_on_first_active_SG_to_delete() {
        tmp.clickActiveSGtoDelete();
    }
    @Then("User verify if the Service Group is deleted")
    public void user_Verify_first_active_SG_to_delete() {
        tmp.verifySGDelete(generateSG);
    }
    @Then ("User clicks on RM Export to Excel button")
    public void user_clicks_on_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.RMExportToExcel(xpath);
    }
    //Fault Category
    @Then("User clicks on the Core masters RM Fault Category {string} tab")
    public void user_click_on_core_masters_RM_FC(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[2]";
        tmp.clickOnCoremastersRM_FC(xpath);
    }
    @Then("User clicks on button Fault Category add {string}")
    public void user_click_on_FCAdd(String btnAddFC) throws InterruptedException {
        tmp.clickOnAddFC(btnAddFC);
    }
    @Then("User fills up the {string} Fault Category details")
    public void user_fills_up_the_FC(String type) throws IOException {
        generateFC = dataGen.generateFCName();
        tmp.enterFCName(generateFC);
        tmp.selectFC("HVAC System");
    }
    @Then("User clicks on Fault Category save button")
    public void userClicksOnFCSaveButton() {
        tmp.userClicksOnFCSaveButton();
    }
    @Then ("User verify if the Fault Category is created")
    public void userVerifyIfTheFGIsCreated() throws InterruptedException {
        tmp.verifyFCcreation(generateFC);
    }
    @Then("User clicks on active Fault Category in the grid")
    public void user_clicks_on_first_active_FC_to_edit() {
        tmp.clickActiveFCtoEdit();
    }
    @Then("User clicks on active Fault Category in the grid to delete")
    public void user_clicks_on_first_active_FC_to_delete() {
        tmp.clickActiveFCtoDelete();
    }
    @Then("User verify if the Fault Category is deleted")
    public void user_Verify_first_active_FC_to_delete() {
        tmp.verifyFCDelete(generateFC);
    }
    //Fault Code
    @Then("User clicks on the Core masters RM Fault Code {string} tab")
    public void user_click_on_core_masters_RM_FCode(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[3]";
        tmp.clickOnCoremastersRM_FCode(xpath);
    }
    @Then("User clicks on button Fault Code add {string}")
    public void user_click_on_FCodeAdd(String btnAddFCode) throws InterruptedException {
        tmp.clickOnAddFCode(btnAddFCode);
    }

    @Then("User fills up the {string} Fault Code details")
    public void user_fills_up_the_FCode(String type) throws IOException {
        generateFCode = dataGen.generateFCodeName();
        tmp.enterFCodeName(generateFCode);
        tmp.selectFaultCodeSG("Carpentry");
        tmp.selectFaultCodeFC("Carpentry");
        tmp.selectFaultCodeWOType("Reactive Maintenance");
        tmp.selectFaultCodeRCA("Mandatory");
    }
    @Then("User clicks on Fault Code save button")
    public void userClicksOnFCodeSaveButton() {
        tmp.userClicksOnFCodeSaveButton();
    }
    @Then ("User verify if the Fault Code is created")
    public void userVerifyIfTheFCodeIsCreated() throws InterruptedException {
        tmp.verifyFCodecreation(generateFCode);
    }
    @Then("User clicks on active Fault Code in the grid to delete")
    public void user_clicks_on_first_active_FCode_to_delete() {
        tmp.clickActiveFCodetoDelete();
    }
    @Then("User verify if the Fault Code is deleted")
    public void user_Verify_first_active_FCode_to_delete() {
        tmp.verifyFCodeDelete(generateFCode);
    }
    //Priority
    @Then("User clicks on the Core masters RM Fault Priority {string} tab")
    public void user_click_on_core_masters_RM_Priority(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[4]";
        tmp.clickOnCoremastersRM_Priority(xpath);
    }
    @Then("User clicks on button Fault Priority add {string}")
    public void user_click_on_PriorityAdd(String btnAddPriority) throws InterruptedException {
        tmp.clickOnAddPriority(btnAddPriority);
    }
    @Then("User fills up the {string} Fault Priority details")
    public void user_fills_up_the_Priority(String type) throws IOException {
        generatePriority = dataGen.generatePriorityName();
        tmp.enterPriorityName(generatePriority);
        generatePriorityNote = dataGen.generatePriorityNote();
        tmp.enterPriorityNotes(generatePriorityNote);
        tmp.SelectActiveCheckbox();
    }
    @Then("User clicks on Fault Priority save button")
    public void userClicksPrioritySaveButton() {
        tmp.userClicksPrioritySaveButton();
    }
    @Then ("User verify if the Fault Priority is created")
    public void userVerifyIfTFCodeIsCreated() throws InterruptedException {
        tmp.verifyPrioritycreation(generatePriority);
    }
    @Then("User clicks on active Fault Priority in the grid")
    public void user_clicks_on_first_active_Priority_to_edit() {
        tmp.clickActivePrioritytoEdit();
    }
    @Then("User clicks on active Fault Priority in the grid to delete")
    public void user_clicks_on_first_active_Priority_to_delete() {
        tmp.clickActivePrioritytoDelete();
    }
    @Then("User verify if the Fault Priority is deleted")
    public void user_Verify_first_active_Priority_to_delete() {
        tmp.verifyPriorityDelete(generatePriority);
    }
    //WO Source
    @Then("User clicks on the Core masters RM WO Source {string} tab")
    public void user_click_on_core_masters_RM_WOSource(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[5]";
        tmp.clickOnCoremastersRM_WOSource(xpath);
    }
    @Then("User clicks on button WO Source add {string}")
    public void user_click_on_WOSourceAdd(String btnAddWOSource) throws InterruptedException {
        tmp.clickOnAddWOSource(btnAddWOSource);
    }
    @Then("User fills up the {string} WO Source details")
    public void user_fills_up_the_WOSource(String type) throws IOException {
        generateWOSourceName = dataGen.generateWOSourceName();
        tmp.enterWOSourceName(generateWOSourceName);
    }
    @Then("User clicks on WO Source save button")
    public void userClicksWOSourceSaveButton() {
        tmp.userClicksWOSourceSaveButton();
    }
    @Then ("User verify if the WO Source is created")
    public void userVerifyIfWOSourceIsCreated() throws InterruptedException {
        tmp.verifyWOSourcecreation(generateWOSourceName);
    }
    @Then("User clicks on active WO Source in the grid")
    public void user_clicks_on_first_active_WOSOurce_to_edit() {
        tmp.clickActiveWOSourcetoEdit();
    }
    @Then("User clicks on active RM WO Source in the grid to delete")
    public void user_clicks_on_first_active_WOSource_to_delete() {
        tmp.clickActiveWOSourcetoDelete();
    }
    @Then("User verify if the RM WO Source is deleted")
    public void user_Verify_first_active_WOSource_todelete() {
        tmp.verifyWOSourceDelete(generateWOSourceName);
    }
    //Root Cause
    @Then("User clicks on the Core masters RM Root Cause {string} tab")
    public void user_click_on_core_masters_RM_RC(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[6]";
        tmp.clickOnCoremastersRM_RC(xpath);
    }
    @Then("User clicks on button Root Cause add {string}")
    public void user_click_on_RCAdd(String btnAddRC) throws InterruptedException {
        tmp.clickOnAddRC(btnAddRC);
    }
    @Then("User fills up the {string} Root Cause details")
    public void user_fills_up_the_RC(String type) throws IOException {
        generateRCName = dataGen.generateRCName();
        tmp.enterRCName(generateRCName);
        tmp.SelectGenericCheckBox();
    }
    @Then("User clicks on RC save button")
    public void userClicksRCSaveButton() {
        tmp.userClicksRCSaveButton();
    }
    @Then ("User verify if the RC is created")
    public void userVerifyIfRCIsCreated() throws InterruptedException {
        tmp.verifyRCcreation(generateRCName);
    }
    @Then("User clicks on active RC in the grid")
    public void user_clicks_on_first_active_RC_to_edit() {
        tmp.clickActiveRCtoEdit();
    }
    @Then("User clicks on active RM Root Cause in the grid to delete")
    public void user_clicks_on_first_active_RC_to_delete() {
        tmp.clickActiveRCtoDelete();
    }
    @Then("User verify if the RM Root Cause is deleted")
    public void user_Verify_first_active_RC_todelete() {
        tmp.verifyRCDelete(generateRCName);
    }
    //Resolution Code
    @Then("User clicks on the Core masters RM Resolution Code {string} tab")
    public void user_click_on_core_masters_RM_ResCde(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[7]";
        tmp.clickOnCoremastersRM_ResCde(xpath);
    }
    @Then("User clicks on button Resolution Code add {string}")
    public void user_click_on_ResCdeAdd(String btnAddResCde) throws InterruptedException {
        tmp.clickOnAddResCde(btnAddResCde);
    }
    @Then("User fills up the {string} Resolution Code details")
    public void user_fills_up_the_ResolutionCode(String type) throws IOException {
        generateResolutionCodeName = dataGen.generateResolutionCodeName();
        tmp.enterResolutionCode(generateResolutionCodeName);
        tmp.selectRootCause("Intercom Issues");
    }
    @Then("User clicks on ResolutionCode save button")
    public void userClicksResCdeSaveButton() {
        tmp.userClicksResCdeSaveButton();
    }
    @Then ("User verify if the ResolutionCode is created")
    public void userVerifyIfResCdeIsCreated() throws InterruptedException {
        tmp.verifyResCodecreation(generateResolutionCodeName);
    }
    @Then("User clicks on active ResolutionCode in the grid")
    public void user_clicks_on_first_active_ResCde_to_edit() {
        tmp.clickActiveResCdetoEdit();
    }
    @Then("User clicks on active RM Resolution Code in the grid to delete")
    public void user_clicks_on_first_active_ResCde_to_delete() {
        tmp.clickActiveResCdetoDelete();
    }
    @Then("User verify if the RM Resolution Code is deleted")
    public void user_Verify_first_active_ResCde_todelete() {
        tmp.verifyResCdeDelete(generateResolutionCodeName);
    }
    //Priority Change Reason
    @Then("User clicks on the Core masters RM PriorityChangeReasons {string} tab")
    public void user_click_on_core_masters_RM_PriorityChangeReason(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[2]";
        tmp.clickOnCoremastersRM_PCR(xpath);
    }
    @Then("User clicks on button PriorityChangeReasons add {string}")
    public void user_click_on_PCR(String btnAddPCR) throws InterruptedException {
        tmp.clickOnAddPCR(btnAddPCR);
    }
    @Then("User fills up the {string} PriorityChangeReasons details")
    public void user_fills_up_the_PCR(String type) throws IOException {
        generatePCRName = dataGen.generatePCRName();
        tmp.enterPCR(generatePCRName);
    }
    @Then("User clicks on PriorityChangeReasons save button")
    public void userClicksPCRSaveButton() {
        tmp.userClicksPCRSaveButton();
    }
    @Then ("User verify if the PriorityChangeReasons is created")
    public void userVerifyIfPCRIsCreated() throws InterruptedException {
        tmp.verifyPCRcreation(generatePCRName);
    }
}

