package stepDefinitions;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AssetManagementTransactionPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;

public class AssetManagementTransactionSteps {


    private final WebDriver driver = DriverFactory.getDriver();
    AssetManagementTransactionPage tmp = new AssetManagementTransactionPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();
    public static String Asset_Name;
    public static String Add_Asset_Ownership;
    public static String Add_Asset_Criticality;
    public static String Add_Asset_Functional_Status;
    public static String Add_Asset_Condition;
    public static String Add_Asset_Location_Level;
    public static String Modify_Commercial_Purchase_Order_Number;
    public static String Asset_Code;
    public static String Asset_Inventory_Verification_Name;
    public static String Asset_Inventory_Location_Level;
    public static String Alert_Code;
    public static String Alert_Code_Description;
    public static String Asset_Transfer_Reason;
    public static String Asset_Transfer_Remarks;
    public static String Asset_Location_Level;
    public static String Decommission_Remarks;
    public static String PPM_Applicability_Remarks;

    public static String Asset_Trigger_Name;
    public static String Asset_Trigger_Comparison_Type;
    public static String Asset_Trigger_Work_Order_Type;
    public static String Asset_Trigger_Description;
    public static String Asset_Notes;
    public static String Condition_Update_To_Condition;
    public static String Condition_Update_Remarks;
    public static String Condition_Update_Possible_Cause;
    public static String Condition_Update_Anticipated_Action;
    public static String Functional_Update_To_Status;
    public static String Functional_Update_Reason;
    public static String Functional_Update_Remarks;



    @Then("User click on the {string} title")
    public void userclickonAssetTitle(String AssetTitle) {
        tmp.userclickonAssetTitle(AssetTitle);
    }

    @Then("User click the {string} button in the Asset Detail page")
    public void userclickonbuttoninAssetDetailpage(String buttonName) {
        tmp.userclickonbuttoninAssetDetailpage(buttonName);
    }

    @Then("User clicks the Asset {string} menu in the left pane of Asset Detail page")
    public void userclickonmenuinleftpaneofAssetDetailpage(String menuName) {
        tmp.userclickonmenuinleftpaneofAssetDetailpage(menuName);
    }



    //    Create Asset

    @Then("User click on the Add Asset button")
    public void userclickonAddAssetbutton() {
        tmp.userclickonAddAssetbutton();
    }

    @Then("User store the Asset Code in the Add Asset form")
    public void userstoreAssetCodeintheAddAssetform() {
        tmp.userstoreAssetCodeintheAddAssetform(driver);
    }

    @Then("User fill the Asset Details")
    public void userFillAssetDetails() throws InterruptedException {
        Asset_Name = dataGen.generateAsset_Name();
        tmp.enterAddAsset_Name(Asset_Name);
        Add_Asset_Ownership = dataGen.generateAddAsset_Ownership();
        tmp.enterAddAssetOwnership (Add_Asset_Ownership);
        Add_Asset_Criticality = dataGen.generateAddAsset_Criticality();
        tmp.enterAddAsset_Criticality(Add_Asset_Criticality);
        tmp.selectAddAssetClient();
        tmp.selectAddAssetClient_Contract();
        tmp.selectAddAssetClass();
        tmp.selectAddAssetMasterCategory();
        tmp.selectAddAssetCategory();
        tmp.selectAddAssetSubCategory();
        Add_Asset_Functional_Status = dataGen.generateAddAsset_Functional_Status();
        tmp.enterAsset_Functional_Status(Add_Asset_Functional_Status);
        Add_Asset_Condition = dataGen.generateAdd_Asset_Condition();
        tmp.enterAddAsset_Condition(Add_Asset_Condition);
        Add_Asset_Location_Level = dataGen.generateAdd_Asset_Location_Level();
        tmp.enterAdd_Asset_Location_Level(Add_Asset_Location_Level);
           }

    @Then("User click on Add Asset Save button")
    public void userclickonAddAssetSaveButton() {
        tmp.userclickonAddAssetSaveButton();
    }

    @Then("User searches using stored asset code")
    public void userSearchAsset() {
        tmp.searchStoredAssetCodeAssetRegisterpage(driver);
    }

