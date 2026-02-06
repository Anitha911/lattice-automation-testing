package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ReactiveServiceMasterPage extends BasePage {
    public ReactiveServiceMasterPage(WebDriver driver) {
        super(driver);
    }
    public static final By SG_NAME = By.id("radtxtServGrp");
    public static final By SG_DEPT_DD = By.cssSelector("[value='Select Department']");
    public static final By SAVE_BUTTON_SG = By.id("ctl00_ContentPlaceHolder1_RadWinServiceGrp_C_btnServGrp");
    public static final By SEARCH_SG = By.cssSelector("[alt='Filter ServiceGroupName column']");
    public static final By SEARCH_FIRST_SG_EDIT = By.id("ctl00_ContentPlaceHolder1_grdServiceGrp_ctl00__0");
    public void clickOnDataConfiguration(String dataConfiguration) throws InterruptedException {
        try {
            By locator = By.id("10");
            utils.click(locator);
            System.out.println("Clicked on the Data Config: " + dataConfiguration);
        } catch (Exception e) {
            System.out.println("Failed to click on the Data config: " + dataConfiguration);
            throw e;
        }
    }
    public void clickOnCoremastersRM(String clickOnCoremastersRM) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-datasetup']/div[2]/div/ul[1]/li[7]/a", clickOnCoremastersRM));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Menu: " + clickOnCoremastersRM);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Menu: " + clickOnCoremastersRM);
            throw e;
        }
    }
    public void clickOnAddSG(String btnAddSG) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSG));
            utils.click(locator);
            System.out.println("Clicked on the RM Add Service Group Button: " + btnAddSG);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Service Group Button: " + btnAddSG);
            throw e;
        }
    }
    public void enterSGName(String name) {
        utils.typeText(SG_NAME, name);
    }
    public void selectDepartment(String SGDepartment) {
        try {
            utils.click(SG_DEPT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", SGDepartment));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + SGDepartment);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + SGDepartment);
            throw e;
        }
    }
    public void userClicksOnSGSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_SG};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifySGcreation(String expectedTitle) {
        utils.typeText(SEARCH_SG, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grdServiceGrp_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveSGtoEdit() {
        utils.click(SEARCH_FIRST_SG_EDIT);
    }
}
