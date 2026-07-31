package pages;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.*;
import utils.*;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import static pages.AuditManagement.NO_RECORDS_DISPLYED_IN_LIST;
import static utils.JavaScriptExeUtil.jsClick;

public class PropertyManagement extends BasePage {

    public PropertyManagement(WebDriver driver) { super(driver);}
    static TestDataGenerator dataGenerator = new TestDataGenerator();
    @Getter
    public static TestDataModel testDataModel = new TestDataModel();
    static Actionutils action = new Actionutils(driver);
    JavaScriptExeUtil jsutil = new JavaScriptExeUtil(driver);
    private static final Logger LOGGER = Logger.getLogger(AuditManagement.class.getName());

    //ContactType
    public static By CONTACT_TYPE_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContact_C_radtxtContact']");
    public static By SAVE_BUTTON_CONTACT_TYPE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinContact_C_btnContactOk']");
    public static By SEARCH_CONTACT_TYPECODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00_ctl02_ctl02_FilterTextBox_ContactTypeCode']");
    public static By ALL_OPTIONS_IN_CONTACT_TABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr");
    public static By DELETE_FIRST_RECORD_IN_LIST = By.xpath("//tr[1]/td/input[@alt='Delete']");
    public static By PROPERTY_MANAGER_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_radtxtClient']");
    public static By SAVE_BUTTON_PROPERTY_MANAGER = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_btnPropertyOk']");
    public static By SEARCH_PROPERTY_MANAGER_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00_ctl02_ctl02_FilterTextBox_ClientTypeCode']");
    public static By ALL_OPTIONS_IN_PROPERTYMANAGER_TABLE =By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr");
    public static By CONTRACT_TYPE_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_radtxtContractType']");
    public static By CALLOUT_CHECKBOX = By.xpath("//span[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_ChkCallOutApplicable']");
    public static By PAYMENT_CHECKBOX = By.xpath("//span[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_chkPaymentApplicable']");
    public static By VERIFICATION_CHECKBOX = By.xpath("//span[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_chkVerificationApplicable']");
    public static By SAVE_BUTTON_CONTRACT_TYPE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinContractType_C_btnContractTypeOk']");
    public static By SEARCH_CONTRACT_TYPE_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdContractType_ctl00_ctl02_ctl02_FilterTextBox_ContractTypeCode']");
    public static By ALL_OPTIONS_IN_CONTRACTTYPE_TABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContractType_ctl00']/tbody/tr");
    public static By COSTING_TYPE_NAME = By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_RadWinCostingType_C_radtxtCostingType']");
    public static By COSTING_TYPE_CTIVE_CHECKBOX = By.xpath("//button[@id='chkCTActive']");
    public static By SAVE_BUTTON_COSTING_TYPE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinCostingType_C_btnCostingTypeSave']");
    public static By SEARCH_COSTING_TYPE_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdCostingType_ctl00_ctl02_ctl02_FilterTextBox_CostingTypeCode']");
    public static By ALL_OPTIONS_IN_COSTINGTYPE_TABLE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdCostingType_ctl00']/tbody/tr");

