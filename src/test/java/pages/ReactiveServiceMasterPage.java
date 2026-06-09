package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class ReactiveServiceMasterPage extends BasePage {
    public ReactiveServiceMasterPage(WebDriver driver) {
        super(driver);
    }
    String mainTab = driver.getWindowHandle();

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

    public static final By RC_NAME = By.id("radtxtRootCause");
    public static final By GENERIC_CHECKBOX=By.id("ctl00_ContentPlaceHolder1_RadWinRootCause_C_rdbRootCause_ctl03");
    public static final By SAVE_BUTTON_RC = By.id("ctl00_ContentPlaceHolder1_RadWinRootCause_C_btnRootCauseOk");
    public static final By SEARCH_RC = By.cssSelector("[alt='Filter Cause column']");
    public static final By SEARCH_FIRST_RC_EDIT = By.id("ctl00_ContentPlaceHolder1_grdRootCause_ctl00__0");
    public static final By DELETE_FIRST_RC_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdRootCause_ctl00_ctl04_ImageButton1");

    public static final By RESCODE_NAME = By.id("radtxtFailureCode");
    public static final By RESCODE_RC_DD = By.cssSelector("[value='Select Root Cause']");
    public static final By SAVE_BUTTON_RESCODE = By.id("ctl00_ContentPlaceHolder1_RadWinFailureCode_C_btnFailureCodeOk");
    public static final By SEARCH_RESCDE = By.cssSelector("[alt='Filter Resolution column']");
    public static final By SEARCH_FIRST_RESCDE_EDIT = By.id("ctl00_ContentPlaceHolder1_grdFailureCode_ctl00__0");
    public static final By DELETE_FIRST_RESCDE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdFailureCode_ctl00_ctl04_ImageButton1");

    public static final By PCR_NAME = By.id("txtPriorityReason");
    public static final By SAVE_BUTTON_PCR = By.id("ctl00_ContentPlaceHolder1_RadWinPriorityReason_C_btnWoPriReasonSave");
    public static final By SEARCH_PCR = By.cssSelector("[alt='Filter Reason column']");
    public static final By SEARCH_FIRST_PCR_EDIT = By.id("ctl00_ContentPlaceHolder1_grdPriorityReasons_ctl00__0");
    public static final By DELETE_FIRST_PCR_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdPriorityReasons_ctl00_ctl04_ImageButton1");

    public static final By CGCR_NAME = By.id("txtContractReason");
    public static final By SAVE_BUTTON_CGCR = By.id("ctl00_ContentPlaceHolder1_RadWinContractReason_C_btnContractReasonSave");
    public static final By SEARCH_CGCR = By.cssSelector("[alt='Filter Reason column']");
    public static final By SEARCH_FIRST_CGCR_EDIT = By.id("ctl00_ContentPlaceHolder1_grdContractReasons_ctl00__0");
    public static final By DELETE_FIRST_CGCR_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdContractReasons_ctl00_ctl04_ImageButton1");

    public static final By SLAFJ_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinSLAJustfication_C_RadTxtReasons");
    public static final By SLAFJ_SLATYPE_DD = By.cssSelector("[value='Select SLA Type']");
    public static final By SAVE_BUTTON_SLAFJ = By.id("ctl00_ContentPlaceHolder1_RadWinSLAJustfication_C_BtnSLAJustSave");
    public static final By SEARCH_SLAFJ = By.cssSelector("[alt='Filter Reason column']");
    public static final By SEARCH_FIRST_SLAFJ_EDIT = By.id("ctl00_ContentPlaceHolder1_grdSLAJustification_ctl00__0");
    public static final By DELETE_FIRST_SLAFJ_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdSLAJustification_ctl00_ctl04_ImageButton1");

    public static final By CTI_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinCTIReason_C_RadTxtCTIReason");
    public static final By SAVE_BUTTON_CTI = By.id("ctl00_ContentPlaceHolder1_RadWinCTIReason_C_BtnCTIReasonSave");
    public static final By SEARCH_CTI = By.cssSelector("[alt='Filter Reason column']");
    public static final By SEARCH_FIRST_CTI_EDIT = By.id("ctl00_ContentPlaceHolder1_grdCTIReason_ctl00__0");
    public static final By DELETE_FIRST_CTI_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdCTIReason_ctl00_ctl04_ImageButton1");

    public static final By SRR_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinSRReason_C_radtxtReason");
    public static final By SRR_TYPE_DD = By.cssSelector("[value='Select Type']");
    public static final By SAVE_BUTTON_SRR = By.id("ctl00_ContentPlaceHolder1_RadWinSRReason_C_btnSRReasonOk");
    public static final By SEARCH_SRR = By.cssSelector("[alt='Filter Reason column']");
    public static final By SEARCH_FIRST_SRR_EDIT = By.id("ctl00_ContentPlaceHolder1_grdSRReason_ctl00__0");
    public static final By DELETE_FIRST_SRR_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdSRReason_ctl00_ctl04_ImageButton1");

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
    public void SGPagination(String SGPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdServiceGrp']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdServiceGrp_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdServiceGrp']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + SGPagination);
            throw e;
        }
    }
    //SG Data per page check Starts
    public void SGDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdServiceGrp_ctl00_ctl03_ctl01_PageSizeComboBox")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //SG Data per page check ends
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
    public void FaultCategoryPagination(String FaultCategoryPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdTask']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdTask_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdTask']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + FaultCategoryPagination);
            throw e;
        }
    }
    //Fault Category Data per page check Starts
    public void FaultCategoryGridDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdTask_ctl00_ctl03_ctl01_PageSizeComboBox_Input")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //Fault Category Data per page check ends
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
    //FC Edit Start
    public void clickOnFirstDatainFCgrid() throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdSubTask_ctl00__0']"));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Fault Code first Data: "  );
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Fault Code First Data: " );
            throw e;
        }
    }
    public void clickOnFCodeManageFCButton() throws InterruptedException {
        try {
            Set<String> allTabs = driver.getWindowHandles();
            for (String tab : allTabs) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            //
            WebElement el = driver.findElement(By.id("imgAssetSubCategory"));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", el);
            //
            System.out.println("Clicked FCodeManageFCButton:");
        } catch (Exception e) {
            System.out.println("Failed to click on FCodeManageFCButton:");
            throw e;
        }
    }
    public void FCodeEditUpdateButton() throws InterruptedException {
        try {
            Set<String> allTabs = driver.getWindowHandles();
            for (String tab : allTabs) {
                if (!tab.equals(mainTab)) {
                    driver.switchTo().window(tab);
                    break;
                }
            }
            By locator = By.id("ctl00_ContentPlaceHolder1_RadWinSubTask_C_btnSubTask");
            utils.click(locator);
            //
            System.out.println("Clicked FCodeManageFCButton:");
        } catch (Exception e) {
            System.out.println("Failed to click on FCodeManageFCButton:");
            throw e;
        }
    }
    //FC Edit End
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
    //FC Pagination and Data per page starts
    public void FaultCodePagination(String FaultCodePagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdSubTask']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdSubTask_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdSubTask']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + FaultCodePagination);
            throw e;
        }
    }
    //Fault Category Data per page check Starts
    public void FaultCodeGridDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdSubTask_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //Fault Category Data per page check ends

    //FC Pagination and Data per Page Ends
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
    //Priority Pagination and Data per page starts
    public void PriorityPagination(String PriorityPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdPriority']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdPriority_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdPriority']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + PriorityPagination);
            throw e;
        }
    }
    //Priority Data per page check Starts
    public void PriorityDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdPriority_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //Priority Ends
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
    //WO Source Pagination and Data per page starts
    public void WOSourcePagination(String WOSourcePagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdWorkOrderSource']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdWorkOrderSource_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdWorkOrderSource']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + WOSourcePagination);
            throw e;
        }
    }
    //WO Source Data per page check Starts
    public void WOSourceDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdWorkOrderSource_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //WO SOurce Ends
    //Root Cause
    public void clickOnCoremastersRM_RC(String clickOnCoremastersRM_RC) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[6]", clickOnCoremastersRM_RC));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Root Cause: " + clickOnCoremastersRM_RC);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Root Cause: " + clickOnCoremastersRM_RC);
            throw e;
        }
    }
    public void clickOnAddRC(String btnAddRC) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddRC));
            utils.click(locator);
            System.out.println("Clicked on the RM Add Root Cause Button: " + btnAddRC);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Add Root Cause: " + btnAddRC);
            throw e;
        }
    }
    public void enterRCName(String name) {
        utils.typeText(RC_NAME, name);
    }
    public void SelectGenericCheckBox() {
        utils.click(GENERIC_CHECKBOX);
    }
    public void userClicksRCSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_RC};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyRCcreation(String expectedTitle) {
        utils.typeText(SEARCH_RC, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdRootCause_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveRCtoEdit() {
        utils.click(SEARCH_FIRST_RC_EDIT);
    }
    public void clickActiveRCtoDelete() {
        utils.click(DELETE_FIRST_RC_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyRCDelete(String expectedTitle) {
        utils.typeText(SEARCH_RC, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //Root Cause Pagination and Data per page starts
    public void RootCausePagination(String RootCausePagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdRootCause']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdRootCause_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdRootCause']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + RootCausePagination);
            throw e;
        }
    }
    //Root Cause Data per page check Starts
    public void RootCauseDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdRootCause_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //Resolution Code
    public void clickOnCoremastersRM_ResCde(String clickOnCoremastersRM_ResCde) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[1]/div/a[7]", clickOnCoremastersRM_ResCde));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Res Code: " + clickOnCoremastersRM_ResCde);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Res Code: " + clickOnCoremastersRM_ResCde);
            throw e;
        }
    }
    public void clickOnAddResCde(String btnAddResCde) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddResCde));
            utils.click(locator);
            System.out.println("Clicked on the RM Add Root Cause Button: " + btnAddResCde);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Add Root Cause: " + btnAddResCde);
            throw e;
        }
    }
    public void enterResolutionCode(String name) {
        utils.typeText(RESCODE_NAME, name);
    }
    public void selectRootCause(String RootCause) {
        try {
            utils.click(RESCODE_RC_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", RootCause));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + RootCause);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + RootCause);
            throw e;
        }
    }
    public void userClicksResCdeSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_RESCODE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyResCodecreation(String expectedTitle) {
        utils.typeText(SEARCH_RESCDE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdFailureCode_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveResCdetoEdit() {
        utils.click(SEARCH_FIRST_RESCDE_EDIT);
    }
    public void clickActiveResCdetoDelete() {
        utils.click(DELETE_FIRST_RESCDE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyResCdeDelete(String expectedTitle) {
        utils.typeText(SEARCH_RESCDE, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //Resolution Code Pagination and Data per page starts
    public void ResolutionCodePagination(String ResolutionCodePagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdFailureCode']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdFailureCode_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdFailureCode']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + ResolutionCodePagination);
            throw e;
        }
    }
    //Resolution Data per page check Starts
    public void ResolutionCodeDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdFailureCode_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //SLA Type
    public void clickOnCoremastersRM_SLAType(String clickOnCoremastersRM_SLAType) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[1]", clickOnCoremastersRM_SLAType));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Priority Change Reason: " + clickOnCoremastersRM_SLAType);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Priority Change Reason: " + clickOnCoremastersRM_SLAType);
            throw e;
        }
    }
    //Priority Change REasons
    public void clickOnCoremastersRM_PCR(String clickOnCoremastersRM_PCR) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[2]", clickOnCoremastersRM_PCR));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Priority Change Reason: " + clickOnCoremastersRM_PCR);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Priority Change Reason: " + clickOnCoremastersRM_PCR);
            throw e;
        }
    }
    public void clickOnAddPCR(String btnAddPCR) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddPCR));
            utils.click(locator);
            System.out.println("Clicked on the RM Add PCR Button: " + btnAddPCR);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Add PCR: " + btnAddPCR);
            throw e;
        }
    }
    public void enterPCR(String name) {
        utils.typeText(PCR_NAME, name);
    }
    public void userClicksPCRSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_PCR};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyPCRcreation(String expectedTitle) {
        utils.typeText(SEARCH_PCR, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdFailureCode_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActivePCRtoEdit() {
        utils.click(SEARCH_FIRST_PCR_EDIT);
    }
    public void clickActivePCRtoDelete() {
        utils.click(DELETE_FIRST_PCR_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyPCRDelete(String expectedTitle) {
        utils.typeText(SEARCH_PCR, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //Priority Change Reasons Pagination and Data per page starts
    public void PriorityChangeReasonsPagination(String PriorityChangeReasonsPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdPriorityReasons']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdPriorityReasons_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdPriorityReasons']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + PriorityChangeReasonsPagination);
            throw e;
        }
    }
    //Priority Change Reasons data per page check Starts
    public void PriorityChangeReasonsDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdPriorityReasons_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //Contract Group Change Reasons
    public void clickOnMasterRM_CtGrpChangeReasons(String clickOnMasterRM_CtGrpChangeReasons) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[3]", clickOnMasterRM_CtGrpChangeReasons));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM Contract Group Change Reasons: " + clickOnMasterRM_CtGrpChangeReasons);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM Contract Group Change Reasons: " + clickOnMasterRM_CtGrpChangeReasons);
            throw e;
        }
    }
    public void clickOnAddCtGrpChangeReasons(String btnAddCGCR) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddCGCR));
            utils.click(locator);
            System.out.println("Clicked on the RM Add PCR Button: " + btnAddCGCR);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Add PCR: " + btnAddCGCR);
            throw e;
        }
    }
    public void enterCGCR(String name) {
        utils.typeText(CGCR_NAME, name);
    }
    public void userClicksCGCRSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_CGCR};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyCGCRcreation(String expectedTitle) {
        utils.typeText(SEARCH_CGCR, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdContractReasons_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveCGCRtoEdit() {
        utils.click(SEARCH_FIRST_CGCR_EDIT);
    }
    public void clickActiveCGCRtoDelete() {
        utils.click(DELETE_FIRST_CGCR_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyCGCRDelete(String expectedTitle) {
        utils.typeText(SEARCH_CGCR, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //Contract Group Change Reasons Pagination and Data per page starts
    public void ContractGroupChangeReasonsPagination(String ContractGroupChangeReasonsPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdContractReasons']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdContractReasons_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdContractReasons']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + ContractGroupChangeReasonsPagination);
            throw e;
        }
    }
    //Contract Group Change Reasons data per page check Starts
    public void ContractGroupChangeReasonsDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdContractReasons_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //SLA Failure Justification Reasons
    public void clickOnMasterRM_SLAFGR(String clickOnMasterRM_SLAFGR) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[4]", clickOnMasterRM_SLAFGR));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM SLA Failure Justification Reasons: " + clickOnMasterRM_SLAFGR);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM SLA Failure Justification Reasons: " + clickOnMasterRM_SLAFGR);
            throw e;
        }
    }
    public void clickOnAddbtnAddSLAFailureJustification(String btnAddSLAFGR) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddSLAFGR));
            utils.click(locator);
            System.out.println("Clicked on the RM Add SLAFGR Button: " + btnAddSLAFGR);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Add SLAFGR: " + btnAddSLAFGR);
            throw e;
        }
    }
    public void enterSLAFJR(String name) {
        utils.typeText(SLAFJ_NAME, name);
    }
    public void selectSLAType(String SLAFTYPE) {
        try {
            utils.click(SLAFJ_SLATYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", SLAFTYPE));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + SLAFTYPE);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + SLAFTYPE);
            throw e;
        }
    }
    public void userClicksSLAFJSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_SLAFJ};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifySLAFJRcreation(String expectedTitle) {
        utils.typeText(SEARCH_SLAFJ, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdSLAJustification_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveSLAFJtoEdit() {
        utils.click(SEARCH_FIRST_SLAFJ_EDIT);
    }
    public void clickActiveSLAFJtoDelete() {
        utils.click(DELETE_FIRST_SLAFJ_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifySLAFJDelete(String expectedTitle) {
        utils.typeText(SEARCH_SLAFJ, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //SLAFailureJustification Pagination and Data per page starts
    public void SLAFailureJustificationPagination(String SLAFailureJustification) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdSLAJustification']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdSLAJustification_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdSLAJustification']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + SLAFailureJustification);
            throw e;
        }
    }
    //SLAFailureJustification data per page check Starts
    public void SLAFailureJustificationDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdSLAJustification_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //CTI Reasons
    public void clickOnMasterRMCTIReasons(String clickOnMasterRMCTIReasons) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[5]", clickOnMasterRMCTIReasons));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM CTI Reasons: " + clickOnMasterRMCTIReasons);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM CTI Reasons: " + clickOnMasterRMCTIReasons);
            throw e;
        }
    }
    public void clickOnAddbtnAddCTIReasons(String btnAddCTIR) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddCTIR));
            utils.click(locator);
            System.out.println("Clicked on the RM Add CTIR Button: " + btnAddCTIR);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Add CTIR: " + btnAddCTIR);
            throw e;
        }
    }
    public void enterCTIR(String name) {
        utils.typeText(CTI_NAME, name);
    }
    public void userClicksCTIRSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_CTI};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyCTIRcreation(String expectedTitle) {
        utils.typeText(SEARCH_CTI, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdCTIReason_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveCTIRtoEdit() {
        utils.click(SEARCH_FIRST_CTI_EDIT);
    }
    public void clickActiveCTIRtoDelete() {
        utils.click(DELETE_FIRST_CTI_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyCTIRDelete(String expectedTitle) {
        utils.typeText(SEARCH_CTI, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    //CTI Reasons Pagination and Data per page starts
    public void CTIReasonsPagination(String CTIReasonsPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdCTIReason']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdCTIReason_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdCTIReason']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + CTIReasonsPagination);
            throw e;
        }
    }
    //CTI Reasons data per page check Starts
    public void CTIReasonsDataPerPage(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdCTIReason_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //SRR
    public void clickOnMasterRMSRR(String clickOnMasterRMSRR) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanelMain']/div/div[1]/div/div/div[1]/div/div[2]/div/a[6]", clickOnMasterRMSRR));
            utils.click(locator);
            System.out.println("Clicked on Core Masters RM CRR: " + clickOnMasterRMSRR);
        } catch (Exception e) {
            System.out.println("Failed to click on Core Masters RM CRR: " + clickOnMasterRMSRR);
            throw e;
        }
    }
    public void clickOnAddbtnSRR(String btnAddCTIR) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddCTIR));
            utils.click(locator);
            System.out.println("Clicked on the RM Add CTIR Button: " + btnAddCTIR);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Add CTIR: " + btnAddCTIR);
            throw e;
        }
    }
    public void enterSRR(String name) {
        utils.typeText(SRR_NAME, name);
    }
    public void selectType(String TYPE) {
        try {
            utils.click(SRR_TYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", TYPE));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + TYPE);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + TYPE);
            throw e;
        }
    }
    public void userClicksSRRSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_SRR};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifySRRcreation(String expectedTitle) {
        utils.typeText(SEARCH_SRR, expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_grdSRReason_ctl00__0']/td[1]", expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveSRRtoEdit() {
        utils.click(SEARCH_FIRST_SRR_EDIT);
    }
    public void clickActiveSRRtoDelete() {
        utils.click(DELETE_FIRST_SRR_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifySRRDelete(String expectedTitle) {
        utils.typeText(SEARCH_SRR, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
}
