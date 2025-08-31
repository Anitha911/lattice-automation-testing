package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LatticePage;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.TestDataGenerator;

import java.time.Duration;


public class LatticeSteps {
    public static String generatedCompanyName;
    public static String generatedCourseName;
    public static String generateLevelName;
    public static String generateFrequencyName;

    private final WebDriver driver = DriverFactory.getDriver();
//    ElementUtils utils = new ElementUtils(driver);
//    Actions actions = new Actions(driver);
    LatticePage latticePage = new LatticePage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();


    @Given("User is on {string} page")
    public void user_is_on_login_page(String url) {
        url = ConfigReader.getProperty(url);


        try {
            driver.get(url);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
            System.out.println("Navigated to the " + url + " page.");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("An error occurred while navigating to the login page: " + e.getMessage());
        }
    }

    @Then("User is at home screen after login with {string} and {string}")
    public void user_is_at_home_screen_after_login_with_and(String username, String pw) throws InterruptedException {
        latticePage.loginReflexionCafm(username, pw);
    }

    @Then("User waits for {int} seconds")
    public void user_waits_for_seconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
            System.out.println("Waited for " + seconds + " seconds.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Wait interrupted: " + e.getMessage());
        }
    }

    @Then("User clicks on the {string} tab")
    public void userClicksOnTheTab(String tabTitle) {
        latticePage.clickOnTabByTitle(tabTitle);
    }

    @Then("User clicks on button {string}")
    public void user_clicks_on_button(String btnName) {
        latticePage.clickOnButton(btnName);
    }

    @Then("User fills up the {string} type company details")
    public void user_fill_up_the_coperate_company_details(String type) {
        generatedCompanyName = dataGen.generateCompanyName();
        latticePage.enterCompanyName(generatedCompanyName);
        latticePage.selectCompanyType(type);
        latticePage.enterContactNumber(dataGen.generatePhoneNumber());
        latticePage.enterContactName(dataGen.generateRandomName());
        latticePage.enterDesignation(dataGen.generateDesignation());
        latticePage.enterEmail(dataGen.generateTimestampedEmail());
        latticePage.enterAddress(dataGen.generateAddress());
    }

    @Then("User clicks on save button")
    public void userClicksOnSaveButton() {
        latticePage.clickSaveButton();
    }

    @Then("User verify if the company is created")
    public void user_verify_the_success_message_after_creating_company() {
        latticePage.verifyCompanyName(generatedCompanyName);
    }

    @Then("User verify if the course is created")
    public void user_verify_course_creation() {
        latticePage.verifyCourseName(generatedCourseName);
    }

    @Then("User verify if the training level is created")
    public void user_verify_training_level_creation() {
        latticePage.verifyTrainingLevel(generateLevelName);
    }

    @Then("User verify if the training frequency is created")
    public void user_verify_training_frequency_creation() {
        latticePage.verifyTrainingLevel(generateFrequencyName);
    }

    @Then("User verify if the company is deleted")
    public void user_verify_company_deleted() {
        latticePage.verifyCompanyDeleted(generatedCompanyName);
    }

    @Then("User clicks on first available company to edit")
    public void user_clicks_on_first_available_company_to_edit() {
        latticePage.clickCompanytoEdit();
    }

    @Then("User clicks on first available company to delete")
    public void user_clicks_on_first_available_company_to_delete() {
        latticePage.clickCompanytoDelete();
    }

    @Then("User fills up the course details for {string} days validity")
    public void userFillsUpTheCourseDetailsForDaysValidity(String days) {
        generatedCourseName = dataGen.generateCompanyName();
        latticePage.enterCourseName(generatedCourseName);

        latticePage.enterCourseTopicDetails(dataGen.generateCourseDetails());
        latticePage.enterCourseCategory(dataGen.generateCourseCategory());
        latticePage.enterCourseLink(dataGen.generateCourseLink());
        latticePage.enterCourseValidityDays(days);
    }

    @Then("User fills up the level details")
    public void userFillsUpTheLevelDetails() {
        generateLevelName = dataGen.generateLevelName();
        latticePage.enterLevelName(generateLevelName);
        latticePage.enterWeightage(dataGen.generateWeightage());
    }

    @Then("User fills up the training level details")
    public void userFillsUpTheTrainingLevelDetails() {
        generateFrequencyName = dataGen.generateFrequencyName();
        latticePage.enterFrequencyName(generateFrequencyName);
    }

    @Then("User fills up the training venue details")
    public void userFillsUpTheTrainingVenueDetails() {
        latticePage.enterVenueContact(
                dataGen.generatePhoneNumber(),
                dataGen.generateTimestampedEmail(),
                dataGen.generateAddress()
        );
        latticePage.enterVenueName(dataGen.generateVenueName());
        latticePage.enterMaxNoParticipants(dataGen.generateMaxNoParticipants());
        latticePage.selectVenueType("Dubai");
        latticePage.selectCountry("United Arab Emirates");
        latticePage.selectCity("Dubai");
    }
}
