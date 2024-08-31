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

@Test
public class Initialization {
	public WebDriver driver;
	
	public void InvokeBrowser() throws Exception {
		String browserName = FrameworkFunctions.readPropertyFile("browser");
		
		
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
	
	public void loadURL() {
		try {
		driver.manage().window().maximize();
		driver.get(FrameworkFunctions.readPropertyFile("QAURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//button[text()='180']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		System.out.println(FrameworkFunctions.readPropertyFile("QAURL"));
		} catch (InterruptedException e) {
			System.out.println("Load URL have failed");
			e.printStackTrace();
		}
	}

}
