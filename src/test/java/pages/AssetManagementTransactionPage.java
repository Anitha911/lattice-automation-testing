package pages;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import utils.ElementUtils;
import utils.TestContext;
import java.util.Random;
import utils.RandomDateUtils;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.lang.Thread.sleep;

public class AssetManagementTransactionPage  extends BasePage {
    public AssetManagementTransactionPage(WebDriver driver) {
        super(driver);
    }

    public static final By ADD_ASSET_BUTTON = By.id("ctl00_ContentPlaceHolder1_btnAddAsset");
    public static final By ASSET_CODE_INPUT = By.xpath("//input[contains(@id,'txtBarcode')]");
    public static final By ASSET_NAME = By.id("ctl00_ContentPlaceHolder1_AddAssetWindow_C_txtAssetName");
    public static final By ADD_ASSET_OWNERSHIP = By.id("ctl00_ContentPlaceHolder1_AddAssetWindow_C_ddlOwnType_Input");
    public static final By ADD_ASSET_CRITICALITY =  By.id("ctl00_ContentPlaceHolder1_AddAssetWindow_C_ddlAssetCriticality_Arrow");
    public static final By ADD_ASSET_CLIENT_DROPDOWN = By.xpath("//a[contains(@id,'ddlClient_Arrow')]");
    public static final By ADD_ASSET_CONTRACT_DROPDOWN = By.xpath("//a[contains(@id,'ddlClientContract_Arrow')]");
    public static final By ADD_ASSET_CLASS_DROPDOWN = By.xpath("//a[contains(@id,'ddlAssetMasterClass_Arrow')]");
    public static final By ADD_ASSET_MASTER_CATEGORY_DROPDOWN = By.xpath("//a[contains(@id,'ddlAssetMasterCategory_Arrow')]");
    public static final By ADD_ASSET_CATEGORY_DROPDOWN = By.xpath("//a[contains(@id,'ddlAssetCategory_Arrow')]");
    public static final By ADD_ASSET_SUB_CATEGORY_DROPDOWN = By.xpath("//a[contains(@id,'ddlAssetSubCategory_Arrow')]");
    public static final By ADD_ASSET_FUNCTIONAL_STATUS = By.id("ctl00_ContentPlaceHolder1_AddAssetWindow_C_ddlToStatus_Input");
    public static final By ADD_ASSET_CONDITION = By.id("ctl00_ContentPlaceHolder1_AddAssetWindow_C_ddlToCondition_Input");
    public static final By ADD_ASSET_LOCATION_LEVEL = By.xpath("//a[contains(@id,'ddlReportingLevel_Arrow')]");
    public static final By ADD_ASSET_PROPERTY_DROPDOWN = By.xpath("//a[contains(@id,'ddlProperty_Arrow')]");
    public static final By ADD_ASSET_ZONE_DROPDOWN = By.xpath("//a[contains(@id,'ddlZone_Arrow')]");
    public static final By ADD_ASSET_SUBZONE_DROPDOWN = By.xpath("//a[contains(@id,'ddlSubZone_Arrow')]");
    public static final By ADD_ASSET_BASEUNIT_DROPDOWN = By.xpath("//a[contains(@id,'ddlBaseUnit_Arrow')]");
    public static final By ADD_ASSET_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_AddAssetWindow_C_btnSave");
    public static final By ASSET_REGISTER_ASSET_CODE_SEARCH_BOX =  By.xpath("//input[contains(@id,'txtAssetSearchBox')]");


    public static final By ASSET_TRANSFER_BUTTON = By.id("ctl00_ContentPlaceHolder1_hlkAssetTransfer");
    public static final By ASSIGN_OWNER_BUTTON = By.id("ctl00_ContentPlaceHolder1_BtnAssetOwner");
    public static final By DECOMMMISSION_BUTTON = By.id("ctl00_ContentPlaceHolder1_hlkDecommission");
    public static final By PPM_APPLICABLITY_CHANGE_BUTTON = By.id("ctl00_ContentPlaceHolder1_hlkPPMApplicability");
    public static final By ASSET_CLASSIFICATION_CHANGE_BUTTON = By.id("ctl00_ContentPlaceHolder1_btnAssetCopy");


    public static final By COMMERCIAL_MENU = By.id("mnuCommercial");
    public static final By ATTACHMENT_MENU = By.id("tdAttachments");
    public static final By ASSET_RELATED_CONTACTS_MENU = By.id("tdContacts");
    public static final By CONTRACT_GROUP_MENU = By.id("mnuContractGroup");
    public static final By NOTIFYING_USERS_MENU = By.id("mnuNotifyingUsers");
    public static final By NOTES_MENU = By.id("mnuNotes");
    public static final By METERING_PARAMETERS_MENU = By.id("mnuMeteringParameters");
    public static final By TRIGGERS_MENU = By.id("mnuTriggers");
    public static final By SCHEDULE_MENU = By.id("mnuSchedules");
    public static final By CONDITIONAL_PICTURES_MENU = By.id("mnuConditionalPicture");

    public static final By ASSET_TRANSFER_REASON = By.id("ctl00_ContentPlaceHolder1_AssetTransferWindow_C_ddlATReason_Input");
    public static final By ASSET_TRANSFER_REMARKS = By.id("txtATRemarks");
    public static final By ASSET_TRANSFER_LOCATION_LEVEL =   By.xpath("//a[contains(@id,'ddlTOLocationLevel_Arrow')]");
    public static final By ASSET_TRANSFER_PROPERTY_DROPDOWN = By.xpath("//a[contains(@id,'ddlTOProperty_Arrow')]");
    public static final By ASSET_TRANSFER_ZONE_DROPDOWN = By.xpath("//a[contains(@id,'ddlTOZone_Arrow')]");
    public static final By ASSET_TRANSFER_SUBZONE_DROPDOWN = By.xpath("//a[contains(@id,'ddlTOSubZone_Arrow')]");
    public static final By ASSET_TRANSFER_BASEUNIT_DROPDOWN = By.xpath("//a[contains(@id,'ddlTOBaseUnit_Arrow')]");



    public static final By ASSET_TRANSFER_PPM_CHECKBOX = By.id("chkPPMSchedule");
    public static final By ASSET_TRANSFER_SCM_CHECKBOX = By.id("chkSCRSchedule");
    public static final By ASSET_TRANSFER_SEND_FOR_APPROVAL = By.id("ctl00_ContentPlaceHolder1_AssetTransferWindow_C_btnSaveAT");
    public static final By ASSIGN_OWNER_SELECT = By.id("ctl00_ContentPlaceHolder1_RadWinAssetOwner_C_grdAssetOwnerList_ctl00__3");
    public static final By ASSIGN_OWNER_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinAssetOwner_C_BtnAssetOwnerSave");
    public static final By PPM_APPLICABILITY_REMARKS = By.id("txtPPMRemarks");
    public static final By PPM_APPLICABILITY_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_PPMApplicabilityChangeWindow_C_btnSavePPM");
    public static final By PPM_APPLICABILITY_CONFIRM_BUTTON = By.id("ctl00_ContentPlaceHolder1_radwinYesNo_C_rbRenew");
    public static final By CLASSIFICATION_CHANGE_YES_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinAssetClassificationWarning_C_btnAssetClassificationWarningOk");
    public static final By CLONE_ASSET_BUTTON = By.id("ctl00_ContentPlaceHolder1_btnAssetClone");

    public static final By ASSET_LINK_CONTACT_ADD_BUTTON = By.id("ContentPlaceHolder1_Spancontactlink");
    public static final By ASSET_LINK_CONTACT_CHECKBOX = By.id("ctl00_ContentPlaceHolder1_RadWinLinkContact_C_SelectContact_Grid_ctl01__13");
    public static final By ASSET_LINK_CONTACT_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinLinkContact_C_btnSASave");


    public static final By ASSET_ATTACHMENT_ADD_BUTTON = By.id("ContentPlaceHolder1_SpanAttach");
    public static final By ASSET_ATTACHMENT_DOCUMENT_TYPE_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_ddSingleDcoType_Arrow");
    public static final By ASSET_ATTACHMENT_DOCUMENT_TYPE_OPTIONS = By.xpath("//div[contains(@id,'ddSingleDcoType')]//li");
    public static final By ASSET_ATTACHMENT_CHOOSE_FILE = By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_btnAttachmentSingleDocFilefile0");
    public static final By ASSET_ATTACHMENT_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_btnAttachmentSingleSaveAttachments");


    public static final By NOTIFY_USERS_ADD_BUTTON = By.id("ContentPlaceHolder1_Span22");
    public static final By NOTIFYING_USERS_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinNotifyUsers_C_radDrpNotifyUsers_Arrow");
    public static final By NOTIFYING_USERS_OPTIONS = By.xpath("//div[contains(@id,'radDrpNotifyUsers')]//li");
    public static final By NOTIFYING_USERS_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinNotifyUsers_C_btnNotifySave");


    public static final By ASSET_NOTES_ADD_BUTTON = By.id("ContentPlaceHolder1_AddNotes");
    public static final By ASSET_NOTES_NOTE_TYPE_CATEGORY_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_NotesWindow_C_ddlDocType_Arrow");
    public static final By ASSET_NOTES_NOTE_TYPE_CATEGORY_OPTIONS = By.xpath("//div[contains(@id,'ddlDocType')]//li");
    public static final By ASSET_NOTES_NOTES = By.id("txtApprovalNote");
    public static final By ASSET_NOTES_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_NotesWindow_C_btnNoteSave");


    public static final By ASSET_METERING_PARAMETER_ADD_BUTTON = By.id("ContentPlaceHolder1_Span18");
    public static final By ASSET_METERING_PARAMETER_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_raddrpParameter_Arrow");
    public static final By ASSET_METERING_PARAMETER_OPTIONS = By.xpath("//div[contains(@id,'raddrpParameter')]//li");
    public static final By ASSET_METERING_PARAMETER_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_btnMeteringSave");

