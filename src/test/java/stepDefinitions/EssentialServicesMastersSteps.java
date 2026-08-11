package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.EssentialServicesMastersPage;
import utils.DriverFactory;
import utils.TestDataGenerator;


import java.io.IOException;
public class EssentialServicesMastersSteps {
    public static String Regulatory_Body;
    public static String Update_Regulatory_Body;
    public static String Connectivity_Category;
    public static String Update_Connectivity_Category;
    public static String Connectivity;
    public static String Update_Connectivity;
    public static String Building_Category;
    public static String Update_Building_Category;
    public static String Structure_Type;
    public static String Update_Structure_Type;
    public static String Building_Type;
    public static String Update_Building_Type;
    public static String SP_Classification;
    public static String Update_SP_Classification;
    public static String Violation_Type;
    public static String Update_Violation_Type;

    private final WebDriver driver = DriverFactory.getDriver();
    EssentialServicesMastersPage tmp = new EssentialServicesMastersPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User fills the Regulatory Body details")
    public void user_Add_Regulatory_Body_details() throws IOException {
        String Description = dataGen.generateDescription();
        Regulatory_Body = dataGen.generateRegulatory_Body();
        tmp.enterRegulatory_Body(Regulatory_Body);
        tmp.enterRegulatory_Body_Description(Description);
    }

    @And("User clicks on Essential Services Save button")
    public void user_clicks_on_button_Essential_Services_save() {
        tmp.clickEssentiaLServicesSaveButton();
    }

    @Then("User verify if the Regulatory Body is created")
    public void user_verify_Regulatory_Body_creation() {
        tmp.verifyAddRegulatory_Body(Regulatory_Body);
    }

    @Then("User clicks on first available Regulatory Body to edit")
    public void user_clicks_on_first_available_Regulatory_Body_to_edit() {
        tmp.clickRegulatory_BodytoEdit();
    }

    @And("User updates the Regulatory Body details")
    public void user_Updates_Regulatory_Body_details() throws IOException {
        Update_Regulatory_Body = dataGen.generateRegulatory_Body();
        tmp.updateRegulatory_Body(Update_Regulatory_Body);
        String Update_Regulatory_Body_Description = dataGen.generateDescription();
        tmp.updateRegulatory_Body_Description(Update_Regulatory_Body_Description);
    }

    @Then("User verify if the Regulatory Body is updated")
    public void user_verify_the_success_message_after_updating_Regulatory_Body() {
        tmp.verifyUpdateRegulatory_Body(Update_Regulatory_Body);
    }

    @Then("User clicks on first available Regulatory Body to delete")
    public void user_clicks_on_first_available_Regulatory_Body_to_delete() {
        tmp.clickRegulatory_BodyToDelete();
    }

    @Then("User clicks on {string} section")
    public void userclicksonsection(String sectionName) {
        tmp.clickOnSectionByTitleName(sectionName);
    }

    @Then("User fills the Connectivity Category details")
    public void user_Add_Connectivity_Category_details() throws IOException {
        Connectivity_Category = dataGen.generateConnectivity_Category();
        tmp.enterConnectivity_Category(Connectivity_Category);
    }

    @Then("User verify if the Connectivity Category is created")
    public void user_verify_Connectivity_Category_creation() {
        tmp.verifyAddConnectivity_Category(Connectivity_Category);
    }

    @Then("User clicks on first available Connectivity Category to edit")
    public void user_clicks_on_first_available_Connectivity_Category_to_edit() {
        tmp.clickConnectivity_CategorytoEdit();
    }

    @And("User updates the Connectivity Category details")
    public void user_Updates_Connectivity_Category_details() throws IOException {
        Update_Connectivity_Category = dataGen.generateConnectivity_Category();
        tmp.updateConnectivity_Category(Update_Connectivity_Category);
    }

    @Then("User verify if the Connectivity Category is updated")
    public void user_verify_the_success_message_after_updating_Connectivity_Category() {
        tmp.verifyUpdateConnectivity_Category(Update_Connectivity_Category);
    }

