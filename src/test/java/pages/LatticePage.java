package pages;

import org.openqa.selenium.*;
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
    public static final By SAVE_BUTTON_COMPANY = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingCom_C_btnTrainingComOk");
    public static final By SAVE_BUTTON_COURSE = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingCour_C_btnTrainingCourOk");
    public static final By SAVE_BUTTON_TRAINING_LEVEL = By.id("ctl00_ContentPlaceHolder1_RadWinTraininglevel_C_btnTrainingLevelOk");
    public static final By FIRST_COMPANY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTrainingCompany_ctl00__0");
    public static final By DELETE_FIRST_COMPANY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTrainingCompany_ctl00_ctl04_imgDelete");
    public static final By SEARCH_COMPANY = By.cssSelector("[alt='Filter CompanyName column']");
    public static final By SEARCH_COURSE = By.cssSelector("[alt='Filter CourseName column']");

    public static final By COURSE_NAME = By.id("radtxtCourseName");
    public static final By COURSE_TOPIC_DETAILS = By.id("radtxtTopicDetails");
    public static final By COURSE_CATEGORY = By.id("radTxtCourseCategory");
    public static final By COURSE_LINK = By.id("RadtxtCourseLink");
    public static final By COURSE_VALIDITY_DAYS = By.id("RadtxtValidityDays");

    public static final By LEVEL_NAME = By.id("radtxtLevelName");
    public static final By WEIGHTAGE = By.id("RadtxtWeightage");


    public void loginReflexionCafm(String un, String pw) throws InterruptedException {
        utils.enterText(USERNAME_INPUT, ConfigReader.getProperty(un));
        utils.enterText(PASSWORD_INPUT, ConfigReader.getProperty(pw));
        utils.clickElement(LOGIN_BUTTON);
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
        By[] saveButtons = {SAVE_BUTTON_COMPANY, SAVE_BUTTON_COURSE, SAVE_BUTTON_TRAINING_LEVEL};

        for (By button : saveButtons) {
            if (utils.isElementPresent(button)) {
                utils.clickElement(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void clickCompanytoEdit() {
        utils.clickElement(FIRST_COMPANY_IN_LIST);
    }

    public void clickCompanytoDelete() {
        utils.clickElement(DELETE_FIRST_COMPANY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyCompanyName(String expectedTitle) {
        utils.enterText(SEARCH_COMPANY,expectedTitle + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTrainingCompany_ctl00__0'] td[title='%s']", expectedTitle));
        utils.isElementPresent(locator);
    }

    public void verifyCourseName(String expectedTitle) {
        utils.enterText(SEARCH_COURSE,expectedTitle + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTrainingCour_ctl00__0'] td[title='%s']", expectedTitle));
        utils.isElementPresent(locator);
    }

    public void verifyCompanyDeleted(String expectedTitle) {
        utils.enterText(SEARCH_COMPANY,expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementPresent(locator);
    }

    public void enterCourseName(String name) {
        utils.enterText(COURSE_NAME, name);
    }

    public void enterCourseTopicDetails(String details) {
        utils.enterText(COURSE_TOPIC_DETAILS, details);
    }

    public void enterCourseCategory(String category) {
        utils.enterText(COURSE_CATEGORY, category);
    }

    public void enterCourseLink(String link) {
        utils.enterText(COURSE_LINK, link);
    }

    public void enterCourseValidityDays(String days) {
        utils.enterText(COURSE_VALIDITY_DAYS, days);
    }

    public void enterLevelName(String levelName) {
        utils.enterText(LEVEL_NAME, levelName);
    }

    public void enterWeightage(String weightage) {
        utils.enterText(WEIGHTAGE, weightage);
    }
}
