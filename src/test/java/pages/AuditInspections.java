package pages;

import lombok.Getter;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.knowm.xchart.internal.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.*;

import java.security.Key;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.logging.Logger;

import static pages.AuditManagement.NO_RECORDS_DISPLYED_IN_LIST;
import static pages.BasePage.driver;
import static utils.ElementUtils.waitForDropdownLoading;
import static utils.JavaScriptExeUtil.jsClick;

public class AuditInspections extends BasePage{
    public AuditInspections(WebDriver driver) { super(driver);}
    static TestDataGenerator dataGenerator = new TestDataGenerator();
    @Getter
    static TestDataModel testDataModel = new TestDataModel();
    static Actionutils action = new Actionutils(driver);
    JavaScriptExeUtil jsutil = new JavaScriptExeUtil(driver);
    private static final Logger LOGGER = Logger.getLogger(AuditManagement.class.getName());

    //Audit Schedules
    public static final By PAGE_LOADER = By.xpath("//div[@id='LoadingPanelctl00_ContentPlaceHolder1_RadAjaxPanel2']");
    public static final By AUDIT_NO = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtAuditNo']");
    public static final By SCHEDULE_NO = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtScheduleNo']");
    public static final By AUDIT_MASTER_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AduitMC_Combo1_Input']");
    public static final By ALL_OPTIONS_AUDIT_MASTER_CATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_AduitMC_Combo1_DropDown']/div/ul/li");
    public static final By AUDIT_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AduitC_Combo2_Input']");
    public static final By ALL_OPTIONS_AUDIT_CATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_AduitC_Combo2_DropDown']/div/ul/li");
    public static final By SCHEDULE_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadTxt_AsheCat']");
    public static final By CHECK_ALLAPPLICABLE_ZONES = By.xpath("//input[@class='rlbCheckAllItemsCheckBox']");
    public static final By CLIENT_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ddlClient_Input']");
    public static final By ALL_OPTIONS_CLIENT = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ddlClient_DropDown']/div/ul/li");
    public static final By CLIENT_CONTRACT_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ddlClientContract_Input']");
    public static final By ALL_OPTIONS_CLIENT_CONTRACT = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ddlClientContract_DropDown']/div/ul/li");
    public static final By PROPERTY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AduitSubComunity_Combo3_Input']");
    public static final By ALL_OPTIONS_PROPERTY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_AduitSubComunity_Combo3_DropDown']/div/ul/li");
    public static final By PRIMARY_AUDITEE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadPrimaryAudity_Combo4_Input']");
    public static final By ALL_OPTIONS_PRIMARY_AUDITEE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadPrimaryAudity_Combo4_DropDown']/div/ul/li");
    public static final By FREQUENCY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadFrequency_Combo5_Input']");
    public static final By ALL_OPTIONS_FREQUENCY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadFrequency_Combo5_DropDown']/div/ul/li");
    public static final By AUDIT_COMPANY_TYPE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadAuditCompany_Combo6_Input']");
    public static final By ALL_OPTIONS_AUDIT_COMPANY_TYPE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadAuditCompany_Combo6_DropDown']/div/ul/li");
    public static final By AUDITOR_DESIGNATION = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadExpectedAuditor_Combo7_Input']");
    public static final By ALL_OPTIONS_AUDITOR_DESIGNATION = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadExpectedAuditor_Combo7_DropDown']/div/ul/li");
    public static final By SCHEDULE_START_DATE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadStartDate_Combo5_dateInput']");
    public static final By SCHEDULE_END_DATE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadEndDate_dateInput']");
    public static final By NO_END_DATE_CHECKBOX = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_chkEndDate']");
    public static final By SAVE_GENARET_SCHEDULE_BUTTON = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadSaveGenerate']");
    public static final By SEARCH_SCHEDULE_NO = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00_ctl02_ctl02_FilterTextBox_idlink']");
    public static final By SAVE_BUTTON = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadSave']");
    public static final By STATUS_SEARCH = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00_ctl02_ctl02_FilterTextBox_status']");
    public static final By SEARCH_SCHEDULE_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00_ctl02_ctl02_FilterTextBox_Schedule_ID']");
    public static final By SEARCH_PROPERTY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00_ctl02_ctl02_FilterTextBox_SubCommunityName']");
    public static final By ALL_OPTIONS_SEARCH_SCHEDULE_NO = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']//tr[contains(@id, 'ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00')]/td[1]");
    public static final By DELETE_SCHEDULE_BUTTON = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00_ctl04_ImageButton1']");
    public static final By PAGE_SIZE = By.xpath("//div[contains(@id, 'PageSizeComboBox') and contains(@class, 'RadComboBox RadComboBox_Telerik')]");
    public static final By DRAFTS_AUDIT =By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']/tbody/tr[2]/td[3][text()='Draft']");

    //UnScheduled Audits

    public static final By USAUDIT_MASTER_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_cboMasterCategory_Input']");
    public static final By ALL_OPTIONS_US_AUDIT_MASTER_CATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_cboMasterCategory_DropDown']/div/ul/li");
    public static final By USAUDIT_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_cboAuditCategory_Input']");
    public static final By ALL_OPTIONS_US_AUDIT_CATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_cboAuditCategory_DropDown']/div/ul/li");
    public static final By USSCHEDULE_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtAuditName']");
    public static final By USCLIENT_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ddlClient_Input']");
    public static final By USPROPERTY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_cboSubCommunity_Input']");
    public static final By ALL_OPTIONS_US_PROPERTY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_cboSubCommunity_DropDown']/div/ul/li");
    public static final By AUDITOR_COMPANY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_cboAuditCompany_Input']");
    public static final By ALL_OPTIONS_AUDITOR_COMPANY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_cboAuditCompany_DropDown']/div/ul/li");
    public static final By AUDITEE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_cboPrimaryAuditeeContract_Input']");
    public static final By ALL_OPTIONS_AUDITEE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_cboPrimaryAuditeeContract_DropDown']/div/ul/li");
    public static final By AUDITEE_STAFF_NAME_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_cboPrimaryAuditeeStaff_Input']");
    public static final By ALL_OPTIONS_AUDITEE_STAFF_NAME = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_cboPrimaryAuditeeStaff_DropDown']/div/ul/li");
    public static final By AUDITOR_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_cboAuditor_Input']");
    public static final By ALL_OPTIONS_AUDITOR = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_cboAuditor_DropDown']/div/ul/li");
    public static final By SAVE_CREATE_UNSCHEDULED_AUDIT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadSave']");
    public static final By SEARCH_AUDIT_NO = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00_ctl02_ctl02_FilterTextBox_AuditNo']");
    public static final By SEARCH_AUDITE_CATEGORY_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00_ctl02_ctl02_FilterTextBox_CategoryName']");
    public static final By DELETE_ASSIGNED_AUDITS = By.xpath("//button[@value='Delete']");
    public static final By REASON_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinModalPopupForAuditorAccept_C_ddlReasons_Input']");
    public static final By ALL_OPTIONS_REASON = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinModalPopupForAuditorAccept_C_ddlReasons_DropDown']/div/ul/li");
    public static final By REMARKS_TEXTBOX = By.xpath("//textarea[@id='txtDeleteRemarks']");
    public static final By DELETE_AUDIT_DELETION = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinModalPopupForAuditorAccept_C_btnAuditorDelete']");
    public static final By RESCHEDULE_ASSIGNED_AUDIT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00_ctl04_rdRschedule']");
    public static final By AUDIT_CHANGE_DATE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinReSchedule_C_rdchangedate_dateInput']");
    public static final By RESCHEDULE_REMARKS_TEXTBOX = By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_RadWinReSchedule_C_txtRadRemarksAdmin']");
    public static final By RESCHEDULE_SAVE_BUTTON = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinReSchedule_C_RadSaveAudit']");
    public static final By ASSIGN_BUTTON = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00_ctl04_RdbAuditNo']");

    //Open Audits
    private static final Map<String, By> AUDIT_STATUS_TABS = Map.of(
            "UNASSIGNED", By.id("tabUnassigned"),
            "OVERDUE",    By.id("tabOverDue"),
            "UPCOMING",   By.id("tabNotDue"),
            "IN PROGRESS",By.id("tabOpen"),
            "ALL",        By.id("tabAll")
    );
    public static final By SEARCH_SCHEDULE_NUMBER = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_grdUnassigned_ctl00_ctl02_ctl02_FilterTextBox_idlink']");
    public static final By SEARCH_SCHEDLE_ON = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_grdUnassigned_ctl00_ctl02_ctl02_FilterTextBox_AuditDateTime']");
    public static final By DELETE_UNASSIGNED_AUDIT = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_grdUnassigned_ctl00_ctl04_ImageButtonUnassigned']");
    public static final By DELETE_OVERDUE_AUDIT = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_GrdOverDue_ctl00_ctl04_ImageButtonOverDue']");
    public static final By DELETE_INPROGRESS_AUDIT = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_GrdDraft_ctl00_ctl04_ImageButtonDraft']");
    public static final By DELETE_UPCOMING_AUDIT = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_GrdNotDue_ctl00_ctl04_ImageButtonNotDue']");
    public static final By DELETE_ALL_AUDIT = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_GrdAll_ctl00_ctl04_ImageButtonAll']");
    public static final By ALL_UNASSIGNED_SCHEDULE_AUDITS = By.xpath("//table[contains(@id, 'grdUnassigned')]//tr[contains(@id, 'grdUnassigned')]/td[2]");
    public static final By UNASSIGN_SELECTED_AUDIT = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_ucAdmDash_grdUnassigned_ctl00__0']");
    public static final By OVERDUE_SELECTED_AUDIT = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_ucAdmDash_GrdOverDue_ctl00__0']");
    public static final By TRANSFER_AUDIT = By.xpath("//button[@id = 'ctl00_ContentPlaceHolder1_ucAdmDash_GrdOverDue_ctl00_ctl04_RdbAuditNoAdmin']");
    public static final By TRANSFER_AUDITOR_COMPANY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radWinAuditorTransfer_C_raddrpToAuditorComapny_Input']");
    public static final By ALL_OPTIONS_TRANSFER_COMPANY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radWinAuditorTransfer_C_raddrpToAuditorComapny_DropDown']/div/ul/li");
    public static final By TRANSFER_AUDITOR_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radWinAuditorTransfer_C_raddrpToAuditor_Input']");
    public static final By ALL_OPTIONS_TRANFER_AUDITOR = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radWinAuditorTransfer_C_raddrpToAuditor_DropDown']/div/ul/li");
    public static final By TRANSFER_REASON_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radWinAuditorTransfer_C_raddrpReason_Input']");
    public static final By ALL_OPTIONS_TRANSFER_REASON = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radWinAuditorTransfer_C_raddrpReason_DropDown']/div/ul/li");
    public static final By TRANSFER_REMARKS =By.xpath("//textarea[@id='txtRadRemarksAdmin']");
    public static final By TRANSFER_SAVE_BUTTON = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radWinAuditorTransfer_C_RadSaveAdmin']");
    public static final By CANCEL_REASON_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radwinCancelAudit_C_radcmbCancelAuditReason_Input']");
    public static final By ALL_CANCEL_REASON_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radwinCancelAudit_C_radcmbCancelAuditReason_DropDown']/div/ul/li");
    public static final By CANCEL_REMARKS = By.xpath("//textarea[@id='radtxtCancelAuditRemarks']");
    public static final By CANCEL_SUBMIT_BUTTON = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_ucAdmDash_radwinCancelAudit_C_rbCancelAudit']");
    public static final By AUDIT_DETAIL_APPROVAL = By.xpath("//div[@id='divSummary']");
    public static final By INPROGRESS_FIRST_AUDIT = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_ucAdmDash_GrdDraft_ctl00__0']/td[2]/nobr");
    private static final Map<String, String> TAB_GRID_MAP = Map.of(
            "UNASSIGNED",  "grdUnassigned",
            "OVERDUE",     "GrdOverDue",
            "UPCOMING",    "GrdNotDue",
            "IN PROGRESS", "GrdDraft",
            "ALL",         "GrdAll"
    );
    private static By getPageSizeLocator(String gridName) {
        return By.xpath("//a[contains(@id, '" + gridName + "') and contains(@id, 'PageSizeComboBox_Arrow')]");
    }

