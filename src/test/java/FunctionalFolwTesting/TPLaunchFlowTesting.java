package FunctionalFolwTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import FunctionalFlow.TPLaunchFlow;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class TPLaunchFlowTesting extends TestBase {
	LoginPage login;
	TPLaunchFlow TPLF;
	Dashboard_GUI_Validation dsb;
	
	@BeforeMethod 
	public void setup() throws Exception
	{
	initalization();
	dsb = new Dashboard_GUI_Validation();
	login = new LoginPage();
	login.loginToApp();
	TPLF = new TPLaunchFlow();
	TPLF.readExcelAndAssignValues();
	}
	@Test (enabled = true, priority =0)
	public void printAssignedValues()
	{
		TPLF.printAssignedValues();
	}
	@Test (enabled = true, priority =2)
	public void createNewFPMTestTest() throws Exception
	{
		dsb.openFPMForm();
		TPLF.CreateNewFPM();
	}
	@Test (enabled = true, priority =3)
	public void VerifyFPMttachmentsTest() throws Exception
	{
		TPLF.OpenCreatedFPM();
		TPLF.VerifyFPMttachments();
	}
	@Test (enabled = true, priority =4,dependsOnMethods = "VerifyFPMttachmentsTest")
	public void fillTheDetailsTest() throws Exception
	{
		TPLF.OpenCreatedFPM();
		TPLF.fillTheDetails();
	}
	@Test (enabled = true, priority =5,dependsOnMethods = "fillTheDetailsTest")
	public void VerifyTPTPFPMChangesTest() throws Exception
	{
		TPLF.OpenCreatedFPMForSM();
		TPLF.VerifyTPFPMChanges();
	}
	@Test (enabled = true, priority =6,dependsOnMethods = "VerifyTPTPFPMChangesTest")
	public void VerifyFPMChacngesTest() throws Exception
	{
		TPLF.OpenCreatedFPMForSM();
		TPLF.VerifyFPMChanges();
	}
	@Test (enabled = true, priority =7,dependsOnMethods = "VerifyFPMChacngesTest")
	public void VerifyPCFChangesTest() throws Exception
	{
		TPLF.OpenCreatedFPMForSM();
		TPLF.VerifyPCFChanges();
	}
	@Test (enabled = true, priority =8,dependsOnMethods = "VerifyPCFChangesTest")
	public void CalculationValidationTest() throws Exception
	{
		TPLF.OpenCreatedFPMForSM();
		TPLF.CalculationValidation();
	}
	@Test (enabled = true, priority =9,dependsOnMethods = "CalculationValidationTest")
	public void EPGTeamApprovalTest() throws Exception
	{
		TPLF.OpenCreatedFPMForEPG();
		TPLF.EPGTeamApproval();
	}
	@Test (enabled = true, priority =10,dependsOnMethods = "EPGTeamApprovalTest") 
	public void VerifyCompletedFPMTest() throws Exception
	{
		TPLF.OpenCompletedFPM();
		TPLF.VerifyCompletedFPM();
	}
	@Test (enabled = true, priority =11,dependsOnMethods = "VerifyCompletedFPMTest")
	public void TPAttachedToChannels() throws Exception
	{
		TPLF.OpenCompletedFPM();
		TPLF.TPAttachedToChannels();
	}
	@Test (enabled = true, priority =12,dependsOnMethods = "TPAttachedToChannels")
	public void ChangesInBPMsTest() throws Exception
	{
		TPLF.OpenCompletedFPM();
		TPLF.ChangesInBPMs();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
