package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.FrameworkException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import java.util.Random;

import static java.lang.Thread.sleep;

public class ScheduledMaintenanceTransactionPage  extends BasePage {
    public ScheduledMaintenanceTransactionPage(WebDriver driver) {
        super(driver);
    }

    public static String capturedScheduleNo;
    public static final By ADD_TASK_SHEET_BUTTON = By.id("ctl00_ContentPlaceHolder1_BtnAdd");
    public static final By TASK_SHEET_TYPE = By.id("ctl00_ContentPlaceHolder1_AddTasksheetWindow_C_ddlTaskSheetType_Arrow");
    public static final By TASK_SHEET_NAME = By.id("ctl00_ContentPlaceHolder1_AddTasksheetWindow_C_txtTaskSheetName");
    public static final By TASK_SHEET_CONTRACT_GROUP = By.id("ctl00_ContentPlaceHolder1_AddTasksheetWindow_C_ddlContractGroup_Arrow");
    public static final By TASK_SHEET_SERVICE_GROUP = By.id("ctl00_ContentPlaceHolder1_AddTasksheetWindow_C_ddlServiceGroup_Input");
    public static final By TASK_SHEET_ASSET_CLASS = By.xpath("//a[contains(@id,'ddlAssetClass_Arrow')]");
    public static final By TASK_SHEET_ASSET_MASTER_CATEGORY = By.xpath("//a[contains(@id,'ddlAssetMasterCategory_Arrow')]");
    public static final By TASK_SHEET_ASSET_CATEGORY = By.xpath("//a[contains(@id,'ddlAssetCategory_Arrow')]");
    public static final By TASK_SHEET_ASSET_SUB_CATEGORY = By.xpath("//a[contains(@id,'ddlAssetSubCategory_Arrow')]");
    public static final By TASK_SHEET_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_AddTasksheetWindow_C_btnSave");
    public static String Task_Sheet_Number;
    public static final By TASK_SHEET_HEADER = By.xpath("//div[contains(@class,'tasks-header')]//h3");

    public static final By TASK_SHEET_GRID_LIST_FIRST_RECORD = By.id("ctl00_ContentPlaceHolder1_grdTaskSheet_ctl00__0");
    public static final By TASK_SHEET_CLICK_TASK_DETAIL = By.id("munTaskDetails");
    public static final By TASK_HEADER_ADD_BUTTON = By.id("ctl00_ContentPlaceHolder1_radbtnHeader");
    public static final By TASK_HEADER_NAME = By.id("txtTaskHeader");
    public static final By TASK_HEADER_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinTaskHeader_C_btnTaskHeader");
    public static final By TASK_LINE_ADD_BUTTON = By.id("ctl00_ContentPlaceHolder1_radbtnLines");
    public static final By TASK_HEADER_SELECT = By.id("ctl00_ContentPlaceHolder1_RadWinTaskLines_C_raddrpTaskHead_Input");
    public static final By TASK_LINE_FREQUENCY = By.id("ctl00_ContentPlaceHolder1_RadWinTaskLines_C_raddrpFrequency_Input");
    public static final By TASK_LINE_TASK_TYPE_DROPDOWN =  By.id("ctl00_ContentPlaceHolder1_RadWinTaskLines_C_raddrpTaskType_Input");
    public static final By TASK_LINE_PARAMETER_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinTaskLines_C_raddrpMeteringParameter");
    public static final By TASK_LINE_DEFAULT_LOV_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinTaskLines_C_raddrpDefaultLOV_Input");
    public static final By TASK_LINE_DESCRIPTION = By.id("txtTaskDescription");
    public static final By TASK_LINE_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinTaskLines_C_btnAddTaskLines");
    public static final By TASK_SHEET_FINALISED_BUTTON = By.id("ctl00_ContentPlaceHolder1_btnFinalize");
    public static final By TASK_SHEET_VERIFICATION_SUBMIT_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadVerificationSubmitRequest_C_btnFinalizeSubmit");

    public static final By TASK_SHEET_APPROVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_rptApprovalButtons_ctl00_btn_Action");
    public static final By TASK_SHEET_APPROVAL_COMMENTS = By.id("ctl00_ContentPlaceHolder1_RadWinAction_C_ApprovalForm1_txtRemarks");
    public static final By TASK_SHEET_APPROVAL_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinAction_C_ApprovalForm1_RadButlnkBtnSaveton1");

    public static final By CONTRACT_CODE_SEARCH = By.id("ctl00_ContentPlaceHolder1_grdCustomerContract_ctl00_ctl02_ctl02_FilterTextBox_ContractCode");
    public static final By CLIENT_CONTRACT = By.id("ctl00_ContentPlaceHolder1_grdCustomerContract_ctl00");

