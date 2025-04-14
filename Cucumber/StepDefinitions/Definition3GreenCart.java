package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Definition3GreenCart {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproductname;
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
		//System.setProperty("webdriver.chrome.driver","C://Users//jeffi//Downloads//chromedriver_win32//chromedriver");
	    WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@When("User searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname)  ;
	Thread.sleep(2000);
	landingpageproductname=driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	System.out.println(landingpageproductname+"is Extracted from HomePage");
	}
	@Then("User searched for {string} shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortname) throws InterruptedException {
	driver.findElement(By.linkText("Top Deals")).click();
	Set<String> windowid=driver.getWindowHandles();
	Iterator<String> it=windowid.iterator();
	String parentwindow=it.next(); //0th index id will be returned
	String childwindow=it.next(); //1 st index id will be returned
	driver.switchTo().window(childwindow);
	driver.findElement(By.id("search-field")).sendKeys(shortname);
	Thread.sleep(2000);
	offerpageproductname=driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	System.out.println(offerpageproductname);
	}
	@Then ("Validate product name in offers page matches with landing page")
	public void verify_productname()
	{
	Assert.assertEquals(landingpageproductname,offerpageproductname);
	}
}
