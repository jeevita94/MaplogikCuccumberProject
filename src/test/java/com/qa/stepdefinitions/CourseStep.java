package com.qa.stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.base.Baseclass;
import com.qa.pages.AddnewCoursePage;
import com.qa.pages.CoursePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utility.ElementUtility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CourseStep extends Baseclass{
	WebDriver driver;
	Properties properties = new Properties();
	Baseclass bsBaseclass = new Baseclass();
	LoginPage log = new LoginPage(Baseclass.driverinitialisation());
//	HomePage homePage = new HomePage(Baseclass.driverinitialisation());
//	CoursePage corsepage = new CoursePage(Baseclass.driverinitialisation());
//	AddnewCoursePage adding = new AddnewCoursePage(Baseclass.driverinitialisation());
	//ElementUtility ele = new ElementUtility();
	HomePage home = new HomePage(driver);
	CoursePage corsepage = new CoursePage(driver);
	AddnewCoursePage adding = new AddnewCoursePage(Baseclass.driverinitialisation());
	
	
	@Given("Admin is in HomePage")
	public void admin_is_in_home_page() throws IOException {
		//driverinitialisation();
		Baseclass.url();
		log.Username("admin@gmail.com");
		log.Password("Admin@123");
		//homePage=log.login();
		home= log.login();
	  //  System.out.println(ele.getpagetitle());
	}

	@When("Admin clicks on course link")
	public void admin_clicks_on_course_link() {
		//homePage.courseLink();
		home.courseLink();
	   
	}

	@Then("Admin is navigated to Course page")
	public void admin_is_navigated_to_course_page() {
		//System.out.println(ele.getpagetitle());
	}

	@When("Admin clicks on Addnew link")
	public void admin_clicks_on_addnew_link() {
	   corsepage.courseLink();
	}

	@Then("Admin is Navigated to Course detailpage")
	public void admin_is_navigated_to_course_detailpage() {
		//System.out.println(ele.getpagetitle());
	}

	@When("Admin Add the Course Name as  BioTech in Coursename textfied")
	public void admin_add_the_course_name_as_bio_tech_in_coursename_textfied() {
	   adding.courseName("BioTech");
	}

	@And("Selects the major Enginnering")
	public void selects_the_major_enginnering() {
		//adding.SelectingmajorEnginnering();
	   
	}

	@And("Selects the type of course UG")
	public void selects_the_type_of_course_ug() {
		//adding.SelectingType();
	  
	}

	@And("Click on Submit Button")
	public void click_on_submit_button() {
	    
	}

	@Then("Course is added Successfull and displayed in course page")
	public void course_is_added_successfull_and_displayed_in_course_page() {
	    
	}

	@When("Admin Add the Course Name as AeroSpace in Coursename textfied")
	public void admin_add_the_course_name_as_aero_space_in_coursename_textfied() {
	   adding.courseName("AeroSpace");
	}

	@When("Admin Add the Course Name as GeoInformatics in Coursename textfied")
	public void admin_add_the_course_name_as_geo_informatics_in_coursename_textfied() {
	   adding.courseName("GeoInformatics");
	}

	@When("Admin Add the Course Name as BBA Coursename textfied")
	public void admin_add_the_course_name_as_bba_coursename_textfied() {
	   adding.courseName("BBA");
	}

	@And("Selects the major Arts")
	public void selects_the_major_arts() {
	 // adding.SelectingmajorArts();
	}

	@When("Admin Add the Course Name as B.sc Geographyin Coursename textfied")
	public void admin_add_the_course_name_as_b_sc_geographyin_coursename_textfied() {
	    adding.courseName("B.sc Geography");
	}

	@When("Admin Add the Course Name as B.sc Economics in Coursename textfied")
	public void admin_add_the_course_name_as_b_sc_economics_in_coursename_textfied() {
	    adding.courseName("B.sc Economics");
	}

	

}
