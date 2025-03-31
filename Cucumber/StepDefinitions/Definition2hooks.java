package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Definition2hooks {
@Before("@NetBanking")
 public void netBankingSetup()
 {
	System.out.println("**************************");
	 System.out.println("set up the entries in Netbanking database");
 }
@Before("@Mortgage")
 public void mortgageSetup()
 {
	 System.out.println("set up the entries in Mortgage database");
 }
@After
public void teardown()
{
	System.out.println("Clear the entries");
}
}
