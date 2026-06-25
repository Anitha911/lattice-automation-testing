package pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.Random;


public class ScheduledMaintenanceMasterspage extends BasePage {
     public ScheduledMaintenanceMasterspage(WebDriver driver) {
         super(driver);    }

    public static final By MASTER_PARAMETER_RESPONSE_VALUES = By.linkText("Parameter Response Values");
    public static final By MASTER_TASK_FREQUENCY_CODE = By.id("radtxtMarkingChar");
    public static final By MASTER_TASK_FREQUENCY_NAME = By.id("radtxtFreqName");
    public static final By MASTER_FREQUENCY_PERIOD = By.id("txtFreqPeriod");
    public static final By MASTER_FREQUENCY_UNIT_DROPDOWN = By.id("ctl00_ContentPlaceHolder1_RadWinPPM_C_radDrpFreqUnit_Arrow");
    public static final By MASTER_FIRST_RUN_PERIOD = By.id("radtxtFirstRun");
    public static final By SEARCH_TASK_FREQUENCY_NAME = By.cssSelector("[alt='Filter FrequencyName column']");
    public static final By FIRST_TASK_FREQUENCY_NAME_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdPPM_ctl00__0");
    public static final By DELETE_FIRST_TASK_FREQUENCY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdPPM_ctl00_ctl04_ImageButton1");

    public static final By PARAMETER_RESPONSE_VALUE = By.id("radtxtParameter");
    public static final By SAVE_BUTTON_TASK_FREQUENCY = By.id("ctl00_ContentPlaceHolder1_RadWinPPM_C_btnPPMSAVE");
    public static final By SAVE_BUTTON_PARAMETER_RESPONSE_VALUES = By.id("ctl00_ContentPlaceHolder1_RadWinParameterResVal_C_btnParaResvalSave");
    public static final By SEARCH_PARAMETER_RESPONSE_VALUE = By.cssSelector("[alt='Filter MeteringParameterName column']");
    public static final By FIRST_PARAMETER_RESPONSE_VALUE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdParameterResValues_ctl00__0");
    public static final By DELETE_FIRST_PARAMETER_RESPONSE_VALUE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdParameterResValues_ctl00_ctl04_imgDelete");

    public static final By MASTER_SCHEDULED_MAINTENANCE_EXPORT_TO_EXCEL_BUTTON = By.id("btnExportToExcel");

    public void moveToParameterResponseValuesSection() {
        utils.click(MASTER_PARAMETER_RESPONSE_VALUES);
    }

    //    Task Frequency - Add

    public void enterMasterTaskFrequencyCode(String FrequencyCode)
    {  utils.typeText(MASTER_TASK_FREQUENCY_CODE, FrequencyCode);
        System.out.println("Entered Task Frequency Code is : " + FrequencyCode);}

    public void enterMasterTaskFrequencyName(String FrequencyName)
    {  utils.typeText(MASTER_TASK_FREQUENCY_NAME, FrequencyName);
        System.out.println("Entered Task Frequency Name is : " + FrequencyName);}

    public void enterMasterFrequencyPeriod(String FrequencyPeriod)
    {  utils.typeText(MASTER_FREQUENCY_PERIOD, FrequencyPeriod);
        System.out.println("Entered Frequency Period is : " + FrequencyPeriod);}

    public void selectMasterFrequencyUnit() {
        String[] frequencyUnits = {  "Day", "Hour", "Month", "Week", "Year"  };
        String selectedValue =  frequencyUnits[new Random().nextInt(frequencyUnits.length)];
        System.out.println("Selected Frequency Unit : " + selectedValue);
        utils.click(MASTER_FREQUENCY_UNIT_DROPDOWN);
        By option = By.xpath("//li[normalize-space()='" + selectedValue + "']");
        utils.click(option); }

    public void enterMasterFirstRunPeriod(String FirstRunPeriod)
    {  utils.typeText(MASTER_FIRST_RUN_PERIOD, FirstRunPeriod);
        System.out.println("Entered First Run Period is : " + FirstRunPeriod);}

