package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\Features",glue="StepDefinitions",monochrome=true,tags="not @RegressionTest",plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"},dryRun=true)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
