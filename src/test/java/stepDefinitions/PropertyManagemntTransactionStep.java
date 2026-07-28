package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AuditInspections;
import pages.PropertyContractManagementTransaction;
import pages.ResourceManagement;
import utils.DriverFactory;
import utils.HelperUtils;

public class PropertyManagemntTransactionStep {

    private final WebDriver driver = DriverFactory.getDriver();
    PropertyContractManagementTransaction PCManagement = new PropertyContractManagementTransaction(driver);
    private final HelperUtils helperUtils = new HelperUtils(driver);

    @When("User get Client default code field value")
    public void user_get_Client_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_radtxtCustomerCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        PropertyContractManagementTransaction.testDataModel.setClientCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @And("User Enters Client Name and Ext Ref Code")
    public void user_enters_Client_name_Ext_Ref_Code() {
        PropertyContractManagementTransaction.enterClientName();
        PropertyContractManagementTransaction.enterClientExtRefCode();
    }
    @When("User select the Client ClientType dropdown")
    public void user_select_the_Client_ClientType_Dropdown(){
        PropertyContractManagementTransaction.getRandomClientClientTypeDropdown();
    }
    @And("User Enters Client contact details")
    public void user_enters_Client_Contact_detials() {
        PropertyContractManagementTransaction.enterClientContactPerson();
        PropertyContractManagementTransaction.enterClientMobileNumber();
        PropertyContractManagementTransaction.enterClientEmail();
        PropertyContractManagementTransaction.enterClientAddress();
    }
    @When("User select the Client Country City CustomerImprotance dropdown")
    public void user_select_the_Client_Country_City_CustomerImprotance_Dropdown(){
        PropertyContractManagementTransaction.getRandomClientCountryDropdown();
        PropertyContractManagementTransaction.getRandomClientCityDropdown();
        PropertyContractManagementTransaction.getRandomClientCustomerImportanceDropdown();
    }
    @When("User clicks on Save button in Property Management Transaction Section")
    public void User_clicks_on_save_button(){
        PropertyContractManagementTransaction.clickSaveButton();
    }
    @Then("User verifies added Client details in table")
    public void user_verifies_added_Client_details_in_table(){
        PropertyContractManagementTransaction.verifyClientCode();
        PropertyContractManagementTransaction.verifyClientName();
        PropertyContractManagementTransaction.verifyClientClientType();
        PropertyContractManagementTransaction.verifyClientContactPerson();
        PropertyContractManagementTransaction.verifyClientMobileNumber();
        PropertyContractManagementTransaction.verifyClientCountry();
        PropertyContractManagementTransaction.verifyClientCity();
        PropertyContractManagementTransaction.verifyClientCustomerImportance();
        PropertyContractManagementTransaction.verifyClientExtRefCode();
    }
    @And("User Enters Contact Name and Ext Ref Code")
    public void user_enters_Contact_name_Ext_Ref_Code() {
        PropertyContractManagementTransaction.enterContactName();
        PropertyContractManagementTransaction.enterContactExtRefCode();
    }
    @When("User select the Contact ContactType dropdown")
    public void user_select_the_Contact_ContactType_Dropdown(){
        PropertyContractManagementTransaction.getRandomContactsContactTypeDropdown();
    }
    @And("User Enters Contacts contact details")
    public void user_enters_Contacts_Contact_detials() {
        PropertyContractManagementTransaction.enterContactEmail();
        PropertyContractManagementTransaction.enterContactMobileNumber();
        PropertyContractManagementTransaction.enterContactWhatsappNumber();
    }
    @Then("User verifies added Contacts details in table")
    public void user_verifies_added_Contacts_details_in_table(){
        PropertyContractManagementTransaction.verifyContactName();
        PropertyContractManagementTransaction.verifyContactsContactType();
        PropertyContractManagementTransaction.verifyContactMobileNumber();
        PropertyContractManagementTransaction.verifyContactWhatsappNumber();
        PropertyContractManagementTransaction.verifyContactEmail();
        PropertyContractManagementTransaction.verifyContactExtRefCode();
    }
    @When("User get Parameter default code field value")
    public void user_get_Parameter_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='radtxtMeasurementParaCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        PropertyContractManagementTransaction.testDataModel.setParameterCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User select the Measurement Category SubCategory dropdown")
    public void user_select_the_Measurement_Category_SubCategory_Dropdown(){
        PropertyContractManagementTransaction.getRandomContactsContactTypeDropdown();
    }
    @And("User Enters Parameter Name and Default Severity dropdown")
    public void user_enters_Parameter_Name_Default_Severity_dropdown() {
        PropertyContractManagementTransaction.enterContactName();
        PropertyContractManagementTransaction.getRandomContactsContactTypeDropdown();
    }
    @And("User clicks Parameter Options and Description")
    public void user_clicks_Parameter_Options_Description() {
        PropertyContractManagementTransaction.enterContactName();
        PropertyContractManagementTransaction.enterContactExtRefCode();
    }
    @When("User select the Service Parameter dropdowns")
    public void user_select_the_Service_Parameter_dropdowns(){
        PropertyContractManagementTransaction.getRandomContactsContactTypeDropdown();
        PropertyContractManagementTransaction.getRandomContactsContactTypeDropdown();
        PropertyContractManagementTransaction.getRandomContactsContactTypeDropdown();
        PropertyContractManagementTransaction.getRandomContactsContactTypeDropdown();
    }
    @And("User Enters SLA Parameter duration mins")
    public void user_enters_SLA_Parameter_duration_mins() {
        PropertyContractManagementTransaction.enterContactMobileNumber();
        PropertyContractManagementTransaction.enterContactMobileNumber();
        PropertyContractManagementTransaction.enterContactMobileNumber();
    }
    @Then("User verifies added Parameter details in table")
    public void user_verifies_added_Parameter_details_in_table(){
        PropertyContractManagementTransaction.verifyContactName();
        PropertyContractManagementTransaction.verifyContactsContactType();
        PropertyContractManagementTransaction.verifyContactMobileNumber();
        PropertyContractManagementTransaction.verifyContactWhatsappNumber();
        PropertyContractManagementTransaction.verifyContactEmail();
        PropertyContractManagementTransaction.verifyContactExtRefCode();
    }








}
