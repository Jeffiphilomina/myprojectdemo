package StepDefinitions;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import PageObjects.CheckoutPage;
import PageObjects.LandingPage;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class Definition5CheckoutPage {
	public WebDriver driver;
    //PageObjectManager pageobjectmanager;
	TestContextSetup testcontextsetup;
	public String offerpageproductname;
	public CheckoutPage checkoutPage;
	public Definition5CheckoutPage(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.checkoutPage=testcontextsetup.pageobjectmanager.getCheckoutPage();
	}
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_promo()
	{
		//checkoutPage=testcontextsetup.pageobjectmanager.getCheckoutPage();//present in contructor instead of duplicating creation
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.verifyPlaceorder());
	}
	
	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout(String name) throws InterruptedException
	{
		//checkoutPage=testcontextsetup.pageobjectmanager.getCheckoutPage();
		checkoutPage.CheckoutItems();
		//Thread.sleep(2000);
	}
}