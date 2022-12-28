package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;

public class HomePage extends Baseclass {
	WebDriver driver;
	

	@FindBy(xpath="//span[text()='Course']") 
	public static WebElement courselink;
	
	@FindBy(xpath="//span[text()='College Activation']") 
	public static WebElement CollegeActivationlink;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
	}
	
	 public CoursePage courseLink() {
		 courselink.click();
			return new CoursePage(driver);

}
	 public CollegeActivationPage CollegeActivationlink() {
		 CollegeActivationlink.click();
			return new CollegeActivationPage(driver);
	 
}
}