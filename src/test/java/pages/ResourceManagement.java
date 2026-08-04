package pages;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.*;

import java.util.List;
import java.util.logging.Logger;

import static pages.BasePage.driver;
import static utils.JavaScriptExeUtil.jsClick;

public class ResourceManagement extends BasePage{

    public ResourceManagement(WebDriver driver) { super(driver);}
    static TestDataGenerator dataGenerator = new TestDataGenerator();
    @Getter
    public static TestDataModel testDataModel = new TestDataModel();
    static Actionutils action = new Actionutils(driver);
    JavaScriptExeUtil jsutil = new JavaScriptExeUtil(driver);
    private static final Logger LOGGER = Logger.getLogger(AuditManagement.class.getName());

    public static By TRADE_NAME = By.xpath("//input[@id='radtxtTrade']");
    public static By SERVICE_GROUP_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTrade_C_raddrpServiceGrp_Input']");
    public static By ALL_SERVICE_GROUP_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinTrade_C_raddrpServiceGrp_DropDown']/div/ul/li");
    public static By COST_PER_HR = By.xpath("//input[@id='radtxtTradeCost']");
    public static By SAVE_BUTTON_TRADE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinTrade_C_btnTradeOk']");
    public static By SEARCH_TRADE_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdTrade_ctl00_ctl02_ctl02_FilterTextBox_TradeShortCode']");
    public static By DEPARTMENT_NAME = By.xpath("//input[@id='radtxtDeptName']");
    public static By CONTACT_PERSON = By.xpath("//input[@id='radtxtContactPerson']");
    public static By DEPARTMENT_EMAIL = By.xpath("//input[@id='radtxtDepEmail']");
    public static By CONTACT_NUMBER = By.xpath("//input[@id='radtxtFaxNo']");
    public static By ALL_CONTRACT_GROUP_CHECKBOX = By.xpath("//table[contains(@id,'grdContractGrpList')]//tbody/tr/td/input[@type='checkbox']");
    public static By SAVE_BUTTON_DEPARTMENT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinDept_C_btnDeptOk']");
    public static By SEARCH_DEPARTMENT_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdDept_ctl00_ctl02_ctl02_FilterTextBox_DepartmentCode']");
    public static By DESIGNATION_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtDesi']");
    public static By DESIGNATION_RATE_PER_HR = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtdesrate']");
    public static By DESIGNATION_RADIO_BUTTONS = By.xpath("//button[@class='RadButton RadButton_Bootstrap rbRadioButton rbRounded rbIconButton']");
    public static By DESIGNATION_SELECTED_RADIO_BUTTON = By.xpath("//span[@class='rbIcon p-icon p-i-radio-checked rbToggleRadioChecked']/parent::button[@class='RadButton RadButton_Bootstrap rbRadioButton rbRounded rbIconButton']");
    public static By ALL_DESIGNATION_APPLICABLE_CHECKBOXES = By.xpath("//button[(@class='RadButton RadButton_Bootstrap rbCheckBox rbRounded rbIconButton') and (contains(@name,'ctl00$ContentPlaceHolder1$RadWinDesignation$C$chk'))]/span[@class='rbIcon p-icon p-i-checkbox rbToggleCheckbox']");
    public static By SAVE_BUTTON_DESIGNATION = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinDesignation_C_btnDesOK']");
    public static By SEARCH_DESIGNATION_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00_ctl02_ctl02_FilterTextBox_DesignationCode']");
    public static By SHIFT_NAME = By.xpath("//input[@id='txtShiftName']");
    public static By TIME_IN = By.xpath("//a[@id='timePopupLink']");
    public static By ALL_TIME_IN = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinStaffShift_C_txtTimeIn_timeView_tdl']/tbody/tr[4]/td");
    public static By TIME_OUT = By.xpath("//a[@id='ctl00_ContentPlaceHolder1_RadWinStaffShift_C_txtTimeOut_timePopupLink']");
    public static By ALL_TIME_OUT = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinStaffShift_C_txtTimeOut_timeView_tdl']/tbody/tr[8]/td");
    public static By ALL_TIME_IN_ERROR_MESSAGE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinStaffShift_C_txtTimeIn_timeView_tdl']/tbody/tr[8]/td");
    public static By ALL_TIME_OUT_ERROR_MESSAGE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinStaffShift_C_txtTimeOut_timeView_tdl']/tbody/tr[4]/td");
    public static By DAYOFF_TOGGLE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinStaffShift_C_swtLeaveShift']");
    public static By ENABLE_CHECKBOX = By.xpath("//button[@id='ChkEnable']");
    public static By SHIFT_TYPE_RADIO_BUTTON = By.xpath("//button[@class='RadButton RadButton_Bootstrap rbRadioButton rbRounded rbIconOnly']");
    public static By CLIENT_CONTRACT_DROPDOWN = By.xpath("//div[@class='k-widget k-multiselect RadMultiSelect RadMultiSelect_Telerik HideScrol k-multiselect-clearable']");
    public static By ALL_CLIENT_CONTRACT = By.xpath("//select[@id='ctl00_ContentPlaceHolder1_RadWinStaffShift_C_RadContract_Select']/option");
    public static By SAVE_BUTTON_SHIFT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinStaffShift_C_btnShiftSave']");
    public static By SEARCH_SHIFT_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdStaffShift_ctl00_ctl02_ctl02_FilterTextBox_ShiftCode']");
    public static By DOMAIN_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDomain_C_radtxtDomain']");
    public static By SUPPLIER_NAME_DROP_DOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDomain_C_raddrpSupplier_Input']");
    public static By ALL_SUPPLIER_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinDomain_C_raddrpSupplier_DropDown']/div/ul/li");
    public static By SAVE_BUTTON_SUPPLIER = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinDomain_C_btnDomain']");
    public static By SEARCH_DOMAIN_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdDomain_ctl00_ctl02_ctl02_FilterTextBox_DomainName']");
    public static By TIME_SLOT_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtTimeSlotCode']");
    public static By TIME_SLOT_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtTimeSlotName']");
    public static By TIME_DEPARTMENT_DROP_DOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_radDrpDepartment_Input']");
    public static By ALL_TIME_DEPARTMENT_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_radDrpDepartment_DropDown']/div/ul/li");
    public static By FROM_TIME = By.xpath("//a[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtFromTime_timePopupLink']");
    public static By ALL_FROM_TIME = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtFromTime_timeView_tdl']/tbody/tr[4]/td");
    public static By TO_TIME = By.xpath("//a[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtToTime_timePopupLink']");
    public static By ALL_TO_TIME = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtToTime_timeView_tdl']/tbody/tr[8]/td");
    public static By ALL_FROM_TIME_ERROR_MESSAGE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtFromTime_timeView_tdl']/tbody/tr[8]/td");
    public static By ALL_TO_TIME_ERROR_MESSAGE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtToTime_timeView_tdl']/tbody/tr[4]/td");
    public static By SAVE_BUTTON_TIME_SLOT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_BtnTimeSlotSave']");
    public static By SEARCH_TIME_SLOT_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdTimeSlot_ctl00_ctl02_ctl02_FilterTextBox_TimeSlotCode']");
    public static By SKILL_LEVEL_NAME = By.xpath("//input[@id='radtxtSkill']");
    public static By SAVE_BUTON_SKILL_LEVEL = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinSkill_C_btnSkillOk']");
    public static By SEARCH_SKILL_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdSkillLevel_ctl00_ctl02_ctl02_FilterTextBox_SkillLevelName']");
    public static By LANGUAGE_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinLanguage_C_radtxtLanguage']");
    public static By SAVE_BUTON_LANGUAGE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinLanguage_C_BtnLanguageSave']");
    public static By SEARCH_LANGUAGE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grd_language_ctl00_ctl02_ctl02_FilterTextBox_Languag']");
    public static By COUNTRY_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinNationality_C_radtxtNationalityCode']");
    public static By COUNTRY_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinNationality_C_radtxtNationality']");
    public static By SAVE_BUTON_COUNTRY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinNationality_C_btnNationalitySave']");
    public static By SEARCH_COUNTRY_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grd_Nationality_ctl00_ctl02_ctl02_FilterTextBox_CountryCode']");
    public static By RESOURCE_ACTION_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAttendanceReason_C_RadComboActionType_Input']");
    public static By ALL_RESOURCE_ACTION_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAttendanceReason_C_RadComboActionType_DropDown']/div/ul/li");
    public static By ATTENDANCE_REASON = By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_RadWinAttendanceReason_C_radtxtReason']");
    public static By SAVE_BUTTON_ATTENDANCE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAttendanceReason_C_BtnAttendanceReasonSave']");
    public static By SEARCH_ATTENDANCE_REASON = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAttendanceReason_ctl00_ctl02_ctl02_FilterTextBox_Reasons']");
    public static By ALL_OPTIONS_INTRADE_TYPE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTrade_ctl00']/tbody/tr");
    public static By ALL_OPTIONS_IN_DEPARTMENT = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDept_ctl00']/tbody/tr");
    public static By ALL_OPTIONS_IN_DESIGNATION = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr");
    public static By ALL_TECHNICIAN_SHIFTS = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdStaffShift_ctl00']/tbody/tr");
    public static By ALL_OPTIONS_DOMAIN = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDomain_ctl00']/tbody/tr");
    public static By ALL_OPTIONS_TIMESLOT = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTimeSlot_ctl00']/tbody/tr");
    public static By ALL_OPTIONS_SKILL_LEVEL = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSkillLevel_ctl00']/tbody/tr");
    public static By ALL_OPTIONS_LANGUAGE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grd_language_ctl00']/tbody/tr");
    public static By ALL_OPTIONS_NATIONALITY = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grd_Nationality_ctl00']/tbody/tr");
    public static By ALL_OPTIONS_ATTENDANCE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAttendanceReason_ctl00']/tbody/tr");



