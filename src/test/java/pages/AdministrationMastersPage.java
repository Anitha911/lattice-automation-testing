package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.Duration;
import java.util.Random;

public class AdministrationMastersPage extends BasePage {
    public AdministrationMastersPage(WebDriver driver) {
        super(driver);
    }

    public static final By NOTE_TYPE_CATEGORY = By.id("radtxtNoteType");
    public static final By DOCUMENT_TYPE = By.id("radtxtDocument");
    public static final By DOCUMENT_RELATED_TO = By.id("ctl00_ContentPlaceHolder1_ctl00_ContentPlaceHolder1_RadWinDocument_C_radDrpDocumentRT1Panel");
    public static final By HOLIDAY_FROM_DATE = By.id("ctl00_ContentPlaceHolder1_RadWinHoliday_C_Date_FromDate_dateInput");
    public static final By HOLIDAY_TO_DATE = By.id("ctl00_ContentPlaceHolder1_RadWinHoliday_C_Date_ToDate_dateInput");
    public static final By HOLIDAY = By.id("radtxtHoliday");
    public static final By ANNOUNCEMENT_TITLE = By.id("RadMainTitle");
    public static final By ANNOUNCEMENT_START_DATE = By.id("ctl00_ContentPlaceHolder1_RadWinAnnoucement_C_RadStartDate_dateInput");
    public static final By ANNOUNCEMENT_END_DATE = By.id("ctl00_ContentPlaceHolder1_RadWinAnnoucement_C_RadEndDate_dateInput");
    public static final By ANNOUNCEMENT_DESCRIPTION = By.id("RadDescription");
    public static final By EMAIL_SERVER = By.id("radtxtServer");
    public static final By PORT_NUMBER = By.id("radtxtPortNo");
    public static final By CLIENT_ID = By.id("radtxtClientId");
    public static final By CLIENT_SECRET = By.id("radtxtClientSecret");
    public static final By EMAIL_ACCOUNT = By.id("radtxtEmailAccount");
    public static final By ACCOUNT_PASSWORD = By.id("radtxtAccPassword");
    public static final By REDIRECTION_URL = By.id("radtxtRedirectionURL");
    public static final By AUTH_CODE_URL = By.id("radtxtAuthCodeURL");
    public static final By TOKEN_EXCHANGE_URL = By.id("radtxtTockenExchangeURL");
    public static final By DEVICE_URL = By.id("radtxtDeviceURL");
    public static final By ENCRYPTION_METHOD = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_raddrpEncryption_Input");
    public static final By SCOPE = By.id("radtxtScope");

    public static final By SAVE_BUTTON_NOTE_TYPE_CATEGORY = By.id("ctl00_ContentPlaceHolder1_RadWinNotesType_C_btnNoteTypeOk");
    public static final By SAVE_BUTTON_DOCUMENT_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinDocument_C_btnDocumentOk");
    public static final By SAVE_BUTTON_ANNUAL_HOLIDAY = By.id("ctl00_ContentPlaceHolder1_RadWinHoliday_C_btnHolidayOk");
    public static final By SAVE_BUTTON_ANNOUNCEMENT = By.id("ctl00_ContentPlaceHolder1_RadWinAnnoucement_C_RadAnnoucement");
    public static final By SAVE_BUTTON_EMAIL_LISTENER_SETUP = By.id("ctl00_ContentPlaceHolder1_RadWinEmailLis_C_btnEmailListenerSave");
    public static final By SEARCH_NOTE_TYPE_CATEGORY = By.cssSelector("[alt='Filter NoteType column']");
    public static final By SEARCH_DOCUMENT_TYPE = By.cssSelector("[alt='Filter DocumentTypeName column']");
    public static final By SEARCH_HOLIDAY = By.cssSelector("[alt='Filter Holiday column']");
    public static final By SEARCH_EMAIL_LISTENER_SETUP = By.cssSelector("[alt='Filter EmailServer column']");
    public static final By SEARCH_ANNOUNCEMENT_TITLE = By.cssSelector("[alt='Filter MainTitle column']");
    public static final By FIRST_NOTE_TYPE_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdNoteTypeorCategory_ctl00__0");
    public static final By FIRST_DOCUMENT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdDocument_ctl00__0");
    public static final By FIRST_ANNOUNCEMENT_TITLE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAnnouncement_ctl00__0");
    public static final By FIRST_EMAIL_SERVER_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdEmailListenerSetup_ctl00__0");
    public static final By FIRST_ANNUAL_HOLIDAY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdHoliday_ctl00__0");
    public static final By DELETE_FIRST_NOTE_TYPE_CATEGORY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdNoteTypeorCategory_ctl00_ctl04_imgDelete");
    public static final By DELETE_FIRST_DOCUMENT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdDocument_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_ANNUAL_HOLIDAY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdHoliday_ctl00_ctl04_imgDelete");
    public static final By DELETE_FIRST_ANNOUNCEMENT_TITLE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdAnnouncement_ctl00_ctl04_ImageButton1");
    public static final By DELETE_FIRST_EMAIL_LISTENER_SETUP_IN_LIST = By.id("ctl00_ContentPlaceHolder1_grdEmailListenerSetup_ctl00_ctl04_ImageButton1");

