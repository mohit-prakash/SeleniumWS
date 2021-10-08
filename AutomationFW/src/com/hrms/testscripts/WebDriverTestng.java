package com.hrms.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverTestng 
{ 
	private WebDriver driver; 
	@BeforeClass
	public void Startup()
	{ 
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
		driver = new ChromeDriver();
	}
	@Test (description="OrangeHRM Login") 
	public void Login() throws Exception
	{ 
		Reporter.log("Test case steps");
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php"); 
		Reporter.log("1.Application opened"); 
		driver.findElement(By.name("txtUserName")).sendKeys("admin"); 
		Reporter.log("2.typing user name"); 
		driver.findElement(By.name("txtPassword")).sendKeys("admin"); 
		Reporter.log("3.Typing password"); 
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000); 
		Reporter.log("4.login completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("5.logout completed");
		Thread.sleep(3000);
	}
	@AfterClass
	public void teardown()
	{ 
		driver.quit();
	}
}