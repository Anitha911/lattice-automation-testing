package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverFactory {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static final Logger LOGGER = Logger.getLogger(DriverFactory.class.getName());

    /**
     * GET THE CURRENT WEBDRIVER INSTANCE FOR THE THREAD.
     */
    public static WebDriver getDriver() {
        return driver.get();
    }

    /**
     * INITIALIZE THE WEBDRIVER BASED ON THE BROWSER SPECIFIED IN CONFIG.
     */
    public static void initializeDriver() {
        String browser = ConfigReader.getProperty("browser");

        LOGGER.info(() -> "[INIT] STARTING BROWSER INITIALIZATION FOR: " + browser.toUpperCase());

        WebDriver webDriver = switch (browser.toLowerCase()) {
            case "firefox" -> {
                LOGGER.info("[BROWSER] LAUNCHING FIREFOX BROWSER IN HEADLESS MODE.");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless=new");
                firefoxOptions.addArguments("--disable-gpu");
                firefoxOptions.addArguments("--no-sandbox");
                firefoxOptions.addArguments("--disable-dev-shm-usage");
                yield new FirefoxDriver(firefoxOptions);
            }
            case "edge" -> {
                LOGGER.info("[BROWSER] LAUNCHING EDGE BROWSER IN HEADLESS MODE.");
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--headless=new");
                edgeOptions.addArguments("--disable-gpu");
                edgeOptions.addArguments("--no-sandbox");
                edgeOptions.addArguments("--disable-dev-shm-usage");
                yield new EdgeDriver(edgeOptions);
            }
            default -> {
                LOGGER.info("[BROWSER] LAUNCHING CHROME BROWSER.");
                ChromeOptions chromeOptions = new ChromeOptions();
                // UNCOMMENT FOR CI PIPELINE USAGE
                // chromeOptions.addArguments("--headless=new");
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");

                // FIX FOR "USER-DATA-DIR ALREADY IN USE"
                try {
                    Path tempProfile = Files.createTempDirectory("chrome-user-data");
                    chromeOptions.addArguments("--user-data-dir=" + tempProfile.toAbsolutePath());
                    LOGGER.info("[CHROME] TEMPORARY USER-DATA DIRECTORY CREATED AT: " + tempProfile);
                } catch (Exception e) {
                    LOGGER.log(Level.WARNING, "[CHROME] FAILED TO CREATE TEMP USER-DATA-DIR. CONTINUING WITHOUT IT.", e);
                }

                yield new ChromeDriver(chromeOptions);
            }
        };

        LOGGER.info("[INIT] BROWSER LAUNCHED SUCCESSFULLY: " + browser.toUpperCase());

        // MAXIMIZE THE BROWSER WINDOW
        try {
            webDriver.manage().window().maximize();
            LOGGER.info("[ACTION] BROWSER WINDOW MAXIMIZED.");
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "[WARNING] FAILED TO MAXIMIZE THE BROWSER WINDOW.", e);
        }

        driver.set(webDriver);
        LOGGER.info("[INIT] WEBDRIVER INSTANCE STORED IN THREADLOCAL FOR SAFE PARALLEL EXECUTION.");
    }

    /**
     * QUIT THE WEBDRIVER INSTANCE AND CLEAN UP RESOURCES.
     */
    public static void quitDriver() {
        WebDriver currentDriver = driver.get();
        if (currentDriver != null) {
            try {
                LOGGER.info("[TEARDOWN] QUITTING BROWSER SESSION.");
                currentDriver.quit();
                LOGGER.info("[TEARDOWN] BROWSER SESSION ENDED SUCCESSFULLY.");
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "[ERROR] FAILED TO QUIT THE WEBDRIVER PROPERLY.", e);
            } finally {
                driver.remove();
                LOGGER.info("[CLEANUP] THREADLOCAL WEBDRIVER INSTANCE REMOVED.");
            }
        } else {
            LOGGER.warning("[TEARDOWN] NO ACTIVE WEBDRIVER INSTANCE FOUND TO QUIT.");
        }
    }
}
