package TestCases;


import org.testng.annotations.*;
import BasePackage.TestBase;
import Pages.AddButtonsValuesMapping;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class AddButtonsTesting extends TestBase { 
	LoginPage login;
	AddButtonsValuesMapping ABV;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	ABV = new AddButtonsValuesMapping();
	}
	@Test(enabled = true)
	public void CM_Channel_Master_Test() throws Exception
	{
		dbs.openCMForm();
		ABV.CM_Channel_Master();
	}
	@Test(enabled = true)
	public void CM_Logo_Platform_Test() throws Exception
	{
		dbs.openCMForm();
		ABV.CM_Logo_Platform();
	}
	@Test(enabled = true)
	public void FPM_FrontendPackMasterTest() throws Exception
	{
		dbs.openFPMForm();
		ABV.FPM_FrontendPackMaster();
	}
	@Test(enabled = true)
	public void FPM_ChannelDetailsTab() throws Exception
	{
		dbs.openFPMForm();
		ABV.FPM_ChannelDetailsTab();
	}
	@Test(enabled = true)
	public void BPM_ChannelDetailsTab() throws Exception
	{
		dbs.openBPMForm();
		ABV.BPM_ChannelDetailsTab();
	}
	@Test(enabled = true)
	public void BPM_BackendPackMaster() throws Exception
	{
		dbs.openBPMForm();
		ABV.BPM_BackendPackMaster();
	}
	@Test(enabled = true)
	public void PCF_PackageCreationForm() throws Exception
	{
		dbs.openPCFForm();
		ABV.PCF_PackageCreationForm();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
	