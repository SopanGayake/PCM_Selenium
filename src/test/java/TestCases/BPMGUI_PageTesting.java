package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.BPMGUI_Page;
import Pages.LoginPage;
import Pages.PCF_GUI_Page;

public class BPMGUI_PageTesting extends TestBase {
	LoginPage login;
	BPMGUI_Page BPM;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	initalization();
	BPM = new BPMGUI_Page();
	}
//	@Test(enabled = false)
//	public void getAllAtributsTest() throws IOException, InterruptedException
//	{
//		BPM.allCMAtributes();
//	}
//	@Test(enabled = true)
//	public void PCFRequesterDetailsAtributesTest() throws Exception
//	{
//		BPM.allPCFRequesterDetailsAtributes();
//	}
//	@Test(enabled = true)
//	public void allPackageDetailsSectionAtributesTest() throws Exception
//	{
//		BPM.allPackageDetailsSectionAtributes();
//	}
//	@Test(enabled = true)
//	public void AllChargingSectionAtributsTest() throws Exception
//	{
//		BPM.AllChargingSectionAtributs();
//	}
//	@Test(enabled = true)
//	public void AllChargingAdditionalDetailsSectionTest() throws Exception
//	{
//		BPM.AllChargingAdditionalDetailsSection();
//	}
//	@Test(enabled = true)
//	public void allBingeCCFSectionTest() throws Exception
//	{
//		BPM.allBingeCCFSection();
//	}
//	@Test(enabled = true)
//	public void allCARelatedConfigurationsSectionTest() throws Exception
//	{
//		BPM.allCARelatedConfigurationsSection();
//	}
//	
//	@Test(enabled = true)
//	public void allSiebelCompatibilityRestrictionsSectionTest() throws Exception
//	{
//		BPM.allSiebelCompatibilityRestrictionsSection();
//	}
//	
//	@Test(enabled = true)
//	public void allAdditionalBusinessRulesTest() throws Exception
//	{
//		BPM.allAdditionalBusinessRules();
//	}
//	
//	@Test(enabled = true)
//	public void allSelfCareConfigurationsSectionTest() throws Exception
//	{
//		BPM.allSelfCareConfigurationsSection();
//	}
//	
//	@Test(enabled = true)
//	public void allSMSConfigurationsSection() throws Exception
//	{
//		BPM.allSMSConfigurationsSection();
//	}
//	@Test(enabled = true)
//	public void allNuanceConfigurationsSectionTest() throws Exception
//	{
//		BPM.allNuanceConfigurationsSection();
//	}
//	@Test(enabled = true) 
//	public void PRMSalesConfigurationsSectionTest() throws Exception
//	{
//		BPM.PRMSalesConfigurationsSection();
//	}
//	@Test(enabled = true) 
//	public void allMsalesSectionAtributesTest() throws Exception
//	{
//		BPM.allMsalesSectionAtributes();
//	}
//	@Test(enabled = true) 
//	public void allMissedCallConfigurationsSectionTest() throws Exception
//	{
//		BPM.allMissedCallConfigurationsSection();
//	}
//	@Test(enabled = true) 
//	public void allBIRelatedConfigurationsSectionTest() throws Exception
//	{
//		BPM.allBIRelatedConfigurationsSection();
//	}
//	@Test(enabled = true)
//	public void allChargingApplicableforNRCPacksTest() throws Exception
//	{
//		BPM.allChargingApplicableforNRCPacks();
//	}
//	@Test(enabled = true) 
//	public void allChargingApplicableforRCPacksTest() throws Exception
//	{
//		BPM.allChargingApplicableforRCPacks();
//	}
//	@Test(enabled = true) 
//	public void allMissedCalltoSPMCampaignConfigurationTest() throws Exception
//	{
//		BPM.allMissedCalltoSPMCampaignConfiguration();
//	}
	
	@AfterMethod
	public void exit() {
	driver.close();
	}
}
