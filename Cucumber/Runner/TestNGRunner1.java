package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\Features\\ThirdProgramSearchproduct.feature",glue="StepDefinitions",monochrome=true)
public class TestNGRunner1 extends AbstractTestNGCucumberTests{

}
