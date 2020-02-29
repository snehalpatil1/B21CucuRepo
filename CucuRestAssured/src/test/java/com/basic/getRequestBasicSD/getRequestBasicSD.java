package com.basic.getRequestBasicSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getRequestBasicSD {

	Response res;

	@Given("^Race circuit application is running$")
	public void race_circuit_application_is_running() throws Throwable {
	   System.out.println("Application ready to use");
	}

	@When("^I hit get request to get response$")
	public void i_hit_get_request_to_get_response() throws Throwable {
		res= RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		String actualData= res.getBody().asString();
		System.out.println("Data =   "+actualData);
	}

//	@Then("^I validate circuit limit value$")
//	public void i_validate_circuit_limit_value() throws Throwable {
//	  String limitvalue = res.body().jsonPath().getString("MRData.limit");
//	  Assert.assertTrue(limitvalue.equals("30"));   
//		
//	                                                           //Over Internet all integer data is written in form of String to avoid failure
//	}                                                           //So always it in String form and if required convert String into integer  

	@Then("^I validate circuit \"([^\"]*)\" value as \"([^\"]*)\" present$")     //these are Regular Expression which collects anything like string,int
	public void i_validate_circuit_value_as_present(String jpath,String valueToBeValidated) throws Throwable {
		
	  String attrvalue = res.body().jsonPath().getString(jpath);
	  Assert.assertTrue(attrvalue.equals(valueToBeValidated));   
	}	
	
	@Then("^I validate circuit id value$")
	public void i_validate_circuit_id_value() throws Throwable {
		String totalValue = res.body().jsonPath().getString("MRData.total");
		int totalIntValue = Integer.parseInt(totalValue);
		
		for(int i=0;i<totalIntValue;i++){
			 String idValue = res.body().jsonPath().getString("MRData.CircuitTable.Circuits["+i+"].circuitId");
			 if(idValue.equals("americas")){
				 Assert.assertTrue(idValue.equals("americas"));  
				 break;
			 }
			 else{
				if(i==totalIntValue-1){
					Assert.assertTrue(false);  
				} 
			 }
		}
		
	}
	
	@Then("^I validate circuit total value$")
	public void i_validate_circuit_total_value() throws Throwable {
		 String totalvalue = res.body().jsonPath().getString("MRData.total");
		 Assert.assertTrue(totalvalue.equals("20")); 
	}
}
