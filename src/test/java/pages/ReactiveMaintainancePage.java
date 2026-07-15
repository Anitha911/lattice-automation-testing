package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementUtils;
import utils.HelperUtils;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import static utils.JavaScriptExeUtil.jsClick;

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

//    public static final By RMDETAIL_SERVICEGROUP_DD = By.cssSelector("[value='Select Service Group']");
//    public static final By RMDETAIL_FAULTCATEGORY_DD = By.cssSelector("[value='Select Fault Category']");
//    public static final By RMDETAIL_FAULTCODE_DD = By.cssSelector("[value='Select Fault Code']");
//    public static final By RMDETAIL_PRIORITY_DD = By.cssSelector("[value='Select Priority']")
//    ;
    public static final By RMDETAIL_SERVICEGROUP_DD = By.id("ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_ddlServiceGroup_Input");
    public static final By RMDETAIL_FAULTCATEGORY_DD = By.id("ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_ddlFaultCategory_Input");
    public static final By RMDETAIL_FAULTCODE_DD = By.id("ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_ddlFaultCode_Input");
    public static final By RMDETAIL_PRIORITY_DD = By.id("ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_ddlPriority_Input");

    public static final By ALL_OPTIONS_RMDETAIL_FAULTCATEGORY_SG = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_ddlServiceGroup_DropDown']/div/ul/li");;
    public static final By ALL_OPTIONS_RMDETAIL_FAULTCATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_ddlFaultCategory_DropDown']/div/ul/li");;
    public static final By ALL_OPTIONS_RMDETAIL_FAULTCODE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_ddlFaultCode_DropDown']/div/ul/li");;
    public static final By ALL_OPTIONS_RMDETAIL_PRIORITY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_ddlPriority_DropDown']/div/ul/li");;
    public static final By SAVE_BUTTON_RMMODIFYFAULTCODE = By.id("ctl00_ContentPlaceHolder1_radwinModifyFaultCode_C_btn_SaveModifyFaultCode");
    public static final By MARK_DUPLICATE_BUTTON = By.id("ctl00_ContentPlaceHolder1_RadWinMarkDuplicateWO_C_btnMarkDuplicate");
    public static final By RMDETAIL_CHILDWO_DESC = By.id("Rad_txt_workdesc");

    //Child WO
    public static final By ALL_OPTIONS_RMDETAIL_CHILDWO_SG = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_Rad_drpdwn_ServiceGroup_DropDown']/div/ul/li");;
    public static final By ALL_OPTIONS_RMDETAIL_CHILDWO_FAULTCATEGORY = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_Rad_drpdwn_faultcategory_DropDown']/div/ul/li");;
    public static final By ALL_OPTIONS_RMDETAIL_CHILDWO_FAULTCODE = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_Rad_drpdwn_faultcode_DropDown']/div/ul/li");;
    public static final By RMDETAIL_CHILDWO_SERVICEGROUP_DD = By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_Rad_drpdwn_ServiceGroup_Input");
    public static final By RMDETAIL_CHILDWO_FAULTCATEGORY_DD = By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_Rad_drpdwn_faultcategory_Input");
    public static final By RMDETAIL_CHILDWO_FAULTCODE_DD = By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_Rad_drpdwn_faultcode_Input");
    public static final By ALL_OPTIONS_RMDETAIL_CHILDWO_TECHNICIAN = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_rad_drpdwn_Technician_DropDown']/div/ul/li");;
    public static final By RMDETAIL_CHILDWO_TECHNICIAN_DD = By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_rad_drpdwn_Technician_Input");
    public static final By RMDETAIL_CHILDWO_BUTTON = By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_RadSave");
    public static final By RMDETAIL_CHILDWO_STARTTIME = By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_rad_timepicker_StartTime_dateInput");
    public static final By RMDETAIL_CHILDWO_ENDTIME = By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_rad_timepicker_EndTime_dateInput");
    public static final By RMDETAIL_CHILDWO_ENDDATE = By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_RadEndDatePicker_dateInput");

    //Cancel WO
    public static final By RMDETAIL_CANCELWO_REMARKS = By.id("txtCancelRemark");
    public static final By RMDETAIL_CANCELWO_REASON_DD = By.id("ctl00_ContentPlaceHolder1_radwinCancelWO_C_RadComboCancelReason_Input");
    public static final By ALL_OPTIONS_RMDETAIL_CANCELWO_REASON = By.xpath("//div[@id='ctl00_ContentPlaceHolder1_radwinCancelWO_C_RadComboCancelReason_DropDown']/div/ul/li");;
    public static final By RMDETAIL_CANCELWO_BUTTON = By.id("ctl00_ContentPlaceHolder1_radwinCancelWO_C_radbtnCancelWOSave");

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
        By[] saveButtons = {SUBMITREQUEST,MARK_DUPLICATE_BUTTON,RMDETAIL_CHILDWO_BUTTON};

        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                utils.click(button);
                List<WebElement> buttons = driver.findElements(button
                        //By.xpath("//*[@id='ctl00_ContentPlaceHolder1_btnSave' or @id='ctl00_ContentPlaceHolder1_RadWinDuplicateWOWarning_C_btnIngoreCreate']")
                );
