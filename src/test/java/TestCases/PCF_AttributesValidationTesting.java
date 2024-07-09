package TestCases;


import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;
import Pages.PCFAttributesValidation;
public class PCF_AttributesValidationTesting extends TestBase { 
	LoginPage login;
	PCFAttributesValidation pcf;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	pcf = new PCFAttributesValidation();
	}
	
	@Test(enabled = true)
	public void FormDetailsTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.formDetails();
	}
	@Test(enabled = true)
	public void PCFTabsListTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.tabsList();
	}
	@Test(enabled = true)
	public void PacageCreationAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.pacageCreationAttributes();
	} 
	@Test(enabled = true)
	public void SectionNameListTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.sectionNameList();
	}
	@Test(enabled = true)
	public void RequesterDetailsAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.requesterDetailsAttributes();
	}
	@Test(enabled = true)
	public void PackageDetailsAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.packageDetailsAttributes();
	}
	@Test(enabled = true)
	public void ChargingAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chargingAttributes();
	}
	@Test(enabled = true)
	public void ChargingAdditionalAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chargingAdditionalAttributes();
	}
	@Test(enabled = true)
	public void BingeCCFAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.bingeCCFAttributes();
	}
	@Test(enabled = true)
	public void CARelatedConfigAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.caRelatedConfigAttributes();
	}
	@Test(enabled = true)
	public void SiebelCompatibilityAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.siebelCompatibilityAttributes();
	}
	@Test(enabled = true)
	public void AdditionalBusinessAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.additionalBusinessAttributes();
	}
	@Test(enabled = true)
	public void SelfCareConfigAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.selfCareConfigAttributes();
	}
	@Test(enabled = true)
	public void SMSConfigAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.SMSConfigAttribute();
	}
	@Test(enabled = true)
	public void CampaignConfigurationsTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.CampaignConfigurations();
	}
	@Test(enabled = true)
	public void NuanceConfigAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.nuanceConfigAttributes();
	}
	@Test(enabled = true)
	public void PRMSalesConfigAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.PRMSalesConfigAttribute();
	}
	
	@Test(enabled = true)
	public void mSalesAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.mSalesAttributes();
	}
	@Test(enabled = true)
	public void MissedCallConfigAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.missedCallConfigAttributes();
	}
	@Test(enabled = true)
	public void BIRelatedConfigurations() throws Exception
	{
		dbs.openPCFForm();
		pcf.BIRelatedConfigurations();
	}
	@Test(enabled = true)
	public void CompatiblePacksTobeTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.CompatiblePacksTobe();
	}
	@Test(enabled = true)
	public void Charging_Applicable_NRC_Test() throws Exception
	{
		dbs.openPCFForm();
		pcf.Charging_Applicable_NRC();
	}
	@Test(enabled = true)
	public void Charging_Applicable_RC_Test() throws Exception
	{
		dbs.openPCFForm();
		pcf.Charging_Applicable_RC();
	}
	@Test(enabled = true)
	public void MissedCalltoSPM_Test() throws Exception
	{
		dbs.openPCFForm();
		pcf.MissedCalltoSPM();
	}
	@Test(enabled = true)
	public void eligibilityAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.eligibilityAttributes();
	}
	@Test(enabled = true)
	public void eligibilitySectionsTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.eligibilitySections();
	}
	@Test(enabled = true)
	public void elTradeAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.elTradeAttributes();
	}
	@Test(enabled = true)
	public void elResidentialAtributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.elResidentialAtributes();
	}
	@Test(enabled = true)
	public void elRuleOnAccountAtributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.elRuleOnAccountAtributes();
	}
	@Test(enabled = true)
	public void elCommercialAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.elCommercialAttributes();
	}
	@Test(enabled = true)
	public void CorporateAttributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.corporateAttributes();
	}
	@Test(enabled = true)
	public void SubCategoryAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.subCategoryAttributes();
	}
	@Test(enabled = true)
	public void ChargingAccountAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chargingAccountAttributes();
	}
	@Test(enabled = true)
	public void chargingTabSectionsTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chargingTabSections();
	}
	@Test(enabled = true)
	public void chTradeAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chTradeAttributes();
	}
	@Test(enabled = true)
	public void chResidentialAtributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chResidentialAtributes();
	}
	@Test(enabled = true)
	public void chRuleOnAccountAtributes() throws Exception
	{
		dbs.openPCFForm();
		pcf.chRuleOnAccountAtributes();
	}
	@Test(enabled = true)
	public void chCommercialAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chCommercialAttributes();
	}
	@Test(enabled = true)
	public void chCorporateAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chCorporateAttributes();
	}
	@Test(enabled = true)
	public void chSubCategoryAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.chSubCategoryAttributes();
	}
	@Test(enabled = true)
	public void AlertsBillsAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.AlertsBillsAttributes();
	}
	@Test(enabled = true)
	public void AlertsBillsSections() throws Exception
	{
		dbs.openPCFForm();
		pcf.AlertsBillsSections();
	}
	@Test(enabled = true)
	public void b_MailAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.b_MailAttributes();
	}
	@Test(enabled = true)
	public void billDescriptionAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.billDescriptionAttributes();
	}
	@Test(enabled = true)
	public void BusinessReviewAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.BusinessReviewAttributes();
	}
	@Test(enabled = true)
	public void businessReviewSectionsTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.businessReviewSections();
	}
	@Test(enabled = true)
	public void BReviewDetailsAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.reviewDetailsAttributes();
	}
	@Test(enabled = true)
	public void brCommentsAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.brCommentsAttributes();
	}
	@Test(enabled = true)
	public void reviewArtifactsAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.reviewArtifactsAttributes();
	}
	@Test(enabled = true)
	public void ITReviewAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.ITReviewAttributes();
	}
	@Test(enabled = true)
	public void ITReviewTabSectionsTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.ITReviewTabSections();
	}
	@Test(enabled = true)
	public void itReviewAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.itReviewAttributes();
	}
	@Test(enabled = true)
	public void EffortEstimAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.effortEstimAttributes();
	}
	@Test(enabled = true)
	public void discussionAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.discussionAttributes();
	}
	@Test(enabled = true)
	public void ChangeHistoryAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.ChangeHistoryAttributes();
	}
	@Test(enabled = true)
	public void changeHistorySectionsTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.changeHistorySections();
	}
	@Test(enabled = true)
	public void changeHistoryAttributesTest() throws Exception
	{
		dbs.openPCFForm();
		pcf.changeHistoryAttributes();
	}
	
	@AfterMethod
	public void exit() {
	driver.close();
	}
}