    public static final By ASSET_ADD_TRIGGER_BUTTON = By.id("ContentPlaceHolder1_Span19");
    public static final By ASSET_TRIGGER_NAME =  By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_radtxtTriggerName");
    public static final By ASSET_TRIGGER_PARAMETER_DROPDOWN = By.xpath("//a[contains(@id,'raddrpTriggerPara_Arrow')]");
    public static final By ASSET_TRIGGER_COMPARISON_TYPE =  By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_raddrpCompareType_Input");
    public static final By ASSET_TRIGGER_EVENT_DROPDOWN =  By.xpath("//a[contains(@id,'raddrpTriggerEvent_Arrow')]");
    public static final By ASSET_TRIGGER_PARAMETER_VALUE_FROM = By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_radtxtParaValueFrom");
    public static final By ASSET_TRIGGER_PARAMETER_VALUE_TO = By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_radtxtParaValueTo");
    public static final By ASSET_TRIGGER_REASON_DROPDOWN = By.xpath("//a[contains(@id,'raddrpTriggerReason_Arrow')]");
    public static final By ASSET_TRIGGER_CONTRACT_GROUP_DROPDOWN = By.xpath("//a[contains(@id,'raddrpContract_Arrow')]");
    public static final By ASSET_TRIGGER_WORK_ORDER_TYPE =  By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_RaddrpWorkorder_Input");
    public static final By  ASSET_TRIGGER_SERVICE_GROUP_DROPDOWN =  By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_raddrpServiceGrp_Arrow");
    public static final By ASSET_TRIGGER_FAULT_CATEGORY_DROPDOWN =  By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_raddrpFaultCat_Arrow");
    public static final By ASSET_TRIGGER_FAULT_CODE_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_raddrpFaultCode_Arrow");
    public static final By ASSET_TRIGGER_PRIORITY_DROPDOWN =  By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_radrpPriority_Arrow");
    public static final By ASSET_TRIGGER_WO_GEN_WAIT_TIME = By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_radtxtWoGenertWait");
    public static final By ASSET_TRIGGER_PPM_TASK_SHEET_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_raddrpPPMTaskSheet_Arrow");
    public static final By ASSET_TRIGGER_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_btnTriggerSave");
    public static final By ASSET_TRIGGER_DESCRIPTION =By.id("ctl00_ContentPlaceHolder1_RadWinTriggers_C_radtxtDescription");


    public static final By ASSET_SCHEDULE_ADD_BUTTON = By.id("ContentPlaceHolder1_Span20222");
    public static final By ASSET_TASK_SHEET_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinSchedule_C_ddlTaskSheetNumber_Arrow");
    public static final By ASSET_SCHEDULE_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinSchedule_C_RadButton10");


    public static final By CONDITIONAL_PICTURE_ADD_BUTTON = By.id("ContentPlaceHolder1_Span21");
    public static final By CONDITIONAL_PICTURE_TYPE_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_ddSingleDcoType_Arrow");
    public static final By CONDITIONAL_PICTURE_TYPE_OPTIONS = By.xpath("//div[contains(@id,'ddSingleDcoType')]//li");
    public static final By CONDITIONAL_PICTURE_PHOTOS_CHOOSE_FILE = By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_btnAttachmentSingleDocFilefile0");
    public static final By CONDITIONAL_PICTURE_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_btnAttachmentSingleSaveAttachments");


    public static final By CONDITION_UPDATE_BUTTON = By.xpath("//button[contains(text(),'Condition Update')]");
    public static final By CONDITION_UPDATE_TO_CONDITION = By.id("ctl00_ContentPlaceHolder1_ConditionUpdateWindow_C_ddlToCondition_Input");
    public static final By CONDITION_UPDATE_REMARKS = By.id("txtCURemarks");
    public static final By CONDITION_UPDATE_POSSIBLE_CAUSE = By.id("ctl00_ContentPlaceHolder1_ConditionUpdateWindow_C_ddlPossibleCause_Input");
    public static final By CONDITION_UPDATE_ANTICIPATED_ACTION = By.id("ctl00_ContentPlaceHolder1_ConditionUpdateWindow_C_ddlAnticipatedAction_Input");
    public static final By CONDITION_UPDATE_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_ConditionUpdateWindow_C_btnConditionUpdateOk");

    public static final By FUNCTIONAL_UPDATE_BUTTON = By.xpath("//button[contains(text(),'Functional Update')]");
    public static final By FUNCTIONAL_UPDATE_TO_STATUS = By.id("ctl00_ContentPlaceHolder1_FunctionalStatusChangeWindow_C_ddlToStatus_Input");
    public static final By FUNCTIONAL_UPDATE_REASON = By.id("ctl00_ContentPlaceHolder1_FunctionalStatusChangeWindow_C_ddlFSCReason_Input");
    public static final By FUNCTIONAL_UPDATE_REMARKS = By.id("txtFSCRemarks");
    public static final By FUNCTIONAL_UPDATE_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_FunctionalStatusChangeWindow_C_btnFSCSave");

    public static final By ASSET_GRID_LIST_FIRST_RECORD = By.id("ctl00_ContentPlaceHolder1_grdAsset_ctl00__0");


    public static final By ASSET_MANAGE_CONTRACT_GROUP_ICON = By.id("ContentPlaceHolder1_Span3");
    public static final By ASSET_MANAGE_CONTRACT_GROUP_CHECKBOX = By.id("ctl00_ContentPlaceHolder1_RadWinContractGroup_C_grdAllContractGroup_ctl01__1");
    public static final By ASSET_CONTRACT_GROUP_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinContractGroup_C_btnSaveContractGroup");

    public static final By ASSET_FINALISED_BUTTON = By.id("ctl00_ContentPlaceHolder1_btnSendApproval");

    public static final By ADD_ASSET_INVENTORY_BUTTON = By.id("ctl00_ContentPlaceHolder1_BtnAdd");
    public static final By ASSET_INVENTORY_VERIFICATION_NAME = By.id("txtVerificationName");
    public static final By ASSET_INVENTORY_CLIENT_DROPDOWN = By.xpath("//input[contains(@id,'cmbClient_Input')]");
    public static final By ASSET_INVENTORY_CLIENT_CONTRACT_DROPDOWN =  By.xpath("//input[contains(@id,'cmbClientContract_Input')]");
    public static final By ASSET_INVENTORY_LOCATION_LEVEL = By.xpath("//a[contains(@id,'ddlReportingLevel_Arrow')]");
    public static final By ASSET_INVENTORY_PROPERTY_DROPDOWN = By.xpath("//a[contains(@id,'ddlProperty_Arrow')]");
    public static final By ASSET_INVENTORY_ZONE_DROPDOWN = By.xpath("//a[contains(@id,'ddlZone_Arrow')]");
    public static final By ASSET_INVENTORY_SUBZONE_DROPDOWN = By.xpath("//a[contains(@id,'ddlSubZone_Arrow')]");
    public static final By ASSET_INVENTORY_BASEUNIT_DROPDOWN = By.xpath("//a[contains(@id,'ddlBaseUnit_Arrow')]");
    public static final By ASSET_INVENTORY_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinAssetInventory_C_btnSaveAssetInventory");


    public static final By ASSET_REGISTER_EXPORT_TO_EXCEL = By.id("btnExcelFilter");
    public static final By ASSET_INVENTORY_EXPORT_TO_EXCEL = By.id("btnExportToExcel");
    public static final By UNSCHEDULED_ASSETS_EXPORT_TO_EXCEL = By.id("ContentPlaceHolder1_btnExportToExcel");
    public static final By ALERT_CODE_SETUP_EXPORT_TO_EXCEL = By.id("btnExportToExcel");
    public static final By DECOMMISSIONED_ASSETS_EXPORT_TO_EXCEL = By.id("ContentPlaceHolder1_btnExportToExcel");

    public static final By ASSET_MODIFY_COMMERCIAL_BUTTON =  By.id("ContentPlaceHolder1_ModifySpan");
    public static final By MODIFY_COMMERCIAL_SUPPLIER = By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_ddlSupplierName_Arrow");
    public static final By MODIFY_COMMERCIAL_DELIVERY_DATE = By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rdpDeliveryDate_dateInput");
    public static final By MODIFY_COMMERCIAL_COMMISSION_DATE=By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rdpCommissioningDate_dateInput");
    public static final By MODIFY_COMMERCIAL_PURCHASE_ORDER_DATE = By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rdpPODate_dateInput");
    public static final By MODIFY_COMMERCIAL_PURCHASE_ORDER_NUMBER = By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_txtPONumber");
    public static final By MODIFY_COMMERCIAL_MISC_ITEM_COST = By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rntxtMaterialCost");
    public static final By MODIFY_COMMERCIAL_MISC_LABOUR_COST =  By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rntxtLabourCost");
    public static final By MODIFY_COMMERCIAL_MISC_OTHER_COST =  By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rntxtOtherCost");
    public static final By MODIFY_COMMERCIAL_ONE_TIME_PURCHASE_COST =  By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_txtOnetimepurchase");
    public static final By MODIFY_COMMERCIAL_ORIGINAL_EXPECTED_LIFE =  By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_txtOrgExpectedLife");
    public static final By MODIFY_COMMERCIAL_CURRENT_EXPECTED_LIFE =  By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_txtCurrentExpectedLife");
    public static final By MODIFY_COMMERCIAL_MAIN_ITEM_COST = By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rntxtTManualCostMaterial");
    public static final By MODIFY_COMMERCIAL_MAIN_LABOUR_COST =  By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rntxtTManualCostLabour");
    public static final By MODIFY_COMMERCIAL_MAIN_OTHER_COST =  By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_rntxtTManualCostOther");

    public static final By MODIFY_COMMERCIAL_SAVE_BUTTON =  By.id("ctl00_ContentPlaceHolder1_RadWinPurchase_C_btnSaveCommercial");

