package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HelpDeskB2CServicePage extends BasePage{
        public  HelpDeskB2CServicePage(WebDriver driver) {super(driver);}

    public static final By BTN_DIRECTWOBKNG = By.id("ctl00_ContentPlaceHolder1_btnDirectWOBoking");
    public static final By BTN_ADDNEWCONTACT = By.id("ctl00_ContentPlaceHolder1_radbtncontact");
    public static final By TXT_CUSTOMERNAME = By.id("radtxtCustomerName");
    public static final By CONTACTTYPE_DD = By.cssSelector("[value='Select Contact Type']");
    public static final By TXT_EMAIL = By.id("radtxtEmail");
    public static final By TXT_MOBILENO = By.id("radtxtMobileNumber");
    public static final By TXT_USERNAME = By.id("radtxtUserName");
    public static final By BTN_CONTACTSAVE = By.id("ctl00_ContentPlaceHolder1_RadWinContactAdd_C_AddContact_btnSave");
    public static final By BTN_CONTACTCANCEL = By.id("ctl00_ContentPlaceHolder1_RadWinContactAdd_C_AddContact_btnPropClose");
    public static final By SEARCHBY_DD = By.cssSelector("[value='Name']");
    public static final By TXT_SEARCH = By.id("ctl00_ContentPlaceHolder1_txt_search");
    public static final By BTN_TYPESEARCH = By.id("ctl00_ContentPlaceHolder1_radbtn_B2BSearch");

    public void clickOnHelpDeskMenu(String clickOnHelpDeskMenu) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='27']"));
            utils.click(locator);
            System.out.println("Clicked on the HelpDeskMenu: " + clickOnHelpDeskMenu);
        } catch (Exception e) {
            System.out.println("Failed to click on the HelpDeskMenu" +clickOnHelpDeskMenu);
            throw e;
        }
    }
    public void CallCentreHelpDesk(String CallCentreHelpDesk) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='tab-helpdesk']/div[2]/div/ul[1]/li[2]/a"));
            utils.click(locator);
            System.out.println("Clicked on the CallCentreHelpDesk: " + CallCentreHelpDesk);
        } catch (Exception e) {
            System.out.println("Failed to click on the CallCentreHelpDesk" +CallCentreHelpDesk);
            throw e;
        }
    }
    public void clickDirectWOBkngButton() {
        utils.click(BTN_DIRECTWOBKNG);
    }
    public void clickAddNewContact() {
        utils.click(BTN_ADDNEWCONTACT);
    }
    public void ContatName(String name) {
        utils.typeText(TXT_CUSTOMERNAME, name);
    }
    public void selectType(String selectType) {
        try {
            utils.click(CONTACTTYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectType);
            throw e;
        }
    }
    public void ContactEmail(String ContatEmail) {
        utils.typeText(TXT_EMAIL, ContatEmail);
    }
    public void CustMobile(String CustMobile) {
        utils.typeText(TXT_MOBILENO, CustMobile);
    }
    public void UserName(String UserName) {
        utils.typeText(TXT_USERNAME, UserName);
    }
    public void HelpDeskNewContactSaveButton() {
        By[] saveButtons = {BTN_CONTACTSAVE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    public void HelpDeskNewContactCancelButton() {
        By[] CancelButtons = {BTN_CONTACTCANCEL};
        for (By button : CancelButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No Cancel button is present on the page.");
    }
    public void selectBy(String selectBy) {
        try {
            utils.click(SEARCHBY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectBy));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectBy);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectBy);
            throw e;
        }
    }
    public void SearchText(String SearchText) {
        utils.typeText(TXT_SEARCH, "rk");
    }
    public void clickSearch() {
        utils.click(BTN_TYPESEARCH);
    }
    //Help desk Pagination Starts
    public void HelpDeskPagination(String HelpDeskPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement firstCellBefore = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdContact_GridData']//tr[td][2]/td[1]")
                    )
            );
            String beforeText = firstCellBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath(
                    "//*[@id='ctl00_ContentPlaceHolder1_grdContact_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"
            ));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", nextBtn
            );
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstCellBefore));
            WebElement firstCellAfter = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdContact_GridData']//tr[td][2]/td[1]")
                    )
            );
            String afterText = firstCellAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + HelpDeskPagination);
            throw e;
        }
    }
    //Help desk Pagination Ends

    //Help Desk Data per page check Starts
    public void validatePageSizeHelpDesk(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdContact_ctl00_ctl03_ctl01_PageSizeComboBox")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
        dropdown.click();
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[normalize-space()='" + expectedSize + "']")
                )
        );
        option.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-spinner")));
        List<WebElement> rows = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector(".rgDataDiv tbody tr")
                )
        );
        int actualSize = rows.size();
        if (actualSize > expectedSize) {
            throw new AssertionError("More rows than expected! Found: " + actualSize);
        }
        System.out.println("Expected: " + expectedSize + ", Actual: " + actualSize);
    }
    //Help Desk Data per page check ends
}

