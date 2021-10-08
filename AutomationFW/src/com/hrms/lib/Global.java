//Global.java
package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//===================Varibles info======================
	public WebDriver driver;
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php"; 
	public String un = "admin";
	public String pw = "admin";
	public String FN = "Mohit";
	public String LN = "Prakash";
	//=======================Objects=====================
	public String txt_loginname = "txtUserName"; 
	public String txt_password = "txtPassword"; 
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String btn_Add = "//input[@value='Add']";
	public String txt_EmpFN = "txtEmpFirstName";
	public String txt_EmpLN = "txtEmpLastName";
	public String btn_Save = "btnEdit";
	public String frame = "rightMenu";
}
