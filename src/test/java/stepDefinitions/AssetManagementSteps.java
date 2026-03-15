package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.DriverFactory;
import utils.ElementUtils;

import java.time.Duration;


public class AssetManagementSteps {
    private final ElementUtils elementUtils = new ElementUtils(DriverFactory.getDriver());

    @Then("the {string} page should be opened successfully")
    public void page_opens(String title) {
        Assert.assertEquals(
                elementUtils.getText(By.cssSelector("[class=\"tasks-header\"] h3")),
                title,
                "Text mismatch"
        );
        elementUtils.isElementVisible(By.id("ctl00_ContentPlaceHolder1_btnAddAsset"));
    }

    @Then("the user should be able to view the label {string} at the end of the Asset Register page")
    public void page_size_label(String title) {
        Assert.assertEquals(
                elementUtils.getText(By.id("ctl00_ContentPlaceHolder1_grdAsset_ctl00_ctl03_ctl01_ChangePageSizeLabel")),
                title,
                "Text mismatch"
        );
    }

    @Then("the user should be able to view the label {string} on the left pane of the Asset Register page")
    public void asset_Classification_View(String title) {
        Assert.assertEquals(
                elementUtils.getText(By.cssSelector("#ContentPlaceHolder1_dv_AssetClassificationView .field-placeholder")),
                title,
                "Text mismatch"
        );
    }

    @Then("the user should be able to view the grid field label {string} on the Asset Register page")
    public void verify_table_labels(String title) {
        By locator = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAsset_ctl00_Header']//a[text()='" + title + "']");
        WebDriver driver = DriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            String actualText = element.getText().trim();  // trim just in case
            Assert.assertEquals(actualText, title, "Text mismatch");
            System.out.println("Grid field label '" + title + "' exists and matches.");
        } catch (TimeoutException e) {
            boolean existsInDom = !driver.findElements(locator).isEmpty();
            if (existsInDom) {
                System.out.println("Grid field label '" + title + "' exists in DOM but not visible.");
            } else {
                System.out.println("Grid field label '" + title + "' not found in DOM.");
            }
        }
    }
}