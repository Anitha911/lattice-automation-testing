package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SalesEnquiryLeadsPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class SalesEnquiryLeadsSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    HelperUtils helperUtils = new HelperUtils(driver);
    SalesEnquiryLeadsPage tmp = new SalesEnquiryLeadsPage(driver);
    //private ElementUtils elementUtils;
    ElementUtils elementUtils= new ElementUtils(driver);

    @Then("User clicks on Sales Enquiry Management {string} in side menu")
    public void user_click_on_DataConfig(String title) throws InterruptedException {
        String xpath = "//a[contains(@class,'nav-link active') and @id='13']";
        String id = "13";
        tmp.SalesEnquiryManagement(id);
    }
    @Then("User clicks on Sales Enquiry Management Leads {string} in side menu")
    public void user_click_on_Sales_Leads(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[1]/li[2]/a";
        tmp.clickOnSalesLeads(xpath);
    }

    @Then("User clicks on button Sales Add Enquiry {string}")
    public void user_click_on_Sales_AddEnquiry(String btnAddSalesEnquiry) throws InterruptedException {
        tmp.clickOnAddSalesEnquiry(btnAddSalesEnquiry);
    }
    //Pagination in grid starts
    @Then("User clicks on Sales Enquiry grid pagination {string}")
    public void user_click_on_Sales_EnquiryPagination(String GrdEnquiryPagination) throws InterruptedException {
        tmp.clickOnGrdSalesEnquiryPagination(GrdEnquiryPagination);
    }
    @Then("User clicks on Sales Package Store grid pagination {string}")
    public void user_click_on_Sales_PackagePagination(String GrdPackagePagination) throws InterruptedException {
        tmp.TransLeadsSalesB2CGridPagination(GrdPackagePagination);
    }
    @Then("User clicks on Sales Opportunities grid pagination {string}")
    public void user_click_on_Sales_OpportunitiesPagination(String GrdOpportunitiesPagination) throws InterruptedException {
        tmp.TransLeadsSalesOpportunitiesPagination(GrdOpportunitiesPagination);
    }
    //Pagination in grid ends
    //open quotation
    @Then("User clicks on Sales Enquiry Management Console Window {string} in side menu")
    public void user_click_on_Sales_Open_Quotations(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[3]/li[2]/a";
        tmp.clickOnSalesOpenQuotations(xpath);
    }
    @Then("User clicks on Export To Excel Console Window Open Quotations")
    public void user_clicks_on_Enquiry_Open_Quotation_export_to_excel_button() throws InterruptedException {
        String xpath = "//*[@id='ContentPlaceHolder1_btnExportToExcel']";
        tmp.SalesEnquiryOpenQuotationsExportToExcel(xpath);
    }
    //Open Quotation

    //Add Customer
    @Then("User clicks on button Sales Add Enquiry Add Customer {string}")
    public void user_click_on_Sales_AddEnquiryAddCustomer(String btnAddSalesEnquiryCustomer) throws InterruptedException {
        tmp.clickOnAddSalesEnquiryCustomer(btnAddSalesEnquiryCustomer);
    }
    @Then("User fills the Customer details")
    public void userFillsUpCustomerDetails() {
        tmp.enterCustomerName(dataGen.generateCustomerName());
        tmp.enterContactPerson(dataGen.generateContactPerson());
        tmp.enterCustMobile(dataGen.generateCustMobile());
        tmp.enterCustEmail(dataGen.generateCustEmail());
        tmp.enterCustAddress(dataGen.generateCustAddress());
       // tmp.selectClientType("B2B Corporate");
        //tmp.selectCountry("India");
        //tmp.selectCity("Chennai");
        //tmp.selectCustImp("VVIP");
    }
        //Dropdowns
        @When("User selects value in the {string} dropdown")
        public void user_selects_dropdown_and_options(String dropdownName) {
            By field;
            By options;

            if (dropdownName.equalsIgnoreCase("Type")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpClientType_Input");
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpClientType_DropDown'] li");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                elementUtils.click(field);
            }
            else if (dropdownName.equalsIgnoreCase("Country")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpCountry_Input");
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpCountry_DropDown'] li");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("City")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpCity_Input");
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpCity_DropDown'] li");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Customer Importance")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpCustomerImportance_Input");
                elementUtils.click(field);
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpCustomerImportance_DropDown'] li");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            //add enquiry
            else if (dropdownName.equalsIgnoreCase("Customer Name")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlCustomerName_Input");
                elementUtils.click(field);
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlCustomerName_DropDown'] li");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Enquiry Source")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlEnquirySource_Input");
                elementUtils.click(field);
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlEnquirySource_DropDown'] li");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Sales Person")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlSalesPerson_Input");
                elementUtils.click(field);
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlSalesPerson_DropDown'] li");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            //Product Category
            else if (dropdownName.equalsIgnoreCase("Product Master Category")) {
                 field = By.cssSelector("input[id*='ddlProdmasterCategory']");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.presenceOfElementLocated(field)
                );
                wait.until(ExpectedConditions.visibilityOf(dropdown));
                dropdown.click();
              options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProdmasterCategory_DropDown'] li");
            }
            else if (dropdownName.equalsIgnoreCase("Product Category")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductCategory_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductCategory_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Product SubCategory")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductSubCategory_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductSubCategory_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Payment Schedule")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlPaymentSchedule_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlPaymentSchedule_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("WO Type")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlWOType_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlWOType_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Fault Code")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFaultCode_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFaultCode_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("First PPM After")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFirstPPMAfter_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFirstPPMAfter_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            //Product Category Ends
            //Site Survey Requested starts
            else if (dropdownName.equalsIgnoreCase("Property")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlProperty_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlProperty_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Zone")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlZone_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlZone_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Sub Zone")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlSubzone_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlSubzone_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Base Unit")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlBaseUnit_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlBaseUnit_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            else if (dropdownName.equalsIgnoreCase("Assigned To")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlStatusAssignedTo_Input");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
                WebElement dropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(field)
                );
                dropdown.click();
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlStatusAssignedTo_DropDown'] li");
                //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }
            //Site Survey Requested Ends
            else {
                throw new IllegalArgumentException("Unknown dropdown name: " + dropdownName);
            }
            elementUtils.click(field);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
            elementUtils.waitForElementVisible(firstItem, 50);  //Uncomment when getting code
            helperUtils.clickRandomElement(options);
        }
        //Dropdowns
    @Then("User Clicks on Add Customer Save Button")
    public void user_click_on_AddCustSaveButton() {
        tmp.ClickAddCustSave();
    }
