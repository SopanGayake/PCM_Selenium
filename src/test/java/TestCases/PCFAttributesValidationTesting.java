package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.LoginPage;
import Pages.PCFAttributesValidation;

public class PCFAttributesValidationTesting extends TestBase { 
	LoginPage login;
	PCFAttributesValidation PCF;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	initalization();
	PCF = new PCFAttributesValidation();
	}
	
	@Test(enabled = true)
	public void PCFRequesterDetailsAtributesTest() throws Exception
	{
		PCF.allPCFRequesterDetailsAtributes();
	}
	@Test(enabled = true)
	public void allPackageDetailsSectionAtributesTest() throws Exception
	{
		PCF.allPackageDetailsSectionAtributes();
	}
	@Test(enabled = true)
	public void AllChargingSectionAtributsTest() throws Exception
	{
		PCF.AllChargingSectionAtributs();
	}
	@Test(enabled = true)
	public void AllChargingAdditionalDetailsSectionTest() throws Exception
	{
		PCF.AllChargingAdditionalDetailsSection();
	}
	@Test(enabled = true)
	public void allBingeCCFSectionTest() throws Exception
	{
		PCF.allBingeCCFSection();
	}
	@Test(enabled = true)
	public void allCARelatedConfigurationsSectionTest() throws Exception
	{
		PCF.allCARelatedConfigurationsSection();
	}
	
	@Test(enabled = true)
	public void allSiebelCompatibilityRestrictionsSectionTest() throws Exception
	{
		PCF.allSiebelCompatibilityRestrictionsSection();
	}
	
	@Test(enabled = true)
	public void allAdditionalBusinessRulesTest() throws Exception
	{
		PCF.allAdditionalBusinessRules();
	}
	
	@Test(enabled = true)
	public void allSelfCareConfigurationsSectionTest() throws Exception
	{
		PCF.allSelfCareConfigurationsSection();
	}
	
	@Test(enabled = true)
	public void allSMSConfigurationsSection() throws Exception
	{
		PCF.allSMSConfigurationsSection();
	}
	@Test(enabled = true)
	public void allNuanceConfigurationsSectionTest() throws Exception
	{
		PCF.allNuanceConfigurationsSection();
	}
	@Test(enabled = true) 
	public void PRMSalesConfigurationsSectionTest() throws Exception
	{
		PCF.PRMSalesConfigurationsSection();
	}
	@Test(enabled = true) 
	public void allMsalesSectionAtributesTest() throws Exception
	{
		PCF.allMsalesSectionAtributes();
	}
	@Test(enabled = true) 
	public void allMissedCallConfigurationsSectionTest() throws Exception
	{
		PCF.allMissedCallConfigurationsSection();
	}
	@Test(enabled = true) 
	public void allBIRelatedConfigurationsSectionTest() throws Exception
	{
		PCF.allBIRelatedConfigurationsSection();
	}
	@Test(enabled = true)
	public void allCompatiblePackstobeexpiredTest() throws Exception
	{
		PCF.allCompatiblePackstobeexpired();
	}
	@Test(enabled = true)
	public void allChargingApplicableforNRCPacksTest() throws Exception
	{
		PCF.allChargingApplicableforNRCPacks();
	}
	@Test(enabled = true) 
	public void allChargingApplicableforRCPacksTest() throws Exception
	{
		PCF.allChargingApplicableforRCPacks();
	}
	@Test(enabled = true) 
	public void allMissedCalltoSPMCampaignConfigurationTest() throws Exception
	{
		PCF.allMissedCalltoSPMCampaignConfiguration();
	}
	
	@AfterMethod
	public void exit() {
	driver.close();
	}
}
