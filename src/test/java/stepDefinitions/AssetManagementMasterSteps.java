package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AssetManagementMastersPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;

public class AssetManagementMasterSteps {

    public static String Asset_Class;
    public static String Update_Asset_Class;
    public static String Asset_Master_Category;
    public static String Update_Asset_Master_Category;
    public static String Asset_Category;
    public static String Update_Asset_Category;
    public static String Asset_Sub_Category;
    public static String Update_Asset_Sub_Category;
    public static String OEM;
    public static String Update_OEM;
    public static String Make;
    public static String Update_Make;
    public static String Model;
    public static String Update_Model;
    public static String Derating_Factor_Code;
    public static String Update_Derating_Factor_Code;
    public static String Derating_Factor_Description;
    public static String Short_Code_Reading_Unit;
    public static String Reading_Unit;
    public static String Update_Reading_Unit;
    public static String Technical_Parameters;
    public static String Update_Technical_Parameters;
    public static String Metering_Attributes;
    public static String Update_Metering_Attributes;
    public static String Metering_Parameters;
    public static String Update_Metering_Parameters;
    public static String Equipment_Name;
    public static String Update_Equipment_Name;
    public static int Hourly_Charges_AED;
    public static String Master_Trigger_Name;
    public static String Master_Asset_Trigger_Comparison_Type;
    public static String Master_Asset_Trigger_Work_Order_Type;
    public static String Master_Asset_Trigger_Description;


