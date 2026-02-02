package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class InventoryMasterPage  extends BasePage {
    public InventoryMasterPage(WebDriver driver) {
        super(driver);
    }
    public static final By ITEMTYPE_CODE = By.id("radtxtItemTypeCode");
    public static final By ITEMTYPE_NAME = By.id("radtxtItemTypeName");
    public static final By SAVE_BUTTON_ITEMTYPE = By.id("ctl00_ContentPlaceHolder1_RadWinItemType_C_btnTypeOk");
    public static final By SEARCH_ITEMTYPE = By.cssSelector("[alt='Filter ItemTypeCode column']");
    public static final By SEARCH_FIRST_ITEM_TYPE_EDIT = By.id("ctl00_ContentPlaceHolder1_grdItemType_ctl00__0");
    public void clickOnDataConfiguration(String dataConfiguration) throws InterruptedException {
        try {
            //By locator = By.xpath(String.format("//*[@class='nav-link active' and @id='10']", dataConfiguration));
            //By locator = By.xpath(String.format("//a[contains(@class, 'nav-link active') and @id='10']", dataConfiguration));
            By locator = By.id("10");
            utils.click(locator);
            System.out.println("Clicked on the Data Config: " + dataConfiguration);
        } catch (Exception e) {
            System.out.println("Failed to click on the Data config: " + dataConfiguration);
            throw e;
        }
    }
    public void clickOnadditionalmastersSales(String clickOnadditionalmastersInventory) throws InterruptedException {
        try {
            //By locator = By.xpath(String.format("//*[@class='nav-link active' and @id='10']", dataConfiguration));
            By locator = By.xpath(String.format("//*[@id='tab-datasetup']/div[2]/div/ul[2]/li[4]/a", clickOnadditionalmastersInventory));
            utils.click(locator);
            System.out.println("Clicked on additional masters Inventory Menu: " + clickOnadditionalmastersInventory);
        } catch (Exception e) {
            System.out.println("Failed to click on additional masters Inventory Menu: " + clickOnadditionalmastersInventory);
            throw e;
        }
    }
    public void clickOnAddItemTypes(String btnAddItemTypes) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddItemTypes));
            utils.click(locator);
            System.out.println("Clicked on the Inventory Add Item Types Button: " + btnAddItemTypes);
        } catch (Exception e) {
            System.out.println("Failed to click on the Inventory Add Item Types Button: " + btnAddItemTypes);
            throw e;
        }
    }
    public void enterItemTypeCDE(String name) {
        utils.typeText(ITEMTYPE_CODE, name);
    }
    public void enterItemTypename(String name) {
        utils.typeText(ITEMTYPE_NAME, name);
    }
    public void userClicksOnItemTypeSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_ITEMTYPE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyItemTypecreation(String expectedTitle) {
        utils.typeText(SEARCH_ITEMTYPE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grdItemType_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveItemTypetoEdit() {
        utils.click(SEARCH_FIRST_ITEM_TYPE_EDIT);
    }
}