    @Then("User verifies asset is created")
    public void userVerifiesAssetCreated() {
        tmp.verifyAssetCreatedAssetRegisterpage(driver);
    }

    //    Asset Approval Flow

    @Then("User click on the first Asset record")
    public void userclickonFirstAssetRecord() {
        tmp.userclickonFirstGridListAssetRecord();
    }

    @Then("User link the Contract Group")
    public void userlinktheContractGroup() {
        tmp.userclicktheManageContractGroupicon();
        tmp.selectContractGroupcheckbox();
        tmp.clickonContractGroupSavebutton();
    }

    @Then("User click on the Finalised button")
    public void userclickonFinalisedbutton() {
        tmp.userclickonFinalisedbutton();
    }


//  Asset Function

    @Then("User fill the Asset Transfer details")
    public void userfillAssetTransferdetails() {
        Asset_Transfer_Reason = dataGen.generateAsset_Transfer_Reason();
        tmp.enterAssetTransferReason(Asset_Transfer_Reason);
        Asset_Transfer_Remarks = dataGen.generateAsset_Transfer_Remarks();
        tmp.enterAssetTransferRemarks(Asset_Transfer_Remarks);
        Asset_Location_Level  = dataGen.generateAsset_Location_Level();
        tmp.selectAsset_Transfer_Location_Level(Asset_Location_Level);
        tmp.clcikImpactonPPMSchedulecheckbox();
        tmp.clcikImpactonSCMSchedulecheckbox();
    }

    @Then("User click the Send for Approval button in the Asset transfer pop up")
    public void userclickSendforApprovalbuttonAssettransferpopup() {
        tmp.userclickSendforApprovalbuttonAssettransferpopup();
    }


    @Then("User select any Owner in the Asset Owner pop up")
    public void userselectanyOwnerAssetOwnerpopup() {
    tmp.userselectanyOwnerAssetOwnerpopup();
}

    @Then("User click the Assign Owner save button")
    public void userclickAssignOwnersavebutton() {
        tmp.userclickAssignOwnersavebutton();
    }

    @Then("User fill the details in the PPM Applicability Change pop up")
    public void userfillthedeatilsinPPMApplicabilitypopup() {
        PPM_Applicability_Remarks = dataGen.generatePPM_Applicability_Remarks();
        tmp.enterPPMApplicability_Remarks(PPM_Applicability_Remarks);
    }

    @Then("User click the PPM Applicability Change save button")
    public void userclickPPMApplicabilityChangesavebutton() {
        tmp.userclickPPMApplicabilityChangesavebutton();
    }

    @Then("User click the PPM Applicability Confirm button in the warning pop up")
    public void userclickPPMApplicabilityChangeConfirmbutton() {
        tmp.userclickPPMApplicabilityChangeConfirmbutton();
    }

    @Then("User click the Yes button in the Classification pop up")
    public void userclickonYesbuttoninClassificationpopup() {
        tmp.userclickonYesbuttoninClassificationpopup();
    }

    @Then("User click the ok button in the clone pop up")
    public void userclickonokbuttoninclonepopup() {
        tmp.userclickonokbuttoninclonepopup();
    }

// Commercial Details

    @Then("User click the Modify Commercials button")
    public void userclickonModifyCommercialsbutton () {
        tmp.userclickonModifyCommercialsbutton();
    }

    @Then("User fill the details in the MODIFY COMMERCIALS pop up")
    public void userfilldetailsModifyCommercialspopup () {
        tmp.selectModifyCommercialSupplierRandom();
        tmp.enterModifyCommercialDates();
        Modify_Commercial_Purchase_Order_Number=dataGen.generateModify_Commercial_Purchase_Order_Number();
        tmp.enterModify_Commercial_Purchase_Order_Number(Modify_Commercial_Purchase_Order_Number);
        tmp.enterModifyCommercialMiscellaneousCostDetails();
        tmp.selectModifyCommercialOriginalandCurrentExpectedLife();
        tmp.enterModifyCommercialMaintenanceCostDetails();
          }

    @Then("User click the save button in the MODIFY COMMERCIALS pop up")
    public void userclickonsavebuttonintheModifyCommercialspopup() {
        tmp.userclickonsavebuttonModifyCommercialspopup();
    }



