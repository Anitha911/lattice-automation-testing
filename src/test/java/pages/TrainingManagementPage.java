package pages;

import org.openqa.selenium.*;
import utils.ExcelUtils;
import utils.TestDataGenerator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

import java.io.IOException;

public class TrainingManagementPage extends BasePage {
    public TrainingManagementPage(WebDriver driver) {
        super(driver);
    }

    TestDataGenerator dataGen = new TestDataGenerator();
    private By DROPDOWN_OPTIONS;

    public static final By USERNAME_INPUT = By.id("LoginUser_UserName");
    public static final By PASSWORD_INPUT = By.id("LoginUser_Password");
    public static final By LOGIN_BUTTON = By.id("LoginUser_LoginButton");
    public static final By HOME_TAB = By.id("tab-home");
    public static final By COMPANY_NAME_INPUT = By.id("radtxtCompanyName");
    public static final By CONTACT_NUM_INPUT = By.id("radtxtContactNum");
    public static final By CONTACT_NAME_INPUT = By.id("txtContactName");
    public static final By DESIGNATION_INPUT = By.id("txtDesignation");
    public static final By EMAIL_INPUT = By.id("RadtxtEmail");
    public static final By ADDRESS_INPUT = By.id("radtxtAddress");
    public static final By COMPANY_TYPE_OPTS = By.xpath("//li[@class='rcbItem' and contains(text(), 'Corporate')]");
    public static final By COMPANY_TYPE_DD = By.cssSelector("[value='Select company type']");
    public static final By VENUE_TYPE_DD = By.cssSelector("[value='Select Venue Type']");
    public static final By COUNTRY_DD = By.cssSelector("[value='Select Country']");
    public static final By CITY_DD = By.cssSelector("[value='Select City']");
    public static final By SAVE_BUTTON_COMPANY = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingCom_C_btnTrainingComOk");
    public static final By SAVE_BUTTON_SCDHEULE = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_btnTrainingScheOk");
    public static final By SAVE_BUTTON_COURSE = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingCour_C_btnTrainingCourOk");
    public static final By SAVE_BUTTON_TRAINING_LEVEL = By.id("ctl00_ContentPlaceHolder1_RadWinTraininglevel_C_btnTrainingLevelOk");
    public static final By SAVE_BUTTON_TRAINING_FREQUENCY = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingFrequency_C_btnTrainingFrequencyOk");
    public static final By SAVE_BUTTON_VANUE = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingVenue_C_btnTrainingVenueSave");
    public static final By SAVE_BUTTON_TRAINING_COMPANY = By.id("ctl00_ContentPlaceHolder1_RadWinCompanyType_C_btnCompanyTypeOk");
    public static final By SAVE_BUTTON_PARTICIPANTS = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinParticipantsPlan_C_RadBtn_SaveParticipants']");
    public static final By FIRST_COMPANY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTrainingCompany_ctl00__0");
    public static final By DELETE_FIRST_COMPANY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdTrainingCompany_ctl00_ctl04_imgDelete");
    public static final By SEARCH_COMPANY = By.cssSelector("[alt='Filter CompanyName column']");
    public static final By SEARCH_COURSE = By.cssSelector("[alt='Filter CourseName column']");
    public static final By SEARCH_TRAINING_LEVEL = By.cssSelector("[alt='Filter Name column']");

    public static final By COURSE_NAME = By.id("radtxtCourseName");
    public static final By COURSE_TOPIC_DETAILS = By.id("radtxtTopicDetails");
    public static final By COURSE_CATEGORY = By.id("radTxtCourseCategory");
    public static final By COURSE_LINK = By.id("RadtxtCourseLink");
    public static final By COURSE_VALIDITY_DAYS = By.id("RadtxtValidityDays");

    public static final By LEVEL_NAME = By.id("radtxtLevelName");
    public static final By WEIGHTAGE = By.id("RadtxtWeightage");
    public static final By FREQUENCY_NAME = By.id("radtxtFrequencyName");
    public static final By VENUE_NAME = By.id("radtxtVenueName");
    public static final By MAX_NO_PARTICIPANTS = By.id("radtxtMaxNoParticipants");
    public static final By CONTACT_NUM = By.id("radtxtContactnum");
    public static final By ADDRESS = By.id("radtxtAddress");


