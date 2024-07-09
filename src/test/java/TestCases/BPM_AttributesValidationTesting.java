package TestCases;


import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.BPMAttributesValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class BPM_AttributesValidationTesting extends TestBase { 
	LoginPage login;
	BPMAttributesValidation bpm;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	bpm = new BPMAttributesValidation();
	}
	
	@Test(enabled = true)
	public void BPMformDetailsTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.BPMformDetails();
	}
	@Test(enabled = true)
	public void BPMTabListTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.BPMTabList();
	}
	@Test(enabled = true)
	public void backendPackAttributesTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.backendPackAttributes();
	}
	@Test(enabled = true)
	public void BackendPackSectionsTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.backendPackSections();
	}
	@Test(enabled = true)
	public void backendPackSectionAttributesTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.backendPackSectionAttributes();
	}
	@Test(enabled = true)
	public void BpmCommentsAttributesTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.bpmCommentsAttributes();
	}
	@Test(enabled = true)
	public void channelDetailsAttributesTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.channelDetailsAttributes();
	}
	@Test(enabled = true)
	public void channelDetailsSectionsTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.channelDetailsSections();
	}
	@Test(enabled = true)
	public void channelsDetailsAttributesTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.channelsDetailsAttributes();
	}
	@Test(enabled = true)
	public void channelsAddDropAttributesTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.channelsAddDropAttributes();
	}
	@Test(enabled = true)
	public void frontendPackMappingTab() throws Exception
	{
		dbs.openBPMForm();
		bpm.frontendPackMappingTab();
	}
	@Test(enabled = true)
	public void frontendPackSectionsTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.frontendPackSections();
	}
	@Test(enabled = true)
	public void frontendPackSecAttributes() throws Exception
	{
		dbs.openBPMForm();
		bpm.frontendPackSecAttributes();
	}
	@Test(enabled = true)
	public void ChangeHistoryTabTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.changeHistoryTab();
	}
	@Test(enabled = true)
	public void changeHistorySectionsTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.changeHistorySections();
	}
	@Test(enabled = true)
	public void changeHistorySecAttributesTest() throws Exception
	{
		dbs.openBPMForm();
		bpm.changeHistorySecAttributes();
	}
	
	@AfterMethod
	public void exit() {
	driver.close();
	}
}