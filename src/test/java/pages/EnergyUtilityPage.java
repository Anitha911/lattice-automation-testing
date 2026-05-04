package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HelperUtils;
import java.time.Duration;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebDriver;

public class EnergyUtilityPage extends BasePage {
    public EnergyUtilityPage(WebDriver driver) {
        super(driver);
    }
    public static final By ENERGY_ACC_CLIENT_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_ddlClient_Input");
    public static final By ENERGY_ACC_CLIENT_CONTRACT_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_ddlClientContract_Input");
    public static final By ENERGY_ACC_PROPERTY_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_ddlSubCommunity_Input");
    public static final By ENERGY_ACC_ENERGY_TYPE_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_ddlEnergyType_Input");
    public static final By ENERGY_ACC_SUPPLIER_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_ddlSupplier_Input");
    public static final By ENERGY_ACC_CONNECTED_SERVICE_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_ddlConnectedService_Input");
    public static final By ENERGY_ACC_METER_CONNECTION_LEVEL_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_ddlMeterConnectionLevel_Input");
    public static final By ENERGY_ACC_REPORTING_GRP_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_ddlGroup_Input");
    public static final By ENERGY_ACC_ASSET_DD = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_raddrpAsset_Input");
    public static final By PREMISE_NUMBER = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_txtPremiseNumber");
    public static final By METER_NUMBER = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_txtMeterNo");
    public static final By ENERGY_ACC_DESC = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_txtEnergyAccountDescription");
    public static final By ENERGY_CONTRACT_ACC_NUM = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_txtContactAccountNumber");
    public static final By ENERGY_COV_AREA = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_txtCoverageArea");
    public static final By ENERGY_MUL_FACTOR = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_txtMultiplicationFactor");
    public static final By ENERGY_ACC_METER_SAVE = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_btnSave");
    public static final By SUB_METER_NUMBER = By.id("ctl00_ContentPlaceHolder1_CCFollowUp_radwinSubMeter_C_txtSubMeterNo");
    public static final By SUB_METER_NOTES = By.id("ctl00_ContentPlaceHolder1_CCFollowUp_radwinSubMeter_C_txtRemarks1");
    public static final By MANUALENTRY_CLIENT_DD = By.id("ctl00_ContentPlaceHolder1_ddlClient_Input");
    public static final By MANUALENTRY_CLIENTCONTRACT_DD = By.id("ctl00_ContentPlaceHolder1_ddlClientContract_Input");
    public static final By MANUALENTRY_PROPERTY_DD = By.id("ctl00_ContentPlaceHolder1_ddlSubCommunity_Input");
    public static final By MANUALENTRY_ENERGYTYPE_DD = By.id("ctl00_ContentPlaceHolder1_ddlEnergyType_Input");
    public static final By MANUALENTRY_METER_DD = By.id("ctl00_ContentPlaceHolder1_ddlMeterorSubMeter_Input");
    public static final By MANUALENTRY_BILL_NUMBER = By.id("ctl00_ContentPlaceHolder1_txtBill");
    public static final By MANUALENTRY_INITIALREADING = By.id("ctl00_ContentPlaceHolder1_txtInitialReading");
    public static final By MANUALENTRY_CURRENTREADING = By.id("ctl00_ContentPlaceHolder1_txtCurrentReading");
    public static final By MANUALENTRY_CONSUMPTION = By.id("ctl00_ContentPlaceHolder1_txtConsumption");
    public static final By MANUALENTRY_MULFACTOR = By.id("ctl00_ContentPlaceHolder1_txtMultiplicationFactor");
    public static final By MANUALENTRY_RATE = By.id("ctl00_ContentPlaceHolder1_txtRate");
    public static final By MANUALENTRY_AMOUNT = By.id("ctl00_ContentPlaceHolder1_txtAmount");
    public static final By MANUALENTRY_AMOUNTINC_VAT = By.id("ctl00_ContentPlaceHolder1_txtAmountInclVat");

