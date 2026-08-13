package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.*;


public class AssetManagementMastersPage extends BasePage {
    public AssetManagementMastersPage(WebDriver driver) {
        super(driver);
    }

    public static final By MASTER_ASSET_ASSET_CLASS = By.id("radtxtAssetClass");
    public static final By MASTER_ASSET_ASSET_MASTER_CATEGORY_ADD_BUTTON = By.id("BtnAssetMasCat");
    public static final By MASTER_ASSET_ASSET_MASTER_CATEGORY = By.id("radtxtAsscatname");
    public static final By MASTER_ASSET_ASSET_CATEGORY = By.id("RadtxtAssCat");
    public static final By ASSET_SUB_CATEGORY = By.id("radtxtAssSubCat");
    public static final By MASTER_ASSET_SUBCATEGORY_MASTER_CATEGORY =
            By.id("ctl00_ContentPlaceHolder1_RadWinAssSubCat_C_raddrpAssMastcat_Input");
    public static final By MASTER_ASSET_CRITICALITY = By.id("ctl00_ContentPlaceHolder1_RadWinAssSubCat_C_ddlAssetCriticality_Input");
    public static final By MASTER_ASSET_BACK_ICON_ASSET_SUB_CATEGORY = By.id("ContentPlaceHolder1_dvAttachActionButton");

    public static final By MASTER_ASSET_OEM = By.id("radtxtOEMCode");
    public static final By MASTER_ASSET_MAKE = By.id("radtxtMakeCode");
    public static final By MASTER_ASSET_MODEL = By.id("radtxtModel");
    public static final By MASTER_ASSET_MODEL_OEM_SELECT =
            By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_radDrpModelOEM_Input");
   public static final By MASTER_ASSET_MODEL_MASTER_CATEGORY_SELECT =
            By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_radDrpMaster_Input");
   public static final By MASTER_ASSET_DERATING_FACTOR_CODE = By.id("txtCode");
    public static final By MASTER_ASSET_DERATING_FACTOR_DESCRIPTION = By.id("txtDescription");
    public static final By MASTER_ASSET_DERATING_FACTOR_ACTIVE_CHECKBOX = By.id("chkFactorActive");
    public static final By MASTER_ASSET_READING_UNIT_SHORT_CODE = By.id("radtxtshortCode");
    public static final By MASTER_ASSET_READING_UNIT = By.id("radtxtReadingUnit");
    public static final By MASTER_ASSET_TECHNICAL_PARAMETER   = By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_radtxtParaName");
    public static final By MASTER_ASSET_TECHNICAL_PARAMETER_PARAMETER_TYPE  = By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_raddrpParaType_Input");
    public static final By MASTER_ASSET_TECHNICAL_PARAMETER_MAX_LENGTH =  By.id("radtxtMaxLength");
    public static final By MASTER_ASSET_TECHNICAL_PARAMETER_NO_OF_DECIMALS =  By.id("radtxtNoofDecimal");
    public static final By MASTER_ASSET_TECHNICAL_PARAMETER_LOV_TEXTBOX = By.id("RadTextBox2");
    public static final By MASTER_ASSET_TECHNICAL_PARAMETER_LOV_ADD_BUTTON =  By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_RadButton1");
    public static final By MASTER_ASSET_TECHNICAL_PARAMETER_BOX_NAME   = By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_raddrpBoxName_Input");
    public static final By MASTER_ASSET_METERING_ATTRIBUTE   = By.id("radtxtAttribute");
    public static final By MASTER_ASSET_METERING_PARAMETER   = By.id("radtxtParameter");
    public static final By MASTER_ASSET_READING_UNIT_TEXTBOX =  By.id("rtbRadingUnitMP");

    public static final By MASTER_ASSET_INPUT_TYPE_DROPDOWN =  By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_raddrpInputType_Input");
    public static final By MASTER_ASSET_METERING_PARAMETER_READING_TYPE =  By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_raddrpReadingType_Input");

    public static final By MASTER_ASSET_EQUIPMENT_NAME   = By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_radtxtEquipmentName");
    public static final By MASTER_ASSET_HOURLY_CHARGES_AED   = By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_radtxtrate");
    public static final By MASTER_ASSET_SEARCH_ASSET_CLASS = By.cssSelector("[alt='Filter AssetClassName column']");
    public static final By SEARCH_ASSET_MASTER_CATEGORY = By.cssSelector("[alt='Filter AssetMasterCategoryName column']");
    public static final By MASTER_ASSET_SEARCH_ASSET_CATEGORY = By.cssSelector("[alt='Filter AssetCategoryName column']");
    public static final By MASTER_ASSET_SEARCH_ASSET_SUB_CATEGORY = By.cssSelector("[alt='Filter AssetSubCategory column']");


    public static final By MASTER_ASSET_SEARCH_OEM = By.cssSelector("[alt='Filter Name column']");
    public static final By MASTER_ASSET_SEARCH_MAKE = By.cssSelector("[alt='Filter BrandName column']");
    public static final By MASTER_ASSET_SEARCH_MODEL = By.cssSelector("[alt='Filter Model column']");
    public static final By MASTER_ASSET_SEARCH_DERATING_FACTOR_CODE = By.cssSelector("[alt='Filter Code column']");
    public static final By MASTER_ASSET_SEARCH_READING_UNIT = By.cssSelector("[alt='Filter ReadingUnitName column']");
    public static final By MASTER_ASSET_SEARCH_TECHNICAL_PARAMETER = By.cssSelector("[alt='Filter ParameterName column']");
    public static final By MASTER_ASSET_SEARCH_METERING_ATTRIBUTE = By.cssSelector("[alt='Filter AttributeName column']");
    public static final By MASTER_ASSET_SEARCH_METERING_PARAMETER = By.cssSelector("[alt='Filter ParameterName column']");
    public static final By MASTER_ASSET_SEARCH_TOOLS_AND_EQUIPMENT = By.cssSelector("[alt='Filter EquipmentName column']");

    public static final By MASTER_ASSET_FIRST_ASSET_CLASS_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetClass_ctl00__0");
    public static final By MASTER_ASSET_FIRST_ASSET_MASTER_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetCat_ctl00__0");
    public static final By MASTER_ASSET_FIRST_ASSET_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetCategory_ctl00__0");
    public static final By MASTER_ASSET_FIRST_ASSET_SUB_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssSubCat_ctl00__0");
    public static final By MASTER_ASSET_CLICK_MANAGE_ASSET_SUBCATEGORY = By.id("ContentPlaceHolder1_Span4");

    public static final By MASTER_ASSET_FIRST_OEM_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdOEM_ctl00__0");
    public static final By MASTER_ASSET_FIRST_MAKE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdMake_ctl00__0");
    public static final By MASTER_ASSET_FIRST_MODEL_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdModel_ctl00__0");
    public static final By MASTER_ASSET_FIRST_DERATING_FACTOR_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdDeratingFactors_ctl00__0");
    public static final By MASTER_ASSET_FIRST_READING_UNIT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_ReadingUnit_ctl00__0");
    public static final By MASTER_ASSET_FIRST_TECHNICAL_PARAMETER_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_TechPara_ctl00__0");
    public static final By MASTER_ASSET_FIRST_METERING_ATTRIBUTE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_MeteringAttribute_ctl00__0");
    public static final By MASTER_ASSET_FIRST_METERING_PARAMETER_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_MeteringPara_ctl00__0");
    public static final By MASTER_ASSET_FIRST_TOOLS_AND_EQUIPMENT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTools_Equipment_ctl00__0");

    public static final By MASTER_ASSET_DELETE_FIRST_ASSET_CLASS_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetClass_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_ASSET_MASTER_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetCat_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_ASSET_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssetCategory_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_ASSET_SUB_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAssSubCat_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_OEM_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdOEM_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_MAKE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdMake_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_MODEL_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdModel_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_DERATING_FACTOR_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdDeratingFactors_ctl00_ctl04_ImabtnDeratingFactors");
    public static final By MASTER_ASSET_DELETE_FIRST_READING_UNIT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_ReadingUnit_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_TECHNICAL_PARAMETER_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_TechPara_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_METERING_ATTRIBUTE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_MeteringAttribute_ctl00_ctl04_ImageButton1");
    public static final By MASTER_ASSET_DELETE_FIRST_METERING_PARAMETER_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_MeteringPara_ctl00_ctl04_ImageButton1");

