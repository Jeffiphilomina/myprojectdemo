package Utils;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		if (driver == null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"src//test//resources//chromedriver");
	    WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			}
			else if (prop.getProperty("browser")=="firefox")
			{
				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//for the entire framework we are adding waits so that no need to add further in your definitions
		driver.get(url);
		}
		return driver;
		
	}
}
