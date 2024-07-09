package TestCases;

import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.CM_GUIValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class CM_GUITesting extends TestBase {
	LoginPage login;
	CM_GUIValidation cm;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	cm = new CM_GUIValidation();
	}
	@Test(enabled = true ,priority = 1)
	public void CMFormDetailsTest() throws Exception
	{
//		dbs.openCMForm();
		cm.OpenCreatedCM();
		cm.CMFormDetails();
	}
	@Test(enabled = true ,priority = 2)
	public void contentSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.contentSectionValidation();
	}
	@Test(enabled = true ,priority = 3)
	public void AttachedFPMandBPMTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.AttachedFPMandBPM();
	}
	@Test(enabled = true ,priority = 3)
	public void FirstSectionAddButtonsTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.FirstSectionAddButtons();
	}
	@Test(enabled = true ,priority = 3)
	public void SMSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.SMSectionValidation();
	}
	@Test(enabled = true ,priority = 4)
	public void EPGSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.EPGSectionValidation();
	}
	@Test(enabled = true ,priority = 5)
	public void TechSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.TechSectionValidation();
	}
	@Test(enabled = true ,priority = 6)
	public void VideoSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.VideoSectionValidation();
	}
	@Test(enabled = true ,priority = 7)
	public void ConTechSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.ConTechSectionValidation();
	}
	@Test(enabled = true ,priority = 8)
	public void AudioSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.AudioSectionValidation();
	}
	@Test(enabled = true ,priority = 9)
	public void TechConSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.TechConSectionValidation();
	}
	@Test(enabled = true ,priority = 10)
	public void DistributionContactTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.DistributionContactDetails();
	}
	@Test(enabled = true ,priority = 11)
	public void DestEPGSectionValidationTest() throws Exception
	{
		cm.OpenCreatedCM();
		cm.DestEPGSectionValidation();
	}
	@Test(enabled = true ,priority = 12)
	public void SatelliteSectionValidation() throws Exception
	{
		cm.OpenCreatedCM();
		cm.SatelliteSectionValidation();
	}
	@Test(enabled = true ,priority = 13)
	public void CommentsSectionValidation() throws Exception
	{
		cm.OpenCreatedCM();
		cm.CommentsSectionValidation();
	}
	@AfterMethod
	public void exit() {
	driver.quit();
	}

}

