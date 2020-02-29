package com.basic.HeadersValidation;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class headersValidationSD {
	
	Response res;
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {
		System.out.println("Starting of the GET script");
	}

	@Then("^user checks headers \"([^\"]*)\" have \"([^\"]*)\" value$")
	public void user_checks_headers_have(String headerName, String headerValue) {
		res = RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api/f1/2017/circuits.json");
		String completeResponse = res.asString();
		System.out.println("================="+completeResponse);
		//get all headers
		Headers heds = res.getHeaders();
		String actualHeaderValue = heds.getValue(headerName);
     	System.out.println(heds);
     	Assert.assertTrue(actualHeaderValue.equals(headerValue));
	}
	
}	
		//if we have multiple element, get all element and validate that your expected single element is present in list
//		List<Object> cirList = res.body().jsonPath().getList("MRData.CircuitTable.Circuits.circuitId");
//		int cirSize = cirList.size();
//		System.out.println("cir size ="+cirSize);
		



