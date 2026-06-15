package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HelperUtils;
import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class EnergyUtilityMasterPage extends BasePage {
    public EnergyUtilityMasterPage(WebDriver driver) {
        super(driver);
    }
    public static final By ENERGYTYPE_NAME_INPUT = By.id("radtxtEnergyTyp");
    public static final By ENERGYTYPESHORT_NAME_INPUT = By.id("RadtxtShortName");
    public static final By ENERGYTYPEUOM_DD = By.cssSelector("[value='Select UOM']");
    public static final By SAVE_BUTTON_ENERGYTYPE=By.id("ctl00_ContentPlaceHolder1_RadWinEnergyType_C_btnEnergyTypeOk");
    public static final By SEARCH_ENERGYTYPE = By.cssSelector("[alt='Filter TypeName column']");
    public static final By SEARCH_FIRST_ENERGYTYPE=By.id("ctl00_ContentPlaceHolder1_grdEnergyType_ctl00__0");
    public static final By DELETE_FIRST_ENERGYTYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdEnergyType_ctl00_ctl04_ImageButton3");

    public void clickOnEnergyTrackingOpt(String clickOnEnergyTrackingOpt) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-datasetup']/div[2]/div/ul[3]/li[6]/a", clickOnEnergyTrackingOpt));
            utils.click(locator);
            System.out.println("Clicked on the Energy Tracking Optional Menu: " + clickOnEnergyTrackingOpt);
        } catch (Exception e) {
            System.out.println("Failed to click on the Energy Tracking Optional Menu " + clickOnEnergyTrackingOpt);
            throw e;
        }
    }
    public void clickOnAddEnergyType(String clickOnAddEnergyType) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", clickOnAddEnergyType));
            utils.click(locator);
            System.out.println("Clicked on the Add Energy Type Button: " + clickOnAddEnergyType);
        } catch (Exception e) {
            System.out.println("Failed to click on the Add Energy Type Button:: " + clickOnAddEnergyType);
            throw e;
        }
    }
    public void enterEnergyType(String name) {
        utils.typeText(ENERGYTYPE_NAME_INPUT, name);
    }
    public void enterEnergyTypeShortName(String name) {
        utils.typeText(ENERGYTYPESHORT_NAME_INPUT, name);
    }
    public void selectUOM(String EnergyTypeUOM) {
        try {
            utils.click(ENERGYTYPEUOM_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", EnergyTypeUOM));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + EnergyTypeUOM);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + EnergyTypeUOM);
            throw e;
        }
    }
    public void ClickEnergyTypeSave() {
        By[] saveButtons = {SAVE_BUTTON_ENERGYTYPE};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyEnergyTypeSaveButton(String expectedTitle) {
        utils.typeText(SEARCH_ENERGYTYPE,expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdEnergyType_ctl00__0']/td[2]",expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveEnergyTypetoEdit() {
        utils.click(SEARCH_FIRST_ENERGYTYPE);
    }
    public void clickActiveEnergyTypetoDelete() {
        utils.click(DELETE_FIRST_ENERGYTYPE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyEnergyTypeDelete(String expectedTitle) {
        utils.typeText(SEARCH_ENERGYTYPE,expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        //By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_GrdModes_ctl00__0 td[title='%s']//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
}
