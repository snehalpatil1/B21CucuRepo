package com.basic.backgroundKeyword;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class BackgroundTestSD {

//	Background in Cucumber is used to define a step or series of steps that are common to 
//	all the tests in the feature file. It allows you to add some context to the scenarios for a 
//	feature where it is defined. A Background is much like a scenario containing a number of steps. 
//	But it runs before each and every scenario were for a feature in which it is defined. 
	
	WebDriver driver;

	@Given("^Google have website$")
	public void google_have_website() throws Throwable {
		System.out.println("Google have website");
	}

	@When("^I hit google application$")
	public void i_hit_google_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C://SeleniumSoftwares//New folder//geckodriver-v0.18.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

	@Given("^Facebook have website$")
	public void facebook_have_website() throws Throwable {
		System.out.println("Facebook have website");
	}

	@When("^I hit facebook application$")
	public void i_hit_facebook_application() throws Throwable {
		driver.findElement(By.id("fakebox-input")).sendKeys("wwww.facebook.com");
		System.out.println("Facebook website is opened");
	}

	@Given("^seleniumhq have website$")
	public void seleniumhq_have_website() throws Throwable {
		System.out.println("Selenium have website");
	}

	@When("^I hit seleniumhq application$")
	public void i_hit_seleniumhq_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C://SeleniumSoftwares//New folder//geckodriver-v0.18.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.com/");
		System.out.println("Selenium website is opened");
	}





}


