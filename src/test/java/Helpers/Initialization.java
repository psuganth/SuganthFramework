package Helpers;
import java.time.Duration;
import java.time.LocalDate;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


public class Initialization {
	public WebDriver driver;
	
	public void InvokeBrowser() throws Exception {
		String browserName = "chrome";
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Incorrect Browser Name");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	

}
