package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
WebDriver driver;
	

	@FindBy(xpath="//*[@id='basic-datatable']/div/div/div/a/span[text()='Add New']") 
	public static WebElement addnewcourse ;
	
	public CoursePage(WebDriver driver) {
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
	}
	
	 public AddnewCoursePage courseLink() {
		 addnewcourse.click();
			return new AddnewCoursePage(driver);

	
	
	
}
}