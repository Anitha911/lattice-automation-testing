package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FinancialTrackingPage;
import pages.SalesEnquiryLeadsPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class FinancialTrackingSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    HelperUtils helperUtils = new HelperUtils(driver);
    FinancialTrackingPage tmp = new FinancialTrackingPage(driver);
    ElementUtils elementUtils= new ElementUtils(driver);

    @Then("User clicks on Financial Transactions Tracking {string} in side menu")
    public void user_click_on_FinancialTracking(String title) throws InterruptedException {
        String id = "29";
        tmp.MenuFinancialTrackingPage(id);
    }
    @Then("User Clicks on Financial Transactions Tracking Online Order {string} in side menu")
    public void user_click_on_FinancialTrackingOnlineOrder(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Financial']/div[2]/div/ul[1]/li[2]/a";
        tmp.OnlineOrderClick(xpath);
    }
    @Then("User Clicks on Financial Transactions Tracking Invoice Advices {string} in side menu")
    public void user_click_on_FinancialTrackingInvoiceAdvices(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Financial']/div[2]/div/ul[2]/li[2]/a";
        tmp.InvoiceAdvicesClick(xpath);
    }
}
