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
import utils.DriverFactory;
import utils.TestDataGenerator;
import utils.ConfigReader;
import utils.ExcelUtils;

import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

import java.io.IOException;
public class ManageLocationMasterSteps {
    public static String cityName;
    public static String mCityName;
    //= String.valueOf(By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00__0']/td[3][@title]"));
    public static String deletedCity;
    public static String AreaGroupName;
    public static String AreaName;
    public static String PropertyName;
    public static String ZoneName;
    public static String SubZoneName;
    public static String BUName;
    public static String BURemarks;
    public static String ZoneCriticality;
    public static String ZoneGroupCriticality;
    public static String BUFunctionalType;
    public static String BUFunctionalSubType;
    public static int sqft=12000;
    public static String BUSizeAttributeCode;
    public static String BUSizeAttributeName;
    public static String BUSizeTypeCode;
    public static String BUSizeTypeName;
    public static String BUCriticalityName;
    public static String MeasuringValue;
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
    @Then("User enters the Area Group details")
    public void user_fill_up_the_AG_details() throws IOException
    {
        AreaGroupName = dataGen.generateAGName();
        tmp.enterAGName(AreaGroupName);
    }
    @Then("User enters the Area details")
    public void user_fill_up_the_Area_details() throws IOException
    {
        tmp.selectFirstAreaGroup();
        AreaName = dataGen.generateAreaName();
        tmp.enterAreaName(AreaName);
        tmp.selectFirstCity();
    }
    @Then("User enters the Property details")
    public void user_fill_up_the_Property_details() throws IOException
    {
        tmp.selectFirstClient();
        PropertyName = dataGen.generatePropertyName();
        tmp.enterPropertyName(PropertyName);
        tmp.selectFirstArea();
    }
    @Then("User enters the Zone details")
    public void user_fill_up_the_Zone_details() throws IOException
    {
        ZoneName = dataGen.generateZoneName();
        tmp.enterZoneName(ZoneName);
        tmp.selectFirstProperty();
    }
    @Then("User enters the Sub Zone details")
    public void user_fill_up_the_SubZone_details() throws IOException
    {
        SubZoneName = dataGen.generateSubZoneName();
        tmp.enterSubZoneName(SubZoneName);
        tmp.selectFirstSubComm();
        tmp.selectFirstZone();
    }
    @Then("User enters the Base Unit details")
    public void user_fill_up_the_Baseunit_details() throws IOException
    {
        BUName = dataGen.generateBUName();
        tmp.enterBUName(BUName);
        tmp.selectFirstBUProp();
        tmp.selectFirstBUZone();
        tmp.selectFirstBUSubZone();
        tmp.selectFirstBUFuncType();
        tmp.selectFirstBUFuncSubType();
        tmp.selectFirstBUCriticality();
        BURemarks = dataGen.generateBURemarks();
        tmp.enterBURemarks(BURemarks);
        tmp.selectFirstScopeType();
    }

    @Then("User enters the Zone Criticality details")
    public void user_fill_up_the_Zone_Criticality_details() throws IOException
    {
        ZoneCriticality = dataGen.generateZoneCriticality();
        tmp.enterZoneCriticality(ZoneCriticality);
    }
    @Then("User enters the Zone Group Criticality details")
    public void user_fill_up_the_Zone_Group_Criticality_details() throws IOException
    {
        ZoneGroupCriticality = dataGen.generateZoneGroupCriticality();
        tmp.enterZoneGroupCriticality(ZoneGroupCriticality);
    }
    @Then("User enters the BU Functional Type details")
    public void user_fill_up_the_BU_Functional_Type_details() throws IOException
    {
        BUFunctionalType = dataGen.generateBUFunctionalType();
        tmp.enterBUFunctionalType(BUFunctionalType);
    }
    @Then("User enters the BU Functional Sub Type details")
    public void user_fill_up_the_BU_Functional_SubType_details() throws IOException
    {
        BUFunctionalSubType = dataGen.generateBUFunctionalSubType();
        tmp.enterBUFunctionalSubType(BUFunctionalSubType);
        tmp.selectFirstBUFunctionalType();
        tmp.enterTotalAreaSqft(sqft);
        tmp.selectFirstServiceGroup();
    }

    @Then("User enters the BU Size Attribute details")
    public void user_fill_up_the_BU_Size_Attribute_details() throws IOException
    {
        BUSizeAttributeCode = dataGen.generateBUSizeAttributeCode();
        tmp.enterBUSizeAttributeCode(BUSizeAttributeCode);
        BUSizeAttributeName = dataGen.generateBUSizeAttributeName();
        tmp.enterBUSizeAttributeName(BUSizeAttributeName);
        String[] MeasuringValue = {"Psn","Sft","Kg", "Rs"};
        tmp.enterMeasuringValue(MeasuringValue);
    }
    @Then("User enters the BU Size Type Attribute details")
    public void user_fill_up_the_BU_Size_Type_Attribute_details() throws IOException
    {
        BUSizeTypeCode = dataGen.generateBUSizeTypeCode();
        tmp.enterBUSizeTypeCode(BUSizeTypeCode);
        BUSizeTypeName = dataGen.generateBUSizeTypeName();
        tmp.enterBUSizeTypeName(BUSizeTypeName);
        tmp.selectBUSizeAttribute();
        tmp.selectBUFunctionalType();
        tmp.selectBUFunctionalSubType();
    }
    @Then("User enters the BU Criticality details")
    public void user_fill_up_the_BU_Criticality_details() throws IOException
    {
        BUCriticalityName = dataGen.generateBUCriticalityName();
        tmp.enterBUCriticalityName(BUCriticalityName);
    }
    @Then("User clicks on save action button")
    public void userClicksOnSaveActionButton()
    {
        tmp.clickSaveActionButton();
    }