    public static final By ASSET_CODE_LABEL = By.id("ContentPlaceHolder1_lblSubHeadAssetCode");
    public static final By UNSCHEDULED_ASSETS_SEARCH_BOX = By.id("ctl00_ContentPlaceHolder1_txtAssetSearchBox_Input");
    public static final By UNSCHEDULED_SEARCH_BUTTON =
            By.xpath("//span[contains(@class,'k-icon') or contains(@class,'icon-search') or contains(@class,'glyphicon-search')]");
    public static final By ADD_ALERT_CODE_SETUP_BUTTON = By.id("ctl00_ContentPlaceHolder1_BtnAdd");
    public static final By ALERT_CODE_SETUP_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinAlertCode_C_BtnAlertCodeSave");
    public static final By ALERT_CODE = By.id("radtxtAlertCode");
    public static final By ALERT_CODE_DESCRIPTION = By.id("radtxtDescrp");
    public static final By ALERT_CODE_INPUT_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinAlertCode_C_raddrpInputType_Input");
    public static final By ALERT_CODE_CONTRACT_GROUP = By.id("ctl00_ContentPlaceHolder1_RadWinAlertCode_C_raddrpContractgrp_Input");
    public static final By INPUT_TYPE_ANALOG_UOM = By.id("ctl00_ContentPlaceHolder1_RadWinAlertCode_C_raddrpUnit_Input");
    public static final By INPUT_TYPE_DIGITAL_FROM_RANGE = By.id("radtxtFromRange");
    public static final By INPUT_TYPE_DIGITAL_TO_RANGE = By.id("radtxtToRange");
    public static final By SEARCH_ALERT_CODE = By.cssSelector("[alt='Filter AlertCode column']");
    public static final By DELETE_FIRST_ALERT_CODE_SETUP_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAlertCode_ctl00_ctl04_imgDelete");


    public static final By DECOMMISSION_REASON_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_AssetDecommissionWindow_C_ddlADReason_Arrow");
    public static final By DECOMMISSION_REASON_OPTIONS = By.xpath("//div[contains(@id,'ddlADReason_DropDown')]//li");
    public static final By DECOMMISSION_REMARKS = By.id("txtADRemarks");
    public static final By DECOMMISSION_WARNING_CHECKBOX = By.id("ctl00_ContentPlaceHolder1_AssetDecommissionWindow_C_CheckBox1");
    public static final By DECOMMISSION_ADD_PHOTO_ICON = By.id("addphoto");
    public static final By DECOMMISSION_REQUEST_SENT_FOR_APPROVAL = By.id("ctl00_ContentPlaceHolder1_AssetDecommissionWindow_C_btnSaveAD");
    public static final By DECOMMISSION_DOCUMENT_TYPE_DROPDOWN =
            By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_ddPhotosDcoType_Arrow");

    public static final By DECOMMISSION_DOCUMENT_TYPE_OPTIONS =
            By.xpath("//div[contains(@id,'ddPhotosDcoType_DropDown')]//li");
    public static final By DECOMMISSION_PHOTOS_CHOOSE_FILE =
            By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_btnAttachmentPhotosDocFilefile0");
    public static final By DECOMMISSION_PHOTOS_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_Attachmentwindow_C_AddAttachments_btnAttachmentPhotosSaveAttachments");
    public static final By DECOMMISSIONED_ASSET_CODE = By.id("ctl00_ContentPlaceHolder1_grdAsset_ctl00_ctl02_ctl02_FilterTextBox_AssetCode");

    public void userclickonAssetTitle(String tabTitle) {
        try {
            By locator = By.xpath(String.format("//div[@id='tab-asset']//a[text()='%s']", tabTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabTitle);
            throw e;
        }
    }


    public void userclickonbuttoninAssetDetailpage(String buttonName) {
        By button = null;
        switch (buttonName.toLowerCase()) {
            case "asset transfer":
                button = ASSET_TRANSFER_BUTTON;
                break;
            case "assign owner":
                button = ASSIGN_OWNER_BUTTON;
                break;
            case "decommission":
                button = DECOMMMISSION_BUTTON;
                break;
            case "ppm applicability change":
                button = PPM_APPLICABLITY_CHANGE_BUTTON;
                break;
            case "asset classification change":
                button = ASSET_CLASSIFICATION_CHANGE_BUTTON;
                break;
            case "clone asset":
                button = CLONE_ASSET_BUTTON;
                break;
            default: throw new RuntimeException("Invalid button name: " + buttonName);
        }
        utils.waitForElementToBeClickable(button);
        WebElement element = driver.findElement(button);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Clicked button: " + buttonName);
    }

    public void userclickonmenuinleftpaneofAssetDetailpage(String menuName) {
        By menu = null;
        switch (menuName) {
            case "Commercial":
                menu = COMMERCIAL_MENU;
                break;
            case "Attachments":
                menu = ATTACHMENT_MENU;
                break;
            case "Asset Contacts":
                menu = ASSET_RELATED_CONTACTS_MENU;
                break;
            case "Contract Group":
                menu = CONTRACT_GROUP_MENU;
                break;
            case "Notifying Users":
                menu = NOTIFYING_USERS_MENU;
                break;
            case "Notes":
                menu = NOTES_MENU;
                break;
            case "Metering Parameters":
                menu = METERING_PARAMETERS_MENU;
                break;
            case "Triggers":
                menu = TRIGGERS_MENU;
                break;
            case "Schedules":
                menu = SCHEDULE_MENU;
                break;
            case "Conditional Pictures":
                menu = CONDITIONAL_PICTURES_MENU;
                break;
            default:
                throw new RuntimeException(
                        "Invalid menu name: " + menuName);
        }
        utils.waitForElementToBeClickable(menu);
        WebElement element = driver.findElement(menu);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Clicked menu: " + menuName);
    }

    //  Create Asset

    public void userclickonAddAssetbutton() {
        utils.click(ADD_ASSET_BUTTON);
    }

    public void userstoreAssetCodeintheAddAssetform(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement assetCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(ASSET_CODE_INPUT));
        String assetCode = assetCodeField.getAttribute("value").trim();
        TestContext.set("ASSET_CODE", assetCode);
        System.out.println("Captured Asset Code: " + assetCode);
    }

    public void enterAddAsset_Name(String Asset_Name) {
        utils.typeText(ASSET_NAME, Asset_Name);
    }

    public void enterAddAssetOwnership(String Ownership ) {
        utils.click(ADD_ASSET_OWNERSHIP);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Ownership  + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected Asset Ownership: " + Ownership );
    }

    public void enterAddAsset_Criticality(String criticality) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement arrow = wait.until( ExpectedConditions.elementToBeClickable(ADD_ASSET_CRITICALITY));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
         By option = By.xpath("//div[contains(@id,'ddlAssetCriticality_DropDown')]//li[normalize-space()='"
                        + criticality + "']");
        WebElement element = wait.until( ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected Asset Criticality: " + criticality);
    }

   public void selectAddAssetRadComboBox(By arrow, String value, String idPart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        By dropdown = By.xpath("//div[contains(@id,'" + idPart + "_DropDown')]");
        By option = By.xpath("//div[contains(@id,'" + idPart + "_DropDown')]//li[normalize-space()='" + value + "']");
        for (int i = 0; i < 2; i++) {
            try {
                   waitForLoaderToDisappear();
                   wait.until(ExpectedConditions.elementToBeClickable(arrow)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(option));
             ((JavascriptExecutor) driver).executeScript(   "arguments[0].scrollIntoView({block:'center'});", element);
                   try {
                    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                } catch (Exception e) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                }
                waitForLoaderToDisappear();
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("Retrying dropdown...");
            }
        }
    }

    public void waitForLoaderToDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//div[contains(@id,'LoadingPanel')]")));
    }


    public void selectAddAssetClient() {
        selectAddAssetRadComboBox(ADD_ASSET_CLIENT_DROPDOWN, "Alpha Properties", "ddlClient");
    }

    public void selectAddAssetClient_Contract() {
        wait.until(ExpectedConditions.elementToBeClickable(ADD_ASSET_CONTRACT_DROPDOWN)); // important wait
        selectAddAssetRadComboBox(ADD_ASSET_CONTRACT_DROPDOWN, "ABC Tower", "ddlClientContract");
    }

    public void selectAddAssetClass() {
        wait.until(ExpectedConditions.elementToBeClickable(ADD_ASSET_CLASS_DROPDOWN)); // important wait
        selectAddAssetRadComboBox(ADD_ASSET_CLASS_DROPDOWN, "ak asset master", "ddlAssetMasterClass");
    }

    public void selectAddAssetMasterCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(ADD_ASSET_MASTER_CATEGORY_DROPDOWN)); // important wait
        selectAddAssetRadComboBox(ADD_ASSET_MASTER_CATEGORY_DROPDOWN, "ak electronic items", "ddlAssetMasterCategory");
    }

    public void selectAddAssetCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(ADD_ASSET_CATEGORY_DROPDOWN)); // important wait
        selectAddAssetRadComboBox(ADD_ASSET_CATEGORY_DROPDOWN, "ak office electronic items", "ddlAssetCategory");
    }

    public void selectAddAssetSubCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(ADD_ASSET_SUB_CATEGORY_DROPDOWN)); // important wait
        selectAddAssetRadComboBox(ADD_ASSET_SUB_CATEGORY_DROPDOWN, "ak laptop", "ddlAssetSubCategory");
    }

    public void enterAsset_Functional_Status(String Functional_Status  ) {
        utils.click(ADD_ASSET_FUNCTIONAL_STATUS);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Functional_Status   + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected Asset Functional Status: " + Functional_Status  );
    }

    public void enterAddAsset_Condition(String Condition  ) {
        utils.click(ADD_ASSET_CONDITION);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Condition   + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected Asset Condition: " + Condition);
    }


    public void enterAdd_Asset_Location_Level(String Location_Level  ) {
        selectAddAssetRadComboBox(ADD_ASSET_LOCATION_LEVEL, Location_Level, "ddlReportingLevel");
        System.out.println("Selected Location Level: " + Location_Level);
        handleAddAssetLocationHierarchy(Location_Level);
    }

    public String AddAssetselectRandomFromDropdown(By arrow, String idPart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Random random = new Random();
        By dropdown = By.xpath("//div[contains(@id,'" + idPart + "_DropDown')]");
        By options = By.xpath("//div[contains(@id,'" + idPart + "_DropDown')]//li[contains(@class,'rcbItem')]");
        for (int i = 0; i < 2; i++) {
            try {
                waitForLoaderToDisappear();
                wait.until(ExpectedConditions.elementToBeClickable(arrow)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
                 int size = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(options)).size();
                if (size == 0) {
                    throw new RuntimeException("No options found for " + idPart);
                }
                int index = random.nextInt(size);
                By optionByIndex = By.xpath("(//div[contains(@id,'" + idPart + "_DropDown')]//li[contains(@class,'rcbItem')])[" + (index + 1) + "]");
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
                String text = element.getText().trim();
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", element);
                try {
                    element.click();
                } catch (Exception e) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                }
                waitForLoaderToDisappear();
                System.out.println("Selected Value: " + text);
                return text;
            } catch (StaleElementReferenceException e) {
                System.out.println("Retrying random dropdown due to stale...");
            }
        }
        throw new RuntimeException("Failed to select random value for " + idPart);
    }

    public void handleAddAssetLocationHierarchy(String level) {

        String property = AddAssetselectRandomFromDropdown(ADD_ASSET_PROPERTY_DROPDOWN, "ddlProperty");
        if (level.equalsIgnoreCase("Zone") ||
                level.equalsIgnoreCase("Sub zone") ||
                level.equalsIgnoreCase("Base Unit")) {
            String zone = AddAssetselectRandomFromDropdown(ADD_ASSET_ZONE_DROPDOWN, "ddlZone");
        }
        if (level.equalsIgnoreCase("Sub zone") ||
                level.equalsIgnoreCase("Base Unit")) {
            String subZone = AddAssetselectRandomFromDropdown(ADD_ASSET_SUBZONE_DROPDOWN, "ddlSubZone");
        }
        if (level.equalsIgnoreCase("Base Unit")) {
            String unit = AddAssetselectRandomFromDropdown(ADD_ASSET_BASEUNIT_DROPDOWN, "ddlBaseUnit");
        }
    }

    public void userclickonAddAssetSaveButton() {
        utils.click(ADD_ASSET_SAVE_BUTTON);
    }

    public void searchStoredAssetCodeAssetRegisterpage(WebDriver driver) {
        String assetCode = TestContext.get("ASSET_CODE");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(ASSET_REGISTER_ASSET_CODE_SEARCH_BOX));
        searchBox.clear();
        searchBox.sendKeys(assetCode);
        searchBox.sendKeys(Keys.ENTER);
        System.out.println("Searching Asset Code: " + assetCode);  }

    public void verifyAssetCreatedAssetRegisterpage(WebDriver driver) {
        String assetCode = TestContext.get("ASSET_CODE");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By assetLocator = By.xpath("(//tr[contains(@class,'rgRow') or contains(@class,'rgAltRow')]//td[1])[1]");
        WebElement assetCell = wait.until(ExpectedConditions.visibilityOfElementLocated(assetLocator));
        String actual = assetCell.getAttribute("title").trim(); // 🔥 BEST
        if (!actual.equalsIgnoreCase(assetCode)) {throw new AssertionError("Asset not created! Expected: " + assetCode + " but found: " + actual);}
        System.out.println("✅ Asset created successfully: " + actual); }

    //    Asset Approval Flow -

    public void userclickonFirstGridListAssetRecord() {
        utils.doubleClick(ASSET_GRID_LIST_FIRST_RECORD);
    }

    public void userclicktheManageContractGroupicon() {
        utils.click(ASSET_MANAGE_CONTRACT_GROUP_ICON);
    }

    public void selectContractGroupcheckbox() {
        utils.click(ASSET_MANAGE_CONTRACT_GROUP_CHECKBOX);
    }

    public void clickonContractGroupSavebutton() {
        utils.click(ASSET_CONTRACT_GROUP_SAVE_BUTTON);
    }

    public void userclickonFinalisedbutton() {
        utils.click(ASSET_FINALISED_BUTTON);
    }


