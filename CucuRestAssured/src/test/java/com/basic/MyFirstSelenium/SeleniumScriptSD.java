package com.basic.MyFirstSelenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumScriptSD {

	WebDriver driver;
	
	@Given("^Selenium has website$")
	public void Selenium_has_website() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C://SeleniumSoftwares//New folder//geckodriver-v0.18.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://selenium.dev/");
		}

	@When("^Click on download tab$")
	public void Click_on_download_tab() throws Throwable {
	   driver.findElement(By.xpath("//nav/a[contains(text(),'Downloads')]")).click();
	}

	@Then("^Validate download tab$")
	public void Validate_download_tab() throws Throwable {
		Assert.assertTrue(true);

	}


}
