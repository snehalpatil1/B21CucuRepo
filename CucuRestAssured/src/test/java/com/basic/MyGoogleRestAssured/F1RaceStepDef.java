package com.basic.MyGoogleRestAssured;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class F1RaceStepDef {

Response res;
	
	@Given("f1race have website")
	public void f1race_have_website(){
		System.out.println("Yes");
	}
	
	@When("I hit f1race application")
	public void I_hit_f1race_application(){
	    res= RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
	}
	
	@Then("I validate status of f1race")
	public void I_validate_status_of_f1race(){
		int actualStatCode= res.getStatusCode();
		System.out.println("actualStatCode =  "+actualStatCode);
		Assert.assertTrue(200==actualStatCode);
	}
	
	@Then("Validate f1race data")
	public void Validate_f1race_data (){
		String actualData= res.getBody().asString();
		System.out.println("Data =   "+actualData);
	}
	
	
}