// Asset Function

    public void enterAssetTransferReason(String reason) {
        utils.click(ASSET_TRANSFER_REASON);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"+ reason + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected Reason: " + reason);
    }

    public void enterAssetTransferRemarks(String Remarks) {
        utils.typeText(ASSET_TRANSFER_REMARKS, Remarks);
    }


    public void selectAsset_Transfer_Location_Level(String Location_Level  ) {
        selectAddAssetRadComboBox(ASSET_TRANSFER_LOCATION_LEVEL, Location_Level, "ddlTOLocationLevel");
        System.out.println("Selected Transfer Location Level: " + Location_Level);
        handleTransferAssetLocationHierarchy(Location_Level);
    }

    public void handleTransferAssetLocationHierarchy(String level) {

        String property = AddAssetselectRandomFromDropdown(ASSET_TRANSFER_PROPERTY_DROPDOWN, "ddlTOProperty");
        if (level.equalsIgnoreCase("Zone") ||
                level.equalsIgnoreCase("Sub zone") ||
                level.equalsIgnoreCase("Base Unit")) {
            String zone = AddAssetselectRandomFromDropdown(ASSET_TRANSFER_ZONE_DROPDOWN, "ddlTOZone");
        }
        if (level.equalsIgnoreCase("Sub zone") ||
                level.equalsIgnoreCase("Base Unit")) {
            String subZone = AddAssetselectRandomFromDropdown(ASSET_TRANSFER_SUBZONE_DROPDOWN, "ddlTOSubZone");
        }
        if (level.equalsIgnoreCase("Base Unit")) {
            String unit = AddAssetselectRandomFromDropdown(ASSET_TRANSFER_BASEUNIT_DROPDOWN, "ddlTOBaseUnit");
        }
    }

    public void waitForDropdownValuesToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(driver -> {
            List<WebElement> options = driver.findElements( By.xpath("//li[contains(@class,'rcbItem')]"));
            return options.size() > 0;
        });
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clcikImpactonPPMSchedulecheckbox() {
        utils.click(ASSET_TRANSFER_PPM_CHECKBOX);
    }

    public void clcikImpactonSCMSchedulecheckbox() {
        utils.click(ASSET_TRANSFER_SCM_CHECKBOX);
    }

    public void userclickSendforApprovalbuttonAssettransferpopup() {
        utils.click(ASSET_TRANSFER_SEND_FOR_APPROVAL);
    }

    public void userselectanyOwnerAssetOwnerpopup() {
        utils.click(ASSIGN_OWNER_SELECT);
    }

    public void userclickAssignOwnersavebutton() {
        utils.click(ASSIGN_OWNER_SAVE_BUTTON);
    }

    public void enterPPMApplicability_Remarks(String Remarks) {
        utils.typeText(PPM_APPLICABILITY_REMARKS, Remarks);
    }

    public void userclickPPMApplicabilityChangesavebutton() {
        utils.click(PPM_APPLICABILITY_SAVE_BUTTON);
    }

    public void userclickPPMApplicabilityChangeConfirmbutton() {
        utils.click(PPM_APPLICABILITY_CONFIRM_BUTTON);
    }

    public void userclickonYesbuttoninClassificationpopup() {
        utils.click(CLASSIFICATION_CHANGE_YES_BUTTON);
    }

    public void userclickonokbuttoninclonepopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert message: " + alert.getText());
        alert.accept();
        System.out.println("Clicked OK button in clone popup");
    }

