package stepDefinitions;


import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.GuardPatrollingManagementPage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import java.io.IOException;

public class GuardPatrollingManagementSteps {

    private final WebDriver driver = DriverFactory.getDriver();
    GuardPatrollingManagementPage tmp = new GuardPatrollingManagementPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();
    public static String generatePatrolRoute;
    public static String generatePatrolSchedule;


    @Then("User clicks on Guard {string} in navigation panel")
    public void user_click_on_Guard(String title) throws InterruptedException {
        //String xpath="//*[@class='nav-link active' and @id='10']";
        String xpath = "//*[@id='14']";
        tmp.clickOnGuardMenu(xpath);
    }

    @Then("User clicks on the Guard {string} tab")
    public void user_click_on_GuardPatrolRoute(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-security']/div[2]/div/ul[1]/li[2]/a";
        tmp.clickOnPatrolRoute(xpath);
    }

    @Then("User clicks on Patrol Route button {string}")
    public void user_click_on_AddPatrolRoute(String btnAddPatrolRoute) throws InterruptedException {
        tmp.clickOnAddPatrolRoute(btnAddPatrolRoute);
    }

    @Then("User fills up the Patrol Route button details")
    public void userFillsUpThePatrolRouteDetails() {
        tmp.enterRouteCode(dataGen.generateRouteCode());
        tmp.enterRouteName(dataGen.generateRouteName());
        tmp.enterRouteDesc(dataGen.generateRouteDesc());
        tmp.selectPatrolRouteClient("Alpha Properties");
        tmp.selectClientContract("ABC Tower");
        tmp.selectRouteType("Patrol Route");
    }
    @Then("User waits patrol route {int} seconds")
    public void user_waits_seconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
            System.out.println("Waited for " + seconds + " seconds.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Wait interrupted: " + e.getMessage());
        }
    }

    @Then("User clicks on Patrol Route save button")
    public void user_click_on_PatrolRouteSaveButton() {
        tmp.ClickPatrolRouteSave();
    }

    @Then("User verify if the Guard Patrol Route is created")
    public void user_verify_the_success_message_after_creating_patrolRoute() {
        tmp.verifyPatrolRoutecreation(generatePatrolRoute);
    }
    @Then("User clicks on active Patrol Route in the grid")
    public void user_clicks_on_first_active_PatrolRoute_to_edit() {
        tmp.clickActivePatrolRoutetoEdit();
    }
    @Then("User clicks on Patrol Route Edit button")
    public void user_clicks_PatrolRoute_editButton() {
        tmp.clickActivePatrolRouteEditButton();
    }
    @Then("User clicks on Patrol Route Update button")
    public void user_clicks_PatrolRoute_UpdateButton() {
        tmp.clickPatrolRouteUpdateButton();
    }
    //patrol route status
    @Then("User clicks on Patrol Route Update Status button")
    public void user_clicks_PatrolRoute_UpdateStatusButton() {
        tmp.clickPatrolRouteUpdateStatusButton();
    }
    @Then("User fills up the Patrol Route Update Status details")
    public void userFillsUpThePatrolRouteUpdateStatusDetails() {
        tmp.selectRouteStatus("Hold");
    }
    @Then("User clicks on Patrol Route Status Save button")
    public void user_click_on_PatrolRouteStatusSaveButton() {
        tmp.ClickPatrolRouteStatusSave();
    }
    //Patrol check points
    @Then("User clicks on active Patrol Route Check Points in the grid")
    public void user_clicks_PatrolRoute_Checkpointclick() {
        tmp.clickPatrolRouteCheckpointclick();
    }
    @Then("User fills up the Patrol Route Check Points details")
    public void userFillsUpThePatrolRouteCheckPointsdetails() {
        tmp.selectRouteCheckpointsArea("The Garden Apartments");
        tmp.selectRouteCheckpointsProperty("Lake View Apartments");
        tmp.clickActivepatrolRouteZone();
    }
    @Then("User clicks the Patrol Route Check Points Save Button")
    public void user_click_on_PatrolRouteCheckPointsSaveButton() {
        tmp.ClickPatrolRouteCheckPointsSave();
    }
  //Patrol Route Timings
  @Then("User clicks on  Patrol Route Timings ADD Button")
  public void user_clicks_PatrolRoute_AddTimingsclick() {
      tmp.clickPatrolRouteTimingsClick();
  }
    @Then("User fills up the Patrol Route Timings details")
    public void userFillsUpThePatrolRouteTimingsdetails() {
        tmp.selectRouteTimingsMode("Segway");
        tmp.enterRouteTimingDuration();
        tmp.clickActive();
    }
    @Then("User fills up the Patrol Route Timings Save Button")
    public void user_click_on_PatrolRouteTimingsSaveButton() {
        tmp.ClickPatrolRouteTimingsSave();
    }
    @Then("User clicks on valid Patrol Route to Delete")
    public void user_clicks_on_first_active_patrol_route_to_delete() {
        tmp.clickActivepatrolRoutetoDelete();
    }

    @Then("User verify if the Guard Patrol Route is deleted")
    public void user_Verify_first_active_patrol_route_to_delete() {
        tmp.verifyPatrolRouteDelete(generatePatrolRoute);
    }

    @Then("User clicks on PatrolRoute Export to Excel button")
    public void user_clicks_on_patrolRoute_export_to_excel_button() throws InterruptedException {
        String xpath = "//*[@id='btnExportToExcel']";
        tmp.PatrolRouteclickExportToExcel(xpath);
    }
    @Then("User Clicks on Guard Patrol Route grid {string}")
    public void user_click_on_GuardPatrolRoutePagination(String GuardPatrolRoutePagination) throws InterruptedException {
        tmp.GuardPatrolRoutePagination(GuardPatrolRoutePagination);
    }
    //No of data per page
    @Then("User clicks the Guard Patrol Route no of data per page {int} in the grid")
    public void user_click_on_PatrolRouteDataPerPage(int GrdPatrolRoute) throws InterruptedException {
        tmp.validatePageSizePatrolRoute(GrdPatrolRoute);
    }
    //PatrolRoute Ends

    //Patrol Schedule Starts
    @Then("User clicks on the Guard Schedule {string} tab")
    public void user_click_on_GuardPatrolSchedule(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-security']/div[2]/div/ul[2]/li[2]/a";
        tmp.clickOnPatrolSchedule(xpath);
    }
    @Then("User clicks on Patrol Schedule button {string}")
    public void user_click_on_AddPatrolSchedule(String btnAddPatrolSchedule) throws InterruptedException {
        tmp.clickOnAddPatrolSchedule(btnAddPatrolSchedule);
    }

    @Then("User fills up the Patrol Schedule details")
    public void userFillsUpThePatrolScheduleDetails() {
          String PatrolScheduleName=dataGen.generatePatrolScheduleName();
          tmp.PatrolScheduleName(PatrolScheduleName);
          tmp.selectPatrolScheduleClient("Alpha Properties");
          tmp.selectPatrolScheduleClientContract("ABC Tower");
          tmp.selectPatrolScheduleMode("Segway");
          tmp.selectPatrolScheduleRouteType("Route");
          tmp.selectPatrolScheduleRoute("gardenrk");
          tmp.selectPatrolScheduleShift("Evening");
          tmp.selectPatrolScheduleFrequency("Daily");
          //tmp.enterPatrolScheduleFromDate("31-Mar-2026");
          //tmp.enterPatrolScheduleToDate("31-Dec-2026");
          tmp.enterPatrolScheduleEstStartTime("10.00 AM");
          tmp.enterPatrolScheduleEstEndTime("11.00 AM");
    }
    @Then("User fills up Patrol Schedule Start and End Dates")
    public void user_select_StartEndDates() throws InterruptedException {
        tmp.selectStartEndDates();
    }
    @Then("User clicks on Patrol Schedule save button")
    public void userClicksOnPatrolScheduleSaveButton() {
        tmp.userClicksOnPatrolScheduleSaveButton();
    }
    @Then("User verify if the Guard Patrol Schedule is created")
    public void user_verify_the_success_message_after_creating_patrolSchedule() {
        tmp.verifyPatrolSchedulecreation(generatePatrolSchedule);
    }
    @Then("User Clicks on Patrol Export to Excel Button")
    public void userClicksOnExporttoexcelPatrolSChedule() throws InterruptedException{
        String xpath = "//*[@id='radbtnExport']";
        tmp.PatrolScheduleExportToExcel(xpath);
    }
    @Then("User clicks on active Patrol Schedule in the grid")
    public void user_clicks_on_first_active_patrol_Schedule_to_edit() {
        tmp.clickActiveSchduledetailtoEdit();
    }
    //Update Button click
    @Then("User clicks on Update Patrol Schedule Status")
    public void user_click_on_PatrolScheduleStatusUpdateButton() {
        tmp.ClickPatrolScheduleUpdateStatusSave();
    }
    @Then("User Enters data in Patrol Schedule Status")
    public void userFillsUpThePatrolStatusUpdateStatusDetails() {
        tmp.selectScheduleStatus("Hold");
    }
    @Then("User clicks on Patrol Schedule Status Save button")
    public void user_click_on_PatrolScheduleStatusSaveButton() {
        tmp.ClickPatrolScheduleStatusSave();
    }

    //Edit Patrol Schedule Starts
    @Then("User clicks on Patrol Schedule Edit button")
    public void user_clicks_PatrolSchedule_editButton() {
        tmp.clickActivePatrolScheduleEditButton();
    }
    @Then("User clicks on Patrol Schedule Update button")
    public void user_clicks_PatrolSchedule_UpdateButton() {
        tmp.clickPatrolSchduleUpdateButton();
    }
    //Edit Patrol Schedule Ends
    //Left side menu click
    @Then("User clicks on Left side menus")
    public void user_click_on_PatrolScheduleLeftSideMenus() {
        tmp.ClickPatrolScheduleLeftSideMenus();
    }
    @Then("User Clicks on Guard Patrol Schedule grid Pagination {string}")
    public void user_click_on_GuardPatrolSchedulePagination(String GuardPatrolSchedulePagination) throws InterruptedException {
        tmp.GuardPatrolSchedulePagination(GuardPatrolSchedulePagination);
    }
    //No of data per page
    @Then("User clicks the Guard Patrol Schedule no of data per page {int} in the grid")
    public void user_click_on_PatrolScheduleDataPerPage(int GrdPatrolSchedule) throws InterruptedException {
       tmp.validatePageSizePatrolSchedule(GrdPatrolSchedule);
    }
    //Patrol Schedule Ends
    //open patrol starts
    @Then("User clicks on the Guard Open Patrol {string} tab")
    public void user_click_on_OpenPatrol(String btnOpenPatrol) throws InterruptedException {
        tmp.clickOnOpenPatrol(btnOpenPatrol);
    }
    @Then("User Clicks on Open Patrol Group Message {string} Button")
    public void userClicksOpenPatrolGroupMessage(String btnGroupMessage) throws InterruptedException{
        tmp.OpenPatrolGroupMessage(btnGroupMessage);
    }
    @Then("User selects Open Patrol Group Message Guard {string} from the pop up")
    public void OpenPatrolGroupMessageGuard(String GrpMsgSelectGuard) throws InterruptedException{
        tmp.OpenPatrolGroupMessageSelectGuard(GrpMsgSelectGuard);
    }
    @Then("User Types message in the Message Textbox Open Patrol Send Message")
    public void OpenPatrolGroupMessageGuardMessage() throws InterruptedException{
        String OpenPatrolMessage=dataGen.generateShortDesc();
        tmp.OpenPatrolGroupMessageSelectGuardMessage(OpenPatrolMessage);
    }
    @Then("User clicks Open Patrol Group Message Send {string} Button")
    public void user_click_on_OpenPatrolSendMessage(String btnOpenPatrolSendMessage) throws InterruptedException {
        tmp.clickOnOpenPatrolSendMessage(btnOpenPatrolSendMessage);
    }
    @Then("User clicks the first active Open Patrol in the grid to display detail page")
    public void user_click_on_OpenPatrolDetailPage() throws InterruptedException {
        tmp.clickOnOpenPatrolDetailPage();
    }
    @Then("User clicks on Open Patrol page Left side menus")
    public void user_click_on_OpenPatrolLeftSideMenus() {
        tmp.ClickOpenPatrolLeftSideMenus();
    }
    //open patrol ends
}
