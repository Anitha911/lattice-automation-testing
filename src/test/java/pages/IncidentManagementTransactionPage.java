package pages;
import org.json.JSONObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ExcelUtils;
import utils.TestDataGenerator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IncidentManagementTransactionPage extends BasePage {
    public IncidentManagementTransactionPage(WebDriver driver) {
        super(driver);
    }


    public static final By INCIDENT_LOCATION = By.id("ctl00_ContentPlaceHolder1_txtPlace1");
    public static final By INCIDENT_DEPARTMENT = By.id("ctl00_ContentPlaceHolder1_txtNameoftheOrgInvolved");
    public static final By INCIDENT_SAVE = By.id("ctl00_ContentPlaceHolder1_hlkAddNew");
    public static final By OPEN_INCIDENT_EXPORT_TO_EXCEL = By.id("btnExportToExcel");
    public static final By AWAITING_PRELIMINARY_REVIEW_EXPORT_TO_EXCEL = By.id("btnExportToExcel");
    public static final By CLOSED_INCIDENT_EXPORT_TO_EXCEL = By.id("ContentPlaceHolder1_btnExportToExcel");
    public static final By CANCELLED_INCIDENT_EXPORT_TO_EXCEL = By.id("ContentPlaceHolder1_btnExportToExcel");
    public static final By REGISTER_INCIDENT_OPEN_INCIDENT = By.id("ContentPlaceHolder1_lnkbtnRedirectService");
    public static final By FIRST_OPEN_INCIDENT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_radgv_IncidentList_ctl00__0");
    public static final By INCIDENT_CANCEL_BUTTON = By.id("ctl00_ContentPlaceHolder1_btnCancelIncident");
    public static final By SUBMIT_CANCEL_INCIDENT_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWindCancelReason_C_btnSubmit");
    public static final By CANCEL_INCIDENT_REASON_SELECT = By.cssSelector("[value='Incident cancel reason']");
    public static final By INCIDENT_REMARKS_CANCEL = By.id("ctl00_ContentPlaceHolder1_RadWindCancelReason_C_txtRemarks");
    public static final By CLICK_DRAFT_SECTION = By.xpath("//p[contains(text(),'Draft')]");
    public static final By STAKEHOLDER_EDIT_ICON = By.id("ContentPlaceHolder1_Span8");
    public static final By CLICK_EDIT_BASE_UNIT = By.id("ContentPlaceHolder1_Span4");
    public static final By PERSON_REPORTING_INCIDENT_SELECT = By.cssSelector("[value='Select Person reporting the incident']");
    public static final By INJURED_PERSON_NAME_AND_DESG_SELECT = By.cssSelector("[value='Select Name and Designation of injured person']");
    public static final By RESPONSIBLE_MANAGER_SELECT = By.cssSelector("[value='Select Name of responsible manager']");
    public static final By REPORT_WRITTEN_BY_SELECT = By.cssSelector("[value='Select airline report written by']");
    public static final By INCIDENT_RELATED_TO_SELECT = By.cssSelector("[value='Select Incident Related to']");
    public static final By STAKEHOLDER_SUBMIT_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinStakeHoldPopup_C_RadBtn_Save_StakeHold");
    public static final By BASE_UNIT_SUBMIT_BUTTON = By.id("ctl00_ContentPlaceHolder1_BaseUnitPopup_C_RadBtn_UpdateBaseUnit");
    public static final By BASE_UNIT_SELECT = By.cssSelector("[value='ALPH D R1063/GROUND FLOOR/APT LULU-R1063-GF-G23']");
    public static final By INCIDENT_SUBMIT_BUTTON = By.id("ctl00_ContentPlaceHolder1_BtnSendToSP");
    public static final By SUBMIT_APPROVAL_INCIDENT_BUTTON = By.id("ctl00_ContentPlaceHolder1_DivSendToSPApprove_C_btn_SendToSp");
    public static final By APPROVAL_INCIDENT_REASON_SELECT = By.cssSelector("[value='Select Reason']");
    public static final By INCIDENT_REMARKS_APPROVAL = By.id("ctl00_ContentPlaceHolder1_DivSendToSPApprove_C_TextBox5");
    public static final By AWAITING_ECM_APPROVAL_TAB = By.xpath("//div[p[contains(text(),'Awaiting ECM Approval')]]");
    public static final By APPROVE_BUTTON_APPROVAL_LOGIN = By.id("ctl00_ContentPlaceHolder1_rptApprovalButtons_ctl00_btn_Action");
    public static final By INCIDENT_APPROVAL_COMMENTS = By.id("ctl00_ContentPlaceHolder1_RadWinAction_C_ApprovalForm1_txtRemarks");
    public static final By INCIDENT_APPROVE_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinAction_C_ApprovalForm1_RadButlnkBtnSaveton1");
    public static final By WO_GENERATED_TAB = By.xpath("//div[p[contains(text(),'WO Generated')]]");

    public static final By FIRST_INCIDENT_NUMBER_APPROVAL = By.xpath("(//table[contains(@id,'IncidentList')]//tr[contains(@class,'rgRow') or contains(@class,'rgAltRow')][1]/td[1])");


    public void userClicksOnThesection(String tabTitle) {
        try {
            By locator = By.xpath(String.format("//div[@id='tab-incident']//a[text()='%s']", tabTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabTitle);
            throw e;
        }
    }

    public void enterIncident_Location(String Incident_Location) {
        utils.typeText(INCIDENT_LOCATION, Incident_Location);
    }

    public void enterIncident_Department(String Incident_Department) {
        utils.typeText(INCIDENT_DEPARTMENT, Incident_Department);
    }

    public void clickIncidentSaveButton() {
        utils.click(INCIDENT_SAVE);
    }

//    Open Incidents

    public void clickOnRegisterIncidentbutton() {
        utils.click(REGISTER_INCIDENT_OPEN_INCIDENT);
    }


    public void clickontheSubmitbuttoninthedetailpage() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        utils.click(INCIDENT_SUBMIT_BUTTON);
    }

    public void selectIncidentApprovalReason(String ApprovalReason) {
        try {
            utils.click(APPROVAL_INCIDENT_REASON_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ApprovalReason));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + ApprovalReason);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + ApprovalReason);
            throw e;
        }
    }


    public void enterIncident_Remarks_Approval(String Incident_Remarks_Approval) {
        utils.typeText(INCIDENT_REMARKS_APPROVAL, Incident_Remarks_Approval);
    }

    public void ClicksonSubmitApprovalSubmissionButton() {
        utils.click(SUBMIT_APPROVAL_INCIDENT_BUTTON);
    }

