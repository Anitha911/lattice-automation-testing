package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AdministrationMastersPage;
import utils.DriverFactory;
import utils.HelperUtils;
import utils.TestDataGenerator;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdministrationMastersSteps {
    public static String Note_Type_Category;
    public static String Update_Note_Type_Category;
    public static String Document_Type;
    public static String Update_Document_Type;
    public static String Holiday;
    public static String Update_Holiday;
    public static String Announcement;
    public static String Update_Announcement;
    public static String Email_Listener_Setup;
    public static String Update_Email_Listener_Setup;
    public static String Master_Administration_Scope;

    private final WebDriver driver = DriverFactory.getDriver();
    AdministrationMastersPage tmp = new AdministrationMastersPage(driver);
    HelperUtils helperUtils = new HelperUtils(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User move to {string} section")
    public void usermovetosection(String sectionName) {
        tmp.moveToSectionByName(sectionName);
    }

    @And("User clicks on Administration Save button")
    public void user_clicks_on_button_Administration_save() {
        tmp.clickAdministrationSaveButton();
    }

    @Then("User fills the Note Type Category details")
    public void user_Add_Note_Type_Category_details() throws IOException {
        Note_Type_Category = dataGen.generateNote_Type_Category();
        tmp.enterNote_Type_Category(Note_Type_Category);
    }

    @Then("User verify if the Note Type Category is created")
    public void user_verify_Note_Type_Category_creation() {
        tmp.verifyAddNote_Type_Category(Note_Type_Category);
    }

    @Then("User clicks on first available Note Type Category to edit")
    public void user_clicks_on_first_available_Note_Type_Category_to_edit() {
        tmp.clickNote_Type_CategorytoEdit();
    }

    @And("User updates the Note Type Category details")
    public void user_Updates_Note_Type_Category_details() throws IOException {
        Update_Note_Type_Category = dataGen.generateNote_Type_Category();
        tmp.updateNote_Type_Category(Update_Note_Type_Category);
    }

    @Then("User verify if the Note Type Category is updated")
    public void user_verify_the_success_message_after_updating_Note_Type_Category() {
        tmp.verifyUpdateNote_Type_Category(Update_Note_Type_Category);
    }

    @Then("User clicks on first available Note Type Category to delete")
    public void user_clicks_on_first_available_Note_Type_Category_to_delete() {
        tmp.clickNote_Type_CategoryToDelete();
    }

    @Then("User fills the Document Type details")
    public void user_Add_Document_Type_details() throws IOException {
        Document_Type = dataGen.generateDocument_Type();
        tmp.enterDocument_Type(Document_Type);
        tmp.selectDocumentRelatedTo("Invoice", "Request");
    }

    @Then("User verify if the Document Type is created")
    public void user_verify_Document_Type_creation() {
        tmp.verifyAddDocument_Type(Document_Type);
    }

    @Then("User clicks on first available Document Type to edit")
    public void user_clicks_on_first_available_Document_Type_to_edit() {
        tmp.clickDocument_TypetoEdit();
    }

    @And("User updates the Document Type details")
    public void user_Updates_Document_Type_details() throws IOException {
        Update_Document_Type = dataGen.generateDocument_Type();
        tmp.updateDocument_Type(Update_Document_Type);
    }

    @Then("User verify if the Document Type is updated")
    public void user_verify_the_success_message_after_updating_Document_Type() {
        tmp.verifyUpdateDocument_Type(Update_Document_Type);
    }

    @Then("User clicks on first available Document Type to delete")
    public void user_clicks_on_first_available_Document_Type_to_delete() {
        tmp.clickDocument_TypeToDelete();
    }

//    Annual Holiday List

    @Then("User fills the Annual Holiday List details")
    public void user_Add_Annual_Holiday_List_details() throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fromDate = LocalDate.now().plusDays(15).format(formatter);
        String toDate = LocalDate.now().plusDays(18).format(formatter);
        tmp.enterHolidayFrom_Date(fromDate);
        tmp.enterHolidayTo_Date(toDate);
        Holiday = dataGen.generateHoliday();
        tmp.enterHoliday(Holiday);
    }

    @Then("User verify if the Annual Holiday List is created")
    public void user_verify_Annual_Holiday_List_creation() {
        tmp.verifyAddAnnual_Holiday_List(Holiday);
    }

    @Then("User clicks on first available Annual Holiday List to edit")
    public void user_clicks_on_first_available_Annual_Holiday_List_to_edit() {
        tmp.clickAnnual_Holiday_List_toEdit();
    }

    @And("User updates the Annual Holiday details")
    public void user_Updates_Annual_Holiday_List_details() throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fromDate = LocalDate.now().plusDays(7).format(formatter);
        String toDate = LocalDate.now().plusDays(9).format(formatter);
        tmp.updateHolidayFrom_Date(fromDate);
        tmp.updateHolidayTo_Date(toDate);
        Update_Holiday = dataGen.generateHoliday();
        tmp.Update_Holiday(Update_Holiday);
    }

    @Then("User verify if the Annual Holiday List is updated")
    public void user_verify_the_success_message_after_updating_Annual_Holiday() {
        tmp.verifyUpdateAnnual_Holiday_List(Update_Holiday);
    }

    @Then("User clicks on first available Annual Holiday List to delete")
    public void user_clicks_on_first_available_Annual_Holiday_List_to_delete() {
        tmp.clickAnnual_Holiday_ListToDelete();
    }

    @Then("User fills the Announcement details")
    public void user_Add_Announcement_details() throws IOException {
        Announcement = dataGen.generateAnnouncement();
        tmp.enterAnnouncement_Title(Announcement);
        String startDate = dataGen.generateRandomDate();
        String endDate = dataGen.generateRandomEndDate(startDate);
        tmp.selectStart_Date(startDate);
        tmp.selectEnd_Date(endDate);
        tmp.enterDescription("Announcement Description");
    }

    @Then("User verify if the Announcement is created")
    public void user_verify_Announcement_creation() {
        tmp.verifyAddAnnouncement(Announcement);
    }

    @Then("User clicks on first available Announcement to edit")
    public void user_clicks_on_first_available_Announcement_to_edit() {
        tmp.clickAnnouncementtoEdit();
    }

    @And("User updates the Announcement details")
    public void user_Updates_Announcement_details() throws IOException {
        Update_Announcement = dataGen.generateAnnouncement();
        tmp.updateAnnouncement(Update_Announcement);
        String startDate = dataGen.generateRandomDate();
        String endDate = dataGen.generateRandomEndDate(startDate);
        tmp.updateStartDate(startDate);
        tmp.updateEndDate(endDate);
    }

    @Then("User verify if the Announcement is updated")
    public void user_verify_the_success_message_after_updating_Announcement() {
        tmp.verifyUpdateAnnouncement(Update_Announcement);
    }

    @Then("User clicks on first available Announcement to delete")
    public void user_clicks_on_first_available_Announcement_to_delete() {
        tmp.clickAnnouncementToDelete();
    }

