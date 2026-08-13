package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.EssentialServicesMastersPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;

public class EssentialServicesMastersSteps {
    public static String Regulatory_Body;
    public static String Update_Regulatory_Body;
    public static String Connectivity_Category;
    public static String Update_Connectivity_Category;
    public static String Connectivity;
    public static String Update_Connectivity;
    public static String Building_Category;
    public static String Update_Building_Category;
    public static String Structure_Type;
    public static String Update_Structure_Type;
    public static String Building_Type;
    public static String Update_Building_Type;
    public static String SP_Classification;
    public static String Update_SP_Classification;
    public static String Violation_Type;
    public static String Update_Violation_Type;

    private final WebDriver driver = DriverFactory.getDriver();
    EssentialServicesMastersPage tmp = new EssentialServicesMastersPage(driver);
    HelperUtils helperUtils = new HelperUtils(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

//    Essential Services - Section Method
    @Then("User clicks on {string} section in Essential Services")
    public void userclicksonsectioninEssentialServices(String sectionName) {
        tmp.MasterClickOnEssentialServicesSectionByTitleName(sectionName);
    }

//    Essential Services - Save
    @And("User clicks on Master Essential Services Save button")
    public void user_clicks_on_button_Master_Essential_Services_save() {
        tmp.MasterClickMasterEssentiaLServicesSaveButton();
    }

 //    Essential Services - RegulatoryBody
    @Then("User fills the Regulatory Body details")
    public void user_Add_Regulatory_Body_details()  {
        Regulatory_Body = dataGen.generateRegulatoryBody();
        String Description = dataGen.generateRegulatoryBodyDescription();
        tmp.MasterEssentialServiceEnterRegulatoryBody(Regulatory_Body);
        tmp.MasterEssentialServiceEnterRegulatoryBodyDescription(Description);
    }

    @Then("User verify if the Regulatory Body is created")
    public void user_verify_Regulatory_Body_creation() {
        tmp.MasterEssentialServiceVerifyAddRegulatoryBody(Regulatory_Body);
    }

    @Then("User clicks on first available Regulatory Body to edit")
    public void user_clicks_on_first_available_Regulatory_Body_to_edit() {
        tmp.MasterEssentialServiceClickRegulatoryBodytoEdit();
    }

    @And("User updates the Regulatory Body details")
    public void user_Updates_Regulatory_Body_details()  {
        Update_Regulatory_Body = dataGen.generateRegulatoryBody();
        tmp.MasterEssentialServiceUpdateRegulatoryBody(Update_Regulatory_Body);
        String Update_Regulatory_Body_Description = dataGen.generateRegulatoryBodyDescription();
        tmp.MasterEssentialServiceUpdateRegulatoryBodyDescription(Update_Regulatory_Body_Description);
    }

    @Then("User verify if the Regulatory Body is updated")
    public void user_verify_the_success_message_after_updating_Regulatory_Body() {
        tmp.MasterEssentialServiceVerifyUpdateRegulatoryBody(Update_Regulatory_Body);
    }

    @Then("User clicks on first available Regulatory Body to delete")
    public void user_clicks_on_first_available_Regulatory_Body_to_delete() {
        tmp.MasterEssentialServiceClickRegulatoryBodyToDelete();
    }

//    Connectivity Category - Add , Update And Delete
    @Then("User fills the Connectivity Category details")
    public void user_Add_Connectivity_Category_details()  {
        Connectivity_Category = dataGen.generateConnectivityCategory();
        tmp.MasterEssentialServiceEnterConnectivityCategory(Connectivity_Category);
    }

    @Then("User verify if the Connectivity Category is created")
    public void user_verify_Connectivity_Category_creation() {
        tmp.MasterEssentialServiceVerifyAddConnectivityCategory(Connectivity_Category);
    }

    @Then("User clicks on first available Connectivity Category to edit")
    public void user_clicks_on_first_available_Connectivity_Category_to_edit() {
        tmp.MasterEssentialServiceClickConnectivityCategorytoEdit();
    }

    @And("User updates the Connectivity Category details")
    public void user_Updates_Connectivity_Category_details() {
        Update_Connectivity_Category = dataGen.generateConnectivityCategory();
        tmp.MasterEssentialServiceUpdateConnectivityCategory(Update_Connectivity_Category);
    }

    @Then("User verify if the Connectivity Category is updated")
    public void user_verify_the_success_message_after_updating_Connectivity_Category() {
        tmp.MasterEssentialServiceVerifyUpdateConnectivityCategory(Update_Connectivity_Category);
    }

    @Then("User clicks on first available Connectivity Category to delete")
    public void user_clicks_on_first_available_Connectivity_Category_to_delete() {
        tmp.MasterEssentialServiceClickConnectivityCategoryToDelete();
    }

    //    Connectivity - Add , Update And Delete
    @Then("User fills the Connectivity details")
    public void user_Add_Connectivity_details()  {
        tmp.MasterEssentialServiceSelectConnectivityCategoryRandom();
        Connectivity = dataGen.generateConnectivity();
        tmp.MasterEssentialServiceEnterConnectivity(Connectivity);
    }

    @Then("User verify if the Connectivity is created")
    public void user_verify_Connectivity_creation() {
        tmp.MasterEssentialServiceVerifyAddConnectivity(Connectivity);
    }

    @Then("User clicks on first available Connectivity to edit")
    public void user_clicks_on_first_available_Connectivity_to_edit() {
        tmp.MasterEssentialServiceClickConnectivitytoEdit();
    }

    @And("User updates the Connectivity details")
    public void user_Updates_Connectivity_details() {
        Update_Connectivity = dataGen.generateConnectivity();
        tmp.MasterEssentialServiceUpdateConnectivity(Update_Connectivity);
    }

    @Then("User verify if the Connectivity is updated")
    public void user_verify_the_success_message_after_updating_Connectivity() {
        tmp.MasterEssentialServiceVerifyUpdateConnectivity(Update_Connectivity);
    }

    @Then("User clicks on first available Connectivity to delete")
    public void user_clicks_on_first_available_Connectivity_to_delete() {
        tmp.MasterEssentialServiceClickConnectivityToDelete();
    }

    //    Building Category - Add , Update And Delete
    @Then("User fills the Building Category details")
    public void user_Add_Building_Category_details() {
        Building_Category = dataGen.generateBuildingCategory();
        tmp.MasterEssentialServiceEnterBuildingCategory(Building_Category);
    }

    @Then("User verify if the Building Category is created")
    public void user_verify_Building_Category_creation() {
        tmp.MasterEssentialServiceVerifyAddBuildingCategory(Building_Category);
    }

    @Then("User clicks on first available Building Category to edit")
    public void user_clicks_on_first_available_Building_Category_to_edit() {
        tmp.MasterEssentialServiceClickBuildingCategorytoEdit();
    }

    @And("User updates the Building Category details")
    public void user_Updates_Building_Category_details() {
        Update_Building_Category = dataGen.generateBuildingCategory();
        tmp.MasterEssentialServiceUpdateBuildingCategory(Update_Building_Category);
    }

    @Then("User verify if the Building Category is updated")
    public void user_verify_the_success_message_after_updating_Building_Category() {
        tmp.MasterEssentialServiceVerifyUpdateBuildingCategory(Update_Building_Category);
    }

    @Then("User clicks on first available Building Category to delete")
    public void user_clicks_on_first_available_Building_Category_to_delete() {
        tmp.MasterEssentialServiceClickBuildingCategoryToDelete();
    }

    //  Structure Type - Add , Update And Delete
    @Then("User fills the Structure Type details")
    public void user_Add_Structure_Type_details() {
        Structure_Type = dataGen.generateStructureType();
        tmp.MasterEssentialServiceEnterStructureType(Structure_Type);
    }

    @Then("User verify if the Structure Type is created")
    public void user_verify_Structure_Type_creation() {
        tmp.MasterEssentialServiceVerifyAddStructureType(Structure_Type);
    }

    @Then("User clicks on first available Structure Type to edit")
    public void user_clicks_on_first_available_Structure_Type_to_edit() {
        tmp.MasterEssentialServiceClickStructureTypetoEdit();
    }

    @And("User updates the Structure Type details")
    public void user_Updates_Structure_Type_details() {
        Update_Structure_Type = dataGen.generateStructureType();
        tmp.MasterEssentialServiceUpdateStructureType(Update_Structure_Type);
    }

    @Then("User verify if the Structure Type is updated")
    public void user_verify_the_success_message_after_updating_Structure_Type() {
        tmp.MasterEssentialServiceVerifyUpdateStructureType(Update_Structure_Type);
    }

    @Then("User clicks on first available Structure Type to delete")
    public void user_clicks_on_first_available_Structure_Type_to_delete() {
        tmp.MasterEssentialServiceClickStructureTypeToDelete();
    }

//   Building Type - Add , Update And Delete
    @Then("User fills the Building Type details")
    public void user_Add_Building_Type_details() {
        Building_Type = dataGen.generateBuildingType();
        tmp.MasterEssentialServiceEnterBuildingType(Building_Type);
    }

    @Then("User verify if the Building Type is created")
    public void user_verify_Building_Type_creation() {
        tmp.MasterEssentialServiceVerifyAddBuildingType(Building_Type);
    }

    @Then("User clicks on first available Building Type to edit")
    public void user_clicks_on_first_available_Building_Type_to_edit() {
        tmp.MasterEssentialServiceClickBuildingTypetoEdit();
    }

    @And("User updates the Building Type details")
    public void user_Updates_Building_Type_details()  {
        Update_Building_Type = dataGen.generateBuildingType();
        tmp.MasterEssentialServiceUpdateBuildingType(Update_Building_Type);
    }

    @Then("User verify if the Building Type is updated")
    public void user_verify_the_success_message_after_updating_Building_Type() {
        tmp.MasterEssentialServiceVerifyUpdateBuildingType(Update_Building_Type);
    }

    @Then("User clicks on first available Building Type to delete")
    public void user_clicks_on_first_available_Building_Type_to_delete() {
        tmp.MasterEssentialServiceClickBuildingTypeToDelete();
    }

    //  SP Classification  - Add , Update And Delete
    @Then("User fills the SP Classification details")
    public void user_Add_SP_Classification_details() {
        SP_Classification = dataGen.generateSPClassification();
        tmp.MasterEssentialServiceEnterSPClassification(SP_Classification);
        tmp.MasterEssentialServiceSelectAllBuildingCategory();
    }

    @Then("User verify if the SP Classification is created")
    public void user_verify_SP_Classification_creation() {
        tmp.MasterEssentialServiceVerifyAddSPClassification(SP_Classification);
    }

    @Then("User clicks on first available SP Classification to edit")
    public void user_clicks_on_first_available_SP_Classification_to_edit() {
        tmp.MasterEssentialServiceClickSPClassificationtoEdit();
    }

    @And("User updates the SP Classification details")
    public void user_Updates_SP_Classification_details() {
        Update_SP_Classification = dataGen.generateSPClassification();
        tmp.MasterEssentialServiceUpdateSPClassification(Update_SP_Classification);
    }

    @Then("User verify if the SP Classification is updated")
    public void user_verify_the_success_message_after_updating_SP_Classification() {
        tmp.MasterEssentialServiceVerifyUpdateSPClassification(Update_SP_Classification);
    }

    @Then("User clicks on first available SP Classification to delete")
    public void user_clicks_on_first_available_SP_Classification_to_delete() {
        tmp.MasterEssentialServiceClickSPClassificationToDelete();
    }

    // Violation Type - Add , Update And Delete
    @Then("User fills the Violation Type details")
    public void user_Add_Violation_Type_details() {
        Violation_Type = dataGen.generateViolationType();
        tmp.MasterEssentialServiceEnterViolationType(Violation_Type);
        tmp.selectServiceGroup("Additional Work");  // selects service + moves to next
        tmp.selectFaultCategory("Additional Code Fault"); // selects fault + moves next
        tmp.selectFaultCode("Civil Works-AW");
        tmp.selectPriority("P3");
        tmp.selectGenerateWoOn("True");
    }

    @Then("User verify if the Violation Type is created")
    public void user_verify_Violation_Type_creation() {
        tmp.MasterEssentialServiceVerifyAddViolationType(Violation_Type);
    }

    @Then("User clicks on first available Violation Type to edit")
    public void user_clicks_on_first_available_Violation_Type_to_edit() {
        tmp.MasterEssentialServiceClickViolationTypetoEdit();
    }

    @And("User updates the Violation Type details")
    public void user_Updates_Violation_Type_details() {
        Update_Violation_Type = dataGen.generateViolationType();
        tmp.MasterEssentialServiceUpdateViolationType(Update_Violation_Type);
    }

    @Then("User verify if the Violation Type is updated")
    public void user_verify_the_success_message_after_updating_Violation_Type() {
        tmp.MasterEssentialServiceVerifyUpdateViolationType(Update_Violation_Type);
    }

    @Then("User clicks on first available Violation Type to delete")
    public void user_clicks_on_first_available_Violation_Type_to_delete() {
        tmp.MasterEssentialServiceClickViolationTypeToDelete();
    }

//    Export to Excel - Essential Service
    @Then("User click on the Master Essential Service Export to Excel button")
    public void user_clicks_on_Master_Essential_Service_Export_to_Excel_button() {
        tmp.MasterEssentialServiceExporttoExcel();
    }

    //    Validation Regulatory Body
    @Then("User verify the inline error message {string} on Regulatory Body field in the Essential Services module")
    public void user_verify_inline_error_message_on_Regulatory_Body_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Regulatory Body field. Expected message: "  + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_Radwin_RegulatoryBody_C_RequiredFieldValidator3");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @When("User verify the chars max len as {int} for Regulatory Body field in the Essential Services module")
    public void user_verify_chars_len_Regulatory_Body_field(int maxLen) {
        System.out.println("Verifying Regulatory Body field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtRegulatoryBody"),maxLen);
        System.out.println("Regulatory Body field length validation verified successfully.");
    }
    @When("User enters special characters in Regulatory Body field in the Essential Services module")
    public void enter_Special_Characters_In_Regulatory_Body_field() {
        System.out.println("Verifying Regulatory Body field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtRegulatoryBody"));
        System.out.println("Special character validation completed for Regulatory Body field");
    }

    // Validation Connectivity Category
    @Then("User verify the inline error message {string} on Connectivity Category field in the Essential Services module")
    public void user_verify_inline_error_message_on_Connectivity_Category_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Connectivity Category field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinConnectivityCategory_C_RequiredFieldValidator16");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @When("User verify the chars max len as {int} for Connectivity Category field in the Essential Services module")
    public void user_verify_chars_len_Connectivity_Category_field(int maxLen) {
        System.out.println("Verifying Connectivity Category field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtConnectionCategory"),maxLen);
        System.out.println("Connectivity Category field length validation verified successfully.");
    }
    @When("User enters special characters in Connectivity Category field in the Essential Services module")
    public void enter_Special_Characters_In_Connectivity_Category_field() {
        System.out.println("Verifying Connectivity Category field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtConnectionCategory"));
        System.out.println("Special character validation completed for Connectivity Category field");
    }

    // Validation Connectivity
    @Then("User verify the inline error message {string} on Connectivity Category field in the Connectivity Essential Services module")
    public void user_verify_inline_error_message_on_Connectivity_Category_field_Connectivity_section(String expectedMessage) {
        System.out.println("Verifying inline error message for Connectivity Category field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinConnectivity_C_RequiredFieldValidator23");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @Then("User verify the inline error message {string} on Connectivity field in the Essential Services module")
    public void user_verify_inline_error_message_on_Connectivity_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Connectivity field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinConnectivity_C_RequiredFieldValidator17");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @When("User verify the chars max len as {int} for Connectivity field in the Essential Services module")
    public void user_verify_chars_len_Connectivity_field(int maxLen) {
        System.out.println("Verifying Connectivity field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtConnectivity"),maxLen);
        System.out.println("Connectivity field length validation verified successfully.");
    }
    @When("User enters special characters in Connectivity field in the Essential Services module")
    public void enter_Special_Characters_In_Connectivity_field() {
        System.out.println("Verifying Connectivity field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtConnectivity"));
        System.out.println("Special character validation completed for Connectivity field");
    }

    // Validation Building Category
    @Then("User verify the inline error message {string} on Building Category field in the Essential Services module")
    public void user_verify_inline_error_message_on_Building_Category_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Building Category field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinBuildingcategory_C_RequiredFieldValidator18");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @When("User verify the chars max len as {int} for Building Category field in the Essential Services module")
    public void user_verify_chars_len_Building_Category_field(int maxLen) {
        System.out.println("Verifying Building Category field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtBuildingCategory"),maxLen);
        System.out.println("Building Category field length validation verified successfully.");
    }
    @When("User enters special characters in Building Category field in the Essential Services module")
    public void enter_Special_Characters_In_Building_Category_field() {
        System.out.println("Verifying Building Category field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtBuildingCategory"));
        System.out.println("Special character validation completed for Building Category field");
    }

    // Validation Structure Type
    @Then("User verify the inline error message {string} on Structure Type field in the Essential Services module")
    public void user_verify_inline_error_message_on_Structure_Type_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Structure Type field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinStructureType_C_RequiredFieldValidator19");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @When("User verify the chars max len as {int} for Structure Type field in the Essential Services module")
    public void user_verify_chars_len_Structure_Type_field(int maxLen) {
        System.out.println("Verifying Structure Type field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtStructureType"),maxLen);
        System.out.println("Structure Type field length validation verified successfully.");
    }
    @When("User enters special characters in Structure Type field in the Essential Services module")
    public void enter_Special_Characters_In_Structure_Type_field() {
        System.out.println("Verifying Structure Type field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtStructureType"));
        System.out.println("Special character validation completed for Structure Type field");
    }

    // Validation Building Type
    @Then("User verify the inline error message {string} on Building Type field in the Essential Services module")
    public void user_verify_inline_error_message_on_Building_Type_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Building Type field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinBuildingType_C_RequiredFieldValidator15");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @When("User verify the chars max len as {int} for Building Type field in the Essential Services module")
    public void user_verify_chars_len_Building_Type_field(int maxLen) {
        System.out.println("Verifying Building Type field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtxBuldingType"),maxLen);
        System.out.println("Building Type field length validation verified successfully.");
    }
    @When("User enters special characters in Building Type field in the Essential Services module")
    public void enter_Special_Characters_In_Building_Type_field() {
        System.out.println("Verifying Building Type field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtxBuldingType"));
        System.out.println("Special character validation completed for Building Type field");
    }

    // Validation SP Classification
    @Then("User verify the inline error message {string} on SP Classification field in the Essential Services module")
    public void user_verify_inline_error_message_on_SP_Classification_field(String expectedMessage) {
        System.out.println("Verifying inline error message for SP Classification field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinSPClassifications_C_RequiredFieldValidator1");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @Then("User verify the inline error message {string} on Building Category field in the SP Classification of Essential Services module")
    public void user_verify_inline_error_message_on_Building_Category_field_in_the_SP_Classification(String expectedMessage) {
        System.out.println("Verifying inline error message for Building Category field in the SP Classification section. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinSPClassifications_C_CustomValidator1");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @When("User verify the chars max len as {int} for SP Classification field in the Essential Services module")
    public void user_verify_chars_len_SP_Classification_field(int maxLen) {
        System.out.println("Verifying SP Classification field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtSpClassification"),maxLen);
        System.out.println("SP Classification field length validation verified successfully.");
    }
    @When("User enters special characters in SP Classification field in the Essential Services module")
    public void enter_Special_Characters_In_SP_Classification_field() {
        System.out.println("Verifying SP Classification field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtSpClassification"));
        System.out.println("Special character validation completed for SP Classification field");
    }

    // Validation Violation Type
    @Then("User verify the inline error message {string} on Question field in the Essential Services module")
    public void user_verify_inline_error_message_on_Question_field(String expectedMessage) {
        System.out.println("Verifying inline error message for Question field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_RequiredFieldValidator4");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @Then("User verify the inline error message {string} on Service Group field in the Essential Services module")
    public void user_verify_inline_error_message_on_Service_Group_field_in_the_Essential_Services(String expectedMessage) {
        System.out.println("Verifying inline error message for Service Group field. Expected message: "+ expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_RequiredFieldValidator5");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @Then("User verify the inline error message {string} on Fault Category field in the Essential Services module")
    public void user_verify_inline_error_message_on_Fault_Category_field_in_the_Essential_Services(String expectedMessage) {
        System.out.println("Verifying inline error message for Fault Category field. Expected message: " + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_RequiredFieldValidator6");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @Then("User verify the inline error message {string} on Fault Code field in the Essential Services module")
    public void user_verify_inline_error_message_on_Fault_Code_field_in_the_Essential_Services(String expectedMessage) {
        System.out.println("Verifying inline error message for Fault Code field. Expected message: " + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_RequiredFieldValidator7");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @Then("User verify the inline error message {string} on Priority field in the Essential Services module")
    public void user_verify_inline_error_message_on_Priority_field_in_the_Essential_Services(String expectedMessage) {
        System.out.println("Verifying inline error message for Priority field. Expected message: " + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_RequiredFieldValidator8");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @Then("User verify the inline error message {string} on Generate Wo On field in the Essential Services module")
    public void user_verify_inline_error_message_on_Generate_Wo_On_field_in_the_Essential_Services(String expectedMessage) {
        System.out.println("Verifying inline error message for Generate Wo On field. Expected message: " + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinViolation_C_RequiredFieldValidator9");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }
    @When("User verify the chars max len as {int} for Question field in the Essential Services module")
    public void user_verify_chars_len_Question_field(int maxLen) {
        System.out.println("Verifying Question field length validation.Expected Max Length: " + maxLen);
        helperUtils.verifyMaxLength(By.id("txtViolatinQuestion"),maxLen);
        System.out.println("Question field length validation verified successfully.");
    }
    @When("User enters special characters in Question field in the Essential Services module")
    public void enter_Special_Characters_In_Question_field() {
        System.out.println("Verifying Question field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("txtViolatinQuestion"));
        System.out.println("Special character validation completed for Question field");
    }

   }
