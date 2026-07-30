package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AuditInspections;
import pages.ResourceManagement;
import utils.DriverFactory;
import utils.HelperUtils;

public class ResourceManagementMasterStep {
    private final WebDriver driver = DriverFactory.getDriver();
    private final HelperUtils helperUtils = new HelperUtils(driver);

    @When("User get Trade default code field value")
    public void user_get_Trade_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='TxtTradeCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        ResourceManagement.testDataModel.setTradeCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User verify special characters are not allowed in {string}")
    public void user_verify_special_characters_not_allowed_in_Trade(String fieldValue) {
        By locator;
        if (driver.findElements(By.xpath("//input[@id='" + fieldValue + "']")).size() > 0) {
            locator = By.xpath("//input[@id='" + fieldValue + "']");
        } else {
            locator = By.xpath("//textarea[@id='" + fieldValue + "']");
        }
        helperUtils.verifySpecialCharactersNotAllowed(locator);
    }
    @And("User Enters Trade Name")
    public void user_enters_Trade_name() {
        ResourceManagement.enterTradeName();
    }
    @When("User select the Service Group Trade dropdown")
    public void user_select_the_Service_Group_Trade_Dropdown(){
        ResourceManagement.getRandomServiceGroupDropdown();
    }
    @When("User Enters the Cost Per Hour")
    public void User_Enters_the_Cost_Per_Hour(){
        ResourceManagement.enterrandomCostPerHr();
    }
    @When("User clicks on Save button in Resource Management Section")
    public void User_clicks_on_save_button(){
        ResourceManagement.clickSaveButton();
    }
    @Then("User verifies added Trade details in table")
    public void user_verifies_added_ContactType_details_in_table(){
        ResourceManagement.verifyTradeCode();
        ResourceManagement.verifyTradeName();
        ResourceManagement.verifyServiceGroup();
        ResourceManagement.verifyCostPerHr();
    }
    @When("User get Department default code field value")
    public void user_get_Department_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDept_C_radtxtDeptCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        ResourceManagement.testDataModel.setDepartmentCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @And("User Enters Department Name")
    public void user_enters_Department_name() {
        ResourceManagement.enterDepartmentName();
    }
    @And("User Enters Department Contact details")
    public void user_enters_Department_Contact_Details() {
        ResourceManagement.enterContactPerson();
        ResourceManagement.enterDepartmentEmail();
        ResourceManagement.enterContactNumber();
    }
    @And("User click Contract Group Check box")
    public void User_click_Contract_Group_Check_box() {
        ResourceManagement.clickRandomContractCheckbox();
    }
    @Then("User verifies added Department details in table")
    public void user_verifies_added_Department_details_in_table(){
        ResourceManagement.verifyDepartmentCode();
        ResourceManagement.verifyDepartmentName();
        ResourceManagement.verifyContactPerson();
        ResourceManagement.verifyDepartmentEmail();
        ResourceManagement.verifyContactNumber();
    }
    @When("User get Designation default code field value")
    public void user_get_Designation_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtDesiCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        ResourceManagement.testDataModel.setDesignationCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @And("User Enters Designation Name")
    public void user_enters_Designation_name() {
        ResourceManagement.enterDesignationName();
    }
    @When("User Enters the Rate Per Hour")
    public void User_Enters_the_Rate_Per_Hour(){
        ResourceManagement.enterrandomRatePerHr();
    }
    @And("User click Designation Radio button and Check box")
    public void User_click_Designation_Radio_button_Check_box() {
        ResourceManagement.clickRadiobutton();
        ResourceManagement.clickApplicableCheckboxes();
    }
    @Then("User verifies added Designation details in table")
    public void user_verifies_added_Designation_details_in_table(){
        ResourceManagement.verifyDesignationCode();
        ResourceManagement.verifyDesignationName();
        ResourceManagement.verifyRatePerHr();
        ResourceManagement.verifyDesignationCheckboxes();
        ResourceManagement.verifyRadiobuttonCheckbox();
    }
    @When("User get Shift default code field value")
    public void user_get_Shift_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='txtShiftCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        ResourceManagement.testDataModel.setShiftCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User get Shift Name field value")
    public void user_get_Shift_Name_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='txtShiftName']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        ResourceManagement.testDataModel.setShiftName(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @And("User Enters Shift Name")
    public void user_enters_Shift_name() {
        ResourceManagement.enterShiftName();
    }
    @And("User clicks on TimeIn and TimeOut")
    public void User_clicks_on_TimeIn_and_TimeOut() {
        ResourceManagement.clickTimeInandOut();
    }
    @And("User enable DayOff toggle on")
    public void user_User_enable_DayOff_toggle_on() {
        ResourceManagement.enableDayOfftoggle();
    }
    @And("User enable enable check box")
    public void user_User_enable_check_box() {
        ResourceManagement.enableCheckbox();
    }
    @And("User click Random Shift Type Radio button")
    public void User_click_Random_Shift_Type_Radio_button() {
        ResourceManagement.clickShiftTypeRadiobutton();
    }
    @Then("User verifies added Shift details in table")
    public void user_verifies_added_Shift_details_in_table(){
        ResourceManagement.verifyShiftCode();
        ResourceManagement.verifyShiftName();
        ResourceManagement.verifyShiftType();
        ResourceManagement.verifyNonDutyEnablecheckbox();
    }
    @And("User Enters Domain Name")
    public void user_enters_Domain_name() {
        ResourceManagement.enterDomainName();
    }
    @When("User select the Supplier Name dropdown")
    public void user_select_the_Supplier_Name_Dropdown(){
        ResourceManagement.getRandomSupplierDropdown();
    }
    @Then("User verifies added Domain details in table")
    public void user_verifies_added_Domain_details_in_table(){
        ResourceManagement.verifyDomainName();
    }
    @And("User Enters Time Slot Code and Name")
    public void user_enters_Time_Slot_Code_and_Name() {
        ResourceManagement.enterTimeSlotCodeName();
    }
    @When("User select the Time Slot Department dropdown")
    public void user_select_the_Time_Slot_Department_Dropdown(){
        ResourceManagement.getRandomTimeDepartmentDropdown();
    }
    @And("User clicks on FromTime and ToTime")
    public void User_clicks_on_FromTime_ToTime() {
        ResourceManagement.clickTimeFromandTo();
    }
    @Then("User verifies added Time Slot details in table")
    public void user_verifies_added_Time_Slot_details_in_table(){
        ResourceManagement.verifyTimeSlotCode();
        ResourceManagement.verifyTimeSlotName();
        ResourceManagement.verifyTimeSlotDepartmentName();
    }
    @And("User Enters Skill Level Name")
    public void user_enters_Skill_Level_Name() {
        ResourceManagement.enterSkillLevelName();
    }
    @Then("User verifies added Skill Level details in table")
    public void user_verifies_added_Skill_Level_details_in_table(){
        ResourceManagement.verifySkillLevelName();
    }
    @And("User Enters Language Name")
    public void user_enters_Language_Name() {
        ResourceManagement.enterLanguageName();
    }
    @Then("User verifies added Language details in table")
    public void user_verifies_added_Language_details_in_table(){
        ResourceManagement.verifyLanguageName();
    }
    @And("User Enters Country Code")
    public void user_enters_Country_Code() {
        ResourceManagement.enterCountryCode();
    }
    @And("User Enters Country Name")
    public void user_enters_Country_Name() {
        ResourceManagement.enterCountryName();
    }
    @Then("User verifies added Country details in table")
    public void user_verifies_added_Country_details_in_table(){
        ResourceManagement.verifyCountryCode();
        ResourceManagement.verifyCountryName();
    }
    @When("User select the Resource Action dropdown")
    public void user_select_the_Resource_Action_Dropdown(){
        ResourceManagement.getRandomResourceActionDropdown();
    }
    @And("User Enters Attendance Reason")
    public void user_enters_Attendance_Reason() {
        ResourceManagement.enterAttendanceReason();
    }
    @Then("User verifies added Attendance details in table")
    public void user_verifies_added_Attendance_details_in_table(){
        ResourceManagement.verifyAttendanceReason();
        ResourceManagement.verifyResourceAction();
    }
    @When("User select the Trade Type record to edit")
    public void user_select_the_Trade_Type_record_to_edit() {
        ResourceManagement.getRandomTradeTypeRecord();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Trade Name")
    public void user_verify_chars_len_Trade_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtTrade']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Cost Perhr")
    public void user_verify_chars_len_Cost_Perhr(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtTradeCost']"),maxLen, minLen);
    }
    @And("User clicks on Resource Save button For InLine Error")
    public void user_clicks_on_Resource_save_button_for_in_line_error() {
        ResourceManagement.clickResourceSaveButtonInlineError();
    }
    @When("User select the Department Type record to edit")
    public void user_select_the_Department_Type_record_to_edit() {
        ResourceManagement.getRandomDepartmentTypeRecord();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Department Name")
    public void user_verify_chars_len_Department_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtDeptName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Contact Person")
    public void user_verify_chars_len_Contact_Person(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtContactPerson']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Email")
    public void user_verify_chars_len_Email(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtDepEmail']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Contact Number")
    public void user_verify_chars_len_Contact_Number(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtFaxNo']"),maxLen, minLen);
    }
    @When("User select the Designation Type record to edit")
    public void user_select_the_Designation_Type_record_to_edit() {
        ResourceManagement.getRandomDesignationTypeRecord();
    }
    @Then("User verifies edited Designation details in table")
    public void user_verifies_edited_Designation_details_in_table(){
        ResourceManagement.verifyDesignationCode();
        ResourceManagement.verifyDesignationName();
        ResourceManagement.verifyRatePerHr();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Designation Name")
    public void user_verify_chars_len_Designation_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtDesi']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Rate Hour")
    public void user_verify_chars_len_Rate_Hour(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDesignation_C_radtxtdesrate']"),maxLen, minLen);
    }
    @When("User select the Technician Shift record to edit")
    public void user_select_the_Technician_Shift_record_to_edit() {
        ResourceManagement.getRandomTechnicianShiftRecord();
    }
    @Then("User verifies edited Shift details in table")
    public void user_verifies_edited_Shift_details_in_table(){
        ResourceManagement.verifyShiftCode();
        ResourceManagement.verifyShiftName();
        ResourceManagement.verifyShiftType();
    }
    @When("user verify the chars and max len as {int} for Shift Name")
    public void user_verify_chars_len_Shift_Name(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='txtShiftName']"),maxLen, null);
    }
    @And("User clicks on TimeIn and TimeOut for greater time message")
    public void User_clicks_on_TimeIn_and_TimeOut_greater_time_error() {
        ResourceManagement.clickTimeInandOutErrorMessage();
    }
    @When("User select the Domain record to edit")
    public void user_select_the_Domain_record_to_edit() {
        ResourceManagement.getRandomDomainRecord();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Domain Name")
    public void user_verify_chars_len_Domain_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinDomain_C_radtxtDomain']"),maxLen, minLen);
    }
    @And("User Enters Invalid Domain Name for Error")
    public void user_enters_Invalid_Domain_name() {
        ResourceManagement.enterInvalidDomainName();
    }
    @When("User select the Time Slot record to edit")
    public void user_select_the_Time_Slot_record_to_edit() {
        ResourceManagement.getRandomTimeSlotRecord();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Slot Code")
    public void user_verify_chars_len_Slot_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtTimeSlotCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Slot Name")
    public void user_verify_chars_len_Slot_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTimeSlot_C_RadtxtTimeSlotName']"),maxLen, minLen);
    }
    @And("User clicks on FromTime and ToTime for greater time message")
    public void User_clicks_on_FromTime_and_ToTime_greater_time_error() {
        ResourceManagement.clickTimeFromandToErrorMessage();
    }
    @When("User select the Skill level record to edit")
    public void user_select_the_Skill_level_record_to_edit() {
        ResourceManagement.getRandomSkillLevel();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Skill Level Name")
    public void user_verify_chars_len_Skill_Level_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtSkill']"),maxLen, minLen);
    }
    @When("User select the Language record to edit")
    public void user_select_the_Language_record_to_edit() {
        ResourceManagement.getRandomLanguage();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Language")
    public void user_verify_chars_len_Language(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinLanguage_C_radtxtLanguage']"),maxLen, minLen);
    }
    @When("User select the Nationality record to edit")
    public void user_select_the_Nationality_record_to_edit() {
        ResourceManagement.getRandomNationality();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Nationality Code")
    public void user_verify_chars_len_NationalityCode(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinNationality_C_radtxtNationalityCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Nationality Name")
    public void user_verify_chars_len_NationalityName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinNationality_C_radtxtNationality']"),maxLen, minLen);
    }
    @When("User select the Attendance record to edit")
    public void user_select_the_Attendance_record_to_edit() {
        ResourceManagement.getRandomAttendance();
    }
    @When("user verify the chars min len as {int} and max len as {int} for Attendance")
    public void user_verify_chars_len_Attendance(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_RadWinAttendanceReason_C_radtxtReason']"),maxLen, minLen);
    }






}
