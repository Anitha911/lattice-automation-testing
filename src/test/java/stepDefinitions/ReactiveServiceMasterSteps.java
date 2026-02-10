package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InventoryMasterPage;
import pages.ReactiveServiceMasterPage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import java.io.IOException;

public class ReactiveServiceMasterSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    ReactiveServiceMasterPage tmp = new ReactiveServiceMasterPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();
    public static String generateSG;
    public static String generateFC;


    @Then("User clicks on RM {string} in side menu")
    public void user_click_on_DataConfig(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//a[contains(@class,'nav-link active') and @id='10']";
        String id = "10";
        tmp.clickOnDataConfiguration(id);
    }
    @Then("User clicks on the Core masters RM {string} tab")
    public void user_click_on_core_masters_RM(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-datasetup']/div[2]/div/ul[1]/li[7]/a";
        tmp.clickOnCoremastersRM(xpath);
    }
    @Then("User clicks on button Service Group add {string}")
    public void user_click_on_SGAdd(String btnAddSG) throws InterruptedException {
        tmp.clickOnAddSG(btnAddSG);
    }
    @Then("User fills up the {string} Service Group details")
    public void user_fills_up_the_SG(String type) throws IOException {
        generateSG = dataGen.generateSGName();
        tmp.enterSGName(generateSG);
        tmp.selectDepartment("Finance");
    }
    @Then("User clicks on Service Group save button")
    public void userClicksOnSGSaveButton() {
        tmp.userClicksOnSGSaveButton();
    }
    @Then ("User verify if the Service Group is created")
    public void userVerifyIfTheSGIsCreated() throws InterruptedException {
        tmp.verifySGcreation(generateSG);
    }
    @Then("User clicks on active Service Group in the grid")
    public void user_clicks_on_first_active_SG_to_edit() {
        tmp.clickActiveSGtoEdit();
    }
    @Then("User clicks on active Service Group in the grid to delete")
    public void user_clicks_on_first_active_SG_to_delete() {
        tmp.clickActiveSGtoDelete();
    }
    @Then("User verify if the Service Group is deleted")
    public void user_Verify_first_active_SG_to_delete() {
        tmp.verifySGDelete(generateSG);
    }
    @Then ("User clicks on RM Export to Excel button")
    public void user_clicks_on_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.RMExportToExcel(xpath);
    }
    //Fault Category
    @Then("User clicks on the Core masters RM Fault Category {string} tab")
    public void user_click_on_core_masters_RM_FC(String title) throws InterruptedException {
        String xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[2]";
        tmp.clickOnCoremastersRM_FC(xpath);
    }
    @Then("User clicks on button Fault Category add {string}")
    public void user_click_on_FCAdd(String btnAddFC) throws InterruptedException {
        tmp.clickOnAddFC(btnAddFC);
    }
    @Then("User fills up the {string} Fault Category details")
    public void user_fills_up_the_FC(String type) throws IOException {
        generateFC = dataGen.generateFCName();
        tmp.enterFCName(generateFC);
        tmp.selectFC("HVAC System");
    }
    @Then("User clicks on Fault Category save button")
    public void userClicksOnFCSaveButton() {
        tmp.userClicksOnFCSaveButton();
    }
    @Then ("User verify if the Fault Category is created")
    public void userVerifyIfTheFGIsCreated() throws InterruptedException {
        tmp.verifyFCcreation(generateFC);
    }
    @Then("User clicks on active Fault Category in the grid")
    public void user_clicks_on_first_active_FC_to_edit() {
        tmp.clickActiveFCtoEdit();
    }
    @Then("User clicks on active Fault Category in the grid to delete")
    public void user_clicks_on_first_active_FC_to_delete() {
        tmp.clickActiveFCtoDelete();
    }
    @Then("User verify if the Fault Category is deleted")
    public void user_Verify_first_active_FC_to_delete() {
        tmp.verifyFCDelete(generateFC);
    }
}

