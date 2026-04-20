package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utils.HelperUtils;

public class FinancialTrackingPage extends BasePage {
    public FinancialTrackingPage(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);
    String mainTab = driver.getWindowHandle();
    HelperUtils helperUtils = new HelperUtils(driver);

    public static final By INVREVERSALREMARKS = By.id("txtInvoiceReversalRemarks");
    public static final By INVREVERSALSAVE = By.id("ctl00_ContentPlaceHolder1_CustomerInvoice_RadWinInvoiceReversal_C_btnSaveInvoiceRevarsal");

    public void MenuFinancialTrackingPage(String FinancialTrackingPage) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("29"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //By locator = By.id("13");
            //utils.click(locator);
            System.out.println("Clicked on the FinancialTrackingPage: " + FinancialTrackingPage);
        } catch (Exception e) {
            System.out.println("Failed to click on the FinancialTrackingPage: " + FinancialTrackingPage);
            throw e;
        }
    }
    public void OnlineOrderClick(String OnlineOrderClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[1]/li[2]/a", OnlineOrderClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //utils.click(locator);
            System.out.println("Clicked on Online Order Click: " + OnlineOrderClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Online Order Click: " + OnlineOrderClick);
            throw e;
        }
    }
    public void InvoiceAdvicesClick(String InvoiceAdvicesClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[2]/li[2]/a", InvoiceAdvicesClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //utils.click(locator);
            System.out.println("Clicked on Invoice Advices Click: " + InvoiceAdvicesClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Invoice Advices Click: " + InvoiceAdvicesClick);
            throw e;
        }
    }
    //Invoice Print
    public void InvoiceAdvicesClickPrint(String InvoiceAdvicesClickPrint) throws InterruptedException {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_CustomerInvoice_btnPrint");
            utils.click(locator);
            System.out.println("Clicked on Invoice Advices Print Click: " + InvoiceAdvicesClickPrint);
        } catch (Exception e) {
            System.out.println("Failed to click on Invoice Advices Print Click: " + InvoiceAdvicesClickPrint);
            throw e;
        }
    }
    //Invoice Advice Reversal
    public void InvoiceAdvicesClickInvoiceAdviceReversal(String btnInvoiceAdvicesClickInvoiceAdviceReversal) {
        try {
            By locator = By.xpath(String.format("//*[@id='ContentPlaceHolder1_InvoiceReversal']", btnInvoiceAdvicesClickInvoiceAdviceReversal));
            utils.click(locator);
            System.out.println("Clicked on the Invoice Advice Click InvoiceAdvice Reversal: " + btnInvoiceAdvicesClickInvoiceAdviceReversal);
        } catch (Exception e) {
            System.out.println("Failed to Click on the Invoice Advice Click InvoiceAdvice Reversal: " + btnInvoiceAdvicesClickInvoiceAdviceReversal);
            throw e;
        }
    }
    public void enterInvReversalRemarks(String enterInvReversalRemarks) {
        utils.typeText(INVREVERSALREMARKS, enterInvReversalRemarks);
    }
    public void ClickInvoiceReveralSave() {
        By[] saveButtons = {INVREVERSALSAVE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Scheduled Invoices Start
    public void ScheduledInvoiceClick(String ScheduledInvoiceClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[2]/li[3]/a", ScheduledInvoiceClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //utils.click(locator);
            System.out.println("Clicked on Invoice Advices Click: " + ScheduledInvoiceClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Invoice Advices Click: " + ScheduledInvoiceClick);
            throw e;
        }
    }
    public void FinScheduledInvoiceExportToExcel(String FinScheduledInvoiceExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ContentPlaceHolder1_btnExportToExcel']", FinScheduledInvoiceExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Financial Scheduled Invoice : " + FinScheduledInvoiceExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Financial Scheduled Invoice : " + FinScheduledInvoiceExportToExcel);
            throw e;
        }
    }
    public void ScheduledInvoiceGenerateButton(String ScheduledInvoiceGenerateButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdscheduledinvoice_ctl00_ctl04_btnGenerateInvoice']", ScheduledInvoiceGenerateButton));
            utils.click(locator);
            System.out.println("Clicked on Financial Scheduled Invoice Invoice Generate:" + ScheduledInvoiceGenerateButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Financial Scheduled Invoice Invoice Generate : " + ScheduledInvoiceGenerateButton);
            throw e;
        }
    }
    //Scheduled Invoices End
    //Receipts Start
    public void ReceiptsClick(String ReceiptsClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[3]/li[2]/a", ReceiptsClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //utils.click(locator);
            System.out.println("Clicked on Receipts Click: " + ReceiptsClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Receipts Click: " + ReceiptsClick);
            throw e;
        }
    }
    public void ReceiptsClickPrint(String ReceiptsClickPrint) throws InterruptedException {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_btnPrint");
            utils.click(locator);
            System.out.println("Clicked on Invoice Advices Print Click: " + ReceiptsClickPrint);
        } catch (Exception e) {
            System.out.println("Failed to click on Invoice Advices Print Click: " + ReceiptsClickPrint);
            throw e;
        }
    }
    //Receipts End
}
