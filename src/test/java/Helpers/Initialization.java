package Helpers;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
@Test
public class Initialization {
	WebDriver driver;
	
	public void InvokeBrowser() throws Exception {
		String browserName = FrameworkFunctions.readPropertyFile("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
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
		driver.manage().window().maximize();
		driver.manage().deleteCookieNamed("CONSENT");
		driver.manage().addCookie(new Cookie("CONSENT","YES+shp.gws-"+LocalDate.now().toString().replace("-","")+"-0-RC2.en+FX+374"));
		driver.navigate().refresh();
		driver.get(FrameworkFunctions.readPropertyFile("QAURL"));
		System.out.println(FrameworkFunctions.readPropertyFile("QAURL"));
	}

}