    private final WebDriver driver = DriverFactory.getDriver();
    AssetManagementMastersPage tmp = new AssetManagementMastersPage(driver);
    HelperUtils helperUtils = new HelperUtils(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User move to {string} Asset Management Element")
    public void usermovetoAssetManagementElement(String ElementName) {
        tmp.moveToAssetManagementElementByName(ElementName);
    }

    @And("User clicks on Asset Management Save button")
    public void user_clicks_on_button_Asset_Management_save() {
        tmp.clickAssetManagementSaveButton();
    }

    @Then("User fills the Asset Class details")
    public void user_Add_Asset_Class_details() throws IOException {
        Asset_Class = dataGen.generateAsset_Class();
        tmp.MasterAssetenterAssetClass(Asset_Class);
    }

    @Then("User verify if the Asset Class is created")
    public void user_verify_Asset_Class_creation() {
        tmp.MasterAssetverifyAddAssetClass(Asset_Class);
    }

    @Then("User clicks on first available Asset Class to edit")
    public void user_clicks_on_first_available_Asset_Class_to_edit() {
        tmp.MasterAssetclickAssetClasstoEdit();
    }

    @And("User updates the Asset Class details")
    public void user_Updates_Asset_Class_details() throws IOException {
        Update_Asset_Class = dataGen.generateAsset_Class();
        tmp.MasterAssetupdateAssetClass(Update_Asset_Class);
    }

    @Then("User verify if the Asset Class is updated")
    public void user_verify_the_success_message_after_updating_Asset_Class() {
        tmp.MasterAssetverifyUpdateAssetClass(Update_Asset_Class);
    }

    @Then("User clicks on first available Asset Class to delete")
    public void user_clicks_on_first_available_Asset_Class_to_delete() {
        tmp.MasterAssetclickAssetClassToDelete();
    }

    //Asset Master Category
    @Then("User clicks on button Add in Asset Master Category page")
    public void user_click__Add_Asset_Master_Category_button() {
        tmp.MasterAssetclickAddAssetMasterCategory();
    }

    @Then("User fills the Asset Master Category details")
    public void user_Add_Asset_Master_Category_details() throws IOException {
        Asset_Master_Category = dataGen.generateAsset_Master_Category();
        tmp.MasterAssetenterAssetMasterCategory(Asset_Master_Category);
        tmp.MasterAssetselectAssetClassrando();
    }

    @Then("User verify if the Asset Master Category is created")
    public void user_verify_Asset_Master_Category_creation() {
        tmp.MasterAssetverifyAddAssetMasterCategory(Asset_Master_Category);
    }

    @Then("User clicks on first available Asset Master Category to edit")
    public void user_clicks_on_first_available_Asset_Master_Category_to_edit() {
        tmp.MasterAssetclickAssetMasterCategorytoEdit();
    }

    @And("User updates the Asset Master Category details")
    public void user_Updates_Asset_Master_Category_details() throws IOException {
        Update_Asset_Master_Category = dataGen.generateAsset_Master_Category();
        tmp.MasterAssetupdateAssetMasterCategory(Update_Asset_Master_Category);
    }

    @Then("User verify if the Asset Master Category is updated")
    public void user_verify_the_success_message_after_updating_Asset_Master_Category() {
        tmp.MasterAssetverifyUpdateAssetMasterCategory(Update_Asset_Master_Category);
    }

    @Then("User clicks on first available Asset Master Category to delete")
    public void user_clicks_on_first_available_Asset_Master_Category_to_delete() {
        tmp.MasterAssetclickAssetMasterCategoryToDelete();
    }

    // Asset Category

    @Then("User fills the Asset Category details")
    public void user_Add_Asset_Category_details() throws IOException {
        Asset_Category = dataGen.generateAsset_Category();
        tmp.MasterAssetenterAssetCategory(Asset_Category);
        tmp.MasterAssetselectAssetMasterCategoryRandom();
    }

    @Then("User verify if the Asset Category is created")
    public void user_verify_Asset_Category_creation() {
        tmp.MasterAssetverifyAddAssetCategory(Asset_Category);
    }

    @Then("User clicks on first available Asset Category to edit")
    public void user_clicks_on_first_available_Asset_Category_to_edit() {
        tmp.MasterAssetclickAssetCategorytoEdit();
    }

    @And("User updates the Asset Category details")
    public void user_Updates_Asset_Category_details() throws IOException {
        Update_Asset_Category = dataGen.generateAsset_Category();
        tmp.MasterAssetupdateAssetCategory(Update_Asset_Category);
    }

    @Then("User verify if the Asset Category is updated")
    public void user_verify_the_success_message_after_updating_Asset_Category() {
        tmp.MasterAssetverifyUpdateAssetCategory(Update_Asset_Category);
    }

    @Then("User clicks on first available Asset Category to delete")
    public void user_clicks_on_first_available_Asset_Category_to_delete() {
        tmp.MasterAssetclickAssetCategoryToDelete();
    }

//Asset Sub Category

    @Then("User fills the Asset Sub Category details")
    public void user_Add_Asset_Sub_Category_details() throws IOException , InterruptedException {
        Asset_Sub_Category = dataGen.generateAsset_Sub_Category();
        tmp.MasterAssetenterAsset_Sub_Category(Asset_Sub_Category);
        tmp.MasterAssetselectSubCategoryMasterCategory("ak electronic items");
        tmp.MasterAssetselectSubCategoryCategory("ak office electronic items");
        tmp.MasterAssetselectCriticalityRandom();
    }

    @Then("User verify if the Asset Sub Category is created")
    public void user_verify_Asset_Sub_Category_creation() {
        tmp.verifyAddAsset_Sub_Category(Asset_Sub_Category);
    }

//Update Asset Sub Category
@Then("User click on the Manage Asset Subcategory button")
public void user_click_on_Manage_Asset_Subcategory() {
    tmp.MasterAssetClickManageAssetSubCategoryicon();
}

    @And("User updates the Asset Sub Category details")
    public void user_Updates_Asset_Sub_Category_details() throws IOException {
        Update_Asset_Sub_Category = dataGen.generateAsset_Sub_Category();
        tmp.MasterAssetupdateAssetSubCategory(Update_Asset_Sub_Category);
    }

    @And("User need to click the back icon to move to the Asset Sub Category grid list")
    public void user_click_back_icon_to_move_Asset_Sub_Category_grid_list() throws IOException {
         tmp.MasterAssetclickbackicontomoveAssetSubCategorygridlist();
    }

    @Then("User verify if the Asset Sub Category is updated")
    public void user_verify_the_success_message_after_updating_Asset_Sub_Category() {
        tmp.MasterAssetverifyUpdateAssetSubCategory(Update_Asset_Sub_Category);
    }

    //    Asset Sub Category - Applicable Fault Category
    @Then("User click Manage Applicable Fault Category icon in the Fault Category of the Asset Sub Category detail page")
    public void  userclickManageFaultCategoryiconinFaultCategorySectionofSubCategorydetailpage() {
        tmp.MasterAssetClickManageFaultCategoryiconinFaultCategorySectionofSubCategorydetailpage();
    }

    @Then("User fill the Fault Category details in the Fault Category section of the Asset Sub Category detail page")
    public void userfillFaultCategorydetailinFaultCategorySectionofSubCategorydetailpage() {
        tmp.MasterAssetselectServiceGroupinFaultCategorySectionofSubCategorydetailpage();
        tmp.waitForSeconds();
        tmp.MasterAssetselectFaultCategoryinFaultCategorypopupofSubCategorydetailpage();
    }

    @Then("User click Fault Category save button in the Fault Category pop up of the Asset Sub Category detail page")
    public void userClicksavebuttoninFaultCategorySectionofSubCategorydetailpage() {
        tmp.MasterAssetClicksavebuttoninFaultCategorySectionofSubCategorydetailpage();
    }


    //    Asset Sub Category - Technical Parameters
    @Then("User click Manage Technical Parameter icon in the Technical Parameter of the Asset Sub Category detail page")
    public void userClickManageTechnicalParameterinSubCategoryTechnicalParameterSection() {
        tmp.MasterAssetClickManageTechnicalParametericoninTechnicalParameterSection();
      }

    @Then("User fill the Link Technical Parameter details in the Technical Parameter section")
    public void userClickfillLinkTechnicalParameterdetailinTechnicalParameterSection() {
        tmp.MasterAssetClickfillLinkTechnicalParameterdetailinTechnicalParameterSection();
        tmp.waitForSeconds();
        tmp.MasterAssetClickAddbuttoninTechnicalParameterpopup();
    }

    @Then("User click Technical Parameter save button in the Technical Parameter of the Asset Sub Category detail page")
    public void userClicksavebuttoninTechnicalParameterSection() {
        tmp.MasterAssetClicksavebuttoninTechnicalParameterSection();
    }

    //    Asset Sub Category - Metering Parameters
    @Then("User click Link Parameter Setup in the Metering Parameters of the Asset Sub Category detail page")
    public void userClickOnLinkParameterSetupinSubCategoryMeteringParameterSection() {
        tmp.MasterAssetClickOnLinkParameterSetupinMeteringParameterSection();
        tmp.waitForSeconds();
    }

    @Then("User fill the Link Parameter Setup details in the Metering Parameter section")
    public void userfilldetailinnLinkParameterSetupinMeteringParameterSection() {
        tmp.MasterAssetfillLinkParameterSetupdetailinMeteringParameterSection();
    }

    @Then("User click Link Parameter Setup save button in the Asset Sub Category Metering Parameters section")
    public void userClickOnLinkParameterSetupsavebuttoninSubCategoryMeteringParameterSection() {
        tmp.MasterAssetClickOnLinkParameterSetupsavebutton();
    }

//    Asset Sub Category - Trigger
    @Then("User click on the Add button in the Asset Sub Category Trigger section")
    public void userClickOnAddbuttoninSubCategoryTriggerSection() {
        tmp.MasterAssetClickOnAddbuttoninSubCategoryTriggerSection();
    }

    @Then("User fill the Trigger details in the Asset Sub Category detail page")
    public void userfillTriggerSectiondetailsinSubCategory() {
        Master_Trigger_Name = dataGen.generateMaster_Asset_Trigger_Name();
        tmp.MasterAssetEnterTriggerName(Master_Trigger_Name);
        tmp.MasterAssetSelectTriggerParameterRandom();
        Master_Asset_Trigger_Comparison_Type=dataGen.generateComparison_Type();
        tmp.Master_Asset_enterAsset_Trigger_Comparison_Type(Master_Asset_Trigger_Comparison_Type);
        tmp.Master_Asset_enterAssetTriggerEventAndValues(Master_Asset_Trigger_Comparison_Type);
        tmp.Master_Asset_selectAssetTriggerReasonRandom();
        tmp.waitForSeconds();
        tmp.waitForLoaderToDisappear();
        tmp.Master_Asset_selectAssetTriggerContractGroupRandom();
        Master_Asset_Trigger_Work_Order_Type=dataGen.generateAsset_Trigger_Work_Order_Type();
        tmp.Master_Asset_enterAsset_Trigger_Work_Order_Type(Master_Asset_Trigger_Work_Order_Type);
        tmp.waitForSeconds();
        tmp.waitForLoaderToDisappear();
        tmp.Master_Asset_validateFieldsBasedOnWorkOrderType(Master_Asset_Trigger_Work_Order_Type);
        tmp.waitForSeconds();
        tmp.waitForLoaderToDisappear();
    }


    @Then("User click Trigger save button in the Asset Sub Category Trigger section")
    public void userclickTriggerSavebuttoninSubCategorydetailpage() {
        tmp.MasterAssetclickTriggerSavebuttoninSubCategorydetailpage();
    }

    //    Link Life Cycle SetUp
    @Then("User clicks on first available Asset Sub Category to edit")
    public void user_clicks_on_first_available_Asset_Sub_Category_to_edit() {
        tmp.MasterAssetclickAssetubCategorytoEdit();
    }

    @When("User click on the {string} section in the Asset Sub Category detail page")
    public void userClickOnSectioninAssetSubCategoryDetailpage(String sectionName) {
        tmp.MasterAssetClickOnSectioninAssetSubCategoryDetailpage(sectionName);
    }

    @Then("User click on the Add button in the Asset Sub Category Life Cycle Setup section")
    public void userClickOnAddbuttoninSubCategoryLifeCycleSetupSection() {
        tmp.MasterAssetClickOnAddbuttoninSubCategoryLifeCycleSetupSection();
    }

    @Then("User fill the Life Cycle details in the Asset Sub Category Life Cycle Setup section")
    public void userfilldetailsinSubCategoryLifeCycleSetupSection() {
        tmp.MasterAssetuserfillLifeCycledetailsinSubCategoryLifeCycleSetupSection();
        tmp.MasterAssetselectDeratingFactorsAndEnterPercentage();
    }

    @Then("User click Life Cycle save button in the Asset Sub Category Life Cycle Setup section")
    public void userclickLifeCycleSavebuttoninSubCategorydetailpage() {
        tmp.MasterAssetclickLifeCycleSavebuttoninSubCategorydetailpage();
    }

    //    Asset Sub Category - Link Applicable Trade

    @Then("User click on the Manage Applicable Trade button in the Applicable Trades section")
    public void userclickManageApplicableTradebuttoninApplicableTradesection() {
        tmp.MasterAssetclickManageApplicableTradebutton();
    }

    @Then("User link the Applicable Trade detail in the Applicable Trades section")
    public void userlinkApplicableTradedetailinApplicableTradesection() {
        tmp.MasterAssetlinkApplicableTradedetail();
        tmp.waitForSeconds();
        tmp.MasterAssetClickAddbuttoninApplicableTradepopup();
    }

    @Then("User click Applicable Trade save button in the Asset Sub Category detail page")
    public void userclickApplicableTradesavebutton() {
        tmp.userclickApplicableTradesavebutton();
    }


    //    Asset Sub Category - Delete
    @Then("User clicks on first available Asset Sub Category to delete")
    public void user_clicks_on_first_available_Asset_Sub_Category_to_delete() {
        tmp.clickAsset_Sub_Category_ToDelete();
    }


//    OEM

    @Then("User fills the OEM details")
    public void user_Add_OEM_details() throws IOException {
        OEM = dataGen.generateOEM();
        tmp.MasterAssetenterOEM(OEM);
    }

    @Then("User verify if the OEM is created")
    public void user_verify_OEM_creation() {
        tmp.MasterAssetverifyAddOEM(OEM);
    }

    @Then("User clicks on first available OEM to edit")
    public void user_clicks_on_first_available_OEM_to_edit() {
        tmp.MasterAssetclickOEMtoEdit();
    }

    @And("User updates the OEM details")
    public void user_Updates_OEM_details() throws IOException {
        Update_OEM = dataGen.generateOEM();
        tmp.MasterAssetupdateOEM(Update_OEM);
    }

    @Then("User verify if the OEM is updated")
    public void user_verify_the_success_message_after_updating_OEM() {
        tmp.MasterAssetverifyUpdateOEM(Update_OEM);
    }

    @Then("User clicks on first available OEM to delete")
    public void user_clicks_on_first_available_OEM_to_delete() {
        tmp.MasterAssetclickOEMToDelete();
    }

    //Make / Brand
    @Then("User fills the Make details")
    public void user_Add_Make_details() throws IOException {
        Make = dataGen.generateMake();
        tmp.MasterAssetenterMake(Make);
        tmp.MasterAssetselectOEMRandom();
    }

    @Then("User verify if the Make is created")
    public void user_verify_Make_creation() {
        tmp.MasterAssetverifyAddMake(Make);
    }

    @Then("User clicks on first available Make to edit")
    public void user_clicks_on_first_available_Make_to_edit() {
        tmp.MasterAssetclickMaketoEdit();
    }

    @And("User updates the Make details")
    public void user_Updates_Make_details() throws IOException {
        Update_Make = dataGen.generateMake();
        tmp.MasterAssetupdateMake(Update_Make);
    }

    @Then("User verify if the Make is updated")
    public void user_verify_the_success_message_after_updating_Make() {
        tmp.MasterAssetverifyUpdateMake(Update_Make);
    }

    @Then("User clicks on first available Make to delete")
    public void user_clicks_on_first_available_Make_to_delete() {
        tmp.MasterAssetclickMakeToDelete();
    }

    //    Model
    @Then("User fills the Model details")
    public void user_Add_Model_details() throws IOException , InterruptedException {
        Model = dataGen.generateModel();
        tmp.MasterAssetenterModel(Model);
        tmp.MasterAssetModelselectOEM("TVS");
        tmp.MasterAssetModelselectMake("Jupiter");
        tmp.MasterAssetModelselectAssetMasterCategory("ak electronic items");
        tmp.MasterAssetModelselectAssetCategory("ak office electronic items");
        tmp.MasterAssetModelselectAssetSubCategory("ak laptop");
    }

    @Then("User verify if the Model is created")
    public void user_verify_Model_creation() {
        tmp.MasterAssetverifyAddModel(Model);
    }

    @Then("User clicks on first available Model to edit")
    public void user_clicks_on_first_available_Model_to_edit() {
        tmp.MasterAssetclickModeltoEdit();
    }

    @And("User updates the Model details")
    public void user_Updates_Model_details() throws IOException {
        Update_Model = dataGen.generateModel();
        tmp.MasterAssetupdateModel(Update_Model);
    }

    @Then("User verify if the Model is updated")
    public void user_verify_the_success_message_after_updating_Model() {
        tmp.MasterAssetverifyUpdateModel(Update_Model);
    }

    @Then("User clicks on first available Model to delete")
    public void user_clicks_on_first_available_Model_to_delete() {
        tmp.MasterAssetclickModelToDelete();
    }


    //    Derating Factor

    @Then("User fills the Derating Factor details")
    public void user_Add_Derating_Factor_details() throws IOException {
        Derating_Factor_Code = dataGen.generateDerating_Factor_Code();
        tmp.MasterAssetenterDeratingFactorCode(Derating_Factor_Code);
        Derating_Factor_Description = dataGen.generateDerating_Factor_Description();
        tmp.MasterAssetenterDeratingFactorDescription(Derating_Factor_Description);
        tmp.MasterAssetDeratingFactorActivecheckbox();
    }

    @Then("User verify if the Derating Factor is created")
    public void user_verify_Derating_Factor_creation() {
        tmp.MasterAssetverifyAddDeratingFactor(Derating_Factor_Code);
    }

    @Then("User clicks on first available Derating Factor to edit")
    public void user_clicks_on_first_available_Derating_Factor_to_edit() {
        tmp.MasterAssetclickDeratingFactortoEdit();
    }

    @And("User updates the Derating Factor details")
    public void user_Updates_Derating_Factor_details() throws IOException {
        Update_Derating_Factor_Code = dataGen.generateDerating_Factor_Code();
        tmp.MasterAssetupdateDeratingFactor(Update_Derating_Factor_Code);
    }

    @Then("User verify if the Derating Factor is updated")
    public void user_verify_the_success_message_after_updating_Derating_Factor() {
        tmp.MasterAssetverifyUpdateDeratingFactor(Update_Derating_Factor_Code);
    }

    @Then("User clicks on first available Derating Factor to delete")
    public void user_clicks_on_first_available_Derating_Factor_to_delete() {
        tmp.MasterAssetclickDeratingFactorToDelete();
    }


    //    Reading Unit
    @Then("User fills the Reading Unit details")
    public void user_Add_Reading_Unit_details() throws IOException {
        Short_Code_Reading_Unit = dataGen.generateShort_Code_Reading_Unit();
        tmp.MasterAssetenterShortCodeReadingUnit(Short_Code_Reading_Unit);
        Reading_Unit = dataGen.generateReading_Unit();
        tmp.MasterAsseenterReading_Unit(Reading_Unit);
        tmp.MasterAsseselectReadingUnitSymbolRandom();

    }

    @Then("User verify if the Reading Unit is created")
    public void user_verify_Reading_Unit_creation() {
        tmp.MasterAsseverifyAddReadingUnit(Reading_Unit);
    }

    @Then("User clicks on first available Reading Unit to edit")
    public void user_clicks_on_first_available_Reading_Unit_to_edit() {
        tmp.MasterAsseclickReadingUnittoEdit();
    }

    @And("User updates the Reading Unit details")
    public void user_Updates_Reading_Unit_details() throws IOException {
        Update_Reading_Unit = dataGen.generateReading_Unit();
        tmp.MasterAsseUpdateReadingUnit(Update_Reading_Unit);
    }

    @Then("User verify if the Reading Unit is updated")
    public void user_verify_the_success_message_after_updating_Reading_Unit() {
        tmp.MasterAssetverifyUpdateReadingUnit(Update_Reading_Unit);
    }

    @Then("User clicks on first available Reading Unit to delete")
    public void user_clicks_on_first_available_Reading_Unit_to_delete() {
        tmp.MasterAssetclickReadingUnitToDelete();
    }

    //    Technical Parameters
    @Then("User fills the Technical Parameters details")
    public void user_Add_Technical_Parameters_details() throws IOException {
        Technical_Parameters = dataGen.generateTechnical_Parameters();
        tmp.MasterAssetenterTechnicalParameters(Technical_Parameters);
        tmp.MasterAssetselectTechnicalParametersReadingUnitRandom();
        tmp.MasterAssetselectTechnicalParametersParameterTypeRandom();
        tmp.MasterAssetselectTechnicalParametersBoxNameRandom();
    }

    @Then("User verify if the Technical Parameters is created")
    public void user_verify_Technical_Parameters_creation() {
        tmp.MasterAssetverifyAddTechnicalParameters(Technical_Parameters);
    }

    @Then("User clicks on first available Technical Parameters to edit")
    public void user_clicks_on_first_available_Technical_Parameters_to_edit() {
        tmp.MasterAssetclickTechnicalParameterstoEdit();
    }

    @And("User updates the Technical Parameters details")
    public void user_Updates_Technical_Parameters_details() throws IOException {
        Update_Technical_Parameters = dataGen.generateTechnical_Parameters();
        tmp.MasterAssetUpdateTechnicalParameters(Update_Technical_Parameters);
    }

    @Then("User verify if the Technical Parameters is updated")
    public void user_verify_the_success_message_after_updating_Technical_Parameters() {
        tmp.MasterAssetverifyUpdateTechnicalParameters(Update_Technical_Parameters);
    }

    @Then("User clicks on first available Technical Parameters to delete")
    public void user_clicks_on_first_available_Technical_Parameters_to_delete() {
        tmp.MasterAssetclickTechnicalParametersToDelete();
    }

    //   Metering Attributes
    @Then("User fills the Metering Attributes details")
    public void user_Add_Metering_Attributes_details() throws IOException {
        Metering_Attributes = dataGen.generateMetering_Attributes();
        tmp.MasterAssetenterMeteringAttributes(Metering_Attributes);
        tmp.MasterAssetselectMeteringAttributesReadingUnitRandom();

    }

    @Then("User verify if the Metering Attributes is created")
    public void user_verify_Metering_Attributes_creation() {
        tmp.MasterAssetverifyAddMeteringAttributes(Metering_Attributes);
    }

    @Then("User clicks on first available Metering Attributes to edit")
    public void user_clicks_on_first_available_Metering_Attributes_to_edit() {
        tmp.MasterAssetclickMeteringAttributestoEdit();
    }

    @And("User updates the Metering Attributes details")
    public void user_Updates_Metering_Attributes_details() throws IOException {
        Update_Metering_Attributes = dataGen.generateMetering_Attributes();
        tmp.MasterAssetUpdateMeteringAttributes(Update_Metering_Attributes);
    }

    @Then("User verify if the Metering Attributes is updated")
    public void user_verify_the_success_message_after_updating_Metering_Attributes() {
        tmp.MasterAssetverifyUpdateMeteringAttributes(Update_Metering_Attributes);
    }

    @Then("User clicks on first available Metering Attributes to delete")
    public void user_clicks_on_first_available_Metering_Attributes_to_delete() {
        tmp.MasterAssetclickMetering_AttributesToDelete();
    }

    //  Metering Parameters
    @Then("User fills the Metering Parameters details")
    public void user_Add_Metering_Parameters_details() throws IOException {
        Metering_Parameters = dataGen.generateMetering_Parameters();
        tmp.MasterAssetenterMeteringParameters(Metering_Parameters);
        tmp.MasterAssetselectMeteringParameterAttributeRandom();
        tmp.MasterAssetselectInputType();
        tmp.MasterAssetselectReadingType();
    }

    @Then("User verify if the Metering Parameters is created")
    public void user_verify_Metering_Parameters_creation() {
        tmp.MasterAssetverifyAddMeteringParameters(Metering_Parameters);
    }

    @Then("User clicks on first available Metering Parameters to edit")
    public void user_clicks_on_first_available_Metering_Parameters_to_edit() {
        tmp.MasterAssetclickMeteringParameterstoEdit();
    }

    @And("User updates the Metering Parameters details")
    public void user_Updates_Metering_Parameters_details() throws IOException {
        Update_Metering_Parameters = dataGen.generateMetering_Parameters();
        tmp.MasterAssetUpdateMeteringParameters(Update_Metering_Parameters);
    }

    @Then("User verify if the Metering Parameters is updated")
    public void user_verify_the_success_message_after_updating_Metering_Parameters() {
        tmp.MasterAssetverifyUpdateMeteringParameters(Update_Metering_Parameters);
    }

    @Then("User clicks on first available Metering Parameter to delete")
    public void user_clicks_on_first_available_Metering_Parameters_to_delete() {
        tmp.MasterAssetclickMeteringParameterToDelete();
    }


    //   ToolsandEquipments

    @Then("User fills the Tools & Equipments details")
    public void user_Add_Tools_And_Equipments_details() throws IOException {
        Equipment_Name = dataGen.generateTools_And_Equipments();
        tmp.MasterAssetenterEquipmentName(Equipment_Name);
        Hourly_Charges_AED = dataGen.generateTools_And_Equipments_Hourly_Charges();
        tmp.MasterAssetenterHourlyChargesAED(String.valueOf(Hourly_Charges_AED));
        tmp.MasterAssetselectToolsandEqupimentUnitrandom();
    }

    @Then("User verify if the Tools & Equipments is created")
    public void user_verify_Tools_And_Equipments_creation() {
        tmp.MasterAssetverifyAddToolsAndEquipments(Equipment_Name);
    }

    @Then("User clicks on first available Tools & Equipments to edit")
    public void user_clicks_on_first_available_Tools_And_Equipments_to_edit() {
        tmp.MasterAssetclickToolsAndEquipmentstoEdit();
    }

    @And("User updates the Tools & Equipments details")
    public void user_Updates_Tools_And_Equipments_details() throws IOException {
        Update_Equipment_Name = dataGen.generateTools_And_Equipments();
        tmp.MasterAssetUpdateToolsAndEquipments(Update_Equipment_Name);
    }

    @Then("User verify if the Tools & Equipments is updated")
    public void user_verify_the_success_message_after_updating_Tools_And_Equipments() {
        tmp.MasterAssetverifyUpdateToolsAndEquipments(Update_Equipment_Name);
    }

    @Then("User clicks on first available Tools & Equipments to delete")
    public void user_clicks_on_first_available_Tools_And_Equipments_to_delete() {
        tmp.MasterAssetclickToolsAndEquipmentsToDelete();
    }

//    Export to Excel

    @Then("User click on the Master Asset Management Export to Excel button")
    public void user_clicks_on_Master_Asset_Management_Export_to_Excel_button() {
        tmp.MasterAssetManagementExporttoExcel();
    }

//    ValidationAssetClass

    @Then("User verify the inline error message {string} on Asset Class field")
    public void user_verify_inline_error_message_on_Asset_Class(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Class field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssetClass_C_RequiredFieldValidator20");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Asset Class field")
    public void user_verify_chars_len_Asset_Class(int minLen, int maxLen) {
        System.out.println("Verifying Asset Class field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtAssetClass"), maxLen, minLen);
        System.out.println("Asset Class field length validation verified successfully.");
    }

