package TestCases;

import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.CMAtributsValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class CM_AttributesValidationTesting extends TestBase {
	LoginPage login;
	CMAtributsValidation cm;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	cm = new CMAtributsValidation();
	}
	
	@Test(enabled = true)
	public void FormDetailsTest() throws Exception
	{
		dbs.openCMForm();
		cm.formDetails();
	}
	@Test(enabled = true)
	public void TabsOfCMPageTest() throws Exception
	{
		dbs.openCMForm();
		cm.TabsOfCMPage();
	}
	@Test(enabled = true)
	public void ChannelMasterAtributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.ChannelMasterAtributes();
	}
	@Test(enabled = true)
	public void LogoPlatformTabTest() throws Exception
	{
		dbs.openCMForm();
		cm.LogoPlatformTab();
	}
	@Test(enabled = true)
	public void HistoryTabTest() throws Exception
	{
		dbs.openCMForm();
		cm.HistoryTab();
	}
	@Test(enabled = true)
	public void sectionListNameTest() throws Exception
	{
		dbs.openCMForm();
		cm.sectionListName();
	}
	
	@Test(enabled = true)
	public void ContentTeamAtributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.contentTeamAtributes();
	}
	@Test(enabled = true)
	public void SMSectionAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.smSectionAttributes();
	}
	
	@Test(enabled = true)
	public void EPGSectionAttributes() throws Exception
	{
		dbs.openCMForm();
		cm.epgSectionAttributes();
	}
	
	@Test(enabled = true)
	public void TechnologlySectionAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.technologlySectionAttributes();
	}
	@Test(enabled = true)
	public void VideoSectionAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.videoSectionAttributes();
	}
	@Test(enabled = true)
	public void ContentTechAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.contentTechAttributes();
	}
	
	@Test(enabled = true)
	public void AudioAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.audioAttributes();
	}
	
	@Test(enabled = true)
	public void TechnicalContactAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.technicalContactAttributes();
	}
	@Test(enabled = true)
	public void DistributionAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.distributionAttributes();
	}
	@Test(enabled = true)
	public void DistributionEPGAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.distributionEPGAttributes();
	}
	
	@Test(enabled = true) // remain to develop
	public void SatelliteAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.satelliteAttributes();
	}
	@Test(enabled = true) // remain to develop
	public void CommentsAttributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.commentsAttributes();
	}
	@Test(enabled = true) // remain to develop
	public void logoPlatformTabAtributesTest() throws Exception
	{
		dbs.openCMForm();
		cm.logoPlatformTabAtributes();
	}
	@Test(enabled = true) // remain to develop
	public void ApprovalsTabSection() throws Exception
	{
		dbs.openCMForm();
		cm.ApprovalsTabSection();
	}
	@Test(enabled = true) // remain to develop
	public void ChangeHistoryTabAtributes() throws Exception
	{
		dbs.openCMForm();
		cm.ChangeHistoryTabAtributes();
	}
	@AfterMethod
	public void exit()  {
		
	driver.close();
	}
}
