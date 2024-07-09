package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.Dashboard_GUI_Validation;
import Pages.FPM_DropdownsValidation;
import Pages.LoginPage;
import Pages.PCF_DropdownsValidation;

public class FPM_DropdownsTesting extends TestBase { 
	LoginPage login;
	Dashboard_GUI_Validation dbs;
	FPM_DropdownsValidation DD;
	
	@BeforeMethod
	public void setup() throws Exception  
	{
		initalization();
		login =	new LoginPage();
		login.loginToApp();
		dbs = new Dashboard_GUI_Validation();
		DD = new FPM_DropdownsValidation();
	}
	@Test(enabled = true)
	public void FrontendPackMasterDropdownListTest() throws Exception
	{
		dbs.openFPMForm();
		DD.FrontendPackMasterDropdownList();
	}
	@Test(enabled = true)
	public void TypeofPackDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.TypeofPackDD();
	}
	@Test(enabled = true)
	public void NameofBroadcasterTest() throws Exception
	{
		dbs.openFPMForm();
		DD.NameofBroadcasterDD();
	}
	@Test(enabled = true)
	public void PackageDashboardDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.PackageDashboardDD();
	}
	@Test(enabled = true)
	public void OfferTypeServicesDDtest() throws Exception
	{
		dbs.openFPMForm();
		DD.OfferTypeServicesDD();
	}
	@Test(enabled = true)
	public void PackGradeTypeDDtest() throws Exception
	{
		dbs.openFPMForm();
		DD.PackGradeTypeDD();
	}
	@Test(enabled = true)
	public void PackStatusDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.PackStatusDD();
	}
	@Test(enabled = true)
	public void UnitofMeasureDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.UnitofMeasureDD();
	}
	@Test(enabled = true)
	public void SDHDDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.SDHDDD();
	}
	@Test(enabled = true)
	public void BroadcasterCategoryDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.BroadcasterCategoryDD();
	}
	@Test(enabled = true)
	public void TataPlayPacksDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.TataPlayPacks();
	}
	@Test(enabled = true)
	public void ChannelCategoryDisplay() throws Exception
	{
		dbs.openFPMForm();
		DD.ChannelCategoryDisplayDD();
	}
	@Test(enabled = true)
	public void DASLevelValidationDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.DASLevelValidation();
	}
	@Test(enabled = true)
	public void AnyBoxTypeDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.AnyBoxTypeDD();
	}
	@Test(enabled = true)
	public void UnitOfMeasure2DDtest() throws Exception
	{
		dbs.openFPMForm();
		DD.UnitOfMeasure2DD();
	}
	@Test(enabled = true)
	public void RentalFlagDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.RentalFlagDD();
	}
	@Test(enabled = true)
	public void PayableFlagDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.PayableFlagDD();
	}
	@Test(enabled = true)
	public void IsTraiEnableDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.IsTraiEnableDD();
	}
	@Test(enabled = true)
	public void ToMadeinMSalesDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.ToMadeinMSalesDD();
	}
	@Test(enabled = true)
	public void SubscriberTypeDD() throws Exception
	{
		dbs.openFPMForm();
		DD.SubscriberTypeDD();
	}
	@Test(enabled = true)
	public void PackVariationDD() throws Exception
	{
		dbs.openFPMForm();
		DD.PackVariationDD();
	}
	@Test(enabled = true)
	public void ChannelofFTADDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.ChannelofFTADD();
	}
	@Test(enabled = true)
	public void ChannelDetailsDropdownList() throws Exception
	{
		dbs.openFPMForm();
		DD.ChannelDetailsDropdownList();
	}
	@Test(enabled = true)
	public void BackendPackMappingTabDropdownList() throws Exception
	{
		dbs.openFPMForm();
		DD.BackendPackMappingTabDropdownList();
	}
	@Test(enabled = true)
	public void SinglePackDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.SinglePackDD();
	}
	@Test(enabled = true)
	public void LinksTabDropdownListTest() throws Exception
	{
		dbs.openFPMForm();
		DD.LinksTabDropdownList();
	}
	@Test(enabled = true)
	public void changeHistoryTabDropdownList() throws Exception
	{
		dbs.openFPMForm();
		DD.ChangeHistoryTabDropdownList();
	}
	@Test(enabled = true)
	public void PDMProductLineDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.PDMProductLineDD();
	}
	@Test(enabled = true)
	public void AnyBoxTypeValidationDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.AnyBoxTypeValidationDD();
	}
	@Test(enabled = true)
	public void AmazonPrimeVideoDDTest() throws Exception
	{
		dbs.openFPMForm();
		DD.AmazonPrimeVideoDD();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}