    // Asset related Contacts

    @Then("User click the Asset Link Contact button")
    public void userclickonAssetLinkContactbutton () {
        tmp.userclickonAssetLinkContactbutton();
    }

    @Then("User fill the details in the Asset Contact pop up")
    public void userfilldetailsAssetContactpopup () {
        tmp.selectAssetContactcheckbox();
    }

    @Then("User click the select button in the Asset Contact pop up")
    public void userclickonselectbuttonintheAssetContactpopup() {
        tmp.userclickonselectbuttonintheAssetContactpopup();
    }


    // Attachments

    @Then("User click the Asset Add Attachment button")
    public void userclickonAssetAddAttachmentbutton () {
        tmp.userclickonAssetAddAttachmentsbutton();
    }

    @Then("User fill the details in the Asset Attachments pop up")
    public void userfillAssetAttachmentsdetails() {
        tmp.selectAssetAttachmentDocumentTypeRandom();
        tmp.uploadAssetAttachmentPhoto();
    }


    @Then("User click the save button in the Asset Attachment pop up")
    public void userclickonsavebuttonintheAssetAttachmentpopup() {
        tmp.userclickonsavebuttonintheAssetAttachmentpopup();
    }


    // Notifying Users

    @Then("User click the Add Asset Notifying Users button")
    public void userclickontAddNotifyingUsersbutton () {
        tmp.userclickonAddNotifyingUsersbutton();
    }

    @Then("User fill the details in the Asset Notifying Users pop up")
    public void userfillAssetNotifyingUsersdetails() {
        tmp.selectAssetNotifyingUsersRandom();
        }

    @Then("User click the save button in the Asset Notifying Users pop up")
    public void userclickonsavebuttonintheAssetNotifyingUserspopup() {
        tmp.userclickonsavebuttonintheAssetNotifyingUserspopup();
    }


   // Notes

    @Then("User click the Asset Add Notes button")
    public void userclickonAssetAddNotesbutton () {
        tmp.userclickonAssetAddNotesbutton();
    }

    @Then("User fill the details in the Asset Notes pop up")
    public void userfillAssetNotesdetails() {
        tmp.selectAssetNoteTypeCategoryRandom();
        Asset_Notes = dataGen.generateAssetNotes();
        tmp.enterAssetNotes(Asset_Notes);
    }


    @Then("User click the save button in the Asset Notes pop up")
    public void userclickonsavebuttonintheAssetNotespopup() {
        tmp.userclickonsavebuttonintheAssetNotespopup();
    }

    // Metering Parameters

    @Then("User click the Asset Add Metering Parameter button")
    public void userclickonAssetAddMeteringParametersbutton () {
        tmp.userclickonAssetAddMeteringParameterbutton();
    }

    @Then("User fill the details in the Asset Metering Parameter pop up")
    public void userfillAssetMeteringParameterdetails() {
        tmp.selectAssetMeteringParameterRandom();
     }


    @Then("User click the save button in the Asset Metering Parameter pop up")
    public void userclickonsavebuttonintheAssetMeteringParameterpopup() {
        tmp.userclickonsavebuttonintheAssetMeteringParameterpopup();
    }

    // Triggers

    @Then("User click the Asset Add Trigger button")
    public void userclickonAssetAddTriggerbutton () {
        tmp.userclickonAssetAddTriggerbutton();
    }

    @Then("User fill the details in the Asset Trigger pop up")
    public void userfillAssetTriggersdetails() {
        Asset_Trigger_Name=dataGen.generateTrigger();
        tmp.enterAsset_Trigger_Name(Asset_Trigger_Name);
        tmp.selectAsset_Trigger_Parameter_Random();
        Asset_Trigger_Comparison_Type=dataGen.generateComparison_Type();
        tmp.enterAsset_Trigger_Comparison_Type(Asset_Trigger_Comparison_Type);
        tmp.enterAssetTriggerEventAndValues();
        tmp.selectAssetTriggerReasonRandom();
        tmp.selectAssetTriggerContractGroupRandom();
        Asset_Trigger_Work_Order_Type=dataGen.generateAsset_Trigger_Work_Order_Type();
        tmp.enterAsset_Trigger_Work_Order_Type(Asset_Trigger_Work_Order_Type);
        tmp.validateFieldsBasedOnWorkOrderType(Asset_Trigger_Work_Order_Type);
        Asset_Trigger_Description = dataGen.generateAsset_Trigger_Description();
        tmp.enterAsset_Trigger_Description(Asset_Trigger_Description);
    }


