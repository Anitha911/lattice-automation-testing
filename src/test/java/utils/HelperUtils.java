package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HelperUtils {

    private final WebDriver driver;

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
}
