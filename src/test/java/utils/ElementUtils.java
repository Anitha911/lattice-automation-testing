package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Random;

/**
 * Utility class to handle Selenium interactions safely with logging and retry logic.
 */
public class ElementUtils {

    private final WebDriver driver;
    private static WebDriverWait wait;
    private static final Logger LOGGER = Logger.getLogger(ElementUtils.class.getName());
    private static final int DEFAULT_WAIT_SECONDS = 40;
    private static final int RETRY_COUNT = 5;
    private static final String SCREENSHOT_DIR = "results/screenshots";

    public ElementUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_SECONDS));
    }

    /* ---------------------- PRIVATE HELPERS ---------------------- */

    private WebElement waitUntilVisible(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            String msg = "[TIMEOUT] ELEMENT NOT VISIBLE AFTER " + DEFAULT_WAIT_SECONDS + "S: " + locator;
            LOGGER.log(Level.SEVERE, msg, e);
            throw new FrameworkException(msg, e);
        }
    }

    public WebElement waitUntilClickable(By locator) {
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (TimeoutException e) {
            String msg = "[TIMEOUT] ELEMENT NOT CLICKABLE AFTER " + DEFAULT_WAIT_SECONDS + "S: " + locator;
            LOGGER.log(Level.SEVERE, msg, e);
            throw new FrameworkException(msg, e);
        }
    }

    public void performJsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        LOGGER.info("[JS CLICK] EXECUTED JAVASCRIPT CLICK AS FALLBACK.");
    }

    private void performJsDoubleClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "var evt = new MouseEvent('dblclick', {bubbles: true, cancelable: true, view: window});" +
                        "arguments[0].dispatchEvent(evt);", element);
        LOGGER.info("[SUCCESS] JS DOUBLE CLICKED ELEMENT");
    }

    private WebElement findElementSafely(By locator) {
        try {
            return driver.findElement(locator);
        } catch (NoSuchElementException e) {
            LOGGER.warning("[ELEMENT NOT FOUND] " + locator);
            return null;
        }
    }

    public void waitForElementVisible(By firstItem, int i) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstItem));
    }

    /*
    Full Page loader to disappear
     */
    public static void waitForLoaderToDisappear() {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.xpath("//*[contains(@id,'LoadingPanelctl00_ContentPlaceHolder1')]")));
        } catch (Exception e) {
            // loader may not appear, ignore
        }
    }

    public static void waitForDropdownLoading() {
        try {
            // Wait for LoadingDiv to APPEAR first
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//*[contains(@id, 'LoadingDiv')]")));
            System.out.println("Dropdown loader appeared");
        } catch (Exception e) {
            System.out.println("LoadingDiv not appeared - already loaded");
        }
        try {
            // Then wait for it to DISAPPEAR
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.xpath("//*[contains(@id, 'LoadingDiv')]")));
            System.out.println("Dropdown loader disappeared");
        } catch (TimeoutException e) {
            System.out.println("Dropdown loader timeout - continuing");
        } catch (Exception e) {
            System.out.println("Dropdown loader not found - continuing");
        }
    }

    /* ---------------------- ELEMENT INTERACTIONS ---------------------- */

    /**
     * Clicks the given element, retrying if intercepted.
     */ //newly updated one won't get click utils'
    public ElementUtils click(By locator) {
        LOGGER.info("[ACTION] ATTEMPTING TO CLICK ELEMENT: " + locator);
        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
            try {
                WebElement element = waitUntilClickable(locator);
                element.click();
                LOGGER.info("[SUCCESS] CLICKED ELEMENT: " + locator);
                return this;
            } catch (ElementClickInterceptedException e) {
                LOGGER.warning("[RETRY " + attempt + "] CLICK INTERCEPTED: " + locator);
                performJsClick(waitUntilClickable(locator));
                return this;
            } catch (StaleElementReferenceException e) {
                // ✅ re-fetch on next iteration
                LOGGER.warning("[RETRY " + attempt + "] STALE ELEMENT, RETRYING: " + locator);
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "[RETRY " + attempt + "] FAILED TO CLICK ELEMENT: " + locator, e);
            }
        }
        throw new FrameworkException("[FAILED] UNABLE TO CLICK ELEMENT AFTER RETRIES: " + locator);
    }


    //Old click utils getting stale element
