package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.CM_DropdownsValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class CM_DropdownsTesting extends TestBase { 
	LoginPage login;
	Dashboard_GUI_Validation dbs;
	CM_DropdownsValidation DD;
	
	@BeforeMethod
	public void setup() throws Exception  
	{
		initalization();
		login =	new LoginPage();
		login.loginToApp();
		dbs = new Dashboard_GUI_Validation();
		DD = new CM_DropdownsValidation();
	}
	@Test(enabled = true)
	public void ChannelMasterDropdownList() throws Exception
	{
		dbs.openCMForm();
		DD.ChannelMasterDropdownList();
	}
	@Test(enabled = true)
	public void NameOfBroadcasterDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.NameOfBroadcasterDD();
	}
	@Test(enabled = true)
	public void PrimaryGenreDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.PrimaryGenreDD();
	}
	@Test(enabled = true)
	public void TypeofChannelDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.TypeofChannelDD();
	}
	@Test(enabled = true)
	public void SDMappingYesNoDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.SDMappingYesNoDD();
	}
	@Test(enabled = true)
	public void RentalFlagDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.RentalFlagDD();
	}
	@Test(enabled = true)
	public void PayableFlagDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.PayableFlagDD();
	}
	@Test(enabled = true)
	public void TypePlayServicesDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.TypePlayServicesDD();
	}
	@Test(enabled = true)
	public void ReaddchannelDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.ReaddchannelDD();
	}
	@Test(enabled = true)
	public void ChannelStatusDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.ChannelStatusDD();
	}
	@Test(enabled = true)
	public void ChannelModelDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.ChannelModelDD();
	}
	@Test(enabled = true)
	public void PackagingGenreDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.PackagingGenreDD();
	}
	@Test(enabled = true)
	public void RecommendedGenreDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.RecommendedGenreDD();
	}
	@Test(enabled = true)
	public void EncryptedDDTest() throws Exception
	{
		dbs.openCMForm();
		DD.EncryptedDD();
	}
	@Test(enabled = true)
	public void ServiceTypeDD() throws Exception
	{
		dbs.openCMForm();
		DD.ServiceTypeDD();
	}
	@Test(enabled = true)
	public void LogosPlatformTabDropdownList() throws Exception
	{
		dbs.openCMForm();
		DD.LogosPlatformTabDropdownList();
	}
	@Test(enabled = true)
	public void ChangeHistoryTabDropdownList() throws Exception
	{
		dbs.openCMForm();
		DD.ChangeHistoryTabDropdownList();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}