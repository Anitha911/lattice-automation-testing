package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementUtils;
import utils.HelperUtils;
import java.time.Duration;
import java.util.List;

public class InventoryManagementPage extends BasePage {
    public InventoryManagementPage(WebDriver driver) {
        super(driver);
    }
    public static final By SUPPLIER_NAME = By.id("txt_SupplierName");
    public static final By SUPPLIER_EMAIL = By.id("txt_Email");
    public static final By SUPPLIER_MOBILE = By.id("txt_Mobile");
    public static final By SUPPLIERTYPPE_DD = By.cssSelector("[value='Select Supplier Type']");
    public static final By SAVE_BUTTON_SUPPLIER=By.id("ctl00_ContentPlaceHolder1_RadWinSupplier_C_RadSave");
    public static final By SEARCH_FIRST_SUPPLIER_EDIT=By.id("ctl00_ContentPlaceHolder1_Supplier_Grid_ctl00__0");
    public static final By EDIT_BUTTON_SUPPLIER=By.id("ctl00_ContentPlaceHolder1_btnSave");
    public static final By DEACTIVATE_BUTTON_SUPPLIER=By.id("ctl00_ContentPlaceHolder1_btndeactivateS");
    public static final By DEACTIVATE_YES_BUTTON_SUPPLIER=By.id("ctl00_ContentPlaceHolder1_RadWinDeactivate_C_btnDeActivate");
    public static final By EMAIL_DOMAIN_SECTION_SUPPLIER=By.xpath(String.format("//*[@id='munEmailDomain']"));
    public static final By EMAIL_DOMAIN_ADD_SUPPLIER=By.xpath(String.format("//*[@id='Span2220']"));
    public static final By EMAIL_DOMAINSAVE_BUTTON_SUPPLIER=By.id("ctl00_ContentPlaceHolder1_SupplierEmailDomain_EmainDomainWindow_C_btnSave");
    public static final By SUPPLIER_EMAIL_DOMAIN_DETAIL=By.id("ctl00_ContentPlaceHolder1_SupplierEmailDomain_EmainDomainWindow_C_txtdomainname");

    //Item Definition
    public static final By ITEMDEFINITION_ITEMTYPE_DD = By.id("ctl00_ContentPlaceHolder1_RadWinItem_C_RadItemType_Combo_Input");
    public static final By ALL_OPTIONS_ITEMDEFINITION_ITEMTYPE = By.xpath("//div[contains(@id,'ctl00_ContentPlaceHolder1_RadWinItem_C_RadItemType_Combo_DropDown')]//li");
    public static final By ITEMDEFINITION_ITEMCATEGORY_DD = By.id("ctl00_ContentPlaceHolder1_RadWinItem_C_RadMainGroup_Combo_Input");
    public static final By ALL_OPTIONS_ITEMDEFINITION_ITEMCATEGORY = By.xpath("//div[contains(@id,'ctl00_ContentPlaceHolder1_RadWinItem_C_RadMainGroup_Combo_DropDown')]//li");
    public static final By ITEMDEFINITION_ITEMSUBCATEGORY_DD = By.id("ctl00_ContentPlaceHolder1_RadWinItem_C_RadSubGroups_Combo_Input");
    public static final By ALL_OPTIONS_ITEMDEFINITION_ITEMSUBCATEGORY = By.xpath("//div[contains(@id,'ctl00_ContentPlaceHolder1_RadWinItem_C_RadSubGroups_Combo_DropDown')]//li");
    public static final By ITEMDEFINITION_ISSUINGUNIT_DD = By.id("ctl00_ContentPlaceHolder1_RadWinItem_C_RadItemUnit_Combo_Input");
    public static final By ALL_OPTIONS_ITEMDEFINITION_ISSUINGUNIT = By.xpath("//div[contains(@id,'ctl00_ContentPlaceHolder1_RadWinItem_C_RadItemUnit_Combo_DropDown')]//li");
    public static final By ITEMDEFINITION_RECEIVINGUNIT_DD = By.id("ctl00_ContentPlaceHolder1_RadWinItem_C_RadDefaultUnit_Combo_Input");
    public static final By ALL_OPTIONS_ITEMDEFINITION_RECEIVINGUNIT = By.xpath("//div[contains(@id,'ctl00_ContentPlaceHolder1_RadWinItem_C_RadDefaultUnit_Combo_DropDown')]//li");
    public static final By ITEMDEFINITION_ITEMNAME = By.id("ctl00_ContentPlaceHolder1_RadWinItem_C_txtItmName");
    public static final By ITEMDEFINITION_SAVE = By.id("ctl00_ContentPlaceHolder1_RadWinItem_C_RadSave");

