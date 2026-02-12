package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ReactiveServiceMasterPage extends BasePage {
    public ReactiveServiceMasterPage(WebDriver driver) {
        super(driver);
    }
    public static final By SG_NAME = By.id("radtxtServGrp");
    public static final By SG_DEPT_DD = By.cssSelector("[value='Select Department']");
    public static final By SAVE_BUTTON_SG = By.id("ctl00_ContentPlaceHolder1_RadWinServiceGrp_C_btnServGrp");
    public static final By SEARCH_SG = By.cssSelector("[alt='Filter ServiceGroupName column']");
    public static final By SEARCH_FIRST_SG_EDIT = By.id("ctl00_ContentPlaceHolder1_grdServiceGrp_ctl00__0");
    public static final By DELETE_FIRST_SG_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdServiceGrp_ctl00_ctl04_ImageButton1");

    public static final By FC_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinTask_C_radtxtTask");
    public static final By FC_DEPT_DD = By.cssSelector("[value='Select Service Group']");
    public static final By SAVE_BUTTON_FC = By.id("ctl00_ContentPlaceHolder1_RadWinTask_C_btnTaskOK");
    public static final By SEARCH_FC = By.cssSelector("[alt='Filter TaskName column']");
    public static final By SEARCH_FIRST_FC_EDIT = By.id("ctl00_ContentPlaceHolder1_grdTask_ctl00__0");
    public static final By DELETE_FIRST_FC_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTask_ctl00_ctl04_ImageButton1");

    public static final By FCODE_NAME = By.id("radtxtSubTask");
    public static final By FCODE_SG_DD = By.cssSelector("[value='Select Service Group']");
    public static final By FCODE_FC_DD = By.cssSelector("[value='Select Fault Category']");
    public static final By FCODE_WOTYPE_DD = By.cssSelector("[value='Select Work Order Type']");
    public static final By FCODE_RCA_DD = By.cssSelector("[value='Select Root Cause Applicability']");
    public static final By SAVE_BUTTON_FCODE = By.id("ctl00_ContentPlaceHolder1_RadWinSubTask_C_btnSubTask");
    public static final By SEARCH_FCODE = By.cssSelector("[alt='Filter SubTaskName column']");
    public static final By DELETE_FIRST_FCODE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdSubTask_ctl00_ctl04_ImageButton1");

    public static final By PRIORITY_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinPriority_C_radtxtPriority");
    public static final By PRIORITY_NOTES = By.id("radtxtNotes");
    public static final By PRIORITY_STATUS=By.id("ctl00_ContentPlaceHolder1_ctl00_ContentPlaceHolder1_RadWinPriority_C_rbPriorityActivePanel");
    public static final By SAVE_BUTTON_PRIORITY = By.id("ctl00_ContentPlaceHolder1_RadWinPriority_C_btnPriSave");
    public static final By SEARCH_PRIORITY = By.cssSelector("[alt='Filter PriorityName column']");
    public static final By SEARCH_FIRST_PRIORITY_EDIT = By.id("ctl00_ContentPlaceHolder1_grdPriority_ctl00__0");
    public static final By DELETE_FIRST_PRIORITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdPriority_ctl00_ctl04_imgDelete");

    public static final By WOSOURCE_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinWorkOrderSource_C_radtxtWOSourceName");
    public static final By SAVE_BUTTON_WOSOURCE = By.id("ctl00_ContentPlaceHolder1_RadWinWorkOrderSource_C_btnWOSourceOk");
    public static final By SEARCH_WOSOURCE = By.cssSelector("[alt='Filter WorkOrderSourceName column']");
    public static final By SEARCH_FIRST_WOSOURCE_EDIT = By.id("ctl00_ContentPlaceHolder1_grdWorkOrderSource_ctl00__0");
    public static final By DELETE_FIRST_WOSOURCE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdWorkOrderSource_ctl00_ctl04_ImageButton1");

    public void clickOnDataConfiguration(String dataConfiguration) throws InterruptedException {
        try {
            By locator = By.id("10");
            utils.click(locator);
            System.out.println("Clicked on the Data Config: " + dataConfiguration);
        } catch (Exception e) {
            System.out.println("Failed to click on the Data config: " + dataConfiguration);
            throw e;
        }
    }
    public void clickOnCoremastersRM(String clickOnCoremastersRM) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-datasetup']/div[2]/div/ul[1]/li[7]/a", clickOnCoremastersRM));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Menu: " + clickOnCoremastersRM);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Menu: " + clickOnCoremastersRM);
            throw e;
        }
    }
    public void clickOnAddSG(String btnAddSG) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSG));
            utils.click(locator);
            System.out.println("Clicked on the RM Add Service Group Button: " + btnAddSG);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Service Group Button: " + btnAddSG);
            throw e;
        }
    }
    public void enterSGName(String name) {
        utils.typeText(SG_NAME, name);
    }
    public void selectDepartment(String SGDepartment) {
        try {
            utils.click(SG_DEPT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", SGDepartment));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + SGDepartment);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + SGDepartment);
            throw e;
        }
    }
    public void userClicksOnSGSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_SG};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifySGcreation(String expectedTitle) {
        utils.typeText(SEARCH_SG, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id=ctl00_ContentPlaceHolder1_grdServiceGrp_ctl00__0]/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveSGtoEdit() {
        utils.click(SEARCH_FIRST_SG_EDIT);
    }
    public void clickActiveSGtoDelete() {
        utils.click(DELETE_FIRST_SG_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifySGDelete(String expectedTitle) {
        utils.typeText(SEARCH_SG, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    public void RMExportToExcel(String clickOnExporttoExcelRM) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelRM));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Service Group Button: " + clickOnExporttoExcelRM);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Excel Service Group Button: " + clickOnExporttoExcelRM);
            throw e;
        }
    }
    //Fault Category
    public void clickOnCoremastersRM_FC(String clickOnCoremastersRMFC) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[2]", clickOnCoremastersRMFC));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Fault Category: " + clickOnCoremastersRMFC);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Fault Category: " + clickOnCoremastersRMFC);
            throw e;
        }
    }
    public void clickOnAddFC(String btnAddFC) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddFC));
            utils.click(locator);
            System.out.println("Clicked on the RM Add Fault Category Button: " + btnAddFC);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Fault Category Button: " + btnAddFC);
            throw e;
        }
    }
    public void enterFCName(String name) {
        utils.typeText(FC_NAME, name);
    }
    public void selectFC(String FCSG) {
        try {
            utils.click(FC_DEPT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", FCSG));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + FCSG);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + FCSG);
            throw e;
        }
    }
    public void userClicksOnFCSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_FC};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyFCcreation(String expectedTitle) {
        utils.typeText(SEARCH_FC, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdTask_ctl00__0']/td[2]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveFCtoEdit() {
        utils.click(SEARCH_FIRST_FC_EDIT);
    }
    public void clickActiveFCtoDelete() {
        utils.click(DELETE_FIRST_FC_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyFCDelete(String expectedTitle) {
        utils.typeText(SEARCH_FC, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //Fault Code
    public void clickOnCoremastersRM_FCode(String clickOnCoremastersRMFCode) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[3]", clickOnCoremastersRMFCode));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Fault Code: " + clickOnCoremastersRMFCode);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Fault Code: " + clickOnCoremastersRMFCode);
            throw e;
        }
    }
    public void clickOnAddFCode(String btnAddFCode) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddFCode));
            utils.click(locator);
            System.out.println("Clicked on the RM Add Fault Code Button: " + btnAddFCode);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Fault Code Button: " + btnAddFCode);
            throw e;
        }
    }
    public void enterFCodeName(String name) {
        utils.typeText(FCODE_NAME, name);
    }
    public void selectFaultCodeSG(String FCodeSG) {
        try {
            utils.click(FCODE_SG_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", FCodeSG));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + FCodeSG);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + FCodeSG);
            throw e;
        }
    }
    public void selectFaultCodeFC(String FCodeFC) {
        try {
            utils.click(FCODE_FC_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", FCodeFC));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + FCodeFC);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + FCodeFC);
            throw e;
        }
    }
    public void selectFaultCodeWOType(String FCodeWOType) {
        try {
            utils.click(FCODE_WOTYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", FCodeWOType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + FCodeWOType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + FCodeWOType);
            throw e;
        }
    }
    public void selectFaultCodeRCA(String FCodeRCA) {
        try {
            utils.click(FCODE_RCA_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", FCodeRCA));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + FCodeRCA);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + FCodeRCA);
            throw e;
        }
    }
    public void userClicksOnFCodeSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_FCODE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyFCodecreation(String expectedTitle) {
        utils.typeText(SEARCH_FCODE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdSubTask_ctl00__0']/td[2]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveFCodetoDelete() {
        utils.click(DELETE_FIRST_FCODE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyFCodeDelete(String expectedTitle) {
        utils.typeText(SEARCH_FCODE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //Priority
    public void clickOnCoremastersRM_Priority(String clickOnCoremastersRMPriority) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[4]", clickOnCoremastersRMPriority));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Fault Code: " + clickOnCoremastersRMPriority);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Fault Code: " + clickOnCoremastersRMPriority);
            throw e;
        }
    }
    public void clickOnAddPriority(String btnAddPriority) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddPriority));
            utils.click(locator);
            System.out.println("Clicked on the RM Add Priority Button: " + btnAddPriority);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Priority Button: " + btnAddPriority);
            throw e;
        }
    }
    public void enterPriorityName(String name) {
        utils.typeText(PRIORITY_NAME, name);
    }
    public void enterPriorityNotes(String name) {
        utils.typeText(PRIORITY_NOTES, name);
    }
    public void SelectActiveCheckbox() {
        utils.click(PRIORITY_STATUS);
    }
    public void userClicksPrioritySaveButton() {
        By[] saveButtons = {SAVE_BUTTON_PRIORITY};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyPrioritycreation(String expectedTitle) {
        utils.typeText(SEARCH_PRIORITY, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdPriority_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActivePrioritytoEdit() {
        utils.click(SEARCH_FIRST_PRIORITY_EDIT);
    }
    public void clickActivePrioritytoDelete() {
        utils.click(DELETE_FIRST_PRIORITY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyPriorityDelete(String expectedTitle) {
        utils.typeText(SEARCH_PRIORITY, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //WO SOurce
    public void clickOnCoremastersRM_WOSource(String clickOnCoremastersRMWOSource) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[5]", clickOnCoremastersRMWOSource));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM WO Source: " + clickOnCoremastersRMWOSource);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM WO Source: " + clickOnCoremastersRMWOSource);
            throw e;
        }
    }
    public void clickOnAddWOSource(String btnAddWOSource) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddWOSource));
            utils.click(locator);
            System.out.println("Clicked on the RM Add WO Source Button: " + btnAddWOSource);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM WO Source Button: " + btnAddWOSource);
            throw e;
        }
    }
    public void enterWOSourceName(String name) {
        utils.typeText(WOSOURCE_NAME, name);
    }
    public void userClicksWOSourceSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_WOSOURCE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyWOSourcecreation(String expectedTitle) {
        utils.typeText(SEARCH_WOSOURCE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdWorkOrderSource_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveWOSourcetoEdit() {
        utils.click(SEARCH_FIRST_WOSOURCE_EDIT);
    }
    public void clickActiveWOSourcetoDelete() {
        utils.click(DELETE_FIRST_WOSOURCE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyWOSourceDelete(String expectedTitle) {
        utils.typeText(SEARCH_WOSOURCE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
}
