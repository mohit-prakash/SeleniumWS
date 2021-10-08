//TC001.java
package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator; 
import com.hrms.lib.General;

public class TC001 {
	@Test
	public void tc001() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General g = new General();
		//test case steps 
		g.openApplication(); 
		g.login();
		g.logout();
		g.closeBrowser();
	}

}
