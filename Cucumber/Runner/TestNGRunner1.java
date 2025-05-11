package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\Features\\ThirdProgramSearchproduct.feature",glue="StepDefinitions",monochrome=true)
public class TestNGRunner1 extends AbstractTestNGCucumberTests{

	//run cucumber scenarios parallely with testng
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
