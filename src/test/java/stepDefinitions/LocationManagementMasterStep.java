package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AuditInspections;
import pages.LocationManagement;
import pages.PropertyManagement;
import pages.ResourceManagement;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;

public class LocationManagementMasterStep {
    private final WebDriver driver = DriverFactory.getDriver();
    AuditInspections auditInspections = new AuditInspections(driver);
    private final HelperUtils helperUtils = new HelperUtils(driver);

    @When("User get City default code field value")
    public void user_get_City_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='radtxtCityCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        LocationManagement.testDataModel.setCityCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User select the City Type record to edit")
    public void user_select_the_City_Type_record_to_edit() {
        LocationManagement.getRandomCityTypeRecord();
    }
    @And("User Enters City Name")
    public void user_enters_City_name() {
        LocationManagement.enterCityName();
    }
    @When("User clicks on Save button in Location Management Section")
    public void User_clicks_on_save_button(){
        LocationManagement.clickSaveButton();
    }
    @Then("User verifies added City details in table")
    public void user_verifies_added_City_details_in_table(){
        LocationManagement.verifyCityCode();
        LocationManagement.verifyCityName();
    }
    @When("User get Area Group default code field value")
    public void user_get_AreaGroup_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='radtxtAreaGroupCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        LocationManagement.testDataModel.setAreaGroupCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User select the Area Group record to edit")
    public void user_select_the_Area_Group_record_to_edit() {
        LocationManagement.getRandomAreaGroupRecord();
    }
    @And("User Enters Area Group Name")
    public void user_enters_Area_Group_name() {
        LocationManagement.enterAreaGroupName();
    }
    @Then("User verifies added Area Group details in table")
    public void user_verifies_added_Area_Group_details_in_table(){
        LocationManagement.verifyAreaGroupCode();
        LocationManagement.verifyAreaGroupName();
    }
    @When("User get Area default code field value")
    public void user_get_Area_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='radtxtAreaCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        LocationManagement.testDataModel.setAreaCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User select the Area record to edit")
    public void user_select_the_Area_record_to_edit() {
        LocationManagement.getRandomAreaRecord();
    }
    @When("User select the Area Group Area dropdown")
    public void user_select_the_Area_Group_Area_Dropdown(){
        LocationManagement.getRandomAreaGroupAreaDropdown();
    }
    @And("User Enters Area Name")
    public void user_enters_Area_name() {
        LocationManagement.enterAreaName();
    }
    @When("User select the City Area dropdown")
    public void user_select_the_City_Area_Dropdown(){
        ElementUtils.userWaitsForSeconds(2);
        LocationManagement.getRandomCityAreaDropdown();
    }
    @Then("User verifies added Area details in table")
    public void user_verifies_added_Area_details_in_table(){
        LocationManagement.verifyAreaCode();
        LocationManagement.verifyAreaGroup();
        LocationManagement.verifyAreaName();
        LocationManagement.verifyCity();
    }
    @When("User get Property default code field value")
    public void user_get_Property_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='radtxtPropCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        LocationManagement.testDataModel.setPropertyCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User select the Client Name dropdown")
    public void user_select_the_Client_Name_Dropdown(){
        LocationManagement.getRandomClientNameDropdown();
    }
    @When("User select the Property record to edit")
    public void user_select_the_Property_record_to_edit() {
        LocationManagement.getRandomPropertyRecord();
    }
    @And("User Enters Property Name")
    public void user_enters_Property_name() {
        LocationManagement.enterPropertyName();
    }
    @When("User select the Area dropdown in Property")
    public void user_select_the_Area_Dropdown_Property(){
        LocationManagement.getRandomAreaDropdown();
    }
    @When("User select the Property Type dropdown in Property")
    public void user_select_the_Property_Type_dropdown_Property(){
        LocationManagement.getRandomPropertyTypeDropdown();
    }
    @When("User select the Criticality dropdown in Property")
    public void user_select_the_Criticality_dropdown_Property(){
        LocationManagement.getRandomCriticalityDropdown();
    }
    @When("User select the Ownership Type dropdown in Property")
    public void user_select_the_Ownership_Type_dropdown_Property(){
        LocationManagement.getRandomOnwerTypeDropdown();
    }
    @And("User Enters Project Number Plot Number Reference Code")
    public void user_enters_Project_Plot_Reference_Number() {
        LocationManagement.enterProjectNo();
        LocationManagement.enterPlotNo();
        LocationManagement.enterReferenceCode();
    }
    @Then("User verifies added Property details in table")
    public void user_verifies_added_Property_details_in_table(){
        LocationManagement.navigatetoPropertytable();
        LocationManagement.verifyPropertyCode();
        LocationManagement.verifyPropertyName();
        LocationManagement.verifyArea();
        LocationManagement.verifyClientName();
        LocationManagement.verifyPropertyType();
    }
    @And("User Enters Zone Group Code")
    public void user_enters_Zone_Group_Code() {
        LocationManagement.enterZoneGroupCode();
    }
    @When("User select the Zone Group record to edit")
    public void user_select_the_Zone_Group_record_to_edit() {
        LocationManagement.getRandomZoneGroupRecord();
    }
    @And("User Enters Zone Group Name")
    public void user_enters_Zone_Group_Name() {
        LocationManagement.enterZoneGroupName();
    }
    @When("User select the Property dropdown in Zone Group")
    public void user_select_the_Property_dropdown_Zone_Group(){
        LocationManagement.getRandomPropertyZoneGroupDropdown();
    }
    @And("User Enters Zone Group Reference Code")
    public void user_enters_Zone_Group_Reference_Code() {
        LocationManagement.enterZoneGroupReferenceCode();
    }
    @Then("User verifies added Zone Group details in table")
    public void user_verifies_added_ZoneGroup_details_in_table(){
        LocationManagement.verifyZoneGroupCode();
        LocationManagement.verifyZoneGroupName();
        LocationManagement.verifyPropertyZoneGroup();
        LocationManagement.verifyReferenceZoneGroup();
    }
    @When("User get Zone default code field value")
    public void user_get_Zone_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='radtxtZoneCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        LocationManagement.testDataModel.setZoneCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User select the Zone record to edit")
    public void user_select_the_Zone_record_to_edit() {
        LocationManagement.getRandomZoneRecord();
    }
    @And("User Enters Zone Name")
    public void user_enters_Zone_Name() {
        LocationManagement.enterZoneName();
    }
    @When("User select the Property dropdown in Zone")
    public void user_select_the_Property_dropdown_Zone(){
        LocationManagement.getRandomPropertyZoneDropdown();
    }
    @And("User Enters Zone Reference Code")
    public void user_enters_Zone_Reference_Code() {
        LocationManagement.enterZoneReferenceCode();
    }
    @Then("User verifies added Zone details in table")
    public void user_verifies_added_Zone_details_in_table(){
        LocationManagement.verifyZoneCode();
        LocationManagement.verifyZoneName();
        LocationManagement.verifyPropertyZone();
        LocationManagement.verifyReferenceZone();
    }
    @When("User get Sub Zone default code field value")
    public void user_get_Sub_Zone_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='radtxtSubZoneCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        LocationManagement.testDataModel.setSubZoneCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @When("User select the Sub Zone record to edit")
    public void user_select_the_Sub_Zone_record_to_edit() {
        LocationManagement.getRandomSubZoneRecord();
    }
    @And("User Enters Sub Zone Name")
    public void user_enters_Sub_Zone_Name() {
        LocationManagement.enterSubZoneName();
    }
    @When("User select the Property Zone dropdown in Sub Zone")
    public void user_select_the_Property_Zone_dropdown_Sub_Zone(){
        LocationManagement.getRandomPropertySubZoneDropdown();
        LocationManagement.getRandomZoneSubZoneDropdown();
    }
    @And("User Enters Sub Zone Reference Code")
    public void user_enters_Sub_Zone_Reference_Code() {
        LocationManagement.enterSubZoneReferenceCode();
    }
    @Then("User verifies added Sub Zone details in table")
    public void user_verifies_added_Sub_Zone_details_in_table(){
        LocationManagement.verifySubZoneCode();
        LocationManagement.verifySubZoneName();
        LocationManagement.verifyPropertySubZone();
        LocationManagement.verifyZoneSubZone();
        LocationManagement.verifyReferenceSubZone();
    }
    @And("User Enters Sub Unit Code")
    public void user_enters_Sub_Unit_Code() {
        LocationManagement.enterSubUnitCode();
    }
    @When("User select the Sub Unit record to edit")
    public void user_select_the_Sub_Unit_record_to_edit() {
        LocationManagement.getRandomSubUnitRecord();
    }
    @And("User Enters Sub Unit Name")
    public void user_enters_Sub_Unit_Name() {
        LocationManagement.enterSubUnitName();
    }
    @When("User select the Property ZoneGroup Zone SubZone BaseUnit dropdown in Sub Zone")
    public void user_select_the_Property_ZoneGroup_Zone_SubZone_BaseUnit_dropdown_Sub_Zone(){
        LocationManagement.getRandomPropertySubUnitDropdown();
        LocationManagement.getRandomZoneGroupSubUnitDropdown();
        LocationManagement.getRandomZoneSubUnitDropdown();
        LocationManagement.getRandomSubZoneSubUnitDropdown();
        LocationManagement.getRandomBaseUnitSubUnitDropdown();
    }
    @And("User Enters Sub Unit Reference Code")
    public void user_enters_Sub_Unit_Reference_Code() {
        LocationManagement.enterSubUnitReferenceCode();
    }
    @Then("User verifies added Sub Unit details in table")
    public void user_verifies_added_Sub_Unit_details_in_table(){
        LocationManagement.verifySubUnitCode();
        LocationManagement.verifySubUnitName();
        LocationManagement.verifyPropertySubUnit();
        LocationManagement.verifyZoneGroupSubUnit();
        LocationManagement.verifyZoneSubUnit();
        LocationManagement.verifySubZoneSubUnit();
        LocationManagement.verifyBaseUnitSubUnit();
        LocationManagement.verifySubUnitReferenceCode();
    }
    @And("User Enters Space Name")
    public void user_enters_Space_Name() {
        LocationManagement.enterSpaceName();
    }
    @When("User select the Space record to edit")
    public void user_select_the_Space_record_to_edit() {
        LocationManagement.getRandomSpaceRecord();
    }
    @Then("User verifies added Space details in table")
    public void user_verifies_added_Space_details_in_table(){
        LocationManagement.verifySpaceName();
        LocationManagement.verifySpaceCheckboxischecked();
    }
    @And("User Enters Zone Criticality Name")
    public void user_enters_Zone_Criticality_Name() {
        LocationManagement.enterZoneCriticalityName();
    }
    @When("User select the Zone Criticality record to edit")
    public void user_select_the_Zone_Criticality_record_to_edit() {
        LocationManagement.getRandomZoneCriticlityRecord();
    }
    @Then("User verifies added Zone Criticality details in table")
    public void user_verifies_added_Zone_Criticality_details_in_table(){
        LocationManagement.verifyZoneCriticalityName();
    }
    @And("User Enters Zone Group Criticality Name")
    public void user_enters_Zone_Group_Criticality_Name() {
        LocationManagement.enterZoneGroupCriticalityName();
    }
    @When("User select the Zone Group Criticality record to edit")
    public void user_select_the_Zone_Group_Criticality_record_to_edit() {
        LocationManagement.getRandomZoneGroupCriticalityRecord();
    }
    @Then("User verifies added Zone Group Criticality details in table")
    public void user_verifies_added_Zone_Group_Criticality_details_in_table(){
        LocationManagement.verifyZoneGroupCriticalityName();
    }
    @And("User Enters BU Functionality Type Name")
    public void user_enters_BU_Functionality_Type_Name() {
        LocationManagement.enterBUFunctionalityTypeName();
    }
    @When("User select the BU Functional Type record to edit")
    public void user_select_the_BU_Functional_Type_record_to_edit() {
        LocationManagement.getRandomBUFunctionalRecord();
    }
    @Then("User verifies added BU Functionality Type details in table")
    public void user_verifies_added_BU_Functionality_Type_details_in_table(){
        LocationManagement.verifyBUFunctionalityTypeName();
    }
    @And("User Enters BU Functionality Sub Type Name")
    public void user_enters_BU_Functionality_Sub_Type_Name() {
        LocationManagement.enterBUFunctionalitySubTypeName();
    }
    @When("User select the BU Functional Sub Type record to edit")
    public void user_select_the_BU_Functional_Sub_Type_record_to_edit() {
        LocationManagement.getRandomBUFunctionalSubRecord();
    }
    @When("User select the BU Functional Type BUFunctionalSubType dropdown")
    public void user_select_the_BU_Functional_Type_BUFunctionalSubType_Dropdown(){
        LocationManagement.getRandomBUFunctionalTypeSubTypeDropdown();
    }
    @And("User Enters Total Area SQFT")
    public void user_enters_Total_Area_SQFT() {
        LocationManagement.enterTotalAreaSQFT();
    }
    @And("User clicks on Service Group Check box")
    public void User_clicks_on_Service_Group_Check_box() {
        LocationManagement.clickRandomServiceGroupCheckBoxSubType();
    }
    @Then("User verifies added BU Functionality Sub Type details in table")
    public void user_verifies_added_BU_Functionality_Sub_Type_details_in_table(){
        LocationManagement.verifyBUFunctionalitySubTypeName();
        LocationManagement.verifyBUFunctionalTypeSubType();
    }
    @And("User Enters Size Attribute Code")
    public void user_enters_Size_Attribute_Code() {
        LocationManagement.enterSizeAttributeCode();
    }
    @When("User select the BU Size Attribute record to edit")
    public void user_select_the_BU_Size_Attribute_record_to_edit() {
        LocationManagement.getRandomBUSizeAttributeRecord();
    }
    @And("User Enters Size Attribute Name")
    public void user_enters_Size_Attribute_Name() {
        LocationManagement.enterSizeAttributeName();
    }
    @And("User Enters Size Attribute Measuring Value")
    public void user_enters_Size_Attribute_Measuring_Value() {
        LocationManagement.enterSizeAttributeMeasuringValue();
    }
    @Then("User verifies added BU Sub Attribute details in table")
    public void user_verifies_added_BU_Sub_Attribute_details_in_table(){
        LocationManagement.verifySizeAttributeCode();
        LocationManagement.verifySizeAttributeName();
        LocationManagement.verifySizeAttributeMeasuringValue();
    }
    @And("User Enters Size Type Code")
    public void user_enters_Size_Type_Code() {
        LocationManagement.enterSizeTypeCode();
    }
    @When("User select the BU Size Type record to edit")
    public void user_select_the_BU_Size_Type_record_to_edit() {
        LocationManagement.getRandomBUSizeTypeRecord();
    }
    @And("User Enters Size Type Name")
    public void user_enters_Size_Type_Name() {
        LocationManagement.enterSizeTypeName();
    }
    @When("User select the BU Size Attribute BUSizeType dropdown")
    public void user_select_the_BU_BU_Size_ttribute_BUSizeType_dropdown(){
        LocationManagement.getRandomBUSizeAttributeBUSizeTypeDropdown();
    }
    @When("User select the BU Functional Type BUSizeType dropdown")
    public void user_select_the_BU_Functional_Type_BUSizeType_dropdown(){
        LocationManagement.getRandomBUFunctionalTypeBUSizeTypeDropdown();
    }
    @When("User select the BU Functional Sub Type BUSizeType dropdown")
    public void user_select_the_BU_Functional_Sub_Type_BUSizeType_dropdown(){
        LocationManagement.getRandomBUFunctionalSubTypeBUSizeTypeDropdown();
    }
    @Then("User verifies added BU Sub Type details in table")
    public void user_verifies_added_BU_Sub_Type_details_in_table(){
        LocationManagement.verifySizeTypeCode();
        LocationManagement.verifySizeTypeName();
        LocationManagement.verifyBUSizeAttributeBUSizeType();
        LocationManagement.verifyBUFunctionalTypeBUSizeType();
        LocationManagement.verifyBUFunctionalSubTypeBUSizeType();
    }
    @And("User Enters BU Criticality Name")
    public void user_enters_BU_Criticality_Name() {
        LocationManagement.enterBUCriticalityName();
    }
    @When("User select the BU Criticality record to edit")
    public void user_select_the_BU_Criticality_record_to_edit() {
        LocationManagement.getRandomBUCriticalityRecord();
    }
    @Then("User verifies added BU Criticality details in table")
    public void user_verifies_added_BU_Criticality_details_in_table(){
        LocationManagement.verifyBUCriticalityName();
    }
    @When("User get Base Unit default code field value")
    public void user_get_Base_Unit_default_code_field_value() {
        By shortCodeLocator = By.xpath("//input[@id='radtxtBUCode']");
        String shortCode = helperUtils.getAndStoreDefaultFieldValue(driver, shortCodeLocator);
        LocationManagement.testDataModel.setBaseUnitCode(shortCode);
        System.out.println("Elements found: " + shortCode);
    }
    @And("User Enters Base Unit Name")
    public void user_enters_Base_Unit_Name() {
        LocationManagement.enterBaseUnitName();
    }
    @When("User select the Base Unit record to edit")
    public void user_select_the_Base_Unit_record_to_edit() {
        LocationManagement.getRandomBaseUnitRecord();
    }
    @When("User select the Property Zone SubZone dropdown in Base Unit")
    public void user_select_the_Property_Zone_SubZone_dropdown_in_Base_Unit(){
        LocationManagement.getRandomPropertyBaseUnitDropdown();
        LocationManagement.getRandomZoneBaseUnitDropdown();
        LocationManagement.getRandomSubZoneBaseUnitDropdown();
    }
    @When("User select the BUF Type and BUF SubType dropdown in Base Unit")
    public void user_select_the_BUF_Type_BUF_SubType_dropdown_in_Base_Unit(){
        LocationManagement.getRandomBUFTypeBaseUnitDropdown();
        LocationManagement.getRandomBUFSubTypeBaseUnitDropdown();
    }
    @When("User select the BU Size Type and BU Criticality dropdown in Base Unit")
    public void user_select_the_BU_Size_Type_BU_Criticality_dropdown_in_Base_Unit(){
        LocationManagement.getRandomBUSizeTypeBaseUnitDropdown();
        LocationManagement.getRandomBUCriticalityBaseUnitDropdown();
    }
    @And("User Enters Remarks in Base Unit")
    public void user_enters_Remarks_Base_Unit() {
        LocationManagement.enterRemarksBaseUnit();
    }
    @And("User Enters Base Unit Reference Code")
    public void user_enters_Base_Unit_Reference_Code() {
        LocationManagement.enterBaseUnitReferenceCode();
    }
    @Then("User verifies added Base Unit details in table")
    public void user_verifies_added_Base_Unit_details_in_table(){
        LocationManagement.verifyBaseUnitCode();
        LocationManagement.verifyBaseUnitName();
        LocationManagement.verifySubZoneBaseUnit();
        LocationManagement.verifyZoneBaseUnit();
        LocationManagement.verifyPropertyBaseUnit();
        LocationManagement.verifyBUFTypeBaseUnit();
        LocationManagement.verifyBUFSubTypeBaseUnit();
        LocationManagement.verifyBUFCriticalityBaseUnit();

    }
    @And("User clicks on Location Save button For InLine Error")
    public void user_clicks_on_Location_save_button_for_in_line_error() {
        LocationManagement.clickLocationSaveButtonInlineError();
    }
    @When("user verify the chars min len as {int} and max len as {int} for City Name")
    public void user_verify_chars_len_City_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtCityName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Area Group")
    public void user_verify_chars_len_Area_Group(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtAreaGroupName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Area")
    public void user_verify_chars_len_Area(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtAreaName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Property Name")
    public void user_verify_chars_len_Property_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtPropName']"),maxLen, minLen);
    }
    @When("user verify the chars max len as {int} for Property Project NO")
    public void user_verify_chars_len_Property_Project_NO(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_txtProjectNo']"),maxLen, null);
    }
    @When("user verify the chars max len as {int} for Property Plot NO")
    public void user_verify_chars_len_Property_Plot_NO(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_txtPlotno']"),maxLen, null);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Property Reference Code")
    public void user_verify_chars_len_Property_Reference_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='RadTextExternalRefCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Zone Group Code")
    public void user_verify_chars_len_Zone_Group_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtZoneGroupCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Zone Group Name")
    public void user_verify_chars_len_Zone_Group_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtZoneGroupName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Zone Name")
    public void user_verify_chars_len_Zone_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtZoneName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Sub Zone Name")
    public void user_verify_chars_len_Sub_Zone_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtsubzonename']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Base Unit Name")
    public void user_verify_chars_len_Base_Unit_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtBUName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Base Unit Remarks")
    public void user_verify_chars_len_Base_Unit_Remarks(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='RadTxtRemarks']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Sub Unit Code")
    public void user_verify_chars_len_Sub_Unit_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtSubUnitCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Sub Unit Name")
    public void user_verify_chars_len_Sub_Unit_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtSubUnitName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Space Name")
    public void user_verify_chars_len_Space_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtSpName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Zone Criticality")
    public void user_verify_chars_len_Zone_Criticality(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtZoneCriticality']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for Zone Group Criticality")
    public void user_verify_chars_len_Zone_Group_Criticality(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtZoneGroupCriticality']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Functional Type Name")
    public void user_verify_chars_len_BU_Functional_Type_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtBusinesstype']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Functional Sub Type Name")
    public void user_verify_chars_len_BU_Functional_Sub_Type_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtBussubtypename']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Functional Sub Type Area SQFT")
    public void user_verify_chars_len_BU_Functional_Sub_Type_Area_SQFT(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtTotalSqft']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Size Attribute Code")
    public void user_verify_chars_len_BU_Size_Attribute_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtAttributeCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Size Attribute Name")
    public void user_verify_chars_len_BU_Size_Attribute_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtAttributeName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Size Attribute Measuring Value")
    public void user_verify_chars_len_BU_Size_Attribute_Measuring_Value(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtMeasuringValue']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Size Type Code")
    public void user_verify_chars_len_BU_Size_Type_Code(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtBUSizeTypeCode']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Size Type Name")
    public void user_verify_chars_len_BU_Size_Type_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtBUSizeTypeName']"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} for BU Criticality Name")
    public void user_verify_chars_len_BU_Criticality_Name(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtBUCriticalityName']"),maxLen, minLen);
    }















}
