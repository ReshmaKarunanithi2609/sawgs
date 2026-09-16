package TestRunner;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Feature", 
    glue = {"Stepdefinition"},tags = "@Sanity",
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class Runner {
    
}