package TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	      features = {"src/test/java/Features"},
	      glue = {"com.company.step.definitions"},
	      monochrome = true,
	      dryRun = false,
	      plugin = {"pretty"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
