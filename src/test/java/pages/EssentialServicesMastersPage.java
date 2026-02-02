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

public class EssentialServicesMastersPage extends BasePage {
    public EssentialServicesMastersPage(WebDriver driver) {
        super(driver);
    }

    public static final By Regulatory_Body = By.id("txtRegulatoryBody");
    public static final By Regulatory_Body_Description = By.id("Txt_RadRegDescription");
    public static final By SAVE_BUTTON_REGULATORY_BODY = By.id("ctl00_ContentPlaceHolder1_Radwin_RegulatoryBody_C_btn_Add_RegBody");
    public static final By SAVE_BUTTON_CONNECTIVITY_CATEGORY = By.id("ctl00_ContentPlaceHolder1_RadWinConnectivityCategory_C_BtnAddConnectivity");
    public static final By SAVE_BUTTON_CONNECTIVITY = By.id("ctl00_ContentPlaceHolder1_RadWinConnectivity_C_btnAddConntivity");
    public static final By SAVE_BUTTON_BUILDING_CATEGORY = By.id("ctl00_ContentPlaceHolder1_RadWinBuildingcategory_C_BtnAddBuildingCategory");
    public static final By SAVE_BUTTON_STRUCTURE_TYPE = By.id("tl00_ContentPlaceHolder1_RadWinStructureType_C_BtnAddStructureType");
    public static final By SAVE_BUTTON_BUILDING_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinBuildingType_C_BtnAddBuildingType");
    public static final By SAVE_BUTTON_SP_CLASSIFICATION = By.id("ctl00_ContentPlaceHolder1_RadWinSPClassifications_C_BtnAddSpClassification");
    public static final By SAVE_BUTTON_VIOLATION_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_btnAddViolationType");
    public static final By SEARCH_REGULATORY_BODY = By.cssSelector("[alt='Filter RegulatoryName column']");
    public static final By FIRST_REGULATORY_BODY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_RegulatoryBody_Grid_ctl00__0");
    public static final By DELETE_FIRST_REGULATORY_BODY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_RegulatoryBody_Grid_ctl00_ctl04_ImageButton1");

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
                    Thread.currentThread().interrupt(); // best practice
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
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickRegulatory_BodytoEdit() {
        utils.click(FIRST_REGULATORY_BODY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
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
            Thread.currentThread().interrupt(); // best practice
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
            Thread.currentThread().interrupt(); // best practice
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
            locator = By.xpath("//a[contains(@href,'ManageIncidentMaster.aspx') and contains(@href,'SubMenuItemsId=" + subMenuId + "')]");
        } else {
            locator = By.xpath("//a[contains(normalize-space(.),'" + sectionName + "')]");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", el);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);

        System.out.println("Clicked menu: " + sectionName);
    }
}
