package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.HelperUtils;
import java.util.Random;

public class FinancialTrackingPage extends BasePage {
    public FinancialTrackingPage(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);
    String mainTab = driver.getWindowHandle();
    HelperUtils helperUtils = new HelperUtils(driver);

    public void MenuFinancialTrackingPage(String FinancialTrackingPage) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("29"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //By locator = By.id("13");
            //utils.click(locator);
            System.out.println("Clicked on the FinancialTrackingPage: " + FinancialTrackingPage);
        } catch (Exception e) {
            System.out.println("Failed to click on the FinancialTrackingPage: " + FinancialTrackingPage);
            throw e;
        }
    }
    public void OnlineOrderClick(String OnlineOrderClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[1]/li[2]/a", OnlineOrderClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //utils.click(locator);
            System.out.println("Clicked on Online Order Click: " + OnlineOrderClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Online Order Click: " + OnlineOrderClick);
            throw e;
        }
    }
    public void InvoiceAdvicesClick(String InvoiceAdvicesClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[2]/li[2]/a", InvoiceAdvicesClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //utils.click(locator);
            System.out.println("Clicked on Invoice Advices Click: " + InvoiceAdvicesClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Invoice Advices Click: " + InvoiceAdvicesClick);
            throw e;
        }
    }
}
