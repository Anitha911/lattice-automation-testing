package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.TrainingManagementPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;

import java.io.IOException;

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
    HelperUtils helperUtils = new HelperUtils(driver);
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


    @When("user verify the chars min len as {int} and max len as {int} on Company Name")
    public void user_verify_chars_len_companyName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtCompanyName"),maxLen, minLen);
    }

    @When("user verify the chars min len as {int} and max len as {int} on Contact Name")
    public void user_verify_chars_len_ContactName(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("txtContactName"),maxLen, minLen);
    }

    @When("user verify the chars min len as {int} and max len as {int} on Designation")
    public void user_verify_chars_len_Designation(int minLen, int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("txtDesignation"),maxLen, minLen);
    }

    @When("user verify the chars max len as {int} on Contact Number")
    public void user_verify_chars_len_1(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtContactNum"),maxLen, null);
    }

    @When("user verify the chars max len as {int} on Company Address")
    public void user_verify_chars_len_2(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("radtxtAddress"),maxLen, null);
    }

    @When("user verify the chars max len as {int} on Email")
    public void user_verify_chars_len_3(int maxLen) {
        helperUtils.verifyMinAndMaxLength(By.id("RadtxtEmail"),maxLen, null);
    }

    @When("user verify the inline error message {string} on Company Name")
    public void userVerifyInlineErrorMessageOnCompanyName(String expectedErrorMessage) {
        By companyNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingCom_C_RequiredFieldValidator2");
        helperUtils.verifyInlineErrorMessage(companyNameErrorLocator, expectedErrorMessage);
    }

    @When("user verify the inline error message {string} on Company Type")
    public void userVerifyInlineErrorMessageOnCompanyType(String expectedErrorMessage) {
        By companyNameErrorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinTrainingCom_C_RequiredFieldValidator4");
        helperUtils.verifyInlineErrorMessage(companyNameErrorLocator, expectedErrorMessage);
    }


    @When("the user clears the text field")
    public void clear_text_field() {
    }

    @When("the user leaves the selection field empty")
    public void leave_selection_empty() {
    }

    @When("the user enters more than 20 characters in the short text field")
    public void enter_more_than_20_characters() {
    }

    @When("the user enters special characters in the text field")
    public void enter_special_characters() {
    }

    @When("the user enters an invalid email format")
    public void enter_invalid_email() {
    }

    @When("the user clicks on the Save button")
    public void click_save_button() {
    }

    @Then("the system should not allow the form to be saved")
    public void verify_form_not_saved() {
    }

    @Then("appropriate validation error messages should be displayed for each invalid field")
    public void verify_validation_messages() {
    }
}

