package com.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.base.Baseclass;

public class LoginPage extends Baseclass {
	WebDriver driver;
	
	Properties properties=new Properties();
	@FindBy(xpath="//input[@id = 'login-email']") 
	public static WebElement username;
	
	@FindBy(xpath= "//input[@id = 'login-password']")
	public static WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary w-100 waves-effect waves-float waves-light' and @tabindex='4']")
	public static WebElement loginbutton;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//AjaxElementLocatorFactory ajaxElement=new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(driver, this);
	}

	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public void Username(String un) {
		username.sendKeys(un);
	}
	 public void Password(String pwd) {
		 password.sendKeys(pwd);
	 }
	  public HomePage login() {
		  loginbutton.click();
			return new HomePage(driver);
	  }

}
