package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.ManageLocationMasterPage;
import pages.PermittoWorkManagementPage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import utils.ConfigReader;
import utils.ExcelUtils;

import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

import java.io.IOException;

public class PermittoWorkManagementSteps
{
    private final WebDriver driver = DriverFactory.getDriver();
    PermittoWorkManagementPage tmp = new PermittoWorkManagementPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();
    public static String Typename, TypeOfWI, ShortName;

    @Then("User clicks on PTW icon in side panel")
    public void clickOnIcon()
    {
        tmp.clickOnIcon();
    }
    @Then("User clicks on PTW Checklist by Type tab")
    public void userClicksOnTab()
    {
        tmp.clickTabByTitle();
    }
    @Then("User clicks on the action button {string}")
    public void user_click_on_action_button(String button)
    {
        tmp.clickonbutton(button);
    }
    @Then("User enters {string} details")
    public void user_fill_up_the_city_details(String type) throws IOException
    {
        Typename = dataGen.generatePTWType();
        tmp.enterPTWType(Typename);
        ShortName = dataGen.generateSN();
        tmp.enterSN(ShortName);
        TypeOfWI = dataGen.generateTOWI();
        tmp.enterTOWI(TypeOfWI);
        tmp.clickIssuanceApplicability();
        tmp.clickRequesterApplicability();
    }
    @Then("User clicks on the save action button")
    public void userClicksOnSaveActionButton()
    {
        tmp.clickSaveActionButton();
    }
    @Then("User verify if the type is created")
    public void user_verify_the_success_message_after_creating_type()
    {
        tmp.verifyTypeName(Typename);
    }
    @Then("User filters and clicks the Draft status record")
    public void user_verify_the_status_of_filtered_records()
    {
        tmp.filterAndClickDraftRecord();
    }
    @Then("User adds required checklist")
    public void user_fills_checklist_details()
    {
        tmp.clickonChecklistmenu();
        //tmp.addChecklist();
    }
}
