package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.AddButtonsValuesMapping;
import Pages.Dashboard_GUI_Valoidation;
import Pages.LoginPage;

public class AddButtonsValuesMappingTesting  extends TestBase {
	LoginPage login;
	Dashboard_GUI_Valoidation DSB;
	AddButtonsValuesMapping ab;
	@BeforeMethod
	public void setup() throws Exception, InterruptedException  
	{
	initalization();
	login = new LoginPage();
	login.loginToApp();
	Thread.sleep(2000);
	DSB = new Dashboard_GUI_Valoidation();
	DSB.OpenCMPage();
	ab = new AddButtonsValuesMapping();
	}
	@Test(enabled = true)
	public void GetNameOfAddButtonsTest() throws Exception  
	{
		ab.GetNameOfAddButtons();
	}
	@Test(enabled = true)
	public void SecondaryGenreABTest() throws Exception  
	{
		ab.SecondaryGenreAB();
	}
	@Test(enabled = true)
	public void SDMappingABTest() throws Exception  
	{
		ab.SDMappingAB();
	}
	@Test(enabled = true)
	public void BroadcasterFPMABTest() throws Exception  
	{
		ab.BroadcasterFPMAB();
	}
	@Test(enabled = true)
	public void AddBroadcasterFPMABTest() throws Exception  
	{
		ab.AddBroadcasterFPMAB();
	}
	@Test(enabled = true)
	public void DropBroadcasterFPMABTest() throws Exception  
	{
		ab.DropBroadcasterFPMAB();
	}
	@Test(enabled = true)
	public void ALCFPMinABTest() throws Exception  
	{
		ab.ALCFPMinAB();
	}
	@Test(enabled = true)
	public void OTTComboFPMABTest() throws Exception  
	{
		ab.OTTComboFPMAB();
	}
	@Test(enabled = true)
	public void TPCuratedFPMABTest() throws Exception  
	{
		ab.TPCuratedFPMAB();
	}
	@Test(enabled = true)
	public void AddTPFPMsABTest() throws Exception  
	{
		ab.TPCuratedFPMAB();
	}
	@Test(enabled = true)
	public void DropTataPlayCuratedFPMABTest() throws Exception  
	{
		ab.DropTataPlayCuratedFPMAB();
	}
	@Test(enabled = true)
	public void FTAFPMinABTest() throws Exception  
	{
		ab.FTAFPMinAB();
	}
	@Test(enabled = true)
	public void BouquetABTest() throws Exception  
	{
		ab.BouquetAB();
	}
	@Test(enabled = true)
	public void BackendPacksinABTest() throws Exception  
	{
		ab.BackendPacksinAB();
	}
	@Test(enabled = true)
	public void ALCBackendPacksAB() throws Exception  
	{
		ab.ALCBackendPacksAB();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