    public static final By MASTER_ASSET_DELETE_FIRST_TOOLS_AND_EQUIPMENT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTools_Equipment_ctl00_ctl04_ImageButton1");
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

    public static final By MASTER_ASSET_MANAGEMENT_EXPORT_TO_EXCEL_BUTTON= By.id("btnExportToExcel");

    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_MANAGE_APPLICABLE_FAULT_CATEGORY_BUTTON= By.id("ContentPlaceHolder1_Span7");
    public static final By MASTER_ASSET_SUBCATEGORY_SERVICE_GROUP_DROPDOWN =
            By.xpath("//a[contains(@id,'ddlServiceGroup_Arrow')]");



    private static final By MASTER_ASSET_FAULT_CATEGORY_DROPDOWN =
            By.xpath("//div[contains(@class,'k-multiselect')]");

    private static final By MASTER_ASSET_FAULT_CATEGORY_VALUES =
            By.xpath("//ul[@role='listbox']//li");


    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_APPLICABLE_FAULT_CATEGORY_SAVE_BUTTON= By.id("ctl00_ContentPlaceHolder1_RadWinApplicableFaultCategory_C_btnSaveApplicableFaultCategory");


    public static final By MASTER_ASSET_CLICK_ADD_LIFE_CYCLE_SETUP= By.id("ContentPlaceHolder1_Span3");
    public static final By MASTER_ASSET_LIFE_CYCLE_EXP_MTBF= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtExpectedMTBF");
    public static final By MASTER_ASSET_LIFE_CYCLE_EXP_MTTR= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtExpectedMTTR");
    public static final By MASTER_ASSET_LIFE_CYCLE_EXP_UTILIZATION= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtExpectedUtililization");
    public static final By MASTER_ASSET_LIFE_CYCLE_EXP_ENERGY_COST= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtExpectedEnergyCost");
    public static final By MASTER_ASSET_LIFE_CYCLE_MAINTENANCE_HOURS_PER_YEAR= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtMaintenancehrs");
    public static final By MASTER_ASSET_LIFE_CYCLE_EFFICIENCY_OF_TECHNICIANS_AT_WORK= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtEfficiency");
    public static final By MASTER_ASSET_LIFE_CYCLE_NUMBER_OF_TECHNICIANS= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtNoOftechnician");
    public static final By MASTER_ASSET_LIFE_CYCLE_INSTALLATION_COST= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtInstallcost");
    public static final By MASTER_ASSET_LIFE_CYCLE_T_AND_C_COST= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_txtTermscost");
    public static final By MASTER_ASSET_LIFE_CYCLE_SAVE_BUTTON= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryLifeCycleSetup_C_btnSaveLifeCycleSetup");

    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_MANAGE_TECHNICAL_PARAMETER_BUTTON= By.id("ContentPlaceHolder1_Span5");
    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_TECHNICAL_PARAMETER_ADD_BUTTON=  By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalParameter_C_btnAddParameter");
    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_TECHNICAL_PARAMETER_SAVE_BUTTON= By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalParameter_C_btnTechnicalParameterSave");

    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_LINK_PARAMETER_SETUP_BUTTON= By.id("ContentPlaceHolder1_Span1");
    public static final By MASTER_ASSET_SUBCATEGORY_LINK_PARAMETER_SETUP_PARAMETER_DROPDOWN=  By.xpath("//a[contains(@id,'ddlParmParameter_Arrow')]");
    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_LINK_PARAMETER_SETUP_SAVE_BUTTON= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryParameter_C_btnSaveParameter");

    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_ADD_TRIGGER_BUTTON= By.id("ContentPlaceHolder1_Span2");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_NAME= By.id("radtxtTriggerName");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_SAVE_BUTTON= By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_btnTriggerSave");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_PARAMETER_DROPDOWN = By.xpath("//a[contains(@id,'raddrpTriggerPara_Arrow')]");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_COMPARISON_TYPE =  By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_raddrpCompareType_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_EVENT_DROPDOWN =     By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_raddrpTriggerEvent_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_PARAMETER_VALUE_FROM = By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_radtxtParaValueFrom");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_PARAMETER_VALUE_TO = By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_radtxtParaValueTo");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_TOLERANCE_PLUS =
            By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_radtxtToleranceP");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_TOLERANCE_MINUS =
            By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_radtxtToleranceM");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_REASON_DROPDOWN = By.xpath("//a[contains(@id,'raddrpTriggerReason_Arrow')]");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_CONTRACT_GROUP_DROPDOWN =
            By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_raddrpContract_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_WORK_ORDER_TYPE =  By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_RaddrpWorkorder_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_SERVICE_GROUP_DROPDOWN =  By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_raddrpServiceGrp_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_FAULT_CATEGORY_DROPDOWN =  By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_raddrpFaultCat_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_FAULT_CODE_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_raddrpFaultCode_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_PRIORITY_DROPDOWN =  By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_radrpPriority_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_WO_GEN_WAIT_TIME = By.id("radtxtWoGenertWait");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_PPM_TASK_SHEET_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_raddrpPPMTaskSheet_Input");
    public static final By MASTER_ASSET_SUBCATEGORY_TRIGGER_DESCRIPTION = By.id("radtxtDescription");

    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_MANAGE_APPLICABLE_TRADE_BUTTON= By.id("ContentPlaceHolder1_Span8");
    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_APPLICABLE_TRADE_ADD_BUTTON=  By.id("ctl00_ContentPlaceHolder1_RadWinApplicableTrade_C_btnAddTrade");
    public static final By MASTER_ASSET_SUBCATEGORY_CLICK_APPLICABLE_TRADE_SAVE_BUTTON= By.id("ctl00_ContentPlaceHolder1_RadWinApplicableTrade_C_btnAssetTradeSave");

    public void moveToAssetManagementElementByName(String ElementName) {
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
                    Thread.currentThread().interrupt();
                }
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page");
    }

