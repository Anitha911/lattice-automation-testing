package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementUtils;

import java.time.Duration;

public class BasePage {
    final Wait<WebDriver> wait;
    protected WebDriver driver;
    protected ElementUtils utils;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.utils = new ElementUtils(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
