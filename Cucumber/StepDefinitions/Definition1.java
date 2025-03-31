package StepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition1 {
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User landed on netbanking page");
	}
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on practice landing page");
	}
	@When("User signup into application")
	public void user_signup_into_application_with_and_password(List<String> data) {
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	}
	@When("User login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User logged in into application");
	}
	
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String Username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(Username +" and password is"+password);
	}
	
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password_of_regex(String Username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(Username +" and password is"+password+"Using Regex");
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}
	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("***************************");
	    System.out.println("setup the entries in database");
	}
	@When("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("launch the browser from config variables");
	}
	@When("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("hit the home page url of banking site");
	}
}
