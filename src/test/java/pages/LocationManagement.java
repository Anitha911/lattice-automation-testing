package pages;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.*;

import java.util.logging.Logger;

import static utils.JavaScriptExeUtil.jsClick;

public class LocationManagement extends BasePage{
    public LocationManagement(WebDriver driver) { super(driver);}
    static TestDataGenerator dataGenerator = new TestDataGenerator();
    @Getter
    public static TestDataModel testDataModel = new TestDataModel();
    static Actionutils action = new Actionutils(driver);
    JavaScriptExeUtil jsutil = new JavaScriptExeUtil(driver);
    private static final Logger LOGGER = Logger.getLogger(AuditManagement.class.getName());

    public static By CITY_NAME = By.xpath("//input[@id='radtxtCityName']");
    public static By SAVE_BUTTON_CITY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinCity_C_btnCityOk']");
    public static By SEARCH_CITY_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00_ctl02_ctl02_FilterTextBox_CityCode']");
    public static By ALL_OPTIONS_CITY_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00']/tbody/tr");
    public static By AREA_GROUP_NAME = By.xpath("//input[@id='radtxtAreaGroupName']");
    public static By ALL_OPTIONS_AREA_GROUP_RECORD = By.xpath("//input[@id='//table[@id='ctl00_ContentPlaceHolder1_grdAreaGroup_ctl00']/tbody/tr']");
    public static By SAVE_BUTTON_AREA_GROUP = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAreaGroup_C_btnAreaGroup']");
    public static By SEARCH_AREA_GROUP_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAreaGroup_ctl00_ctl02_ctl02_FilterTextBox_AreaGroupCode']");
    public static By AREA_NAME = By.xpath("//input[@id='radtxtAreaName']");
    public static By ALL_OPTIONS_AREA_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdArea_ctl00']/tbody/tr");
    public static By AREA_GROUP_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinArea_C_raddrpAreaGroup_Input']");
    public static By ALL_AREA_GROUP_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinArea_C_raddrpAreaGroup_DropDown']/div/ul/li");
    public static By CITY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinArea_C_radDrpCity_Input']");
    public static By ALL_CITY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinArea_C_radDrpCity_DropDown']/div/ul/li");
    public static By SAVE_BUTTON_AREA = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinArea_C_btnAreaOk']");
    public static By SEARCH_AREACODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdArea_ctl00_ctl02_ctl02_FilterTextBox_AreaCode']");
    public static By CLIENT_NAME_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpClientName_Input']");
    public static By ALL_CLIENT_NAME_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpClientName_DropDown']/div/ul/li");
    public static By PROPERTY_NAME = By.xpath("//input[@id='radtxtPropName']");
    public static By AREA_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpArea_Input']");
    public static By ALL_AREA_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpArea_DropDown']/div/ul/li");
    public static By PROPERTY_TYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrPropertyType_Input']");
    public static By ALL_PROPERTY_TYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrPropertyType_DropDown']/div/ul/li");
    public static By CRITICALITY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpCriticality_Input']");
    public static By ALL_CRITICALITY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpCriticality_DropDown']/div/ul/li");
    public static By OWNERSHIP_TYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpOwnershipType_Input']");
    public static By ALL_OWNERSHIP_TYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpOwnershipType_DropDown']/div/ul/li");
    public static By PROJECT_NO = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_txtProjectNo']");
    public static By PLOT_NO = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_txtPlotno']");
    public static By REFERENCE_CODE = By.xpath("//input[@id='RadTextExternalRefCode']");
    public static By SAVE_BUTTON_PROPERTY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinProperty_C_btnPropOK']");
    public static By CLICK_PROPERTY_BACK_BUTTON = By.xpath("//a[@id='ContentPlaceHolder1_lnkBack']");
    public static By SEARCH_PROPERTY_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00_ctl02_ctl02_FilterTextBox_PropertyCode']");
    public static By TABLE_FIRST_PROPERTY_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr[1]");
    public static By EDIT_PROPERTY_BUTTON = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_btnSave']/span");
    public static By ZONE_GROUP_CODE = By.xpath("//input[@id='radtxtZoneGroupCode']");
    public static By ZONE_GROUP_NAME = By.xpath("//input[@id='radtxtZoneGroupName']");
    public static By ALL_OPTIONS_ZONE_GROUP_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneGroup_ctl00']/tbody/tr");
    public static By ZONE_GROUP_PROPERTY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinZoneGroup_C_raddrpProperty_Input']");
    public static By ALL_ZONE_GROUP_PROPERTY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinZoneGroup_C_raddrpProperty_DropDown']/div/ul/li");
    public static By ZONE_GROUP_REFERENCE_CODE = By.xpath("//input[@id='txtZoneGroupExRefCode']");
    public static By SAVE_BUTTON_ZONE_GROUP = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinZoneGroup_C_btnZoneGroupOk']");
    public static By SEARCH_ZONE_GROUP_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdZoneGroup_ctl00_ctl02_ctl02_FilterTextBox_ZoneGroupCode']");
    public static By ZONE_NAME = By.xpath("//input[@id='radtxtZoneName']");
    public static By ALL_OPTIONS_ZONE_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZone_ctl00']/tbody/tr");
    public static By ZONE_PROPERTY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinZone_C_raddrpProp_Input']");
    public static By ALL_ZONE_PROPERTY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinZone_C_raddrpProp_DropDown']/div/ul/li");
    public static By ZONE_REFERENCE_CODE = By.xpath("//input[@id='txtZoneExRefCode']");
    public static By SAVE_BUTTON_ZONE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinZone_C_btnZoneOK']");
    public static By SEARCH_ZONE_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdZone_ctl00_ctl02_ctl02_FilterTextBox_ZoneCode']");
    public static By SUB_ZONE_NAME = By.xpath("//input[@id='radtxtsubzonename']");
    public static By ALL_OPTIONS_SUB_ZONE_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubZone_ctl00']/tbody/tr");
    public static By SUB_ZONE_PROPERTY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinSubZone_C_raddrpSubComm_Input']");
    public static By ALL_SUB_ZONE_PROPERTY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinSubZone_C_raddrpSubComm_DropDown']/div/ul/li");
    public static By SUB_ZONE_ZONE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinSubZone_C_raddrpzone_Input']");
    public static By ALL_SUB_ZONE_ZONE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinSubZone_C_raddrpzone_DropDown']/div/ul/li");
    public static By SUB_ZONE_REFERENCE_CODE = By.xpath("//input[@id='txtSubZoneExRefCode']");
    public static By SAVE_BUTTON_SUB_ZONE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinSubZone_C_btnSubZoneOk']");
    public static By SEARCH_SUB_ZONE_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdSubZone_ctl00_ctl02_ctl02_FilterTextBox_SubZoneCode']");

