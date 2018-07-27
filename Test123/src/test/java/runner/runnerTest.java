package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",glue= {"stepDefination"},plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },monochrome = true)
		
		

public class runnerTest {

}
