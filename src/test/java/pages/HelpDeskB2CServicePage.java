package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HelpDeskB2CServicePage extends BasePage{
        public  HelpDeskB2CServicePage(WebDriver driver) {super(driver);}

    public static final By BTN_DIRECTWOBKNG = By.id("ctl00_ContentPlaceHolder1_btnDirectWOBoking");

    public void clickOnHelpDeskMenu(String clickOnHelpDeskMenu) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='27']"));
            utils.click(locator);
            System.out.println("Clicked on the HelpDeskMenu: " + clickOnHelpDeskMenu);
        } catch (Exception e) {
            System.out.println("Failed to click on the HelpDeskMenu" +clickOnHelpDeskMenu);
            throw e;
        }
    }
    public void CallCentreHelpDesk(String CallCentreHelpDesk) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='tab-helpdesk']/div[2]/div/ul[1]/li[2]/a"));
            utils.click(locator);
            System.out.println("Clicked on the CallCentreHelpDesk: " + CallCentreHelpDesk);
        } catch (Exception e) {
            System.out.println("Failed to click on the CallCentreHelpDesk" +CallCentreHelpDesk);
            throw e;
        }
    }
    public void clickDirectWOBkngButton() {
        utils.click(BTN_DIRECTWOBKNG);
    }
}

