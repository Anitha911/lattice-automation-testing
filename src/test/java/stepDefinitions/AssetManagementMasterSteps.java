package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.AssetManagementMastersPage;
import utils.DriverFactory;
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
    public static int Technical_Parameters_Max_Length;
    public static String Metering_Attributes;
    public static String Update_Metering_Attributes;
    public static int Metering_Attributes_Decimals;
    public static String Metering_Parameters;
    public static String Update_Metering_Parameters;
    public static String Equipment_Name;
    public static String Update_Equipment_Name;
    public static int Hourly_Charges_AED ;




    private final WebDriver driver = DriverFactory.getDriver();
    AssetManagementMastersPage tmp = new AssetManagementMastersPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User move to {string} Elements")
    public void usermovetoElement(String ElementName) {
        tmp.moveToElementByName(ElementName);
    }

    @And("User clicks on Asset Management Save button")
    public void user_clicks_on_button_Asset_Management_save() {
        tmp.clickAssetManagementSaveButton();
    }

    @Then("User fills the Asset Class details")
    public void user_Add_Asset_Class_details() throws IOException {
        Asset_Class = dataGen.generateAsset_Class();
        tmp.enterAsset_Class(Asset_Class);
    }

    @Then("User verify if the Asset Class is created")
    public void user_verify_Asset_Class_creation() {
        tmp.verifyAddAsset_Class(Asset_Class);
    }

    @Then("User clicks on first available Asset Class to edit")
    public void user_clicks_on_first_available_Asset_Class_to_edit() {
        tmp.clickAsset_ClasstoEdit();
    }

    @And("User updates the Asset Class details")
    public void user_Updates_Asset_Class_details() throws IOException {
        Update_Asset_Class = dataGen.generateAsset_Class();
        tmp.updateAsset_Class(Update_Asset_Class);
    }

    @Then("User verify if the Asset Class is updated")
    public void user_verify_the_success_message_after_updating_Asset_Class() {
        tmp.verifyUpdateAsset_Class(Update_Asset_Class);
    }

    @Then("User clicks on first available Asset Class to delete")
    public void user_clicks_on_first_available_Asset_Class_to_delete() {
        tmp.clickAsset_ClassToDelete();
    }

    //Asset Master Category

    @Then("User fills the Asset Master Category details")
    public void user_Add_Asset_Master_Category_details() throws IOException {
        Asset_Master_Category = dataGen.generateAsset_Master_Category();
        tmp.enterAsset_Master_Category(Asset_Master_Category);
        tmp.selectAssetClass("ak asset master");
    }

    @Then("User verify if the Asset Master Category is created")
    public void user_verify_Asset_Master_Category_creation() {
        tmp.verifyAddAsset_Master_Category(Asset_Master_Category);
    }

    @Then("User clicks on first available Asset Master Category to edit")
    public void user_clicks_on_first_available_Asset_Master_Category_to_edit() {
        tmp.clickAsset_Master_Category_toEdit();
    }

    @And("User updates the Asset Master Category details")
    public void user_Updates_Asset_Master_Category_details() throws IOException {
        Update_Asset_Master_Category = dataGen.generateAsset_Master_Category();
        tmp.updateAsset_Master_Category(Update_Asset_Master_Category);
    }

    @Then("User verify if the Asset Master Category is updated")
    public void user_verify_the_success_message_after_updating_Asset_Master_Category() {
        tmp.verifyUpdateAsset_Master_Category(Update_Asset_Master_Category);
    }

    @Then("User clicks on first available Asset Master Category to delete")
    public void user_clicks_on_first_available_Asset_Master_Category_to_delete() {
        tmp.clickAsset_Master_Category_ToDelete();
    }

    // Asset Category

    @Then("User fills the Asset Category details")
    public void user_Add_Asset_Category_details() throws IOException {
        Asset_Category = dataGen.generateAsset_Category();
        tmp.enterAsset_Category(Asset_Category);
        tmp.selectAsset_Master_Category("ak electronic items");
          }

    @Then("User verify if the Asset Category is created")
    public void user_verify_Asset_Category_creation() {
        tmp.verifyAddAsset_Category(Asset_Category);
    }

    @Then("User clicks on first available Asset Category to edit")
    public void user_clicks_on_first_available_Asset_Category_to_edit() {
        tmp.clickAsset_Category_toEdit();
    }

    @And("User updates the Asset Category details")
    public void user_Updates_Asset_Category_details() throws IOException {
        Update_Asset_Category = dataGen.generateAsset_Category();
        tmp.updateAsset_Category(Update_Asset_Category);
    }

    @Then("User verify if the Asset Category is updated")
    public void user_verify_the_success_message_after_updating_Asset_Category() {
        tmp.verifyUpdateAsset_Category(Update_Asset_Category);
    }

    @Then("User clicks on first available Asset Category to delete")
    public void user_clicks_on_first_available_Asset_Category_to_delete() {
        tmp.clickAsset_Category_ToDelete();
    }

