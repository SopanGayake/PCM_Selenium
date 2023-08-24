package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.BPMAttributesValidation;
import Pages.LoginPage;

public class BPMAtributesValidationTesting extends TestBase { 
	LoginPage login;
	BPMAttributesValidation BPM;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	initalization();
	BPM = new BPMAttributesValidation();
	}
	
	@Test(enabled = true)
	public void allBackendPackMasterSectionTest() throws Exception
	{
		BPM.allBackendPackMasterSection();
	}
	@Test(enabled = true)
	public void allCommentsSectionTest() throws Exception
	{
		BPM.allCommentsSection();
	}
	@Test(enabled = true)
	public void allChannelsAddDropSectionTest() throws Exception
	{
		BPM.allChannelsAddDropSection();
	}
	@Test(enabled = true)
	public void allFrontendPackMappingSection() throws Exception
	{
		BPM.allFrontendPackMappingSection();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
} 