    public static final By PPM_SCM_TASK_SHEETS_SECTION = By.xpath("//a[@id='mnuTaskSheet']");
    public static final By SS_TASK_SHEETS_SECTION = By.xpath("//a[@id='mnuSSTaskSheet']");
    public static final By LINK_PPM_TASK_SHEET_SECTION_BUTTON = By.xpath("//a[@id='ContentPlaceHolder1_Tasksheet_imglinkContact']");
    public static final By LINK_SS_TASK_SHEET_SECTION_BUTTON =  By.xpath("//a[@id='ContentPlaceHolder1_SSTasksheet_imglinkContact']");
    public static final By PPM_TASK_SHEET_SEARCH_BOX =  By.id("ctl00_ContentPlaceHolder1_Tasksheet_radTaskSheet_C_radtxtsearchTaskSheet");
    public static final By SS_TASK_SHEET_SEARCH_BOX =  By.id("ctl00_ContentPlaceHolder1_SSTasksheet_radSSTaskSheets_C_radtxtsearchSSTaskSheets");
    public static final By LINK_PPM_TASK_SHEET_POPUP_BUTTON =  By.id("ctl00_ContentPlaceHolder1_Tasksheet_radTaskSheet_C_radFill");
    public static final By LINK_SS_TASK_SHEET_POPUP_BUTTON = By.id("ctl00_ContentPlaceHolder1_SSTasksheet_radSSTaskSheets_C_radFill");

    public static final By SCHEDULING_CONTRACT_CODE_SEARCH = By.id("ctl00_ContentPlaceHolder1_grdContract_ctl00_ctl02_ctl02_FilterTextBox_ContractCode");
    public static final By SCHEDULING_CLIENT_CONTRACT = By.id("ctl00_ContentPlaceHolder1_grdContract_ctl00__0");
    public static final By CONTRACT_DETAILS_TASK_SHEET_SEARCH = By.id("ctl00_ContentPlaceHolder1_grdScheduled_ctl00_ctl02_ctl02_FilterTextBox_TSNO");
    public static final By SCHEDULE_BUTTON_ASSET = By.id("ctl00_ContentPlaceHolder1_grdScheduled_ctl00_ctl04_btnAction");
    public static final By PPM_SCHEDULING_ASSET_CHECKBOXES = By.xpath("//table[contains(@id,'grdAsset')]//input[@type='checkbox']");
    public static final By PPM_SCHEDULING_ASSIGN_TO_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinPPMSchedule_C_ddlAssignTo_Arrow");
    public static final By PPM_SCHEDULING_START_DATE_CALENDAR = By.id("ctl00_ContentPlaceHolder1_RadWinPPMSchedule_C_dtpStartDate_popupButton");
    public static final By SCHEDULING_CALENDAR_DATES =By.xpath("//table[contains(@class,'rcMainTable')]//td[normalize-space()]");
    public static final By PPM_SCHEDULE_ELAPSE_DROPDOWN =By.id("ctl00_ContentPlaceHolder1_RadWinPPMSchedule_C_ddlPPMScheduleElapse_Arrow");
    public static final By PPM_SCHEDULING_APPLY_BUTTON =  By.id("ctl00_ContentPlaceHolder1_RadWinPPMSchedule_C_btnApply");
    public static final By PPM_SCHEDULING_ASSET_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinPPMSchedule_C_btnSaveSchedule");

    public static final By SS_SCHEDULING_ASSET_CHECKBOXES = By.xpath("//table[contains(@id,'grdSoftAssetList')]//input[@type='checkbox']");
    public static final By SS_SCHEDULING_ASSIGN_TO_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinPPMScheduleSoft_C_ddlSoftAssignTo_Arrow");
    public static final By SS_SCHEDULING_START_DATE_CALENDAR = By.id("ctl00_ContentPlaceHolder1_RadWinPPMScheduleSoft_C_dtpSoftStartDate_popupButton");
    public static final By SS_SCHEDULE_ELAPSE_DROPDOWN =By.id("ctl00_ContentPlaceHolder1_RadWinPPMScheduleSoft_C_ddlSoftcheduleElapse_Arrow");
    public static final By SS_SCHEDULING_APPLY_BUTTON =  By.id("ctl00_ContentPlaceHolder1_RadWinPPMScheduleSoft_C_btnSoftApply");
    public static final By SS_SCHEDULING_ASSET_SAVE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinPPMScheduleSoft_C_btnSoftSave");

