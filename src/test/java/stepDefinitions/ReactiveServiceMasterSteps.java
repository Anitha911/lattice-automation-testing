package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InventoryMasterPage;
import pages.ReactiveServiceMasterPage;
import utils.DriverFactory;
import utils.HelperUtils;
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
    public static String generateCONTRACTGRPCR;
    public static String generateSLAFJR;
    public static String generateCTIR;
    public static String generateSRR;
    public static String SLATypeResponseSLATime;

    HelperUtils helperUtils = new HelperUtils(driver);

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
    //DropDown New Function
    @When("User select the {string} Service Group Department dropdown")
    public void user_select_the_SGDepartment_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomSGDepartmentDropdown();
            return;
        }
        //tmp.searchAndSelectACSEnforcingAuthority(value);
    }
    //
    @Then("User clicks on Service Group save button")
    public void userClicksOnSGSaveButton() {
        tmp.userClicksOnSGSaveButton();
    }

    //Common function for Save
    @Then("User clicks on RM Master save button")
    public void userClicksRMMasterSaveButton() {
        tmp.userClicksRMMasterSaveButton();
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
    @Then("User clicks on active RM in the grid to delete")
    public void user_clicks_on_first_active_RM_to_delete() {
        tmp.clickActiveRMtoDelete();
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
    //Pagination in grid starts
    @Then("User clicks on Service Group grid pagination {string}")
    public void user_click_on_SGPagination(String SGPagination) throws InterruptedException {
        tmp.SGPagination(SGPagination);
    }
    //No of data per page
    @Then("User clicks on Service Group grid Data Per Page {int}")
    public void user_click_on_SGDataPerPage(int SGDataPerPage) throws InterruptedException {
        tmp.SGDataPerPage(SGDataPerPage);
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
        //tmp.selectFC("HVAC System");
    }
    //DropDown New Function
    @When("User select the {string} Fault Category Service Group dropdown")
    public void user_select_the_FaultCategorySG_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomFaultcategorySGDropdown();
        }
    }
    //
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
    //Pagination in grid starts
    @Then("User clicks on FaultCategory grid pagination {string}")
    public void user_click_on_FaultCategoryPagination(String FaultCategoryPagination) throws InterruptedException {
        tmp.FaultCategoryPagination(FaultCategoryPagination);
    }
    @Then("User clicks on FaultCategory grid Data Per Page {int}")
    public void user_click_on_FaultCategoryGridDataPerPage(int FaultCategoryGridDataPerPage) throws InterruptedException {
        tmp.FaultCategoryGridDataPerPage(FaultCategoryGridDataPerPage);
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
    //DropDown New Function
    @When("User select the {string} Fault Code Service Group dropdown")
    public void user_select_the_FaultCodeSG_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomFaultCodeSGDropdown();
        }
    }
    //DropDown New Function
    @When("User select the {string} Fault Code Fault Category dropdown")
    public void user_select_the_FaultCodeFaultCategory_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomFaultCodeFaultCategoryDropdown();
        }
    }
    //DropDown New Function
    @When("User select the {string} Fault Code Work Order Type dropdown")
    public void user_select_the_FaultCodeWorkOrderType_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomFaultCodeWorkOrderTypeDropdown();
        }
    }
    //DropDown New Function
    @When("User select the {string} Fault Code Root Cause Category dropdown")
    public void user_select_the_FaultCodeRootCauseCategorydropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomFaultCodeRootCauseCategorydropdown();
        }
    }
    //
    @Then("User clicks on Fault Code save button")
    public void userClicksOnFCodeSaveButton() {
        tmp.userClicksOnFCodeSaveButton();
    }
    @Then ("User verify if the Fault Code is created")
    public void userVerifyIfTheFCodeIsCreated() throws InterruptedException {
        tmp.verifyFCodecreation(generateFCode);
    }
    //FC EDIT START
    @Then ("User Clicks on first data in the FaultCode Grid")
    public void user_click_on_FCodeFirstDataInGrid() throws InterruptedException {
        tmp.clickOnFirstDatainFCgrid();
    }
    @Then ("User clicks the manage Fault Code Button")
    public void user_click_on_FCodeManageFCButton() throws InterruptedException {
        tmp.clickOnFCodeManageFCButton();
    }
    @Then ("User clicks the Update Button")
    public void user_click_on_FCodeEditUpdateButton() throws InterruptedException {
        tmp.FCodeEditUpdateButton();
    }
    //FC Edit Ends
    @Then("User clicks on active Fault Code in the grid to delete")
    public void user_clicks_on_first_active_FCode_to_delete() {
        tmp.clickActiveFCodetoDelete();
    }
    @Then("User verify if the Fault Code is deleted")
    public void user_Verify_first_active_FCode_to_delete() {
        tmp.verifyFCodeDelete(generateFCode);
    }
    //Pagination in grid starts
    @Then("User clicks on FaultCode grid pagination {string}")
    public void user_click_on_FaultCodePagination(String FaultCodePagination) throws InterruptedException {
        tmp.FaultCodePagination(FaultCodePagination);
    }
    @Then("User clicks on FaultCode grid Data Per Page {int}")
    public void user_click_on_FaultCodeGridDataPerPage(int FaultCodeGridDataPerPage) throws InterruptedException {
        tmp.FaultCodeGridDataPerPage(FaultCodeGridDataPerPage);
    }
    //Fault Code Pagination Ends
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
        SLATypeResponseSLATime=dataGen.generateMaxNoParticipants();
        tmp.SLATypeResponseSLATime(SLATypeResponseSLATime);
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
    //Pagination in grid starts
    @Then("User clicks on Priority grid pagination {string}")
    public void user_click_on_PriorityPagination(String PriorityPagination) throws InterruptedException {
        tmp.PriorityPagination(PriorityPagination);
    }
    //No of data per page
    @Then("User clicks on Priority grid Data Per Page {int}")
    public void user_click_on_PriorityDataPerPage(int PriorityDataPerPage) throws InterruptedException {
        tmp.PriorityDataPerPage(PriorityDataPerPage);
    }
    //Priority Ends
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
    //Pagination in grid starts
    @Then("User clicks on WOSource grid pagination {string}")
    public void user_click_on_WOSourcePagination(String WOSourcePagination) throws InterruptedException {
        tmp.WOSourcePagination(WOSourcePagination);
    }
    //No of data per page
    @Then("User clicks on WO Source grid Data Per Page {int}")
    public void user_click_on_WOSourceDataPerPage(int WOSourceDataPerPage) throws InterruptedException {
        tmp.WOSourceDataPerPage(WOSourceDataPerPage);
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
    //Pagination in grid starts
    @Then("User clicks on Root Cause grid pagination {string}")
    public void user_click_on_RootCausePagination(String RootCausePagination) throws InterruptedException {
        tmp.RootCausePagination(RootCausePagination);
    }
    //No of data per page
    @Then("User clicks on Root Cause grid Data Per Page {int}")
    public void user_click_on_RootCauseDataPerPage(int RootCauseDataPerPage) throws InterruptedException {
        tmp.RootCauseDataPerPage(RootCauseDataPerPage);
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
        //tmp.selectRootCause("Intercom Issues");
    }
    //DropDown New Function
    @When("User select the {string} Resolution Code Root Cause dropdown")
    public void user_select_the_ResolutionCodeRootCause_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomResolutionCodeRootCauseDropdown();
        }
    }
    //
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
    //Pagination in grid starts
    @Then("User clicks on Resolution Code grid pagination {string}")
    public void user_click_on_ResolutionCodePagination(String ResolutionCodePagination) throws InterruptedException {
        tmp.ResolutionCodePagination(ResolutionCodePagination);
    }
    //No of data per page
    @Then("User clicks on Resolution Code grid Data Per Page {int}")
    public void user_click_on_ResolutionCodeDataPerPage(int ResolutionCodeDataPerPage) throws InterruptedException {
        tmp.ResolutionCodeDataPerPage(ResolutionCodeDataPerPage);
    }
    //SLA Type
    @Then("User clicks on the Core masters RM SLA Type {string} tab")
    public void user_click_on_core_masters_RM_SLAType(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[1]";
        tmp.clickOnCoremastersRM_SLAType(xpath);
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
    @Then("User clicks on active PriorityChangeReasons in the grid")
    public void user_clicks_on_first_active_PCR_to_edit() {
        tmp.clickActivePCRtoEdit();
    }
    @Then("User clicks on active RM PriorityChangeReasons in the grid to delete")
    public void user_clicks_on_first_active_PCR_to_delete() {
        tmp.clickActivePCRtoDelete();
    }
    @Then("User verify if the RM PriorityChangeReasons is deleted")
    public void user_Verify_first_active_PCR_todelete() {
        tmp.verifyPCRDelete(generatePCRName);
    }
    //Pagination in grid starts
    @Then("User clicks on PriorityChangeReasons grid pagination {string}")
    public void user_click_on_PriorityChangeReasonsPagination(String PriorityChangeReasonsPagination) throws InterruptedException {
        tmp.PriorityChangeReasonsPagination(PriorityChangeReasonsPagination);
    }
    //No of data per page
    @Then("User clicks on PriorityChangeReasons grid Data Per Page {int}")
    public void user_click_on_PriorityChangeReasonsDataPerPage(int PriorityChangeReasonsDataPerPage) throws InterruptedException {
        tmp.PriorityChangeReasonsDataPerPage(PriorityChangeReasonsDataPerPage);
    }
    //Contract Group Change Reason
    @Then("User clicks on the Core masters RM ContractGroupChangeReasons {string} tab")
    public void user_click_on_core_masters_RM_CtGrpChangeReasons(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[3]";
        tmp.clickOnMasterRM_CtGrpChangeReasons(xpath);
    }
    @Then("User clicks on button ContractGroupChangeReasons add {string}")
    public void user_click_on_CtGrpChangeReasons(String btnAddCtGrpChangeReasons) throws InterruptedException {
        tmp.clickOnAddCtGrpChangeReasons(btnAddCtGrpChangeReasons);
    }
    @Then("User fills up the {string} ContractGroupChangeReasons details")
    public void user_fills_up_the_CGCR(String type) throws IOException {
        generateCONTRACTGRPCR = dataGen.generateCGCR();
        tmp.enterCGCR(generateCONTRACTGRPCR);
    }
    @Then("User clicks on ContractGroupChangeReasons save button")
    public void userClicksCGCRSaveButton() {
        tmp.userClicksCGCRSaveButton();
    }
    @Then ("User verify if the ContractGroupChangeReasons is created")
    public void userVerifyIfCGCRIsCreated() throws InterruptedException {
        tmp.verifyCGCRcreation(generateCONTRACTGRPCR);
    }
    @Then("User clicks on active ContractGroupChangeReasons in the grid")
    public void user_clicks_on_first_active_CGCR_to_edit() {
        tmp.clickActiveCGCRtoEdit();
    }
    @Then("User clicks on active RM ContractGroupChangeReasons in the grid to delete")
    public void user_clicks_on_first_active_CGCR_to_delete() {
        tmp.clickActiveCGCRtoDelete();
    }
    @Then("User verify if the RM ContractGroupChangeReasons is deleted")
    public void user_Verify_first_active_CGCR_todelete() {
        tmp.verifyCGCRDelete(generateCONTRACTGRPCR);
    }
    //Pagination in grid starts
    @Then("User clicks on ContractGroupChangeReasons grid pagination {string}")
    public void user_click_on_ContractGroupChangeReasonsPagination(String ContractGroupChangeReasonsPagination) throws InterruptedException {
        tmp.ContractGroupChangeReasonsPagination(ContractGroupChangeReasonsPagination);
    }
    //No of data per page
    @Then("User clicks on ContractGroupChangeReasons grid Data Per Page {int}")
    public void user_click_on_ContractGroupChangeReasonsDataPerPage(int ContractGroupChangeReasonsDataPerPage) throws InterruptedException {
        tmp.ContractGroupChangeReasonsDataPerPage(ContractGroupChangeReasonsDataPerPage);
    }
    //SLA Failure Justification Reason
    @Then("User clicks on the Core masters RM SLAFailureJustification {string} tab")
    public void user_click_on_core_masters_RM_SLAFailureJustification(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[4]";
        tmp.clickOnMasterRM_SLAFGR(xpath);
    }
    @Then("User clicks on button SLAFailureJustification add {string}")
    public void user_click_on_ADD_SLAFailureJustification(String btnAddSLAFailureJustification) throws InterruptedException {
        tmp.clickOnAddbtnAddSLAFailureJustification(btnAddSLAFailureJustification);
    }
    @Then("User fills up the {string} SLAFailureJustification details")
    public void user_fills_up_the_SLAFailureJustification(String type) throws IOException {
        generateSLAFJR = dataGen.generateSLAFJR();
        tmp.enterSLAFJR(generateSLAFJR);
        //tmp.selectSLAType("Resolved");
    }
    //DropDown New Function
    @When("User select the {string} SLA Type SLAFailureJustification dropdown")
    public void user_select_the_SLATypeSLAFailureJustification_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomSLATypeSLAFailureJustificationDropdown();
        }
    }
    //
    @Then("User clicks on SLAFailureJustification save button")
    public void userClicksSLAFJSaveButton() {
        tmp.userClicksSLAFJSaveButton();
    }
    @Then ("User verify if the SLAFailureJustification is created")
    public void userVerifyIfSLAFJIsCreated() throws InterruptedException {
        tmp.verifySLAFJRcreation(generateSLAFJR);
    }
    @Then("User clicks on active SLAFailureJustification in the grid")
    public void user_clicks_on_first_active_SLAFJ_to_edit() {
        tmp.clickActiveSLAFJtoEdit();
    }
    @Then("User clicks on active RM SLAFailureJustification in the grid to delete")
    public void user_clicks_on_first_active_SLAFJ_to_delete() {
        tmp.clickActiveSLAFJtoDelete();
    }
    @Then("User verify if the RM SLAFailureJustification is deleted")
    public void user_Verify_first_active_SLAFJ_todelete() {
        tmp.verifySLAFJDelete(generateSLAFJR);
    }
    //Pagination in grid starts
    @Then("User clicks on SLAFailureJustification grid pagination {string}")
    public void user_click_on_SLAFailureJustificationPagination(String SLAFailureJustification) throws InterruptedException {
        tmp.SLAFailureJustificationPagination(SLAFailureJustification);
    }
    //No of data per page
    @Then("User clicks on SLAFailureJustification grid Data Per Page {int}")
    public void user_click_on_SLAFailureJustificationDataPerPage(int SLAFailureJustification) throws InterruptedException {
        tmp.SLAFailureJustificationDataPerPage(SLAFailureJustification);
    }
    //CTI Reason
    @Then("User clicks on the Core masters RM CTI Reasons {string} tab")
    public void user_click_on_core_masters_RM_CTIReasons(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[5]";
        tmp.clickOnMasterRMCTIReasons(xpath);
    }
    @Then("User clicks on button CTIReasons add {string}")
    public void user_click_on_ADD_CTIReasons(String btnAddCTIReasons) throws InterruptedException {
        tmp.clickOnAddbtnAddCTIReasons(btnAddCTIReasons);
    }
    @Then("User fills up the {string} CTIReasons details")
    public void user_fills_up_the_CTIR(String type) throws IOException {
        generateCTIR = dataGen.generateCTIR();
        tmp.enterCTIR(generateCTIR);
    }
    @Then("User clicks on CTIReasons save button")
    public void userClicksCTIRSaveButton() {
        tmp.userClicksCTIRSaveButton();
    }
    @Then ("User verify if the CTIReasons is created")
    public void userVerifyIfCTIRIsCreated() throws InterruptedException {
        tmp.verifyCTIRcreation(generateCTIR);
    }
    @Then("User clicks on active CTIReasons in the grid")
    public void user_clicks_on_first_active_CTIR_to_edit() {
        tmp.clickActiveCTIRtoEdit();
    }
    @Then("User clicks on active RM CTIReasons in the grid to delete")
    public void user_clicks_on_first_active_CTIR_to_delete() {
        tmp.clickActiveCTIRtoDelete();
    }
    @Then("User verify if the RM CTIReasons is deleted")
    public void user_Verify_first_active_CTIR_todelete() {
        tmp.verifyCTIRDelete(generateCTIR);
    }
    //Pagination in grid starts
    @Then("User clicks on CTIReasons grid pagination {string}")
    public void user_click_on_CTIReasonsPagination(String CTIReasonsPagination) throws InterruptedException {
        tmp.CTIReasonsPagination(CTIReasonsPagination);
    }
    //No of data per page
    @Then("User clicks on CTIReasons grid Data Per Page {int}")
    public void user_click_on_CTIReasonsDataPerPage(int CTIReasonsDataPerPage) throws InterruptedException {
        tmp.CTIReasonsDataPerPage(CTIReasonsDataPerPage);
    }
    //Service Request Reason
    @Then("User clicks on the Core masters RM ServiceRequestReasons {string} tab")
    public void user_click_on_core_masters_RM_SRR(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[6]";
        tmp.clickOnMasterRMSRR(xpath);
    }
    @Then("User clicks on button ServiceRequestReasons add {string}")
    public void user_click_on_ADD_SRR(String btnAddSRR) throws InterruptedException {
        tmp.clickOnAddbtnSRR(btnAddSRR);
    }
    @Then("User fills up the {string} ServiceRequestReasons details")
    public void user_fills_up_the_SRR(String type) throws IOException {
        generateSRR = dataGen.generateSRR();
        tmp.enterSRR(generateSRR);
        //tmp.selectType("Regret");
    }
    //DropDown New Function
    @When("User select the {string} Type ServiceRequestReasons dropdown")
    public void user_select_the_TypeServiceRequestReasons_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomServiceRequestReasonTypeDropdown();
        }
    }
    //
    @Then("User clicks on ServiceRequestReasons save button")
    public void userClicksSRRSaveButton() {
        tmp.userClicksSRRSaveButton();
    }
    @Then ("User verify if the ServiceRequestReasons is created")
    public void userVerifyIfSRRIsCreated() throws InterruptedException {
        tmp.verifySRRcreation(generateSRR);
    }
    @Then("User clicks on active ServiceRequestReasons in the grid")
    public void user_clicks_on_first_active_SRR_to_edit() {
        tmp.clickActiveSRRtoEdit();
    }
    @Then("User clicks on active RM ServiceRequestReasons in the grid to delete")
    public void user_clicks_on_first_active_SRR_to_delete() {
        tmp.clickActiveSRRtoDelete();
    }
    @Then("User verify if the RM ServiceRequestReasons is deleted")
    public void user_Verify_first_active_SRR_todelete() {
        tmp.verifySRRDelete(generateSRR);
    }
    //Pagination in grid starts
    @Then("User clicks on ServiceRequestReasons grid pagination {string}")
    public void user_click_on_ServiceRequestReasonsPagination(String ServiceRequestReasonsPagination) throws InterruptedException {
        tmp.ServiceRequestReasonsPagination(ServiceRequestReasonsPagination);
    }
    //No of data per page
    @Then("User clicks on ServiceRequestReasons grid Data Per Page {int}")
    public void user_click_on_ServiceRequestReasonsDataPerPage(int ServiceRequestReasonsDataPerPage) throws InterruptedException {
        tmp.ServiceRequestReasonsDataPerPage(ServiceRequestReasonsDataPerPage);
    }

    @When("user verify the inline error message {string} on Service Group")
    public void userVerifyInlineErrorMessageOnSG(String expectedErrorMessage) {
        By SGErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinServiceGrp_C_RequiredFieldValidator26");
        helperUtils.verifyInlineErrorMessage(SGErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Service Group Name")
    public void user_verify_chars_len_SG(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtServGrp"),maxLen, minLen);
    }
    //SAVE INLINE COMMON
    @When("User clicks on Save button For InLine Error RM")
    public void user_clicks_on_save_button_for_in_line_error_RM() {
        tmp.clickSaveButtonInlineErrorRM();
    }
    @When("user verify the inline error message {string} on Fault Category")
    public void userVerifyInlineErrorMessageOnFaultCategoryName(String expectedErrorMessage) {
        By FaultCatNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinTask_C_RequiredFieldValidator29");
        helperUtils.verifyInlineErrorMessage(FaultCatNameErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault Category Name")
    public void user_verify_chars_len_FaultCategoryName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinTask_C_radtxtTask"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault Code")
    public void userVerifyInlineErrorMessageOnFaultCodeName(String expectedErrorMessage) {
        By FaultCodeNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinSubTask_C_RequiredFieldValidator32");
        helperUtils.verifyInlineErrorMessage(FaultCodeNameErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault Code Name")
    public void user_verify_chars_len_FaultCodeName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtSubTask"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault Priority Name")
    public void user_verify_chars_len_FaultPriorityName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinPriority_C_radtxtPriority"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault Priority")
    public void userVerifyInlineErrorMessageOnFaultPriorityName(String expectedErrorMessage) {
        By FaultPriorityNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPriority_C_RequiredFieldValidator34");
        helperUtils.verifyInlineErrorMessage(FaultPriorityNameErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault Priority Notes")
    public void user_verify_chars_len_FaultPriorityNotes(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtNotes"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault Priority Notes")
    public void userVerifyInlineErrorMessageOnFaultPriorityNotes(String expectedErrorMessage) {
        By FaultPriorityNotesErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPriority_C_RequiredFieldValidator36");
        helperUtils.verifyInlineErrorMessage(FaultPriorityNotesErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault WO Source Name")
    public void user_verify_chars_len_FaultWOSOurceName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinWorkOrderSource_C_radtxtWOSourceName"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault WO Source")
    public void userVerifyInlineErrorMessageOnFaultWOSource(String expectedErrorMessage) {
        By FaultWOSourceErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinWorkOrderSource_C_RequiredFieldValidator1");
        helperUtils.verifyInlineErrorMessage(FaultWOSourceErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault Root Cause")
    public void user_verify_chars_len_FaultRootCause(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtRootCause"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault Root Cause")
    public void userVerifyInlineErrorMessageOnFaultRootCause(String expectedErrorMessage) {
        By FaultRootCauseErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinRootCause_C_RequiredFieldValidator5");
        helperUtils.verifyInlineErrorMessage(FaultRootCauseErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault Resolution Code")
    public void user_verify_chars_len_FaultResolutionCode(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtFailureCode"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault Resolution Code")
    public void userVerifyInlineErrorMessageOnFaultResolutionCode(String expectedErrorMessage) {
        By FaultResolutionCodeErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinFailureCode_C_RequiredFieldValidator7");
        helperUtils.verifyInlineErrorMessage(FaultResolutionCodeErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault Priority Change Reasons")
    public void user_verify_chars_len_FaultPriorityChangeReasons(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("txtPriorityReason"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault Priority Change Reasons")
    public void userVerifyInlineErrorMessageOnFaultPriorityChangeReasons(String expectedErrorMessage) {
        By FaultPriorityChangeReasonsErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPriorityReason_C_RequiredFieldValidator24");
        helperUtils.verifyInlineErrorMessage(FaultPriorityChangeReasonsErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault Contract Group Change Reasons")
    public void user_verify_chars_len_FaultContractGroupChangeReasons(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("txtContractReason"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault Contract Group Change Reasons")
    public void userVerifyInlineErrorMessageOnFaultContractGroupChangeReasons(String expectedErrorMessage) {
        By FaultContractGroupChangeReasonsErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinContractReason_C_RequiredFieldValidator39");
        helperUtils.verifyInlineErrorMessage(FaultContractGroupChangeReasonsErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault SLA Failure Justification")
    public void user_verify_chars_len_FaultSLAFailureJustification(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinSLAJustfication_C_RadTxtReasons"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on SLA Failure Justification")
    public void userVerifyInlineErrorMessageOnFaultSLAFailureJustification(String expectedErrorMessage) {
        By SLAFailureJustErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinSLAJustfication_C_RequiredFieldValidator37");
        helperUtils.verifyInlineErrorMessage(SLAFailureJustErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault CTIReasons")
    public void user_verify_chars_len_CTIReasons(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinCTIReason_C_RadTxtCTIReason"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on CTIReasons")
    public void userVerifyInlineErrorMessageOnCTIReasons(String expectedErrorMessage) {
        By CTIReasonsErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinCTIReason_C_RequiredFieldValidator25");
        helperUtils.verifyInlineErrorMessage(CTIReasonsErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Fault ServiceRequestReasons")
    public void user_verify_chars_len_ServiceRequestReasons(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinSRReason_C_radtxtReason"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Fault ServiceRequestReasons")
    public void userVerifyInlineErrorMessageOnsServiceRequestReasons(String expectedErrorMessage) {
        By ServiceReqReasonsErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinSRReason_C_rfvReason");
        helperUtils.verifyInlineErrorMessage(ServiceReqReasonsErrorLocator, expectedErrorMessage);
    }
}