//    public ElementUtils click(By locator) {
//        LOGGER.info("[ACTION] ATTEMPTING TO CLICK ELEMENT: " + locator);
//        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
//            try {
//                WebElement element = waitUntilClickable(locator);
//                element.click();
//                LOGGER.info("[SUCCESS] CLICKED ELEMENT: " + locator);
//                return this;
//            } catch (ElementClickInterceptedException e) {
//                LOGGER.warning("[RETRY " + attempt + "] CLICK INTERCEPTED: " + locator);
//                performJsClick(waitUntilClickable(locator));
//                return this;
//            } catch (Exception e) {
//                LOGGER.log(Level.WARNING, "[RETRY " + attempt + "] FAILED TO CLICK ELEMENT: " + locator, e);
//            }
//        }
//        throw new FrameworkException("[FAILED] UNABLE TO CLICK ELEMENT AFTER RETRIES: " + locator);
//    }

    /**
     * Double-click the element
     */
    public ElementUtils doubleClick(By locator) {
        LOGGER.info("[ACTION] ATTEMPTING TO DOUBLE CLICK ELEMENT: " + locator);
        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
            try {
                WebElement element = waitUntilClickable(locator);
                new Actions(driver).moveToElement(element).doubleClick().perform();
                LOGGER.info("[SUCCESS] DOUBLE CLICKED ELEMENT: " + locator);
                return this;
            } catch (ElementClickInterceptedException e) {
                LOGGER.warning("[RETRY " + attempt + "] DOUBLE CLICK INTERCEPTED: " + locator);
                performJsDoubleClick(waitUntilClickable(locator));
                return this;
            } catch (StaleElementReferenceException e) {
                LOGGER.warning("[RETRY " + attempt + "] STALE ELEMENT, RETRYING: " + locator);
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "[RETRY " + attempt + "] FAILED TO DOUBLE CLICK ELEMENT: " + locator, e);
            }
        }
        throw new FrameworkException("[FAILED] UNABLE TO DOUBLE CLICK ELEMENT AFTER RETRIES: " + locator);
    }




    /**
     *Wait for Attribute Not to be Empty in text box
     */
    public void waitForAttributeNotEmpty(By locator, String attribute) {
        wait.until(driver -> {
            WebElement element = driver.findElement(locator);
            String value = element.getAttribute(attribute);
            return value != null && !value.trim().isEmpty();
        });
    }

    /**
     *Click Refresh
     */
    public void clickRefreshed(By locator) {
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(locator))).click();
    }

    /**
     * Clears existing text and types the given input into the element.
     */
    //Newly added typetext util, because it won't get any stale element exception
    public ElementUtils typeText(By locator, String text) {
        LOGGER.info("[ACTION] TYPING TEXT INTO ELEMENT: " + locator + " → '" + text + "'");
        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
            try {
                WebElement element = waitUntilVisible(locator); // ✅ re-fetch every attempt
                element.clear();
                element.sendKeys(text);
                LOGGER.info("[SUCCESS] TEXT ENTERED SUCCESSFULLY.");
                return this;
            } catch (InvalidElementStateException e) {
                LOGGER.warning("[RETRY " + attempt + "] UNABLE TO TYPE TEXT. RETRYING...");
            } catch (StaleElementReferenceException e) {
                LOGGER.warning("[RETRY " + attempt + "] STALE ELEMENT, RETRYING TYPE TEXT...");
            }
        }
        throw new FrameworkException("[FAILED] UNABLE TO TYPE TEXT AFTER RETRIES: " + locator);
    }

    //User wait for seconds
    public static void userWaitsForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
            System.out.println("Waited for " + seconds + " seconds.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Wait interrupted: " + e.getMessage());
        }
    }


//    Old Type text util --- If i use the old util getting stale element

