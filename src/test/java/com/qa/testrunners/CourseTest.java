package com.qa.testrunners;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.qa.base.Baseclass;
import com.qa.pages.AddnewCoursePage;
import com.qa.pages.CoursePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utility.ElementUtility;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resource\\com\\qa\\features\\Course.feature"},glue = {"stepdefinitions"},
plugin = {"pretty","html:target\\cucumber-reports"},monochrome = true)

public class CourseTest extends Baseclass {
	WebDriver driver;
	LoginPage log = new LoginPage(Baseclass.driverinitialisation());
	//ElementUtility ele = new ElementUtility();
	HomePage home = new HomePage(Baseclass.driverinitialisation());
	CoursePage corsepage = new CoursePage(Baseclass.driverinitialisation());
	AddnewCoursePage adding = new AddnewCoursePage(Baseclass.driverinitialisation());
}
