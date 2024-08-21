import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Initialization {
	WebDriver driver;
	
	public void InvokeBrowser(String browserName) {
		prop = new Properties();
		String browser = prop.getProperty(browserName);
		if(browser.equalsIgnoreCase(chrome)) {
			driver = new ChromeDriver()
		}
		else if(browser.equalsIgnoreCase(firefox)) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase(edge)) {
			driver = new EdgeDriver();
		}
		else {
			throw new Exception("Incorrect Browser Name")
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public void readPropertyFile() {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(InitialSetup.properties);
		prop.load(fis);
		prop.getProperty("browser");
		
		
	}
}