//    Email Listener Setup

    @Then("User fills the Email Listener Setup details")
    public void user_Add_Email_Listener_Setup_details() throws IOException {
        Email_Listener_Setup = dataGen.generateMaster_Administration_Email_Server();
        tmp.enterEmail_Server(Email_Listener_Setup);
        String portNumber = dataGen.generateMaster_Administration_PortNumber();
        tmp.enterPort_Number(portNumber);
        String clientId = dataGen.generateMaster_Administration_ClientId();
        tmp.enterClient_Id(clientId);
        String clientSecret = dataGen.generateMaster_Administration_ClientSecret();
        tmp.enterClient_Secret(clientSecret);

        String emailAccount = dataGen.generateMaster_Administration_EmailAccount();
        String password = dataGen.generateMaster_Administration_Password();
        tmp.enterEmail_Account(emailAccount);
        tmp.enterAccount_Password(password);
        tmp.enterRedirectionURL(dataGen.generateURL("redirect"));
        tmp.enterAuthCodeURL(dataGen.generateURL("auth"));
        tmp.enterTokenExchangeURL(dataGen.generateURL("token"));
        tmp.enterDeviceURL(dataGen.generateURL("device"));
        tmp.selectEncryptionMethodrandom();
        Master_Administration_Scope = dataGen.generateScope();
        tmp.enterScope(Master_Administration_Scope);
    }

    @Then("User verify if the Email Listener Setup is created")
    public void user_verify_Email_Listener_Setup_creation() {
        tmp.verifyAddEmail_Listener_Setup(Email_Listener_Setup);
    }

    @Then("User clicks on first available Email Listener Setup to edit")
    public void user_clicks_on_first_available_Email_Listener_Setup_to_edit() {
        tmp.clickEmail_Listener_SetuptoEdit();
    }

    @And("User updates the Email Listener Setup details")
    public void user_Updates_Email_Listener_Setup_details() throws IOException {
        Update_Email_Listener_Setup = dataGen.generateMaster_Administration_Email_Server();
        tmp.updategenerateEmail_Server(Update_Email_Listener_Setup);
    }

    @Then("User verify if the Email Listener Setup is updated")
    public void user_verify_the_success_message_after_updating_Email_Listener_Setup() {
        tmp.verifyUpdateEmail_Listener_Setup(Update_Email_Listener_Setup);
    }

    @Then("User clicks on first available Email Listener Setup to delete")
        public void user_clicks_on_first_available_Email_Listener_Setup_to_delete() {
        tmp.clickEmail_Listener_SetupToDelete();
    }

    //Export to Excel

    @Then("User click on the Master Administration Export to Excel button")
    public void user_clicks_on_Master_Administration_Export_to_Excel_button() {
        tmp.MasterAdministrationExporttoExcel();
    }

