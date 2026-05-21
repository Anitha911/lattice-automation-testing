package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HelpDeskB2CServicePage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import java.io.IOException;

public class HelpDeskB2CServiceSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    HelpDeskB2CServicePage tmp = new HelpDeskB2CServicePage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User clicks on HelpDesk {string} in navigation panel")
    public void user_click_on_HelpDesk(String title) throws InterruptedException {
        String xpath = "//*[@id='27']";
        tmp.clickOnHelpDeskMenu(xpath);
    }
    @Then("User clicks on the Call Centre {string} tab")
    public void user_click_on_CallCentreHelpDesk(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-helpdesk']/div[2]/div/ul[1]/li[2]/a";
        tmp.CallCentreHelpDesk(xpath);
    }
    @Then("User clicks Direct WO Booking Button")
    public void user_clicks_DirectWOBkngButton() {
        tmp.clickDirectWOBkngButton();
    }
    @Then("User clicks Help Desk Add New Contact Button")
    public void user_clicks_AddNewContact() {
        tmp.clickAddNewContact();
    }
    @Then("User enter the details in Add New Contact pop up")
    public void userFillsUpAddNewContactDetails() {
        String ContactName=dataGen.generateCustomerName();
        tmp.ContatName(ContactName);
        tmp.selectType("OEM");
        String Email=dataGen.generateCustEmail();
        tmp.ContactEmail(Email);
        String MobileNumber=dataGen.generateCustMobile();
        tmp.CustMobile(MobileNumber);
        String Username=dataGen.generateDisplayName();
        tmp.UserName(Username);
    }
    @Then("User clicks the Help Desk New Contact Save button")
    public void userClicksHelpDeskNewContactSaveButton() {
        tmp.HelpDeskNewContactSaveButton();
    }
    @Then("User clicks the Help Desk New Contact Cancel button")
    public void userClicksHelpDeskNewContactCancelButton() {
        tmp.HelpDeskNewContactCancelButton();
    }
    @Then("User selects Help Desk option from the search dropdown")
    public void userSelectsSearchOption() {
        tmp.selectBy("Name");
    }
    @Then("User Help Desk enters search term")
    public void userEntersSearchTermTxtbox() {
        tmp.SearchText("SearchText");
    }
    @Then("User clicks Search button")
    public void user_clicks_Search() {
        tmp.clickSearch();
    }
    //Pagination starts
    @Then("User Clicks on Help Desk grid {string}")
    public void user_click_on_HelpDeskPagination(String HelpDeskPagination) throws InterruptedException {
        tmp.HelpDeskPagination(HelpDeskPagination);
    }
    //Pagination Ends
    //No of data per page
    @Then("User clicks the Help Desk no of data per page {int} in the grid")
    public void user_click_on_HelpDeskDataPerPage(int HelpDeskDataPerPage) throws InterruptedException {
        tmp.validatePageSizeHelpDesk(HelpDeskDataPerPage);
    }
    //No of Data per page
}
