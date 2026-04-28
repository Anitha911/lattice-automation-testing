package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EnergyUtilityPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;

public class EnergyUtilitySteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    EnergyUtilityPage tmp = new EnergyUtilityPage(driver);

    @Then("User clicks on Energy Utility {string} in side menu")
    public void user_click_on_EnergyUtility(String title) throws InterruptedException {
        String id = "15";
        tmp.MenuEnergyUtilityTrackingPage(id);
    }
    @Then("User Clicks on Energy Utility Account Meter Set Up {string} in side menu")
    public void user_click_on_EnergyUtilityAccMeterSetUp(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-energy']/div[2]/div/ul[1]/li[2]/a";
        tmp.AccMeterSetUp(xpath);
    }
    @Then("User clicks on button Energy Utility Account Meter Set Up Add {string}")
    public void user_click_on_AccMeterSetUp(String btnAddAccMeterSetUp) throws InterruptedException {
        tmp.clickOnAddAccMeterSetUp(btnAddAccMeterSetUp);
    }
    //Pagination
    @Then("User clicks the AccountMeterSet Up Pagination arrow {string} in the grid")
    public void user_click_on_AccountMeterSetUpPagination(String GrdAccountMeterSetUp) throws InterruptedException {
        tmp.clickOnGrdAccountMeterSetUpPagination(GrdAccountMeterSetUp);
    }
    //No of data per page
    @Then("User clicks the AccountMeterSet Up no of data per page {int} in the grid")
    public void user_click_on_AccountMeterSetUpDataPerPage(int GrdAccountMeterSetUp) throws InterruptedException {
        tmp.validatePageSize(GrdAccountMeterSetUp);
    }
}
