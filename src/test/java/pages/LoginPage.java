package pages;

import org.openqa.selenium.*;
import utils.ConfigReader;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final By USERNAME_INPUT = By.id("LoginUser_UserName");
    public static final By PASSWORD_INPUT = By.id("LoginUser_Password");
    public static final By LOGIN_BUTTON = By.id("LoginUser_LoginButton");
    private static final String HOME_PAGE_TITLE = "Reflexion CAFM Suite - Home - Main Menu - Navigator";

    public void login(String un, String pw) throws InterruptedException {
        utils.typeText(USERNAME_INPUT, ConfigReader.getProperty(un));
        utils.typeText(PASSWORD_INPUT, ConfigReader.getProperty(pw));
        utils.click(LOGIN_BUTTON);
        utils.verifyPageTitleIs(HOME_PAGE_TITLE);
    }
}