    public static By BASE_UNIT_NAME = By.xpath("//input[@id='radtxtBUName']");
    public static By ALL_OPTIONS_BASE_UNIT_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr");
    public static By BASE_UNIT_PROPERTY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUProp_Input']");
    public static By ALL_BASE_UNIT_PROPERTY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUProp_DropDown']/div/ul/li");
    public static By BASE_UNIT_ZONE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUZone_Input']");
    public static By ALL_BASE_UNIT_ZONE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUZone_DropDown']/div/ul/li");
    public static By BASE_UNIT_SUB_ZONE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_radrdrpBUSubZone_Input']");
    public static By ALL_BASE_UNIT_SUB_ZONE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_radrdrpBUSubZone_DropDown']/div/ul/li");
    public static By BASE_UNIT_BUF_TYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUBustype_Input']");
    public static By ALL_BASE_UNIT_BUF_TYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUBustype_DropDown']/div/ul/li");
    public static By BASE_UNIT_BUF_SUB_TYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUBusSubtype_Input']");
    public static By ALL_BASE_UNIT_BUF_SUB_TYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUBusSubtype_DropDown']/div/ul/li");
    public static By BASE_UNIT_BU_SIZE_TYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBuBusSizeType_Input']");
    public static By ALL_BASE_UNIT_BU_SIZE_TYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBuBusSizeType_DropDown']/div/ul/li");
    public static By BASE_UNIT_BU_CRITICALITY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBuBusCriticality_Input']");
    public static By ALL_BASE_UNIT_BU_CRITICALITY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBuBusCriticality_DropDown']/div/ul/li");
    public static By BASE_UNIT_REMARKS = By.xpath("//input[@id='RadTxtRemarks']");
    public static By BASE_UNIT_REFERENCE_CODE = By.xpath("//input[@id='txtBaseUniExRefCode']");
    public static By SAVE_BUTTON_BASE_UNIT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_btnBUOK']");
    public static By SEARCH_BASE_UNIT_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00_ctl02_ctl02_FilterTextBox_BaseUnitCode']");
    public static By EDIT_BASE_UNIT_BUTTON = By.xpath("//a[@id='imgEditBaseUnit']/span[@id='ContentPlaceHolder1_Span4']");
    public static By SUB_UNIT_CODE = By.xpath("//input[@id='radtxtSubUnitCode']");
    public static By SUB_UNIT_NAME = By.xpath("//input[@id='radtxtSubUnitName']");
    public static By ALL_OPTIONS_SUB_UNIT_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr");
    public static By SUB_UNIT_PROPERTY_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_raddrpSUProp_Input']");
    public static By ALL_SUB_UNIT_PROPERTY_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_raddrpSUProp_DropDown']/div/ul/li");
    public static By SUB_UNIT_ZONEGROUP_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_raddrpSUZoneGroup_Input']");
    public static By ALL_SUB_UNIT_ZONEGROUP_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_raddrpSUZoneGroup_DropDown']/div/ul/li");
    public static By SUB_UNIT_ZONE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_raddrpSUZone_Input']");
    public static By ALL_SUB_UNIT_ZONE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_raddrpSUZone_DropDown']/div/ul/li");
    public static By SUB_UNIT_SUBZONE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_radrdrpSUSubZone_Input']");
    public static By ALL_SUB_UNIT_SUBZONE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_radrdrpSUSubZone_DropDown']/div/ul/li");
    public static By SUB_UNIT_BASEUNIT_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_raddrpBaseUnit_Input']");
    public static By ALL_SUB_UNIT_BASEUNIT_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_raddrpBaseUnit_DropDown']/div/ul/li");
    public static By SUB_UNIT_REFERENCE_CODE = By.xpath("//input[@id='txtSubUnitExtRefCode']");
    public static By SAVE_BUTTON_SUB_UNIT = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinSubUnit_C_btnSubUnitOk']");
    public static By SEARCH_SUB_UNIT_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00_ctl02_ctl02_FilterTextBox_SubUnitCode']");
    public static By SPACE_NAME = By.xpath("//input[@id='radtxtSpName']");
    public static By ALL_OPTIONS_SPACE_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSpace_ctl00']/tbody/tr");
    public static By SPACE_ACTIVE_CHECKBOX = By.xpath("//input[@id='chkStatus']");
    public static By SAVE_BUTTON_SPACE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinSpace_C_btnSpaceOk']");
    public static By SEARCH_SPACE_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdSpace_ctl00_ctl02_ctl02_FilterTextBox_SpaceName']");
    public static By ZONE_CRITICALITY_NAME = By.xpath("//input[@id='radtxtZoneCriticality']");
    public static By ALL_OPTIONS_ZONE_CRITICALITY_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneCriticality_ctl00']/tbody/tr");
    public static By SAVE_BUTTON_ZONE_CRITICALITY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinZoneCriticality_C_btnZoneCriticalityOk']");
    public static By SEARCH_ZONE_CRITICALITY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdZoneCriticality_ctl00_ctl02_ctl02_FilterTextBox_ZoneCriticality']");
    public static By ZONE_GROUP_CRITICALITY_NAME = By.xpath("//input[@id='radtxtZoneGroupCriticality']");
    public static By ALL_OPTIONS_ZONE_GROUP_CRITICALITY_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneGroupCriticality_ctl00']/tbody/tr");
    public static By SAVE_BUTTON_ZONE_GROUP_CRITICALITY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinZoneGroupCriticality_C_btnZoneGroupCriticalityOk']");
    public static By SEARCH_ZONE_GROUP_CRITICALITY = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdZoneGroupCriticality_ctl00_ctl02_ctl02_FilterTextBox_ZoneGroupCriticality']");
    public static By BU_FUNCTIONALITY_TYPE_NAME = By.xpath("//input[@id='radtxtBusinesstype']");
    public static By ALL_OPTIONS_BU_FUNCTIONAL_TYPE_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBusType_ctl00']/tbody/tr");
    public static By SAVE_BUTTON_BU_FUNCTIONALITY_TYPE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinBusType_C_btnBusType']");
    public static By SEARCH_BU_FUNCTIONALITY_TYPE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdBusType_ctl00_ctl02_ctl02_FilterTextBox_BusinessTypeName']");
    public static By BU_FUNCTIONALITY_SUB_TYPE_NAME = By.xpath("//input[@id='radtxtBussubtypename']");
    public static By ALL_OPTIONS_BU_FUNCTIONAL_SUB_TYPE_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBusSubType_ctl00']/tbody/tr");
    public static By BU_FUNCTIONAL_TYPE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBusSubType_C_raddrpBussubtype_Input']");
    public static By ALL_BU_FUNCTIONAL_TYPE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBusSubType_C_raddrpBussubtype_DropDown']/div/ul/li");
    public static By TOTAL_AREA_SQFT = By.xpath("//input[@id='radtxtTotalSqft']");
    public static By ALL_SERVICE_GROUP_CHECKBOX_SUB_TYPE = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_RadWinBusSubType_C_grdBudgetCategory_ctl01']/tbody/tr");
    public static By SAVE_BUTTON_BU_FUNCTIONALITY_SUB_TYPE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinBusSubType_C_btnBusSubType']");
    public static By SEARCH_BU_FUNCTIONALITY_SUB_TYPE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdBusSubType_ctl00_ctl02_ctl02_FilterTextBox_BusinessSubTypeName']");
    public static By BU_SIZE_ATTRIBUTE_CODE = By.xpath("//input[@id='radtxtAttributeCode']");
    public static By BU_SIZE_ATTRIBUTE_NAME = By.xpath("//input[@id='radtxtAttributeName']");
    public static By ALL_OPTIONS_BU_SIZE_ATTRIBUTE_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAttribute_ctl00']/tbody/tr");
    public static By BU_SIZE_ATTRIBUTE_MEASURING_VALUE_NAME = By.xpath("//input[@id='radtxtMeasuringValue']");
    public static By SAVE_BUTTON_BU_SIZE_ATTRIBUTE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinAttribute_C_btnAttribute']");
    public static By SEARCH_BU_SIZE_ATTRIBUTE_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdAttribute_ctl00_ctl02_ctl02_FilterTextBox_AttributeCode']");
    public static By BU_SIZE_TYPE_CODE = By.xpath("//input[@id='radtxtBUSizeTypeCode']");
    public static By BU_SIZE_TYPE_NAME = By.xpath("//input[@id='radtxtBUSizeTypeName']");
    public static By ALL_OPTIONS_BU_SIZE_TYPE_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBUSizeType_ctl00']/tbody/tr");
    public static By BU_SIZE_ATTRIBUTE_BUSIZE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBUSizeType_C_radDrpAttribute_Input']");
    public static By ALL_BU_SIZE_ATTRIBUTE_BUSIZE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBUSizeType_C_radDrpAttribute_DropDown']/div/ul/li");
    public static By BU_FUNCTIONAL_TYPE_BUSIZE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBUSizeType_C_radDrpBUFunType_Input']");
    public static By ALL_BU_FUNCTIONAL_TYPE_BUSIZE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBUSizeType_C_radDrpBUFunType_DropDown']/div/ul/li");
    public static By BU_FUNCTIONAL_SUB_TYPE_BUSIZE_DROPDOWN = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_RadWinBUSizeType_C_radDrpBUFunSubType_Input']");
    public static By ALL_BU_FUNCTIONAL_SUB_TYPE_BUSIZE_DROPDOWN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinBUSizeType_C_radDrpBUFunSubType_DropDown']/div/ul/li");
    public static By SAVE_BUTTON_BU_SIZE_TYPE = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinBUSizeType_C_btnBUSizeType']");
    public static By SEARCH_BU_SIZE_TYPE_CODE = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdBUSizeType_ctl00_ctl02_ctl02_FilterTextBox_BusinessUnitSizeTypeCode']");
    public static By BU_CRITICALITY_NAME = By.xpath("//input[@id='radtxtBUCriticalityName']");
    public static By ALL_OPTIONS_BU_CRITICALITY_RECORD = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBUCriticality_ctl00']/tbody/tr");
    public static By SAVE_BUTTON_BU_CRITICALITY = By.xpath("//button[@id='ctl00_ContentPlaceHolder1_RadWinBUCriticality_C_btnBUCriticality']");
    public static By SEARCH_BU_CRITICALITY_NAME = By.xpath("//input[@id='ctl00_ContentPlaceHolder1_grdBUCriticality_ctl00_ctl02_ctl02_FilterTextBox_BaseunitCriticalityType']");





