package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;

import BasePackage.TestBase;


public class FPMPageSanity extends TestBase{
	
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
	
	@FindBy(xpath="//a[@id='jazz_ui_MenuPopup_3']") private WebElement projectAreas;
	@FindBy(xpath="//span [text()='Tata_Play']") private WebElement tataPlayProject;
	@FindBy(xpath="//span [text()='Explore Project']") private WebElement exploreProject;
	@FindBy(xpath="//span [text()='Work Items']") private WebElement workItem;
	@FindBy(xpath="//span [text()='PCF']") private WebElement createPCFWorkItem;
	@FindBy(xpath="//a[@role='tab']") private WebElement allTabList;
	
		
		//Constructor for element initialization
		public FPMPageSanity() {
			PageFactory.initElements(driver, this);
		}

		public void getTitle1() {
			System.out.println(driver.getTitle());
		}

			
		
//		// Open PCF form
//		public void openPCFPage() throws InterruptedException
//		{
//			projectAreas.click();
//			Thread.sleep(5000);
//			tataPlayProject.click();
//			Thread.sleep(5000);
//			exploreProject.click();
//			Thread.sleep(5000);
//			workItem.click();
//			Thread.sleep(5000);
//			createPCFWorkItem.click();
//			Thread.sleep(5000);
//		} 
//		
//		//List of Tabs
//		public void getAllTabList()
//		{
//			List<WebElement> elements = driver.findElements(By.xpath("//a[@role='tab']"));
//			for (WebElement element : elements)
//			{
//	            System.out.println(element.getText());
//			} 
//		}
//		
//		//List of Label
//		public void SectionTopPadding()
//		{
//			List<WebElement> elements = driver.findElements(By.xpath("//span[@class='SectionTopPadding']"));
//			for (WebElement element : elements)
//			{
//	            System.out.println(element.getText());
//			} 
//		
//		}
//		//List of all attributes in PCF
//		public void LabelColumn()
//		{
//			List<WebElement> elements = driver.findElements(By.xpath("//th[@class='Column LabelColumn']"));
//			for (WebElement element : elements)
//			{
//	            System.out.println(element.getText());
//			} 
//		}
//		public void verifylabelAndValue()
//		{
//			List<WebElement> elements = driver.findElements(By.xpath("//tr[@class='LabelValueTableRow']"));
//			for (WebElement element : elements)
//			{
//	            System.out.println(element.getText());
//			} 
//		}
//		public void verifyOnlyValueHolder()
//		{
//			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ValueHolder ViewBorder']"));
//			for (WebElement element : elements)
//			{
//	            System.out.println(element.getText());
//			} 
//		}
//		public void getAttributesAndValues()
//		{
//			// Find elements using CSS selector or XPath expression
//			List<WebElement> attributeElements = driver.findElements(By.xpath("//th[@class='Column LabelColumn']"));
//
//		    // Create a list to store attribute-value pairs
//		    List<String> attributeValueList = new ArrayList<>();
//
//		        // Extract attribute names and default values
//		        for (WebElement element : attributeElements) {
//		            String attributeName = element.getText();
//		            String attributeValue = element.getAttribute("attribute-value");
//		            attributeValueList.add(attributeName + ": " + attributeValue);
//		        }
//		        for (String attributeValue : attributeValueList)
//		        {
//		         System.out.println(attributeValue);
//		        }
//			}
//		  public  void verifyOnlyethelabelWithValue()
//		  {
//			  List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='ValueHolder ViewBorder']/parent::div/parent::td/parent::tr"));
//
//			  for (WebElement element : webElements)
//				{
//		            System.out.println(element.getText());
//				}
//		  }
	}
		//Encapsulation = data (private) + method (public)


