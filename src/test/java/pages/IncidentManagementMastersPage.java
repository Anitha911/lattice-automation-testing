    package pages;

    import org.openqa.selenium.*;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import org.openqa.selenium.support.ui.ExpectedConditions;

    import java.time.Duration;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;

    public class IncidentManagementMastersPage extends BasePage {
        public IncidentManagementMastersPage(WebDriver driver) {
            super(driver);
        }

        public static final By INCIDENT_TYPE_CODE = By.id("rdtxtbx_shortname");
        public static final By INCIDENT_TYPE = By.id("TxtType");
        public static final By INCIDENT_SUB_TYPE_CODE = By.id("rdtxtincidentsubtypecode");
        public static final By INCIDENT_SUB_TYPE = By.id("rdtxtincidentsubtype");
        public static final By INCIDENT_SEVERITY = By.id("txtSeverityType");
        public static final By INCIDENT_AFFECTED_GROUP = By.id("txtAffectingType");
        public static final By INCIDENT_CAUSED_BY = By.id("txtCausedType");
        public static final By INCIDENT_IMPACT_TYPE = By.id("txtImpactType");
        public static final By INCIDENT_IMPACT_TYPE_SORT_ORDER = By.id("radtxtImpactSort");
        public static final By INCIDENT_SECTION_NAME = By.id("SectionBoxid");
        public static final By INCIDENT_SECTION_SORT_ORDER = By.id("ctl00_ContentPlaceHolder1_RadWinsection_C_sortorderid");
        public static final By INCIDENT_FIELD_NAME = By.id("FieldsName");
        public static final By INCIDENT_FIELD_SORT_ORDER = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_sortOder");
        public static final By INCIDENT_LIST_OF_VALUE = By.id("Valueid");
        public static final By SEARCH_INCIDENT_TYPE = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_INCIDENT_SUB_TYPE = By.cssSelector("[alt='Filter SubTypeName column']");
        public static final By SEARCH_INCIDENT_SEVERITY = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_INCIDENT_AFFECTED_GROUP = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_INCIDENT_CAUSED_BY = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_INCIDENT_IMPACT_TYPE = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_INCIDENT_SECTION = By.cssSelector("[alt='Filter SectionName column']");
        public static final By SEARCH_INCIDENT_FIELD = By.cssSelector("[alt='Filter FieldName column']");
        public static final By SEARCH_INCIDENT_LIST_OF_VALUE = By.cssSelector("[alt='Filter Value column']");
        public static final By SAVE_BUTTON_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentType_C_Add");
        public static final By SAVE_BUTTON_SUB_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentSubType_C_rdbtnSave");
        public static final By SAVE_BUTTON_SEVERITY = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentSeverity_C_ButAddSeverity");
        public static final By SAVE_BUTTON_AFFECTED_GROUP = By.id("ctl00_ContentPlaceHolder1_RadWinAffectGroup_C_ButAddAffecting");
        public static final By SAVE_BUTTON_CAUSED_BY = By.id("ctl00_ContentPlaceHolder1_RadWinCausedby_C_BtnAddCaused");
        public static final By SAVE_BUTTON_IMPACT_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinImpacttype_C_BtnAddImpact");
        public static final By SAVE_BUTTON_SECTION = By.id("ctl00_ContentPlaceHolder1_RadWinsection_C_sectionaddid");
        public static final By SAVE_BUTTON_FIELD = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_addf");
        public static final By SAVE_BUTTON_LIST_OF_VALUES = By.id("ctl00_ContentPlaceHolder1_RadWinLOv_C_AddLOV");
        public static final By FIRST_INCIDENT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00__0");
        public static final By FIRST_INCIDENT_SUB_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_IncidentSubType_Grid_ctl00__0");
        public static final By FIRST_INCIDENT_SEVERITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_SeverityType_Grid_ctl00__0");
        public static final By FIRST_INCIDENT_AFFECTED_GROUP_IN_LIST = By.id("ctl00_ContentPlaceHolder1_AffectingType_Grid_ctl00__0");
        public static final By FIRST_INCIDENT_CAUSED_BY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_CausedType_Grid_ctl00__0");
        public static final By FIRST_INCIDENT_IMPACT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_ImpactType_Grid_ctl00__0");
        public static final By FIRST_INCIDENT_SECTION_IN_LIST = By.id("ctl00_ContentPlaceHolder1_section_Grid_ctl00__0");
        public static final By FIRST_INCIDENT_FIELD_IN_LIST = By.id("ctl00_ContentPlaceHolder1_Feild_Grid_ctl00__0");
        public static final By FIRST_INCIDENT_LIST_OF_VALUE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_LOV_Grid_ctl00__0");
        public static final By DELETE_FIRST_INCIDENT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_SUB_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_IncidentSubType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_SEVERITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_SeverityType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_AFFECTED_GROUP_IN_LIST = By.id("ctl00_ContentPlaceHolder1_AffectingType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_CAUSED_BY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_CausedType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_IMPACT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_ImpactType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_SECTION_IN_LIST = By.id("ctl00_ContentPlaceHolder1_section_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_FIELD_IN_LIST = By.id("ctl00_ContentPlaceHolder1_Feild_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_LIST_OF_VALUE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_LOV_Grid_ctl00_ctl04_ImageButton1");
        public static final By MASTER_INCIDENT_MANAGEMENT_EXPORT_TO_EXCEL_BUTTON= By.id("btnExportToExcel");

        public void MasterclickIncidentSaveButton() {
            By[] saveButtons = {SAVE_BUTTON_TYPE, SAVE_BUTTON_SUB_TYPE, SAVE_BUTTON_SEVERITY, SAVE_BUTTON_AFFECTED_GROUP, SAVE_BUTTON_CAUSED_BY, SAVE_BUTTON_IMPACT_TYPE, SAVE_BUTTON_SECTION, SAVE_BUTTON_FIELD, SAVE_BUTTON_LIST_OF_VALUES};
            for (By button : saveButtons) {
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

        public void MasterenterIncidentTypeCode(String code) {
            utils.typeText(INCIDENT_TYPE_CODE, code);
            System.out.println("The Entered Incident Type Code is : " + code);
        }

        public void MasterenterIncidentType(String name) {
            utils.typeText(INCIDENT_TYPE, name);
            System.out.println("The Entered Incident Type Name is : " + name);
        }

        public void MasterupdateIncidentTypeCode(String updateCode) {
            utils.typeText(INCIDENT_TYPE_CODE, updateCode);
            System.out.println("The Updated Incident Type Code is : " + updateCode);
        }

        public void MasterupdateIncidentType(String updateType) {
            utils.typeText(INCIDENT_TYPE, updateType);
            System.out.println("The Updated Incident Type Name is : " + updateType);
        }

        public void MasterverifyIncidentType(String type) {
            utils.typeText(SEARCH_INCIDENT_TYPE, type + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00__0'] td[title='%s']", type));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The Entered Incident Type Name Is Verified Successfully");
        }

        public void MasterclickIncidentTypetoEdit() {
            utils.click(FIRST_INCIDENT_TYPE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void MasterverifyUpdateIncidentType(String incidentType) {
            utils.typeText(SEARCH_INCIDENT_TYPE, incidentType + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00__0'] td[title='%s']", incidentType));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }            ;
            System.out.println("The Updated Incident Type Name Is Verified Successfully");
        }

        public void MasterclickIncidentTypeToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_TYPE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }            ;
            System.out.println("The Incident Type Name Is Deleted Successfully");
        }

        public void clickOnIncidentTabByTitleName(String tabName) {
            String subMenuId = switch (tabName.trim()) {
                case "Incident Type" -> "205";
                case "Incident Sub-Type" -> "206";
                case "Incident Severity" -> "73";
                case "Affected Group" -> "74";
                case "Incident-Caused By" -> "75";
                case "Incident-Impact Type" -> "76";
                case "Incident-Section" -> "77";
                case "Incident-Field" -> "78";
                case "Incident-List of Values" -> "79";
                default -> null;
            };
            By locator;
            if (subMenuId != null) {
                locator = By.xpath("//a[contains(@href,'ManageIncidentMaster.aspx') and contains(@href,'SubMenuItemsId=" + subMenuId + "')]");
            } else {
                locator = By.xpath("//a[contains(normalize-space(.),'" + tabName + "')]");
            }
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", el);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
            System.out.println("Clicked menu: " + tabName);
        }

        public void MasterenterIncidentSubTypeCode(String code) {
            utils.typeText(INCIDENT_SUB_TYPE_CODE, code);
            System.out.println("The Entered Incident Sub Type Code is : " + code);
        }

        public void MasterenterIncidentSubType(String name) {
            utils.typeText(INCIDENT_SUB_TYPE, name);
            System.out.println("The Entered Incident Sub Type Name is : " + name);
        }

        public void MasterselectRandomIncidentType() {   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
            )).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[contains(@class,'rcbItem')]") ));
            int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
            System.out.println("Units Found : " + count);
            int randomIndex = new Random().nextInt(count) + 1;
            By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
            String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                    .getText();
            WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", element);
            System.out.println("Selected Incident Type is : " + selectedValue);
        }

        public void MasterverifyIncidentSubType(String subtype) {
            utils.typeText(SEARCH_INCIDENT_SUB_TYPE, subtype + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentSubType_Grid_ctl00_ctl02_ctl02_FilterTextBox_SubTypeName'] td[title='%s']", subtype));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The Entered Incident Sub Type Name Is Verified Successfully");
        }

        public void MasterclickIncidentSubTypetoEdit() {
            utils.click(FIRST_INCIDENT_SUB_TYPE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void MasterupdateIncidentSubTypeCode(String updateSubTypeCode) {
            utils.clearAndType(INCIDENT_SUB_TYPE_CODE, updateSubTypeCode);
            System.out.println("The Updated Incident Sub Type Code is : " + updateSubTypeCode);
        }

        public void MasterupdateIncidentSubType(String updateSubType) {
            utils.clearAndType(INCIDENT_SUB_TYPE, updateSubType);
            System.out.println("The Updated Incident Sub Type is : " + updateSubType);
        }

        public void MasterverifyUpdateIncidentSubType(String incidentSubType) {
            utils.typeText(SEARCH_INCIDENT_SUB_TYPE, incidentSubType + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00__0'] td[title='%s']", incidentSubType));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } ;
            System.out.println("The Updated Incident Sub Type Name Is Verified Successfully");
        }

        public void MasterclickIncidentSubTypeToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_SUB_TYPE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } ;
            System.out.println("The Incident Sub Type Is Deleted Successfully");
        }

        public void MasterenterIncidentSeverity(String severity) {
            utils.typeText(INCIDENT_SEVERITY, severity);
            System.out.println("The Entered Incident Severity is : " + severity);
        }

        public void MasterverifyIncidentSeverity(String severity) {
            utils.typeText(SEARCH_INCIDENT_SEVERITY, severity + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentSubType_Grid_ctl00_ctl02_ctl02_FilterTextBox_SubTypeName'] td[title='%s']", severity));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The Entered Incident Severity Is Verified Successfully");
        }

        public void MasterclickIncidentSeveritytoEdit() {
            utils.click(FIRST_INCIDENT_SEVERITY_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void MasterupdateIncidentSeverity(String updateSeverity) {
            utils.clearAndType(INCIDENT_SEVERITY, updateSeverity);
            System.out.println("The Updated Incident Severity is : " + updateSeverity);

        }

        public void MasterverifyUpdateIncidentSeverity(String updateSeverity) {
            utils.typeText(SEARCH_INCIDENT_SEVERITY, updateSeverity + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_SeverityType_Grid_ctl00_ctl02_ctl02_FilterTextBox_TypeName'] td[title='%s']", updateSeverity));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }       ;
            System.out.println("The Updated Incident Severity Is Verified Successfully");
        }

        public void MasterclickIncidentSeverityToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_SEVERITY_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }  ;
            System.out.println("The Incident Severity Is Deleted Successfully");
        }

        //    Affected Group
        public void MasterEnterIncidentAffectedGroup(String AffectedGroup) {
            utils.typeText(INCIDENT_AFFECTED_GROUP, AffectedGroup);
            System.out.println("The Entered Incident Affected Group Is : " + AffectedGroup);
        }

        public void MasterverifyIncidentAffectedGroup(String AffectedGroup) {
            utils.typeText(SEARCH_INCIDENT_AFFECTED_GROUP, AffectedGroup + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_AffectingType_Grid_ctl00__0'] td[title='%s']", AffectedGroup));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The Entered Incident Affected Group Is Verified Successfully");
        }

        public void MasterclickIncidentAffectedGrouptoEdit() {
            utils.click(FIRST_INCIDENT_AFFECTED_GROUP_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void MasterupdateIncidentAffectedGroup(String updateAffectedGroup) {
            utils.clearAndType(INCIDENT_AFFECTED_GROUP, updateAffectedGroup);
            System.out.println("The Updated Incident Affected Group Is : " + updateAffectedGroup);
        }

        public void MasterverifyUpdateIncidentAffectedGroup(String AffectedGroupName) {
            utils.typeText(SEARCH_INCIDENT_AFFECTED_GROUP, AffectedGroupName + Keys.ENTER);
            By locator = By.cssSelector(String.format("['id='ctl00_ContentPlaceHolder1_AffectingType_Grid_ctl00__0'] td[title='%s']", AffectedGroupName));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }   ;
            System.out.println("The Updated Incident Affected Group Is Verified Successfully");
        }

        public void MasterclickIncidentAffectedGroupToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_AFFECTED_GROUP_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }      ;
            System.out.println("The Incident Affected Group Is Deleted Successfully");
        }

//     Incident - Caused By
        public void MasterenterCausedBy(String CausedBy) {
            utils.typeText(INCIDENT_CAUSED_BY, CausedBy);
            System.out.println("The Entered Incident Caused By is : " + CausedBy);
        }

        public void MasterverifyCausedBy(String CausedBy) {
            utils.typeText(SEARCH_INCIDENT_CAUSED_BY, CausedBy + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_CausedType_Grid_ctl00__0'] td[title='%s']", CausedBy));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The Entered Incident Caused By Is Verified Successfully");
        }

        public void MasterclickCausedBytoEdit() {
            utils.click(FIRST_INCIDENT_CAUSED_BY_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void MasterupdateCausedBy(String updateCausedBy) {
            utils.clearAndType(INCIDENT_CAUSED_BY, updateCausedBy);
            System.out.println("The Updated Incident Caused By is : " + updateCausedBy);
        }

        public void MasterverifyUpdateCausedBy(String UpdateCausedBy) {
            utils.typeText(SEARCH_INCIDENT_CAUSED_BY, UpdateCausedBy + Keys.ENTER);
            By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_CausedType_Grid_ctl00__0'] td[title='%s']", UpdateCausedBy));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }    ;
            System.out.println("The Updated Incident Caused By Is Verified Successfully");
        }

        public void MasterclickCausedByToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_CAUSED_BY_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }   ;
            System.out.println("The Incident Caused By Is Deleted Successfully");
        }

//        Incident Impact_Type
        public void MasterenterImpactType(String ImpactType) {
            utils.typeText(INCIDENT_IMPACT_TYPE, ImpactType);
            System.out.println("The Entered Incident Impact Type is : " + ImpactType);
        }

        public void MasterenterImpactTypeSortOrder(int ImpactType_Sort_Order) {
            utils.typeText(INCIDENT_IMPACT_TYPE_SORT_ORDER, String.valueOf(ImpactType_Sort_Order));
            System.out.println("The Entered Incident Impact Type Sort Order is : " + ImpactType_Sort_Order);
        }

        public void MasterverifyImpactType(String ImpactType) {
            utils.typeText(SEARCH_INCIDENT_IMPACT_TYPE, ImpactType + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ImpactType_Grid_ctl00__0'] td[title='%s']", ImpactType));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The Entered Incident Impact Type Is Verified Successfully");
        }

        public void MasterclickImpactTypetoEdit() {
            utils.click(FIRST_INCIDENT_IMPACT_TYPE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void MasterupdateImpactType(String updateImpactType) {
            utils.clearAndType(INCIDENT_IMPACT_TYPE, updateImpactType);
            System.out.println("The Updated Incident Impact Type is : " + updateImpactType);
        }

        public void MasterverifyUpdateImpactType(String UpdateImpactType) {
            utils.typeText(SEARCH_INCIDENT_IMPACT_TYPE, UpdateImpactType + Keys.ENTER);
            By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_ImpactType_Grid_ctl00__0'] td[title='%s']", UpdateImpactType));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            };
            System.out.println("The Updated Incident Impact Type Is Verified Successfully");
        }

        public void MasterclickIncidentImpactTypeToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_IMPACT_TYPE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } ;
            System.out.println("The Incident Impact Type Is Deleted Successfully");
        }

//        Incident - Section
        public void MasterenterIncidentSectionName(String SectionName) {
            utils.typeText(INCIDENT_SECTION_NAME, SectionName);
            System.out.println("The Entered Incident Section Name is : " + SectionName);
        }

        public void MasterselectRandomIncidentSectionType() {   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
            )).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[contains(@class,'rcbItem')]") ));
            int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
            System.out.println("Units Found : " + count);
            int randomIndex = new Random().nextInt(count) + 1;
            By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
            String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                    .getText();
            WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", element);
            System.out.println("Selected Incident Type is : " + selectedValue);
        }

        public void MasterenterIncidentSectionSortOrder(int Sort_Order) {
            utils.typeText(INCIDENT_SECTION_SORT_ORDER, String.valueOf(Sort_Order));
            System.out.println("The Entered Incident Section Sort Order is : " + Sort_Order);
        }

        public void MasterverifyIncidentSection(String SectionName) {
            utils.typeText(SEARCH_INCIDENT_SECTION, SectionName + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_section_Grid_ctl00__0'] td[title='%s']", SectionName));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The Entered Incident Section Name Is Verified Successfully");
        }

        public void MasterclickIncidentSectiontoEdit() {
            utils.click(FIRST_INCIDENT_SECTION_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void MasterupdateIncidentSection(String updateSection) {
            utils.clearAndType(INCIDENT_SECTION_NAME, updateSection);
            System.out.println("The Updated Incident Section Name is : " + updateSection);
        }

        public void MasterverifyUpdateIncidentSection(String UpdateSection) {
            utils.typeText(SEARCH_INCIDENT_SECTION, UpdateSection + Keys.ENTER);
            By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_section_Grid_ctl00__0'] td[title='%s']", UpdateSection));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            };
            System.out.println("The Updated Incident Section Is Verified Successfully");
        }

        public void MasterclickIncidentSectionToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_SECTION_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } ;
            System.out.println("The Incident Section Is Deleted Successfully");
        }

   //Field - Add Update and Delete
        public void MasterSelectIncidentFieldTypeRandom() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
            )).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[contains(@class,'rcbItem')]") ));
            int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
            System.out.println("Units Found : " + count);
            int randomIndex = new Random().nextInt(count) + 1;
            By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
            String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                    .getText();
            WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", element);
            System.out.println("Selected Incident Type on the Field page is : " + selectedValue);
            MasterIncidentFieldwaitForSectionLoading();   }

        public void MasterIncidentFieldwaitForSectionLoading() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By loading = By.id("LoadingPanelctl00_ContentPlaceHolder1_RadWinFeild_C_Sectiondropf");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loading));
        }

        public void MasterSelectIncidentFieldSectionRandom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        MasterIncidentFieldwaitForSectionLoading();
        By sectionArrow = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_Sectiondropf_Arrow");
        wait.until(ExpectedConditions.elementToBeClickable(sectionArrow)).click();
        By options = By.xpath("//div[contains(@id,'Sectiondropf_DropDown')]//li[@class='rcbItem']");
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(options, 0));
        List<WebElement> values = driver.findElements(options);
        System.out.println("Section Count : " + values.size());
        int randomIndex = new Random().nextInt(values.size());
        String selectedValue = values.get(randomIndex).getText().trim();
        System.out.println("Selecting Section : " + selectedValue);
        By option = By.xpath(
                    "//div[contains(@id,'Sectiondropf_DropDown')]//li[normalize-space()='"
                            + selectedValue + "']");
        wait.until(ExpectedConditions.elementToBeClickable(option));
        WebElement element = driver.findElement(option);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        System.out.println("Selected Section : " + selectedValue);
        }

   public void MasterSelectIncidentFieldDataTypeRandom() {
       MasterIncidentwaitForFieldNameGridLoading();  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.elementToBeClickable(
                           By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_DatatypeDrop_Arrow"))).click();
       By options = By.xpath("//div[contains(@id,'DatatypeDrop_DropDown')]//li[@class='rcbItem']");
       wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(options, 0));
       List<WebElement> values = driver.findElements(options);
       System.out.println("Data Type Count : " + values.size());
       int randomIndex = new Random().nextInt(values.size());
       String selectedValue = values.get(randomIndex).getText().trim();
       System.out.println("Selecting Data Type : " + selectedValue);
       WebElement option = driver.findElement(
                   By.xpath("//div[contains(@id,'DatatypeDrop_DropDown')]//li[normalize-space()='"
                           + selectedValue + "']"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);
      }

       public void MasterIncidententerFieldName (String Field){
       utils.typeText(INCIDENT_FIELD_NAME, Field);
       System.out.println("The Entered Incident Field Name is : " + Field);
       driver.findElement(INCIDENT_FIELD_NAME).sendKeys(Keys.TAB); }

       public void MasterIncidentwaitForFieldNameGridLoading() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       By loader = By.id("LoadingPanelctl00_ContentPlaceHolder1_RadWinFeild_C_grd_FieldName");
       wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
        }

       public void MasterenterIncidentFieldSortOrder ( int Sort_Order){
       utils.typeText(INCIDENT_FIELD_SORT_ORDER, String.valueOf(Sort_Order));
       System.out.println("The Entered Incident Field Sort Order is : " +Sort_Order);}

       public void MasterverifyIncidentFieldName(String FieldName){
       utils.typeText(SEARCH_INCIDENT_FIELD, FieldName + Keys.ENTER);
       By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_Feild_Grid_ctl00__0'] td[title='%s']", FieldName));
       utils.isElementVisible(locator);
       try {
          Thread.sleep(15000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
       System.out.println("The Entered Incident Field Name Is Verified Successfully");
       }

     public void MasterclickIncidentFieldtoEdit () {
       utils.click(FIRST_INCIDENT_FIELD_IN_LIST);
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
     }

      public void MasterupdateIncidentField (String updateField){
        utils.clearAndType(INCIDENT_FIELD_NAME, updateField);
        System.out.println("The Updated Incident Field Name is : " + updateField);
      }

      public void MasterverifyUpdateIncidentField (String UpdateField){
          utils.typeText(SEARCH_INCIDENT_FIELD, UpdateField + Keys.ENTER);
          By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_Feild_Grid_ctl00__0'] td[title='%s']", UpdateField));
          try {
              Thread.sleep(15000);
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
          }  ;
          System.out.println("The Updated Incident Field Name Is Verified Successfully");
      }

      public void MasterclickIncidentFieldToDelete () {
       utils.click(DELETE_FIRST_INCIDENT_FIELD_IN_LIST);
          Alert alert = driver.switchTo().alert();
          alert.accept();
          try {
              Thread.sleep(10000);
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
          };
          System.out.println("The Incident Field Is Deleted Successfully");
      }

//List of Values -Add Update and Delete

        public void MasterSelectIncidentLOVFieldTypeRandom () {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@class,'rcbArrowCell')]")
            )).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//li[contains(@class,'rcbItem')]") ));
            int count = driver.findElements(By.xpath("//li[contains(@class,'rcbItem')]")).size();
            System.out.println("Units Found : " + count);
            int randomIndex = new Random().nextInt(count) + 1;
            By randomValue = By.xpath("(//li[contains(@class,'rcbItem')])[" + randomIndex + "]");
            String selectedValue = wait.until( ExpectedConditions.visibilityOfElementLocated(randomValue))
                    .getText();
            WebElement element = wait.until( ExpectedConditions.presenceOfElementLocated(randomValue));
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", element);
            System.out.println("Selected Incident Field Type is : " + selectedValue);
        }

        public void MasterenterIncidentListofValue (String LOV){
            utils.typeText(INCIDENT_LIST_OF_VALUE, LOV);
            System.out.println("The Entered Incident LOV is : " + LOV);
        }

        public void MasterverifyIncidentListofValues(String List_of_Values){
            utils.typeText(SEARCH_INCIDENT_LIST_OF_VALUE, List_of_Values + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_LOV_Grid_ctl00__1'] td[title='%s']", List_of_Values));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("The Entered Incident LOV Is Verified Successfully");}

        public void MasterIncidentclickListofValuetoEdit () {
            utils.click(FIRST_INCIDENT_LIST_OF_VALUE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void MasterIncidentupdateListofValues(String UpdateList_of_Values){
            utils.clearAndType(INCIDENT_LIST_OF_VALUE, UpdateList_of_Values);
            System.out.println("The Updated Incident LOV is : " + UpdateList_of_Values);
        }

        public void MasterIncidentverifyUpdateListofValues(String UpdateList_of_Values){
            utils.typeText(SEARCH_INCIDENT_LIST_OF_VALUE, UpdateList_of_Values + Keys.ENTER);
            By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_LOV_Grid_ctl00__1'] td[title='%s']", UpdateList_of_Values));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }   ;
            System.out.println("The Updated Incident LOV Is Verified Successfully");}

        public void MasterIncidentclickListofvaluesToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_LIST_OF_VALUE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            };
            System.out.println("The Incident LOV Is Deleted Successfully");}

         //Export To Excel - Incident
        public void MasterIncidentManagementExporttoExcel() {
            utils.click(MASTER_INCIDENT_MANAGEMENT_EXPORT_TO_EXCEL_BUTTON);
            System.out.println("Downloaded file successfully");    }
        }