//                if (!buttons.isEmpty()) {
//                    buttons.get(0).click();
//                }
                //return;
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
    //WO Status Check Not Despatched to Assigned
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
        List<WebElement> statusList = driver.findElements(
                By.xpath("//*[@id='ContentPlaceHolder1_dvRMWOSummary']/div/div[1]/div/span/span")
        );
        for (WebElement statusElement : statusList) {
            String status = statusElement.getText().trim();
            if ("Not Dispatched".equals(status)) {
                WebElement okButton = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.id("ctl00_ContentPlaceHolder1_btnPendingAssign"))
                );
                okButton.click();
                //utils.click(ASSIGN_RMDETAIL);
                //if technician is present in the Technician Grid Start
                WebElement row = driver.findElement(
                        By.xpath("//tr[@id='ctl00_ContentPlaceHolder1_radwinPendingAsignModel_C_Grd_techAssignlist_ctl00__0']")
                );
                WebElement firstValueCell = row.findElement(By.xpath("./td[2]"));
                String firstValue = firstValueCell.getText().trim();
                if (!firstValue.isEmpty()) {
                    WebElement checkbox = driver.findElement(
                            By.id("ctl00_ContentPlaceHolder1_radwinPendingAsignModel_C_Grd_techAssignlist_ctl00_ctl04_SelectedAssignIDSelectCheckBox")
                    );
                    checkbox.click();
                    //if agreed beyond SLA dropdown is enabled start
                    WebElement dropdown = driver.findElement(
                            By.id("ctl00_ContentPlaceHolder1_radwinPendingAsignModel_C_raddrpReason_Input")
                    );
                    if (dropdown.isEnabled()) {
                        dropdown.click();
                        dropdown.sendKeys("Due to Customer Request");
                        dropdown.sendKeys(Keys.ENTER);
                    } else {
                        System.out.println("Agreed Beyond SLA Dropdown is disabled.");
                    }
                    //if agreed beyond SLA dropdown is enabled End
                    //Click Assign Button Start
                    WebElement btn = wait.until(
                            ExpectedConditions.elementToBeClickable(
                                    By.id("ctl00_ContentPlaceHolder1_radwinPendingAsignModel_C_btnAssignWO_Ok")));
                    btn.click();
                    //Click Assign button End
                } else {
                    System.out.println("No Technician present in RMNewRequest Detail Page: ");
                }
                //if technician is present in the Technician Grid End
            }
            //Not Despatched Status End
            //Appointment Booked to Site Attended Starts
            if ("Appointment Booked".equals(status)) {
                WebElement ChangeStatusButton = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.id("ctl00_ContentPlaceHolder1_hlkChangeStatus"))
                );
                ChangeStatusButton.click();
                //
                WebElement statusDropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_ddlNewStatus_Input")));
                statusDropdown.click();
                statusDropdown.sendKeys("Site Attended");

                WebElement option = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.xpath("//li[contains(text(),'Site Attended')]")));
                option.click();
                WebElement remarks = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_txtStatusRemarks"))
                );
                WebElement saveButton = wait.until(
                        ExpectedConditions.presenceOfElementLocated(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_lnkSaveBtn"))
                );

                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].click();", saveButton);
            }
            //Appointment Booked to Site Attended Ends

            //Site Attended to Work Started
            if ("Site Attended".equals(status)) {
                WebElement ChangeStatusButton = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.id("ctl00_ContentPlaceHolder1_hlkChangeStatus"))
                );
                ChangeStatusButton.click();
                WebElement statusDropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_ddlNewStatus_Input")));
                statusDropdown.click();
                statusDropdown.sendKeys("Work Started");

                WebElement option = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.xpath("//li[contains(text(),'Work Started')]")));
                option.click();
                WebElement remarks = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_txtStatusRemarks"))
                );
                WebElement saveButton = wait.until(
                        ExpectedConditions.presenceOfElementLocated(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_lnkSaveBtn"))
                );

                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].click();", saveButton);
            }
            //Site Attended to Work Started Ends
            //Work Started to Completed Start
            if ("Work Started".equals(status)) {
                WebElement ChangeStatusButton = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.id("ctl00_ContentPlaceHolder1_hlkChangeStatus"))
                );
                ChangeStatusButton.click();
                WebElement statusDropdown = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_ddlNewStatus_Input")));
                statusDropdown.click();
                statusDropdown.sendKeys("Completed");

                WebElement option = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.xpath("//li[contains(text(),'Completed')]")));
                option.click();
                WebElement remarks = wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_txtStatusRemarks"))
                );
                WebElement saveButton = wait.until(
                        ExpectedConditions.presenceOfElementLocated(
                                By.id("ctl00_ContentPlaceHolder1_RadWinStatusChange_C_lnkSaveBtn"))
                );

                ((JavascriptExecutor) driver).executeScript(
                        "arguments[0].click();", saveButton);
            }
            //Work Started to Completed End
        }
    }
    //WO status Check
    //Modify Fault Code start
    public void RMRequestDetailModifyFC(String RMRequestDetailModifyFC) throws InterruptedException {
        try {
            String parentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            List<WebElement> elements = driver.findElements(By.id("hlkEdit"));
            if (!elements.isEmpty()) {
                WebElement element = elements.get(0);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                if (element.isDisplayed() && element.isEnabled()) {
                    element.click();
                }
            }
            System.out.println("Clicked on RMRequestDetailModifyFC: " + RMRequestDetailModifyFC);
        } catch (Exception e) {
            System.out.println("Failed to click on RMRequestDetailModifyFC: " + RMRequestDetailModifyFC);
            throw e;
        }
    }
    //RM Detail SG DropDown
    public void getRandomRMDetailSG_Dropdown(){
        try{
            utils.click(RMDETAIL_SERVICEGROUP_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_FAULTCATEGORY_SG);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_FAULTCATEGORY_SG);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail SG" );
            throw e;
        }
    }
    //RM Detail Fault Category DropDown
    public void getRandomRMDetailFaultCategory_Dropdown(){
        try{
            utils.click(RMDETAIL_FAULTCATEGORY_DD);
            //ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_FAULTCATEGORY);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_FAULTCATEGORY);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail SG" );
            throw e;
        }
    }
    //RM Detail Fault Code DropDown
    public void getRandomRMDetailFaultCode_Dropdown(){
        try{
            utils.click(RMDETAIL_FAULTCODE_DD);
           // ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_FAULTCODE);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_FAULTCODE);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail SG" );
            throw e;
        }
    }
    //RM Detail Priority DropDown
    public void getRandomRMDetailPriority_Dropdown(){
        try{
            utils.click(RMDETAIL_PRIORITY_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_PRIORITY);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_PRIORITY);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail SG" );
            throw e;
        }
    }
    //Save Button Common function in RM Transaction
    public void userClicksRMTransactionSaveButton() {
        By[] saveButtons = {SAVE_BUTTON_RMMODIFYFAULTCODE};
        for (By button : saveButtons) {
            if (utils.isElementVisible(button)) {
                WebElement element = driver.findElement(button);
                jsClick(driver, element);
                utils.waitUntilInvisible(button);
                ElementUtils.waitForLoaderToDisappear();
                return;
            }
        }
        throw new RuntimeException("No save button is present on the page.");
    }
    //Mark As Duplicate start
    public void RMRequestDetailMarkADuplicate(String RMRequestDetailMarkAsDuplicate) throws InterruptedException {
        try {
            String parentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            List<WebElement> elements = driver.findElements(By.id("ctl00_ContentPlaceHolder1_btnMarkDuplicateWO"));
            if (!elements.isEmpty()) {
                WebElement element = elements.get(0);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                if (element.isDisplayed() && element.isEnabled()) {
                    element.click();
                }
            }
            System.out.println("Clicked on RMRequestDetailMarkAsDuplicate: " + RMRequestDetailMarkAsDuplicate);
        } catch (Exception e) {
            System.out.println("Failed to click on RMRequestDetailMarkAsDuplicate: " + RMRequestDetailMarkAsDuplicate);
            throw e;
        }
    }
    public void RMRequestDetailMarkADuplicateSelectPrimaryWO(String RMRequestDetailMarkADuplicateSelectPrimaryWO) throws InterruptedException {
        try {
            List<WebElement> elements = driver.findElements(By.id("ctl00_ContentPlaceHolder1_RadWinMarkDuplicateWO_C_SelectDuplicateWO_Grid_ctl00_ctl04_WOSelectColumn1234SelectCheckBox"));
            if (!elements.isEmpty()) {
                WebElement element = elements.get(0);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                if (element.isDisplayed() && element.isEnabled()) {
                    element.click();
                }
            }
            System.out.println("Clicked on RMRequestDetailMarkADuplicateSelectPrimaryWO: " + RMRequestDetailMarkADuplicateSelectPrimaryWO);
        } catch (Exception e) {
            System.out.println("Failed to click on RMRequestDetailMarkADuplicateSelectPrimaryWO: " + RMRequestDetailMarkADuplicateSelectPrimaryWO);
            throw e;
        }
    }
    //Child WO
    public void RMRequestDetailAddChildWO(String RMRequestDetailAddChildWO) throws InterruptedException {
        try {
            String parentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            List<WebElement> elements = driver.findElements(By.id("muchildworkorder"));
            if (!elements.isEmpty()) {
                WebElement element = elements.get(0);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                if (element.isDisplayed() && element.isEnabled()) {
                    element.click();

                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    WebElement button = wait.until(
                            ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_ChildWoUtilized_btnMaterialRequest"))
                    );
                    button.click();
                }
            }
            System.out.println("Clicked on RMRequestDetailAddChildWO: " + RMRequestDetailAddChildWO);
        } catch (Exception e) {
            System.out.println("Failed to click on RMRequestDetailAddChildWO: " + RMRequestDetailAddChildWO);
            throw e;
        }
    }
    public void RMRequestDetailChildWODetail(String RMRequestDetailChildWODetail) {
        utils.typeText(RMDETAIL_CHILDWO_DESC, RMRequestDetailChildWODetail);//Work Desc
        //String workDate = "15/07/2026";
        //utils.typeText(RMDETAIL_CHILDWO_ENDDATE, workDate);
        //String StartTime = "10.00AM";
        //utils.typeText(RMDETAIL_CHILDWO_STARTTIME, StartTime);
        //String EndTime = "11.00AM";
        //utils.typeText(RMDETAIL_CHILDWO_ENDTIME, EndTime);
        //
        WebElement calendarBtn = driver.findElement(By.id(
                "ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_rad_datepicker_Date_popupButton"));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});", calendarBtn);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(calendarBtn));
        calendarBtn.click();
        WebElement day = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//table[contains(@class,'rcMainTable')]//a[text()='15']")));
        day.click();
        WebElement dateInput = driver.findElement(By.id(
                "ctl00_ContentPlaceHolder1_ChildWoUtilized_radwinChildWorkorder_C_ChildWorkorderAdd_rad_datepicker_Date_dateInput"));
        String dateValue = dateInput.getAttribute("value");
        utils.typeText(RMDETAIL_CHILDWO_ENDDATE, dateValue);
    }
    public void getRandomRMDetailChildWOSG_Dropdown(){
        try{
            utils.click(RMDETAIL_CHILDWO_SERVICEGROUP_DD);
            //ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_CHILDWO_SG);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_CHILDWO_SG);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail Child WO SG" );
            throw e;
        }
    }
    public void getRandomRMDetailChildWOFaultCategory_Dropdown(){
        try{
            utils.click(RMDETAIL_CHILDWO_FAULTCATEGORY_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_CHILDWO_FAULTCATEGORY);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_CHILDWO_FAULTCATEGORY);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail Child WO Fault Category" );
            throw e;
        }
    }
    public void getRandomRMDetailChildWOFaultCode_Dropdown(){
        try{
            utils.click(RMDETAIL_CHILDWO_FAULTCODE_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_CHILDWO_FAULTCODE);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_CHILDWO_FAULTCODE);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail Child WO Fault Code" );
            throw e;
        }
    }
    public void getRandomRMDetailChildWOTechnician_Dropdown(){
        try{
            utils.click(RMDETAIL_CHILDWO_TECHNICIAN_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_CHILDWO_TECHNICIAN);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_CHILDWO_TECHNICIAN);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail Child WO Fault Category" );
            throw e;
        }
    }
    //Cancel WO in WO Detail Page
    public void RMRequestDetailCancelWO(String RMRequestDetailCancelWO) throws InterruptedException {
        try {
            String parentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            WebElement cancelButton = driver.findElement(
                    By.id("ctl00_ContentPlaceHolder1_btnCancelWO")
            );

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", cancelButton);
            System.out.println("Clicked on RMRequestDetailCancelWO: " + RMRequestDetailCancelWO);
        } catch (Exception e) {
            System.out.println("Failed to click on RMRequestDetailCancelWO: " + RMRequestDetailCancelWO);
            throw e;
        }
    }
    public void RMRequestDetailCancelWODetail(String RMRequestDetailCancelWODetail) {
        utils.typeText(RMDETAIL_CANCELWO_REMARKS, RMRequestDetailCancelWODetail);//Cancel WO Remarks
    }
    public void getRandomRMDetailCancelWOReason_Dropdown(){
        try{
            utils.click(RMDETAIL_CANCELWO_REASON_DD);
            ElementUtils.waitForDropdownLoading();
            utils.waitForVisibility(ALL_OPTIONS_RMDETAIL_CANCELWO_REASON);
            HelperUtils.clickRandomElement(ALL_OPTIONS_RMDETAIL_CANCELWO_REASON);
        } catch (Exception e) {
            System.out.println("Failed to click on the dropdown: RM Detail CancelWOReason" );
            throw e;
        }
    }
    public void RMRequestDetailSaveCancelWO(String RMRequestDetailSaveCancelWO) throws InterruptedException {
        try {
            String parentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            WebElement cancelButton = driver.findElement(RMDETAIL_CANCELWO_BUTTON);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", cancelButton);
            System.out.println("Clicked on RMRequestDetailSaveCancelWO: " + RMRequestDetailSaveCancelWO);
        } catch (Exception e) {
            System.out.println("Failed to click on RMRequestDetailSaveCancelWO: " + RMRequestDetailSaveCancelWO);
            throw e;
        }
    }
    //WO Material Request
    public void RMRequestDetailMR(String RMRequestDetailMR) throws InterruptedException {
        try {
            String parentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            List<WebElement> elements = driver.findElements(By.id("murequest"));
            if (!elements.isEmpty()) {
                WebElement element = elements.get(0);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                if (element.isDisplayed() && element.isEnabled()) {
                    element.click();
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    WebElement button = wait.until(
                            ExpectedConditions.elementToBeClickable(By.id("ctl00_ContentPlaceHolder1_MaterialRequest_btnMaterialRequest"))
                    );
                    button.click();
                }
            }
            System.out.println("Clicked on RMRequestDetailMR: " + RMRequestDetailMR);
        } catch (Exception e) {
            System.out.println("Failed to click on RMRequestDetailMR: " + RMRequestDetailMR);
            throw e;
        }
    }
}