    public static final By FIRST_SCHEDULE_NO = By.xpath("(//td/span[contains(@id,'lblvScheduleNo')])[1]");
    public static final By SELECT_FIRST_ASSET_TO_ACTIVATE = By.id("ctl00_ContentPlaceHolder1_grdActivatePPMSchedule_ctl00_ctl04_IdSelectCheckBox");
    public static final By ACTIVATE_SCHEDULE_BUTTON = By.id("ctl00_ContentPlaceHolder1_btnActivatePPMSchedule");

    public static final By CONSOLE_PPM_WO_SEARCH_TEXTBOX = By.id("ctl00_ContentPlaceHolder1_SearchBoxPPMWO_Input");
    public static final By CONSOLE_PPM_WO_FIRST_SEARCH_RESULT = By.id("ctl00_ContentPlaceHolder1_grdPPM_ctl00_ctl04_lblWONo");

    public static final By TASK_SHEET_EXPORT_TO_EXCEL = By.id("btnExportToExcel");
    public static final By SCHEDULE_EXPORT_TO_EXCEL = By.id("ContentPlaceHolder1_btnExportToExcel");
    public static final By ACTIVATION_SCHEDULES_EXPORT_TO_EXCEL = By.id("btnExportToExcel");
    public static final By CONSOLE_WO_EXPORT_TO_EXCEL = By.id("ctl00_ContentPlaceHolder1_btnExportToExcel");
    public static final By PENDING_ACTIONS_WO_EXPORT_TO_EXCEL = By.id("ContentPlaceHolder1_lnkExport");
    public static final By BULK_ASSIGNMENT_WO_EXPORT_TO_EXCEL = By.id("btnExportToExcel");
    public static final By ARCHIVE_WO_EXPORT_TO_EXCEL = By.id("btnExportToExcel");

    public void userclickonScheduledMaintenanceTitle(String sectionTitle) {
        try {
            By locator = By.xpath(String.format("//div[@id='tab-preventive']//a[text()='%s']", sectionTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + sectionTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + sectionTitle);
            throw e;
        }
    }


    public void clickPreventiveWO(String sectionName) {
        By locator = preventiveWO(sectionName);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView({block:'center'});", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Clicked Preventive WO under : " + sectionName);
    }

    public By preventiveWO(String sectionName) {
        return By.xpath("//li[translate(normalize-space(), " +
                        "'abcdefghijklmnopqrstuvwxyz', " +
                        "'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + sectionName.toUpperCase() + "']" +
                        "/following-sibling::li//a[normalize-space()='Preventive WO'][1]");
    }

    public void clickRoutineWO(String sectionName) {
        By locator = routineWO(sectionName);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView({block:'center'});", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        System.out.println("Clicked Routine WO under : " + sectionName);
    }

    public By routineWO(String sectionName) {
        return By.xpath("//li[translate(normalize-space(), " +
                "'abcdefghijklmnopqrstuvwxyz', " +
                "'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + sectionName.toUpperCase() + "']" +
                "/following-sibling::li//a[normalize-space()='Routine WO'][1]");
    }

    public void userclickonAddTaskSheetbutton() {
        utils.click(ADD_TASK_SHEET_BUTTON);
    }

    public void select_SS_Task_Sheet_Type(String SS_Task_Sheet_Type) {
        utils.click(TASK_SHEET_TYPE);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='" + SS_Task_Sheet_Type + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected SS_Task_Sheet_Type: " + SS_Task_Sheet_Type);
        wait.until(driver -> {
            String value = driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTasksheetWindow_C_txtTaskSheetNo"))
                    .getAttribute("value");
            return value != null && !value.trim().isEmpty();
        });
    }