    @Then("User click the save button in the Asset Trigger pop up")
    public void userclickonsavebuttonintheAssetTriggerpopup() {
        tmp.userclickonsavebuttonintheAssetTriggerpopup();
    }

//  PPM/SS Schedules

    @Then("User click the Asset Add Schedule button")
    public void userclickonAssetAddSchedulebutton () {
        tmp.userclickonAssetAddSchedulebutton();
    }

    @Then("User fill the details in the Asset Schedule pop up")
    public void userfillAssetScheduledetails() {
        tmp.selectAssetTaskSheetRandom();
    }


    @Then("User click the save button in the Asset Schedule pop up")
    public void userclickonsavebuttonintheAssetSchedulepopup() {
        tmp.userclickonsavebuttonintheAssetSchedulepopup();
    }


    //  Conditional Picture

    @Then("User click the Add Conditional Picture button")
    public void userclickonAddConditionalPicturebutton () {
        tmp.userclickonAddConditionalPicturebutton();
    }

    @Then("User fill the details in the Conditional Pictures pop up")
    public void userfillConditionPicturesdetails() {
        tmp.selectConditionalPictureDocumentTypeRandom();
        tmp.uploadConditionPicturePhoto();
    }


    @Then("User click the save button in the Condition Picture pop up")
    public void userclickonsavebuttonintheConditionPicturepopup() {
        tmp.userclickonsavebuttonintheConditionPicturepopup();
    }


//  Condition Update


    @Then("User click the Condition Update section in the Asset Detail page")
    public void userclickonConditionUpdatebutton() {
        tmp.userclickonConditionUpdatebutton();
    }

    @Then("User fill the details in the Condition Update pop up")
    public void userfillConditionUpdatedetails() {
        Condition_Update_To_Condition  = dataGen.generateCondition_Update_To_Condition();
        tmp.selectCondition_Update_To_Condition(Condition_Update_To_Condition);
        Condition_Update_Remarks = dataGen.generateCondition_Update_Remarks();
        tmp.enterCondition_Update_Remarks(Condition_Update_Remarks);
        Condition_Update_Possible_Cause = dataGen.generateCondition_Update_Possible_Cause();
        tmp.selectCondition_Update_Possible_Cause(Condition_Update_Possible_Cause);
        Condition_Update_Anticipated_Action = dataGen.generateCondition_Update_Anticipated_Action();
        tmp.selectCondition_Update_Anticipated_Action(Condition_Update_Anticipated_Action);
    }


    @Then("User click the save button in the Condition Update pop up")
    public void userclickonsavebuttonintheConditionUpdatepopup() {
        tmp.userclickonsavebuttonintheConditionUpdatepopup();
    }

//  Functional Update


    @Then("User click the Functional Update section in the Asset Detail page")
    public void userclickonFunctionalUpdatebutton() {
        tmp.userclickonFunctionalUpdatebutton();
    }

    @Then("User fill the details in the Functional Update pop up")
    public void userfillFunctionalUpdatedetails() {
        Functional_Update_To_Status  = dataGen.generateFunctional_Update_To_Status();
        tmp.selectFunctional_Update_To_Status(Functional_Update_To_Status);
        Functional_Update_Reason = dataGen.generateFunctional_Update_Reason();
        tmp.selectFunctional_Update_Reason(Functional_Update_Reason);
        Functional_Update_Remarks = dataGen.generateFunctional_Update_Remarks();
        tmp.enterFunctional_Update_Remarks(Functional_Update_Remarks);
            }


    @Then("User click the save button in the Functional Update pop up")
    public void userclickonsavebuttonintheFunctionalUpdatepopup() {
        tmp.userclickonsavebuttonintheFunctionalUpdatepopup();
    }


//    Asset Inventory

    @Then("User clicks on the Add Asset Inventory button")
    public void userclickonAddAssetInventory() {
        tmp.userclickonAddAssetInventory();
    }

