package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LoginPage extends BaseClass {
	//objects
	static By txt_Loginname = By.name("txtUserName");
	static By txt_Password = By.name("txtPassword");
	static By btn_Login= By.name("Submit");
	//function
	public static void login(String un,String pwd)
	{
		driver.findElement(txt_Loginname).sendKeys(un);
		driver.findElement(txt_Password).sendKeys(pwd);
		driver.findElement(btn_Login).click();
		Reporter.log("Login Successfull");
	}
}
