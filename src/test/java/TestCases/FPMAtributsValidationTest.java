package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.FPMAtributsValidation;
import Pages.LoginPage;

public class FPMAtributsValidationTest extends TestBase { 
	LoginPage login;
	FPMAtributsValidation fpm;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	initalization();
	fpm = new FPMAtributsValidation();
	}
	
	@Test(enabled = true)
	public void PackMasterDetailsSectionTest() throws Exception
	{
		fpm.allPackMasterDetailsSection();
	}
	
	@Test(enabled = true)
	public void PackAvailableforSection() throws Exception
	{
		fpm.allPackAvailableforSection();
	}
	@Test(enabled = true)
	public void CAIDDetailsTest() throws Exception
	{
		fpm.allCAIDDetails();
	}
	@Test(enabled = true)
	public void CompatiblePacksSectionTest() throws Exception
	{
		fpm.allCompatiblePacksSection();
	}
	@Test(enabled = true)
	public void AdditionalBusinessRulesSectionTest() throws Exception
	{
		fpm.allAdditionalBusinessRulesSection();
	}
	@Test(enabled = true)
	public void CommentsSectionTest() throws Exception
	{
		fpm.allCommentsSection();
	}
	@Test(enabled = true)
	public void ChannelAddrop() throws Exception
	{
		fpm.allChannelAddrop();
	}
	@Test(enabled = true) //Getting fail some time getting Backend Pack Mapping: element some time not
	public void BackendPackMappingSectionTest() throws Exception
	{
		fpm.allBackendPackMappingSection();
	}
	@Test(enabled = true) //Getting fail some time getting Approval: element some time not
	public void allApprovalsSectionTest() throws Exception
	{
		fpm.allApprovalsSection();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
	
}
