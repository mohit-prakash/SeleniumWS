//General.java
package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
		public void openApplication()
		{ 
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumWS\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			System.out.println("Application opened");//print in console
			Reporter.log("Application opened");//print in HTML report 
			Log.info("Application opened");//print in logfile.log
		}
		public void closeBrowser()
		{
			driver.quit();
			System.out.println("Application closed");
			Reporter.log("Application closed"); 
			Log.info("Application closed");
		}
		public void login() throws Exception
		{ 
			driver.findElement(By.name(txt_loginname)).sendKeys(un); 
			driver.findElement(By.name(txt_password)).sendKeys(pw); 
			driver.findElement(By.name(btn_login)).click(); 
			System.out.println("Login successful");
			Reporter.log("Login successful"); 
			Log.info("Login successful");
			Thread.sleep(3000);
		}
		public void logout()
		{
			driver.findElement(By.linkText(link_logout)).click();
			System.out.println("Logout successful");
			Reporter.log("Logout successful"); 
			Log.info("Logout successful");
		} 
		public void enterFrame()
		{
			driver.switchTo().frame(frame);
			System.out.println("Enter into Frame");
		}
		public void exitFrame()
		{
			driver.switchTo().defaultContent();
			System.out.println("Exit from Frame");
		}
		public void addNewEmp() throws Exception
		{
			driver.findElement(By.xpath(btn_Add)).click();
			System.out.println("Add emp btn clicked");
			Thread.sleep(3000);
			driver.findElement(By.name(txt_EmpFN)).sendKeys(FN);
			driver.findElement(By.name(txt_EmpLN)).sendKeys(LN);
			driver.findElement(By.id(btn_Save)).click();
			System.out.println("New emp added"); 
			Thread.sleep(3000);
		} 
		public void delEmp()
		{
			System.out.println("delete emp");
		}
}