//Asset Class

    public void MasterAssetenterAssetClass(String Asset_Class) {
        utils.typeText(MASTER_ASSET_ASSET_CLASS, Asset_Class);
        System.out.println("The Entered Asset Class is : " + Asset_Class);
    }

    public void MasterAssetverifyAddAssetClass(String Asset_Class) {
        utils.typeText(MASTER_ASSET_SEARCH_ASSET_CLASS, Asset_Class + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetClass_ctl00__0'] td[title='%s']", Asset_Class));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Verified Added Asset Class Successfully");
    }

    public void MasterAssetclickAssetClasstoEdit() {
        utils.click(MASTER_ASSET_FIRST_ASSET_CLASS_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetupdateAssetClass(String update_Asset_Class) {
        utils.clearAndType(MASTER_ASSET_ASSET_CLASS, update_Asset_Class);
        System.out.println("The Updated Asset Class is : " + update_Asset_Class);

    }

    public void MasterAssetverifyUpdateAssetClass(String updateAsset_Class) {
        utils.typeText(MASTER_ASSET_SEARCH_ASSET_CLASS, updateAsset_Class + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetClass_ctl00__0'] td[title='%s']", updateAsset_Class));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Verified Updated Asset Class Successfully");
    }

    public void MasterAssetclickAssetClassToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_ASSET_CLASS_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Asset Class Deleted Successfully");

    }

//Asset Master Category
public void MasterAssetclickAddAssetMasterCategory() {
    utils.click( MASTER_ASSET_ASSET_MASTER_CATEGORY_ADD_BUTTON);
    System.out.println("Clicked Add Asset Master Category Button");
}


    public void MasterAssetenterAssetMasterCategory(String Asset_Master_Category) {
        utils.typeText( MASTER_ASSET_ASSET_MASTER_CATEGORY, Asset_Master_Category);
        System.out.println("The Entered Asset Master Category  is : " + Asset_Master_Category);
    }

    public void MasterAssetselectAssetClassrando() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
        )).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@class,'rcbItem')]") ));
        int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
        System.out.println("Units Found : " + count);
        int randomIndex = new Random().nextInt(count) + 1;
        By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
        String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                .getText();
        WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Selected Asset Class is : " + selectedValue);
    }

    public void MasterAssetverifyAddAssetMasterCategory(String Asset_Master_Category) {
        utils.typeText(SEARCH_ASSET_MASTER_CATEGORY, Asset_Master_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetCat_ctl00__0'] td[title='%s']", Asset_Master_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Verified Added Asset Master Category Successfully");
    }

    public void MasterAssetclickAssetMasterCategorytoEdit() {
        utils.click( MASTER_ASSET_FIRST_ASSET_MASTER_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetupdateAssetMasterCategory(String update_Asset_Master_Category) {
        utils.clearAndType( MASTER_ASSET_ASSET_MASTER_CATEGORY, update_Asset_Master_Category);
        System.out.println("The Updated Asset Master Category  is : " + update_Asset_Master_Category);
    }

    public void MasterAssetverifyUpdateAssetMasterCategory(String update_Asset_Master_Category) {
        utils.typeText(SEARCH_ASSET_MASTER_CATEGORY, update_Asset_Master_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetCat_ctl00__0'] td[title='%s']", update_Asset_Master_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Verified Updated Asset Master Category Successfully");
    }

    public void MasterAssetclickAssetMasterCategoryToDelete() {
        utils.click( MASTER_ASSET_DELETE_FIRST_ASSET_MASTER_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Asset Master Category Deleted Successfully");
    }

//    Asset Category

    public void MasterAssetenterAssetCategory(String Asset_Category) {
        utils.typeText(MASTER_ASSET_ASSET_CATEGORY, Asset_Category);
        System.out.println("The Entered Asset Category is : " + Asset_Category);
    }

    public void MasterAssetselectAssetMasterCategoryRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
        )).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@class,'rcbItem')]") ));
        int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
        System.out.println("Units Found : " + count);
        int randomIndex = new Random().nextInt(count) + 1;
        By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
        String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                .getText();
        WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Selected Asset Master Category is : " + selectedValue);

    }

    public void MasterAssetverifyAddAssetCategory(String Asset_Category) {
        utils.typeText(MASTER_ASSET_SEARCH_ASSET_CATEGORY, Asset_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetCategory_ctl00__0'] td[title='%s']", Asset_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Added Asset Category is Verified Successfully");
    }

    public void MasterAssetclickAssetCategorytoEdit() {
        utils.click(MASTER_ASSET_FIRST_ASSET_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetupdateAssetCategory(String update_Asset_Category) {
        utils.clearAndType(MASTER_ASSET_ASSET_CATEGORY, update_Asset_Category);
        System.out.println("The Updated Asset Category is : " + update_Asset_Category);

    }

    public void MasterAssetverifyUpdateAssetCategory(String update_Asset_Category) {
        utils.typeText(MASTER_ASSET_SEARCH_ASSET_CATEGORY, update_Asset_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssetCategory_ctl00__0'] td[title='%s']", update_Asset_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Updated Asset Category is Verified Successfully");
    }

    public void MasterAssetclickAssetCategoryToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_ASSET_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Asset Category Deleted Successfully");
    }

//    Asset Sub Category

    public void MasterAssetenterAsset_Sub_Category(String Asset_Sub_Category) {
        utils.typeText(ASSET_SUB_CATEGORY, Asset_Sub_Category);
        System.out.println("The Entered Asset Sub Category is : " + Asset_Sub_Category);
    }

    public void MasterAssetselectSubCategoryMasterCategory(String value) {
     utils.selectDropdownByText( MASTER_ASSET_SUBCATEGORY_MASTER_CATEGORY,  value );
        System.out.println("Master Category selected");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetselectSubCategoryCategory()
            throws InterruptedException {
      Thread.sleep(5000);
        By categoryDropdown = By.id("ctl00_ContentPlaceHolder1_RadWinAssSubCat_C_raddrpAsscate_Input");
        driver.findElement(categoryDropdown).click();
        Thread.sleep(2000);
        By option =
                By.xpath("//li[normalize-space()='ak office electronic items']");
        WebElement element =
                new WebDriverWait(driver, Duration.ofSeconds(20))
                        .until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Asset Category selected.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetselectCriticalityRandom() {
        String[] values = {"High", "Medium", "Low"};
        String selectedValue = values[new Random().nextInt(values.length)];
        utils.selectDropdownByVisibleText( MASTER_ASSET_CRITICALITY, selectedValue);
        System.out.println("Selected Criticality : " + selectedValue);
    }

    public void verifyAddAsset_Sub_Category(String Asset_Sub_Category) {
        utils.typeText(MASTER_ASSET_SEARCH_ASSET_SUB_CATEGORY, Asset_Sub_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssSubCat_ctl00__0'] td[title='%s']", Asset_Sub_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Asset Sub Category is Verified Successfully ");
    }

//    Update Asset SubCategory
    public void MasterAssetClickManageAssetSubCategoryicon(){
        utils.click(MASTER_ASSET_CLICK_MANAGE_ASSET_SUBCATEGORY);
    }

    public void MasterAssetupdateAssetSubCategory(String update_Asset_Sub_Category) {
        utils.clearAndType(ASSET_SUB_CATEGORY, update_Asset_Sub_Category);
        System.out.println("The Updated Sub Asset Sub Category is : " + update_Asset_Sub_Category);
    }

    public void MasterAssetclickbackicontomoveAssetSubCategorygridlist() {
        utils.click(MASTER_ASSET_BACK_ICON_ASSET_SUB_CATEGORY);
         }

    public void MasterAssetverifyUpdateAssetSubCategory(String update_Asset_Sub_Category) {
        utils.typeText(MASTER_ASSET_SEARCH_ASSET_SUB_CATEGORY, update_Asset_Sub_Category + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAssSubCat_ctl00__0'] td[title='%s']", update_Asset_Sub_Category));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Updated Asset Sub Category is Verified Successfully");
    }

public void MasterAssetclickAssetubCategorytoEdit(){
 utils.doubleClick(MASTER_ASSET_FIRST_ASSET_SUB_CATEGORY_IN_LIST);
        try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}

 public void MasterAssetClickOnSectioninAssetSubCategoryDetailpage(String sectionName) {
        By locator = switch (sectionName) {
            case "Applicable Fault Category" -> By.id("mnuApplicableFaultCategory");
            case "Technical Parameters" -> By.id("mnuTechnicalParameter");
            case "Metering Parameters" -> By.id("mnuParameterLinkSetup");
            case "Triggers" -> By.id("mnuTriggers");
            case "Life Cycle Setup" -> By.id("mnuLifeCycleSetup");
            case "Applicable Trades" -> By.id("mnuApplicableTrade");
            default -> throw new IllegalArgumentException(
                    "Unknown section: " + sectionName);
        };
     utils.scrollToElement(locator);
        utils.click(locator);
        System.out.println("Clicked on section: " + sectionName);
    }

    //    Asset Sub Category - Applicable Fault Category
    public void MasterAssetClickManageFaultCategoryiconinFaultCategorySectionofSubCategorydetailpage() {
        utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_MANAGE_APPLICABLE_FAULT_CATEGORY_BUTTON);
    }

    public void MasterAssetselectServiceGroupinFaultCategorySectionofSubCategorydetailpage() {
           WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
            Random random = new Random();
            By dropdown =   By.xpath("//div[contains(@id,'ddlServiceGroup_DropDown')]");
            By options =   By.xpath("//div[contains(@id,'ddlServiceGroup_DropDown')]//li[contains(@class,'rcbItem')]");
            waitForLoaderToDisappear();
            // Open dropdown
            WebElement arrow =  wait.until(ExpectedConditions.elementToBeClickable(MASTER_ASSET_SUBCATEGORY_SERVICE_GROUP_DROPDOWN));
            ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
            // Wait dropdown visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
            // Get count only
            int size = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(options)).size();
            System.out.println("Service Group count: " + size);
            if (size == 0) {
                throw new RuntimeException("No Service Group values found");
            }
            // Random index
            int index = random.nextInt(size) + 1;
            // Re-fetch fresh element
            By optionByIndex = By.xpath("(//div[contains(@id,'ddlServiceGroup_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]" );
            WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
            String value = option.getText().trim();
            // Scroll
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});",
                    option);
            // Click
            ((JavascriptExecutor) driver)  .executeScript("arguments[0].click();", option);
            waitForLoaderToDisappear();
            System.out.println("Selected Service Group: " + value);
        }


    public void MasterAssetselectFaultCategoryinFaultCategorypopupofSubCategorydetailpage() {
        utils.click(MASTER_ASSET_FAULT_CATEGORY_DROPDOWN);
        utils.waitForSeconds(3);
        List<WebElement> faultCategories =  driver.findElements(MASTER_ASSET_FAULT_CATEGORY_VALUES);
        System.out.println("Fault Categories Found: " + faultCategories.size());
        if (faultCategories.isEmpty()) {
            throw new RuntimeException("No Fault Categories found.");
        }
        // Remove empty values
        faultCategories.removeIf(e -> e.getText().trim().isEmpty());
        Random random = new Random();
        WebElement selectedFaultCategory = faultCategories.get(random.nextInt(faultCategories.size()));
        String faultCategoryName = selectedFaultCategory.getText().trim();
        System.out.println("Selecting Fault Category: " + faultCategoryName);
        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        selectedFaultCategory);
        utils.waitForSeconds(1);
        // Select one value
        utils.jsClick(selectedFaultCategory);
        utils.waitForSeconds(1);
        utils.click(MASTER_ASSET_FAULT_CATEGORY_DROPDOWN);
        System.out.println("Selected Fault Category: " + faultCategoryName);
    }

    public void MasterAssetClicksavebuttoninFaultCategorySectionofSubCategorydetailpage() {
        utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_APPLICABLE_FAULT_CATEGORY_SAVE_BUTTON);
    }

    //    Asset Sub Category - Life Cycle Setup
    public void MasterAssetClickOnAddbuttoninSubCategoryLifeCycleSetupSection(){
        utils.click(MASTER_ASSET_CLICK_ADD_LIFE_CYCLE_SETUP);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetuserfillLifeCycledetailsinSubCategoryLifeCycleSetupSection() {
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_EXP_MTBF, "10");
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_EXP_MTTR, "5");
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_EXP_UTILIZATION, "75");
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_EXP_ENERGY_COST, "1000");
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_MAINTENANCE_HOURS_PER_YEAR, "500");
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_EFFICIENCY_OF_TECHNICIANS_AT_WORK, "80");
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_NUMBER_OF_TECHNICIANS, "10");
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_INSTALLATION_COST, "10");
        utils.typeText(MASTER_ASSET_LIFE_CYCLE_T_AND_C_COST, "10");
        System.out.println("Life Cycle details entered successfully.");
    }

    public void MasterAssetselectDeratingFactorsAndEnterPercentage() {
    List<WebElement> checkBoxes =
        driver.findElements(By.xpath(
              "//table[contains(@id,'grdlinklifecycle')]//tr[@class='rgRow' or @class='rgAltRow']//input[@type='checkbox']"
                ));
    List<WebElement> percentageBoxes =
                driver.findElements(By.xpath(
                        "//table[contains(@id,'grdlinklifecycle')]//tr[@class='rgRow' or @class='rgAltRow']//input[contains(@id,'txtlinkpercentage') and @type='text']"
                ));
        System.out.println("Checkboxes found: " + checkBoxes.size());
        System.out.println("Percentages found: " + percentageBoxes.size());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        utils.jsClick(checkBoxes.getFirst());
        js.executeScript("arguments[0].removeAttribute('disabled');",
                percentageBoxes.getFirst());
        percentageBoxes.getFirst().clear();
        percentageBoxes.getFirst().sendKeys("2");
        utils.waitForSeconds(1);

        utils.jsClick(checkBoxes.get(1));
        js.executeScript("arguments[0].removeAttribute('disabled');",
                percentageBoxes.get(1));
        percentageBoxes.get(1).clear();
        percentageBoxes.get(1).sendKeys("3");
        System.out.println("Selected 2 derating factors successfully.");
    }

    public void MasterAssetclickLifeCycleSavebuttoninSubCategorydetailpage() {
        utils.click(MASTER_ASSET_LIFE_CYCLE_SAVE_BUTTON);
    }

    //    Asset Sub Category - Technical Parameters
    public void MasterAssetClickManageTechnicalParametericoninTechnicalParameterSection() {
        utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_MANAGE_TECHNICAL_PARAMETER_BUTTON);
    }

    public void MasterAssetClickfillLinkTechnicalParameterdetailinTechnicalParameterSection() {
    List<WebElement> rows = driver.findElements(
                By.xpath("//table[contains(@id,'grdParameter_ctl00')]//tr[@class='rgRow' or @class='rgAltRow']")
        );
        System.out.println("Technical Parameter Rows Found: " + rows.size());
        if (rows.size() < 2) {
            throw new RuntimeException("Less than 2 Technical Parameters available.");
        }
        Random random = new Random();
        Set<Integer> indexes = new HashSet<>();
        while (indexes.size() < 2) {
            indexes.add(random.nextInt(rows.size()));
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (Integer index : indexes) {
            WebElement row = rows.get(index);
            try {
                WebElement checkbox = row.findElement(By.tagName("input"));
                js.executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        checkbox
                );
                Thread.sleep(1000);
                utils.jsClick(checkbox);
               String parameterName = row.findElement(By.xpath("./td[2]"))
                        .getAttribute("title");
                System.out.println("Selected Technical Parameter: " + parameterName);
            } catch (Exception e) {
     System.out.println("Skipping row " + index +" because no checkbox was found.");
            }
        }
    }

    public void MasterAssetClickAddbuttoninTechnicalParameterpopup()
    { utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_TECHNICAL_PARAMETER_ADD_BUTTON);
    }

    public void MasterAssetClicksavebuttoninTechnicalParameterSection() {
        utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_TECHNICAL_PARAMETER_SAVE_BUTTON);
    }

    //    Asset Sub Category - Metering Parameters
    public void MasterAssetClickOnLinkParameterSetupinMeteringParameterSection() {
        utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_LINK_PARAMETER_SETUP_BUTTON);
    }

    public void MasterAssetfillLinkParameterSetupdetailinMeteringParameterSection() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        By dropdown =   By.xpath("//div[contains(@id,'ddlParmParameter_DropDown')]");
        By options =   By.xpath("//div[contains(@id,'ddlParmParameter_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =  wait.until(ExpectedConditions.elementToBeClickable(MASTER_ASSET_SUBCATEGORY_LINK_PARAMETER_SETUP_PARAMETER_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count only
        int size = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(options)).size();
        System.out.println("Parameter count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Parameter values found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Re-fetch fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'ddlParmParameter_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]" );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                option);
        // Click
        ((JavascriptExecutor) driver)  .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Metering Parameter: " + value);
    }

    public void MasterAssetClickOnLinkParameterSetupsavebutton() {
        utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_LINK_PARAMETER_SETUP_SAVE_BUTTON);
    }