    @Then("User clicks on first available Connectivity Category to delete")
    public void user_clicks_on_first_available_Connectivity_Category_to_delete() {
        tmp.clickConnectivity_CategoryToDelete();
    }

    @Then("User fills the Connectivity details")
    public void user_Add_Connectivity_details() throws IOException {
        tmp.selectConnectivityCategory("CC2");
        Connectivity = dataGen.generateConnectivity();
        tmp.enterConnectivity(Connectivity);
    }

    @Then("User verify if the Connectivity is created")
    public void user_verify_Connectivity_creation() {
        tmp.verifyAddConnectivity(Connectivity);
    }

    @Then("User clicks on first available Connectivity to edit")
    public void user_clicks_on_first_available_Connectivity_to_edit() {
        tmp.clickConnectivitytoEdit();
    }

    @And("User updates the Connectivity details")
    public void user_Updates_Connectivity_details() throws IOException {
        Update_Connectivity = dataGen.generateConnectivity();
        tmp.updateConnectivity(Update_Connectivity);
    }

    @Then("User verify if the Connectivity is updated")
    public void user_verify_the_success_message_after_updating_Connectivity() {
        tmp.verifyUpdateConnectivity(Update_Connectivity);
    }

    @Then("User clicks on first available Connectivity to delete")
    public void user_clicks_on_first_available_Connectivity_to_delete() {
        tmp.clickConnectivityToDelete();
    }

    @Then("User fills the Building Category details")
    public void user_Add_Building_Category_details() throws IOException {
        Building_Category = dataGen.generateBuilding_Category();
        tmp.enterBuilding_Category(Building_Category);
    }

    @Then("User verify if the Building Category is created")
    public void user_verify_Building_Category_creation() {
        tmp.verifyAddBuilding_Category(Building_Category);
    }

    @Then("User clicks on first available Building Category to edit")
    public void user_clicks_on_first_available_Building_Category_to_edit() {
        tmp.clickBuilding_CategorytoEdit();
    }

    @And("User updates the Building Category details")
    public void user_Updates_Building_Category_details() throws IOException {
        Update_Building_Category = dataGen.generateBuilding_Category();
        tmp.updateBuilding_Category(Update_Building_Category);
    }

    @Then("User verify if the Building Category is updated")
    public void user_verify_the_success_message_after_updating_Building_Category() {
        tmp.verifyUpdateBuilding_Category(Update_Building_Category);
    }

    @Then("User clicks on first available Building Category to delete")
    public void user_clicks_on_first_available_Building_Category_to_delete() {
        tmp.clickBuilding_CategoryToDelete();
    }

    @Then("User fills the Structure Type details")
    public void user_Add_Structure_Type_details() throws IOException {
        Structure_Type = dataGen.generateStructure_Type();
        tmp.enterStructure_Type(Structure_Type);
    }

    @Then("User verify if the Structure Type is created")
    public void user_verify_Structure_Type_creation() {
        tmp.verifyAddStructure_Type(Structure_Type);
    }

    @Then("User clicks on first available Structure Type to edit")
    public void user_clicks_on_first_available_Structure_Type_to_edit() {
        tmp.clickStructure_TypetoEdit();
    }

    @And("User updates the Structure Type details")
    public void user_Updates_Structure_Type_details() throws IOException {
        Update_Structure_Type = dataGen.generateStructure_Type();
        tmp.updateStructure_Type(Update_Structure_Type);
    }

    @Then("User verify if the Structure Type is updated")
    public void user_verify_the_success_message_after_updating_Structure_Type() {
        tmp.verifyUpdateStructure_Type(Update_Structure_Type);
    }

    @Then("User clicks on first available Structure Type to delete")
    public void user_clicks_on_first_available_Structure_Type_to_delete() {
        tmp.clickStructure_TypeToDelete();
    }