    @When("User enters special characters in Asset Class field")
    public void enter_Special_Characters_In_Asset_Class() {
        System.out.println("Verifying Asset Class field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtAssetClass"));
        System.out.println("Special character validation completed for Asset Class field");
    }

    //    Validation Asset Master Category
    @Then("User verify the inline error message {string} on Asset Master Category field")
    public void user_verify_inline_error_message_on_Asset_Master_Category(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Master Category field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssCatType_C_RequiredFieldValidator21");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Asset Class field in Asset Master Category page")
    public void user_verify_inline_error_message_on_Asset_CLass_in_Asset_Master_Category_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Master Category field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssCatType_C_RequiredFieldValidator26");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Asset Master Category field")
    public void user_verify_chars_len_Asset_Master_Category(int minLen, int maxLen) {
        System.out.println("Verifying Asset Master Category field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtAsscatname"), maxLen, minLen);
        System.out.println("Asset Master Category field length validation verified successfully.");
    }

    @When("User enters special characters in Asset Master Category field")
    public void enter_Special_Characters_In_Asset_Master_Category() {
        System.out.println("Verifying Asset Master Category field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtAsscatname"));
        System.out.println("Special character validation completed for Asset Master Category field");
    }

    //    Validation Asset Category
    @Then("User verify the inline error message {string} on Asset Category field")
    public void user_verify_inline_error_message_on_Asset_Category(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Category field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssCategory_C_RequiredFieldValidator22");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Asset Master Category field in Asset Category page")
    public void user_verify_inline_error_message_on_Asset_Master_Category_in_Asset_Category_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Master Category field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssCategory_C_RequiredFieldValidator23");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Asset Category field")
    public void user_verify_chars_len_Asset_Category(int minLen, int maxLen) {
        System.out.println("Verifying Asset Category field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("RadtxtAssCat"), maxLen, minLen);
        System.out.println("Asset Category field length validation verified successfully.");
    }

    @When("User enters special characters in Asset Category field")
    public void enter_Special_Characters_In_Asset_Category() {
        System.out.println("Verifying Asset Category field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("RadtxtAssCat"));
        System.out.println("Special character validation completed for Asset Category field");
    }

    //    Validation Asset Subcategory
    @Then("User verify the inline error message {string} on Asset Subcategory field")
    public void user_verify_inline_error_message_on_Asset_Subcategory(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Subcategory field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssSubCat_C_RequiredFieldValidator24");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Asset Master Category field in Asset Subcategory page")
    public void user_verify_inline_error_message_on_Asset_Master_Category_in_Asset_Subcategory_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Master Category field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssSubCat_C_RequiredFieldValidator37");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Asset Category field in Asset Subcategory page")
    public void user_verify_inline_error_message_on_Asset_Category_in_Asset_Subcategory_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Category field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssSubCat_C_RequiredFieldValidator25");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Asset Criticality field in Asset Subcategory page")
    public void user_verify_inline_error_message_on_Asset_Criticality_in_Asset_Subcategory_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Criticality field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAssSubCat_C_RequiredFieldValidator14");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Asset Subcategory field")
    public void user_verify_chars_len_Asset_Subcategory(int minLen, int maxLen) {
        System.out.println("Verifying Asset Subcategory field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtAssSubCat"), maxLen, minLen);
        System.out.println("Asset Subcategory field length validation verified successfully.");
    }

    @When("User enters special characters in Asset Subcategory field")
    public void enter_Special_Characters_In_Asset_Subcategory() {
        System.out.println("Verifying Asset Subcategory field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtAssSubCat"));
        System.out.println("Special character validation completed for Asset Subcategory field");
    }

