package testRunner;

import io.cucumber.core.cli.Main;
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
        tags = "@AuditCategorySetup and @Create",
        dryRun = false
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
//    @Test(invocationCount = 7)
//    public void runTestMultipleTimes() {
//        Main.run(new String[]{"--tags", "@AuditMasterCategory and @Delete"});
//    }
}