//   ValidationNoteType/Category
    @Then("User verify the inline error message {string} on Note Type Category")
    public void user_verify_inline_error_message_on_note_type_category(String expectedMessage) {
        System.out.println("Verifying inline error message for Note Type Category. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinNotesType_C_RequiredFieldValidator6");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("user verify the chars min len as {int} and max len as {int} for Note Type Category")
    public void user_verify_chars_len_Note_Type_Category(int minLen, int maxLen) {
        System.out.println("Verifying Note Type Category field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtNoteType"),maxLen, minLen);
        System.out.println("Note Type Category field length validation verified successfully.");
    }

    @When("User enters special characters in Note Type Category")
    public void enterSpecialCharactersInNoteTypeCategory() {
        System.out.println("Verifying Note Type Category field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtNoteType"));
        System.out.println("Special character validation completed for Note Type Category");
    }

    //   ValidationDocumentType
    @Then("User verify Active checkbox is selected by default in Document Type")
    public void user_verify_active_checkbox_is_checked_by_default_in_Document_Type() {
        helperUtils.verifyActiveCheckboxSelected(By.id("chkDocActive"));
    }

    @Then("User verify the inline error message {string} on Document Type")
    public void user_verify_inline_error_message_on_Document_Type(String expectedMessage) {
        System.out.println("Verifying inline error message for Document Type. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinDocument_C_rfvDocument");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Document Related To")
    public void user_verify_inline_error_message_on_Document_Related_To(String expectedMessage) {
        System.out.println("Verifying inline error message for Document Related To. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinDocument_C_RequiredFieldValidator25");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("user verify the chars min len as {int} and max len as {int} for Document Type")
    public void user_verify_chars_len_Document_Type(int minLen, int maxLen) {
        System.out.println("Verifying Document Type field length validation. Expected Min Length: "
                        + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtDocument"),maxLen, minLen);
        System.out.println("Document Type field length validation verified successfully.");
    }

    @When("User enters special characters in Document Type")
    public void enterSpecialCharactersInDocumentType() {
        System.out.println("Verifying Document Type field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtDocument"));
        System.out.println("Special character validation completed for Document Type");
    }


    //   ValidationAnnualHoliday
    @Then("User verify the inline error message {string} on From Date")
    public void user_verify_inline_error_message_on_From_Date(String expectedMessage) {
        System.out.println("Verifying inline error message for From Date. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinHoliday_C_RequiredFieldValidator11");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on To Date")
    public void user_verify_inline_error_message_on_To_Date(String expectedMessage) {
        System.out.println("Verifying inline error message for To Date. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinHoliday_C_RequiredFieldValidator2");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Holiday")
    public void user_verify_inline_error_message_on_Holiday(String expectedMessage) {
        System.out.println("Verifying inline error message for Holiday. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinHoliday_C_RequiredFieldValidator1");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("user verify the chars min len as {int} and max len as {int} for Holiday")
    public void user_verify_chars_len_Holiday(int minLen, int maxLen) {
        System.out.println("Verifying Holiday field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtHoliday"),maxLen, minLen);
        System.out.println("Holiday field length validation verified successfully.");
    }

    @When("User enters special characters in Holiday")
    public void enter_SpecialCharactersInHoliday() {
        System.out.println("Verifying Holiday field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtHoliday"));
        System.out.println("Special character validation completed for Holiday");
    }


    //   ValidationAnnouncement
    @Then("User verify the inline error message {string} on Announcement Title")
    public void user_verify_inline_error_message_on_Announcement_Title(String expectedMessage) {
        System.out.println("Verifying inline error message for Announcement Title. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAnnoucement_C_RequiredFieldValidator3");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Start Date")
    public void user_verify_inline_error_message_on_Start_Date(String expectedMessage) {
        System.out.println("Verifying inline error message for Start Date. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAnnoucement_C_RequiredFieldValidator8");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on End Date")
    public void user_verify_inline_error_message_on_End_Date(String expectedMessage) {
        System.out.println("Verifying inline error message for End Date. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAnnoucement_C_RequiredFieldValidator9");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Description")
    public void user_verify_inline_error_message_on_Description(String expectedMessage) {
        System.out.println("Verifying inline error message for Description. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinAnnoucement_C_RequiredFieldValidator7");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("user verify the chars min len as {int} and max len as {int} for Announcement Title")
    public void user_verify_chars_len_Announcement_Title(int minLen, int maxLen) {
        System.out.println("Verifying Announcement Title length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("RadMainTitle"),maxLen, minLen);
        System.out.println("Announcement Title field length validation verified successfully.");
    }

    @When("user verify the chars min len as {int} and max len as {int} for Description")
    public void user_verify_chars_len_Description(int minLen, int maxLen) {
        System.out.println("Verifying Description field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("RadDescription"),maxLen, minLen);
        System.out.println("Description field length validation verified successfully.");
    }

    @When("User enters special characters in Announcement Title")
    public void enterSpecialCharactersInAnnouncementTitle() {
        System.out.println("Verifying Announcement Title field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("RadMainTitle"));
        System.out.println("Special character validation completed for Announcement Title");
    }

    @When("User enters special characters in Description")
    public void enterSpecialCharactersInDescription() {
        System.out.println("Verifying Description field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("RadDescription"));
        System.out.println("Special character validation completed for Description");
    }

    //   ValidationEmailListenerSetup
    @Then("User verify the inline error message {string} on Email Server")
    public void user_verify_inline_error_message_on_Email_Server(String expectedMessage) {
        System.out.println("Verifying inline error message for Email Server. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator12");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Port Number")
    public void user_verify_inline_error_message_on_Port_Number(String expectedMessage) {
        System.out.println("Verifying inline error message for Port Number. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator13");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Client Id")
    public void user_verify_inline_error_message_on_Client_Id(String expectedMessage) {
        System.out.println("Verifying inline error message for Client Id. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator17");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Client Secret")
    public void user_verify_inline_error_message_on_Client_Secret(String expectedMessage) {
        System.out.println("Verifying inline error message for Client Secret. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator18");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Email Account")
    public void user_verify_inline_error_message_on_Email_Account(String expectedMessage) {
        System.out.println("Verifying inline error message for Email Account. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator14");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Account Password")
    public void user_verify_inline_error_message_on_Account_Password(String expectedMessage) {
        System.out.println("Verifying inline error message for Account Password. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator15");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Redirection URL")
    public void user_verify_inline_error_message_on_Redirection_URL(String expectedMessage) {
        System.out.println("Verifying inline error message for Redirection URL. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator19");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Auth Code URL")
    public void user_verify_inline_error_message_on_Auth_Code_URL(String expectedMessage) {
        System.out.println("Verifying inline error message for Auth Code URL. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator20");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Token Exchange URL")
    public void user_verify_inline_error_message_on_Token_Exchange_URL(String expectedMessage) {
        System.out.println("Verifying inline error message for Token Exchange URL. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator21");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Device URL")
    public void user_verify_inline_error_message_on_Device_URL(String expectedMessage) {
        System.out.println("Verifying inline error message for Device URL. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator23");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Encryption Method")
    public void user_verify_inline_error_message_on_Encryption_Method(String expectedMessage) {
        System.out.println("Verifying inline error message for Encryption Method. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator16");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @Then("User verify the inline error message {string} on Scope")
    public void user_verify_inline_error_message_on_Scope(String expectedMessage) {
        System.out.println("Verifying inline error message for Scope. Expected message: "
                + expectedMessage);
        By errorLocator = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_RequiredFieldValidator22");
        helperUtils.verifyInlineErrorMessage(errorLocator, expectedMessage);
        System.out.println("Inline error message verified successfully: " + expectedMessage);
    }

    @When("user verify the chars min len as {int} and max len as {int} for Email Server")
    public void user_verify_chars_len_Email_Server(int minLen, int maxLen) {
        System.out.println("Verifying Email Server length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtServer"),maxLen, minLen);
        System.out.println("Email Server field length validation verified successfully.");
    }

    @When("user verify the chars min len as {int} and max len as {int} for Port Number")
    public void user_verify_chars_len_Port_Number(int minLen, int maxLen) {
        System.out.println("Verifying Port Number field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtPortNo"),maxLen, minLen);
        System.out.println("Port Number field length validation verified successfully.");
    }

    @When("user verify the chars min len as {int} and max len as {int} for Email Account")
    public void user_verify_chars_len_Email_Account(int minLen, int maxLen) {
        System.out.println("Verifying Email Account field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtEmailAccount"),maxLen, minLen);
        System.out.println("Email Account field length validation verified successfully.");
    }

    @When("user verify the chars min len as {int} and max len as {int} for Account Password")
    public void user_verify_chars_len_Account_Password(int minLen, int maxLen) {
        System.out.println("Verifying Account Password field length validation. Expected Min Length: "
                + minLen + ", Expected Max Length: " + maxLen);
        helperUtils.verifyMinAndMaxLength(By.id("radtxtAccPassword"),maxLen, minLen);
        System.out.println("Account Password field length validation verified successfully.");
    }

    @When("User enters special characters in Email Server")
    public void enterSpecialCharactersInEmailServer() {
        System.out.println("Verifying Email Server field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtServer"));
        System.out.println("Special character validation completed for Email Server");
    }

    @When("User enters special characters in Port Number")
    public void enterSpecialCharactersInPortNumber() {
        System.out.println("Verifying Port Number field accepts/rejects special characters");
        helperUtils.enterSpecialCharacters(By.id("radtxtPortNo"));
        System.out.println("Special character validation completed for Port Number");
    }
}
