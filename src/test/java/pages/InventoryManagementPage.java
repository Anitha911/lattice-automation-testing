package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HelperUtils;
import java.time.Duration;
import java.util.List;

public class InventoryManagementPage extends BasePage {
    public InventoryManagementPage(WebDriver driver) {
        super(driver);
    }
    public void MenuInventoryManagement(String MenuInventoryManagement) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("7"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on the MenuInventoryManagement: " + MenuInventoryManagement);
        } catch (Exception e) {
            System.out.println("Failed to click on the MenuInventoryManagement: " + MenuInventoryManagement);
            throw e;
        }
    }
    public void SupplierClick(String SupplierClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Inventory']/div[2]/div/ul[1]/li[2]/a", SupplierClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Supplier Click: " + SupplierClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Supplier Click: " + SupplierClick);
            throw e;
        }
    }
    public void InclInactiveSupplier()throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("ContentPlaceHolder1_chkInactive"));
            element.click();
            System.out.println("Clicked on Inactive Supplier Click: " );
        } catch (Exception e) {
            System.out.println("Failed to click on Inactive Supplier Click: " );
            throw e;
        }
    }
    //Supplier Pagination Start
    public void GrdSupplierPagination(String GrdSupplierPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Supplier_Grid_GridData']")));
            String beforeText = firstRowBefore.getText();
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Supplier_Grid_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Supplier_Grid_GridData']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + GrdSupplierPagination);
            throw e;
        }
    }
    //Supplier Pagination Ends
    //Supplier Data per page check starts
    public void validatePageSizeGrdSupplier(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_Supplier_Grid_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
}
