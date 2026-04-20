package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FinancialTrackingPage;
import utils.DriverFactory;
import utils.ElementUtils;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class FinancialTrackingSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    TestDataGenerator dataGen = new TestDataGenerator();
    HelperUtils helperUtils = new HelperUtils(driver);
    FinancialTrackingPage tmp = new FinancialTrackingPage(driver);
    ElementUtils elementUtils= new ElementUtils(driver);

    @Then("User clicks on Financial Transactions Tracking {string} in side menu")
    public void user_click_on_FinancialTracking(String title) throws InterruptedException {
        String id = "29";
        tmp.MenuFinancialTrackingPage(id);
    }
    @Then("User Clicks on Financial Transactions Tracking Online Order {string} in side menu")
    public void user_click_on_FinancialTrackingOnlineOrder(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Financial']/div[2]/div/ul[1]/li[2]/a";
        tmp.OnlineOrderClick(xpath);
    }
    @Then("User Clicks on Financial Transactions Tracking Invoice Advices {string} in side menu")
    public void user_click_on_FinancialTrackingInvoiceAdvices(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Financial']/div[2]/div/ul[2]/li[2]/a";
        tmp.InvoiceAdvicesClick(xpath);
    }
    @Then("User Clicks on Print Invoice Advices {string} Button")
    public void user_click_on_FinancialTrackingInvoiceAdvicesPrint(String title) throws InterruptedException {
        String id = "ctl00_ContentPlaceHolder1_CustomerInvoice_btnPrint";
        tmp.InvoiceAdvicesClickPrint(id);
    }
    //Invoice Advices Reversal
    @Then("User Clicks on  Invoice Advice Reversal {string} Button")
    public void user_click_on_FinancialTrackingInvoiceAdviceReversal(String FinancialTrackingInvoiceAdviceReversal ) throws InterruptedException {
        tmp.InvoiceAdvicesClickInvoiceAdviceReversal(FinancialTrackingInvoiceAdviceReversal);
    }
    @Then("User enters the details in the Invoice Advice Reversal pop up")
    public void userFillsInvoiceReversalDetails() {
        tmp.enterInvReversalRemarks(dataGen.generateEnqDesc());
    }
    @Then("User clicks ths Invoice Advice Reversal Save button")
    public void user_click_on_InvReversalSaveButton() {
        tmp.ClickInvoiceReveralSave();
    }
    //Scheduled Invoice Start
    @Then("User Clicks on Financial Transactions Tracking Scheduled Invoices {string} in side menu")
    public void user_click_on_FinancialTrackingScheduledInvoice(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Financial']/div[2]/div/ul[2]/li[3]/a";
        tmp.ScheduledInvoiceClick(xpath);
    }
    @Then ("User Clicks on Financial Transactions Tracking  Export to Excel Button")
    public void user_clicks_on_Financial_export_to_excel_button() throws InterruptedException{
        String xpath = "//*[@id='ContentPlaceHolder1_btnExportToExcel']";
        tmp.FinScheduledInvoiceExportToExcel(xpath);
    }
    @Then("User Clicks Generate Invoice button {string}")
    public void user_click_on_ScheduledInvoiceGenerateButton(String ScheduledInvoiceGenerateButton) throws InterruptedException
    {
        tmp.ScheduledInvoiceGenerateButton(ScheduledInvoiceGenerateButton);
    }
    //Scheduled Invoice End
    //Receipts Start
    @Then("User Clicks on Financial Transactions Tracking Receipts {string} in side menu")
    public void user_click_on_FinancialTrackingReceipts(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Financial']/div[2]/div/ul[3]/li[2]/a";
        tmp.ReceiptsClick(xpath);
    }
    @Then("User Clicks on Financial Transactions Tracking {string} Print Button")
    public void user_click_on_FinancialTrackingReceiptsPrint(String title) throws InterruptedException {
        String id = "ctl00_ContentPlaceHolder1_btnPrint";
        tmp.ReceiptsClickPrint(id);
    }
    //Receipts End
}