//Asset Sub Category

    @Then("User fills the Asset Sub Category details")
    public void user_Add_Asset_Sub_Category_details() throws IOException {
        Asset_Sub_Category = dataGen.generateAsset_Sub_Category();
        tmp.enterAsset_Sub_Category(Asset_Sub_Category);
        tmp.selectAsset_Master_Category("ak electronic items");
        tmp.selectAsset_Category("ak office electronic items");
        tmp.selectCriticality("Medium");
    }

    @Then("User verify if the Asset Sub Category is created")
    public void user_verify_Asset_Sub_Category_creation() {
        tmp.verifyAddAsset_Sub_Category(Asset_Sub_Category);
    }

//    @Then("User clicks on first available Asset Category to edit")
//    public void user_clicks_on_first_available_Asset_Category_to_edit() {
//        tmp.clickAsset_Category_toEdit();
//    }
//
//    @And("User updates the Asset Category details")
//    public void user_Updates_Asset_Category_details() throws IOException {
//        Update_Asset_Category = dataGen.generateAsset_Category();
//        tmp.updateAsset_Category(Update_Asset_Category);
//    }
//
//    @Then("User verify if the Asset Category is updated")
//    public void user_verify_the_success_message_after_updating_Asset_Category() {
//        tmp.verifyUpdateAsset_Category(Update_Asset_Category);
//    }

    @Then("User clicks on first available Asset Sub Category to delete")
    public void user_clicks_on_first_available_Asset_Sub_Category_to_delete() {
        tmp.clickAsset_Sub_Category_ToDelete();
    }


