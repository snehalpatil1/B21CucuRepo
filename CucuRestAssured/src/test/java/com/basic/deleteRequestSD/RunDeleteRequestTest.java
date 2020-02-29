package com.basic.deleteRequestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		    monochrome=true,        //Logs readability format
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report17702.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunDeleteRequestTest {


}
