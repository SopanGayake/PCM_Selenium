package TestCases;


import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.CCFAttributeValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class CCF_AttributesValidationTesting extends TestBase { 
	LoginPage login;
	CCFAttributeValidation ccf;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	ccf = new CCFAttributeValidation();
	}
	
	@Test(enabled = true)
	public void FPMformDetailsTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.CCFformDetails();
	}
	@Test(enabled = true)
	public void CCFTabListTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.CCFTabList();
	}
	@Test(enabled = true)
	public void chargeProductAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.chargeProductAttributes();
	}
	@Test(enabled = true)
	public void chargeProductSectionsTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.chargeProductSections();
	}
	
	@Test(enabled = true)
	public void chargeProductSecAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.chargeProductSecAttributes();
	}
	@Test(enabled = true)
	public void alertsBillAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.alertsBillAttributes();
	}
	@Test(enabled = true)
	public void priceListAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.priceListAttributes();
	}
	@Test(enabled = true)
	public void pRMServiceAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.pRMServiceAttributes();
	}
	@Test(enabled = true)
	public void additionalBusinessAttributeTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.additionalBusinessAttribute();
	}
	@Test(enabled = true)
	public void additionalBusinessSectionsTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.additionalBusinessSections();
	}
	@Test(enabled = true)
	public void AdditionalBusinessSecAttributes() throws Exception
	{
		dbs.openCCFForm();
		ccf.additionalBusinessSecAttributes();
	}
	@Test(enabled = true)
	public void WorkOrderConTabTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.workOrderConsAttributes();
	}
	@Test(enabled = true)
	public void workOrderConsSectionTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.workOrderConsSection();
	}
	@Test(enabled = true)
	public void workOrderSecAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.workOrderSecAttributes();
	}
	@Test(enabled = true)
	public void ITReviewAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.ITReviewAttributes();
	}
	@Test(enabled = true)
	public void ITReviewSectionsTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.ITReviewSections();
	}
	@Test(enabled = true)
	public void itReviewAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.itReviewAttributes();
	}
	@Test(enabled = true)
	public void effortEstimationAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.effortEstimationAttributes();
	}
	@Test(enabled = true)
	public void UATTabAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.UATTabAttributes();
	}
	@Test(enabled = true)
	public void UATTabSectionsTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.UATTabSections();
	}
	@Test(enabled = true)
	public void TestArtifactsAttributes() throws Exception
	{
		dbs.openCCFForm();
		ccf.TestArtifactsAttributes();
	}
	@Test(enabled = true)
	public void linksTabAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.linksTabAttributes();
	}
	@Test(enabled = true)
	public void linksTabSectionsTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.linksTabSections();
	}
	@Test(enabled = true)
	public void attachmentsAttributes() throws Exception
	{
		dbs.openCCFForm();
		ccf.attachmentsAttributes();
	}
	@Test(enabled = true)
	public void LinksSecAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.LinksSecAttributes();
	}
	@Test(enabled = true)
	public void ApprovalAttributes() throws Exception
	{
		dbs.openCCFForm();
		ccf.ApprovalAttributes();
	}
	@Test(enabled = true)
	public void ApprovalSections() throws Exception
	{
		dbs.openCCFForm();
		ccf.ApprovalSections();
	}
	@Test(enabled = true)
	public void approvalSecAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.approvalSecAttributes();
	}
	@Test(enabled = true)
	public void ChangeHistoryAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.ChangeHistoryAttributes();
	}
	@Test(enabled = true)
	public void ChangeHistorySectionsTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.ChangeHistorySections();
	}
	@Test(enabled = true)
	public void changeHistorySecAttributes() throws Exception
	{
		dbs.openCCFForm();
		ccf.changeHistorySecAttributes();
	}
	@Test(enabled = true)
	public void BusinessReviewAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.BusinessReviewAttributes();
	}
	@Test(enabled = true)
	public void businessReviewSectionsTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.BusinessReviewSections();
	}
	@Test(enabled = true)
	public void reviewDetailsAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.reviewDetailsAttributes();
	}
	@Test(enabled = true)
	public void reviewerNamesAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.reviewerNamesAttributes();
	}
	@Test(enabled = true)
	public void reviewedSignoffAttributesTest() throws Exception
	{
		dbs.openCCFForm();
		ccf.reviewedSignoffAttributes();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}