    public static final By TRAINER_NAME = By.id("radtxtTrainerName");
    public static final By TRAINER_CONTACT = By.id("radttContactNum");
    public static final By SELECT_COMPANY_ARROW = By.cssSelector("ctl00_ContentPlaceHolder1_RadWinTrainer_C_raddrpTrainingServiceProviders_Arrow");
    public static final By SELECT_COMPANY_INPUT = By.cssSelector("[value='Select Training Company']");
    public static final By course = By.cssSelector("[value='Select company type']");
    public static final By COURSE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpCourse_Input']");
    public static final By LEVEL_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpLevel_Input']");
    public static final By VENUE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpVenue_Input']");
    public static final By TRAINER_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpTrainer_Input']");
    public static final By PLATFORM_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpPlatform_Input']");
    public static final By FREQUENCY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpFrequency_Input']");
    public static final By START_DATE = By.xpath("//a[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_RadStartDate_popupButton']]");
    public static final By START_TIME = By.xpath("//a[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_radDtpStarttime1_timePopupLink']");
    public static final By END_DATE = By.xpath("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_RadEndDate_popupButton");
    public static final By END_TIME = By.xpath("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_radDtpEndtime_timePopupLink");
    public static final By REMARKS = By.xpath("//textarea[@id='radtxtRemark']");
    public static final By FIRST_SCHEDULE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grd_TrainingSchedule_ctl00__0");
    public static final By FIRST_PLANNED_PARTICIPANT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_RadWinParticipantsPlan_C_grdStaffList_ctl00_ctl04_SelectedAssignColumnSelectCheckBox");
    public static final By FIRST_ACTUAL_PARTICIPANT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_RadWinActualStaff_C_grdActualPartStaffList_ctl00_ctl04_SelectedAssignColumnSelectCheckBox");
    public static final By FIRST_OTHERS_PARTICIPANT_IN_LIST = By.id("ctl00_ContentPlaceHolder1_RadWinActualPart_C_grdActualStaffList_ctl00_ctl04_ClientSelectColumnSelectCheckBox");
    private By STATUS_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinStatusUpdate_C_ddlNewStatus_Input");

    public static final By COURSEDD = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpCourse_Input");
    public static final By LEVELDD = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpLevel_Input");
    public static final By TRAINERDD = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpTrainer_Input");
    public static final By VENUEDD = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpVenue_Input");
    public static final By PLATFORMDD = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpPlatform_Input");
    public static final By FREQUENCYDD = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_raddrpFrequency_Input");
    public static final By REMARKSa = By.id("radtxtRemark");
    public static final By DDOPTIONS = By.xpath("(//li[@class='rcbItem'])[1]");
    public static final By STARTDATE = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_RadStartDate_popupButton");
    public static final By ENDDATE = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_RadEndDate_popupButton");
    public static final By STARTTIMEICON = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_radDtpStarttime1_timePopupLink");
    public static final By STARTTIME = By.xpath("(//*[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_radDtpStarttime1_timeView_tdl']//a)[1]");

    public static final By ENDTIMEICON = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_radDtpEndtime_timePopupLink");
    public static final By ENDTIME = By.xpath("(//*[@id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_radDtpEndtime_timeView_tdl']//a)[3]");

