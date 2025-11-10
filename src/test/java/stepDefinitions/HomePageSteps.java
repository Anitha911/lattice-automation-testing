package stepDefinitions;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverFactory;

public class HomePageSteps {
    private final WebDriver driver = DriverFactory.getDriver();
    HomePage hp = new HomePage(driver);

    @Then("User clicks on {string} in navigation panel")
    public void user_click_on_navigation_item(String title) throws InterruptedException {
        hp.clickOnNavigatorItem(title);
    }

    @Then("User clicks on {string} in sidebar menu")
    public void user_clicks_on_sidebar_menu_item(String sidebarItem) {
        hp.clickOnSidebarItems(sidebarItem);
    }
}
