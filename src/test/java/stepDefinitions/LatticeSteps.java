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
        latticePage.enterCompanyName(dataGen.generateCompanyName());
        latticePage.selectCompanyType(type);
        latticePage.enterContactNumber(dataGen.generatePhoneNumber());
        latticePage.enterContactName(dataGen.generateRandomName());
        latticePage.enterDesignation(dataGen.generateDesignation());
        latticePage.enterEmail(dataGen.generateTimestampedEmail());
        latticePage.enterAddress(dataGen.generateAddress());
        latticePage.clickSaveButton();
    }


}
