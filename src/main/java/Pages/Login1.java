package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePackage.BaseTest;

public class Login1 extends BaseTest{
	
	@FindBy(xpath="//input[@name='username']") private WebElement UserIDTextBox;
	@FindBy(xpath="//input[@name='password']") private WebElement PasswordTextBox;
	@FindBy(xpath="//button[text()='Sign In']") private WebElement SigninButton;
	
	@Test(enabled = true)
	public void start() throws Exception 
	{
		WebElement EmailIDLabel = driver.findElement(By.xpath("//span[text()='Username']"));
		EmailIDLabel.isDisplayed();
		UserIDTextBox.sendKeys("123");
		driver.findElement(By.xpath("//input[@value='123']"));
		UserIDTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
	}
	@Test(enabled = false)
	public void loginToApp() throws Exception 
	{
		SendKey("UserIDTextBox_XPATH", readPropertyFile("user_id") );
		SendKey("PasswordTextBox_XPATH" , readPropertyFile("password"));
		click("SigninButton_XPATH");
	}
	@Test(enabled = false)
	public void verifyUsername()
	{
		WebElement EmailIDLabel = driver.findElement(By.xpath("//span[text()='Username']"));
		EmailIDLabel.isDisplayed();
		UserIDTextBox.sendKeys("123");
		driver.findElement(By.xpath("//input[@value='123']"));
		UserIDTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
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
	@Test(enabled = false)
	public void verifyPassword(){
		WebElement PasswordLabel = driver.findElement(By.xpath("//span[text()='Password']"));
		PasswordLabel.isDisplayed();
		PasswordTextBox.sendKeys("123");
		driver.findElement(By.xpath("//input[@value='123']"));
		PasswordTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		PasswordTextBox.sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='abc']"));
		PasswordTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		PasswordTextBox.sendKeys("*#$");
		driver.findElement(By.xpath("//input[@value='*#$']"));
		PasswordTextBox.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		PasswordTextBox.sendKeys("1a*");
		driver.findElement(By.xpath("//input[@value='1a*']"));
		driver.findElement(By.xpath("//p[text()='Please enter username']"));

	}
	@Test(enabled = false)
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
	}
}
