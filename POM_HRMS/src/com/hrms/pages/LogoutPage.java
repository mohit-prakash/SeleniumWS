package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass {
	//Objects
	static By link_Logout = By.linkText("Logout");
	//Function
	public static void logout()
	{
		driver.findElement(link_Logout).click();
		Reporter.log("Logout Completed");
	}
}
