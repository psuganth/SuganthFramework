package StepDefinitions;

import io.cucumber.core.plugin.Options;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.chrome.ChromeOptions;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Collections;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;
import PageObjectClasses.UsableFunctions;


public class PriceValidationSteps extends UsableFunctions{
	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Hello, sign in')]")
	public WebElement signInButton;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueButton;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement submitButton;
	
	@Given("open the Amazon webpage {string}")
	public void open_the_amazon_webpage(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("start-maximized");
		//options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		driver = new ChromeDriver(options);
	    driver.get(url);
	}

	@When("logged into the login page")
	public void logged_into_the_login_page() {
		clickElement(signInButton);
		enterText(userName,"mailforjenkins16@gmail.com");
		clickElement(continueButton);
		enterText(password,"Zebra$123#");
		clickElement(submitButton);
	}

	@Then("navigate to the All left pane section")
	public void navigate_to_the_all_left_pane_section() {
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
	}

	@Then("click on the Mobiles section")
	public void click_on_the_mobiles() {
		WebElement ele = driver.findElement(By.xpath("//div[@id='hmenu-canvas']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		
		driver.findElement(By.xpath("(//div[text()='Mobiles, Computers'])[1]")).click();
		
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
		
		WebElement phone = driver.findElement(By.xpath("//span[contains(text(),'iPhone 16 Pro 256 GB')]"));
		Actions action = new Actions(driver);
		action.moveToElement(phone).click();
		
	}

	@Then("verify the {string} of the phone")
	public void verify_the_price_of_the_phone(String price) {
		String priceVal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();
		assertEquals(price, priceVal);
		
	}

	@Then("search for the {string} from the search bar")
	public void search_for_the_phone_model_from_the_search_bar(String phoneModel) {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(phoneModel);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}

	@Then("click on the {string} in the list")
	public void click_on_the_phone_model_in_the_list(String phoneModel) {
		driver.findElement(By.xpath("(//span[contains(text(),'iPhone 16 Pro 256 GB')])[2]")).click();
		
		//clickElement()
	    
	}
}
