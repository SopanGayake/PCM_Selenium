package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.BPM_DropdownsValidation;
import Pages.CM_DropdownsValidationPage;
import Pages.LoginPage;

public class BPM_DropdownsTesting extends TestBase { 
	LoginPage login;
	BPM_DropdownsValidation DD;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException  
	{
	initalization();
	DD = new BPM_DropdownsValidation();
	}
	@Test(enabled = true)
	public void AllowExpiredPackCAIDDDTest() throws Exception
	{
		DD.AllowExpiredPackCAIDDD();
	}
	@Test(enabled = true)
	public void TypeOfPackDDTest() throws Exception
	{
		DD.TypeOfPackDD();
	}
	@Test(enabled = true)
	public void IsEncryptedPackDDTest() throws Exception
	{
		DD.IsEncryptedPackDD();
	}
	@Test(enabled = true)
	public void PackGenreDDTest() throws Exception
	{
		DD.PackGenreDD();
	}
	@Test(enabled = true)
	public void PackStatusDDTest() throws Exception
	{
		DD.PackStatusDD();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}