    //actions
    public static void enterTradeName(){
        String tradeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(TRADE_NAME, tradeName);
        testDataModel.setTrade(tradeName);
    }
    public static void getRandomServiceGroupDropdown(){
        utils.click(SERVICE_GROUP_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SERVICE_GROUP_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SERVICE_GROUP_DROPDOWN);
        WebElement inputField = driver.findElement(SERVICE_GROUP_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setServiceGroup(SelectedValue);
    }
    public static void enterrandomCostPerHr() {
        String CostPerHrValue = dataGenerator.generateWeightage();
        utils.typeText(COST_PER_HR, CostPerHrValue);
        testDataModel.setCostPerHr(CostPerHrValue);
    }
    public static void clickSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_TRADE, SAVE_BUTTON_DEPARTMENT, SAVE_BUTTON_DESIGNATION, SAVE_BUTTON_SHIFT, SAVE_BUTTON_SUPPLIER, SAVE_BUTTON_TIME_SLOT, SAVE_BUTON_SKILL_LEVEL, SAVE_BUTON_LANGUAGE, SAVE_BUTON_COUNTRY, SAVE_BUTTON_ATTENDANCE};

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
    public static void verifyTradeCode() {
        String authValue = testDataModel.getTradeCode();
        utils.typeText(SEARCH_TRADE_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTrade_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyTradeName(){
        String authValue = testDataModel.getTrade();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTrade_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyServiceGroup(){
        String authValue = testDataModel.getServiceGroup();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTrade_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyCostPerHr(){
        String authValue = testDataModel.getCostPerHr();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTrade_ctl00']/tbody/tr/td[4][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterDepartmentName(){
        String departmentName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(DEPARTMENT_NAME, departmentName);
        testDataModel.setDepartmentName(departmentName);
    }
    public static void enterContactPerson(){
        String departmentName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(CONTACT_PERSON, departmentName);
        testDataModel.setContactPerson(departmentName);
    }
    public static void enterDepartmentEmail(){
        String departmentEmail = dataGenerator.generateRandomEmail();
        utils.typeText(DEPARTMENT_EMAIL, departmentEmail);
        testDataModel.setDepartmentEmail(departmentEmail);
    }
    public static void enterContactNumber(){
        String ContactName = dataGenerator.generateRandomNumbericwithLength(10);
        utils.typeText(CONTACT_NUMBER, ContactName);
        testDataModel.setContactNumber(ContactName);
    }
    public static void clickRandomContractCheckbox(){
        HelperUtils.clickRandomElement(ALL_CONTRACT_GROUP_CHECKBOX);
    }
    public static void verifyDepartmentCode() {
        String authValue = testDataModel.getDepartmentCode();
        utils.typeText(SEARCH_DEPARTMENT_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDept_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyDepartmentName(){
        String authValue = testDataModel.getDepartmentName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDept_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContactPerson(){
        String authValue = testDataModel.getContactPerson();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDept_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyDepartmentEmail(){
        String authValue = testDataModel.getDepartmentEmail();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDept_ctl00']/tbody/tr/td[4][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyContactNumber(){
        String authValue = testDataModel.getContactNumber();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDept_ctl00']/tbody/tr/td[5][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterDesignationName(){
        String designationName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(DESIGNATION_NAME, designationName);
        testDataModel.setDesignationName(designationName);
    }
    public static void enterrandomRatePerHr() {
        String RatePerHrValue = dataGenerator.generateWeightage();
        utils.typeText(DESIGNATION_RATE_PER_HR, RatePerHrValue);
        testDataModel.setDesignationPerHr(RatePerHrValue);
    }
    public static void clickRadiobutton() {
        HelperUtils.clickRandomElement(DESIGNATION_RADIO_BUTTONS);
    }
    public static void clickApplicableCheckboxes(){
        List<WebElement> allCheckboxes = driver.findElements(ALL_DESIGNATION_APPLICABLE_CHECKBOXES);

        for (WebElement checkbox : allCheckboxes) {
            Assert.assertFalse("Checkboxes should not be pre-selected",checkbox.isSelected());
        }

        for (WebElement checkbox : allCheckboxes) {
            checkbox.click();
        }
    }
    public static void verifyDesignationCode() {
        String authValue = testDataModel.getDesignationCode();
        utils.typeText(SEARCH_DESIGNATION_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyDesignationName(){
        String authValue = testDataModel.getDesignationName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyRatePerHr(){
        String authValue = testDataModel.getDesignationPerHr();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr/td[3][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyDesignationCheckboxes() {
        By fieldValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr/td[5]/span[@class='icon-check-circle']");
        utils.waitForVisibility(fieldValue);
        Assert.assertTrue(utils.isElementVisible(fieldValue));

        By operationValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr/td[6]/span[@class='icon-check-circle']");
        utils.waitForVisibility(operationValue);
        Assert.assertTrue(utils.isElementVisible(operationValue));

        By securityValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr/td[7]/span[@class='icon-check-circle']");
        utils.waitForVisibility(securityValue);
        Assert.assertTrue(utils.isElementVisible(securityValue));
    }
    public static void verifyRadiobuttonCheckbox(){
        By internalValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr/td[8]/span[@class='icon-check-circle']");
        By serviceValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDesignation_ctl00']/tbody/tr/td[9]/span[@class='icon-check-circle']");

        if (utils.isElementVisible(internalValue)) {
            System.out.println("Internal Team is selected");
            Assert.assertTrue(true);
        } else if (utils.isElementVisible(serviceValue)) {
            System.out.println("Service Provider is selected");
            Assert.assertTrue(true);
        } else {
            Assert.fail("Neither Internal Team nor Service Provider is visible");
        }

    }
    public static void enterShiftName(){
        String designationName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(SHIFT_NAME, designationName);
        testDataModel.setShiftName(designationName);
    }
    public static void clickTimeInandOut(){
        utils.waitForVisibility(TIME_IN);
        utils.click(TIME_IN);
        utils.waitForVisibility(ALL_TIME_IN);
        HelperUtils.clickRandomElement(ALL_TIME_IN);

        utils.waitForVisibility(TIME_OUT);
        utils.click(TIME_OUT);
        utils.waitForVisibility(ALL_TIME_OUT);
        HelperUtils.clickRandomElement(ALL_TIME_OUT);
    }
    public static void enableDayOfftoggle(){
        utils.click(DAYOFF_TOGGLE);
    }
    public static void enableCheckbox(){
        utils.click(ENABLE_CHECKBOX);
    }
    public static void clickShiftTypeRadiobutton() {
        HelperUtils.clickRandomElement(SHIFT_TYPE_RADIO_BUTTON);

        WebElement genericRadio = driver.findElement(By.xpath("//button[@id='rdbbtnGeneric']/span"));
        WebElement specificRadio = driver.findElement(By.xpath("//button[@id='rdbbtnSpecific']/span"));

        String selected;
        if (genericRadio.getAttribute("class").contains("rbToggleRadioChecked")) {
            selected = "Generic";
        } else if (specificRadio.getAttribute("class").contains("rbToggleRadioChecked")) {
            selected = "Specific";
        }else {
            throw new IllegalStateException("No radio button is selected");
        }
        testDataModel.setShiftType(selected);

        if (selected.equalsIgnoreCase("Generic")) {
            System.out.println("Generic is selected");
        } else{
            utils.waitForVisibility(CLIENT_CONTRACT_DROPDOWN);
            utils.click(CLIENT_CONTRACT_DROPDOWN);
            utils.waitForVisibility(ALL_CLIENT_CONTRACT);
            HelperUtils.clickRandomElement(ALL_CLIENT_CONTRACT);

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.TAB).perform();
        }
    }
    public static void verifyShiftCode() {
        String authValue = testDataModel.getShiftCode();
        utils.typeText(SEARCH_SHIFT_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdStaffShift_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyShiftName(){
        String authValue = testDataModel.getShiftName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdStaffShift_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyShiftType(){
        String authValue = testDataModel.getShiftType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdStaffShift_ctl00']/tbody/tr/td[5]/span[contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyNonDutyEnablecheckbox() {
        By fieldValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdStaffShift_ctl00']/tbody/tr/td[6]/span[text()='Non-duty']");
        utils.waitForVisibility(fieldValue);
        Assert.assertTrue(utils.isElementVisible(fieldValue));

        By operationValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdStaffShift_ctl00']/tbody/tr/td[7]/span[@class='icon-check-circle']");
        utils.waitForVisibility(operationValue);
        Assert.assertTrue(utils.isElementVisible(operationValue));
    }
    public static void enterDomainName(){
        String domainName = dataGenerator.generateRandomCOMStringwithLength(6);
        utils.typeText(DOMAIN_NAME, domainName);
        testDataModel.setDomainName(domainName);
    }
    public static void getRandomSupplierDropdown(){
        utils.click(SUPPLIER_NAME_DROP_DOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SUPPLIER_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SUPPLIER_DROPDOWN);
    }
    public static void verifyDomainName() {
        String authValue = testDataModel.getDomainName();
        utils.typeText(SEARCH_DOMAIN_NAME, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdDomain_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterTimeSlotCodeName(){
        String slotCode = dataGenerator.generateRandomStringwithLength(3);
        utils.typeText(TIME_SLOT_CODE, slotCode);
        testDataModel.setTimeSlotCode(slotCode);

        String slotName = dataGenerator.generateRandomStringwithLength(6);
        utils.typeText(TIME_SLOT_NAME, slotName);
        testDataModel.setTimeSlotName(slotName);
    }
    public static void getRandomTimeDepartmentDropdown(){
        utils.click(TIME_DEPARTMENT_DROP_DOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_TIME_DEPARTMENT_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_TIME_DEPARTMENT_DROPDOWN);
        WebElement inputField = driver.findElement(TIME_DEPARTMENT_DROP_DOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setTimeSlotDepartment(SelectedValue);
    }
    public static void clickTimeFromandTo(){
        utils.waitForVisibility(FROM_TIME);
        utils.click(FROM_TIME);
        utils.waitForVisibility(ALL_FROM_TIME);
        HelperUtils.clickRandomElement(ALL_FROM_TIME);

        utils.waitForVisibility(TO_TIME);
        utils.click(TO_TIME);
        utils.waitForVisibility(ALL_TO_TIME);
        HelperUtils.clickRandomElement(ALL_TO_TIME);
    }
    public static void verifyTimeSlotCode() {
        String authValue = testDataModel.getTimeSlotCode();
        utils.typeText(SEARCH_TIME_SLOT_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTimeSlot_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyTimeSlotName(){
        String authValue = testDataModel.getTimeSlotName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTimeSlot_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyTimeSlotDepartmentName(){
        String authValue = testDataModel.getTimeSlotDepartment();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdTimeSlot_ctl00']/tbody/tr/td[3][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterSkillLevelName(){
        String skillName = dataGenerator.generateRandomStringwithLength(6);
        utils.typeText(SKILL_LEVEL_NAME, skillName);
        testDataModel.setSkillLevelName(skillName);
    }
    public static void verifySkillLevelName(){
        String authValue = testDataModel.getSkillLevelName();
        utils.typeText(SEARCH_SKILL_NAME, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSkillLevel_ctl00']/tbody/tr/td[contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterLanguageName(){
        String languageName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(LANGUAGE_NAME, languageName);
        testDataModel.setLanguageName(languageName);
    }
    public static void verifyLanguageName(){
        String authValue = testDataModel.getLanguageName();
        utils.typeText(SEARCH_LANGUAGE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grd_language_ctl00']/tbody/tr/td[contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterCountryCode(){
        String countryCode = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(COUNTRY_CODE, countryCode);
        testDataModel.setCountryCode(countryCode);
    }
    public static void enterCountryName(){
        String countryName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(COUNTRY_NAME, countryName);
        testDataModel.setCountryName(countryName);
    }
    public static void verifyCountryCode(){
        String authValue = testDataModel.getCountryCode();
        utils.typeText(SEARCH_COUNTRY_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grd_Nationality_ctl00']/tbody/tr/td[1][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyCountryName(){
        String authValue = testDataModel.getCountryName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grd_Nationality_ctl00']/tbody/tr/td[2][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void getRandomResourceActionDropdown(){
        utils.click(RESOURCE_ACTION_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_RESOURCE_ACTION_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_RESOURCE_ACTION_DROPDOWN);
        WebElement inputField = driver.findElement(RESOURCE_ACTION_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setResourceAction(SelectedValue);
    }
    public static void enterAttendanceReason(){
        String attendanceName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ATTENDANCE_REASON, attendanceName);
        testDataModel.setAttendanceReason(attendanceName);
    }
    public static void verifyAttendanceReason(){
        String authValue = testDataModel.getAttendanceReason();
        utils.typeText(SEARCH_ATTENDANCE_REASON, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAttendanceReason_ctl00']/tbody/tr/td[2][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyResourceAction(){
        String authValue = testDataModel.getResourceAction();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAttendanceReason_ctl00']/tbody/tr/td[1][contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void getRandomTradeTypeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_INTRADE_TYPE);
        utils.waitForVisibility(TRADE_NAME);
    }
    public static void clickResourceSaveButtonInlineError() {
        By[] saveButtons = {SAVE_BUTTON_TRADE, SAVE_BUTTON_DEPARTMENT, SAVE_BUTTON_DESIGNATION, SAVE_BUTTON_SHIFT, SAVE_BUTTON_SUPPLIER, SAVE_BUTTON_TIME_SLOT, SAVE_BUTON_SKILL_LEVEL, SAVE_BUTON_LANGUAGE, SAVE_BUTON_COUNTRY, SAVE_BUTTON_ATTENDANCE};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public static void getRandomDepartmentTypeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_IN_DEPARTMENT);
        utils.waitForVisibility(DEPARTMENT_NAME);
    }
    public static void getRandomDesignationTypeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_IN_DESIGNATION);
        utils.waitForVisibility(DESIGNATION_NAME);
    }
    public static void getRandomTechnicianShiftRecord(){
        HelperUtils.clickRandomElement(ALL_TECHNICIAN_SHIFTS);
        utils.waitForVisibility(SHIFT_NAME);
    }
    public static void clickTimeInandOutErrorMessage(){
        utils.waitForVisibility(TIME_IN);
        utils.click(TIME_IN);
        utils.waitForVisibility(ALL_TIME_IN_ERROR_MESSAGE);
        HelperUtils.clickRandomElement(ALL_TIME_IN_ERROR_MESSAGE);

        utils.waitForVisibility(TIME_OUT);
        utils.click(TIME_OUT);
        utils.waitForVisibility(ALL_TIME_OUT_ERROR_MESSAGE);
        HelperUtils.clickRandomElement(ALL_TIME_OUT_ERROR_MESSAGE);
    }
    public static void getRandomDomainRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_DOMAIN);
        utils.waitForVisibility(DOMAIN_NAME);
    }
    public static void enterInvalidDomainName(){
        String domainName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(DOMAIN_NAME, domainName);
    }
    public static void getRandomTimeSlotRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_TIMESLOT);
        utils.waitForVisibility(TIME_SLOT_NAME);
    }
    public static void clickTimeFromandToErrorMessage(){
        utils.waitForVisibility(FROM_TIME);
        utils.click(FROM_TIME);
        utils.waitForVisibility(ALL_FROM_TIME_ERROR_MESSAGE);
        HelperUtils.clickRandomElement(ALL_FROM_TIME_ERROR_MESSAGE);

        utils.waitForVisibility(TO_TIME);
        utils.click(TO_TIME);
        utils.waitForVisibility(ALL_TO_TIME_ERROR_MESSAGE);
        HelperUtils.clickRandomElement(ALL_TO_TIME_ERROR_MESSAGE);
    }
    public static void getRandomSkillLevel(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_SKILL_LEVEL);
        utils.waitForVisibility(SKILL_LEVEL_NAME);
    }
    public static void getRandomLanguage(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_LANGUAGE);
        utils.waitForVisibility(LANGUAGE_NAME);
    }
    public static void getRandomNationality(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_NATIONALITY);
        utils.waitForVisibility(COUNTRY_NAME);
    }
    public static void getRandomAttendance(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_ATTENDANCE);
        utils.waitForVisibility(ATTENDANCE_REASON);
    }



















}
