package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
    public WebDriver driver;
    public GenericUtils(WebDriver driver)
    {
    	this.driver=driver;
    }
	public void SwitchWindowToChild()
	{
		Set<String> windowid=driver.getWindowHandles();
		Iterator<String> it=windowid.iterator();
		String parentwindow=it.next(); //0th index id will be returned
		String childwindow=it.next(); //1 st index id will be returned
		driver.switchTo().window(childwindow);	
	}
}