    //actions
    public static void enterContactTypeName(){
        String contactTypeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(CONTACT_TYPE_NAME, contactTypeName);
        testDataModel.setContactType(contactTypeName);
    }
    public static void clickSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_CONTACT_TYPE, SAVE_BUTTON_PROPERTY_MANAGER, SAVE_BUTTON_CONTRACT_TYPE, SAVE_BUTTON_COSTING_TYPE};

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
    public static void verifyContactTypeCode() {
        String authValue = testDataModel.getContactTypeCode();
        utils.typeText(SEARCH_CONTACT_TYPECODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContactType(){
        String authValue = testDataModel.getContactType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void getRandomContactTypeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_IN_CONTACT_TABLE);
        utils.waitForVisibility(CONTACT_TYPE_NAME);
    }
    public static void clickOnElementTabSelected(String tabname) {
        try {
            By locator = By.xpath("//a[text()='"+tabname+"']");
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabname);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabname);
            throw e;
        }
    }
    public static void clickPropertyDeleteButton() {
        By[] deleteButtons = {DELETE_FIRST_RECORD_IN_LIST};

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
    public static void clickPropertySaveButtonInlineError() {
        By[] saveButtons = {SAVE_BUTTON_CONTACT_TYPE, SAVE_BUTTON_PROPERTY_MANAGER, SAVE_BUTTON_CONTRACT_TYPE, SAVE_BUTTON_COSTING_TYPE};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public static void verifyNoPropertyRecordPresent() {
        utils.waitForVisibility(NO_RECORDS_DISPLYED_IN_LIST);
        Assert.assertTrue(utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST));
    }
    public static void enterPropertyManagerName(){
        String propertyManagerName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(PROPERTY_MANAGER_NAME, propertyManagerName);
        testDataModel.setPropertyManager(propertyManagerName);
    }
    public static void verifyPropertyManagerCode() throws InterruptedException {
        String authValue = testDataModel.getPropertyManagerCode();
        utils.typeText(SEARCH_PROPERTY_MANAGER_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyPropertyManager(){
        String authValue = testDataModel.getPropertyManager();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void getRandomPropertyManagerRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_IN_PROPERTYMANAGER_TABLE);
        utils.waitForVisibility(PROPERTY_MANAGER_NAME);
    }
    public static void enterContractTypeName(){
        String contractTypeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(CONTRACT_TYPE_NAME, contractTypeName);
        testDataModel.setContractType(contractTypeName);
    }
    public static void clickApplicableCheckboxes(){
        utils.click(CALLOUT_CHECKBOX);
        utils.click(PAYMENT_CHECKBOX);
        utils.click(VERIFICATION_CHECKBOX);
    }
    public static void verifyContractTypeCode() throws InterruptedException {
        String authValue = testDataModel.getContractTypeCode();
        utils.typeText(SEARCH_CONTRACT_TYPE_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContractType_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContractType(){
        String authValue = testDataModel.getContractType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContractType_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void getRandomContractTypeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_IN_CONTRACTTYPE_TABLE);
        utils.waitForVisibility(CONTRACT_TYPE_NAME);
    }
    public static void enterCostingTypeName(){
        String costingTypeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(COSTING_TYPE_NAME, costingTypeName);
        testDataModel.setCostingType(costingTypeName);
        utils.click(COSTING_TYPE_CTIVE_CHECKBOX);
    }
    public static void verifyCostingTypeCode() throws InterruptedException {
        String authValue = testDataModel.getCostingTypeCode();
        utils.typeText(SEARCH_COSTING_TYPE_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdCostingType_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyCostingType(){
        String authValue = testDataModel.getCostingType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdCostingType_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyCheckboxiischecked(){
        By activecheckboxValue = By.xpath("//tr[contains(@id,'ctl00_ContentPlaceHolder1_grdCostingType_ctl00')]/td/span/input[@checked='checked']");
        utils.waitForVisibility(activecheckboxValue);
        Assert.assertTrue(utils.isElementVisible(activecheckboxValue));
    }
    public static void getRandomCostingTypeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_IN_COSTINGTYPE_TABLE);
        utils.waitForVisibility(COSTING_TYPE_NAME);
    }
    public static void verifyCheckboxiisnotchecked(){
        By checkboxValue = By.xpath("//tr[contains(@id,'ctl00_ContentPlaceHolder1_grdCostingType_ctl00__0')]/td/span/input[@disabled='disabled']");
        utils.waitForVisibility(checkboxValue);
        Assert.assertTrue(utils.isElementVisible(checkboxValue));
    }
    public static void randomcheckboxApplicabledocType() {
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//td/input[contains(@id,'chkSelect') and @type='checkbox']"));

        if (checkBoxes.isEmpty()) return;

        int randomIndex = new Random().nextInt(checkBoxes.size());
        WebElement checkbox = checkBoxes.get(randomIndex);
        WebElement row = checkbox.findElement(By.xpath("./ancestor::tr[1]"));

        testDataModel.setDocumentType(row.findElement(By.xpath(".//td[2]")).getText().trim());

    }







}
