package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:/India/america/src/main/java/featurefile/taggedhook.feature", //the path of the feature files
		glue={"stepdefinition"},//the path of the step definition files
		format= {"pretty","html:test-output"}, //"json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, 
		//strict = true, 
		dryRun = false
		//tags = {"@SmokeTest,@RegressionTest"}
		
					
		)

public class RunnerClass {

}
