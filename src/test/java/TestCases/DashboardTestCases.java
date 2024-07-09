package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class DashboardTestCases extends TestBase {
	
	LoginPage login;
	Dashboard_GUI_Validation dsb;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login = new LoginPage();
	dsb = new Dashboard_GUI_Validation(); 
	login.loginToApp();
	
	}
	@Test(enabled = true)
	public void verifyVerticalPannelTest() throws Exception
	{
		dsb.verifyVerticalPannel();
	}
	@Test(enabled = true)
	public void verifyTablesTest() throws Exception
	{
		dsb.verifiTables();
	}
	@Test(enabled = true)
	public void verifyHeaderMenusTest() throws Exception
	{
		dsb.verifyHeaderMenus();
	}
	@Test(enabled = true)
	public void formValidationTest() throws Exception
	{
		dsb.formValidation();
	}
	@Test(enabled = true)
	public void openCMFormTest() throws Exception
	{
		dsb.openCMForm(); 
		
	}
	@Test(enabled = true)
	public void openFPMFormTest() throws Exception
	{
		dsb.openFPMForm();
	}
	@Test(enabled = true)
	public void openBPMFormTest() throws Exception
	{
		dsb.openBPMForm();
	}
	@Test(enabled = true)
	public void openPCFFormTest() throws Exception
	{
		dsb.openPCFForm();
	}
	@Test(enabled = true)
	public void openCCFFormTest() throws Exception
	{
		dsb.openCCFForm();
	}
	@Test(enabled = true)
	public void OpenCMwithNameTest() throws Exception
	{
		dsb.OpenCMwithName();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
