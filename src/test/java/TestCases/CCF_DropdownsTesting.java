package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.CCF_DropdownsValidation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class CCF_DropdownsTesting extends TestBase { 
	LoginPage login;
	Dashboard_GUI_Validation dbs;
	CCF_DropdownsValidation DD;
	
	@BeforeMethod
	public void setup() throws Exception  
	{
		initalization();
		login =	new LoginPage();
		login.loginToApp();
		dbs = new Dashboard_GUI_Validation();
		DD = new CCF_DropdownsValidation();
	}
	@Test(enabled = true)
	public void chargeCreationFormDropdownList() throws Exception
	{
		dbs.openCCFForm();
		DD.ChargeCreationFormDropdownList();
	}
	@Test(enabled = true)
	public void FunctionDepartmentDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.FunctionDepartmentDD();
	}
	@Test(enabled = true)
	public void MaterialCategoryDD() throws Exception
	{
		dbs.openCCFForm();
		DD.MaterialCategoryDD();
	}
	@Test(enabled = true)
	public void InventoryFlagDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.InventoryFlagDD();
	}
	@Test(enabled = true)
	public void OrderableFlagDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.OrderableFlagDD();
	}
	@Test(enabled = true)
	public void MaterialToMaterialTest() throws Exception
	{
		dbs.openCCFForm();
		DD.MaterialToMaterial();
	}
	@Test(enabled = true)
	public void AdditionalBusinessRulesDDListTest() throws Exception
	{
		dbs.openCCFForm();
		DD.AdditionalBusinessRulesDDList();
	}
	@Test(enabled = true)
	public void WorkOrderApplicationDDListTest() throws Exception
	{
		dbs.openCCFForm();
		DD.WorkOrderApplicationDDList();
	}
	@Test(enabled = true)
	public void ITReviewDDListDDListTest() throws Exception
	{
		dbs.openCCFForm();
		DD.ITReviewDDList();
	}
	@Test(enabled = true)
	public void PlannedForDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.PlannedForDD();
	}
	@Test(enabled = true)
	public void FoundInDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.FoundInDD();
	}
	@Test(enabled = true)
	public void ReleaseDependencyDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.ReleaseDependencyDD();
	}
	@Test(enabled = true)
	public void UATTabDDListTest() throws Exception
	{
		dbs.openCCFForm();
		DD.UATTabDDList();
	}
	@Test(enabled = true)
	public void LinksTabDDListTest() throws Exception
	{
		dbs.openCCFForm();
		DD.LinksTabDDList();
	}
	@Test(enabled = true)
	public void ApprovalDDListTest() throws Exception
	{
		dbs.openCCFForm();
		DD.ApprovalDDList();
	}
	@Test(enabled = true)
	public void ChangeHistoryTabDDListTest() throws Exception
	{
		dbs.openCCFForm();
		DD.ChangeHistoryTabDDList();
	}
	@Test(enabled = true)
	public void BusinessReviewTabDDListTest() throws Exception
	{
		dbs.openCCFForm();
		DD.BusinessReviewTabDDList();
	}
	@Test(enabled = true)
	public void MarketingReviewDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.MarketingReviewDD();
	}
	@Test(enabled = true)
	public void FinanceReviewDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.FinanceReviewDD();
	}
	@Test(enabled = true)
	public void SalesReviewDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.SalesReviewDD();
	}
	@Test(enabled = true)
	public void RAReviewDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.RAReviewDD();
	}
	@Test(enabled = true)
	public void FieldServicesReviewDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.FieldServicesReview();
	}
	@Test(enabled = true)
	public void CustomerReviewDDTest() throws Exception
	{
		dbs.openCCFForm();
		DD.CustomerReviewDD();
	}
	@Test(enabled = true)
	public void TechReviewDD() throws Exception
	{
		dbs.openCCFForm();
		DD.TechReviewDD();
	}
	@Test(enabled = true)
	public void ITReviewDD() throws Exception
	{
		dbs.openCCFForm();
		DD.ITReviewDD();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}
