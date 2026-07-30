package utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptExeUtil {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public JavaScriptExeUtil(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofMillis(10000));
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
    }
    public static void scrollToBottom(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollToElementHorizontal(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'center'});", element);
    }

    public static void jsClick(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);

    }

    public static void enterTextUsingJS(WebDriver driver, WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=arguments[1];", element, text);
    }

    public void waitForReadyStateComplete(){
        wait.until(driver -> ((JavascriptExecutor)driver)
                                        .executeScript("return document.readyState")
                                        .equals("complete"));
    }

    public void waitforXHRMenuItems(){
        wait.until(driver -> ((JavascriptExecutor)driver)
                .executeScript("return window.performance.getEntriesByType('resource')"
                + ".some(e => e.initiatorType === 'xmlhttprequest' && " +
                        "e.name.includes(arguments[0]));",
                        "MenuItemsId=79"
                ));
    }
}
