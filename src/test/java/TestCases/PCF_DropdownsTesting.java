package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;
import Pages.PCF_DropdownsValidation;

public class PCF_DropdownsTesting extends TestBase { 
	LoginPage login;
	Dashboard_GUI_Validation dbs;
	PCF_DropdownsValidation DD;
	
	@BeforeMethod
	public void setup() throws Exception  
	{
		initalization();
		login =	new LoginPage();
		login.loginToApp();
		dbs = new Dashboard_GUI_Validation();
		DD = new PCF_DropdownsValidation();
	}
	@Test(enabled = true)
	public void packageCreationFormDropdownList() throws Exception
	{
		dbs.openPCFForm();
		DD.packageCreationFormDropdownList();
	}
	@Test(enabled = true)
	public void functionDepartmentDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.functionDepartmentDD();
	}
	@Test(enabled = true)
	public void severityDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.severityDD();
	}
	@Test(enabled = true)
	public void priorityDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.priorityDD();
	}
	@Test(enabled = true)
	public void PackStructureDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PackStructureDD();
	}
	@Test(enabled = true)
	public void TypeofPackDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.TypeofPackDD();
	}
	@Test(enabled = true)
	public void OfferTypeDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.OfferTypeDD();
	}
	@Test(enabled = true)
	public void PackGradeTypeDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PackGradeTypeDD();
	}
	@Test(enabled = true)
	public void BoxCompatibilityDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.BoxCompatibilityDD();
	}
	@Test(enabled = true)
	public void UnitOfMeasureDD() throws Exception
	{
		dbs.openPCFForm();
		DD.UnitOfMeasureDD();
	}
	@Test(enabled = true)
	public void PackVariationDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PackVariationDD();
	}
	@Test(enabled = true)
	public void PackageChargeTypeDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PackageChargeTypeDD();
	}
	@Test(enabled = true)
	public void LDPCommunicationDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.LDPCommunicationDD();
	}
	@Test(enabled = true)
	public void PackageDashboardDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PackageDashboardDD();
	}
	@Test(enabled = true)
	public void RetrofitCreditPackDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.RetrofitCreditPackDD();
	}
	@Test(enabled = true)
	public void UnitofMeasureDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.UnitofMeasureDD();
	}
	@Test(enabled = true)
	public void RetrofitFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.RetrofitFlagDD();
	}
	@Test(enabled = true)
	public void RentalFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.RentalFlagDD();
	}
	@Test(enabled = true)
	public void PayableFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PayableFlagDD();
	}
	@Test(enabled = true)
	public void DASLevelValidationDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.DASLevelValidationDD();
	}
	@Test(enabled = true)
	public void PDMProductLineDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PDMProductLineDD();
	}
	@Test(enabled = true)
	public void ChanneltobeDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ChanneltobeDD();
	}
	@Test(enabled = true)
	public void EligibleforMultiDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.EligibleforMultiDD();
	}
	@Test(enabled = true)
	public void EligibleforMultiTVDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.EligibleforMultiTVDD();
	}
	@Test(enabled = true)
	public void PDMUoMDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PDMUoMDD();
	}
	@Test(enabled = true)
	public void PackTypePDMDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PackTypePDMDD();
	}
	@Test(enabled = true)
	public void AllignableFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.AllignableFlagDD();
	}
	@Test(enabled = true)
	public void NCFdiscountApplicableDDtest() throws Exception
	{
		dbs.openPCFForm();
		DD.NCFdiscountApplicableDD();
	}
	@Test(enabled = true)
	public void DiscountTypeDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.DiscountTypeDD();
	}
	@Test(enabled = true)
	public void EligibleforRoundDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.EligibleforRoundDD();
	}
	@Test(enabled = true)
	public void IsTraiEnableFlagTest() throws Exception
	{
		dbs.openPCFForm();
		DD.IsTraiEnableFlag();
	}
	@Test(enabled = true)
	public void OTTComboFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.OTTComboFlagDD();
	}
	@Test(enabled = true)
	public void SpecialNCFFlag() throws Exception
	{
		dbs.openPCFForm();
		DD.SpecialNCFFlag();
	}
	@Test(enabled = true)
	public void DunningExclusionDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.DunningExclusionDD();
	}
	@Test(enabled = true)
	public void ShouldthisPackDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ShouldthisPackDD();
	}
	@Test(enabled = true)
	public void SubscriberTypeDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.SubscriberTypeDD();
	}
	@Test(enabled = true)
	public void ISBingePlusFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ISBingePlusFlagDD();
	}
	@Test(enabled = true)
	public void ATVSourceDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ATVSourceDD();
	}
	@Test(enabled = true)
	public void FreePackFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.FreePackFlagDD();
	}
	@Test(enabled = true)
	public void SubscriptionallowedDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.SubscriptionallowedDD();
	}
	@Test(enabled = true)
	public void TypeofPackDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TypeofPackDD2();
	}
	@Test(enabled = true)
	public void DurationMonthlyDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.DurationMonthlyDD();
	}
	@Test(enabled = true)
	public void RenewalallowedDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.RenewalallowedDD();
	}
	@Test(enabled = true)
	public void ChannelCategoryDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ChannelCategoryDD();
	}
	@Test(enabled = true)
	public void BroadcasterCategoryDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.BroadcasterCategoryDD();
	}
	@Test(enabled = true)
	public void TataPlayPacksCategoryDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.TataPlayPacksCategoryDD();
	}
	@Test(enabled = true)
	public void SourceforOTT() throws Exception
	{
		dbs.openPCFForm();
		DD.SourceforOTT();
	}
	@Test(enabled = true)
	public void WebEnabledFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.WebEnabledFlagDD();
	}
	@Test(enabled = true)
	public void AppEnabledFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.AppEnabledFlagDD();
	}
	@Test(enabled = true)
	public void SubscriptionAllowedDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.SubscriptionAllowedDD();
	}
	@Test(enabled = true)
	public void SubscriptionNuanceDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.SubscriptionNuanceDD();
	}
	@Test(enabled = true)
	public void TypeofOfferDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.TypeofOfferDD();
	}
	@Test(enabled = true)
	public void SubscriptionallowedPRMDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.SubscriptionallowedPRMDD();
	}
	@Test(enabled = true)
	public void ToMadeAvailableDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ToMadeAvailableDD();
	}
	@Test(enabled = true)
	public void TomadeavailableDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.TomadeavailableDD();
	}
	@Test(enabled = true)
	public void AvailableforDealersDD() throws Exception
	{
		dbs.openPCFForm();
		DD.AvailableforDealersDD();
	}
	@Test(enabled = true)
	public void BoxValidationmSalesDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.BoxValidationmSalesDD();
	}
	@Test(enabled = true)
	public void ActionDDtTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ActionDD();
	}
	@Test(enabled = true)
	public void SubscriptionChangesDD() throws Exception
	{
		dbs.openPCFForm();
		DD.SubscriptionChangesDD();
	}
	@Test(enabled = true)
	public void DurationVariantDD() throws Exception
	{
		dbs.openPCFForm();
		DD.DurationVariantDD();
	}
	@Test(enabled = true)
	public void DurationPacksToExpiredDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PacksToExpired();
	}
	@Test(enabled = true)
	public void PackAdditionPMTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PackAdditionSPM();
	}
	@Test(enabled = true)
	public void AmazonPrimePideoTest() throws Exception
	{
		dbs.openPCFForm();
		DD.AmazonPrimePideo();
	}
	@Test(enabled = true)
	public void AnyBoxTypeValidationTest() throws Exception
	{
		dbs.openPCFForm();
		DD.AnyBoxTypeValidation();
	}
	@Test(enabled = true)
	public void EligibilityAccountTypeDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.EligibilityAccountTypeDDList();
	}
	@Test(enabled = true)
	public void EligibleMultiTVPackAdditionTest() throws Exception
	{
		dbs.openPCFForm();
		DD.EligibleMultiTVPackAddition();
	}
	@Test(enabled = true)
	public void CAMPAIGN_TYPEDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.CAMPAIGN_TYPEDDList();
	}
	@Test(enabled = true)
	public void PackageDashboardBOConfigDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.PackageDashboardBOConfigDDList();
	}
	@Test(enabled = true)
	public void DealerDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.DealerDD1();
	}
	@Test(enabled = true)
	public void DistributorDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.DistributorDD1();
	}
	@Test(enabled = true)
	public void PromotionalSchoolDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.PromotionalSchoolDD1();
	}
	@Test(enabled = true)
	public void PromotionalDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.PromotionalDD1();
	}
	@Test(enabled = true)
	public void ISPDemoDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.ISPDemoDD1();
	}
	@Test(enabled = true)
	public void ModernTradeDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.ModernTradeDD1();
	}
	@Test(enabled = true)
	public void RegularDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.RegularDD1();
	}
	@Test(enabled = true)
	public void EDIRegularDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.EDIRegularDD1();
	}
	@Test(enabled = true)
	public void VVIPNonPayingDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.VVIPNonPayingDD1();
	}
	@Test(enabled = true)
	public void VVIPPayingDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.VVIPPayingDD1();
	}
	@Test(enabled = true)
	public void Employee1DD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.Employee1DD1();
	}
	@Test(enabled = true)
	public void TataPlayEmployeeDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TataPlayEmployeeDD1();
	}
	@Test(enabled = true)
	public void BulkSLDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.BulkSLDD1();
	}
	@Test(enabled = true)
	public void CatADD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.CatADD1();
	}
	@Test(enabled = true)
	public void CatB1DD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.CatB1DD1();
	}
	@Test(enabled = true)
	public void CatB2DD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.CatB2DD1();
	}
	@Test(enabled = true)
	public void CatB3DD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.CatB3DD1();
	}
	@Test(enabled = true)
	public void ResidentialDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.ResidentialDD1();
	}
	@Test(enabled = true)
	public void AssociateNonPayingDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.AssociateNonPayingDD1();
	}
	@Test(enabled = true)
	public void AssociatePayingDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.AssociatePayingDD1();
	}
	@Test(enabled = true)
	public void StarGroupDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.StarGroupDD1();
	}
	@Test(enabled = true)
	public void TataGroupDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TataGroupDD1();
	}
	@Test(enabled = true)
	public void TataPlayDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TataPlayDD1();
	}
	@Test(enabled = true)
	public void TechnologyDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TechnologyDD1();
	}
	@Test(enabled = true)
	public void BusinessAssociatesDD1Test() throws Exception
	{
		dbs.openPCFForm();
		DD.BusinessAssociatesDD1();
	}
	@Test(enabled = true)
	public void ChargingAccountTypeDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ChargingAccountTypeDDList();
	}
	@Test(enabled = true)
	public void DealerDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.DealerDD2();
	}
	@Test(enabled = true)
	public void DistributorDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.DistributorDD2();
	}
	@Test(enabled = true)
	public void PromotionalSchoolDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.PromotionalSchoolDD2();
	}
	@Test(enabled = true)
	public void PromotionalDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.PromotionalDD2();
	}
	@Test(enabled = true)
	public void ISPDemoDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.ISPDemoDD2();
	}
	@Test(enabled = true)
	public void ModernTradeDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.ModernTradeDD2();
	}
	@Test(enabled = true)
	public void RegularDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.RegularDD2();
	}
	@Test(enabled = true)
	public void EDIRegularDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.EDIRegularDD2();
	}
	@Test(enabled = true)
	public void VVIPNonPayingDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.VVIPNonPayingDD2();
	}
	@Test(enabled = true)
	public void VVIPPayingDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.VVIPPayingDD2();
	}
	@Test(enabled = true)
	public void Employee1DD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.Employee1DD2();
	}
	@Test(enabled = true)
	public void TataPlayEmployeeDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TataPlayEmployeeDD2();
	}
	@Test(enabled = true)
	public void BulkSLDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.BulkSLDD2();
	}
	@Test(enabled = true)
	public void CatADD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.CatADD2();
	}
	@Test(enabled = true)
	public void CatB1DD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.CatB1DD2();
	}
	@Test(enabled = true)
	public void CatB2DD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.CatB2DD2();
	}
	@Test(enabled = true)
	public void CatB3DD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.CatB3DD2();
	}
	@Test(enabled = true)
	public void ResidentialDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.ResidentialDD2();
	}
	@Test(enabled = true)
	public void AssociateNonPayingDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.AssociateNonPayingDD2();
	}
	@Test(enabled = true)
	public void AssociatePayingDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.AssociatePayingDD2();
	}
	@Test(enabled = true)
	public void StarGroupDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.StarGroupDD2();
	}
	@Test(enabled = true)
	public void TataGroupDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TataGroupDD2();
	}
	@Test(enabled = true)
	public void TataPlayDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TataPlayDD2();
	}
	@Test(enabled = true)
	public void TechnologyDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.TechnologyDD2();
	}
	@Test(enabled = true)
	public void BusinessAssociatesDD2Test() throws Exception
	{
		dbs.openPCFForm();
		DD.BusinessAssociatesDD2();
	}
	@Test(enabled = true)
	public void AlertsBillsDescriptionsDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.AlertsBillsDescriptionsDDList();
	}
	@Test(enabled = true)
	public void BusinessReviewTabDDList() throws Exception
	{
		dbs.openPCFForm();
		DD.BusinessReviewTabDDList();
	}
	@Test(enabled = true)
	public void GTMReviewDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.GTMReviewDD();
	}
	@Test(enabled = true)
	public void CustomerOperationsReviewDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.CustomerOperationsReviewDD();
	}
	@Test(enabled = true)
	public void RAReviewDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.RAReviewDD();
	}
	@Test(enabled = true)
	public void FieldServicesReviewDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.FieldServicesReviewDD();
	}
	@Test(enabled = true)
	public void FinanceReviewDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.FinanceReviewDD();
	}
	@Test(enabled = true)
	public void SalesReviewDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.SalesReviewDD();
	}
	@Test(enabled = true)
	public void EPGReviewDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.EPGReviewDD();
	}
	@Test(enabled = true)
	public void ITReviewTabDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ITReviewTabDDList();
	}

	@Test(enabled = true)
	public void OfferFlagDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.OfferFlagDD();
	}
	@Test(enabled = true)
	public void FoundInDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.FoundInDD();
	}
	@Test(enabled = true)
	public void ReleaseDependencyDDTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ReleaseDependencyDD();
	}
	@Test(enabled = true)
	public void UATDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.UATDDList();
	}
	@Test(enabled = true)
	public void LinksDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.LinksDDList();
	}
	@Test(enabled = true)
	public void ApprovalsDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ApprovalsDDList();
	}
	@Test(enabled = true)
	public void ChangeHistoryTabDDListTest() throws Exception
	{
		dbs.openPCFForm();
		DD.ChangeHistoryTabDDList();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}
