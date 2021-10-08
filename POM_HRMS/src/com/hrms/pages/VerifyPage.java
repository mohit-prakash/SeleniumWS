package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass 
{
	//Verify
	public static void verifyTitle(String title)
	{
		if(driver.getTitle().equals(title))
			Reporter.log("Title Matched");
		else
		{
			Reporter.log("Title Not Matched");
			Reporter.log(driver.getTitle());
		}
	}
}
