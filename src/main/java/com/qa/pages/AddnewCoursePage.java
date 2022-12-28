package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;
import com.qa.utility.ElementUtility;

public class AddnewCoursePage extends Baseclass{
WebDriver driver;
ElementUtility ele = new ElementUtility();

	@FindBy(xpath="//input[@id='course_name']") 
	public static WebElement coursename;

	@FindBy(xpath="//select[@class='form-control' and @name='course_main_type']") 
	public static WebElement selectmajor;

	@FindBy(xpath="//select[@class='form-control' and @name='course_type']") 
	public static WebElement selecttype;
	
	@FindBy(xpath="//button[@id='submitbtn']") 
	public static WebElement clicksubmit;
	

	public AddnewCoursePage(WebDriver driver) {
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
	
	}
	
	public void courseName(String addedcoursename) {
		coursename.sendKeys(addedcoursename);
		//ele.SendKeys(coursename, addedcoursename);
	}
//	 public void SelectingmajorEnginnering() {
//		 ele.selectMajor(selectmajor, "Enginnering");
//	 }
//	 
//	 public void SelectingmajorArts() {
//		 ele.selectMajor(selectmajor, "Arts");
//	 }
//	 
//	 public void SelectingType() {
//		 ele.selectMajor(selecttype, "UG");
//	 }
//	 
//	 public void ClickOnSubmitButton() {
//		 ele.doclick(clicksubmit);
	// }
}
