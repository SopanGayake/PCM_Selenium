package Pages;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.TestBase;


public class LoginPage extends TestBase{
	
	//Object Repository GUI
	
	
	@FindBy(xpath="//*[@id=\"jazz_app_internal_LoginWidget_0\"]/div[1]/div[1]/div[1]/div") private WebElement jazzLogo;
	@FindBy(xpath="//div[@class='serverInfo']") private WebElement ServerInfo;
	@FindBy(xpath="//input[@name='j_username']") private WebElement UserIDTextBox;
	@FindBy(xpath="//input[@name='j_password']") private WebElement PasswordTextBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement SubmitButton;
	@FindBy(xpath="//span[@class='user-name']") private WebElement UserName;
	
		public LoginPage()
		{
		PageFactory.initElements(driver, this);
		}
		public Dimension jazzLogo()
		{
		return jazzLogo.getSize();
		}
		public String ServerInfoTest()
		{
		return ServerInfo.getText();
		}
		
//		public String verifyTitle()
//		{
//		return driver.getTitle();
//		}
//		public String verifyTitle()
//		{
//		return driver.getTitle();
//		}
		public void loginToApp() throws InterruptedException, IOException
		{
			UserIDTextBox.sendKeys(readPropertyFile("user_id"));
			PasswordTextBox.sendKeys(readPropertyFile("password"));
			SubmitButton.click();
			Thread.sleep(5000);
			System.out.println(UserName.getText());
		}
		
		public static String student()
		{
			return "Sopan";
		}
	}

		//Encapsulation = data (private) + method (public)