//    Commercial Details

    public void userclickonModifyCommercialsbutton() {
        utils.click(ASSET_MODIFY_COMMERCIAL_BUTTON);
    }

    public void selectModifyCommercialSupplierRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // 1. Click Supplier dropdown
        WebElement arrow = wait.until(ExpectedConditions.elementToBeClickable(MODIFY_COMMERCIAL_SUPPLIER));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
        // 2. Wait for dropdown popup
        By dropdown = By.xpath("//div[contains(@id,'ddlSupplierName_DropDown') and contains(@style,'display: block')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // 3. Wait for options
        By optionsLocator = By.xpath("//div[contains(@id,'ddlSupplierName_DropDown')]//li[contains(@class,'rcbItem')]");
        wait.until(driver -> driver.findElements(optionsLocator).size() > 0);
        List<WebElement> options = driver.findElements(optionsLocator);
        System.out.println("Supplier count: " + options.size());
        // 4. Pick random
        int index = random.nextInt(options.size());
        // 5. Re-locate (avoid stale)
        By optionByIndex = By.xpath("(//div[contains(@id,'ddlSupplierName_DropDown')]//li[contains(@class,'rcbItem')])[" + (index + 1) + "]" );
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String text = option.getText().trim();
        // 6. Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // 7. Click
        try {
            option.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);
        }
        System.out.println("Selected Supplier: " + text);
    }

    public void enterModifyCommercialDates() {
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate commissioningDate = RandomDateUtils.getRandomPastDate();
        LocalDate deliveryDate = commissioningDate.minusDays(new Random().nextInt(30) + 1);
        LocalDate poDate = deliveryDate.minusDays(new Random().nextInt(30) + 1);
        String po = poDate.format(formatter);
        String delivery = deliveryDate.format(formatter);
        String commission = commissioningDate.format(formatter);
        waitForLoaderToDisappear();
        WebElement commissionInput =  driver.findElement(MODIFY_COMMERCIAL_COMMISSION_DATE);
        ((JavascriptExecutor) driver) .executeScript("arguments[0].removeAttribute('readonly')", commissionInput);
        commissionInput.clear();
        commissionInput.sendKeys(commission);
        commissionInput.sendKeys(Keys.TAB);
        waitForLoaderToDisappear();
        WebElement deliveryInput =  driver.findElement(MODIFY_COMMERCIAL_DELIVERY_DATE);
        ((JavascriptExecutor) driver) .executeScript("arguments[0].removeAttribute('readonly')", deliveryInput);
        deliveryInput.clear();
        deliveryInput.sendKeys(delivery);
        deliveryInput.sendKeys(Keys.TAB);
        waitForLoaderToDisappear();
        WebElement poInput = driver.findElement(MODIFY_COMMERCIAL_PURCHASE_ORDER_DATE);
        ((JavascriptExecutor) driver) .executeScript("arguments[0].removeAttribute('readonly')", poInput);
        poInput.clear();
        poInput.sendKeys(po);
        poInput.sendKeys(Keys.TAB);
        System.out.println("PO Date: " + po);
        System.out.println("Delivery Date: " + delivery);
        System.out.println("Commissioning Date: " + commission);
    }

    public void enterModify_Commercial_Purchase_Order_Number(String Modify_Commercial_Purchase_Order_Number) {
        utils.typeText(MODIFY_COMMERCIAL_PURCHASE_ORDER_NUMBER, Modify_Commercial_Purchase_Order_Number);
    }

    public void enterModifyCommercialMiscellaneousCostDetails() {
        waitForLoaderToDisappear();
        // Miscellaneous Cost - Item
        WebElement item =  driver.findElement(MODIFY_COMMERCIAL_MISC_ITEM_COST);
        item.clear();
        item.sendKeys("1000");
        // Miscellaneous Cost - Labour
        WebElement labour =  driver.findElement(MODIFY_COMMERCIAL_MISC_LABOUR_COST);
        labour.clear();
        labour.sendKeys("500");
        // Miscellaneous Cost - Other
        WebElement other =  driver.findElement(MODIFY_COMMERCIAL_MISC_OTHER_COST);
        other.clear();
        other.sendKeys("500");
        // One Time Purchase Cost
        WebElement purchase = driver.findElement(MODIFY_COMMERCIAL_ONE_TIME_PURCHASE_COST);
        purchase.clear();
        purchase.sendKeys("10000");
        System.out.println("Entered Commercial Cost Details Successfully");
    }


    public void selectModifyCommercialOriginalandCurrentExpectedLife() {
        waitForLoaderToDisappear();
        // Miscellaneous Cost - Item
        WebElement item = driver.findElement(MODIFY_COMMERCIAL_ORIGINAL_EXPECTED_LIFE);
        item.clear();
        item.sendKeys("2");
        // Miscellaneous Cost - Labour
        WebElement labour = driver.findElement(MODIFY_COMMERCIAL_CURRENT_EXPECTED_LIFE);
        labour.clear();
        labour.sendKeys("1");
        System.out.println("Entered Original and Current Expected Life years Successfully");
    }

    public void enterModifyCommercialMaintenanceCostDetails() {
        waitForLoaderToDisappear();
        // Miscellaneous Cost - Item
        WebElement item =  driver.findElement(MODIFY_COMMERCIAL_MAIN_ITEM_COST);
        item.clear();
        item.sendKeys("1000");
        // Miscellaneous Cost - Labour
        WebElement labour =  driver.findElement(MODIFY_COMMERCIAL_MAIN_LABOUR_COST);
        labour.clear();
        labour.sendKeys("500");
        // Miscellaneous Cost - Other
        WebElement other =  driver.findElement(MODIFY_COMMERCIAL_MAIN_OTHER_COST);
        other.clear();
        other.sendKeys("500");
        // One Time Purchase Cost
        System.out.println("Entered Maintenance Cost Details Successfully");
    }

      public void userclickonsavebuttonModifyCommercialspopup() {
        utils.click(MODIFY_COMMERCIAL_SAVE_BUTTON);
    }
          // Asset related Contacts

    public void userclickonAssetLinkContactbutton() {
        utils.click(ASSET_LINK_CONTACT_ADD_BUTTON);
    }
   public void selectAssetContactcheckbox() {
        utils.click(ASSET_LINK_CONTACT_CHECKBOX);
    }
    public void userclickonselectbuttonintheAssetContactpopup() {
        utils.click(ASSET_LINK_CONTACT_SAVE_BUTTON);
    }

    // Attachments

    public void userclickonAssetAddAttachmentsbutton() {
        utils.click(ASSET_ATTACHMENT_ADD_BUTTON);
    }
    public void selectAssetAttachmentDocumentTypeRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Click dropdown
        wait.until(ExpectedConditions.elementToBeClickable(ASSET_ATTACHMENT_DOCUMENT_TYPE_DROPDOWN)).click();
        // Wait until options are loaded and "Loading..." disappears
        wait.until(driver -> { List<WebElement> elements = driver.findElements(ASSET_ATTACHMENT_DOCUMENT_TYPE_OPTIONS);
            return elements.size() > 0 &&
                    elements.stream()
                            .anyMatch(e ->
                                    !e.getText().trim().isEmpty()
                                            && !e.getText().trim().equalsIgnoreCase("Loading..."));
        });
        // Get all valid options
        List<WebElement> options = driver.findElements(ASSET_ATTACHMENT_DOCUMENT_TYPE_OPTIONS);
        List<WebElement> validOptions = options.stream()
                .filter(e -> !e.getText().trim().isEmpty())
                .filter(e -> !e.getText().trim().equalsIgnoreCase("Loading..."))
                .toList();
        // Select random option
        Random random = new Random();
        WebElement randomOption =  validOptions.get(random.nextInt(validOptions.size()));
        String selectedValue = randomOption.getText();
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", randomOption);
        System.out.println("Selected Document Type: " + selectedValue);
    }


    public void uploadAssetAttachmentPhoto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String filePath = "C:\\Users\\Edify\\Automation_Image.jpg";
        WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(ASSET_ATTACHMENT_CHOOSE_FILE));
        upload.sendKeys(filePath);
        System.out.println("File uploaded successfully");
        // wait after upload
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userclickonsavebuttonintheAssetAttachmentpopup() {
        utils.click(ASSET_ATTACHMENT_SAVE_BUTTON);
    }

//    Notifying Users

    public void userclickonAddNotifyingUsersbutton() {
        utils.click(NOTIFY_USERS_ADD_BUTTON);
    }

    public void selectAssetNotifyingUsersRandom() {
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
           // Open dropdown
            WebElement dropdown = wait.until( ExpectedConditions.elementToBeClickable(NOTIFYING_USERS_DROPDOWN));
            ((JavascriptExecutor) driver) .executeScript("arguments[0].click();",dropdown);
            sleep(2000);
            // ONLY VISIBLE ITEMS
            By visibleItems = By.xpath("//div[contains(@id,'radDrpNotifyUsers_DropDown')]//li[contains(@class,'rcbItem') and not(contains(@style,'display: none'))]");
            wait.until( ExpectedConditions.presenceOfElementLocated(visibleItems));
            // fetch visible items only
            List<WebElement> items = driver.findElements(visibleItems);
            // LIMIT to safe visible count
            int visibleCount =  Math.min(items.size(), 10);
            System.out.println( "Visible rendered items: "  + visibleCount);
            if (visibleCount == 0) {
                throw new RuntimeException("No visible users found");
            }
            // random only from visible rendered items
            Random random = new Random();
            int randomIndex = random.nextInt(visibleCount) + 1;
            System.out.println( "Selecting visible index: " + randomIndex);
            // click visible item directly
            By option = By.xpath( "(//div[contains(@id,'radDrpNotifyUsers_DropDown')]//li[contains(@class,'rcbItem') and not(contains(@style,'display: none'))])["
                            + randomIndex + "]");
            WebElement selected =  wait.until( ExpectedConditions.elementToBeClickable( option));
            ((JavascriptExecutor) driver) .executeScript( "arguments[0].click();", selected);
            System.out.println("Notify user selected"); }
        catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to select notifying user"); }
    }

    public void userclickonsavebuttonintheAssetNotifyingUserspopup() {
        utils.click(NOTIFYING_USERS_SAVE_BUTTON);
    }


//    Notes

    public void userclickonAssetAddNotesbutton() {
        utils.click(ASSET_NOTES_ADD_BUTTON);
    }
    public void selectAssetNoteTypeCategoryRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Click dropdown
        wait.until(ExpectedConditions.elementToBeClickable(ASSET_NOTES_NOTE_TYPE_CATEGORY_DROPDOWN)).click();
        // Wait until options are loaded and "Loading..." disappears
        wait.until(driver -> {List<WebElement> elements =
                    driver.findElements(ASSET_NOTES_NOTE_TYPE_CATEGORY_OPTIONS);
            return elements.size() > 0 &&  elements.stream().anyMatch(e ->
               !e.getText().trim().isEmpty()
                 && !e.getText().trim().equalsIgnoreCase("Loading..."));
        });
            List<WebElement> options = driver.findElements(ASSET_NOTES_NOTE_TYPE_CATEGORY_OPTIONS);
        List<WebElement> validOptions = options.stream()
                .filter(e -> !e.getText().trim().isEmpty())
                .filter(e -> !e.getText().trim().equalsIgnoreCase("Loading..."))
                .toList();
        // Select random option
        Random random = new Random();
        WebElement randomOption = validOptions.get(random.nextInt(validOptions.size()));
        String selectedValue = randomOption.getText();
        // Click option
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", randomOption);
        System.out.println("Selected Note Type Category: " + selectedValue);
    }

    public void enterAssetNotes(String Asset_Notes) {
        utils.typeText(ASSET_NOTES_NOTES, Asset_Notes);
    }

    public void userclickonsavebuttonintheAssetNotespopup() {
        utils.click(ASSET_NOTES_SAVE_BUTTON);
    }

//    Metering Parameters

    public void userclickonAssetAddMeteringParameterbutton() {
        utils.click(ASSET_METERING_PARAMETER_ADD_BUTTON);
    }

    public void selectAssetMeteringParameterRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Click dropdown
        wait.until(ExpectedConditions.elementToBeClickable(ASSET_METERING_PARAMETER_DROPDOWN)).click();
        // Wait until options are loaded and "Loading..." disappears
        wait.until(driver -> {
            List<WebElement> elements =  driver.findElements(ASSET_METERING_PARAMETER_OPTIONS);
            return elements.size() > 0 &&
                    elements.stream()
                            .anyMatch(e ->
                                    !e.getText().trim().isEmpty()
                                            && !e.getText().trim().equalsIgnoreCase("Loading..."));
        });
        List<WebElement> options = driver.findElements(ASSET_METERING_PARAMETER_OPTIONS);
        List<WebElement> validOptions = options.stream()
                .filter(e -> !e.getText().trim().isEmpty())
                .filter(e -> !e.getText().trim().equalsIgnoreCase("Loading..."))
                .toList();
        Random random = new Random();
        WebElement randomOption =
                validOptions.get(random.nextInt(validOptions.size()));
        String selectedValue = randomOption.getText();
        // Click option
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", randomOption);
        System.out.println("Selected Metering Parameter: " + selectedValue);
    }

    public void userclickonsavebuttonintheAssetMeteringParameterpopup() {
        utils.click(ASSET_METERING_PARAMETER_SAVE_BUTTON);
    }

