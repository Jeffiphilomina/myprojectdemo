package StepDefinitions;
import PageObjects.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition4LandingPage {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproductname;
	TestContextSetup testcontextsetup;
	LandingPage landingpage;
	public Definition4LandingPage(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingPage();
	}
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(landingpage.getTitleLandingPage().contains("GreenKart"));
		/*
		//System.setProperty("webdriver.chrome.driver","C://Users//jeffi//Downloads//chromedriver_win32//chromedriver");
	    WebDriverManager.chromedriver().setup();
		testcontextsetup.driver=new ChromeDriver();
		testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		*/
	}
	//@When("User searched with Shortname {string} and extracted actual name of product")
	//Parameterised Step Definition
	@When("^User searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
	//LandingPage landingpage=testcontextsetup.pageobjectmanager.getLandingPage();//MOVED it to constructor to eliminiate duplicating
		//LandingPage landingpage=new LandingPage(testcontextsetup.driver);
	landingpage.searchItem(shortname);
	//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname)  ;
	Thread.sleep(2000);
	testcontextsetup.landingpageproductname=landingpage.getProductName().split("-")[0].trim();
	System.out.println(landingpageproductname+"is Extracted from HomePage");
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String quantity)
	{
		landingpage.incrementQuantity(Integer.parseInt(quantity));
		landingpage.addToCart();
	}
}