//Add Enquiry
    @Then("User fills the Enquiry details")
    public void userFillsUpEnquiryDetails() {
        tmp.selectEnqCustomer("Alpha Properties");
        //tmp.selectEnqSource("Online");
        tmp.selectEnquiryType("Adhoc");
        //tmp.selectEnquirySalesPerson("Wallace Hull");
        tmp.selectEnquiryService("BMS");
        tmp.enterEnquiryDesc(dataGen.generateEnqDesc());
    }
    @Then("User Clicks Enquiry Save Button")
    public void user_click_on_AddEnquirySaveButton() {
        tmp.ClickAddEnquirySave();
    }
    @Then("User clicks on Sales Enquiry Management Export to Excel button")
    public void user_clicks_on_Enquiry_export_to_excel_button() throws InterruptedException {
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.SalesEnquiryclickExportToExcel(xpath);
    }
    @Then("User clicks on first data in the grid to Open the Detail page")
    public void user_clicks_on_Enquiry_GridFirstData() throws InterruptedException  {
        String EnquiryGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']";
        tmp.SalesEnquiryClickGridFirstData(EnquiryGridFirstData);
    }
    //TIles Start
    @Then("User Clicks the Open Tile in Enquiry page")
    public void user_clicks_on_Enquiry_Open_Tile() throws InterruptedException {
        String xpath = "//*[@id='div1']";
        tmp.SalesEnquiryclickOpenTile(xpath);
    }
    @Then("User Clicks the Site Survey Requested Tile in Enquiry page")
    public void user_clicks_on_Enquiry_SiteSurvey_Requested_Tile() throws InterruptedException {
        String xpath = "//*[@id='div10']";
        tmp.SalesEnquiryClickSiteSurveyRequestedTile(xpath);
    }

    //Tiles
    //Edit Contact
    @Then("User Clicks on Edit Contact {string} in Enquiry Detail Page")
    public void user_click_on_Sales_EnquiryContactDetails(String btnEditEnquiryContactDetails) throws InterruptedException {
        tmp.clickOnEditEnquiryContactDetails(btnEditEnquiryContactDetails);
    }
    @Then("User clicks on Update button Edit Contact")
    public void user_click_on_UpdateEditContactButton() {
        tmp.UpdateEditContactButton();
    }
    //Edit Contact
    @Then("User Clicks on status Update Button {string} in Enquiry Detail Page")
    public void user_click_on_Sales_EnquiryStatusUpdate(String btnUpdateStatusSalesEnquiry) throws InterruptedException {
        tmp.clickOnUpdateStatusSalesEnquiry(btnUpdateStatusSalesEnquiry);
    }
    @Then("User fills the Enquiry Update Status Pop Up details")
    public void userFillsChangeStatusPopUpDetails() {
        tmp.enterProbablity(dataGen.generateMaxNoParticipants());
        tmp.enterComments(dataGen.generateComments());
        tmp.selectNewStatus("SKIP SITE SURVEY");
    }
    @Then("User Clicks on Enquiry Update Status Save Button")
    public void user_click_on_EnqUpdateStatusSaveButton() {
        tmp.ClickAddUpdateStatus();
    }
    //Site Survey RequestedStart
    @Then("User fills the Enquiry Site Survey Requested Update Status Pop Up details")
    public void userFillsChangeStatusPopUpSiteSurveyRequestedDetails() {
        tmp.enterProbablity(dataGen.generateMaxNoParticipants());
        tmp.enterComments(dataGen.generateComments());
        tmp.selectNewStatus("SITE SURVEY REQUESTED");
        tmp.selectType("Without Contract");
        //tmp.enterSiteSurveyDate(dataGen.generateCurrentDateSales());
        tmp.selectAssignedTo("Aarav Patel");
    }
    //Site Survey RequestedEnd
    //Not To Bid Start
    @Then("User fills the Enquiry Update Status Pop Up Not To Bid details")
    public void userFillsChangeStatusPopUpNotToBidDetails() {
        tmp.enterProbablity(dataGen.generateMaxNoParticipants());
        tmp.enterComments(dataGen.generateComments());
        tmp.selectNewStatus("NOT TO BID");
    }
    //Not to Bid End
    //Enquiry Cancelled Start
    @Then("User fills the Enquiry Update Status Pop Up Cancelled details")
    public void userFillsChangeStatusPopUpCancelledDetails() {
        tmp.enterProbablity(dataGen.generateMaxNoParticipants());
        tmp.enterComments(dataGen.generateComments());
        tmp.selectNewStatus("Cancelled");
    }
    //Enquiry Cancelled End
    //Follow Up
    @Then("User clicks on Customer Follow Up Button {string} in Enquiry Detail Page")
    public void user_click_on_Sales_FollowUp(String btnCustFollowUp) throws InterruptedException {
        tmp.clickOnCustomerFollowUp(btnCustFollowUp);
    }
    @Then("User enters the Customer Follow Up Details")
    public void userFillsCustFollowUpDetails() {
        tmp.enterFollowUpProbablity(dataGen.generateMaxNoParticipants());
        tmp.enterFollowUpComments(dataGen.generateComments());
        tmp.selectNewMode("Email");
        tmp.enternewFollowupDate(dataGen.generateCurrentDateSales());
    }
    @Then("User clicks the Customer Follow Up Button")
    public void user_click_on_CustFollowUpSaveButton() {
        tmp.ClickAddUpdateFollowUp();
    }
    //Notes
    @Then("User clicks on Notes {string} in Enquiry Detail Page")
    public void user_click_on_Sales_notes(String SctnNotes) throws InterruptedException {
        tmp.clickOnSalesNotes(SctnNotes);
    }
    @Then("User Clicks on Add Notes {string}")
    public void user_click_on_Sales_Addnotes(String AddNotes) throws InterruptedException {
        tmp.clickOnAddSalesNotes(AddNotes);
    }
    @Then("User enters the Notes Details")
    public void userFillsNotesDetails() {
        tmp.enterNotesComments(dataGen.generateComments());
        tmp.selectNoteType("Commercial");
    }
    @Then("User clicks the Notes Save Button")
    public void user_click_on_NotesSaveButton() {
        tmp.ClickNotesSave();
    }
    //Add Quotation
    @Then("User clicks on Sales Enquiry Management My Pending Actions Opportunities {string} in side menu")
    public void user_click_on_Sales_Oppurtunities(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[2]/li[2]/a";
        tmp.clickOnSalesOppurunities(xpath);
    }
    @Then("User clicks on first data in the opportunities grid to Open the Detail page")
    public void user_clicks_on_Enquiry_OppurGridFirstData() throws InterruptedException  {
        String EnquiryOppGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']";
        tmp.SalesEnquiryOppClickGridFirstData(EnquiryOppGridFirstData);
    }
    @Then("User Clicks on Quotation section in the left side menu {string} in Opportunities page")
    public void user_click_on_Sales_Opp(String btnOpp) throws InterruptedException {
        tmp.clickOnSalesOpp(btnOpp);
    }
    @When("User Clicks on Add Quotation {string} Button")
    public void user_click_on_Sales_AddnewQuot(String AddnewQuot) throws InterruptedException {
        tmp.clickOnAddQuotation(AddnewQuot);
    }
    @When("User Clicks on Quotation Details {string} Button")
    public void user_click_on_Sales_AddQuotLines(String AddnewQuotLines) throws InterruptedException {
        tmp.clickOnAddQuotLines(AddnewQuotLines);
    }
    @Then("User enters on Quotation Add Lines Details")
    public void userFillsAddLinesDetails() {
        tmp.enterAddLinesComments(dataGen.generateEnqDesc());
        tmp.enterAddLinesUnitPrice(dataGen.generatePrice());
    }
    @Then("User clicks the Quotation Save {string} Button")
    public void user_click_on_QuotSaveButton(String QuotSave) {
        tmp.ClickQuotSave(QuotSave);
    }
    @Then("User clicks the Quotation Save Finalize {string} Button")
    public void user_click_on_QuotFinalizeButton(String QuotSaveFinalize) {
        tmp.ClickQuotSaveFinalize(QuotSaveFinalize);
    }
    //Scope of work tab data enter in quotation detail page
    @Then("User Clicks Scope Of Work data in the {string} Tab")
    public void user_click_on_QuotScopeOfWork(String QuotScopeOfWork) {
        tmp.ClickQuotScopeOfWork(QuotScopeOfWork);
    }
    @Then("User enters Scope Of Work data Details")
    public void userFillsScopeDetails() {
        tmp.enterScope(dataGen.generateEnqDesc());
    }
    //Scope of work tab data enter in quotation detail page
    @Then("User clicks the Quotation Submit {string} Button")
    public void user_click_on_QuotFinalizeSubmitButton(String QuotSaveFinalizeSubmit) {
        tmp.ClickQuotSaveFinalizeSubmit(QuotSaveFinalizeSubmit);
    }
    @Then("User clicks on first data in the Quotations grid to Open the Detail page")
    public void user_clicks_on_Enquiry_QuotationGridFirstData() throws InterruptedException  {
        String QuotationGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_Quotations_grdQuotationGrp_ctl00__0']";
        tmp.SalesEnquiryQuotationClickGridFirstData(QuotationGridFirstData);
    }
    //cancel Quotation in quotation detail page Start
    @Then("User clicks on Cancel Quotation {string} Button")
    public void user_click_on_QuotCancelButton(String QuotCancelButton) {
        tmp.ClickQuotCancelButton(QuotCancelButton);
    }
    //cancel Quotation in quotation detail page End
    //export to excel Opportunities
    @Then ("User clicks on Export To Excel My Pending Actions Opportunities")
    public void user_clicks_on_Opportunities_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='radbtnExport']";
        tmp.OpportunitiesClickExportToExcel(xpath);
    }
    //Quotation
    //Package Store Front
    @Then("User clicks on Sales Enquiry Management Package Product {string} in side menu")
    public void user_click_on_Sales_Product_StoreFront(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[1]/li[3]/a";
        tmp.clickOnSalesProdFront(xpath);
    }
    @Then("User clicks on Sales Enquiry Management Package Product Add {string}")
    public void user_click_on_Sales_AddPackageProd(String btnAddPackageProd) throws InterruptedException {
        tmp.clickOnAddPackageProd(btnAddPackageProd);
    }
    @Then("User enters Product Master Category details")
    public void userFillsProductMasterDetails() {
        tmp.ProdIntName(dataGen.generateIntName());
        tmp.ProdDisplayName(dataGen.generateDisplayName());
        tmp.ProdShortDesc(dataGen.generateShortDesc());
        tmp.ProdInspecCharge(dataGen.generateInspecCharges());
        tmp.ProdMaxPPMCount(dataGen.generateMaxNoParticipants());
        //DropDowns
        tmp.selectProdMasterCat("Community Specific Package");
        tmp.selectProdCat("Gold Reactive Package");
        tmp.selectProdSubCat("Gold Reactive Package");
        tmp.selectPaymentSchedule("Yearly");
        tmp.selectWOType("Reactive Maintenance");
        tmp.selectFaultCode("Civil Works  /  Road Signs  /  Signs-Painting");
        tmp.selectPPMAfter("3");
    }
    @Then("User Clicks on Add Product Save Button")
    public void user_click_on_AddProdButton() {
        tmp.ClickAddProdSave();
    }
    //export to excel Product Package
    @Then ("User clicks on Export To Excel Product Store Front")
    public void user_clicks_on_ProdPackage_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.ProdPackageClickExportToExcel(xpath);
    }
    @Then("User clicks on first data in the Product Store Front grid to Open the Detail page")
    public void user_clicks_on_Enquiry_ProStoreGridFirstData() throws InterruptedException  {
        String ProdPackGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_grdB2CProduct_ctl00__0']";
        tmp.SalesEnquiryProdpackClickGridFirstData(ProdPackGridFirstData);
    }
    @Then("User Clicks the Edit Product Store Front {string} Button")
    public void user_click_on_Sales_EditProdStoreFront(String btnEditProdPackage) throws InterruptedException {
        tmp.clickOnEditProdPackage(btnEditProdPackage);
    }
    @Then("User Clicks the Product Store Front Update Button")
    public void user_click_on_UpdateProdPackageButton() {
        tmp.ClickUpdateProdSave();
    }
    @Then("User clicks Product Pricing {string} in the side menu")
    public void user_click_on_PackProdPricing(String PackProdPricing) throws InterruptedException {
        tmp.PackProdPricing(PackProdPricing);
    }
    @Then("User clicks Add New Product Pricing {string} Button")
    public void user_click_on_Sales_AddNewProdPricing(String AddNewProdPricing) throws InterruptedException {
        tmp.clickOnAddNewProdPricing(AddNewProdPricing);
    }
    @Then("User enters Product Pricing details")
    public void userFillsProductPricingDetails() {
        tmp.ProdPrice(dataGen.generateInspecCharges());
        tmp.ProdValidFrom(dataGen.generateCurrentDate());
        tmp.ProdValidTo(dataGen.generateCurrentDate());
        //DropDowns
        tmp.selectProdBusinessType("Residential");
        tmp.selectProdBusinessSubType("Apartments");
        tmp.selectProdBusinessUnitSizeType("Studio Apartment");
        tmp.selectProdArea("The Garden Apartments");
    }
    @Then("User Clicks on Product Pricing Save Button")
    public void user_click_on_ProdPricingSaveButton() {
        tmp.ProdPricingSaveButton();
    }
    //Edit Prod pricing
    @Then("User clicks Product Pricing Edit {string} button")
    public void user_click_on_Sales_EditProdPricing(String EditProdPricing) throws InterruptedException {
        tmp.clickOnEditProdPricing(EditProdPricing);
    }
    //Service Product Rate Card
    @Then("User clicks on Sales Enquiry Management Rate Card {string} in side menu")
    public void user_click_on_Sales_Rate_Card(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[1]/li[4]/a";
        tmp.clickOnSalesRateCard(xpath);
    }
    @Then("User clicks on Sales Enquiry Management Rate Card Add {string}")
    public void user_click_on_Sales_AddRateCard(String btnAddRateCard) throws InterruptedException {
        tmp.clickOnAddRatecard(btnAddRateCard);
    }
    @Then("User enters Rate Card details")
    public void userFillsRateCardDetails() {
        tmp.RateCardNo(dataGen.generateDisplayName());
        tmp.RateCardName(dataGen.generateShortDesc());
    }
    @Then("User Clicks on Add RateCard Save Button")
    public void user_click_on_AddrateCardButton() {
        tmp.ClickAddRateCardSave();
    }
    @Then("User clicks on first data in the Rate Card grid to Open the Detail page")
    public void user_clicks_on_Enquiry_RCGridFirstData() throws InterruptedException  {
        String RCGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_GrdRateCard_ctl00__0']";
        tmp.SalesEnquiryRCClickGridFirstData(RCGridFirstData);
    }
    @Then("User Clicks the Edit RateCard {string} Button")
    public void user_click_on_Sales_EditRateCard(String btnEditRateCard) throws InterruptedException {
        tmp.clickOnEditRatecard(btnEditRateCard);
    }
    @Then("User Clicks the Rate Card Update Button")
    public void user_click_on_UpdtaRateCardButton() {
        tmp.ClickUpdateRateCard();
    }
    //Delete Rate Card
    @Then("User clicks on first Valid Product Rate Card to delete")
    public void user_clicks_on_first_Prod_rateCard_to_delete() {
        tmp.clickRateCardtoDelete();
    }
    //export to excel Rate Card
    @Then ("User clicks on Export To Excel Product Rate Card")
    public void user_clicks_on_RateCard_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='lnkExport']";
        tmp.RateCardClickExportToExcel(xpath);
    }
    //Awaiting Approval detail page
    @Then("User clicks on Sales Enquiry Management Awaiting Approval {string} in side menu")
        public void user_click_on_Awaiting_Approval(String title) throws InterruptedException {
            String xpath = "//*[@id='tab-sales']/div[2]/div/ul[2]/li[3]/a";
            tmp.clickOnSalesAwaitingApproval(xpath);
        }
    //export to excel Awaiting Approval
    @Then ("User clicks on Export To Excel My Pending Actions Awaiting Approval")
    public void user_clicks_on_awaiting_Approval_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='radbtnExport']";
        tmp.AwaitingQuotationClickExportToExcel(xpath);
    }
    @Then("User clicks on first data in the Awaiting Approval grid to Open the Detail page")
    public void user_clicks_on_Enquiry_AwaitingApproval_GridFirstData() throws InterruptedException  {
        String AwaitingApprovalGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']";
        tmp.AwaitingApprovallickGridFirstData(AwaitingApprovalGridFirstData);
    }
    //Awaiting Quotation Approval detail page
    @Then("User clicks on Sales Enquiry Management Awaiting Quotation Approval {string} in side menu")
    public void user_click_on_Awaiting_Quot_Approval(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[2]/li[4]/a";
        tmp.clickOnSalesAwaitingQuotationApproval(xpath);
    }
    @Then("User clicks on first data in the Awaiting Quotation Approval grid to Open the Detail page")
    public void user_clicks_on_Enquiry_AwaitingQuotApproval_GridFirstData() throws InterruptedException  {
        String AwaitingQuotApprovalGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_grdQTN_ctl00__0']";
        tmp.AwaitingQuotApprovallickGridFirstData(AwaitingQuotApprovalGridFirstData);
    }
    //export to excel Awaiting Quotation Approval
    @Then ("User clicks on Export To Excel My Pending Actions Awaiting Quotation Approval")
    public void user_clicks_on_awaiting_Quot_Approval_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.AwaitingQuotationApprovalClickExportToExcel(xpath);
    }
    //Upcoming Follow Up detail page
    @Then("User clicks on Sales Enquiry Management Upcoming Follow Up {string} in side menu")
    public void user_click_on_Upcoming_FollowUp(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[4]/li[2]/a";
        tmp.clickOnSalesUpcomingFollowup(xpath);
    }
    @Then("User clicks on first data in the Upcoming Follow Up grid to Open the Detail page")
    public void user_clicks_on_Enquiry_Upcoming_FollowUp_GridFirstData() throws InterruptedException  {
        String UpcomingFollowUpGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']";
        tmp.UpcomingFollowUpGridFirstData(UpcomingFollowUpGridFirstData);
    }
    //Awaiting Order
    @Then("User clicks on Sales Enquiry Management Awaiting Order {string} in side menu")
    public void user_click_on_Awaiting_Order(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[4]/li[3]/a";
        tmp.clickOnSalesAwaitingOrder(xpath);
    }
    @Then("User clicks on first data in the Awaiting Order grid to Open the Detail page")
    public void user_clicks_on_Enquiry_Awaiting_Order_GridFirstData() throws InterruptedException  {
        String AwaitingOrderGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']";
        tmp.AwaitingOrderGridFirstData(AwaitingOrderGridFirstData);
    }
    //Archives Sales Order
    @Then("User clicks on Sales Enquiry Management Archives Sales Order {string} in side menu")
    public void user_click_on_ArchivesSales_Order(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[5]/li[2]/a";
        tmp.clickOnSalesArchivesSalesOrder(xpath);
    }
    @Then("User clicks on first data in the Archives Sales Order grid to Open the Detail page")
    public void ArchivesSalesOrderGridFirstData() throws InterruptedException  {
        String ArchivesSalesOrderGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']";
        tmp.ArchivesSalesOrderGridFirstData(ArchivesSalesOrderGridFirstData);
    }
    //Sales Order Lost
    @Then("User clicks on Sales Enquiry Management Sales Order lost {string} in side menu")
    public void user_click_on_Sales_OrderLost(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[5]/li[3]/a";
        tmp.clickOnSalesOrderLost(xpath);
    }
    @Then("User clicks on first data in the Sales Order lost grid to Open the Detail page")
    public void SalesOrderLostGridFirstData() throws InterruptedException  {
        String SalesOrderlostGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']";
        tmp.SalesOrderLostGridFirstData(SalesOrderlostGridFirstData);
    }
}
