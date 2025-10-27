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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utility class to handle Selenium interactions safely with logging and retry logic.
 */
public class ElementUtils {

    private final WebDriver driver;
    private WebDriverWait wait;
    private static final Logger LOGGER = Logger.getLogger(ElementUtils.class.getName());
    private static final int DEFAULT_WAIT_SECONDS = 30;
    private static final int RETRY_COUNT = 2;
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

    private WebElement waitUntilClickable(By locator) {
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (TimeoutException e) {
            String msg = "[TIMEOUT] ELEMENT NOT CLICKABLE AFTER " + DEFAULT_WAIT_SECONDS + "S: " + locator;
            LOGGER.log(Level.SEVERE, msg, e);
            throw new FrameworkException(msg, e);
        }
    }

    private void performJsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        LOGGER.info("[JS CLICK] EXECUTED JAVASCRIPT CLICK AS FALLBACK.");
    }

    private WebElement findElementSafely(By locator) {
        try {
            return driver.findElement(locator);
        } catch (NoSuchElementException e) {
            LOGGER.warning("[ELEMENT NOT FOUND] " + locator);
            return null;
        }
    }

    /* ---------------------- ELEMENT INTERACTIONS ---------------------- */

    /**
     * Clicks the given element, retrying if intercepted.
     */
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
                performJsClick(waitUntilClickable(locator)); // fallback
                return this;
            } catch (Exception e) {
                LOGGER.log(Level.WARNING, "[RETRY " + attempt + "] FAILED TO CLICK ELEMENT: " + locator, e);
            }
        }
        throw new FrameworkException("[FAILED] UNABLE TO CLICK ELEMENT AFTER RETRIES: " + locator);
    }

    /**
     * Clears existing text and types the given input into the element.
     */
    public ElementUtils typeText(By locator, String text) {
        LOGGER.info("[ACTION] TYPING TEXT INTO ELEMENT: " + locator + " → '" + text + "'");
        WebElement element = waitUntilVisible(locator);
        for (int attempt = 1; attempt <= RETRY_COUNT; attempt++) {
            try {
                element.clear();
                element.sendKeys(text);
                LOGGER.info("[SUCCESS] TEXT ENTERED SUCCESSFULLY.");
                return this;
            } catch (InvalidElementStateException e) {
                LOGGER.warning("[RETRY " + attempt + "] UNABLE TO TYPE TEXT. RETRYING...");
            }
        }
        throw new FrameworkException("[FAILED] UNABLE TO TYPE TEXT AFTER RETRIES: " + locator);
    }

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
}