//    public ElementUtils typeText(By locator, String text) {
//        LOGGER.info("[ACTION] TYPING TEXT INTO ELEMENT: " + locator + " → '" + text + "'");
//        WebElement element = waitUntilVisible(locator);
//        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
//            try {
//                element.clear();
//                element.sendKeys(text);
//                LOGGER.info("[SUCCESS] TEXT ENTERED SUCCESSFULLY.");
//                return this;
//            } catch (InvalidElementStateException e) {
//                LOGGER.warning("[RETRY " + attempt + "] UNABLE TO TYPE TEXT. RETRYING...");
//            }
//        }
//        throw new FrameworkException("[FAILED] UNABLE TO TYPE TEXT AFTER RETRIES: " + locator);
//    }

    /**
     * Checks if the element is present and visible on the DOM.
     */
    public boolean isElementVisible(By locator) {
        LOGGER.info("[CHECK] CHECKING VISIBILITY OF ELEMENT: " + locator);
        WebElement element = findElementSafely(locator);
        boolean isVisible = element != null && element.isDisplayed();
        LOGGER.info("[RESULT] ELEMENT VISIBILITY: " + locator + " → " + isVisible);
        return isVisible;
    }

    /**
     * Waits until the element becomes invisible.
     */
    public boolean waitUntilInvisible(By locator) {
        LOGGER.info("[WAIT] WAITING FOR INVISIBILITY OF ELEMENT: " + locator);

        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_SECONDS));
                boolean isInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));

                if (isInvisible) {
                    LOGGER.info("[SUCCESS] ELEMENT IS INVISIBLE: " + locator);
                    return true;
                }
            } catch (TimeoutException e) {
                LOGGER.warning("[RETRY " + attempt + "] ELEMENT STILL VISIBLE. RETRYING...");
            }
        }

        throw new FrameworkException("[FAILED] ELEMENT DID NOT BECOME INVISIBLE AFTER RETRIES: " + locator);
    }



    /**
     * Waits until the element becomes visible.
     */

//    Newly updated wait because if i used old wait getting stale element
    public WebElement waitForVisibility(By locator) {
        LOGGER.info("[WAIT] WAITING FOR VISIBILITY OF ELEMENT: " + locator);

        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_SECONDS));
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

                if (element != null && element.isDisplayed()) {
                    LOGGER.info("[SUCCESS] ELEMENT IS VISIBLE: " + locator);
                    return element;
                }
            } catch (TimeoutException e) {
                LOGGER.warning("[RETRY " + attempt + "] ELEMENT STILL NOT VISIBLE. RETRYING...");
            } catch (StaleElementReferenceException e) {
                // ✅ Re-find on next retry
                LOGGER.warning("[RETRY " + attempt + "] STALE ELEMENT, RETRYING VISIBILITY CHECK...");
            }
        }

        throw new FrameworkException("[FAILED] ELEMENT DID NOT BECOME VISIBLE AFTER RETRIES: " + locator);
    }

//    Old Wait

