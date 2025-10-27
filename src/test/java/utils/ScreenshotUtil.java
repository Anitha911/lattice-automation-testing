package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utility class to capture and store screenshots during test execution.
 * Screenshots are stored in the "screenshots" folder at the project root.
 */
public class ScreenshotUtil {

    private static final Logger LOGGER = Logger.getLogger(ScreenshotUtil.class.getName());
    private static final String SCREENSHOT_DIR = System.getProperty("user.dir") + "/screenshots/";

    /**
     * Captures a screenshot of the current browser window.
     *
     * @param driver   WebDriver instance
     * @param fileName Desired file name (without extension)
     * @return Full path of the saved screenshot
     */
    public static String captureScreenshot(WebDriver driver, String fileName) {
        LOGGER.log(Level.INFO, "STARTING SCREENSHOT CAPTURE PROCESS...");

        if (driver == null) {
            LOGGER.log(Level.SEVERE, "WEBDRIVER INSTANCE IS NULL. CANNOT CAPTURE SCREENSHOT.");
            throw new IllegalArgumentException("WebDriver instance cannot be null");
        }

        // Add timestamp to avoid overwriting files
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String finalFileName = fileName + "_" + timestamp + ".png";
        File directory = new File(SCREENSHOT_DIR);

        try {
            // Ensure directory exists
            if (!directory.exists()) {
                LOGGER.log(Level.INFO, "SCREENSHOT DIRECTORY NOT FOUND. CREATING DIRECTORY: {0}", SCREENSHOT_DIR);
                if (directory.mkdirs()) {
                    LOGGER.log(Level.INFO, "DIRECTORY CREATED SUCCESSFULLY.");
                } else {
                    LOGGER.log(Level.SEVERE, "FAILED TO CREATE SCREENSHOT DIRECTORY: {0}", SCREENSHOT_DIR);
                }
            }

            LOGGER.log(Level.INFO, "TAKING SCREENSHOT...");
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            File destination = new File(SCREENSHOT_DIR + finalFileName);
            FileHandler.copy(source, destination);

            LOGGER.log(Level.INFO, "SCREENSHOT SAVED SUCCESSFULLY AT: {0}", destination.getAbsolutePath());
            return destination.getAbsolutePath();

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "FAILED TO SAVE SCREENSHOT. ERROR: {0}", e.getMessage());
            throw new RuntimeException("Error while saving screenshot: " + e.getMessage(), e);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "UNEXPECTED ERROR OCCURRED WHILE CAPTURING SCREENSHOT: {0}", e.getMessage());
            throw new RuntimeException("Unexpected error while capturing screenshot: " + e.getMessage(), e);
        }
    }
}
