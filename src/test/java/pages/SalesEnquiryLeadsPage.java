package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;
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
    public static final By ENQUIRY_ADDLINES_DESC = By.id("txtdesc1");
    public static final By ENQUIRY_ADDLINES_UNITPRICE = By.id("txtUnitPrice1");
    public static final By SAVE_BUTTON_QUOT_DRAFT = By.id("ctl00_ContentPlaceHolder1_btnSave");
    public static final By SAVE_BUTTON_QUOT_FINALIZE = By.id("ctl00_ContentPlaceHolder1_btnSendVerify");
    public static final By ENQUIRY_QUOT_SCOPEOFWORK = By.id("radtxtScope");
    public static final By SAVE_BUTTON_QUOT_FINALIZE_SUBMIT = By.id("ctl00_ContentPlaceHolder1_RadVerification_C_btnSend");
    public static final By PROD_INTERNAL_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtInternlName");
    public static final By PROD_DISPLAY_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtDisplayName");
    public static final By PROD_SHORT_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtShrtDescription");
    public static final By PROD_INSPECTION_CHARGES= By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtInspectionCharges");
    public static final By PROD_MAX_PPM_SCHEDULE_COUNT= By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtMaxPPMScheduleCount");
    public static final By SAVE_BUTTON_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_BtnSave");
    public static final By PROD_PRICING_PRICE= By.id("txtprdPriceProductPrice");
    public static final By PROD_VALID_FROM= By.id("ctl00_ContentPlaceHolder1_RadWinB2CProPricing_C_txtValidFromProductPrice_dateInput");
    public static final By PROD_VALID_TO= By.id("ctl00_ContentPlaceHolder1_RadWinB2CProPricing_C_txtValidToProductPrice_dateInput");
    public static final By SAVE_BUTTON_PROD_PRICE = By.id("ctl00_ContentPlaceHolder1_RadWinB2CProPricing_C_BtnProductPriceTypeSave");
    public static final By RATE_CARD_NO = By.id("txtRateCardNo");
    public static final By RATE_CARD_NAME = By.id("txtRateCard");
    public static final By SAVE_BUTTON_RATECARD = By.id("ctl00_ContentPlaceHolder1_RadWinRateCard_C_btnSvaeRateCard");
    public static final By UPDATE_BUTTON_RATECARD = By.id("ctl00_ContentPlaceHolder1_radEditRateCard_C_btnUpdateRateCard");
    public static final By DELETE_FIRST_RATECARD_IN_LIST = By.id("ctl00_ContentPlaceHolder1_GrdRateCard_ctl00_ctl04_ImageButton1");
    public static final By DDL_MASTERCATEGORY_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProdmasterCategory_Input");
    public static final By DDL_CATEGORY_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductCategory_Input");
    public static final By DDL_SUB_CATEGORY_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductSubCategory_Input");
    public static final By DDL_PAYMENT_SCHEDULE_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlPaymentSchedule_Input");
    public static final By DDL_WO_TYPE_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlWOType_Input");
    public static final By DDL_FAULT_CODE_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFaultCode_Input");
    public static final By DDL_PPM_AFTER_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFirstPPMAfter_Input");
    public static final By UPDATE_BUTTON_PRODPACKAGE = By.id("ctl00_ContentPlaceHolder1_RadWinB2CProGeneral_C_BtnGeneralSave");
    public static final By UPDATE_EDIT_CONTACT = By.id("ctl00_ContentPlaceHolder1_RadWinEditContact_C_BtnContactSave");



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
    //Open Quotation in Console Window
    public void clickOnSalesOpenQuotations(String clickOnSalesOpenQuotations) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[3]/li[2]/a", clickOnSalesOpenQuotations));
            utils.click(locator);
            System.out.println("Clicked on Sales Open Quotations Menu: " + clickOnSalesOpenQuotations);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Open Quotations Menu: " + clickOnSalesOpenQuotations);
            throw e;
        }
    }
    public void SalesEnquiryOpenQuotationsExportToExcel(String SalesEnquiryOpenQuotationsExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ContentPlaceHolder1_btnExportToExcel']", SalesEnquiryOpenQuotationsExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel SalesEnquiryOpenQuotations: " + SalesEnquiryOpenQuotationsExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on the Export to excel SalesEnquiryOpenQuotations: " + SalesEnquiryOpenQuotationsExportToExcel);
            throw e;
        }
    }
    //Open Quotation in Console Window
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
    //EnquiryEdit Contact
    public void clickOnEditEnquiryContactDetails(String btnEnquiryContactDetails) {
        try {
            Set<String> allTabs = driver.getWindowHandles();
            for (String tab : allTabs) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_BtnEditContact']", btnEnquiryContactDetails));
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Enquiry Edit Contact: " + btnEnquiryContactDetails);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Edit Contact: " + btnEnquiryContactDetails);
            throw e;
        }
    }
    public void UpdateEditContactButton() {
        By[] saveButtons = {UPDATE_EDIT_CONTACT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Edit Contact
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
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__1']", SalesEnquiryOppClickGridFirstData));//change this
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
    public void clickOnAddQuotLines(String clickOnAddQuotAddLines) {
        try {
            WebElement el = driver.findElement(By.id("ContentPlaceHolder1_imgAddRow"));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", el
            );
            System.out.println("Clicked on the Sales Add Quotation Add Lines: " + clickOnAddQuotAddLines);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Quotation Add Lines:" + clickOnAddQuotAddLines);
            throw e;
        }
    }
    //Add Lines
    public void enterAddLinesComments(String enterAddLinesComments) {
        utils.typeText(ENQUIRY_ADDLINES_DESC, enterAddLinesComments);
    }
    public void enterAddLinesUnitPrice(String enterAddLinesUnitPrice) {
        utils.typeText(ENQUIRY_ADDLINES_UNITPRICE, enterAddLinesUnitPrice);
    }
    public void ClickQuotSave(Boolean clickQuotSaveDraft) {
            By[] saveButtons = {SAVE_BUTTON_QUOT_DRAFT};
            for (By button : saveButtons) {
                if (utils.isElementVisible(button)) {
                    utils.click(button);
                    return;
                }
            }
        throw new RuntimeException("No save button is present on the page.");
    }

    //Scope EXP
    public void ClickQuotScopeOfWork(String enterClickQuotScopeOfWork) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> driver.getWindowHandles().size() >= 3);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='tabScopeofWork']")
        )).click();
    }
    public void enterScope(String enterAddLinesComments) {
        utils.typeText(ENQUIRY_QUOT_SCOPEOFWORK, enterAddLinesComments);    }

    //Scope Exp
    public void ClickQuotSaveFinalize(String clickQuotSaveFinalize) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() >= 3);
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(2));
            By[] saveButtons = {SAVE_BUTTON_QUOT_FINALIZE};
            for (By button : saveButtons) {
                if (utils.isElementVisible(button)) {
                    utils.click(button);
                    return;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Failed to click on the Finalize Quotation: " + clickQuotSaveFinalize);
            throw e;
        }
    }
    public void ClickQuotSaveFinalizeSubmit(String ClickQuotSaveFinalizeSubmit) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() >= 3);
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(2));
            By[] saveButtons = {SAVE_BUTTON_QUOT_FINALIZE_SUBMIT};
            for (By button : saveButtons) {
                if (utils.isElementVisible(button)) {
                    utils.click(button);
                    return;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Failed to click on the Finalize Quotation Submit: " + ClickQuotSaveFinalizeSubmit);
            throw e;
        }
    }
    //much slow
    public void SalesEnquiryQuotationClickGridFirstData(String SalesEnquiryQuotationClickGridFirstData) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_Quotations_grdQuotationGrp_ctl00__0']", SalesEnquiryQuotationClickGridFirstData));//change this
            utils.click(locator);
            System.out.println("Clicked on Enquiry Grid First data: " + SalesEnquiryQuotationClickGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Enquiry Grid First Data: " + SalesEnquiryQuotationClickGridFirstData);
            throw e;
        }
    }
    public void OpportunitiesClickExportToExcel(String OpportunitiesClickExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='radbtnExport']", OpportunitiesClickExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Opportunities Click ExportToExcel" + OpportunitiesClickExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Opportunities Click Export ToExcel " + OpportunitiesClickExportToExcel);
            throw e;
        }
    }
    //quotation
