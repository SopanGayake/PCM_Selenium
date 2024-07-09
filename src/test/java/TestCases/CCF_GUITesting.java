package TestCases;

import org.testng.annotations.*;

import BasePackage.TestBase;
import Pages.CCF_GUIValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class CCF_GUITesting extends TestBase {
	LoginPage login;
	CCF_GUIValidation ccf;
	Dashboard_GUI_Validation dbs;
	@BeforeMethod
	public void setup() throws Exception
	{
	initalization();
	login =	new LoginPage();
	login.loginToApp();
	dbs = new Dashboard_GUI_Validation();
	ccf = new CCF_GUIValidation();
	}
	@Test(enabled = true ,priority = 1)
	public void AA_CCFFormDetailsTest() throws Exception
	{
		dbs.openCCFForm();
//		ccf.OpenCreatedCCF();
		ccf.CCFFormDetails();
	}
	@Test(enabled = true ,priority = 2)
	public void ChargeSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.ChargeSectionValidation();
	}
	@Test(enabled = true ,priority = 3)
	public void AlertsSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.AlertsSectionValidation();
	}
	@Test(enabled = true ,priority = 3)
	public void PriceListSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.PriceListSectionValidation();
	}
	@Test(enabled = true ,priority = 4)
	public void PRMSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.PRMSectionValidation();
	}
	@Test(enabled = true ,priority = 5)
	public void AdditionalBusinessSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.AdditionalBusinessSectionValidation();
	}
	@Test(enabled = true ,priority = 6)
	public void WorkOrderSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.WorkOrderSectionValidation();
	}
	@Test(enabled = true ,priority = 7)
	public void ITReviewSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.ITReviewSectionValidation();
	}
	@Test(enabled = true ,priority = 7)
	public void EffortEstimationSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.EffortEstimationSectionValidation();
	}
	@Test(enabled = true ,priority = 7)
	public void UATSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.UATSectionValidation();
	}
	@Test(enabled = true ,priority = 7)
	public void LinksectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.LinksectionValidation();
	}
	@Test(enabled = true ,priority = 8)
	public void ApprovalSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.ApprovalSectionValidation();
	}
	@Test(enabled = true ,priority = 10)
	public void ChangeHistorySectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.ChangeHistorySectionValidation();
	}
	@Test(enabled = true ,priority = 9)
	public void ReviewDetailsSectionTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.ReviewDetailsSectionValidation();
	}
	@Test(enabled = true ,priority = 9)
	public void ReviewerNamesSectionValidation() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.ReviewerNamesSectionValidation();
	}
	@Test(enabled = true ,priority = 9)
	public void ReviewedSignoffTest() throws Exception
	{
		ccf.OpenCreatedCCF();
		ccf.ReviewedSignoffValidation();
	}
	@AfterMethod
	public void exit() {
	driver.quit();
	}
}