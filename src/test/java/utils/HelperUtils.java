package utils;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class HelperUtils {

    private final WebDriver driver;
    private WebDriverWait wait;
    public HelperUtils(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Verify minlength and maxlength attributes of an input field
     */
    public void verifyMinAndMaxLength(By locator, Integer maxLength, Integer minLength) {
        WebElement element = driver.findElement(locator);
        if (maxLength != null) {
            String maxAttr = element.getAttribute("maxlength");
            Assert.assertNotNull(maxAttr, "maxlength attribute is missing");
            Assert.assertEquals(
                    Integer.parseInt(maxAttr),
                    maxLength.intValue(),
                    "maxlength value mismatch"
            );
        }

        if (minLength != null) {
            String minAttr = element.getAttribute("minlength");
            Assert.assertNotNull(minAttr, "minlength attribute is missing");
            Assert.assertEquals(
                    Integer.parseInt(minAttr),
                    minLength.intValue(),
                    "minlength value mismatch"
            );
        }
    }

    public void verifyInlineErrorMessage(By errorLocator, String expectedErrorMessage) {
        WebElement errorElement = driver.findElement(errorLocator);
        String actualErrorMessage = errorElement.getText().trim();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Inline error message mismatch");
    }

    public void clickRandomElement(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        List<WebElement> elements = wait.until(ExpectedConditions
                .visibilityOfAllElementsLocatedBy(locator));

        Assert.assertFalse(elements.isEmpty(), "No visible elements found: " + locator);

        WebElement element = elements.get(new Random().nextInt(elements.size()));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            element.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }
}
