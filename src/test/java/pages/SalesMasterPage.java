package pages;

import org.openqa.selenium.*;
import utils.ElementUtils;

import static utils.JavaScriptExeUtil.jsClick;

public class SalesMasterPage extends BasePage {
    public SalesMasterPage(WebDriver driver) {
        super(driver);
    }

    public static final By CLIENT_TYPE_NAME_INPUT = By.id("radtxtClientType");
    public static final By SAVE_BUTTON_CLIENTTYPE = By.id("ctl00_ContentPlaceHolder1_RadWinClientType_C_btnClientTypeOk");
    public static final By SEARCH_CLIENTTYPE = By.cssSelector("[alt='Filter ClientTypeName column']");
    public static final By SEARCH_FIRST_CLIENT_TYPE_EDIT = By.id("ctl00_ContentPlaceHolder1_Client_Grid_ctl00__0");
    public static final By DELETE_FIRST_CLIENT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_Client_Grid_ctl00_ctl04_ImageButton1");
    public static final By ENQUIRY_TYPE_NAME_INPUT = By.id("radtxtEnquiryName");
    public static final By SAVE_BUTTON_ENQUIRYTYPE = By.id("ctl00_ContentPlaceHolder1_RadWinEnquirytype_C_btnEnquiryTypeSave");
    public static final By SEARCH_ENQUIRYTYPE = By.cssSelector("[alt='Filter EnqquiryTypeName column']");
    public static final By SEARCH_FIRST_ENQUIRY_TYPE_EDIT = By.id("ctl00_ContentPlaceHolder1_grd_EnquiryType_ctl00__0");
    public static final By SEARCH_FIRST_ENQUIRY_TYPE = By.id("ctl00_ContentPlaceHolder1_grd_EnquiryType_ctl00_ctl04_ImageButton1");
    public static final By ENQUIRY_SOURCE_NAME_INPUT = By.id("radtxtEnquirySource");
    public static final By SAVE_BUTTON_ENQUIRYSOURCE = By.id("ctl00_ContentPlaceHolder1_RadWinEnquirySource_C_btnEnquirySourceSave");
    public static final By SEARCH_ENQUIRYSOURCE = By.cssSelector("[alt='Filter EnquirySourceName column']");
    public static final By SEARCH_FIRST_ENQUIRY_SOURCE_DELETE = By.id("ctl00_ContentPlaceHolder1_grd_EnquirySource_ctl00_ctl04_ImageButton1");
    public static final By SEARCH_FIRST_ENQUIRY_SOURCE_EDIT = By.id("ctl00_ContentPlaceHolder1_grd_EnquirySource_ctl00__0");
    public static final By ENQUIRY_TANDC_INPUT = By.id("RadtxtTermsConditions");
    public static final By ENQUIRY_TANDC_INPUT_EDIT = By.id("RadtxtTermsConditionsEdit");
    public static final By SAVE_BUTTON_TANDC_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinTermsAndCon_C_btnTermsConditionsSave");
    public static final By SEARCH_ENQUIRYTANDC = By.cssSelector("[alt='Filter TermsandConditions column']");
    public static final By SEARCH_FIRST_ENQUIRYTANDC_EDIT = By.id("ctl00_ContentPlaceHolder1_grd_TermsAndCondition_ctl00__0");
    public static final By UPDATE_BUTTON_TANDC_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinTermsAndConEdit_C_btnTermsConditionsUpdate");
    public static final By SEARCH_FIRST_TANDC_DELETE = By.id("ctl00_ContentPlaceHolder1_grd_TermsAndCondition_ctl00_ctl04_ImageButton1");
    public static final By ENQUIRY_EXCLUSIONS_INPUT = By.id("RadtxtExclusions");
    public static final By SAVE_BUTTON_EXCLUSIONS_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinExclusion_C_btnExclusionSave");
    public static final By SEARCH_ENQUIRYEXCLUSIONS = By.cssSelector("[alt='Filter Exclutions column']");
    public static final By SEARCH_FIRST_EXCLUSIONS_EDIT = By.id("ctl00_ContentPlaceHolder1_grd_Exclusion_ctl00__0");
    public static final By SEARCH_FIRST_EXCLUSIONS_DELETE = By.id("ctl00_ContentPlaceHolder1_grd_Exclusion_ctl00_ctl04_ImageButton1");
    public static final By ENQUIRY_PAYMENTTERMS_INPUT = By.id("radtxtPaymentTerms");
    public static final By ENQUIRY_PAYMENTTERMS_INPUT_EDIT = By.id("radtxtPaymentTermsEdit");
    public static final By SAVE_BUTTON_PAYMENTTERMS_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPaymentTerms_C_btnPaymentTermsSave");
    public static final By SEARCH_ENQUIRYPAYMENTTERMS = By.cssSelector("[alt='Filter PaymentTerms column']");
    public static final By SEARCH_FIRST_PAYMENTTERMS_EDIT = By.id("ctl00_ContentPlaceHolder1_grd_PaymentsTerms_ctl00__0");
    public static final By UPDATE_BUTTON_PAYMENT_TERMS_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPaymentTermsEdit_C_btnPaymentTermsUpdate");
    public static final By SEARCH_FIRST_PAYMENTTERMS_DELETE = By.id("ctl00_ContentPlaceHolder1_grd_PaymentsTerms_ctl00_ctl04_ImageButton1");
    public static final By SEARCH_FIRST_QUOTATIONTYPES_EDIT = By.id("ctl00_ContentPlaceHolder1_grdQuotationType_ctl00__0");
    public static final By UPDATE_BUTTON_QUOTATION_TYPE_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinQuotationType_C_btnQuotationTypeSave");
    public static final By SEARCH_FIRST_QUOTATIONTYPES_DELETE = By.id("ctl00_ContentPlaceHolder1_grdQuotationType_ctl00_ctl04_ImageButton1");

