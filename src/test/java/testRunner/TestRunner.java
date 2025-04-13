package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/Login.feature",            // Correct path to .feature files
        glue = "stepDefinations",                       // Folder containing step defenations
        plugin = {
                "pretty",                                    // Console output
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",  // Main plugin for Extent
//                "html:target/extent-reports/ExtentReport.html", // HTML report
                "html:target/cucumber-reports.html",         // HTML report
                "json:target/cucumber.json"                  // JSON report
        },
        tags = "@csvlogin",
        monochrome = true,                              // Cleaner console output
        dryRun = false                                   // Set to true to check mappings without executing

)
//features = "src/test/resources/features/login.feature",  // Specific file

public class TestRunner {

}

