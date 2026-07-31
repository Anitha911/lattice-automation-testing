package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;




public class EssentialServicesMastersPage extends BasePage {
    public EssentialServicesMastersPage(WebDriver driver) {
        super(driver);
    }

    public static final By Regulatory_Body = By.id("txtRegulatoryBody");
    public static final By Regulatory_Body_Description = By.id("Txt_RadRegDescription");
    public static final By CONNECTIVITY_CATEGORY = By.id("txtConnectionCategory");
    public static final By CONNECTIVITY = By.id("txtConnectivity");
    public static final By CONNECTIVITY_CATEGORY_SELECT = By.cssSelector("[value='Enter Connectivity Category']");
    public static final By BUILDING_CATEGORY = By.id("txtBuildingCategory");
    public static final By STRUCTURE_TYPE = By.id("txtStructureType");
    public static final By BUILDING_TYPE = By.id("txtxBuldingType");
    public static final By SP_CLASSIFICATION = By.id("txtSpClassification");
    public static final By CHECK_ALL_BUILDING_CATEGORY = By.cssSelector("#listBuildingCategory input.rlbCheckAllItemsCheckBox");
    public static final By VIOLATION_TYPE = By.id("txtViolatinQuestion");
    public static final By SERVICE_GROUP_SELECT = By.cssSelector("[value='Enter Service Group']");
    public static final By FAULT_CATEGORY_SELECT = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_RadCmbFaultCategory_Input");
    public static final By FAULT_CODE_SELECT = By.cssSelector("[value='Enter Fault Code']");
    public static final By PRIORITY_SELECT = By.cssSelector("[value='Enter Priority']");
    public static final By GENERATE_WO_ON_SELECT = By.cssSelector("[value='Enter Generate Wo On']");
    public static final By SAVE_BUTTON_REGULATORY_BODY = By.id("ctl00_ContentPlaceHolder1_Radwin_RegulatoryBody_C_btn_Add_RegBody");
    public static final By SAVE_BUTTON_CONNECTIVITY_CATEGORY = By.id("ctl00_ContentPlaceHolder1_RadWinConnectivityCategory_C_BtnAddConnectivity");
    public static final By SAVE_BUTTON_CONNECTIVITY = By.id("ctl00_ContentPlaceHolder1_RadWinConnectivity_C_btnAddConntivity");
    public static final By SAVE_BUTTON_BUILDING_CATEGORY = By.id("ctl00_ContentPlaceHolder1_RadWinBuildingcategory_C_BtnAddBuildingCategory");
    public static final By SAVE_BUTTON_STRUCTURE_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinStructureType_C_BtnAddStructureType");
    public static final By SAVE_BUTTON_BUILDING_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinBuildingType_C_BtnAddBuildingType");
    public static final By SAVE_BUTTON_SP_CLASSIFICATION = By.id("ctl00_ContentPlaceHolder1_RadWinSPClassifications_C_BtnAddSpClassification");
    public static final By SAVE_BUTTON_VIOLATION_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_btnAddViolationType");
    public static final By SEARCH_REGULATORY_BODY = By.cssSelector("[alt='Filter RegulatoryName column']");
    public static final By SEARCH_CONNECTIVITY_CATEGORY = By.cssSelector("[alt='Filter CategoryName column']");
    public static final By SEARCH_CONNECTIVITY = By.cssSelector("[alt='Filter Connectivity column']");
    public static final By SEARCH_BUILDING_CATEGORY = By.cssSelector("[alt='Filter BuildingCategoryName column']");
    public static final By SEARCH_STRUCTURE_TYPE = By.cssSelector("[alt='Filter StructureTypeName column']");
    public static final By SEARCH_BUILDING_TYPE = By.cssSelector("[alt='Filter BuildingType column']");
    public static final By SEARCH_SP_CLASSIFICATION = By.cssSelector("[alt='Filter ServiceProvider column']");
    public static final By SEARCH_VIOLATION_TYPE = By.cssSelector("[alt='Filter ViolationType column']");
    public static final By FIRST_REGULATORY_BODY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_RegulatoryBody_Grid_ctl00__0");
    public static final By FIRST_CONNECTIVITY_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_ConectivityCategory_Grid_ctl00__0");
    public static final By FIRST_CONNECTIVITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_Connectivity_Grid_ctl00__0");
    public static final By FIRST_BUILDING_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_BulidingCategory_Grid_ctl00__0");
    public static final By FIRST_STRUCTURE_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_StructureType_Grid_ctl00__0");
    public static final By FIRST_BUILDING_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_BuildingType_Grid_ctl00__0");
    public static final By FIRST_SP_CLASSIFICATION_IN_LIST = By.id("ctl00_ContentPlaceHolder1_SPClassification_Grid_ctl00__0");
    public static final By FIRST_VIOLATION_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_ViolationType_Grid_ctl00__0");
    public static final By DELETE_FIRST_REGULATORY_BODY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_RegulatoryBody_Grid_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_CONNECTIVITY_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_ConectivityCategory_Grid_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_CONNECTIVITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_Connectivity_Grid_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_BUILDING_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_BulidingCategory_Grid_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_STRUCTURE_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_StructureType_Grid_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_BUILDING_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_BuildingType_Grid_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_SP_CLASSIFICATION_IN_LIST = By.id("ctl00_ContentPlaceHolder1_SPClassification_Grid_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_VIOLATION_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_ViolationType_Grid_ctl00_ctl04_ImageButton2");

