package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

// glue code and reports

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
plugin = {"pretty", "html:target/HtmlReports/report.html", 
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"},
tags="@smoketest"

)

public class TestRunner {

}