// Triggers

    public void userclickonAssetAddTriggerbutton() {
        utils.click(ASSET_ADD_TRIGGER_BUTTON);
    }

    public void enterAsset_Trigger_Name(String Trigger_Name) {
        utils.typeText(ASSET_TRIGGER_NAME, Trigger_Name);
    }

    public void selectAsset_Trigger_Parameter_Random() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        By dropdown =   By.xpath("//div[contains(@id,'raddrpTriggerPara_DropDown')]");
        By options =   By.xpath("//div[contains(@id,'raddrpTriggerPara_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =  wait.until(ExpectedConditions.elementToBeClickable( ASSET_TRIGGER_PARAMETER_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count only
        int size = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(options)).size();
        System.out.println("Parameter count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Parameter values found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Re-fetch fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpTriggerPara_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]" );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                option);
        // Click
        ((JavascriptExecutor) driver)  .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Parameter: " + value);
    }

    public void enterAsset_Trigger_Comparison_Type(String Comparison_Type) {
        utils.click(ASSET_TRIGGER_COMPARISON_TYPE);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Comparison_Type + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Selected Trigger_Comparison_Type: " + Comparison_Type);
    }

     public void enterAssetTriggerEventAndValues() {
        Random random = new Random();
        // ✅ Available Trigger Events
        String[] events = {
                "Between",
                "NotBetween",
                "Greater than",
                "Less than",
                "Tolerance %"   };
        // ✅ Pick random event
        String event = events[random.nextInt(events.length)];
        selectAddAssetRadComboBox(ASSET_TRIGGER_EVENT_DROPDOWN,event,"raddrpTriggerEvent" );
        System.out.println("Selected Trigger Event: " + event);
        int fromValue =  random.nextInt(75) + 1;
        WebElement from =  driver.findElement(ASSET_TRIGGER_PARAMETER_VALUE_FROM);
        from.clear();
        from.sendKeys(String.valueOf(fromValue));
        // ✅ ONLY for Between & NotBetween
        if (event.equalsIgnoreCase("Between") ||
                event.equalsIgnoreCase("NotBetween")) {
          int toValue = fromValue + random.nextInt(75 - fromValue) + 1;
         WebElement to =  driver.findElement(ASSET_TRIGGER_PARAMETER_VALUE_TO);
            to.clear();
            to.sendKeys(String.valueOf(toValue));
            System.out.println("Parameter From Value: " + fromValue);
            System.out.println("Parameter To Value: " + toValue);
        }
    }

    public void selectAssetTriggerReasonRandom() {
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        By dropdown =  By.xpath("//div[contains(@id,'raddrpTriggerReason_DropDown')]");
        By options =  By.xpath("//div[contains(@id,'raddrpTriggerReason_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =  wait.until(ExpectedConditions.elementToBeClickable( ASSET_TRIGGER_REASON_DROPDOWN));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", arrow);
         wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        List<WebElement> allOptions =
         wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(options));
        System.out.println("Trigger Reason count: " + allOptions.size());
        if (allOptions.size() == 0) {
            throw new RuntimeException("No Trigger Reason values found");
        }
        // Random selection
        WebElement option =   allOptions.get(random.nextInt(allOptions.size()));
        String value = option.getText().trim();
       ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                option);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Trigger Reason: " + value);
    }

    public void selectAssetTriggerContractGroupRandom() {
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'raddrpContract_DropDown')]");
        By options =   By.xpath("//div[contains(@id,'raddrpContract_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow = wait.until(ExpectedConditions.elementToBeClickable( ASSET_TRIGGER_CONTRACT_GROUP_DROPDOWN));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", arrow);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        int size = wait.until(  ExpectedConditions.presenceOfAllElementsLocatedBy(options)).size();
       System.out.println("Contract Group count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Contract Group values found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpContract_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Contract Group: " + value);
    }

    public void enterAsset_Trigger_Work_Order_Type(String Work_Order_Type) {
        utils.click(ASSET_TRIGGER_WORK_ORDER_TYPE);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Work_Order_Type + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Selected Trigger_Comparison_Type: " + Work_Order_Type);
    }

    public void validateFieldsBasedOnWorkOrderType(String workOrderType) {
        if(workOrderType.equalsIgnoreCase("RM")) {
            //VALIDATE RM RELATED FIELDS ENABLED
            Assert.assertTrue(driver.findElement(ASSET_TRIGGER_SERVICE_GROUP_DROPDOWN).isEnabled(),
                    "Service Group field is not enabled");
            Assert.assertTrue(driver.findElement(ASSET_TRIGGER_FAULT_CATEGORY_DROPDOWN).isEnabled(),
                    "Fault Category field is not enabled");
            Assert.assertTrue(driver.findElement(ASSET_TRIGGER_FAULT_CODE_DROPDOWN).isEnabled(),
                    "Fault Code field is not enabled");
            Assert.assertTrue(driver.findElement(ASSET_TRIGGER_PRIORITY_DROPDOWN).isEnabled(),
                    "Priority field is not enabled");
            System.out.println("RM related fields are enabled successfully");
            //SELECT RM RELATED VALUES
            selectAssetTriggerServiceGroupRandom();
            waitForSeconds();
            selectAssetTriggerFaultCategoryRandom();
            waitForSeconds();
            selectAssetTriggerFaultCodeRandom();
            waitForSeconds();
            selectAssetTriggerPriorityRandom();
        }
        else if(workOrderType.equalsIgnoreCase("PM")) {
            //VALIDATE PM RELATED FIELDS ENABLED
            Assert.assertTrue(driver.findElement(ASSET_TRIGGER_WO_GEN_WAIT_TIME).isEnabled(),
                    "WO Gen Wait Time field is not enabled");
            Assert.assertTrue(driver.findElement(ASSET_TRIGGER_PPM_TASK_SHEET_DROPDOWN).isEnabled(),
                    "PPM Task Sheet dropdown is not enabled");
            System.out.println("PM related fields are enabled successfully");
            //ENTER WO GEN WAIT TIME
            utils.typeText(ASSET_TRIGGER_WO_GEN_WAIT_TIME, "10");
            //SELECT PPM TASK SHEET
            selectAssetTriggerPPMTaskSheetRandom();
        }
 }

    public void selectAssetTriggerServiceGroupRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'raddrpServiceGrp_DropDown')]");
        // All options
        By options =  By.xpath("//div[contains(@id,'raddrpServiceGrp_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable( ASSET_TRIGGER_SERVICE_GROUP_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count
        int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
        System.out.println("Service Group Count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Service Group found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpServiceGrp_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Service Group is: " + value);
    }

    public void selectAssetTriggerFaultCategoryRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'raddrpFaultCat_DropDown')]");
        // All options
        By options =  By.xpath("//div[contains(@id,'raddrpFaultCat_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable(ASSET_TRIGGER_FAULT_CATEGORY_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count
        int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
        System.out.println("Fault Category count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Fault Category found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpFaultCat_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Fault Category is: " + value);
    }

    public void selectAssetTriggerFaultCodeRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'raddrpFaultCode_DropDown')]");
        // All options
        By options =  By.xpath("//div[contains(@id,'raddrpFaultCode_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable(ASSET_TRIGGER_FAULT_CODE_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count
        int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
        System.out.println("Fault Code count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Fault Code found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'raddrpFaultCode_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Fault Code is: " + value);
    }

    public void selectAssetTriggerPriorityRandom() {
        WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        // Dropdown container
        By dropdown =  By.xpath("//div[contains(@id,'radrpPriority_DropDown')]");
        // All options
        By options =  By.xpath("//div[contains(@id,'radrpPriority_DropDown')]//li[contains(@class,'rcbItem')]");
        waitForLoaderToDisappear();
        // Open dropdown
        WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable(ASSET_TRIGGER_PRIORITY_DROPDOWN));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
        // Wait dropdown visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        // Get count
        int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
        System.out.println("Priority count: " + size);
        if (size == 0) {
            throw new RuntimeException("No Priority found");
        }
        // Random index
        int index = random.nextInt(size) + 1;
        // Fresh element
        By optionByIndex = By.xpath("(//div[contains(@id,'radrpPriority_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
        WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
        String value = option.getText().trim();
        // Scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        // Click
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
        waitForLoaderToDisappear();
        System.out.println("Selected Priority is: " + value);
    }

    public void selectAssetTriggerPPMTaskSheetRandom() {
    WebDriverWait wait =   new WebDriverWait(driver, Duration.ofSeconds(20));
    Random random = new Random();
    // Dropdown container
    By dropdown =  By.xpath("//div[contains(@id,'raddrpPPMTaskSheet_DropDown')]");
    // All options
    By options =  By.xpath("//div[contains(@id,'raddrpPPMTaskSheet_DropDown')]//li[contains(@class,'rcbItem')]");
    waitForLoaderToDisappear();
    // Open dropdown
    WebElement arrow =    wait.until(ExpectedConditions.elementToBeClickable( ASSET_TRIGGER_PPM_TASK_SHEET_DROPDOWN));
    ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", arrow);
    // Wait dropdown visible
    wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
    // Get count
    int size = wait.until( ExpectedConditions.presenceOfAllElementsLocatedBy(options) ).size();
    System.out.println("Task Sheets count: " + size);
    if (size == 0) {
        throw new RuntimeException("No Task Sheets found");
    }
    // Random index
    int index = random.nextInt(size) + 1;
    // Fresh element
    By optionByIndex = By.xpath("(//div[contains(@id,'raddrpPPMTaskSheet_DropDown')]//li[contains(@class,'rcbItem')])[" + index + "]"        );
    WebElement option =   wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
    String value = option.getText().trim();
    // Scroll
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", option);
    // Click
    ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", option);
    waitForLoaderToDisappear();
    System.out.println("Selected Task Sheet is: " + value);
}

public void waitForSeconds() {
    try {
        Thread.sleep(2000);
    }
    catch (InterruptedException e) {
        e.printStackTrace();
    }
}

    public void enterAsset_Trigger_Description(String Trigger_Description) {
        utils.typeText(ASSET_TRIGGER_DESCRIPTION, Trigger_Description);
    }

    public void userclickonsavebuttonintheAssetTriggerpopup() {
        utils.click(ASSET_TRIGGER_SAVE_BUTTON);
    }