//    OEM

    @Then("User fills the OEM details")
    public void user_Add_OEM_details() throws IOException {
        OEM = dataGen.generateOEM();
        tmp.enterOEM(OEM);
          }

    @Then("User verify if the OEM is created")
    public void user_verify_OEM_creation() {
        tmp.verifyAddOEM(OEM);
    }

    @Then("User clicks on first available OEM to edit")
    public void user_clicks_on_first_available_OEM_to_edit() {
        tmp.clickOEM_toEdit();
    }

    @And("User updates the OEM details")
    public void user_Updates_OEM_details() throws IOException {
        Update_OEM = dataGen.generateOEM();
        tmp.updateOEM(Update_OEM);
    }

    @Then("User verify if the OEM is updated")
    public void user_verify_the_success_message_after_updating_OEM() {
        tmp.verifyUpdateOEM(Update_OEM);
    }

    @Then("User clicks on first available OEM to delete")
    public void user_clicks_on_first_available_OEM_to_delete() {
        tmp.clickOEM_ToDelete();
    }


    //    Make / Brand

    @Then("User fills the Make details")
    public void user_Add_Make_details() throws IOException {
        Make = dataGen.generateMake();
        tmp.enterMake(Make);
        tmp.selectOEM("TVS");
    }

    @Then("User verify if the Make is created")
    public void user_verify_Make_creation() {
        tmp.verifyAddMake(Make);
    }

    @Then("User clicks on first available Make to edit")
    public void user_clicks_on_first_available_Make_to_edit() {
        tmp.clickMake_toEdit();
    }

    @And("User updates the Make details")
    public void user_Updates_Make_details() throws IOException {
        Update_Make = dataGen.generateMake();
        tmp.updateMake(Update_Make);

    }

    @Then("User verify if the Make is updated")
    public void user_verify_the_success_message_after_updating_Make() {
        tmp.verifyUpdateMake(Update_Make);
    }

    @Then("User clicks on first available Make to delete")
    public void user_clicks_on_first_available_Make_to_delete() {
        tmp.clickMake_ToDelete();
    }


    //    Model
    @Then("User fills the Model details")
    public void user_Add_Model_details() throws IOException {
        Model = dataGen.generateModel();
        tmp.enterModel(Model);
        tmp.selectOEM("TVS");
        tmp.selectMake("Jupiter");
        tmp.selectAsset_Master_Category("ak electronic items");
        tmp.selectAsset_Category("ak office electronic items");
        tmp.selectAsset_Sub_Category("ak laptop");
    }

    @Then("User verify if the Model is created")
    public void user_verify_Model_creation() {
        tmp.verifyAddModel(Model);
    }

    @Then("User clicks on first available Model to edit")
    public void user_clicks_on_first_available_Model_to_edit() {
        tmp.clickModel_toEdit();
    }

    @And("User updates the Model details")
    public void user_Updates_Model_details() throws IOException {
        Update_Model = dataGen.generateModel();
        tmp.updateModel(Update_Model);
    }

    @Then("User verify if the Model is updated")
    public void user_verify_the_success_message_after_updating_Model() {
        tmp.verifyUpdateModel(Update_Model);
    }

    @Then("User clicks on first available Model to delete")
    public void user_clicks_on_first_available_Model_to_delete() {
        tmp.clickModel_ToDelete();
    }


    //    Derating Factor

    @Then("User fills the Derating Factor details")
    public void user_Add_Derating_Factor_details() throws IOException {
        Derating_Factor_Code = dataGen.generateDerating_Factor_Code();
        tmp.enterDerating_Factor_Code(Derating_Factor_Code);
        Derating_Factor_Description = dataGen.generateDerating_Factor_Description();
        tmp.enterDerating_Factor_Description(Derating_Factor_Description);
         }

    @Then("User verify if the Derating Factor is created")
    public void user_verify_Derating_Factor_creation() {
        tmp.verifyAddDerating_Factor(Derating_Factor_Code);
    }

    @Then("User clicks on first available Derating Factor to edit")
    public void user_clicks_on_first_available_Derating_Factor_to_edit() {
        tmp.clickDerating_Factor_toEdit();
    }

    @And("User updates the Derating Factor details")
    public void user_Updates_Derating_Factor_details() throws IOException {
        Update_Derating_Factor_Code = dataGen.generateDerating_Factor_Code();
        tmp.updateDerating_Factor(Update_Derating_Factor_Code);
    }

    @Then("User verify if the Derating Factor is updated")
    public void user_verify_the_success_message_after_updating_Derating_Factor() {
        tmp.verifyUpdateDerating_Factor(Update_Derating_Factor_Code);
    }

    @Then("User clicks on first available Derating Factor to delete")
    public void user_clicks_on_first_available_Derating_Factor_to_delete() {
        tmp.clickDerating_Factor_ToDelete();
    }


    //    Reading Unit
    @Then("User fills the Reading Unit details")
    public void user_Add_Reading_Unit_details() throws IOException {
        Short_Code_Reading_Unit = dataGen.generateShort_Code_Reading_Unit();
        tmp.enterShort_Code_Reading_Unit(Short_Code_Reading_Unit);
        Reading_Unit = dataGen.generateReading_Unit();
        tmp.enterReading_Unit(Reading_Unit);
        tmp.selectReading_Unit_Symbol("W");

    }

    @Then("User verify if the Reading Unit is created")
    public void user_verify_Reading_Unit_creation() {
        tmp.verifyAddReading_Unit(Reading_Unit);
    }

    @Then("User clicks on first available Reading Unit to edit")
    public void user_clicks_on_first_available_Reading_Unit_to_edit() {
        tmp.clickReading_Unit_toEdit();
    }

    @And("User updates the Reading Unit details")
    public void user_Updates_Reading_Unit_details() throws IOException {
        Update_Reading_Unit = dataGen.generateReading_Unit();
        tmp.Update_Reading_Unit(Update_Reading_Unit);
    }

    @Then("User verify if the Reading Unit is updated")
    public void user_verify_the_success_message_after_updating_Reading_Unit() {
        tmp.verifyUpdateReading_Unit(Update_Reading_Unit);
    }

    @Then("User clicks on first available Reading Unit to delete")
    public void user_clicks_on_first_available_Reading_Unit_to_delete() {
        tmp.clickReading_Unit_ToDelete();
    }

    //    Technical Parameters
    @Then("User fills the Technical Parameters details")
    public void user_Add_Technical_Parameters_details() throws IOException {
        Technical_Parameters = dataGen.generateTechnical_Parameters();
        tmp.enterTechnical_Parameters(Technical_Parameters);
        tmp.selectTechnical_Parameters_Reading_Unit("Watt");
        tmp.selectTechnical_Parameters_Parameter_Type("Text");
        Technical_Parameters_Max_Length = dataGen.generateTechnical_Parameters_Max_Length();
        tmp.enterTechnical_Parameters_Max_Length (String.valueOf(Technical_Parameters_Max_Length));
        tmp.selectTechnical_Parameters_Box_name("Section 4");

    }

    @Then("User verify if the Technical Parameters is created")
    public void user_verify_Technical_Parameters_creation() {
        tmp.verifyAddTechnical_Parameters(Technical_Parameters);
    }

    @Then("User clicks on first available Technical Parameters to edit")
    public void user_clicks_on_first_available_Technical_Parameters_to_edit() {
        tmp.clickTechnical_Parameters_toEdit();
    }

    @And("User updates the Technical Parameters details")
    public void user_Updates_Technical_Parameters_details() throws IOException {
        Update_Technical_Parameters = dataGen.generateTechnical_Parameters();
        tmp.Update_Technical_Parameters(Update_Technical_Parameters);
    }

    @Then("User verify if the Technical Parameters is updated")
    public void user_verify_the_success_message_after_updating_Technical_Parameters() {
        tmp.verifyUpdateTechnical_Parameters(Update_Technical_Parameters);
    }

    @Then("User clicks on first available Technical Parameters to delete")
    public void user_clicks_on_first_available_Technical_Parameters_to_delete() {
        tmp.clickTechnical_Parameters_ToDelete();
    }

    //   Metering Attributes
    @Then("User fills the Metering Attributes details")
    public void user_Add_Metering_Attributes_details() throws IOException {
        Metering_Attributes = dataGen.generateMetering_Attributes();
        tmp.enterMetering_Attributes(Metering_Attributes);
        tmp.selectTechnical_Parameters_Reading_Unit("Watt");
        Metering_Attributes_Decimals = dataGen.generateMetering_Attributes_Decimals();
       tmp.enterMetering_Attribute_Decimals (String.valueOf(Metering_Attributes_Decimals));
    }

    @Then("User verify if the Metering Attributes is created")
    public void user_verify_Metering_Attributes_creation() {
        tmp.verifyAddMetering_Attributes(Metering_Attributes);
    }

    @Then("User clicks on first available Metering Attributes to edit")
    public void user_clicks_on_first_available_Metering_Attributes_to_edit() {
        tmp.clickMetering_Attributes_toEdit();
    }

    @And("User updates the Metering Attributes details")
    public void user_Updates_Metering_Attributes_details() throws IOException {
        Update_Metering_Attributes = dataGen.generateMetering_Attributes();
        tmp.Update_Metering_Attributes(Update_Metering_Attributes);
    }

    @Then("User verify if the Metering Attributes is updated")
    public void user_verify_the_success_message_after_updating_Metering_Attributes() {
        tmp.verifyUpdateMetering_Attributes(Update_Metering_Attributes);
    }

    @Then("User clicks on first available Metering Attributes to delete")
    public void user_clicks_on_first_available_Metering_Attributes_to_delete() {
        tmp.clickMetering_Attributes_ToDelete();
    }

    //  Metering Parameters
