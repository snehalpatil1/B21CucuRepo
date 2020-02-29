package com.basic.deleteRequestSD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.json.JSONObject;
import org.junit.Assert;

public class MyDeleteRequest {
	 
	Response resp ;
	
	@Given("^user hit the delete request$")                //^ and $ matches exact given request
	public void user_hit_the_post_request_with_String() throws IOException{
		//First Create user
		Response postRes = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().              
				when().body("{ \"name\": \"Supriya\", \"job\":\"QA consultant\"}").post("https://reqres.in/api/users");
		
		//get created user id
		String userid = postRes.getBody().jsonPath().get("id");
		
		//Delete created user
		resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body("{    \"name\": \"Tom\",    \"job\":\"Trainer\"}").delete("https://reqres.in/api/users/"+userid);  //e.g 23 is id of user we use our specific id which is to be delelted
		resp.then().log().all();
		resp.then().log().status();
		System.out.println("====="+resp.asString());
		
	}
	
	@Then("user validate the status code")
	public void user_validate_the_status_code(){
		
		//Check id is not null
		resp.then().assertThat().statusCode(204);  //For Delete status code is 204
		
		//With regular Assert statement
//		int statCode = resp.getStatusCode();
//		System.out.println("status code = "+statCode);
//		Assert.assertTrue(200==statCode);
//		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
 