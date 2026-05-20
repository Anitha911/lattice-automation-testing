package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HelpDeskB2CServicePage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import java.io.IOException;

public class HelpDeskB2CServiceSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    HelpDeskB2CServicePage tmp = new HelpDeskB2CServicePage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User clicks on HelpDesk {string} in navigation panel")
    public void user_click_on_HelpDesk(String title) throws InterruptedException {
        String xpath = "//*[@id='27']";
        tmp.clickOnHelpDeskMenu(xpath);
    }
    @Then("User clicks on the Call Centre {string} tab")
    public void user_click_on_CallCentreHelpDesk(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-helpdesk']/div[2]/div/ul[1]/li[2]/a";
        tmp.CallCentreHelpDesk(xpath);
    }
    @Then("User clicks Direct WO Booking Button")
    public void user_clicks_DirectWOBkngButton() {
        tmp.clickDirectWOBkngButton();
    }
}
