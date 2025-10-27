package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import pages.BasePage;
import pages.LoginPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.TestDataGenerator;


public class LoginSteps {
    public static String generatedCompanyName;
    public static String generatedCourseName;
    public static String generateLevelName;
    public static String generateFrequencyName;

    private final WebDriver driver = DriverFactory.getDriver();
    ElementUtils utils = new ElementUtils(driver);
    LoginPage latticePage = new LoginPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();


    @Given("User navigates to {string} page")
    public void user_is_on_login_page(String url) {
        utils.openUrl(url);
    }

    @Then("User is at home screen after login with {string} and {string}")
    public void user_is_at_home_screen_after_login_with_and(String username, String pw) throws InterruptedException {
        latticePage.login(username, pw);
    }
}
