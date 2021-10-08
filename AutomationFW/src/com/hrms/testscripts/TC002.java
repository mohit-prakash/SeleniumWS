package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test
	public void tc002() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General g = new General();
		g.openApplication();
		g.login();
		g.enterFrame();
		g.addNewEmp();
		g.exitFrame();
		g.logout();
		g.closeBrowser();
	}

}
