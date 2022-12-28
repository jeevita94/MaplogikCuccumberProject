package com.qa.testrunners;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.qa.base.Baseclass;
import com.qa.pages.LoginPage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resource\\com\\qa\\features\\AdminLogin.feature"},glue = {"stepdefinitions"},
plugin = {"pretty","html:target\\cucumber-reports"},monochrome = true)
public class AdminLoginTest extends Baseclass{
	LoginPage log = new LoginPage(Baseclass.driverinitialisation());
	
	

}
