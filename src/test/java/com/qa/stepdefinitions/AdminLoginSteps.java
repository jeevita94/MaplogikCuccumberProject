package com.qa.stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AdminLoginSteps extends Baseclass{
	WebDriver driver;
	LoginPage log = new LoginPage(Baseclass.driverinitialisation());
	Baseclass bsBaseclass = new Baseclass();
	Properties properties = new Properties();
	HomePage homePage = new HomePage(driver);
	

	@Given("Admin are in login page")
	public void admin_are_in_login_page() throws IOException {
	
		bsBaseclass.url();
		  System.out.println(log.validatepagetitle());
		
	}

	@When("Admin Enters the username in the username text field")
	public void admin_enters_the_username_in_the_username_text_field() throws InterruptedException, IOException {
		
		log.Username("admin@gmail.com");
	
	}

	@And("Admin Enters the password in the password text field")
	public void admin_enters_the_password_in_the_password_text_field() throws IOException {
	
	log.Password("Admin@123");
	}

	@When("Admin clicks on Log in button")
	public void admin_clicks_on_log_in_button() {
		homePage=log.login();
	    
	}

	@Then("Admin is navigated to Homepage of Admin Module")
	public void admin_is_navigated_to_homepage_of_admin_module() {
	  System.out.println(log.validatepagetitle());
	}


}
