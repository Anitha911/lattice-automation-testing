package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.logging.Logger;

public class Actionutils {

    private WebDriver driver;
    private final Actions actions;
    private static final Logger LOGGER = Logger.getLogger(Actionutils.class.getName());

    public Actionutils(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver, Duration.ofMillis(10000));
    }

    public void performClick(WebElement element){
        LOGGER.info("[ACTIONS CLASS] ATTEMPTING TO CLICK ELEMENT: "+ element);
        actions.moveToElement(element).pause(1000).click().pause(300).perform();
    }

    public void performHover(WebElement element){

        actions.moveToElement(element).perform();
    }
}