    public void enter_SS_Task_Sheet_Name(String SS_Task_Sheet_Name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(TASK_SHEET_NAME));
        utils.typeText(TASK_SHEET_NAME, SS_Task_Sheet_Name);
    }

    public void select_PPM_Task_Sheet_Type(String PPM_Task_Sheet_Type) {
        utils.click(TASK_SHEET_TYPE);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='" + PPM_Task_Sheet_Type + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected PPM_Task_Sheet_Type: " + PPM_Task_Sheet_Type);
        wait.until(driver -> {
            String value = driver.findElement(By.id("ctl00_ContentPlaceHolder1_AddTasksheetWindow_C_txtTaskSheetNo"))
                    .getAttribute("value");
            return value != null && !value.trim().isEmpty();
        });
    }

    public void enter_PPM_Task_Sheet_Name(String PPM_Task_Sheet_Name) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(TASK_SHEET_NAME));
        utils.typeText(TASK_SHEET_NAME, PPM_Task_Sheet_Name);
    }

    public void selectTask_Sheet_Contract_Group(String Task_Sheet_Contract_Group) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(TASK_SHEET_CONTRACT_GROUP));
        utils.click(TASK_SHEET_CONTRACT_GROUP);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='" + Task_Sheet_Contract_Group + "']");
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected Task_Sheet_Contract_Group: " + Task_Sheet_Contract_Group);
    }

    public void selectTask_Sheet_Service_Group(String Task_Sheet_Service_Group) {
        utils.click(TASK_SHEET_SERVICE_GROUP);
        By option = By.xpath("//li[contains(@class,'rcbItem') and normalize-space()='" + Task_Sheet_Service_Group + "']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected Task_Sheet_Service_Group: " + Task_Sheet_Service_Group);
    }


    public void selectTaskSheetAssetRadComboBox(By arrow, String value, String idPart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        By dropdown = By.xpath("//div[contains(@id,'" + idPart + "_DropDown')]");
        By option = By.xpath("//div[contains(@id,'" + idPart + "_DropDown')]//li[normalize-space()='" + value + "']");
        for (int i = 0; i < 2; i++) {
            try {
                waitForLoaderToDisappear();
                wait.until(ExpectedConditions.elementToBeClickable(arrow)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(option));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", element);
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                } catch (Exception e) {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                }
                waitForLoaderToDisappear();
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("Retrying dropdown...");
            }
        }
    }

    public void waitForLoaderToDisappear() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//div[contains(@id,'LoadingPanel')]")));
    }

    public void selectTask_Sheet_Asset_Class() {
        wait.until(ExpectedConditions.elementToBeClickable(TASK_SHEET_ASSET_CLASS));
        selectTaskSheetAssetRadComboBox(TASK_SHEET_ASSET_CLASS, "ak asset master", "ddlAssetClass");
    }

    public void selectTask_Sheet_Asset_Master_Category() {
        wait.until(ExpectedConditions.elementToBeClickable(TASK_SHEET_ASSET_MASTER_CATEGORY)); // important wait
        selectTaskSheetAssetRadComboBox(TASK_SHEET_ASSET_MASTER_CATEGORY, "ak electronic items", "ddlAssetMasterCategory");
    }

    public void selectTask_Sheet_Asset_Category() {
        wait.until(ExpectedConditions.elementToBeClickable(TASK_SHEET_ASSET_CATEGORY));
        selectTaskSheetAssetRadComboBox(TASK_SHEET_ASSET_CATEGORY, "ak office electronic items", "ddlAssetCategory");
    }

    public void selectTask_Sheet_Asset_Sub_Category() {
        wait.until(ExpectedConditions.elementToBeClickable(TASK_SHEET_ASSET_SUB_CATEGORY)); // important wait
        selectTaskSheetAssetRadComboBox(TASK_SHEET_ASSET_SUB_CATEGORY, "ak laptop", "ddlAssetSubCategory");
    }

    public void UserclickTaskSheetSavebutton() {
        utils.click(TASK_SHEET_SAVE_BUTTON);
    }

    public String captureSavedTaskSheetNumber() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(TASK_SHEET_HEADER));
        String headerText = header.getText().trim();
        Task_Sheet_Number = headerText.split("\\R")[0].trim();
        saveTaskSheetNumber(Task_Sheet_Number);
        System.out.println("Captured Task Sheet Number : "+ Task_Sheet_Number);
        return Task_Sheet_Number;
    }


    public static void saveTaskSheetNumber(String taskSheetNo) {
        try {
            Files.write(Paths.get("TaskSheetNumber.txt"), taskSheetNo.getBytes());
            System.out.println("Task Sheet Number saved : " + taskSheetNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readTaskSheetNumber() {
        try {
            String taskSheetNo = Files.readString(Paths.get("TaskSheetNumber.txt")).trim();
            System.out.println("Stored Task Sheet Number : " + taskSheetNo);
            return taskSheetNo;
        } catch (Exception e) {
            throw new RuntimeException("Unable to read Task Sheet Number from file", e);
        }
    }

    // Creation of Task Header and Task Lines

    public void UserclickfirstrecordTaskSheetgridlist() {
        utils.doubleClick(TASK_SHEET_GRID_LIST_FIRST_RECORD);
    }

    public void UserclickTaskDetailsection() {
        utils.click(TASK_SHEET_CLICK_TASK_DETAIL);
    }

    public void UserclickAddTaskHeader() {
        utils.click(TASK_HEADER_ADD_BUTTON);
    }

    public void UserenterTaskHeaderName(String Task_Header_Name) {
        utils.typeText(TASK_HEADER_NAME, Task_Header_Name);
    }

    public void UserclickTaskHeadersavebutton() {
        utils.click(TASK_HEADER_SAVE_BUTTON);
    }

    public void UserclickAddTaskLine() {
    utils.click(TASK_LINE_ADD_BUTTON);
    }

    public void UserselectRandomTaskHeader() {
    selectTaskLineRandomRadComboValue(TASK_HEADER_SELECT,  By.xpath("//li[contains(@class,'rcbItem')]"));
    }

    public void UserselectRandomTaskLineFrequency() {
    selectTaskLineRandomRadComboValue(TASK_LINE_FREQUENCY, By.xpath("//li[contains(@class,'rcbItem')]"));
   }

    public String selectTaskLineRandomRadComboValue(By dropdown, By valuesLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element = wait.until( ExpectedConditions.elementToBeClickable(dropdown));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", element);
        element.sendKeys(Keys.ALT, Keys.ARROW_DOWN);
        List<WebElement> items = wait.until(driver -> {
         List<WebElement> all = driver.findElements(valuesLocator);
         List<WebElement> visible = new ArrayList<>();
        for (WebElement e : all) {
                try {
                    if (e.isDisplayed()
                            && e.isEnabled()
                            && !e.getText().trim().isEmpty()) {
                        visible.add(e);
                    }
                } catch (Exception ignored) {
                }
            } return visible.size() > 0 ? visible : null;
        });
        Random random = new Random();
        WebElement selected =  items.get(random.nextInt(items.size()));
        String value = selected.getText().trim();
        ((JavascriptExecutor) driver) .executeScript("arguments[0].scrollIntoView(true);", selected);
        wait.until(ExpectedConditions.elementToBeClickable(selected));
        ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", selected);
        System.out.println("Selected : " + value);
        return value;
    }

    public void UserselectTaskTypeAndDependentFields() {
    String selectedTaskType = selectTaskLineRandomRadComboValue(TASK_LINE_TASK_TYPE_DROPDOWN,
                        By.xpath("//div[contains(@id,'raddrpTaskType_DropDown')]//li[contains(@class,'rcbItem')]"));
    // WAIT FOR PAGE REFRESH / AJAX LOAD
        wait.until(driver -> ((JavascriptExecutor) driver)
         .executeScript("return document.readyState") .equals("complete"));

        // MEASUREMENT TASK
        if (selectedTaskType.equalsIgnoreCase("Measurement Task")) {
        wait.until(ExpectedConditions.elementToBeClickable(TASK_LINE_PARAMETER_DROPDOWN));
        selectTaskLineRandomParameter();
        }
        // LOV
        else if (selectedTaskType.equalsIgnoreCase("LOV")) {
            selectTaskLineRandomParameter();
           }
        // LOV M
        else if (selectedTaskType.equalsIgnoreCase("LOV M")) {
            wait.until(ExpectedConditions.elementToBeClickable(TASK_LINE_PARAMETER_DROPDOWN));
        }
        // COMMENTS
        else if (selectedTaskType.equalsIgnoreCase("Comments")) {
            wait.until(ExpectedConditions.elementToBeClickable( TASK_LINE_PARAMETER_DROPDOWN));
            selectTaskLineRandomParameter();
        }
        System.out.println("Task Type selection completed");
    }

    public void selectTaskLineRandomParameter() {
    selectTaskLineRandomRadComboValue(TASK_LINE_PARAMETER_DROPDOWN, By.xpath("//li[contains(@class,'rddlItem')]"));
    }

    public void UserenterTask_Line_Description(String Task_Line_Description) {
        utils.typeText(TASK_LINE_DESCRIPTION, Task_Line_Description);
    }

    public void UserclickTaskLinesavebutton() {
        utils.click(TASK_LINE_SAVE_BUTTON);
    }

    public void UserclickTaskSheetFinalisedbutton() {
        utils.click(TASK_SHEET_FINALISED_BUTTON);
    }

    public void UserclickTaskSheetVerificationSubmitbutton() {
        utils.click(TASK_SHEET_VERIFICATION_SUBMIT_BUTTON);
        System.out.println("Task Sheet Approval Sent Successfully");
    }


    //Task Sheet Approval Flow

    public void UserclickTaskSheetApprovebutton() {
        utils.click(TASK_SHEET_APPROVE_BUTTON);
    }

    public void UserenterTask_Sheet_Approval_Comments(String Task_Sheet_Approval_Comments) {
        utils.typeText(TASK_SHEET_APPROVAL_COMMENTS, Task_Sheet_Approval_Comments);
    }

    public void UserclickTaskSheetApprovalSavebutton() {
        utils.click(TASK_SHEET_APPROVAL_SAVE_BUTTON);
    }

// Link TasK Sheet To Contract Group

    public void UserSearchContractCodeClientContractgridlist() {
        WebElement contractCode = driver.findElement(CONTRACT_CODE_SEARCH);
        contractCode.clear();
        contractCode.sendKeys("CTR/2022/100011");
        contractCode.sendKeys(Keys.ENTER);
    }

    public void UserclickonClientContractGroup() {
        utils.click(CLIENT_CONTRACT);
            }

    public void linkStoredTaskSheetToContractGroup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String taskSheetNo = readTaskSheetNumber();
        if (taskSheetNo == null || taskSheetNo.trim().isEmpty()) {
            throw new RuntimeException("Task Sheet Number is empty");
        }
        String taskType = taskSheetNo.toUpperCase().trim();
        System.out.println("Task Sheet Number : " + taskSheetNo);
        WebElement searchBox;
        if (taskType.startsWith("PPM") || taskType.startsWith("SCM")) {
        WebElement ppmSection = wait.until(ExpectedConditions.elementToBeClickable(
                            PPM_SCM_TASK_SHEETS_SECTION));
     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ppmSection);
            System.out.println("PPM/SCM Section Opened");
            WebElement linkButton =  wait.until(ExpectedConditions.elementToBeClickable(
                            LINK_PPM_TASK_SHEET_SECTION_BUTTON));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", linkButton);
            System.out.println("PPM/SCM Link Popup Opened");
            searchBox =  wait.until(ExpectedConditions.visibilityOfElementLocated(PPM_TASK_SHEET_SEARCH_BOX));
        } else {
            WebElement ssSection = wait.until(ExpectedConditions.elementToBeClickable(
                            SS_TASK_SHEETS_SECTION));
            ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", ssSection);
            System.out.println("SS Section Opened");
            WebElement linkButton = wait.until(ExpectedConditions.elementToBeClickable(
                            LINK_SS_TASK_SHEET_SECTION_BUTTON));
            ((JavascriptExecutor) driver) .executeScript("arguments[0].click();", linkButton);
            System.out.println("SS Link Popup Opened");
            searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                            SS_TASK_SHEET_SEARCH_BOX));
        }
        searchBox.clear();
        searchBox.sendKeys(taskSheetNo);
        searchBox.sendKeys(Keys.ENTER);
        System.out.println("Searching : " + taskSheetNo);
        By resultRow = By.xpath("//td[contains(normalize-space(),'" + taskSheetNo + "')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultRow));
        System.out.println("Task Sheet Found");
        By rowCheckbox =  By.xpath(
                        "//td[contains(normalize-space(),'" + taskSheetNo + "')]" +
                                "/preceding-sibling::td//input[@type='checkbox']");
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(rowCheckbox));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", checkbox);
        System.out.println("Checkbox Selected");
        if (taskType.startsWith("PPM") || taskType.startsWith("SCM")) {
            WebElement finalLinkButton = wait.until(ExpectedConditions.elementToBeClickable(
                            LINK_PPM_TASK_SHEET_POPUP_BUTTON));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", finalLinkButton);
        } else {
            WebElement finalLinkButton =
                    wait.until(ExpectedConditions.elementToBeClickable(
                            LINK_SS_TASK_SHEET_POPUP_BUTTON));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", finalLinkButton);
        }
        System.out.println("Successfully Linked : " + taskSheetNo);
    }

    // PPM / SCM Scheduling

    public void UserSearchContractCodeSchedulinggridlist() {
            WebElement contractCode = driver.findElement(SCHEDULING_CONTRACT_CODE_SEARCH);
            contractCode.clear();
            contractCode.sendKeys("CTR/2022/100011");
            contractCode.sendKeys(Keys.ENTER);
        }

    public void UserclickonClientContractSchedulinggridlist() {
            utils.doubleClick(SCHEDULING_CLIENT_CONTRACT);
        }

    public void UsersearchcaptureTaskSheetNumberContractDetailsgridList() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String taskSheetNo = readTaskSheetNumber();
        if (taskSheetNo == null || taskSheetNo.trim().isEmpty()) {
            throw new RuntimeException("Stored Task Sheet Number is empty");
        }
        System.out.println("Searching Task Sheet : " + taskSheetNo);
        WebElement searchBox =  wait.until(ExpectedConditions.elementToBeClickable(CONTRACT_DETAILS_TASK_SHEET_SEARCH));
            searchBox.click();
            searchBox.sendKeys(Keys.CONTROL + "a");
            searchBox.sendKeys(Keys.DELETE);
            searchBox.sendKeys(taskSheetNo);
            searchBox.sendKeys(Keys.ENTER);
            By resultRow = By.xpath("//td[normalize-space()='" + taskSheetNo + "']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultRow));
        System.out.println("Task Sheet Found Successfully : " + taskSheetNo);
    }

    public void UserclickSchedulebuttontoScheduleAssets() {
        utils.click(SCHEDULE_BUTTON_ASSET);
    }

    public void scheduleAssetsForPPM() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Random random = new Random();
        List<WebElement> checkBoxes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
               PPM_SCHEDULING_ASSET_CHECKBOXES));
        int randomCheckbox = random.nextInt(checkBoxes.size());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBoxes.get(randomCheckbox));
        System.out.println("Random Asset Selected");

        WebElement assignDropdown = wait.until(ExpectedConditions.elementToBeClickable(PPM_SCHEDULING_ASSIGN_TO_DROPDOWN));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", assignDropdown);
        System.out.println("Assign dropdown opened");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> users = driver.findElements(By.xpath("//div[contains(@id,'ddlAssignTo_DropDown')]//li"));
        System.out.println("Users Found : " + users.size());
        users = users.stream()
                .filter(e -> e.isDisplayed())
                .filter(e -> !e.getText().trim().isEmpty())
                .toList();
        System.out.println("Valid Users Found : " + users.size());
        if (users.isEmpty()) {
            throw new RuntimeException("No Assign To values found");
        }
        WebElement randomUser = users.get(random.nextInt(users.size()));
        String selectedUser = randomUser.getText().trim();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomUser);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", randomUser);
        System.out.println("Random Assign To Selected : " + selectedUser);
        driver.findElement(By.tagName("body")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement calendarButton = wait.until(ExpectedConditions.elementToBeClickable(
               PPM_SCHEDULING_START_DATE_CALENDAR));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", calendarButton);
        System.out.println("Calendar Opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//table[contains(@class,'rcMainTable')]")));
        List<WebElement> allDates = driver.findElements(SCHEDULING_CALENDAR_DATES);
        List<WebElement> validDates = allDates.stream()
                .filter(WebElement::isDisplayed)
                .filter(e -> !e.getText().trim().isEmpty())
                .filter(e -> e.getText().matches("\\d+"))
                .toList();
        if (validDates.isEmpty()) {
            throw new RuntimeException("No dates found in calendar");
        }
        WebElement randomDate = validDates.get(random.nextInt(validDates.size()));
        String selectedDate = randomDate.getText().trim();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomDate);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", randomDate);
        System.out.println("Date Selected : " + selectedDate);

        WebElement scheduleElapseDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                PPM_SCHEDULE_ELAPSE_DROPDOWN));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", scheduleElapseDropdown);
        System.out.println("Schedule Elapse dropdown opened");
        List<String> scheduleOptions = Arrays.asList(
                "Elapse after Tolerance",
                "Elapse while generating next frequency PPM/SCM",
                "No Elapse");
        String selectedOption = scheduleOptions.get(random.nextInt(scheduleOptions.size()));
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[normalize-space()='" + selectedOption + "']")));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
        System.out.println("Schedule Elapse Selected : " + selectedOption);

        utils.click(PPM_SCHEDULING_APPLY_BUTTON);
        System.out.println("Apply Clicked");
    }

     public void UserClickSaveinthePPMSchedulingpopup(){
       utils.click(PPM_SCHEDULING_ASSET_SAVE_BUTTON);
      }

    // SS Scheduling


    public void scheduleAssetsForSS() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Random random = new Random();
        List<WebElement> checkBoxes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                SS_SCHEDULING_ASSET_CHECKBOXES));
        System.out.println("Checkboxes Found : " + checkBoxes.size());
        int randomCheckbox = random.nextInt(checkBoxes.size());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBoxes.get(randomCheckbox));
        System.out.println("Random Asset Selected");

        WebElement assignDropdown = wait.until(ExpectedConditions.elementToBeClickable(SS_SCHEDULING_ASSIGN_TO_DROPDOWN));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", assignDropdown);
        System.out.println("Assign dropdown opened");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> users = driver.findElements(By.xpath("//div[contains(@id,'ddlSoftAssignTo_DropDown')]//li"));
        System.out.println("Users Found : " + users.size());
        users = users.stream()
                .filter(e -> e.isDisplayed())
                .filter(e -> !e.getText().trim().isEmpty())
                .toList();
        System.out.println("Valid Users Found : " + users.size());
        if (users.isEmpty()) {
            throw new RuntimeException("No Assign To values found");
        }
        WebElement randomUser = users.get(random.nextInt(users.size()));
        String selectedUser = randomUser.getText().trim();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomUser);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", randomUser);
        System.out.println("Random Assign To Selected : " + selectedUser);
        driver.findElement(By.tagName("body")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement calendarButton = wait.until(ExpectedConditions.elementToBeClickable(
                SS_SCHEDULING_START_DATE_CALENDAR));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", calendarButton);
        System.out.println("Calendar Opened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//table[contains(@class,'rcMainTable')]")));
        List<WebElement> allDates = driver.findElements(SCHEDULING_CALENDAR_DATES);
        List<WebElement> validDates = allDates.stream()
                .filter(WebElement::isDisplayed)
                .filter(e -> !e.getText().trim().isEmpty())
                .filter(e -> e.getText().matches("\\d+"))
                .toList();
        if (validDates.isEmpty()) {
            throw new RuntimeException("No dates found in calendar");
        }
        WebElement randomDate = validDates.get(random.nextInt(validDates.size()));
        String selectedDate = randomDate.getText().trim();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomDate);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", randomDate);
        System.out.println("Date Selected : " + selectedDate);

        WebElement scheduleElapseDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                SS_SCHEDULE_ELAPSE_DROPDOWN));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", scheduleElapseDropdown);
        System.out.println("Schedule Elapse dropdown opened");
        List<String> scheduleOptions = Arrays.asList(
                "Elapse after Tolerance",
                "Elapse while generating next frequency SS",
                "No Elapse");
        String selectedOption = scheduleOptions.get(random.nextInt(scheduleOptions.size()));
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[normalize-space()='" + selectedOption + "']")));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", option);
        System.out.println("Schedule Elapse Selected : " + selectedOption);

        utils.click(SS_SCHEDULING_APPLY_BUTTON);
        System.out.println("Apply Clicked");
    }

    public void UserClickSaveinSSSchedulingpopup(){
        utils.click(SS_SCHEDULING_ASSET_SAVE_BUTTON);
    }

    public void captureFirstScheduleNo() {
        try {
      WebElement scheduleNoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                            FIRST_SCHEDULE_NO));
       capturedScheduleNo = scheduleNoElement.getText().trim();
       Files.write(Paths.get("ScheduleNo.txt"),
       capturedScheduleNo.getBytes());
            System.out.println("Captured Schedule No : "+ capturedScheduleNo);
        } catch (Exception e) {
            throw new RuntimeException("Failed to capture Schedule No", e);
        }
    }


    public void UserselectAssettoactivateSchedule(){
        utils.click(SELECT_FIRST_ASSET_TO_ACTIVATE);
    }

    public void UserclickonActivateSchedulebutton(){
        utils.click(ACTIVATE_SCHEDULE_BUTTON);
    }