//    Asset Sub Category - Trigger
public void MasterAssetClickOnAddbuttoninSubCategoryTriggerSection() {
    utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_ADD_TRIGGER_BUTTON);
}

    public void MasterAssetEnterTriggerName(String Trigger_Name) {
        utils.typeText(MASTER_ASSET_SUBCATEGORY_TRIGGER_NAME,Trigger_Name);
    }

    public void waitForLoaderToDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//div[contains(@id,'LoadingPanel')]")));
    }

    public void MasterAssetSelectTriggerParameterRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        By dropdown =   By.xpath("//div[contains(@id,'raddrpTriggerPara_DropDown')]");
        By options =   By.xpath("//div[contains(@id,'raddrpTriggerPara_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =  wait.until(ExpectedConditions.elementToBeClickable(MASTER_ASSET_SUBCATEGORY_TRIGGER_PARAMETER_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count only
        int size = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(options)).size();
        System.out.println("Parameter count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Parameter values found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Re-fetch fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpTriggerPara_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]" );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                option);
        // Click
        ((JavascriptExecutor) driver)  .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Parameter: " + value);
    }

    public void Master_Asset_enterAsset_Trigger_Comparison_Type(String Comparison_Type) {
        utils.click(MASTER_ASSET_SUBCATEGORY_TRIGGER_COMPARISON_TYPE);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Comparison_Type + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Selected Trigger_Comparison_Type: " + Comparison_Type);
    }

    public void selectAddAssetRadComboBox(By arrow, String value, String idPart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        By dropdown =
                By.xpath("//*[contains(@id,'" + idPart + "_DropDown')]");
        By option =
                By.xpath("//*[contains(@id,'" + idPart + "_DropDown')]//li[normalize-space()='" + value + "']");
        for (int i = 0; i < 2; i++) {
            try {
                waitForLoaderToDisappear();
                wait.until(ExpectedConditions.elementToBeClickable(arrow)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(option));
                ((JavascriptExecutor) driver).executeScript(   "arguments[0].scrollIntoView({block:'center'});", element);
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                } catch (Exception e) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                }
                waitForLoaderToDisappear();
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("Retrying dropdown...");
            }
        }
    }

    public void Master_Asset_enterAssetTriggerEventAndValues(String comparisonType) {
        Random random = new Random();
        String event;
        if (comparisonType.equalsIgnoreCase("Standard")) {
            String[] events = {
                    "Between",
                    "NotBetween",
                    "Greater than",
                    "Less than"
            };
            event = events[random.nextInt(events.length)];
        } else {
            event = "Tolerance %";
        }
        selectAddAssetRadComboBox( MASTER_ASSET_SUBCATEGORY_TRIGGER_EVENT_DROPDOWN,event,
                "ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_raddrpTriggerEvent"
        );
        waitForLoaderToDisappear();
        waitForSeconds();
        System.out.println("Selected Trigger Event: " + event);
        // ================= STANDARD =================
        if (comparisonType.equalsIgnoreCase("Standard")) {
            int fromValue = random.nextInt(75) + 1;
            utils.typeText(MASTER_ASSET_SUBCATEGORY_TRIGGER_PARAMETER_VALUE_FROM,String.valueOf(fromValue));
            if (event.equalsIgnoreCase("Between")
                    || event.equalsIgnoreCase("NotBetween")) {
                int toValue = fromValue + random.nextInt(75 - fromValue) + 1;
                utils.typeText(
                        MASTER_ASSET_SUBCATEGORY_TRIGGER_PARAMETER_VALUE_TO,
                        String.valueOf(toValue) );
                System.out.println("Parameter From Value: " + fromValue);
                System.out.println("Parameter To Value: " + toValue);
            }
        }
        // ================= COMMISSIONING / DESIGN =================
        else {
            int tolerancePlus = random.nextInt(10) + 1;   // 1-10
            int toleranceMinus = random.nextInt(10) + 1;  // 1-10
            utils.typeText(
                    MASTER_ASSET_SUBCATEGORY_TRIGGER_TOLERANCE_PLUS,
                    String.valueOf(tolerancePlus) );
            utils.typeText(
                    MASTER_ASSET_SUBCATEGORY_TRIGGER_TOLERANCE_MINUS,
                    String.valueOf(toleranceMinus)  );
            System.out.println("Tolerance + : " + tolerancePlus);
            System.out.println("Tolerance - : " + toleranceMinus);
        }
    }

    public void Master_Asset_selectAssetTriggerReasonRandom() {
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        By dropdown =  By.xpath("//div[contains(@id,'raddrpTriggerReason_DropDown')]");
        By options =  By.xpath("//div[contains(@id,'raddrpTriggerReason_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =  wait.until(ExpectedConditions.elementToBeClickable(MASTER_ASSET_SUBCATEGORY_TRIGGER_REASON_DROPDOWN));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", arrow);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        List<WebElement> allOptions =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(options));
        System.out.println("Trigger Reason count: " + allOptions.size());
        if (allOptions.isEmpty()) {
            throw new RuntimeException("No Trigger Reason values found");
        }
        // Random selection
        WebElement option =   allOptions.get(random.nextInt(allOptions.size()));
        String value = option.getText().trim();
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                option);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Trigger Reason: " + value);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);

        waitForLoaderToDisappear();

