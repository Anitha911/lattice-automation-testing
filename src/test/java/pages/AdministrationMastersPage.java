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
public class AdministrationMastersPage extends BasePage {
    public AdministrationMastersPage(WebDriver driver) {
        super(driver);
    }

    public static final By NOTE_TYPE_CATEGORY = By.id("radtxtNoteType");
    public static final By DOCUMENT_TYPE = By.id("radtxtDocument");
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
    public static final By SCOPE = By.id("radtxtScope");
    public static final By ENCRYPTION_METHOD_SELECT = By.cssSelector("[value='Select Encryption Method']");
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

    private By docRelatedWrapper =
            By.cssSelector("div.k-multiselect-wrap");

    // Search input (for typing)
    private By docRelatedInput =
            By.cssSelector("div.k-multiselect-wrap input.k-input");

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
                    Thread.currentThread().interrupt(); // best practice
                }
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }

    public void enterNote_Type_Category(String NoteTypeCategory) {
        utils.typeText(NOTE_TYPE_CATEGORY, NoteTypeCategory);
    }

    public void verifyAddNote_Type_Category(String NoteTypeCategory) {
        utils.typeText(SEARCH_NOTE_TYPE_CATEGORY, NoteTypeCategory + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdNoteTypeorCategory_ctl00__0'] td[title='%s']", NoteTypeCategory));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickNote_Type_CategorytoEdit() {
        utils.click(FIRST_NOTE_TYPE_CATEGORY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateNote_Type_Category(String updateNoteTypeCategory) {
        utils.clearAndType(NOTE_TYPE_CATEGORY, updateNoteTypeCategory);
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
    }

    public void clickNote_Type_CategoryToDelete() {
        utils.click(DELETE_FIRST_NOTE_TYPE_CATEGORY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        };

    }
        public void enterDocument_Type(String DocumentType) {
            utils.typeText(DOCUMENT_TYPE, DocumentType);
            driver.findElement(DOCUMENT_TYPE).sendKeys(Keys.TAB);
        }

    public void selectDocumentRelatedTo(String value1, String value2) {

        utils.waitForElementToBeClickable(docRelatedWrapper);
        utils.jsClick(docRelatedWrapper);

        selectSingleValue(value1);
        selectSingleValue(value2);
        // Close dropdown properly
        driver.findElement(docRelatedInput).sendKeys(Keys.ESCAPE);
    }


    private void selectSingleValue(String value) {
        utils.waitForElementVisible(docRelatedInput);
        utils.clearAndType(docRelatedInput, value);

   }

        public void verifyAddDocument_Type(String Document_Type) {
            utils.typeText(SEARCH_DOCUMENT_TYPE, Document_Type + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdDocument_ctl00__0'] td[title='%s']", Document_Type));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
        }

        public void clickDocument_TypetoEdit() {
            utils.click(FIRST_DOCUMENT_TYPE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
        }

        public void updateDocument_Type(String updateDocumentType) {
            utils.clearAndType(DOCUMENT_TYPE, updateDocumentType);
        }

        public void verifyUpdateDocument_Type(String updateDocumentType) {
            utils.typeText(SEARCH_DOCUMENT_TYPE, updateDocumentType + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdDocument_ctl00__0'] td[title='%s']", updateDocumentType));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            } ;
        }

        public void clickDocument_TypeToDelete() {
            utils.click(DELETE_FIRST_DOCUMENT_TYPE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            };
    }

    public void enterHolidayFrom_Date(String HolidayFrom_Date) {
        utils.typeText(HOLIDAY_FROM_DATE, HolidayFrom_Date); }

    public void enterHolidayTo_Date(String HolidayTo_Date) {
        utils.typeText(HOLIDAY_TO_DATE, HolidayTo_Date); }

    public void enterHoliday(String Holiday) {
        utils.typeText(HOLIDAY, Holiday); }

    public void verifyAddAnnual_Holiday_List(String Holiday) {
        utils.typeText(SEARCH_HOLIDAY, Holiday + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdHoliday_ctl00__0'] td[title='%s']", Holiday));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clickAnnual_Holiday_List_toEdit() {
        utils.click(FIRST_ANNUAL_HOLIDAY_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateHolidayFrom_Date (String HolidayFrom_Date) {
        utils.clearAndType(HOLIDAY_FROM_DATE, HolidayFrom_Date); }

    public void updateHolidayTo_Date (String HolidayTo_Date) {
        utils.clearAndType(HOLIDAY_TO_DATE, HolidayTo_Date); }

    public void Update_Holiday(String UpdateHoliday) {
        utils.clearAndType(HOLIDAY, UpdateHoliday);   }

    public void verifyUpdateAnnual_Holiday_List(String Update_Holiday) {
        utils.typeText(SEARCH_HOLIDAY, Update_Holiday + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdHoliday_ctl00__0'] td[title='%s']", Update_Holiday));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        } ;
    }

    public void clickAnnual_Holiday_ListToDelete() {
        utils.click(DELETE_FIRST_ANNUAL_HOLIDAY_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        };

    }

    public void enterAnnouncement_Title(String Announcement_Title) {
        utils.typeText(ANNOUNCEMENT_TITLE, Announcement_Title); }

    public void selectStart_Date(String Start_Date) {
        utils.typeText(ANNOUNCEMENT_START_DATE, Start_Date); }

    public void selectEnd_Date(String End_Date) {
        utils.typeText(ANNOUNCEMENT_END_DATE, End_Date); }

    public void enterDescription(String Description) {
        utils.typeText(ANNOUNCEMENT_DESCRIPTION, Description); }

    public void verifyAddAnnouncement(String Announcement) {
        utils.typeText(SEARCH_ANNOUNCEMENT_TITLE, Announcement + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAnnouncement_ctl00__0'] td[title='%s']", Announcement));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickAnnouncementtoEdit() {
        utils.click(FIRST_ANNOUNCEMENT_TITLE_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updateAnnouncement(String updateAnnouncement) {
        utils.clearAndType(ANNOUNCEMENT_TITLE, updateAnnouncement);
    }

    public void verifyUpdateAnnouncement(String UpdateAnnouncement) {
        utils.typeText(SEARCH_ANNOUNCEMENT_TITLE, UpdateAnnouncement + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdAnnouncement_ctl00__0'] td[title='%s']", UpdateAnnouncement));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        } ;
    }

    public void clickAnnouncementToDelete() {
        utils.click(DELETE_FIRST_ANNOUNCEMENT_TITLE_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        } ;
    }


    public void enterEmail_Server(String Email_Server) {
        utils.typeText(EMAIL_SERVER, Email_Server); }

    public void enterPort_Number(String Port_Number) {
            utils.typeText(PORT_NUMBER, Port_Number); }

    public void enterClient_Id(String Client_Id) {
        utils.typeText(CLIENT_ID, Client_Id); }

   public void enterClient_Secret(String Client_Secret) {
        utils.typeText(CLIENT_SECRET, Client_Secret); }

    public void enterEmail_Account(String Email_Account) {
        utils.typeText(EMAIL_ACCOUNT, Email_Account); }

    public void enterAccount_Password(String Account_Password) {
        utils.typeText(ACCOUNT_PASSWORD, Account_Password); }

    public void enterRedirection_URL(String Redirection_URL) {
        utils.typeText(REDIRECTION_URL, Redirection_URL); }

    public void enterAuth_Code_URL(String Auth_Code_URL) {
        utils.typeText(AUTH_CODE_URL, Auth_Code_URL); }

    public void enterToken_Exchange_URL(String Token_Exchange_URL) {
        utils.typeText(TOKEN_EXCHANGE_URL, Token_Exchange_URL); }

    public void enterDevice_URL(String Device_URL) {
        utils.typeText(DEVICE_URL, Device_URL); }

   public void selectEncryption_Method(String Encryption_Method) {
        try {
            utils.click(ENCRYPTION_METHOD_SELECT);
            By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Encryption_Method));
            utils.click(locator);
            System.out.println("Clicked on the DropDown: " + Encryption_Method);
        } catch (Exception e) {
            System.out.println("Failed to click on the DropDown: " + Encryption_Method);
            throw e;
        }
    }

    public void enterScope(String Scope) {
        utils.typeText(SCOPE,Scope); }

    public void verifyAddEmail_Listener_Setup(String Email_Listener_Setup) {
        utils.typeText(SEARCH_EMAIL_LISTENER_SETUP, Email_Listener_Setup + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdEmailListenerSetup_ctl00__0'] td[title='%s']", Email_Listener_Setup));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void clickEmail_Listener_SetuptoEdit() {
        utils.click(FIRST_EMAIL_SERVER_IN_LIST);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        }
    }

    public void updategenerateEmail_Server(String updateEmail_Server) {
        utils.clearAndType(EMAIL_SERVER, updateEmail_Server);
    }

    public void verifyUpdateEmail_Listener_Setup(String updateEmail_Server) {
        utils.typeText(SEARCH_EMAIL_LISTENER_SETUP, updateEmail_Server + Keys.ENTER);
        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_grdEmailListenerSetup_ctl00__0'] td[title='%s']", updateEmail_Server));
        utils.isElementVisible(locator);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        } ;
    }

    public void clickEmail_Listener_SetupToDelete() {
        utils.click(DELETE_FIRST_EMAIL_LISTENER_SETUP_IN_LIST);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // best practice
        } ;

    }
    }


