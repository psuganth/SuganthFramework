package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	      features = {"src/test/java/Features"},
	      glue = {"StepDefinitions"},
	      monochrome = true,
	      dryRun = false,
	      plugin = {"pretty", "html:target/cucumber-reports.html"}
	      )
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests{

}
