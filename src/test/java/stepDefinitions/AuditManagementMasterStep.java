package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AuditManagement;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;

public class AuditManagementMasterStep {
    private final WebDriver driver = DriverFactory.getDriver();
    AuditManagement auditManagement = new AuditManagement(driver);
    private final HelperUtils helperUtils = new HelperUtils(driver);


    @When("User Enters Short Name")
    public void user_enter_short_name_as(){
        auditManagement.enterShortName();
    }

    @When("User selects Audit type as {string}")
    public void user_selects_audit_type_as(String auditType) throws InterruptedException {
        ElementUtils.userWaitsForSeconds(2);
        if(auditType == null || auditType.isEmpty()){
            auditManagement.getRandomAuditTypeinDropdown();
            return;
        }
        auditManagement.selectAuditType(auditType);
    }


    @When("User Enters Category Name")
    public void User_Enters_Category_Name_as(){
        auditManagement.enterCategoryName();
    }

    @When("User {string} active checkbox")
    public void user_active_checkbox(String activestatus) {
        auditManagement.selectActiveAs(activestatus);
    }

    @When("User clicks on Save button in Audit Management Elements Section")
    public void User_clicks_on_save_button(){
        auditManagement.clickSaveButton();
    }

    @Then("User verifies added short name in table")
    public void user_verifies_added_short_name_in_table() throws InterruptedException {
        AuditManagement.verifyShortName();

        //below step needs reEval
        auditManagement.verifyEditableDetailsInTableAfterSearch();
    }


    @And("User clicks on Update button")
    public void user_edits_shortname_audittype_categoryname_for_an_audit_record() throws InterruptedException {
        auditManagement.clickUpdateButton();
    }

