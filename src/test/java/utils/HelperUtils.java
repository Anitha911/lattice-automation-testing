package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static groovy.xml.Entity.times;

public class HelperUtils {

    private static WebDriver driver = null;

    public HelperUtils(WebDriver driver) {

        HelperUtils.driver = driver;
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
    public void verifySpecialCharactersNotAllowed(By locator) {
        WebElement fieldElement = driver.findElement(locator);

        String specialChars = "@#$%^&";
        System.out.println("Attempting to enter special characters: " + specialChars);

        fieldElement.sendKeys(specialChars);

        String enteredValue = fieldElement.getAttribute("value").trim();
        System.out.println("Field value after entering special chars: " + enteredValue);

        // If field is empty or doesn't contain special chars, it rejected them
        if (enteredValue.isEmpty() || !enteredValue.contains(specialChars)) {
            System.out.println("✓ Special characters are not allowed - Test Passed");
            Assert.assertTrue(true, "Special characters rejected successfully");
        } else {
            // If field contains special chars, test fails
            Assert.fail("Special characters were allowed in the field - Test Failed!");
        }
    }
    public String getAndStoreDefaultFieldValue(WebDriver driver, By fieldLocator) {
        WebElement fieldElement = driver.findElement(fieldLocator);
        String fieldValue = fieldElement.getAttribute("value");

        // If value is null, try getText()
        if (fieldValue == null || fieldValue.trim().isEmpty()) {
            fieldValue = fieldElement.getText();
        }

        fieldValue = fieldValue.trim();
        System.out.println("Field Value: " + fieldValue);
        return fieldValue;
    }

//    public static void clickRandomElement(By locator) {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//        List<WebElement> elements = wait.until(ExpectedConditions
//                .presenceOfAllElementsLocatedBy(locator));
//
//        Assert.assertFalse(elements.isEmpty(), "No visible elements found: " + locator);
//
//        int randomIndex = new Random().nextInt(elements.size());
//        WebElement element = elements.get(randomIndex);
//
//        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//
//        try {
//            element.click();
//        } catch (Exception e) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
//        }
//
//    }

    public static void clickRandomElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        for (int attempt = 1; attempt <= 2; attempt++) {
            try {
                // Wait until all options are visible (not just present)
                List<WebElement> elements = wait.until(
                        ExpectedConditions.visibilityOfAllElementsLocatedBy(locator)
                );

                Assert.assertFalse(elements.isEmpty(), "No visible elements found: " + locator);

                // Pick random index BEFORE sleep
                int randomIndex = new Random().nextInt(elements.size());

                // Wait for dropdown to fully render
                Thread.sleep(2000);

                // Re-fetch elements AFTER sleep — avoids StaleElementReferenceException
                List<WebElement> freshElements = driver.findElements(locator);
                WebElement element = freshElements.get(randomIndex);

                // Move to element so dropdown scrolls internally
                new Actions(driver).moveToElement(element).perform();

                // Click the option
                element.click();

                return; // success, exit method

            } catch (Exception e) {
                if (attempt == 2) {
                    throw new RuntimeException("[FAILED] Unable to click random element after retries: " + locator, e);
                }
                // Small pause before retry (instead of Thread.sleep in page method)
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    public void enterSpecialCharacters(By locator) {
        String specialChars = "@#$%^&*";
        System.out.println("Entering special characters: " + specialChars);
        driver.findElement(locator).sendKeys(specialChars);
        System.out.println("Special characters entered successfully");
    }

    public void verifyActiveCheckboxSelected(By locator) {
        WebElement checkbox = driver.findElement(locator);
        String html = checkbox.getAttribute("innerHTML");
        Assert.assertTrue(html.contains("rbToggleCheckboxChecked"),
                "Active checkbox is not selected by default");
        System.out.println("PASS: Active checkbox is selected by default");
    }

    public void verifyMaxLength(By locator, int maxLength) {
        WebElement element = driver.findElement(locator);
        String maxAttr = element.getAttribute("maxlength");
        Assert.assertNotNull(maxAttr,"maxlength attribute is missing");
        Assert.assertEquals(Integer.parseInt(maxAttr),maxLength,"maxlength value mismatch");
    }
}