// PPM/SS Schedules

    public void userclickonAssetAddSchedulebutton() {
        utils.click(ASSET_SCHEDULE_ADD_BUTTON);
    }

    public void selectAssetTaskSheetRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            // click dropdown arrow
            WebElement dropdown = wait.until( ExpectedConditions.elementToBeClickable( ASSET_TASK_SHEET_DROPDOWN));
            ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", dropdown);
            // HARD WAIT for Telerik dropdown rendering
            sleep(3000);
            // fresh options
            List<WebElement> options = wait.until(
                    ExpectedConditions.presenceOfAllElementsLocatedBy(
                            By.xpath("//ul/li[contains(@class,'rcbItem') or contains(@class,'rcbHovered')]")));
            List<String> values = new ArrayList<>();
            for (WebElement option : options) {
                String text = option.getText().trim();
                if (!text.isEmpty()
                        && !text.equalsIgnoreCase("Loading...")) { values.add(text);
                }
            }
            System.out.println("Options found: " + values.size());
            if (values.isEmpty()) {
                throw new RuntimeException("No dropdown values found");
            }
            // random value
            Random random = new Random();
            String selectedValue =  values.get(random.nextInt(values.size()));
            System.out.println("Selecting: " + selectedValue);// click selected option freshly
            WebElement finalOption = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//li[normalize-space()='"
                                    + selectedValue + "']")));
            ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", finalOption);
            System.out.println("Selected: " + selectedValue);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(   "Unable to select Task Sheet dropdown value");
        }
    }


    public void userclickonsavebuttonintheAssetSchedulepopup() {
        utils.click(ASSET_SCHEDULE_SAVE_BUTTON);
    }

    // Conditional Picture

      public void userclickonAddConditionalPicturebutton() {
        utils.click(CONDITIONAL_PICTURE_ADD_BUTTON);
    }

    public void selectConditionalPictureDocumentTypeRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Click dropdown
        wait.until(ExpectedConditions.elementToBeClickable(CONDITIONAL_PICTURE_TYPE_DROPDOWN)).click();
        // Wait until options are loaded and "Loading..." disappears
        wait.until(driver -> {
            List<WebElement> elements =
                    driver.findElements(CONDITIONAL_PICTURE_TYPE_OPTIONS);
            return elements.size() > 0 &&
                    elements.stream()
                            .anyMatch(e ->
                                    !e.getText().trim().isEmpty()
                                            && !e.getText().trim().equalsIgnoreCase("Loading..."));
        });

        // Get all valid options
        List<WebElement> options = driver.findElements(CONDITIONAL_PICTURE_TYPE_OPTIONS);
        List<WebElement> validOptions = options.stream()
                .filter(e -> !e.getText().trim().isEmpty())
                .filter(e -> !e.getText().trim().equalsIgnoreCase("Loading..."))
                .toList();

        // Select random option
        Random random = new Random();
        WebElement randomOption =  validOptions.get(random.nextInt(validOptions.size()));
        String selectedValue = randomOption.getText();

        // Click option
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", randomOption);
        System.out.println("Selected Document Type: " + selectedValue);
    }

    public void uploadConditionPicturePhoto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String filePath = "C:\\Users\\Edify\\Automation_Image.jpg";
        WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(CONDITIONAL_PICTURE_PHOTOS_CHOOSE_FILE));
        upload.sendKeys(filePath);
        System.out.println("File uploaded successfully");
        // wait after upload
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void userclickonsavebuttonintheConditionPicturepopup() {
        utils.click(CONDITIONAL_PICTURE_SAVE_BUTTON);
    }



//    Condition Update


public void userclickonConditionUpdatebutton() {
    utils.click(CONDITION_UPDATE_BUTTON);
}

   public void selectCondition_Update_To_Condition(String To_Condition) {
        utils.click(CONDITION_UPDATE_TO_CONDITION);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + To_Condition + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Selected To Condition: " + To_Condition);
    }

    public void enterCondition_Update_Remarks(String Condition_Update_Remarks) {
        utils.typeText(CONDITION_UPDATE_REMARKS, Condition_Update_Remarks);
    }

    public void selectCondition_Update_Possible_Cause(String Possible_Cause) {
        utils.click(CONDITION_UPDATE_POSSIBLE_CAUSE);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Possible_Cause + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Selected Possible Cause: " + Possible_Cause);
    }


    public void selectCondition_Update_Anticipated_Action(String Anticipated_Action) {
        utils.click(CONDITION_UPDATE_ANTICIPATED_ACTION);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Anticipated_Action + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Selected Anticipated Action: " + Anticipated_Action);
    }

    public void userclickonsavebuttonintheConditionUpdatepopup() {
        utils.click(CONDITION_UPDATE_SAVE_BUTTON);
    }


// Functional Update

    public void userclickonFunctionalUpdatebutton() {
        utils.click(FUNCTIONAL_UPDATE_BUTTON);
    }

    public void selectFunctional_Update_To_Status(String To_Status) {
        utils.click(FUNCTIONAL_UPDATE_TO_STATUS);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + To_Status + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Selected Functional Update To Status: " + To_Status);
    }

    public void selectFunctional_Update_Reason(String Reason) {
        utils.click(FUNCTIONAL_UPDATE_REASON);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='"
                + Reason + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Selected Functional Update Reason: " + Reason);
    }


    public void enterFunctional_Update_Remarks(String Functional_Update_Remarks) {
        utils.typeText(FUNCTIONAL_UPDATE_REMARKS, Functional_Update_Remarks);
    }

    public void userclickonsavebuttonintheFunctionalUpdatepopup() {
        utils.click(FUNCTIONAL_UPDATE_SAVE_BUTTON);
    }

//    Asset Inventory - Create and Verify , Update

    public void userclickonAddAssetInventory() {
        utils.click(ADD_ASSET_INVENTORY_BUTTON);
    }

    public void userclickonAssetInventorySaveButton() {
        utils.click(ASSET_INVENTORY_SAVE_BUTTON);
    }

    public void enterAsset_Inventory_Verification_Name(String Asset_Inventory_Verification_Name) {
        utils.typeText(ASSET_INVENTORY_VERIFICATION_NAME, Asset_Inventory_Verification_Name);
    }

    public void selectAssetInventoryClient() {
        selectAddAssetRadComboBox(ASSET_INVENTORY_CLIENT_DROPDOWN,"Alpha Properties","cmbClient");
    }

    public void selectAssetInventoryClient_Contract() {

        wait.until(ExpectedConditions.elementToBeClickable(ASSET_INVENTORY_CLIENT_CONTRACT_DROPDOWN));
        selectAddAssetRadComboBox( ASSET_INVENTORY_CLIENT_CONTRACT_DROPDOWN,
                "ABC Tower",
                "cmbClientContract"
        );
    }

    public void enterAsset_Inventory_Location_Level(String Location_Level  ) {
        selectAddAssetRadComboBox(ASSET_INVENTORY_LOCATION_LEVEL, Location_Level, "ddlReportingLevel");
        System.out.println("Selected Asset Inventory Location Level: " + Location_Level);
        handleAssetInventoryLocationHierarchy(Location_Level);
    }

    public void handleAssetInventoryLocationHierarchy(String level) {
        // Property
        String property = AssetInventoryselectRandomFromDropdown(ASSET_INVENTORY_PROPERTY_DROPDOWN, "ddlProperty");
        waitForLoaderToDisappear();
        if (level.equalsIgnoreCase("Zone") ||
                level.equalsIgnoreCase("Sub zone") ||
                level.equalsIgnoreCase("Base Unit")) {
            String zone = AssetInventoryselectRandomFromDropdown(ASSET_INVENTORY_ZONE_DROPDOWN, "ddlZone");
            waitForLoaderToDisappear();
        }

        if (level.equalsIgnoreCase("Sub zone") ||
                level.equalsIgnoreCase("Base Unit")) {
            String subZone = AssetInventoryselectRandomFromDropdown(ASSET_INVENTORY_SUBZONE_DROPDOWN, "ddlSubZone");
            waitForLoaderToDisappear();
        }

        if (level.equalsIgnoreCase("Base Unit")) {
            String unit = AssetInventoryselectRandomFromDropdown(ASSET_INVENTORY_BASEUNIT_DROPDOWN, "ddlBaseUnit");
            waitForLoaderToDisappear();
        }
    }

    public String AssetInventoryselectRandomFromDropdown(By arrow, String idPart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Random random = new Random();
        By dropdown = By.xpath("//div[contains(@id,'" + idPart + "_DropDown')]");
        By options = By.xpath("//div[contains(@id,'" + idPart + "_DropDown')]//li[contains(@class,'rcbItem')]");
        for (int i = 0; i < 3; i++) {
            try {
                waitForLoaderToDisappear();
                // 🔥 Wait until enabled (IMPORTANT)
                WebElement arrowEl = wait.until(ExpectedConditions.elementToBeClickable(arrow));
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrowEl);
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
                // 🔥 wait until options loaded
                wait.until(driver -> driver.findElements(options).size() > 0);
                List<WebElement> allOptions = driver.findElements(options);
                int index = random.nextInt(allOptions.size());
                // 🔥 RE-FIND element (avoid stale)
                By optionByIndex = By.xpath("(//div[contains(@id,'" + idPart + "_DropDown')]//li[contains(@class,'rcbItem')])[" + (index + 1) + "]" );
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(optionByIndex));
                String text = element.getText().trim();
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                waitForLoaderToDisappear();
               // 🔥 stabilize UI
                System.out.println("Selected Value: " + text);
                return text;
            } catch (StaleElementReferenceException e) {
                System.out.println("Retry due to stale...");
            }
        }
        throw new RuntimeException("Dropdown selection failed: " + idPart);
    }


