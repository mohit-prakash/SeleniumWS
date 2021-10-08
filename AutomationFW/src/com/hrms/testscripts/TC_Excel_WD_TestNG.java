package com.hrms.testscripts;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class TC_Excel_WD_TestNG 
{ 
	public WebDriver driver; 
	@BeforeClass
	public void Startup()
	{ 
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe"); 
		driver = new ChromeDriver();
	}
	@AfterClass
	public void teardown()
	{	 
		driver.quit();
	}
	@Test
	public void login() throws Exception	
	{
	//Reading username and password from excel and assigning to variables 
		FileInputStream f1 = new FileInputStream("D:\\NiT\\SoftwareTesting\\HRMSid.xls"); 
		Workbook w = Workbook.getWorkbook(f1);
		Sheet s = w.getSheet(0);
		String un = s.getCell(0,0).getContents();
		String pw = s.getCell(1,0).getContents();
		//	Typing username and password from Excel file 
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php"); 
		driver.findElement(By.name("txtUserName")).sendKeys(un); 
		driver.findElement(By.name("txtPassword")).sendKeys(pw); 
		driver.findElement(By.name("Submit")).click(); 
		Thread.sleep(3000);
		System.out.println("Login completed"); 
		Reporter.log("Login completed"); 
		driver.findElement(By.linkText("Logout")).click(); 
		Reporter.log("Logout completed");
	}
}	