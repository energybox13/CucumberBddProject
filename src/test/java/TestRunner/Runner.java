package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features/login.feature",
    glue = "stepdefinitions",
    tags= "@regression",
    plugin = {"pretty","junit:target/cucumber-reports/reports_xml.xml","pretty","json:target/cucumber-reports/reports_json.json","pretty","html:target/cucumber-reports/reports1.html"},
    monochrome = true,
    dryRun = false
)


//plugin = {"pretty","json:target/cucumber-reports/reports_json.json"},
//plugin = {"pretty","html:target/cucumber-reports/reports1.html"},,

public class Runner {

}