// CLOSE THE DROPDOWN
        new Actions(driver)
                .sendKeys(Keys.ESCAPE)
                .perform();

        waitForSeconds();
        System.out.println("Selected Trigger Reason: " + value);
    }


    public void waitForContractGroupLoadingToDisappear() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        try {

            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.xpath("//*[contains(text(),'Loading...')]")));

        } catch (Exception e) {

            System.out.println("Loading popup not found.");
        }
    }

    public void Master_Asset_selectAssetTriggerContractGroupRandom() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Random random = new Random();

        By dropdown =
                By.xpath("//div[contains(@id,'raddrpContract_DropDown')]");

        // More generic locator
        By options =
                By.xpath("//div[contains(@id,'raddrpContract_DropDown')]//li");

        waitForLoaderToDisappear();

        // Open dropdown
        WebElement arrow =
                wait.until(ExpectedConditions.elementToBeClickable(
                        MASTER_ASSET_SUBCATEGORY_TRIGGER_CONTRACT_GROUP_DROPDOWN));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", arrow);

        // VERY IMPORTANT
        waitForContractGroupLoadingToDisappear();

        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));

        List<WebElement> allOptions =
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(options));

        // Remove empty rows
        allOptions.removeIf(e -> e.getText().trim().isEmpty());

        System.out.println("Contract Group count: " + allOptions.size());

        if (allOptions.isEmpty()) {
            throw new RuntimeException("No Contract Group values found");
        }

        WebElement option =
                allOptions.get(random.nextInt(allOptions.size()));

        String value = option.getText().trim();

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        option);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);

        waitForLoaderToDisappear();

        System.out.println("Selected Contract Group: " + value);
    }

        public void Master_Asset_enterAsset_Trigger_Work_Order_Type(String workOrderType) {
            waitForLoaderToDisappear();
            waitForSeconds();
            selectAddAssetRadComboBox(
                    MASTER_ASSET_SUBCATEGORY_TRIGGER_WORK_ORDER_TYPE,
                    workOrderType,
                    "ctl00_ContentPlaceHolder1_RadWinAssetSubCategoryTriggerParameter_C_RaddrpWorkorder"
            );
            System.out.println("Selected Work Order Type: " + workOrderType);
        }

    public void Master_Asset_validateFieldsBasedOnWorkOrderType(String workOrderType) {
               waitForLoaderToDisappear();
            waitForSeconds();

            if (workOrderType.equalsIgnoreCase("RM")) {

                System.out.println("RM selected. Filling RM fields...");

                MasterAssetselectTriggerServiceGroupRandom();
                waitForLoaderToDisappear();
                waitForSeconds();

                MasterAssetselectTriggerFaultCategoryRandom();
                waitForLoaderToDisappear();
                waitForSeconds();

                MasterAssetselectTriggerFaultCodeRandom();
                waitForLoaderToDisappear();
                waitForSeconds();

                MasterAssetselectTriggerPriorityRandom();
                waitForLoaderToDisappear();
                waitForSeconds();

                // WO Generation Waiting (RM only)
                int waitTime = new Random().nextInt(10) + 1;

                utils.typeText(
                        MASTER_ASSET_SUBCATEGORY_TRIGGER_WO_GEN_WAIT_TIME,
                        String.valueOf(waitTime)
                );

                waitForLoaderToDisappear();
                waitForSeconds();

                String description =
                        "Trigger Description " + System.currentTimeMillis();

                Master_Asset_enterAsset_Trigger_Description(description);

                System.out.println("RM fields completed successfully.");
            }

            else if (workOrderType.equalsIgnoreCase("PM")) {

                System.out.println("PM selected. Filling PM fields...");

                MasterAssetselectTriggerPPMTaskSheetRandom();

                waitForLoaderToDisappear();
                waitForSeconds();

                System.out.println("PM fields completed successfully.");
            }

    }

    public void MasterAssetselectTriggerServiceGroupRandom() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(30));

        Random random = new Random();

        By dropdown =
                By.xpath("//div[contains(@id,'raddrpServiceGrp_DropDown')]");

        By options =
                By.xpath("//div[contains(@id,'raddrpServiceGrp_DropDown')]//li[contains(@class,'rcbItem')]");

        waitForLoaderToDisappear();
        waitForSeconds();

        WebElement input =
                wait.until(ExpectedConditions.elementToBeClickable(
                        MASTER_ASSET_SUBCATEGORY_TRIGGER_SERVICE_GROUP_DROPDOWN));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", input);

        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));

        List<WebElement> allOptions =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(options));

        System.out.println("Service Group Count: " + allOptions.size());

        if (allOptions.isEmpty()) {
            throw new RuntimeException("No Service Group found");
        }

        WebElement option =
                allOptions.get(random.nextInt(allOptions.size()));

        String value = option.getText().trim();

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        option);

        wait.until(ExpectedConditions.elementToBeClickable(option));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);

        waitForLoaderToDisappear();

        System.out.println("Selected Service Group: " + value);
    }

    public void MasterAssetselectTriggerFaultCategoryRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'raddrpFaultCat_DropDown')]");
        // All options
        By options =  By.xpath("//div[contains(@id,'raddrpFaultCat_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable(MASTER_ASSET_SUBCATEGORY_TRIGGER_FAULT_CATEGORY_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count
        int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
        System.out.println("Fault Category count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Fault Category found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpFaultCat_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Fault Category is: " + value);
    }

    public void MasterAssetselectTriggerFaultCodeRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'raddrpFaultCode_DropDown')]");
        // All options
        By options =  By.xpath("//div[contains(@id,'raddrpFaultCode_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable(MASTER_ASSET_SUBCATEGORY_TRIGGER_FAULT_CODE_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count
        int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
        System.out.println("Fault Code count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Fault Code found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpFaultCode_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Fault Code is: " + value);
    }

    public void MasterAssetselectTriggerPriorityRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'radrpPriority_DropDown')]");
        // All options
        By options =  By.xpath("//div[contains(@id,'radrpPriority_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable(MASTER_ASSET_SUBCATEGORY_TRIGGER_PRIORITY_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count
        int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
        System.out.println("Priority count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Priority found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'radrpPriority_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Priority is: " + value);
    }

    public void MasterAssetselectTriggerPPMTaskSheetRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'raddrpPPMTaskSheet_DropDown')]");
        // All options
        By options =  By.xpath("//div[contains(@id,'raddrpPPMTaskSheet_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable(MASTER_ASSET_SUBCATEGORY_TRIGGER_PPM_TASK_SHEET_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count
        int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
        System.out.println("Task Sheets count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Task Sheets found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpPPMTaskSheet_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Task Sheet is: " + value);
    }

    public void waitForSeconds() {
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public void Master_Asset_enterAsset_Trigger_Description(String Trigger_Description) {
        utils.typeText(MASTER_ASSET_SUBCATEGORY_TRIGGER_DESCRIPTION, Trigger_Description);
    }


    public void MasterAssetclickTriggerSavebuttoninSubCategorydetailpage() {
        utils.click(MASTER_ASSET_SUBCATEGORY_TRIGGER_SAVE_BUTTON);
    }

   //    Asset Sub Category - Technical Parameters
    public void MasterAssetclickManageApplicableTradebutton() {
        utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_MANAGE_APPLICABLE_TRADE_BUTTON);
    }

    public void MasterAssetlinkApplicableTradedetail() {
        List<WebElement> rows = driver.findElements(
                By.xpath("//table[contains(@id,'grdtrade_ctl00')]//tr[@class='rgRow' or @class='rgAltRow']")
        );
        System.out.println("Applicable Trades Rows Found: " + rows.size());
        if (rows.size() < 2) {
            throw new RuntimeException("Less than 2 Applicable Trades available.");
        }
        Random random = new Random();
        Set<Integer> indexes = new HashSet<>();
        while (indexes.size() < 2) {
            indexes.add(random.nextInt(rows.size()));
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (Integer index : indexes) {
            WebElement row = rows.get(index);
            try {
                WebElement checkbox = row.findElement(By.tagName("input"));
                js.executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        checkbox
                );
                Thread.sleep(1000);
                utils.jsClick(checkbox);
                String parameterName = row.findElement(By.xpath("./td[2]"))
                        .getAttribute("title");
                System.out.println("Selected Applicable Trades: " + parameterName);
            } catch (Exception e) {
                System.out.println("Skipping row " + index +" because no checkbox was found.");
            }
        }
    }

    public void MasterAssetClickAddbuttoninApplicableTradepopup()
    { utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_APPLICABLE_TRADE_ADD_BUTTON);
    }

    public void userclickApplicableTradesavebutton() {
        utils.click(MASTER_ASSET_SUBCATEGORY_CLICK_APPLICABLE_TRADE_SAVE_BUTTON);
    }