    @Then("User fills the Building Type details")
    public void user_Add_Building_Type_details() throws IOException {
        Building_Type = dataGen.generateBuilding_Type();
        tmp.enterBuilding_Type(Building_Type);
    }

    @Then("User verify if the Building Type is created")
    public void user_verify_Building_Type_creation() {
        tmp.verifyAddBuilding_Type(Building_Type);
    }

    @Then("User clicks on first available Building Type to edit")
    public void user_clicks_on_first_available_Building_Type_to_edit() {
        tmp.clickBuilding_TypetoEdit();
    }

    @And("User updates the Building Type details")
    public void user_Updates_Building_Type_details() throws IOException {
        Update_Building_Type = dataGen.generateBuilding_Type();
        tmp.updateBuilding_Type(Update_Building_Type);
    }

    @Then("User verify if the Building Type is updated")
    public void user_verify_the_success_message_after_updating_Building_Type() {
        tmp.verifyUpdateBuilding_Type(Update_Building_Type);
    }

    @Then("User clicks on first available Building Type to delete")
    public void user_clicks_on_first_available_Building_Type_to_delete() {
        tmp.clickBuilding_TypeToDelete();
    }

    @Then("User fills the SP Classification details")
    public void user_Add_SP_Classification_details() throws IOException {
        SP_Classification = dataGen.generateSP_Classification();
        tmp.enterSP_Classification(SP_Classification);
        tmp.selectAllBuildingCategory();
    }

    @Then("User verify if the SP Classification is created")
    public void user_verify_SP_Classification_creation() {
        tmp.verifyAddSP_Classification(SP_Classification);
    }

    @Then("User clicks on first available SP Classification to edit")
    public void user_clicks_on_first_available_SP_Classification_to_edit() {
        tmp.clickSP_ClassificationtoEdit();
    }

    @And("User updates the SP Classification details")
    public void user_Updates_SP_Classification_details() throws IOException {
        Update_SP_Classification = dataGen.generateSP_Classification();
        tmp.updateSP_Classification(Update_SP_Classification);
    }

    @Then("User verify if the SP Classification is updated")
    public void user_verify_the_success_message_after_updating_SP_Classification() {
        tmp.verifyUpdateSP_Classification(Update_SP_Classification);
    }

    @Then("User clicks on first available SP Classification to delete")
    public void user_clicks_on_first_available_SP_Classification_to_delete() {
        tmp.clickSP_ClassificationToDelete();
    }

    @Then("User fills the Violation Type details")
    public void user_Add_Violation_Type_details() throws IOException {

        Violation_Type = dataGen.generateViolation_Type();
        tmp.enterViolation_Type(Violation_Type);
        tmp.selectServiceGroup("Additional Work");  // selects service + moves to next
        tmp.selectFaultCategory("Additional Code Fault"); // selects fault + moves next
        tmp.selectFaultCode("Civil Works-AW");
        tmp.selectPriority("P3");
        tmp.selectGenerateWoOn("True");
    }

    @Then("User verify if the Violation Type is created")
    public void user_verify_Violation_Type_creation() {
        tmp.verifyAddViolation_Type(Violation_Type);
    }

    @Then("User clicks on first available Violation Type to edit")
    public void user_clicks_on_first_available_Violation_Type_to_edit() {
        tmp.clickViolation_TypetoEdit();
    }

    @And("User updates the Violation Type details")
    public void user_Updates_Violation_Type_details() throws IOException {
        Update_Violation_Type = dataGen.generateViolation_Type();
        tmp.updateViolation_Type(Update_Violation_Type);
    }

    @Then("User verify if the Violation Type is updated")
    public void user_verify_the_success_message_after_updating_Violation_Type() {
        tmp.verifyUpdateViolation_Type(Update_Violation_Type);
    }

    @Then("User clicks on first available Violation Type to delete")
    public void user_clicks_on_first_available_Violation_Type_to_delete() {
        tmp.clickViolation_TypeToDelete();
    }
}
