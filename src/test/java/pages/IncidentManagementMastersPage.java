    package pages;

    import org.openqa.selenium.Alert;
    import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import org.openqa.selenium.support.ui.ExpectedConditions;

    import java.time.Duration;

    public class IncidentManagementMastersPage extends BasePage {
        public IncidentManagementMastersPage(WebDriver driver) {
            super(driver);
        }

        public static final By CLICK_HAMBURGER_ICON = By.xpath("//div[@class='toggle-sidebar']");
        public static final By Incident_Type_Code = By.id("rdtxtbx_shortname");
        public static final By Incident_Type = By.id("TxtType");
        public static final By Incident_Sub_Type_Code = By.id("rdtxtincidentsubtypecode");
        public static final By Incident_Sub_Type = By.id("rdtxtincidentsubtype");
        public static final By Incident_Type_Select = By.cssSelector("[value='Select Incident Type']");
        public static final By Severity = By.id("txtSeverityType");
        public static final By Affected_Group = By.id("txtAffectingType");
        public static final By Sort_Order = By.id("radtxtAffectSort");
        public static final By Caused_By = By.id("txtCausedType");
        public static final By Sort_Order_Caused_By = By.id("radtxtCausesSort");
        public static final By Impact_Type = By.id("txtImpactType");
        public static final By Impact_Type_Sort_Order = By.id("radtxtImpactSort");
        public static final By Section_Name = By.id("SectionBoxid");
        public static final By Section_Type_Select = By.cssSelector("[value='Select Type']");
        public static final By Section_Sort_Order = By.id("ctl00_ContentPlaceHolder1_RadWinsection_C_sortorderid");
        public static final By Field_Type_Select = By.id("ctl00_ContentPlaceHolder1_RadWinFeild_C_Typedropf_Input");
        public static final By Field_Section_Select = By.cssSelector("[value='Incident']");
        public static final By Field_Name = By.id("FieldsName");
        public static final By Field_Data_Type_Select = By.cssSelector("[value='String']");
        public static final By Field_Sort_Order = By.id("ctl00_ContentPlaceHolder1_ctl00_ContentPlaceHolder1_RadWinFeild_C_sortOderPanel");
        public static final By Field_Mandatory_Field = By.id("ctl00_ContentPlaceHolder1_ctl00_ContentPlaceHolder1_RadWinFeild_C_checkManfPanel");
        public static final By LOV_Field_Type_Select = By.id("ctl00_ContentPlaceHolder1_RadWinLOv_C_FielddropLOV_Input");
        public static final By List_of_Values = By.id("Valueid");
        public static final By SEARCH_INCIDENT_TYPE = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_INCIDENT_SUB_TYPE = By.cssSelector("[alt='Filter SubTypeName column']");
        public static final By SEARCH_INCIDENT_SEVERITY = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_AFFECTED_GROUP = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_CAUSED_BY = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_IMPACT_TYPE = By.cssSelector("[alt='Filter TypeName column']");
        public static final By SEARCH_SECTION = By.cssSelector("[alt='Filter SectionName column']");
        public static final By SEARCH_FIELD = By.cssSelector("[alt='Filter FieldName column']");
        public static final By SEARCH_LIST_OF_VALUES = By.cssSelector("[alt='Filter Value column']");
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
        public static final By FIRST_AFFECTED_GROUP_IN_LIST = By.id("ctl00_ContentPlaceHolder1_AffectingType_Grid_ctl00__0");
        public static final By FIRST_CAUSED_BY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_CausedType_Grid_ctl00__0");
        public static final By FIRST_IMPACT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_ImpactType_Grid_ctl00__0");
        public static final By FIRST_SECTION_IN_LIST = By.id("ctl00_ContentPlaceHolder1_section_Grid_ctl00__0");
        public static final By FIRST_FIELD_IN_LIST = By.id("ctl00_ContentPlaceHolder1_Feild_Grid_ctl00__0");
        public static final By FIRST_LIST_OF_VALUES_IN_LIST = By.id("ctl00_ContentPlaceHolder1_LOV_Grid_ctl00__0");
        //public static final By UPDATE_BUTTON_SUB_TYPE = By.id("ctl00_ContentPlaceHolder1_RadWinIncidentSubType_C_rdbtnSave");
        public static final By DELETE_FIRST_INCIDENT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_SUB_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_IncidentSubType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_INCIDENT_SEVERITY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_SeverityType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_AFFECTED_GROUP_IN_LIST = By.id("ctl00_ContentPlaceHolder1_AffectingType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_CAUSED_BY_IN_LIST = By.id("ctl00_ContentPlaceHolder1_CausedType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_IMPACT_TYPE_IN_LIST = By.id("ctl00_ContentPlaceHolder1_ImpactType_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_SECTION_IN_LIST = By.id("ctl00_ContentPlaceHolder1_section_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_FIELD_IN_LIST = By.id("ctl00_ContentPlaceHolder1_Feild_Grid_ctl00_ctl04_ImageButton1");
        public static final By DELETE_FIRST_LIST_OF_VALUES_IN_LIST = By.id("ctl00_ContentPlaceHolder1_LOV_Grid_ctl00_ctl04_ImageButton1");

        public void clickHamburgerIcon() {
            By[] hamburgerIcon = {CLICK_HAMBURGER_ICON};

            for (By icon : hamburgerIcon) {
                if (utils.isElementVisible(icon)) {
                    utils.click(icon);
                    return;
                }
            }
            throw new RuntimeException("No save button is present on the page.");
        }

        public void clickOnTabByTitle(String tabTitle) {
            try {
                By locator = By.xpath(String.format("//div[@id='tab-datasetup']//a[text()='%s']", tabTitle));
                utils.click(locator);
                System.out.println("Clicked on the tab: " + tabTitle);
            } catch (Exception e) {
                System.out.println("Failed to click on the tab: " + tabTitle);
                throw e;
            }
        }

        public void enterIncident_Type_Code(String code) {
            utils.typeText(Incident_Type_Code, code);
        }

        public void enterIncident_Type(String name) {
            utils.typeText(Incident_Type, name);
        }

        public void updateIncident_Type_Code(String updateCode) {
            utils.typeText(Incident_Type_Code, updateCode);
        }

        public void updateIncident_Type(String updateType) {
            utils.typeText(Incident_Type, updateType);
        }

        public void clickIncidentSaveButton() {
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

        public void verifyIncidentType(String type) {
            utils.typeText(SEARCH_INCIDENT_TYPE, type + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00__0'] td[title='%s']", type));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
        }

        public void clickIncidentTypetoEdit() {
            utils.click(FIRST_INCIDENT_TYPE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
        }

        public void verifyUpdateIncidentType(String incidentType) {
            utils.typeText(SEARCH_INCIDENT_TYPE, incidentType + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00__0'] td[title='%s']", incidentType));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
            ;
        }

        public void clickIncidentTypeToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_TYPE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
            ;
        }

        public void clickOnTabByTitleName(String tabName) {

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

        public void enterIncident_Sub_Type_Code(String code) {
            utils.typeText(Incident_Sub_Type_Code, code);
        }

        public void enterIncident_Sub_Type(String name) {
            utils.typeText(Incident_Sub_Type, name);
        }

        public void selectIncidentType(String IncidentType) {
            try {
                utils.click(Incident_Type_Select);
                By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", IncidentType));
                utils.click(locator);
                System.out.println("Clicked on the tab: " + IncidentType);
            } catch (Exception e) {
                System.out.println("Failed to click on the tab: " + IncidentType);
                throw e;
            }
        }

        public void verifyIncidentSubType(String subtype) {
            utils.typeText(SEARCH_INCIDENT_SUB_TYPE, subtype + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentSubType_Grid_ctl00_ctl02_ctl02_FilterTextBox_SubTypeName'] td[title='%s']", subtype));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void clickIncidentSubTypetoEdit() {
            utils.click(FIRST_INCIDENT_SUB_TYPE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void updateIncident_Sub_Type_Code(String updateSubTypeCode) {
            utils.clearAndType(Incident_Sub_Type_Code, updateSubTypeCode);
        }

        public void updateIncident_Sub_Type(String updateSubType) {
            utils.clearAndType(Incident_Sub_Type, updateSubType);
        }

        public void verifyUpdateIncidentSubType(String incidentSubType) {
            utils.typeText(SEARCH_INCIDENT_SUB_TYPE, incidentSubType + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentType_Grid_ctl00__0'] td[title='%s']", incidentSubType));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            ;
        }

        public void clickIncidentSubTypeToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_SUB_TYPE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            ;
        }

        public void enterIncident_Severity(String severity) {
            utils.typeText(Severity, severity);
        }

        public void verifyIncidentSeverity(String severity) {
            utils.typeText(SEARCH_INCIDENT_SEVERITY, severity + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_IncidentSubType_Grid_ctl00_ctl02_ctl02_FilterTextBox_SubTypeName'] td[title='%s']", severity));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void clickIncidentSeveritytoEdit() {
            utils.click(FIRST_INCIDENT_SEVERITY_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void updateIncident_Severity(String updateSeverity) {
            utils.clearAndType(Severity, updateSeverity);
        }

        public void verifyUpdateIncidentSeverity(String updateSeverity) {
            utils.typeText(SEARCH_INCIDENT_SEVERITY, updateSeverity + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_SeverityType_Grid_ctl00_ctl02_ctl02_FilterTextBox_TypeName'] td[title='%s']", updateSeverity));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            ;
        }

        public void clickIncidentSeverityToDelete() {
            utils.click(DELETE_FIRST_INCIDENT_SEVERITY_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            ;
        }

        public void enterAffected_Group(String AffectedGroup) {
            utils.typeText(Affected_Group, AffectedGroup);
        }

        public void verifyAffected_Group(String AffectedGroup) {
            utils.typeText(SEARCH_AFFECTED_GROUP, AffectedGroup + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_AffectingType_Grid_ctl00__0'] td[title='%s']", Affected_Group));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void clickAffected_GrouptoEdit() {
            utils.click(FIRST_AFFECTED_GROUP_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void updateAffected_Group(String updateAffectedGroup) {
            utils.clearAndType(Affected_Group, updateAffectedGroup);
        }

        public void verifyUpdateAffected_Group(String AffectedGroupName) {
            utils.typeText(SEARCH_AFFECTED_GROUP, AffectedGroupName + Keys.ENTER);
            By locator = By.cssSelector(String.format("['id='ctl00_ContentPlaceHolder1_AffectingType_Grid_ctl00__0'] td[title='%s']", AffectedGroupName));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
            ;
        }

        public void clickAffected_GroupToDelete() {
            utils.click(DELETE_FIRST_AFFECTED_GROUP_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            ;
        }

        public void enterCaused_By(String CausedBy) {
            utils.typeText(Caused_By, CausedBy);
        }

        public void verifyCaused_By(String CausedBy) {
            utils.typeText(SEARCH_CAUSED_BY, CausedBy + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_CausedType_Grid_ctl00__0'] td[title='%s']", CausedBy));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void clickCaused_BytoEdit() {
            utils.click(FIRST_CAUSED_BY_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void updateCaused_By(String updateCausedBy) {
            utils.clearAndType(Caused_By, updateCausedBy);
        }

        public void verifyUpdateCaused_By(String UpdateCausedBy) {
            utils.typeText(SEARCH_CAUSED_BY, UpdateCausedBy + Keys.ENTER);
            By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_CausedType_Grid_ctl00__0'] td[title='%s']", UpdateCausedBy));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
            ;
        }

        public void clickCaused_ByToDelete() {
            utils.click(DELETE_FIRST_CAUSED_BY_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            ;
        }

        public void enterImpact_Type(String ImpactType) {
            utils.typeText(Impact_Type, ImpactType);
        }

        public void enterImpact_Type_SortOrder(int ImpactType_Sort_Order) {
            utils.typeText(Impact_Type_Sort_Order, String.valueOf(ImpactType_Sort_Order));
        }

        public void verifyImpact_Type(String ImpactType) {
            utils.typeText(SEARCH_IMPACT_TYPE, ImpactType + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_ImpactType_Grid_ctl00__0'] td[title='%s']", ImpactType));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void clickImpact_TypetoEdit() {
            utils.click(FIRST_IMPACT_TYPE_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void updateImpact_Type(String updateImpactType) {
            utils.clearAndType(Impact_Type, updateImpactType);
        }

        public void verifyUpdateImpact_Type(String UpdateImpactType) {
            utils.typeText(SEARCH_IMPACT_TYPE, UpdateImpactType + Keys.ENTER);
            By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_ImpactType_Grid_ctl00__0'] td[title='%s']", UpdateImpactType));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            }
            ;
        }

        public void clickImpact_TypeToDelete() {
            utils.click(DELETE_FIRST_IMPACT_TYPE_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            ;
        }

        public void enterSection_Name(String SectionName) {
            utils.typeText(Section_Name, SectionName);
        }

        public void enterSection_SortOrder(int Sort_Order) {
            utils.typeText(Section_Sort_Order, String.valueOf(Sort_Order));
        }


        public void selectSectionType(String SectionType) {
            try {
                utils.click(Section_Type_Select);
                By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", SectionType));
                utils.click(locator);
                System.out.println("Clicked on the tab: " + SectionType);
            } catch (Exception e) {
                System.out.println("Failed to click on the tab: " + SectionType);
                throw e;
            }
        }

        public void verifySection(String SectionName) {
            utils.typeText(SEARCH_SECTION, SectionName + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_section_Grid_ctl00__0'] td[title='%s']", SectionName));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void clickSectiontoEdit() {
            utils.click(FIRST_SECTION_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void updateSection(String updateSection) {
            utils.clearAndType(Section_Name, updateSection);
        }

        public void verifyUpdateSection(String UpdateSection) {
            utils.typeText(SEARCH_SECTION, UpdateSection + Keys.ENTER);
            By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_section_Grid_ctl00__0'] td[title='%s']", UpdateSection));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // best practice
            };
        }

        public void clickSectionToDelete() {
            utils.click(DELETE_FIRST_SECTION_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } ;
        }

   //Field -Add Update and Delete
    public void selectFieldType(String FieldType) {
    try {
         utils.click(Field_Type_Select);
        By locator = By.xpath(String.format("//div[contains(@id,'Typedrop_DropDown')]//li[contains(@class,'rcbItem')]//span[normalize-space()='%s']",FieldType));
        utils.click(locator);
        System.out.println("Clicked on the tab: " + FieldType);
    }
    catch (Exception e) {
        System.out.println("Failed to click on the tab: " + FieldType);
        throw e;
    }
}
            public void selectSection (String Field_SectionType) {
                try {
                    utils.click(Field_Section_Select);
                    By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Field_SectionType));
                    utils.click(locator);
                    System.out.println("Clicked on the tab: " + Field_SectionType);
                } catch (Exception e) {
                    System.out.println("Failed to click on the tab: " + Field_SectionType);
                    throw e;
                }
            }

            public void enterField_Name (String Field){
                    utils.typeText(Field_Name, Field);
                }

           public void selectDataType (String Field_DataType) {
            try {
                utils.click(Field_Data_Type_Select);
                By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", Field_DataType));
                utils.click(locator);
                System.out.println("Clicked on the tab: " + Field_DataType);
            } catch (Exception e) {
                System.out.println("Failed to click on the tab: " + Field_DataType);
                throw e;
            }
        }

        public void enterField_SortOrder ( int Sort_Order){
                    utils.typeText(Field_Sort_Order, String.valueOf(Sort_Order));
                }

                public void verifyFieldName(String FieldName){
                        utils.typeText(SEARCH_FIELD, FieldName + Keys.ENTER);
                        By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_Feild_Grid_ctl00__0'] td[title='%s']", FieldName));
                        utils.isElementVisible(locator);
                        try {
                            Thread.sleep(15000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }

                    public void clickFieldtoEdit () {
                        utils.click(FIRST_FIELD_IN_LIST);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }

                    public void updateField (String updateField){
                        utils.clearAndType(Field_Name, updateField);
                    }

                    public void verifyUpdateField (String UpdateField){
                        utils.typeText(SEARCH_FIELD, UpdateField + Keys.ENTER);
                        By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_Feild_Grid_ctl00__0'] td[title='%s']", UpdateField));
                        try {
                            Thread.sleep(15000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }  ;
                    }

                    public void clickFieldToDelete () {
                        utils.click(DELETE_FIRST_FIELD_IN_LIST);
                        Alert alert = driver.switchTo().alert();
                        alert.accept();
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        };
                    }
//List of Values -Add Update and Delete

public void selectLOVFieldType(String LOVFieldType) {
    try {
        utils.click(LOV_Field_Type_Select);
        By locator = By.xpath(String.format("//li[@class='rcbItem' and contains(text(), '%s')]", LOVFieldType));
        utils.click(locator);
        System.out.println("Clicked on the tab: " + LOVFieldType);
    } catch (Exception e) {
        System.out.println("Failed to click on the tab: " + LOVFieldType);
        throw e;
    }
}
        public void enterList_of_Values (String LOV){
            utils.typeText(List_of_Values, LOV);
        }

        public void verifyList_of_Values(String List_of_Values){
            utils.typeText(SEARCH_LIST_OF_VALUES, List_of_Values + Keys.ENTER);
            By locator = By.cssSelector(String.format("[id='ctl00_ContentPlaceHolder1_LOV_Grid_ctl00__1'] td[title='%s']", List_of_Values));
            utils.isElementVisible(locator);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        public void clickList_of_ValuestoEdit () {
            utils.click(FIRST_LIST_OF_VALUES_IN_LIST);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        public void updateList_of_Values (String UpdateList_of_Values){
            utils.clearAndType(List_of_Values, UpdateList_of_Values);
        }

        public void verifyUpdateList_of_Values (String UpdateList_of_Values){
            utils.typeText(SEARCH_LIST_OF_VALUES, UpdateList_of_Values + Keys.ENTER);
            By locator = By.cssSelector(String.format("['ctl00_ContentPlaceHolder1_LOV_Grid_ctl00__1'] td[title='%s']", UpdateList_of_Values));
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }   ;
        }

        public void clickList_of_valuesToDelete () {
            utils.click(DELETE_FIRST_LIST_OF_VALUES_IN_LIST);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            };
        }    }
