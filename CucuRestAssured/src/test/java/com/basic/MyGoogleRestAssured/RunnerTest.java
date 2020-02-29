package com.basic.MyGoogleRestAssured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"src/test/resources/com/basic/MyGoogleRestAssured/MyFeatureFile.feature",  //we can take feature files from two different folders 
				"src/test/resources/com/basic/MyGoogle22/MyFeatureFile.feature"},
		glue    ={"com/basic/MyGoogleRestAssured"},        //Java path in glue tag
		monochrome=true                                    //for formatting languages
		
		)
public class RunnerTest {

	
}
