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

    public static final By PROD_INTERNAL_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtInternlName");
    public static final By PROD_DISPLAY_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtDisplayName");
    public static final By PROD_SHORT_NAME = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtShrtDescription");
    public static final By PROD_INSPECTION_CHARGES= By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtInspectionCharges");
    public static final By PROD_MAX_PPM_SCHEDULE_COUNT= By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_txtMaxPPMScheduleCount");
    public static final By SAVE_BUTTON_PROD = By.id("ctl00_ContentPlaceHolder1_RadWinB2CPro_C_BtnSave");


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
    //B2C ServiceDesk Starts
    public void clickOnB2CServiceDesk(String clickOnB2CServiceDesk) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='31']"));
            utils.click(locator);
            System.out.println("Clicked on the B2CServiceDesk: " + clickOnB2CServiceDesk);
        } catch (Exception e) {
            System.out.println("Failed to click on the B2CServiceDesk" +clickOnB2CServiceDesk);
            throw e;
        }
    }
    public void clickOnB2CServiceDeskProd(String clickOnB2CServiceDeskProd) throws InterruptedException {
        try {
            By locator=By.xpath(String.format("//*[@id='tab-Servicedesk']/div[2]/div/ul[1]/li[2]/a"));
            utils.click(locator);
            System.out.println("Clicked on the B2CServiceDesk Product: " + clickOnB2CServiceDeskProd);
        } catch (Exception e) {
            System.out.println("Failed to click on the B2CServiceDesk Product" +clickOnB2CServiceDeskProd);
            throw e;
        }
    }
    public void clickOnB2CSDPRDExcel() throws InterruptedException {
        try {
            By locator=By.id("btnExportToExcel");
            utils.click(locator);
            System.out.println("Clicked on the B2CServiceDesk Product Export to Excel");
        } catch (Exception e) {
            System.out.println("Failed to click on the B2CServiceDesk Product Export to Excel");
            throw e;
        }
    }
    //B2C Service Desk Pagination Starts
    public void B2CSDProdPagination(String B2CSDProdPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement firstCellBefore = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdB2CProduct_GridData']//tr[td][2]/td[1]")
                    )
            );
            String beforeText = firstCellBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath(
                    "//*[@id='ctl00_ContentPlaceHolder1_grdB2CProduct_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"
            ));
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView({block:'center'});", nextBtn
            );
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstCellBefore));
            WebElement firstCellAfter = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdB2CProduct_GridData']//tr[td][2]/td[1]")
                    )
            );
            String afterText = firstCellAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + B2CSDProdPagination);
            throw e;
        }
    }
    //B2C Service Desk Pagination Ends
    //B2C Service Desk Data per Page check Starts
    public void validatePageSizeB2CSDProd(int expectedSize) {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdB2CProduct_ctl00_ctl03_ctl01_PageSizeComboBox")));
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
    //B2C Service Desk per page check ends
    public void clickOnB2CSAddProd(String clickOnB2CSAddProd) throws InterruptedException {
        try {
            By locator=By.id("ctl00_ContentPlaceHolder1_BtnAdd");
            utils.click(locator);
            System.out.println("Clicked on the B2CServiceDesk Product Add: " + clickOnB2CSAddProd);
        } catch (Exception e) {
            System.out.println("Failed to click on the B2CServiceDesk Product Add" +clickOnB2CSAddProd);
            throw e;
        }
    }
    //Add New Product Starts
    public void ProdIntName(String ProdIntName) {
        utils.typeText(PROD_INTERNAL_NAME, ProdIntName);
    }
    public void ProdDisplayName(String ProdDisplayName) {
        utils.typeText(PROD_DISPLAY_NAME, ProdDisplayName);
    }
    public void ProdShortDesc(String ProdShortDesc) {
        utils.typeText(PROD_SHORT_NAME, ProdShortDesc);
    }
    public void ProdInspecCharge(String ProdInspecCharge) {
        utils.typeText(PROD_INSPECTION_CHARGES, ProdInspecCharge);
    }
    public void ProdMaxPPMCount(String ProdMaxPPMCount) {
        utils.typeText(PROD_MAX_PPM_SCHEDULE_COUNT, ProdMaxPPMCount);
    }
    //Prod Dropdowns
    public void selectProdMasterCat(String selectProdMasterCat) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProdmasterCategory_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdMasterCat));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdMasterCat);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdMasterCat);
            throw e;
        }
    }
    public void selectProdCat(String selectProdCat) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductCategory_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdCat));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdCat);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdCat);
            throw e;
        }
    }
    public void selectProdSubCat(String selectProdSubCat) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlProductSubCategory_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProdSubCat));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProdSubCat);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProdSubCat);
            throw e;
        }
    }
    public void selectPaymentSchedule(String selectPaymentSchedule) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlPaymentSchedule_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectPaymentSchedule));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectPaymentSchedule);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectPaymentSchedule);
            throw e;
        }
    }
    public void selectWOType(String selectWOType) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlWOType_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectWOType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectWOType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectWOType);
            throw e;
        }
    }
    public void selectFaultCode(String selectFaultCode) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFaultCode_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectFaultCode));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectFaultCode);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectFaultCode);
            throw e;
        }
    }
    public void selectPPMAfter(String selectPPMAfter) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement arrow = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("#ctl00_ContentPlaceHolder1_RadWinB2CPro_C_ddlFirstPPMAfter_Arrow")
            ));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arrow);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", arrow);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectPPMAfter));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectPPMAfter);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectPPMAfter);
            throw e;
        }
    }

    public void ClickAddProdSave() {
        By[] saveButtons = {SAVE_BUTTON_PROD};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Add New Product Ends
    //B2C ServiceDesk Ends

}

