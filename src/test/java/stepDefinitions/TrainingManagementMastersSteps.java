package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.TrainingManagementMastersPage;
import utils.DriverFactory;
import utils.TestDataGenerator;

import java.io.IOException;

public class TrainingManagementMastersSteps {
    public static String generateCompanyType;
    public static String generateDuplicateCompanyType;
    private final WebDriver driver = DriverFactory.getDriver();
    TrainingManagementMastersPage tmp = new TrainingManagementMastersPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User clicks on hamburger icon")
    public void userClicksOnHamburgerIcon() {
        tmp.clickHamburgerIcon();
    }

    @Then("User clicks on the {string} tab in data configuration page")
    public void userClicksOnTheTab(String tabTitle) {
        tmp.clickOnTabByTitle(tabTitle);
    }

    @Then("User fills up the company type details")
    public void userFillsUpTheCompanyTypeDetails() {
        generateCompanyType = dataGen.generateCompanyType();
        tmp.enterCompanyType(generateCompanyType);
    }

    @Then("User verify if the company type is created or updated")
    public void user_verify_company_type_creation() {
        tmp.verifyCompanyType(generateCompanyType);
    }

    @Then("User clicks on first available company type to edit")
    public void user_clicks_on_first_available_company_type_to_edit() {
        tmp.clickCompanyTypetoEdit();
    }
    @Then("User clicks on first available company type to delete")
    public void user_clicks_on_first_available_company_type_to_delete() {
        tmp.clickCompanyTypetoDelete();
    }
    @Then("User verify if the record is deleted")
    public void user_verify_record_deleted() {
        tmp.verifyRecordDeleted(generateCompanyType);
    }
    @Then("User fills up the duplicate company type details")
    public void userFillsUpTheDuplicateCompanyTypeDetails() {
        tmp.enterCompanyType(generateCompanyType);
    }

    @Then("verify the message as {string}")
    public void verifyMessage(String message) {
        verifyMessage(message);
    }

    @Then("User clicks on update button")
    public void userClicksOnUpdateButton() {
        tmp.clickUpdateButton();
    }
    }