    //Audit Category Setup
    public static final By ACS_AUDIT_MASTER_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpAuditCategory_Input']");
    public static final By ALL_OPTIONS_AMC = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpAuditCategory_DropDown']/div/ul/li");
    public static final By ACS_AUDIT_CATEGORY = By.xpath("//input[@id='radTxtAuditCategory']");
    public static final By ACS_ENFORCING_AUTHORITY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpAuthority_Input']");
    public static final By ALL_OPTIONS_EA = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpAuthority_DropDown']/div/ul/li");
    public static final By ACS_INDUSTRY_STD_DESC_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpIndustryStdDesc_Input']");
    public static final By ALL_OPTIONS_INDUSTRY_STD_DESC = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpIndustryStdDesc_DropDown']/div/ul/li");
    public static final By ACS_LEGAL_REQUIREMENTS_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpLegal_Input']");
    public static final By ALL_OPTIONS_LEGAL_REQUIREMENTS = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpLegal_DropDown']/div/ul/li");
    public static final By ACS_WORK_ORDER_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_ddlWOGeneration_Input']");
    public static final By ALL_OPTIONS_WORK_ORDER = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_ddlWOGeneration_DropDown']/div/ul/li");
    public static final By SAVE_AUDIT_CATEGORY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radBtnAuditCatAdd']");
    public static final By SAMPLING_LOCATION = By.xpath("//input[@id='txtSamplePercentage']");
    public static final By SAMPLING_ASSET = By.xpath("//input[@id='txtAssetSamplePercentage']");
    public static final By ENFORCE_SAMPLING = By.xpath("//input[@id='chkEnforcesampling']");
    public static final By PREDEFINED = By.xpath("//input[@id='chkQuestionBased']");
    public static final By Q_BANK = By.xpath("//input[@id='chkQtn']");
    public static final By ISSUE_BASED = By.xpath("//input[@id='chkddIssue']");
    public static final By SEARCH_AUDIT_MASTER_CAT = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00_ctl02_ctl03_FilterTextBox_MasterCategoryName']");
    public static final By SEARCH_AUDIT_CATEGORY_NAM = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00_ctl02_ctl03_FilterTextBox_AuditCategoryName']");
    public static final By SEARCH_LOCATION_SAMPLING = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00_ctl02_ctl03_FilterTextBox_SamplePercentage']");
    public static final By SEARCH_ASSET_SAMPLING = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00_ctl02_ctl03_FilterTextBox_AssetSamplePercentage']");
    public static final By SEARCH_AUDIT_STATUS = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00_ctl02_ctl03_FilterTextBox_Status']");
    public static final By FIRST_CREATED_AUDIT = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']");
    public static final By GENERAL_DETAILS = By.xpath("//div[@class='form-section-header' and contains(normalize-space(.),'General Details')]");
    public static final By ADD_QUESTION_CATEGORY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_radbtnHeader']");
    public static final By ENTER_QUESTION_CATEGORY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestionCategory_C_radtxtQCQC']");
    public static final By APPLICABLE_TO_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestionCategory_C_radcboQCQA_Input']");
    public static final By ALL_OPTIONS_APPLICABLE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestionCategory_C_radcboQCQA_DropDown']/div/ul/li");
    public static final By ASSET_SUB_CATEGORIES_TABLE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestionCategory_C_assetDiv']");
    public static final By ALL_OPTIONS_ASSET_QC = By.xpath("//tr[contains(@id,'ctl00_ContentPlaceHolder1_showQuestionCategory_C_RdgAssetList_ctl00')]");
    public static final By LOCATION_SUB_CATEGORIES_TABLE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestionCategory_C_baseDiv']");
    public static final By ALL_OPTIONS_LOCATION_QC = By.xpath("//tr[contains(@id,'ctl00_ContentPlaceHolder1_showQuestionCategory_C_RdgBaseUnitList_ctl00')]");
    public static final By SAVE_QUESTION_CATEGORY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_showQuestionCategory_C_radbtnQCSave']");
    public static final By ADD_QUESTION_SUBCATEGORY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_radbtnLines']");
    public static final By PHOTO_COUNT_DISABLE = By.xpath("//input[(@id='ctl00_ContentPlaceHolder1_showQuestionSubCategory_C_txtMinimumPhotoPQSC') and (@disabled = 'disabled')]");
    public static final By ENTER_QUESTION_SUBCATEGORY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestionSubCategory_C_radtxtQSCQSC']");
    public static final By QUESTION_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestionSubCategory_C_radcboQSCQC_Input']");
    public static final By ALL_OPTIONS_QUES_CATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestionSubCategory_C_radcboQSCQC_DropDown']/div/ul/li");
    public static final By SAVE_QUESTION_SUBCATEGORY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_showQuestionSubCategory_C_radbtnQSCSave']");
    public static final By ADD_QUESTION = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadButton1']");
    public static final By ENTER_QUESTION = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_RtxQuestion']");
    public static final By QQUESTION_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_RdcboQQC_Input']");
    public static final By QALL_OPTIONS_QUES_CATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestion_C_RdcboQQC_DropDown']/div/ul/li");
    public static final By QUESTION_SUBCATEGORY_DISABLE = By.xpath("//input[(@id='ctl00_ContentPlaceHolder1_showQuestion_C_RdcboQQSC_Input') and (@disabled='disabled')]");
    public static final By QQUESTUON_SUBCATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_RdcboQQSC_Input']");
    public static final By QALL_OPTIONS_QUES_SUBCATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestion_C_RdcboQQSC_DropDown']/div/ul/li");
    public static final By QCLAUSE_DROPDOWN = By.xpath("//input[@id='RdcClause_Input']");
    public static final By ALL_OPTIONS_QCLAUSE = By.xpath("//div[@id='RdcClause_DropDown']/div/ul/li");
    public static final By ENTER_WEIGHT = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_Weightage']");
    public static final By QUESTION_RELATE_CHECKBOX = By.xpath("//input[contains(@id, 'ctl00_ContentPlaceHolder1_showQuestion_C_Rad_') and @type='checkbox']");
    public static final By PHOTO_ALLOWED_CHECKBOX = By.xpath("//input[contains(@id, 'ctl00_ContentPlaceHolder1_showQuestion_C_CheckBox') and @type='checkbox']");
    public static final By REMARKS_MANDAT_CHECKBOX = By.xpath("//input[contains(@id, 'ctl00_ContentPlaceHolder1_showQuestion_C_RckRemarks') and @type='checkbox']");
    public static final By PHOTO_MANDATORY_CHECKBOX = By.xpath("//input[contains(@id, 'ctl00_ContentPlaceHolder1_showQuestion_C_RckPhoto') and @type='checkbox']");

    public static final By QSERVICE_GROUP_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_ServiceGroup_Input']");
    public static final By ALL_OPTIONS_SERVICE_GROUP = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_ServiceGroup_DropDown']/div/ul/li");
    public static final By FAULT_CATEGORY_DISABLE = By.xpath("//input[(@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_FaultyCategory_Input') and (@disabled='disabled')]");
    public static final By QFAULT_CATEGORY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_FaultyCategory_Input']");
    public static final By ALL_OPTIONS_FAULT = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_FaultyCategory_DropDown']/div/ul/li");
    public static final By FAULT_CODE_DISABLE = By.xpath("//input[(@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_FaultyCode_Input') and (@disabled='disabled')]");
    public static final By QFAULT_CODE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_FaultyCode_Input']");
    public static final By ALL_OPTIONS_FAULT_CODE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_FaultyCode_DropDown']/div/ul/li");
    public static final By QPRIORITY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_Priority_Input']");
    public static final By ALL_OPTIONS_QPRIORITY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestion_C_Rad_Priority_DropDown']/div/ul/li");
    public static final By QCONTRACT_GROUP_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_showQuestion_C_RadComboContractgroup_Input']");
    public static final By ALL_OPTIONS_QCONTRACT_GROUP = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_showQuestion_C_RadComboContractgroup_DropDown']/div/ul/li");
    public static final By SAVE_QUESTION = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_showQuestion_C_radbtnQSave']");


    //actions

