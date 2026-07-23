package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import pages.InventoryManagementPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;

public class InventoryManagementSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    //HelperUtils helperUtils = new HelperUtils(driver);
    InventoryManagementPage tmp = new InventoryManagementPage(driver);
    //ElementUtils elementUtils= new ElementUtils(driver);
    public static String generateItemName;
    public static String generateStoreName;
    public static String generateStoreLocationDetails;
    @Then("User clicks on Inventory Management {string} in side menu")
    public void user_click_on_InventoryManagement(String title) throws InterruptedException {
        String id = "7";
        tmp.MenuInventoryManagement(id);
    }
    @Then("User Clicks on Inventory Management Supplier {string} in side menu")
    public void user_click_on_InvMgmtSupplier(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Inventory']/div[2]/div/ul[1]/li[2]/a";
        tmp.SupplierClick(xpath);
    }
    @Then("User Clicks on Include Inactive Supplier Checkbox")
    public void user_click_on_InclInactiveSupplier() throws InterruptedException {
        String id = "ContentPlaceHolder1_chkInactive";
        tmp.InclInactiveSupplier();
    }
    @Then("User Clicks on Inventory Management Supplier grid {string}")
    public void user_click_on_InventoryManagementSuppliergridPagination(String GrdSupplierPagination) throws InterruptedException {
        tmp.GrdSupplierPagination(GrdSupplierPagination);
    }
    //No of data per page
    @Then("User clicks the Inventory Management Supplier no of data per page {int} in the grid")
    public void user_click_on_InventoryManagementSuppliergridDataPerPage(int GrdSupplierDataPerPage) throws InterruptedException {
        tmp.validatePageSizeGrdSupplier(GrdSupplierDataPerPage);
    }
    @Then("User Clicks Add Supplier Button {string}" )
    public void user_click_on_AddSupplier(String title) throws InterruptedException {
        tmp.AddSupplier();
    }
    @Then("User enters the Supplier Details in the Supplier Pop up")
    public void userFillsSupplierDetails() {
        tmp.enterSupplierName(dataGen.generateCustomerName());
        tmp.enterSupplierEmail(dataGen.generateCustEmail());
        tmp.enterSupplierMobile(dataGen.generateCustMobile());
        tmp.selectSupplierType("Supplier");
    }
    @Then("User clicks the Supplier Save button")
    public void user_click_on_SupplierSaveButton() {
        tmp.ClickSupplierSave();
    }
    @Then("User clicks the first active Supplier to Edit")
    public void user_clicks_on_first_active_Supplier_to_edit() {
        tmp.clickActiveSuppliertoEdit();
    }
    @Then("User clicks the Edit Supplier Button")
    public void user_click_on_SupplierEditButton() {
        tmp.ClickSupplierEdit();
    }
    @Then("User clicks the DeActivate Supplier Button")
    public void user_click_on_SupplierDeactivateButton() {
        tmp.ClickSupplierDeactivate();
    }
    @Then("User clicks the DeActivate Supplier Yes Button")
    public void user_click_on_SupplierDeactivateYesButton() {
        tmp.ClickSupplierDeactivateYes();
    }
    @Then("User clicks EmailDomain section")
    public void user_click_on_SupplierEmailDomainSection() {
        tmp.ClickSupplierEmailDomainSection();
    }
    @Then("USer Clicks the Add Email Domain Button")
    public void user_click_on_SupplierEmailDomainAdd() {
        tmp.ClickSupplierEmailDomainAdd();
    }
    @Then("User Enters Email Domain Name")
    public void user_click_on_EmailDomainDetail() {
        tmp.enterSupplierEmailDomainDetail(dataGen.generateCustEmail());
    }
    @Then("User clicks Add Email Domain Save Button")
    public void user_click_on_SupplierEmailDomainSave() {
        tmp.ClickSupplierEmailDomainSave();
    }
    //Item Definition
    @Then("User Clicks on Inventory Management Item Definition {string} in side menu")
    public void user_click_on_InvMgmtItemDefinition(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Inventory']/div[2]/div/ul[1]/li[3]/a";
        tmp.ItemDefinition(xpath);
    }
    @Then("User clicks Inventory Management Item Definition Add {string} Button")
    public void user_click_on_InvMgmtItemDefinitionAddClick(String title) throws InterruptedException {
        String id = "ctl00_ContentPlaceHolder1_RadAddItem";
        tmp.ItemDefinitionAddButtonClick(id);
    }
    @When("User select the Item Type {string} from Item Type dropdown")
    public void user_select_the_ItemDefItemType_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomItemDefItemType_Dropdown();
        }
    }
    @When("User select the Item Category {string} from Item Category dropdown")
    public void user_select_the_ItemDefItemCategory_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomItemDefItemcategory_Dropdown();
        }
    }
    @When("User select the Item SubCategory {string} from Item SubCategory dropdown")
    public void user_select_the_ItemDefItemSubCategory_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomItemDefItemSubcategory_Dropdown();
        }
    }
    @When("User select the Issuing Unit {string} from Issuing Unit dropdown")
    public void user_select_the_ItemDefIssuingUnit_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomItemDefIssuingUnit_Dropdown();
        }
    }
    @When("User select the Default Receiving Unit {string} from Default Receiving dropdown")
    public void user_select_the_ItemDefReceivingUnit_Dropdown(String value) throws InterruptedException {
        if(value == null || value.isEmpty()){
            tmp.getRandomItemDefReceivingUnit_Dropdown();
        }
    }
    @When("User enters the Item Name Item definition details {string}")
    public void user_click_on_ItemDefinitionItemName(String ItemDefinitionItemName) throws InterruptedException {
        //tmp.ItemDefinitionItemName(ItemDefinitionItemName);
        generateItemName = dataGen.generateItemName();
        tmp.generateItemName(generateItemName);
        tmp.ItemDefItemType("rk 1106202 upd");
        tmp.ItemDefItemCategory("11062026RK ICC upd");
        tmp.ItemDefItemSubCategory("11062026RK Item SubCategory upd");
        tmp.ItemDefIssuingUnit("rk1506 Unit Name  upd");
        tmp.ItemDefReceivingUnit("rk1506 Unit Name  upd");
    }
    @When("User clicks the Save button")
    public void user_click_on_ItemDefinitionSave() {
        tmp.ItemDefinitionSave();
    }
    @Then("User clicks Active Item Definition")
    public void user_clicks_on_first_active_Item_def_to_edit() {
        tmp.clickActiveItemDefinitiontoEdit();
    }
    @Then("User clicks Item Definition Edit")
    public void user_clicks_on_first_active_Item_def_edit_Button() {
        tmp.clickActiveItemDefinitiontoEditButton();
    }
    @When("User enters the Item definition details EDIT {string}")
    public void user_click_on_ItemDefinitionEdit(String ItemDefinitionItemName) throws InterruptedException {
        tmp.ItemDefItemType("rk 1106202 upd");
        tmp.ItemDefIssuingUnit("rk1506 Unit Name  upd");
        tmp.ItemDefReceivingUnit("rk1506 Unit Name  upd");
    }
    @Then("User clicks Item Definition Edit Update Button Click {string}")
    public void user_clicks_on_ItemDefUpdateButtonClick(String ItemDefinitionUpdate) throws InterruptedException {
        tmp.ItemDefUpdateButtonClick();
    }
    //Store
    @Then("User Clicks on Inventory Management Store {string} in side menu")
    public void user_click_on_InvMgmtStoreMenu(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Inventory']/div[2]/div/ul[1]/li[4]/a";
        tmp.InvMgmtStoreMenu(xpath);
    }
    @Then("User clicks Inventory Management Add Store button {string}")
    public void user_clicks_on_AddStoreButton(String AddStore) throws InterruptedException {
        tmp.clickAddStoreButton(AddStore);
    }
    @When("User enters details in Store pop up {string}")
    public void user_click_on_StorepopUpDetails(String StorepopUpDetails) throws InterruptedException {
        generateStoreName = dataGen.generateStoreGroup();
        tmp.generateStoreName(generateStoreName);
        tmp.StoreGroup("rk 1703 up");
        tmp.StoreType("Central Store");
        tmp.OwnerType("Own");
        generateStoreLocationDetails = dataGen.generateStoreLocationDetails();
        tmp.generateStoreLocationDetails(generateStoreLocationDetails);
    }

}
