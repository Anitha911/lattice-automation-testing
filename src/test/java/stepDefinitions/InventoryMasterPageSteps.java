package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InventoryMasterPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;

public class InventoryMasterPageSteps {
        private final WebDriver driver = DriverFactory.getDriver();
        InventoryMasterPage tmp = new InventoryMasterPage(driver);
        TestDataGenerator dataGen = new TestDataGenerator();
        public static String generateItemType;
        public static String generateItemTypeName;
        public static String generateItemCatCde;
        public static String generateItemCatName;
        public static String generateItemSubCatCde;
        public static String generateItemSubCatName;
        public static String generateConvFactor;
        public static String generateStoreGroup;
        public static String generateUOMCode;
        public static String generateUOMName;
        public static String generateSupplierType;
        public static String generateActionReason;
        public static String generateActionReasonDesc;
        HelperUtils helperUtils = new HelperUtils(driver);


    @Then("User clicks on Inventory {string} in side menu")
    public void user_click_on_DataConfig(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//a[contains(@class,'nav-link active') and @id='10']";
        String id = "10";
        tmp.clickOnDataConfiguration(id);
    }
    @Then("User clicks on the additional masters Inventory {string} tab")
    public void user_click_on_additional_masters_Inventory(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//*[@id='tab-datasetup']/div[2]/div/ul[2]/li[4]/a";
        tmp.clickOnadditionalmastersInventory(xpath);
    }
    @Then("User clicks on button Item Type add {string}")
    public void user_click_on_Item_TypesAdd(String btnAddItemTypes) throws InterruptedException {
        tmp.clickOnAddItemTypes(btnAddItemTypes);
    }
    @Then("User fills up the {string} Item Type details")
    public void user_fills_up_the_ItemType(String type) throws IOException {
        generateItemType = dataGen.generateItemTypeCode();
        tmp.enterItemTypeCDE(generateItemType);
        generateItemTypeName = dataGen.generateItemTypeCodeName();
        tmp.enterItemTypename(generateItemTypeName);
        }
    @Then("User clicks on Item Type save button")
    public void userClicksOnItemTypeSaveButton() {
        tmp.userClicksOnItemTypeSaveButton();
    }
    @Then ("User verify if the Item Type is created")
    public void userVerifyIfTheItemTypeIsCreated() throws InterruptedException {
        tmp.verifyItemTypecreation(generateItemType);
    }
    @Then("User clicks on active Item Type in the grid")
    public void user_clicks_on_first_active_Item_Type_to_edit() {
        tmp.clickActiveItemTypetoEdit();
    }
    @Then("User clicks on active Item Type in the grid to delete")
    public void user_clicks_on_first_active_Item_Type_to_delete() {
        tmp.clickActiveItemTypetoDelete();
    }
    @Then("User verify if the Item Type is deleted")
    public void user_Verify_first_active_Item_type_to_delete() {
        tmp.verifyItemTypeDelete(generateItemType);
    }
    @Then ("User clicks on Inventory Item Type Export to Excel button")
    public void user_clicks_on_item_type_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.ItemTypeclickExportToExcel(xpath);
    }
    //Item Category
    @Then ("User clicks on the Inventory master Item Category {string} in side menu")
    public void user_click_on_Item_Cat(String title) throws InterruptedException {
        String xpath = "//*[@id='form1']/div[5]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[2]";
        tmp.clickOnItemCategory(xpath);
    }
    @Then("User clicks on button Item Category add {string}")
    public void user_click_on_Item_CategoryAdd(String btnAddItemCategory) throws InterruptedException {
        tmp.clickOnAddItemCategory(btnAddItemCategory);
    }
    @Then("User fills up the {string} Item Category details")
    public void user_fills_up_ItemCategory(String type) throws IOException {
        generateItemCatCde = dataGen.generateItemCategoryCode();
        tmp.enterItemCatCDE(generateItemCatCde);
        generateItemCatName = dataGen.generateItemCategoryCodeName();
        tmp.enterItemCatname(generateItemCatName);
    }
    @Then("User clicks on Item Category save button")
    public void userClicksOnItemCatSaveButton() {
        tmp.userClicksOnItemCatSaveButton();
    }
    @Then ("User verify if the Item Category is created")
    public void userVerifyIfTheItemCatIsCreated() throws InterruptedException {
        tmp.verifyItemCatcreation(generateItemCatCde);
    }
    @Then("User clicks on active Item Category in the grid")
    public void user_clicks_on_first_active_Item_Cat_to_edit() {
        tmp.clickActiveItemCattoEdit();
    }
    @Then("User clicks on active Item Category in the grid to delete")
    public void user_clicks_on_first_active_Item_Category_to_delete() {
        tmp.clickActiveItemCategorytoDelete();
    }
    @Then("User verify if the Item Category is deleted")
    public void user_Verify_first_active_Item_Category_to_delete() {
        tmp.verifyItemCategoryDelete(generateItemCatCde);
    }
    @Then ("User clicks on Inventory Item Category Export to Excel button")
    public void user_clicks_on_item_category_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.ItemCategoryclickExportToExcel(xpath);
    }
   //item SubCategory
   @Then ("User clicks on the Inventory master Item SubCategory {string} in side menu")
   public void user_click_on_Item_SubCat(String title) throws InterruptedException {
       String xpath = "//*[@id='form1']/div[5]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[3]";
       tmp.clickOnItemSubCategory(xpath);
   }
    @Then("User clicks on button Item SubCategory add {string}")
    public void user_click_on_Item_SubCategoryAdd(String btnAddItemSubCategory) throws InterruptedException {
        tmp.clickOnAddItemSubCategory(btnAddItemSubCategory);
    }
    @Then("User fills up the {string} Item SubCategory details")
    public void user_fills_up_ItemSubCategory(String type) throws IOException {
        tmp.selectItemCategory("FIRE");
        generateItemSubCatCde = dataGen.generateItemSubCategoryCode();
        tmp.enterItemSubCatCDE(generateItemSubCatCde);
        generateItemSubCatName = dataGen.generateItemSubCategoryCodeName();
        tmp.enterItemSubCatname(generateItemSubCatName);
    }
    @Then("User clicks on Item SubCategory save button")
    public void userClicksOnItemSubCatSaveButton() {
        tmp.userClicksOnItemSubCatSaveButton();
    }
    @Then ("User verify if the Item SubCategory is created")
    public void userVerifyIfTheItemSubCatIsCreated() throws InterruptedException {
        tmp.verifyItemSubCatcreation(generateItemSubCatCde);
    }
    @Then("User clicks on active Item SubCategory in the grid")
    public void user_clicks_on_first_active_Item_SubCat_to_edit() {
        tmp.clickActiveItemSubCattoEdit();
    }
    @Then("User clicks on active Item SubCategory in the grid to delete")
    public void user_clicks_on_first_active_Item_SubCategory_to_delete() {
        tmp.clickActiveItemSubCategorytoDelete();
    }
    @Then("User verify if the Item SubCategory is deleted")
    public void user_Verify_first_active_Item_SubCategory_to_delete() {
        tmp.verifyItemSubCategoryDelete(generateItemSubCatCde);
    }
    @Then ("User clicks on Inventory Item SubCategory Export to Excel button")
    public void user_clicks_on_item_Subcategory_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.ItemclickExportToExcel(xpath);
    }
    //Unit Conversion
    @Then ("User clicks on the Inventory master Unit Conversion {string} in side menu")
    public void user_click_on_UnitConversion(String title) throws InterruptedException {
        String xpath = "//*[@id='form1']/div[5]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[4]";
        tmp.clickOnUnitConversion(xpath);
    }
    @Then("User clicks on button Unit Conversion add {string}")
    public void user_click_on_UCAdd(String btnAddUC) throws InterruptedException {
        tmp.clickOnAddUC(btnAddUC);
    }
    @Then("User fills up the {string} Unit Conversion details")
    public void user_fills_up_UC(String type) throws IOException {
        tmp.selectFromUnit("CYL");
        tmp.selectToUnit("CYL");
        generateConvFactor = dataGen.generateConvFactor();
        tmp.enterConvFactor(generateConvFactor);
    }
    @Then("User clicks on Unit Conversion save button")
    public void userClicksOnUCSaveButton() {
        tmp.userClicksOnUCSaveButton();
    }
    @Then ("User verify if the Unit Conversion is created")
    public void userVerifyIfUCIsCreated() throws InterruptedException {
        tmp.verifyUCcreation(generateConvFactor);
    }
    @Then("User clicks on active Unit Conversion in the grid")
    public void user_clicks_on_first_active_UC_to_edit() {
        tmp.clickActiveUCtoEdit();
    }
    @Then("User clicks on active Unit Conversion in the grid to delete")
    public void user_clicks_on_first_active_UC_to_delete() {
        tmp.clickActiveUCtoDelete();
    }
    @Then("User verify if the Unit Conversion is deleted")
    public void user_Verify_first_active_UC_to_delete() {
        tmp.verifyUCDelete(generateConvFactor);
    }
    @Then ("User clicks on Inventory Export to Excel button")
    public void user_clicks_on_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.ItemclickExportToExcel(xpath);
    }
    //Store Group
    @Then ("User clicks on the Inventory master Store Group {string} in side menu")
    public void user_click_on_Store_Group(String title) throws InterruptedException {
        String xpath = "//*[@id='form1']/div[5]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[1]/div/a[5]";
        tmp.clickOnStoreGroup(xpath);
    }
    @Then("User clicks on button Store Group add {string}")
    public void user_click_on_SGAdd(String btnAddSG) throws InterruptedException {
        tmp.clickOnAddStoreGroup(btnAddSG);
    }
    @Then("User fills up the {string} Store Group details")
    public void user_fills_up_SG(String type) throws IOException {
        generateStoreGroup = dataGen.generateStoreGroup();
        tmp.enterStoreGroup(generateStoreGroup);
    }
    @Then("User clicks on Store Group save button")
    public void userClicksOnSGSaveButton() {
        tmp.userClicksOnSGSaveButton();
    }
    @Then ("User verify if the Store Group is created")
    public void userVerifyIfSGIsCreated() throws InterruptedException {
        tmp.verifySGcreation(generateStoreGroup);
    }
    @Then("User clicks on active Store Group in the grid")
    public void user_clicks_on_first_active_SG_to_edit() {
        tmp.clickActiveSGtoEdit();
    }
    @Then("User clicks on active Store Group in the grid to delete")
    public void user_clicks_on_first_active_SG_to_delete() {
        tmp.clickActiveSGtoDelete();
    }
    @Then("User verify if the Store Group is deleted")
    public void user_Verify_first_active_SG_to_delete() {
        tmp.verifySGDelete(generateStoreGroup);
    }
    //UOM
    @Then ("User clicks on the Inventory master UOM {string} in side menu")
    public void user_click_on_Store_UOM(String title) throws InterruptedException {
        //String xpath = "//*[@id='form1']/div[6]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/a[1]";
        //String xpath="/html/body/form/div[6]/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/a[1]";
       String xpath="//a[contains(@href,'SubMenuItemsId=30')]";
       tmp.clickOnUOM(xpath);
    }
    @Then("User clicks on button UOM add {string}")
    public void user_click_on_UOMAdd(String btnAddUOM) throws InterruptedException {
        tmp.clickOnAddUOM(btnAddUOM);
    }
    @Then("User fills up the {string} UOM details")
    public void user_fills_up_UOM(String type) throws IOException {
        generateUOMCode = dataGen.generateUOMCode();
        tmp.enterUOMCode(generateUOMCode);
        generateUOMName = dataGen.generateUOMName();
        tmp.enterUOMName(generateUOMName);
    }
    @Then("User clicks on UOM save button")
    public void userClicksOnUOMSaveButton() {
        tmp.userClicksOnUOMSaveButton();
    }
    @Then ("User verify if the UOM is created")
    public void userVerifyIfUOMIsCreated() throws InterruptedException {
        tmp.verifyUOMcreation(generateUOMCode);
    }
    @Then("User clicks on active UOM in the grid")
    public void user_clicks_on_first_active_UOM_to_edit() {
        tmp.clickActiveUOMtoEdit();
    }
    @Then("User clicks on active UOM in the grid to delete")
    public void user_clicks_on_first_active_UOM_to_delete() {
        tmp.clickActiveUOMtoDelete();
    }
    @Then("User verify if the UOM is deleted")
    public void user_Verify_first_active_UOM_to_delete() {
        tmp.verifyUOMDelete(generateUOMCode);
    }
    //Supplier Type
    @Then ("User clicks on the Inventory master Supplier Type {string} in side menu")
    public void user_click_on_Supplier_Type(String title) throws InterruptedException {
        String xpath="//a[contains(@href,'SubMenuItemsId=35')]";
        tmp.clickOnSupplierType(xpath);
    }
    @Then("User clicks on button Supplier Type add {string}")
    public void user_click_on_SupplierTypeAdd(String btnAddSupplierType) throws InterruptedException {
        tmp.clickOnAddSupplierType(btnAddSupplierType);
    }
    @Then("User fills up the {string} Supplier Type details")
    public void user_fills_up_SupplierType(String type) throws IOException {
        generateSupplierType = dataGen.generateSupplierType();
        tmp.enterSupplierType(generateSupplierType);
    }
    @Then("User clicks on Supplier Type save button")
    public void userClicksOnSupplierTypeSaveButton() {
        tmp.userClicksOnSupplierTypeSaveButton();
    }
    @Then ("User verify if the Supplier Type is created")
    public void userVerifyIfSupplierTypeIsCreated() throws InterruptedException {
        tmp.verifySupplierTypecreation(generateSupplierType);
    }
    @Then("User clicks on active Supplier Type in the grid")
    public void user_clicks_on_first_active_ST_to_edit() {
        tmp.clickActiveSTtoEdit();
    }
    @Then("User clicks on active Supplier Type in the grid to delete")
    public void user_clicks_on_first_active_ST_to_delete() {
        tmp.clickActiveSTtoDelete();
    }
    @Then("User verify if the Supplier Type is deleted")
    public void user_Verify_first_active_ST_to_delete() {
        tmp.verifySTDelete(generateSupplierType);
    }
    //Action Reasons
    @Then ("User clicks on the Inventory master Action Reasons {string} in side menu")
    public void user_click_on_Action_Reasons(String title) throws InterruptedException {
        String xpath="//a[contains(@href,'SubMenuItemsId=94')]";
        tmp.clickOnActionReasons(xpath);
    }
    @Then("User clicks on button Action Reasons add {string}")
    public void user_click_on_ActionReason(String btnAddActionReasons) throws InterruptedException {
        tmp.clickOnAddActionReasons(btnAddActionReasons);
    }
    @Then("User fills up the {string} Action Reasons details")
    public void user_fills_up_AR(String type) throws IOException {
        tmp.selectReasonType("Purchase Return Reason");
        generateActionReason = dataGen.generateActionReason();
        tmp.enterActionReason(generateActionReason);
        generateActionReasonDesc = dataGen.generateActionReasondesc();
        tmp.enterActionReasonDesc(generateActionReasonDesc);
    }
    @Then("User clicks on Action Reasons save button")
    public void userClicksOnARSaveButton() {
        tmp.userClicksOnARSaveButton();
    }
    @Then ("User verify if the Action Reasons is created")
    public void userVerifyIfARIsCreated() throws InterruptedException {
        tmp.verifyARcreation(generateActionReason);
    }
    @Then("User clicks on active Action Reasons in the grid")
    public void user_clicks_on_first_active_AR_to_edit() {
        tmp.clickActiveATtoEdit();
    }
    @Then("User clicks on active Action Reasons in the grid to delete")
    public void user_clicks_on_first_active_AR_to_delete() {
        tmp.clickActiveARtoDelete();
    }
    @Then("User verify if the Action Reasons is deleted")
    public void user_Verify_first_active_AR_to_delete() {
        tmp.verifyARDelete(generateActionReason);
    }

    //Negative Scenarios
    @When("user verify the chars min len as {int} and max len as {int} on Item Type Code")
    public void user_verify_chars_len_InvItemTypeCde(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtItemTypeCode"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Item Type Name")
    public void user_verify_chars_len_InvItemTypeName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtItemTypeName"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Inventory Item Type")
    public void userVerifyInlineErrorMessageOnInvItemCde(String expectedErrorMessage) {
        By InvItemCdeErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinItemType_C_RequiredFieldValidator4");
        helperUtils.verifyInlineErrorMessage(InvItemCdeErrorLocator, expectedErrorMessage);
    }
    @When("user verify the inline error message {string} on Inventory Item Name")
    public void userVerifyInlineErrorMessageOnInvItemName(String expectedErrorMessage) {
        By InvItemNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinItemType_C_RequiredFieldValidator5");
        helperUtils.verifyInlineErrorMessage(InvItemNameErrorLocator, expectedErrorMessage);
    }

    @When("user verify the chars min len as {int} and max len as {int} on Item Category Code")
    public void user_verify_chars_len_InvItemCatCde(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtCategoryCode"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Item Category Name")
    public void user_verify_chars_len_InvItemCatName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtCategoryName"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Inventory Item Category Code")
    public void userVerifyInlineErrorMessageOnInvItemCatCde(String expectedErrorMessage) {
        By InvItemCatCdeErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinItemCategory_C_RequiredFieldValidator6");
        helperUtils.verifyInlineErrorMessage(InvItemCatCdeErrorLocator, expectedErrorMessage);
    }
    @When("user verify the inline error message {string} on Inventory Item Category Name")
    public void userVerifyInlineErrorMessageOnInvItemCatName(String expectedErrorMessage) {
        By InvItemCatNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinItemCategory_C_RequiredFieldValidator7");
        helperUtils.verifyInlineErrorMessage(InvItemCatNameErrorLocator, expectedErrorMessage);
    }


    @When("user verify the chars min len as {int} and max len as {int} on Item SubCategory Code")
    public void user_verify_chars_len_InvItemSubCatCde(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtSubCategoryCode"),maxLen, minLen);
    }
    @When("user verify the chars min len as {int} and max len as {int} on Item SubCategory Name")
    public void user_verify_chars_len_InvItemSubCatName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtSubCategoryName"),maxLen, minLen);
    }
    @When("user verify the inline error message {string} on Inventory Item Category")
    public void userVerifyInlineErrorMessageOnInvItemCat(String expectedErrorMessage) {
        By InvItemCatErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinItemSubCategory_C_RequiredFieldValidator10");
        helperUtils.verifyInlineErrorMessage(InvItemCatErrorLocator, expectedErrorMessage);
    }
    @When("user verify the inline error message {string} on Inventory Item SubCategory Code")
    public void userVerifyInlineErrorMessageOnInvItemSubCatCde(String expectedErrorMessage) {
        By InvItemCatSubCdeErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinItemSubCategory_C_RequiredFieldValidator8");
        helperUtils.verifyInlineErrorMessage(InvItemCatSubCdeErrorLocator, expectedErrorMessage);
    }
    @When("user verify the inline error message {string} on Inventory Item SubCategory Name")
    public void userVerifyInlineErrorMessageOnInvItemSubCatName(String expectedErrorMessage) {
        By InvItemSubCatNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinItemSubCategory_C_RequiredFieldValidator9");
        helperUtils.verifyInlineErrorMessage(InvItemSubCatNameErrorLocator, expectedErrorMessage);
    }


    //Negative Scenarios
}
