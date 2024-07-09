package FunctionalFolwTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import FunctionalFlow.FPMtoPCFAutomation;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class FPMtoPCFAutomationTesting extends TestBase {
	LoginPage login;
	FPMtoPCFAutomation FPMPCF;
	Dashboard_GUI_Validation dsb;
	
	@BeforeMethod 
	public void setup() throws Exception
	{
	initalization();
	dsb = new Dashboard_GUI_Validation();
	login = new LoginPage();
	login.loginToApp();
	FPMPCF= new FPMtoPCFAutomation();
	}
	@Test (enabled = false ,priority =1)
	public void createNewFPMTest() throws Exception //If Type of Pack: ALC Then Unit Of Measure (UoM):=Monthly
	{
		FPMPCF.CreatedFPM();
//		dsb.openFPMForm();
		FPMPCF.CreateNewFPM();
	}
	@Test (enabled = false, priority =2)
	public void FPMDefaultValuesYes() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.FPMDefaultValuesYes();
	}

	@Test (enabled = true, priority =2)
	public void FPMDefaultValuesNo() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.FPMDefaultValuesNo();
	}
	@Test (enabled = true, priority =2)
	public void FPMDefaultValuesZero() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.FPMDefaultValuesZero();
	}
	@Test (enabled = true, priority =2)
	public void DefaultValuesForFPMandPCF() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.DefaultValuesForFPMandPCF();
	}
	@Test (enabled = false, priority =3)
	public void PCFDefaultValuesZero() throws Exception
	{
		FPMPCF.CreatedPCF();
		FPMPCF.PCFDefaultValuesZero();
	}
	@Test (enabled = false, priority =3,dependsOnMethods = "createNewFPMTest")
	public void AttachedPCFTest() throws Exception
	{
		FPMPCF.CreatedPCF();
		FPMPCF.AttachedPCF();
	}
	@Test (enabled = false, priority =4)
	public void FriendlyValuesMapping() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.FriendlyValuesMapping();
	}
	@Test (enabled = false, priority =5)
	public void PCFtoPCFDirectMapping() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.FPMtoPCFDirectValue();
	}
	@Test (enabled = false, priority =3)
	public void FPMtoPCFDirectValue() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.FPMtoPCFDirectValue();
	}
	@Test (enabled = false, priority =3)
	public void SDHDFieldTest() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.SDHDField();
	}
	@Test (enabled = false, priority =4)
	public void FreindlyNamesTest() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.FreindlyNames(); 
	}
	@Test (enabled = false, priority =5)
	public void AnyStateValidation01Test() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.AnyStateValidation01();
	}
	
	@Test (enabled = false, priority =6)
	public void AnyStateValidation02Test() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.AnyStateValidation02();
	}
	@Test (enabled = false, priority =7)
	public void ChannelCountValidation() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.ChannelCountValidation();
	}
	@Test (enabled = false, priority =8)
	public void AddBrdAndALC() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.AddBrdAndALC();
	}
	@Test (enabled = false, priority =9)
	public void TotalPricePointTest() throws Exception
	{
		FPMPCF.CreatedPCF();
		FPMPCF.TotalPricePoint();
	}
	@Test (enabled = false, priority =10)
	public void PackageDashboardCategory() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.PackageDashboardCategory();
	}
	@Test (enabled = false, priority =11)
	public void SelfcaredisplayPrice() throws Exception
	{
		FPMPCF.CreatedPCF();
		FPMPCF.SelfcaredisplayPrice();
	}
	@Test (enabled = false, priority =12)
	public void PackagePlacementCatalogue() throws Exception
	{
		FPMPCF.CreatedPCF();
		FPMPCF.PackagePlacementCatalogue();
	}
	@Test (enabled = false, priority =12)
	public void PRODUCT_MRP() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.PRODUCT_MRP();
	}
	@Test (enabled = false, priority =13)
	public void ChargingPriceforNRCPack() throws Exception
	{
		FPMPCF.CreatedPCF();
		FPMPCF.ChargingPriceforNRCPack();
	}
	@Test (enabled = false, priority =14)
	public void ApplicableSourcesTest() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.ApplicableSources();
	}
	@Test (enabled = false, priority =14)
	public void EligibleMultiTVCalculationTest() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.EligibleMultiTVCalculation();
	}
	@Test (enabled = false, priority =15)
	public void MultiTVContentDBRTest() throws Exception
	{
		FPMPCF.CreatedPCF();
		FPMPCF.MultiTVContentDBR();
	}
	@Test (enabled = false, priority =15)
	public void TataPlayBouquet() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.TataPlayBouquet();
	}
	@Test (enabled = false, priority =15)
	public void GLCodeUpdation() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.GLCodeUpdation();
	}
	@Test (enabled = false, priority =16)
	public void PackageChageTypeAutomationTest() throws Exception
	{
		FPMPCF.CreatedPCF();
		FPMPCF.PackageChageTypeAutomation();
	}
	@Test (enabled = false, priority =16)
	public void RemarkPriceXdaysTest() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.RemarkPriceXdays();
	}
	@Test (enabled = false, priority =16,dependsOnMethods = "GLCodeUpdation")
	public void BalAdjForLDPpacksTest() throws Exception
	{
		FPMPCF.CreatedFPM();
		FPMPCF.BalAdjForLDPpacks();
	}
	@Test (enabled = false, priority =17,dependsOnMethods = "BalAdjForLDPpacksTest")
	public void GetReports() throws Exception
	{
		FPMPCF.OpenReports();
		FPMPCF.GetReports();
	}
	@AfterMethod
	public void exit() {
	driver.quit();
	}

}
