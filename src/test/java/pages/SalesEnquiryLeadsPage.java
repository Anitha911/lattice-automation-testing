package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.HelperUtils;

import java.util.Random;


public class SalesEnquiryLeadsPage extends BasePage{
    public SalesEnquiryLeadsPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);
    String mainTab = driver.getWindowHandle();
    HelperUtils helperUtils = new HelperUtils(driver);

    public static final By CUSTOMER_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_radtxtCustomerName");
    public static final By CONTACT_PERSON = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_radtxtContactPerson");
    public static final By MOBILE_NUMBER = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_radtxtMobileNumber");
    public static final By EMAIL = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_radtxtEmail");
    public static final By ADDRESS = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_radtxtAddressLine1");
    public static final By CLIENTTYPE_DD = By.cssSelector("[value='Select Client Type']");
    public static final By COUNTRY_DD = By.cssSelector("[value='Select Country']");
    public static final By CITY_DD = By.cssSelector("[value='Select City']");
    public static final By CUSTIMP_DD = By.cssSelector("[value='Select Customer Importance']");
    public static final By SAVE_BUTTON_CUSTOMER = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_btnSave1");
    public static final By ENQUIRY_CUSTOMER_NAME_DD = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlCustomerName_Input");
    public static final By ENQUIRY_SOURCE_DD = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlEnquirySource_Input");
    public static final By ENQUIRY_TYPE_DD = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlEnquiryType_Input");
    public static final By ENQUIRY_SALESPERSON_DD = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlSalesPerson_Input");
    public static final By ENQUIRY_SERVICE_DD = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_ddlService_Input");
    public static final By ENQUIRYDESC = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_txtEnquiryDescription");
    public static final By SAVE_BUTTON_ENQUIRY = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_btnSave");
    public static final By ENQUIRY_GRID_FIRSTDATA = By.id("ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0");
    public static final By ENQUIRY_UPDATE_STATUS_PERCENTAGE = By.id("txtStatusChangeProbablityPercentage");
    public static final By ENQUIRY_UPDATE_STATUS_NEWSTATUS_DD = By.id("ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlNewStatus_Input");
    public static final By ENQUIRY_UPDATE_STATUS_DESC = By.id("txtComments");
    public static final By SAVE_BUTTON_UPDATE_STATUS = By.id("ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_btnStatusUpdate");
    public static final By ENQUIRY_FOLLOWUP_MODE_DD = By.id("ctl00_ContentPlaceHolder1_ddlSource_Input");
    public static final By FOLLOWUP_COMMENTS = By.id("ctl00_ContentPlaceHolder1_txt_Comments");
    public static final By FOLLOWUP_NEXTDATE = By.id("ctl00_ContentPlaceHolder1_dtFollowupDate_dateInput");
    public static final By FOLLOWUP__PROBABLITY= By.id("ctl00_ContentPlaceHolder1_txtProbablityPercentage");
    public static final By SAVE_BUTTON_FOLLOWUP = By.id("ctl00_ContentPlaceHolder1_radFollowup");
    public static final By ENQUIRY_NOTE_DESC = By.id("radtxtNotes");
    public static final By SAVE_BUTTON_ENQNOTES = By.id("ctl00_ContentPlaceHolder1_Notes_radwinNotes_C_radbtnNotesSave");
    public static final By ENQUIRY_NOTE_TYPE_DD = By.id("ctl00_ContentPlaceHolder1_Notes_radwinNotes_C_raddrpType_Input");


    public void SalesEnquiryManagement(String SalesEnquiryManagement) throws InterruptedException {
        try {
            By locator = By.id("13");
            utils.click(locator);
            System.out.println("Clicked on the SalesEnquiryManagement: " + SalesEnquiryManagement);
        } catch (Exception e) {
            System.out.println("Failed to click on the SalesEnquiryManagement: " + SalesEnquiryManagement);
            throw e;
        }
    }
    public void clickOnSalesLeads(String clickOnSalesLeads) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[1]/li[2]/a", clickOnSalesLeads));
            utils.click(locator);
            System.out.println("Clicked on Sales Leads Menu: " + clickOnSalesLeads);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Leads Menu: " + clickOnSalesLeads);
            throw e;
        }
    }
    public void clickOnAddSalesEnquiry(String btnAddSalesEnquiry) {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_BtnAdd");
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Enquiry Button: " + btnAddSalesEnquiry);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Enquiry Button:: " + btnAddSalesEnquiry);
            throw e;
        }
    }
    public void clickOnAddSalesEnquiryCustomer(String btnAddSalesEnquiryCustomer) {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_btnAddCustomerLookUp");
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Enquiry Button Add Customer: " + btnAddSalesEnquiryCustomer);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Enquiry Button Add Customer: " + btnAddSalesEnquiryCustomer);
            throw e;
        }
    }
    public void enterCustomerName(String CustomerName) {
        utils.typeText(CUSTOMER_NAME, CustomerName);
    }
    public void enterContactPerson(String ContactPerson) {
        utils.typeText(CONTACT_PERSON, ContactPerson);
    }
    public void enterCustMobile(String CustMobile) {
        utils.typeText(MOBILE_NUMBER, CustMobile);
    }
    public void enterCustEmail(String CustEmail) {
        utils.typeText(EMAIL, CustEmail);
    }
    public void enterCustAddress(String Address) {
        utils.typeText(ADDRESS, Address);
    }
    public void selectClientType(String ClientType) {
        try {
           // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ClientType));
            //By options = By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinEnquiryAdd_C_Enquiry_RadWinClientAdd_C_raddrpClientType_DropDown li");
            utils.click(CLIENTTYPE_DD);
            //new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(options));
            //helperUtils.clickRandomElement(options);
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + ClientType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + ClientType);
            throw e;
        }
    }
    public void selectCountry(String Country) {
        try {
            utils.click(COUNTRY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Country));
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(COUNTRY_DD));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + Country);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + Country);
            throw e;
        }
    }
    public void selectCity(String City) {
        try {
            utils.click(CITY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", City));
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(CITY_DD));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + City);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + City);
            throw e;
        }
    }
    public void selectCustImp(String CustImp) {
        try {
            utils.click(CUSTIMP_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", CustImp));
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(CUSTIMP_DD));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + CustImp);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + CustImp);
            throw e;
        }
    }
    public void ClickAddCustSave() {
        By[] saveButtons = {SAVE_BUTTON_CUSTOMER};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Enquiry
    public void selectEnqCustomer(String Customer) {
        try {
            utils.click(ENQUIRY_CUSTOMER_NAME_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Customer));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + Customer);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + Customer);
            throw e;
        }
    }
    public void selectEnqSource(String EnqSource) {
        try {
            utils.click(ENQUIRY_SOURCE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", EnqSource));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + EnqSource);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + EnqSource);
            throw e;
        }
    }
    public void selectEnquiryType(String EnqType) {
        try {
            utils.click(ENQUIRY_TYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", EnqType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + EnqType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + EnqType);
            throw e;
        }
    }
    public void selectEnquirySalesPerson(String EnqSalesPerson) {
        try {
            utils.click(ENQUIRY_SALESPERSON_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", EnqSalesPerson));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + EnqSalesPerson);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + EnqSalesPerson);
            throw e;
        }
    }
    public void selectEnquiryService(String EnqSalesService) {
        try {
            utils.click(ENQUIRY_SERVICE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", EnqSalesService));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + EnqSalesService);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + EnqSalesService);
            throw e;
        }
    }
    public void enterEnquiryDesc(String EnquiryDesc) {
        utils.typeText(ENQUIRYDESC, EnquiryDesc);
    }
    public void ClickAddEnquirySave() {
        By[] saveButtons = {SAVE_BUTTON_ENQUIRY};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void SalesEnquiryclickExportToExcel(String SalesEnquiryclickExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='radbtnExport']", SalesEnquiryclickExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Enquiry Button: " + SalesEnquiryclickExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on the Export to excel Enquiry Button:: " + SalesEnquiryclickExportToExcel);
            throw e;
        }
    }
    public void SalesEnquiryClickGridFirstData(String SalesEnquiryclickGridFirstData) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']", SalesEnquiryclickGridFirstData));
            utils.click(locator);
            System.out.println("Clicked on Enquiry Grid First data: " + SalesEnquiryclickGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Enquiry Grid First Data: " + SalesEnquiryclickGridFirstData);
            throw e;
        }
    }
    public void clickOnUpdateStatusSalesEnquiry(String btnUpdateStatusSalesEnquiry) {
        try {
            Set<String> allTabs = driver.getWindowHandles();
            for (String tab : allTabs) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_btnUpdateStatus']", btnUpdateStatusSalesEnquiry));
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Enquiry Update Status: " + btnUpdateStatusSalesEnquiry);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Enquiry Update Status: " + btnUpdateStatusSalesEnquiry);
            throw e;
        }
    }
    //Update Status
    public void selectNewStatus(String selectNewStatus) {
        try {
            utils.click(ENQUIRY_UPDATE_STATUS_NEWSTATUS_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectNewStatus));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectNewStatus);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectNewStatus);
            throw e;
        }
    }
    public void enterProbablity(String enterProbablity) {
        utils.typeText(ENQUIRY_UPDATE_STATUS_PERCENTAGE, enterProbablity);
    }
    public void enterComments(String enterComments) {
        utils.typeText(ENQUIRY_UPDATE_STATUS_DESC, enterComments);
    }
    public void ClickAddUpdateStatus() {
        By[] saveButtons = {SAVE_BUTTON_UPDATE_STATUS};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
//Follow Up
public void clickOnCustomerFollowUp(String clickOnCustomerFollowUp) {
    try {
        Set<String> allTabs = driver.getWindowHandles();
        for (String tab : allTabs) {
            if (!tab.equals(mainTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
        By locator = By.xpath(String.format("//*[@id='tdFollowUpSubmit']", clickOnCustomerFollowUp));
        utils.click(locator);
        System.out.println("Clicked on the Sales Add Enquiry Cust Follow Up: " + clickOnCustomerFollowUp);
         } catch (Exception e) {
        System.out.println("Failed to click on the Sales Add Enquiry Cust Follow Up: " + clickOnCustomerFollowUp);
        throw e;
        }
    }
    public void enterFollowUpProbablity(String enterFollProbablity) {
        utils.typeText(FOLLOWUP__PROBABLITY, enterFollProbablity);
    }
    public void enterFollowUpComments(String enterFollowUpComments) {
        utils.typeText(FOLLOWUP_COMMENTS, enterFollowUpComments);
    }
    public void selectNewMode(String selectFollowUpNewMode) {
        try {
            utils.click(ENQUIRY_FOLLOWUP_MODE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectFollowUpNewMode));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectFollowUpNewMode);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectFollowUpNewMode);
            throw e;
        }
    }
    public void enternewFollowupDate(String enternewFollowupDate) {
        utils.typeText(FOLLOWUP_NEXTDATE, enternewFollowupDate);

    }
    public void ClickAddUpdateFollowUp() {
        By[] saveButtons = {SAVE_BUTTON_FOLLOWUP};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Notes
    public void clickOnSalesNotes(String clickOnSalesNotes) {
        try {
            Set<String> allTabs = driver.getWindowHandles();
            for (String tab : allTabs) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            By locator = By.xpath(String.format("//*[@id='tdNotes']", clickOnSalesNotes));
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Enquiry Notes: " + clickOnSalesNotes);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Enquiry Notes: " + clickOnSalesNotes);
            throw e;
        }
    }
    public void enterNotesComments(String enterNotesComments) {
        utils.typeText(ENQUIRY_NOTE_DESC, enterNotesComments);
    }
    public void selectNoteType(String selectNoteType) {
        try {
            utils.click(ENQUIRY_NOTE_TYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectNoteType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectNoteType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectNoteType);
            throw e;
        }
    }
    public void ClickNotesSave() {
        By[] saveButtons = {SAVE_BUTTON_ENQNOTES};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void clickOnAddSalesNotes(String clickOnAddSalesNotes) {
        try {
            WebElement el = driver.findElement(By.id("imgNotes"));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", el
            );
            System.out.println("Clicked on the Sales Add Enquiry Note: " + clickOnAddSalesNotes);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Enquiry Note: " + clickOnAddSalesNotes);
            throw e;
        }
    }
    //Add Quotation
    public void clickOnSalesOppurunities(String clickOnSalesOppurunities) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[2]/li[2]/a", clickOnSalesOppurunities));
            utils.click(locator);
            System.out.println("Clicked on Sales opportunities Menu: " + clickOnSalesOppurunities);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales opportunities Menu: " + clickOnSalesOppurunities);
            throw e;
        }
    }
    public void SalesEnquiryOppClickGridFirstData(String SalesEnquiryOppClickGridFirstData) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']", SalesEnquiryOppClickGridFirstData));
            utils.click(locator);
            System.out.println("Clicked on Enquiry Grid First data: " + SalesEnquiryOppClickGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Enquiry Grid First Data: " + SalesEnquiryOppClickGridFirstData);
            throw e;
        }
    }
    public void clickOnSalesOpp(String clickOnSalesOpp) {
        try {
            Set<String> allTabs = driver.getWindowHandles();
            for (String tab : allTabs) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            By locator = By.xpath(String.format("//*[@id='tdQuotation']", clickOnSalesOpp));
            utils.click(locator);
            System.out.println("Clicked on the Sales Opp Quotation: " + clickOnSalesOpp);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Opp Quotation: " + clickOnSalesOpp);
            throw e;
        }
    }
    public void clickOnAddQuotation(String clickOnAddQuotation) {
        try {
            WebElement el = driver.findElement(By.id("addQuotations"));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", el
            );
            System.out.println("Clicked on the Sales Add Quotation: " + clickOnAddQuotation);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Quotation: " + clickOnAddQuotation);
            throw e;
        }
    }

}
