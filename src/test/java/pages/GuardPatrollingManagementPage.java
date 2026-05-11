package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GuardPatrollingManagementPage extends BasePage  {
    public GuardPatrollingManagementPage(WebDriver driver) {
        super(driver);
    }
    public static final By ROUTE_CODE = By.id("radtxtShortName");
    public static final By ROUTE_NAME = By.id("radtxtPatrollingRoutename");
    public static final By ROUTE_DESC = By.id("radtxtDescription");
    public static final By PATROLROUTECLIENT_DD = By.cssSelector("[value='Select Client']");
    public static final By PATROLROUTECLIENTCONTRACT_DD = By.cssSelector("[value='Select Client Contract']");
    public static final By PATROLROUTETYPE_DD = By.cssSelector("[value='Select Route Type']");
    public static final By PATROLROUTESTATUS_DD = By.cssSelector("[value='Select Status']");
    public static final By SAVE_BUTTON_PATROLROUTE=By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingRoutes_C_btnSavePatrolRoute");
    public static final By SAVE_BUTTON_PATROLROUTESTATUS=By.id("ctl00_ContentPlaceHolder1_RadWinUpdateStatus_C_btnStatusSave");
    public static final By SEARCH_PATROLROUTE = By.cssSelector("[alt='Filter Name column']");
    public static final By SEARCH_FIRST_PATROLROUTE = By.id("ctl00_ContentPlaceHolder1_GrdRoutes_ctl00__0");
    public static final By UPDATE_BUTTON_PATROL_ROUTE_INPUT = By.id("ctl00_ContentPlaceHolder1_btnSave");
    public static final By UPDATE_BUTTON_PATROL_ROUTE_STATUS = By.id("ctl00_ContentPlaceHolder1_btnUpdateStatus");
    public static final By EDIT_BUTTON_PATROL_ROUTE_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingRoutes_C_btnSavePatrolRoute");
    public static final By SEARCH_FIRST_PATROLROUTE_TODELETE = By.id("ctl00_ContentPlaceHolder1_GrdRoutes_ctl00_ctl04_ImageButton1");
    public static final By PATROL_ROUTE_CHECKPOINT_CLICk = By.className("icon-plus1");
    public static final By PATROLROUTECHECKPOINTSAREA_DD=By.cssSelector("[value='Select Area']");
    public static final By PATROLROUTECHECKPOINTSPROPERTY_DD=By.cssSelector("[value='Select Property']");
    public static final By PATROLROUTE_ZONE=By.id("ctl00_ContentPlaceHolder1_RadWinCheckPoints_C_grdBaseUnit_ctl00_ctl04_chk_BaseUnitName");
    public static final By SAVE_BUTTON_PATROLROUTECHECKPOINTS=By.id("ctl00_ContentPlaceHolder1_RadWinCheckPoints_C_btnSaveCheckPoints");
    public static final By PATROL_ROUTE_TIMINGS_CLICK = By.xpath("//*[@id='ContentPlaceHolder1_Span1']/span");
    public static final By PATROLROUTETIMINGSMODE_DD=By.cssSelector("[value='Select Mode']");
    public static final By PATROLROUTE_TIMINGACTIVE=By.id("chkRouteActive");
    public static final By ROUTE_TIMINGDURATION=By.id("ctl00_ContentPlaceHolder1_RadWinTiming_C_radtxtDuration");
    public static final By SAVE_BUTTON_PATROLROUTETIMINGS=By.id("ctl00_ContentPlaceHolder1_RadWinTiming_C_btnTimingSave");

    public static final By GUARD_SCHEDULE_NAME_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_radtxtScheduleName");
    public static final By PATROLSCHEDULECLIENT_DD = By.cssSelector("[value='Select Client']");
    public static final By PATROLSCHEDULECLIENTCONTRACT_DD = By.cssSelector("[value='Select Client Contract']");
    public static final By PATROLSCHEDULEMODE_DD = By.cssSelector("[value='Select Mode']");
    public static final By PATROLSCHEDULEROUTETYPE_DD = By.cssSelector("[value='Select Route Type']");
    public static final By PATROLSCHEDULEROUTE_DD = By.cssSelector("[value='Select Route']");
    public static final By PATROLSCHEDULESHIFT_DD = By.cssSelector("[value='Select Shift']");
    public static final By PATROLSCHEDULEFREQ_DD = By.cssSelector("[value='Select frequency']");
    public static final By GUARD_SCHEDULE_FROMDATE_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_dtpSchStartDate_dateInput");
    public static final By GUARD_SCHEDULE_TODATE_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_dtpSchEndDate_dateInput");
    public static final By GUARD_SCHEDULE_STARTTIME_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_radDtpStarttime_dateInput");
    public static final By GUARD_SCHEDULE_ENDTIME_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_radDtpEndtime_dateInput");
    public static final By GUARD_SCHEDULE_SAVE=By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_btnSave");
    public static final By SEARCH_PATROLSCHEDULE = By.cssSelector("[alt='Filter Name column']");
    public static final By SEARCH_FIRST_SCHEDULE = By.id("ctl00_ContentPlaceHolder1_GrdSchedule_ctl00__0");
    public static final By PATROLSCHDULESTATUS_DD = By.cssSelector("[value='Select Status']");
    public static final By SAVE_BUTTON_PATROLSCHDULESTATUS=By.id("ctl00_ContentPlaceHolder1_RadWinUpdateStatus_C_btnStatusSave");
    public static final By UPDATE_BUTTON_PATROL_SCHDEULE_STATUS = By.id("ctl00_ContentPlaceHolder1_btnUpdateStatus");
    public static final By LEFTSIDEMENU_COMPLETED_PATROL = By.id("tdCompletedPatrols");
    public static final By LEFTSIDEMENU_INPROGRESS = By.id("tdOngoingPatrols");
    public static final By LEFTSIDEMENU_ELAPSED_PATROL = By.id("tdElapsedPatrols");
    public static final By LEFTSIDEMENU_SCHEDULE_HISTORY = By.id("tdHistory");
    public static final By UPDATE_BUTTON_PATROL_SCHEDULE_EDIT = By.id("ctl00_ContentPlaceHolder1_btnEdit");
    public static final By UPDATE_BUTTON_PATROL_SCHEDULE_UPDATE = By.id("ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_btnSave");
    public static final By OPENPATROL_GRPMESSAGE=By.id("ctl00_ContentPlaceHolder1_RadWinGroupMessage_C_txtGroupMessage");
    public static final By OPENPATROL_LEFTSIDEMENU_PATROLCHECKPOINTS = By.xpath("//*[@id='munPatrolCheckPoints']");
    public static final By OPENPATROL_LEFTSIDEMENU_PATROLLOGS = By.xpath("//*[@id='munPatrolLogs']");
    public static final By OPENPATROL_LEFTSIDEMENU_ATTACHMENTS = By.xpath("//*[@id='munAttachments']");
    public static final By OPENPATROL_LEFTSIDEMENU_WO = By.xpath("//*[@id='mnuWorkorders']");
    public static final By OPENPATROL_LEFTSIDEMENU_INCIDENT = By.xpath("//*[@id='mnuIncident']");
    public static final By OPENPATROL_LEFTSIDEMENU_NOTES = By.xpath("//*[@id='mnuNotes']");
    public static final By OPENPATROL_NOTE = By.id("txtApprovalNote");
    public static final By OPENPATROL_NOTE_DD = By.cssSelector("[value='Select']");
    public static final By LIVEGUARDMONITORINGAREAGRP_DD=By.cssSelector("[value='Select Area Group']");


    public void clickOnGuardMenu(String GuardMenu) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='14']"));
            utils.click(locator);
            System.out.println("Clicked on the GuardMenu: " + GuardMenu);
        } catch (Exception e) {
            System.out.println("Failed to click on the Guard Menu" +GuardMenu);
            throw e;
        }
    }
    public void clickOnPatrolRoute(String GuardMenu) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='tab-security']/div[2]/div/ul[1]/li[2]/a"));
            utils.click(locator);
            System.out.println("Clicked on the Patrol Route: " + GuardMenu);
        } catch (Exception e) {
            System.out.println("Failed to click on the Patrol Route" +GuardMenu);
            throw e;
        }
    }
    public void clickOnAddPatrolRoute(String btnAddPatrolRoute) {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_BtnAdd']", btnAddPatrolRoute));
            utils.click(locator);
            System.out.println("Clicked on the Add Patrol Route Button: " + btnAddPatrolRoute);
        } catch (Exception e) {
            System.out.println("Failed to click on the Add Patrol Route Button:: " + btnAddPatrolRoute);
            throw e;
        }
    }
    public void enterRouteCode(String RouteCode) {
        utils.typeText(ROUTE_CODE, RouteCode);
    }
    public void enterRouteName(String RouteName) {
        utils.typeText(ROUTE_NAME, RouteName);
    }
    public void enterRouteDesc(String RouteDesc) {
        utils.typeText(ROUTE_DESC, RouteDesc);
    }
    //Dropdown Check
    public void selectPatrolRouteClient(String PatrolRouteClient) {
        try {
            utils.click(PATROLROUTECLIENT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolRouteClient));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolRouteClient);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolRouteClient);
            throw e;
        }
    }
    public void selectClientContract(String PatrolRouteClientContract) {
        try {
            utils.click(PATROLROUTECLIENTCONTRACT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolRouteClientContract));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolRouteClientContract);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolRouteClientContract);
            throw e;
        }
    }
    public void selectRouteType(String PatrolRouteType) {
        try {
            utils.click(PATROLROUTETYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolRouteType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolRouteType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolRouteType);
            throw e;
        }
    }
    public void ClickPatrolRouteSave() {
        By[] saveButtons = {SAVE_BUTTON_PATROLROUTE};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyPatrolRoutecreation(String PatrolRoute) {
        utils.typeText(SEARCH_PATROLROUTE,PatrolRoute + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdRoutes_ctl00__0']/td[2]",PatrolRoute));
        utils.isElementVisible(locator);
    }
    public void clickActivePatrolRoutetoEdit() {
        utils.click(SEARCH_FIRST_PATROLROUTE);
    }
    public void clickActivePatrolRouteEditButton() {
        utils.click(UPDATE_BUTTON_PATROL_ROUTE_INPUT);
    }
    public void clickPatrolRouteUpdateButton() {
        By[] saveButtons = {EDIT_BUTTON_PATROL_ROUTE_INPUT};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No update button is present on the page.");
    }
    public void clickPatrolRouteUpdateStatusButton() {
        utils.click(UPDATE_BUTTON_PATROL_ROUTE_STATUS);
    }
    public void selectRouteStatus(String PatrolRouteStatus) {
        try {
            utils.click(PATROLROUTESTATUS_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolRouteStatus));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolRouteStatus);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolRouteStatus);
            throw e;
        }
    }
    public void ClickPatrolRouteStatusSave() {
        By[] saveButtons = {SAVE_BUTTON_PATROLROUTESTATUS};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Checkpoints
    public void clickPatrolRouteCheckpointclick() {
        utils.click(PATROL_ROUTE_CHECKPOINT_CLICk);
    }
    public void selectRouteCheckpointsArea(String PatrolRouteCheckpointsArea) {
        try {
            utils.click(PATROLROUTECHECKPOINTSAREA_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolRouteCheckpointsArea));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolRouteCheckpointsArea);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolRouteCheckpointsArea);
            throw e;
        }
    }
    public void selectRouteCheckpointsProperty(String PatrolRouteCheckpointsProperty) {
        try {
            utils.click(PATROLROUTECHECKPOINTSPROPERTY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolRouteCheckpointsProperty));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolRouteCheckpointsProperty);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolRouteCheckpointsProperty);
            throw e;
        }
    }
    public void clickActivepatrolRouteZone() {
        utils.click(PATROLROUTE_ZONE);
    }
    public void ClickPatrolRouteCheckPointsSave() {
        By[] saveButtons = {SAVE_BUTTON_PATROLROUTECHECKPOINTS};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
//Patrol Route Timings
public void clickPatrolRouteTimingsClick() {
    utils.click(PATROL_ROUTE_TIMINGS_CLICK);
}
public void selectRouteTimingsMode(String PatrolRouteselectRouteTimingsMode) {
        try {
            utils.click(PATROLROUTETIMINGSMODE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolRouteselectRouteTimingsMode));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolRouteselectRouteTimingsMode);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolRouteselectRouteTimingsMode);
            throw e;
        }
    }
    public void clickActive() {
        utils.click(PATROLROUTE_TIMINGACTIVE);
    }
    public void enterRouteTimingDuration() {
        utils.typeText(ROUTE_TIMINGDURATION, "10");
    }
    public void ClickPatrolRouteTimingsSave() {
        By[] saveButtons = {SAVE_BUTTON_PATROLROUTETIMINGS};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void clickActivepatrolRoutetoDelete() {
        utils.click(SEARCH_FIRST_PATROLROUTE_TODELETE);
        //driver.switchTo().activeElement();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void verifyPatrolRouteDelete(String expectedTitle) {
        utils.typeText(SEARCH_PATROLROUTE,expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }
    public void PatrolRouteclickExportToExcel(String clickOnExporttoExcelPatrolrouteButton) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='btnExportToExcel']", clickOnExporttoExcelPatrolrouteButton));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Patrol Route Button: " + clickOnExporttoExcelPatrolrouteButton);
        } catch (Exception e) {
            System.out.println("Failed to click on the Export to excel Patrol Route Button:: " + clickOnExporttoExcelPatrolrouteButton);
            throw e;
        }
    }
    //Patrol Route Pagination Start
    public void GuardPatrolRoutePagination(String GuardPatrolRoutePagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement firstCellBefore = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='ctl00_ContentPlaceHolder1_GrdRoutes']//tr[td][2]/td[1]")
                    )
            );
            String beforeText = firstCellBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath(
                    "//*[@id='ctl00_ContentPlaceHolder1_GrdRoutes_ctl00_Pager']/tbody/tr/td/div/div[3]/button"
            ));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", nextBtn
            );
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstCellBefore));
            WebElement firstCellAfter = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='ctl00_ContentPlaceHolder1_GrdRoutes']//tr[td][2]/td[1]")
                    )
            );
            String afterText = firstCellAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + GuardPatrolRoutePagination);
            throw e;
        }
    }
    //Patrol Route Data per page check Starts
    public void validatePageSizePatrolRoute(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_GrdRoutes_ctl00_ctl03_ctl01_PageSizeComboBox")));
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
    //Patrol Route Data per page check ends
    //Patrol Route Ends
    //patrol Schedule
    public void clickOnPatrolSchedule(String GuardMenu) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='tab-security']/div[2]/div/ul[2]/li[2]/a"));
            utils.click(locator);
            System.out.println("Clicked on the Patrol Schedule: " + GuardMenu);
        } catch (Exception e) {
            System.out.println("Failed to click on the Patrol Schedule" +GuardMenu);
            throw e;
        }
    }
    public void clickOnAddPatrolSchedule(String btnAddPatrolSchedule) {
        try {
            By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_BtnAdd']", btnAddPatrolSchedule));
            utils.click(locator);
            System.out.println("Clicked on the Add Patrol Schedule Button: " + btnAddPatrolSchedule);
        } catch (Exception e) {
            System.out.println("Failed to click on the Add Patrol Schedule Button:: " + btnAddPatrolSchedule);
            throw e;
        }
    }
    public void PatrolScheduleName(String name) {
        utils.typeText(GUARD_SCHEDULE_NAME_INPUT, name);
    }
    public void selectPatrolScheduleClient(String PatrolScheduleClient) {
        try {
            utils.click(PATROLSCHEDULECLIENT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolScheduleClient));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolScheduleClient);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolScheduleClient);
            throw e;
        }
    }
    public void selectPatrolScheduleClientContract(String PatrolScheduleClientContract) {
        try {
            //Too slow here
            utils.click(PATROLSCHEDULECLIENTCONTRACT_DD);
            //Thread.sleep(5000);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolScheduleClientContract));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolScheduleClientContract);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolScheduleClientContract);
            throw e;
        }
    }
    public void selectPatrolScheduleMode(String PatrolScheduleMode) {
        try {
            utils.click(PATROLSCHEDULEMODE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolScheduleMode));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolScheduleMode);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolScheduleMode);
            throw e;
        }
    }
    public void selectPatrolScheduleRouteType(String PatrolScheduleRouteType) {
        try {
            utils.click(PATROLSCHEDULEROUTETYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolScheduleRouteType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolScheduleRouteType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolScheduleRouteType);
            throw e;
        }
    }
    public void selectPatrolScheduleRoute(String PatrolScheduleRoute) {
        try {
            utils.click(PATROLSCHEDULEROUTE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolScheduleRoute));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolScheduleRoute);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolScheduleRoute);
            throw e;
        }
    }
    public void selectPatrolScheduleShift(String PatrolScheduleShift) {
        try {
            utils.click(PATROLSCHEDULESHIFT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolScheduleShift));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolScheduleShift);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolScheduleShift);
            throw e;
        }
    }
    public void selectPatrolScheduleFrequency(String PatrolSchedulefrequency) {
        try {
            utils.click(PATROLSCHEDULEFREQ_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolSchedulefrequency));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolSchedulefrequency);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolSchedulefrequency);
            throw e;
        }
    }

    public void enterPatrolScheduleFromDate(String name) {
        utils.typeText(GUARD_SCHEDULE_FROMDATE_INPUT, name);
    }
    public void enterPatrolScheduleToDate(String name) {
        utils.typeText(GUARD_SCHEDULE_TODATE_INPUT, name);
    }
    public void enterPatrolScheduleEstStartTime(String name) {
        utils.typeText(GUARD_SCHEDULE_STARTTIME_INPUT, name);
    }
    public void enterPatrolScheduleEstEndTime(String name) {
        utils.typeText(GUARD_SCHEDULE_ENDTIME_INPUT, name);
    }
    public void selectStartEndDates() {
        Random random = new Random();
        // Open Start Date picker
        driver.findElement(By.id(
                        "ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_dtpSchStartDate_popupButton"))
                .click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.className("TelerikModalOverlay")));
        // Get enabled dates
        List<WebElement> fromDates = driver.findElements(
                By.xpath("//td[not(contains(@class,'disabled')) and text()!='']")
        );
        // Select random start date
        int fromIndex = random.nextInt(fromDates.size());
        WebElement fromDateElement = fromDates.get(fromIndex);
        int fromDay = Integer.parseInt(fromDateElement.getText());
        wait.until(ExpectedConditions.elementToBeClickable(fromDateElement));
        fromDateElement.click();
        // Open End Date picker
        driver.findElement(By.id(
                        "ctl00_ContentPlaceHolder1_RadWinPatrollingSche_C_dtpSchEndDate_popupButton"))
                .click();
        // Get enabled end dates
        List<WebElement> toDates = driver.findElements(
                By.xpath("//td[not(contains(@class,'disabled')) and text()!='']")
        );

        // Filter dates greater than start date
        List<WebElement> validToDates = new ArrayList<>();

        for (WebElement date : toDates) {

            int toDay = Integer.parseInt(date.getText());
            if (toDay > fromDay) {
                validToDates.add(date);
            }
        }
        // Select random valid end date
        WebElement toDateElement =
                validToDates.get(random.nextInt(validToDates.size()));
        wait.until(ExpectedConditions.elementToBeClickable(toDateElement));
        toDateElement.click();
    }

        public void userClicksOnPatrolScheduleSaveButton() {
        By[] saveButtons = {GUARD_SCHEDULE_SAVE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyPatrolSchedulecreation(String PatrolSchedule) {
        utils.typeText(SEARCH_PATROLSCHEDULE,PatrolSchedule + Keys.ENTER);
        By locator = By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_GrdRoutes_ctl00__0']/td[2]",PatrolSchedule));
        utils.isElementVisible(locator);
    }
    public void PatrolScheduleExportToExcel(String clickOnExporttoExcel) throws InterruptedException {
        try {
            By locator = By.xpath(String.format("//*[@id='radbtnExport']", clickOnExporttoExcel));
            utils.click(locator);
            System.out.println("Clicked on Export to Excel Patrol Schedule : " + clickOnExporttoExcel);
        } catch (Exception e) {
            System.out.println("Failed to click on Export to Patrol Schedule : " + clickOnExporttoExcel);
            throw e;
        }
    }
    //Patrol Schedule Edit Starts
    public void clickActivePatrolScheduleEditButton() {
        utils.click(UPDATE_BUTTON_PATROL_SCHEDULE_EDIT);
    }
    public void clickPatrolSchduleUpdateButton() {
        By[] saveButtons = {UPDATE_BUTTON_PATROL_SCHEDULE_UPDATE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No update button is present on the page.");
    }
    //Patrol Schedule Edit Ends
    //Patrol Schedule Pagination Start
    public void GuardPatrolSchedulePagination(String GuardPatrolSchedulePagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement firstCellBefore = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='ctl00_ContentPlaceHolder1_GrdSchedule']//tr[td][2]/td[1]")
                    )
            );
            String beforeText = firstCellBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath(
                    "//*[@id='ctl00_ContentPlaceHolder1_GrdSchedule_ctl00_Pager']/tbody/tr/td/div/div[3]/button"
            ));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", nextBtn
            );
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstCellBefore));
            WebElement firstCellAfter = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='ctl00_ContentPlaceHolder1_GrdSchedule']//tr[td][2]/td[1]")
                    )
            );
            String afterText = firstCellAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + GuardPatrolSchedulePagination);
            throw e;
        }
    }
    //Patrol Schedule Pagination check Ends
    //Patrol Schedule Data per page check Starts
    public void validatePageSizePatrolSchedule(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_GrdSchedule_ctl00_ctl03_ctl01_PageSizeComboBox")));
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
    //Patrol Schedule Data per page check ends
    public void clickActiveSchduledetailtoEdit() {
        utils.click(SEARCH_FIRST_SCHEDULE);
    }
    public void ClickPatrolScheduleUpdateStatusSave() {
        utils.click(UPDATE_BUTTON_PATROL_SCHDEULE_STATUS);
    }
    public void selectScheduleStatus(String PatrolScheduleStatus) {
        try {
            utils.click(PATROLSCHDULESTATUS_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", PatrolScheduleStatus));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + PatrolScheduleStatus);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + PatrolScheduleStatus);
            throw e;
        }
    }
    //Schedule status save
     public void ClickPatrolScheduleStatusSave() {
        By[] saveButtons = {SAVE_BUTTON_PATROLSCHDULESTATUS};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Left side menu click
    public void ClickPatrolScheduleLeftSideMenus() {
        utils.click(LEFTSIDEMENU_COMPLETED_PATROL);
        utils.click(LEFTSIDEMENU_INPROGRESS);
        utils.click(LEFTSIDEMENU_ELAPSED_PATROL);
        utils.click(LEFTSIDEMENU_SCHEDULE_HISTORY);
    }
    //Patrol Schedule
    //Open Patrol starts
    public void clickOnOpenPatrol(String clickOnOpenPatrol) {
        try {
            By locator = By.xpath(String.format("//*[@id='tab-security']/div[2]/div/ul[3]/li[2]/a", clickOnOpenPatrol));
            utils.click(locator);
            System.out.println("Clicked on the Open Patrol: " + clickOnOpenPatrol);
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol: " + clickOnOpenPatrol);
            throw e;
        }
    }
    public void OpenPatrolGroupMessage(String OpenPatrolGroupMessage) {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_lnkSMS");
            utils.click(locator);
            System.out.println("Clicked on the Open Patrol Group Message: " + OpenPatrolGroupMessage);
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol Group Message: " + OpenPatrolGroupMessage);
            throw e;
        }
    }
    public void OpenPatrolGroupMessageSelectGuard(String OpenPatrolGroupMessageSelectGuard) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRow = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("(//table/tbody/tr)[1]")
                    )
            );
            firstRow.click();
        } catch (Exception e) {
            System.out.println("Failed to Open Patrol Group Message Select Guard: " + OpenPatrolGroupMessageSelectGuard);
            throw e;
        }
    }
    public void OpenPatrolGroupMessageSelectGuardMessage(String name) {
        utils.typeText(OPENPATROL_GRPMESSAGE, name);
    }
    public void clickOnOpenPatrolSendMessage(String clickOnOpenPatrolSendMessage) {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_RadWinGroupMessage_C_btnSend");
            utils.click(locator);
            System.out.println("Clicked on the Open Patrol Group Message Send Button: " + clickOnOpenPatrolSendMessage);
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol Group Message Send Button: " + clickOnOpenPatrolSendMessage);
            throw e;
        }
    }
    public void clickOnOpenPatrolDetailPage() {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_GrdActiveConsole_ctl00__0");
            utils.click(locator);
            System.out.println("Clicked on the Open Patrol Detail Page");
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol Detail Page");
            throw e;
        }
    }
    //Left side menu click
    public void ClickOpenPatrolLeftSideMenus() {
        utils.click(OPENPATROL_LEFTSIDEMENU_PATROLCHECKPOINTS);
        utils.click(OPENPATROL_LEFTSIDEMENU_PATROLLOGS);
        utils.click(OPENPATROL_LEFTSIDEMENU_ATTACHMENTS);
        utils.click(OPENPATROL_LEFTSIDEMENU_WO);
        utils.click(OPENPATROL_LEFTSIDEMENU_INCIDENT);
        utils.click(OPENPATROL_LEFTSIDEMENU_NOTES);
    }
    public void ClickOpenPatrolLeftSideMenuNote() {;
        utils.click(OPENPATROL_LEFTSIDEMENU_NOTES);
    }
    public void ClickOpenPatrolAddNotes() {;
        try {
            By locator = By.xpath("//*[@id='Span2220']");
            utils.click(locator);
            System.out.println("Clicked on the Open Patrol Detail Page Add Notes");
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol Detail Page Add Notes");
            throw e;
        }
    }
    public void selectOpenPatrolType(String selectOpenPatrolType) {
        try {
            WebElement dropdown = driver.findElement(
                    By.id("ctl00_ContentPlaceHolder1_Notes_NotesWindow_C_ddlDocType")
            );

            Select select = new Select(dropdown);
            select.selectByVisibleText(selectOpenPatrolType);
            System.out.println("Clicked on the dropdown: " + selectOpenPatrolType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectOpenPatrolType);
            throw e;
        }
    }
    public void OpenPtrolNote(String name) {
        utils.typeText(OPENPATROL_NOTE, name);
    }
    public void clickOpenPatrolNoteSave() {;
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_Notes_NotesWindow_C_btnNoteSave");
            utils.click(locator);
            System.out.println("Clicked on the Open Patrol Detail Page Add Notes Save");
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol Detail Page Add Notes Save");
            throw e;
        }
    }
    public void clickOnOpenPatrolDetailPageAssignSecurityGuard() {;
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_btnaddStaff");
            utils.click(locator);
            System.out.println("Clicked on the Open Patrol Detail Page Assign Security Guard");
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol Detail Page Assign Security Guard");
            throw e;
        }
    }
    public void OpenPatrolSecGuardGridCheckbox() {;
        try {
            WebElement row = driver.findElement(
                    By.xpath("//tr[contains(@id,'GrdStaff_ctl00__0')]"));
            String Guard = row.findElement(By.xpath("./td[2]"))
                    .getText()
                    .trim();
            if (!Guard.isEmpty()) {
                WebElement checkbox = row.findElement(
                        By.xpath(".//input[contains(@id,'chkSelected')]"));
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
            }
            System.out.println("Clicked on the Open Patrol Assign Security Guard Grid Checkbox");
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol Assign Security Guard Grid Checkbox");
            throw e;
        }
    }
    public void clickOnOpenPatrolSecGuardSave() {;
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_RadWinStaff_C_btnSave");
            utils.click(locator);
            System.out.println("Clicked on the Open Patrol Detail Page Save Security Guard");
        } catch (Exception e) {
            System.out.println("Failed to click on the Open Patrol Detail Page Save Security Guard");
            throw e;
        }
    }
    //Open Patrol Ends
    //Console Window Guard Start
    public void clickOnConsoleGuard(String GuardMenu) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='tab-security']/div[2]/div/ul[3]/li[3]/a"));
            utils.click(locator);
            System.out.println("Clicked on the Console Guard: " + GuardMenu);
        } catch (Exception e) {
            System.out.println("Failed to click on the Console Guard" +GuardMenu);
            throw e;
        }
    }
    public void clickOnConsoleWindowRefresh(String clickOnConsoleWindowRefresh) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='ContentPlaceHolder1_lnlRefresh']"));
            utils.click(locator);
            System.out.println("Clicked on the Console Guard Refresh: " + clickOnConsoleWindowRefresh);
        } catch (Exception e) {
            System.out.println("Failed to click on the Console Guard Refresh" +clickOnConsoleWindowRefresh);
            throw e;
        }
    }
    //Console Window Guard End
    //Live Guard Monitoring Start
    public void clickOnLiveGuardMonitoring(String clickOnLiveGuardMonitoring) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='tab-security']/div[2]/div/ul[4]/li[2]/a"));
            utils.click(locator);
            System.out.println("Clicked on the Live Guard Monitoring: " + clickOnLiveGuardMonitoring);
        } catch (Exception e) {
            System.out.println("Failed to click on Live Guard Monitoring" +clickOnLiveGuardMonitoring);
            throw e;
        }
    }
    public void selectLiveGuardMonitoringAreaGrp(String selectLiveGuardMonitoringAreaGrp) {
        try {
            utils.click(LIVEGUARDMONITORINGAREAGRP_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectLiveGuardMonitoringAreaGrp));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectLiveGuardMonitoringAreaGrp);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectLiveGuardMonitoringAreaGrp);
            throw e;
        }
    }
    //Live Guard Monitoring End
}
