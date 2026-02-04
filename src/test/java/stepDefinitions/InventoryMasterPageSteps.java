package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.InventoryMasterPage;
import utils.DriverFactory;
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
}
