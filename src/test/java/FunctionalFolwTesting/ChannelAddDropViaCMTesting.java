package FunctionalFolwTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import FunctionalFlow.ChannelAddDropViaCM;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class ChannelAddDropViaCMTesting extends TestBase {
	LoginPage login;
	ChannelAddDropViaCM CMAD;
	Dashboard_GUI_Validation dsb;
	
	@BeforeMethod 
	public void setup() throws Exception
	{
	initalization();
	dsb = new Dashboard_GUI_Validation();
	login = new LoginPage();
	login.loginToApp();
	CMAD= new ChannelAddDropViaCM();
	CMAD.readExcelAndAssignValues();
	}
	@Test (enabled = false, priority =1)
	public void createNewCMTest() throws Exception
	{
		dsb.openCMForm();
		CMAD.CreateNewCM();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
