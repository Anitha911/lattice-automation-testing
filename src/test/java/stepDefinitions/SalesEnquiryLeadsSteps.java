package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SalesEnquiryLeadsPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.Duration;


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
            //start  from here
            else if (dropdownName.equalsIgnoreCase("MasterCategory")) {
                field = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProdmasterCategory_Input");
                elementUtils.click(field);
                options = By.cssSelector("[id='ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProdmasterCategory_DropDown'] li");
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            }

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
        //tmp.selectEnqCustomer("Alpha Properties");
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
    public void user_click_on_QuotSaveButton(Boolean QuotSave) {
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
}
