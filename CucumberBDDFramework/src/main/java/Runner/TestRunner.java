package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="F:\\eclipse-workspace\\TestDairyBDDFramework\\src\\main\\java\\Feature\\TestCase2.feature",
		glue={"stepDefination"},
		format= {"pretty", "html: test-output"}, //"junit:junit_xml/cucumber.xml"
		monochrome= true,
		strict= true,
		dryRun = false
		
		//tags = {"~@Smoke","~@Regression", "~@EndToEnd"}
		//"@Smoke"-------------------------------All test cases having smoke tag
		//"@Smoke", "~@Regression", "~@EndToEnd"-Test cases with only Smoke tag
		//"@Regression"--------------------------All test cases having regression tag
		//"~@Smoke", "@Regression", "~@EndToEnd"-Test cases only with Regression tag
		//"@EndToEnd"----------------------------All test cases having EndToEnd tag
		//"~@Smoke", "~@Regression", "@EndToEnd"-Test case only with EndToEnd tag
		//"@Smoke, @Regression"------------------All test cases with Smoke OR Regression
		//"@Smoke", "@Regression"----------------Test cases having both Smoke AND Regression tag
		//"@Smoke", "@Regression", "~@EndToEnd"- Test cases having both Smoke AND Regression but not EndToEnd tag
		//"~@Smoke","~@Regression", "~@EndToEnd"-Test cases with no any tag
		)


public class TestRunner {

}