    @When("User select the {string} Audit management record to edit")
    public void user_select_the_auditmanagement_record_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomRecord();
            return;
        }
        auditManagement.searchAndSelectShort(value);
    }

    @Then("User verifies modified details in table")
    public void user_verifies_modified_details_in_table() throws InterruptedException {
        AuditManagement.verifyShortName();
        auditManagement.verifyEditableDetailsInTableAfterSearch();
    }
    @Then("User clicks on first available audit to delete")
    public void user_clicks_on_first_available_audit_to_delete() {
        AuditManagement.clickDeleteButton();
    }
    @When("User verify if the audit is deleted")
    public void user_verify_audit_deleted() {
        AuditManagement.verifyNoRecordsPresent();
    }
    @Then("User verifies inactive Short is not in records table")
    public void user_verifies_inactive_short_is_not_in_records_table() {
        AuditManagement.verifyNoRecordsPresent();
    }

    @When("user verify the chars and max len as {int} for Short Name")
    public void user_verify_chars_len_ShortName(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtAudCode']"),maxLen, null);
    }

    @When("user verify the chars and max len as {int} for Audit Master Category Name")
    public void user_verify_chars_len_Category_Name(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtAudiMsrName']"),maxLen, null);
    }

    @When("user verify the chars and max len as {int} for Authority Name")
    public void user_verify_chars_len_Authority_Name(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtAuthCode']"),maxLen, null);
    }

    @When("user verify the chars and max len as {int} for Authority Description")
    public void user_verify_chars_len_Authority_Description(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtDescr']"),maxLen, null);
    }

    @Then("user verify the inline error message {string} on Audit Mastery Category")
    public void verify_inline_error_msg_in_Audit_Mastery_Cat(String error){
        By errorPath = By.xpath("(//span[contains(@id,'ctl00_ContentPlaceHolder1') and text()='"+error+"'])[1]");
        helperUtils.verifyInlineErrorMessage(errorPath, error);
    }

    @And("User clicks on the {string} tab in Audit Management page")
    public void user_clicks_on_the_Enforcing_Authority_tab(String tabname) {
        AuditManagement.clickOnElementTabSelectedElement(tabname);
    }

    @And("User Enters Authority Name")
    public void user_enters_authority_name() {
        AuditManagement.enterAuthorityName();
    }

    @And("User Enters Authority Description")
    public void user_enters_authority_description() {
        AuditManagement.enterAuthorityDescription();
    }

    @Then("User verifies added Authority details in table")
    public void user_verifies_added_authority_details_in_table() throws InterruptedException {
        AuditManagement.verifyAuthorityName();
        AuditManagement.verifyAuthorityDescription();
    }

    @When("User select the {string} Enforce Authority record to edit")
    public void user_select_the_Enforceauthority_record_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomRecordinAuthority();
            return;
        }
        auditManagement.searchAndSelectAuthority(value);
    }

    @Then("User verifies Editable details in table")
    public void userVerifies_Editable_Details_In_Table() throws InterruptedException {
        AuditManagement.tableHasEditbleAuthorityName();
        auditManagement.verifyEditableAuthorityDescriptioninTable();
    }

    @When("User verify if the authority is deleted")
    public void user_verify_authority_deleted() {
        AuditManagement.verifyNoAuthorityRecordsPresent();
    }

    @And("User clicks on Save button For InLine Error")
    public void user_clicks_on_save_button_for_in_line_error() {
        AuditManagement.clickSaveButtonInlineError();
    }

    @And("User Enters Industry Standard Code")
    public void User_Enters_Industry_Standard_Code(){
        AuditManagement.enterIndustryStandardCode();
    }

    @And("User Enters Industry Standard Description")
    public void User_Enters_Industry_Standard_Description(){
        AuditManagement.enterIndustryStandardDescription();

    }
    @And("User selects SME type as {string}")
    public void user_selects_SME_Type_as(String value){
        ElementUtils.userWaitsForSeconds(2);
        if(value == null || value.isEmpty()){
            auditManagement.getRandomSMETypeinDropdown();
            return;
        }
        auditManagement.searchAndSelectSMEType(value);
    }
    @When("User select the {string} Enforcing Authority dropdown")
    public void user_select_the_Enforceauthority_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomEAuthorityinDropdown();
            return;
        }
        auditManagement.searchAndSelectEnforcingAuthority(value);
    }
    @Then("User verifies added Industry Standard details in table")
    public void user_verifies_added_industry_standard_details_in_table() throws InterruptedException {
        AuditManagement.verifyIndustryStandardCode();
        AuditManagement.verifyIndusStandardDescription();
        AuditManagement.verifyEnforcingAuthority();
        AuditManagement.verifySME();
    }

    @When("User select the {string} Industry Standard record to edit")
    public void user_select_the_IndustryStandard_record_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getIndustryStandardfirstRecord();
            return;
        }
        auditManagement.searchAndSelectIndustryRecord(value);
    }
    @When("User verify if the Industry Standard record is deleted")
    public void user_verify_Industry_Standard_record_deleted() {
        AuditManagement.verifyNoIndustryRecordsPresent();
    }
    @When("user verify the chars and max len as {int} for Industry Standard Code")
    public void user_verify_chars_len_Industry_Standard_Code(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtStdCode']"),maxLen, null);
    }

    @When("user verify the chars and max len as {int} for Industry Standard Description")
    public void user_verify_chars_len_Industry_Standard_Description(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//textarea[@id = 'RadtxtIndustryStdDesc']"),maxLen, null);
    }

    @When("User select the {string} Industry Standards dropdown")
    public void user_select_the_Industry_Standards_Dropdown(String value) throws InterruptedException {
        ElementUtils.userWaitsForSeconds(3);
        if(value == null || value.isEmpty()){
            auditManagement.getRandomIstandardinDropdown();
            return;
        }
        auditManagement.searchAndSelectIndustryStandard(value);
    }
    @And("User Enters Clause Name")
    public void User_Enters_Clause_Name(){
        AuditManagement.enterClauseName();
    }
    @And("User Enters Clause Description")
    public void User_Enters_Clause_Description(){
        AuditManagement.enterClauseDescription();

    }
    @Then("User verifies added Clause details in table")
    public void user_verifies_added_Clause_details_in_table() throws InterruptedException {
        AuditManagement.verifyClauseName();
        AuditManagement.verifyClauseDescription();
        AuditManagement.verifyIndustryStandards();
    }
    @When("User select the {string} Clause record to edit")
    public void user_select_the_Clause_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getClauseNamefirstRecord();
            return;
        }
        auditManagement.searchAndSelectClauseName(value);
    }

    @When("User verify if the Clause record is deleted")
    public void user_verify_Clause_record_deleted() {
        AuditManagement.verifyNoClauseRecordsPresent();
    }
    @When("user verify the chars and max len as {int} for Clause Name")
    public void user_verify_chars_len_Clause_Name(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radTxtClause']"),maxLen, null);
    }

    @When("user verify the chars and max len as {int} for Clause Description")
    public void user_verify_chars_len_Clause_Description(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//span/textarea[@id = 'radTxtClauseDes']"),maxLen, null);
    }
    @When("User select the {string} Legal Enforcing Authority dropdown")
    public void user_select_the_Legal_Enforceauthority_Dropdown(String value) throws InterruptedException {
        ElementUtils.userWaitsForSeconds(3);
        if(value == null || value.isEmpty()){
            auditManagement.getRandomLEAuthorityDropdown();
            return;
        }
        auditManagement.searchAndSelectLEAuthority(value);
    }
    @And("User Enters Legal Requirement Name")
    public void User_Enters_Legal_Requirement_Name(){
        AuditManagement.enterLRequirementName();
    }
    @And("User Enters Legal Requirement Description")
    public void User_Enters_Legal_Requirement_Description(){
        AuditManagement.enterLRequirementDescription();

    }
    @Then("User verifies added Legal Requirement details in table")
    public void user_verifies_added_Legal_Requirement_details_in_table() throws InterruptedException {
        AuditManagement.verifyLegalRequirementName();
        AuditManagement.verifyLegalRequirementDescription();
        AuditManagement.verifyLegalEnforcingAuthority();
    }
    @When("User select the {string} Legal Requirement record to edit")
    public void user_select_the_Legal_Requirement_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getLRequirementNamefirstRecord();
            return;
        }
        auditManagement.searchAndSelectLRequirementName(value);
    }
    @When("User verify if the Legal Requirement record is deleted")
    public void user_verify_Legal_Requirement_record_deleted() {
        AuditManagement.verifyNoLRequirementRecordsPresent();
    }
    @When("user verify the chars and max len as {int} for Legal Requirement Name")
    public void user_verify_chars_len_Legal_Requirement_Name(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtLegal']"),maxLen, null);
    }
    @When("user verify the chars and max len as {int} for Legal Requirement Description")
    public void user_verify_chars_len_Legal_Requirement_Description(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtLegDesc']"),maxLen, null);
    }
    @And("User Enters Audit Task Frequency Code Name Period Colour")
    public void User_Enters_Audit_Task_Frequency_Code_Name_Period(){
        AuditManagement.enterAFrequencyCode();
        AuditManagement.enterAFrequencyName();
        AuditManagement.enterAFrequencyPeriod();
        AuditManagement.getRandomColourCode();
    }
    @And("User Enters Pre Post Tolerance details")
    public void User_Enters_Pre_Post_Tolerance_details(){
        AuditManagement.enterPreTolerance();
        AuditManagement.enterPostTolerance();
    }
    @When("User select the {string} Audit Schedule Elapse dropdown")
    public void user_select_the_Audit_Schedule_Elapse_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomAScheduleElapseDropdown();
            return;
        }
        auditManagement.searchAndSelectAScheduleElapse(value);
    }
    @Then("User verifies added Audit Frequency details in table")
    public void user_verifies_added_Audit_Frequency_details_in_table() throws InterruptedException {
        AuditManagement.verifyAFrequencyCode();
        AuditManagement.verifyAFrequencyName();
        AuditManagement.VerifyPreTolerance();
        AuditManagement.VerifyPostTolerance();
    }
    @When("User select the {string} Audit Frequency record to edit")
    public void user_select_the_Audit_Frequency_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()) value = auditManagement.getAuditFrequencyRandomEdit();
        auditManagement.searchAndSelectAuditFrequencyEdit(value);
    }
    @When("User verify if the Audit Frequency record is deleted")
    public void user_verify_Audit_Frequency_record_deleted() {
        AuditManagement.verifyNoAuditFrequencyRecordsPresent();
    }
    @When("user verify the chars and max len as {int} for Audit Frequency Code")
    public void user_verify_chars_len_Audit_Frequency_Code(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtMarkingChar']"),maxLen, null);
    }
    @When("user verify the chars and max len as {int} for Audit Frequency Name")
    public void user_verify_chars_len_Audit_Frequency_Name(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtFreqName']"),maxLen, null);
    }
    @When("user verify the chars and max len as {int} for Frequency Period")
    public void user_verify_chars_len_Frequency_Period(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='txtFreqPeriod']"),maxLen, null);
    }
    @When("user verify the chars and max len as {int} for Pre Tolerance")
    public void user_verify_chars_len_Pre_Tolerance(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtTolerance1']"),maxLen, null);
    }
    @When("user verify the chars and max len as {int} for Post Tolerance")
    public void user_verify_chars_len_Post_Tolerance(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtTolerance2']"),maxLen, null);
    }





















    @When("User select the {string} Audit Reason Type dropdown")
    public void user_select_the_Audit_Reason_Type_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomAuditReasonDropdown();
            return;
        }
        auditManagement.searchAndSelectAuditReason(value);
    }
    @And("User Enters Audit Reason")
    public void User_Enters_Audit_Reason(){
        AuditManagement.enterAuditReason();
    }
    @Then("User verifies added Audit Reason details in table")
    public void user_verifies_added_Audit_Reason_details_in_table() throws InterruptedException {
        AuditManagement.verifyAuditReason();
        AuditManagement.verifyAuditReasonType();
    }
    @When("User select the {string} Audit Reason record to edit")
    public void user_select_the_Audit_Reason_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()) value = auditManagement.getAuditReasonfirstRecord();
        auditManagement.searchAndSelectAuditReasonEdit(value);
    }
    @When("User verify if the Audit Reason record is deleted")
    public void user_verify_Audit_Reason_record_deleted() {
        AuditManagement.verifyNoAuditReasonRecordsPresent();
    }
    @When("user verify the chars and max len as {int} for Audit Reason")
    public void user_verify_chars_len_Legal_Audit_Reason(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtReason']"),maxLen, null);
    }
    @And("User Enters {string} LOV Group")
    public void User_Enters_LOV_Group(String value){
        if(value == null || value.isEmpty()){
            AuditManagement.RandomLOVGroup();
            return;
        }
        auditManagement.enterLOVGroup(value);
    }
    @Then("User verifies added LOV Group details in table")
    public void user_verifies_added_LOV_Group_details_in_table() throws InterruptedException {
        AuditManagement.verifyLOVGroup();
    }
    @When("User select the {string} LOV Group record to edit")
    public void user_select_the_LOV_Group_record_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()) value = auditManagement.getLOVGroupfirstRecord();
        auditManagement.searchAndSelectLOVGroupEdit(value);
    }
    @When("User select the {string} LOV Group record to try deleting")
    public void user_select_the_LOV_Group_record_to_trying_delete(String value) throws InterruptedException {
        if(value == null || value.isEmpty()) value = auditManagement.getLOVGroupfirstRecordtodelete();
        auditManagement.searchAndSelectLOVGroupdelete(value);
    }

    @Then("User clicks on first available LOV Group trying to delete")
    public void user_clicks_on_first_available_LOV_Group_trying_to_delete() {
        AuditManagement.trytoDeleteButton();
    }
    @Then("User verifies deleted LOV Group details in table")
    public void user_verifies_deleted_LOV_Group_details_in_table() throws InterruptedException {
        AuditManagement.verifydeletedLOVGroup();
    }
    @When("user verify the chars and max len as {int} for LOV Group")
    public void user_verify_chars_len_Legal_LOV_Group(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='radtxtLOVGroup']"),maxLen, null);
    }
    @When("User select the {string} LOV Group dropdown")
    public void user_select_the_LOV_Group_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomLOVGroupDropdown();
            return;
        }
        auditManagement.searchAndSelectLOVGroup(value);
    }
    @When("User enters {string} LOV Value")
    public void user_enters_LOV_Value(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.enterrandomLOVValue();
            return;
        }
        auditManagement.enterLOVValue(value);
    }
    @When("User enters {string} LOV Description")
    public void user_enters_LOV_Description(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.enterrandomLOVDescription();
            return;
        }
        auditManagement.enterLOVDescription(value);
    }
    @When("User select the {string} LOV Type dropdown")
    public void user_select_the_Answer_Type_dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomLOVTypeDropdown();
            return;
        }
        auditManagement.SelectLOVTypeDropdown(value);
    }
    @When("User enters {string} Result Score")
    public void user_enters_Result_Score(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.enterrandomResultScore();
            return;
        }
        auditManagement.enterResultScore(value);
    }
    @Then("User verifies added LOV Value details in table")
    public void user_verifies_added_LOV_Value_details_in_table() throws InterruptedException {
        AuditManagement.verifyLOVValue();
        AuditManagement.verifyLOVGroupValue();
        AuditManagement.verifyLOVDescription();
        AuditManagement.verifyLOVType();
        AuditManagement.verifyResultScore();
    }
    @When("User select the {string} Service Group dropdown")
    public void user_select_the_Service_Group_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomServiceGroupDropdown();
            return;
        }
        auditManagement.searchAndSelectServiceGroup(value);
    }
    @When("User select the {string} Fault Category dropdown")
    public void user_select_the_Fault_Category_dropdown(String value) throws InterruptedException {
        ElementUtils.userWaitsForSeconds(2);
        if(value == null || value.isEmpty()){
            auditManagement.getFaultCategoryDropdown();
            return;
        }
        auditManagement.searchAndSelectFaultCategory(value);
    }
    @When("User select the {string} Fault Code dropdown")
    public void user_select_the_Fault_Code_dropdown(String value) throws InterruptedException {
        ElementUtils.userWaitsForSeconds(2);
        if(value == null || value.isEmpty()){
            auditManagement.getRandomFaultCodeDropdown();
            return;
        }
        auditManagement.searchAndSelectFaultCode(value);
    }
    @When("User select the {string} Priority dropdown")
    public void user_select_the_Priority_dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomPriorityDropdown();
            return;
        }
        auditManagement.searchAndSelectPriority(value);
    }
    @When("User select the {string} Contract Group dropdown")
    public void user_select_the_Contract_Group_dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomContractGroupDropdown();
            return;
        }
        auditManagement.searchAndSelectContractGroup(value);
    }
    @Then("User verifies added LOV Value Negative Action details in table")
    public void user_verifies_added_LOV_Value_Negative_Action_details_in_table() throws InterruptedException {
        AuditManagement.verifyLOVFaultCode();
        AuditManagement.verifyLOVPriority();
        AuditManagement.verifyLOVContractGroup();
    }
    @When("User select the {string} Audit LOV Value record to edit")
    public void user_select_the_Audit_LOV_Value_record_to_edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()) value = auditManagement.getLOVValueRandomEdit();
        auditManagement.searchAndSelectLOVValueEdit(value);
    }
    @When("User select the {string} LOV Type dropdown Edit")
    public void user_select_the_Answer_Type_dropdown_Edit(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            auditManagement.getRandomLOVTypeEditDropdown();
            return;
        }
        auditManagement.SelectLOVTypeEditDropdown(value);
    }
    @When("User select the {string} Random Audit LOV Value record to Delete")
    public void user_select_the_Random_Audit_LOV_Value_record_to_Delete(String value) throws InterruptedException {
        if(value == null || value.isEmpty()) value = auditManagement.getLOVValueRandomDelete();
        auditManagement.searchAndSelectLOVValueDelete(value);
    }
    @Then("User clicks on first available LOV Value to delete")
    public void user_clicks_on_first_available_LOV_Value_to_delete() {
        AuditManagement.clickDeleteButton();
    }
    @When("User verify if the LOV Value record is deleted")
    public void user_verify_LOV_Value_record_deleted() {
        AuditManagement.verifyNoLOVValueRecordsPresent();
    }


    @When("user verify the chars and max len as {int} for LOV Value")
    public void user_verify_chars_len_LOV_Value(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rtbValue']"),maxLen, null);
    }
    @When("user verify the chars and max len as {int} for LOV Value Description")
    public void user_verify_chars_len_LOV_Value_Description(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_RadWinAuditQuestionLOVValue_C_rtbDescription']"),maxLen, null);
    }









}
