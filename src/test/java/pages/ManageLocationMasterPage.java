package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.UUID;

public class ManageLocationMasterPage extends BasePage
{
    public ManageLocationMasterPage(WebDriver driver)
    {
        super(driver);
    }
    private String savedCityName;
    public static final By USERNAME_INPUT = By.id("LoginUser_UserName");
    public static final By PASSWORD_INPUT = By.id("LoginUser_Password");
    public static final By LOGIN_BUTTON = By.id("LoginUser_LoginButton");
    public static final By HOME_TAB = By.id("tab-home");
    public static final By CITY_NAME_INPUT = By.id("radtxtCityName");
    public static final By COUNTRY_DD = By.id("radDrpCountry");
    public static final By SAVE_BUTTON_CITY = By.id("ctl00_ContentPlaceHolder1_RadWinCity_C_btnCityOk");
    public static final By UPDATE_BUTTON_CITY = By.xpath("//button[contains(@id, 'btnCityOk')]");
    //By.xpath("//div[@class='text-end']//span[text()='UPDATE']");
    public static final By CANCEL_BUTTON_CITY = By.id("ctl00_ContentPlaceHolder1_RadWinCity_C_btnCityClose_ClientState");
    public static final By FIRST_CITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdCity_ctl00__0");
    public static final By DELETE_FIRST_CITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdCity_ctl00_ctl04_ImageButton2");
    public static final By SEARCH_CITY = By.cssSelector("[alt='Filter CityName column']");
    public static final By PAGE_RECORD_COUNT = By.xpath("//div[@class='rgWrap rgInfoPart']/strong[1]");

    public void clickOnIcon(String dataConfig)
    {
        try
        {
            By locator = By.xpath(String.format("//div[@class='nav sideMenuScroll']//a[@id='10']",
                            dataConfig));
            utils.click(locator);
            System.out.println("Clicked on the icon: " + dataConfig);
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the icon: " + dataConfig);
            throw e;
        }
    }
    public void clickTabByTitle(String tabbyTitle)
    {
        try
        {
            By locator = By.xpath(String.format("//div[@id='tab-datasetup']//a[text()='%s']",
                    tabbyTitle));
            utils.click(locator);
            System.out.println("Clicked on the tab: " + tabbyTitle);
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the tab: " + tabbyTitle);
            throw e;
        }
    }
    public void clickonbutton(String button)
    {
        try
        {
            By locator = By.cssSelector(String.format("button[value='%s']", button));
            utils.click(locator);
            System.out.println("Clicked on the action button: " + button);
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the action button: " + button);
            throw e;
        }
    }
    public void selectCountry(String countryTitle)
    {
        try
        {
            utils.click(COUNTRY_DD);
            By locator = By.xpath(String.format
                    ("//div[@id='radDrpCountry']//span[@class='rddlFakeInput']", countryTitle));
            utils.click(locator);
            System.out.println("Clicked on the country drop down: " + countryTitle);
        }
        catch (Exception e)
        {
            System.out.println("Failed to select: " + countryTitle);
            throw e;
        }
    }

    public void enterCityName(String name)
    {
        utils.typeText(CITY_NAME_INPUT, name);
    }

    public void getFirstCityName()
    {
        utils.click(FIRST_CITY_IN_LIST);
    }

    public String modifiesCityName(String modifiedCity)
    {
        try
        {
            By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00__0']/td[3]");
            String mCity = driver.findElement(locator).getText();
            String shortId = UUID.randomUUID().toString().substring(0, 6);
            String editedCity = mCity.substring(0, mCity.length() - 6) + shortId;
            utils.typeText(CITY_NAME_INPUT,editedCity);
            this.savedCityName = editedCity;
            return savedCityName;
            //System.out.println("Updated City value: " + editedCity);
        }
        catch (Exception e)
        {
           System.out.println("Failed to update City: " + modifiedCity);
           throw e;
        }
    }

    public void clickUpdateButton()
    {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By[] updateButtons = {UPDATE_BUTTON_CITY};

        for (By button : updateButtons)
        {
            if (utils.isElementVisible(button, 2))
            {
                utils.click(button);
                return;
            }
            //if (utils.isElementVisible(locator, 5))
        }
        throw new RuntimeException("No update button is present on the page.");
    }
    public void verifyCityName(String savedCityName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_CITY,savedCityName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdCity_ctl00__0']/td[3][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator, 5);
        System.out.println("Newly created city identified during search:" + savedCityName);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void clickSaveActionButton()
    {
       // By[] saveButtons = {SAVE_BUTTON_CITY};

       // for (By button : saveButtons)
        try
        {
            utils.waitForElementToBeClickable(SAVE_BUTTON_CITY, 3);
            utils.click(SAVE_BUTTON_CITY);
        }
        catch (Exception e)
        {
            throw new RuntimeException("No save button is present on the page.");
        }
    }
    public int getTotalRecordCount(WebDriverWait wait, By Page_record_count)
    {
        return wait.until(driver ->
        {
            String countText = driver.findElement(PAGE_RECORD_COUNT).getText().trim();
            if (countText.isEmpty())
            {
                return null;
            }
            return Integer.parseInt(countText);
        });
    }
    public void deleteCity()
    {
        try
        {
            By deleteIcon = By.xpath("//input[@alt='Delete'][1]");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(deleteIcon)).click();
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the delete icon");
        }
    }
    public void verify_deleted_City(int originalPageCount)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver ->
        {
            String current_countText = driver.findElement(PAGE_RECORD_COUNT).getText();
            int current_count = Integer.parseInt(current_countText);
            return (current_count == originalPageCount - 1);
        });
    }

}
