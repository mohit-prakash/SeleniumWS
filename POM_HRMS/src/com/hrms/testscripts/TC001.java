package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 {
	@Test
	public static void tc001()
	{
		//TestCase steps
		BaseClass.openApplication();
		VerifyPage.verifyTitle("Hrms");
		LoginPage.login("admin", "admin");
		VerifyPage.verifyTitle("OrangeHRM");
		LogoutPage.logout();
		BaseClass.closeApplication();	
	}

}
