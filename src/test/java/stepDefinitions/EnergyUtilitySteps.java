package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EnergyUtilityPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;

public class EnergyUtilitySteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    EnergyUtilityPage tmp = new EnergyUtilityPage(driver);

    @Then("User clicks on Energy Utility {string} in side menu")
    public void user_click_on_EnergyUtility(String title) throws InterruptedException {
        String id = "15";
        tmp.MenuEnergyUtilityTrackingPage(id);
    }
    @Then("User Clicks on Energy Utility Account Meter Set Up {string} in side menu")
    public void user_click_on_EnergyUtilityAccMeterSetUp(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-energy']/div[2]/div/ul[1]/li[2]/a";
        tmp.AccMeterSetUp(xpath);
    }
    @Then("User clicks on button Energy Utility Account Meter Set Up Add {string}")
    public void user_click_on_AccMeterSetUp(String btnAddAccMeterSetUp) throws InterruptedException {
        tmp.clickOnAddAccMeterSetUp(btnAddAccMeterSetUp);
    }
    //Pagination
    @Then("User clicks the AccountMeterSet Up Pagination arrow {string} in the grid")
    public void user_click_on_AccountMeterSetUpPagination(String GrdAccountMeterSetUp) throws InterruptedException {
        tmp.clickOnGrdAccountMeterSetUpPagination(GrdAccountMeterSetUp);
    }
    //No of data per page
    @Then("User clicks the AccountMeterSet Up no of data per page {int} in the grid")
    public void user_click_on_AccountMeterSetUpDataPerPage(int GrdAccountMeterSetUp) throws InterruptedException {
        tmp.validatePageSize(GrdAccountMeterSetUp);
    }
    //Account Meter set Up Add Details Starts
    @Then("User enters details in Energy Utility Account Meter Set Up Pop up")
    public void userFillsUpAccountMeterDetails() {
        tmp.selectClient("Alpha Properties");
        tmp.selectClientContract("ABC Tower");
        tmp.selectProperty("ABC Tower");
        tmp.selectEnergyType("Electricity");
        tmp.selectSupplier("Demo Company");
        tmp.selectConnectedService("Chillers");
        tmp.selectConnectionLevel("Zone");
        tmp.selectReportingGrp("Lattice");
        tmp.selectAsset("DVD Player");

        tmp.enterPremiseNumber(dataGen.generatePremiseMeterAccDescNumber());
        tmp.enterMeterNumber(dataGen.generatePremiseMeterAccDescNumber());
        tmp.enterEnergyAccDesc(dataGen.generatePremiseMeterAccDescNumber());
        tmp.enterEnergyContractAccNum(dataGen.generatePremiseMeterAccDescNumber());
        tmp.enterEnergyCovArea(dataGen.generateInspecCharges());
        tmp.enterEnergyMulFactor(dataGen.generateInspecCharges());
    }
    @Then("User Clicks AccountMeterSetUp Save Button")
    public void user_click_on_AddAccountMeterSetUp() {
        tmp.AddAccountMeterSetUp();
    }
    //Account Meter set Up Add Details ends
    //Account meter set up detail page starts
    @Then("User clicks on first data in the grid")
    public void user_click_on_AccountMeterSetUpGridDataClick() {
        tmp.AccountMeterSetUpGridDataClick();
    }
    @Then("User clicks the Edit Account Set Up Button")
    public void user_click_on_AccountMeterSetUpDetailEditButtonClick() {
        tmp.AccountMeterSetUpDetailEditButtonClick();
    }
    @Then("User clicks the Update Button in the Edit Account Set Up Detail page")
    public void user_click_on_AccountMeterSetUpDetailUpdateButtonClick() {
        tmp.AccountMeterSetUpDetailUpdateButtonClick();
    }
    //Connection Location Starts
    @Then("User Clicks the Connection Location Menu in the Left side")
    public void user_click_on_ConnLocation() {
        tmp.AccountMeterSetUpDetailConnLoc();
    }
    @Then("User Clicks the Add Connection Location Button")
    public void user_click_on_ConnLocationAddButton() {
        tmp.AccountMeterSetUpDetailConnLocAdd();
    }
    @Then("User checks the checkbox in the Connection Location grid details")
    public void user_click_on_ConnLocationGridDetails() {
        tmp.ConnLocationGridDetails();
    }
    @Then("User Clicks the Connection Location Save Button")
    public void user_click_on_ConnLocationSaveButton() {
        tmp.AccountMeterSetUpDetailConnLocSave();
    }
    //Connection Location Ends
    //SubMeter Starts
    @Then("User Clicks the SubMeter Menu in the Left side")
    public void user_click_on_SubMeterMenu() {
        tmp.AccountMeterSetUpDetailSubMeter();
    }
    @Then("User Clicks the Add SubMeter Button")
    public void user_click_on_SubMeterAddButton() {
        tmp.AccountMeterSetUpDetailSubMeterAdd();
    }
    @Then("User SubMeter pop up details")
    public void userFillsUpAccountSetUPSubMeterDetails() {
        tmp.enterSubMeterNumber(dataGen.generatePremiseMeterAccDescNumber());
        tmp.enterEnergySubMeterNotes(dataGen.generatePremiseMeterAccDescNumber());
        WebElement checkbox = driver.findElement(By.id("ctl00_ContentPlaceHolder1_CCFollowUp_radwinSubMeter_C_radioSubMeterType_0"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
    @Then("User Clicks the SubMeter Save Button")
    public void user_click_on_SubMeterSaveButton() {
        tmp.AccountMeterSetUpDetailSubMeterSave();
    }
    //SubMeter Ends
    //Account meter set up detail page ends

}
