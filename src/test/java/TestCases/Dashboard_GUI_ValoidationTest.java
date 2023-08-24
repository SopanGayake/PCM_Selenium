package TestCases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.Dashboard_GUI_Valoidation;
import Pages.LoginPage;

public class Dashboard_GUI_ValoidationTest extends TestBase {
	LoginPage login;
	Dashboard_GUI_Valoidation DSB;
	@BeforeMethod
	public void setup() throws Exception, InterruptedException  
	{
	initalization();
	login = new LoginPage();
	login.loginToApp();
	Thread.sleep(2000);
	DSB = new Dashboard_GUI_Valoidation();
	}
	
	@Test
	public void OpenCMPageTest() throws Exception
	{
		DSB.OpenCMPage();
	}
	@Test
	public void OpenFPMPageTest() throws Exception
	{
		DSB.OpenFPMPage();
	}
	@Test
	public void OpenBPMPageTest() throws Exception
	{
		DSB.OpenBPMPage();
	}
	@Test
	public void OpenPCFPageTest() throws Exception
	{
		DSB.OpenPCFPage();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
