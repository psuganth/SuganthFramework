package Helpers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class FrameworkFunctions extends Initialization {
	
	/*
	@BeforeSuite
	public static String readPropertyFile(String value) {
		Properties prop = new Properties();
		FileInputStream fis;
		String propValue = null;
		try {
			fis = new FileInputStream("src//test//resources//Configs/InitialSetup.properties");
			try {
				prop.load(fis);
				propValue =  prop.getProperty(value);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propValue;
	}
	
	public void loadURL() throws Exception {
		try {
		InvokeBrowser();
		driver.manage().window().maximize();
		driver.get(FrameworkFunctions.readPropertyFile("QAURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
	*/
	@AfterSuite
	public void quitDriver() {
		driver.close();
	}
	
	

}
