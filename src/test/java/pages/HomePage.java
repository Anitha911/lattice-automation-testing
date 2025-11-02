package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNavigatorItem(String menuTitle) throws InterruptedException {
        String xpath = "//h5[contains(@class, 'card-title') and normalize-space(text())='" + menuTitle + "']";
        By locator = By.xpath(xpath);
        utils.click(locator);
    }

    public void clickOnSidebarItems(String menuTitle) {
        String xpath = "//div[@class='sidebar-menu']//li/a[normalize-space(text())='" + menuTitle +
                "' or span[normalize-space(text())='" + menuTitle + "']]";
        By locator = By.xpath(xpath);
        utils.click(locator);
    }

}