    public void clickOnDataConfiguration(String dataConfiguration) throws InterruptedException {
        try {
            //By locator = By.xpath(String.format("//*[@class='nav-link active' and @id='10']", dataConfiguration));
            //By locator = By.xpath(String.format("//a[contains(@class, 'nav-link active') and @id='10']", dataConfiguration));
            By locator = By.id("10");
            utils.click(locator);
            System.out.println("Clicked on the Data Config: " + dataConfiguration);
        } catch (Exception e) {
            System.out.println("Failed to click on the Data config: " + dataConfiguration);
            throw e;
        }
    }

    public void clickOnadditionalmastersSales(String clickOnadditionalmastersSales) throws InterruptedException {
        try {
            //By locator = By.xpath(String.format("//*[@class='nav-link active' and @id='10']", dataConfiguration));
            By locator = By.xpath(String.format("//*[@id='tab-datasetup']/div[2]/div/ul[2]/li[2]/a", clickOnadditionalmastersSales));
            utils.click(locator);
            System.out.println("Clicked on additional masters Sales Menu: " + clickOnadditionalmastersSales);
        } catch (Exception e) {
            System.out.println("Failed to click on additional masters Sales Menu: " + clickOnadditionalmastersSales);
            throw e;
        }
    }

    public void clickOnAddSalesclientType(String btnAddSalesClientType) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSalesClientType));
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Client type Button: " + btnAddSalesClientType);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Client type Button:: " + btnAddSalesClientType);
            throw e;
        }
    }

    public void enterClientType(String name) {
        utils.typeText(CLIENT_TYPE_NAME_INPUT, name);
    }

    public void userClicksOnSalesMasterSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_CLIENTTYPE,SAVE_BUTTON_ENQUIRYTYPE,SAVE_BUTTON_ENQUIRYSOURCE,SAVE_BUTTON_TANDC_INPUT,
                SAVE_BUTTON_EXCLUSIONS_INPUT,SAVE_BUTTON_PAYMENTTERMS_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                //utils.click(button);
                //return;
                WebElement element = driver.findElement(button);
                jsClick(driver, element);
                utils.waitUntilInvisible(button);
                ElementUtils.waitForLoaderToDisappear();
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //
    public void clickSaveButtonInlineError() {
        By[] saveButtons = {SAVE_BUTTON_CLIENTTYPE,SAVE_BUTTON_ENQUIRYTYPE,SAVE_BUTTON_ENQUIRYSOURCE,SAVE_BUTTON_TANDC_INPUT,
                SAVE_BUTTON_EXCLUSIONS_INPUT,SAVE_BUTTON_PAYMENTTERMS_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
//                WebElement element = driver.findElement(button);
//                jsClick(driver, element);
//                utils.waitUntilInvisible(button);
//                ElementUtils.waitForLoaderToDisappear();
//                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

 //
    public void verifyClientTypecreation(String expectedTitle) {
        utils.typeText(SEARCH_CLIENTTYPE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_Client_Grid_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void clickActiveClientTypetoEdit() {
        utils.click(SEARCH_FIRST_CLIENT_TYPE_EDIT);
    }

    public void clickActiveSalesMastertoDelete() {
        //utils.click(DELETE_FIRST_CLIENT_TYPE_IN_LIST);
        //
            By[] deleteButtons = {DELETE_FIRST_CLIENT_TYPE_IN_LIST,SEARCH_FIRST_ENQUIRY_TYPE,SEARCH_FIRST_ENQUIRY_SOURCE_DELETE,
                    SEARCH_FIRST_TANDC_DELETE,SEARCH_FIRST_EXCLUSIONS_DELETE,SEARCH_FIRST_PAYMENTTERMS_DELETE,SEARCH_FIRST_QUOTATIONTYPES_DELETE};
            for (By button : deleteButtons) {
                if (utils.isElementVisible(button)) {
                    utils.click(button);
                    Alert alert = driver.switchTo().alert();
                    alert.accept();
                    return;
                }
            }
            throw new RuntimeException("No Delete button is present on the page.");
    }

    public void verifyClientTypeDelete(String expectedTitle) {
        utils.typeText(SEARCH_CLIENTTYPE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    public void ClientTypeclickExportToExcel(String clickOnExporttoExcelClienttypeButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelClienttypeButton));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Sales Client Type Button: " + clickOnExporttoExcelClienttypeButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Sales Client Type Button: " + clickOnExporttoExcelClienttypeButton);
            throw e;
        }
    }
// Enquiry Type
    public void clickOnEnquiryType(String clickOnEnquiryType) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div/div/div[1]/div/div/div[1]/div/div/div/a[2]", clickOnEnquiryType));
            //*[@id="ctl00_ContentPlaceHolder1_RadAjxPanel1"]/div/div/div/div[1]/div/div/div[1]/div/div/div/a[2]
            utils.click(locator);
            System.out.println("Clicked on the Enquiry Type: " + clickOnEnquiryType);
        } catch (Exception e) {
            System.out.println("Failed to click on the Enquiry Type " + clickOnEnquiryType);
            throw e;
        }
    }

    public void clickOnAddSalesenquiryType(String btnAddSalesEnquiryType) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSalesEnquiryType));
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Enquiry type Button: " + btnAddSalesEnquiryType);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Enquiry type Button:: " + btnAddSalesEnquiryType);
            throw e;
        }
    }

    public void enterEnquiryType(String name) {
        utils.typeText(ENQUIRY_TYPE_NAME_INPUT, name);
    }

    public void userClicksOnEnquiryTypeSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_ENQUIRYTYPE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void verifyEnquiryTypecreation(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYTYPE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_Client_Grid_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void clickActiveEnquiryTypetoEdit() {
        utils.click(SEARCH_FIRST_ENQUIRY_TYPE_EDIT);
    }

    public void clickActiveEnquiryTypetoDelete() {
        utils.click(SEARCH_FIRST_ENQUIRY_TYPE);
        //driver.switchTo().activeElement();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyEnquiryTypeDelete(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYTYPE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }

    public void EnquiryTypeclickExportToExcel(String clickOnExporttoExcelEnquirytypeButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelEnquirytypeButton));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Sales Enquiry Type Button: " + clickOnExporttoExcelEnquirytypeButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Sales Enquiry Type Button: " + clickOnExporttoExcelEnquirytypeButton);
            throw e;
        }
    }

    //Enquiry Source
    public void clickOnEnquirySource(String clickOnEnquirySource) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div/div/div[1]/div/div/div[1]/div/div/div/a[3]", clickOnEnquirySource));
            //*[@id="ctl00_ContentPlaceHolder1_RadAjxPanel1"]/div/div/div/div[1]/div/div/div[1]/div/div/div/a[2]
            utils.click(locator);
            System.out.println("Clicked on the Enquiry Source: " + clickOnEnquirySource);
        } catch (Exception e) {
            System.out.println("Failed to click on the Enquiry Source " + clickOnEnquirySource);
            throw e;
        }
    }

    public void clickOnAddSalesenquirySource(String btnAddSalesEnquirySource) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSalesEnquirySource));
            utils.click(locator);
            System.out.println("Clicked on the Sales Add Enquiry Source Button: " + btnAddSalesEnquirySource);
        } catch (Exception e) {
            System.out.println("Failed to click on the Sales Add Enquiry Source Button:: " + btnAddSalesEnquirySource);
            throw e;
        }
    }

    public void enterEnquirySource(String name) {
        utils.typeText(ENQUIRY_SOURCE_NAME_INPUT, name);
    }

    public void userClicksOnEnquirySourceSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_ENQUIRYSOURCE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void verifyEnquirySourcecreation(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYSOURCE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_Client_Grid_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void clickActiveEnquirySourcetoEdit() {
        utils.click(SEARCH_FIRST_ENQUIRY_SOURCE_EDIT);
    }

    public void clickActiveEnquirySourcetoDelete() {
        utils.click(SEARCH_FIRST_ENQUIRY_SOURCE_DELETE);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyEnquirySourceDelete(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYSOURCE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }

    public void EnquirySourceclickExportToExcel(String clickOnExporttoExcelEnquirySourceButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelEnquirySourceButton));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Sales Enquiry Source Button: " + clickOnExporttoExcelEnquirySourceButton);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Sales Enquiry Source Button: " + clickOnExporttoExcelEnquirySourceButton);
            throw e;
        }
    }

    //Terms and Conditions
    public void clickOnSalesMasterTandC(String btnAddSalesTandC) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div/div/div[1]/div/div/div[1]/div/div/div/a[4]", btnAddSalesTandC));
            utils.click(locator);
            System.out.println("Clicked on the Terms and Conditions: " + btnAddSalesTandC);
        } catch (Exception e) {
            System.out.println("Failed to click on the Terms and Conditions " + btnAddSalesTandC);
            throw e;
        }
    }

    public void clickOnAddSalesMasterTandC(String btnAddSalesMasterTandC) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSalesMasterTandC));
            utils.click(locator);
            System.out.println("Clicked on the Terms and Conditions Button: " + btnAddSalesMasterTandC);
        } catch (Exception e) {
            System.out.println("Failed to click on the Terms and Conditions Button:: " + btnAddSalesMasterTandC);
            throw e;
        }
    }

    public void enterEnquiryTandC(String name) {
        utils.typeText(ENQUIRY_TANDC_INPUT_EDIT, name);
    }

    public void userClicksOnEnquiryTandCSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_TANDC_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void verifyEnquiryTandCcreation(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYTANDC, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grd_TermsAndCondition_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void clickActiveTandCtoEdit() {
        utils.click(SEARCH_FIRST_ENQUIRYTANDC_EDIT);
    }

    public void userClicksOnEnquiryTandCUpdateButton() {
        By[] saveButtons = {UPDATE_BUTTON_TANDC_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No update button is present on the page.");
    }

    public void clickActiveTandCtoDelete() {
        utils.click(SEARCH_FIRST_TANDC_DELETE);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyTandCDelete(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYTANDC, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }

    public void EnquiryTandCclickExportToExcel(String clickOnExporttoExcelTandC) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelTandC));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Sales TandC Button: " + clickOnExporttoExcelTandC);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Sales TandC Button: " + clickOnExporttoExcelTandC);
            throw e;
        }
    }

    //Sales Exclusion
    public void clickOnSalesMasterExclusion(String btnAddSalesExclusion) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div/div/div[1]/div/div/div[1]/div/div/div/a[5]", btnAddSalesExclusion));
            utils.click(locator);
            System.out.println("Clicked on the Terms and Conditions: " + btnAddSalesExclusion);
        } catch (Exception e) {
            System.out.println("Failed to click on the Terms and Conditions " + btnAddSalesExclusion);
            throw e;
        }
    }

    public void clickOnAddSalesMasteExclusions(String btnAddSalesMasterExclusions) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSalesMasterExclusions));
            utils.click(locator);
            System.out.println("Clicked on the Exclusions Button: " + btnAddSalesMasterExclusions);
        } catch (Exception e) {
            System.out.println("Failed to click on the Exclusions Button:: " + btnAddSalesMasterExclusions);
            throw e;
        }
    }

    public void enterEnquiryExclusions(String name) {
        utils.typeText(ENQUIRY_EXCLUSIONS_INPUT, name);
    }

    public void userClicksOnEnquiryExclusionsSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_EXCLUSIONS_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void verifyEnquiryExclueionscreation(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYEXCLUSIONS, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grd_Exclusion_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void clickActiveEnquiryExclusiontoEdit() {
        utils.click(SEARCH_FIRST_EXCLUSIONS_EDIT);
    }

    public void clickActiveExclusiontoDelete() {
        utils.click(SEARCH_FIRST_EXCLUSIONS_DELETE);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyExclusionsDelete(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYEXCLUSIONS, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }

    public void EnquiryExclusionclickExportToExcel(String clickOnExporttoExcelExclusions) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelExclusions));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Sales Exclusions Button: " + clickOnExporttoExcelExclusions);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Sales Exclusions Button: " + clickOnExporttoExcelExclusions);
            throw e;
        }
    }

    //Payment Terms
    public void clickOnSalesMasterPaymentTerms(String btnAddPaymentTerms) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div/div/div[1]/div/div/div[1]/div/div/div/a[6]", btnAddPaymentTerms));
            utils.click(locator);
            System.out.println("Clicked on the Terms and Conditions: " + btnAddPaymentTerms);
        } catch (Exception e) {
            System.out.println("Failed to click on the Terms and Conditions " + btnAddPaymentTerms);
            throw e;
        }
    }

    public void clickOnAddSalesMasterPaymentTerms(String btnAddSalesMasterPaymentTerms) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSalesMasterPaymentTerms));
            utils.click(locator);
            System.out.println("Clicked on the Payment Terms Button: " + btnAddSalesMasterPaymentTerms);
        } catch (Exception e) {
            System.out.println("Failed to click on the Payment Terms Button:: " + btnAddSalesMasterPaymentTerms);
            throw e;
        }
    }

    public void enterEnquiryPaymentTerms(String name) {
        utils.typeText(ENQUIRY_PAYMENTTERMS_INPUT_EDIT, name);
    }

    public void userClicksOnEnquiryPaymentTermsSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_PAYMENTTERMS_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void verifyEnquiryPaymentTermsCreate(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYPAYMENTTERMS, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grd_Exclusion_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void clickActivePaymentTermstoEdit() {
        utils.click(SEARCH_FIRST_PAYMENTTERMS_EDIT);
    }

    public void userClicksOnEnquiryPaymentTermsUpdateButton() {
        By[] saveButtons = {UPDATE_BUTTON_PAYMENT_TERMS_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No update button is present on the page.");
    }

    public void clickActivePaymentTermstoDelete() {
        utils.click(SEARCH_FIRST_PAYMENTTERMS_DELETE);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyPaymentTermsDelete(String expectedTitle) {
        utils.typeText(SEARCH_ENQUIRYPAYMENTTERMS, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }

    public void EnquiryclickExportToExcel(String clickOnExporttoExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Sales : " + clickOnExporttoExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Sales : " + clickOnExporttoExcel);
            throw e;
        }
    }

    //Quotation Types
    public void clickOnSalesMasterQuotationTypes(String btnQuotationTypes) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div/div/div[1]/div/div/div[1]/div/div/div/a[7]", btnQuotationTypes));
            utils.click(locator);
            System.out.println("Clicked on the Quotation Types: " + btnQuotationTypes);
        } catch (Exception e) {
            System.out.println("Failed to click on the Quotation Types " + btnQuotationTypes);
            throw e;
        }
    }

    public void clickActiveQuotationTypetoEdit() {
        utils.click(SEARCH_FIRST_QUOTATIONTYPES_EDIT);
    }

    public void userClicksOnEnquiryQuotTypesUpdateButton() {
        By[] saveButtons = {UPDATE_BUTTON_QUOTATION_TYPE_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No update button is present on the page.");
    }

    public void clickActiveQuotationTypestoDelete() {
        utils.click(SEARCH_FIRST_QUOTATIONTYPES_DELETE);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    //Quotation Line Types
    public void clickOnSalesMasterQuotationLineTypes(String btnQuotationLineTypes) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div/div/div[1]/div/div/div[1]/div/div/div/a[8]", btnQuotationLineTypes));
            utils.click(locator);
            System.out.println("Clicked on the Quotation Line Types: " + btnQuotationLineTypes);
        } catch (Exception e) {
            System.out.println("Failed to click on the Quotation Line Types " + btnQuotationLineTypes);
            throw e;
        }
    }

    //Quotation Other Cost
    public void clickOnSalesMasterOtherCost(String btnOtherCost) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div/div/div[1]/div/div/div[1]/div/div/div/a[9]", btnOtherCost));
            utils.click(locator);
            System.out.println("Clicked on the Other Cost: " + btnOtherCost);
        } catch (Exception e) {
            System.out.println("Failed to click on the Other Cost" + btnOtherCost);
            throw e;
        }
    }

    public void clickOnSaleOtherCostSortItemCode(String btnOtherCostSort) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdOtherCost_ctl00_Header']/thead/tr[1]/th[1]/a", btnOtherCostSort));
            utils.click(locator);
            System.out.println("Clicked on the Other Cost Sort based on Item code: " + btnOtherCostSort);
        } catch (Exception e) {
            System.out.println("Failed to click on the Other Cost Sort based on Item code" + btnOtherCostSort);
            throw e;
        }
    }

}




