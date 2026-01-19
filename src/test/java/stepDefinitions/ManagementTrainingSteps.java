package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TrainingManagementPage;
import utils.DriverFactory;
import utils.ExcelUtils;
import utils.TestDataGenerator;

import java.io.IOException;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class ManagementTrainingSteps {
    public static String generatedCompanyName;
    public static String companyName;
    public static String generatedCourseName;
    public static String courseName;
    public static String generateLevelName;
    public static String generateFrequencyName;
    public static String fillTrainingScheduleDetails;
    public static String enterRemarks;
    private final WebDriver driver = DriverFactory.getDriver();
    TrainingManagementPage tmp = new TrainingManagementPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User waits for {int} seconds")
    public void user_waits_for_seconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
            System.out.println("Waited for " + seconds + " seconds.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Wait interrupted: " + e.getMessage());
        }
    }

    @Then("User clicks on the {string} tab")
    public void userClicksOnTheTab(String tabTitle) {
        tmp.clickOnTabByTitle(tabTitle);
    }

    @Then("User clicks on button {string}")
    public void user_clicks_on_button(String btnName) {
        tmp.clickOnButton(btnName);
    }

    @Then("User fills up the {string} type company details")
    public void user_fill_up_the_coperate_company_details(String type) throws IOException {
        companyName = dataGen.generateCompanyName();
        String contactNumber = dataGen.generatePhoneNumber();
        String contactName = dataGen.generatePersonName();
        String designation = dataGen.generateDesignation();
        String email = dataGen.generateTimestampedEmail();
        String address = dataGen.generateAddress();

        tmp.enterCompanyName(companyName);
        tmp.selectCompanyType(type);
        tmp.enterContactNumber(contactNumber);
        tmp.enterContactName(contactName);
        tmp.enterDesignation(designation);
        tmp.enterEmail(email);
        tmp.enterAddress(address);
    }

    @Then("User clicks on save button")
    public void userClicksOnSaveButton() {
        tmp.clickSaveButton();
    }

    @Then("User verify if the company is created")
    public void user_verify_the_success_message_after_creating_company() {
        tmp.verifyCompanyName(companyName);
    }

    @Then("User verify if the course is created")
    public void user_verify_course_creation() {
        tmp.verifyCourseName(courseName);
    }

    @Then("User verify if the training level is created")
    public void user_verify_training_level_creation() {
        tmp.verifyTrainingLevel(generateLevelName);
    }

    @Then("User verify if the training frequency is created")
    public void user_verify_training_frequency_creation() {
        tmp.verifyTrainingLevel(generateFrequencyName);
    }

    @Then("User verify if the company is deleted")
    public void user_verify_company_deleted() {
        tmp.verifyCompanyDeleted(generatedCompanyName);
    }

    @Then("User clicks on first available company to edit")
    public void user_clicks_on_first_available_company_to_edit() {
        tmp.clickCompanytoEdit();
    }

    @Then("User clicks on first available company to delete")
    public void user_clicks_on_first_available_company_to_delete() {
        tmp.clickCompanytoDelete();
    }

    @Then("User fills up the course details for {string} days validity")
    public void userFillsUpTheCourseDetailsForDaysValidity(String days) throws Exception {
        courseName = dataGen.generateCourseName();
        String topicDetails = dataGen.generateCourseDetails();
        String category = dataGen.generateCourseCategory();
        String link = dataGen.generateCourseLink();
        tmp.enterCourseName(courseName);
        tmp.enterCourseTopicDetails(topicDetails);
        tmp.enterCourseCategory(category);
        tmp.enterCourseLink(link);
        tmp.enterCourseValidityDays(days);
    }

    @Then("User fills up the level details")
    public void userFillsUpTheLevelDetails() {
        generateLevelName = dataGen.generateLevelName();
        tmp.enterLevelName(generateLevelName);
        tmp.enterWeightage(dataGen.generateWeightage());
    }

    @Then("User fills up the training frequency level details")
    public void userFillsUpTheTrainingLevelDetails() {
        generateFrequencyName = dataGen.generateFrequencyName();
        tmp.enterFrequencyName(generateFrequencyName);
    }

    @Then("User fills up the training venue details")
    public void usFillsUpTheTrainingVenueDetails() {
        tmp.enterVenueContact(
                dataGen.generatePhoneNumber(),
                dataGen.generateTimestampedEmail(),
                dataGen.generateAddress()
        );
        tmp.enterVenueName(dataGen.generateVenueName());
        tmp.enterMaxNoParticipants(dataGen.generateMaxNoParticipants());
        tmp.selectVenueType("Dubai");
        tmp.selectCountry("United Arab Emirates");
        tmp.selectCity("Dubai");
    }

    @Then("User fills up the Trainers Assessors details")
    public void userFillUpTrainersAssessors() throws Exception {
        tmp.trainersAssessorsDetails(companyName);
    }

//        @When("User fills up the training schedule with random details")
//        public void fillTrainingScheduleDetails() {
//
//            tmp.selectAllRandomDropdowns();
//
//            String startDate = dataGen.generateCurrentDate(); // Today
//            String endDate = dataGen.generateFutureDate(2);   // 2 days later
//
//            // 3. Fill Dates and Times (Start < End)
//            tmp.fillScheduleDatesAndTimes(startDate, endDate, "09:00 AM", "05:00 PM");
//
//            // 4. Fill Remarks
//            tmp.enterRemarks("Automated Schedule: " + dataGen.generateRandomRemarks());
//        }
   @Then("User clicks on first available schedule record")
   public void user_clicks_on_first_available_record() {
    tmp.clickOnFirstScheduleData();
   }
    @Then("User clicks on the {string} tab in training schedule page")
    public void userClicksOnSubMenu(String tabTitle) {
        tmp.clickOnSubMenuByTitle(tabTitle);
    }
    @Then("User clicks on {string} button in training Schedule page")
    public void userClicksOnButton(String button) {
        tmp.clickOnButtonInSchedulePage(button);
    }

    @Then("User selects the planned participants")
    public void selectOtherParticipants() {
        tmp.selectPlannedParticipants();
    }
    @When("User updates the training status to {string}")
    public void user_updates_the_training_status_to(String status) {
        tmp.selectNewStatus(status.trim());
    }
    @Then("User accepts the warning popup")
    public void acceptWarningPopup() {
        tmp.acceptWarningPopup();
    }

    @Then("User fills up the Training Schedules details")
    public void fillsTrainingSchedules() throws Exception {
        tmp.scheduleDetails();
    }

    @Then("User fills start and end time and date")
    public void fillsTimeAndDate() throws Exception {
        tmp.timeAndDate();
    }
}

