package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.security.auth.login.CredentialException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass {
	
static Properties properties;
public static WebDriver driver;
	
	public static WebDriver driverinitialisation()
	{
		System.setProperty("webdriver.chrome.driver", "I:\\Softwares\\chrome107\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void url() throws IOException {
		properties=new Properties();
		FileInputStream ip=new FileInputStream("src\\test\\resource\\com\\configuration\\config.properties");
		properties.load(ip);
		String adminUrl = properties.getProperty("url") ;
		driver.get(adminUrl);
		
	}
	
	
}
