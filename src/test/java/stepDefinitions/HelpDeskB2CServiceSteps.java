package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HelpDeskB2CServicePage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import java.io.IOException;

public class HelpDeskB2CServiceSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    HelpDeskB2CServicePage tmp = new HelpDeskB2CServicePage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User clicks on HelpDesk {string} in navigation panel")
    public void user_click_on_HelpDesk(String title) throws InterruptedException {
        String xpath = "//*[@id='27']";
        tmp.clickOnHelpDeskMenu(xpath);
    }
    @Then("User clicks on the Call Centre {string} tab")
    public void user_click_on_CallCentreHelpDesk(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-helpdesk']/div[2]/div/ul[1]/li[2]/a";
        tmp.CallCentreHelpDesk(xpath);
    }
    @Then("User clicks Direct WO Booking Button")
    public void user_clicks_DirectWOBkngButton() {
        tmp.clickDirectWOBkngButton();
    }
    @Then("User clicks Help Desk Add New Contact Button")
    public void user_clicks_AddNewContact() {
        tmp.clickAddNewContact();
    }
    @Then("User enter the details in Add New Contact pop up")
    public void userFillsUpAddNewContactDetails() {
        String ContactName=dataGen.generateCustomerName();
        tmp.ContatName(ContactName);
        tmp.selectType("OEM");
        String Email=dataGen.generateCustEmail();
        tmp.ContactEmail(Email);
        String MobileNumber=dataGen.generateCustMobile();
        tmp.CustMobile(MobileNumber);
        String Username=dataGen.generateDisplayName();
        tmp.UserName(Username);
    }
    @Then("User clicks the Help Desk New Contact Save button")
    public void userClicksHelpDeskNewContactSaveButton() {
        tmp.HelpDeskNewContactSaveButton();
    }
    @Then("User clicks the Help Desk New Contact Cancel button")
    public void userClicksHelpDeskNewContactCancelButton() {
        tmp.HelpDeskNewContactCancelButton();
    }
    @Then("User selects Help Desk option from the search dropdown")
    public void userSelectsSearchOption() {
        tmp.selectBy("Name");
    }
    @Then("User Help Desk enters search term")
    public void userEntersSearchTermTxtbox() {
        tmp.SearchText("SearchText");
    }
    @Then("User clicks Search button")
    public void user_clicks_Search() {
        tmp.clickSearch();
    }
    //Pagination starts
    @Then("User Clicks on Help Desk grid {string}")
    public void user_click_on_HelpDeskPagination(String HelpDeskPagination) throws InterruptedException {
        tmp.HelpDeskPagination(HelpDeskPagination);
    }
    //Pagination Ends
    //No of data per page
    @Then("User clicks the Help Desk no of data per page {int} in the grid")
    public void user_click_on_HelpDeskDataPerPage(int HelpDeskDataPerPage) throws InterruptedException {
        tmp.validatePageSizeHelpDesk(HelpDeskDataPerPage);
    }
    //No of Data per page
    //Help Desk Ends

    //B2C Service Desk starts
    @Then("User clicks on B2CServiceDesk {string} in Navigation panel")
    public void user_click_on_B2CServiceDesk(String title) throws InterruptedException {
        String xpath = "//*[@id='31']";
        tmp.clickOnB2CServiceDesk(xpath);
    }
    @Then("User clicks the B2CServiceDesk Product {string} section")
    public void user_click_on_B2CServiceDeskProduct(String title) throws InterruptedException {
        String xpath = "//*[@id=tab-Servicedesk']/div[2]/div/ul[1]/li[2]/a";
        tmp.clickOnB2CServiceDeskProd(xpath);
    }
    @Then("User Clicks Export To Excel")
    public void user_click_on_B2CSDPRDExcel() throws InterruptedException {
        tmp.clickOnB2CSDPRDExcel();
    }
    //Pagination starts
    @Then("User Clicks on B2CServiceDesk Product grid {string}")
    public void user_click_on_B2CSDProdPagination(String B2CSDProdPagination) throws InterruptedException {
        tmp.B2CSDProdPagination(B2CSDProdPagination);
    }
    //Pagination Ends
    //No of data per page
    @Then("User clicks the B2CServiceDesk Product no of data per page {int} in the grid")
    public void user_click_on_B2CSDProdDataPerPage(int B2CSDProdDataPerPage) throws InterruptedException {
        tmp.validatePageSizeB2CSDProd(B2CSDProdDataPerPage);
    }
    //No of Data per page
    @Then("User Clicks on B2CServiceDesk Add Product {string} Button")
    public void user_click_on_B2CSAddProd(String ProdAdd) throws InterruptedException {
        tmp.clickOnB2CSAddProd(ProdAdd);
    }
    //Add New Product Starts
    @Then("User Enters the details in the Add New Product Pop Up")
    public void userFillsProductMasterDetails() {
        tmp.ProdIntName(dataGen.generateIntName());
        tmp.ProdDisplayName(dataGen.generateDisplayName());
        tmp.ProdShortDesc(dataGen.generateShortDesc());
        tmp.ProdInspecCharge(dataGen.generateInspecCharges());
        tmp.ProdMaxPPMCount(dataGen.generateMaxNoParticipants());
        //DropDowns
        tmp.selectProdMasterCat("Community Specific Package");
        tmp.selectProdCat("Gold Reactive Package");
        tmp.selectProdSubCat("Gold Reactive Package");
        tmp.selectPaymentSchedule("Yearly");
        tmp.selectWOType("Reactive Maintenance");
        tmp.selectFaultCode("Civil Works  /  Road Signs  /  Signs-Painting");
        tmp.selectPPMAfter("3");
    }
    @Then("User clicks the B2C Product Save Button")
    public void user_click_on_AddProdButton() {
        tmp.ClickAddProdSave();
    }
    //Add New Product Ends
    //Product Detail Page Start
    @Then("User clicks B2CServiceDesk first data in the Product grid to Open the Detail page")
    public void user_clicks_on_B2CProdGridFirstData() throws InterruptedException  {
        String B2CProdGridFirstData = "//*[@id='ctl00_ContentPlaceHolder1_grdB2CProduct_ctl00__0']";
        tmp.B2CProdGridFirstData(B2CProdGridFirstData);
    }
    //Product Detail Page Ends
    //B2CService Help Desk Start
    @Then("User clicks the B2CServiceDesk HelpDesk {string} section")
    public void user_click_on_B2CServiceHelpDesk(String title) throws InterruptedException {
        String xpath = "//*[@id='tab-Servicedesk']/div[2]/div/ul[2]/li[2]/a";
        tmp.clickOnB2CServiceHelpDesk(xpath);
    }
    @Then("User Clicks Add Client Button click")
    public void user_click_on_B2CAddClientClick() throws InterruptedException {
        tmp.B2CAddClientClick();
    }
    @Then("User Enters details in B2CServiceDeskHelpDesk pop up")
    public void userFillsB2CServiceHelpDeskDetails() {
        tmp.ClientName(dataGen.generateClientType());
        tmp.ContatPerson(dataGen.generateContactPerson());
        tmp.CustMobile(dataGen.generateCustMobile());
        tmp.ContactEmail(dataGen.generateCustEmail());
        tmp.AddressLine(dataGen.generateAddress());
        //DropDowns
        tmp.selectClientType("B2B Corporate");
        tmp.selectCountry("India");
        tmp.selectCity("Chennai");
        tmp.selectCustImp("VIP");
    }
    @Then("User clicks B2CServiceDeskHelpDesk Save Button")
    public void user_click_on_B2CServiceDeskHelpDesk() {
        tmp.B2CServiceDeskHelpDeskSave();
    }
    @Then("User enters search Criteria in the search Textbox")
    public void userB2CServiceHDSearch() {
        tmp.ClientNameSearch();
    }
    @Then("The User clicks the Search button")
    public void user_click_on_userB2CServiceHDSearchButton() throws InterruptedException{
        tmp.B2CServiceDeskHelpDeskSearch();
    }
    @Then("User clicks the first data in the grid to Open the detail page")
    public void user_click_on_B2CClientFirstDataclick() throws InterruptedException {
        tmp.B2CClientFirstDataclick();
    }
    //Client Detail Mobile Start
    @Then("User Clicks the Change Mobile Number button")
    public void user_click_on_B2CServiceHDChangeMobileButton() throws InterruptedException{
        tmp.B2CServiceHDChangeMobileButton();
    }
    @Then("User enters the details in the change mobile number pop up")
    public void B2CServiceHDChangeMobileNumbDetails() {
            String NewMobileNumber=dataGen.generateCustMobile();
            tmp.NewMobileNumber(NewMobileNumber);
    }
    @Then("User clicks the Client Change Mobile Number Submit button")
    public void user_click_on_B2CServiceHDChangeMobileNumberSubmit() throws InterruptedException{
        tmp.B2CServiceHDChangeMobileNumberSubmit();
    }
    //Client Detail Mobile End
    //Client Detail Email Start
    @Then("User Clicks the Change Email button")
    public void user_click_on_B2CServiceHDChangeEmailButton() throws InterruptedException{
        tmp.B2CServiceHDChangeEmailButton();
    }
    @Then("User enters the details in the change Email pop up")
    public void B2CServiceHDChangeEmailDetails() {
        String NewEmail=dataGen.generateCustEmail();
        tmp.NewEmail(NewEmail);
    }
    @Then("User clicks the Client Change Email Submit button")
    public void user_click_on_B2CServiceHDChangeEmailSubmit() throws InterruptedException{
        tmp.B2CServiceHDChangeEmailSubmit();
    }
    //Client Detail Email End
    @Then("User clicks the Edit Client Button")
    public void user_click_on_B2CServiceHDEditClient() throws InterruptedException{
        tmp.B2CServiceHDEditClient();
    }
    @Then("User clicks the Client Details Update Button")
    public void user_click_on_B2CServiceHDUpdateClient() throws InterruptedException{
        tmp.B2CServiceHDUpdateClient();
    }
    @Then("User clicks the Client Detail Link Property Button")
    public void user_click_on_B2CServiceHDLinkProperty() throws InterruptedException{
        tmp.B2CServiceHDLinkProperty();
    }
    @Then("User clicks the Link Property Button in Property page")
    public void user_click_on_B2CServiceHDPropertyDetailLink() throws InterruptedException{
        tmp.B2CServiceHDPropertyDetailLink();
    }
    @Then("User clicks the previous tab and Refresh to see the Property Added")
    public void user_click_on_B2CServiceHDclientRefreshAfterPropAdd() throws InterruptedException{
        tmp.B2CServiceHDclientRefreshAfterPropAdd();
    }
    @Then("User Edits an Existing Property in the Client detail Page")
    public void user_click_on_B2CServiceHDclientDetailEditProperty() throws InterruptedException{
        tmp.B2CServiceHDclientDetailEditProperty();
    }
    @Then("User clicks Client detail Page Update Button")
    public void user_click_on_B2CServiceHDclientDetailUpdateProperty() throws InterruptedException{
        tmp.B2CServiceHDclientDetailUpdateProperty();
    }
    @Then("User clicks the Property to get Property Detail Page")
    public void user_click_on_B2CServiceHDclientDetailPropertyDetail() throws InterruptedException{
        tmp.B2CServiceHDclientDetailPropertyDetail();
    }
    @Then("User clicks Existing WO Manage WO Button Click")
    public void user_click_on_B2CServiceHDclientDetailPropertyDetailManageWO() throws InterruptedException{
        tmp.B2CServiceHDclientDetailPropertyDetailManageWO();
    }
    @Then("User clicks Service Purchase Book Service Click")
    public void user_click_on_B2CServiceHDclientDetailPropertyDetailBookService() throws InterruptedException{
        tmp.B2CServiceHDclientDetailPropertyDetailBookService();
    }
    @Then("User clicks Package Purchase Buy Package Click")
    public void user_click_on_B2CServiceHDclientDetailPropertyDetailBuyPackage() throws InterruptedException{
        tmp.B2CServiceHDclientDetailPropertyDetailBuyPackage();
    }
    @Then("User clicks Unit Contacts Management Manage Contacts Click")
    public void user_click_on_B2CServiceHDclientDetailPropertyDetailManageContacts() throws InterruptedException{
        tmp.B2CServiceHDclientDetailPropertyDetailManageContacts();
    }
    @Then("User clicks B2CServiceDesk Purchase Service Button")
    public void user_click_on_B2CServiceHDClientDetailPropertyDetailPurchaseService() throws InterruptedException{
        tmp.B2CServiceHDClientDetailPropertyDetailPurchaseService();
    }
    @Then("User clicks B2CServiceDesk Submit Service Button")
    public void user_click_on_B2CServiceHDClientDetailPropertyDetailPurchaseServiceSubmitService() throws InterruptedException{
        tmp.B2CServiceHDClientDetailPropertyDetailPurchaseServiceSubmitService();
    }
    //B2CService Help Desk End
    //B2C Service Desk ends

}
