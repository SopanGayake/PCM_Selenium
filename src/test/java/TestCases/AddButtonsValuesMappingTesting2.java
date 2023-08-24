package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.AddButtonsValuesMapping;
import Pages.LoginPage;

public class AddButtonsValuesMappingTesting2 extends TestBase {
		LoginPage login;
		AddButtonsValuesMapping ab;
		@BeforeTest
		public void setup() throws IOException, InterruptedException
		{
		initalization();
		ab = new AddButtonsValuesMapping();
		}
		@Test(enabled = false)
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
		@AfterMethod
		public void exit() {
		System.out.println("s");
		driver.navigate().back();
		}
}
