package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static groovy.xml.Entity.times;

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
//    public void clickRandomElement(By locator) {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//        List<WebElement> elements = wait.until(ExpectedConditions
//                .visibilityOfAllElementsLocatedBy(locator));
//
//        Assert.assertFalse(elements.isEmpty(), "No visible elements found: " + locator);
//
//        WebElement element = elements.get(new Random().nextInt(elements.size()));
//
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//
//        try {
//            element.click();
//        } catch (Exception e) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
//        }
//    }

    public void clickRandomElement(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        int attempts = 0;

        while (attempts < 5) {
            try {
                // 🔥 Always fetch fresh elements
                List<WebElement> elements = wait.until(
                        ExpectedConditions.presenceOfAllElementsLocatedBy(locator)
                );

                elements.removeIf(e -> !e.isDisplayed() || e.getText().trim().isEmpty());

                if (elements.isEmpty()) {
                    throw new RuntimeException("No valid dropdown options found: " + locator);
                }

                int index = new Random().nextInt(elements.size());

                // 🔥 RE-FETCH element again (important for stale fix)
                WebElement element = driver.findElements(locator).get(index);

                ((JavascriptExecutor) driver)
                        .executeScript("arguments[0].scrollIntoView(true);", element);

                wait.until(ExpectedConditions.elementToBeClickable(element));

                try {
                    element.click();
                } catch (Exception e) {
                    // ✅ fallback JS click
                    ((JavascriptExecutor) driver)
                            .executeScript("arguments[0].click();", element);
                }

                return;

            } catch (StaleElementReferenceException e) {
                System.out.println("Retrying due to stale element...");
            } catch (Exception e) {
                System.out.println("Retrying due to: " + e.getMessage());
            }

            attempts++;

            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }

        throw new RuntimeException("Failed to select dropdown value after retries");
    }

    public void verifyInlineErrorMessage(By errorLocator, String expectedErrorMessage) {
        WebElement errorElement = driver.findElement(errorLocator);
        String actualErrorMessage = errorElement.getText().trim();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Inline error message mismatch");
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
        System.out.println("Checkbox HTML: " + html);
        Assert.assertTrue(
                html.contains("rbToggleCheckboxChecked"),
                "Active checkbox is not selected by default");
        System.out.println("PASS: Active checkbox is selected by default");
    }

    
}
