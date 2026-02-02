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
    public void user_verify_the_success_message_after_updating_incident_type() {
        tmp.verifyUpdateRegulatory_Body(Update_Regulatory_Body);
    }

    @Then("User clicks on first available Regulatory Body to delete")
    public void user_clicks_on_first_available_Regulatory_Body_to_delete() {
        tmp.clickRegulatory_BodyToDelete();
    }

    @Then("User clicks on {string} section")
    public void userClicksOnsection(String sectionName) {
        tmp.clickOnSectionByTitleName(sectionName);
    }

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
    public void user_verify_the_success_message_after_updating_incident_type() {
        tmp.verifyUpdateRegulatory_Body(Update_Regulatory_Body);
    }

    @Then("User clicks on first available Regulatory Body to delete")
    public void user_clicks_on_first_available_Regulatory_Body_to_delete() {
        tmp.clickRegulatory_BodyToDelete();
    }
}
