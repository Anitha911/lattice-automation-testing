package pages;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.*;

import java.util.logging.Logger;

import static utils.JavaScriptExeUtil.jsClick;

public class PropertyContractManagementTransaction extends BasePage{

    public PropertyContractManagementTransaction(WebDriver driver) { super(driver);}
    static TestDataGenerator dataGenerator = new TestDataGenerator();
    @Getter
    public static TestDataModel testDataModel = new TestDataModel();
    static Actionutils action = new Actionutils(driver);
    JavaScriptExeUtil jsutil = new JavaScriptExeUtil(driver);
    private static final Logger LOGGER = Logger.getLogger(AuditManagement.class.getName());

    public static By CLIENT_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_radtxtCustomerName']");
    public static By CLIENT_EXT_REFERENCE_CODE = By.xpath("//input[@id='radtxtReferenceCode']");
    public static By CLIENT_CLIENTTYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_raddrpClientType_Input']");
    public static By ALL_CLIENT_CLIENTTYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_raddrpClientType_DropDown']/div/ul/li");
    public static By CLIENT_CONTACT_PERSON = By.xpath("//input[@id='radtxtContactPerson']");
    public static By CLIENT_MOBILE_NUMBER = By.xpath("//input[@id='radtxtMobileNumber']");
    public static By CLIENT_EMAIL = By.xpath("//input[@id='radtxtEmail']");
    public static By CLIENT_ADDRESS_LINE = By.xpath("//input[@id='radtxtAddressLine1']");
    public static By CLIENT_COUNTRY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_raddrpCountry_Input']");
    public static By ALL_CLIENT_COUNTRY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_raddrpCountry_DropDown']/div/ul/li");
    public static By CLIENT_CITY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_raddrpCity_Input']");
    public static By ALL_CLIENT_CITY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_raddrpCity_DropDown']/div/ul/li");
    public static By CLIENT_CUSTOMERIMPORTANCE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_raddrpCustomerImportance_Input']");
    public static By ALL_CLIENT_CUSTOMERIMPORTANCE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_raddrpCustomerImportance_DropDown']/div/ul/li");
    public static By SAVE_BUTTON_CLIENT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddClient_btnSave']");
    public static By SEARCH_CLIENT_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00_ctl02_ctl02_FilterTextBox_ClientCode']");
    public static By CONTACT_NAME = By.xpath("//input[@id='radtxtCustomerName']");
    public static By CONTACT_EXT_REFERENCE_CODE = By.xpath("//input[@id='radtxtExt']");
    public static By CONTACT_CONTACTTYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_Input']");
    public static By ALL_CONTACT_CONTACTTYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_DropDown']/div/ul/li");
    public static By CONTACT_EMAIL = By.xpath("//input[@id='radtxtEmail']");
    public static By CONTACT_MOBILE_NUMBER = By.xpath("//input[@id='radtxtMobileNumber']");
    public static By CONTACT_WHATSAPP_NUMBER = By.xpath("//input[@id='radtxtWhatsApp']");
    public static By SAVE_BUTTON_CONTACT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_btnSave']");
    public static By SEARCH_CONTACT_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00_ctl02_ctl02_FilterTextBox_ContactName']");

    public static By MEASUREMENT_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_Input']");
    public static By ALL_MEASUREMENT_CATEGORY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_DropDown']/div/ul/li");
    public static By MEASUREMENT_SUBCATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_Input']");
    public static By ALL_MEASUREMENT_SUBCATEGORY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_DropDown']/div/ul/li");
    public static By PARAMETER_NAME = By.xpath("//input[@id='radtxtCustomerName']");
    public static By PARAMETER_DEFAULT_SEVERITY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_Input']");
    public static By ALL_PARAMETER_DEFAULT_SEVERITY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_DropDown']/div/ul/li");
//    public static By MANUAL_ENTRY_TOGGLE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_AddPMSMeasurementParaWindow_C_RadSwitchAllowManual']");
//    public static By AUTOMATIC_LOGIC_TOGGLE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_AddPMSMeasurementParaWindow_C_swtAllowAuto']");
//    public static By PARAMETER_DESCRIPTION = By.xpath("//textarea[@id='RadTextDescription']");
    public static By PARAMETER_SERVICE_GROUP_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_Input']");
    public static By ALL_PARAMETER_SERVICE_GROUP_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_DropDown']/div/ul/li");
    public static By PARAMETER_FAULT_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_Input']");
    public static By ALL_PARAMETER_FAULT_CATEGORY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_DropDown']/div/ul/li");
    public static By PARAMETER_FAULT_CODE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_Input']");
    public static By ALL_PARAMETER_FAULT_CODE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_DropDown']/div/ul/li");
    public static By PARAMETER_PRIORITY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_Input']");
    public static By ALL_PARAMETER_PRIORITY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinClient_C_AddContact_raddrpClientType_DropDown']/div/ul/li");
    public static By SLA_DURATION_RESPONSE = By.xpath("//input[@id='radtxtEmail']");
    public static By SLA_DURATION_CONTAINMENT = By.xpath("//input[@id='radtxtMobileNumber']");
    public static By SLA_DURATION_RESOLUTION = By.xpath("//input[@id='radtxtWhatsApp']");
    public static By SAVE_BUTTON_PARAMETER = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_AddPMSMeasurementParaWindow_C_btnPMSMeasurementParaSave']");
    public static By SEARCH_PARAMETER_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdPMSMeasurementPara_ctl00_ctl02_ctl02_FilterTextBox_MeasurementParameterCode']");

    //actions

