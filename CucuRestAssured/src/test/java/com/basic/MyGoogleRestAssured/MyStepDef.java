package com.basic.MyGoogleRestAssured;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyStepDef {

	Response res;
	
	@Given("^google have website$")             //^ and $ are special character to identify sentence in gherkin language
	public void google_have_website(){
		System.out.println("Yes");
	}
	
	@When("I hit google application")
	public void I_hit_google_application(){
	    res= RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
	}
	
	@Then("I validate status code")
	public void I_validate_status_code(){
		int actualStatCode= res.getStatusCode();
		System.out.println("actualStatCode =  "+actualStatCode);
		Assert.assertTrue(200==actualStatCode);
	}
}