//    ValidationOEM

    @Then("User verify the inline error message {string} on OEM field")
    public void user_verify_inline_error_message_on_OEM(String expectedMessage) {
        System.out.println("Verifying inline error message for OEM field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinOEM_C_rfvOEMcode");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for OEM field")
    public void user_verify_chars_len_OEM(int minLen, int maxLen) {
        System.out.println("Verifying OEM field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtOEMCode"), maxLen, minLen);
        System.out.println("OEM field length validation verified successfully.");
    }

    @When("User enters special characters in OEM field")
    public void enter_Special_Characters_In_OEM() {
        System.out.println("Verifying OEM field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtOEMCode"));
        System.out.println("Special character validation completed for OEM field");
    }

    //    ValidationMake
    @Then("User verify the inline error message {string} on Make field")
    public void user_verify_inline_error_message_on_Make(String expectedMessage) {
        System.out.println("Verifying inline error message for Make field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinMake_C_rfvMakecode");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on OEM field in Make page")
    public void user_verify_inline_error_message_on_OEM_field_in_Make_page(String expectedMessage) {
        System.out.println("Verifying inline error message for OEM field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinMake_C_rfvOEM");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Make field")
    public void user_verify_chars_len_Make(int minLen, int maxLen) {
        System.out.println("Verifying Make field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtMakeCode"), maxLen, minLen);
        System.out.println("Make field length validation verified successfully.");
    }

    @When("User enters special characters in Make field")
    public void enter_Special_Characters_In_Make_field() {
        System.out.println("Verifying Make/Brand field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtMakeCode"));
        System.out.println("Special character validation completed for Make/Brand field");
    }


    //    ValidationModel
    @Then("User verify the inline error message {string} on Model field")
    public void user_verify_inline_error_message_on_Model(String expectedMessage) {
        System.out.println("Verifying inline error message for Model field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_rfvModel");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on OEM field in Model page")
    public void user_verify_inline_error_message_on_OEM_field_in_Model_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Model field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_rfvModelOEM");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Make field in Model page")
    public void user_verify_inline_error_message_on_Make_field_in_Model_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Make / Brand  field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_rfvBrand");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Asset Master Category field in Model page")
    public void user_verify_inline_error_message_on_Asset_Master_Category_field_in_Model_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Master Category field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_rfvMaster");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Asset Category field in Model page")
    public void user_verify_inline_error_message_on_Asset_Category_field_in_Model_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Category field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_rfvCategory");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Asset Subcategory field in Model page")
    public void user_verify_inline_error_message_on_Asset_Subcategory_field_in_Model_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Asset Subcategory field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinModel_C_rfvSubCate");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Model field")
    public void user_verify_chars_len_Model(int minLen, int maxLen) {
        System.out.println("Verifying Model field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtModel"), maxLen, minLen);
        System.out.println("Model field length validation verified successfully.");
    }

    @When("User enters special characters in Model field")
    public void enter_Special_Characters_In_Model_field() {
        System.out.println("Verifying Model field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtModel"));
        System.out.println("Special character validation completed for Model field");
    }

    //    ValidationDeratingFactor
    @Then("User verify the inline error message {string} on Code field in Derating Factor page")
    public void user_verify_inline_error_message_on_Code(String expectedMessage) {
        System.out.println("Verifying inline error message for Code field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinDeRatingFactors_C_RequiredFieldValidator15");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Description field in Derating Factor page")
    public void user_verify_inline_error_message_on_Description_field_in_Model_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Description field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinDeRatingFactors_C_RequiredFieldValidator16");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Code field in Derating Factor page")
    public void user_verify_chars_len_Code(int minLen, int maxLen) {
        System.out.println("Verifying Code field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("txtCode"), maxLen, minLen);
        System.out.println("Code field length validation verified successfully.");
    }

    @When("User verify the chars min len as {int} and max len as {int} for Description field in Derating Factor page")
    public void user_verify_chars_len_Description(int minLen, int maxLen) {
        System.out.println("Verifying Description field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("txtDescription"), maxLen, minLen);
        System.out.println("Description field length validation verified successfully.");
    }

    @When("User enters special characters in Description field in Derating Factor page")
    public void enter_Special_Characters_In_Description_field() {
        System.out.println("Verifying Description field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtDescription"));
        System.out.println("Special character validation completed for Description field");
    }

    //    ValidationReadingUnit
    @Then("User verify the inline error message {string} on Short Code field in Reading Unit page")
    public void user_verify_inline_error_message_on_Short_Code(String expectedMessage) {
        System.out.println("Verifying inline error message for Short Code field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinReadingUnit_C_RequiredFieldValidator11");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Reading Unit field in Reading Unit page")
    public void user_verify_inline_error_message_on_Reading_Unit_field_in_Reading_Unit_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Reading Unit field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinReadingUnit_C_RequiredFieldValidator9");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Symbol field in Reading Unit page")
    public void user_verify_inline_error_message_on_Symbol_field_in_Reading_Unit_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Symbol field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinReadingUnit_C_RequiredFieldValidator10");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Short Code field in Reading Unit page")
    public void user_verify_chars_len_Short_Code(int minLen, int maxLen) {
        System.out.println("Verifying Short Code field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtshortCode"), maxLen, minLen);
        System.out.println("Short Code field length validation verified successfully.");
    }

    @When("User verify the chars min len as {int} and max len as {int} for Reading Unit field in Reading Unit page")
    public void user_verify_chars_len_Reading_Unit(int minLen, int maxLen) {
        System.out.println("Verifying Reading Unit field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtReadingUnit"), maxLen, minLen);
        System.out.println("Reading Unit field length validation verified successfully.");
    }

    @When("User enters special characters in Short Code field in Reading Unit page")
    public void enter_Special_Characters_In_Short_Code_field() {
        System.out.println("Verifying Short Code field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtshortCode"));
        System.out.println("Special character validation completed for Short Code field");
    }

    @When("User enters special characters in Reading Unit field in Reading Unit page")
    public void enter_Special_Characters_In_Reading_Unit_field() {
        System.out.println("Verifying Reading Unit field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtReadingUnit"));
        System.out.println("Special character validation completed for Reading Unit field");
    }

    //    ValidationTechnicalParameter
    @Then("User verify the inline error message {string} on Parameter field in Technical Parameter page")
    public void user_verify_inline_error_message_on_Parameter_in_Technical_Parameter_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Parameter field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_RequiredFieldValidator3");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Parameter Type field in Technical Parameter page")
    public void user_verify_inline_error_message_on_Parameter_Type_field_in_Technical_Parameter_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Parameter Type field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_RequiredFieldValidator4");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Box Name field in Technical Parameter page")
    public void user_verify_inline_error_message_on_Box_Name_field_in_Technical_Parameter_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Box Name field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_RequiredFieldValidator8");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Parameter field in Technical Parameter page")
    public void user_verify_chars_len_Parameter(int minLen, int maxLen) {
        System.out.println("Verifying Parameter field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_radtxtParaName"), maxLen, minLen);
        System.out.println("Parameter field length validation verified successfully.");
    }

    @When("User enters special characters in Parameter field in Technical Parameter page")
    public void enter_Special_Characters_In_Parameter_field() {
        System.out.println("Verifying Parameter field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("ctl00_ContentPlaceHolder1_RadWinTechnicalaPara_C_radtxtParaName"));
        System.out.println("Special character validation completed for Parameter field");
    }

    //    Validation Metering Attributes
    @Then("User verify the inline error message {string} on Attribute field in Metering Attributes page")
    public void user_verify_inline_error_message_on_Attribute_in_Metering_Attributes_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Attribute field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringAttribute_C_RequiredFieldValidator12");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Reading Unit field in Metering Attributes page")
    public void user_verify_inline_error_message_on_Reading_Unit_field_in_Metering_Attributes_page(String expectedMessage) {
        System.out.println("Verifying inline error message for Reading Unit field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringAttribute_C_RequiredFieldValidator13");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("User verify the chars min len as {int} and max len as {int} for Attribute field in Metering Attributes page")
    public void user_verify_chars_len_Attribute_Metering_Attributes_page(int minLen, int maxLen) {
        System.out.println("Verifying Attribute field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtAttribute"), maxLen, minLen);
        System.out.println("Attribute field length validation verified successfully.");
    }

    @When("User enters special characters in Attribute field in Metering Attributes page")
    public void enter_Special_Characters_In_Attribute_field_Metering_Attributes_page() {
        System.out.println("Verifying Attribute field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtAttribute"));
        System.out.println("Special character validation completed for Attribute field");
    }

    @Then("User verify Active checkbox is selected by default in Metering Attributes page")
    public void user_verify_active_checkbox_is_checked_by_default_in_Metering_Attributes_page() {
        helperUtils.verifyActiveCheckboxSelected(By.id("chkActive"));}

        //    Validation Metering Parameters
        @Then("User verify the inline error message {string} on Parameter field in Metering Parameters page")
        public void user_verify_inline_error_message_on_Parameter_in_Metering_Attributes_page (String expectedMessage){
            System.out.println("Verifying inline error message for Parameter field. Expected message: "
                    + expectedMessage);
            By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_RequiredFieldValidator17");
            helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
            System.out.println("Inline error message verified successfully: " + expectedMessage);
        }

        @Then("User verify the inline error message {string} on Attribute field in Metering Parameters page")
        public void user_verify_inline_error_message_on_Attribute_in_Metering_Parameters_page (String expectedMessage){
            System.out.println("Verifying inline error message for Attribute field. Expected message: "
                    + expectedMessage);
            By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_RequiredFieldValidator18");
            helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
            System.out.println("Inline error message verified successfully: " + expectedMessage);
        }

        @Then("User verify the inline error message {string} on Input Type field in Metering Parameters page")
        public void user_verify_inline_error_message_on_Input_Type_in_Metering_Parameters_page (String expectedMessage){
            System.out.println("Verifying inline error message for Input Type field. Expected message: "
                    + expectedMessage);
            By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_RequiredFieldValidator27");
            helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
            System.out.println("Inline error message verified successfully: " + expectedMessage);
        }

        @Then("User verify the inline error message {string} on Reading Type field in Metering Parameters page")
        public void user_verify_inline_error_message_on_Reading_Type_in_Metering_Parameters_page (String expectedMessage)
        {
            System.out.println("Verifying inline error message for Reading Type field. Expected message: "
                    + expectedMessage);
            By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinMeteringPara_C_RequiredFieldValidator28");
            helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
            System.out.println("Inline error message verified successfully: " + expectedMessage);
        }

        @When("User verify the chars min len as {int} and max len as {int} for Parameter field in Metering Parameters page")
        public void user_verify_chars_len_Parameter_Metering_Parameter_page ( int minLen, int maxLen){
            System.out.println("Verifying Parameter field length validation. Expected Min Length: "
                    + minLen + ", Expected Max Length: " + maxLen);
            helperUtils.verifyMinAndMaxLength(By.id("radtxtParameter"), maxLen, minLen);
            System.out.println("Parameter field length validation verified successfully.");
        }

        @When("User enters special characters in Parameter field in Metering Parameters page")
        public void enter_Special_Characters_In_Parameter_field_Metering_Parameter_page () {
            System.out.println("Verifying Parameter field accepts/rejects special characters");
            helperUtils.enterSpecialCharacters(By.id("radtxtParameter"));
            System.out.println("Special character validation completed for Parameter field");
        }

        @Then("User verify Active checkbox is selected by default in Metering Parameters page")
        public void user_verify_active_checkbox_is_checked_by_default_in_Metering_Parameter_page () {
            helperUtils.verifyActiveCheckboxSelected(By.id("chkMeterparaActive"));
        }

    //    Validation Tools / Equipments
    @Then("User verify the inline error message {string} on Equipment Name field in Tools page")
    public void user_verify_inline_error_message_on_Equipment_Name_in_Tools_page (String expectedMessage){
        System.out.println("Verifying inline error message for Equipment Name field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_RequiredFieldValidator53");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Hourly Charges field in Tools page")
    public void user_verify_inline_error_message_on_Hourly_Charges_in_Tools_page (String expectedMessage){
        System.out.println("Verifying inline error message for Hourly Charges field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_RequiredFieldValidator57");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Unit field in Tools page")
    public void user_verify_inline_error_message_on_Unit_in_Tools_page (String expectedMessage){
        System.out.println("Verifying inline error message for Unit field. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_RequiredFieldValidator29");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

     @When("User verify the chars min len as {int} and max len as {int} for Equipment Name field in Tools page")
    public void user_verify_chars_len_Equipment_Name_Tools_page ( int minLen, int maxLen){
        System.out.println("Verifying Equipment Name field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_radtxtEquipmentName"), maxLen, minLen);
        System.out.println("Equipment Name field length validation verified successfully.");
    }

    @When("User verify the chars min len as {int} and max len as {int} for Hourly Charges field in Tools page")
    public void user_verify_chars_len_Hourly_Charges_Tools_page ( int minLen, int maxLen){
        System.out.println("Verifying Hourly Charges field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_radtxtrate"), maxLen, minLen);
        System.out.println("Hourly Charges field length validation verified successfully.");
    }

    @When("User enters special characters in Equipment Name field in Tools page")
    public void enter_Special_Characters_In_Equipment_Name_field_in_Tools_page () {
        System.out.println("Verifying Equipment Name field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_radtxtEquipmentName"));
        System.out.println("Special character validation completed for Equipment Name field");
    }

    @When("User enters special characters in Hourly Charges field in Tools page")
    public void enter_Special_Characters_In_Parameter_field_in_Tools_page () {
        System.out.println("Verifying Hourly Charges field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("ctl00_ContentPlaceHolder1_RadWinToolsAndEquipment_C_radtxtrate"));
        System.out.println("Special character validation completed for Hourly Charges field");
    }
}