package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.TestBase;
import Pages.LoginPage;

public class LoginTestCases extends TestBase {
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	//TC_LI_UI001
	{
	initalization();
	login = new LoginPage();
	login.loginToApp();
	}
	
//	@Test(enabled = true)
//	public void TestJazzLogoTest()
//	{
//	 Dimension Size =login.TestJazzLogo();
//	 System.out.println("Jazz logo size = "+Size);
//	}
//	@Test(enabled = true)
//	public void getLoginInstructionTest()
//	{
//		String instruction =login.getLoginInstruction();
//		System.out.println("instruction = "+instruction);
//	}
//	@Test(enabled = true)
//	public void VerifyImageTest()
//	{
//		Dimension ImgSiza =login.verifyImage();
//		System.out.println("ImgSiza = "+ImgSiza);
//	}
//	@Test(enabled = true)
//	public void verifyUserIDlabelTest()
//	{
//		String Label =login.verifyUserIDlabel();
//		System.out.println("User Id Label = "+Label);
//	}
//	@Test(enabled = true)
//	public void verifyUserIDBorderTest()
//	{
//		Dimension TextBoxSize =login.verifyUserIDBorder();
//		System.out.println("User ID TextBoxSize = "+TextBoxSize);
//	}
//	@Test(enabled = true)
//	public void verifyUserIDTextBoxTest()
//	{
//		login.verifyUserIDTextBox();
//	}
//	@Test(enabled = true)
//	public void verifyPasswordLabelTest()
//	{
//		String Label =login.verifyPasswordLabel();
//		System.out.println("Password Label = "+Label);
//	}
//	@Test(enabled = true)
//	public void verifyPasswordBorderTest()
//	{
//		Dimension TextBoxSize =login.verifyPasswordBorder();
//		System.out.println("Password TextBoxSize = "+TextBoxSize);
//	}
//	@Test(enabled = true)
//	public void verifyPasswordTextBoxTest()
//	{
//		login.verifyPasswordTextBox();
//	}
	
//	@Test(enabled = true)
//	public void rememberUserIdCheckBoxTest() throws InterruptedException
//	{
//		login.verifyrememberUserIdCheckBox();
//	}
//	@Test(enabled = true)
//	public void verifyRememberUserIdLabelTest() throws InterruptedException
//	{
//		login.verifyRememberUserIdLabel();
//	}
//	@Test(enabled = true)
//	public void VerifyLoginErrorMessageTest() throws InterruptedException
//	{
//		String Message =login.VerifyLoginErrorMessage();
//		System.out.println("Message = "+ Message);
//	}
//	@Test(enabled = true)
//	public void loginFooterTextTest()
//	{
//		login.verifyLoginFooter();
//	}
	@Test
	public void test()
	{
		System.out.println("ok");
	}
	@Test
	public void test2()
	{
		System.out.println("ok2");
	}
	@Test
	public void test3()
	{
		System.out.println("ok3");
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
