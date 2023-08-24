package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.CM_DropdownsValidationPage;
import Pages.LoginPage;

public class CM_DropdownsTesting extends TestBase { 
	LoginPage login;
	CM_DropdownsValidationPage DD;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException  
	{
	initalization();
	DD = new CM_DropdownsValidationPage();
	}
	@Test(enabled = true)
	public void NameOfBroadcasterDDTest() throws Exception
	{
		DD.NameOfBroadcasterDD();
	}
	@Test(enabled = true)
	public void PrimaryGenreDDTest() throws Exception
	{
		DD.PrimaryGenreDD();
	}
	@Test(enabled = true)
	public void AudioLanguageDDTest() throws Exception
	{
		DD.AudioLanguageDD();
	}
	@Test(enabled = true)
	public void TypeofChannelDDTest() throws Exception
	{
		DD.TypeofChannelDD();
	}
	@Test(enabled = true)
	public void SDMappingYesNoDDTest() throws Exception
	{
		DD.SDMappingYesNo();
	}
	@Test(enabled = true)
	public void RENTAL_FLAGDDTest() throws Exception
	{
		DD.RENTAL_FLAG_DD();
	}
	@Test(enabled = true)
	public void PAYABLE_FLAGDDTest() throws Exception
	{
		DD.PAYABLE_FLAG_DD();
	}
	@Test(enabled = true)
	public void TypeOfTataPlayServicesTest() throws Exception
	{
		DD.TypeOfTataPlayServicesDD();
	}
	@Test(enabled = true)
	public void ReaddchannelDDTest() throws Exception
	{
		DD.ReaddchannelDD();
	}
	@Test(enabled = true)
	public void ChannelStatusDDTest() throws Exception
	{
		DD.ChannelStatusDD();
	}
	@Test(enabled = true)
	public void ChannelModelDDTest() throws Exception
	{
		DD.ChannelModelDD();
	}
	@Test(enabled = true)
	public void PackagingGenreDDTest() throws Exception
	{
		DD.PackagingGenreDD();
	}
	@Test(enabled = true)
	public void RecommendedGenreDDTest() throws Exception
	{
		DD.RecommendedGenreDD();
	}
	@Test(enabled = true)
	public void EncryptedDDTest() throws Exception
	{
		DD.EncryptedDD();
	}
	@Test(enabled = true)
	public void ServiceTypeDDTest() throws Exception
	{
		DD.ServiceTypeDD();
	}
	@AfterMethod
	public void exit() {
	driver.close();
	}
}