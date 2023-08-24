package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import BasePackage.TestBase;
public class CM_GUI_Validation extends TestBase {
	//Object Repository GUI
	@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
	@FindBy(xpath="//span[text()='CM']") private WebElement SelectCMWI;
	@FindBy(xpath="//p[text()='Channel Master']") private WebElement SelectChannelMasterTab;
	@FindBy(xpath="//p[text()='Content Team ']") private WebElement ContentTeamSection;
	@FindBy(xpath="//p[text()='Subscriber Marketing Team ']") private WebElement SubscriberMarketingTeam;
	@FindBy(xpath="//p[text()='EPG Team ']") private WebElement EPGTeamAtributs;
	@FindBy(xpath="//p[text()='Technology Team ']") private WebElement TechnologyTeamAtributes;
	@FindBy(xpath="//p[text()='Video Details ']") private WebElement VideoDetailsAtributes;
	@FindBy(xpath="//p[text()='Content & Technology ']") private WebElement ContentTechnologyAtributes;
	@FindBy(xpath="//p[text()='Audio Details ']") private WebElement AudioDetailsAtributes;
	@FindBy(xpath="//p[text()='Technical Contact Details - Broadcaster ']") private WebElement TechnicalContactDetailsBroadcasterAtributes;
	@FindBy(xpath="//p[text()='Distribution Contact Details  ']") private WebElement DistributionContactDetailsAtributes;
	@FindBy(xpath="//p[text()='Distribution Contact Details - EPG ']") private WebElement DistributionContactDetailsEPG;
	@FindBy(xpath="//p[text()='Satellite Details ']") private WebElement SatelliteDetailsAtributes;
	@FindBy(xpath="//p[text()='logo platform']") private WebElement logoPlatformTab;
	@FindBy(xpath="//p[text()='logos platform ']") private WebElement logoPlatformSection;
	@FindBy(xpath="//p[text()='Approval']") private WebElement ApprovalAtributesTab;
	@FindBy(xpath="//p[text()='Approval ']") private WebElement ApprovalAtributesSection;
	
