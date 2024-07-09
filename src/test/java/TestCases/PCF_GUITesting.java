package TestCases;

import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;
import Pages.PCF_GUIValidation;

public class PCF_GUITesting extends TestBase {
	LoginPage login;
	PCF_GUIValidation pcf;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	pcf = new PCF_GUIValidation();
	}
	@Test (enabled = true,priority =1)
	public void A_PCFFormDetailsTest() throws Exception
	{
//		pcf.OpenCreatedPCF();
		dbs.openPCFForm();
		pcf.PCFFormDetails();
	}
	@Test (enabled = true, priority =2)
	public void PCFPriceValues() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.PCFPriceValues();
	}
	@Test (enabled = true ,priority =2)
	public void B_RequesterDetailsSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.RequesterDetailsSectionValidation();
	}
	@Test (enabled = true,priority =3)
	public void PackageDetailsSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.PackageDetailsSectionValidation();
	}
	@Test (enabled = true ,priority =4)
	public void AddButtonsValidationTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.AddButtonsValidation();
	}
	@Test (enabled = true ,priority =5)
	public void ChargingSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingSectionValidation();
	}
	@Test (enabled = true ,priority =6)
	public void Charging_AddTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.Charging_AddSectionValidation();
	}
	@Test (enabled = true,priority =6)
	public void BingeCCFSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.BingeCCFSectionValidation();
	}
	@Test (enabled = true ,priority =6)
	public void CARelatedSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.CARelatedSectionValidation();
	}
	@Test (enabled = true ,priority =6)
	public void SiebelCompSectonTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.SiebelCompSectonValidation();
	}
	@Test (enabled = true ,priority =6)
	public void AdditionalBusinessTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.AdditionalBusinessValidation();
	}
	@Test (enabled = true ,priority =6)
	public void SelfCareSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.SelfCareSectionValidation();
	}
	@Test (enabled = true ,priority =6)
	public void SMSConfSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.SMSConfSectionValidation();
	}
	@Test (enabled = true ,priority =6)
	public void CampaignConfigurations() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.CampaignConfigurations();
	}
	@Test (enabled = true ,priority =6)
	public void NuanceConfigSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.NuanceConfigSectionValidation();
	}
	@Test (enabled = true,priority =7)
	public void PRMSalesSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.PRMSalesSectionValidation();
	}
	@Test (enabled = true,priority =7)
	public void mSalesSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.mSalesSectionValidation();
	}
	@Test (enabled = true ,priority =7)
	public void MissedCallSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.MissedCallSectionValidation();
	}
	@Test(enabled = true, priority =7)
	public void BIRelatedSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.BIRelatedSectionValidation();
	}
	@Test (enabled = true,priority =7)
	public void CompatiblePacksSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.CompatiblePacksSectionValidation();
	}
	@Test (enabled = true ,priority =7)
	public void ChargingApplicableNRCTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingApplicableNRCValidation();
	}
	@Test (enabled = true ,priority =7)
	public void ChargingApplicableRCTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingApplicableRCValidation();
	}
	@Test (enabled = true ,priority =7)
	public void MissedCallSPMTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.MissedCallSPMValidation();
	}
	@Test (enabled = true ,priority =7)
	public void EligibilityTradeTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.EligibilityTradeValidation();
	}
	@Test (enabled = true ,priority =7)
	public void EligibilityResidentialTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.EligibilityResidentialValidation();
	}
	@Test (enabled = true ,priority =7)
	public void EligibilityRuleValidation() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.EligibilityRuleValidation();
	}
	@Test (enabled = true ,priority =7)
	public void EligibilityCommercialTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.EligibilityCommercialValidation();
	}
	@Test (enabled = true ,priority =7)
	public void EligibilityCorporateTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.EligibilityCorporateValidation();
	}
	@Test (enabled = true ,priority =7)
	public void EligibilitySubCategoryValidation() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.EligibilitySubCategoryValidation();
	}
	@Test (enabled = true ,priority =7)
	public void ChargingTradeValidation() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingTradeValidation();
	}
	@Test (enabled = true ,priority =7)
	public void ChargingResidentialTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingResidentialValidation();
	}
	@Test (enabled = true ,priority =7)
	public void ChargingRuleTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingRuleValidation();
	}
	@Test (enabled = true ,priority =7)
	public void ChargingCommercialTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingCommercialValidation();
	}
	@Test (enabled = true ,priority =7)
	public void ChargingCorporateTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingCorporateValidation();
	}
	@Test (enabled = true ,priority =7)
	public void ChargingSubCategoryTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChargingSubCategoryValidation();
	}
	@Test (enabled = true,priority =7)
	public void B_MailSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.B_MailSectionValidation();
	}
	@Test (enabled = true,priority =7)
	public void BillDescriptionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.BillDescriptionSectionValidation();
	}
	@Test (enabled = true,priority =7)
	public void ReviewDetailsSectionValidation() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ReviewDetailsSectionValidation();
	}
	@Test (enabled = true,priority =7)
	public void BusinessReviewTabValidation() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.BusinessReviewTabValidation();
	}
	@Test (enabled = true,priority =7)
	public void ITReviewSectionValidation() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ITReviewSectionValidation();
	}
	@Test (enabled = true,priority =7)
	public void ITSolutionNoteFiles() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ITSolutionNoteFiles();
	}
	@Test (enabled = true ,priority =7)
	public void EffortEstimationTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.EffortEstimationValidation();
	}
	@Test (enabled = true ,priority =7)
	public void DiscussionSectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.DiscussionSectionValidation();
	}
	@Test (enabled = true,priority =7)
	public void ChangeHistorySectionTest() throws Exception
	{
		pcf.OpenCreatedPCF();
		pcf.ChangeHistorySectionValidation();
	}
	
	@AfterMethod
	public void exit() {
	driver.quit();
	}
}