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
        tmp.clickOnadditionalmastersSales(xpath);
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

}
