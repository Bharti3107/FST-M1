package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
       // tags = "@activity1"
       // tags = "@activity2"
        //  tags = "@activity3"
       // tags = "@activity4"
        tags = "@activity45",
        //solution for pretty report
        plugin = {"pretty"},
        monochrome = true
        //solution for HTML report
        //plugin = {"html: test-reports"},
        //monochrome = true
        //Solution for JSON report
       // plugin = {"json: test-reports/json-report.json"},
        //monochrome = true

)


public class ActivitiesRunner {
    //empty
}