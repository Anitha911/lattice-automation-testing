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
import java.util.Random;


public class EssentialServicesMastersPage extends BasePage {
    public EssentialServicesMastersPage(WebDriver driver) {
        super(driver);
    }

    public static final By REGULATORY_BODY = By.id("txtRegulatoryBody");
    public static final By REGULATORY_BODY_DESCRIPTION = By.id("Txt_RadRegDescription");
    public static final By CONNECTIVITY_CATEGORY = By.id("txtConnectionCategory");
    public static final By CONNECTIVITY = By.id("txtConnectivity");
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
    public static final By MASTER_ESSENTIAL_SERVICE_EXPORT_TO_EXCEL_BUTTON = By.id("btnExportToExcel");

    public void MasterClickOnEssentialServicesSectionByTitleName(String sectionName) {
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

    public void MasterClickMasterEssentiaLServicesSaveButton() {
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

//    Essential Service - Regulatory Body
    public void MasterEssentialServiceEnterRegulatoryBody(String RegulatoryBody) {
        utils.typeText(REGULATORY_BODY, RegulatoryBody);
        System.out.println("The Entered Regulatory Body is : " + RegulatoryBody);
    }

    public void MasterEssentialServiceEnterRegulatoryBodyDescription(String RBDescription) {
        utils.typeText(REGULATORY_BODY_DESCRIPTION, RBDescription);
        System.out.println("The Entered Regulatory Body Description is : " + RBDescription);
    }

    public void MasterEssentialServiceVerifyAddRegulatoryBody(String Regulatory_Body) {
        utils.typeText(SEARCH_REGULATORY_BODY, Regulatory_Body + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_RegulatoryBody_Grid_ctl00__0'] td[title='%s']", Regulatory_Body));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Entered Regulatory Body is Verified Successfully");
    }

    public void MasterEssentialServiceClickRegulatoryBodytoEdit() {
        utils.click(FIRST_REGULATORY_BODY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
            }

    public void MasterEssentialServiceUpdateRegulatoryBody(String updateRegulatoryBody) {
        utils.clearAndType(REGULATORY_BODY, updateRegulatoryBody);
        System.out.println("The Updated Regulatory Body is : " + updateRegulatoryBody);
    }

    public void MasterEssentialServiceUpdateRegulatoryBodyDescription(String updateRegulatoryBodyDescription) {
        utils.clearAndType(REGULATORY_BODY_DESCRIPTION, updateRegulatoryBodyDescription);
        System.out.println("The Updated Regulatory Body Description is : " + updateRegulatoryBodyDescription);
    }

    public void MasterEssentialServiceVerifyUpdateRegulatoryBody(String updateRegulatoryBody) {
        utils.typeText(SEARCH_REGULATORY_BODY, updateRegulatoryBody + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_RegulatoryBody_Grid_ctl00__0'] td[title='%s']", updateRegulatoryBody));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Updated Regulatory Body is Verified Successfully");
    }

    public void MasterEssentialServiceClickRegulatoryBodyToDelete() {
        utils.click(DELETE_FIRST_REGULATORY_BODY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Regulatory Body is Deleted Successfully");
    }

//    Essential Service - Connectivity Category
    public void MasterEssentialServiceEnterConnectivityCategory(String ConnectivityCategory) {
        utils.typeText(CONNECTIVITY_CATEGORY, ConnectivityCategory);
        System.out.println("The Entered Connectivity Category is : " + ConnectivityCategory);
    }

    public void MasterEssentialServiceVerifyAddConnectivityCategory(String ConnectivityCategory) {
        utils.typeText(SEARCH_CONNECTIVITY_CATEGORY, ConnectivityCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ConectivityCategory_Grid_ctl00__0'] td[title='%s']", ConnectivityCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Entered Connectivity Category is Verified Successfully");
    }

    public void MasterEssentialServiceClickConnectivityCategorytoEdit() {
        utils.click(FIRST_CONNECTIVITY_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
                    }
    }

    public void MasterEssentialServiceUpdateConnectivityCategory(String UpdateConnectivityCategory) {
        utils.clearAndType(CONNECTIVITY_CATEGORY, UpdateConnectivityCategory);
        System.out.println("The Updated Connectivity Category is : " + UpdateConnectivityCategory);
    }

    public void MasterEssentialServiceVerifyUpdateConnectivityCategory(String UpdateConnectivityCategory){
    utils.typeText(SEARCH_CONNECTIVITY_CATEGORY, UpdateConnectivityCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ConectivityCategory_Grid_ctl00__0'] td[title='%s']", UpdateConnectivityCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Updated Connectivity Category is Verified Successfully");
    }

    public void MasterEssentialServiceClickConnectivityCategoryToDelete() {
        utils.click(DELETE_FIRST_CONNECTIVITY_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Connectivity Category is Deleted Successfully");
    }

    //    Essential Service - Connectivity
    public void MasterEssentialServiceSelectConnectivityCategoryRandom() {
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
        System.out.println("Selected Connectivity Category is : " + selectedValue);
    }

    public void MasterEssentialServiceEnterConnectivity(String Connectivityname) {
        utils.typeText(CONNECTIVITY, Connectivityname);
        System.out.println("The Entered Connectivity is : " + Connectivityname);
    }

    public void MasterEssentialServiceVerifyAddConnectivity(String Connectivityname) {
        utils.typeText(SEARCH_CONNECTIVITY, Connectivityname + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_Connectivity_Grid_ctl00__0'] td[title='%s']", Connectivityname));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Entered Connectivity is Verified Successfully");
    }

    public void MasterEssentialServiceClickConnectivitytoEdit() {
        utils.click(FIRST_CONNECTIVITY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterEssentialServiceUpdateConnectivity(String UpdateConnectivity) {
        utils.clearAndType(CONNECTIVITY, UpdateConnectivity);
        System.out.println("The Updated Connectivity is : " + UpdateConnectivity);
    }

    public void MasterEssentialServiceVerifyUpdateConnectivity(String UpdateConnectivityname){

        utils.typeText(SEARCH_CONNECTIVITY, UpdateConnectivityname + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_Connectivity_Grid_ctl00__0'] td[title='%s']", UpdateConnectivityname));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Updated Connectivity is Verified Successfully");
    }

    public void MasterEssentialServiceClickConnectivityToDelete() {
        utils.click(DELETE_FIRST_CONNECTIVITY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Connectivity is Deleted Successfully");
    }

    //    Building Category - Add , Update And Delete
    public void MasterEssentialServiceEnterBuildingCategory(String BuildingCategory) {
        utils.typeText(BUILDING_CATEGORY, BuildingCategory);
        System.out.println("The Entered Building Category is : " + BuildingCategory);
    }

    public void MasterEssentialServiceVerifyAddBuildingCategory(String BuildingCategory) {
        utils.typeText(SEARCH_BUILDING_CATEGORY, BuildingCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_BulidingCategory_Grid_ctl00__0'] td[title='%s']", BuildingCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Entered Building Category is Verified Successfully");
    }

    public void MasterEssentialServiceClickBuildingCategorytoEdit() {
        utils.click(FIRST_BUILDING_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterEssentialServiceUpdateBuildingCategory(String updateBuildingCategory) {
        utils.clearAndType(BUILDING_CATEGORY, updateBuildingCategory);
        System.out.println("The Updated Building Category is : " + updateBuildingCategory);
    }

    public void MasterEssentialServiceVerifyUpdateBuildingCategory(String updateBuildingCategory){
        utils.typeText(SEARCH_BUILDING_CATEGORY, updateBuildingCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_BulidingCategory_Grid_ctl00__0'] td[title='%s']", updateBuildingCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Updated Building Category is Verified Successfully");
    }

    public void MasterEssentialServiceClickBuildingCategoryToDelete() {
        utils.click(DELETE_FIRST_BUILDING_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Building Category is Deleted Successfully");
    }

    //  Structure Type - Add , Update And Delete
    public void MasterEssentialServiceEnterStructureType(String StructureType) {
        utils.typeText(STRUCTURE_TYPE, StructureType);
        System.out.println("The Entered Structure Type is : " + StructureType);
    }

    public void MasterEssentialServiceVerifyAddStructureType(String StructureType) {
        utils.typeText(SEARCH_STRUCTURE_TYPE, StructureType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_StructureType_Grid_ctl00__0'] td[title='%s']", StructureType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Entered Structure Type is Verified Successfully");
    }

    public void MasterEssentialServiceClickStructureTypetoEdit() {
        utils.click(FIRST_STRUCTURE_TYPE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterEssentialServiceUpdateStructureType(String updateStructureType) {
        utils.clearAndType(STRUCTURE_TYPE, updateStructureType);
        System.out.println("The Updated Structure Type is : " + updateStructureType);
    }

    public void MasterEssentialServiceVerifyUpdateStructureType(String updateStructureType){
        utils.typeText(SEARCH_STRUCTURE_TYPE, updateStructureType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_StructureType_Grid_ctl00__0'] td[title='%s']", updateStructureType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Updated Structure Type is Verified Successfully");
    }

    public void MasterEssentialServiceClickStructureTypeToDelete() {
        utils.click(DELETE_FIRST_STRUCTURE_TYPE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Structure Type is Deleted Successfully");
    }

    //   Building Type - Add , Update And Delete
    public void MasterEssentialServiceEnterBuildingType(String BuildingType) {
        utils.typeText(BUILDING_TYPE, BuildingType);
        System.out.println("The Entered Building Type is : " + BuildingType);
    }

    public void MasterEssentialServiceVerifyAddBuildingType(String BuildingType) {
        utils.typeText(SEARCH_BUILDING_TYPE, BuildingType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_BuildingType_Grid_ctl00__0'] td[title='%s']", BuildingType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Entered Building Type is Verified Successfully");
    }

    public void MasterEssentialServiceClickBuildingTypetoEdit() {
        utils.click(FIRST_BUILDING_TYPE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterEssentialServiceUpdateBuildingType(String updateBuildingType) {
        utils.clearAndType(BUILDING_TYPE, updateBuildingType);
        System.out.println("The Updated Building Type is : " + updateBuildingType);
    }

    public void MasterEssentialServiceVerifyUpdateBuildingType(String updateBuildingType){
        utils.typeText(SEARCH_BUILDING_TYPE, updateBuildingType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_BuildingType_Grid_ctl00__0'] td[title='%s']", updateBuildingType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Updated Building Type is Verified Successfully");
    }

    public void MasterEssentialServiceClickBuildingTypeToDelete() {
        utils.click(DELETE_FIRST_BUILDING_TYPE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Building Type is Deleted Successfully");
    }

    //  SP Classification  - Add , Update And Delete
    public void MasterEssentialServiceEnterSPClassification(String SPClassification) {
        utils.typeText(SP_CLASSIFICATION, SPClassification);
        System.out.println("The Entered SP Classification is : " + SPClassification);
    }

    public void MasterEssentialServiceSelectAllBuildingCategory() {
        try {
            utils.isElementVisible(CHECK_ALL_BUILDING_CATEGORY);
            utils.click(CHECK_ALL_BUILDING_CATEGORY);
            System.out.println("Selected Check ALL Building Category");
        } catch (Exception e) {
            System.out.println("Failed to select Check ALL Building Category");
            throw e;
        }
    }

    public void MasterEssentialServiceVerifyAddSPClassification(String SPClassification) {
        utils.typeText(SEARCH_SP_CLASSIFICATION, SPClassification + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_SPClassification_Grid_ctl00__0'] td[title='%s']", SPClassification));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("The Entered SP Classification is Verified Successfully");
        }
    }

    public void MasterEssentialServiceClickSPClassificationtoEdit() {
        utils.click(FIRST_SP_CLASSIFICATION_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
     }

    public void MasterEssentialServiceUpdateSPClassification(String updateSPClassification) {
        utils.clearAndType(SP_CLASSIFICATION, updateSPClassification);
        System.out.println("The Updated SP Classification is : " + updateSPClassification);
    }

    public void MasterEssentialServiceVerifyUpdateSPClassification(String updateSPClassification){
        utils.typeText(SEARCH_SP_CLASSIFICATION, updateSPClassification + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_SPClassification_Grid_ctl00__0'] td[title='%s']", updateSPClassification));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Updated SP Classification is Verified Successfully");
    }

    public void MasterEssentialServiceClickSPClassificationToDelete() {
        utils.click(DELETE_FIRST_SP_CLASSIFICATION_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The SP Classification is Deleted Successfully");
    }

//   Violation Type - Add , Update And Delete
    public void MasterEssentialServiceEnterViolationType(String ViolationType) {
        utils.typeText(VIOLATION_TYPE, ViolationType);
        System.out.println("The Entered Violation Type is : " + ViolationType);
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

    public void MasterEssentialServiceVerifyAddViolationType(String ViolationType) {
        utils.typeText(SEARCH_VIOLATION_TYPE, ViolationType + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ViolationType_Grid_ctl00__0'] td[title='%s']", ViolationType));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Entered Violation Type is Verified Successfully");
    }

    public void MasterEssentialServiceClickViolationTypetoEdit() {
        utils.click(FIRST_VIOLATION_TYPE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void MasterEssentialServiceUpdateViolationType(String updateViolation_Type) {
        utils.clearAndType(VIOLATION_TYPE, updateViolation_Type);
        System.out.println("The Updated Violation Type is : " + updateViolation_Type);
    }

    public void MasterEssentialServiceVerifyUpdateViolationType(String updateViolation_Type){
        utils.typeText(SEARCH_VIOLATION_TYPE, updateViolation_Type + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ViolationType_Grid_ctl00__0'] td[title='%s']", updateViolation_Type));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Updated Violation Type is Verified Successfully");
    }

    public void MasterEssentialServiceClickViolationTypeToDelete() {
        utils.click(DELETE_FIRST_VIOLATION_TYPE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Violation Type is Deleted Successfully");
    }

    //Export To Excel - Essential Service
    public void MasterEssentialServiceExporttoExcel() {
        utils.click(MASTER_ESSENTIAL_SERVICE_EXPORT_TO_EXCEL_BUTTON);
        System.out.println("Downloaded file successfully");    }
}

