package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SalesMasterPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;

public class SalesMasterSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    SalesMasterPage tmp = new SalesMasterPage(driver);
    public static String generateClientType;
    public static String generateEnquiryType;
    public static String generateEnquirySource;
    public static String generateEnquiryTandC;
    public static String generateEnquiryExclusions;
    public static String generateEnquiryPaymentTerms;
    HelperUtils helperUtils = new HelperUtils(driver);


    @Then("User clicks on Data Config {string} in side menu")
    public void user_click_on_DataConfig(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//a[contains(@class,'nav-link active') and @id='10']";
        String id = "10";
        tmp.clickOnDataConfiguration(id);
    }
    @Then("User clicks on the additional masters Sales {string} tab")
    public void user_click_on_additional_masters_Sales(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//*[@id='tab-datasetup']/div[2]/div/ul[2]/li[2]/a";
        tmp.clickOnadditionalmastersSales(xpath);
    }
    @Then("User clicks on button Sales client types add {string}")
    public void user_click_on_Sales_ClientTypesAdd(String btnAddSalesClientType) throws InterruptedException {
        tmp.clickOnAddSalesclientType(btnAddSalesClientType);
    }

    @Then("User fills up the {string} details")
    public void user_fill_up_the_client_typedetails(String type) throws IOException {
        generateClientType = dataGen.generateClientType();
        tmp.enterClientType(generateClientType);
    }
    @Then("User clicks on Client Type save button")
    public void userClicksOnClientTypeSaveButton() {
        tmp.userClicksOnClientTypeSaveButton();
    }
    @Then("User verify if the Client Type is created")
    public void user_verify_the_success_message_after_creating_Clienttype() {
        tmp.verifyClientTypecreation(generateClientType);
    }
    @Then("User clicks on active Client Type in the grid")
    public void user_clicks_on_first_active_Client_Type_to_edit() {
        tmp.clickActiveClientTypetoEdit();
    }
    @Then("User clicks on active Client Type in the grid to delete")
    public void user_clicks_on_first_active_Client_Type_to_delete() {
        tmp.clickActiveClientTypetoDelete();
    }
    @Then("User verify if the Client Type is deleted")
    public void user_Verify_first_active_Client_type_to_delete() {
        tmp.verifyClientTypeDelete(generateClientType);
    }
    @Then ("User clicks on Sales Client Type Export to Excel button")
    public void user_clicks_on_sales_clienttype_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.ClientTypeclickExportToExcel(xpath);
    }
    //Enquiry Type
    @Then ("User clicks on the sales master {string} in side menu")
    public void user_click_on_EnquiryType(String title) throws InterruptedException {
        String xpath = "//*[@id=ctl00_ContentPlaceHolder1_RadAjxPanel1/div/div/div/div[1]/div/div/div[1]/div/div/div/a[2]";
        tmp.clickOnEnquiryType(xpath);
    }
    @Then("User clicks on button Sales Enquiry types add {string}")
    public void user_click_on_Sales_EnquiryTypesAdd(String btnAddSalesEnquiryType) throws InterruptedException {
        tmp.clickOnAddSalesenquiryType(btnAddSalesEnquiryType);
    }
    @Then("User fills up the Enquiry type {string} details")
    public void user_fill_up_the_enquiry_typedetails(String type) throws IOException {
        generateEnquiryType = dataGen.generateEnquiryType();
        tmp.enterEnquiryType(generateEnquiryType);
    }
    @Then("User clicks on Enquiry Type save button")
    public void userClicksOnEnquiryTypeSaveButton() {
        tmp.userClicksOnEnquiryTypeSaveButton();
    }
    @Then("User verify if the Enquiry Type is created")
    public void user_verify_the_success_message_after_creating_Enquirytype() {
        tmp.verifyEnquiryTypecreation(generateEnquiryType);
    }
    @Then("User clicks on active Enquiry Type in the grid")
    public void user_clicks_on_first_active_Enquiry_Type_to_edit() {
        tmp.clickActiveEnquiryTypetoEdit();
    }
    @Then("User clicks on active Enquiry Type in the grid to delete")
    public void user_clicks_on_first_active_Enquiry_Type_to_delete() {
        tmp.clickActiveEnquiryTypetoDelete();
    }
    @Then("User verify if the Enquiry Type is deleted")
    public void user_Verify_first_active_Enquiry_type_to_delete() {
        tmp.verifyEnquiryTypeDelete(generateEnquiryType);
    }
    @Then ("User clicks on Sales Enquiry Type Export to Excel button")
    public void user_clicks_on_sales_enquiry_type_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.EnquiryTypeclickExportToExcel(xpath);
    }
    //Enquiry Sources
    @Then ("User clicks on the sales master source {string} in side menu")
    public void user_click_on_EnquirySource(String title) throws InterruptedException {
        String xpath = "//*[@id=ctl00_ContentPlaceHolder1_RadAjxPanel1]/div/div/div/div[1]/div/div/div[1]/div/div/div/a[3]";
        tmp.clickOnEnquirySource(xpath);
    }
    @Then("User clicks on button Sales Enquiry Source add {string}")
    public void user_click_on_Sales_EnquirySourceAdd(String btnAddSalesEnquirySource) throws InterruptedException {
        tmp.clickOnAddSalesenquirySource(btnAddSalesEnquirySource);
    }
    @Then("User fills up the Enquiry Source {string} details")
    public void user_fill_up_the_enquiry_Sourcedetails(String type) throws IOException {
        generateEnquirySource = dataGen.generateEnquirySource();
        tmp.enterEnquirySource(generateEnquirySource);
    }
    @Then("User clicks on Enquiry Source save button")
    public void userClicksOnEnquirySourceSaveButton() {
        tmp.userClicksOnEnquirySourceSaveButton();
    }
    @Then("User verify if the Enquiry Source is created")
    public void user_verify_the_success_message_after_creating_Enquirysource() {
        tmp.verifyEnquirySourcecreation(generateEnquirySource);
    }
    @Then("User clicks on active Enquiry Source in the grid")
    public void user_clicks_on_first_active_Enquiry_Source_to_edit() {
        tmp.clickActiveEnquirySourcetoEdit();
    }
    @Then("User clicks on active Enquiry Source in the grid to delete")
    public void user_clicks_on_first_active_Enquiry_Source_to_delete() {
        tmp.clickActiveEnquirySourcetoDelete();
    }
    @Then("User verify if the Enquiry Source is deleted")
    public void user_Verify_first_active_Enquiry_source_to_delete() {
        tmp.verifyEnquirySourceDelete(generateEnquirySource);
    }
    @Then ("User clicks on Sales Enquiry Source Export to Excel button")
    public void user_clicks_on_sales_enquiry_source_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.EnquirySourceclickExportToExcel(xpath);
    }
    //Enquiry T and C
    @Then("User clicks on the sales master Terms and Conditions {string} in side menu")
    public void user_click_on_Sales_master_TandC(String btnAddSalesMasterTandC) throws InterruptedException {
        tmp.clickOnSalesMasterTandC(btnAddSalesMasterTandC);
    }
    @Then("User clicks on button Sales Terms and Conditions add {string}")
    public void user_click_on_Sales_master_TandCAdd(String btnAddSalesMasterTandC) throws InterruptedException {
        tmp.clickOnAddSalesMasterTandC(btnAddSalesMasterTandC);
    }
    @Then("User fills up the Enquiry Terms and Conditions {string} details")
    public void user_fill_up_the_enquiry_TandCDetails(String type) throws IOException {
        generateEnquiryTandC = dataGen.generateEnquiryTandC();
        tmp.enterEnquiryTandC(generateEnquiryTandC);
    }
    @Then("User clicks on Sales T and C save button")
    public void userClicksOnEnquiryTandCSaveButton() {
        tmp.userClicksOnEnquiryTandCSaveButton();
    }
    @Then("User verify if the Sales T and C is created")
    public void user_verify_the_Sales_TandC() {
        tmp.verifyEnquiryTandCcreation(generateEnquiryTandC);
    }
    @Then("User clicks on active T and C in the grid")
    public void user_clicks_on_first_active_TandC_to_edit() {
        tmp.clickActiveTandCtoEdit();
    }
    @Then("User clicks on Sales T and C update button")
    public void userClicksOnEnquiryTandCUpdateButton() {
        tmp.userClicksOnEnquiryTandCUpdateButton();
    }
    @Then("User clicks on active T and C in the grid to delete")
    public void user_clicks_on_first_active_TandC_to_delete() {
        tmp.clickActiveTandCtoDelete();
    }
    @Then("User verify if the T and C is deleted")
    public void user_Verify_TandC_delete() {
        tmp.verifyTandCDelete(generateEnquiryTandC);
    }
    @Then ("User clicks on T and C Export to Excel Button")
    public void user_clicks_on_sales_TandC_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.EnquiryTandCclickExportToExcel(xpath);
    }
    //Enquiry Sales Exclusion
    @Then("User clicks on the sales master Exclusions {string} in side menu")
    public void user_click_on_Sales_master_Exclusion(String btnAddSalesExclusion) throws InterruptedException {
        tmp.clickOnSalesMasterExclusion(btnAddSalesExclusion);
    }
    @Then("User clicks on button Sales Sales Exclusion add {string}")
    public void user_click_on_Sales_master_ExclusionsAdd(String btnAddSalesMasterExclusion) throws InterruptedException {
        tmp.clickOnAddSalesMasteExclusions(btnAddSalesMasterExclusion);
    }
    @Then("User fills up the Enquiry Sales Exclusion {string} details")
    public void user_fill_up_the_enquiry_ExclusionsDetails(String type) throws IOException {
        generateEnquiryExclusions = dataGen.generateEnquiryExclusions();
        tmp.enterEnquiryExclusions(generateEnquiryExclusions);
    }
    @Then("User clicks on Sales Exclusion save button")
    public void userClicksOnEnquiryExclusionsSaveButton()
    {
        tmp.userClicksOnEnquiryExclusionsSaveButton();
    }
    @Then("User verify if the Sales Exclusion is created")
    public void user_verify_the_Sales_Exclusions() {

        tmp.verifyEnquiryExclueionscreation(generateEnquiryExclusions);
    }
    @Then("User clicks on active Enquiry Exclusion in the grid")
    public void user_clicks_on_first_active_Exclusion_to_edit() {
        tmp.clickActiveEnquiryExclusiontoEdit();
    }
    @Then("User clicks on active sales master Exclusions in the grid to delete")
    public void user_clicks_on_first_active_Exclusions_to_delete()
    {
        tmp.clickActiveExclusiontoDelete();
    }
    @Then("User verify if the sales master Exclusions is deleted")
    public void user_Verify_Exclusions_delete()
    {
        tmp.verifyExclusionsDelete(generateEnquiryExclusions);
    }
    @Then ("User clicks on Exclusions Export to Excel Button")
    public void user_clicks_on_sales_Exclusions_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.EnquiryExclusionclickExportToExcel(xpath);
    }
    //Payment Terms
    @Then("User clicks on the sales master Payment Terms {string} in side menu")
    public void user_click_on_Sales_master_PaymentTerms(String btnAddSalesMasterPaymentTerms) throws InterruptedException {
        tmp.clickOnSalesMasterPaymentTerms(btnAddSalesMasterPaymentTerms);
    }
    @Then("User clicks on button Sales Payment Terms add {string}")
    public void user_click_on_Sales_master_PaymentTermsAdd(String btnAddSalesMasterPaymentTerms) throws InterruptedException {
        tmp.clickOnAddSalesMasterPaymentTerms(btnAddSalesMasterPaymentTerms);
    }
    @Then("User fills up the Enquiry Payment Terms {string} details")
    public void user_fill_up_the_enquiry_PaymentTerms(String type) throws IOException {
        generateEnquiryPaymentTerms = dataGen.generateEnquiryPaymentTerms();
        tmp.enterEnquiryPaymentTerms(generateEnquiryPaymentTerms);
    }
    @Then("User clicks on Payment Terms save button")
    public void userClicksOnEnquiryPaymentTermsSaveButton()
    {
        tmp.userClicksOnEnquiryPaymentTermsSaveButton();
    }
    @Then("User verify if the Payment Terms is created")
    public void user_verify_the_Sales_PaymentTerms() {
        tmp.verifyEnquiryPaymentTermsCreate(generateEnquiryPaymentTerms);
    }
    @Then("User clicks on active Enquiry Payment Terms in the grid")
    public void user_clicks_on_first_active_PaymentTerms_to_edit() {
        tmp.clickActivePaymentTermstoEdit();
    }
    @Then("User clicks on Payment Terms update button")
    public void userClicksOnPaymentTermsUpdateButton() {
        tmp.userClicksOnEnquiryPaymentTermsUpdateButton();
    }
    @Then("User clicks on active sales master Payment Terms in the grid to delete")
    public void user_clicks_on_first_active_Payment_Terms_to_delete()
    {
        tmp.clickActivePaymentTermstoDelete();
    }
    @Then("User verify if the sales master Payment Terms is deleted")
    public void user_Verify_Payment_Terms_delete()
    {
        tmp.verifyPaymentTermsDelete(generateEnquiryPaymentTerms);
    }
    @Then ("User Clicks on Export to Excel Button")
    public void user_clicks_on_sales_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.EnquiryclickExportToExcel(xpath);
    }
    //Quotation Types
    @Then("User clicks on the sales master Quotation Types {string} in side menu")
    public void user_click_on_Sales_master_QuotationTypes(String btnEditSalesMasterQuotationType) throws InterruptedException {
        tmp.clickOnSalesMasterQuotationTypes(btnEditSalesMasterQuotationType);
    }
    @Then("User clicks on active Enquiry Quotation Type in the grid to Edit")
    public void user_clicks_on_first_active_Quotation_Type_to_edit() {
        tmp.clickActiveQuotationTypetoEdit();
    }
    @Then("User clicks on Quotation Types update button")
    public void userClicksOnQuotationTypesUpdateButton() {
        tmp.userClicksOnEnquiryQuotTypesUpdateButton();
    }
    @Then("User clicks on active sales master Quotation Types in the grid to delete")
    public void user_clicks_on_first_active_Quotation_Types_to_delete()
    {
        tmp.clickActiveQuotationTypestoDelete();
    }
    //Quotation Line Types Only EXPORT TO EXCEL IS POSSIBLE
    @Then("User clicks on the sales master Quotation Line Types {string} in side menu")
    public void user_click_on_Sales_master_QuotationLineTypes(String btnEditSalesMasterQuotationLineType) throws InterruptedException {
        tmp.clickOnSalesMasterQuotationLineTypes(btnEditSalesMasterQuotationLineType);
    }
    //Quotation Other Cost Only EXPORT TO EXCEL IS POSSIBLE
    @Then("User clicks on the sales master Quotation Other Cost {string} in side menu")
    public void user_click_on_Sales_master_QuotationOtherCost(String btnEditSalesMasterOtherCost) throws InterruptedException {
        tmp.clickOnSalesMasterOtherCost(btnEditSalesMasterOtherCost);
    }
    @Then("User Clicks on the S M Other Cost sort on item code {string}")
    public void user_click_on_Sales_master_Sort_item_Code_OtherCost(String btnCostSort) throws InterruptedException {
        tmp.clickOnSaleOtherCostSortItemCode(btnCostSort);
    }
    //Negative scenarios
    @When("user verify the chars min len as {int} and max len as {int} on Sales Client Type")
    public void user_verify_chars_len_ClientTypeName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtClientType"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Sales Client Type")
    public void userVerifyInlineErrorMessageOnClientType(String expectedErrorMessage) {
        By clientTypeErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinClientType_C_RequiredFieldValidator2");
        helperUtils.verifyInlineErrorMessage(clientTypeErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Sales Enquiry Type")
    public void user_verify_chars_len_EnquiryTypeName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtEnquiryName"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Sales Enquiry Type")
    public void userVerifyInlineErrorMessageOnEnquiryType(String expectedErrorMessage) {
        By EnquiryTypeErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEnquirytype_C_RequiredFieldValidator1");
        helperUtils.verifyInlineErrorMessage(EnquiryTypeErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Sales Enquiry Source")
    public void user_verify_chars_len_EnquirySourceName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtEnquirySource"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Sales Enquiry Source")
    public void userVerifyInlineErrorMessageOnEnquirySource(String expectedErrorMessage) {
        By EnquirySourceErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEnquirySource_C_RequiredFieldValidator3");
        helperUtils.verifyInlineErrorMessage(EnquirySourceErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Terms and Conditions")
    public void user_verify_chars_len_EnquiryTandC(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("RadtxtTermsConditions"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Default Value")
    public void user_verify_chars_len_EnquiryTandCDefault(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("RadtxtDefault"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Sales Terms And Conditions")
    public void userVerifyInlineErrorMessageOnEnquiryTandC(String expectedErrorMessage) {
        By EnquiryTandCErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinTermsAndCon_C_RequiredFieldValidator6");
        helperUtils.verifyInlineErrorMessage(EnquiryTandCErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Exclusions")
    public void user_verify_chars_len_EnquiryExclusions(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("RadtxtExclusions"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Sales Exclusions")
    public void userVerifyInlineErrorMessageOnEnquiryExclusion(String expectedErrorMessage) {
        By EnquiryExclusionErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinExclusion_C_RequiredFieldValidator5");
        helperUtils.verifyInlineErrorMessage(EnquiryExclusionErrorLocator, expectedErrorMessage);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Payment Terms")
    public void user_verify_chars_len_EnquiryPT(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtPaymentTerms"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} on P T Default Value")
    public void user_verify_chars_len_EnquiryPTDefault(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("RadTxtPayDefault"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Sales Payment Terms")
    public void userVerifyInlineErrorMessageOnEnquiryPT(String expectedErrorMessage) {
        By EnquiryPTErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinPaymentTerms_C_RequiredFieldValidator4");
        helperUtils.verifyInlineErrorMessage(EnquiryPTErrorLocator, expectedErrorMessage);
    }
    //Negative scenarios

}