//    Asset Sub Category - Delete

    public void clickAsset_Sub_Category_ToDelete() {
        utils.click(DELETE_FIRST_ASSET_SUB_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // OEM
    public void MasterAssetenterOEM(String OEM_Value) {
        utils.typeText(MASTER_ASSET_OEM, OEM_Value);
        System.out.println("The Entered OEM is : " + OEM_Value);
    }

    public void MasterAssetverifyAddOEM(String OEM_Value) {
        utils.typeText(MASTER_ASSET_SEARCH_OEM, OEM_Value + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdOEM_ctl00__0'] td[title='%s']", OEM_Value));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Added OEM is Verified Successfully");
    }

    public void MasterAssetclickOEMtoEdit() {
        utils.click(MASTER_ASSET_FIRST_OEM_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
            }

    public void MasterAssetupdateOEM(String update_OEM) {
        utils.clearAndType(MASTER_ASSET_OEM, update_OEM);
        System.out.println("The Updated OEM is : " + update_OEM);

    }

    public void MasterAssetverifyUpdateOEM(String update_OEM) {
        utils.typeText(MASTER_ASSET_SEARCH_OEM, update_OEM + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdOEM_ctl00__0'] td[title='%s']", update_OEM));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Updated OEM is Verified Successfully");
    }

    public void MasterAssetclickOEMToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_OEM_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("OEM is Deleted Successfully");
    }

    // Make / Brand

    public void MasterAssetenterMake(String Make_Value) {
        utils.typeText(MASTER_ASSET_MAKE, Make_Value);
        System.out.println("The Entered Make is : " + Make_Value);
    }

    public void MasterAssetselectOEMRandom() {   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
        )).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@class,'rcbItem')]") ));
        int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
        System.out.println("Units Found : " + count);
        int randomIndex = new Random().nextInt(count) + 1;
        By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
        String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                .getText();
        WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Selected OEM is : " + selectedValue);
   }

    public void MasterAssetverifyAddMake(String Make_Value) {
        utils.typeText(MASTER_ASSET_SEARCH_MAKE, Make_Value + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdMake_ctl00__0'] td[title='%s']", Make_Value));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  }
        System.out.println("The Added Make is Verified Successfully");
    }

    public void MasterAssetclickMaketoEdit() {
        utils.click(MASTER_ASSET_FIRST_MAKE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetupdateMake(String update_Make) {
        utils.clearAndType(MASTER_ASSET_MAKE, update_Make);
        System.out.println("The Updated Make is : " + update_Make);
    }

    public void MasterAssetverifyUpdateMake(String update_Make) {
        utils.typeText(MASTER_ASSET_SEARCH_MAKE, update_Make + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdMake_ctl00__0'] td[title='%s']", update_Make));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetclickMakeToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_MAKE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Make is Deleted Successfully");
    }

    // Model
    public void MasterAssetenterModel(String Model_Value) {
        utils.typeText(MASTER_ASSET_MODEL, Model_Value);
        System.out.println("The Entered Model is : " + Model_Value);
    }

    public void MasterAssetModelselectOEM(String oem) {
        utils.selectDropdownByText( MASTER_ASSET_MODEL_OEM_SELECT,  oem );
        System.out.println("OEM selected");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
           }

     public void MasterAssetModelselectMake()
         throws InterruptedException {
         Thread.sleep(5000);
         By categoryDropdown = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_radDrpBrand_Input");
         driver.findElement(categoryDropdown).click();
         Thread.sleep(2000);
         By option =
                 By.xpath("//li[normalize-space()='Jupiter']");
         WebElement element =
                 new WebDriverWait(driver, Duration.ofSeconds(20))
                         .until(ExpectedConditions.visibilityOfElementLocated(option));
         ((JavascriptExecutor) driver)
                 .executeScript("arguments[0].click();", element);
         System.out.println("Asset Category selected.");
         try {
             Thread.sleep(10000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
     }

      public void MasterAssetModelselectAssetMasterCategory(String value) {
        utils.waitForSeconds(5);
        utils.selectDropdownByText(MASTER_ASSET_MODEL_MASTER_CATEGORY_SELECT, value);
        System.out.println("Selected Master Category: " + value);
        utils.waitForSeconds(5);
    }

    public void MasterAssetModelselectAssetCategory()
         throws InterruptedException {
            Thread.sleep(5000);
            By categoryDropdown = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_radDrpCategory_Input");
            driver.findElement(categoryDropdown).click();
            Thread.sleep(2000);
            By option =
                    By.xpath("//li[normalize-space()='ak office electronic items']");
            WebElement element =
                    new WebDriverWait(driver, Duration.ofSeconds(20))
                            .until(ExpectedConditions.visibilityOfElementLocated(option));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", element);
            System.out.println("Asset Category selected.");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
    }

    public void MasterAssetModelselectAssetSubCategory()
            throws InterruptedException {
        Thread.sleep(5000);
        By subcategoryDropdown = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_radDrpSubCate_Input");
        driver.findElement(subcategoryDropdown).click();
        Thread.sleep(2000);
        By option =
                By.xpath("//li[normalize-space()='ak laptop']");
        WebElement element =
                new WebDriverWait(driver, Duration.ofSeconds(20))
                        .until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Asset Sub Category selected.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


    public void MasterAssetverifyAddModel(String Model_Value) {
        utils.typeText(MASTER_ASSET_SEARCH_MODEL, Model_Value + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdModel_ctl00__0'] td[title='%s']", Model_Value));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Added Model Verified Successfully");
    }

    public void MasterAssetclickModeltoEdit() {
        utils.click(MASTER_ASSET_FIRST_MODEL_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void MasterAssetupdateModel(String update_Model) {
        utils.clearAndType(MASTER_ASSET_MODEL, update_Model);
        System.out.println("The Updated Model is : " + update_Model);
    }

    public void MasterAssetverifyUpdateModel(String update_Model) {
        utils.typeText(MASTER_ASSET_SEARCH_MODEL, update_Model + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdModel_ctl00__0'] td[title='%s']", update_Model));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Updated Model Verified Successfully");
    }

    public void MasterAssetclickModelToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_MODEL_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Model Deleted Successfully");
    }

// Derating Factor

    public void MasterAssetenterDeratingFactorCode(String Derating_Factor_Code) {
        utils.typeText(MASTER_ASSET_DERATING_FACTOR_CODE, Derating_Factor_Code);
        System.out.println("The Entered Derating Factor Code is : " + Derating_Factor_Code);
    }

    public void MasterAssetenterDeratingFactorDescription(String Derating_Factor_Description) {
        utils.typeText(MASTER_ASSET_DERATING_FACTOR_DESCRIPTION, Derating_Factor_Description);
        System.out.println("The Entered Derating Factor Description is : " + Derating_Factor_Description);
    }

    public void MasterAssetDeratingFactorActivecheckbox() {
        utils.click(MASTER_ASSET_DERATING_FACTOR_ACTIVE_CHECKBOX);
          }

    public void MasterAssetverifyAddDeratingFactor(String Derating_Factor_Code) {
        utils.typeText(MASTER_ASSET_SEARCH_DERATING_FACTOR_CODE, Derating_Factor_Code + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdDeratingFactors_ctl00__0'] td[title='%s']", Derating_Factor_Code));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Added Derating Factor Verified Successfully");
    }

    public void MasterAssetclickDeratingFactortoEdit() {
        utils.click(MASTER_ASSET_FIRST_DERATING_FACTOR_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterAssetupdateDeratingFactor(String update_Derating_Factor) {
        utils.clearAndType(MASTER_ASSET_DERATING_FACTOR_CODE, update_Derating_Factor);
        System.out.println("The Updated Derating Factor Code is : " + update_Derating_Factor);
    }

    public void MasterAssetverifyUpdateDeratingFactor(String update_Derating_Factor) {
        utils.typeText(MASTER_ASSET_SEARCH_DERATING_FACTOR_CODE, update_Derating_Factor + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdDeratingFactors_ctl00__0'] td[title='%s']", update_Derating_Factor));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Updated Derating Factor Verified Successfully");
    }

    public void MasterAssetclickDeratingFactorToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_DERATING_FACTOR_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Derating Factor Deleted Successfully");
    }

// Reading Unit

public void MasterAssetenterShortCodeReadingUnit(String Short_Code) {
    utils.typeText(MASTER_ASSET_READING_UNIT_SHORT_CODE, Short_Code);
    System.out.println("The Entered Reading Unit Short Code is : " + Short_Code);

}
    public void MasterAsseenterReading_Unit(String Reading_Unit) {
        utils.typeText(MASTER_ASSET_READING_UNIT, Reading_Unit);
        System.out.println("The Entered Reading Unit is : " + Reading_Unit);
    }

    public void MasterAsseselectReadingUnitSymbolRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
        )).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@class,'rcbItem')]") ));
        int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
        System.out.println("Units Found : " + count);
        int randomIndex = new Random().nextInt(count) + 1;
        By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
        String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                .getText();
        WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Selected Reading Unit Symbol : " + selectedValue);
    }


    public void MasterAsseverifyAddReadingUnit(String Reading_Unit) {
        utils.typeText(MASTER_ASSET_SEARCH_READING_UNIT, Reading_Unit + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_ReadingUnit_ctl00__0'] td[title='%s']", Reading_Unit));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Added Reading Unit Verified Successfully");
    }

    public void MasterAsseclickReadingUnittoEdit() {
        utils.click(MASTER_ASSET_FIRST_READING_UNIT_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void MasterAsseUpdateReadingUnit(String update_Reading_Unit) {
        utils.clearAndType(MASTER_ASSET_READING_UNIT, update_Reading_Unit);
        System.out.println("Updated Reading Unit is : " + update_Reading_Unit);

    }

    public void MasterAssetverifyUpdateReadingUnit(String update_Reading_Unit) {
        utils.typeText(MASTER_ASSET_SEARCH_READING_UNIT, update_Reading_Unit + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_ReadingUnit_ctl00__0'] td[title='%s']", update_Reading_Unit));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Updated Reading Unit Verified Successfully");
    }

    public void MasterAssetclickReadingUnitToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_READING_UNIT_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Reading Unit Deleted Successfully");

    }

    // Technical Parameters

    public void MasterAssetenterTechnicalParameters(String Technical_Parameters) {
        utils.typeText(MASTER_ASSET_TECHNICAL_PARAMETER, Technical_Parameters);
        System.out.println("The Entered Technical Parameter is : " + Technical_Parameters);
    }

    public void MasterAssetselectTechnicalParametersReadingUnitRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
        )).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@class,'rcbItem')]") ));
        int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
        System.out.println("Units Found : " + count);
        int randomIndex = new Random().nextInt(count) + 1;
        By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
        String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                .getText();
        WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Selected Reading Unit : " + selectedValue);
    }

    public void MasterAssetselectTechnicalParametersParameterTypeRandom() {
        String[] parameterTypes = {"Text", "Numeric", "Boolean", "LOV", "Date"};
        String selectedType = parameterTypes[new Random().nextInt(parameterTypes.length)];
        utils.click(MASTER_ASSET_TECHNICAL_PARAMETER_PARAMETER_TYPE);
        By option = By.xpath("//li[normalize-space()='" + selectedType + "']");
        utils.click(option);
        System.out.println("Selected Parameter Type : " + selectedType);
        switch (selectedType.toLowerCase()) {
            case "text":
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
                utils.typeText(
                        MASTER_ASSET_TECHNICAL_PARAMETER_MAX_LENGTH,
                        String.valueOf(new Random().nextInt(100) + 1));
                break;
            case "numeric":
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
                utils.typeText(
                        MASTER_ASSET_TECHNICAL_PARAMETER_NO_OF_DECIMALS,
                        String.valueOf(new Random().nextInt(5) + 1));
                break;
            case "lov":
                String lovValue = "LOV_" + System.currentTimeMillis();
                utils.typeText(MASTER_ASSET_TECHNICAL_PARAMETER_LOV_TEXTBOX, lovValue);
                utils.click(MASTER_ASSET_TECHNICAL_PARAMETER_LOV_ADD_BUTTON);
                System.out.println("LOV Value Added : " + lovValue);
                break;
            case "boolean":
            case "date":
                break;
        }
          }

    public void MasterAssetselectTechnicalParametersBoxNameRandom() {
        try {
            Thread.sleep(5000);   // Demo fix
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        String[] boxNames = {
                "Section I",
                "Section II",
                "Section III",
                "Section IV"
        };
        String selectedType = boxNames[new Random().nextInt(boxNames.length)];
        utils.click(MASTER_ASSET_TECHNICAL_PARAMETER_BOX_NAME);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        By option = By.xpath("//li[normalize-space()='" + selectedType + "']");
        utils.click(option);
        System.out.println("Selected Box Name is : " + selectedType);
    }

    public void MasterAssetverifyAddTechnicalParameters(String Technical_Parameter) {
        utils.typeText(MASTER_ASSET_SEARCH_TECHNICAL_PARAMETER, Technical_Parameter + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_TechPara_ctl00__0'] td[title='%s']", Technical_Parameter));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void MasterAssetclickTechnicalParameterstoEdit() {
        utils.click(MASTER_ASSET_FIRST_TECHNICAL_PARAMETER_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void MasterAssetUpdateTechnicalParameters(String update_Technical_Parameters) {
        utils.clearAndType(MASTER_ASSET_TECHNICAL_PARAMETER, update_Technical_Parameters);
        System.out.println("The Updated Technical Parameter is : " + update_Technical_Parameters);
    }

    public void MasterAssetverifyUpdateTechnicalParameters(String update_Technical_Parameters) {
        utils.typeText(MASTER_ASSET_SEARCH_TECHNICAL_PARAMETER, update_Technical_Parameters + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_TechPara_ctl00__0'] td[title='%s']", update_Technical_Parameters));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Updated Technical_Parameter Verified Successfully");
    }

    public void MasterAssetclickTechnicalParametersToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_TECHNICAL_PARAMETER_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Technical Parameter Deleted Successfully");
    }

    // Metering Attributes
    public void MasterAssetenterMeteringAttributes(String Metering_Attributes) {
        utils.typeText(MASTER_ASSET_METERING_ATTRIBUTE, Metering_Attributes);
        System.out.println("The Entered Metering Attribute is : " + Metering_Attributes);
    }

    public void MasterAssetselectMeteringAttributesReadingUnitRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
        )).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@class,'rcbItem')]") ));
        int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
        System.out.println("Units Found : " + count);
        int randomIndex = new Random().nextInt(count) + 1;
        By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
        String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                .getText();
        WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Selected Metering Attribute Reading Unit : " + selectedValue);
    }

  public void MasterAssetverifyAddMeteringAttributes(String Metering_Attributes) {
        utils.typeText(MASTER_ASSET_SEARCH_METERING_ATTRIBUTE, Metering_Attributes + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_MeteringAttribute_ctl00__0'] td[title='%s']", Metering_Attributes));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
      System.out.println("Added Metering Attribute Verified Successfully");
    }

    public void MasterAssetclickMeteringAttributestoEdit() {
        utils.click(MASTER_ASSET_FIRST_METERING_ATTRIBUTE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void MasterAssetUpdateMeteringAttributes(String Update_Metering_Attributes) {
        utils.clearAndType(MASTER_ASSET_METERING_ATTRIBUTE, Update_Metering_Attributes);
        System.out.println("Updated Metering Attribute is : " + Update_Metering_Attributes);
    }

    public void MasterAssetverifyUpdateMeteringAttributes(String Update_Metering_Attributes) {
        utils.typeText(MASTER_ASSET_SEARCH_METERING_ATTRIBUTE, Update_Metering_Attributes + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_MeteringAttribute_ctl00__0'] td[title='%s']", Update_Metering_Attributes));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Metering Attributes Updated Successfully");
    }

    public void MasterAssetclickMetering_AttributesToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_METERING_ATTRIBUTE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Metering Attributes Deleted Successfully");
    }

    // Metering Parameter
    public void MasterAssetenterMeteringParameters(String Metering_Parameter) {
        utils.typeText(MASTER_ASSET_METERING_PARAMETER, Metering_Parameter);
        System.out.println("Entered Metering Parameter : " + Metering_Parameter);
           }

    public void MasterAssetselectMeteringParameterAttributeRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
        )).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@class,'rcbItem')]") ));
        int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
        System.out.println("Units Found : " + count);
        int randomIndex = new Random().nextInt(count) + 1;
        By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
        String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                .getText();
        WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Selected Attribute : " + selectedValue);
    }

    public void MasterAssetselectInputType() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//*[contains(text(),'Loading')]")));
        wait.until(driver -> {
            String value = driver.findElement(MASTER_ASSET_READING_UNIT_TEXTBOX)
                    .getAttribute("value");
            return value != null && !value.trim().isEmpty();
        });
        String[] inputTypes = {"Simple", "Complex"};
        String selectedType = inputTypes[new Random().nextInt(inputTypes.length)];
        utils.click(MASTER_ASSET_INPUT_TYPE_DROPDOWN);
        By option = By.xpath("//li[normalize-space()='" + selectedType + "']");
        wait.until(ExpectedConditions.elementToBeClickable(option));
        driver.findElement(option).click();
        System.out.println("Selected Input Type : " + selectedType);
    }

    public void MasterAssetselectReadingType() {
        String[] readingTypes = {"Constant", "Continuous", "Range"};
        String selectedType = readingTypes[new Random().nextInt(readingTypes.length)];
        utils.click(MASTER_ASSET_METERING_PARAMETER_READING_TYPE);
        By option = By.xpath("//li[normalize-space()='" + selectedType + "']");
        utils.click(option);
        System.out.println("Selected Reading Type : " + selectedType);
    }

    public void MasterAssetverifyAddMeteringParameters(String Metering_Parameter) {
        utils.typeText(MASTER_ASSET_SEARCH_METERING_PARAMETER, Metering_Parameter + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_MeteringPara_ctl00__0'] td[title='%s']", Metering_Parameter));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void MasterAssetclickMeteringParameterstoEdit() {
        utils.click(MASTER_ASSET_FIRST_METERING_PARAMETER_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void MasterAssetUpdateMeteringParameters(String Update_Metering_Parameter) {
        utils.clearAndType(MASTER_ASSET_METERING_PARAMETER, Update_Metering_Parameter);
        System.out.println("Updated Metering Parameter is : " + Update_Metering_Parameter);
    }

    public void MasterAssetverifyUpdateMeteringParameters(String Update_Metering_Parameters) {
        utils.typeText(MASTER_ASSET_SEARCH_METERING_PARAMETER, Update_Metering_Parameters + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grd_MeteringPara_ctl00__0'] td[title='%s']", Update_Metering_Parameters));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Updated Metering Parameter Verified Successfully");
    }

//    Metering Parameter - Delete
    public void MasterAssetclickMeteringParameterToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_METERING_PARAMETER_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Metering Parameter Deleted Successfully");
    }

//    Tools / Equipments
    public void MasterAssetenterEquipmentName(String Equipment_Name) {
        utils.typeText(MASTER_ASSET_EQUIPMENT_NAME, Equipment_Name);
        System.out.println("Entered Tool Name is : " + Equipment_Name);
    }

    public void MasterAssetenterHourlyChargesAED (String Hourly_Charges) {
        utils.typeText(MASTER_ASSET_HOURLY_CHARGES_AED, Hourly_Charges);
        System.out.println("Entered Hourly Charges : " + Hourly_Charges);
    }

    public void MasterAssetselectToolsandEqupimentUnitrandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
        )).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(@class,'rcbItem')]") ));
        int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
        System.out.println("Units Found : " + count);
        int randomIndex = new Random().nextInt(count) + 1;
        By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
        String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                .getText();
        WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
        System.out.println("Selected Unit : " + selectedValue);
    }

      public void MasterAssetverifyAddToolsAndEquipments(String Equipment_Name) {
        utils.typeText(MASTER_ASSET_SEARCH_TOOLS_AND_EQUIPMENT, Equipment_Name + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTools_Equipment_ctl00__0'] td[title='%s']", Equipment_Name));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
          System.out.println("Verified Added Tool Successfully");
      }

    public void MasterAssetclickToolsAndEquipmentstoEdit() {
        utils.click(MASTER_ASSET_FIRST_TOOLS_AND_EQUIPMENT_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void MasterAssetUpdateToolsAndEquipments(String Update_Equipment_Name) {
        utils.clearAndType(MASTER_ASSET_EQUIPMENT_NAME, Update_Equipment_Name);
        System.out.println("The Updated Tool Name is : " + Update_Equipment_Name);
    }

    public void MasterAssetverifyUpdateToolsAndEquipments(String Update_Equipment_Name) {
        utils.typeText(MASTER_ASSET_SEARCH_TOOLS_AND_EQUIPMENT, Update_Equipment_Name + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTools_Equipment_ctl00__0'] td[title='%s']", Update_Equipment_Name));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Verified Updated Tool Successfully");
    }

    public void MasterAssetclickToolsAndEquipmentsToDelete() {
        utils.click(MASTER_ASSET_DELETE_FIRST_TOOLS_AND_EQUIPMENT_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Tool Deleted Successfully");
    }

   //Export To Excel
    public void MasterAssetManagementExporttoExcel() {
        utils.click(MASTER_ASSET_MANAGEMENT_EXPORT_TO_EXCEL_BUTTON);
        System.out.println("Downloaded file successfully");    }
}