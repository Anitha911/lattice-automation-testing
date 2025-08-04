package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElementUtils {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public ElementUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void clickElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.click();
        } catch (ElementNotInteractableException e) {
            System.out.println("Error clicking element: " + e.getMessage());
        } catch (TimeoutException e) {
            System.out.println("Element not clickable: " + e.getMessage());
        }
    }

    public void enterText(By locator, String text) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.clear();
            element.sendKeys(text);
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        } catch (TimeoutException e) {
            System.out.println("Element not visible: " + e.getMessage());
        }
    }

    public void waitForClickable(By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (TimeoutException e) {
            System.out.println("Element not clickable: " + e.getMessage());
        }
    }

    public boolean isElementPresent(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void assertElementVisible(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            assertTrue("Element is not visible", element.isDisplayed());
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
            throw new AssertionError("Element not found: " + e.getMessage());
        } catch (TimeoutException e) {
            System.out.println("Element not visible within timeout: " + e.getMessage());
            throw new AssertionError("Element not visible within timeout: " + e.getMessage());
        }
    }


    public void takeScreenshot(String fileName) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File resultsFolder = new File("results");
        if (!resultsFolder.exists()) {
            resultsFolder.mkdir();
        }
        File destFile = new File(resultsFolder, fileName);
        try {
            FileHandler.copy(srcFile, destFile);
            System.out.println("Screenshot saved as: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error saving screenshot: " + e.getMessage());
        }
    }

    public void assertPageTitle(String expectedTitle) {
        try {
            String actualTitle = driver.getTitle().trim();
            assertEquals("Expected title: \"" + expectedTitle + "\" but got: \"" + actualTitle + "\"", actualTitle, expectedTitle);
            System.out.println("Title verification passed.");
        } catch (AssertionError e) {
            System.out.println("Title verification failed: " + e.getMessage());
            throw e;
        }
    }

    public void assertCurrentUrl(String expectedUrl) {
        try {
            String actualUrl = driver.getCurrentUrl().trim();
            assertEquals("Expected URL: \"" + expectedUrl + "\" but got: \"" + actualUrl + "\"", actualUrl, expectedUrl);
            System.out.println("URL verification passed.");
        } catch (AssertionError e) {
            System.out.println("URL verification failed: " + e.getMessage());
            throw e;
        }
    }

    public String generateTimestampedEmail() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        return "user_" + timestamp + "@example.com";
    }
}
