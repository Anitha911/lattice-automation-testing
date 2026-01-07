package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.ManageLocationMasterPage;
import utils.DriverFactory;
import utils.TestDataGenerator;
import utils.ConfigReader;
import utils.ExcelUtils;
import java.util.Random;
import java.util.UUID;

import java.io.IOException;
public class ManageLocationMasterSteps {
    public static String cityName;
    public static String mCityName;
    //= String.valueOf(By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00__0']/td[3][@title]"));
    public static int pageCount;
    private final WebDriver driver = DriverFactory.getDriver();
    ManageLocationMasterPage tmp = new ManageLocationMasterPage(driver);
    TestDataGenerator dataGen = new TestDataGenerator();

    @Then("User clicks on {string} icon in side panel")
    public void clickOnIcon(String dataConfig) {
        tmp.clickOnIcon(dataConfig);
    }

    @Then("User clicks on respective {string} tab")
    public void userClicksOnTab(String tabbyTitle) {
        tmp.clickTabByTitle(tabbyTitle);
    }

    @Then("User clicks on action button {string}")
    public void user_click_on_action_button(String button)
    {
        tmp.clickonbutton(button);
    }

    @Then("User enters the {string} details")
    public void user_fill_up_the_city_details(String type) throws IOException
    {
        tmp.selectCountry("United Arab Emirates");
        cityName = dataGen.generateCityName();
        tmp.enterCityName(cityName);
    }

    @Then("User clicks on save action button")
    public void userClicksOnSaveActionButton() {
        tmp.clickSaveActionButton();
    }

    @Then("User verify if the city is created")
    public void user_verify_the_success_message_after_creating_city() {
        tmp.verifyCityName(cityName);
    }

    @Then("User clicks on first available city to edit")
    public void userclicksFirstCity()
    {
        tmp.getFirstCityName();
    }

    @Then("User edits the 'City' details")
    public String userEditsCity()
    {
        String updatedCity = tmp.modifiesCityName(mCityName);
        System.out.println("New Edited City is: " + updatedCity);
        ManageLocationMasterSteps.mCityName = updatedCity;
        return updatedCity;
    }

    @Then("User clicks on update button")
    public void user_clicks_on_update_button()
    {
        tmp.clickUpdateButton();
        //tmp.clickSaveActionButton();
    }

    @Then("User verify if the city is updated")
    public void user_verify_if_the_city_is_updated()
    {
        tmp.verifyCityName(mCityName);
    }
    @Then ("User gets the total record count")
   // public void user_gets_record_count()

        //int totalRecordCount = tmp.getTotalRecordCount(pageCount);

    @Then ("User clicks on first available delete icon")
    public void user_clicks_first_available_city_to_delete()
    {
        tmp.deleteCity();
    }

    @Then("User waits for 5 seconds once button is clicked")
    public void userWaitsForIntSeconds()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("User verify if the city is deleted")
    public void userVerifyIfTheCityIsDeleted()
    {
        tmp.verify_deleted_City(pageCount);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}