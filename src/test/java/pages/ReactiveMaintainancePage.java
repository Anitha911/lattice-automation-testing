package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HelperUtils;
import java.time.Duration;
import java.util.List;

public class ReactiveMaintainancePage extends BasePage{
    public ReactiveMaintainancePage(WebDriver driver) {
        super(driver);
    }
    public static final By PROPERTYOWNER_DD = By.cssSelector("[value='Select a Property Owner / Customer']");
    public static final By PROPERTYCONTRACT_DD = By.cssSelector("[value='Select a Property / Contract']");
    public static final By PROPERTY_DD = By.cssSelector("[value='Select Property']");
    public static final By ZONE_DD = By.cssSelector("[value='Select Zone']");
    public static final By SUBZONE_DD = By.cssSelector("[value='Select Sub Zone']");
    public static final By BASEUNIT_DD = By.cssSelector("[value='Select Base unit']");
    public static final By SG_DD = By.cssSelector("[value='Select Service Group']");
    public static final By FAULTCATEGORY_DD = By.cssSelector("[value='Select Fault Category']");
    public static final By FAULTCODE_DD = By.cssSelector("[value='Select Fault Code']");
    public static final By SUBMITREQUEST = By.id("ctl00_ContentPlaceHolder1_btnSave");
    public static final By RM_NOTES = By.id("ctl00_ContentPlaceHolder1_Notes_radwin_addnotes_popup_C_AddNotes_txtApprovalNote");
    public static final By RM_NOTETYPE_DD = By.cssSelector("[value='Select Note Type / Category']");
    public static final By SAVE_BUTTON_RMNOTES = By.id("ctl00_ContentPlaceHolder1_Notes_radwin_addnotes_popup_C_AddNotes_btnNoteSave");
    public static final By RM_PTWTYPE_DD = By.cssSelector("[value='Select PTW Type']");
    public static final By SAVE_BUTTON_RMPTW = By.id("ctl00_ContentPlaceHolder1_PermitToWork_RadWinArea_C_btnPermitSave");
    public static final By ASSIGN_RMDETAIL = By.id("ctl00_ContentPlaceHolder1_btnPendingAssign");

