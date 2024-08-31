package StepDefinitions;
import io.cucumber.java.en.Given;

public class LoginPageSteps {
	
	@Given("I want to open the nyse QAURL")
	public void i_want_to_open_the_nyse_qaurl() {
	    System.out.println("Logged into the Page");
	    throw new io.cucumber.java.PendingException();
	}

}