    public void MenuEnergyUtilityTrackingPage(String MenuEnergyUtilityTrackingPage) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.id("15"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on the MenuEnergyUtilityTrackingPage: " + MenuEnergyUtilityTrackingPage);
        } catch (Exception e) {
            System.out.println("Failed to click on the MenuEnergyUtilityTrackingPage: " + MenuEnergyUtilityTrackingPage);
            throw e;
        }
    }
    public void AccMeterSetUp(String AccMeterSetUp) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-energy']/div[2]/div/ul[1]/li[2]/a", AccMeterSetUp)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Acc meter Set Up: " + AccMeterSetUp);
        } catch (Exception e) {
            System.out.println("Failed to click on Acc meter Set Up: " + AccMeterSetUp);
            throw e;
        }
    }
    //Add Account/Meter Set Up
    public void clickOnAddAccMeterSetUp(String clickOnAddAccMeterSetUp) {
        try {
            By locator = By.id("BtnAdd");
            utils.click(locator);
            System.out.println("Clicked on the clickOnAddAccMeterSetUp Button: " + clickOnAddAccMeterSetUp);
        } catch (Exception e) {
            System.out.println("Failed to click on the clickOnAddAccMeterSetUp Button:: " + clickOnAddAccMeterSetUp);
            throw e;
        }
    }
    //AccountMeter SetUp Pagination Start
    public void clickOnGrdAccountMeterSetUpPagination(String clickOnGrdAccountMeterSetUpPagination) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstRowBefore = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdEnergyAccountSetup']")));
            String beforeText = firstRowBefore.getText();
            WebElement nextBtn = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdEnergyAccountSetup_ctl00_Pager']/tbody/tr/td/table/tbody/tr/td/div[3]/input[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextBtn);
            nextBtn.click();
            wait.until(ExpectedConditions.stalenessOf(firstRowBefore));
            WebElement firstRowAfter = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//*[@id='ctl00_ContentPlaceHolder1_grdEnergyAccountSetup']")));
            String afterText = firstRowAfter.getText();
            if (beforeText.equals(afterText)) {
                throw new AssertionError("Pagination failed: Same data on next page");
            } else {
                System.out.println("Pagination working correctly");
            }
        } catch (Exception e) {
            System.out.println("Pagination failed: Data did not change" + clickOnGrdAccountMeterSetUpPagination);
            throw e;
        }
    }
    //AccountMeter SetUp Pagination Ends
    //AccountMeter SetUp Data Per page Starts
        public void validatePageSize(int expectedSize) {
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_grdEnergyAccountSetup_ctl00_ctl03_ctl01_PageSizeComboBox_Input")));
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
    //AccountMeter SetUp Data Per page Ends
    //Add Acc Meter SetUP starts
    public void selectClient(String Client) {
        try {
            utils.click(ENERGY_ACC_CLIENT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Client));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + Client);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + Client);
            throw e;
        }
    }
    public void selectClientContract(String ClientContract) {
        try {
            utils.click(ENERGY_ACC_CLIENT_CONTRACT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", ClientContract));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + ClientContract);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + ClientContract);
            throw e;
        }
    }
    public void selectProperty(String selectProperty) {
        try {
            utils.click(ENERGY_ACC_PROPERTY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectProperty));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectProperty);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectProperty);
            throw e;
        }
    }
    public void selectEnergyType(String selectEnergyType) {
        try {
            utils.click(ENERGY_ACC_ENERGY_TYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectEnergyType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectEnergyType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectEnergyType);
            throw e;
        }
    }
    public void selectSupplier(String selectSupplier) {
        try {
            utils.click(ENERGY_ACC_SUPPLIER_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectSupplier));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectSupplier);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectSupplier);
            throw e;
        }
    }
    public void selectConnectedService(String selectConnectedService) {
        try {
            utils.click(ENERGY_ACC_CONNECTED_SERVICE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectConnectedService));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectConnectedService);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectConnectedService);
            throw e;
        }
    }
    public void selectConnectionLevel(String selectConnectionLevel) {
        try {
            utils.click(ENERGY_ACC_METER_CONNECTION_LEVEL_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectConnectionLevel));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectConnectionLevel);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectConnectionLevel);
            throw e;
        }
    }
    public void selectReportingGrp(String selectReportingGrp) {
        try {
            utils.click(ENERGY_ACC_REPORTING_GRP_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectReportingGrp));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectReportingGrp);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectReportingGrp);
            throw e;
        }
    }
    public void selectAsset(String selectAsset) {
        try {
            utils.click(ENERGY_ACC_ASSET_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectAsset));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectAsset);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectAsset);
            throw e;
        }
    }
    public void enterPremiseNumber(String enterPremiseNumber) {
        utils.typeText(PREMISE_NUMBER, enterPremiseNumber);
    }
    public void enterMeterNumber(String enterMeterNumber) {
        utils.typeText(METER_NUMBER, enterMeterNumber);
    }
    public void enterEnergyAccDesc(String enterEnergyAccDesc) {
        utils.typeText(ENERGY_ACC_DESC, enterEnergyAccDesc);
    }
    public void enterEnergyContractAccNum(String enterEnergyContractAccNum) {
        utils.typeText(ENERGY_CONTRACT_ACC_NUM, enterEnergyContractAccNum);
    }
    public void enterEnergyCovArea(String enterEnergyCovArea) {
        utils.typeText(ENERGY_COV_AREA, enterEnergyCovArea);
    }
    public void enterEnergyMulFactor(String enterEnergyMulFactor) {
        utils.typeText(ENERGY_MUL_FACTOR, enterEnergyMulFactor);
    }
    public void AddAccountMeterSetUp() {
        By[] saveButtons = {ENERGY_ACC_METER_SAVE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Add Acc Meter SetUP Ends
    public void AccountMeterSetUpGridDataClick() {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_grdEnergyAccountSetup_ctl00__0");
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpGridDataClick " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpGridDataClick: ");
            throw e;
        }
    }
    public void AccountMeterSetUpDetailEditButtonClick() {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_btnEdit");
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailEditButtonClick " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailEditButtonClick: ");
            throw e;
        }
    }
    public void AccountMeterSetUpDetailUpdateButtonClick() {
        try {
            By locator = By.id("ctl00_ContentPlaceHolder1_AddAccountSetUp_C_btnSave");
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailUpdateButtonClick " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailUpdateButtonClick: ");
            throw e;
        }
    }
    //Con Location Start
    public void AccountMeterSetUpDetailConnLoc() {
        try {
            By locator = (By.xpath(String.format("//*[@id='tdConnection']/span")));
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailConnLoc " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailConnLoc: ");
            throw e;
        }
    }
    public void AccountMeterSetUpDetailConnLocAdd() {
        try {
            By locator = (By.xpath(String.format("//*[@id='addConnection']/span")));
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailConnLocAdd " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailConnLocAdd: ");
            throw e;
        }
    }
    public void ConnLocationGridDetails() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement checkbox = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//table/tbody/tr[1]//input[@type='checkbox']")
                    )
            );
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        } catch (Exception e) {
            System.out.println("Failed to click on the ConnLocationGridDetails: ");
            throw e;
        }
    }
    public void AccountMeterSetUpDetailConnLocSave() {
        try {
            By locator = (By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_EASConnectionLocation_RadwinConnection_C_RadButton2']")));
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailConnLocSave " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailConnLocSave: ");
            throw e;
        }
    }
    //Con Location Ends
    //SubMeter Start
    public void AccountMeterSetUpDetailSubMeter() {
        try {
            By locator = (By.xpath(String.format("//*[@id='tdSubMeter']/span")));
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailSubMeter " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailSubMeter: ");
            throw e;
        }
    }
    public void AccountMeterSetUpDetailSubMeterAdd() {
        try {
            By locator = (By.xpath(String.format("//*[@id='addSubMeter']")));
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailSubMeterAdd " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailSubMeterAdd: ");
            throw e;
        }
    }
    public void enterSubMeterNumber(String enterSubMeterNumber) {
        utils.typeText(SUB_METER_NUMBER, enterSubMeterNumber);
    }
    public void enterEnergySubMeterNotes(String enterEnergySubMeterNotes) {
        utils.typeText(SUB_METER_NOTES, enterEnergySubMeterNotes);
    }
    public void AccountMeterSetUpDetailSubMeterSave() {
        try {
            By locator = (By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_CCFollowUp_radwinSubMeter_C_RadButton2']")));
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailSubMeterSave " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailSubMeterSave: ");
            throw e;
        }
    }
    public void AccountMeterSetUpDetailSubMeterDelete() {
        try {
            By locator = (By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_CCFollowUp_grdSubMeterGrp_ctl00_ctl04_imgDelete']")));
            utils.click(locator);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            System.out.println("Clicked on the AccountMeterSetUpDetailSubMeterDelete" );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailSubMeterDelete: ");
            throw e;
        }
    }
    public void AccountMeterSetUpDetailSubMeterHide(String Section) {
        try {
            String Xpath = "";
            switch (Section) {
                case "Connection Location":
                    Xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjaxPanel']/div[1]/div/div/span[2]";
                    break;
                case "Sub Meter":
                    Xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjaxPanel3']/div[1]/div/div/span[2]";
                    break;
                case "Consumption":
                    Xpath = "//*[@id='ctl00_ContentPlaceHolder1_RadAjaxPanel1']/div[1]/div/div/span[2]";
                    break;
                default:
                    throw new RuntimeException("Invalid section: " + Section);
            }
            WebElement btn = driver.findElement(By.xpath(Xpath));
            btn.click();
        } catch (Exception e) {
            System.out.println("Failed to click on the HIde: ");
            throw e;
        }
    }
    //SubMeter End
    public void AccountMeterSetUpDetailConsumption() {
        try {
            By locator = (By.xpath(String.format("//*[@id='tdHistory']/span")));
            utils.click(locator);
            System.out.println("Clicked on the AccountMeterSetUpDetailConsump History " );
        } catch (Exception e) {
            System.out.println("Failed to click on the AccountMeterSetUpDetailConsump History: ");
            throw e;
        }
    }
    //Account setup detail page
    //Account Meter Set Up Ends
    //Manual Entry Starts
    public void ManualEntry(String ManualEntry) throws InterruptedException {
        try {
            WebElement element = driver.findElement(By.xpath(String.format("//*[@id='tab-energy']/div[2]/div/ul[2]/li[3]/a", ManualEntry)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            System.out.println("Clicked on Manual Entry: " + ManualEntry);
        } catch (Exception e) {
            System.out.println("Failed to click on Manual Entry: " + ManualEntry);
            throw e;
        }
    }
    public void enterInitialReading(String enterInitialReading) {
        utils.typeText(MANUALENTRY_INITIALREADING, enterInitialReading);
    }
    public void enterCurrentReading(String enterCurrentReading) {
        utils.typeText(MANUALENTRY_CURRENTREADING, enterCurrentReading);
    }
    public void enterConsumption(String enterConsumption) {
        utils.typeText(MANUALENTRY_CONSUMPTION, enterConsumption);
    }
    public void enterMultiplicationFactor(String enterMultiplicationFactor) {
        utils.typeText(MANUALENTRY_MULFACTOR, enterMultiplicationFactor);
    }
    public void enterRate(String enterRate) {
        utils.typeText(MANUALENTRY_RATE, enterRate);
    }
    public void enterAmount(String enterAmount) {
        utils.typeText(MANUALENTRY_AMOUNT, enterAmount);
    }
    public void enterAmtIncVAT(String enterAmtIncVAT) {
        utils.typeText(MANUALENTRY_AMOUNTINC_VAT, enterAmtIncVAT);
    }
    public void enterBillNumber(String enterBillNumber) {
        utils.typeText(MANUALENTRY_BILL_NUMBER, enterBillNumber);
    }
    public void selectClientManualEntry(String selectClientManualEntry) {
        try {
            utils.click(MANUALENTRY_CLIENT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectClientManualEntry));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectClientManualEntry);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectClientManualEntry);
            throw e;
        }
    }
    public void selectClientContractManualEntry(String selectClientContractManualEntry) {
        try {
            utils.click(MANUALENTRY_CLIENTCONTRACT_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectClientContractManualEntry));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectClientContractManualEntry);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectClientContractManualEntry);
            throw e;
        }
    }
    public void selectManualEntryproperty(String selectManualEntryproperty) {
        try {
            utils.click(MANUALENTRY_PROPERTY_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectManualEntryproperty));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectManualEntryproperty);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectManualEntryproperty);
            throw e;
        }
    }
    public void selectManualEntryEnergyType(String selectManualEntryEnergyType) {
        try {
            utils.click(MANUALENTRY_ENERGYTYPE_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectManualEntryEnergyType));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectManualEntryEnergyType);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectManualEntryEnergyType);
            throw e;
        }
    }
    public void selectManualEntryMeter(String selectManualEntryMeter) {
        try {
            utils.click(MANUALENTRY_METER_DD);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", selectManualEntryMeter));
            utils.click(locator);
            System.out.println("Clicked on the dropdown: " + selectManualEntryMeter);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: " + selectManualEntryMeter);
            throw e;
        }
    }
    public void ManualEntryCheckinitialCurrent() {
        try {
            double num1 = 0.0;
            String val1 = driver.findElement(MANUALENTRY_INITIALREADING).getAttribute("value");
            if (val1 != null && !val1.trim().isEmpty()) {
                val1 = val1.trim().replace(",", "").replaceAll("[^0-9.]", "");
                num1 = Double.parseDouble(val1);
            }            double greaterValue = num1 + (Math.random() * 100 + 1);
            String formatted = String.format(Locale.US, "%.2f", greaterValue);
            WebElement textbox2 = driver.findElement(MANUALENTRY_CURRENTREADING);
            textbox2.clear();
            textbox2.sendKeys(formatted);
        } catch (Exception e) {
            System.out.println("Failed to click on the ManualEntrySave: ");
            throw e;
        }
    }
    public void ManualEntrySave() {
        try {
            By locator = (By.xpath(String.format("//*[@id='ctl00_ContentPlaceHolder1_btnSave']")));
            utils.click(locator);
            System.out.println("Clicked on the ManualEntrySave " );
        } catch (Exception e) {
            System.out.println("Failed to click on the ManualEntrySave: ");
            throw e;
        }
    }
    //Manual Entry Ends

}
