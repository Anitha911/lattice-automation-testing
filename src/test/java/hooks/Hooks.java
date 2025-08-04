package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import utils.ScreenshotUtil;

import java.io.IOException;


public class Hooks {
    private final WebDriver driver = DriverFactory.getDriver();

    @Before
    public void setUp(Scenario scenario) {
        DriverFactory.initializeDriver();
    }

    @AfterStep
    public void afterStep(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", "screenshot");

            String fileName = "failurescreenshot_" + System.currentTimeMillis() + ".png";
            String path = ScreenshotUtil.captureScreenshot(DriverFactory.getDriver(), fileName);

            scenario.attach("<a href='"+path+"' target='_blank'>"+fileName+"</a>","image/url","screenshot");
            scenario.attach(screenshotBytes, "image/png", "screenshot");
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        DriverFactory.quitDriver();
    }
}
