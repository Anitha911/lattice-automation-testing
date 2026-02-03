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
    public static final By DELETE_FIRST_ITEM_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdItemType_ctl00_ctl04_imgDelete");
    public static final By ITEMCAT_CODE = By.id("radtxtCategoryCode");
    public static final By ITEMCAT_NAME = By.id("radtxtCategoryName");
    public static final By SAVE_BUTTON_ITEMCAT = By.id("ctl00_ContentPlaceHolder1_RadWinItemCategory_C_btnItemCategoryOk");
    public static final By SEARCH_ITEMCAT = By.cssSelector("[alt='Filter idlink column']");
    public static final By SEARCH_FIRST_ITEM_CAT_EDIT = By.id("ctl00_ContentPlaceHolder1_grdItemCategory_ctl00__0");
    public static final By DELETE_FIRST_ITEM_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdItemCategory_ctl00_ctl04_imgDelete");


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
    public void clickOnadditionalmastersInventory(String clickOnadditionalmastersInventory) throws InterruptedException {
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

    public void clickActiveItemTypetoDelete() {
        utils.click(DELETE_FIRST_ITEM_TYPE_IN_LIST);
        //driver.switchTo().activeElement();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyItemTypeDelete(String expectedTitle) {
        utils.typeText(SEARCH_ITEMTYPE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    public void ItemTypeclickExportToExcel(String clickOnExporttoExcelItemtypeButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelItemtypeButton));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Item  Type Button: " + clickOnExporttoExcelItemtypeButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Item Type Button: " + clickOnExporttoExcelItemtypeButton);
            throw e;
        }
    }
    //Item Category
    public void clickOnItemCategory(String clickOnItemCategory) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='form1']/div[5]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[2]", clickOnItemCategory));
            //*[@id="form1"]/div[6]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[2]
            utils.click(locator);
            System.out.println("Clicked on the Item category: " + clickOnItemCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the Item Category " + clickOnItemCategory);
            throw e;
        }
    }
    public void clickOnAddItemCategory(String btnAddItemCategory) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddItemCategory));
            utils.click(locator);
            System.out.println("Clicked on the Inventory Add Item Category Button: " + btnAddItemCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the Inventory Add Item Category Button: " + btnAddItemCategory);
            throw e;
        }
    }
    public void enterItemCatCDE(String name) {
        utils.typeText(ITEMCAT_CODE, name);
    }
    public void enterItemCatname(String name) {
        utils.typeText(ITEMCAT_NAME, name);
    }
    public void userClicksOnItemCatSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_ITEMCAT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyItemCatcreation(String expectedTitle) {
        utils.typeText(SEARCH_ITEMCAT, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grdItemType_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveItemCattoEdit() {
        utils.click(SEARCH_FIRST_ITEM_CAT_EDIT);
    }
    public void clickActiveItemCategorytoDelete() {
        utils.click(DELETE_FIRST_ITEM_CATEGORY_IN_LIST);
        //driver.switchTo().activeElement();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyItemCategoryDelete(String expectedTitle) {
        utils.typeText(SEARCH_ITEMCAT, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        //By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_GrdModes_ctl00__0 td[title='%s']//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    public void ItemCategoryclickExportToExcel(String clickOnExporttoExcelItemCatButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelItemCatButton));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Item  Type Button: " + clickOnExporttoExcelItemCatButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Item Type Button: " + clickOnExporttoExcelItemCatButton);
            throw e;
        }
    }
}
