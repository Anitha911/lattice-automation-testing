package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;
import utils.ElementUtils;

public class LatticePage {
    private final WebDriver driver;
    private final ElementUtils utils;

    // Constructor
    public LatticePage(WebDriver driver) {
        this.driver = driver;
        this.utils = new ElementUtils(driver);
    }


    public static final By USERNAME_INPUT = By.id("LoginUser_UserName");
    public static final By PASSWORD_INPUT = By.id("LoginUser_Password");
    public static final By LOGIN_BUTTON = By.id("LoginUser_LoginButton");
    public static final By HOME_TAB = By.id("tab-home");
    public static final By COMPANY_NAME_INPUT = By.id("radtxtCompanyName");
    public static final By CONTACT_NUM_INPUT = By.id("radtxtContactNum");
    public static final By CONTACT_NAME_INPUT = By.id("txtContactName");
    public static final By DESIGNATION_INPUT = By.id("txtDesignation");
    public static final By EMAIL_INPUT = By.id("RadtxtEmail");
    public static final By ADDRESS_INPUT = By.id("radtxtAddress");
    public static final By COMPANY_TYPE_OPTS = By.xpath("//li[@class='rcbItem' and contains(text(), 'Corporate')]");
    public static final By COMPANY_TYPE_DD = By.cssSelector("[value='Select company type']");
    public static final By SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingCom_C_btnTrainingComOk");

    public void loginReflexionCafm(String un, String pw) throws InterruptedException {
        utils.enterText(USERNAME_INPUT, ConfigReader.getProperty(un));
        utils.enterText(PASSWORD_INPUT, ConfigReader.getProperty(pw));
        utils.clickElement(LOGIN_BUTTON);
        utils.assertCurrentUrl("https://demo-core.reflexioncafm.com:6443/Pages/Landing.aspx?MenuItemsId=1");
        utils.assertPageTitle("Reflexion CAFM Suite - Home - Main Menu - Navigator");
    }

    public void clickOnTabByTitle(String tabTitle) {
        try {
            By locator = By.xpath(String.format("//div[@id='tab-hse-activities']//a[text()='%s']", tabTitle));
            utils.clickElement(locator);
            System.out.println("Clicked on the tab: " + tabTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabTitle);
            throw e;
        }
    }

    public void selectCompanyType(String companyTitle) {
        try {
            utils.clickElement(COMPANY_TYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", companyTitle));
            utils.clickElement(locator);
            System.out.println("Clicked on the tab: " + companyTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + companyTitle);
            throw e;
        }
    }



    public void clickOnButton(String buttonTitle) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", buttonTitle));
            utils.clickElement(locator);
            System.out.println("Clicked on the tab: " + buttonTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + buttonTitle);
            throw e;
        }
    }

    public void enterCompanyName(String name) {
        utils.enterText(COMPANY_NAME_INPUT, name);
    }

    public void enterContactNumber(String number) {
        utils.enterText(CONTACT_NUM_INPUT, number);
    }

    public void enterContactName(String name) {
        utils.enterText(CONTACT_NAME_INPUT, name);
    }

    public void enterDesignation(String designation) {
        utils.enterText(DESIGNATION_INPUT, designation);
    }

    public void enterEmail(String email) {
        utils.enterText(EMAIL_INPUT, email);
    }

    public void enterAddress(String address) {
        utils.enterText(ADDRESS_INPUT, address);
    }

    public void clickSaveButton() {
        utils.clickElement(SAVE_BUTTON);
    }
}
