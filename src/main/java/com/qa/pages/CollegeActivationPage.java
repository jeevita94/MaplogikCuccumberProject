package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Baseclass;

public class CollegeActivationPage extends Baseclass {
WebDriver driver;
	

	@FindBy(xpath="//span[contains(text(),'Add New')]") 
	public static WebElement collegeaddnewlink;
	
	public CollegeActivationPage(WebDriver driver) {
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
	}
	
	 public AddCollegePage courseLink() {
		 collegeaddnewlink.click();
			return new AddCollegePage();
	 }

}
