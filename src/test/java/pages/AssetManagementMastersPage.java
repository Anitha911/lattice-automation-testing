package pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class AssetManagementMastersPage extends BasePage {
    public AssetManagementMastersPage(WebDriver driver) {
        super(driver);
    }

    public static final By ASSET_CLASS = By.id("radtxtAssetClass");
    public static final By ASSET_MASTER_CATEGORY = By.id("radtxtAsscatname");
    public static final By ASSET_CLASS_SELECT = By.cssSelector("[value='Select Asset class']");
    public static final By ASSET_CATEGORY = By.id("RadtxtAssCat");
    public static final By ASSET_MASTER_CATEGORY_SELECT = By.cssSelector("[value='Select Asset master category']");
    public static final By ASSET_SUB_CATEGORY = By.id("radtxtAssSubCat");
    public static final By ASSET_CATEGORY_SELECT = By.cssSelector("[value='Select Asset category']");
    public static final By ASSET_CRITICALITY_SELECT = By.cssSelector("[value='Select Asset Criticality']");
    public static final By OEM = By.id("radtxtOEMCode");
    public static final By MAKE = By.id("radtxtMakeCode");
    public static final By OEM_SELECT = By.cssSelector("[value='Select OEM']");
    public static final By MODEL = By.id("radtxtModel");
    public static final By MAKE_SELECT = By.cssSelector("[value='Select Make / Brand']");
    public static final By ASSET_SUB_CATEGORY_SELECT = By.cssSelector("[value='ak laptop']");
    public static final By DERATING_FACTOR_CODE = By.id("txtCode");
    public static final By DERATING_FACTOR_DESCRIPTION = By.id("txtDescription");
    public static final By READING_UNIT_SHORT_CODE = By.id("radtxtshortCode");
    public static final By READING_UNIT = By.id("radtxtReadingUnit");
    public static final By READING_UNIT_SYMBOL_SELECT = By.cssSelector("[value='Select Symbol']");
    public static final By TECHNICAL_PARAMETER   = By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_radtxtParaName");
    public static final By TECHNICAL_PARAMETER_READING_UNIT_SELECT = By.cssSelector("[value='Select Reading unit']");
    public static final By TECHNICAL_PARAMETER_PARAMETER_TYPE_SELECT = By.cssSelector("[value='Select Parameter type']");
    public static final By TECHNICAL_PARAMETER_MAX_LENGTH =  By.id("radtxtMaxLength");
    public static final By TECHNICAL_PARAMETER_BOX_NAME_SELECT = By.cssSelector("[value='Text']");
    public static final By METERING_ATTRIBUTE   = By.id("radtxtAttribute");
    public static final By METERING_ATTRIBUTE_DECIMALS   = By.id("radtxtDecimal");
    public static final By METERING_PARAMETER   = By.id("radtxtAttribute");
    public static final By METERING_ATTRIBUTE_SELECT = By.cssSelector("[value='Acidity']");
    public static final By INPUT_TYPE_SELECT = By.cssSelector("[value='Select Input type']");
    public static final By READING_TYPE_SELECT = By.cssSelector("[value='Select Input type']");
    public static final By EQUIPMENT_NAME   = By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_radtxtEquipmentName");
    public static final By HOURLY_CHARGES_AED   = By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_radtxtrate");
    public static final By TOOLS_UNIT_SELECT = By.cssSelector("[value='Select Unit']");
    public static final By SEARCH_ASSET_CLASS = By.cssSelector("[alt='Filter AssetClassName column']");
    public static final By SEARCH_ASSET_MASTER_CATEGORY = By.cssSelector("[alt='Filter AssetMasterCategoryName column']");
    public static final By SEARCH_ASSET_CATEGORY = By.cssSelector("[alt='Filter AssetCategoryName column']");
    public static final By SEARCH_ASSET_SUB_CATEGORY = By.cssSelector("[alt='Filter AssetSubCategory column']");
    public static final By SEARCH_OEM = By.cssSelector("[alt='Filter Name column']");
    public static final By SEARCH_MAKE = By.cssSelector("[alt='Filter BrandName column']");
    public static final By SEARCH_MODEL = By.cssSelector("[alt='Filter Model column']");
    public static final By SEARCH_DERATING_FACTOR_CODE = By.cssSelector("[alt='Filter Code column']");
    public static final By SEARCH_READING_UNIT = By.cssSelector("[alt='Filter ReadingUnitName column']");
    public static final By SEARCH_TECHNICAL_PARAMETER = By.cssSelector("[alt='Filter ParameterName column']");
    public static final By SEARCH_METERING_ATTRIBUTE = By.cssSelector("[alt='Filter AttributeName column']");
    public static final By SEARCH_TOOLS_AND_EQUIPMENT = By.cssSelector("[alt='Filter EquipmentName column']");
    public static final By FIRST_ASSET_CLASS_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetClass_ctl00__0");
    public static final By FIRST_ASSET_MASTER_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetCat_ctl00__0");
    public static final By FIRST_ASSET_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetCategory_ctl00__0");
    public static final By FIRST_ASSET_SUB_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssSubCat_ctl00__0");
    public static final By FIRST_OEM_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdOEM_ctl00__0");
    public static final By FIRST_MAKE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdMake_ctl00__0");
    public static final By FIRST_MODEL_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdModel_ctl00__0");
    public static final By FIRST_DERATING_FACTOR_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdDeratingFactors_ctl00__0");
    public static final By FIRST_READING_UNIT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_ReadingUnit_ctl00__0");
    public static final By FIRST_TECHNICAL_PARAMETER_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_TechPara_ctl00__0");
    public static final By FIRST_METERING_ATTRIBUTE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_MeteringAttribute_ctl00__0");
    public static final By FIRST_TOOLS_AND_EQUIPMENT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTools_Equipment_ctl00__0");
    public static final By DELETE_FIRST_ASSET_CLASS_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetClass_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_ASSET_MASTER_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetCat_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_ASSET_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetCategory_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_ASSET_SUB_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssSubCat_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_OEM_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdOEM_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_MAKE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdMake_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_MODEL_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdModel_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_DERATING_FACTOR_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdDeratingFactors_ctl00_ctl04_ImabtnDeratingFactors");
    public static final By DELETE_FIRST_READING_UNIT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_ReadingUnit_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_TECHNICAL_PARAMETER_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_TechPara_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_METERING_ATTRIBUTE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_MeteringAttribute_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_TOOLS_AND_EQUIPMENT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTools_Equipment_ctl00_ctl04_ImageButton1");
    public static final By SAVE_BUTTON_ASSET_CLASS = By.id("ctl00_ContentPlaceHolder1_RadWinAssetClass_C_btnAssClassSave");
    public static final By SAVE_BUTTON_ASSET_MASTER_CATEGORY = By.id("ctl00_ContentPlaceHolder1_RadWinAssCatType_C_btnAssCat");
    public static final By SAVE_BUTTON_ASSET_CATEGORY = By.id("ctl00_ContentPlaceHolder1_RadWinAssCategory_C_btnAssetCat");
    public static final By SAVE_BUTTON_ASSET_SUB_CATEGORY = By.id("ctl00_ContentPlaceHolder1_RadWinAssSubCat_C_btnAssSubCat");
    public static final By SAVE_BUTTON_OEM = By.id("ctl00_ContentPlaceHolder1_RadWinOEM_C_btnOEMOk");
    public static final By SAVE_BUTTON_MAKE_OR_BRAND = By.id("ctl00_ContentPlaceHolder1_RadWinMake_C_btnMakeOk");
    public static final By SAVE_BUTTON_MODEL = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_btnModelOk");
    public static final By SAVE_BUTTON_DERATING_FACTOR = By.id("ctl00_ContentPlaceHolder1_RadWinDeRatingFactors_C_btnDeratingFactors");
    public static final By SAVE_BUTTON_READING_UNIT = By.id("ctl00_ContentPlaceHolder1_RadWinReadingUnit_C_btnReadingUnitSave");
    public static final By SAVE_BUTTON_TECHNICAL_PARAMETERS = By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_btnTechParaSave");
    public static final By SAVE_BUTTON_METERING_ATTRIBUTES = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringAttribute_C_btnMAttributeSave");
    public static final By SAVE_BUTTON_METERING_PARAMETERS = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_btnMertingParaSave");
    public static final By SAVE_BUTTON_TOOLS_OR_EQUPIMENTS = By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_btnEquipmentOk");

    public void moveToElementByName(String ElementName) {
        String subMenuId = switch (ElementName.trim()) {
            case "Asset Master Category" -> "13";
            case "Asset Category" -> "14";
            case "Asset Subcategory" -> "15";
            case "OEM" -> "16";
            case "Make" -> "17";
            case "Model" -> "18";
            case "Derating Factor" -> "205";
            default -> null;
        };

        By locator;
        if (subMenuId != null) {
            locator = By.xpath("//a[contains(@href,'ManageAssetsMaster.aspx') and contains(@href,'SubMenuItemsId=" + subMenuId + "')]");
        } else {
            locator = By.xpath("//a[contains(normalize-space(.),'" + ElementName + "')]");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", el);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        System.out.println("Clicked menu: " + ElementName);
    }

    public void clickAssetManagementSaveButton() {
        By[] save = {SAVE_BUTTON_ASSET_CLASS, SAVE_BUTTON_ASSET_MASTER_CATEGORY, SAVE_BUTTON_ASSET_CATEGORY,
                SAVE_BUTTON_ASSET_SUB_CATEGORY, SAVE_BUTTON_OEM, SAVE_BUTTON_MAKE_OR_BRAND, SAVE_BUTTON_MODEL, SAVE_BUTTON_DERATING_FACTOR, SAVE_BUTTON_READING_UNIT,
                SAVE_BUTTON_TECHNICAL_PARAMETERS, SAVE_BUTTON_METERING_ATTRIBUTES, SAVE_BUTTON_METERING_PARAMETERS, SAVE_BUTTON_TOOLS_OR_EQUPIMENTS};
        for (By button : save) {
            if (utils.isElementVisible(button)) {
                utils.waitForElementToBeClickable(button);
                utils.click(button);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // best practice
                }
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

//Asset Class

    public void enterAsset_Class(String Asset_Class) {
        utils.typeText(ASSET_CLASS, Asset_Class);
    }

    public void verifyAddAsset_Class(String Asset_Class) {
        utils.typeText(SEARCH_ASSET_CLASS, Asset_Class + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetClass_ctl00__0'] td[title='%s']", Asset_Class));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickAsset_ClasstoEdit() {
        utils.click(FIRST_ASSET_CLASS_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateAsset_Class(String update_Asset_Class) {
        utils.clearAndType(ASSET_CLASS, update_Asset_Class);
    }

    public void verifyUpdateAsset_Class(String updateAsset_Class) {
        utils.typeText(SEARCH_ASSET_CLASS, updateAsset_Class + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetClass_ctl00__0'] td[title='%s']", updateAsset_Class));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        ;
    }

    public void clickAsset_ClassToDelete() {
        utils.click(DELETE_FIRST_ASSET_CLASS_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        ;

    }

//Asset Master Category

    public void enterAsset_Master_Category(String Asset_Master_Category) {
        utils.typeText(ASSET_MASTER_CATEGORY, Asset_Master_Category);
    }

    public void selectAssetClass(String AssetClass) {
        try {
            utils.click(ASSET_CLASS_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", AssetClass));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + AssetClass);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + AssetClass);
            throw e;
        }
    }


    public void verifyAddAsset_Master_Category(String Asset_Master_Category) {
        utils.typeText(SEARCH_ASSET_MASTER_CATEGORY, Asset_Master_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetCat_ctl00__0'] td[title='%s']", Asset_Master_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickAsset_Master_Category_toEdit() {
        utils.click(FIRST_ASSET_MASTER_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateAsset_Master_Category(String update_Asset_Master_Category) {
        utils.clearAndType(ASSET_MASTER_CATEGORY, update_Asset_Master_Category);
    }

    public void verifyUpdateAsset_Master_Category(String update_Asset_Master_Category) {
        utils.typeText(SEARCH_ASSET_MASTER_CATEGORY, update_Asset_Master_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetCat_ctl00__0'] td[title='%s']", update_Asset_Master_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        ;
    }

    public void clickAsset_Master_Category_ToDelete() {
        utils.click(DELETE_FIRST_ASSET_MASTER_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        ;
    }

//    Asset Category

    public void enterAsset_Category(String Asset_Category) {
        utils.typeText(ASSET_CATEGORY, Asset_Category);
    }

    public void selectAsset_Master_Category(String Asset_Master_Category) {
        try {
            utils.click(ASSET_MASTER_CATEGORY_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Asset_Master_Category));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Asset_Master_Category);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Asset_Master_Category);
            throw e;
        }
    }

    public void verifyAddAsset_Category(String Asset_Category) {
        utils.typeText(SEARCH_ASSET_CATEGORY, Asset_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetCategory_ctl00__0'] td[title='%s']", Asset_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickAsset_Category_toEdit() {
        utils.click(FIRST_ASSET_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateAsset_Category(String update_Asset_Category) {
        utils.clearAndType(ASSET_CATEGORY, update_Asset_Category);
    }

    public void verifyUpdateAsset_Category(String update_Asset_Category) {
        utils.typeText(SEARCH_ASSET_CATEGORY, update_Asset_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetCategory_ctl00__0'] td[title='%s']", update_Asset_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        ;
    }

    public void clickAsset_Category_ToDelete() {
        utils.click(DELETE_FIRST_ASSET_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        ;
    }

//    Asset Sub Category

    public void enterAsset_Sub_Category(String Asset_Sub_Category) {
        utils.typeText(ASSET_SUB_CATEGORY, Asset_Sub_Category);
    }

    public void selectAsset_Category(String Asset_Category) {
        try {
            utils.click(ASSET_CATEGORY_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Asset_Category));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Asset_Category);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Asset_Category);
            throw e;
        }
    }

    public void selectCriticality(String Criticality) {
        try {
            utils.click(ASSET_CRITICALITY_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Criticality));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Criticality);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Criticality);
            throw e;
        }
    }

    public void verifyAddAsset_Sub_Category(String Asset_Sub_Category) {
        utils.typeText(SEARCH_ASSET_SUB_CATEGORY, Asset_Sub_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssSubCat_ctl00__0'] td[title='%s']", Asset_Sub_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickAsset_Sub_Category_ToDelete() {
        utils.click(DELETE_FIRST_ASSET_SUB_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        };
    }


    // OEM

    public void enterOEM(String OEM_Value) {
        utils.typeText(OEM, OEM_Value);
    }

    public void verifyAddOEM(String OEM_Value) {
        utils.typeText(SEARCH_OEM, OEM_Value + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdOEM_ctl00__0'] td[title='%s']", OEM_Value));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickOEM_toEdit() {
        utils.click(FIRST_OEM_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateOEM(String update_OEM) {
        utils.clearAndType(OEM, update_OEM);
    }

    public void verifyUpdateOEM(String update_OEM) {
        utils.typeText(SEARCH_OEM, update_OEM + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdOEM_ctl00__0'] td[title='%s']", update_OEM));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        ;
    }

    public void clickOEM_ToDelete() {
        utils.click(DELETE_FIRST_OEM_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        } ;
    }

    // Make / Brand

    public void enterMake(String Make_Value) {
        utils.typeText(MAKE, Make_Value);
    }

    public void selectOEM(String OEM_Value) {
        try {
            utils.click(OEM_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", OEM_Value));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + OEM_Value);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + OEM_Value);
            throw e;
        }
    }

    public void verifyAddMake(String Make_Value) {
        utils.typeText(SEARCH_MAKE, Make_Value + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdMake_ctl00__0'] td[title='%s']", Make_Value));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickMake_toEdit() {
        utils.click(FIRST_MAKE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateMake(String update_Make) {
        utils.clearAndType(MAKE, update_Make);
    }

    public void verifyUpdateMake(String update_Make) {
        utils.typeText(SEARCH_MAKE, update_Make + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdMake_ctl00__0'] td[title='%s']", update_Make));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }        ;
    }

    public void clickMake_ToDelete() {
        utils.click(DELETE_FIRST_MAKE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }        ;
    }



    // Model

    public void enterModel(String Model_Value) {
        utils.typeText(MODEL, Model_Value);
    }

    public void selectMake(String Make_Value) {
        try {
            utils.click(MAKE_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Make_Value));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Make_Value);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Make_Value);
            throw e;
        }
    }

    public void selectAsset_Sub_Category(String Asset_Sub_Category_Value) {
        try {
            utils.click(ASSET_SUB_CATEGORY_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Asset_Sub_Category_Value));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Asset_Sub_Category_Value);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Asset_Sub_Category_Value);
            throw e;
        }
    }

    public void verifyAddModel(String Model_Value) {
        utils.typeText(SEARCH_MODEL, Model_Value + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdModel_ctl00__0'] td[title='%s']", Model_Value));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickModel_toEdit() {
        utils.click(FIRST_MODEL_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateModel(String update_Model) {
        utils.clearAndType(MODEL, update_Model);
    }

    public void verifyUpdateModel(String update_Model) {
        utils.typeText(SEARCH_MODEL, update_Model + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdModel_ctl00__0'] td[title='%s']", update_Model));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }

    public void clickModel_ToDelete() {
        utils.click(DELETE_FIRST_MODEL_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }

// Derating Factor

    public void enterDerating_Factor_Code(String Derating_Factor_Code) {
        utils.typeText(DERATING_FACTOR_CODE, Derating_Factor_Code);
    }

    public void enterDerating_Factor_Description(String Derating_Factor_Description) {
        utils.typeText(DERATING_FACTOR_DESCRIPTION, Derating_Factor_Description);
    }

    public void verifyAddDerating_Factor(String Derating_Factor_Code) {
        utils.typeText(SEARCH_DERATING_FACTOR_CODE, Derating_Factor_Code + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdDeratingFactors_ctl00__0'] td[title='%s']", Derating_Factor_Code));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickDerating_Factor_toEdit() {
        utils.click(FIRST_DERATING_FACTOR_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateDerating_Factor(String update_Derating_Factor) {
        utils.clearAndType(DERATING_FACTOR_CODE, update_Derating_Factor);
    }

    public void verifyUpdateDerating_Factor(String update_Derating_Factor) {
        utils.typeText(SEARCH_DERATING_FACTOR_CODE, update_Derating_Factor + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdDeratingFactors_ctl00__0'] td[title='%s']", update_Derating_Factor));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }        ;
    }

    public void clickDerating_Factor_ToDelete() {
        utils.click(DELETE_FIRST_DERATING_FACTOR_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }        ;
    }

// Reading Unit

public void enterShort_Code_Reading_Unit(String Short_Code) {
    utils.typeText(READING_UNIT_SHORT_CODE, Short_Code);
}
    public void enterReading_Unit(String Reading_Unit) {
        utils.typeText(READING_UNIT, Reading_Unit);
    }

    public void selectReading_Unit_Symbol(String Reading_Unit_Symbol) {
        try {
            utils.click(READING_UNIT_SYMBOL_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Reading_Unit_Symbol));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Reading_Unit_Symbol);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Reading_Unit_Symbol);
            throw e;
        }
    }

    public void verifyAddReading_Unit(String Model_Value) {
        utils.typeText(SEARCH_READING_UNIT, Model_Value + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_ReadingUnit_ctl00__0'] td[title='%s']", Model_Value));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickReading_Unit_toEdit() {
        utils.click(FIRST_READING_UNIT_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void Update_Reading_Unit(String update_Reading_Unit) {
        utils.clearAndType(READING_UNIT, update_Reading_Unit);
    }

    public void verifyUpdateReading_Unit(String update_Reading_Unit) {
        utils.typeText(SEARCH_READING_UNIT, update_Reading_Unit + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_ReadingUnit_ctl00__0'] td[title='%s']", update_Reading_Unit));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }

    public void clickReading_Unit_ToDelete() {
        utils.click(DELETE_FIRST_READING_UNIT_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }

    // Technical Parameters

    public void enterTechnical_Parameters(String Technical_Parameters) {
        utils.typeText(TECHNICAL_PARAMETER, Technical_Parameters);
    }
    public void selectTechnical_Parameters_Reading_Unit(String Technical_Parameters_Reading_Unit) {
        try {
            utils.click(TECHNICAL_PARAMETER_READING_UNIT_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Technical_Parameters_Reading_Unit));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Technical_Parameters_Reading_Unit);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Technical_Parameters_Reading_Unit);
            throw e;
        }
    }
    public void selectTechnical_Parameters_Parameter_Type(String Technical_Parameter_Parameter_Type) {
        try {
            utils.click(TECHNICAL_PARAMETER_PARAMETER_TYPE_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Technical_Parameter_Parameter_Type));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Technical_Parameter_Parameter_Type);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Technical_Parameter_Parameter_Type);
            throw e;
        }
    }

    public void enterTechnical_Parameters_Max_Length(String Technical_Parameters_Max_Length) {
        utils.typeText(TECHNICAL_PARAMETER_MAX_LENGTH, Technical_Parameters_Max_Length);
    }

    public void selectTechnical_Parameters_Box_name(String Technical_Parameters_Box_name) {
        try {
            utils.click(TECHNICAL_PARAMETER_BOX_NAME_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Technical_Parameters_Box_name));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Technical_Parameters_Box_name);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Technical_Parameters_Box_name);
            throw e;
        }
    }


    public void verifyAddTechnical_Parameters(String Technical_Parameter) {
        utils.typeText(SEARCH_TECHNICAL_PARAMETER, Technical_Parameter + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_TechPara_ctl00__0'] td[title='%s']", Technical_Parameter));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickTechnical_Parameters_toEdit() {
        utils.click(FIRST_TECHNICAL_PARAMETER_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void Update_Technical_Parameters(String update_Technical_Parameters) {
        utils.clearAndType(TECHNICAL_PARAMETER, update_Technical_Parameters);
    }

    public void verifyUpdateTechnical_Parameters(String update_Technical_Parameters) {
        utils.typeText(SEARCH_TECHNICAL_PARAMETER, update_Technical_Parameters + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_TechPara_ctl00__0'] td[title='%s']", update_Technical_Parameters));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }

    public void clickTechnical_Parameters_ToDelete() {
        utils.click(DELETE_FIRST_TECHNICAL_PARAMETER_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }

    // Metering Attributes

    public void enterMetering_Attributes(String Metering_Attributes) {
        utils.typeText(METERING_ATTRIBUTE, Metering_Attributes);
    }

    public void enterMetering_Attribute_Decimals(String Metering_Attribute_Decimals) {
        utils.typeText(METERING_ATTRIBUTE_DECIMALS, Metering_Attribute_Decimals);
    }

    public void verifyAddMetering_Attributes(String Metering_Attributes) {
        utils.typeText(SEARCH_METERING_ATTRIBUTE, Metering_Attributes + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_MeteringAttribute_ctl00__0'] td[title='%s']", Metering_Attributes));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickMetering_Attributes_toEdit() {
        utils.click(FIRST_METERING_ATTRIBUTE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void Update_Metering_Attributes(String Update_Metering_Attributes) {
        utils.clearAndType(METERING_ATTRIBUTE, Update_Metering_Attributes);
    }

    public void verifyUpdateMetering_Attributes(String Update_Metering_Attributes) {
        utils.typeText(SEARCH_METERING_ATTRIBUTE, Update_Metering_Attributes + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_MeteringAttribute_ctl00__0'] td[title='%s']", Update_Metering_Attributes));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }

    public void clickMetering_Attributes_ToDelete() {
        utils.click(DELETE_FIRST_METERING_ATTRIBUTE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }



//    Tools / Equipments

    public void enterEquipment_Name(String Equipment_Name) {
        utils.typeText(EQUIPMENT_NAME, Equipment_Name);
    }

    public void enterHourly_Charges_AED (String Hourly_Charges) {
        utils.typeText(HOURLY_CHARGES_AED, Hourly_Charges);
    }

    public void selectTools_Unit(String Tools_Unit) {
        try {
            utils.click(TOOLS_UNIT_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Tools_Unit));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Tools_Unit);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Tools_Unit);
            throw e;
        }
    }

      public void verifyAddTools_And_Equipments(String Equipment_Name) {
        utils.typeText(SEARCH_TOOLS_AND_EQUIPMENT, Equipment_Name + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTools_Equipment_ctl00__0'] td[title='%s']", Equipment_Name));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickTools_And_Equipments_toEdit() {
        utils.click(FIRST_TOOLS_AND_EQUIPMENT_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void Update_Tools_And_Equipments(String Update_Equipment_Name) {
        utils.clearAndType(EQUIPMENT_NAME, Update_Equipment_Name);
    }

    public void verifyUpdateTools_And_Equipments(String Update_Equipment_Name) {
        utils.typeText(SEARCH_TOOLS_AND_EQUIPMENT, Update_Equipment_Name + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTools_Equipment_ctl00__0'] td[title='%s']", Update_Equipment_Name));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }

    public void clickTools_And_Equipments_ToDelete() {
        utils.click(DELETE_FIRST_TOOLS_AND_EQUIPMENT_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }  ;
    }
}