package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

public class ManageLocationMasterPage extends BasePage {
    public ManageLocationMasterPage(WebDriver driver) {
        super(driver);
    }

    private String savedCityName;
    public static final By USERNAME_INPUT = By.id("LoginUser_UserName");
    public static final By PASSWORD_INPUT = By.id("LoginUser_Password");
    public static final By LOGIN_BUTTON = By.id("LoginUser_LoginButton");
    public static final By HOME_TAB = By.id("tab-home");
    public static final By CITY_NAME_INPUT = By.id("radtxtCityName");
    public static final By AreaGroup_NAME_INPUT = By.id("radtxtAreaGroupName");
    public static final By Area_NAME_INPUT = By.id("radtxtAreaName");
    public static final By Property_NAME_INPUT = By.id("radtxtPropName");
    public static final By Zone_NAME_INPUT = By.id("radtxtZoneName");
    public static final By SubZone_NAME_INPUT = By.id("radtxtsubzonename");
    public static final By BU_NAME_INPUT = By.id("radtxtBUName");
    public static final By BU_REMARKS_INPUT = By.id("RadTxtRemarks");
    public static final By ZoneCriticality_NAME_INPUT = By.id("radtxtZoneCriticality");
    public static final By ZoneGroupCriticality_NAME_INPUT = By.id("radtxtZoneGroupCriticality");
    public static final By BUFunctionalType_NAME_INPUT = By.id("radtxtBusinesstype");
    public static final By BUFunctionalSubType_NAME_INPUT = By.id("radtxtBussubtypename");
    public static final By COUNTRY_DD = By.id("radDrpCountry");
    public static final By AREA_GROUP_DD = By.id("ctl00_ContentPlaceHolder1_RadWinArea_C_raddrpAreaGroup_Input");
    public static final By CITY_DD = By.id("ctl00_ContentPlaceHolder1_RadWinArea_C_radDrpCity_Input");
    public static final By CLIENT_DD = By.id("ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpClientName_Input");
    public static final By Area_DD = By.id("ctl00_ContentPlaceHolder1_RadWinProperty_C_raddrpArea_Input");
    public static final By Property_DD = By.id("ctl00_ContentPlaceHolder1_RadWinZone_C_raddrpProp_Input");
    public static final By Zone_DD = By.id("ctl00_ContentPlaceHolder1_RadWinSubZone_C_raddrpzone_Input");
    public static final By SubCommunity_DD = By.id("ctl00_ContentPlaceHolder1_RadWinSubZone_C_raddrpSubComm_Input");
    public static final By BUProp_DD = By.id("ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUProp_Input");
    public static final By BUZone_DD = By.id("ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUZone_Input");
    public static final By BUSubZone_DD = By.id("ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_radrdrpBUSubZone_Input");
    public static final By BUFuncType_DD = By.id("ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUBustype_Input");
    public static final By BUFuncSubType_DD = By.id("ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUBusSubtype_Input");
    public static final By BUCriticality_DD = By.id("ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBuBusCriticality_Input");
    public static final By FirstScopeType_DD = By.id("ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_RadComScope_Input");
    public static final By BUFunctionalType_DD = By.id("ctl00_ContentPlaceHolder1_RadWinBusSubType_C_raddrpBussubtype_Input");
    public static final By SAVE_BUTTON_CITY =
            By.id("ctl00_ContentPlaceHolder1_RadWinCity_C_btnCityOk");
    public static final By SAVE_BUTTON_AreaGroup =
    By.id("ctl00_ContentPlaceHolder1_RadWinAreaGroup_C_btnAreaGroup");
    public static final By SAVE_BUTTON_AREA = By.id("ctl00_ContentPlaceHolder1_RadWinArea_C_btnAreaOk");
    public static final By SAVE_BUTTON_PROPERTY = By.id("ctl00_ContentPlaceHolder1_RadWinProperty_C_btnPropOK");
    public static final By SAVE_BUTTON_ZONE = By.id("ctl00_ContentPlaceHolder1_RadWinZone_C_btnZoneOK");
    public static final By SAVE_BUTTON_SUBZONE = By.id("ctl00_ContentPlaceHolder1_RadWinSubZone_C_btnSubZoneOk");
    public static final By SAVE_BUTTON_BU = By.id("ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_btnBUOK");
    public static final By SAVE_BUTTON_ZONECRITICALITY = By.id("ctl00_ContentPlaceHolder1_RadWinZoneCriticality_C_btnZoneCriticalityOk");
    public static final By SAVE_BUTTON_ZONEGROUPCRITICALITY = By.id("ctl00_ContentPlaceHolder1_RadWinZoneGroupCriticality_C_btnZoneGroupCriticalityOk");
    public static final By SAVE_BUTTON_BU_Functional_Type = By.id("ctl00_ContentPlaceHolder1_RadWinBusType_C_btnBusType");
    public static final By SAVE_BUTTON_BU_Func_Sub_Type = By.id("ctl00_ContentPlaceHolder1_RadWinBusSubType_C_btnBusSubType");
    public static final By UPDATE_BUTTON_CITY =
            // By.xpath("//div[@id='ctl00_ContentPlaceHolder1_RadWinCity_C']//button[@type='button' and @id='ctl00_ContentPlaceHolder1_RadWinCity_C_btnCityOk']");
            By.id("ctl00_ContentPlaceHolder1_RadWinCity_C_btnCityOk");
    public static final By AreaGroup = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Area Group')]");
    public static final By Area = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and normalize-space(.)='Area']");
    public static final By Property = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Property')]");
    public static final By Zone = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Zone')]");
    public static final By SubZone = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Sub Zone')]");
    public  static final By BaseUnit = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Base Unit')]");
    public  static final By ZoneCriticality = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Zone Criticality')]");
    public  static final By ZoneGroupCriticality = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'Zone Group Criticality')]");
    public  static final By BUFunctionalType = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'BU Functional Type')]");
    public  static final By BUFunctionalSubType = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'BU Functional Sub Type')]");
    public  static final By BUSizeAttribute = By.xpath("//div[@class='tags']//a[i[@class='icon-receipt'] and contains (., 'BU Size Attribute')]");
    public static final By CANCEL_BUTTON_CITY = By.id("ctl00_ContentPlaceHolder1_RadWinCity_C_btnCityClose_ClientState");
    public static final By FIRST_CITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdCity_ctl00__0");
    public static final By DELETE_FIRST_CITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdCity_ctl00_ctl04_ImageButton2");
    public static final By SEARCH_CITY = By.cssSelector("[alt='Filter CityName column']");
    public static final By SEARCH_AreaGroup = By.cssSelector("[alt='Filter AreaGroupName column']");
    public static final By SEARCH_Area= By.cssSelector("[alt='Filter AreaName column']");
    public static final By SEARCH_Property = By.cssSelector("[alt='Filter PropertyName column']");
    public static final By SEARCH_Zone = By.cssSelector("[alt='Filter ZoneName column']");
    //public static final By PAGE_RECORD_COUNT = By.xpath("//div[@class='rgWrap rgInfoPart']/strong[1]");
    public static final By SEARCH_SubZone = By.cssSelector("[alt='Filter SubZoneName column']");
    public static final By SEARCH_BUName = By.id("ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00_ctl02_ctl02_FilterTextBox_BaseUnitName");
    public static final By SEARCH_ZCName =
            By.id("ctl00_ContentPlaceHolder1_grdZoneCriticality_ctl00_ctl02_ctl02_FilterTextBox_ZoneCriticality");
    public static final By SEARCH_ZGCName =
            By.id("ctl00_ContentPlaceHolder1_grdZoneGroupCriticality_ctl00_ctl02_ctl02_FilterTextBox_ZoneGroupCriticality");
    public static final By SEARCH_BUFuncTypeName = By.id("ctl00_ContentPlaceHolder1_grdBusType_ctl00_ctl02_ctl02_FilterTextBox_BusinessTypeName");
    public static final By SEARCH_BUFuncSubTypeName = By.id("ctl00_ContentPlaceHolder1_grdBusSubType_ctl00_ctl02_ctl02_FilterTextBox_BusinessSubTypeName");
    public void clickOnIcon(String dataConfig) {
        try {
            By locator = By.xpath(String.format("//div[@class='nav sideMenuScroll']//a[@id='10']",
                    dataConfig));
            utils.click(locator);
            System.out.println("Clicked on the icon: " + dataConfig);
        } catch (Exception e) {
            System.out.println("Failed to click on the icon: " + dataConfig);
            throw e;
        }
    }

    public void clickTabByTitle(String tabbyTitle) {
        try {
            By locator = By.xpath(String.format("//div[@id='tab-datasetup']//a[text()='%s']",
                    tabbyTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabbyTitle);
        } catch (Exception e) {
            System.out.println("Failed to click on the tab: " + tabbyTitle);
            throw e;
        }
    }

    public void clickonbutton(String button) {
        try {
            By locator = By.cssSelector(String.format("button[value='%s']", button));
            utils.click(locator);
            System.out.println("Clicked on the action button: " + button);
        } catch (Exception e) {
            System.out.println("Failed to click on the action button: " + button);
            throw e;
        }
    }

    public void selectCountry(String countryTitle) {
        try {
            utils.click(COUNTRY_DD);
            By locator = By.xpath(String.format
                    ("//div[@id='radDrpCountry']//span[@class='rddlFakeInput']", countryTitle));
            utils.click(locator);
            System.out.println("Clicked on the country drop down: " + countryTitle);
        } catch (Exception e) {
            System.out.println("Failed to select: " + countryTitle);
            throw e;
        }
    }

    public void enterCityName(String name) {
        utils.typeText(CITY_NAME_INPUT, name);
    }
    public void enterAGName(String name) {
        utils.typeText(AreaGroup_NAME_INPUT, name);
    }
    public void enterAreaName(String name) {
        utils.typeText(Area_NAME_INPUT, name);
    }
    public void enterPropertyName(String name) {
        utils.typeText(Property_NAME_INPUT, name);
    }
    public void enterZoneName(String name) {
        utils.typeText(Zone_NAME_INPUT, name);
    }
    public void enterSubZoneName(String name) {
        utils.typeText(SubZone_NAME_INPUT, name);
    }
    public void enterBUName(String name) {
        utils.typeText(BU_NAME_INPUT, name);
    }
    public void enterBURemarks(String name) {
        utils.typeText(BU_REMARKS_INPUT, name);
    }
    public void enterZoneCriticality(String name) {
        utils.typeText(ZoneCriticality_NAME_INPUT, name);
    }
    public void enterZoneGroupCriticality(String name) {
        utils.typeText(ZoneGroupCriticality_NAME_INPUT, name);
    }
    public void enterBUFunctionalType(String name) {
        utils.typeText(BUFunctionalType_NAME_INPUT, name);
    }

    public void enterTotalAreaSqft(int sqft) {
        utils.typeText(BUFunctionalType_NAME_INPUT, String.valueOf(sqft));
    }

    public void enterBUFunctionalSubType(String name) {
        utils.typeText(BUFunctionalSubType_NAME_INPUT, name);
    }
    public void getFirstCityName() {
        utils.click(FIRST_CITY_IN_LIST);
    }
    public void selectFirstAreaGroup()
    {
        utils.click(AREA_GROUP_DD);
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 5);
        utils.click(firstItem);
    }
    public void selectFirstCity()
    {
        utils.click(CITY_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstClient()
    {
        utils.click(CLIENT_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 20);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstArea()
    {
        utils.click(Area_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstProperty()
    {
        utils.click(Property_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstSubComm()
    {
        utils.click(SubCommunity_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstZone()
    {
        utils.click(Zone_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstBUProp()
    {
        utils.click(BUProp_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstBUZone()
    {
        utils.click(BUZone_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstBUSubZone()
    {
        utils.click(BUSubZone_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstBUFuncType()
    {
        utils.click(BUFuncType_DD);//ctl00_ContentPlaceHolder1_RadWinBaseUnit_C_raddrpBUBustype_Input
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }

    public void selectFirstBUFunctionalType()
    {
        utils.click(BUFunctionalType_DD);//ctl00_ContentPlaceHolder1_RadWinBusSubType_C_raddrpBussubtype_Input
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstBUFuncSubType()
    {
        utils.click(BUFuncSubType_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstBUCriticality()
    {
        utils.click(BUCriticality_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public void selectFirstScopeType()
    {
        utils.click(FirstScopeType_DD);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//ul[contains(@class,'rcbList')]/li[contains(@class,'rcbItem')])[1]");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }

    public void selectFirstServiceGroup()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By firstItem = By.xpath("(//table[contains(@class,'rgMasterTable rgClipCells')]//tr[td[@title='1']]//input[@type='checkbox'])");
        utils.waitForElementVisible(firstItem, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(firstItem)).click();
        utils.click(firstItem);
    }
    public String modifiesCityName(String modifiedCity) {
        try {
            By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00__0']/td[3]");
            String mCity = driver.findElement(locator).getText();
            String shortId = UUID.randomUUID().toString().substring(0, 6);
            String editedCity = mCity.substring(0, mCity.length() - 6) + shortId;
            utils.typeText(CITY_NAME_INPUT, editedCity);
            this.savedCityName = editedCity;
            return savedCityName;
            //System.out.println("Updated City value: " + editedCity);
        } catch (Exception e) {
            System.out.println("Failed to update City: " + modifiedCity);
            throw e;
        }
    }

    public void clickUpdateButton() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By[] updateButtons = {UPDATE_BUTTON_CITY};

        for (By button : updateButtons) {
            if (utils.isElementVisible(button, 5)) {
                utils.waitForElementToBeClickable(button, 10);
                utils.click(button);
                utils.click(button);
                //utils.waitForInvisibility(CITY_POPUP, 15);
                return;
            }
            //if (utils.isElementVisible(locator, 5))
        }
        throw new RuntimeException("No update button is present on the page.");
    }

    public void verifyCityName(String savedCityName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_CITY, savedCityName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00__0']/td[3][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created city identified during search:" + savedCityName);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void verifyAGName(String savedAGName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_AreaGroup, savedAGName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdAreaGroup_ctl00__0']/td[2][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created Area Group identified during search:" + savedAGName);
    }
    public void verifyAreaName(String savedAreaName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_Area, savedAreaName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdArea_ctl00__0']/td[3][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created Area identified during search:" + savedAreaName);
    }
    public void verifyPropertyName(String savedPropertyName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_Property, savedPropertyName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdProperty_ctl00__0']/td[2][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created Property identified during search:" + savedPropertyName);
    }
    public void verifyZoneName(String savedZoneName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_Zone, savedZoneName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdZone_ctl00__0']/td[2][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created Zone identified during search:" + savedZoneName);
    }
    public void verifySubZoneName(String savedSubZoneName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_SubZone, savedSubZoneName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdSubZone_ctl00__0']/td[2][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created SubZone identified during search:" + savedSubZoneName);
    }
    public void verifyBUName(String savedBUName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_BUName, savedBUName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdBaseUnit_ctl00__0']/td[2][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created Base unit identified during search:" + savedBUName);
    }
    public void verifyZCName(String savedZCName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_ZCName, savedZCName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdZoneCriticality_ctl00__0']/td[1][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created Zone criticality identified during search:" + savedZCName);
    }
    public void verifyZGCName(String savedZGCName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_ZGCName, savedZGCName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdZoneGroupCriticality_ctl00__0']/td[1][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created Zone Group Criticality identified during search:" + savedZGCName);
    }

    public void verifyBUFuncTypeName(String savedBUFuncTypeName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_BUFuncTypeName, savedBUFuncTypeName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdBusType_ctl00__0']/td[1][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created BU Functional Type identified during search:" + savedBUFuncTypeName);
    }

    public void verifyBUFuncSubTypeName(String savedBUFuncSubTypeName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_BUFuncSubTypeName, savedBUFuncSubTypeName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdBusSubType_ctl00__0']/td[1][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created BU Functional Type identified during search:" + savedBUFuncSubTypeName);
    }
    public void clickSaveActionButton() {
        By[] saveButtons = {SAVE_BUTTON_CITY, SAVE_BUTTON_AreaGroup, SAVE_BUTTON_AREA, SAVE_BUTTON_PROPERTY, SAVE_BUTTON_ZONE,
                SAVE_BUTTON_SUBZONE, SAVE_BUTTON_BU, SAVE_BUTTON_ZONECRITICALITY, SAVE_BUTTON_ZONEGROUPCRITICALITY, SAVE_BUTTON_BU_Functional_Type,
        SAVE_BUTTON_BU_Func_Sub_Type};

        for (By button : saveButtons)
        {
            if (utils.isElementVisible(button, 5))
            {
                utils.click(button);
                return;
            }
        }
            throw new RuntimeException("No save button is present on the page.");
    }

    public void deleteCity()
    {
        try
        {
            By deleteIconBy = By.xpath("//input[@alt='Delete' and contains(@src,'DeleteIcon.png')]");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement deleteIcon = driver.findElement(deleteIconBy);
            wait.until(ExpectedConditions.elementToBeClickable(deleteIconBy)).click();
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();

        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the delete icon");
        }
    }
    //public void verify_deleted_City(String text)
    public void clickonAreaGroup()
    {
        try
        {
            utils.click(AreaGroup);
            System.out.println("Clicked on Area Group menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on Area Group");
            throw e;
        }
    }
    public void clickonArea()
    {
        try
        {
            utils.click(Area);
            System.out.println("Clicked on Area menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on Area menu");
            throw e;
        }
    }
    public void clickonProperty()
    {
        try
        {
            utils.click(Property);
            System.out.println("Clicked on Property menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on Property menu");
            throw e;
        }
    }
    public void clickonZone()
    {
        try
        {
            utils.click(Zone);
            System.out.println("Clicked on Zone menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on Zone menu");
            throw e;
        }
    }
    public void clickonSubZone()
    {
        try
        {
            utils.click(SubZone);
            System.out.println("Clicked on Sub Zone menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on Sub Zone menu");
            throw e;
        }
    }
    public void clickonBaseunit()
    {
        try
        {
            utils.click(BaseUnit);
            System.out.println("Clicked on Sub Zone menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on Sub Zone menu");
            throw e;
        }
    }
    public void clickonZoneCriticality()
    {
        try
        {
            utils.click(ZoneCriticality);
            System.out.println("Clicked on Zone Criticality menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on Zone Criticality menu");
            throw e;
        }
    }
    public void clickonZoneGroupCriticality()
    {
        try
        {
            utils.click(ZoneGroupCriticality);
            System.out.println("Clicked on Zone Group Criticality menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on Zone Group Criticality menu");
            throw e;
        }
    }
    public void clickonBUFunctionalType()
    {
        try
        {
            utils.click(BUFunctionalType);
            System.out.println("Clicked on BU Functional Type menu");
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on BU Functional Type menu");
            throw e;
        }
    }
    public void clickonBUFunctionalSubType()
    {
        try {
            utils.click(BUFunctionalSubType);
            System.out.println("Clicked on BU Functional Sub Type menu");
        } catch (Exception e) {
            System.out.println("Failed to click on BU Functional Sub Type menu");
            throw e;
        }
    }
    public void clickonBUSizeAttribute()
    {
        try
        {
            utils.click(BUSizeAttribute);
            System.out.println("Clicked on BU Size Attribute menu" );
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on BU Size Attribute menu");
            throw e;
        }
    }
}
