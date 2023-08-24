package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.FPM_DropdownsValidation;
import Pages.LoginPage;

public class FPM_DropdownsTesting extends TestBase { 
	LoginPage login;
	FPM_DropdownsValidation DD;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException  
	{
	initalization();
	DD = new FPM_DropdownsValidation();
	}
	@Test(enabled = true)
	public void TypeOfPackDDTest() throws Exception
	{
		DD.TypeOfPackDD();
	}
	@Test(enabled = true)
	public void NameOfBroadcasterDDTest() throws Exception
	{
		DD.NameOfBroadcasterDD();
	}
	@Test(enabled = true)
	public void PackageDashboardCategoryDDTest() throws Exception
	{
		DD.PackageDashboardCategoryDD();
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
	public void PackStatusDDTest() throws Exception
	{
		DD.PackStatusDD();
	}
	@Test(enabled = true)
	public void UnitOfMeasureUoMDDTest() throws Exception
	{
		DD.UnitOfMeasureUoMDD();
	}
	@Test(enabled = true)
	public void SDHD_DDTest() throws Exception
	{
		DD.SDHD_DD();
	}
	@Test(enabled = true)
	public void BroadcasterCategoryforDisplaysTest() throws Exception
	{
		DD.BroadcasterCategoryforDisplays();
	}
	@Test(enabled = true)
	public void TataPlayPacksCategoryforDisplaysTest() throws Exception
	{
		DD.TataPlayPacksCategoryforDisplays();
	}
	@Test(enabled = true)
	public void ChannelCategoryforDisplayTest() throws Exception
	{
		DD.ChannelCategoryforDisplay();
	}
	@Test(enabled = true)
	public void DASLevelValidationDDTest() throws Exception
	{
		DD.DASLevelValidationDD();
	}
	@Test(enabled = true)
	public void AnyBoxTypePrimaryBestBoxValidationDDTest() throws Exception
	{
		DD.AnyBoxTypePrimaryBestBoxValidationDD();
	}
	@Test(enabled = true)
	public void UnitofMeasureUoMforNonODUPacksDD() throws Exception
	{
		DD.UnitofMeasureUoMforNonODUPacksDD();
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
	public void IS_Trai_Enable_flag_DDTest() throws Exception
	{
		DD.IS_Trai_Enable_flag_DD();
	}
	@Test(enabled = true)
	public void TobemadeavailablefordealersinmSalesDDTest() throws Exception
	{
		DD.TobemadeavailablefordealersinmSalesDD();
	}
	@Test(enabled = true)
	public void SubscriberTypeNewExistingDDTest() throws Exception
	{
		DD.SubscriberTypeNewExistingDD();
	}
	@Test(enabled = true)
	public void PackVariationDDTest() throws Exception
	{
		DD.PackVariationDD();
	}
	@Test(enabled = true)
	public void AnyStatelevelvalidationDDTest() throws Exception
	{
		DD.AnyStatelevelvalidationDD();
	}
	@Test(enabled = true)
	public void readExcelData1Test() throws Exception
	{
		DD.readExcelData1();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}