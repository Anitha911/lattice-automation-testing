package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AuditInspections;
import pages.PropertyManagement;
import utils.DriverFactory;
import utils.HelperUtils;


public class PropertyManagementMasterStep {
    private final WebDriver driver = DriverFactory.getDriver();
    AuditInspections auditInspections = new AuditInspections(driver);
    private final HelperUtils helperUtils = new HelperUtils(driver);


    @When("User get Contact Type default code field value")
    public void user_get_Contact_Type_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContact_C_txtContactTypeCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        PropertyManagement.testDataModel.setContactTypeCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User verify special characters are not allowed in Contact Type")
    public void user_verify_special_characters_not_allowed_in_Contact_Type() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContact_C_radtxtContact']");
        helperUtils.verifySpecialCharactersNotAllowed(shortCodeLocator);
    }
    @And("User Enters Contact Type Name")
    public void user_enters_Contact_Type_name() {
        PropertyManagement.enterContactTypeName();
    }
    @When("User clicks on Save button in Property Management Section")
    public void User_clicks_on_save_button(){
        PropertyManagement.clickSaveButton();
    }
    @Then("User verifies added ContactType details in table")
    public void user_verifies_added_ContactType_details_in_table(){
        PropertyManagement.verifyContactTypeCode();
        PropertyManagement.verifyContactType();
    }
    @When("User select the Contact Type record to edit")
    public void user_select_the_Contact_Type_record_to_edit() {
        PropertyManagement.getRandomContactTypeRecord();
    }
    @Then("User clicks on first available Record to delete")
    public void user_clicks_on_first_available_Record_to_delete() {
        PropertyManagement.clickPropertyDeleteButton();
    }
    @When("User verify if the Property Record is deleted")
    public void user_verify_Property_Record_deleted() {
        PropertyManagement.verifyNoPropertyRecordPresent();
    }
    @And("User clicks on the {string} Child tab in Data Configuration Page")
    public void user_clicks_on_the_Enforcing_Authority_tab(String tabname) {
        PropertyManagement.clickOnElementTabSelected(tabname);
    }
    @And("User clicks on Property Save button For InLine Error")
    public void user_clicks_on_Property_save_button_for_in_line_error() {
        PropertyManagement.clickPropertySaveButtonInlineError();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Contact Type Code")
    public void user_verify_chars_len_Contact_Type_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContact_C_txtContactTypeCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Contact Type")
    public void user_verify_chars_len_Contact_Type(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContact_C_radtxtContact']"),maxLen, minLen);
    }
    @Then("user verify the inline error message {string} on Data Configuration")
    public void verify_inline_error_msg_in_Data_Configuration(String error){
        By errorPath = By.xpath("(//span[contains(@id,'ctl00_ContentPlaceHolder1') and text()='"+error+"'])[1]");
        helperUtils.verifyInlineErrorMessage(errorPath, error);
    }
    @When("user get Client Type default code field value")
    public void user_get_Client_Type_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_txtClientCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        PropertyManagement.testDataModel.setPropertyManagerCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User verify special characters are not allowed in Property Manager")
    public void user_verify_special_characters_not_allowed_in_Property_Manager() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_radtxtClient']");
        helperUtils.verifySpecialCharactersNotAllowed(shortCodeLocator);
    }
    @And("User Enters Property Manager Name")
    public void user_enters_Property_Manager_name() {
        PropertyManagement.enterPropertyManagerName();
    }
    @Then("User verifies added Property Manager details in table")
    public void user_verifies_added_PropertyManager_details_in_table() throws InterruptedException {
        PropertyManagement.verifyPropertyManagerCode();
        PropertyManagement.verifyPropertyManager();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Property Manager Code")
    public void user_verify_chars_len_Property_Manager_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_txtClientCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Property Manager")
    public void user_verify_chars_len_Property_Manager(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_radtxtClient']"),maxLen, minLen);
    }
    @When("User select the Property Manager record to edit")
    public void user_select_the_Property_Manager_record_to_edit() {
        PropertyManagement.getRandomPropertyManagerRecord();
    }
    @When("user get Contract Type default code field value")
    public void user_get_Contract_Type_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_txtContractCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        PropertyManagement.testDataModel.setContractTypeCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User verify special characters are not allowed in Contract Type")
    public void user_verify_special_characters_not_allowed_in_Contract_Type() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_radtxtContractType']");
        helperUtils.verifySpecialCharactersNotAllowed(shortCodeLocator);
    }
    @And("User Enters Contract Type Name")
    public void user_enters_Contract_name() {
        PropertyManagement.enterContractTypeName();
    }
    @And("User clicks random checkbox in Document Type")
    public void user_clicks_random_checkbox_documentType() {
        PropertyManagement.randomcheckboxApplicabledocType();
    }
    @And("User clicks on applicable Check boxes")
    public void user_clicks_on_applicable_Check_boxes() {
        PropertyManagement.clickApplicableCheckboxes();
    }
    @Then("User verifies added Contract Type details in table")
    public void user_verifies_added_Contract_Type_details_in_table() throws InterruptedException {
        PropertyManagement.verifyContractTypeCode();
        PropertyManagement.verifyContractType();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Contract Type Code")
    public void user_verify_chars_len_Contract_Type_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_txtContractCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Contract Type")
    public void user_verify_chars_len_Contract_Type(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_radtxtContractType']"),maxLen, minLen);
    }
    @When("User select the Contract Type record to edit")
    public void user_select_the_Contract_Type_record_to_edit() {
        PropertyManagement.getRandomContractTypeRecord();
    }
    @When("user get Costing Type default code field value")
    public void user_get_Costing_Type_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinCostingType_C_txtCostingTypeCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        PropertyManagement.testDataModel.setCostingTypeCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User verify special characters are not allowed in Costing Type")
    public void user_verify_special_characters_not_allowed_in_Costing_Type() {
        By shortCodeLocator = By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_RadWinCostingType_C_radtxtCostingType']");
        helperUtils.verifySpecialCharactersNotAllowed(shortCodeLocator);
    }
    @And("User Enters Costing Type Name and check box")
    public void user_enters_Costing_name() {
        PropertyManagement.enterCostingTypeName();
    }
    @Then("User verifies added Costing Type details in table")
    public void user_verifies_added_CostingType_details_in_table() throws InterruptedException {
        PropertyManagement.verifyCostingTypeCode();
        PropertyManagement.verifyCostingType();
        PropertyManagement.verifyCheckboxiischecked();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Costing Type Code")
    public void user_verify_chars_len_Costing_Type_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinCostingType_C_txtCostingTypeCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Costing Type")
    public void user_verify_chars_len_Costing_Type(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_RadWinCostingType_C_radtxtCostingType']"),maxLen, minLen);
    }
    @When("User select the Costing Type record to edit")
    public void user_select_the_Costing_Type_record_to_edit() {
        PropertyManagement.getRandomCostingTypeRecord();
    }
    @Then("User verifies Edited Costing Type details in table")
    public void user_verifies_edited_CostingType_details_in_table() throws InterruptedException {
        PropertyManagement.verifyCostingTypeCode();
        PropertyManagement.verifyCostingType();
        PropertyManagement.verifyCheckboxiisnotchecked();
    }





}
