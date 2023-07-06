package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.LoginPage;
import Pages.PCF_GUI_Page;

public class PCF_GUI_TestCases extends TestBase {
	LoginPage login;
	PCF_GUI_Page pcf;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	initalization();
	login = new LoginPage();
	pcf = new PCF_GUI_Page();
	login.loginToApp();
	Thread.sleep(5000);
	pcf.openPCFPage();
	}
	
	@Test(enabled = false)
	public void getAllTabListTest()  
	{
		pcf.getAllTabList();
	}
	
	@Test(enabled = false)
	public void SectionTopPaddingTest()  
	{
		pcf.SectionTopPadding();
	}
	
	@Test(enabled = false)
	public void LabelColumnTest()  
	{
		pcf.LabelColumn();
	}
	@Test(enabled = false)
	public void verifyOnlyValueHolderTest()  
	{
		pcf.verifyOnlyValueHolder();
	}
	@Test(enabled = false)
	public void verifylabelAndValueTest()
	{
		pcf.verifylabelAndValue();
	}
	@Test(enabled = false)
	public void getAttributesAndValuesTest()
	{
		pcf.getAttributesAndValues();
	}
	@Test(enabled = true)
	public void verifyOnlyethelabelWithValueTest()
	{
		pcf.verifyOnlyethelabelWithValue();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
