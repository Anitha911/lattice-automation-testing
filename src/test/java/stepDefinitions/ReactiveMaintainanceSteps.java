package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ReactiveMaintainancePage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class ReactiveMaintainanceSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    HelperUtils helperUtils = new HelperUtils(driver);
    ReactiveMaintainancePage tmp = new ReactiveMaintainancePage(driver);
    ElementUtils elementUtils= new ElementUtils(driver);

    @Then("User clicks on RM Transactions {string} in side menu")
    public void user_click_on_ReactiveM(String title) throws InterruptedException {
        String id = "4";
        tmp.MenuRM(id);
    }
    @Then("User clicks on the RM New Request {string} tab")
    public void user_click_on_RMNewRequest(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-graphs']/div[2]/div/ul[1]/li[2]/a";
        tmp.RMNewRequest(xpath);
    }
    @Then("User fills up the New Request details")
    public void userFillsNewRequestDetails() {
        tmp.selectPropertyOwner("Alpha Properties");
        tmp.selectPropertyContract("ABC Tower");
        tmp.selectProperty("ABC Tower");
        tmp.selectZone("ABC Tower");
        tmp.selectSubZone("ROOF TOP");
        tmp.selectBaseUnit("ABC110-ABC110-RF-17 TO H12 CORR [BU1001910]");
        tmp.selectSG("Carpentry");
        tmp.selectFaultCategory("Carpentry");
        tmp.selectFaultCode("12012026RK FC");
    }
    @Then("User clicks on RM New Request save button")
    public void user_click_on_NewRequestSaveButton() {
        tmp.ClickNewRequestSave();
    }
}
