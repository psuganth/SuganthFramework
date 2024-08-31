package PageObjectClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Helpers.Initialization;

public class seleniumUsableFunctions extends Initialization{
	@AfterSuite
	public void dynamicWebTable() {
		//This function is used to get one unique identifier and return the other required columns
		List<WebElement> rows = driver.findElements(By.xpath("//table[@data-testid='largest-10']/thead/tr/th"));
		System.out.println("suganth" + rows.size());
		for(WebElement row : rows) {
			System.out.println(row.getText());
		}
		
	}

}
