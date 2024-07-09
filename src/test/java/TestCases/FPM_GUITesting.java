package TestCases;

import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.Dashboard_GUI_Validation;
import Pages.FPM_GUIValidation;
import Pages.LoginPage;

public class FPM_GUITesting extends TestBase {
	LoginPage login;
	FPM_GUIValidation fpm;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	fpm = new FPM_GUIValidation();
	}
	@Test(enabled = true)
	public void A_FPMFormDetailsTest() throws Exception
	{
		fpm.OpenCreatedFPM();
//		dbs.openFPMForm();
		fpm.FPMFormDetails();
	}
	@Test(enabled = true)
	public void FPMPriceValues() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.FPMPriceValues();
	}
	@Test(enabled = true)
	public void B_FrontendMasterCheckBOXes() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.FrontendMasterCheckBOXes();
	}
	@Test(enabled = true)
	public void C_FrontendMasterCheckBOXes2() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.FrontendMasterCheckBOXes2();
	}
	@Test(enabled = true)
	public void C_FrontendMasterInputs() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.FrontendMasterInputs();
	}
	@Test(enabled = true)
	public void C_FrontendMasterAddLinkbox() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.FrontendMasterAddLinkbox();
	}
	@Test(enabled = true)
	public void C_PackAvailableSectionTest() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.PackAvailableSectionValidation();
	}
	@Test(enabled = true)
	public void D_CAIDDetailsSectionValidation() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.CAIDDetailsSectionValidation();
	}
	@Test(enabled = true)
	public void D_CompatiblePacksValidation() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.CompatiblePacksValidation();
	}
	@Test(enabled = true)
	public void D_AdditionalBusinessValidation() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.AdditionalBusinessValidation();
	}
	@Test(enabled = true)
	public void D_CommentsValidation() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.CommentsValidation();
	}
	@Test(enabled = true)
	public void E_AddChannelValidation() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.AddChannelValidation();
	}
	@Test(enabled = true)
	public void E_DropChannelValidation() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.DropChannelValidation();
	}
	@Test(enabled = true)
	public void F_backendPackMappingTab() throws Exception
	{
		fpm.OpenCreatedFPM();
		fpm.backendPackMappingTab();
	}
	@AfterMethod
	public void exit() {
	driver.quit();
	}
}