    public void MenuInventoryManagement(String MenuInventoryManagement) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("7"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on the MenuInventoryManagement: " + MenuInventoryManagement);
        } catch (Exception e) {
            System.out.println("Failed to click on the MenuInventoryManagement: " + MenuInventoryManagement);
            throw e;
        }
    }
    public void SupplierClick(String SupplierClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Inventory']/div[2]/div/ul[1]/li[2]/a", SupplierClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Supplier Click: " + SupplierClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Supplier Click: " + SupplierClick);
            throw e;
        }
    }
    public void InclInactiveSupplier()throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("ContentPlaceHolder1_chkInactive"));
            element.click();
            System.out.println("Clicked on Inactive Supplier: " );
        } catch (Exception e) {
            System.out.println("Failed to click on Inactive Supplier: " );
            throw e;
        }
    }
    //Supplier Pagination Start
    public void GrdSupplierPagination(String GrdSupplierPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Supplier_Grid_GridData']")));
            String beforeText = firstRowBefore.getText();
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Supplier_Grid_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_Supplier_Grid_GridData']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + GrdSupplierPagination);
            throw e;
        }
    }
    //Supplier Pagination Ends
    //Supplier Data per page check starts
    public void validatePageSizeGrdSupplier(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_Supplier_Grid_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    public void enterSupplierName(String SupplierName) {
        utils.typeText(SUPPLIER_NAME, SupplierName);
    }
    public void enterSupplierEmail(String SupplierEmail) {
        utils.typeText(SUPPLIER_EMAIL, SupplierEmail);
    }
    public void enterSupplierMobile(String SupplierMobile) {
        utils.typeText(SUPPLIER_MOBILE, SupplierMobile);
    }
    public void selectSupplierType(String SupplierType) {
        try {
            utils.click(SUPPLIERTYPPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", SupplierType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + SupplierType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + SupplierType);
            throw e;
        }
    }
    public void ClickSupplierSave() {
        By[] saveButtons = {SAVE_BUTTON_SUPPLIER};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void AddSupplier()throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadAdd"));
            element.click();
            System.out.println("Clicked on Add Supplier : " );
        } catch (Exception e) {
            System.out.println("Failed to click on Add Supplier : " );
            throw e;
        }
    }
    public void clickActiveSuppliertoEdit() {
        utils.click(SEARCH_FIRST_SUPPLIER_EDIT);
    }
    public void ClickSupplierEdit() {
        utils.click(EDIT_BUTTON_SUPPLIER);
    }
    public void ClickSupplierDeactivate() {
        utils.click(DEACTIVATE_BUTTON_SUPPLIER);
    }
    public void ClickSupplierDeactivateYes() {
        utils.click(DEACTIVATE_YES_BUTTON_SUPPLIER);
    }
    public void ClickSupplierEmailDomainSection() {
        utils.click(EMAIL_DOMAIN_SECTION_SUPPLIER);
    }
    public void ClickSupplierEmailDomainAdd() {
        utils.click(EMAIL_DOMAIN_ADD_SUPPLIER);
    }
    public void ClickSupplierEmailDomainSave() {
        utils.click(EMAIL_DOMAINSAVE_BUTTON_SUPPLIER);
    }
    public void enterSupplierEmailDomainDetail(String enterSupplierEmailDomainDetail) {
        utils.typeText(SUPPLIER_EMAIL_DOMAIN_DETAIL, enterSupplierEmailDomainDetail);
    }
    //ItemDefinition
    public void ItemDefinition(String ItemDefinition) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Inventory']/div[2]/div/ul[1]/li[3]/a", ItemDefinition)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on ItemDefinition Click: " + ItemDefinition);
        } catch (Exception e) {
            System.out.println("Failed to click on ItemDefinition Click: " + ItemDefinition);
            throw e;
        }
    }
    public void ItemDefinitionAddButtonClick(String ItemDefinitionAddButtonClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadAddItem"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on ItemDefinitionAddButtonClick: " + ItemDefinitionAddButtonClick);
        } catch (Exception e) {
            System.out.println("Failed to click on ItemDefinitionAddButtonClick: " + ItemDefinitionAddButtonClick);
            throw e;
        }
    }
    public void getRandomItemDefItemType_Dropdown(){
        try{
            utils.click(ITEMDEFINITION_ITEMTYPE_DD);
            //ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_ITEMDEFINITION_ITEMTYPE);
            HelperUtils.clickRandomElement(ALL_OPTIONS_ITEMDEFINITION_ITEMTYPE);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: ALL_OPTIONS_ITEMDEFINITION_ITEMTYPE" );
            throw e;
        }
    }
    public void getRandomItemDefItemcategory_Dropdown(){
        try{
            utils.click(ITEMDEFINITION_ITEMCATEGORY_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_ITEMDEFINITION_ITEMCATEGORY);
            HelperUtils.clickRandomElement(ALL_OPTIONS_ITEMDEFINITION_ITEMCATEGORY);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: ALL_OPTIONS_ITEMDEFINITION_ITEMCATEGORY" );
            throw e;
        }
    }
    public void getRandomItemDefItemSubcategory_Dropdown(){
        try{
            utils.click(ITEMDEFINITION_ITEMSUBCATEGORY_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_ITEMDEFINITION_ITEMSUBCATEGORY);
            HelperUtils.clickRandomElement(ALL_OPTIONS_ITEMDEFINITION_ITEMSUBCATEGORY);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: ALL_OPTIONS_ITEMDEFINITION_ITEMCATEGORY" );
            throw e;
        }
    }
    public void getRandomItemDefIssuingUnit_Dropdown(){
        try{
            utils.click(ITEMDEFINITION_ISSUINGUNIT_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_ITEMDEFINITION_ISSUINGUNIT);
            HelperUtils.clickRandomElement(ALL_OPTIONS_ITEMDEFINITION_ISSUINGUNIT);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: ALL_OPTIONS_ITEMDEFINITION_ISSUINGUNIT" );
            throw e;
        }
    }
    public void getRandomItemDefReceivingUnit_Dropdown(){
        try{
            utils.click(ITEMDEFINITION_RECEIVINGUNIT_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_ITEMDEFINITION_RECEIVINGUNIT);
            HelperUtils.clickRandomElement(ALL_OPTIONS_ITEMDEFINITION_RECEIVINGUNIT);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: ALL_OPTIONS_ITEMDEFINITION_RECEIVINGUNIT" );
            throw e;
        }
    }
    public void ItemDefinitionItemName(String ItemDefinitionItemName) {
        utils.typeText(ITEMDEFINITION_ITEMNAME, ItemDefinitionItemName);
    }
    public void ItemDefinitionSave() {
        utils.click(ITEMDEFINITION_SAVE);
    }
    //Item definition dropdown values
    public void ItemDefItemType(String ItemDefItemType) {
        try {
            utils.click(ITEMDEFINITION_ITEMTYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ItemDefItemType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + ItemDefItemType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + ItemDefItemType);
            throw e;
        }
    }
    public void ItemDefItemCategory(String ItemDefItemCategory) {
        try {
            utils.click(ITEMDEFINITION_ITEMCATEGORY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ItemDefItemCategory));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + ItemDefItemCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + ItemDefItemCategory);
            throw e;
        }
    }
    public void ItemDefItemSubCategory(String ItemDefItemSubCategory) {
        try {
            utils.click(ITEMDEFINITION_ITEMSUBCATEGORY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ItemDefItemSubCategory));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + ItemDefItemSubCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + ItemDefItemSubCategory);
            throw e;
        }
    }
    public void ItemDefIssuingUnit(String ItemDefIssuingUnit) {
        try {
            utils.click(ITEMDEFINITION_ISSUINGUNIT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ItemDefIssuingUnit));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + ItemDefIssuingUnit);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + ItemDefIssuingUnit);
            throw e;
        }
    }
    public void ItemDefReceivingUnit(String ItemDefReceivingUnit) {
        try {
            utils.click(ITEMDEFINITION_RECEIVINGUNIT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ItemDefReceivingUnit));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + ItemDefReceivingUnit);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + ItemDefReceivingUnit);
            throw e;
        }
    }
    public void generateItemName(String name) {
        utils.typeText(ITEMDEFINITION_ITEMNAME, name);
    }
}