//    public WebElement waitForVisibility(By locator) {
//        LOGGER.info("[WAIT] WAITING FOR VISIBILITY OF ELEMENT: " + locator);
//
//        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
//            try {
//                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_SECONDS));
//                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//
//                if (element != null && element.isDisplayed()) {
//                    LOGGER.info("[SUCCESS] ELEMENT IS VISIBLE: " + locator);
//                    return element;
//                }
//            } catch (TimeoutException e) {
//                LOGGER.warning("[RETRY " + attempt + "] ELEMENT STILL NOT VISIBLE. RETRYING...");
//            }
//        }
//
//        throw new FrameworkException("[FAILED] ELEMENT DID NOT BECOME VISIBLE AFTER RETRIES: " + locator);
//    }

    /**
     * Checks if the radio element is Checked.
     */
    public boolean isChecked(By locator) {
        LOGGER.info("[CHECK] CHECKING SELECTION STATUS OF ELEMENT: " + locator);
        WebElement element = findElementSafely(locator);
        boolean isChecked = element != null && "true".equalsIgnoreCase(element.getAttribute("value"));
        LOGGER.info("[RESULT] SELECTION STATUS OF: " + locator + " → " + isChecked);
        return isChecked;
    }


    /**
     * Waits until the element is clickable.
     */
    public ElementUtils waitForElementToBeClickable(By locator) {
        LOGGER.info("[WAIT] WAITING FOR ELEMENT TO BE CLICKABLE: " + locator);
        waitUntilClickable(locator);
        LOGGER.info("[SUCCESS] ELEMENT IS NOW CLICKABLE.");
        return this;
    }

    /* ---------------------- ASSERTIONS ---------------------- */

    /**
     * Verifies that the element is visible.
     */
    public ElementUtils verifyElementIsVisible(By locator) {
        LOGGER.info("[ASSERT] VERIFYING ELEMENT VISIBILITY: " + locator);
        WebElement element = waitUntilVisible(locator);
        if (!element.isDisplayed()) {
            throw new FrameworkException("[FAILED ASSERTION] ELEMENT IS NOT VISIBLE: " + locator);
        }
        LOGGER.info("[PASS] ELEMENT IS VISIBLE: " + locator);
        return this;
    }

    /**
     * Verifies that the page title matches the expected title.
     */
    public ElementUtils verifyPageTitleIs(String expectedTitle) {
        LOGGER.info("[ASSERT] VERIFYING PAGE TITLE. EXPECTED: " + expectedTitle);
        String actualTitle = driver.getTitle().trim();
        if (!actualTitle.equals(expectedTitle)) {
            throw new FrameworkException("PAGE TITLE MISMATCH! EXPECTED: " + expectedTitle + " | ACTUAL: " + actualTitle);
        }
        LOGGER.info("[PASS] PAGE TITLE VERIFIED: " + actualTitle);
        return this;
    }

    /**
     * Verifies that the current URL matches the expected URL.
     */
    public ElementUtils verifyCurrentUrlIs(String expectedUrl) {
        LOGGER.info("[ASSERT] VERIFYING CURRENT URL. EXPECTED: " + expectedUrl);
        String actualUrl = driver.getCurrentUrl().trim();
        if (!actualUrl.equals(expectedUrl)) {
            throw new FrameworkException("URL MISMATCH! EXPECTED: " + expectedUrl + " | ACTUAL: " + actualUrl);
        }
        LOGGER.info("[PASS] URL VERIFIED SUCCESSFULLY: " + actualUrl);
        return this;
    }

    /* ---------------------- NAVIGATION ---------------------- */

    /**
     * Navigates to a given URL directly or from configuration.
     */
    public ElementUtils openUrl(String urlKeyOrValue) {
        String url = urlKeyOrValue.startsWith("http")
                ? urlKeyOrValue
                : ConfigReader.getProperty(urlKeyOrValue);

        LOGGER.info("[NAVIGATE] NAVIGATING TO URL: " + url);

        try {
            driver.get(url);
            wait.until(webDriver ->
                    ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete")
            );
            LOGGER.info("[SUCCESS] NAVIGATION COMPLETED: " + url);
        } catch (Exception e) {
            throw new FrameworkException("FAILED TO NAVIGATE TO URL: " + url, e);
        }
        return this;
    }

    /* ---------------------- SCREENSHOTS ---------------------- */

    /**
     * Captures a screenshot and returns the file path.
     */
    public String captureScreenshot(String scenarioName) {
        LOGGER.info("[SCREENSHOT] CAPTURING SCREENSHOT...");
        File screenshotDir = new File(SCREENSHOT_DIR);
        if (!screenshotDir.exists() && screenshotDir.mkdirs()) {
            LOGGER.info("[INIT] SCREENSHOT DIRECTORY CREATED: " + screenshotDir.getAbsolutePath());
        }

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String safeScenarioName = scenarioName.replaceAll("[^a-zA-Z0-9]", "_");
        File destFile = new File(screenshotDir, safeScenarioName + "_" + timestamp + ".png");

        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(srcFile, destFile);
            LOGGER.info("[SUCCESS] SCREENSHOT SAVED: " + destFile.getAbsolutePath());
            return destFile.getAbsolutePath();
        } catch (IOException e) {
            throw new FrameworkException("SCREENSHOT CAPTURE FAILED!", e);
        }
    }

    /* ---------------------- WINDOW HANDLING ---------------------- */

    /**
     * Switches to a window that contains the given title.
     */
    public ElementUtils switchToWindowWithTitle(String partialTitle) {
        LOGGER.info("[WINDOW] SWITCHING TO WINDOW CONTAINING TITLE: " + partialTitle);
        String currentWindow = driver.getWindowHandle();

        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            if (driver.getTitle().toUpperCase().contains(partialTitle.toUpperCase())) {
                LOGGER.info("[SUCCESS] SWITCHED TO WINDOW: " + driver.getTitle());
                return this;
            }
        }
        driver.switchTo().window(currentWindow);
        throw new FrameworkException("NO WINDOW FOUND WITH TITLE CONTAINING: " + partialTitle);
    }



    /**
     * Switches to a window that contains the given URL
    */
    public ElementUtils switchToWindowWithURL(String partialURL) {
        LOGGER.info("[WINDOW] SWITCHING TO WINDOW CONTAINING URL: " + partialURL);
        String currentWindow = driver.getWindowHandle();

        // Wait until new tab opens
        wait.until(d -> d.getWindowHandles().size() > 1);

        // Wait until new window has the expected URL
        wait.until(d -> {
            for (String window : d.getWindowHandles()) {
                d.switchTo().window(window);
                if (d.getCurrentUrl().contains(partialURL)) {
                    return true;
                }
            }
            return false;
        });

        if (driver.getCurrentUrl().contains(partialURL)) {
            LOGGER.info("[SUCCESS] SWITCHED TO URL: " + driver.getCurrentUrl());
            return this;
        }

        driver.switchTo().window(currentWindow);
        throw new FrameworkException("NO WINDOW FOUND WITH URL CONTAINING: " + partialURL);
    }

    /* ---------------------- CUSTOM TIMEOUT SUPPORT ---------------------- */

    /**
     * Sets a custom timeout for explicit waits.
     */
    public ElementUtils setCustomTimeout(int seconds) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        LOGGER.info("[CONFIG] TIMEOUT UPDATED TO " + seconds + " SECONDS.");
        return this;
    }

    /* ---------------------- TEXT UTILITIES ---------------------- */

    /**
     * Gets the visible text of the element, cleaning whitespace.
     */
    public String getText(By locator) {
        LOGGER.info("[ACTION] RETRIEVING TEXT FROM ELEMENT: " + locator);

        WebElement element = waitUntilVisible(locator);
        String rawText = element.getText();

        if (rawText == null) {
            LOGGER.warning("[WARNING] RETRIEVED TEXT IS NULL FOR ELEMENT: " + locator);
            return "";
        }
        String cleanedText = rawText
                .replaceAll("\\s+", " ")
                .trim();

        LOGGER.info("[RESULT] CLEANED TEXT FOR ELEMENT " + locator + ": '" + cleanedText + "'");
        return cleanedText;
    }
    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public void clearAndType(By by, String value) {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        el.click();
        el.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        el.sendKeys(Keys.DELETE);
        el.sendKeys(value);
    }

    public void clickUsingActions(By locator) {
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
        new Actions(driver).moveToElement(el).pause(Duration.ofMillis(100)).click().perform();
    }

    public ElementUtils jsClick(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        return this;
    }

    public ElementUtils waitForElementVisible(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }

    public void waitForElementClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void clear(By locator) {
        waitForElementVisible(locator);
        driver.findElement(locator).clear();
    }

//Asset Management

//    public void doubleClick(By locator) {
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("var evt = new MouseEvent('dblclick', {bubbles: true}); arguments[0].dispatchEvent(evt);", element);
//    }

    public void selectDropdownByVisibleText(By dropdown, String value) {
        click(dropdown);
        By option = By.xpath("//li[normalize-space()='" + value + "']");
        wait.until(ExpectedConditions.elementToBeClickable(option)).click();
    }

    public void scrollToElement(By locator) {
    }

    public void waitForSeconds(int i) {
    }

    public void waitForElement(By locator)
    {
        waitUntilClickable(locator);
    }


    public void waitForInvisibility(By locator, int i)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }


//Asset - Master - Model

    public void selectDropdownByText(By dropdown, String value) {
        click(dropdown);
        By option = By.xpath("//li[normalize-space(.)='" + value + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected dropdown value: " + value);
    }


    }




