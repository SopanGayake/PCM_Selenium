package TestCases;

import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.BPM_GUIValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class BPM_GUIPageTesting extends TestBase {
	LoginPage login;
	BPM_GUIValidation bpm;
	Dashboard_GUI_Validation dsb;
	
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dsb = new Dashboard_GUI_Validation();
	bpm = new BPM_GUIValidation();
	}
	@Test(enabled = true ,priority = 1)
	public void A_BPMFormDetailsTest() throws Exception
	{
		bpm.OpenCreatedBPM();
//		dsb.openBPMForm();
		bpm.BPMFormDetails();
	}
	@Test(enabled = true ,priority = 2)
	public void BackendPackMasterTest() throws Exception
	{
		bpm.OpenCreatedBPM();
		bpm.BackendPackMasterValidation();
	}
	@Test(enabled = true ,priority = 3)
	public void ChannelsAddDropTest() throws Exception
	{
		bpm.OpenCreatedBPM();
		bpm.ChannelsAddDropValidation();
	}
	@Test(enabled = true ,priority = 4)
	public void FrontendPackValidation() throws Exception
	{
		bpm.OpenCreatedBPM();
		bpm.FrontendPackValidation();
	}
	@Test(enabled = true ,priority = 5)
	public void G_ChangeHistorySectionTest() throws Exception
	{
		bpm.OpenCreatedBPM();
		bpm.ChangeHistorySectionValidation();
	}
	@AfterMethod
	public void exit() {
	driver.quit();
	}
}