// /   Unscheduled Assets

    public String getAssetCode() {
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(ASSET_CODE_LABEL) );
        return element.getText().trim();
    }


    public boolean verifyWorkOrderCounts() {
        int ppm = getWorkOrderCount("PPM");
        int scm = getWorkOrderCount("SCM");
        int sst = getWorkOrderCount("SST");
        int rm  = getWorkOrderCount("RM");
        System.out.println("PPM Count = " + ppm);
        System.out.println("SCM Count = " + scm);
        System.out.println("SST Count = " + sst);
        System.out.println("RM Count  = " + rm);
        // Check if any count is greater than 0
        if (ppm > 0 || scm > 0 || sst > 0 || rm > 0) {
            System.out.println(
                    "This asset WILL NOT be present in Unscheduled Assets grid " +
                            "because work orders exist."  );
            return false;
        }
        System.out.println(
                "This asset WILL be present in Unscheduled Assets grid " +
                        "because all work order counts are 0." );
        return true;
    }

    public int getWorkOrderCount(String type) {
        try {
            By locator = By.xpath("//span[normalize-space()='" + type + "']/preceding-sibling::span[1]" );
            List<WebElement> elements = driver.findElements(locator);
            // If element not found
            if (elements.isEmpty()) {
                System.out.println(type + " count not found → returning 0");
                return 0;
            }
            String text = elements.get(0).getText().trim();
            // Empty text safety
            if (text.isEmpty()) {
                return 0;
            }
            System.out.println(type + " Count = " + text);
            return Integer.parseInt(text);
        } catch (Exception e) {
            System.out.println("Error getting count for " + type);
            return 0;
        }
    }

    public void searchAsset(String assetCode) {
        utils.typeText(UNSCHEDULED_ASSETS_SEARCH_BOX, assetCode + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAsset_ctl00__0'] td[title='%s']", assetCode));
        utils.isElementVisible(locator);
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }


//    Alert Code Setup - Create

    public void userclickonAddAlertCodeSetupbutton() {
        utils.click(ADD_ALERT_CODE_SETUP_BUTTON);
    }

    public void userclickonAlertCodeSetupSaveButton() {
        utils.click(ALERT_CODE_SETUP_SAVE_BUTTON);
    }

    public void enterAlert_Code(String Alert_Code) {
        utils.typeText(ALERT_CODE, Alert_Code);
    }

    public void enterAlert_Code_Description(String Alert_Code_Description) {
        utils.typeText(ALERT_CODE_DESCRIPTION, Alert_Code_Description);
    }

    public String selectRandomInputType() {
        // Step 1: Click dropdown
        utils.click(ALERT_CODE_INPUT_TYPE);
        // Step 2: Wait for dropdown options to appear
        By dropdown = By.xpath("//div[contains(@id,'InputType_DropDown') and contains(@style,'display: block')]");
        utils.waitForElementVisible(dropdown);
        // Step 3: Get options (Analog / Digital)
        List<WebElement> options = driver.findElements(
                By.xpath("//div[contains(@id,'InputType_DropDown') and contains(@style,'display: block')]//li")
        );
        // Step 4: Select random option
        WebElement option = options.get(new Random().nextInt(options.size()));
        String selectedValue = option.getText();
        utils.jsClick(option);   // IMPORTANT
        System.out.println("Selected Input Type: " + selectedValue);
        return selectedValue;
    }

    public void selectRandomContractGroup() {
        utils.click(ALERT_CODE_CONTRACT_GROUP);
        // ✅ Correct dropdown locator
        By dropdown = By.xpath("//div[contains(@id,'raddrpContractgrp_DropDown')]");
        utils.waitForElementVisible(dropdown);
        // ✅ Get options
        List<WebElement> options = driver.findElements(
                By.xpath("//div[contains(@id,'raddrpContractgrp_DropDown')]//li")
        );
        System.out.println("Options size: " + options.size());
        if (options.size() == 0) {
            throw new RuntimeException("No Contract Group options found");
        }
        WebElement option = options.get(new Random().nextInt(options.size()));
        utils.jsClick(option);
    }

    public void handleFieldsBasedOnInputType(String inputType) {
        if (inputType.equalsIgnoreCase("Analog")) {
            System.out.println("Handling Analog fields");
           // ✅ Step 2: Wait for UOM to be clickable
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(INPUT_TYPE_ANALOG_UOM));
            // ✅ Step 3: Small wait for backend loading
            // ✅ Step 4: Now click UOM dropdown
            utils.click(INPUT_TYPE_ANALOG_UOM);
            By optionsLocator = By.xpath("//div[contains(@id,'raddrpUnit_DropDown')]//li[contains(@class,'rcbItem')]");
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(optionsLocator));
// Get options
            List<WebElement> options = driver.findElements(optionsLocator);
            System.out.println("UOM options size: " + options.size());
            if (options.size() == 0) {
                throw new RuntimeException("No UOM values found");
            }

// Select random option
            WebElement option = options.get(new Random().nextInt(options.size()));
// 🔥 IMPORTANT FIX
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);
            System.out.println("Selected UOM: " + option.getText());
        } else if (inputType.equalsIgnoreCase("Digital")) {
            System.out.println("Handling Digital fields");
            utils.typeText(INPUT_TYPE_DIGITAL_FROM_RANGE,
                    String.valueOf(generateRandomNumber()));
            utils.typeText(INPUT_TYPE_DIGITAL_TO_RANGE,
                    String.valueOf(generateRandomNumber()));
        }
    }

    public int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

//    Alert Code Setup - Verify

    public void verifyAddAssetAlertCode(String Alert_Code) {
        utils.typeText(SEARCH_ALERT_CODE, Alert_Code + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAlertCode_ctl00__0'] td[title='%s']", Alert_Code));
        utils.isElementVisible(locator);
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

//    Alert Code Setup - Delete

    public void userclickonFirstAlertCodeSetuprecordToDelete() {
        utils.click(DELETE_FIRST_ALERT_CODE_SETUP_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        };
    }

//    Decommissioned Assets

    public void selectDecommissionReasonRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Click dropdown
        wait.until(ExpectedConditions.elementToBeClickable(DECOMMISSION_REASON_DROPDOWN)).click();
        // Wait until options are loaded and "Loading..." disappears
        wait.until(driver -> {
            List<WebElement> elements =
                    driver.findElements(DECOMMISSION_REASON_OPTIONS);
            return elements.size() > 0 &&
                    elements.stream()
                            .anyMatch(e ->
                                    !e.getText().trim().isEmpty()
                                            && !e.getText().trim().equalsIgnoreCase("Loading..."));
        });
        // Get all valid options
        List<WebElement> options = driver.findElements(DECOMMISSION_REASON_OPTIONS);
        List<WebElement> validOptions = options.stream()
                .filter(e -> !e.getText().trim().isEmpty())
                .filter(e -> !e.getText().trim().equalsIgnoreCase("Loading..."))
                .toList();
        // Select random option
        Random random = new Random();
        WebElement randomOption =   validOptions.get(random.nextInt(validOptions.size()));
        String selectedValue = randomOption.getText();
        // Click option
        ((JavascriptExecutor) driver)  .executeScript("arguments[0].click();", randomOption);
        System.out.println("Selected Reason: " + selectedValue);
    }

    public void enterDecommission_Remarks(String Decommission_Remarks) {
        utils.typeText(DECOMMISSION_REMARKS, Decommission_Remarks);
    }

    public void checkboxDecommissionWarning() {
        utils.click(DECOMMISSION_WARNING_CHECKBOX);
    }

    public void clickAddPhotoicon() {
        utils.click(DECOMMISSION_ADD_PHOTO_ICON);
    }

    public void selectDecommissionDocumentTypeRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Click dropdown
        wait.until(ExpectedConditions.elementToBeClickable(DECOMMISSION_DOCUMENT_TYPE_DROPDOWN)).click();
        // Wait until options are loaded and "Loading..." disappears
        wait.until(driver -> {
            List<WebElement> elements =
                    driver.findElements(DECOMMISSION_DOCUMENT_TYPE_OPTIONS);
            return elements.size() > 0 &&
                    elements.stream()
                            .anyMatch(e ->
                                    !e.getText().trim().isEmpty()
                                            && !e.getText().trim().equalsIgnoreCase("Loading..."));
        });

        // Get all valid options
        List<WebElement> options = driver.findElements(DECOMMISSION_DOCUMENT_TYPE_OPTIONS);
        List<WebElement> validOptions = options.stream()
                .filter(e -> !e.getText().trim().isEmpty())
                .filter(e -> !e.getText().trim().equalsIgnoreCase("Loading..."))
                .toList();

        // Select random option
        Random random = new Random();
        WebElement randomOption =   validOptions.get(random.nextInt(validOptions.size()));
        String selectedValue = randomOption.getText();

        // Click option
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", randomOption);
        System.out.println("Selected Document Type: " + selectedValue);
    }

        public void uploadDecommissionPhoto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String filePath = "C:\\Users\\Edify\\Automation_Image.jpg";
        WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(DECOMMISSION_PHOTOS_CHOOSE_FILE));
        upload.sendKeys(filePath);
        System.out.println("File uploaded successfully");
        // wait after upload
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickDecommissionFileSaveButton() {
        utils.click(DECOMMISSION_PHOTOS_SAVE_BUTTON);
    }

    public void userclickonDecommissionRequestSentForApprovbutton() {
        utils.click(DECOMMISSION_REQUEST_SENT_FOR_APPROVAL);
    }

     public void userSearchDecommissionedAsset(String assetCode) {
        utils.typeText(DECOMMISSIONED_ASSET_CODE, assetCode + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAsset_ctl00__0'] td[title='%s']", assetCode));
        utils.isElementVisible(locator);
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    //    Asset - Export To Excel

    public void clickAssetExportToExcelButton() {
        By[] ExportToExcel = {ASSET_REGISTER_EXPORT_TO_EXCEL, ASSET_INVENTORY_EXPORT_TO_EXCEL,
                UNSCHEDULED_ASSETS_EXPORT_TO_EXCEL, ALERT_CODE_SETUP_EXPORT_TO_EXCEL, DECOMMISSIONED_ASSETS_EXPORT_TO_EXCEL};
        for (By button : ExportToExcel) {
            if (utils.isElementVisible(button)) {
                utils.waitForElementToBeClickable(button);
                utils.click(button);
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // best practice
                }
                return;
            }
        }

    }

}