    public void VerifycreatedTaskFrequencyName(String FrequencyName) {
        utils.typeText(SEARCH_TASK_FREQUENCY_NAME, FrequencyName + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdPPM_ctl00__0'] td[title='%s']", FrequencyName));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Verified Created Task Frequency Successfully");
    }


    //    Task Frequency - Update

    public void clickTaskFrequencyNametoEdit() {
        utils.click(FIRST_TASK_FREQUENCY_NAME_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Clicked First Task Frequency Name To Edit");
    }

    public void updateTaskFrequencyName(String updateTaskFrequencyName) {
        utils.clearAndType(MASTER_TASK_FREQUENCY_NAME, updateTaskFrequencyName);
        System.out.println("Updated Task Frequency Name is " + updateTaskFrequencyName);
    }

    public void verifyUpdateTaskFrequencyName(String updateTaskFrequencyName) {
        utils.typeText(SEARCH_TASK_FREQUENCY_NAME, updateTaskFrequencyName + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdPPM_ctl00__0'] td[title='%s']", updateTaskFrequencyName));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }        ;
        System.out.println("Verified Updated Task Frequency Name Successfully");
    }


//    Task Frequency - Delete


    public void clickTaskFrequencyToDelete() {
        utils.click(DELETE_FIRST_TASK_FREQUENCY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        };
        System.out.println("Deleted Task Frequency Value Successfully");
    }

    //    Parameter Response Values - Add

    public void enterParameterResponseValuesdetails(String ParameterName)
    {  utils.typeText(PARAMETER_RESPONSE_VALUE, ParameterName);
        System.out.println("Entered Parameter Response Value is : " + ParameterName);}

    public void clickScheduledMaintenanceSaveButton() {
        if (utils.isElementVisible(SAVE_BUTTON_TASK_FREQUENCY)) {
            utils.waitForElementToBeClickable(SAVE_BUTTON_TASK_FREQUENCY);
            utils.click(SAVE_BUTTON_TASK_FREQUENCY);
        } else if (utils.isElementVisible(SAVE_BUTTON_PARAMETER_RESPONSE_VALUES)) {
            utils.waitForElementToBeClickable(SAVE_BUTTON_PARAMETER_RESPONSE_VALUES);
            utils.click(SAVE_BUTTON_PARAMETER_RESPONSE_VALUES);
        } else {
            throw new RuntimeException("Save button is not visible.");
        }
    }

    public void VerifycreatedParameterResponseValue(String ParameterName) {
        utils.typeText(SEARCH_PARAMETER_RESPONSE_VALUE, ParameterName + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdParameterResValues_ctl00__0'] td[title='%s']", ParameterName));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
        System.out.println("Verified Created Parameter Response Value  Successfully");
            }

    //    Parameter Response Values - Update

    public void clickParameterResponseValuetoEdit() {
        utils.click(FIRST_PARAMETER_RESPONSE_VALUE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Clicked First Parameter To Edit");
    }

    public void updateParameterResponseValue(String updateParameterResponseValue) {
        utils.clearAndType(PARAMETER_RESPONSE_VALUE, updateParameterResponseValue);
        System.out.println("Updated Parameter Response value is " + updateParameterResponseValue);
    }

       public void verifyUpdateParameterResponseValue(String updateParameterResponseValue) {
        utils.typeText(SEARCH_PARAMETER_RESPONSE_VALUE, updateParameterResponseValue + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdParameterResValues_ctl00__0'] td[title='%s']", updateParameterResponseValue));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }        ;
           System.out.println("Verified Updated Parameter Response Value Successfully");
    }

    //    Parameter Response Values - Delete

    public void clickParameterResponseValueToDelete() {
        utils.click(DELETE_FIRST_PARAMETER_RESPONSE_VALUE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        };
        System.out.println("Deleted Parameter Response Value Successfully");
    }

    //     Export to Excel
    public void MasterScheduledMaintenanceExporttoExcel() {
        utils.click(MASTER_SCHEDULED_MAINTENANCE_EXPORT_TO_EXCEL_BUTTON);
        System.out.println("Downloaded file successfully");    }
}
