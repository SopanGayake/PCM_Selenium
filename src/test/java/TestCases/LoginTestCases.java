package TestCases;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.LoginPage;

public class LoginTestCases extends TestBase {
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
	initalization();
	login = new LoginPage();
	}
	
	@Test (enabled = true)
	public void PrintUser() throws InterruptedException
	{
	String name = LoginPage.student();
	System.out.println(name);
	Thread.sleep(5000);
	}
	@Test (enabled = true)
	public void jazzLogoTest() throws InterruptedException
	{
	Dimension size =((LoginPage) login).jazzLogo();
	System.out.println(size);
	}
	@Test (enabled = true)
	public void loginToAppTest() throws IOException, InterruptedException
	{
		login.loginToApp();
		Thread.sleep(5000);
	}
//	@Test (enabled = true)
//	public void readExcelFile1() throws  IOException, InterruptedException 
//	{
//		LoginPage.readExcelFile();
//		Thread.sleep(5000);
//	}
	@AfterMethod
	public void exit() {
	driver.close();
	}

}
