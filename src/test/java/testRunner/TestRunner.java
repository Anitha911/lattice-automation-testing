package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "hooks"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:test-output/html/cucumber-report.json",
                "pretty"
        },
        monochrome = true,
        tags = "@api",
        dryRun = false
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
}