//    @Then("User fills the Metering Parameters details")
//    public void user_Add_Metering_Parameters_details() throws IOException {
//        Metering_Parameters = dataGen.generateMetering_Parameters();
//        tmp.enterMetering_Parameters(Metering_Parameters);
//        tmp.selectTechnical_Parameters_Reading_Unit("Watt");
//        Metering_Attributes_Decimals = dataGen.generateMetering_Attributes_Decimals();
//        tmp.enterMetering_Attribute_Decimals (String.valueOf(Metering_Attributes_Decimals));
//    }
//
//    @Then("User verify if the Metering Parameters is created")
//    public void user_verify_Metering_Parameters_creation() {
//        tmp.verifyAddMetering_Parameters(Metering_Parameters);
//    }
//
//    @Then("User clicks on first available Metering Parameters to edit")
//    public void user_clicks_on_first_available_Metering_Parameters_to_edit() {
//        tmp.clickMetering_Parameters_toEdit();
//    }
//
//    @And("User updates the Metering Parameters details")
//    public void user_Updates_Metering_Parameters_details() throws IOException {
//        Update_Metering_Parameters = dataGen.generateMetering_Parameters();
//        tmp.Update_Metering_Parameters(Update_Metering_Parameters);
//    }
//
//    @Then("User verify if the Metering Parameters is updated")
//    public void user_verify_the_success_message_after_updating_Metering_Parameters() {
//        tmp.verifyUpdateMetering_Parameters(Update_Metering_Parameters);
//    }
//
//    @Then("User clicks on first available Metering Parameters to delete")
//    public void user_clicks_on_first_available_Metering_Parameters_to_delete() {
//        tmp.clickMetering_Parameters_ToDelete();
//    }


    //   Tools_&_Equipments

    @Then("User fills the Tools & Equipments details")
    public void user_Add_Tools_And_Equipments_details() throws IOException {
        Equipment_Name = dataGen.generateTools_And_Equipments();
        tmp.enterEquipment_Name(Equipment_Name);
        Hourly_Charges_AED  = dataGen.generateTools_And_Equipments_Hourly_Charges();
        tmp.enterHourly_Charges_AED (String.valueOf(Hourly_Charges_AED));
        tmp.selectTools_Unit("PKT");

    }

    @Then("User verify if the Tools & Equipments is created")
    public void user_verify_Tools_And_Equipments_creation() {
     tmp.verifyAddTools_And_Equipments(Equipment_Name);
    }

    @Then("User clicks on first available Tools & Equipments to edit")
    public void user_clicks_on_first_available_Tools_And_Equipments_to_edit() {
        tmp.clickTools_And_Equipments_toEdit();
    }

    @And("User updates the Tools & Equipments details")
    public void user_Updates_Tools_And_Equipments_details() throws IOException {
        Update_Equipment_Name = dataGen.generateTools_And_Equipments();
        tmp.Update_Tools_And_Equipments(Update_Equipment_Name);
    }

    @Then("User verify if the Tools & Equipments is updated")
    public void user_verify_the_success_message_after_updating_Tools_And_Equipments() {
        tmp.verifyUpdateTools_And_Equipments(Update_Equipment_Name);
    }

    @Then("User clicks on first available Tools & Equipments to delete")
    public void user_clicks_on_first_available_Tools_And_Equipments_to_delete() {
        tmp.clickTools_And_Equipments_ToDelete();
    }
}
