package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HelperUtils;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;

public class EnergyUtilityPage extends BasePage {
    public EnergyUtilityPage(WebDriver driver) {
        super(driver);
    }
    public void MenuEnergyUtilityTrackingPage(String MenuEnergyUtilityTrackingPage) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("15"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on the MenuEnergyUtilityTrackingPage: " + MenuEnergyUtilityTrackingPage);
        } catch (Exception e) {
            System.out.println("Failed to click on the MenuEnergyUtilityTrackingPage: " + MenuEnergyUtilityTrackingPage);
            throw e;
        }
    }
    public void AccMeterSetUp(String AccMeterSetUp) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-energy']/div[2]/div/ul[1]/li[2]/a", AccMeterSetUp)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Acc meter Set Up: " + AccMeterSetUp);
        } catch (Exception e) {
            System.out.println("Failed to click on Acc meter Set Up: " + AccMeterSetUp);
            throw e;
        }
    }
    //Add Account/Meter Set Up
    public void clickOnAddAccMeterSetUp(String clickOnAddAccMeterSetUp) {
        try {
            By locator = By.id("BtnAdd");
            utils.click(locator);
            System.out.println("Clicked on the clickOnAddAccMeterSetUp Button: " + clickOnAddAccMeterSetUp);
        } catch (Exception e) {
            System.out.println("Failed to click on the clickOnAddAccMeterSetUp Button:: " + clickOnAddAccMeterSetUp);
            throw e;
        }
    }
    //AccountMeter SetUp Pagination Start
    public void clickOnGrdAccountMeterSetUpPagination(String clickOnGrdAccountMeterSetUpPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdEnergyAccountSetup']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdEnergyAccountSetup_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextBtn);
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdEnergyAccountSetup']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + clickOnGrdAccountMeterSetUpPagination);
            throw e;
        }
    }
    //AccountMeter SetUp Pagination Ends
    //AccountMeter SetUp Data Per page Starts
        public void validatePageSize(int expectedSize) {
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdEnergyAccountSetup_ctl00_ctl03_ctl01_PageSizeComboBox_Input")));
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
    //AccountMeter SetUp Data Per page Ends
}
