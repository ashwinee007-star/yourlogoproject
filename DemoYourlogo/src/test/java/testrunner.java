import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/features"},
glue= {"testcases"})

public class testrunner extends AbstractTestNGCucumberTests 
{

}
