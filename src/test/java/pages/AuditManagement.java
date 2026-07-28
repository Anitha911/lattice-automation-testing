package pages;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.*;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static utils.JavaScriptExeUtil.jsClick;

public class AuditManagement extends BasePage{

    public AuditManagement(WebDriver driver) { super(driver);}
    static TestDataGenerator dataGenerator = new TestDataGenerator();
    @Getter
    static TestDataModel testDataModel = new TestDataModel();
    Actionutils action = new Actionutils(driver);
    JavaScriptExeUtil jsutil = new JavaScriptExeUtil(driver);
    private static final Logger LOGGER = Logger.getLogger(AuditManagement.class.getName());
//    AuditManagement auditMasterCategory = new AuditManagement(driver);

    //Audit Management Locators
    public static final By SHORT_NAME = By.xpath("//input[@id='radtxtAudCode']");
    public static final By ALL_SHORTNAMES_IN_TABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditMaster_ctl00']/tbody/tr");
    public static final By AUDIT_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWindAuditMaster_C_ddlAuditType_Input");
    public static final By ALL_OPTIONS_AUDIT_TYPE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWindAuditMaster_C_ddlAuditType_DropDown']/div/ul/li");
    public static final By CATEGORY_NAME = By.xpath("//span/input[@id='radtxtAudiMsrName']");
    public static final By ACTIVE_CHECKBOX = By.xpath("//button[@id='chkAudActive1']");
    public static final By SAVE_BUTTON_AUDIT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWindAuditMaster_C_RadButton1']");
    public static final By SEARCHSHORTNAME = By.xpath("//input[contains(@id, 'FilterTextBox_ShortName')]");
    public static final By FIRSTSHORTNAMEINTABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditMaster_ctl00']/tbody/tr[1]/td[1]");
    public static final By UPDATE_BUTTON = By.xpath("//span[text()='UPDATE']");
    public static final By DELETE_FIRST_AUDIT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAuditMaster_ctl00_ctl04_imgDelete");
    public static final By NO_RECORDS_DISPLYED_IN_LIST = By.xpath(("//tr[@class='rgNoRecords']//div[contains(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'no records')]"));

    //Enforcing Authority Locators
    public static final By AUTHORITY_NAME = By.xpath("//input[@id='radtxtAuthCode']");
    public static final By AUTHORITY_DESCRIPTION = By.xpath("//input[@id='radtxtDescr']");
    public static final By SAVE_BUTTON_AUTHORITY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAuthority_C_btnSaveAuth']");
    public static final By SEARCHAUTHORITYNAME = By.xpath("//input[contains(@id, 'FilterTextBox_Authority')]");
    public static final By ALL_AUTHORITYNAMES_IN_TABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuthority_ctl00']/tbody/tr");
    public static final By FIRSTAUTHORITYNAMEINTABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuthority_ctl00']/tbody/tr[1]/td[1]");
    public static final By DELETE_FIRST_AUTHORITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAuthority_ctl00_ctl04_imgDelete");

    //Industry Standard Locators
    public static final By INDUSTRY_STANDARD_CODE = By.xpath("//input[@id='radtxtStdCode']");
    public static final By INDUSTRY_STANDARD_DESCRIPTION = By.xpath("//span/textarea[@id = 'RadtxtIndustryStdDesc']");
    public static final By ENFORCING_AUTHORITY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinIndustryStd_C_radDrpAuthority_Input']");
    public static final By SELECT_FIRST_ENFORCING_AUTHORITY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinIndustryStd_C_radDrpAuthority_DropDown']/div/ul/li[1]");
    public static final By ALL_OPTIONS_ENFORCING_AUTHORITY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinIndustryStd_C_radDrpAuthority_DropDown']/div/ul/li");
    public static final By SME_TYPE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinIndustryStd_C_radRadSubjectExpert_Input']");
    public static final By ALL_OPTIONS_SME_TYPE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinIndustryStd_C_radRadSubjectExpert_DropDown']/div/ul/li");
    public static final By SAVE_BUTTON_INDUSTRYSTANDARDS = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinIndustryStd_C_BtnIndustyStdSave']");
    public static final By SEARCH_INDUSTRYSTANDARD_CODE = By.xpath("//input[@id = 'ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00_ctl02_ctl02_FilterTextBox_iScode']");
    public static final By ALL_OPTIONS_INDUSTRYCODE_IN_TABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00']/tbody/tr");
    public static final By FIRST_INDUSTRY_CODE_INTABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00']/tbody/tr[1]/td[1]");
    public static final By DELETE_FIRST_INDUSTRYSTANDARD_IN_LIST = By.id("ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00_ctl04_imgDelete");

    //Clause
    public static final By INDUSTRY_STANDARDS = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClause_C_radDrpIndustryStd_Input']");
    public static final By ALL_OPTIONS_INDUSTRY_STANDARDS = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClause_C_radDrpIndustryStd_DropDown']/div/ul/li");
    public static final By SELECT_FIRST_INDUSTRY_STANDARD = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClause_C_radDrpIndustryStd_DropDown']/div/ul/li[1]");
    public static final By CLAUSE_NAME = By.xpath("//input[@id='radTxtClause']");
    public static final By CLAUSE_DESCRIPTION = By.xpath("//span/textarea[@id = 'radTxtClauseDes']");
    public static final By SAVE_BUTTON_CLAUSE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinClause_C_BtnClauseSave']");
    public static final By SEARCH_CLAUSE_NAME = By.xpath("//input[@id = 'ctl00_ContentPlaceHolder1_radClause_ctl00_ctl02_ctl02_FilterTextBox_ClauseName']");
    public static final By ALL_OPTIONS_CLAUSE_NAME_IN_TABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radClause_ctl00']/tbody/tr");
    public static final By FIRST_CLAUSE_NAME_INTABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radClause_ctl00']/tbody/tr[1]/td[1]/span");
    public static final By DELETE_FIRST_CLAUSE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_radClause_ctl00_ctl04_imgDelete");

    //Legal & Requirements
    public static final By LENFORCING_AUTHORITY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinLegalReq_C_raddrpAuth_Input']");
    public static final By ALL_OPTIONS_LENFORCING_AUTHORITY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinLegalReq_C_raddrpAuth_DropDown']/div/ul/li");
    public static final By SELECT_FIRST_LENFORCING_AUTHORITY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinLegalReq_C_raddrpAuth_DropDown']/div/ul/li[1]");
    public static final By LREQUIREMENT_NAME = By.xpath("//input[@id='radtxtLegal']");
    public static final By LREQUIREMENT_DESCRIPTION = By.xpath("//input[@id='radtxtLegDesc']");
    public static final By SAVE_BUTTON_LREQUIREMENT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinLegalReq_C_btnLegalSave']");
    public static final By SEARCH_LREQUIREMENT_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdLegalReq_ctl00_ctl02_ctl02_FilterTextBox_LegalName']");
    public static final By ALL_OPTIONS_LREQUIREMENT_NAME_IN_TABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdLegalReq_ctl00']/tbody/tr");
    public static final By FIRST_LREQUIREMENT_NAME_INTABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdLegalReq_ctl00']/tbody/tr/td[2]/span");
    public static final By DELETE_FIRST_LREQUIREMENT_IN_LIST = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdLegalReq_ctl00_ctl04_imgDelete']");

