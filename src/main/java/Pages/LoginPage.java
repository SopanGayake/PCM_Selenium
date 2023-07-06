package Pages;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.TestBase;


public class LoginPage extends TestBase{
	
	//Object Repository GUI
	
	
	@FindBy(xpath="//*//*[@id=\"jazz_app_internal_LoginWidget_0\"]/div[1]/div[1]/div[1]/div") private WebElement jazzLogo;
	@FindBy(xpath="//div[@class='serverInfo']") private WebElement LoginInstruction;
	@FindBy(xpath="//div[@class='illustration']") private WebElement Image;
	@FindBy(xpath="//label [text()='User ID:']") private WebElement UserIDlabel;
	@FindBy(xpath="//div[@widgetid='jazz_app_internal_LoginWidget_0_userId']") private WebElement UserIDBorder;
	@FindBy(xpath="//input[@name='j_username']") private WebElement UserIDTextBox;
	@FindBy(xpath="//input[@name='j_password']") private WebElement PasswordLabel;
	@FindBy(xpath="//input[@name='j_password']") private WebElement PasswordTextBox;
	@FindBy(xpath="//div[@widgetid='jazz_app_internal_LoginWidget_0_password']") private WebElement PasswordBorder;
	@FindBy(xpath="//button[@type='submit']") private WebElement SubmitButton;
	@FindBy(xpath="//input[@name='rememberUserId']") private WebElement rememberUserIdCheckBox;
	@FindBy(xpath="//label [text()='Remember my User ID']") private WebElement rememberUserIdLabel;
	@FindBy(xpath="//div[@class='loginErrorMessage']") private WebElement loginErrorMessage;
	@FindBy(xpath="//div[@class='loginDialogFooter']") private WebElement loginFooter;
	@FindBy(xpath="////a[@class='rational-logo']") private WebElement rationalLogo;
	@FindBy(xpath="//a[@class='ibm-logo']") private WebElement ibmLogo;
	@FindBy(xpath="//div[@class='content']") private WebElement containerNode;
	@FindBy(xpath="//span[@class='user-name']") private WebElement UserName;
		
		//Constructor for element initialization
		public LoginPage()
		{
		PageFactory.initElements(driver, this);
		}
		
		// GUI Testing for jazzLogo
		public Dimension TestJazzLogo()
		{
			System.out.println("is java visible"+ jazzLogo.isDisplayed());
			return jazzLogo.getSize();
		} 
		public String getLoginInstruction()
		{
		return LoginInstruction.getText();
		}
		public Dimension verifyImage()
		{
		return Image.getSize();
		}
		public String verifyUserIDlabel()
		{
		return UserIDlabel.getText();
		}
		public Dimension verifyUserIDBorder()
		{
		return UserIDBorder.getSize();
		}
		public void verifyUserIDTextBox()
		{
		UserIDTextBox.sendKeys("123");
		UserIDTextBox.clear();
		UserIDTextBox.sendKeys("abc");
		UserIDTextBox.clear();
		UserIDTextBox.sendKeys("*#$");
		UserIDTextBox.clear();
		UserIDTextBox.sendKeys("1a*");
		System.out.println("we can enter all dataType");
		}
		
		public String verifyPasswordLabel()
		{
		return PasswordLabel.getText();
		}
		public Dimension verifyPasswordBorder()
		{
		return PasswordBorder.getSize();
		}
		public void verifyPasswordTextBox()
		{
		UserIDTextBox.sendKeys("123");
		UserIDTextBox.clear();
		UserIDTextBox.sendKeys("abc");
		UserIDTextBox.clear();
		UserIDTextBox.sendKeys("*#$");
		UserIDTextBox.clear();
		UserIDTextBox.sendKeys("1a*");
		System.out.println("we can enter all dataType");
		}
		public void verifySubmitButton()
		{
			System.out.println(SubmitButton.getSize());
			System.out.println(SubmitButton.getText());
		}
		public void verifyrememberUserIdCheckBox() throws InterruptedException
		{
			System.out.println(rememberUserIdCheckBox.getSize());
			rememberUserIdCheckBox.click();
			Thread.sleep(2000);
			boolean isSelected1 = rememberUserIdCheckBox.isSelected();
			if (isSelected1) {
			    System.out.println("Yes");
			} else {
			    System.out.println("No");
			}
			rememberUserIdCheckBox.click();
			boolean isSelected2 = rememberUserIdCheckBox.isSelected();
			if (isSelected2) {
			    System.out.println("Yes");
			} else {
			    System.out.println("No");
			}
		}
		public void verifyRememberUserIdLabel()
		{
			String buttonText = rememberUserIdLabel.getText();
			String comparisonString = "Remember my User ID";

			if (buttonText.equals(comparisonString)) {
			    System.out.println("The button text is equal to 'Remember my User ID'.");
			} else {
			    System.out.println("The button text is not equal to 'Remember my User ID'.");
			}
		}
		public String VerifyLoginErrorMessage()
		{
			if (loginErrorMessage.isDisplayed()){
			    System.out.println("test case fail");
			} else {
				PasswordTextBox.sendKeys("123");
				SubmitButton.click();
			}
			return loginErrorMessage.getText();
		}
		public void verifyLoginFooter()
		{
			String loginFooterText = loginFooter.getText();
			String comparisonString ="Licensed Material - Property of IBM Corp. © Copyright IBM Corp. and its licensors 2008, 2019. All Rights Reserved. IBM, the IBM logo, Jazz, and Rational are trademarks of IBM Corporation, in the United States, other countries and regions, or both. Built on Eclipse is a trademark of Eclipse Foundation, Inc. Java and all Java-based trademarks and logos are trademarks or registered trademarks of Oracle and/or its affiliates in the United States, other countries and regions, or both.";

			if (loginFooterText.equals(comparisonString)) {
			    System.out.println("The button text is equal to expected text");
			} else {
				System.out.println(loginFooterText);
			    System.out.println("The button text is not equal to to expected text");
			}
		}
		public void loginToApp() throws InterruptedException, IOException
		{
			UserIDTextBox.sendKeys(readPropertyFile("user_id"));
			PasswordTextBox.sendKeys(readPropertyFile("password"));
			SubmitButton.click();
			
		}
	}

		//Encapsulation = data (private) + method (public)


