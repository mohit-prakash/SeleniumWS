package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	//driver
	public static WebDriver driver;
	//open application
	public static void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumWS\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//Maximize current window
		driver.manage().window().maximize();
		
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Reporter.log("Application Opened");
	}
	public static void closeApplication()
	{
		driver.close();
		Reporter.log("Application closed");
	}
}
