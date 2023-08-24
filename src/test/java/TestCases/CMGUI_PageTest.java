package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.CM_GUI_Validation;
import Pages.Dashboard_GUI_Valoidation;
import Pages.LoginPage;

public class CMGUI_PageTest  extends TestBase {
	LoginPage login;
	Dashboard_GUI_Valoidation DSB;
	CM_GUI_Validation CM;
	@BeforeMethod
	public void setup() throws Exception, InterruptedException  
	{
	initalization();
	login = new LoginPage();
	login.loginToApp();
	Thread.sleep(2000);
	DSB = new Dashboard_GUI_Valoidation();
	DSB.OpenCMPage();
	CM = new CM_GUI_Validation();
	}
	@Test(enabled = true)
	public void validateCMDetailsFields() throws Exception  
	{
		CM.validateCMDetailsFields();
	}
	@Test(enabled = true)
	public void VerifyAttributes0_4() throws Exception  
	{
		CM.VerifyAttributes0_4();
	}
	@Test(enabled = true)
	public void SecondaryGenreAddButtonTest() throws Exception  
	{
		CM.SecondaryGenreAddButton();
	}
	@Test(enabled = true)
	public void SecondaryGenreAddButtonNegative() throws Exception  
	{
		CM.SecondaryGenreAddButtonNegative();
	}
	
	@AfterMethod
	public void exit() {
	driver.close();
	}

}

