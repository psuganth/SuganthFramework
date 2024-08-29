package Helpers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.BeforeSuite;

public class FrameworkFunctions {
	
	
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
	
	

}
