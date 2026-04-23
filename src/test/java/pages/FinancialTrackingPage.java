package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HelperUtils;

import java.time.Duration;

public class FinancialTrackingPage extends BasePage {
    public FinancialTrackingPage(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);
    String mainTab = driver.getWindowHandle();
    HelperUtils helperUtils = new HelperUtils(driver);

    public static final By INVREVERSALREMARKS = By.id("txtInvoiceReversalRemarks");
    public static final By INVREVERSALSAVE = By.id("ctl00_ContentPlaceHolder1_CustomerInvoice_RadWinInvoiceReversal_C_btnSaveInvoiceRevarsal");
    public static final By RECEIPT_CUSTOMER_NAME_DD=By.id("ctl00_ContentPlaceHolder1_RadWinClient_C_raddrpCustomerName_Input");
    public static final By RECEIPTS_CUSTOMER_REMARKS = By.id("radtxtRemarks");
    public static final By RECEIPTSAVE = By.id("ctl00_ContentPlaceHolder1_RadWinClient_C_btnSave");
    public static final By BULK_CLIENT_DD=By.id("ctl00_ContentPlaceHolder1_raddrpClientName_Input");
    public static final By BULKINVOICESAVE = By.id("ctl00_ContentPlaceHolder1_RadWinClaim_C_RadButton2");
    public static final By ADHOC_TECHNICIAN=By.id("ctl00_ContentPlaceHolder1_raddrpTechName_Input");

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
    public void FinancialTrackingReceiptsAddButton(String FinancialTrackingReceiptsAddButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_BtnAdd']", FinancialTrackingReceiptsAddButton));
            utils.click(locator);
            System.out.println("Clicked on Financial Tracking Add Receipt Button:" + FinancialTrackingReceiptsAddButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Financial Tracking Add Receipt Button : " + FinancialTrackingReceiptsAddButton);
            throw e;
        }
    }
    public void selectReceiptCustomer(String selectReceiptCustomer) {
        try {
            utils.click(RECEIPT_CUSTOMER_NAME_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectReceiptCustomer));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectReceiptCustomer);
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//table//tr")
            ));
            WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//table//input[@type='checkbox'])[1]")
            ));
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
             //
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectReceiptCustomer);
            throw e;
        }
    }
    public void enterReceiptDesc(String enterReceiptDesc) {
        utils.typeText(RECEIPTS_CUSTOMER_REMARKS, enterReceiptDesc);
    }
    public void ClickReceiptsSave() {
        By[] saveButtons = {RECEIPTSAVE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                utils.click(button);//Change this when bug is solved
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Receipts End
    //Bulk Invoice Start
    public void BulkInvoiceClick(String BulkInvoiceClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[2]/li[4]/a", BulkInvoiceClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            //utils.click(locator);
            System.out.println("Clicked on Bulk Invoice Click: " + BulkInvoiceClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Bulk Invoice Click: " + BulkInvoiceClick);
            throw e;
        }
    }
    public void FinancialTrackingApplyFilterButton(String FinancialTrackingApplyFilterButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_btnSearch_input']", FinancialTrackingApplyFilterButton));
            utils.click(locator);
            System.out.println("Clicked on Financial Tracking ApplyFilterButton:" + FinancialTrackingApplyFilterButton);
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//table//tr")
            ));
            WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//table//input[@type='checkbox'])[2]")
            ));
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            //
        } catch (Exception e) {
            System.out.println("Failed to click on Financial Tracking ApplyFilterButton : " + FinancialTrackingApplyFilterButton);
            throw e;
        }
    }
    public void selectClient(String selectClient) {
        try {
            utils.click(BULK_CLIENT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectClient));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectClient);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectClient);
            throw e;
        }
    }
    public void FinancialTrackingGenerateBulkInvoiceButton(String FinancialTrackingGenerateBulkInvoiceButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_BtnAdd']", FinancialTrackingGenerateBulkInvoiceButton));
            utils.click(locator);
            System.out.println("Clicked on Financial Tracking generate Bulk Invoice:" + FinancialTrackingGenerateBulkInvoiceButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Financial Tracking generate Bulk Invoice Button : " + FinancialTrackingGenerateBulkInvoiceButton);
            throw e;
        }
    }
    public void ClickBulkInvoiceSave() {//Bug for obj ref error
        By[] saveButtons = {BULKINVOICESAVE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Bulk Invoice Ends

    //Credit Notes Start
    public void CreditNotesClick(String CreditNotesClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[3]/li[3]/a", CreditNotesClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Credit Notes Click: " + CreditNotesClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Credit Notes Click: " + CreditNotesClick);
            throw e;
        }
    }
    //Credit Notes Ends
    //Adhoc Purchase Start
    public void AdhocPurchaseClick(String AdhocPurchaseClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-Financial']/div[2]/div/ul[3]/li[4]/a", AdhocPurchaseClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Adhoc Purchase Click: " + AdhocPurchaseClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Adhoc Purchase Click: " + AdhocPurchaseClick);
            throw e;
        }
    }
    //Claimed tile
    public void AdhocPurchaseClaimedClick(String AdhocPurchaseClaimedClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='div2']", AdhocPurchaseClaimedClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Adhoc Purchase Claimed Click: " + AdhocPurchaseClaimedClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Adhoc Purchase Claimed Click: " + AdhocPurchaseClaimedClick);
            throw e;
        }
    }
    //Pending
    public void AdhocPurchasePendingClick(String AdhocPurchasePendingClick) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='div1']", AdhocPurchasePendingClick)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Adhoc Purchase Pending Click: " + AdhocPurchasePendingClick);
        } catch (Exception e) {
            System.out.println("Failed to click on Adhoc Purchase Pending Click: " + AdhocPurchasePendingClick);
            throw e;
        }
    }
    public void FinAdhocPurchaseExportToExcel(String FinAdhocPurchaseExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", FinAdhocPurchaseExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel AdhocPurchase : " + FinAdhocPurchaseExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel AdhocPurchase : " + FinAdhocPurchaseExportToExcel);
            throw e;
        }
    }
    public void selectTechnician(String selectTechnician) {
        try {
            utils.click(ADHOC_TECHNICIAN);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectTechnician));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectTechnician);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectTechnician);
            throw e;
        }
    }
    public void FinAdhocPurchaseApplyFilter(String FinAdhocPurchaseApplyFilter) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_btnSearch_input']", FinAdhocPurchaseApplyFilter));
            utils.click(locator);
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//table//tr")
            ));
            WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("(//table//input[@type='checkbox'])[2]")
            ));
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            //
            System.out.println("Clicked on Apply Filter AdhocPurchase : " + FinAdhocPurchaseApplyFilter);
        } catch (Exception e) {
            System.out.println("Failed to click on Apply Filter AdhocPurchase : " + FinAdhocPurchaseApplyFilter);
            throw e;
        }
    }
    public void FinAdhocPurchaseClaim(String FinAdhocPurchaseClaim) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_BtnAdd']", FinAdhocPurchaseClaim));
            utils.click(locator);
            System.out.println("Clicked on AdhocPurchase Claim: " + FinAdhocPurchaseClaim);
        } catch (Exception e) {
            System.out.println("Failed to click on AdhocPurchase Claim : " + FinAdhocPurchaseClaim);
            throw e;
        }
    }
    //Adhoc Purchase Ends
}
