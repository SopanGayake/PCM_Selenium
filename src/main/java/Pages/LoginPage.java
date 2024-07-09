package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BasePackage.TestBase;


public class LoginPage extends TestBase{
	
	//Object Repository GUI
	
	
	@FindBy(xpath="//input[@name='username']") private WebElement UserIDTextBox;
	@FindBy(xpath="//input[@name='password']") private WebElement PasswordTextBox;
	@FindBy(xpath="//button[text()='Sign In']") private WebElement SigninButton;
		//Constructor for element initialization
		public LoginPage()
		{
		PageFactory.initElements(driver, this);
		}
		 
		public void verifyWelcomeHeading() throws Exception
		{
			WebElement WelcomeHeading = driver.findElement(By.xpath("//Span[text()='Welcome to Channel and Pack Management']"));
			WelcomeHeading.isDisplayed();
			driver.findElement(By.xpath("//span[text()='Login']"));
			Dimension Size = WelcomeHeading.getSize();
			System.out.println(Size);
//			Dimension Expected = new Dimension(1232, 45);
//			boolean isEqual = Size.equals(Expected);
//			 if (isEqual) {
//		            System.out.println("Please fill out this field.");
//		        } else {
//		        	throw new Exception("Failed because result is not equal.");
//		        }
		}
		
		public void verifyUsername() throws Exception
		{
			WebElement EmailIDLabel = driver.findElement(By.xpath("//span[text()='Username']"));
			EmailIDLabel.isDisplayed();
			UserIDTextBox.sendKeys("123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='123']"));
			UserIDTextBox.sendKeys(Keys.CONTROL+"a");
			UserIDTextBox.sendKeys(Keys.BACK_SPACE);
			UserIDTextBox.sendKeys("abc");
			driver.findElement(By.xpath("//input[@value='abc']"));
			UserIDTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			UserIDTextBox.sendKeys("*#$");
			driver.findElement(By.xpath("//input[@value='*#$']"));
			UserIDTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			UserIDTextBox.sendKeys("1a*");
			driver.findElement(By.xpath("//input[@value='1a*']"));
			driver.findElement(By.xpath("//p[text()='Please enter password']"));
		}
		public void verifyPassword(){
			WebElement PasswordLabel = driver.findElement(By.xpath("//span[text()='Password']"));
			PasswordLabel.isDisplayed();
			PasswordTextBox.sendKeys("123");
			Assert.assertEquals(PasswordTextBox.getAttribute("value"),"123",PasswordTextBox.getAttribute("value"));
			PasswordTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			PasswordTextBox.sendKeys("abc");
			Assert.assertEquals(PasswordTextBox.getAttribute("value"),"abc",PasswordTextBox.getAttribute("value"));
			PasswordTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			PasswordTextBox.sendKeys("*#$");
			Assert.assertEquals(PasswordTextBox.getAttribute("value"),"*#$",PasswordTextBox.getAttribute("value"));
			PasswordTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			PasswordTextBox.sendKeys("1a*");
			Assert.assertEquals(PasswordTextBox.getAttribute("value"),"1a*",PasswordTextBox.getAttribute("value"));
			driver.findElement(By.xpath("//p[text()='Please enter username']"));

		}
		public void verifySigninButton() throws Exception
		{
			SigninButton.isEnabled();
			SigninButton.click();
			driver.findElement(By.xpath("//p[text()='Please enter username']"));
			UserIDTextBox.sendKeys(readPropertyFile("user_id"));
			SigninButton.click();
            driver.findElement(By.xpath("//p[text()='Please enter password']"));
			PasswordTextBox.sendKeys(readPropertyFile("user_id"));
			SigninButton.click();
			// Need to Check the error message
			PasswordTextBox.sendKeys(readPropertyFile("password"));
			UserIDTextBox.sendKeys(readPropertyFile("password"));
			SigninButton.click();
			// Need to Check the error message
			PasswordTextBox.sendKeys(readPropertyFile("password"));
			UserIDTextBox.sendKeys(readPropertyFile("user_id"));
			
			
//			Dimension Size = SigninButton.getSize();
//			System.out.println(Size);
//			Dimension Expected = new Dimension(185, 36);
//			boolean isEqual = Size.equals(Expected);
//			 if (isEqual) {
//		            System.out.println("The result is equal.");
//		        } else {
//		        	throw new Exception("Failed because result is not equal.");
//		        }
		}
		public void loginToApp() throws Exception 
		{
			SendKey("UserIDTextBox_XPATH", readPropertyFile("user_id") );
			SendKey("PasswordTextBox_XPATH" , readPropertyFile("password"));
			click("SigninButton_XPATH");
		}
	}



