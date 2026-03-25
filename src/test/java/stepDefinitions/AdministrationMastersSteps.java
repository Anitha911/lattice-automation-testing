package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.AdministrationMastersPage;
import utils.DriverFactory;
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

    private final WebDriver driver = DriverFactory.getDriver();
    AdministrationMastersPage tmp = new AdministrationMastersPage(driver);
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

    @Then("User fills the Annual Holiday List details")
    public void user_Add_Annual_Holiday_List_details() throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fromDate = LocalDate.now().plusDays(10).format(formatter);
        String toDate = LocalDate.now().plusDays(11).format(formatter);

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

        String fromDate = LocalDate.now().plusDays(3).format(formatter);
        String toDate = LocalDate.now().plusDays(4).format(formatter);
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
        tmp.selectStart_Date("03/03/2026");
        tmp.selectEnd_Date("03/10/2026");
        tmp.enterDescription("Announcement_Description_Test1");
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
    }

    @Then("User verify if the Announcement is updated")
    public void user_verify_the_success_message_after_updating_Announcement() {
        tmp.verifyUpdateAnnouncement(Update_Announcement);
    }

    @Then("User clicks on first available Announcement to delete")
    public void user_clicks_on_first_available_Announcement_to_delete() {
        tmp.clickAnnouncementToDelete();
    }

    @Then("User fills the Email Listener Setup details")
    public void user_Add_Email_Listener_Setup_details() throws IOException {
        Email_Listener_Setup = dataGen.generateEmail_Server();
        tmp.enterEmail_Server(Email_Listener_Setup);
        tmp.enterPort_Number("1001");
        tmp.enterClient_Id("abcd123");
        tmp.enterClient_Secret("5987");
        tmp.enterEmail_Account("san@email.com");
        tmp.enterAccount_Password("abcde12345");
        tmp.enterRedirection_URL("https://www.google.com");
        tmp.enterAuth_Code_URL("https://www.google.com");
        tmp.enterToken_Exchange_URL("https://www.test.com");
        tmp.enterDevice_URL("https://www.google.com");
        tmp.selectEncryption_Method("Encrypted");
        tmp.enterScope("12");
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
        Update_Email_Listener_Setup = dataGen.generateEmail_Server();
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

}