    //actions
    public static void enterCityName(){
        String tradeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(CITY_NAME, tradeName);
        testDataModel.setCityName(tradeName);
    }
    public static void clickSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_CITY, SAVE_BUTTON_AREA_GROUP, SAVE_BUTTON_AREA, SAVE_BUTTON_PROPERTY, SAVE_BUTTON_ZONE_GROUP, SAVE_BUTTON_ZONE, SAVE_BUTTON_SUB_ZONE, SAVE_BUTTON_BASE_UNIT,
                SAVE_BUTTON_SUB_UNIT, SAVE_BUTTON_SPACE, SAVE_BUTTON_ZONE_CRITICALITY, SAVE_BUTTON_ZONE_GROUP_CRITICALITY, SAVE_BUTTON_BU_FUNCTIONALITY_TYPE, SAVE_BUTTON_BU_FUNCTIONALITY_SUB_TYPE,
                SAVE_BUTTON_BU_SIZE_ATTRIBUTE, SAVE_BUTTON_BU_SIZE_TYPE, SAVE_BUTTON_BU_CRITICALITY};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                WebElement element = driver.findElement(button);
                jsClick(driver, element);
                utils.waitUntilInvisible(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public static void verifyCityCode() {
        String authValue = testDataModel.getCityCode();
        utils.typeText(SEARCH_CITY_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyCityName(){
        String authValue = testDataModel.getCityName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterAreaGroupName(){
        String tradeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(AREA_GROUP_NAME, tradeName);
        testDataModel.setAreaGroupName(tradeName);
    }
    public static void verifyAreaGroupCode() {
        String authValue = testDataModel.getAreaGroupCode();
        utils.typeText(SEARCH_AREA_GROUP_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAreaGroup_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyAreaGroupName(){
        String authValue = testDataModel.getAreaGroupName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAreaGroup_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void getRandomAreaGroupAreaDropdown(){
        utils.click(AREA_GROUP_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_AREA_GROUP_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_AREA_GROUP_DROPDOWN);
        WebElement inputField = driver.findElement(AREA_GROUP_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setAreaGroup(SelectedValue);
    }
    public static void enterAreaName(){
        String tradeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(AREA_NAME, tradeName);
        testDataModel.setAreaName(tradeName);
    }
    public static void getRandomCityAreaDropdown(){
        utils.click(CITY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CITY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CITY_DROPDOWN);
        WebElement inputField = driver.findElement(CITY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setCity(SelectedValue);
    }
    public static void verifyAreaCode() {
        String authValue = testDataModel.getAreaCode();
        utils.typeText(SEARCH_AREACODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdArea_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyAreaGroup(){
        String authValue = testDataModel.getAreaGroup();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdArea_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyAreaName(){
        String authValue = testDataModel.getAreaName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdArea_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyCity(){
        String authValue = testDataModel.getCity();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdArea_ctl00']/tbody/tr/td[4][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void getRandomClientNameDropdown(){
        utils.click(CLIENT_NAME_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CLIENT_NAME_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CLIENT_NAME_DROPDOWN);
        WebElement inputField = driver.findElement(CLIENT_NAME_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setClientName(SelectedValue);
    }
    public static void enterPropertyName(){
        String PropertyName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(PROPERTY_NAME, PropertyName);
        testDataModel.setPropertyName(PropertyName);
    }
    public static void getRandomAreaDropdown(){
        utils.click(AREA_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_AREA_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_AREA_DROPDOWN);
        WebElement inputField = driver.findElement(AREA_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setArea(SelectedValue);
    }
    public static void getRandomPropertyTypeDropdown(){
        utils.click(PROPERTY_TYPE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_PROPERTY_TYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_PROPERTY_TYPE_DROPDOWN);
        WebElement inputField = driver.findElement(PROPERTY_TYPE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setPropertyType(SelectedValue);
    }
    public static void getRandomCriticalityDropdown(){
        utils.click(CRITICALITY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_CRITICALITY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_CRITICALITY_DROPDOWN);
        WebElement inputField = driver.findElement(CRITICALITY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setCriticality(SelectedValue);
    }
    public static void getRandomOnwerTypeDropdown(){
        utils.click(OWNERSHIP_TYPE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_OWNERSHIP_TYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_OWNERSHIP_TYPE_DROPDOWN);
        WebElement inputField = driver.findElement(OWNERSHIP_TYPE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setOwnerShipType(SelectedValue);
    }
    public static void enterProjectNo(){
        String projectName = dataGenerator.generateRandomNumbericwithLength(7);
        utils.typeText(PROJECT_NO, projectName);
        testDataModel.setProjectNo(projectName);
    }
    public static void enterPlotNo(){
        String plotName = dataGenerator.generateRandomNumbericwithLength(6);
        utils.typeText(PLOT_NO, plotName);
        testDataModel.setPlotNo(plotName);
    }
    public static void enterReferenceCode(){
        String referenceName = dataGenerator.generateRandomCode(6);
        utils.typeText(REFERENCE_CODE, referenceName);
        testDataModel.setReferenceCode(referenceName);
    }
    public static void navigatetoPropertytable() {
        utils.click(CLICK_PROPERTY_BACK_BUTTON);
        utils.waitForVisibility(SEARCH_PROPERTY_CODE);
    }
    public static void verifyPropertyCode() {
        String authValue = testDataModel.getPropertyCode();
        utils.typeText(SEARCH_PROPERTY_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyPropertyName(){
        String authValue = testDataModel.getPropertyName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyArea(){
        String authValue = testDataModel.getArea();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyClientName(){
        String authValue = testDataModel.getClientName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr/td[6][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyPropertyType(){
        String authValue = testDataModel.getPropertyType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00']/tbody/tr/td[7][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterZoneGroupCode(){
        String zonegroupName = dataGenerator.generateRandomCode(8);
        utils.typeText(ZONE_GROUP_CODE, zonegroupName);
        testDataModel.setZoneGroupCode(zonegroupName);
    }
    public static void enterZoneGroupName(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ZONE_GROUP_NAME, zoneName);
        testDataModel.setZoneGroupName(zoneName);
    }
    public static void getRandomPropertyZoneGroupDropdown(){
        utils.click(ZONE_GROUP_PROPERTY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_ZONE_GROUP_PROPERTY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_ZONE_GROUP_PROPERTY_DROPDOWN);
        WebElement inputField = driver.findElement(ZONE_GROUP_PROPERTY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setPropertyZoneGroup(SelectedValue);
    }
    public static void enterZoneGroupReferenceCode(){
        String zoneReferenceName = dataGenerator.generateRandomCode(5);
        utils.typeText(ZONE_GROUP_REFERENCE_CODE, zoneReferenceName);
        testDataModel.setReferenceZoneGroupCode(zoneReferenceName);
    }
    public static void verifyZoneGroupCode() {
        String authValue = testDataModel.getZoneGroupCode();
        utils.typeText(SEARCH_ZONE_GROUP_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneGroup_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyZoneGroupName(){
        String authValue = testDataModel.getZoneGroupName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneGroup_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyPropertyZoneGroup(){
        String authValue = testDataModel.getPropertyZoneGroup();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneGroup_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyReferenceZoneGroup(){
        String authValue = testDataModel.getReferenceZoneGroupCode();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneGroup_ctl00']/tbody/tr/td[6][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterZoneName(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ZONE_NAME, zoneName);
        testDataModel.setZoneName(zoneName);
    }
    public static void getRandomPropertyZoneDropdown(){
        utils.click(ZONE_PROPERTY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_ZONE_PROPERTY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_ZONE_PROPERTY_DROPDOWN);
        WebElement inputField = driver.findElement(ZONE_PROPERTY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setPropertyZone(SelectedValue);
    }
    public static void enterZoneReferenceCode(){
        String zoneReferenceName = dataGenerator.generateRandomCode(4);
        utils.typeText(ZONE_REFERENCE_CODE, zoneReferenceName);
        testDataModel.setReferenceZoneCode(zoneReferenceName);
    }
    public static void verifyZoneCode() {
        String authValue = testDataModel.getZoneCode();
        utils.typeText(SEARCH_ZONE_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZone_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyZoneName(){
        String authValue = testDataModel.getZoneName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZone_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyPropertyZone(){
        String authValue = testDataModel.getPropertyZone();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZone_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyReferenceZone(){
        String authValue = testDataModel.getReferenceZoneCode();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZone_ctl00']/tbody/tr/td[6][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterSubZoneName(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(SUB_ZONE_NAME, zoneName);
        testDataModel.setSubZoneName(zoneName);
    }
    public static void getRandomPropertySubZoneDropdown(){
        utils.click(SUB_ZONE_PROPERTY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SUB_ZONE_PROPERTY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SUB_ZONE_PROPERTY_DROPDOWN);
        WebElement inputField = driver.findElement(SUB_ZONE_PROPERTY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setPropertySubZone(SelectedValue);
    }
    public static void getRandomZoneSubZoneDropdown(){
        utils.click(SUB_ZONE_ZONE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SUB_ZONE_ZONE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SUB_ZONE_ZONE_DROPDOWN);
        WebElement inputField = driver.findElement(SUB_ZONE_ZONE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setZoneSubZone(SelectedValue);
    }
    public static void enterSubZoneReferenceCode(){
        String zoneReferenceName = dataGenerator.generateRandomCode(4);
        utils.typeText(SUB_ZONE_REFERENCE_CODE, zoneReferenceName);
        testDataModel.setReferenceSubZoneCode(zoneReferenceName);
    }
    public static void verifySubZoneCode() {
        String authValue = testDataModel.getSubZoneCode();
        utils.typeText(SEARCH_SUB_ZONE_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubZone_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySubZoneName(){
        String authValue = testDataModel.getSubZoneName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubZone_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyPropertySubZone(){
        String authValue = testDataModel.getPropertySubZone();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubZone_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyZoneSubZone(){
        String authValue = testDataModel.getZoneSubZone();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubZone_ctl00']/tbody/tr/td[5][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyReferenceSubZone(){
        String authValue = testDataModel.getReferenceSubZoneCode();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubZone_ctl00']/tbody/tr/td[6][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterBaseUnitName(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(BASE_UNIT_NAME, zoneName);
        testDataModel.setBaseUnitName(zoneName);
    }
    public static void getRandomPropertyBaseUnitDropdown(){
        utils.click(BASE_UNIT_PROPERTY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BASE_UNIT_PROPERTY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BASE_UNIT_PROPERTY_DROPDOWN);
        WebElement inputField = driver.findElement(BASE_UNIT_PROPERTY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setPropertyBaseUnit(SelectedValue);
    }
    public static void getRandomZoneBaseUnitDropdown(){
        utils.click(BASE_UNIT_ZONE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BASE_UNIT_ZONE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BASE_UNIT_ZONE_DROPDOWN);
        WebElement inputField = driver.findElement(BASE_UNIT_ZONE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setZoneBaseUnit(SelectedValue);
    }
    public static void getRandomSubZoneBaseUnitDropdown(){
        utils.click(BASE_UNIT_SUB_ZONE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BASE_UNIT_SUB_ZONE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BASE_UNIT_SUB_ZONE_DROPDOWN);
        WebElement inputField = driver.findElement(BASE_UNIT_SUB_ZONE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setSubZoneBaseUnit(SelectedValue);
    }
    public static void getRandomBUFTypeBaseUnitDropdown(){
        utils.click(BASE_UNIT_BUF_TYPE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BASE_UNIT_BUF_TYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BASE_UNIT_BUF_TYPE_DROPDOWN);
        WebElement inputField = driver.findElement(BASE_UNIT_BUF_TYPE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBUFTypeBaseUnit(SelectedValue);
    }
    public static void getRandomBUFSubTypeBaseUnitDropdown(){
        utils.click(BASE_UNIT_BUF_SUB_TYPE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BASE_UNIT_BUF_SUB_TYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BASE_UNIT_BUF_SUB_TYPE_DROPDOWN);
        WebElement inputField = driver.findElement(BASE_UNIT_BUF_SUB_TYPE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBUFSubTypeBaseUnit(SelectedValue);
    }
    public static void getRandomBUSizeTypeBaseUnitDropdown(){
        utils.click(BASE_UNIT_BU_SIZE_TYPE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BASE_UNIT_BU_SIZE_TYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BASE_UNIT_BU_SIZE_TYPE_DROPDOWN);
        WebElement inputField = driver.findElement(BASE_UNIT_BU_SIZE_TYPE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBUSizeTypeBaseUnit(SelectedValue);
    }
    public static void getRandomBUCriticalityBaseUnitDropdown(){
        utils.click(BASE_UNIT_BU_CRITICALITY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BASE_UNIT_BU_CRITICALITY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BASE_UNIT_BU_CRITICALITY_DROPDOWN);
        WebElement inputField = driver.findElement(BASE_UNIT_BU_CRITICALITY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBUCriticalityBaseUnit(SelectedValue);
    }
    public static void enterRemarksBaseUnit(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(BASE_UNIT_REMARKS, zoneName);
        testDataModel.setRemarksBaseUnit(zoneName);
    }
    public static void enterBaseUnitReferenceCode(){
        String zoneReferenceName = dataGenerator.generateRandomCode(4);
        utils.typeText(BASE_UNIT_REFERENCE_CODE, zoneReferenceName);
        testDataModel.setBaseUnitReferenceCode(zoneReferenceName);
    }
    public static void verifyBaseUnitCode() {
        String authValue = testDataModel.getBaseUnitCode();
        utils.typeText(SEARCH_BASE_UNIT_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBaseUnitName(){
        String authValue = testDataModel.getBaseUnitName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySubZoneBaseUnit(){
        String authValue = testDataModel.getSubZoneBaseUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyZoneBaseUnit(){
        String authValue = testDataModel.getZoneBaseUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr/td[4][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyPropertyBaseUnit(){
        String authValue = testDataModel.getPropertyBaseUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr/td[7][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBUFTypeBaseUnit(){
        String authValue = testDataModel.getBUFTypeBaseUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr/td[8][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBUFSubTypeBaseUnit(){
        String authValue = testDataModel.getBUFSubTypeBaseUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr/td[9][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBUFCriticalityBaseUnit(){
        String authValue = testDataModel.getBUCriticalityBaseUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00']/tbody/tr/td[10][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void clickLocationSaveButtonInlineError() {
        By[] saveButtons = {SAVE_BUTTON_CITY, SAVE_BUTTON_AREA_GROUP, SAVE_BUTTON_AREA, SAVE_BUTTON_PROPERTY, SAVE_BUTTON_ZONE_GROUP, SAVE_BUTTON_ZONE, SAVE_BUTTON_SUB_ZONE, SAVE_BUTTON_BASE_UNIT,
                SAVE_BUTTON_SUB_UNIT, SAVE_BUTTON_SPACE, SAVE_BUTTON_ZONE_CRITICALITY, SAVE_BUTTON_ZONE_GROUP_CRITICALITY, SAVE_BUTTON_BU_FUNCTIONALITY_TYPE, SAVE_BUTTON_BU_FUNCTIONALITY_SUB_TYPE,
                SAVE_BUTTON_BU_SIZE_ATTRIBUTE, SAVE_BUTTON_BU_SIZE_TYPE, SAVE_BUTTON_BU_CRITICALITY};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public static void getRandomCityTypeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_CITY_RECORD);
        utils.waitForVisibility(CITY_NAME);
    }
    public static void getRandomAreaGroupRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_AREA_GROUP_RECORD);
        utils.waitForVisibility(AREA_GROUP_NAME);
    }
    public static void getRandomAreaRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_AREA_RECORD);
        utils.waitForVisibility(AREA_NAME);
    }
    public static void getRandomPropertyRecord(){
        utils.doubleClick(TABLE_FIRST_PROPERTY_RECORD);
        utils.switchToWindowWithURL("ManageSubLocationMaster.aspx");
        utils.waitForVisibility(EDIT_PROPERTY_BUTTON);
        utils.click(EDIT_PROPERTY_BUTTON);
        utils.waitForVisibility(PROPERTY_NAME);
    }
    public static void getRandomZoneGroupRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_ZONE_GROUP_RECORD);
        utils.waitForVisibility(ZONE_GROUP_NAME);
    }
    public static void getRandomZoneRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_ZONE_RECORD);
        utils.waitForVisibility(ZONE_NAME);
    }
    public static void getRandomSubZoneRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_SUB_ZONE_RECORD);
        utils.waitForVisibility(SUB_ZONE_NAME);
    }
    public static void getRandomBaseUnitRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_BASE_UNIT_RECORD);
        utils.switchToWindowWithURL("ManageMasterBaseUnit.aspx");
        utils.waitForVisibility(EDIT_BASE_UNIT_BUTTON);
        utils.click(EDIT_BASE_UNIT_BUTTON);
        utils.waitForVisibility(BASE_UNIT_NAME);
    }
    public static void getRandomSubUnitRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_SUB_UNIT_RECORD);
        utils.waitForVisibility(SUB_UNIT_NAME);
    }
    public static void getRandomSpaceRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_SPACE_RECORD);
        utils.waitForVisibility(SPACE_NAME);
    }
    public static void getRandomZoneCriticlityRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_ZONE_CRITICALITY_RECORD);
        utils.waitForVisibility(ZONE_CRITICALITY_NAME);
    }
    public static void getRandomZoneGroupCriticalityRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_ZONE_GROUP_CRITICALITY_RECORD);
        utils.waitForVisibility(ZONE_GROUP_CRITICALITY_NAME);
    }
    public static void getRandomBUFunctionalRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_BU_FUNCTIONAL_TYPE_RECORD);
        utils.waitForVisibility(BU_FUNCTIONALITY_TYPE_NAME);
    }
    public static void getRandomBUFunctionalSubRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_BU_FUNCTIONAL_SUB_TYPE_RECORD);
        utils.waitForVisibility(BU_FUNCTIONALITY_SUB_TYPE_NAME);
    }
    public static void getRandomBUSizeAttributeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_BU_SIZE_ATTRIBUTE_RECORD);
        utils.waitForVisibility(BU_SIZE_ATTRIBUTE_NAME);
    }
    public static void getRandomBUSizeTypeRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_BU_SIZE_TYPE_RECORD);
        utils.waitForVisibility(BU_SIZE_TYPE_NAME);
    }
    public static void getRandomBUCriticalityRecord(){
        HelperUtils.clickRandomElement(ALL_OPTIONS_BU_CRITICALITY_RECORD);
        utils.waitForVisibility(BU_CRITICALITY_NAME);
    }




















    public static void enterSubUnitCode(){
        String zonegroupName = dataGenerator.generateRandomCode(8);
        utils.typeText(SUB_UNIT_CODE, zonegroupName);
        testDataModel.setSubUnitCode(zonegroupName);
    }
    public static void enterSubUnitName(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(SUB_UNIT_NAME, zoneName);
        testDataModel.setSubUnitName(zoneName);
    }
    public static void getRandomPropertySubUnitDropdown(){
        utils.click(SUB_UNIT_PROPERTY_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SUB_UNIT_PROPERTY_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SUB_UNIT_PROPERTY_DROPDOWN);
        WebElement inputField = driver.findElement(SUB_UNIT_PROPERTY_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setPropertySubUnit(SelectedValue);
    }
    public static void getRandomZoneGroupSubUnitDropdown(){
        utils.click(SUB_UNIT_ZONEGROUP_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SUB_UNIT_ZONEGROUP_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SUB_UNIT_ZONEGROUP_DROPDOWN);
        WebElement inputField = driver.findElement(SUB_UNIT_ZONEGROUP_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setZoneGroupSubUnit(SelectedValue);
    }
    public static void getRandomZoneSubUnitDropdown(){
        utils.click(SUB_UNIT_ZONE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SUB_UNIT_ZONE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SUB_UNIT_ZONE_DROPDOWN);
        WebElement inputField = driver.findElement(SUB_UNIT_ZONE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setZoneSubUnit(SelectedValue);
    }
    public static void getRandomSubZoneSubUnitDropdown(){
        utils.click(SUB_UNIT_SUBZONE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SUB_UNIT_SUBZONE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SUB_UNIT_SUBZONE_DROPDOWN);
        WebElement inputField = driver.findElement(SUB_UNIT_SUBZONE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setSubZoneSubUnit(SelectedValue);
    }
    public static void getRandomBaseUnitSubUnitDropdown(){
        utils.click(SUB_UNIT_BASEUNIT_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_SUB_UNIT_BASEUNIT_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_SUB_UNIT_BASEUNIT_DROPDOWN);
        WebElement inputField = driver.findElement(SUB_UNIT_BASEUNIT_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBaseUnitSubUnit(SelectedValue);
    }
    public static void enterSubUnitReferenceCode(){
        String zoneReferenceName = dataGenerator.generateRandomCode(4);
        utils.typeText(SUB_UNIT_REFERENCE_CODE, zoneReferenceName);
        testDataModel.setSubUnitReferenceCode(zoneReferenceName);
    }
    public static void verifySubUnitCode() {
        String authValue = testDataModel.getSubUnitCode();
        utils.typeText(SEARCH_SUB_UNIT_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySubUnitName(){
        String authValue = testDataModel.getSubUnitName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyPropertySubUnit(){
        String authValue = testDataModel.getPropertySubUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyZoneGroupSubUnit(){
        String authValue = testDataModel.getZoneGroupSubUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr/td[4][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyZoneSubUnit(){
        String authValue = testDataModel.getZoneSubUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr/td[5][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySubZoneSubUnit(){
        String authValue = testDataModel.getSubZoneSubUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr/td[6][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBaseUnitSubUnit(){
        String authValue = testDataModel.getBaseUnitSubUnit();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr/td[7][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySubUnitReferenceCode(){
        String authValue = testDataModel.getSubUnitReferenceCode();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSubUnit_ctl00']/tbody/tr/td[8][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterSpaceName(){
        String costingTypeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(SPACE_NAME, costingTypeName);
        testDataModel.setSpaceName(costingTypeName);
    }
    public static void verifySpaceName() {
        String authValue = testDataModel.getSpaceName();
        utils.typeText(SEARCH_SPACE_NAME, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSpace_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySpaceCheckboxischecked(){
        By activecheckboxValue = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdSpace_ctl00']/tbody/tr/td[2][text()='Active']");
        utils.waitForVisibility(activecheckboxValue);
        Assert.assertTrue(utils.isElementVisible(activecheckboxValue));
    }
    public static void enterZoneCriticalityName(){
        String costingTypeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ZONE_CRITICALITY_NAME, costingTypeName);
        testDataModel.setZoneCriticalityName(costingTypeName);
    }
    public static void verifyZoneCriticalityName() {
        String authValue = testDataModel.getZoneCriticalityName();
        utils.typeText(SEARCH_ZONE_CRITICALITY, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneCriticality_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterZoneGroupCriticalityName(){
        String costingTypeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(ZONE_GROUP_CRITICALITY_NAME, costingTypeName);
        testDataModel.setZoneGroupCriticalityName(costingTypeName);
    }
    public static void verifyZoneGroupCriticalityName() {
        String authValue = testDataModel.getZoneGroupCriticalityName();
        utils.typeText(SEARCH_ZONE_GROUP_CRITICALITY, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdZoneGroupCriticality_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterBUFunctionalityTypeName(){
        String costingTypeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(BU_FUNCTIONALITY_TYPE_NAME, costingTypeName);
        testDataModel.setBUFunctionalityTypeName(costingTypeName);
    }
    public static void verifyBUFunctionalityTypeName() {
        String authValue = testDataModel.getBUFunctionalityTypeName();
        utils.typeText(SEARCH_BU_FUNCTIONALITY_TYPE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBusType_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterBUFunctionalitySubTypeName(){
        String costingTypeName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(BU_FUNCTIONALITY_SUB_TYPE_NAME, costingTypeName);
        testDataModel.setBUFunctionalitySubTypeName(costingTypeName);
    }
    public static void getRandomBUFunctionalTypeSubTypeDropdown(){
        utils.click(BU_FUNCTIONAL_TYPE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BU_FUNCTIONAL_TYPE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BU_FUNCTIONAL_TYPE_DROPDOWN);
        WebElement inputField = driver.findElement(BU_FUNCTIONAL_TYPE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBUFunctionalTypeSubType(SelectedValue);
    }
    public static void enterTotalAreaSQFT(){
        String projectName = dataGenerator.generateRandomNumbericwithLength(5);
        utils.typeText(TOTAL_AREA_SQFT, projectName);
        testDataModel.setTotalAreaSQFT(projectName);
    }
    public static void clickRandomServiceGroupCheckBoxSubType(){
        HelperUtils.clickRandomElement(ALL_SERVICE_GROUP_CHECKBOX_SUB_TYPE);
    }
    public static void verifyBUFunctionalitySubTypeName() {
        String authValue = testDataModel.getBUFunctionalitySubTypeName();
        utils.typeText(SEARCH_BU_FUNCTIONALITY_SUB_TYPE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBusSubType_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBUFunctionalTypeSubType() {
        String authValue = testDataModel.getBUFunctionalTypeSubType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBusSubType_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterSizeAttributeCode(){
        String zonegroupName = dataGenerator.generateRandomCode(8);
        utils.typeText(BU_SIZE_ATTRIBUTE_CODE, zonegroupName);
        testDataModel.setSizeAttributeCode(zonegroupName);
    }
    public static void enterSizeAttributeName(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(BU_SIZE_ATTRIBUTE_NAME, zoneName);
        testDataModel.setSizeAttributeName(zoneName);
    }
    public static void enterSizeAttributeMeasuringValue(){
        String zoneName = dataGenerator.generateRandomStringwithLength(3);
        utils.typeText(BU_SIZE_ATTRIBUTE_MEASURING_VALUE_NAME, zoneName);
        testDataModel.setSizeAttributeMeasuringValue(zoneName);
    }
    public static void verifySizeAttributeCode() {
        String authValue = testDataModel.getSizeAttributeCode();
        utils.typeText(SEARCH_BU_SIZE_ATTRIBUTE_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAttribute_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySizeAttributeName(){
        String authValue = testDataModel.getSizeAttributeName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAttribute_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySizeAttributeMeasuringValue(){
        String authValue = testDataModel.getSizeAttributeMeasuringValue();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdAttribute_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterSizeTypeCode(){
        String zonegroupName = dataGenerator.generateRandomCode(6);
        utils.typeText(BU_SIZE_TYPE_CODE, zonegroupName);
        testDataModel.setSizeTypeCode(zonegroupName);
    }
    public static void enterSizeTypeName(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(BU_SIZE_TYPE_NAME, zoneName);
        testDataModel.setSizeTypeName(zoneName);
    }
    public static void getRandomBUSizeAttributeBUSizeTypeDropdown(){
        utils.click(BU_SIZE_ATTRIBUTE_BUSIZE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BU_SIZE_ATTRIBUTE_BUSIZE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BU_SIZE_ATTRIBUTE_BUSIZE_DROPDOWN);
        WebElement inputField = driver.findElement(BU_SIZE_ATTRIBUTE_BUSIZE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBUSizeAttributeBUSizeType(SelectedValue);
    }
    public static void getRandomBUFunctionalTypeBUSizeTypeDropdown(){
        utils.click(BU_FUNCTIONAL_TYPE_BUSIZE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BU_FUNCTIONAL_TYPE_BUSIZE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BU_FUNCTIONAL_TYPE_BUSIZE_DROPDOWN);
        WebElement inputField = driver.findElement(BU_FUNCTIONAL_TYPE_BUSIZE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBUFunctionalTypeBUSizeType(SelectedValue);
    }
    public static void getRandomBUFunctionalSubTypeBUSizeTypeDropdown(){
        utils.click(BU_FUNCTIONAL_SUB_TYPE_BUSIZE_DROPDOWN);
        ElementUtils.waitForDropdownLoading();
        utils.waitForVisibility(ALL_BU_FUNCTIONAL_SUB_TYPE_BUSIZE_DROPDOWN);
        HelperUtils.clickRandomElement(ALL_BU_FUNCTIONAL_SUB_TYPE_BUSIZE_DROPDOWN);
        WebElement inputField = driver.findElement(BU_FUNCTIONAL_SUB_TYPE_BUSIZE_DROPDOWN);
        String SelectedValue = inputField.getAttribute("value");
        testDataModel.setBUFunctionalSubTypeBUSizeType(SelectedValue);
    }
    public static void verifySizeTypeCode() {
        String authValue = testDataModel.getSizeTypeCode();
        utils.typeText(SEARCH_BU_SIZE_TYPE_CODE, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBUSizeType_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifySizeTypeName(){
        String authValue = testDataModel.getSizeTypeName();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBUSizeType_ctl00']/tbody/tr/td[2][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBUSizeAttributeBUSizeType(){
        String authValue = testDataModel.getBUSizeAttributeBUSizeType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBUSizeType_ctl00']/tbody/tr/td[3][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBUFunctionalTypeBUSizeType(){
        String authValue = testDataModel.getBUFunctionalTypeBUSizeType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBUSizeType_ctl00']/tbody/tr/td[4][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void verifyBUFunctionalSubTypeBUSizeType(){
        String authValue = testDataModel.getBUFunctionalSubTypeBUSizeType();
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBUSizeType_ctl00']/tbody/tr/td[5][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }
    public static void enterBUCriticalityName(){
        String zoneName = dataGenerator.generateRandomStringwithLength(5);
        utils.typeText(BU_CRITICALITY_NAME, zoneName);
        testDataModel.setSizeTypeName(zoneName);
    }
    public static void verifyBUCriticalityName() {
        String authValue = testDataModel.getSizeTypeCode();
        utils.typeText(SEARCH_BU_CRITICALITY_NAME, authValue + Keys.ENTER);
        By searchVal = By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdBUCriticality_ctl00']/tbody/tr/td[1][text()='"+authValue+"']");
        utils.waitForVisibility(searchVal);
        Assert.assertTrue(utils.isElementVisible(searchVal));
    }



















}