    @Then("User verify if the city is created")
    public void user_verify_the_success_message_after_creating_city()
    {
        tmp.verifyCityName(cityName);
    }

    @Then ("User verify if the Area Group is created")
    public void user_verify_the_success_message_after_creating_AG()
    {
        tmp.verifyAGName(AreaGroupName);
    }

    @Then ("User verify if the Area is created")
    public void user_verify_the_success_message_after_creating_Area()
    {
        tmp.verifyAreaName(AreaName);
    }
    @Then ("User verify if the Property is created")
    public void user_verify_the_success_message_after_creating_Property()
    {
        tmp.verifyPropertyName(PropertyName);
    }
    @Then ("User verify if the Zone is created")
    public void user_verify_the_success_message_after_creating_Zone()
    {
        tmp.verifyZoneName(ZoneName);
    }
    @Then ("User verify if the Sub Zone is created")
    public void user_verify_the_success_message_after_creating_SubZone()
    {
        tmp.verifySubZoneName(SubZoneName);
    }
    @Then("User verify if the Base Unit is created")
    public void user_verify_the_success_message_after_creating_Baseunit()
    {
        tmp.verifyBUName(BUName);
    }
    @Then("User verify if the Zone Criticality is created")
    public void user_verify_the_success_message_after_creating_ZC()
    {
        tmp.verifyZCName(ZoneCriticality);
    }
    @Then("User verify if the Zone Group Criticality is created")
    public void user_verify_the_success_message_after_creating_ZGC()
    {
        tmp.verifyZGCName(ZoneGroupCriticality);
    }
    @Then("User verify if the BU Functional Type is created")
    public void user_verify_the_success_message_after_creating_BUFuncType()
    {
        tmp.verifyBUFuncTypeName(BUFunctionalType);
    }
    @Then("User verify if the BU Functional Sub Type is created")
    public void user_verify_the_success_message_after_creating_BUFuncSubType()
    {
        tmp.verifyBUFuncSubTypeName(BUFunctionalSubType);
    }
    @Then("User verify if the BU Size Attribute is created")
    public void user_verify_the_success_message_after_creating_BUSizeAttribute()
    {
        tmp.verifyBUSizeAttributeName(BUSizeAttributeName);
    }
    @Then("User verify if the BU Size Attribute Type is created")
    public void user_verify_the_success_message_after_creating_BUSizeAttributeType()
    {
        tmp.verifyBUSizeAttributeType(BUSizeTypeName);
    }
    @Then("User verify if the BU Size Criticality is created")
    public void user_verify_the_success_message_after_creating_BUCriticality()
    {
        tmp.verifyBUCriticality(BUCriticalityName);
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

    @Then("User clicks on update button manage Master")
    public void user_clicks_update_button_manageMaster()
    {
        tmp.clickUpdateButton();
        //tmp.clickSaveActionButton();
    }

    @Then("User verify if the city is updated")
    public void user_verify_if_the_city_is_updated()
    {
        tmp.verifyCityName(mCityName);
    }

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

    }
    @Then("User clicks on 'Area Group' menu")
    public void userClicksonAreaGroup()
    {
        tmp.clickonAreaGroup();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Area Group')]
    }
    @Then("User clicks on 'Area' menu")
    public void userClicksonArea()
    {
        tmp.clickonArea();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Area')]
    }
    @Then("User clicks on 'Property' menu")
    public void userClicksonProperty()
    {
        tmp.clickonProperty();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Property')]
    }
    @Then("User clicks on 'Zone' menu")
    public void userClicksonZone()
    {
        tmp.clickonZone();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Zone')]
    }
    @Then("User clicks on 'Sub Zone' menu")
    public void userClicksonSubZone()
    {
        tmp.clickonSubZone();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Sub Zone')]
    }
    @Then("User clicks on 'Base Unit' menu")
    public void userClicksonBaseunit()
    {
        tmp.clickonBaseunit();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Base Unit')]
    }
    @Then("User clicks on 'Zone Criticality' menu")
    public void userClicksonZoneCriticality()
    {
        tmp.clickonZoneCriticality();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Zone Criticality')]
    }
    @Then("User clicks on 'Zone Group Criticality' menu")
    public void userClicksonZoneGroupCriticality()
    {
        tmp.clickonZoneGroupCriticality();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Zone Group Criticality')]
    }
    @Then("User clicks on 'BU Functional Type' menu")
    public void userClicksonBUFunctionalType()
    {
        tmp.clickonBUFunctionalType();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'BU Functional Type')]
    }
    @Then("User clicks on 'BU Functional Sub Type' menu")
    public void userClicksonBUFunctionalSubType()
    {
        tmp.clickonBUFunctionalSubType();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'BU Functional Sub Type')]
    }
    @Then("User clicks on 'BU Size Attribute' menu")
    public void userClicksonBUSizeAttribute()
    {
        tmp.clickonBUSizeAttribute();
        //div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'BU Size Attribute')]
    }
    @Then("User clicks on 'BU Size Type' menu")
    public void userClicksonBUSizeType()
    {
        tmp.clickonBUSizeType();
    }

    @Then("User clicks on 'BU Criticality' menu")
    public void userClicksonBUCriticality()
    {
        tmp.clickonBUCriticality();
    }
}