//    Incident - Awaiting Preliminary Reviews

    public void clickonStakeholderEditicon() {
        utils.click(STAKEHOLDER_EDIT_ICON);
    }

    public void selectDropdownValue(String fieldName, String value) {

        By dropdown = null;

        if (fieldName.equalsIgnoreCase("Person reporting the incident")) {
            dropdown = PERSON_REPORTING_INCIDENT_SELECT;
        } else if (fieldName.equalsIgnoreCase("Name and Designation of injured person")) {
            dropdown = INJURED_PERSON_NAME_AND_DESG_SELECT;
        } else if (fieldName.equalsIgnoreCase("Name of responsible manager")) {
            dropdown = RESPONSIBLE_MANAGER_SELECT;
        } else if (fieldName.equalsIgnoreCase("Airline report written by")) {
            dropdown = REPORT_WRITTEN_BY_SELECT;
        } else if (fieldName.equalsIgnoreCase("Incident Related To")) {
            dropdown = INCIDENT_RELATED_TO_SELECT;
        } else {
            throw new RuntimeException("Field not found: " + fieldName);
        }

        try {
            // ✅ Click dropdown
            utils.click(dropdown);

            // ✅ Select value
            By option = By.xpath("//li[contains(@class,'rcbItem') and contains(text(),'" + value + "')]");
            utils.click(option);

            // ✅ Close dropdown (VERY IMPORTANT for Telerik)
            driver.switchTo().activeElement().sendKeys(Keys.TAB);

            System.out.println("Selected: " + fieldName + " -> " + value);

        } catch (Exception e) {
            System.out.println("Failed: " + fieldName);
            throw e;
        }
    }


    public void clickonStakeholdersubmitbutton() {
        utils.click(STAKEHOLDER_SUBMIT_BUTTON);
    }


    public void selectIncidentRelatedCheckbox(String value) {

        try {
            // ✅ Dynamic checkbox locator based on label text
            By checkbox = By.xpath(
                    "//label[contains(text(),'" + value + "')]/preceding::input[@type='checkbox'][1]"
            );

            WebElement element = wait.until(
                    ExpectedConditions.elementToBeClickable(checkbox)
            );

            // ✅ Scroll (important)
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView(true);", element
            );

            // ✅ Click using JS (stable for UI)
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].click();", element
            );

            System.out.println("Selected checkbox: " + value);

        } catch (Exception e) {
            System.out.println("Failed to select checkbox: " + value);
            throw e;
        }
    }

    public void userclickEditBaseUniticon() {
        utils.click(CLICK_EDIT_BASE_UNIT);
    }

    public void selectBaseUnitDetail(String Baseunit) {
        try {
            utils.click(BASE_UNIT_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Baseunit));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + Baseunit);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + Baseunit);
            throw e;
        }
    }

    public void clickonBaseUnitSubmitButton() {
        utils.click(BASE_UNIT_SUBMIT_BUTTON);
    }


    public void scrollDownIncidentPage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(driver ->
                ((JavascriptExecutor) driver)
                        .executeScript("return document.readyState").equals("complete")
        );

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "var el = document.querySelector('[class*=autoScroll]');" +
                        "if(el){ el.scrollTop = el.scrollHeight; }"
        );
    }