    @Then("User fill the Asset Inventory details")
    public void userFillAssetInventoryDetails() {
        Asset_Inventory_Verification_Name = dataGen.generateAsset_Inventory_Verification_Name();
        tmp.enterAsset_Inventory_Verification_Name(Asset_Inventory_Verification_Name);
        tmp.selectAssetInventoryClient();
        tmp.selectAssetInventoryClient_Contract();
        Asset_Inventory_Location_Level  = dataGen.generateAsset_Inventory_Location_Level();
        tmp.enterAsset_Inventory_Location_Level(Asset_Inventory_Location_Level);
    }

    @Then("User click the Asset Inventory Save button")
    public void userclickonAssetInventorySaveButton() {
        tmp.userclickonAssetInventorySaveButton();
    }

//    @Then("User Verifies the Added Asset Inventory record")
//    public void userclickonAddAssetInventory() {
//        tmp.userclickonAddAssetInventory();
//    }


//   Unscheduled Assets

    @Then("User get the Asset Code")
    public void userGetAssetCode() {
        Asset_Code = tmp.getAssetCode();
        System.out.println("Captured Asset Code: " + Asset_Code);
    }

    @Then("User verifies work order counts")
    public void userVerifiesWorkOrderCounts() {
        tmp.verifyWorkOrderCounts();
    }

    @Then("User verifies asset is present in Unscheduled Assets")
    public void userSearchesAsset() {
        tmp.searchAsset(Asset_Code);
    }


    // Alert Code Setup - Create And Verify

    @Then("User clicks on the Add Alert Code Setup button")
    public void userclickonAddAlertCodeSetupbutton() {
        tmp.userclickonAddAlertCodeSetupbutton();
    }

    @Then("User fill the Alert Code Setup details")
    public void userFillAlertCodeSetupDetails() {
        Alert_Code = dataGen.generateAlert_Code();
        tmp.enterAlert_Code(Alert_Code);
        Alert_Code_Description = dataGen.generateAlert_Code_Description();
        tmp.enterAlert_Code_Description(Alert_Code_Description);
        String inputType = tmp.selectRandomInputType();
        tmp.selectRandomContractGroup();
        tmp.handleFieldsBasedOnInputType(inputType);
    }


        @Then("User click the Alert Code Setup Save button")
        public void userclickonAlertCodeSetupSaveButton() {
            tmp.userclickonAlertCodeSetupSaveButton();
        }

    @Then("User verify if the Asset Alert Code is created")
    public void user_verify_Asset_Alert_Code_creation() {
        tmp.verifyAddAssetAlertCode(Alert_Code);
    }


    // Alert Code Setup - Delete

    @Then("User click on the first Alert Code Setup record to delete")
    public void userclickonFirstAlertCodeSetuprecordToDelete() {
        tmp.userclickonFirstAlertCodeSetuprecordToDelete();
    }


//    Decommissioned Assets

     @Then("User fill the Decommission field details")
    public void userfillDecommissionfielddetails() {
        tmp.selectDecommissionReasonRandom();
        Decommission_Remarks = dataGen.generateDecommission_Remarks();
        tmp.enterDecommission_Remarks(Decommission_Remarks);
        tmp.checkboxDecommissionWarning();
    }

    @Then("User update the Decommission Photo")
    public void userupdateDecommissionPhoto() {
         tmp.clickAddPhotoicon();
         tmp.selectDecommissionDocumentTypeRandom();
         tmp.uploadDecommissionPhoto();
        tmp.clickDecommissionFileSaveButton();
    }

    @Then("User click on the Request Sent For Approval Button")
    public void userclickonDecommissionRequestSentForApprovbutton() {
        tmp.userclickonDecommissionRequestSentForApprovbutton();
    }


    @Then("User verifies the asset is present in Decommissioned Asset grid list")
    public void userSearchDecommissionedAsset() {
        tmp.userSearchDecommissionedAsset(Asset_Code);
    }


    //    Export to Excel
    @Then("user click on the Asset Export to Excel button")
    public void userClicksOnAssetExportToExcelButton() {
        tmp.clickAssetExportToExcelButton();
    }

}






