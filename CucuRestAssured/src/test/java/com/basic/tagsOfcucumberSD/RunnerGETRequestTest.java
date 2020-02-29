package com.basic.tagsOfcucumberSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags={"@Important"}, //All scenario executed if this is tag for feature file
		//tags={"@Smoke"}, //only tag with @Smoke
		//tags={"@Smoke","@Regression"}, //AND condition means Scenario which have smoke and regression both tags
		//tags={"@Smoke,@Regression"} , // OR condition means Scenario which have smoke Or regression tag
		//tags = {"~@Smoke"},  // this will exclude the scenario with @SmokeTest
		monochrome=true,
		dryRun=false,           //To check only java code present for particular step def without running whole code dryRun =true 
		features= {"src/test/resources/com/basic/tagsOfcucumberFF/"},
		glue={"com/basic/tagsOfcucumberSD/"},
		plugin={"pretty",                                  //Plugin Are used to generate report and storage path
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report11121.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
	)

public class RunnerGETRequestTest {

}
