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
    public static final By ITEM_CATEGORY_DD = By.cssSelector("[value='Select Item Category']");
    public static final By ITEMSUBCAT_CODE = By.id("radtxtSubCategoryCode");
    public static final By ITEMSUBCAT_NAME = By.id("radtxtSubCategoryName");
    public static final By SAVE_BUTTON_ITEMSUBCAT = By.id("ctl00_ContentPlaceHolder1_RadWinItemSubCategory_C_btnSubcategoryOk");
    public static final By SEARCH_ITEMSUBCAT = By.cssSelector("[alt='Filter SubGroup_Name column']");
    public static final By SEARCH_FIRST_ITEM_SUBCAT_EDIT = By.id("ctl00_ContentPlaceHolder1_grdItemSubCategory_ctl00__0");
    public static final By DELETE_FIRST_ITEM_SUBCATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdItemSubCategory_ctl00_ctl04_imgDelete");
    public static final By FROM_UNIT_DD = By.cssSelector("[value='Select From Unit']");
    public static final By TO_UNIT_DD = By.cssSelector("[value='Select To Unit']");
    public static final By CONVFACTOR_NAME = By.id("radtxtConvFactor");
    public static final By SAVE_BUTTON_UC = By.id("ctl00_ContentPlaceHolder1_RadWinUnitConversion_C_btnUnitConversionOk");
    public static final By SEARCH_UC = By.cssSelector("[alt='Filter ConversionFactor column']");
    public static final By SEARCH_FIRST_UC_EDIT = By.id("ctl00_ContentPlaceHolder1_grdUnitConversion_ctl00__0");
    public static final By DELETE_FIRST_UC_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdUnitConversion_ctl00_ctl04_imgDelete");
    public static final By STORE_GROUP_NAME = By.id("radtxtStoreGrp");
    public static final By SAVE_BUTTON_SG = By.id("ctl00_ContentPlaceHolder1_RadWinStoreGrp_C_btnStoreGrpSave");
    public static final By SEARCH_SG = By.cssSelector("[alt='Filter StoreGroupName column']");
    public static final By SEARCH_FIRST_SG_EDIT = By.id("ctl00_ContentPlaceHolder1_grd_StoreGrp_ctl00__0");
    public static final By DELETE_FIRST_SG_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_StoreGrp_ctl00_ctl04_imgDelete");
    public static final By UOM_CODE = By.id("radtxtUnitCode");
    public static final By UOM_NAME = By.id("radtxtUnitName");
    public static final By SAVE_BUTTON_UOM = By.id("ctl00_ContentPlaceHolder1_RadWinUnit_C_btnUnitOk");
    public static final By SEARCH_UOM = By.cssSelector("[alt='Filter idlink column']");
    public static final By SEARCH_FIRST_UOM_EDIT = By.id("ctl00_ContentPlaceHolder1_grdUOM_ctl00__0");
    public static final By DELETE_FIRST_UOM_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdUOM_ctl00_ctl04_imgDelete");
    public static final By SUPPLIER_TYPE = By.id("radtxtSupplierType");
    public static final By SAVE_BUTTON_SUPPLIERTYPE = By.id("ctl00_ContentPlaceHolder1_RadWinSupplierType_C_btnSupplierTypeOk");
    public static final By SEARCH_SUPPLIERTYPE = By.cssSelector("[alt='Filter SupplierType_Name column']");
    public static final By SEARCH_FIRST_ST_EDIT = By.id("ctl00_ContentPlaceHolder1_grdSupplierType_ctl00__0");
    public static final By DELETE_FIRST_ST_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdSupplierType_ctl00_ctl06_imgDelete");


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
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grdItemCategory_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveItemCattoEdit() {
        utils.click(SEARCH_FIRST_ITEM_CAT_EDIT);
    }
    public void clickActiveItemCategorytoDelete() {
        utils.click(DELETE_FIRST_ITEM_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyItemCategoryDelete(String expectedTitle) {
        utils.typeText(SEARCH_ITEMCAT, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
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
    //Item SubCategory
    public void clickOnItemSubCategory(String clickOnItemSubCategory) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='form1']/div[5]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[3]", clickOnItemSubCategory));
            utils.click(locator);
            System.out.println("Clicked on the Item category: " + clickOnItemSubCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the Item Category " + clickOnItemSubCategory);
            throw e;
        }
    }
    public void clickOnAddItemSubCategory(String btnAddItemSubCategory) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddItemSubCategory));
            utils.click(locator);
            System.out.println("Clicked on the Inventory Add Item SubCategory Button: " + btnAddItemSubCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the Inventory Add Item SubCategory Button: " + btnAddItemSubCategory);
            throw e;
        }
    }
    public void selectItemCategory(String InvenItemCategory) {
        try {
            utils.click(ITEM_CATEGORY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", InvenItemCategory));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + InvenItemCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + InvenItemCategory);
            throw e;
        }
    }
    public void enterItemSubCatCDE(String name) {
        utils.typeText(ITEMSUBCAT_CODE, name);
    }
    public void enterItemSubCatname(String name) {
        utils.typeText(ITEMSUBCAT_NAME, name);
    }
    public void userClicksOnItemSubCatSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_ITEMSUBCAT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyItemSubCatcreation(String expectedTitle) {
        utils.typeText(SEARCH_ITEMSUBCAT, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grdItemSubCategory_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveItemSubCattoEdit() {
        utils.click(SEARCH_FIRST_ITEM_SUBCAT_EDIT);
    }
    public void clickActiveItemSubCategorytoDelete() {
        utils.click(DELETE_FIRST_ITEM_SUBCATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyItemSubCategoryDelete(String expectedTitle) {
        utils.typeText(SEARCH_ITEMSUBCAT, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    public void ItemclickExportToExcel(String clickOnExporttoExcelItemCatButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelItemCatButton));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Item  Type Button: " + clickOnExporttoExcelItemCatButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Item Type Button: " + clickOnExporttoExcelItemCatButton);
            throw e;
        }
    }
    //Unit Conversion
    public void clickOnUnitConversion(String clickOnUnitConversion) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='form1']/div[5]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[4]", clickOnUnitConversion));
            utils.click(locator);
            System.out.println("Clicked on the Item category: " + clickOnUnitConversion);
        } catch (Exception e) {
            System.out.println("Failed to click on the Item Category " + clickOnUnitConversion);
            throw e;
        }
    }
    public void clickOnAddUC(String btnAddUC) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddUC));
            utils.click(locator);
            System.out.println("Clicked on the Inventory Add UC Button: " + btnAddUC);
        } catch (Exception e) {
            System.out.println("Failed to click on the Inventory Add UC: " + btnAddUC);
            throw e;
        }
    }
    public void selectFromUnit(String InvenFromUnit) {
        try {
            utils.click(FROM_UNIT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", InvenFromUnit));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + InvenFromUnit);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + InvenFromUnit);
            throw e;
        }
    }
    public void selectToUnit(String InvenToUnit) {
        try {
            utils.click(TO_UNIT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", InvenToUnit));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + InvenToUnit);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + InvenToUnit);
            throw e;
        }
    }
    public void enterConvFactor(String name) {
        utils.typeText(CONVFACTOR_NAME, name);
    }
    public void userClicksOnUCSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_UC};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyUCcreation(String expectedTitle) {
        utils.typeText(SEARCH_UC, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grdUnitConversion_ctl00__0]/td[5]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveUCtoEdit() {
        utils.click(SEARCH_FIRST_UC_EDIT);
    }
    public void clickActiveUCtoDelete() {
        utils.click(DELETE_FIRST_UC_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyUCDelete(String expectedTitle) {
        utils.typeText(SEARCH_UC, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //Store Group
    public void clickOnStoreGroup(String clickOnStoreGroup) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='form1']/div[5]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[5]", clickOnStoreGroup));
            utils.click(locator);
            System.out.println("Clicked on the Item category: " + clickOnStoreGroup);
        } catch (Exception e) {
            System.out.println("Failed to click on the Item Category " + clickOnStoreGroup);
            throw e;
        }
    }
    public void clickOnAddStoreGroup(String btnAddSG) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSG));
            utils.click(locator);
            System.out.println("Clicked on the Inventory Add SG Button: " + btnAddSG);
        } catch (Exception e) {
            System.out.println("Failed to click on the Inventory Add SG: " + btnAddSG);
            throw e;
        }
    }
    public void enterStoreGroup(String name) {
        utils.typeText(STORE_GROUP_NAME, name);
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
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grd_StoreGrp_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveSGtoEdit() {
        utils.click(SEARCH_FIRST_SG_EDIT);
    }
    public void clickActiveSGtoDelete() {
        utils.click(DELETE_FIRST_SG_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifySGDelete(String expectedTitle) {
        utils.typeText(SEARCH_SG, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //UOM
    public void clickOnUOM(String clickOnUOM) throws InterruptedException {
        try {
            //By locator = By.xpath(String.format("/html/body/form/div[6]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/a[1]", clickOnUOM));
            //By locator =   By.xpath(String.format("//*[@id='form1']/div[6]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/a[1]",clickOnUOM));
            By locator=By.xpath(String.format("//a[contains(@href,'SubMenuItemsId=30')]"));
            utils.click(locator);
            System.out.println("Clicked on UOM: " + clickOnUOM);
        } catch (Exception e) {
            System.out.println("Failed to click on UOM " + clickOnUOM);
            throw e;
        }
    }
    public void clickOnAddUOM(String btnAddUOM) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddUOM));
            utils.click(locator);
            System.out.println("Clicked on the Inventory Add UOM Button: " + btnAddUOM);
        } catch (Exception e) {
            System.out.println("Failed to click on the Inventory Add UOM: " + btnAddUOM);
            throw e;
        }
    }
    public void enterUOMCode(String name) {
        utils.typeText(UOM_CODE, name);
    }
    public void enterUOMName(String name) {
        utils.typeText(UOM_NAME, name);
    }
    public void userClicksOnUOMSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_UOM};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyUOMcreation(String expectedTitle) {
        utils.typeText(SEARCH_UOM, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdUOM_ctl00__0']/td[1]", expectedTitle));

        utils.isElementVisible(locator);
    }
    public void clickActiveUOMtoEdit() {
        utils.click(SEARCH_FIRST_UOM_EDIT);
    }
    public void clickActiveUOMtoDelete() {
        utils.click(DELETE_FIRST_UOM_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyUOMDelete(String expectedTitle) {
        utils.typeText(SEARCH_UOM, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //Supplier Type
    public void clickOnSupplierType(String clickSupplierType) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//a[contains(@href,'SubMenuItemsId=35')]"));
            utils.click(locator);
            System.out.println("Clicked on UOM: " + clickSupplierType);
        } catch (Exception e) {
            System.out.println("Failed to click on UOM " + clickSupplierType);
            throw e;
        }
    }
    public void clickOnAddSupplierType(String btnAddSupplierType) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSupplierType));
            utils.click(locator);
            System.out.println("Clicked on the Inventory Add Supplier Type Button: " + btnAddSupplierType);
        } catch (Exception e) {
            System.out.println("Failed to click on the Inventory Add Supplier Type: " + btnAddSupplierType);
            throw e;
        }
    }
    public void enterSupplierType(String name) {
        utils.typeText(SUPPLIER_TYPE, name);
    }
    public void userClicksOnSupplierTypeSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_SUPPLIERTYPE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifySupplierTypecreation(String expectedTitle) {
        utils.typeText(SEARCH_SUPPLIERTYPE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grdSupplierType_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveSTtoEdit() {
        utils.click(SEARCH_FIRST_ST_EDIT);
    }
    public void clickActiveSTtoDelete() {
        utils.click(DELETE_FIRST_ST_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifySTDelete(String expectedTitle) {
        utils.typeText(SEARCH_SUPPLIERTYPE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
}