    public void clickEssentiaLServicesSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_REGULATORY_BODY, SAVE_BUTTON_CONNECTIVITY_CATEGORY,
                SAVE_BUTTON_CONNECTIVITY, SAVE_BUTTON_BUILDING_CATEGORY, SAVE_BUTTON_STRUCTURE_TYPE, SAVE_BUTTON_BUILDING_TYPE, SAVE_BUTTON_SP_CLASSIFICATION, SAVE_BUTTON_VIOLATION_TYPE};
        for (By button : saveButtons) {
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
        throw new RuntimeException("No save button is present on the page.");
    }

    public void enterRegulatory_Body(String RegulatoryBody) {
        utils.typeText(Regulatory_Body, RegulatoryBody);
    }

    public void enterRegulatory_Body_Description(String RBDescription) {
        utils.typeText(Regulatory_Body_Description, RBDescription);
    }

    public void verifyAddRegulatory_Body(String Regulatory_Body) {
        utils.typeText(SEARCH_REGULATORY_BODY, Regulatory_Body + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_RegulatoryBody_Grid_ctl00__0'] td[title='%s']", Regulatory_Body));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickRegulatory_BodytoEdit() {
        utils.click(FIRST_REGULATORY_BODY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateRegulatory_Body(String updateRegulatoryBody) {
        utils.clearAndType(Regulatory_Body, updateRegulatoryBody);
    }

    public void updateRegulatory_Body_Description(String updateRegulatoryBodyDescription) {
        utils.clearAndType(Regulatory_Body_Description, updateRegulatoryBodyDescription);
    }

    public void verifyUpdateRegulatory_Body(String updateRegulatoryBody) {
        utils.typeText(SEARCH_REGULATORY_BODY, updateRegulatoryBody + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_RegulatoryBody_Grid_ctl00__0'] td[title='%s']", updateRegulatoryBody));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        ;
    }

    public void clickRegulatory_BodyToDelete() {
        utils.click(DELETE_FIRST_REGULATORY_BODY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        ;
    }

    public void clickOnSectionByTitleName(String sectionName) {
        String subMenuId = switch (sectionName.trim()) {
            case "Connectivity Category" -> "174";
            case "Connectivity" -> "175";
            case "Building Category" -> "176";
            case "Structure Type" -> "177";
            case "Building Type" -> "178";
            case "SP Classification" -> "179";
            case "Violation Type" -> "180";
            default -> null;
        };

        By locator;
        if (subMenuId != null) {
            locator = By.xpath("//a[contains(@href,'ManageEssentialServiceMaster.aspx') and contains(@href,'SubMenuItemsId=" + subMenuId + "')]");
        } else {
            locator = By.xpath("//a[contains(normalize-space(.),'" + sectionName + "')]");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", el);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);

        System.out.println("Clicked menu: " + sectionName);
    }

    public void enterConnectivity_Category(String ConnectivityCategory) {
        utils.typeText(CONNECTIVITY_CATEGORY, ConnectivityCategory);
    }

    public void verifyAddConnectivity_Category(String ConnectivityCategory) {
        utils.typeText(SEARCH_CONNECTIVITY_CATEGORY, ConnectivityCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ConectivityCategory_Grid_ctl00__0'] td[title='%s']", ConnectivityCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickConnectivity_CategorytoEdit() {
        utils.click(FIRST_CONNECTIVITY_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateConnectivity_Category(String UpdateConnectivityCategory) {
        utils.clearAndType(CONNECTIVITY_CATEGORY, UpdateConnectivityCategory);
    }

    public void verifyUpdateConnectivity_Category(String UpdateConnectivityCategory){

    utils.typeText(SEARCH_CONNECTIVITY_CATEGORY, UpdateConnectivityCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ConectivityCategory_Grid_ctl00__0'] td[title='%s']", UpdateConnectivityCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void clickConnectivity_CategoryToDelete() {
        utils.click(DELETE_FIRST_CONNECTIVITY_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }    ;
    }

    public void selectConnectivityCategory(String ConnectivityCategory) {
        try {
            utils.click(CONNECTIVITY_CATEGORY_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ConnectivityCategory));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + ConnectivityCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + ConnectivityCategory);
            throw e;
        }
    }

    public void enterConnectivity(String Connectivityname) {
        utils.typeText(CONNECTIVITY, Connectivityname);
    }

    public void verifyAddConnectivity(String Connectivityname) {
        utils.typeText(SEARCH_CONNECTIVITY, Connectivityname + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_Connectivity_Grid_ctl00__0'] td[title='%s']", Connectivityname));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickConnectivitytoEdit() {
        utils.click(FIRST_CONNECTIVITY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateConnectivity(String UpdateConnectivity) {
        utils.clearAndType(CONNECTIVITY, UpdateConnectivity);
    }

    public void verifyUpdateConnectivity(String UpdateConnectivityname){

        utils.typeText(SEARCH_CONNECTIVITY, UpdateConnectivityname + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_Connectivity_Grid_ctl00__0'] td[title='%s']", UpdateConnectivityname));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void clickConnectivityToDelete() {
        utils.click(DELETE_FIRST_CONNECTIVITY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void enterBuilding_Category(String BuildingCategory) {
        utils.typeText(BUILDING_CATEGORY, BuildingCategory);
    }

    public void verifyAddBuilding_Category(String BuildingCategory) {
        utils.typeText(SEARCH_BUILDING_CATEGORY, BuildingCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_BulidingCategory_Grid_ctl00__0'] td[title='%s']", BuildingCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickBuilding_CategorytoEdit() {
        utils.click(FIRST_BUILDING_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateBuilding_Category(String updateBuildingCategory) {
        utils.clearAndType(BUILDING_CATEGORY, updateBuildingCategory);
    }

    public void verifyUpdateBuilding_Category(String updateBuildingCategory){

        utils.typeText(SEARCH_BUILDING_CATEGORY, updateBuildingCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_BulidingCategory_Grid_ctl00__0'] td[title='%s']", updateBuildingCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void clickBuilding_CategoryToDelete() {
        utils.click(DELETE_FIRST_BUILDING_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void enterStructure_Type(String StructureType) {
        utils.typeText(STRUCTURE_TYPE, StructureType);
    }

    public void verifyAddStructure_Type(String StructureType) {
        utils.typeText(SEARCH_STRUCTURE_TYPE, StructureType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_StructureType_Grid_ctl00__0'] td[title='%s']", StructureType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickStructure_TypetoEdit() {
        utils.click(FIRST_STRUCTURE_TYPE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateStructure_Type(String updateStructureType) {
        utils.clearAndType(STRUCTURE_TYPE, updateStructureType);
    }

    public void verifyUpdateStructure_Type(String updateStructureType){

        utils.typeText(SEARCH_STRUCTURE_TYPE, updateStructureType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_StructureType_Grid_ctl00__0'] td[title='%s']", updateStructureType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void clickStructure_TypeToDelete() {
        utils.click(DELETE_FIRST_STRUCTURE_TYPE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }        ;
    }

    public void enterBuilding_Type(String BuildingType) {
        utils.typeText(BUILDING_TYPE, BuildingType);
    }

    public void verifyAddBuilding_Type(String BuildingType) {
        utils.typeText(SEARCH_BUILDING_TYPE, BuildingType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_BuildingType_Grid_ctl00__0'] td[title='%s']", BuildingType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickBuilding_TypetoEdit() {
        utils.click(FIRST_BUILDING_TYPE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateBuilding_Type(String updateBuildingType) {
        utils.clearAndType(BUILDING_TYPE, updateBuildingType);
    }

    public void verifyUpdateBuilding_Type(String updateBuildingType){

        utils.typeText(SEARCH_BUILDING_TYPE, updateBuildingType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_BuildingType_Grid_ctl00__0'] td[title='%s']", updateBuildingType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void clickBuilding_TypeToDelete() {
        utils.click(DELETE_FIRST_BUILDING_TYPE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void enterSP_Classification(String SPClassification) {
        utils.typeText(SP_CLASSIFICATION, SPClassification);
    }

    public void selectAllBuildingCategory() {
        try {
            utils.isElementVisible(CHECK_ALL_BUILDING_CATEGORY);
            utils.click(CHECK_ALL_BUILDING_CATEGORY);
            System.out.println("Selected Check ALL Building Category");
        } catch (Exception e) {
            System.out.println("Failed to select Check ALL Building Category");
            throw e;
        }
    }

    public void verifyAddSP_Classification(String SPClassification) {
        utils.typeText(SEARCH_SP_CLASSIFICATION, SPClassification + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_SPClassification_Grid_ctl00__0'] td[title='%s']", SPClassification));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickSP_ClassificationtoEdit() {
        utils.click(FIRST_SP_CLASSIFICATION_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateSP_Classification(String updateSPClassification) {
        utils.clearAndType(SP_CLASSIFICATION, updateSPClassification);
    }

    public void verifyUpdateSP_Classification(String updateSPClassification){

        utils.typeText(SEARCH_SP_CLASSIFICATION, updateSPClassification + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_SPClassification_Grid_ctl00__0'] td[title='%s']", updateSPClassification));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void clickSP_ClassificationToDelete() {
        utils.click(DELETE_FIRST_SP_CLASSIFICATION_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void enterViolation_Type(String ViolationType) {
        utils.typeText(VIOLATION_TYPE, ViolationType);
    }


    public void selectServiceGroup(String ServiceGroup) {
        try {
            utils.click(SERVICE_GROUP_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ServiceGroup));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + ServiceGroup);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + ServiceGroup);
            throw e;
        }
    }
    public void selectFaultCategory(String FaultCategory) {
        try {
             utils.click(FAULT_CATEGORY_SELECT);
             By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]",FaultCategory));
             utils.click(locator);
                       System.out.println("Selected Fault Category: " + FaultCategory);
        } catch (Exception e) {
            System.out.println("Failed to select Fault Category: " + FaultCategory);
            throw e;
        }
    }
    public void selectFaultCode(String FaultCode) {
        try {
              utils.click(FAULT_CODE_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", FaultCode));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + FaultCode);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + FaultCode);
            throw e;
        }
    }

    public void selectPriority(String Priority) {
        try {
            utils.click(PRIORITY_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Priority));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Priority);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Priority);
            throw e;
        }
    }

    public void selectGenerateWoOn(String GenerateWoOn) {
        try {
            utils.click(GENERATE_WO_ON_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", GenerateWoOn));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + GenerateWoOn);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + GenerateWoOn);
            throw e;
        }
    }


    public void verifyAddViolation_Type(String ViolationType) {
        utils.typeText(SEARCH_VIOLATION_TYPE, ViolationType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ViolationType_Grid_ctl00__0'] td[title='%s']", ViolationType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickViolation_TypetoEdit() {
        utils.click(FIRST_VIOLATION_TYPE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateViolation_Type(String updateViolation_Type) {
        utils.clearAndType(VIOLATION_TYPE, updateViolation_Type);
    }

    public void verifyUpdateViolation_Type(String updateViolation_Type){

        utils.typeText(SEARCH_VIOLATION_TYPE, updateViolation_Type + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ViolationType_Grid_ctl00__0'] td[title='%s']", updateViolation_Type));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }

    public void clickViolation_TypeToDelete() {
        utils.click(DELETE_FIRST_VIOLATION_TYPE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  ;
    }
}