	public CM_GUI_Validation()
	{
	PageFactory.initElements(driver, this);
	}
	public void openCMPage() throws InterruptedException
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		WebElement header = driver.findElement(By.xpath("//h6[contains(text(), 'CM')]"));
		header.isDisplayed();
	} 
	public void validateCMDetailsFields () throws Exception
	{
		String alphabets  = "abc";
		String numbrs = "123";
		String SpeChar = "*&#";
		
		WebElement Title = driver.findElement(By.xpath("//input[@id='Title']"));
		Title.sendKeys(alphabets);
		String enteredValue1 = Title.getAttribute("value");
		Assert.assertEquals(enteredValue1, alphabets,"Strings do not match. Test failed.");
		Title.clear();
		Title.sendKeys(numbrs);
		String enteredValue2 = Title.getAttribute("value");
		Assert.assertEquals(enteredValue2, numbrs,"Strings do not match. Test failed.");
		Title.clear();
		Title.sendKeys(SpeChar);
		String enteredValue3 = Title.getAttribute("value");
		Assert.assertEquals(enteredValue3, SpeChar,"Strings do not match. Test failed.");
		
		WebElement CreatedBy = driver.findElement(By.xpath("//input[@id='Created By']"));
		CreatedBy.sendKeys(alphabets);
		String enteredValue4 = CreatedBy.getAttribute("value");
		Assert.assertEquals(enteredValue4, alphabets,"Strings do not match. Test failed.");
		CreatedBy.clear();
		CreatedBy.sendKeys(numbrs);
		String enteredValue5 = CreatedBy.getAttribute("value");
		Assert.assertEquals(enteredValue5, numbrs,"Strings do not match. Test failed.");
		CreatedBy.clear();
		CreatedBy.sendKeys(SpeChar);
		String enteredValue6 = CreatedBy.getAttribute("value");
		Assert.assertEquals(enteredValue6, SpeChar,"Strings do not match. Test failed.");
		
		WebElement CreationDate = driver.findElement(By.xpath("//input[@id='Creation Date']"));
		CreationDate.sendKeys(alphabets);
		String enteredValue7 = CreationDate.getAttribute("value");
		Assert.assertEquals(enteredValue7, alphabets,"Strings do not match. Test failed.");
		CreationDate.clear();
		CreationDate.sendKeys(numbrs);
		String enteredValue8 = CreationDate.getAttribute("value");
		Assert.assertEquals(enteredValue8, numbrs,"Strings do not match. Test failed.");
		CreationDate.clear();
		CreationDate.sendKeys(SpeChar);
		String enteredValue9 = CreationDate.getAttribute("value");
		Assert.assertEquals(enteredValue9, SpeChar,"Strings do not match. Test failed.");
		
		WebElement WorkItemModifiedDate = driver.findElement(By.xpath("//input[@id='Work Item Modified Date']"));
		WorkItemModifiedDate.sendKeys(alphabets);
		String enteredValue10 = WorkItemModifiedDate.getAttribute("value");
		Assert.assertEquals(enteredValue10, alphabets,"Strings do not match. Test failed.");
		WorkItemModifiedDate.clear();
		WorkItemModifiedDate.sendKeys(numbrs);
		String enteredValue11 = WorkItemModifiedDate.getAttribute("value");
		Assert.assertEquals(enteredValue11, numbrs,"Strings do not match. Test failed.");
		WorkItemModifiedDate.clear();
		WorkItemModifiedDate.sendKeys(SpeChar);
		String enteredValue12 = WorkItemModifiedDate.getAttribute("value");
		Assert.assertEquals(enteredValue12, SpeChar,"Strings do not match. Test failed.");
		
		WebElement OldPCFReferenceWIID = driver.findElement(By.xpath("//input[@id='Old PCF Reference WI ID']"));
		OldPCFReferenceWIID.sendKeys(alphabets);
		String enteredValue13 = OldPCFReferenceWIID.getAttribute("value");
		Assert.assertEquals(enteredValue13, alphabets,"Strings do not match. Test failed.");
		OldPCFReferenceWIID.clear();
		OldPCFReferenceWIID.sendKeys(numbrs);
		String enteredValue14 = OldPCFReferenceWIID.getAttribute("value");
		Assert.assertEquals(enteredValue14, numbrs,"Strings do not match. Test failed.");
		OldPCFReferenceWIID.clear();
		OldPCFReferenceWIID.sendKeys(SpeChar);
		String enteredValue15 = OldPCFReferenceWIID.getAttribute("value");
		Assert.assertEquals(enteredValue15, SpeChar,"Strings do not match. Test failed.");
		
		WebElement Status = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
//		Select Value = new Select(Status);
//		Value.selectByVisibleText("Pending");
		Status.click();
		driver.findElement(By.xpath("//li[@data-value='Pending']")).click();
		String expectedOption = "Draft";
		String selectedOptionText = Status.getText();
		 if (selectedOptionText.equals(expectedOption)) {
	            System.out.println("Validation Passed: Selected option is correct.");
	        } else {
	        	throw new Exception("Failed because Texts are not matching");
	        }

		WebElement SaveButton = driver.findElement(By.xpath("//button[text()='Save']"));
		SaveButton.click();
		driver.findElement(By.xpath("//h6[contains(text(), 'CM - ')]"));
		
		
	} 
	public void VerifyAttributes0_4() throws Exception
	{
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement RefreshCMCheckBox = driver.findElement(By.xpath("//input[@name='Refresh CM']"));
		if (RefreshCMCheckBox.isSelected()) {
		    Assert.fail("CheckBox is selected.");
		}
		RefreshCMCheckBox.click();
		if (RefreshCMCheckBox.isSelected()) {
		    System.out.println("CheckBox is selected.");
		} else {
		    Assert.fail("CheckBox is not selected.");
		}
		
		WebElement NameOfBroadcasterDD = driver.findElement(By.xpath("//Select[@name='Name Of Broadcaster']"));
		Select Value = new Select(NameOfBroadcasterDD);
		Value.selectByVisibleText("Shemaroo");
		WebElement selectedOption = Value.getFirstSelectedOption();
		String expectedOption = "Shemaroo";
		if (selectedOption.getText().equals(expectedOption)) {
			System.out.println("Dropdown Value matching with Selected Value");
		}
		 else {
			 Assert.fail("Dropdown Value not matching with Selected Value");
		}
		String alphabets  = "abc";
		String numbrs = "123";
		String SpeChar = "*&#";
		
		WebElement ChannelNameTextBox = driver.findElement(By.xpath("//input[@name='Channel Name']"));
		ChannelNameTextBox.sendKeys(alphabets);
		String enteredValue1 = ChannelNameTextBox.getAttribute("value");
		Assert.assertEquals(enteredValue1, alphabets,"TextBox text do not match. Test failed.");
		ChannelNameTextBox.clear();
		ChannelNameTextBox.sendKeys(numbrs);
		String enteredValue2 = ChannelNameTextBox.getAttribute("value");
		Assert.assertEquals(enteredValue2, numbrs,"TextBox text do not match. Test failed.");
		ChannelNameTextBox.clear();
		ChannelNameTextBox.sendKeys(SpeChar);
		String enteredValue3 = ChannelNameTextBox.getAttribute("value");
		Assert.assertEquals(enteredValue3, SpeChar,"TextBox text do not match. Test failed.");
		
		WebElement ChannelRevisedDateTB = driver.findElement(By.xpath("//input[@name='Channel Revised Date']"));
		ChannelRevisedDateTB.sendKeys(alphabets);
		String enteredValue4 = ChannelRevisedDateTB.getAttribute("value");
		Assert.assertEquals(enteredValue4, alphabets,"TextBox text do not match. Test failed.");
		ChannelRevisedDateTB.clear();
		ChannelRevisedDateTB.sendKeys(numbrs);
		String enteredValue5 = ChannelRevisedDateTB.getAttribute("value");
		Assert.assertEquals(enteredValue5, numbrs,"TextBox text do not match. Test failed.");
		ChannelRevisedDateTB.clear();
		ChannelRevisedDateTB.sendKeys(SpeChar);
		String enteredValue6 = ChannelRevisedDateTB.getAttribute("value");
		Assert.assertEquals(enteredValue6, SpeChar,"TextBox text do not match. Test failed.");
	}
	public void SecondaryGenreAddButton() throws Exception
	{
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement SecondaryGenreAddButton = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[1]"));
		SecondaryGenreAddButton.click();
		
		WebElement OkButton = driver.findElement(By.xpath("//button[text()='OK']"));
		if (OkButton.isEnabled()) {
		    Assert.fail("Ok Button is already Enabled.");
		}
		WebElement CatType = driver.findElement(By.xpath("//Select[@class='selectSelect']"));
		Select Value = new Select(CatType);
		Value.selectByVisibleText("PCF");
		
		WebElement phraseSearch = driver.findElement(By.xpath("//input[@class='QueryInput']"));
		phraseSearch.sendKeys("Test flow");
		
		WebElement Result = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		Result.click();
		Thread.sleep(2000);
		OkButton.click();
		
		// we should validate the Selected value = Should throw null
		WebElement SelectedLinks = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/div)[1]"));
		String SelectedValue = SelectedLinks.getAttribute("Value");
		System.out.println(SelectedValue);
		
	}
	public void SecondaryGenreAddButtonNegative() throws Exception
	{
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement SecondaryGenreAddButton = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[1]"));
		SecondaryGenreAddButton.click();
		
		WebElement CatType = driver.findElement(By.xpath("//Select[@class='selectSelect']"));
		Select Value = new Select(CatType);
		Value.selectByVisibleText("RFC");
		
		WebElement phraseSearch = driver.findElement(By.xpath("//input[@class='QueryInput']"));
		phraseSearch.sendKeys("App test");
		
		WebElement Result = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		System.out.println(Result.getText());
		Result.click();
		Thread.sleep(2000);
		WebElement CancelButton = driver.findElement(By.xpath("//button[text()='Cancel']"));
		CancelButton.click();
		
		// we should validate the Selected value = Throwing null
		WebElement SelectedLinks = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/div)[1]"));
		String SelectedValue = SelectedLinks.getAttribute("Value");
		System.out.println(SelectedValue);
		
	}
}
	