    public void MenuRM(String MenuRM) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("4"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on the MenuRM: " + MenuRM);
        } catch (Exception e) {
            System.out.println("Failed to click on the MenuRM: " + MenuRM);
            throw e;
        }
    }
    public void RMNewRequest(String RMNewRequest) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-graphs']/div[2]/div/ul[1]/li[2]/a", RMNewRequest)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on RMNewRequest Click: " + RMNewRequest);
        } catch (Exception e) {
            System.out.println("Failed to click on RMNewRequest Click: " + RMNewRequest);
            throw e;
        }
    }
    public void selectPropertyOwner(String selectPropertyOwner) {
        try {
            utils.click(PROPERTYOWNER_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectPropertyOwner));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectPropertyOwner);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectPropertyOwner);
            throw e;
        }
    }
    public void selectPropertyContract(String selectPropertyContract) {
        try {
            utils.click(PROPERTYCONTRACT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectPropertyContract));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectPropertyContract);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectPropertyContract);
            throw e;
        }
    }
    public void selectProperty(String selectProperty) {
        try {
            utils.click(PROPERTY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProperty));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProperty);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProperty);
            throw e;
        }
    }
    public void selectZone(String selectZone) {
        try {
            utils.click(ZONE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectZone));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectZone);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectZone);
            throw e;
        }
    }
    public void selectSubZone(String selectSubZone) {
        try {
            utils.click(SUBZONE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectSubZone));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectSubZone);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectSubZone);
            throw e;
        }
    }
    public void selectBaseUnit(String selectBaseUnit) {
        try {
            utils.click(BASEUNIT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectBaseUnit));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectBaseUnit);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectBaseUnit);
            throw e;
        }
    }
    public void selectSG(String selectSG) {
        try {
            utils.click(SG_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectSG));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectSG);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectSG);
            throw e;
        }
    }
    public void selectFaultCategory(String selectFaultCategory) {
        try {
            utils.click(FAULTCATEGORY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectFaultCategory));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectFaultCategory);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectFaultCategory);
            throw e;
        }
    }
    public void selectFaultCode(String selectFaultCode) {
        try {
            utils.click(FAULTCODE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectFaultCode));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectFaultCode);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectFaultCode);
            throw e;
        }
    }
    public void ClickNewRequestSave() {
        By[] saveButtons = {SUBMITREQUEST};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                List<WebElement> buttons = driver.findElements(
                        By.xpath("//*[@id='ctl00_ContentPlaceHolder1_btnSave' or @id='ctl00_ContentPlaceHolder1_RadWinDuplicateWOWarning_C_btnIngoreCreate']")
                );
                if (!buttons.isEmpty()) {
                    buttons.get(0).click();
                }
                return;

            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //RM Detail Page
    public void RMRequestDetail(String RMRequestDetail) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-graphs']/div[2]/div/ul[2]/li[2]/a", RMRequestDetail)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on RMNewRequest Detail Page: " + RMRequestDetail);
        } catch (Exception e) {
            System.out.println("Failed to click on RMNewRequest Detail Page: " + RMRequestDetail);
            throw e;
        }
    }
    public void RMRequestDetailOpen() throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdRM_ctl00__0"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
            System.out.println("Clicked on RMNewRequest Detail Page First Record:");
        } catch (Exception e) {
            System.out.println("Failed to click on RMNewRequest Detail Page First Record: ");
            throw e;
        }
    }
    public void clickOnAddRMNotes(String clickOnAddRMNotes) {
        try {
            String parentWindow = driver.getWindowHandle();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() > 1);

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(parentWindow)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            WebElement el = wait.until(
                    ExpectedConditions.presenceOfElementLocated
                            (By.xpath(("(//*[@id='addnotes'])[2]")))

            );
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", el);
            js.executeScript("arguments[0].click();", el);
            System.out.println("Clicked on the RM detail Page Note: " + clickOnAddRMNotes);
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Detail Page Note: " + clickOnAddRMNotes);
            throw e;
        }
    }
    public void enterRMNotesComments(String enterNotesComments) {
        utils.typeText(RM_NOTES, enterNotesComments);
    }
    public void selectRMNoteType(String selectNoteType) {
        try {
            //
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, -500);");
            utils.click(RM_NOTETYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectNoteType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectNoteType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectNoteType);
            throw e;
        }
    }
    public void ClickRMNotesSave() {
        By[] saveButtons = {SAVE_BUTTON_RMNOTES};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //PTW
    public void RMDetailPTWSection() {
        try {
            String parentWindow = driver.getWindowHandle();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() > 1);

            for (String handle : driver.getWindowHandles()) {
                if (!handle.equals(parentWindow)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            WebElement el = wait.until(
                    ExpectedConditions.presenceOfElementLocated
                            (By.xpath(("//*[@id='mnuPTW']")))

            );
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", el);
            js.executeScript("arguments[0].click();", el);
            System.out.println("Clicked on the RM detail Page Add PTW: " );
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Detail Page Add PTW: ");
            throw e;
        }
    }
    public void clickOnAddRMPTW(String AddPTW) {
        try {
            String parentWindow = driver.getWindowHandle();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(driver -> driver.getWindowHandles().size() > 1);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            WebElement el = wait.until(
                    ExpectedConditions.presenceOfElementLocated
                            (By.xpath(("//*[@id='ctl00_ContentPlaceHolder1_PermitToWork_btnAddPTW']")))

            );
            js.executeScript("arguments[0].scrollIntoView({block:'center'});", el);
            js.executeScript("arguments[0].click();", el);
            System.out.println("Clicked on the RM detail Page Add PTW Button: +AddPTW" );
        } catch (Exception e) {
            System.out.println("Failed to click on the RM Detail Page Add PTW Button: +AddPTW ");
            throw e;
        }
    }
    public void selectRMPTWType(String selectRMPTWType) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, -500);");
            utils.click(RM_PTWTYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectRMPTWType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectRMPTWType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectRMPTWType);
            throw e;
        }
    }
    public void ClickRMPTWSave() {
        By[] saveButtons = {SAVE_BUTTON_RMPTW};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //WO Status Check
    public void RMRequestDetailWOStatusNotDespatched() throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> driver.getWindowHandles().size() > 1);

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        try {
            String status = "Not Dispatched";
            List<WebElement> elements = driver.findElements(
                    By.xpath(String.format("//span/span[normalize-space()='%s']", status))
            );
            if (!elements.isEmpty()) {
                utils.click(ASSIGN_RMDETAIL);
            }
            else {
                System.out.println("No Assign Button present in RMNewRequest Detail Page: " );
            }
        } catch (Exception e) {
            System.out.println("No Assign Button present in RMNewRequest Detail Page: " );
            throw e;
        }
    }
    //WO status Check

}
