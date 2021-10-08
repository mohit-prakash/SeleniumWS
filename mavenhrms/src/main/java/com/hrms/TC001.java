package com.hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
	@Test
	public void tc001() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumWS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Maximize current window
		driver.manage().window().maximize();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
