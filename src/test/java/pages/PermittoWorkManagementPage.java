package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

public class PermittoWorkManagementPage extends BasePage
{
    public PermittoWorkManagementPage(WebDriver driver)
    {
        super(driver);
    }
    public static final By TYPE_NAME_INPUT = By.id("ctl00_ContentPlaceHolder1_RadWinPTWType_C_radtxtPTWType");
    public static final By ShortName_INPUT = By.id("radtxtPTWTypeShortName");
    public static final By TOWI_INPUT = By.id("txtInvoilved");
    public static final By GPTW_checkbox = By.id("ctl00_ContentPlaceHolder1_RadWinPTWType_C_chkGeneric");
    public static final By SPTW_checkbox = By.id("ctl00_ContentPlaceHolder1_RadWinPTWType_C_chkSpecific");
    public static final By Internal_checkbox = By.id("ctl00_ContentPlaceHolder1_RadWinPTWType_C_chkInternal");
    public static final By SubContract_checkbox = By.id("ctl00_ContentPlaceHolder1_RadWinPTWType_C_chkSubContract");
    public static final By SAVE_BUTTON_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinPTWType_C_BtnPTWTypeSave");
    public static final By SEARCH_TYPE = By.id("ctl00_ContentPlaceHolder1_grdPTWType_ctl00_ctl02_ctl03_FilterTextBox_Type");
    public void clickOnIcon()
    {
        try
        {
            By locator = By.xpath("//div[@class='nav sideMenuScroll']//a[@title='Permit to Work Management']");
            utils.click(locator);
            System.out.println("Clicked on the PTW icon");
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the PTW icon");
            throw e;
        }
    }
    public void clickTabByTitle()
    {
        try
        {
            By locator = By.xpath("//div[@class='sidebar-menu']/ul//li//a[text()='PTW Checklist by Type']");
            utils.click(locator);
            System.out.println("Clicked on the tab");
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the tab");
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
    public void enterPTWType(String name)
    {
        utils.typeText(TYPE_NAME_INPUT, name);
    }
    public void enterSN(String name)
    {
        utils.typeText(ShortName_INPUT, name);
    }
    public void enterTOWI(String name)
    {
        utils.typeText(TOWI_INPUT, name);
    }
    public void clickIssuanceApplicability()
    {
        try
        {
            utils.click(GPTW_checkbox);
            utils.click(SPTW_checkbox);
            System.out.println("Selected both checkboxes");
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the checkbox");
            throw e;
        }
    }
    public void clickRequesterApplicability()
    {
        try
        {
            utils.click(Internal_checkbox);
            utils.click(SubContract_checkbox);
            System.out.println("Selected both checkboxes");
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the checkbox");
            throw e;
        }
    }
    public void clickSaveActionButton() {
        By[] saveButtons = {SAVE_BUTTON_TYPE};

        for (By button : saveButtons)
        {
            if (utils.isElementVisible(button))
            {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void verifyTypeName(String savedtypeName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.typeText(SEARCH_TYPE, savedtypeName + Keys.ENTER);
        By locator = By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_grdPTWType_ctl00__0']/td[1][@title]");
        utils.waitForElement(locator);
        utils.isElementVisible(locator);
        System.out.println("Newly created type identified during search:" + savedtypeName);
    }
    public void filterAndClickDraftRecord()
    {
        try
        {
            By locator = By.xpath("//tr[@class='rgFilterRow']//td/input[@alt='Filter Status column']");
            utils.click(locator);
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
            utils.typeText(locator, "Draft" + Keys.ENTER);
            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait2.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdPTWType_ctl00__0")));
            new Actions(driver).doubleClick(element).perform();
            System.out.println("Filtered Draft records and clicked on first record");
        }
        catch (Exception e)
        {
            System.out.println("Failed to click on the record");
            throw e;
        }
    }
    public void clickonChecklistmenu()
    {

    }

}