    //Audit Task Frequency
    public static final By AUDIT_FREQUENCY_CODE = By.xpath("//input[@id='radtxtMarkingChar']");
    public static final By AUDIT_FREQUENCY_NAME = By.xpath("//input[@id='radtxtFreqName']");
    public static final By AUDIT_FREQUENCY_PERIOD = By.xpath("//input[@id='txtFreqPeriod']");
    public static final By COLOUR_CODE = By.xpath("//div[@id='radtxtColorCode_label']");
    public static final By ALL_OPTIONS_COLOUR_CODE = By.xpath("//div[@id='radtxtColorCode_palette']//div/ul/li");
    public static final By PRE_TOILERANCE = By.xpath("//input[@id='radtxtTolerance1']");
    public static final By POST_TOLERANCE = By.xpath("//input[@id='radtxtTolerance2']");
    public static final By ASCHEDULE_ELAPSE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditTaskFrequency_C_ddlAuditScheduleElapse_Input']");
    public static final By ALL_OPTIONS_ASCHEDULE_ELAPSE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditTaskFrequency_C_ddlAuditScheduleElapse_DropDown']/div/ul/li");
    public static final By SAVE_BUTTON_AUDIT_FREQUENCY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAuditTaskFrequency_C_btnAuditTaskFrequencySAVE']");
    public static final By SEARCH_AUDIT_FREQUENCY_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00_ctl02_ctl02_FilterTextBox_MarkingCharacter']");
    public static final By ALL_OPTIONS_SEARCH_AUDIT_CODE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00']//tr[contains(@id,'ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00')]/td[1]");
    public static final By DELETE_FIRST_AUDIT_FREQUENCY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00_ctl04_ImageButton1']");



    //Audit Reason
    public static final By AUDIT_REASON_TYPE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditReason_C_ddlAuditReasonType_Input']");
    public static final By ALL_OPTIONS_AUDIT_REASON_TYPE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditReason_C_ddlAuditReasonType_DropDown']/div/ul/li");
    public static final By SELECT_FIRST_AUDIT_REASON_TYPE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditReason_C_ddlAuditReasonType_DropDown']/div/ul/li[1]");
    public static final By AUDIT_REASON = By.xpath("//input[@id='radtxtReason']");
    public static final By SAVE_BUTTON_AUDIT_REASON = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAuditReason_C_btnReasonOk']");
    public static final By SEARCH_AUDIT_REASON = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditReason_ctl00_ctl02_ctl02_FilterTextBox_Reason']");
    public static final By FIRST_AUDIT_REASON_INTABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditReason_ctl00']/tbody/tr/td[2]");
    public static final By DELETE_FIRST_AUDIT_REASON_IN_LIST = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditReason_ctl00_ctl04_ImageButton2']");

    //LOV Group
    public static final By LOV_GROUP = By.xpath("//input[@id='radtxtLOVGroup']");
    public static final By SAVE_BUTTON_LOV_GROUP = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVGroup_C_btnLOVGroupOk']");
    public static final By SEARCH_LOV_GROUP = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVGroup_ctl00_ctl02_ctl02_FilterTextBox_LOVGroup']");
    public static final By FIRST_AUDIT_LOV_GROUP = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVGroup_ctl00']/tbody/tr[1]/td[1]/span");
    public static final By DELETE_BUTTON_LOV_GROUP = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVGroup_ctl00']/tbody/tr[1]/td[5]");

    //LOV Value
    public static final By LOV_GROUP_DROPDOWN_VALUE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rcbLOVGroup_Input']");
    public static final By ALL_OPTIONS_LOV_GROUP_TYPE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rcbLOVGroup_DropDown']/div/ul/li");
    public static final By LOV_VALUE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rtbValue']");
    public static final By LOV_DESCRIPTION = By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rtbDescription']");
    public static final By ANSWER_TYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rcbType_Input']");
    public static final By ALL_ANSWER_TYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rcbType_DropDown']/div/ul/li");
    public static final By RESULT_SCORE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rntbResultScore']");
    public static final By SAVE_BUTTON_LOV_VALUE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_btnLOVValueOk']");
    public static final By SEARCH_LOV_VALUE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00_ctl02_ctl02_FilterTextBox_LOVValue']");
    public static final By SERVICE_GROUP = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_ServiceGroup_Input']");
    public static final By ALL_OPTIONS_SERVICE_GROUP = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_ServiceGroup_DropDown']/div/ul/li");
    public static final By FAULT_CATEGORY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_FaultyCategory_Input']");
    public static final By ALL_OPTIONS_FAULT_CATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_FaultyCategory_DropDown']/div/ul/li");
    public static final By FAULT_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_FaultyCode_Input']");
    public static final By ALL_OPTIONS_FAULT_CODE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_FaultyCode_DropDown']/div/ul/li");
    public static final By PRIORITY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_Priority_Input']");
    public static final By ALL_OPTIONS_PRIORITY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_Priority_DropDown']/div/ul/li");
    public static final By CONTRACT_GROUP = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_RadComboContractgroup_Input']");
    public static final By ALL_OPTIONS_CONTRACT_GROUP = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_RadComboContractgroup_DropDown']/div/ul/li");
    public static final By ALL_OPTIONS_SEARCH_LOV_TYPE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']//tr[contains(@id,'ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00')]/td[2]");
    public static final By DELETE_BUTTON_LOV_VALUE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00_ctl05_ImageButton2']");

    //actions
    public void enterShortName(){
        String shortName = dataGenerator.generateShortName();
        utils.typeText(SHORT_NAME, shortName);
        testDataModel.setShortName(shortName);
    }

    public void getRandomAuditTypeinDropdown() throws InterruptedException {
        action.performClick(utils.waitForVisibility(AUDIT_TYPE));
        utils.waitForVisibility(ALL_OPTIONS_AUDIT_TYPE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDIT_TYPE);
        WebElement inputField = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RadWindAuditMaster_C_ddlAuditType_Input"));
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setAuditType(SelectedValue);

    }
    public void selectAuditType(String auditType) throws InterruptedException {
        action.performClick(utils.waitForVisibility(AUDIT_TYPE));
        utils.typeText(AUDIT_TYPE, auditType);
        String value = "//div[@id='ctl00_ContentPlaceHolder1_RadWindAuditMaster_C_ddlAuditType_DropDown']//li[text()='"+auditType+"']";
        By selValue = By.xpath(value);
        utils.click(selValue);
        testDataModel.setAuditType(auditType);
    }

    public void enterCategoryName(){
        String catName = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(CATEGORY_NAME, catName);
        testDataModel.setCategoryName(catName);
    }

    public  void selectActiveAs(String status){
        boolean isChecked = isActive();
        if(status.equalsIgnoreCase("check")){
            if(!isChecked) utils.click(ACTIVE_CHECKBOX);
        } else {
            if(isChecked) utils.click(ACTIVE_CHECKBOX);
        }
    }