//    PPMConsoleWindow

    public void searchCapturedScheduleNo() {
        try {
     String scheduleNo = Files.readString(Paths.get("ScheduleNo.txt")).trim();
     WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(
                            CONSOLE_PPM_WO_SEARCH_TEXTBOX));
            searchBox.clear();
            searchBox.sendKeys(scheduleNo);
            searchBox.sendKeys(Keys.ENTER);
            System.out.println( "Searching Schedule No : " + scheduleNo);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed to read Schedule No", e);
        }
    }

    public void doubleClickCapturedScheduleRecord() {
        utils.doubleClick(CONSOLE_PPM_WO_FIRST_SEARCH_RESULT);
        try {
        String scheduleNo = Files.readString(Paths.get("ScheduleNo.txt")).trim();
        System.out.println("Double clicked Schedule : " + scheduleNo);
        } catch (Exception e) {
        throw new RuntimeException("Failed to read Schedule No", e);
        }
    }

//Export To Excel

    public void clickonScheduledMaintenanceExportToExcelButton() {
        By[] ExportToExcel = {TASK_SHEET_EXPORT_TO_EXCEL, SCHEDULE_EXPORT_TO_EXCEL,
                ACTIVATION_SCHEDULES_EXPORT_TO_EXCEL, CONSOLE_WO_EXPORT_TO_EXCEL, PENDING_ACTIONS_WO_EXPORT_TO_EXCEL,
                BULK_ASSIGNMENT_WO_EXPORT_TO_EXCEL, ARCHIVE_WO_EXPORT_TO_EXCEL};
        for (By button : ExportToExcel) {
            if (utils.isElementVisible(button)) {
                utils.waitForElementToBeClickable(button);
                utils.click(button);
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // best practice
                }
                return;
            }
        }

    }
}






