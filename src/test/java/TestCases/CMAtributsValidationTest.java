package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.CMAtributsValidation;
import Pages.LoginPage;

public class CMAtributsValidationTest extends TestBase {
	LoginPage login;
	CMAtributsValidation cm;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	initalization();
	cm = new CMAtributsValidation();
	}
	
	@Test(enabled = true)
	public void TabsOfCMPageTest() throws Exception
	{
		cm.TabsOfCMPage();
	}
	@Test(enabled = true)
	public void SectionsChannelMasterTest() throws Exception
	{
		cm.SectionsChannelMaster();
	}
	@Test(enabled = true)
	public void SectionslogoPlatformTabTest() throws Exception
	{
		cm.SectionslogoPlatformTab();
	}
	@Test(enabled = true)
	public void SectionsApprovalTest() throws Exception
	{
		cm.SectionsApproval();
	}
	@Test(enabled = true)
	public void ContentTeamAtributesTest() throws Exception
	{
		cm.ContentTeamAtributes();
	}
	@Test(enabled = true)
	public void SubscriberMarketingTeamAtributsTest() throws Exception
	{
		cm.SubscriberMarketingTeamAtributs();
	}
	
	@Test(enabled = true)
	public void EPGTeamAtributsTest() throws Exception
	{
		cm.EPGTeamAtributs();
	}
	
	@Test(enabled = true)
	public void TechnologyTeamTest() throws Exception
	{
		cm.TechnologyTeamAtributes();
	}
	@Test(enabled = true)
	public void allVideoDetailsAtributesTest() throws Exception
	{
		cm.VideoDetailsAtributes();
	}
	@Test(enabled = true)
	public void ContentTechnologyAtributesTest() throws Exception
	{
		cm.ContentTechnologyAtributes();
	}
	
	@Test(enabled = true)
	public void AudioDetailsAtributesTest() throws Exception
	{
		cm.AudioDetailsAtributes();
	}
	
	@Test(enabled = true)
	public void DistributionContactDetailsAtributesTest() throws Exception
	{
		cm.DistributionContactDetailsAtributes();
	}
	@Test(enabled = true)
	public void DistributionContactDetailsEPGTest() throws Exception
	{
		cm.DistributionContactDetailsEPG();
	}
	
	@Test(enabled = true)
	public void SatelliteDetailsAtributesTest() throws Exception
	{
		cm.SatelliteDetailsAtributes();
	}
	
	@Test(enabled = true) // remain to develop
	public void logoPlatformTabTest() throws Exception
	{
		cm.logoPlatformTab();
	}
	@Test(enabled = true) // remain to develop
	public void ApprovalAtributesTest() throws Exception
	{
		cm.ApprovalAtributes();
	}
	@AfterMethod
	public void exit()  {
		
	driver.close();
	}
}
