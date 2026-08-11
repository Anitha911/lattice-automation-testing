package stepDefinitions;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.IncidentManagementMastersPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;


import java.io.IOException;

import static pages.IncidentManagementMastersPage.*;

public class IncidentManagementMastersSteps {
    public static String IncidentType;
    public static String UpdateType;
    public static String IncidentSubType;
    public static String UpdateSubType;
    public static String updateSubTypeCode;
    public static String IncidentSeverity;
    public static String UpdateSeverity;
    public static String AffectedGroup;
    public static String UpdateAffectedGroup;
    public static String Caused_By;
    public static String UpdateCaused_By;
    public static String Impact_Type;
    public static String UpdateImpact_Type;
    public static String Section_Name;
    public static String UpdateSection_Name;
    public static String Field_Name;
    public static String UpdateField_Name;
    public static String List_of_Values;
    public static String UpdateList_of_Values;

    private final WebDriver driver = DriverFactory.getDriver();
    IncidentManagementMastersPage tmp = new IncidentManagementMastersPage(driver);
    HelperUtils helperUtils = new HelperUtils(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User fills the Incident Type details")
    public void user_Add_incident_type_details() throws IOException {
        String IncidentTypeCode = dataGen.generateIncidentTypeCode();
        IncidentType = dataGen.generateIncidentType();
        tmp.MasterenterIncidentTypeCode(IncidentTypeCode);
        tmp.MasterenterIncidentType(IncidentType);
    }

    @And("User clicks on Incident Save button")
    public void user_clicks_on_button_Incident_save() {
        tmp.MasterclickIncidentSaveButton();
    }

    @Then("User verify if the Incident Type is created")
    public void user_verify_Incident_Type_creation() {
        tmp.MasterverifyIncidentType(IncidentType);
    }

    @Then("User clicks on first available Incident Type to edit")
    public void user_clicks_on_first_available_Incident_Type_to_edit() {
        tmp.MasterclickIncidentTypetoEdit();
    }

    @And("User updates the Incident Type details")
    public void user_Updates_Incident_Type_details() throws IOException {
        String updateCode = dataGen.generateIncidentTypeCode();
        UpdateType = dataGen.generateIncidentType();
        tmp.MasterupdateIncidentTypeCode(updateCode);
        tmp.MasterupdateIncidentType(UpdateType);
    }

    @Then("User verify if the Incident Type is updated")
    public void user_verify_the_success_message_after_updating_incident_type() {
        tmp.MasterverifyUpdateIncidentType(UpdateType);
    }

    @Then("User clicks on first available Incident Type to delete")
    public void user_clicks_on_first_available_Incident_Type_to_delete() {
        tmp.MasterclickIncidentTypeToDelete();
    }

    @Then("User clicks on Incident {string} tab")
    public void userClicksOnIncidentTab(String tabName) {
        tmp.clickOnIncidentTabByTitleName(tabName);
    }

    @Then("User fills the Incident Sub-Type details")
    public void user_Add_incident_sub_type_details() throws IOException {
        String IncidentSubTypeCode = dataGen.generateIncidentSubTypeCode();
        IncidentSubType = dataGen.generateIncidentSubType();
        tmp.MasterenterIncidentSubTypeCode(IncidentSubTypeCode);
        tmp.MasterenterIncidentSubType(IncidentSubType);
        tmp.MasterselectRandomIncidentType();
    }

    @Then("User verify if the Incident Sub-Type is created")
    public void user_verify_Incident_Sub_Type_creation() {
        tmp.MasterverifyIncidentSubType(IncidentSubType);
    }

//    Incident Sub Type - Update
     @Then("User clicks on first available Incident Sub-Type to edit")
    public void user_clicks_on_first_available_Incident_Sub_Type_to_edit() {
        tmp.MasterclickIncidentSubTypetoEdit();
    }

    @And("User updates the Incident Sub-Type details")
    public void user_Updates_Incident_Sub_Type_details() throws IOException {
        updateSubTypeCode = dataGen.generateIncidentSubTypeCode();
        UpdateSubType = dataGen.generateIncidentSubType();
        tmp.MasterupdateIncidentSubTypeCode(updateSubTypeCode);
        tmp.MasterupdateIncidentSubType(UpdateSubType);
    }

    @Then("User verify if the Incident Sub-Type is updated")
    public void user_verify_the_success_message_after_updating_incident_sub_type() {
        tmp.MasterverifyUpdateIncidentSubType(UpdateSubType);
    }

    @Then("User clicks on first available Incident Sub-Type to delete")
    public void user_clicks_on_first_available_Incident_Sub_Type_to_delete() {
        tmp.MasterclickIncidentSubTypeToDelete();
    }

//    Incident Severity
        @Then("User fills the Incident Severity details")
    public void user_Add_incident_severity_details() throws IOException {
        IncidentSeverity = dataGen.generateIncidentSeverity();
        tmp.MasterenterIncidentSeverity(IncidentSeverity);
    }

    @Then("User verify if the Incident Severity is created")
    public void user_verify_Incident_Severity_creation() {
        tmp.MasterverifyIncidentSeverity(IncidentSeverity);
    }

    @Then("User clicks on first available Incident Severity to edit")
    public void user_clicks_on_first_available_Incident_Severity_to_edit() {
        tmp.MasterclickIncidentSeveritytoEdit();
    }

    @And("User updates the Incident Severity details")
    public void user_Updates_Incident_Severity_details() throws IOException {
        UpdateSeverity = dataGen.generateIncidentSeverity();
        tmp.MasterupdateIncidentSeverity(UpdateSeverity);
    }

    @Then("User verify if the Incident Severity is updated")
    public void user_verify_the_success_message_after_updating_incident_severity() {
        tmp.MasterverifyUpdateIncidentSeverity(UpdateSeverity);
    }

    @Then("User clicks on first available Incident Severity to delete")
    public void user_clicks_on_first_available_Incident_Severity_to_delete() {
        tmp.MasterclickIncidentSeverityToDelete();
    }

//    Affected Group
    @Then("User fills the Affected Group details")
    public void user_Add_Affected_Group_details() throws IOException {
        AffectedGroup = dataGen.generateIncidentAffectedGroup();
        tmp.MasterEnterIncidentAffectedGroup(AffectedGroup);
    }

    @Then("User verify if the Affected Group is created")
    public void user_verify_Affected_Group_creation() {
        tmp.MasterverifyIncidentAffectedGroup(AffectedGroup);
    }

    @Then("User clicks on first available Affected Group to edit")
    public void user_clicks_on_first_available_Affected_Group_to_edit() {
        tmp.MasterclickIncidentAffectedGrouptoEdit();
    }

    @And("User updates the Affected Group details")
    public void user_Updates_Incident_Affected_Group_details() throws IOException {
        UpdateAffectedGroup = dataGen.generateIncidentAffectedGroup();
        tmp.MasterupdateIncidentAffectedGroup(UpdateAffectedGroup);
    }

    @Then("User verify if the Affected Group is updated")
    public void user_verify_the_success_message_after_updating_Affected_Group() {
        tmp.MasterverifyUpdateIncidentAffectedGroup(UpdateAffectedGroup);
    }

    @Then("User clicks on first available Affected Group to delete")
    public void user_clicks_on_first_available_Affected_Group_to_delete() {
        tmp.MasterclickIncidentAffectedGroupToDelete();
    }

//    Incident-Caused By
    @Then("User fills the Incident-Caused By details")
    public void user_Add_Incident_Caused_By_details() throws IOException {
        Caused_By = dataGen.generateIncidentCausedBy();
        tmp.MasterenterCausedBy(Caused_By);
    }

    @Then("User verify if the Incident-Caused By is created")
    public void user_verify_Incident_Caused_By_creation() {
        tmp.MasterverifyCausedBy(Caused_By);
    }

    @Then("User clicks on first available Incident-Caused By to edit")
    public void user_clicks_on_first_available_Incident_Caused_By_to_edit() {
        tmp.MasterclickCausedBytoEdit();
    }

    @And("User updates the Incident-Caused By details")
    public void user_Updates_Incident_Caused_By_details() throws IOException {
        UpdateCaused_By = dataGen.generateIncidentCausedBy();
        tmp.MasterupdateCausedBy(UpdateCaused_By);
    }

    @Then("User verify if the Incident-Caused By is updated")
    public void user_verify_the_success_message_after_updating_Caused_By() {
        tmp.MasterverifyUpdateCausedBy(UpdateCaused_By);
    }

    @Then("User clicks on first available Incident-Caused By to delete")
    public void user_clicks_on_first_available_Caused_By_to_delete() {
        tmp.MasterclickCausedByToDelete();
    }

//  Incident - Impact Type
    @Then("User fills the Incident-Impact Type details")
    public void user_Add_Incident_Impact_Type_details() throws IOException {
        Impact_Type = dataGen.generateIncidentImpactType();
        int Impact_Type_SortOrder= dataGen.generateIncidentImpactTypeSortOrder();
        tmp.MasterenterImpactType(Impact_Type);
        tmp.MasterenterImpactTypeSortOrder(Impact_Type_SortOrder);
    }

    @Then("User verify if the Incident-Impact Type is created")
    public void user_verify_Incident_Impact_Type_creation() {
        tmp.MasterverifyImpactType(Impact_Type);
    }

    @Then("User clicks on first available Incident-Impact Type to edit")
    public void user_clicks_on_first_available_Incident_Impact_Type_to_edit() {
        tmp.MasterclickImpactTypetoEdit();
    }

    @And("User updates the Incident-Impact Type details")
    public void user_Updates_Incident_Impact_Type_details() throws IOException {
        UpdateImpact_Type = dataGen.generateIncidentImpactType();
        tmp.MasterupdateImpactType(UpdateImpact_Type);
    }

    @Then("User verify if the Incident-Impact Type is updated")
    public void user_verify_the_success_message_after_updating_Impact_Type() {
        tmp.MasterverifyUpdateImpactType(UpdateImpact_Type);
    }

    @Then("User clicks on first available Incident-Impact Type to delete")
    public void user_clicks_on_first_available_Impact_Type_to_delete() {
        tmp.MasterclickIncidentImpactTypeToDelete();
    }

//    Incident-Section
    @Then("User fills the Incident-Section details")
    public void user_Add_Incident_Section_details() throws IOException {
        Section_Name = dataGen.generateIncidentSectionName();
        tmp.MasterenterIncidentSectionName(Section_Name);
        tmp.MasterselectRandomIncidentSectionType();
        int MasterIncidentSectionSortOrder= dataGen.generateIncidentSectionSortOrder();
        tmp.MasterenterIncidentSectionSortOrder(MasterIncidentSectionSortOrder);
    }

    @Then("User verify if the Incident-Section is created")
    public void user_verify_Incident_Section_creation() {
        tmp.MasterverifyIncidentSection(Section_Name);
    }

    @Then("User clicks on first available Incident-Section to edit")
    public void user_clicks_on_first_available_Incident_Section_to_edit() {
        tmp.MasterclickIncidentSectiontoEdit();
    }

    @And("User updates the Incident-Section details")
    public void user_Updates_Incident_Section_details() throws IOException {
        UpdateSection_Name = dataGen.generateIncidentSectionName();
        tmp.MasterupdateIncidentSection(UpdateSection_Name);
    }

    @Then("User verify if the Incident-Section is updated")
    public void user_verify_the_success_message_after_updating_Section() {
        tmp.MasterverifyUpdateIncidentSection(UpdateSection_Name);
    }

    @Then("User clicks on first available Incident-Section to delete")
    public void user_clicks_on_first_available_Section_to_delete() {
        tmp.MasterclickIncidentSectionToDelete();
    }

//    Incident-Field
    @Then("User fills the Incident-Field details")
    public void user_Add_Incident_Field_details() throws IOException {
        tmp.MasterSelectIncidentFieldTypeRandom();
        tmp.MasterSelectIncidentFieldSectionRandom();
        Field_Name = dataGen.generateIncidentFieldName();
        tmp.MasterIncidententerFieldName(Field_Name);
        tmp.MasterIncidentwaitForFieldNameGridLoading();
        tmp.MasterSelectIncidentFieldDataTypeRandom();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int Field_SortOrder = dataGen.generateIncidentSectionSortOrder();
        tmp.MasterenterIncidentFieldSortOrder(Field_SortOrder);
    }

    @Then("User verify if the Incident-Field is created")
    public void user_verify_Incident_Field_creation() {
        tmp.MasterverifyIncidentFieldName(Field_Name);
    }

    @Then("User clicks on first available Incident-Field to edit")
    public void user_clicks_on_first_available_Incident_Field_to_edit() {
        tmp.MasterclickIncidentFieldtoEdit();
    }

    @And("User updates the Incident-Field details")
    public void user_Updates_Incident_Field_details() throws IOException {
        UpdateField_Name = dataGen.generateIncidentFieldName();
        tmp.MasterupdateIncidentField(UpdateField_Name);
    }

    @Then("User verify if the Incident-Field is updated")
    public void user_verify_the_success_message_after_updating_Field() {
        tmp.MasterverifyUpdateIncidentField(UpdateField_Name);
    }

    @Then("User clicks on first available Incident-Field to delete")
    public void user_clicks_on_first_available_Field_to_delete() {
        tmp.MasterclickIncidentFieldToDelete();
    }

//    Incident-List of Values
    @Then("User fills the Incident-List of Values details")
    public void user_Add_Incident_List_of_Values_details() throws IOException {
        tmp.MasterSelectIncidentLOVFieldTypeRandom();
        List_of_Values = dataGen.generateIncidentListofValues();
        tmp.MasterenterIncidentListofValue(List_of_Values);
        }

    @Then("User verify if the Incident-List of Values is created")
    public void user_verify_Incident_List_of_Values_creation() {
        tmp.MasterverifyIncidentListofValues(List_of_Values);
    }

    @Then("User clicks on first available Incident-List of Values to edit")
    public void user_clicks_on_first_available_Incident_List_of_Values_to_edit() {
        tmp.MasterIncidentclickListofValuetoEdit();
    }

    @And("User updates the Incident-List of Values details")
    public void user_Updates_Incident_List_of_Values_details() throws IOException {
        UpdateList_of_Values = dataGen.generateIncidentListofValues();
        tmp.MasterIncidentupdateListofValues(UpdateList_of_Values);
    }

    @Then("User verify if the Incident-List of Values is updated")
    public void user_verify_the_success_message_after_updating_List_of_Values() {
        tmp.MasterIncidentverifyUpdateListofValues(UpdateList_of_Values);
    }

    @Then("User clicks on first available Incident-List of Values to delete")
    public void user_clicks_on_first_available_List_of_Values_to_delete() {
        tmp.MasterIncidentclickListofvaluesToDelete();
    }

    // Export to Excel - Incident

    @Then("User click on the Master Incident Management Export to Excel button")
    public void user_clicks_on_Master_Incident_Management_Export_to_Excel_button() {
        tmp.MasterIncidentManagementExporttoExcel();
    }

    //    ValidationIncidentType
    @Then("User verify the inline error message {string} on Incident Type Code field")
    public void user_verify_inline_error_message_on_Incident_Type_Code_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Type Code field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentType_C_RequiredFieldValidator3");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Type field")
    public void user_verify_inline_error_message_on_Incident_Type_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Type field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentType_C_requireValidator_Type");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident Type Code field")
    public void user_verify_chars_len_Incident_Type_Code_field(int maxLen) {
        System.out.println("Verifying Incident Type Code field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("rdtxtbx_shortname"),maxLen);
        System.out.println("Incident Type Code field length validation verified successfully.");
    }

    @When("User verify the chars max len as {int} for Incident Type field")
    public void user_verify_chars_len_Incident_Type_field(int maxLen) {
        System.out.println("Verifying Incident Type field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("TxtType"),maxLen);
        System.out.println("Incident Type field length validation verified successfully.");
    }

    @When("User enters special characters in Incident Type Code field")
    public void enter_Special_Characters_In_Incident_Type_Code_field() {
        System.out.println("Verifying Incident Type Code field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("rdtxtbx_shortname"));
        System.out.println("Special character validation completed for Incident Type Code field");
    }

    @When("User enters special characters in Incident Type field")
    public void enter_Special_Characters_In_Incident_Type_field() {
        System.out.println("Verifying Incident Type field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("TxtType"));
        System.out.println("Special character validation completed for Incident Type field");
    }

    //    ValidationIncidentSub-Type
    @Then("User verify the inline error message {string} on Incident Sub-Type Code field")
    public void user_verify_inline_error_message_on_Incident_Sub_Type_Code_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Sub-Type Code field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentSubType_C_RequiredFieldValidator5");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Sub-Type field")
    public void user_verify_inline_error_message_on_Incident_Sub_Type_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Sub-Type field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentSubType_C_RequiredFieldValidator21");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Type field in the Sub-Type form")
    public void user_verify_inline_error_message_on_Incident_Type_field_in_Sub_Type_form(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Type field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentSubType_C_requireValidatorSubType");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident Sub-Type Code field")
    public void user_verify_chars_len_Incident_Sub_Type_Code_field(int maxLen) {
        System.out.println("Verifying Incident Sub-Type Code field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("rdtxtincidentsubtypecode"),maxLen);
        System.out.println("Incident Sub-Type Code field length validation verified successfully.");
    }

    @When("User verify the chars max len as {int} for Incident Sub-Type field")
    public void user_verify_chars_len_Incident_Sub_Type_field(int maxLen) {
        System.out.println("Verifying Incident Sub-Type field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("rdtxtincidentsubtype"),maxLen);
        System.out.println("Incident Sub-Type field length validation verified successfully.");
    }

    @When("User enters special characters in Incident Sub-Type Code field")
    public void enter_Special_Characters_In_Incident_Sub_Type_Code_field() {
        System.out.println("Verifying Incident Sub-Type Code field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("rdtxtincidentsubtypecode"));
        System.out.println("Special character validation completed for Incident Sub-Type Code field");
    }

    @When("User enters special characters in Incident Sub-Type field")
    public void enter_Special_Characters_In_Incident_Sub_Type_field() {
        System.out.println("Verifying Incident Sub-Type field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("rdtxtincidentsubtype"));
        System.out.println("Special character validation completed for Incident Sub-Type field");
    }

    //    ValidationIncidentSeverity
    @Then("User verify the inline error message {string} on Incident Severity field")
    public void user_verify_inline_error_message_on_Incident_Severity_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Severity field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentSeverity_C_RequiredFieldValidator16");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident Severity field")
    public void user_verify_chars_len_Incident_Severity_field(int maxLen) {
        System.out.println("Verifying Incident Severity field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtSeverityType"),maxLen);
        System.out.println("Incident Severity field length validation verified successfully.");
    }

    @When("User enters special characters in Incident Severity field")
    public void enter_Special_Characters_In_Incident_Severity_field() {
        System.out.println("Verifying Incident Severity field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtSeverityType"));
        System.out.println("Special character validation completed for Incident Severity field");
    }

    //    ValidationIncidentAffectedGroup
    @Then("User verify the inline error message {string} on Incident Affected Group field")
    public void user_verify_inline_error_message_on_Incident_Affected_Group_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Affected Group field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAffectGroup_C_RequiredFieldValidator17");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident Affected Group field")
    public void user_verify_chars_len_Incident_Affected_Group_field(int maxLen) {
        System.out.println("Verifying Incident Affected Group field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtAffectingType"),maxLen);
        System.out.println("Incident Affected Group field length validation verified successfully.");
    }

    @When("User enters special characters in Incident Affected Group field")
    public void enter_Special_Characters_In_Incident_Affected_Group_field() {
        System.out.println("Verifying Incident Affected Group field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtAffectingType"));
        System.out.println("Special character validation completed for Incident Affected Group field");
    }

    //    ValidationIncidentCausedBy
    @Then("User verify the inline error message {string} on Incident Caused By field")
    public void user_verify_inline_error_message_on_Incident_Caused_By_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Caused By field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinCausedby_C_RequiredFieldValidator18");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident Caused By field")
    public void user_verify_chars_len_Incident_Caused_By_field(int maxLen) {
        System.out.println("Verifying Incident Caused By field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtCausedType"),maxLen);
        System.out.println("Incident Caused By field length validation verified successfully.");
    }

    @When("User enters special characters in Incident Caused By field")
    public void enter_Special_Characters_In_Incident_Caused_By_field() {
        System.out.println("Verifying Incident Caused By field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtCausedType"));
        System.out.println("Special character validation completed for Incident Caused By field");
    }

    //    ValidationIncidentImpactType
    @Then("User verify the inline error message {string} on Incident Impact Type field")
    public void user_verify_inline_error_message_on_Incident_Impact_Type_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Impact Type field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinImpacttype_C_RequiredFieldValidator19");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Impact Type Sort Order field")
    public void user_verify_inline_error_message_on_Incident_Impact_Type_Sort_Order_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Impact Type Sort Order field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinImpacttype_C_RequiredFieldValidator20");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident Impact Type field")
    public void user_verify_chars_len_Incident_Impact_Type_field(int maxLen) {
        System.out.println("Verifying Incident Impact Type field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtImpactType"),maxLen);
        System.out.println("Incident Impact Type field length validation verified successfully.");
    }

    @When("User enters special characters in Incident Impact Type field")
    public void enter_Special_Characters_In_Incident_Impact_Type_field() {
        System.out.println("Verifying Incident Impact Type field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtImpactType"));
        System.out.println("Special character validation completed for Incident Impact Type field");
    }

    //    ValidationIncidentSection
    @Then("User verify the inline error message {string} on Incident Section field")
    public void user_verify_inline_error_message_on_Incident_Section_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Section field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinsection_C_RequiredFieldValidator2");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Section Type field")
    public void user_verify_inline_error_message_on_Incident_Section_Type_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Section Type field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinsection_C_RequiredFieldValidator1");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Section Sort Order field")
    public void user_verify_inline_error_message_on_Incident_Section_Sort_Order_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Section Sort Order field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinsection_C_RequiredFieldValidator4");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident Section field")
    public void user_verify_chars_len_Incident_Section_field(int maxLen) {
        System.out.println("Verifying Incident Section field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("SectionBoxid"),maxLen);
        System.out.println("Incident Section field length validation verified successfully.");
    }

    @When("User verify the chars max len as {int} for Incident Section Sort Order field")
    public void user_verify_chars_len_Incident_Section_Sort_Order_field(int maxLen) {
        System.out.println("Verifying Incident Section Sort Order field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinsection_C_sortorderid"),maxLen);
        System.out.println("Incident Section Sort Order field length validation verified successfully.");
    }

    @When("User enters special characters in Incident Section field")
    public void enter_Special_Characters_In_Incident_Section_field() {
        System.out.println("Verifying Incident Section field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("SectionBoxid"));
        System.out.println("Special character validation completed for Incident Section field");
    }

    @When("User enters special characters in Incident Section Sort Order field")
    public void enter_Special_Characters_In_Incident_Section_Sort_Order_field() {
        System.out.println("Verifying Incident Section Sort Order field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("ctl00_ContentPlaceHolder1_RadWinsection_C_sortorderid"));
        System.out.println("Special character validation completed for Incident Section Sort Order field");
    }

    //    ValidationIncidentField
    @Then("User verify the inline error message {string} on Incident Field Type field")
    public void user_verify_inline_error_message_on_Incident_Field_Type_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Field Type field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_RequiredFieldValidator22");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Field Section field")
    public void user_verify_inline_error_message_on_Incident_Field_Section_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Field Section field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_RequiredFieldValidator6");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Field Field Name field")
    public void user_verify_inline_error_message_on_Incident_Field_Field_Name_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Field Field Name field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_RequiredFieldValidator7");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Field Data Type field")
    public void user_verify_inline_error_message_on_Incident_Field_Data_Type_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Field Data Type field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_RequiredFieldValidator8");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident Field Sort Order field")
    public void user_verify_inline_error_message_on_Incident_Field_Sort_Order_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident Field Sort Order field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_RequiredFieldValidator13");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident Field Field Name field")
    public void user_verify_chars_len_Incident_Field_Name_field(int maxLen) {
        System.out.println("Verifying Incident Field field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("FieldsName"),maxLen);
        System.out.println("Incident Field field length validation verified successfully.");
    }

    @When("User enters special characters in Incident Field Field Name field")
    public void enter_Special_Characters_In_Incident_Field_Name_field() {
        System.out.println("Verifying Incident Field field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("FieldsName"));
        System.out.println("Special character validation completed for Incident Field field");
    }

   //ValidationIncidentListOfValue
    @Then("User verify the inline error message {string} on Incident LOV field")
    public void user_verify_inline_error_message_on_Incident_LOV_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident LOV field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinLOv_C_RequiredFieldValidator14");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Incident LOV Value field")
    public void user_verify_inline_error_message_on_Incident_LOV_value_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Incident LOV value field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinLOv_C_RequiredFieldValidator15");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars max len as {int} for Incident LOV Value field")
    public void user_verify_chars_len_Incident_LOV_Value_field(int maxLen) {
        System.out.println("Verifying Incident LOV Value field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("Valueid"),maxLen);
        System.out.println("Incident LOV Value field length validation verified successfully.");
    }

    @When("User enters special characters in Incident LOV Value field")
    public void enter_Special_Characters_In_Incident_LOV_Value_field() {
        System.out.println("Verifying Incident LOV field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("Valueid"));
        System.out.println("Special character validation completed for Incident LOV Value field");
    }
}