    public static void enterClientName(){
        String clientName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(CLIENT_NAME, clientName);
        testDataModel.setClientName(clientName);
    }
    public static void enterClientExtRefCode() {
        String extrefCode = dataGenerator.generateRandomCode(7);
        utils.typeText(CLIENT_EXT_REFERENCE_CODE, extrefCode);
        testDataModel.setClientExtRefCode(extrefCode);
    }
    public static void getRandomClientClientTypeDropdown(){
        utils.click(CLIENT_CLIENTTYPE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CLIENT_CLIENTTYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CLIENT_CLIENTTYPE_DROPDOWN);
        WebElement inputField = driver.findElement(CLIENT_CLIENTTYPE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setClientClientType(SelectedValue);
    }
    public static void enterClientContactPerson(){
        String contactPerson = dataGenerator.generateRandomStringwithLength(8);
        utils.typeText(CLIENT_CONTACT_PERSON, contactPerson);
        testDataModel.setClientContactPerson(contactPerson);
    }
    public static void enterClientMobileNumber(){
        String clientMobileNumber = dataGenerator.generateRandomNumbericwithLength(9);
        utils.typeText(CLIENT_MOBILE_NUMBER, clientMobileNumber);
        testDataModel.setClientMobileNumber(clientMobileNumber);
    }
    public static void enterClientEmail(){
        String clientEmail = dataGenerator.generateRandomEmail();
        utils.typeText(CLIENT_EMAIL, clientEmail);
        testDataModel.setClientEmail(clientEmail);
    }
    public static void enterClientAddress(){
        String clientAddress = dataGenerator.generateAddress();
        utils.typeText(CLIENT_ADDRESS_LINE, clientAddress);
        testDataModel.setClientAddress(clientAddress);
    }
    public static void getRandomClientCountryDropdown(){
        utils.click(CLIENT_COUNTRY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CLIENT_COUNTRY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CLIENT_COUNTRY_DROPDOWN);
        WebElement inputField = driver.findElement(CLIENT_COUNTRY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setClientCountry(SelectedValue);
    }
    public static void getRandomClientCityDropdown(){
        utils.click(CLIENT_CITY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CLIENT_CITY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CLIENT_CITY_DROPDOWN);
        WebElement inputField = driver.findElement(CLIENT_CITY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setClientCity(SelectedValue);
    }
    public static void getRandomClientCustomerImportanceDropdown(){
        utils.click(CLIENT_CUSTOMERIMPORTANCE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CLIENT_CUSTOMERIMPORTANCE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CLIENT_CUSTOMERIMPORTANCE_DROPDOWN);
        WebElement inputField = driver.findElement(CLIENT_CUSTOMERIMPORTANCE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setClientCustomerImportance(SelectedValue);
    }
    public static void clickSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_CLIENT, SAVE_BUTTON_CONTACT};

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
    public static void verifyClientCode() {
        String authValue = testDataModel.getClientCode();
        utils.typeText(SEARCH_CLIENT_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr[1]/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientName(){
        String authValue = testDataModel.getClientName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientClientType(){
        String authValue = testDataModel.getClientClientType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientContactPerson(){
        String authValue = testDataModel.getClientContactPerson();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr/td[4][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientMobileNumber(){
        String authValue = testDataModel.getClientMobileNumber();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr/td[5][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientCountry(){
        String authValue = testDataModel.getClientCountry();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr/td[6][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientCity(){
        String authValue = testDataModel.getClientCity();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr/td[7][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientCustomerImportance(){
        String authValue = testDataModel.getClientCustomerImportance();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr/td[8][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientExtRefCode(){
        String authValue = testDataModel.getClientExtRefCode();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdClient_ctl00']/tbody/tr/td[9][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterContactName(){
        String contactName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(CONTACT_NAME, contactName);
        testDataModel.setContactName(contactName);
    }
    public static void enterContactExtRefCode() {
        String extrefCode = dataGenerator.generateRandomNumbericwithLength(7);
        utils.typeText(CONTACT_EXT_REFERENCE_CODE, extrefCode);
        testDataModel.setContactExtRefCode(extrefCode);
    }
    public static void getRandomContactsContactTypeDropdown(){
        utils.click(CONTACT_CONTACTTYPE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CONTACT_CONTACTTYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CONTACT_CONTACTTYPE_DROPDOWN);
        WebElement inputField = driver.findElement(CONTACT_CONTACTTYPE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setContactsContactType(SelectedValue);
    }
    public static void enterContactEmail(){
        String contactEmail = dataGenerator.generateRandomEmail();
        utils.typeText(CONTACT_EMAIL, contactEmail);
        testDataModel.setContactEmail(contactEmail);
    }
    public static void enterContactMobileNumber(){
        String contactMobileNumber = dataGenerator.generateRandomNumbericwithLength(9);
        utils.typeText(CONTACT_MOBILE_NUMBER, contactMobileNumber);
        testDataModel.setContactMobileNumber(contactMobileNumber);
    }
    public static void enterContactWhatsappNumber(){
        String contactWhatsappNumber = dataGenerator.generateRandomNumbericwithLength(9);
        utils.typeText(CONTACT_WHATSAPP_NUMBER, contactWhatsappNumber);
        testDataModel.setContactWhatsappNumber(contactWhatsappNumber);
    }
    public static void verifyContactName() {
        String authValue = testDataModel.getContactName();
        utils.typeText(SEARCH_CONTACT_NAME, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr[1]/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContactsContactType(){
        String authValue = testDataModel.getContactsContactType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContactMobileNumber(){
        String authValue = testDataModel.getContactMobileNumber();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContactWhatsappNumber(){
        String authValue = testDataModel.getContactWhatsappNumber();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr/td[4][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContactEmail(){
        String authValue = testDataModel.getContactEmail();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr/td[5][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContactExtRefCode(){
        String authValue = testDataModel.getContactExtRefCode();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00']/tbody/tr/td[7][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }







}
