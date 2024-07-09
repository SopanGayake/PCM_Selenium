package FunctionalFolwTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import FunctionalFlow.CMLaunchFlow;
import Pages.Dashboard_GUI_Validation;
import Pages.LoginPage;

public class CMLaunchFlowTestcases extends TestBase {
	LoginPage login;
	CMLaunchFlow CMLF;
	Dashboard_GUI_Validation dsb;
	
	@BeforeMethod 
	public void setup() throws Exception
	{
	initalization();
	dsb = new Dashboard_GUI_Validation();
	login = new LoginPage();
	login.loginToApp();
	CMLF= new CMLaunchFlow();
	CMLF.readExcelAndAssignValues();
	}
	@Test (enabled = true, priority =0)
	public void PrintAssignedValues() throws Exception
	{
		CMLF.printAssignedValues();
	}
	@Test (enabled = true, priority =1)
	public void createNewCMTest() throws Exception
	{
		dsb.openCMForm();
		CMLF.CreateNewCM();
	}
	@Test (enabled = true, priority =2)
	public void verifyCMAttachments() throws Exception
	{
		CMLF.OpenCreatedCM();
		CMLF.VerifyCMAttachments();
	}
	@Test (enabled = true, priority =3,dependsOnMethods = "verifyCMAttachments")
	public void fillTheDetailsTest() throws Exception
	{
		CMLF.OpenCreatedCM();
		CMLF.fillTheDetails();
	}
	@Test (enabled = true, priority =4,dependsOnMethods = "fillTheDetailsTest")
	public void verifyCMChangesTest() throws Exception
	{
		CMLF.OpenCreatedCM();
		CMLF.VerifyCMChanges();
	}
	@Test (enabled = true, priority =5,dependsOnMethods = "verifyCMChangesTest")
	public void contentTeamApprovalTest() throws Exception
	{
		CMLF.OpenCreatedCM();
		CMLF.ContentTeamApproval();
	}
	@Test (enabled = true, priority =6,dependsOnMethods = "contentTeamApprovalTest")
	public void verifyCTChnages() throws Exception
	{
		CMLF.OpenCreatedCMForSM();
		CMLF.VerifyCTChnages();
	}
	@Test (enabled = true, priority =7,dependsOnMethods = "verifyCTChnages")
	public void SMTeamApprovalTest() throws Exception
	{
		CMLF.OpenCreatedCMForSM();
		CMLF.SMTeamApproval();
	}
	@Test (enabled = true, priority =8,dependsOnMethods = "SMTeamApprovalTest")
	public void EPGTeamApprovalTest() throws Exception
	{
		CMLF.OpenCreatedCMForEPG();
		CMLF.EPGTeamApproval();
	}
	@Test (enabled = true, priority =9,dependsOnMethods = "EPGTeamApprovalTest")
	public void verifyFPMStatusTest() throws Exception
	{
		CMLF.OpenCreatedCMForEPG();
		CMLF.VerifyFPMStatus(); 
	}
	@Test (enabled = true, priority =10,dependsOnMethods = "verifyFPMStatusTest")
	public void getCAIDCombination() throws Exception
	{
		CMLF.OpenCreatedCMForEPG();
		CMLF.GetCAIDCombination1();
	}

	@Test (enabled = true, priority =11,dependsOnMethods = "getCAIDCombination")
	public void CMChangesTest() throws Exception
	{
		CMLF.OpenCreatedCMForTechnology();
		CMLF.CMChanges();
	}
	@Test (enabled = true, priority =12,dependsOnMethods = "CMChangesTest")
	public void BrdFPMChangesTest() throws Exception
	{
		CMLF.BrdFPMChanges();
	}
	@Test (enabled = true, priority =13,dependsOnMethods = "BrdFPMChangesTest")
	public void TPPackChangesTest() throws Exception
	{
		CMLF.OpenCompletedCM();
		CMLF.TPPackChanges();
	}
	@Test (enabled = true, priority =14,dependsOnMethods = "TPPackChangesTest")
	public void ALCFPMChangesTest() throws Exception
	{
		CMLF.OpenCompletedCM();
		CMLF.ALCFPMChanges();
	}
	@Test (enabled = true, priority =15,dependsOnMethods = "ALCFPMChangesTest")
	public void ALCBPMChangesTest() throws Exception
	{
		CMLF.OpenCompletedCM();
		CMLF.ALCBPMChanges();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}


