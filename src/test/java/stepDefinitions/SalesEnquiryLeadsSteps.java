package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.SalesEnquiryLeadsPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;

public class SalesEnquiryLeadsSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    HelperUtils helperUtils = new HelperUtils(driver);
    SalesEnquiryLeadsPage tmp = new SalesEnquiryLeadsPage(driver);


    @Then("User clicks on Sales Enquiry Management {string} in side menu")
    public void user_click_on_DataConfig(String title) throws InterruptedException {
        String xpath = "//a[contains(@class,'nav-link active') and @id='13']";
        String id = "13";
        tmp.SalesEnquiryManagement(id);
    }
    @Then("User clicks on Sales Enquiry Management Leads {string} in side menu")
    public void user_click_on_Sales_Leads(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-sales']/div[2]/div/ul[1]/li[2]/a";
        tmp.clickOnSalesLeads(xpath);
    }

    @Then("User clicks on button Sales Add Enquiry {string}")
    public void user_click_on_Sales_AddEnquiry(String btnAddSalesEnquiry) throws InterruptedException {
        tmp.clickOnAddSalesEnquiry(btnAddSalesEnquiry);
    }
    @Then("User clicks on button Sales Add Enquiry Add Customer {string}")
    public void user_click_on_Sales_AddEnquiryAddCustomer(String btnAddSalesEnquiryCustomer) throws InterruptedException {
        tmp.clickOnAddSalesEnquiryCustomer(btnAddSalesEnquiryCustomer);
    }
    @Then("User fills the Customer details")
    public void userFillsUpCustomerDetails() {
        tmp.enterCustomerName(dataGen.generateCustomerName());
        tmp.enterContactPerson(dataGen.generateContactPerson());
        tmp.enterCustMobile(dataGen.generateCustMobile());
        tmp.enterCustEmail(dataGen.generateCustEmail());
        tmp.enterCustAddress(dataGen.generateCustAddress());
        tmp.selectClientType("B2B Corporate");
        tmp.selectCountry("India");
        tmp.selectCity("Chennai");
        tmp.selectCustImp("VVIP");
    }
    @Then("User Clicks on Add Customer Save Button")
    public void user_click_on_AddCustSaveButton() {
        tmp.ClickAddCustSave();
    }
    //Start from here
    @Then("User fills the Enquiry details")
    public void userFillsUpEnquiryDetails() {
        tmp.enterCustomerName(dataGen.generateCustomerName());
        tmp.enterContactPerson(dataGen.generateContactPerson());
        tmp.enterCustMobile(dataGen.generateCustMobile());
        tmp.enterCustEmail(dataGen.generateCustEmail());
        tmp.enterCustAddress(dataGen.generateCustAddress());
        tmp.selectClientType("B2B Corporate");
        tmp.selectCountry("India");
        tmp.selectCity("Chennai");
        tmp.selectCustImp("VVIP");
    }
}