    public void clickOnTabByTitle(String tabTitle) {
        try {
            By locator = By.xpath(String.format("//div[@id='tab-hse-activities']//a[text()='%s']", tabTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabTitle);
            throw e;
        }
    }

    public void selectCompanyType(String companyTitle) {
        try {
            utils.click(COMPANY_TYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", companyTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + companyTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + companyTitle);
            throw e;
        }
    }

    public void selectVenueType(String companyTitle) {
        try {
            utils.click(VENUE_TYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", companyTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + companyTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + companyTitle);
            throw e;
        }
    }

    public void selectCountry(String companyTitle) {
        try {
            utils.click(COUNTRY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", companyTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + companyTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + companyTitle);
            throw e;
        }
    }

    public void selectCity(String companyTitle) {
        try {
            utils.click(CITY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", companyTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + companyTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + companyTitle);
            throw e;
        }
    }

    public void clickOnButton(String buttonTitle) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", buttonTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + buttonTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + buttonTitle);
            throw e;
        }
    }

    public void enterCompanyName(String name) {
        utils.typeText(COMPANY_NAME_INPUT, name);
    }

    public void enterContactNumber(String number) {
        utils.typeText(CONTACT_NUM_INPUT, number);
    }

    public void enterContactName(String name) {
        utils.typeText(CONTACT_NAME_INPUT, name);
    }

    public void enterDesignation(String designation) {
        utils.typeText(DESIGNATION_INPUT, designation);
    }

    public void enterEmail(String email) {
        utils.typeText(EMAIL_INPUT, email);
    }

    public void enterAddress(String address) {
        utils.typeText(ADDRESS_INPUT, address);
    }

    public void clickSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_SCDHEULE,SAVE_BUTTON_COMPANY, SAVE_BUTTON_COURSE, SAVE_BUTTON_TRAINING_LEVEL, SAVE_BUTTON_TRAINING_FREQUENCY, SAVE_BUTTON_VANUE, SAVE_BUTTON_TRAINING_COMPANY, SAVE_BUTTON_PARTICIPANTS};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void clickCompanytoEdit() {
        utils.click(FIRST_COMPANY_IN_LIST);
    }

    public void clickCompanytoDelete() {
        utils.click(DELETE_FIRST_COMPANY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyCompanyName(String expectedTitle) {
        utils.typeText(SEARCH_COMPANY, expectedTitle + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTrainingCompany_ctl00__0'] td[title='%s']", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void verifyCourseName(String expectedTitle) {
        utils.typeText(SEARCH_COURSE, expectedTitle + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTrainingCour_ctl00__0'] td[title='%s']", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void verifyTrainingLevel(String expectedTitle) {
        utils.typeText(SEARCH_TRAINING_LEVEL, expectedTitle + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTrainingLevel_ctl00__0'] td[title='%s']", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void verifyFrequencyLevel(String expectedTitle) {
        utils.typeText(SEARCH_TRAINING_LEVEL, expectedTitle + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdTrainingFrequency_ctl00__0'] td[title='%s']", expectedTitle));
        utils.isElementVisible(locator);
    }

    public void verifyCompanyDeleted(String expectedTitle) {
        utils.typeText(SEARCH_COMPANY, expectedTitle + Keys.ENTER);
        By locator = By.xpath(("//tr[@class=\"rgNoRecords\"]//div[text()='No records to display.']"));
        utils.isElementVisible(locator);
    }

    public void enterCourseName(String name) {
        utils.typeText(COURSE_NAME, name);
    }

    public void enterCourseTopicDetails(String details) {
        utils.typeText(COURSE_TOPIC_DETAILS, details);
    }

    public void enterCourseCategory(String category) {
        utils.typeText(COURSE_CATEGORY, category);
    }

    public void enterCourseLink(String link) {
        utils.typeText(COURSE_LINK, link);
    }

    public void enterCourseValidityDays(String days) {
        utils.typeText(COURSE_VALIDITY_DAYS, days);
    }

    public void enterLevelName(String levelName) {
        utils.typeText(LEVEL_NAME, levelName);
    }

    public void enterWeightage(String weightage) {
        utils.typeText(WEIGHTAGE, weightage);
    }

    public void enterFrequencyName(String frequencyName) {
        utils.typeText(FREQUENCY_NAME, frequencyName);
    }

    public void enterVenueName(String venueName) {
        utils.typeText(VENUE_NAME, venueName);
    }

    public void enterMaxNoParticipants(String maxParticipants) {
        utils.typeText(MAX_NO_PARTICIPANTS, maxParticipants);
    }

    public void enterVenueContact(String contactNum, String email, String address) {
        utils.typeText(CONTACT_NUM, contactNum);
        utils.typeText(EMAIL_INPUT, email);
        utils.typeText(ADDRESS, address);
    }

    public void trainersAssessorsDetails(String companyName) throws IOException {
        ExcelUtils.setExcelFile("src/test/resources/TrainerData.xlsx", "Sheet1");
        String trainerName = ExcelUtils.getCellData(1, 0);
        String contact = ExcelUtils.getCellData(1, 1);
        String email = ExcelUtils.getCellData(1, 2);
        String company = ExcelUtils.getCellData(1, 3);

        utils.typeText(TRAINER_NAME, trainerName);
        utils.typeText(TRAINER_CONTACT, contact);
        utils.typeText(EMAIL_INPUT, email);
        utils.typeText(SELECT_COMPANY_INPUT, companyName);
    }

    //        public void selectRandomFromDropdown(By locator) {
//            driver.findElement(locator).click();
//            // Resolves "Cannot resolve symbol wait/ExpectedConditions"
//            List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocated(DROPDOWN_OPTIONS));
//            options.get(new Random().nextInt(options.size())).click();
//        }
//
//        public void fillScheduleDatesAndTimes(String sDate, String eDate, String sTime, String eTime) {
//            utils.typeText(START_DATE, sDate);
//            utils.typeText(END_DATE, eDate);
//            utils.typeText(START_TIME, sTime);
//            utils.typeText(END_TIME, eTime);
//        }
//
//        public void selectAllRandomDropdowns() {
//            selectRandomFromDropdown(COURSE_DD);
//            selectRandomFromDropdown(LEVEL_DD);
//            selectRandomFromDropdown(VENUE_DD);
//        }
    public void clickOnFirstScheduleData() {
        utils.click(FIRST_SCHEDULE_IN_LIST);
    }

    public void clickOnSubMenuByTitle(String tabTitle) {
        try {
            By locator = By.xpath(String.format("//a[contains(normalize-space(), '%s')]", tabTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabTitle);
            throw e;
        }
    }

    public void clickOnButtonInSchedulePage(String button) {
        try {
            By locator = By.xpath(String.format("//span[contains(normalize-space(), '%s')]", button));
            utils.click(locator);
            System.out.println("Clicked on the button: " + button);
        } catch (Exception e) {
            System.out.println("Failed to click on the button: " + button);
            throw e;
        }
    }

    public void selectPlannedParticipants() {
        utils.click(FIRST_PLANNED_PARTICIPANT_IN_LIST);
    }
    public void selectActualParticipants() {
        utils.click(FIRST_ACTUAL_PARTICIPANT_IN_LIST);
    }
    public void selectOtherParticipants() {
        utils.click(FIRST_OTHERS_PARTICIPANT_IN_LIST);
    }

    public void selectNewStatus(String statusName) {
        utils.click(STATUS_DROPDOWN);
        wait.until(ExpectedConditions.elementToBeClickable(STATUS_DROPDOWN)).click();
        By locator = By.xpath(String.format("//li[normalize-space()='%s']", statusName));
        utils.click(locator);
    }
    public void acceptWarningPopup() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    public void scheduleDetails() throws IOException, InterruptedException {
        utils.click(LEVELDD);
        utils.click(DDOPTIONS);
        Thread.sleep(1000);
        utils.click(COURSEDD);
        utils.click(DDOPTIONS);
        Thread.sleep(1000);
        utils.click(TRAINERDD);
        utils.click(DDOPTIONS);
        Thread.sleep(1000);
        utils.click(VENUEDD);
        utils.click(DDOPTIONS);
        Thread.sleep(1000);
        utils.click(PLATFORMDD);
        utils.click(DDOPTIONS);
        Thread.sleep(1000);
        utils.click(FREQUENCYDD);
        utils.click(DDOPTIONS);
        utils.typeText(REMARKS, "Testing the schedule");
    }

    public void timeAndDate() throws IOException, InterruptedException {
        String dateToSelect1 = TestDataGenerator.getPlusOneDayDate();
        String dateToSelect2= TestDataGenerator.getPlusFifteenDaysDate();

        By dateCell1 = By.cssSelector(
                "[id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_RadStartDate_calendar_Top'] " +
                        "td[title='" + dateToSelect1 + "']"
        );

        utils.click(STARTDATE);
        utils.click(dateCell1);
        Thread.sleep(1000);
        utils.typeText(By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_radDtpStarttime1_dateInput"), TestDataGenerator.getCurrentTime());

        By dateCell2 = By.cssSelector(
                "[id='ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_RadEndDate_calendar_Top'] " +
                        "td[title='" + dateToSelect2 + "']"
        );
        Thread.sleep(1000);
        utils.click(ENDDATE);
        utils.click(dateCell2);
        Thread.sleep(1000);
        utils.typeText(By.id("ctl00_ContentPlaceHolder1_RadWinTrainingSche_C_radDtpEndtime_dateInput"), TestDataGenerator.getCurrentTimePlus3Minutes());

    }
}






