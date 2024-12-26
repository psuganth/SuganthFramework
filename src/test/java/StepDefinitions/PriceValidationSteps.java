package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.*;
import PageObjectClasses.UsableFunctions;


public class PriceValidationSteps extends UsableFunctions{
	@Given("open the Amazon webpage {string}")
	public void open_the_amazon_webpage(String string) {
	    driver.get("https://www.amazon.in/");
	    throw new io.cucumber.java.PendingException();
	}

	@When("logged into the login page")
	public void logged_into_the_login_page() {
		driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mailforjenkins16@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Zebra$123#");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

	@Then("navigate to the All left pane section")
	public void navigate_to_the_all_left_pane_section() {
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
	}

	@Then("click on the Mobiles section")
	public void click_on_the_mobiles(Integer int1) {
		driver.findElement(By.xpath("//div[text()='Mobiles, Computers']")).click();
		
	}

	@Then("click on the All mobile phones section")
	public void click_on_the_all_mobile_phones_section() {
		driver.findElement(By.xpath("//div[text()='All Mobile Phones']")).click();
		
	}

	@Then("click on the {string} from the mobile page")
	public void click_on_the_from_the_mobile_page(String string) {
		driver.findElement(By.xpath("(//span[contains(text(),'Apple')])[2]")).click();
		
	}

	@Then("click on the specific {string} from the list")
	public void click_on_the_specific_from_the_list(String string) {
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 Pro 256 GB')]")).click();
		
	}

	@Then("verify the {string} of the phone")
	public void verify_the_price_of_the_phone(String price) {
		String priceVal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
		assertEquals(price, priceVal);
		
	}

	@Then("search for the {string} from the search bar")
	public void search_for_the_phone_model_from_the_search_bar(String phoneModel) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on the {string} in the list")
	public void click_on_the_phone_model_in_the_list(String phoneModel) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
