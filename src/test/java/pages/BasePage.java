package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class BasePage {
    protected WebDriver driver;
    protected ElementUtils utils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.utils = new ElementUtils(driver);
    }
}
