package TestCases;


import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.Dashboard_GUI_Validation;
import Pages.FPMAtributsValidation;
import Pages.LoginPage;

//System.out.println(ExcelTestData);
//System.out.println(webSectionList);

public class FPM_AttributesValidationTesting extends TestBase { 
	LoginPage login;
	FPMAtributsValidation fpm;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	fpm = new FPMAtributsValidation();
	}
	@Test(enabled = true)
	public void FPMformDetailsTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.FPMformDetails();
	}
	@Test(enabled = true)
	public void FPMTabList() throws Exception
	{
		dbs.openFPMForm();
		fpm.FPMTabList();
	}
	@Test(enabled = true)
	public void frontendPackTabAttributes() throws Exception
	{
		dbs.openFPMForm();
		fpm.frontendPackTabAttributes();
	}
	@Test(enabled = true)
	public void frontendPackSectionsTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.frontendPackSections();
	}
	@Test(enabled = true)
	public void frontendPackDetailsAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.frontendPackDetailsAttributes();
	}
	@Test(enabled = true)
	public void PackAvailableAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.packAvailableAttributes();
	}
	@Test(enabled = true)
	public void cAIDDetailsAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.cAIDDetailsAttributes();
	}
	@Test(enabled = true)
	public void compatiblePacksAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.compatiblePacksAttributes();
	}
	@Test(enabled = true)
	public void additionalBusinessAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.additionalBusinessAttributes();
	}
	@Test(enabled = true)
	public void commentsAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.commentsAttributes();
	}
	@Test(enabled = true)
	public void channelDetailsTabTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.channelDetailsTab();
	}
	@Test(enabled = true)
	public void channelDetailsSectionsTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.channelDetailsSections();
	}
	@Test(enabled = true)
	public void AddNewChannelTtest() throws Exception
	{
		dbs.openFPMForm();
		fpm.AddNewChannels();
	}
	@Test(enabled = true)
	public void channelDetailsSection() throws Exception
	{
		dbs.openFPMForm();
		fpm.ChannelDetailsSection();
	}
	@Test(enabled = true)
	public void channelAddDropDetails() throws Exception
	{
		dbs.openFPMForm();
		fpm.ChannelAddDropDetails();
	}
	@Test(enabled = true)
	public void BackendPackTabTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.backendPackTab();
	}
	@Test(enabled = true)
	public void backendPackSectionsTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.backendPackSections();
	}
	@Test(enabled = true)
	public void backendPackAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.backendPackAttributes();
	}
	@Test(enabled = true)
	public void linksTabTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.linksTab();
	}
	@Test(enabled = true)
	public void linksSectionsTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.linksSections();
	}
	@Test(enabled = true)
	public void attachmentsAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.attachmentsAttributes();
	}
	@Test(enabled = true)
	public void linksAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.linksAttributes();
	}
	@Test(enabled = true)
	public void ChangeHistoryTab() throws Exception
	{
		dbs.openFPMForm();
		fpm.changeHistoryTab();
	}
	@Test(enabled = true)
	public void changeHistorySections() throws Exception
	{
		dbs.openFPMForm();
		fpm.changeHistorySections();
	}
	@Test(enabled = true)
	public void changeHistoryAttributesTest() throws Exception
	{
		dbs.openFPMForm();
		fpm.changeHistoryAttributes();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}