//    Cancel Incidents

    public void clickOnDraftSection() {
        utils.click(CLICK_DRAFT_SECTION);
    }

    public void clickonFirstIncident() {
        utils.click(FIRST_OPEN_INCIDENT_IN_LIST);
    }

    public void clickonCancelIncidentButton() {
        {
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            utils.click(INCIDENT_CANCEL_BUTTON);
        }
    }

    public void selectIncidentCancelReason(String CancelReason) {
        try {
            utils.click(CANCEL_INCIDENT_REASON_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", CancelReason));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + CancelReason);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + CancelReason);
            throw e;
        }
    }

    public void enterIncident_Remarks(String Incident_Remarks) {
        utils.typeText(INCIDENT_REMARKS_CANCEL, Incident_Remarks);
    }

    public void ClicksonSubmitCancelIncidentButton() {
        utils.click(SUBMIT_CANCEL_INCIDENT_BUTTON);
    }


    //    Cancel Incidents - Verify

    public void verifyCancelledIncidentNumber() {
        // 🔹 Get stored incident number
        String incidentNo = TestContext.get("INCIDENT_NUMBER_STORED");

        if (incidentNo == null) {
            throw new RuntimeException("Incident number not stored!");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 🔹 Step 1: Search in grid
        By searchBox = By.xpath("//input[contains(@id,'FilterTextBox_IncidentNo')]");

        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBox)
        );

        search.clear();
        search.sendKeys(incidentNo);
        search.sendKeys(Keys.ENTER);   // 🔥 IMPORTANT

        // 🔹 Step 2: Verify incident appears in table
        By incidentCell = By.xpath("//td[contains(text(),'" + incidentNo + "')]");

        WebElement result = wait.until(
                ExpectedConditions.visibilityOfElementLocated(incidentCell)
        );

        String actualIncident = result.getText().trim();

        if (!actualIncident.equalsIgnoreCase(incidentNo)) {
            throw new AssertionError(
                    "Expected incident not found in Cancelled Incident  list"
            );
        }

        System.out.println("✅ Incident verified in Cancelled list: " + actualIncident);
    }


//    Incidents - Export To Excel

    public void clickIncidentExportToExcelButton() {
        By[] ExportToExcel = {OPEN_INCIDENT_EXPORT_TO_EXCEL, AWAITING_PRELIMINARY_REVIEW_EXPORT_TO_EXCEL,
                CLOSED_INCIDENT_EXPORT_TO_EXCEL, CANCELLED_INCIDENT_EXPORT_TO_EXCEL};
        for (By button : ExportToExcel) {
            if (utils.isElementVisible(button)) {
                utils.waitForElementToBeClickable(button);
                utils.click(button);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // best practice
                }
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

//Approval Window

    public void ClicksonAwaitingECMApprovaltab() {
        utils.click(AWAITING_ECM_APPROVAL_TAB);
    }

    public void ClicksonApprovebuttonApprovalLogin() {
        utils.click(APPROVE_BUTTON_APPROVAL_LOGIN);
    }

    public void enterIncident_Approval_Comments(String Incident_Approval_Comments) {
        utils.typeText(INCIDENT_APPROVAL_COMMENTS, Incident_Approval_Comments);
    }

    public void ClickSavebuttonintheApprovalpopup() {
        utils.click(INCIDENT_APPROVE_SAVE_BUTTON);
    }


    public void storeFirstIncidentNumber() {

        String incidentNo = utils.getText(FIRST_INCIDENT_NUMBER_APPROVAL).trim();

        TestContext.set("INCIDENT_NUMBER_STORED", incidentNo);

        System.out.println("Stored Incident Number: " + incidentNo);
    }

    // 🔹 Navigate back
    public void switchToMainTab(WebDriver driver) {

        // Get all opened tabs
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Switch to first tab (Incident List page)
        driver.switchTo().window(tabs.get(0));

        System.out.println("✅ Switched back to Incident List tab");
    }

    public void ClicksonWOGeneratedtab() {
        utils.click(WO_GENERATED_TAB);
    }

    public void verifyIncidentPresentInWOGeneratedList(WebDriver driver) {

        // 🔹 Get stored incident number
        String incidentNo = TestContext.get("INCIDENT_NUMBER_STORED");

        if (incidentNo == null) {
            throw new RuntimeException("Incident number not stored!");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 🔹 Step 1: Search in grid
        By searchBox = By.xpath("//input[contains(@id,'FilterTextBox_IncidentNo')]");

        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBox)
        );

        search.clear();
        search.sendKeys(incidentNo);
        search.sendKeys(Keys.ENTER);   // 🔥 IMPORTANT

        // 🔹 Step 2: Verify incident appears in table
        By incidentCell = By.xpath("//td[contains(text(),'" + incidentNo + "')]");

        WebElement result = wait.until(
                ExpectedConditions.visibilityOfElementLocated(incidentCell)
        );

        String actualIncident = result.getText().trim();

        if (!actualIncident.equalsIgnoreCase(incidentNo)) {
            throw new AssertionError(
                    "Expected incident not found in WO Generated list"
            );
        }

        System.out.println("✅ Incident verified in WO Generated list: " + actualIncident);
    }

    }

