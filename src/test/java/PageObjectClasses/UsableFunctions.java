package PageObjectClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Helpers.FrameworkFunctions;
import Helpers.Initialization;

public class UsableFunctions extends Initialization{
	
	FrameworkFunctions ff = new FrameworkFunctions();
	
	public void dynamicWebTable() {
		//This function is used to get one unique identifier and return the other required columns
		List<WebElement> rows = driver.findElements(By.xpath("//table[@data-testid='largest-10']/thead/tr/th"));
		System.out.println("suganth" + rows.size());
		for(WebElement row : rows) {
			System.out.println(row.getText());
		}
	}
	
	public void clickPreloginButton() {
		try {
			ff.loadURL();
			driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterLoginCredentials() {
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("psuganth12");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Giraffe@123");
		driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
	}

}
