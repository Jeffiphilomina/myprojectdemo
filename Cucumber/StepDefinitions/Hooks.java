package StepDefinitions;

import java.io.IOException;

import Utils.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {
TestContextSetup testContextSetup;

public Hooks(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
}
	@After
	public void afterscenario() throws IOException {
		testContextSetup.testbase.WebDriverManager().quit();
	}
}
