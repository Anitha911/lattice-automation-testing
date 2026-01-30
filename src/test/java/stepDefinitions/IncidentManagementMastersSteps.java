package stepDefinitions;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.IncidentManagementMastersPage;
import utils.DriverFactory;
import utils.TestDataGenerator;


import java.io.IOException;
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
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User clicks on hamburger icon")
    public void userClicksOnHamburgerIcon() {
        tmp.clickHamburgerIcon();
    }

    @Then("User clicks on the {string} tab in data configuration page")
    public void userClicksOnTheTab(String tabTitle) {
        tmp.clickOnTabByTitle(tabTitle);
    }

    @Then("User fills the Incident Type details")
    public void user_Add_incident_type_details() throws IOException {
        String IncidentTypeCode = dataGen.generateIncident_Type_Code();
        IncidentType = dataGen.generateIncident_Type();
        tmp.enterIncident_Type_Code(IncidentTypeCode);
        tmp.enterIncident_Type(IncidentType);
    }

    @And("User clicks on Incident Save button")
    public void user_clicks_on_button_Incident_save() {
        tmp.clickIncidentSaveButton();
    }

    @Then("User verify if the Incident Type is created")
    public void user_verify_Incident_Type_creation() {
        tmp.verifyIncidentType(IncidentType);
    }

    @Then("User clicks on first available Incident Type to edit")
    public void user_clicks_on_first_available_Incident_Type_to_edit() {
        tmp.clickIncidentTypetoEdit();
    }

    @And("User updates the Incident Type details")
    public void user_Updates_Incident_Type_details() throws IOException {
        String updateCode = dataGen.generateIncident_Type_Code();
        UpdateType = dataGen.generateIncident_Type();
        tmp.updateIncident_Type_Code(updateCode);
        tmp.updateIncident_Type(UpdateType);
    }

    @Then("User verify if the Incident Type is updated")
    public void user_verify_the_success_message_after_updating_incident_type() {
        tmp.verifyUpdateIncidentType(UpdateType);
    }

    @Then("User clicks on first available Incident Type to delete")
    public void user_clicks_on_first_available_Incident_Type_to_delete() {
        tmp.clickIncidentTypeToDelete();
    }

    @Then("User clicks on {string} tab")
    public void userClicksOnTab(String tabName) {
        tmp.clickOnTabByTitleName(tabName);
    }

    @Then("User fills the Incident Sub-Type details")
    public void user_Add_incident_sub_type_details() throws IOException {
        String IncidentSubTypeCode = dataGen.generateIncident_Sub_Type_Code();
        IncidentSubType = dataGen.generateIncident_Sub_Type();
        tmp.enterIncident_Sub_Type_Code(IncidentSubTypeCode);
        tmp.enterIncident_Sub_Type(IncidentSubType);
        tmp.selectIncidentType("Medical Hazard");
    }

    @Then("User verify if the Incident Sub-Type is created")
    public void user_verify_Incident_Sub_Type_creation() {
        tmp.verifyIncidentSubType(IncidentSubType);
    }

    @Then("User clicks on first available Incident Sub-Type to edit")
    public void user_clicks_on_first_available_Incident_Sub_Type_to_edit() {
        tmp.clickIncidentSubTypetoEdit();
    }

    @And("User updates the Incident Sub-Type details")
    public void user_Updates_Incident_Sub_Type_details() throws IOException {
        updateSubTypeCode = dataGen.generateIncident_Sub_Type_Code();
        UpdateSubType = dataGen.generateIncident_Sub_Type();
        tmp.updateIncident_Sub_Type_Code(updateSubTypeCode);
        tmp.updateIncident_Sub_Type(UpdateSubType);
    }

    @Then("User verify if the Incident Sub-Type is updated")
    public void user_verify_the_success_message_after_updating_incident_sub_type() {
        tmp.verifyUpdateIncidentSubType(UpdateSubType);
    }

    @Then("User clicks on first available Incident Sub-Type to delete")
    public void user_clicks_on_first_available_Incident_Sub_Type_to_delete() {
        tmp.clickIncidentSubTypeToDelete();
    }

    @Then("User fills the Incident Severity details")
    public void user_Add_incident_severity_details() throws IOException {
        IncidentSeverity = dataGen.generateIncident_Severity();
        tmp.enterIncident_Severity(IncidentSeverity);
    }

    @Then("User verify if the Incident Severity is created")
    public void user_verify_Incident_Severity_creation() {
        tmp.verifyIncidentSeverity(IncidentSeverity);
    }

    @Then("User clicks on first available Incident Severity to edit")
    public void user_clicks_on_first_available_Incident_Severity_to_edit() {
        tmp.clickIncidentSeveritytoEdit();
    }

    @And("User updates the Incident Severity details")
    public void user_Updates_Incident_Severity_details() throws IOException {
        UpdateSeverity = dataGen.generateIncident_Severity();
        tmp.updateIncident_Severity(UpdateSeverity);
    }

    @Then("User verify if the Incident Severity is updated")
    public void user_verify_the_success_message_after_updating_incident_severity() {
        tmp.verifyUpdateIncidentSeverity(UpdateSeverity);
    }

    @Then("User clicks on first available Incident Severity to delete")
    public void user_clicks_on_first_available_Incident_Severity_to_delete() {
        tmp.clickIncidentSeverityToDelete();
    }

    @Then("User fills the Affected Group details")
    public void user_Add_Affected_Group_details() throws IOException {
        AffectedGroup = dataGen.generateAffected_Group();
        tmp.enterAffected_Group(AffectedGroup);
    }

    @Then("User verify if the Affected Group is created")
    public void user_verify_Affected_Group_creation() {
        tmp.verifyAffected_Group(AffectedGroup);
    }

    @Then("User clicks on first available Affected Group to edit")
    public void user_clicks_on_first_available_Affected_Group_to_edit() {
        tmp.clickAffected_GrouptoEdit();
    }

    @And("User updates the Affected Group details")
    public void user_Updates_Incident_Affected_Group_details() throws IOException {
        UpdateAffectedGroup = dataGen.generateAffected_Group();
        tmp.updateAffected_Group(UpdateAffectedGroup);
    }

    @Then("User verify if the Affected Group is updated")
    public void user_verify_the_success_message_after_updating_Affected_Group() {
        tmp.verifyUpdateAffected_Group(UpdateAffectedGroup);
    }

    @Then("User clicks on first available Affected Group to delete")
    public void user_clicks_on_first_available_Affected_Group_to_delete() {
        tmp.clickAffected_GroupToDelete();
    }

    @Then("User fills the Incident-Caused By details")
    public void user_Add_Incident_Caused_By_details() throws IOException {
        Caused_By = dataGen.generateCaused_By();
        tmp.enterCaused_By(Caused_By);
    }

    @Then("User verify if the Incident-Caused By is created")
    public void user_verify_Incident_Caused_By_creation() {
        tmp.verifyCaused_By(Caused_By);
    }

    @Then("User clicks on first available Incident-Caused By to edit")
    public void user_clicks_on_first_available_Incident_Caused_By_to_edit() {
        tmp.clickCaused_BytoEdit();
    }

    @And("User updates the Incident-Caused By details")
    public void user_Updates_Incident_Caused_By_details() throws IOException {
        UpdateCaused_By = dataGen.generateCaused_By();
        tmp.updateCaused_By(UpdateCaused_By);
    }

    @Then("User verify if the Incident-Caused By is updated")
    public void user_verify_the_success_message_after_updating_Caused_By() {
        tmp.verifyUpdateCaused_By(UpdateCaused_By);
    }

    @Then("User clicks on first available Incident-Caused By to delete")
    public void user_clicks_on_first_available_Caused_By_to_delete() {
        tmp.clickCaused_ByToDelete();
    }

    @Then("User fills the Incident-Impact Type details")
    public void user_Add_Incident_Impact_Type_details() throws IOException {
        Impact_Type = dataGen.generateImpact_Type();
        int Impact_Type_SortOrder= dataGen.generateImpact_Type_Sort_Order();
        tmp.enterImpact_Type(Impact_Type);
        tmp.enterImpact_Type_SortOrder(Impact_Type_SortOrder);
    }

    @Then("User verify if the Incident-Impact Type is created")
    public void user_verify_Incident_Impact_Type_creation() {
        tmp.verifyImpact_Type(Impact_Type);
    }

    @Then("User clicks on first available Incident-Impact Type to edit")
    public void user_clicks_on_first_available_Incident_Impact_Type_to_edit() {
        tmp.clickImpact_TypetoEdit();
    }

    @And("User updates the Incident-Impact Type details")
    public void user_Updates_Incident_Impact_Type_details() throws IOException {
        UpdateImpact_Type = dataGen.generateImpact_Type();
        tmp.updateImpact_Type(UpdateImpact_Type);
    }

    @Then("User verify if the Incident-Impact Type is updated")
    public void user_verify_the_success_message_after_updating_Impact_Type() {
        tmp.verifyUpdateImpact_Type(UpdateImpact_Type);
    }

    @Then("User clicks on first available Incident-Impact Type to delete")
    public void user_clicks_on_first_available_Impact_Type_to_delete() {
        tmp.clickImpact_TypeToDelete();
    }

    @Then("User fills the Incident-Section details")
    public void user_Add_Incident_Section_details() throws IOException {
        Section_Name = dataGen.generateSection_Name();
        tmp.enterSection_Name(Section_Name);
        tmp.selectSectionType("Medical Hazard");
        int Section_SortOrder= dataGen.generateSection_Sort_Order();
        tmp.enterSection_SortOrder(Section_SortOrder);
    }

    @Then("User verify if the Incident-Section is created")
    public void user_verify_Incident_Section_creation() {
        tmp.verifySection(Section_Name);
    }

    @Then("User clicks on first available Incident-Section to edit")
    public void user_clicks_on_first_available_Incident_Section_to_edit() {
        tmp.clickSectiontoEdit();
    }

    @And("User updates the Incident-Section details")
    public void user_Updates_Incident_Section_details() throws IOException {
        UpdateSection_Name = dataGen.generateSection_Name();
        tmp.updateSection(UpdateSection_Name);
    }

    @Then("User verify if the Incident-Section is updated")
    public void user_verify_the_success_message_after_updating_Section() {
        tmp.verifyUpdateSection(UpdateSection_Name);
    }

    @Then("User clicks on first available Incident-Section to delete")
    public void user_clicks_on_first_available_Section_to_delete() {
        tmp.clickSectionToDelete();
    }

    @Then("User fills the Incident-Field details")
    public void user_Add_Incident_Field_details() throws IOException {
        tmp.selectFieldType("Plane Crash");
        tmp.selectSection("Incident");
        Field_Name = dataGen.generateField_Name();
        tmp.enterField_Name(Field_Name);
        tmp.selectDataType("String");
        int Field_SortOrder = dataGen.generateSection_Sort_Order();
        tmp.enterField_SortOrder(Field_SortOrder);
    }

    @Then("User verify if the Incident-Field is created")
    public void user_verify_Incident_Field_creation() {
        tmp.verifyFieldName(Field_Name);
    }

    @Then("User clicks on first available Incident-Field to edit")
    public void user_clicks_on_first_available_Incident_Field_to_edit() {
        tmp.clickFieldtoEdit();
    }

    @And("User updates the Incident-Field details")
    public void user_Updates_Incident_Field_details() throws IOException {
        UpdateField_Name = dataGen.generateField_Name();
        tmp.updateField(UpdateField_Name);
    }

    @Then("User verify if the Incident-Field is updated")
    public void user_verify_the_success_message_after_updating_Field() {
        tmp.verifyUpdateField(UpdateField_Name);
    }

    @Then("User clicks on first available Incident-Field to delete")
    public void user_clicks_on_first_available_Field_to_delete() {
        tmp.clickFieldToDelete();
    }

    @Then("User fills the Incident-List of Values details")
    public void user_Add_Incident_List_of_Values_details() throws IOException {
        tmp.selectLOVFieldType("Plane Crash");
        List_of_Values = dataGen.generateList_of_Values();
        tmp.enterList_of_Values(List_of_Values);
        }

    @Then("User verify if the Incident-List of Values is created")
    public void user_verify_Incident_List_of_Values_creation() {
        tmp.verifyList_of_Values(List_of_Values);
    }

    @Then("User clicks on first available Incident-List of Values to edit")
    public void user_clicks_on_first_available_Incident_List_of_Values_to_edit() {
        tmp.clickList_of_ValuestoEdit();
    }

    @And("User updates the Incident-List of Values details")
    public void user_Updates_Incident_List_of_Values_details() throws IOException {
        UpdateList_of_Values = dataGen.generateList_of_Values();
        tmp.updateList_of_Values(UpdateList_of_Values);
    }

    @Then("User verify if the Incident-List of Values is updated")
    public void user_verify_the_success_message_after_updating_List_of_Values() {
        tmp.verifyUpdateList_of_Values(UpdateList_of_Values);
    }

    @Then("User clicks on first available Incident-List of Values to delete")
    public void user_clicks_on_first_available_List_of_Values_to_delete() {
        tmp.clickList_of_valuesToDelete();
    }
}


