package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.LoginPage;
import Pages.PCF_DropdownsValidation;

public class PCF_DropdownsTest extends TestBase { 
	LoginPage login;
	PCF_DropdownsValidation DD;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException  
	{
	initalization();
	DD = new PCF_DropdownsValidation();
	}
	@Test(enabled = true)
	public void GetIDTest() throws Exception
	{
		DD.GetID();
	}
	@Test(enabled = true)
	public void FunctionDepartmentDDTest() throws Exception
	{
		DD.FunctionDepartmentDD();
	}
	@Test(enabled = true)
	public void SeverityDDTest() throws Exception
	{
		DD.SeverityDD();
	}
	@Test(enabled = true)
	public void PriorityDDTest() throws Exception
	{
		DD.PriorityDD();
	}
	@Test(enabled = true)
	public void PackStructureDDTest() throws Exception
	{
		DD.PackStructureDD();
	}
	@Test(enabled = true)
	public void TypeOfPackDDTest() throws Exception
	{
		DD.TypeOfPackDD();
	}
	@Test(enabled = true)
	public void OfferTypeforServicesDDTest() throws Exception
	{
		DD.OfferTypeforServicesDD();
	}
	@Test(enabled = true)
	public void PackGradeTypeDDTest() throws Exception
	{
		DD.PackGradeTypeDD();
	}
	@Test(enabled = true)
	public void BoxCompatibilityDDTest() throws Exception
	{
		DD.BoxCompatibilityDD();
	}
	@Test(enabled = true)
	public void UnitOfMeasureUoMDDTest() throws Exception
	{
		DD.UnitOfMeasureUoMDD();
	}
	@Test(enabled = true)
	public void PackVariationDDTest() throws Exception
	{
		DD.PackVariationDD();
	}
	@Test(enabled = true)
	public void PackageChargeTypeDDTest() throws Exception
	{
		DD.PackageChargeTypeDD();
	}
	@Test(enabled = true)
	public void LDPCommunicationDDTest() throws Exception
	{
		DD.LDPCommunicationDD();
	}
	@Test(enabled = true)
	public void PackageDashboardCategoryDDTest() throws Exception
	{
		DD.PackageDashboardCategoryDD();
	}
	@Test(enabled = true)
	public void RetrofitCreditforMegaPackDDTest() throws Exception
	{
		DD.RetrofitCreditforMegaPackDD();
	}
	@Test(enabled = true)
	public void UnitofMeasureUoMforNonODUPacksDDTest() throws Exception
	{
		DD.UnitofMeasureUoMforNonODUPacksDD();
	}
	@Test(enabled = true)
	public void RetrofitFlagDDTest() throws Exception
	{
		DD.RetrofitFlagDD();
	}
	@Test(enabled = true)
	public void RENTAL_FLAG_DDTest() throws Exception
	{
		DD.RENTAL_FLAG_DD();
	}
	@Test(enabled = true)
	public void PAYABLE_FLAG_DDTest() throws Exception
	{
		DD.PAYABLE_FLAG_DD();
	}
	@Test(enabled = true)
	public void DASLevelValidationTest() throws Exception
	{
		DD.DASLevelValidation();
	}
	@Test(enabled = true)
	public void PDM_ProductLineDDTest() throws Exception
	{
		DD.PDM_ProductLineDD();
	}
	@Test(enabled = true)
	public void EligibleforMultiTVPriceCalculationDDTest() throws Exception
	{
		DD.EligibleforMultiTVPriceCalculationDD();
	}
	@Test(enabled = true)
	public void EligibleforMultiTVPriceCalculationExceptionDDTest() throws Exception
	{
		DD.EligibleforMultiTVPriceCalculationExceptionDD();
	}
	@Test(enabled = true)
	public void PDMUoMDDTest() throws Exception
	{
		DD.PDMUoMDD();
	}
	@Test(enabled = true)
	public void PackType_PDMDDTest() throws Exception
	{
		DD.PackType_PDMDD();
	}
	@Test(enabled = true)
	public void AllignableFlagIfDPDDTest() throws Exception
	{
		DD.AllignableFlagIfDPDD();
	}
	@Test(enabled = true)
	public void NCFdiscountApplicableDDTest() throws Exception
	{
		DD.NCFdiscountApplicableDD();
	}
	@Test(enabled = true)
	public void DiscountTypeDDTest() throws Exception
	{
		DD.DiscountTypeDD();
	}
	@Test(enabled = true)
	public void EligibleforRoundOffCalculationDDTest() throws Exception
	{
		DD.EligibleforRoundOffCalculationDD();
	}
	@Test(enabled = true)
	public void IS_Trai_Enable_flagDDTest() throws Exception
	{
		DD.IS_Trai_Enable_flagDD();
	}
	@Test(enabled = true)
	public void OTTComboFlagDDTest() throws Exception
	{
		DD.OTTComboFlagDD();
	}
	@Test(enabled = true)
	public void SpecialNCFFlagDDTest() throws Exception
	{
		DD.SpecialNCFFlagDD();
	}
	@Test(enabled = true)
	public void DunningExclusionDDTest() throws Exception
	{
		DD.DunningExclusionDD();
	}
	@Test(enabled = true)
	public void ShouldthispackbeenabledunderFTCreditsDDTest() throws Exception
	{
		DD.ShouldthispackbeenabledunderFTCreditsDD();
	}
	@Test(enabled = true)
	public void SubscriberTypeNewExistingDDTest() throws Exception
	{
		DD.SubscriberTypeNewExistingDD();
	}
	@Test(enabled = true)
	public void IS_Binge_Plus_flagDDTest() throws Exception
	{
		DD.IS_Binge_Plus_flagDD();
	}
	@Test(enabled = true)
	public void ATVSourceRAttribute7DDTest() throws Exception
	{
		DD.ATVSourceRAttribute7DD();
	}
	@Test(enabled = true)
	public void FreepackFlagDDTest() throws Exception
	{
		DD.FreepackFlagDD();
	}
	@Test(enabled = true)
	public void SubscriptionallowedfromSCDDTest() throws Exception
	{
		DD.SubscriptionallowedfromSCDD();
	}
	@Test(enabled = true)
	public void TypeOfPackDD2Test() throws Exception
	{
		DD.TypeOfPackDD2();
	}
	@Test(enabled = true)
	public void DurationMonthlyNRCpacksDDTest() throws Exception
	{
		DD.DurationMonthlyNRCpacksDD();
	}
	@Test(enabled = true)
	public void RenewalallowedonSelfCareDDTest() throws Exception
	{
		DD.RenewalallowedonSelfCareDD();
	}
	@Test(enabled = true)
	public void ChannelCategoryforDisplayDDTest() throws Exception
	{
		DD.ChannelCategoryforDisplayDD();
	}
	@Test(enabled = true)
	public void BroadcasterCategoryforDisplaysDDTest() throws Exception
	{
		DD.BroadcasterCategoryforDisplaysDD();
	}
	@Test(enabled = true)
	public void TataPlayPacksCategoryforDisplaysDDTest() throws Exception
	{
		DD.TataPlayPacksCategoryforDisplaysDD();
	}
	@Test(enabled = true)
	public void sourceforOTTDDTest() throws Exception
	{
		DD.sourceforOTTDD();
	}
	@Test(enabled = true)
	public void WebenabledFlagwithvaluesDDTest() throws Exception
	{
		DD.WebenabledFlagwithvaluesDD();
	}
	@Test(enabled = true)
	public void AppenabledFlagwithvaluesDDTest() throws Exception
	{
		DD.AppenabledFlagwithvaluesDD();
	}
	@Test(enabled = true)
	public void SubscriptionallowdviaSMSDDTest() throws Exception
	{
		DD.SubscriptionallowdviaSMSDD();
	}
	@Test(enabled = true)
	public void ProvisioningBasedOnChannelPackDDTest() throws Exception
	{
		DD.ProvisioningBasedOnChannelPackDD();
	}
	@Test(enabled = true)
	public void SubscriptionallowedviaNuanceDDTest() throws Exception
	{
		DD.SubscriptionallowedviaNuanceDD();
	}
	@Test(enabled = true)
	public void TypeofOfferDDTest() throws Exception
	{
		DD.TypeofOfferDD();
	}
	@Test(enabled = true)
	public void SubscriptionallowdviaPRMDDTest() throws Exception
	{
		DD.SubscriptionallowdviaPRMDD();
	}
	@Test(enabled = true)
	public void TobemadeavailablefordealersinmSalesDDTest() throws Exception
	{
		DD.TobemadeavailablefordealersinmSalesDD();
	}
	@Test(enabled = true)
	public void PackdropthroughMsalesDDTest() throws Exception
	{
		DD.PackdropthroughMsalesDD();
	}
	@Test(enabled = true)
	public void TobemadeavailableforDealersinMSalesforModPackDDTest() throws Exception
	{
		DD.TobemadeavailableforDealersinMSalesforModPackDD();
	}
	@Test(enabled = true)
	public void BoxvalidationonMsalesDDTest() throws Exception
	{
		DD.BoxvalidationonMsalesDD();
	}
	@Test(enabled = true)
	public void ActionDDTest() throws Exception
	{
		DD.ActionDD();
	}
	@Test(enabled = true)
	public void DurationVariantDDTest() throws Exception
	{
		DD.DurationVariantDD();
	}
	@Test(enabled = true)
	public void PackageDashboardCategoryforBOConfigDD() throws Exception
	{
		DD.PackageDashboardCategoryforBOConfigDD();
	}
	@Test(enabled = true)
	public void PackstobeexpiredornotDDTest() throws Exception
	{
		DD.PackstobeexpiredornotDD();
	}
	@Test(enabled = true)
	public void PackAdditionviaSPMfromSMSSource() throws Exception
	{
		DD.PackAdditionviaSPMfromSMSSource();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}