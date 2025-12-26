package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.ExcelUtils;
import utils.TestDataGenerator;

import java.io.IOException;
import java.util.UUID;

public class TrainingManagementMastersPage extends BasePage {
    public TrainingManagementMastersPage(WebDriver driver) {
        super(driver);
    }

    public static final By CLICK_HAMBURGER_ICON = By.xpath("//div[@class='toggle-sidebar']");
    public static final By COMPANY_TYPE = By.id("radtxtCompanyName");
    public static final By SEARCH_COMPANYTYPE = By.cssSelector("[alt='Filter CompanyType column']");
    public static final By FIRST_COMPANY_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdCompanyType_ctl00__0");
    public static final By DELETE_FIRST_COMPANY_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdCompanyType_ctl00_ctl04_imgDelete");
    public static final By SEARCH_DELETEDRECORD = By.cssSelector("[alt='Filter CompanyType column']");
    public static final By UPDATE_BUTTON = By.xpath("//span[text()='UPDATE']");


    public void clickHamburgerIcon() {
        By[] hamburgerIcon = {CLICK_HAMBURGER_ICON};

        for (By icon : hamburgerIcon) {
            if (utils.isElementVisible(icon)) {
                utils.click(icon);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void clickOnTabByTitle(String tabTitle) {
        try {
            By locator = By.xpath(String.format("//div[@id='tab-datasetup']//a[text()='%s']", tabTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabTitle);
            throw e;
        }
    }
    public void enterCompanyType(String levelName) {
        utils.typeText(COMPANY_TYPE, levelName);
    }
    public void verifyCompanyType(String expectedTitle) {
        utils.typeText(SEARCH_COMPANYTYPE,expectedTitle + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdCompanyType_ctl00__0'] td[title='%s']", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickCompanyTypetoEdit() {
        utils.click(FIRST_COMPANY_TYPE_IN_LIST);
    }
    public void clickCompanyTypetoDelete() {
        utils.click(DELETE_FIRST_COMPANY_TYPE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyRecordDeleted(String expectedTitle) {
        utils.typeText(SEARCH_DELETEDRECORD,expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }

    public void clickUpdateButton() {
        utils.click(UPDATE_BUTTON);

    }

//    public void DuplicateCompanyType(String levelName) {
//        utils.typeText(COMPANY_TYPE, levelName);
//    }

    }

