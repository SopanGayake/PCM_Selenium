package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.BPM_DropdownsValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class BPM_DropdownsTesting extends TestBase { 
	LoginPage login;
	Dashboard_GUI_Validation dbs;
	BPM_DropdownsValidation DD;
	
	@BeforeMethod
	public void setup() throws Exception  
	{
		initalization();
		login =	new LoginPage();
		login.loginToApp();
		dbs = new Dashboard_GUI_Validation();
		DD = new BPM_DropdownsValidation();
	}
	@Test(enabled = true)
	public void BackendMasterDropdownList() throws Exception
	{
		dbs.openBPMForm();
		DD.BackendMasterDropdownList();
	}
	@Test(enabled = true)
	public void AllowExpiredPackDDListTest() throws Exception
	{
		dbs.openBPMForm();
		DD.AllowExpiredPackDD();
	}
	@Test(enabled = true)
	public void TypeofPackDDTest() throws Exception
	{
		dbs.openBPMForm();
		DD.TypeofPackDD();
	}
	@Test(enabled = true)
	public void PackGenreDDTest() throws Exception
	{
		dbs.openBPMForm();
		DD.PackGenreDD();
	}
	@Test(enabled = true)
	public void PackStatusDDTest() throws Exception
	{
		dbs.openBPMForm();
		DD.PackStatusDD();
	}
	@Test(enabled = true)
	public void ChannelDetailsDropdownList() throws Exception
	{
		dbs.openBPMForm();
		DD.ChannelDetailsDropdownList();
	}
	@Test(enabled = true)
	public void FrontendPackDropdownListTest() throws Exception
	{
		dbs.openBPMForm();
		DD.FrontendPackDropdownList();
	}
	@Test(enabled = true)
	public void ChangeHistoryDDListTest() throws Exception
	{
		dbs.openBPMForm();
		DD.ChangeHistoryDDList();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}