    public static void verifyAutogeneratedInitiatedBy(String elementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement autoField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));

        String readOnlyAttr = autoField.getAttribute("readonly");
        boolean isEnabled = autoField.isEnabled();
        Assert.assertTrue("FAIL: Initiated By " + elementId + " is NOT in read-only mode.", readOnlyAttr != null || !isEnabled);
        String fieldValue = autoField.getAttribute("value");
        if (fieldValue == null || fieldValue.trim().isEmpty()) {
            Assert.fail("ERROR: Value not available in the autogenerated Initiated By: " + elementId);
        } else {
            System.out.println("SUCCESS: Autogenerated Initiated By found: " + fieldValue);
            if (elementId.contains("ScheduleNo")) {
                testDataModel.setScheduleNo(fieldValue);
                System.out.println("Saved scheduleNo: " + fieldValue);
            } else if (elementId.contains("CreateDate")) {
                testDataModel.setCreateDate(fieldValue);
                System.out.println("Saved createDate: " + fieldValue);
            } else if (elementId.contains("AuditMasterCategory")) {
                testDataModel.setAuditMasterCategory(fieldValue);
                System.out.println("Saved AuditMasterCategory: " + fieldValue);
            } else if (elementId.contains("ScheduleName")) {
                testDataModel.setScheduleName(fieldValue);
                System.out.println("Saved ScheduleName: " + fieldValue);
            }if (elementId.contains("AuditNo")) {
                testDataModel.setAuditNo(fieldValue);
                System.out.println("Saved AuditNo: " + fieldValue);
            }
            if (elementId.contains("AuditDate")) {
                testDataModel.setCreateDate(fieldValue);
                System.out.println("Saved AuditDate: " + fieldValue);
            }
        }
    }
    public static void getScheduleName(){
        WebElement AuditField = driver.findElement(AUDIT_CATEGORY_DROPDOWN);
        WebElement inputField = driver.findElement(SCHEDULE_NAME);
        String AuditVal = AuditField.getAttribute("value");
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditCategory(AuditVal);
        testDataModel.setScheduleName(firstVal);
    }
    public static void getRandomAuditMasterCatDropdown() {
        utils.click(AUDIT_MASTER_CATEGORY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_AUDIT_MASTER_CATEGORY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDIT_MASTER_CATEGORY);
        WebElement inputField = driver.findElement(AUDIT_MASTER_CATEGORY_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditMasterCategory(firstVal);
    }
    public static void searchAndSelectAuditMasterCat(String Value) {
        utils.click(AUDIT_MASTER_CATEGORY_DROPDOWN);
        utils.typeText(AUDIT_MASTER_CATEGORY_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_AduitMC_Combo1_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditMasterCategory(Value);
    }
    public static void getRandomAuditCategoryDropdown() throws InterruptedException {
        utils.click(AUDIT_CATEGORY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_AUDIT_CATEGORY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDIT_CATEGORY);
        WebElement inputField = driver.findElement(AUDIT_CATEGORY_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditCategory(firstVal);
    }
    public static void searchAndSelectAuditCategory(String Value){
        utils.click(AUDIT_CATEGORY_DROPDOWN);
        utils.typeText(AUDIT_CATEGORY_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_AduitC_Combo2_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        testDataModel.setAuditCategory(Value);
    }
    public static void ValidateScheduleNamedetails(){
        String auditMasterCat = testDataModel.getAuditMasterCategory();
        String auditCat = testDataModel.getAuditCategory();
        String createdOn = testDataModel.getCreateDate();
        String actualValue = auditMasterCat + " - " + auditCat + " - " + createdOn;

        utils.waitForAttributeNotEmpty(SCHEDULE_NAME, "value");
        String inputValue = driver.findElement(SCHEDULE_NAME).getAttribute("value");

        testDataModel.setScheduleName(inputValue);
        Assert.assertEquals(actualValue, inputValue);
    }
    public static void CheckApplicableZones(){
        WebElement checkAll = utils.waitForVisibility(
                CHECK_ALLAPPLICABLE_ZONES);
        if (checkAll.isSelected()) {
            LOGGER.info("Check All is already checked — skipping");
        } else {
            utils.click(CHECK_ALLAPPLICABLE_ZONES);
            LOGGER.info("Check All clicked successfully");
        }
    }
    public static void getRandomClientDropdown() {
        utils.click(CLIENT_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_CLIENT);
        HelperUtils.clickRandomElement(ALL_OPTIONS_CLIENT);
        WebElement inputField = driver.findElement(CLIENT_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setClient(firstVal);
    }
    public static void searchAndSelectClient(String Value){
        utils.click(CLIENT_DROPDOWN);
        utils.typeText(CLIENT_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_ddlClient_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setClient(Value);
    }
    public static void getRandomClientContractDropdown() throws InterruptedException {
        utils.click(CLIENT_CONTRACT_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_CLIENT_CONTRACT);
        HelperUtils.clickRandomElement(ALL_OPTIONS_CLIENT_CONTRACT);
        WebElement inputField = driver.findElement(CLIENT_CONTRACT_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setClientContract(firstVal);
    }
    public static void searchAndSelectClientContract(String Value){
        utils.click(CLIENT_CONTRACT_DROPDOWN);
        utils.typeText(CLIENT_CONTRACT_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_ddlClientContract_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setClientContract(Value);
    }
    public static void getRandomPropertyDropdown() throws InterruptedException {
        utils.click(PROPERTY);
        utils.waitForVisibility(ALL_OPTIONS_PROPERTY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_PROPERTY);
        WebElement inputField = driver.findElement(PROPERTY);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setProperty(firstVal);
    }
    public static void searchAndSelectProperty(String Value){
        utils.click(PROPERTY);
        utils.typeText(PROPERTY, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_AduitSubComunity_Combo3_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setProperty(Value);
    }
    public static void getRandomPrimaryAuditeeDropdown() throws InterruptedException {
        utils.waitForVisibility(PRIMARY_AUDITEE);
        utils.click(PRIMARY_AUDITEE);
        utils.waitForVisibility(ALL_OPTIONS_PRIMARY_AUDITEE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_PRIMARY_AUDITEE);
        WebElement inputField = driver.findElement(PRIMARY_AUDITEE);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setPrimaryAuditee(firstVal);
    }
    public static void searchAndSelectPrimaryAuditee(String Value){
        utils.waitForVisibility(PRIMARY_AUDITEE);
        utils.click(PRIMARY_AUDITEE);
        utils.typeText(PRIMARY_AUDITEE, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_AduitSubComunity_Combo3_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setPrimaryAuditee(Value);
    }

    public static void enterScheduleStartDate(String Value) {
        utils.typeText(SCHEDULE_START_DATE, Value + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setScheduleStartDate(Value);
    }
    public static void SelectTodayAsStartDate() {
        WebElement freqElement = driver.findElement(SCHEDULE_START_DATE);
        JavaScriptExeUtil.scrollToElement(driver, freqElement);
        utils.waitForVisibility(SCHEDULE_START_DATE);
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        utils.typeText(SCHEDULE_START_DATE, formattedDate + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setScheduleStartDate(formattedDate);
    }
    public static void enterScheduleEndDate(String Value) {
        utils.typeText(SCHEDULE_END_DATE, Value + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setScheduleEndDate(Value);
    }
    public static void SelectRandomEndDate() {
        String startDateStr = testDataModel.getScheduleStartDate();
        WebElement freqEndElement = driver.findElement(SCHEDULE_END_DATE);
        LocalDate startDate = LocalDate.parse(startDateStr, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        freqEndElement.clear();
        freqEndElement.sendKeys(Keys.CONTROL + "a");
        freqEndElement.sendKeys(Keys.DELETE);

        // Randomly decide scenario
        int scenario = new Random().nextInt(3); // 0, 1, 2

        if (scenario == 0) {
            // No End Date — click checkbox
            utils.click(NO_END_DATE_CHECKBOX);
            testDataModel.setScheduleEndDate("No End Date");
            System.out.println("Selected: No End Date");

        } else if (scenario == 1) {
            // Random days 1 to 730 (up to 2 years)
            int randomDays = new Random().nextInt(730) + 1;
            LocalDate randomEndDate = startDate.plusDays(randomDays);
            String formattedDate = randomEndDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
            utils.typeText(SCHEDULE_END_DATE, formattedDate);
            testDataModel.setScheduleEndDate(formattedDate);
            System.out.println("Selected End Date (≤730 days): " + formattedDate);

        } else {
            // Random days 731 to 1825 (2 to 5 years)
            int randomDays = new Random().nextInt(1095) + 731;
            LocalDate randomEndDate = startDate.plusDays(randomDays);
            String formattedDate = randomEndDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
            utils.typeText(SCHEDULE_END_DATE, formattedDate);
            testDataModel.setScheduleEndDate(formattedDate);
            System.out.println("Selected End Date (>730 days): " + formattedDate);
        }
        ElementUtils.waitForLoaderToDisappear();
        ElementUtils.waitForLoaderToDisappear();
    }

// Frequency selection
    public static void selectFrequencyBasedOnDates() throws InterruptedException {
        String startDate = testDataModel.getScheduleStartDate();
        String endDate = testDataModel.getScheduleEndDate();

        // Step 1: Calculate days between
        long daysBetween = endDate.equals("No End Date") ? 9999
                : ChronoUnit.DAYS.between(
                LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy")),
                LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd-MMM-yyyy")));

        System.out.println("Days between: " + daysBetween);

        // Step 2: Open dropdown and get all options
      action.performClick(utils.waitForVisibility(FREQUENCY));
//        utils.click(FREQUENCY);
//        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_FREQUENCY);
        if (endDate.equals("No End Date")) {
            By yearly = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadFrequency_Combo5_DropDown']/div/ul/li[contains(normalize-space(text()),'Yearly') or contains(normalize-space(text()),'Annual')]");
            new WebDriverWait(driver, Duration.ofSeconds(15))
                    .until(ExpectedConditions.visibilityOfElementLocated(yearly));
            JavaScriptExeUtil.jsClick(driver, driver.findElement(yearly));
            testDataModel.setFrequency("Yearly");
            ElementUtils.waitForLoaderToDisappear();
            return;
        }
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadFrequency_Combo5_DropDown']/div/ul/li")));
        List<WebElement> options = driver.findElements(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadFrequency_Combo5_DropDown']/div/ul/li"));

        // Step 3: Find nearest match
        List<String> optionTexts = new ArrayList<>();
        for (WebElement option : options) {
            try {
                optionTexts.add(option.getText().trim());
            } catch (StaleElementReferenceException e) {
                // Re-fetch fresh and retry
                options = driver.findElements(ALL_OPTIONS_FREQUENCY);
                optionTexts.clear();
                for (WebElement freshOption : options) {
                    optionTexts.add(freshOption.getText().trim());
                }
                break;
            }
        }

        // Step 4: Click best match or fallback to first
        String bestText = optionTexts.stream()
                .filter(t -> convertFrequencyToDays(t) >= 0)
                .min(Comparator.comparingLong(t ->
                        Math.abs(convertFrequencyToDays(t) - daysBetween)))
                .orElse(null);

        if (bestText != null) {
            LOGGER.info("Selected Frequency: " + bestText);
            By best = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadFrequency_Combo5_DropDown']" +
                    "/div/ul/li[normalize-space(text())='" + bestText + "']");
            JavaScriptExeUtil.jsClick(driver, driver.findElement(best)); // fresh fetch
            testDataModel.setFrequency(bestText);
        } else {
            LOGGER.info("Fallback: selecting first option");
            WebElement first = driver.findElement(By.xpath(
                    "//div[@id='ctl00_ContentPlaceHolder1_RadFrequency_Combo5_DropDown']/div/ul/li[1]"));
            JavaScriptExeUtil.jsClick(driver, first);                    // fresh fetch
            testDataModel.setFrequency(first.getText().trim());
        }
        ElementUtils.waitForLoaderToDisappear();
    }

    private static long convertFrequencyToDays(String text) {
        try {
            String[] parts = text.toLowerCase().trim().split("\\s+");
            int multiplier = 1;
            String unit = parts[0];

            if (parts.length >= 2) {
                try { multiplier = Integer.parseInt(parts[0]); unit = parts[1]; }
                catch (NumberFormatException e) { unit = parts[0]; }
            }

            if (unit.contains("daily"))                                     return multiplier * 1L;
            else if (unit.contains("weekly"))                               return multiplier * 7L;
            else if (unit.contains("monthly"))                              return multiplier * 30L;
            else if (unit.contains("quarterly"))                            return multiplier * 90L;
            else if (unit.contains("half") || unit.contains("semi"))        return multiplier * 180L;
            else if (unit.contains("annual") || unit.contains("yearly"))    return multiplier * 365L;
            else                                                            return -1;

        } catch (Exception e) { return -1; }
    }


    public static void searchAndSelectFrequency(String Value){
        WebElement freqElement = driver.findElement(FREQUENCY);
        JavaScriptExeUtil.scrollToElement(driver, freqElement);
        utils.waitForVisibility(FREQUENCY);
        utils.click(FREQUENCY);
        utils.typeText(FREQUENCY, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadFrequency_Combo5_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setFrequency(Value);
    }
    public static void getRandomAuditCompanyTypeDropdown() {
        utils.click(AUDIT_COMPANY_TYPE);
        utils.waitForVisibility(ALL_OPTIONS_AUDIT_COMPANY_TYPE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDIT_COMPANY_TYPE);
        WebElement inputField = driver.findElement(AUDIT_COMPANY_TYPE);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditCompanyType(firstVal);
    }
    public static void searchAndSelectAuditCompanyType(String Value){
        utils.click(AUDIT_COMPANY_TYPE);
        utils.typeText(AUDIT_COMPANY_TYPE, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadAuditCompany_Combo6_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditCompanyType(Value);
    }
    public static void getRandomAuditorDesignationDropdown() {
        utils.click(AUDITOR_DESIGNATION);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_AUDITOR_DESIGNATION);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDITOR_DESIGNATION);
        WebElement inputField = driver.findElement(AUDITOR_DESIGNATION);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditorDesignation(firstVal);
    }
    public static void searchAndSelectAuditorDesignation(String Value){
        utils.click(AUDITOR_DESIGNATION);
        utils.typeText(AUDITOR_DESIGNATION, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadExpectedAuditor_Combo7_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditorDesignation(Value);
    }
    public static void ClickSaveButtoninSchedule() {
        By[] saveButtons = {SAVE_GENARET_SCHEDULE_BUTTON, SAVE_CREATE_UNSCHEDULED_AUDIT, RESCHEDULE_SAVE_BUTTON, CANCEL_SUBMIT_BUTTON, SAVE_AUDIT_CATEGORY, SAVE_QUESTION_CATEGORY, SAVE_QUESTION_SUBCATEGORY, SAVE_QUESTION};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                WebElement element = driver.findElement(button);
                jsClick(driver, element);
                utils.waitUntilInvisible(button);
                ElementUtils.waitForLoaderToDisappear();
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public static void clickSaveButtonInSchedulelineError() {
        By[] saveButtons = {SAVE_GENARET_SCHEDULE_BUTTON,SAVE_CREATE_UNSCHEDULED_AUDIT};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public static void verifySchedule() throws InterruptedException {
        String authValue = testDataModel.getScheduleNo();
        String scheduleNumber = authValue.split("-")[1];
        utils.typeText(SEARCH_SCHEDULE_NO, scheduleNumber + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']//td/nobr[contains(text(),'"+scheduleNumber+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyScheduleName() throws InterruptedException {
        String ScheduleName = testDataModel.getScheduleName();
        By ScheduleNameValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']//td[text()='"+ScheduleName+"']");
        utils.waitForVisibility(ScheduleNameValue);
        Assert.assertTrue(utils.isElementVisible(ScheduleNameValue));
    }
    public static void verifyAuditCategory() throws InterruptedException {
        String AuditCategory = testDataModel.getAuditCategory();
        By AuditCategoryValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']//span[text()='"+AuditCategory+"']");
        utils.waitForVisibility(AuditCategoryValue);
        Assert.assertTrue(utils.isElementVisible(AuditCategoryValue));
    }
    public static void verifyProperty() throws InterruptedException {
        String Property = testDataModel.getProperty();
        By PropertyValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']//td/nobr[text()='"+Property+"']");
        utils.waitForVisibility(PropertyValue);
        Assert.assertTrue(utils.isElementVisible(PropertyValue));
    }
    public static void verifyPrimaryAuditee() throws InterruptedException {
        String PrimaryAuditee = testDataModel.getPrimaryAuditee();
        By PrimaryAuditeeValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']//td/nobr[text()='"+PrimaryAuditee+"']");
        utils.waitForVisibility(PrimaryAuditeeValue);
        Assert.assertTrue(utils.isElementVisible(PrimaryAuditeeValue));
    }

    public static void searchAndSelectScheduleNoEdit(String Value) throws InterruptedException {
        utils.typeText(SEARCH_SCHEDULE_NO, Value + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']//td/nobr[contains(text(),'"+Value+"')]");
        utils.waitForVisibility(searchVal);
        utils.click(searchVal);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void getScheduleNoEdit() throws InterruptedException {
        utils.typeText(STATUS_SEARCH, "Draft" + Keys.ENTER);
        utils.waitForVisibility(DRAFTS_AUDIT);
        List<WebElement> allRecords = utils.getElements(ALL_OPTIONS_SEARCH_SCHEDULE_NO);
        int randomIndex = new Random().nextInt(allRecords.size());

        String scheduleText = allRecords.get(randomIndex).getText().trim();
        System.out.println("Selected Schedule: " + scheduleText);
        testDataModel.setScheduleNo(scheduleText);

        WebElement rowToClick = driver.findElements(ALL_OPTIONS_SEARCH_SCHEDULE_NO).get(randomIndex);
        JavaScriptExeUtil.scrollToElement(driver, rowToClick);
        JavaScriptExeUtil.jsClick(driver, rowToClick);
        ElementUtils.waitForLoaderToDisappear();
    }

    public static void getScheduleNoDelete() throws InterruptedException {
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//input[@alt='Delete' and contains(@src,'DeleteIcon.png') and contains(@id,'AuditScheduleSetup_Grid_ctl00')]"));

        if (deleteButtons.isEmpty()) return;

        int randomIndex = new Random().nextInt(deleteButtons.size());
        WebElement row = deleteButtons.get(randomIndex).findElement(By.xpath("./ancestor::tr[1]"));

        testDataModel.setScheduleNo(row.findElement(By.xpath(".//td[1]")).getAttribute("title").trim());
        testDataModel.setScheduleName(row.findElement(By.xpath(".//td[2]")).getAttribute("title").trim());
        testDataModel.setStatus(row.findElement(By.xpath(".//td[3]")).getAttribute("title").trim());
        testDataModel.setProperty(row.findElement(By.xpath(".//td[6]")).getAttribute("title").trim());
        testDataModel.setPrimaryAuditee(row.findElement(By.xpath(".//td[7]")).getAttribute("title").trim());

        //searching the values
        String scheduleNo     = testDataModel.getScheduleNo();
        String scheduleName   = testDataModel.getScheduleName();
        String status         = testDataModel.getStatus();
        String property       = testDataModel.getProperty();

        // Search by schedule number
        String scheduleNumber = scheduleNo.replace("SCH-00", "").trim();
        utils.typeText(SEARCH_SCHEDULE_NO, scheduleNumber + Keys.ENTER);
        utils.typeText(SEARCH_SCHEDULE_NAME, scheduleName + Keys.ENTER);
        utils.typeText(STATUS_SEARCH, status + Keys.ENTER);
        Thread.sleep(3000);

    }
    public static void clickDeleteButtonA() {
        By[] deleteButtons = {DELETE_SCHEDULE_BUTTON,DELETE_UNASSIGNED_AUDIT, DELETE_OVERDUE_AUDIT, DELETE_INPROGRESS_AUDIT, DELETE_UPCOMING_AUDIT, DELETE_ALL_AUDIT};

        for (By button : deleteButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                Alert alert = driver.switchTo().alert();
                alert.accept();
//                utils.waitUntilInvisible(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public static void verifyNoScheduleRecordsPresent() {
        String scheduleNo     = testDataModel.getScheduleNo();
        String scheduleNumber = scheduleNo.replace("SCH-00", "").trim();
        utils.typeText(SEARCH_SCHEDULE_NO, scheduleNumber + Keys.ENTER);
        utils.waitForVisibility(NO_RECORDS_DISPLYED_IN_LIST);
        Assert.assertTrue(utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST));
    }
    public static void getRandomUSAuditMasterCatDropdown() {
        utils.click(USAUDIT_MASTER_CATEGORY_DROPDOWN);
        utils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_US_AUDIT_MASTER_CATEGORY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_US_AUDIT_MASTER_CATEGORY);
        WebElement inputField = driver.findElement(USAUDIT_MASTER_CATEGORY_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditMasterCategory(firstVal);
    }
    public static void searchAndSelectUSAuditMasterCat(String Value) {
        utils.click(USAUDIT_MASTER_CATEGORY_DROPDOWN);
        utils.typeText(USAUDIT_MASTER_CATEGORY_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_cboMasterCategory_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditMasterCategory(Value);
    }
    public static void getRandomUSAuditCategoryDropdown() throws InterruptedException {
        utils.click(USAUDIT_CATEGORY_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_US_AUDIT_CATEGORY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_US_AUDIT_CATEGORY);
        WebElement inputField = driver.findElement(USAUDIT_CATEGORY_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditCategory(firstVal);
    }
    public static void searchAndSelectUSAuditCategory(String Value){
        utils.click(USAUDIT_CATEGORY_DROPDOWN);
        utils.typeText(USAUDIT_CATEGORY_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_cboAuditCategory_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditCategory(Value);
    }
    public static void ValidateAuditNamedetails(){
        String auditMasterCat = testDataModel.getAuditMasterCategory();
        String auditCat = testDataModel.getAuditCategory();
        String createdOn = testDataModel.getCreateDate();
        String actualValue = auditMasterCat + " - " + auditCat + " - " + createdOn;

        utils.waitForAttributeNotEmpty(USSCHEDULE_NAME, "value");
        String inputValue = driver.findElement(USSCHEDULE_NAME).getAttribute("value");

        testDataModel.setScheduleName(inputValue);
        Assert.assertEquals(actualValue, inputValue);
    }
    public static void getRandomUSClientDropdown() {
        utils.click(USCLIENT_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_CLIENT);
        HelperUtils.clickRandomElement(ALL_OPTIONS_CLIENT);
        WebElement inputField = driver.findElement(USCLIENT_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setClient(firstVal);
    }
    public static void searchAndSelectUSClient(String Value){
        utils.click(USCLIENT_DROPDOWN);
        utils.typeText(USCLIENT_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_ddlClient_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setClient(Value);
    }
    public static void getRandomUSPropertyDropdown() throws InterruptedException {
        utils.click(USPROPERTY);
        utils.waitForVisibility(ALL_OPTIONS_US_PROPERTY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_US_PROPERTY);
        WebElement inputField = driver.findElement(USPROPERTY);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setProperty(firstVal);
    }
    public static void searchAndSelectUSProperty(String Value){
        utils.click(USPROPERTY);
        utils.typeText(USPROPERTY, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_cboSubCommunity_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setProperty(Value);
    }
    public static void getRandomAuditorCompanyDropdown() {
        WebElement pageSizeElement = driver.findElement(AUDITOR_COMPANY_DROPDOWN);
        JavaScriptExeUtil.scrollToElement(driver, pageSizeElement);
        utils.click(AUDITOR_COMPANY_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_AUDITOR_COMPANY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDITOR_COMPANY);
        WebElement inputField = driver.findElement(AUDITOR_COMPANY_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditorCompany(firstVal);
    }
    public static void searchAndSelectAuditorCompany(String Value){
        WebElement pageSizeElement = driver.findElement(AUDITOR_COMPANY_DROPDOWN);
        JavaScriptExeUtil.scrollToElement(driver, pageSizeElement);
        utils.click(AUDITOR_COMPANY_DROPDOWN);
        utils.typeText(AUDITOR_COMPANY_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_cboAuditCompany_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditorCompany(Value);
    }
    public static void getRandomAuditeeDropdown() {
        utils.click(AUDITEE_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_AUDITEE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDITEE);
        WebElement inputField = driver.findElement(AUDITEE_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditee(firstVal);
    }
    public static void searchAndSelectAuditee(String Value){
        utils.click(AUDITEE_DROPDOWN);
        utils.typeText(AUDITEE_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_cboPrimaryAuditeeContract_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditee(Value);
    }
    public static void getRandomAuditeeStaffNameDropdown() {
        utils.click(AUDITEE_STAFF_NAME_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_AUDITEE_STAFF_NAME);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDITEE_STAFF_NAME);
        WebElement inputField = driver.findElement(AUDITEE_STAFF_NAME_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditeeStaffName(firstVal);
    }
    public static void searchAndSelectAuditeeStaffName(String Value){
        utils.click(AUDITEE_STAFF_NAME_DROPDOWN);
        utils.typeText(AUDITEE_STAFF_NAME_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_cboPrimaryAuditeeStaff_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditeeStaffName(Value);
    }
    public static void getRandomAuditorDropdown() {
        utils.click(AUDITOR_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_AUDITOR);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AUDITOR);
        WebElement inputField = driver.findElement(AUDITOR_DROPDOWN);
        String inputvalue = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        String firstVal = inputvalue.split("/")[0].trim();
        testDataModel.setAuditor(firstVal);
    }
    public static void searchAndSelectAuditor(String Value){
        utils.click(AUDITOR_DROPDOWN);
        utils.typeText(AUDITOR_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_cboAuditor_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        ElementUtils.waitForLoaderToDisappear();
        testDataModel.setAuditor(Value);
    }
    public static void verifyAuditNO() throws InterruptedException {
        String authValue = testDataModel.getAuditNo();
        utils.typeText(SEARCH_AUDIT_NO, authValue + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//span[contains(text(),'"+authValue+"')]");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyAuditType() throws InterruptedException {
        String AuditType = "Un-scheduled";
        By AuditTypeValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//td/nobr[text()='"+AuditType+"']");
        utils.waitForVisibility(AuditTypeValue);
        Assert.assertTrue(utils.isElementVisible(AuditTypeValue));
    }
    public static void verifyUSScheduleName() throws InterruptedException {
        String UNScheduleName = testDataModel.getScheduleName();
//        UNScheduleName = UNScheduleName.replace("/", "-");
        By AuditCategoryValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//span[text()='"+UNScheduleName+"']");
        utils.waitForVisibility(AuditCategoryValue);
        Assert.assertTrue(utils.isElementVisible(AuditCategoryValue));
    }
    public static void verifyScheduleDate() throws InterruptedException {
        String ScheduleDate = testDataModel.getCreateDate();
        By ScheduleValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//td[contains(text(), '"+ScheduleDate+"')]");
        utils.waitForVisibility(ScheduleValue);
        Assert.assertTrue(utils.isElementVisible(ScheduleValue));
    }
    public static void verifyUSAuditCategory() throws InterruptedException {
        String USAuditCategory = testDataModel.getAuditCategory();
        By USAuditCategoryValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//td/nobr[text()='"+USAuditCategory+"']");
        utils.waitForVisibility(USAuditCategoryValue);
        Assert.assertTrue(utils.isElementVisible(USAuditCategoryValue));
    }
    public static void verifyUSProperty() throws InterruptedException {
        String USProperty = testDataModel.getProperty();
        By USPropertyValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//td/nobr[text()='"+USProperty+"']");
        utils.waitForVisibility(USPropertyValue);
        Assert.assertTrue(utils.isElementVisible(USPropertyValue));
    }
    public static void verifyUSAuditee() throws InterruptedException {
        String USAuditee = testDataModel.getAuditee();
        By USAuditeeValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//td/nobr[text()='"+USAuditee+"']");
        utils.waitForVisibility(USAuditeeValue);
        Assert.assertTrue(utils.isElementVisible(USAuditeeValue));
    }
    public static void verifyUSAuditorCompany() throws InterruptedException {
        String USAuditorCompany = testDataModel.getAuditorCompany();
        By USAuditorCompanyValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//td[text()='"+USAuditorCompany+"']");
        utils.waitForVisibility(USAuditorCompanyValue);
        Assert.assertTrue(utils.isElementVisible(USAuditorCompanyValue));
    }
    public static void verifyUSAuditor() throws InterruptedException {
        String USAuditor = testDataModel.getAuditor();
        By USAuditorValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//td/nobr[contains(text(),'"+USAuditor+"')]");
        utils.waitForVisibility(USAuditorValue);
        Assert.assertTrue(utils.isElementVisible(USAuditorValue));
    }
    public static void PagesizeSelection(int Value){
        WebElement pageSizeElement = driver.findElement(PAGE_SIZE);
        JavaScriptExeUtil.scrollToElement(driver, pageSizeElement);
        utils.waitForElementToBeClickable(PAGE_SIZE);
        utils.click(PAGE_SIZE);
        By PageValue = By.xpath("//div[contains(@id, 'PageSizeComboBox_DropDown') and contains(@class, 'RadComboBoxDropDown')]//li[text()='"+Value+"']");
        utils.click(PageValue);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void getScheduleAuditNoDelete() throws InterruptedException {
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[@value='Delete']"));

        int randomIndex = new Random().nextInt(deleteButtons.size());
        WebElement row = deleteButtons.get(randomIndex).findElement(By.xpath("./ancestor::tr[1]"));

        testDataModel.setAuditNo(row.findElement(By.xpath(".//td[3]//span")).getText().trim());

        String AuditNo = testDataModel.getAuditNo();

        utils.typeText(SEARCH_AUDIT_NO, AuditNo + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void DeleteAssignedAudit(){
        WebElement pageDeleteElement = driver.findElement(DELETE_ASSIGNED_AUDITS);
        JavaScriptExeUtil.scrollToElement(driver, pageDeleteElement);
        utils.click(DELETE_ASSIGNED_AUDITS);
        ElementUtils.waitForLoaderToDisappear();
        utils.click(REASON_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_REASON);
        HelperUtils.clickRandomElement(ALL_OPTIONS_REASON);
        String randomRemarks = dataGenerator.generateShortName();
        utils.typeText(REMARKS_TEXTBOX, randomRemarks);
        utils.click(DELETE_AUDIT_DELETION);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void verifyDeletedAssignedRecordsPresent() {
        String AuditNo = testDataModel.getAuditNo();
        utils.typeText(SEARCH_AUDIT_NO, AuditNo + Keys.ENTER);
        utils.waitForVisibility(NO_RECORDS_DISPLYED_IN_LIST);
        Assert.assertTrue(utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST));
    }
    public static void getScheduleAuditNoReschedule() throws InterruptedException {
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[@value='Reschedule']"));

        int randomIndex = new Random().nextInt(deleteButtons.size());
        WebElement row = deleteButtons.get(randomIndex).findElement(By.xpath("./ancestor::tr[1]"));

        testDataModel.setAuditNo(row.findElement(By.xpath(".//td[3]//span")).getText().trim());

        String AuditNo = testDataModel.getAuditNo();

        utils.typeText(SEARCH_AUDIT_NO, AuditNo + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void RescheduleAssignedAudit(){
        WebElement pageDeleteElement = driver.findElement(RESCHEDULE_ASSIGNED_AUDIT);
        JavaScriptExeUtil.scrollToElement(driver, pageDeleteElement);
        utils.click(RESCHEDULE_ASSIGNED_AUDIT);
        ElementUtils.waitForLoaderToDisappear();
//        click Random date from today's date
        int randomDays = new Random().nextInt(730) + 1;
        LocalDate randomDate = LocalDate.now().plusDays(randomDays);
        String formattedDate = randomDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        utils.waitForVisibility(AUDIT_CHANGE_DATE);
        utils.typeText(AUDIT_CHANGE_DATE, formattedDate);
        testDataModel.setAuditchangedDate(formattedDate);
        String randomRemarks = dataGenerator.generateShortName();
        utils.typeText(RESCHEDULE_REMARKS_TEXTBOX, randomRemarks);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void verifyRescheduleddateisChanged() {
        String AuditNo = testDataModel.getAuditNo();
        String ScheduleDate = testDataModel.getAuditchangedDate();
        utils.typeText(SEARCH_AUDIT_NO, AuditNo + Keys.ENTER);
        By ScheduleValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_Rdgrid_AssignedAudit_ctl00']//td[contains(text(), '"+ScheduleDate+"')]");
        utils.waitForVisibility(ScheduleValue);
        Assert.assertTrue(utils.isElementVisible(ScheduleValue));
    }
    public static void getScheduleAuditNoAssign() throws InterruptedException {
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[@value='Assign']"));

        int randomIndex = new Random().nextInt(deleteButtons.size());
        WebElement row = deleteButtons.get(randomIndex).findElement(By.xpath("./ancestor::tr[1]"));

        testDataModel.setScheduleNo(row.findElement(By.xpath(".//td[2]//nobr")).getText().trim());

        String AuditNo = testDataModel.getScheduleNo();

        utils.typeText(SEARCH_SCHEDULE_NO, AuditNo + Keys.ENTER);
        By searchAuditNo = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_AuditScheduleSetup_Grid_ctl00']/tbody/tr[1]/td[2]/nobr[text()='"+AuditNo+"']");
        utils.waitForVisibility(searchAuditNo);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void AssignScheduledAudit(){
        utils.click(ASSIGN_BUTTON);
        utils.switchToWindowWithURL("AuditCreationPage.aspx");
        utils.waitForVisibility(AUDIT_NO);
    }
    public static void getAllAsignAuditdetails(){
        String inputValue = driver.findElement(USSCHEDULE_NAME).getAttribute("value");
        String AuditNoValue = driver.findElement(AUDIT_NO).getAttribute("value");
        String ScheduleNoValue = driver.findElement(SCHEDULE_NO).getAttribute("value");

        testDataModel.setScheduleName(inputValue);
        testDataModel.setAuditNo(AuditNoValue);
        testDataModel.setScheduleNo(ScheduleNoValue);

        WebElement pageDeleteElement = driver.findElement(SAVE_CREATE_UNSCHEDULED_AUDIT);
        JavaScriptExeUtil.scrollToElement(driver, pageDeleteElement);
    }
    public static void clickAuditStatusTab(String tabname){
        By tabLocator = AUDIT_STATUS_TABS.get(tabname.toUpperCase());
        if (tabLocator == null) {
            throw new FrameworkException("NO TAB FOUND WITH NAME: " + tabname);
        }
        utils.click(tabLocator);
    }
    public static void PagesizetabSelection(int Value, String gridName){
        String mappedGridName  = TAB_GRID_MAP.get(gridName.toUpperCase());
        By pageSizeLocator = getPageSizeLocator(mappedGridName );
        WebElement pageSizeElement = driver.findElement(pageSizeLocator);
        JavaScriptExeUtil.scrollToElement(driver, pageSizeElement);
        utils.waitForElementToBeClickable(pageSizeLocator);
        utils.click(pageSizeLocator);
        By PageValue = By.xpath("//div[contains(@id, '" + mappedGridName + "') and contains(@id, 'PageSizeComboBox_DropDown') and contains(@class, 'RadComboBoxDropDown')]//li[text()='" + Value + "']");
        utils.waitForVisibility(PageValue);
        utils.click(PageValue);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void getUnAssignedScheduleNoDelete(String gridName) throws InterruptedException {
        String mappedGridName  = TAB_GRID_MAP.get(gridName.toUpperCase());
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//input[@alt='Delete' and contains(@name, '"+mappedGridName+"')]"));

        int randomIndex = new Random().nextInt(deleteButtons.size());
        WebElement row = deleteButtons.get(randomIndex).findElement(By.xpath("./ancestor::tr[1]"));

        testDataModel.setScheduleNo(row.findElement(By.xpath(".//td[2]//nobr")).getText().trim());
        testDataModel.setScheduleon(row.findElement(By.xpath(".//td[5]//nobr")).getText().trim());

        String ScheduleNo = testDataModel.getScheduleNo();
        String Scheduledate = testDataModel.getScheduleon();

        utils.typeText(SEARCH_SCHEDULE_NUMBER, ScheduleNo + Keys.ENTER);
        utils.typeText(SEARCH_SCHEDLE_ON, Scheduledate + Keys.ENTER);
        By ScheduleNumberWait = By.xpath("//tr[1]//td/nobr[text()='"+ScheduleNo+"']");
        utils.waitForVisibility(ScheduleNumberWait);
        ElementUtils.waitForLoaderToDisappear();
    }

    public static void verifyDeletedUnAssignedRecordsPresent() {
        String AuditNo = testDataModel.getScheduleNo();
        String Scheduledate = testDataModel.getScheduleon();
        utils.typeText(SEARCH_SCHEDULE_NUMBER, AuditNo + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        utils.typeText(SEARCH_SCHEDLE_ON, Scheduledate + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        utils.waitForVisibility(NO_RECORDS_DISPLYED_IN_LIST);
        Assert.assertTrue(utils.isElementVisible(NO_RECORDS_DISPLYED_IN_LIST));
    }
    public static void getauditdetailsfromtable(){
        WebElement scheduleName = driver.findElement(By.xpath(".//td[4]/span"));
        WebElement CategoryName = driver.findElement(By.xpath(".//td[7]/nobr"));
        WebElement PropertyName = driver.findElement(By.xpath(".//td[8]/nobr"));
        WebElement AuditeeContract = driver.findElement(By.xpath(".//td[9]/nobr"));

        testDataModel.setScheduleName(scheduleName.getText().trim());
        testDataModel.setAuditCategory(CategoryName.getText().trim());
        testDataModel.setProperty(PropertyName.getText().trim());
        testDataModel.setPrimaryAuditee(AuditeeContract.getText().trim());
    }
    public static void openUnAssignedAudit(){
        utils.click(UNASSIGN_SELECTED_AUDIT);
        utils.switchToWindowWithURL("ManageAuditScheduleSetup.aspx");
        utils.waitForVisibility(AUDIT_MASTER_CATEGORY_DROPDOWN);
    }


    public static void verifyUNScheduleNo() throws InterruptedException {
        String ScheduleNo = testDataModel.getScheduleNo();
        By ScheduleNoValue = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadTxt_ScheduleNo' and @value= '"+ScheduleNo+"']");
        utils.waitForVisibility(ScheduleNoValue);
        Assert.assertTrue(utils.isElementVisible(ScheduleNoValue));
    }
    public static void verifyUNScheduleName() throws InterruptedException {
        String ScheduleName = testDataModel.getScheduleName();
        By ScheduleNameValue = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadTxt_AsheCat' and contains(@value, '"+ScheduleName+"')]");
        utils.waitForVisibility(ScheduleNameValue);
        Assert.assertTrue(utils.isElementVisible(ScheduleNameValue));
    }
    public static void verifyUNAuditCategory() throws InterruptedException {
        String AuditCategory = testDataModel.getAuditCategory();
        By AuditCategoryValue = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AduitC_Combo2_Input' and @value ='"+AuditCategory+"']");
        utils.waitForVisibility(AuditCategoryValue);
        Assert.assertTrue(utils.isElementVisible(AuditCategoryValue));
    }
    public static void verifyUNProperty() throws InterruptedException {
        String Property = testDataModel.getProperty();
        By PropertyValue = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_AduitSubComunity_Combo3_Input' and @value ='"+Property+"']");
        utils.waitForVisibility(PropertyValue);
        Assert.assertTrue(utils.isElementVisible(PropertyValue));
    }
    public static void verifyUNPrimaryAuditee() throws InterruptedException {
        String PrimaryAudite = testDataModel.getPrimaryAuditee();
        By PrimaryAuditeValue = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadPrimaryAudity_Combo4_Input' and @value ='"+PrimaryAudite+"']");
        utils.waitForVisibility(PrimaryAuditeValue);
        Assert.assertTrue(utils.isElementVisible(PrimaryAuditeValue));
    }
    public static void SelectRandomAuditfromTable(String gridName) throws InterruptedException {
        String mappedGridName  = TAB_GRID_MAP.get(gridName.toUpperCase());
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//input[@alt='Delete' and contains(@name, '"+mappedGridName+"') and contains(@src, 'DeleteIcon.png')]"));

        int randomIndex = new Random().nextInt(deleteButtons.size());
        WebElement row = deleteButtons.get(randomIndex).findElement(By.xpath("./ancestor::tr[1]"));

        testDataModel.setAuditNo(row.findElement(By.xpath(".//td[2]//nobr")).getText().trim());
        testDataModel.setScheduleon(row.findElement(By.xpath(".//td[8]//span")).getText().trim());

        String AuditNo = testDataModel.getAuditNo();
        String Scheduledate = testDataModel.getScheduleon();

        By SEARCH_AUDITNO = By.xpath("//input[contains(@id,'" + mappedGridName + "') and contains(@id,'FilterTextBox_AuditNo')]");
        By SEARCH_SCHEDLEDATE = By.xpath("//input[contains(@id,'" + mappedGridName + "') and contains(@id,'FilterTextBox_AuditScheduleDate')]");

        utils.typeText(SEARCH_AUDITNO, AuditNo + Keys.ENTER);
        JavaScriptExeUtil.scrollToElementHorizontal(driver, driver.findElement(SEARCH_SCHEDLEDATE));
        utils.waitForVisibility(SEARCH_SCHEDLEDATE);
        utils.typeText(SEARCH_SCHEDLEDATE, Scheduledate + Keys.ENTER);
        By ScheduleNumberWait = By.xpath("//tr[1]//td/nobr[text()='"+AuditNo+"']");
        utils.waitForVisibility(ScheduleNumberWait);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void getOverdueauditdetailsfromtable(String gridName){
        String mappedGridName  = TAB_GRID_MAP.get(gridName.toUpperCase());
        WebElement AuditStatus = driver.findElement(By.xpath("//tr[contains(@id,'" + mappedGridName + "')]/td[5]/nobr"));
        WebElement MasterCategoryName = driver.findElement(By.xpath("//span[contains(@id,'" + mappedGridName + "') and contains(@id,'lblCMastCatName')]"));
        WebElement AuditName = driver.findElement(By.xpath("//span[contains(@id,'" + mappedGridName + "') and contains(@id,'lblCAuditName')]"));
        WebElement PropertyName = driver.findElement(By.xpath("//tr[contains(@id,'" + mappedGridName + "')]/td[10]/nobr"));
        WebElement AuditorName = driver.findElement(By.xpath("//tr[contains(@id,'" + mappedGridName + "')]/td[11]/span"));
//        WebElement Auditee = driver.findElement(By.xpath("//tr[contains(@id,'" + mappedGridName + "')]/td[12]/span"));
//        WebElement AuditeeContract = driver.findElement(By.xpath(".//td[9]/nobr"));

        testDataModel.setAuditStatus(AuditStatus.getText().trim());
        testDataModel.setAuditMasterCategory(MasterCategoryName.getText().trim());
        testDataModel.setAuditName(AuditName.getText().trim());
        testDataModel.setProperty(PropertyName.getText().trim());
        testDataModel.setAuditorName(AuditorName.getText().trim());
//        testDataModel.setAuditee(Auditee.getText().trim());
//        testDataModel.setPrimaryAuditee(AuditeeContract.getText().trim());
    }
    public static void clickingTransfer(String gridName){
        String mappedGridName  = TAB_GRID_MAP.get(gridName.toUpperCase());
        By TRANSFER_BUTTON = By.xpath("//button[(@value = 'Transfer') and contains(@id,'" + mappedGridName + "')]");
        JavaScriptExeUtil.scrollToElementHorizontal(driver, driver.findElement(TRANSFER_BUTTON));
        utils.click(TRANSFER_BUTTON);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void getTranferRandomAuditorComapnyDropdown(){
        utils.waitForVisibility(TRANSFER_AUDITOR_COMPANY_DROPDOWN);
        utils.click(TRANSFER_AUDITOR_COMPANY_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_TRANSFER_COMPANY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_TRANSFER_COMPANY);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void getTranferRandomAuditorDropdown() {
        utils.waitForVisibility(TRANSFER_AUDITOR_DROPDOWN);
        utils.click(TRANSFER_AUDITOR_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_TRANFER_AUDITOR);
        HelperUtils.clickRandomElement(ALL_OPTIONS_TRANFER_AUDITOR);
        WebElement inputField = driver.findElement(TRANSFER_AUDITOR_DROPDOWN);
        String inputvalue = inputField.getAttribute("value");
        ElementUtils.waitForLoaderToDisappear();
        String firstVal = inputvalue.split("/")[0].trim();
        testDataModel.setAuditor(firstVal);
    }
    public static void getRandomReasonDropdown(){
        utils.click(TRANSFER_REASON_DROPDOWN);
        utils.waitForVisibility(ALL_OPTIONS_TRANSFER_REASON);
        HelperUtils.clickRandomElement(ALL_OPTIONS_TRANSFER_REASON);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void enterRandomRemarksText(){
        String randomRemarks = dataGenerator.generateShortName();
        utils.typeText(TRANSFER_REMARKS, randomRemarks);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void clickingonTransferSave(){
        WebElement element = driver.findElement(TRANSFER_SAVE_BUTTON);
        JavaScriptExeUtil.scrollToElement(driver, element);
        utils.waitForVisibility(TRANSFER_SAVE_BUTTON);
        jsClick(driver, element);
        utils.waitUntilInvisible(TRANSFER_SAVE_BUTTON);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void verifyUNAuditNo(String gridName) throws InterruptedException {
        String mappedGridName  = TAB_GRID_MAP.get(gridName.toUpperCase());
        String AuditNo = testDataModel.getAuditNo();
        String Auditor = testDataModel.getAuditor();
        By AgainSEARCH_AUDITNO = By.xpath("//input[contains(@id,'" + mappedGridName + "') and contains(@id,'FilterTextBox_AuditNo')]");
        utils.typeText(AgainSEARCH_AUDITNO, AuditNo + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        By AuditorName = By.xpath("//tr[contains(@id,'" + mappedGridName + "')]/td[11]/span[contains(text(), '"+Auditor+"')]");
        Assert.assertTrue(utils.isElementVisible(AuditorName));
    }
    public static void auditCanceldetails(){
        ElementUtils.waitForLoaderToDisappear();
        utils.click(CANCEL_REASON_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CANCEL_REASON_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CANCEL_REASON_DROPDOWN);
        String randomRemarks = dataGenerator.generateShortName();
        utils.typeText(CANCEL_REMARKS, randomRemarks);

    }
    public static void verifyDeletedAuditRecordsPresent(String gridName) {
        String mappedGridName  = TAB_GRID_MAP.get(gridName.toUpperCase());
        String AuditNo = testDataModel.getAuditNo();
        By SEARCH_AUDITNO = By.xpath("//input[contains(@id,'" + mappedGridName + "') and contains(@id,'FilterTextBox_AuditNo')]");
        utils.typeText(SEARCH_AUDITNO, AuditNo + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        By NO_RECORDS = By.xpath("//table[contains(@id,'" + mappedGridName + "')]//tr[@class='rgNoRecords']//div[text()='No Records Found']");
        utils.waitForVisibility(NO_RECORDS);
        Assert.assertTrue(utils.isElementVisible(NO_RECORDS));
    }
    public static void openOverDueAudit(String gridName){
        String mappedGridName  = TAB_GRID_MAP.get(gridName.toUpperCase());
        By open_Audit = By.xpath("//tr[(@class = 'rgRow') and contains(@id,'" + mappedGridName + "')][1]");
        utils.click(open_Audit);
        utils.switchToWindowWithURL("OpenAudit.aspx?MenuItemsId=74");
        utils.waitForVisibility(AUDIT_DETAIL_APPROVAL);
    }
    public static void verifyODAuditStatus() throws InterruptedException {
        String AuditStatusName = testDataModel.getAuditStatus();
        By AuditStatusValue = By.xpath("//div[@id='divSummary']//span[contains(text(), '"+AuditStatusName+"')]");
        utils.waitForVisibility(AuditStatusValue);
        Assert.assertTrue(utils.isElementVisible(AuditStatusValue));
    }
    public static void verifyODMasterCategoryName() throws InterruptedException {
        String MasterCategoryName = testDataModel.getAuditMasterCategory();
        By MasterCategoryValue = By.xpath("//div[@id='divSummary']//li[contains(text(), '"+MasterCategoryName+"')]");
        utils.waitForVisibility(MasterCategoryValue);
        Assert.assertTrue(utils.isElementVisible(MasterCategoryValue));
    }
    public static void verifyODAuditName() throws InterruptedException {
        String ODAuditName = testDataModel.getAuditName();
        By AuditNameValue = By.xpath("//div[@id='divSummary']//li[contains(text(), '"+ODAuditName+"')]");
        utils.waitForVisibility(AuditNameValue);
        Assert.assertTrue(utils.isElementVisible(AuditNameValue));
    }
    public static void verifyODPropertyName() throws InterruptedException {
        String PropertyName = testDataModel.getProperty();
        By PropertyValue = By.xpath("//div[@id='divSummary']//li[span[contains(text(), 'Property')] and contains(text(), '"+PropertyName+"')]");
        utils.waitForVisibility(PropertyValue);
        Assert.assertTrue(utils.isElementVisible(PropertyValue));
    }
    public static void verifyODAuditorName() throws InterruptedException {
        String ODAuditorName = testDataModel.getAuditorName();
        By ODAuditorNameValue = By.xpath("//div[@id='divSummary']//li[contains(text(), '"+ODAuditorName+"')]");
        utils.waitForVisibility(ODAuditorNameValue);
        Assert.assertTrue(utils.isElementVisible(ODAuditorNameValue));
    }
    public static void verifyODAuditee() throws InterruptedException {
        String ODAuditeeName = testDataModel.getAuditee();
        By ODAuditeeNameValue = By.xpath("//div[@id='divSummary']//li[contains(text(), '"+ODAuditeeName+"')]");
        utils.waitForVisibility(ODAuditeeNameValue);
        Assert.assertTrue(utils.isElementVisible(ODAuditeeNameValue));
    }
    public static void getInProgressfirstRecord(){
        String firstVal = utils.getText(INPROGRESS_FIRST_AUDIT);
        testDataModel.setAuditNo(firstVal);
        By SEARCH_AUDITNO = By.xpath("//input[contains(@id,'GrdDraft') and contains(@id,'FilterTextBox_AuditNo')]");
        utils.typeText(SEARCH_AUDITNO, firstVal + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
    }
    public static void getRandomAMCDropdown() {
        utils.click(ACS_AUDIT_MASTER_CATEGORY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_AMC);
        HelperUtils.clickRandomElement(ALL_OPTIONS_AMC);
        WebElement inputField = driver.findElement(ACS_AUDIT_MASTER_CATEGORY_DROPDOWN);
        String firstVal = inputField.getAttribute("value");
        testDataModel.setAuditMasterCategory(firstVal);
    }
    public static void searchAndSelectAMC(String Value){
        utils.click(ACS_AUDIT_MASTER_CATEGORY_DROPDOWN);
        utils.typeText(ACS_AUDIT_MASTER_CATEGORY_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpAuditCategory_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.waitForVisibility(selValue);
        utils.click(selValue);
        testDataModel.setAuditMasterCategory(Value);
    }
    public static void enterAuditCategoryName(){
        String AuditCategoryName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ACS_AUDIT_CATEGORY, AuditCategoryName);
        testDataModel.setAuditCategory(AuditCategoryName);
    }
    public static void getRandomACSEAuthorityinDropdown(){
        utils.click(ACS_ENFORCING_AUTHORITY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_EA);
        HelperUtils.clickRandomElement(ALL_OPTIONS_EA);
        WebElement inputField = driver.findElement(ACS_ENFORCING_AUTHORITY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setEnforcingAuthority(SelectedValue);
    }
    public static void searchAndSelectACSEnforcingAuthority(String Value){
        utils.click(ACS_ENFORCING_AUTHORITY_DROPDOWN);
        utils.typeText(ACS_ENFORCING_AUTHORITY_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpAuthority_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setEnforcingAuthority(Value);
    }
    public static void getRandomACSIStandardDescDropdown(){
        utils.click(ACS_INDUSTRY_STD_DESC_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_INDUSTRY_STD_DESC);
        HelperUtils.clickRandomElement(ALL_OPTIONS_INDUSTRY_STD_DESC);
        WebElement inputField = driver.findElement(ACS_INDUSTRY_STD_DESC_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setIndustryStandardDescription(SelectedValue);
    }
    public static void searchAndSelectACSIStandardDesc(String Value){
        utils.click(ACS_INDUSTRY_STD_DESC_DROPDOWN);
        utils.typeText(ACS_INDUSTRY_STD_DESC_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpIndustryStdDesc_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setIndustryStandardDescription(Value);
    }
    public static void getRandomACSLegalRequireDropdown(){
        utils.click(ACS_LEGAL_REQUIREMENTS_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_LEGAL_REQUIREMENTS);
        HelperUtils.clickRandomElement(ALL_OPTIONS_LEGAL_REQUIREMENTS);
        WebElement inputField = driver.findElement(ACS_LEGAL_REQUIREMENTS_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setLegalRequirements(SelectedValue);
    }
    public static void searchAndSelectACSLegalRequire(String Value){
        utils.click(ACS_LEGAL_REQUIREMENTS_DROPDOWN);
        utils.typeText(ACS_LEGAL_REQUIREMENTS_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_radDrpLegal_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setLegalRequirements(Value);
    }
    public static void getRandomACSWorkOrderDropdown(){
        utils.click(ACS_WORK_ORDER_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_WORK_ORDER);
        HelperUtils.clickRandomElement(ALL_OPTIONS_WORK_ORDER);
        WebElement inputField = driver.findElement(ACS_WORK_ORDER_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setWorkOrderGen(SelectedValue);
    }
    public static void searchAndSelectACSWorkOrder(String Value){
        utils.click(ACS_WORK_ORDER_DROPDOWN);
        utils.typeText(ACS_WORK_ORDER_DROPDOWN, Value);
        String dropdownfirstValue = "//div[@id='ctl00_ContentPlaceHolder1_RadWinAddAuditCategory_C_ddlWOGeneration_DropDown']/div/ul/li[text()='"+Value+"']";
        By selValue = By.xpath(dropdownfirstValue);
        utils.click(selValue);
        testDataModel.setWorkOrderGen(Value);
    }
    public static void enterrandomLocationSampling() {
        String LocationValue = dataGenerator.generateWeightage();
        utils.typeText(SAMPLING_LOCATION, LocationValue);
        testDataModel.setLocationSampling(LocationValue);
    }
    public static void enterrandomAssetSampling() {
        String AssetValue = dataGenerator.generateWeightage();
        utils.typeText(SAMPLING_ASSET, AssetValue);
        testDataModel.setAssetSampling(AssetValue);
    }
    public static void checkedEnforceSampling(){
        WebElement enforceSamplingCheckbox = driver.findElement(ENFORCE_SAMPLING);
        Assert.assertTrue("Checkbox should be checked initially", enforceSamplingCheckbox.isSelected());
    }
    public static void checkedPredefined(){
        WebElement predefinedCheckbox = driver.findElement(PREDEFINED);
        Assert.assertTrue("Checkbox should be checked initially", predefinedCheckbox.isSelected());
    }
    public static void checkedQuesBank(){
        WebElement QuesBankCheckbox = driver.findElement(Q_BANK);
        Assert.assertTrue("Checkbox should be checked initially", QuesBankCheckbox.isSelected());
    }
    public static void checkedIssueBased(){
        WebElement IssueBasedCheckbox = driver.findElement(ISSUE_BASED);
        Assert.assertTrue("Checkbox should be checked initially", IssueBasedCheckbox.isSelected());
    }


    public static void verifyAMCandACN() throws InterruptedException {
        String authValue = testDataModel.getAuditMasterCategory();
        String authValuetwo = testDataModel.getAuditCategory();

        utils.typeText(SEARCH_AUDIT_MASTER_CAT, authValue + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        utils.typeText(SEARCH_AUDIT_CATEGORY_NAM, authValue + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();

        By searchVal = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));

        By searchValtwo = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[text()='"+authValuetwo+"']");
        utils.waitForVisibility(searchValtwo);
        Assert.assertTrue(utils.isElementVisible(searchValtwo));

    }
    public static void verifyEnforcingAuth() throws InterruptedException {
        String authValuethree = testDataModel.getEnforcingAuthority();
        By EnforcingAuthValue = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[text()='"+authValuethree+"']");
        utils.waitForVisibility(EnforcingAuthValue);
        Assert.assertTrue(utils.isElementVisible(EnforcingAuthValue));
    }
    public static void verifyIndusStandDesc() throws InterruptedException {
        String authValuefour = testDataModel.getIndustryStandardDescription();
        By IndusStandDescValue = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[text()='"+authValuefour+"']");
        utils.waitForVisibility(IndusStandDescValue);
        Assert.assertTrue(utils.isElementVisible(IndusStandDescValue));
    }
    public static void verifyLegalReq() throws InterruptedException {
        String authValuefive = testDataModel.getLegalRequirements();
        By LegalReqValue = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[text()='"+authValuefive+"']");
        utils.waitForVisibility(LegalReqValue);
        Assert.assertTrue(utils.isElementVisible(LegalReqValue));
    }
    public static void verifyAssetLocationSample() throws InterruptedException {
        String authValuesix = testDataModel.getLocationSampling();
        String authValueseven = testDataModel.getAssetSampling();

        JavaScriptExeUtil.scrollToElementHorizontal(driver, driver.findElement(SEARCH_AUDIT_STATUS));
        utils.typeText(SEARCH_LOCATION_SAMPLING, authValuesix + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();
        utils.typeText(SEARCH_ASSET_SAMPLING, authValueseven + Keys.ENTER);
        ElementUtils.waitForLoaderToDisappear();

        By LoactionVal = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[text()='"+authValuesix+"'][1]");
        utils.waitForVisibility(LoactionVal);
        Assert.assertTrue(utils.isElementVisible(LoactionVal));

        By AssetVal = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[text()='"+authValueseven+"']");
        utils.waitForVisibility(AssetVal);
        Assert.assertTrue(utils.isElementVisible(AssetVal));
    }
    public static void verifyWorkOrder() throws InterruptedException {
        String WorkOrderName = testDataModel.getWorkOrderGen();
        By WorkOrderValue = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[text()='"+WorkOrderName+"']");
        utils.waitForVisibility(WorkOrderValue);
        Assert.assertTrue(utils.isElementVisible(WorkOrderValue));
    }
    public static void verifyCheckboxValidation() throws InterruptedException {

        By EnforceSamplingValue = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[10]/span[@class='icon-check-circle']");
        utils.waitForVisibility(EnforceSamplingValue);
        Assert.assertTrue(utils.isElementVisible(EnforceSamplingValue));

        By PredefinedValue = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[11]/span[@class='icon-check-circle']");
        utils.waitForVisibility(PredefinedValue);
        Assert.assertTrue(utils.isElementVisible(PredefinedValue));

        By QBankValue = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[12]/span[@class='icon-check-circle']");
        utils.waitForVisibility(QBankValue);
        Assert.assertTrue(utils.isElementVisible(QBankValue));

        By IssueBasedValue = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAuditCategory_ctl00__0']/td[13]/span[@class='icon-check-circle']");
        utils.waitForVisibility(IssueBasedValue);
        Assert.assertTrue(utils.isElementVisible(IssueBasedValue));
    }
    public static void openFirstCreatedAudit(){
        utils.click(FIRST_CREATED_AUDIT);
        utils.switchToWindowWithURL("ManageAuditCategory.aspx");
        utils.waitForVisibility(GENERAL_DETAILS);
    }
    public static void addQuestionCategory(){
        utils.click(ADD_QUESTION_CATEGORY);
        ElementUtils.waitForLoaderToDisappear();
        utils.waitForVisibility(ENTER_QUESTION_CATEGORY);

        String QuestionCategoryName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ENTER_QUESTION_CATEGORY, QuestionCategoryName);
        testDataModel.setQuestionCategory(QuestionCategoryName);

        utils.click(APPLICABLE_TO_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_APPLICABLE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_APPLICABLE);
        WebElement inputField = driver.findElement(APPLICABLE_TO_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setApplicableTo(SelectedValue);

        if (SelectedValue.equalsIgnoreCase("Asset")) {
            utils.waitForVisibility(ASSET_SUB_CATEGORIES_TABLE);
            HelperUtils.clickRandomElement(ALL_OPTIONS_ASSET_QC);

        } else if (SelectedValue.equalsIgnoreCase("Location")) {
            utils.waitForVisibility(LOCATION_SUB_CATEGORIES_TABLE);
            HelperUtils.clickRandomElement(ALL_OPTIONS_LOCATION_QC);

        } else {
            Assert.fail("Unexpected dropdown value: " + SelectedValue);
        }

    }
    public static void addQuestionSubCategory(){
        utils.click(ADD_QUESTION_SUBCATEGORY);
        ElementUtils.waitForLoaderToDisappear();
        utils.waitForVisibility(ENTER_QUESTION_SUBCATEGORY);

        utils.click(QUESTION_CATEGORY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_QUES_CATEGORY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_QUES_CATEGORY);
        utils.waitUntilInvisible(PHOTO_COUNT_DISABLE);

        String QuestionSubCategoryName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ENTER_QUESTION_SUBCATEGORY, QuestionSubCategoryName);
        testDataModel.setQuestionSubCategory(QuestionSubCategoryName);
    }

    public static void addQuestion(){
        utils.click(ADD_QUESTION);
        ElementUtils.waitForLoaderToDisappear();
        utils.waitForVisibility(ENTER_QUESTION);

        utils.waitForVisibility(QQUESTION_CATEGORY_DROPDOWN);
        utils.click(QQUESTION_CATEGORY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(QALL_OPTIONS_QUES_CATEGORY);
        HelperUtils.clickRandomElement(QALL_OPTIONS_QUES_CATEGORY);

        utils.waitUntilInvisible(QUESTION_SUBCATEGORY_DISABLE);
        utils.waitForVisibility(QQUESTUON_SUBCATEGORY_DROPDOWN);
        utils.click(QQUESTUON_SUBCATEGORY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(QALL_OPTIONS_QUES_SUBCATEGORY);
        HelperUtils.clickRandomElement(QALL_OPTIONS_QUES_SUBCATEGORY);

        String QuestionName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ENTER_QUESTION, QuestionName);
        testDataModel.setQuestionSubCategory(QuestionName);

//        //Clause
//        utils.click(QCLAUSE_DROPDOWN);
//        ElementUtils.waitForDropdownLoading();
//        utils.waitForVisibility(ALL_OPTIONS_QCLAUSE);
//        HelperUtils.clickRandomElement(ALL_OPTIONS_QCLAUSE);

        //Weight
        String AssetValue = dataGenerator.generateWeightage();
        utils.typeText(ENTER_WEIGHT, AssetValue);
        testDataModel.setQuestionWeight(AssetValue);

        //Question Related Checkboxes
        List<WebElement> QuesCheckboxes = driver.findElements(QUESTION_RELATE_CHECKBOX);
        for (WebElement checkbox : QuesCheckboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
        //Photo Allowed Checkboxes
        List<WebElement> PhotoCheckboxes = driver.findElements(PHOTO_ALLOWED_CHECKBOX);
        for (WebElement checkbox : PhotoCheckboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
        //Remarks Mandatory Checkboxes
        List<WebElement> RemarksCheckboxes = driver.findElements(REMARKS_MANDAT_CHECKBOX);
        for (WebElement checkbox : RemarksCheckboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }

        //Default LOV dropdown selection
        utils.click(QSERVICE_GROUP_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_SERVICE_GROUP);
        HelperUtils.clickRandomElement(ALL_OPTIONS_SERVICE_GROUP);

        utils.waitUntilInvisible(FAULT_CATEGORY_DISABLE);
        utils.waitForVisibility(QFAULT_CATEGORY_DROPDOWN);
        utils.click(QFAULT_CATEGORY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_FAULT);
        HelperUtils.clickRandomElement(ALL_OPTIONS_FAULT);

        utils.waitUntilInvisible(FAULT_CODE_DISABLE);
        utils.waitForVisibility(QFAULT_CODE_DROPDOWN);
        utils.click(QFAULT_CODE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_FAULT_CODE);
        HelperUtils.clickRandomElement(ALL_OPTIONS_FAULT_CODE);

        utils.click(QPRIORITY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_QPRIORITY);
        HelperUtils.clickRandomElement(ALL_OPTIONS_QPRIORITY);

        utils.click(QCONTRACT_GROUP_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OPTIONS_QCONTRACT_GROUP);
        HelperUtils.clickRandomElement(ALL_OPTIONS_QCONTRACT_GROUP);

        List<WebElement> PhotoMandCheckboxes = driver.findElements(PHOTO_MANDATORY_CHECKBOX);
        for (WebElement checkbox : PhotoMandCheckboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }

    }







}
