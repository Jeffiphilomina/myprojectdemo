package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingpageproductname;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	public GenericUtils genericutils;
	public TestContextSetup() throws IOException
	{
		testbase=new TestBase();
		//pageobjectmanager=new PageObjectManager(driver);
		pageobjectmanager=new PageObjectManager(testbase.WebDriverManager());
		genericutils=new GenericUtils(testbase.WebDriverManager());
	}
}
