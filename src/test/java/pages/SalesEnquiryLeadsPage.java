package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SalesEnquiryLeadsPage extends BasePage{
    public SalesEnquiryLeadsPage(WebDriver driver) {
        super(driver);
    }
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
            utils.click(CLIENTTYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ClientType));
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
            //By locator = By.xpath(String.format("//*[@id='radbtnExport']", SalesEnquiryclickGridFirstData));
            utils.click(ENQUIRY_GRID_FIRSTDATA);
            System.out.println("Clicked on Enquiry Grid First data: " + SalesEnquiryclickGridFirstData);
        } catch (Exception e) {
            System.out.println("Failed to click on the Enquiry Grid First Data: " + SalesEnquiryclickGridFirstData);
            throw e;
        }
    }
}
