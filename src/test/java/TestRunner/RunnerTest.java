package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	      features = {"src/test/java/Features"},
	      glue = {"com.company.step.definitions"},
	      monochrome = true,
	      dryRun = false,
	      plugin = {"pretty"})
public class RunnerTest extends AbstractTestNGCucumberTests{

}
