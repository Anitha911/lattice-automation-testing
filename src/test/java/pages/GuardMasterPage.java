package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GuardMasterPage extends BasePage  {
    public GuardMasterPage(WebDriver driver) {
        super(driver);
    }
    public static final By USERNAME_INPUT = By.id("LoginUser_UserName");
    public static final By PASSWORD_INPUT = By.id("LoginUser_Password");
    public static final By LOGIN_BUTTON = By.id("LoginUser_LoginButton");
    public static final By HOME_TAB = By.id("tab-home");
    public static final By PATROLMODE_NAME_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingMode_C_radtxtMode");
    public static final By SAVE_BUTTON_PATROLMODE = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingMode_C_btnSavePatrolMode");
    public static final By SEARCH_PATROLMODE = By.cssSelector("[alt='Filter Mode column']");
    public static final By SEARCH_FIRST_MODE = By.id("ctl00_ContentPlaceHolder1_GrdModes_ctl00__0");
    public static final By GUARD_SHIFT_NAME_INPUT = By.id("radtxtShiftName");
    public static final By GUARD_SHIFT_CODE_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_radtxtShiftCode");
    public static final By GUARD_SHIFT_STARTPOPUP_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_radDtpStarttime1_timePopupLink");
    public static final By GUARD_SHIFT_ENDPOPUP_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_radDtpEndtime_timePopupLink");
    public static final By SEARCH_PATROLSHIFT = By.cssSelector("[alt='Filter Name column']");
    public static final By DELETE_FIRST_MODE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_GrdModes_ctl00_ctl26_imgDelete");
    public static final By SAVE_BUTTON_PATROLSHIFT = By.id("ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_btnDutysave");
    public static final By SEARCH_FIRST_SHIFT=By.id("ctl00_ContentPlaceHolder1_GrdShift_ctl00__0");
    public static final By DELETE_FIRST_SHIFt_IN_LIST = By.id("ctl00_ContentPlaceHolder1_GrdShift_ctl00_ctl04_ImageButton1");

    public void clickOnDataConfiguration(String dataConfiguration) throws InterruptedException {
        try {
            //By locator = By.xpath(String.format("//*[@class='nav-link active' and @id='10']", dataConfiguration));
            //By locator = By.xpath(String.format("//a[contains(@class, 'nav-link active') and @id='10']", dataConfiguration));
            By locator=By.id("10");
            utils.click(locator);
            System.out.println("Clicked on the Data Config: " + dataConfiguration);
        } catch (Exception e) {
            System.out.println("Failed to click on the Data config: " + dataConfiguration);
            throw e;
        }
    }

    public void clickOnGuardOptional(String clickOnGuardOptional) throws InterruptedException {
        try {
            //By locator = By.xpath(String.format("//*[@class='nav-link active' and @id='10']", dataConfiguration));
            By locator = By.xpath(String.format("//*[@id='tab-datasetup']/div[2]/div/ul[3]/li[3]/a", clickOnGuardOptional));
            utils.click(locator);
            System.out.println("Clicked on the Guard Optional Menu: " + clickOnGuardOptional);
        } catch (Exception e) {
            System.out.println("Failed to click on the Guard Optional Menu " + clickOnGuardOptional);
            throw e;
        }
    }

    public void clickOnAddPatrolMode(String btnAddPatrolMode) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", btnAddPatrolMode));
            utils.click(locator);
            System.out.println("Clicked on the Add Patrol mode Button: " + btnAddPatrolMode);
        } catch (Exception e) {
            System.out.println("Failed to click on the Add Patrol mode Button:: " + btnAddPatrolMode);
            throw e;
        }
    }
    public void enterPatrolMode(String name) {
        utils.typeText(PATROLMODE_NAME_INPUT, name);
    }
    public void userClicksOnPatrolModeSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_PATROLMODE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
        public void verifyPatrolModecreation(String expectedTitle) {
           utils.typeText(SEARCH_PATROLMODE,expectedTitle + Keys.ENTER);
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdModes_ctl00__0']/td[1]",expectedTitle));
            utils.isElementVisible(locator);
        }
    public void verifyPatrolModeDelete(String expectedTitle) {
        utils.typeText(SEARCH_PATROLMODE,expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        //By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_GrdModes_ctl00__0 td[title='%s']//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }

    public void clickActiveModetoEdit() {
        utils.click(SEARCH_FIRST_MODE);
    }

    public void clickActiveModetoDelete() {
        utils.click(DELETE_FIRST_MODE_IN_LIST);
        //driver.switchTo().activeElement();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
   public void ModeclickExportToExcel(String clickOnExporttoExcelPatrolmodeButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelPatrolmodeButton));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Patrol mode Button: " + clickOnExporttoExcelPatrolmodeButton);
        } catch (Exception e) {
            System.out.println("Failed to click on the Export to excel Patrol mode Button:: " + clickOnExporttoExcelPatrolmodeButton);
            throw e;
       }
    }

    //Shift
    public void clickOnGuardShift(String clickOnGuardShift) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadAjxPanel1']/div/div[1]/div/div/div[1]/div/div/div/a[2]", clickOnGuardShift));
            utils.click(locator);
            System.out.println("Clicked on the Guard Shift: " + clickOnGuardShift);
        } catch (Exception e) {
            System.out.println("Failed to click on the Guard Shift " + clickOnGuardShift);
            throw e;
        }
    }

    public void GuardshiftAdd(String btnAddPatrolShift) {
        try {
            By locator = By.cssSelector(String.format("button[value='Add']", btnAddPatrolShift));
            utils.click(locator);
            System.out.println("Clicked on the Add Patrol Shift Button: " + btnAddPatrolShift);
        } catch (Exception e) {
            System.out.println("Failed to click on the Add Patrol Shift Button:: " + btnAddPatrolShift);
            throw e;
        }
    }
    public void generatePatrolShiftName(String name) {
        utils.typeText(GUARD_SHIFT_NAME_INPUT, name);
    }
    public void generatePatrolShiftCode(String name) {
        utils.typeText(GUARD_SHIFT_CODE_INPUT, name);
    }
    public void generatePatrolStartTime(String starttime) {

        try {
            utils.click(GUARD_SHIFT_STARTPOPUP_INPUT);
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_radDtpStarttime1_timeView_tdl']/tbody/tr[2]/td[1]/a", starttime));
            utils.click(locator);
            System.out.println("Clicked on the Start time: " + starttime);
        } catch (Exception e) {
            System.out.println("Failed to click on Start time: " + starttime);
            throw e;
        }
    }
    public void generatePatrolEndTime(String endtime) {
        try {
            utils.click(GUARD_SHIFT_ENDPOPUP_INPUT);
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_RadWinDutyShifts_C_radDtpEndtime_timeView_tdl']/tbody/tr[7]/td[3]/a", endtime));
            utils.click(locator);
            System.out.println("Clicked on the End time: " + endtime);
        } catch (Exception e) {
            System.out.println("Failed to click on End time: " + endtime);
            throw e;
        }
    }
    public void userClicksOnPatrolModeShiftSaveButton() {
        By[] saveButtons ={SAVE_BUTTON_PATROLSHIFT} ;
        //By[] saveButtons = {GUARD_SHIFT_CODE_INPUT,GUARD_SHIFT_NAME_INPUT,GUARD_SHIFT_STARTPOPUP_INPUT,GUARD_SHIFT_ENDPOPUP_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyPatrolShiftSaveButton(String expectedTitle) {
        utils.typeText(SEARCH_PATROLSHIFT,expectedTitle + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdShift_ctl00__0']/td[2]",expectedTitle));
        utils.isElementVisible(locator);
    }
    public void clickActiveShifttoEdit() {
        utils.click(SEARCH_FIRST_SHIFT);
    }
    public void clickActiveShifttoDelete() {
        utils.click(DELETE_FIRST_SHIFt_IN_LIST);
        //driver.switchTo().activeElement();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyPatrolShiftDelete(String expectedTitle) {
        utils.typeText(SEARCH_PATROLSHIFT,expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        //By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_GrdModes_ctl00__0 td[title='%s']//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
}