    public boolean isActive(){
        By xpathIsActive = By.xpath("//button//input[contains(@id,'chkAudActive')]");
        String isActive = driver.findElement(xpathIsActive).getAttribute("value");
        if(isActive.contains("\"checked\":true")){
            return true;
        }else if(isActive.contains("\"checked\":false")){
            return false;
        }else {
            throw new RuntimeException( "The Active status is wrong ");
        }
    }

    public void clickSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_AUDIT,SAVE_BUTTON_AUTHORITY, SAVE_BUTTON_INDUSTRYSTANDARDS, SAVE_BUTTON_CLAUSE, SAVE_BUTTON_LREQUIREMENT, SAVE_BUTTON_AUDIT_REASON, SAVE_BUTTON_LOV_GROUP, SAVE_BUTTON_LOV_VALUE, SAVE_BUTTON_AUDIT_FREQUENCY};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                WebElement element = driver.findElement(button);
                jsClick(driver, element);
                utils.waitUntilInvisible(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public static void verifyShortName() throws InterruptedException {
        String value = testDataModel.getShortName();
        utils.typeText(SEARCHSHORTNAME, value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditMaster_ctl00']/tbody/tr/td[1]/span[text()='"+value+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertEquals(utils.getText(FIRSTSHORTNAMEINTABLE), value);
    }


    public void searchAndSelectShort(String Value) throws InterruptedException {
        utils.typeText(SEARCHSHORTNAME, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditMaster_ctl00']/tbody/tr/td[1]/span[text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }

    public void getRandomRecord(){
        HelperUtils.clickRandomElement(ALL_SHORTNAMES_IN_TABLE);
    }


    public void clickUpdateButton() {
        By[] updateButtons = {UPDATE_BUTTON};

        for (By button : updateButtons) {
            if (utils.isElementVisible(button)) {
                WebElement element = driver.findElement(button);
                jsClick(driver, element);
                utils.waitUntilInvisible(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void verifyEditableDetailsInTableAfterSearch() throws InterruptedException {

        String categoryName = testDataModel.getCategoryName();
        String auditType    = testDataModel.getAuditType();
        By categoryNameVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditMaster_ctl00']/tbody/tr/td[2]/span[text()='" + categoryName + "']");
        By auditTypeVal    = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditMaster_ctl00']/tbody/tr/td[3][text()='" + auditType + "']");
        utils.waitForVisibility(auditTypeVal);
        Assert.assertTrue(utils.isElementVisible(categoryNameVal));
        Assert.assertTrue(utils.isElementVisible(auditTypeVal));

    }

    public static void clickDeleteButton() {
        By[] deleteButtons = {DELETE_FIRST_AUDIT_IN_LIST,DELETE_FIRST_AUTHORITY_IN_LIST,DELETE_FIRST_INDUSTRYSTANDARD_IN_LIST,DELETE_FIRST_CLAUSE_IN_LIST,DELETE_FIRST_LREQUIREMENT_IN_LIST,DELETE_FIRST_AUDIT_REASON_IN_LIST, DELETE_FIRST_AUDIT_FREQUENCY, DELETE_BUTTON_LOV_VALUE};

        for (By button : deleteButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                Alert alert = driver.switchTo().alert();
                alert.accept();
                ElementUtils.waitForLoaderToDisappear();
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public static void verifyNoRecordsPresent() {
        String Value = testDataModel.getShortName();
        utils.typeText(SEARCHSHORTNAME, Value + Keys.ENTER);
        utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST);
    }

    public static void clickOnElementTabSelectedElement(String tabname) {
        try {
            By locator = By.xpath("//a[text()='"+tabname+"']");
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabname);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabname);
            throw e;
        }
    }

    public static void enterAuthorityName(){
        String authorityName = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(AUTHORITY_NAME, authorityName);
        testDataModel.setAuthorityName(authorityName);
    }

    public static void enterAuthorityDescription(){
        String authorityDescription = dataGenerator.generateRandomStringwithLength(20);
        utils.typeText(AUTHORITY_DESCRIPTION, authorityDescription);
        testDataModel.setAuthorityDescription(authorityDescription);
    }

    public static void verifyAuthorityName() throws InterruptedException {
        String authValue = testDataModel.getAuthorityName();
        utils.typeText(SEARCHAUTHORITYNAME, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuthority_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyAuthorityDescription() throws InterruptedException {
        String authorityDescrp = testDataModel.getAuthorityDescription();
        By AuthorityDescription = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuthority_ctl00']/tbody/tr/td[2]/span[text()='"+authorityDescrp+"']");
        utils.waitForVisibility(AuthorityDescription);
        Assert.assertTrue(utils.isElementVisible(AuthorityDescription));
    }

    public void searchAndSelectAuthority(String Value) throws InterruptedException {
        utils.typeText(SEARCHAUTHORITYNAME, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuthority_ctl00']/tbody/tr[1]/td[1][text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }
    public void getRandomRecordinAuthority(){

        HelperUtils.clickRandomElement(ALL_AUTHORITYNAMES_IN_TABLE);
    }

    public static void tableHasEditbleAuthorityName() throws InterruptedException {
        String authname = testDataModel.getAuthorityName();
        utils.typeText(SEARCHAUTHORITYNAME, authname + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuthority_ctl00']/tbody/tr/td[1][text()='"+authname+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));

    }

    public void verifyEditableAuthorityDescriptioninTable() throws InterruptedException {
        String authDescValue = testDataModel.getAuthorityDescription();
        By authDesc = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuthority_ctl00']/tbody/tr/td[2][contains(@title, '"+authDescValue+"')]");
        utils.waitForVisibility(authDesc);
        Assert.assertTrue(utils.isElementVisible(authDesc));
    }

    public static void verifyNoAuthorityRecordsPresent() {
        String Value = testDataModel.getAuthorityName();
        utils.typeText(SEARCHAUTHORITYNAME, Value + Keys.ENTER);
        utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST);
    }
    public static void clickSaveButtonInlineError() {
        By[] saveButtons = {SAVE_BUTTON_AUDIT,SAVE_BUTTON_AUTHORITY,SAVE_BUTTON_INDUSTRYSTANDARDS, SAVE_BUTTON_CLAUSE, SAVE_BUTTON_LREQUIREMENT, SAVE_BUTTON_AUDIT_REASON, SAVE_BUTTON_LOV_GROUP, SAVE_BUTTON_LOV_VALUE, SAVE_BUTTON_AUDIT_FREQUENCY};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public static void enterIndustryStandardCode(){
        String standardCode = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(INDUSTRY_STANDARD_CODE, standardCode);
        testDataModel.setIndustryStandardCode(standardCode);
    }

    public static void enterIndustryStandardDescription(){
        String standardDescription = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(INDUSTRY_STANDARD_DESCRIPTION, standardDescription);
        testDataModel.setIndustryStandardDescription(standardDescription);
    }
    public void getRandomEAuthorityinDropdown(){
        utils.waitForVisibility(ENFORCING_AUTHORITY);
        utils.click(ENFORCING_AUTHORITY);
        utils.waitForVisibility(ALL_OPTIONS_ENFORCING_AUTHORITY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_ENFORCING_AUTHORITY);
        WebElement inputField = driver.findElement(ENFORCING_AUTHORITY);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setEnforcingAuthority(SelectedValue);
    }
    public void searchAndSelectEnforcingAuthority(String Value){
        utils.click(ENFORCING_AUTHORITY);
        utils.typeText(ENFORCING_AUTHORITY, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinIndustryStd_C_radDrpAuthority_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setEnforcingAuthority(Value);
    }
    public void getRandomSMETypeinDropdown() {
        action.performClick(utils.waitForVisibility(SME_TYPE));
        utils.waitForVisibility(ALL_OPTIONS_SME_TYPE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_SME_TYPE);
        WebElement inputField = driver.findElement(SME_TYPE);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setSMEType(SelectedValue);
    }
    public void searchAndSelectSMEType(String Value){
        action.performClick(utils.waitForVisibility(SME_TYPE));
        utils.typeText(SME_TYPE, Value);
        String value = "//div[@id='ctl00_ContentPlaceHolder1_RadWinIndustryStd_C_radRadSubjectExpert_DropDown']//li[text()='"+Value+"']";
        By selValue = By.xpath(value);
        utils.click(selValue);
        testDataModel.setSMEType(Value);
    }
    public static void verifyIndustryStandardCode() throws InterruptedException {
        String InduscodeValue = testDataModel.getIndustryStandardCode();
        utils.typeText(SEARCH_INDUSTRYSTANDARD_CODE, InduscodeValue + Keys.ENTER);
        By searchInduscode = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00']/tbody/tr/td[1]/span[text()='"+InduscodeValue+"']");
        utils.waitForVisibility(searchInduscode);
        Assert.assertTrue(utils.isElementVisible(searchInduscode));
    }
    public static void verifyIndusStandardDescription() throws InterruptedException {
        String IndusDescrp = testDataModel.getIndustryStandardDescription();
        By IndusDescription = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00']/tbody/tr/td[2]//span[contains(text(), '"+IndusDescrp+"')]");
        utils.waitForVisibility(IndusDescription);
        Assert.assertTrue(utils.isElementVisible(IndusDescription));
    }
    public static void verifyEnforcingAuthority() throws InterruptedException {
        String EnforcingAuth = testDataModel.getEnforcingAuthority();
        By EnforcingAuthority = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00']/tbody/tr/td[3][text()='"+EnforcingAuth+"']");
        utils.waitForVisibility(EnforcingAuthority);
        Assert.assertTrue(utils.isElementVisible(EnforcingAuthority));
    }
    public static void verifySME() throws InterruptedException {
        String SMEValue = testDataModel.getSMEType();
        By SMEType = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00']/tbody/tr/td[4][text()='"+SMEValue+"']");
        utils.waitForVisibility(SMEType);
        Assert.assertTrue(utils.isElementVisible(SMEType));
    }
    public void searchAndSelectIndustryRecord(String Value) throws InterruptedException {
        utils.typeText(SEARCH_INDUSTRYSTANDARD_CODE, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radIndustryStandard_ctl00']/tbody/tr/td[1]/span[text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }

    public void getIndustryStandardfirstRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_INDUSTRYCODE_IN_TABLE);
    }
    public static void verifyNoIndustryRecordsPresent(){
        String firstIndusCode = testDataModel.getIndustryStandardCode();
        utils.typeText(SEARCH_INDUSTRYSTANDARD_CODE, firstIndusCode + Keys.ENTER);
        utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST);

    }
    public void getRandomIstandardinDropdown() throws InterruptedException {
        utils.waitForVisibility(INDUSTRY_STANDARDS);
        utils.click(INDUSTRY_STANDARDS);
        utils.waitForVisibility(ALL_OPTIONS_INDUSTRY_STANDARDS);
        HelperUtils.clickRandomElement(ALL_OPTIONS_INDUSTRY_STANDARDS);
        WebElement inputField = driver.findElement(INDUSTRY_STANDARDS);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setIndustryStandards(SelectedValue);
    }
    public void searchAndSelectIndustryStandard(String Value){
        utils.click(INDUSTRY_STANDARDS);
        utils.typeText(INDUSTRY_STANDARDS, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinClause_C_radDrpIndustryStd_DropDown']/div/ul/li[1][text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setIndustryStandards(Value);
    }
    public static void enterClauseName(){
        String clauseName = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(CLAUSE_NAME, clauseName);
        testDataModel.setClauseName(clauseName);
    }
    public static void enterClauseDescription(){
        String clauseDescription = dataGenerator.generateRandomStringwithLength(20);
        utils.typeText(CLAUSE_DESCRIPTION, clauseDescription);
        testDataModel.setClauseDescription(clauseDescription);
    }
    public static void verifyClauseName() throws InterruptedException {
        String ClauseNameValue = testDataModel.getClauseName();
        utils.typeText(SEARCH_CLAUSE_NAME, ClauseNameValue + Keys.ENTER);
        By searchClausename = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radClause_ctl00']/tbody/tr/td[1]/span[text()='"+ClauseNameValue+"']");
        utils.waitForVisibility(searchClausename);
        Assert.assertTrue(utils.isElementVisible(searchClausename));
    }
    public static void verifyClauseDescription() throws InterruptedException {
        String ClauseDescrp = testDataModel.getClauseDescription();
        By ClauseDescription = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radClause_ctl00']/tbody/tr/td[2]/span[text()='"+ClauseDescrp+"']");
        utils.waitForVisibility(ClauseDescription);
        Assert.assertTrue(utils.isElementVisible(ClauseDescription));
    }
    public static void verifyIndustryStandards() throws InterruptedException {
        String IndusStand = testDataModel.getIndustryStandards();
        By IndusStandards = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radClause_ctl00']/tbody/tr/td[3][text()='"+IndusStand+"']");
        utils.waitForVisibility(IndusStandards);
        Assert.assertTrue(utils.isElementVisible(IndusStandards));
    }
    public void searchAndSelectClauseName(String Value) throws InterruptedException {
        utils.typeText(SEARCH_CLAUSE_NAME, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radClause_ctl00']/tbody/tr/td[1]/span[text()='"+Value+"']");
        utils.isElementVisible(searchVal);
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }
    public void getClauseNamefirstRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_CLAUSE_NAME_IN_TABLE);
    }
    public static void verifyNoClauseRecordsPresent(){
        String firstCluase = testDataModel.getClauseName();
        utils.typeText(SEARCH_CLAUSE_NAME, firstCluase + Keys.ENTER);
        utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST);
    }
    public void getRandomLEAuthorityDropdown() throws InterruptedException {
        utils.waitForVisibility(LENFORCING_AUTHORITY);
        utils.click(LENFORCING_AUTHORITY);
        utils.waitForVisibility(ALL_OPTIONS_LENFORCING_AUTHORITY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_LENFORCING_AUTHORITY);
        WebElement inputField = driver.findElement(LENFORCING_AUTHORITY);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setLEnforcingAuthority(firstVal);
    }
    public void searchAndSelectLEAuthority(String Value){
        utils.click(LENFORCING_AUTHORITY);
        utils.typeText(LENFORCING_AUTHORITY, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinLegalReq_C_raddrpAuth_DropDown']/div/ul/li[1][text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setLEnforcingAuthority(Value);
    }
    public static void enterLRequirementName(){
        String requirementName = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(LREQUIREMENT_NAME, requirementName);
        testDataModel.setLRequirementName(requirementName);
    }
    public static void enterLRequirementDescription(){
        String requirementDescription = dataGenerator.generateRandomStringwithLength(20);
        utils.typeText(LREQUIREMENT_DESCRIPTION, requirementDescription);
        testDataModel.setLRequirementDescription(requirementDescription);
    }
    public static void verifyLegalRequirementName() throws InterruptedException {
        String LRequirementNameValue = testDataModel.getLRequirementName();
        utils.typeText(SEARCH_LREQUIREMENT_NAME, LRequirementNameValue + Keys.ENTER);
        By LRequirementClausename = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdLegalReq_ctl00']/tbody/tr/td[2]/span[text()='"+LRequirementNameValue+"']");
        utils.waitForVisibility(LRequirementClausename);
        Assert.assertTrue(utils.isElementVisible(LRequirementClausename));
    }
    public static void verifyLegalRequirementDescription() throws InterruptedException {
        String LRequirementDescrp = testDataModel.getLRequirementDescription();
        By LRequirementDescription = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdLegalReq_ctl00']/tbody/tr/td[3]/span[text()='"+LRequirementDescrp+"']");
        utils.waitForVisibility(LRequirementDescription);
        Assert.assertTrue(utils.isElementVisible(LRequirementDescription));
    }
    public static void verifyLegalEnforcingAuthority() throws InterruptedException {
        String LEnforcingAuthorityValue = testDataModel.getLEnforcingAuthority();
        By LEnforcingAuthority = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdLegalReq_ctl00']/tbody/tr/td[1][text()='"+LEnforcingAuthorityValue+"']");
        utils.waitForVisibility(LEnforcingAuthority);
        Assert.assertTrue(utils.isElementVisible(LEnforcingAuthority));
    }
    public void searchAndSelectLRequirementName(String Value) throws InterruptedException {
        utils.typeText(SEARCH_LREQUIREMENT_NAME, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdLegalReq_ctl00']/tbody/tr/td[2]/span[text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }
    public void getLRequirementNamefirstRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_LREQUIREMENT_NAME_IN_TABLE);
    }
    public static void verifyNoLRequirementRecordsPresent(){
        String firstCluase = testDataModel.getLRequirementName();
        utils.typeText(SEARCH_LREQUIREMENT_NAME, firstCluase + Keys.ENTER);
        utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST);
    }
    public static void enterAFrequencyCode(){
        String requirementName = dataGenerator.generateRandomCode(2);
        utils.typeText(AUDIT_FREQUENCY_CODE, requirementName);
        testDataModel.setAFrequencyCode(requirementName);
    }
    public static void enterAFrequencyName(){
        String requirementName = dataGenerator.generateRandomFrequencyName();
        utils.typeText(AUDIT_FREQUENCY_NAME, requirementName);
        testDataModel.setAFrequencyName(requirementName);
    }
    public static void enterAFrequencyPeriod(){
        String requirementName = dataGenerator.generateRandomFourDigit();
        utils.typeText(AUDIT_FREQUENCY_PERIOD, requirementName);
    }
    public static void getRandomColourCode() {
        utils.click(COLOUR_CODE);
        utils.waitForVisibility(ALL_OPTIONS_COLOUR_CODE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_COLOUR_CODE);
    }

    public static void enterPreTolerance(){
        String requirementName = dataGenerator.generateRandomSingledigit();
        utils.typeText(PRE_TOILERANCE, requirementName);
        testDataModel.setPreTolerance(requirementName);
    }
    public static void enterPostTolerance(){
        String requirementName = dataGenerator.generateRandomSingledigit();
        utils.typeText(POST_TOLERANCE, requirementName);
        testDataModel.setPostTolerance(requirementName);
    }
    public void getRandomAScheduleElapseDropdown() throws InterruptedException {
        utils.click(ASCHEDULE_ELAPSE);
        utils.waitForVisibility(ALL_OPTIONS_ASCHEDULE_ELAPSE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_ASCHEDULE_ELAPSE);
        WebElement inputField = driver.findElement(ASCHEDULE_ELAPSE);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setAScheduleElapse(firstVal);
        ElementUtils.waitForLoaderToDisappear();
    }
    public void searchAndSelectAScheduleElapse(String Value){
        utils.click(ASCHEDULE_ELAPSE);
        utils.typeText(ASCHEDULE_ELAPSE, Value);
        String dropdownValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditTaskFrequency_C_ddlAuditScheduleElapse_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownValue);
        utils.click(selValue);
        testDataModel.setAScheduleElapse(Value);
        ElementUtils.waitForLoaderToDisappear();
    }

    public static void verifyAFrequencyCode() throws InterruptedException {
        String AFrequencyCode = testDataModel.getAFrequencyCode();
        utils.typeText(SEARCH_AUDIT_FREQUENCY_CODE, AFrequencyCode + Keys.ENTER);
        By AFrequencyName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00']/tbody/tr/td[1][text()='"+AFrequencyCode+"']");
        utils.waitForVisibility(AFrequencyName);
        Assert.assertTrue(utils.isElementVisible(AFrequencyName));
    }
    public static void verifyAFrequencyName() throws InterruptedException {
        String AFrequencyNameValue = testDataModel.getAFrequencyName();
        By AFrequencyNameS = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00']/tbody/tr/td[2][text()='"+AFrequencyNameValue+"']");
        utils.waitForVisibility(AFrequencyNameS);
        Assert.assertTrue(utils.isElementVisible(AFrequencyNameS));
    }
    public static void VerifyPreTolerance() throws InterruptedException {
        String PreToleranceValue = testDataModel.getPreTolerance();
        By PreToleranceName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00']/tbody/tr/td[3][text()='"+PreToleranceValue+"']");
        utils.waitForVisibility(PreToleranceName);
        Assert.assertTrue(utils.isElementVisible(PreToleranceName));
    }
    public static void VerifyPostTolerance() throws InterruptedException {
        String PostToleranceValue = testDataModel.getPostTolerance();
        By PostToleranceName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00']/tbody/tr/td[4][text()='"+PostToleranceValue+"']");
        utils.waitForVisibility(PostToleranceName);
        Assert.assertTrue(utils.isElementVisible(PostToleranceName));
    }
    public void searchAndSelectAuditFrequencyEdit(String Value) throws InterruptedException {
        utils.typeText(SEARCH_AUDIT_FREQUENCY_CODE, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditTaskFrequency_ctl00']/tbody/tr/td[1][text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }
    public String getAuditFrequencyRandomEdit(){
        List<WebElement> allRecords = utils.getElements(ALL_OPTIONS_SEARCH_AUDIT_CODE);
        int randomIndex = new Random().nextInt(allRecords.size());
        String firstVal = allRecords.get(randomIndex).getText();
        testDataModel.setAFrequencyCode(firstVal);
        return firstVal;
    }
    public static void verifyNoAuditFrequencyRecordsPresent(){
        String firstCluase = testDataModel.getAFrequencyCode();
        utils.typeText(SEARCH_AUDIT_FREQUENCY_CODE, firstCluase + Keys.ENTER);
        utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST);
    }

    public void getRandomAuditReasonDropdown() throws InterruptedException {
        action.performClick(utils.waitForVisibility(AUDIT_REASON_TYPE));
        utils.waitForVisibility(ALL_OPTIONS_AUDIT_REASON_TYPE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDIT_REASON_TYPE);
        WebElement inputField = driver.findElement(AUDIT_REASON_TYPE);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setAuditReasonType(firstVal);
    }
    public void searchAndSelectAuditReason(String Value){
        utils.click(AUDIT_REASON_TYPE);
        utils.typeText(AUDIT_REASON_TYPE, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditReason_C_ddlAuditReasonType_DropDown']/div/ul/li[1][text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setAuditReasonType(Value);
    }
    public static void enterAuditReason(){
        String requirementName = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(AUDIT_REASON, requirementName);
        testDataModel.setAuditReason(requirementName);
    }
    public static void verifyAuditReason() throws InterruptedException {
        String auditReasonValue = testDataModel.getAuditReason();
        utils.typeText(SEARCH_AUDIT_REASON, auditReasonValue + Keys.ENTER);
        By AuditReasonName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditReason_ctl00']/tbody/tr/td[2][text()='"+auditReasonValue+"']");
        utils.waitForVisibility(AuditReasonName);
        Assert.assertTrue(utils.isElementVisible(AuditReasonName));
    }
    public static void verifyAuditReasonType() throws InterruptedException {
        String auditReasonTypeValue = testDataModel.getAuditReasonType();
        By AuditReasonType = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditReason_ctl00']/tbody/tr/td[1][text()='"+auditReasonTypeValue+"']");
        utils.waitForVisibility(AuditReasonType);
        Assert.assertTrue(utils.isElementVisible(AuditReasonType));
    }
    public void searchAndSelectAuditReasonEdit(String Value) throws InterruptedException {
        utils.typeText(SEARCH_AUDIT_REASON, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAuditReason_ctl00']/tbody/tr/td[2][text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }
    public String getAuditReasonfirstRecord(){
        String firstVal = utils.getText(FIRST_AUDIT_REASON_INTABLE);
        testDataModel.setAuditReason(firstVal);
        return firstVal;
    }
    public static void verifyNoAuditReasonRecordsPresent(){
        String firstCluase = testDataModel.getAuditReason();
        utils.typeText(SEARCH_AUDIT_REASON, firstCluase + Keys.ENTER);
        utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST);
    }
    public static void RandomLOVGroup(){
        String requirementName = dataGenerator.generateRandomStringwithLength(4);
        utils.typeText(LOV_GROUP, requirementName);
        testDataModel.setLOVGroup(requirementName);
    }
    public void enterLOVGroup(String Value){
        utils.typeText(LOV_GROUP, Value);
        testDataModel.setLOVGroup(Value);
    }
    public static void verifyLOVGroup() throws InterruptedException {
        String LOVGroupValue = testDataModel.getLOVGroup();
        utils.typeText(SEARCH_LOV_GROUP, LOVGroupValue + Keys.ENTER);
        By LOVGroupName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVGroup_ctl00']/tbody/tr/td/span[text()='"+LOVGroupValue+"']");
        utils.waitForVisibility(LOVGroupName);
        Assert.assertTrue(utils.isElementVisible(LOVGroupName));
    }
    public void searchAndSelectLOVGroupEdit(String Value) throws InterruptedException {
        utils.typeText(SEARCH_LOV_GROUP, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVGroup_ctl00']/tbody/tr/td/span[text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }
    public String getLOVGroupfirstRecord(){
        String firstVal = utils.getText(FIRST_AUDIT_LOV_GROUP);
        testDataModel.setLOVGroupEdit(firstVal);
        return firstVal;
    }
    public void searchAndSelectLOVGroupdelete(String Value) throws InterruptedException {
        utils.typeText(SEARCH_LOV_GROUP, Value + Keys.ENTER);
    }
    public String getLOVGroupfirstRecordtodelete(){
        String firstVal = utils.getText(FIRST_AUDIT_LOV_GROUP);
        testDataModel.setLOVGroupEdit(firstVal);
        return firstVal;
    }
    public static void trytoDeleteButton(){

        utils.click(DELETE_BUTTON_LOV_GROUP);
    }
    public static void verifydeletedLOVGroup() throws InterruptedException {
        String LOVGroupValue = testDataModel.getLOVGroupEdit();
        utils.typeText(SEARCH_LOV_GROUP, LOVGroupValue + Keys.ENTER);
        By LOVGroupName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVGroup_ctl00']/tbody/tr/td/span[text()='"+LOVGroupValue+"']");
        utils.waitForVisibility(LOVGroupName);
        Assert.assertTrue(utils.isElementVisible(LOVGroupName));
    }
    public void getRandomLOVGroupDropdown() throws InterruptedException {
        action.performClick(utils.waitForVisibility(LOV_GROUP_DROPDOWN_VALUE));
        utils.waitForVisibility(ALL_OPTIONS_LOV_GROUP_TYPE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_LOV_GROUP_TYPE);
        WebElement inputField = driver.findElement(LOV_GROUP_DROPDOWN_VALUE);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setLOVGroupValue(firstVal);
    }
    public void searchAndSelectLOVGroup(String Value){
        utils.click(LOV_GROUP_DROPDOWN_VALUE);
        utils.typeText(LOV_GROUP_DROPDOWN_VALUE, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rcbLOVGroup_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setLOVGroupValue(Value);
    }
    public void enterrandomLOVValue() throws InterruptedException {
        String lovValue = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(LOV_VALUE, lovValue);
        testDataModel.setLOVValue(lovValue);
    }
    public void enterLOVValue(String Value){
        utils.typeText(LOV_VALUE, Value);
        testDataModel.setLOVValue(Value);
    }
    public void enterrandomLOVDescription() throws InterruptedException {
        String lovValue = dataGenerator.generateRandomStringwithLength(10);
        utils.typeText(LOV_DESCRIPTION, lovValue);
        testDataModel.setLOVDescription(lovValue);
    }
    public void enterLOVDescription(String Value){
        utils.typeText(LOV_DESCRIPTION, Value);
        testDataModel.setLOVDescription(Value);
    }
    public void getRandomLOVTypeDropdown() throws InterruptedException {
        action.performClick(utils.waitForVisibility(ANSWER_TYPE_DROPDOWN));
        utils.waitForVisibility(ALL_ANSWER_TYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_ANSWER_TYPE_DROPDOWN);
        WebElement inputField = driver.findElement(ANSWER_TYPE_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setLOVTypedropdown(firstVal);
    }
    public void SelectLOVTypeDropdown(String Value) throws InterruptedException {
        utils.click(ANSWER_TYPE_DROPDOWN);
        utils.waitForVisibility(ANSWER_TYPE_DROPDOWN);
        utils.typeText(ANSWER_TYPE_DROPDOWN, Value);
        utils.waitForVisibility(ALL_ANSWER_TYPE_DROPDOWN);
        String dropdownValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rcbType_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownValue);
        utils.click(selValue);
        testDataModel.setLOVTypedropdown(Value);
    }


    public void enterrandomResultScore() throws InterruptedException {
        String lovValue = dataGenerator.generateWeightage();
        utils.typeText(RESULT_SCORE, lovValue);
        testDataModel.setResultScore(lovValue);
    }
    public void enterResultScore(String Value){
        utils.typeText(RESULT_SCORE, Value);
        testDataModel.setResultScore(Value);
    }
    public static void verifyLOVValue() throws InterruptedException {
        String LOVDValue = testDataModel.getLOVValue();
        utils.typeText(SEARCH_LOV_VALUE, LOVDValue + Keys.ENTER);
        By LOVValueName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody/tr[2]/td[2]/span[text()='"+LOVDValue+"']");
        utils.waitForVisibility(LOVValueName);
        Assert.assertTrue(utils.isElementVisible(LOVValueName));
    }
    public static void verifyLOVGroupValue() throws InterruptedException {
        String LOVGroupDValue = testDataModel.getLOVGroupValue();
        By LOVGroupValueName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody/tr[1]/td[2]//div[text()='LOVGroup: "+LOVGroupDValue+"']");
        utils.waitForVisibility(LOVGroupValueName);
        Assert.assertTrue(utils.isElementVisible(LOVGroupValueName));
    }
    public static void verifyLOVDescription() throws InterruptedException {
        String LOVGroupDDescription = testDataModel.getLOVDescription();
        By LOVDescriptionName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody/tr[2]/td[3]/span[text()='"+LOVGroupDDescription+"']");
        utils.waitForVisibility(LOVDescriptionName);
        Assert.assertTrue(utils.isElementVisible(LOVDescriptionName));
    }
    public static void verifyLOVType() throws InterruptedException {
        String LOVTypeValue = testDataModel.getLOVTypedropdown();
        By LOVTypeName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody/tr[2]/td[4]/span[text()='"+LOVTypeValue+"']");
        utils.waitForVisibility(LOVTypeName);
        Assert.assertTrue(utils.isElementVisible(LOVTypeName));
    }
    public static void verifyResultScore() throws InterruptedException {
        String ResultScoreValue = testDataModel.getResultScore();
        By ResultScoreName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody/tr[2]/td[5]/span[text()='"+ResultScoreValue+"']");
        utils.waitForVisibility(ResultScoreName);
        Assert.assertTrue(utils.isElementVisible(ResultScoreName));
    }
    public void getRandomServiceGroupDropdown() throws InterruptedException {
        action.performClick(utils.waitForVisibility(SERVICE_GROUP));
        utils.waitForVisibility(ALL_OPTIONS_SERVICE_GROUP);
        HelperUtils.clickRandomElement(ALL_OPTIONS_SERVICE_GROUP);
        WebElement inputField = driver.findElement(SERVICE_GROUP);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setServiceGroup(firstVal);
    }
    public void searchAndSelectServiceGroup(String Value){
        utils.click(SERVICE_GROUP);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_ServiceGroup_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setServiceGroup(Value);
    }
    public void getFaultCategoryDropdown() throws InterruptedException {
        utils.waitForVisibility(FAULT_CATEGORY);
        utils.click(FAULT_CATEGORY);
        utils.waitForVisibility(ALL_OPTIONS_FAULT_CATEGORY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_FAULT_CATEGORY);
        WebElement inputField = driver.findElement(FAULT_CATEGORY);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setFaultCategory(firstVal);
    }
    public void searchAndSelectFaultCategory(String Value){
        utils.click(FAULT_CATEGORY);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_FaultyCategory_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setFaultCategory(Value);
    }
    public void getRandomFaultCodeDropdown() throws InterruptedException {
        action.performClick(utils.waitForVisibility(FAULT_CODE));
        utils.waitForVisibility(ALL_OPTIONS_FAULT_CODE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_FAULT_CODE);
        WebElement inputField = driver.findElement(FAULT_CODE);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setFaultCode(firstVal);
    }
    public void searchAndSelectFaultCode(String Value){
        utils.click(FAULT_CODE);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_FaultyCode_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setFaultCode(Value);
    }
    public void getRandomPriorityDropdown() throws InterruptedException {
        action.performClick(utils.waitForVisibility(PRIORITY));
        utils.waitForVisibility(ALL_OPTIONS_PRIORITY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_PRIORITY);
        WebElement inputField = driver.findElement(PRIORITY);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setPriority(firstVal);
    }
    public void searchAndSelectPriority(String Value){
        utils.click(PRIORITY);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_Rad_Priority_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setPriority(Value);
    }
    public void getRandomContractGroupDropdown() throws InterruptedException {
        action.performClick(utils.waitForVisibility(CONTRACT_GROUP));
        utils.waitForVisibility(ALL_OPTIONS_CONTRACT_GROUP);
        HelperUtils.clickRandomElement(ALL_OPTIONS_CONTRACT_GROUP);
        WebElement inputField = driver.findElement(CONTRACT_GROUP);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setContractGroup(firstVal);
    }
    public void searchAndSelectContractGroup(String Value){
        utils.click(CONTRACT_GROUP);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_RadComboContractgroup_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setContractGroup(Value);
    }
    public static void verifyLOVFaultCode() throws InterruptedException {
        String ServiceGroupValue = testDataModel.getServiceGroup();
        String FaultCategoryValue = testDataModel.getFaultCategory();
        String FaultCodeValue = testDataModel.getFaultCode();
        By LOVGroupValueName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody/tr[2]/td[6]/span[text()='" + ServiceGroupValue + " / " + FaultCategoryValue + " / " + FaultCodeValue + "']");
        utils.waitForVisibility(LOVGroupValueName);
        Assert.assertTrue(utils.isElementVisible(LOVGroupValueName));
    }
    public static void verifyLOVPriority() throws InterruptedException {
        String LOVGroupDDescription = testDataModel.getPriority();
        By LOVDescriptionName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody/tr[2]/td[7]/span[text()='"+LOVGroupDDescription+"']");
        utils.waitForVisibility(LOVDescriptionName);
        Assert.assertTrue(utils.isElementVisible(LOVDescriptionName));
    }
    public static void verifyLOVContractGroup() throws InterruptedException {
        String LOVTypeValue = testDataModel.getContractGroup();
        By LOVTypeName = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody/tr[2]/td[8]/span[text()='"+LOVTypeValue+"']");
        utils.waitForVisibility(LOVTypeName);
        Assert.assertTrue(utils.isElementVisible(LOVTypeName));
    }

    public void searchAndSelectLOVValueEdit(String Value) throws InterruptedException {
        utils.typeText(SEARCH_LOV_VALUE, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody//span[text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
    }
    public String getLOVValueRandomEdit(){
        List<WebElement> allRecords = utils.getElements(ALL_OPTIONS_SEARCH_LOV_TYPE);
        int randomIndex = new Random().nextInt(allRecords.size());
        String firstVal = allRecords.get(randomIndex).getText();
        testDataModel.setLOVValue(firstVal);
        return firstVal;
    }

    // The below method is for Negative LOVType selection only
    private void populateImmediateActionRandomly() throws InterruptedException {
        getRandomServiceGroupDropdown();
        getFaultCategoryDropdown();
        getRandomFaultCodeDropdown();
        getRandomPriorityDropdown();
        getRandomContractGroupDropdown();
    }


    //The below method is used for Negative LOVType selection only
    private void handleImmediateActionVisibility(String currentValue, String newValue)
            throws InterruptedException {

        boolean wasNegative = "Negative".equalsIgnoreCase(currentValue);
        boolean isNegative  = "Negative".equalsIgnoreCase(newValue);

        if (!wasNegative && isNegative) {
            // Positive/NA/blank → Negative : section should APPEAR
            waitForImmediateActionVisible();

            // Populate IA dropdowns randomly
            populateImmediateActionRandomly();

        } else if (wasNegative && !isNegative) {
            // Negative → Positive/NA : section should DISAPPEAR
            waitForImmediateActionHidden();

            // Clear IA-related values from model
            testDataModel.setServiceGroup("");
            testDataModel.setFaultCategory("");
            testDataModel.setFaultCode("");
            testDataModel.setPriority("");
            testDataModel.setContractGroup("");

        } else if (isNegative) {
            // Negative → Negative (re-select): section already visible
            Assert.assertTrue(
                    "Immediate Action section disappeared unexpectedly on Negative re-select",
                    isImmediateActionSectionVisible()
            );

            // Re-populate IA dropdowns randomly
            populateImmediateActionRandomly();

        } else {
            // Positive ↔ NA or any non-Negative transition: section should stay hidden
            Assert.assertFalse(
                    "Immediate Action section appeared unexpectedly for type: " + newValue,
                    isImmediateActionSectionVisible()
            );
        }
    }

    //This one is helping for Fail LOVType dropdown
    private boolean isImmediateActionSectionVisible() {
        try {
            return driver.findElement(IMMEDIATE_ACTION_SECTION).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private void waitForImmediateActionVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(IMMEDIATE_ACTION_SECTION));
    }

    private void waitForImmediateActionHidden() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.invisibilityOfElementLocated(IMMEDIATE_ACTION_SECTION));
    }

    private static final By IMMEDIATE_ACTION_SECTION =
            By.id("ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_divImmediate");

    public void getRandomLOVTypeEditDropdown() throws InterruptedException {
//        WebElement dropdown = driver.findElement(ANSWER_TYPE_DROPDOWN);
//        String currentValue = dropdown.getAttribute("value");
//        action.performClick(utils.waitForVisibility(ANSWER_TYPE_DROPDOWN));
//        Thread.sleep(5000);
//        utils.waitForVisibility(ALL_ANSWER_TYPE_DROPDOWN);
//        HelperUtils.clickRandomElement(ALL_ANSWER_TYPE_DROPDOWN);
//        WebElement inputField = driver.findElement(ANSWER_TYPE_DROPDOWN);
//        String firstVal = inputField.getAttribute("value");
//        testDataModel.setLOVTypedropdown(firstVal);
//        handleImmediateActionVisibility(currentValue, firstVal);

        // Step 1: Read current selected value
        String currentValue = driver.findElement(ANSWER_TYPE_DROPDOWN).getAttribute("value");
        if (currentValue == null) currentValue = "";

        // Step 2: Pick DIFFERENT type
        // Positive → picks Negative or NA
        // Negative → picks Positive or NA
        // NA       → picks Positive or Negative
        String newValue = getDifferentLOVType(currentValue);
        System.out.println("[INFO] Current: " + currentValue + " → Typing: " + newValue);

        // Step 3: Click dropdown
        action.performClick(utils.waitForVisibility(ANSWER_TYPE_DROPDOWN));
        Thread.sleep(5000);
        utils.waitForVisibility(ALL_ANSWER_TYPE_DROPDOWN);

        // Step 4: Type the new value into textbox — same as your existing logic
        utils.typeText(ANSWER_TYPE_DROPDOWN, newValue);

        // Step 5: Click the matching li option
        String dropdownValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rcbType_DropDown']/div/ul/li[text()='" + newValue + "']";
        By selValue = By.xpath(dropdownValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);

        // Step 6: Save to model
        testDataModel.setLOVTypedropdown(newValue);

        // Step 7: Handle Immediate Action visibility
        handleImmediateActionVisibility(currentValue, newValue);
    }
    private String getDifferentLOVType(String currentValue) {
        List<String> allTypes = Arrays.asList("Positive", "Negative", "NA");
        List<String> otherTypes = allTypes.stream()
                .filter(type -> !type.equalsIgnoreCase(currentValue))
                .collect(Collectors.toList());
        return otherTypes.get(new Random().nextInt(otherTypes.size()));
    }
    public void SelectLOVTypeEditDropdown(String Value) throws InterruptedException {
        WebElement dropdown = driver.findElement(ANSWER_TYPE_DROPDOWN);
        String currentValue = dropdown.getAttribute("value");
        utils.click(ANSWER_TYPE_DROPDOWN);
        utils.waitForVisibility(ANSWER_TYPE_DROPDOWN);  // ← wait for DB load
        utils.typeText(ANSWER_TYPE_DROPDOWN, Value);  // ← type value in textbox
        String dropdownValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rcbType_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownValue);
        utils.click(selValue);
        testDataModel.setLOVTypedropdown(Value);
        handleImmediateActionVisibility(currentValue, Value);
    }

    public void searchAndSelectLOVValueDelete(String Value) throws InterruptedException {
        utils.typeText(SEARCH_LOV_VALUE, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_radgrdAuditQuestionLOVValue_ctl00']/tbody//span[text()='"+Value+"']");
        utils.waitForVisibility(searchVal);
    }
    public String getLOVValueRandomDelete(){
        List<WebElement> allRecords = utils.getElements(ALL_OPTIONS_SEARCH_LOV_TYPE);
        int randomIndex = new Random().nextInt(allRecords.size());
        String firstVal = allRecords.get(randomIndex).getText();
        testDataModel.setLOVValue(firstVal);
        return firstVal;
    }
    public static void verifyNoLOVValueRecordsPresent(){
        String firstCluase = testDataModel.getLOVValue();
        utils.typeText(SEARCH_LOV_VALUE, firstCluase + Keys.ENTER);
        utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST);
    }








}
