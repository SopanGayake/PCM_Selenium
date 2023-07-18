package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.FPMPageSanity;
import Pages.LoginPage;

public class FPMSanityTestCases extends TestBase {
	LoginPage login;
	FPMPageSanity fpm;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	initalization();
	fpm = new FPMPageSanity();
	}
	
//	@Test(enabled = false)
//	public void getAllTabListTest()
//	{
//		fpm.getAllTabList();
//	}
//	
//	@Test(enabled = false)
//	public void SectionTopPaddingTest()  
//	{
//		fpm.SectionTopPadding();
//	}
//	
//	@Test(enabled = false)
//	public void LabelColumnTest()  
//	{
//		fpm.LabelColumn();
//	}
//	@Test(enabled = false)
//	public void verifyOnlyValueHolderTest()  
//	{
//		fpm.verifyOnlyValueHolder();
//	}
//	@Test(enabled = false)
//	public void verifylabelAndValueTest()
//	{
//		fpm.verifylabelAndValue();
//	}
//	@Test(enabled = false)
//	public void getAttributesAndValuesTest()
//	{
//		fpm.getAttributesAndValues();
//	}
//	@Test(enabled = true)
//	public void verifyOnlyethelabelWithValueTest()
//	{
//		fpm.verifyOnlyethelabelWithValue();
//	}
	@Test(enabled = true)
	public void getTitleTest()
	{
		fpm.getTitle1();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
