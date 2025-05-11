package StepDefinitions;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import PageObjects.LandingPage;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class Definition4OffersPage {
	public WebDriver driver;
    PageObjectManager pageobjectmanager;
	TestContextSetup testcontextsetup;
	public String offerpageproductname;
	public Definition4OffersPage(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	@Then("User searched for {string} shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortname) throws InterruptedException {
	switchToOffersPage();
	OffersPage offerspage=new OffersPage(testcontextsetup.driver);
	offerspage.searchItem(shortname);
	//testcontextsetup.driver.findElement(By.id("search-field")).sendKeys(shortname);
	Thread.sleep(2000);
	//offerpageproductname=testcontextsetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	offerpageproductname=offerspage.getProductName();
	System.out.println(offerpageproductname);
	}
	public void switchToOffersPage() {
		//pageobjectmanager=new PageObjectManager(testcontextsetup.driver);
		//LandingPage lp=new LandingPage(testcontextsetup.driver);
		//LandingPage lp=pageobjectmanager.getLandingPage();
		LandingPage lp=testcontextsetup.pageobjectmanager.getLandingPage();//eliminate obj creation in step definitions
		lp.selectTopDeals();
		//testcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
		testcontextsetup.genericutils.SwitchWindowToChild();
	}
	@Then ("Validate product name in offers page matches with landing page")
	public void verify_productname()
	{
	Assert.assertEquals(testcontextsetup.landingpageproductname,offerpageproductname);
	}
}