//Product Store Front
    public void clickOnSalesProdFront(String clickOnSalesProdFront) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[1]/li[3]/a", clickOnSalesProdFront));
            utils.click(locator);
            System.out.println("Clicked on Sales Leads Menu: " + clickOnSalesProdFront);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Leads Menu: " + clickOnSalesProdFront);
            throw e;
        }
    }
    public void clickOnAddPackageProd(String clickOnAddPackageProd) {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_BtnAdd");
            utils.click(locator);
            System.out.println("Clicked on the Sales Add PackageProd: " + clickOnAddPackageProd);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Package Prod:: " + clickOnAddPackageProd);
            throw e;
        }
    }
    public void ProdIntName(String ProdIntName) {
        utils.typeText(PROD_INTERNAL_NAME, ProdIntName);
    }
    public void ProdDisplayName(String ProdDisplayName) {
        utils.typeText(PROD_DISPLAY_NAME, ProdDisplayName);
    }
    public void ProdShortDesc(String ProdShortDesc) {
        utils.typeText(PROD_SHORT_NAME, ProdShortDesc);
    }
    public void ProdInspecCharge(String ProdInspecCharge) {
        utils.typeText(PROD_INSPECTION_CHARGES, ProdInspecCharge);
    }
    public void ProdMaxPPMCount(String ProdMaxPPMCount) {
        utils.typeText(PROD_MAX_PPM_SCHEDULE_COUNT, ProdMaxPPMCount);
    }
    //Prod Dropdowns
    public void selectProdMasterCat(String selectProdMasterCat) {
        try {
           //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProdmasterCategory_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
             //
            //utils.click(DDL_MASTERCATEGORY_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdMasterCat));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdMasterCat);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdMasterCat);
            throw e;
        }
    }
    public void selectProdCat(String selectProdCat) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductCategory_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
             //
            //utils.click(DDL_CATEGORY_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdCat));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdCat);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdCat);
            throw e;
        }
    }
    public void selectProdSubCat(String selectProdSubCat) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductSubCategory_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
             //
            //utils.click(DDL_SUB_CATEGORY_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdSubCat));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdSubCat);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdSubCat);
            throw e;
        }
    }
    public void selectPaymentSchedule(String selectPaymentSchedule) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlPaymentSchedule_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            //
            //utils.click(DDL_PAYMENT_SCHEDULE_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectPaymentSchedule));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectPaymentSchedule);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectPaymentSchedule);
            throw e;
        }
    }
    public void selectWOType(String selectWOType) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlWOType_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            //
            //utils.click(DDL_WO_TYPE_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectWOType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectWOType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectWOType);
            throw e;
        }
    }
    public void selectFaultCode(String selectFaultCode) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFaultCode_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            //
            //utils.click(DDL_FAULT_CODE_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectFaultCode));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectFaultCode);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectFaultCode);
            throw e;
        }
    }
    public void selectPPMAfter(String selectPPMAfter) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFirstPPMAfter_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            //
            //utils.click(DDL_PPM_AFTER_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectPPMAfter));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectPPMAfter);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectPPMAfter);
            throw e;
        }
    }

    //
    public void ClickAddProdSave() {
        By[] saveButtons = {SAVE_BUTTON_PROD};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void ClickUpdateProdSave() {
        By[] saveButtons = {UPDATE_BUTTON_PRODPACKAGE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void ProdPackageClickExportToExcel(String ProdPackageClickExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", ProdPackageClickExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Sales Prod Package " + ProdPackageClickExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Sales Prod Package " + ProdPackageClickExportToExcel);
            throw e;
        }
    }
    public void SalesEnquiryProdpackClickGridFirstData(String SalesEnquiryProdpackClickGridFirstData) throws InterruptedException {
        try {
            //By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdB2CProduct_ctl00__0']", SalesEnquiryProdpackClickGridFirstData));
            WebElement row = driver.findElement(
                    By.xpath((String.format("//*[@id='ctl00_ContentPlaceHolder1_grdB2CProduct_ctl00__0']", SalesEnquiryProdpackClickGridFirstData))
            ));
            new Actions(driver).doubleClick(row).perform();
            //utils.click(locator);
            System.out.println("Clicked on Prod Package Grid First data: " + SalesEnquiryProdpackClickGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Prod Package Grid First Data: " + SalesEnquiryProdpackClickGridFirstData);
            throw e;
        }
    }
    public void clickOnEditProdPackage(String clickOnEditProdPackage) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() > 1);

            for (String tab : driver.getWindowHandles()) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            //
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.cssSelector(".loading, .overlay, .modal-backdrop")
            ));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("ContentPlaceHolder1_LinkButtonEdit")
            ));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", element
            );
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
             //
            //By locator = By.id("ContentPlaceHolder1_LinkButtonEdit");
            //utils.click(locator);
            System.out.println("Clicked on the Sales Edit product Package: " + clickOnEditProdPackage);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Product Package: " + clickOnEditProdPackage);
            throw e;
        }
    }
    public void PackProdPricing(String PackProdPricing) {
        try{
            String originalWindow = driver.getWindowHandle();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() > 1);
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement element = wait2.until(
                    ExpectedConditions.elementToBeClickable(By.id("mnuPrice"))
            );
            element.click();
            //By locator = By.xpath(String.format("//*[@id='mnuPrice']", PackProdPricing));
            //utils.click(locator);
            System.out.println("Clicked on the Sales Package Prod Pricing: " + PackProdPricing);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Package Prod Pricing: " + PackProdPricing);
            throw e;
        }
    }

    public void clickOnAddNewProdPricing(String clickOnAddNewProdPricing) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() > 1);
            for (String tab : driver.getWindowHandles()) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            //
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.cssSelector(".loading, .overlay, .modal-backdrop")
            ));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("Span2")
            ));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", element
            );
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            //
            //By locator = By.id("ContentPlaceHolder1_LinkButtonEdit");
            //utils.click(locator);
            System.out.println("Clicked on the Sales product Package Prod Pricing: " + clickOnAddNewProdPricing);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Product Package Prod Pricing: " + clickOnAddNewProdPricing);
            throw e;
        }
    }
    //Dropdown Package
    public void selectProdBusinessType(String selectProdBusinessType) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CProPricing_C_ddlBusinessTypeProductprice_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            //
            //utils.click(DDL_PPM_AFTER_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdBusinessType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdBusinessType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdBusinessType);
            throw e;
        }
    }
    public void selectProdBusinessSubType(String selectProdBusinessSubType) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CProPricing_C_ddlbusinessSubTypeProductPrice_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            //
            //utils.click(DDL_PPM_AFTER_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdBusinessSubType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdBusinessSubType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdBusinessSubType);
            throw e;
        }
    }
    public void selectProdBusinessUnitSizeType(String selectProdBusinessUnitSizeType) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CProPricing_C_ddlBusineUnitTypeProductPrice_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            //
            //utils.click(DDL_PPM_AFTER_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdBusinessUnitSizeType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdBusinessUnitSizeType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdBusinessUnitSizeType);
            throw e;
        }
    }
    public void selectProdArea(String selectProdArea) {
        try {
            //
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CProPricing_C_ddlAreaProductPrice_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            //
            //utils.click(DDL_PPM_AFTER_PROD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdArea));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdArea);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdArea);
            throw e;
        }
    }
    //Dropdown Package
    //Textbox Package
    public void ProdPrice(String ProdPrice) {
        utils.typeText(PROD_PRICING_PRICE, ProdPrice);
    }
    public void ProdValidFrom(String ProdValidFrom) {
        utils.typeText(PROD_VALID_FROM, ProdValidFrom);
    }
    public void ProdValidTo(String ProdValidTo) {
        utils.typeText(PROD_VALID_TO, ProdValidTo);
    }
    public void ProdPricingSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_PROD_PRICE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Textbox Package
    //Edit Pricing
    public void clickOnEditProdPricing(String clickOnEditProdPricing) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() > 1);
            for (String tab : driver.getWindowHandles()) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            //
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.cssSelector(".loading, .overlay, .modal-backdrop")
            ));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("ctl00_ContentPlaceHolder1_grdproductPrice_ctl00_ctl04_ImageButton1")
            ));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", element
            );
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            //
            //By locator = By.id("ContentPlaceHolder1_LinkButtonEdit");
            //utils.click(locator);
            System.out.println("Clicked on the Sales product Package Prod Pricing Edit: " + clickOnEditProdPricing);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Product Package Prod Pricing Edit: " + clickOnEditProdPricing);
            throw e;
        }
    }
    //Edit Pricing
    //End Prod Package

    //Product Rate Card
    public void clickOnSalesRateCard(String clickOnSalesRateCard) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[1]/li[4]/a", clickOnSalesRateCard));
            utils.click(locator);
            System.out.println("Clicked on Sales Leads Menu Rate Card: " + clickOnSalesRateCard);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Leads Menu Rate Card: " + clickOnSalesRateCard);
            throw e;
        }
    }
    public void clickOnAddRatecard(String clickOnAddRatecard) {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_BtnAdd");
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Rate Card: " + clickOnAddRatecard);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Rate Card: " + clickOnAddRatecard);
            throw e;
        }
    }
    public void RateCardNo(String RateCardNo) {
        utils.typeText(RATE_CARD_NO, RateCardNo);
    }
    public void RateCardName(String RateCardName) {
        utils.typeText(RATE_CARD_NAME, RateCardName);
    }
    public void ClickAddRateCardSave() {
        By[] saveButtons = {SAVE_BUTTON_RATECARD};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void SalesEnquiryRCClickGridFirstData(String SalesEnquiryRCClickGridFirstData) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdRateCard_ctl00__0']", SalesEnquiryRCClickGridFirstData));
            utils.click(locator);
            System.out.println("Clicked on RC Grid First data: " + SalesEnquiryRCClickGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the RC Grid First Data: " + SalesEnquiryRCClickGridFirstData);
            throw e;
        }
    }
    public void clickOnEditRatecard(String clickOnEditRatecard) {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_btnEditRateCard");
            utils.click(locator);
            System.out.println("Clicked on the Sales Edit Rate Card: " + clickOnEditRatecard);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Edit Rate Card: " + clickOnEditRatecard);
            throw e;
        }
    }
    public void ClickUpdateRateCard() {
        By[] saveButtons = {UPDATE_BUTTON_RATECARD};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void clickRateCardtoDelete() {
        utils.click(DELETE_FIRST_RATECARD_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void RateCardClickExportToExcel(String RateCardClickExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='radbtnExport']", RateCardClickExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Sales Rate Card " + RateCardClickExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Sales Rate Card " + RateCardClickExportToExcel);
            throw e;
        }
    }
    //Awaiting Approval
    public void clickOnSalesAwaitingApproval(String clickOnSalesAwaitingApproval) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[2]/li[3]/a", clickOnSalesAwaitingApproval));
            utils.click(locator);
            System.out.println("Clicked on Sales Awaiting Approval: " + clickOnSalesAwaitingApproval);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Awaiting Approval: " + clickOnSalesAwaitingApproval);
            throw e;
        }
    }
    public void AwaitingApprovallickGridFirstData(String AwaitingApprovallickGridFirstData) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']", AwaitingApprovallickGridFirstData));
            utils.click(locator);
            System.out.println("Clicked on Awaiting Approval Grid First data: " + AwaitingApprovallickGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Awaiting Approval Grid First Data: " + AwaitingApprovallickGridFirstData);
            throw e;
        }
    }
    public void AwaitingQuotationClickExportToExcel(String AwaitingQuotationClickExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='radbtnExport']", AwaitingQuotationClickExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel AwaitingQuotation " + AwaitingQuotationClickExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel AwaitingQuotation" + AwaitingQuotationClickExportToExcel);
            throw e;
        }
    }
    //Awaiting Quotation Approval
    public void clickOnSalesAwaitingQuotationApproval(String clickOnSalesAwaitingQuotationApproval) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[2]/li[4]/a", clickOnSalesAwaitingQuotationApproval));
            utils.click(locator);
            System.out.println("Clicked on Sales Awaiting Quot Approval: " + clickOnSalesAwaitingQuotationApproval);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Awaiting Quot Approval: " + clickOnSalesAwaitingQuotationApproval);
            throw e;
        }
    }
    public void AwaitingQuotApprovallickGridFirstData(String AwaitingQuotApprovallickGridFirstData) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdQTN_ctl00__0']", AwaitingQuotApprovallickGridFirstData));
            utils.click(locator);
            System.out.println("Clicked on Awaiting Quot Approval Grid First data: " + AwaitingQuotApprovallickGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Awaiting Quot Approval Grid First Data: " + AwaitingQuotApprovallickGridFirstData);
            throw e;
        }
    }
    public void AwaitingQuotationApprovalClickExportToExcel(String AwaitingQuotationApprovalClickExportToExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", AwaitingQuotationApprovalClickExportToExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel AwaitingQuotation Approval " + AwaitingQuotationApprovalClickExportToExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel AwaitingQuotation Approval" + AwaitingQuotationApprovalClickExportToExcel);
            throw e;
        }
    }
    //Upcoming Follow up
    public void clickOnSalesUpcomingFollowup(String clickOnSalesUpcomingFollowup) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[4]/li[2]/a", clickOnSalesUpcomingFollowup));
            utils.click(locator);
            System.out.println("Clicked on Sales Upcoming Follow Up: " + clickOnSalesUpcomingFollowup);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Upcoming Follow Up: " + clickOnSalesUpcomingFollowup);
            throw e;
        }
    }
    public void UpcomingFollowUpGridFirstData(String UpcomingFollowUpGridFirstData) throws InterruptedException {
        try {
            //
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[contains(@id,'GrdPendingEnquiry')]//tr[contains(@class,'rgRow') or contains(@class,'rgAltRow')]")
            );
            if (!rows.isEmpty()) {
                WebElement firstRow = rows.get(0);
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView({block:'center'});", firstRow
                );
                firstRow.click();
                System.out.println("Row is present and clicked");
            } else {
                System.out.println("No rows present in grid");
            }
             //
            //By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']", UpcomingFollowUpGridFirstData));
            //utils.click(locator);
            System.out.println("Clicked on Upcoming Follow up Grid First data: " + UpcomingFollowUpGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Upcoming Follow up Grid First Data: " + UpcomingFollowUpGridFirstData);
            throw e;
        }
    }
    //Awaiting Order
    public void clickOnSalesAwaitingOrder(String clickOnSalesAwaitingOrder) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[4]/li[3]/a", clickOnSalesAwaitingOrder));
            utils.click(locator);//*[@id="tab-sales"]/div[2]/div/ul[4]/li[3]/a
            System.out.println("Clicked on Sales Awaiting Order: " + clickOnSalesAwaitingOrder);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Awaiting Order: " + clickOnSalesAwaitingOrder);
            throw e;
        }
    }
    public void AwaitingOrderGridFirstData(String AwaitingOrderGridFirstData) throws InterruptedException {
        try {
            //
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[contains(@id,'GrdPendingEnquiry')]//tr[contains(@class,'rgRow') or contains(@class,'rgAltRow')]")
            );
            if (!rows.isEmpty()) {
                WebElement firstRow = rows.get(0);
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView({block:'center'});", firstRow
                );
                firstRow.click();
                System.out.println("Row is present and clicked");
            } else {
                System.out.println("No rows present in grid");
            }
            //
            //By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdPendingEnquiry_ctl00__0']", UpcomingFollowUpGridFirstData));
            //utils.click(locator);
            System.out.println("Clicked on Awaiting Order Grid First data: " + AwaitingOrderGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Awaiting Order Grid First Data: " + AwaitingOrderGridFirstData);
            throw e;
        }
    }
    //Archives sales Order
    public void clickOnSalesArchivesSalesOrder(String clickOnSalesArchivesSalesOrder) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[5]/li[2]/a", clickOnSalesArchivesSalesOrder));
            utils.click(locator);
            System.out.println("Clicked on Sales Archives Sales Order: " + clickOnSalesArchivesSalesOrder);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Archives Sales Order: " + clickOnSalesArchivesSalesOrder);
            throw e;
        }
    }
    public void ArchivesSalesOrderGridFirstData(String ArchivesSalesOrderGridFirstData) throws InterruptedException {
        try {
            //
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[contains(@id,'GrdPendingEnquiry')]//tr[contains(@class,'rgRow') or contains(@class,'rgAltRow')]")
            );
            if (!rows.isEmpty()) {
                WebElement firstRow = rows.get(0);
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView({block:'center'});", firstRow
                );
                firstRow.click();
                System.out.println("Row is present and clicked");
            } else {
                System.out.println("No rows present in grid");
            }
            System.out.println("Clicked on Archives Sales Order Grid First data: " + ArchivesSalesOrderGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Archives Sales Order Grid First Data: " + ArchivesSalesOrderGridFirstData);
            throw e;
        }
    }
    //Archives sales Order
    public void clickOnSalesOrderLost(String clickOnSalesOrderLost) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-sales']/div[2]/div/ul[5]/li[3]/a", clickOnSalesOrderLost));
            utils.click(locator);
            System.out.println("Clicked on Sales Order Lost: " + clickOnSalesOrderLost);
        } catch (Exception e) {
            System.out.println("Failed to click on Sales Order Lost: " + clickOnSalesOrderLost);
            throw e;
        }
    }
    public void SalesOrderLostGridFirstData(String SalesOrderLostGridFirstData) throws InterruptedException {
        try {
            //
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table[contains(@id,'GrdPendingEnquiry')]//tr[contains(@class,'rgRow') or contains(@class,'rgAltRow')]")
            );
            if (!rows.isEmpty()) {
                WebElement firstRow = rows.get(0);
                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].scrollIntoView({block:'center'});", firstRow
                );
                firstRow.click();
                System.out.println("Row is present and clicked");
            } else {
                System.out.println("No rows present in grid");
            }
            System.out.println("Clicked on Sales Order Lost Grid First data: " + SalesOrderLostGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Order Lost Grid First Data: " + SalesOrderLostGridFirstData);
            throw e;
        }
    }
}