    public static final By MASTER_ADMINISTRATION_EXPORT_TO_EXCEL_BUTTON = By.id("ContentPlaceHolder1_btnExportToExcel");

    public void moveToSectionByName(String sectionName) {
        String subMenuId = switch (sectionName.trim()) {
            case "Note Type / Category" -> "50";
            case "Document Type" -> "51";
            case "Annual Holiday List" -> "52";
            case "Announcement" -> "60";
            case "Email Listener Setup  " -> "99";
            case "Working Days / Time" -> "53";
            default -> null;
        };

        By locator;
        if (subMenuId != null) {
            locator = By.xpath("//a[contains(@href,'ManageAdministrationMaster.aspx') and contains(@href,'SubMenuItemsId=" + subMenuId + "')]");
        } else {
            locator = By.xpath("//a[contains(normalize-space(.),'" + sectionName + "')]");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", el);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        System.out.println("Clicked menu: " + sectionName);
    }

    public void clickAdministrationSaveButton() {
        By[] save = {SAVE_BUTTON_NOTE_TYPE_CATEGORY, SAVE_BUTTON_DOCUMENT_TYPE,
                SAVE_BUTTON_ANNUAL_HOLIDAY, SAVE_BUTTON_ANNOUNCEMENT, SAVE_BUTTON_EMAIL_LISTENER_SETUP};
        for (By button : save) {
            if (utils.isElementVisible(button)) {
                utils.waitForElementToBeClickable(button);
                utils.click(button);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void enterNote_Type_Category(String NoteTypeCategory) {
        utils.typeText(NOTE_TYPE_CATEGORY, NoteTypeCategory);
        System.out.println("Entered Note Type Category is : " + NoteTypeCategory);
    }

    public void verifyAddNote_Type_Category(String NoteTypeCategory) {
        utils.typeText(SEARCH_NOTE_TYPE_CATEGORY, NoteTypeCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdNoteTypeorCategory_ctl00__0'] td[title='%s']", NoteTypeCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Verified Created Note Type Successfully");
    }

    public void clickNote_Type_CategorytoEdit() {
        utils.click(FIRST_NOTE_TYPE_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateNote_Type_Category(String updateNoteTypeCategory) {
        utils.clearAndType(NOTE_TYPE_CATEGORY, updateNoteTypeCategory);
        System.out.println("Entered Note Type Category is : " + updateNoteTypeCategory);
    }

    public void verifyUpdateNote_Type_Category(String updateNoteTypeCategory) {
        utils.typeText(SEARCH_NOTE_TYPE_CATEGORY, updateNoteTypeCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdNoteTypeorCategory_ctl00__0'] td[title='%s']", updateNoteTypeCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        } ;
        System.out.println("Verified Updated Note Type Successfully");
    }

    public void clickNote_Type_CategoryToDelete() {
        utils.click(DELETE_FIRST_NOTE_TYPE_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        };
       System.out.println("Note Type Deleted Successfully");
    }


//    Document Type
        public void enterDocument_Type(String DocumentType) {
            utils.typeText(DOCUMENT_TYPE, DocumentType);
            System.out.println("The Entered Document Type is : " + DocumentType);
            driver.findElement(DOCUMENT_TYPE).sendKeys(Keys.TAB);
        }

    public void selectDocumentRelatedTo(String... values) {
        utils.click(DOCUMENT_RELATED_TO);
        for (String value : values) {
        By option = By.xpath("//ul[contains(@id,'radDrpDocumentRT1_listbox')]//li[normalize-space()='" + value + "']");
            utils.click(option);
        }
        utils.click(DOCUMENT_RELATED_TO);
    }

        public void verifyAddDocument_Type(String Document_Type) {
            utils.typeText(SEARCH_DOCUMENT_TYPE, Document_Type + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdDocument_ctl00__0'] td[title='%s']", Document_Type));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Verified Document Type Successfully");
        }

        public void clickDocument_TypetoEdit() {
            utils.click(FIRST_DOCUMENT_TYPE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void updateDocument_Type(String updateDocumentType) {
            utils.clearAndType(DOCUMENT_TYPE, updateDocumentType);
            System.out.println("The Updated Document Type is : " + updateDocumentType);
       }

        public void verifyUpdateDocument_Type(String updateDocumentType) {
            utils.typeText(SEARCH_DOCUMENT_TYPE, updateDocumentType + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdDocument_ctl00__0'] td[title='%s']", updateDocumentType));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } ;
        }

        public void clickDocument_TypeToDelete() {
            utils.click(DELETE_FIRST_DOCUMENT_TYPE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            };
            System.out.println("Document Type Deleted Successfully");
    }

    //    Annual Holiday List

    public void enterHolidayFrom_Date(String HolidayFrom_Date) {
        utils.typeText(HOLIDAY_FROM_DATE, HolidayFrom_Date);
        System.out.println("The Entered Holiday From Date is : " + HolidayFrom_Date);
    }

    public void enterHolidayTo_Date(String HolidayTo_Date) {
        utils.typeText(HOLIDAY_TO_DATE, HolidayTo_Date);
        System.out.println("The Entered Holiday To Date is : " + HolidayTo_Date);
    }

    public void enterHoliday(String Holiday) {
        utils.typeText(HOLIDAY, Holiday);
        System.out.println("The Entered Holiday reason is : " + Holiday);}

    public void verifyAddAnnual_Holiday_List(String Holiday) {
        utils.typeText(SEARCH_HOLIDAY, Holiday + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdHoliday_ctl00__0'] td[title='%s']", Holiday));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Added Holiday is Verified Successfully");
    }

    public void clickAnnual_Holiday_List_toEdit() {
        utils.click(FIRST_ANNUAL_HOLIDAY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateHolidayFrom_Date (String HolidayFrom_Date) {
        utils.clearAndType(HOLIDAY_FROM_DATE, HolidayFrom_Date);
        System.out.println("The Updated Holiday From Date is : " + HolidayFrom_Date);}

    public void updateHolidayTo_Date (String HolidayTo_Date) {
        utils.clearAndType(HOLIDAY_TO_DATE, HolidayTo_Date);
        System.out.println("The Updated Holiday To Date is : " + HolidayTo_Date);
    }

    public void Update_Holiday(String UpdateHoliday) {
        utils.clearAndType(HOLIDAY, UpdateHoliday);
        System.out.println("The Updated Holiday reason is : " + UpdateHoliday);
    }

    public void verifyUpdateAnnual_Holiday_List(String Update_Holiday) {
        utils.typeText(SEARCH_HOLIDAY, Update_Holiday + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdHoliday_ctl00__0'] td[title='%s']", Update_Holiday));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } ;
        System.out.println("Updated Holiday is Verified Successfully");
    }

    public void clickAnnual_Holiday_ListToDelete() {
        utils.click(DELETE_FIRST_ANNUAL_HOLIDAY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        };
        System.out.println("Holiday Deleted Successfully");
    }


    public void enterAnnouncement_Title(String Announcement_Title) {
        utils.typeText(ANNOUNCEMENT_TITLE, Announcement_Title);
        System.out.println("The Entered Announcement Title is : " + Announcement_Title);
    }

    public void selectStart_Date(String Start_Date) {
        utils.typeText(ANNOUNCEMENT_START_DATE, Start_Date);
        System.out.println("The Entered Announcement Start Date is : " + Start_Date);}

    public void selectEnd_Date(String End_Date) {
        utils.typeText(ANNOUNCEMENT_END_DATE, End_Date);
        System.out.println("The Entered Announcement End Date is : " + End_Date);}

    public void enterDescription(String Description) {
        utils.typeText(ANNOUNCEMENT_DESCRIPTION, Description);
        System.out.println("The Entered Announcement Description is : " + Description);}

    public void verifyAddAnnouncement(String Announcement) {
        utils.typeText(SEARCH_ANNOUNCEMENT_TITLE, Announcement + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAnnouncement_ctl00__0'] td[title='%s']", Announcement));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Added Announcement is Verified Successfully");
    }

    public void clickAnnouncementtoEdit() {
        utils.click(FIRST_ANNOUNCEMENT_TITLE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updateAnnouncement(String updateAnnouncement) {
        utils.clearAndType(ANNOUNCEMENT_TITLE, updateAnnouncement);
        System.out.println("The Updated Announcement Description is : " + updateAnnouncement);
    }

    public void updateStartDate(String startDate) {
        WebElement startDateField =  driver.findElement(ANNOUNCEMENT_START_DATE);
        startDateField.clear();
        startDateField.sendKeys(startDate);
        System.out.println("The Entered Updated Announcement End Date is  : " + startDate);
    }

    public void updateEndDate(String endDate) {
        WebElement endDateField =  driver.findElement(ANNOUNCEMENT_END_DATE);
        endDateField.clear();
        endDateField.sendKeys(endDate);
        System.out.println("The Entered Updated Announcement End Date is  : " + endDate);
    }

    public void verifyUpdateAnnouncement(String UpdateAnnouncement) {
        utils.typeText(SEARCH_ANNOUNCEMENT_TITLE, UpdateAnnouncement + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAnnouncement_ctl00__0'] td[title='%s']", UpdateAnnouncement));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } ;
        System.out.println("The Updated Announcement is Verified Successfully");
    }

    public void clickAnnouncementToDelete() {
        utils.click(DELETE_FIRST_ANNOUNCEMENT_TITLE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } ;
        System.out.println("The Announcement is Deleted Successfully");
    }

    //    Email Listener Setup
    public void enterEmail_Server(String Email_Server) {
        utils.typeText(EMAIL_SERVER, Email_Server);
        System.out.println("The Entered Email Server is : " + Email_Server);}

    public void enterPort_Number(String Port_Number) {
            utils.typeText(PORT_NUMBER, Port_Number);
        System.out.println("The Entered Port Number is : " + Port_Number);}

    public void enterClient_Id(String Client_Id) {
        utils.typeText(CLIENT_ID, Client_Id);
        System.out.println("The Entered Client Id is : " + Client_Id);}

   public void enterClient_Secret(String Client_Secret) {
        utils.typeText(CLIENT_SECRET, Client_Secret);
       System.out.println("The Entered Client Secret is : " + Client_Secret);}

    public void enterEmail_Account(String Email_Account) {
        utils.typeText(EMAIL_ACCOUNT, Email_Account);
        System.out.println("The Entered Email Account is : " + Email_Account);}

    public void enterAccount_Password(String Account_Password) {
        utils.typeText(ACCOUNT_PASSWORD, Account_Password);
        System.out.println("The Entered Account Password is : " + Account_Password);}

    public void enterRedirectionURL(String Redirection_URL) {
        utils.typeText(REDIRECTION_URL, Redirection_URL);
        System.out.println("The Entered Redirection URL is : " + Redirection_URL);
    }

    public void enterAuthCodeURL(String Auth_Code_URL) {
        utils.typeText(AUTH_CODE_URL, Auth_Code_URL);
        System.out.println("The Entered Auth Code URL is : " + Auth_Code_URL);}

    public void enterTokenExchangeURL(String Token_Exchange_URL) {
        utils.typeText(TOKEN_EXCHANGE_URL, Token_Exchange_URL);
        System.out.println("The Entered Token Exchange URL is : " + Token_Exchange_URL);}

    public void enterDeviceURL(String Device_URL) {
        utils.typeText(DEVICE_URL, Device_URL);
        System.out.println("The Entered Device URL is : " + Device_URL);}

   public void selectEncryptionMethodrandom() {
       String[] methods = {"Encrypted", "Un Encrypted"};
       String randomMethod =  methods[new Random().nextInt(methods.length)];
       utils.click(ENCRYPTION_METHOD);
       By option = By.xpath("//li[normalize-space()='" + randomMethod + "']");
       utils.click(option);
       System.out.println("Selected Encryption Method : " + randomMethod);
    }

    public void enterScope(String Scope) {
        utils.typeText(SCOPE,Scope);
        System.out.println("The Entered Scope is  : " + Scope);}

    public void verifyAddEmail_Listener_Setup(String Email_Listener_Setup) {
        utils.typeText(SEARCH_EMAIL_LISTENER_SETUP, Email_Listener_Setup + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdEmailListenerSetup_ctl00__0'] td[title='%s']", Email_Listener_Setup));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("The Added Email Listener Setup is Verified Successfully");
    }

    public void clickEmail_Listener_SetuptoEdit() {
        utils.click(FIRST_EMAIL_SERVER_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void updategenerateEmail_Server(String updateEmail_Server) {
        utils.clearAndType(EMAIL_SERVER, updateEmail_Server);
        System.out.println("The Entered Updated Email Server  is : " + updateEmail_Server);

    }

    public void verifyUpdateEmail_Listener_Setup(String updateEmail_Server) {
        utils.typeText(SEARCH_EMAIL_LISTENER_SETUP, updateEmail_Server + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdEmailListenerSetup_ctl00__0'] td[title='%s']", updateEmail_Server));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } ;
        System.out.println("The Updated Email Listener Setup is Verified Successfully");
    }

    public void clickEmail_Listener_SetupToDelete() {
        utils.click(DELETE_FIRST_EMAIL_LISTENER_SETUP_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } ;
        System.out.println("The Email Listener Setup is Deleted Successfully");
    }

   //Export to Excel

    public void MasterAdministrationExporttoExcel() {
        utils.click(MASTER_ADMINISTRATION_EXPORT_TO_EXCEL_BUTTON);
        System.out.println("Downloaded file successfully");    }

   }


