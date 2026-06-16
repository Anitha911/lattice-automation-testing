package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FinancialTrackingPage;
import pages.InventoryManagementPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class InventoryManagementSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    HelperUtils helperUtils = new HelperUtils(driver);
    InventoryManagementPage tmp = new InventoryManagementPage(driver);
    ElementUtils elementUtils= new ElementUtils(driver);

    @Then("User clicks on Inventory Management {string} in side menu")
    public void user_click_on_InventoryManagement(String title) throws InterruptedException {
        String id = "7";
        tmp.MenuInventoryManagement(id);
    }
    @Then("User Clicks on Inventory Management Supplier {string} in side menu")
    public void user_click_on_InvMgmtSupplier(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Inventory']/div[2]/div/ul[1]/li[2]/a";
        tmp.SupplierClick(xpath);
    }
    @Then("User Clicks on Include Inactive Supplier Checkbox")
    public void user_click_on_InclInactiveSupplier() throws InterruptedException {
        String id = "ContentPlaceHolder1_chkInactive";
        tmp.InclInactiveSupplier();
    }
    @Then("User Clicks on Inventory Management Supplier grid {string}")
    public void user_click_on_InventoryManagementSuppliergridPagination(String GrdSupplierPagination) throws InterruptedException {
        tmp.GrdSupplierPagination(GrdSupplierPagination);
    }
    //No of data per page
    @Then("User clicks the Inventory Management Supplier no of data per page {int} in the grid")
    public void user_click_on_InventoryManagementSuppliergridDataPerPage(int GrdSupplierDataPerPage) throws InterruptedException {
        tmp.validatePageSizeGrdSupplier(GrdSupplierDataPerPage);
    }
}
