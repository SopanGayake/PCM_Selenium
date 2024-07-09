package Pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.TestBase;

public class PCF_GUIValidation extends TestBase {
	@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")private WebElement FormName;
	@FindBy(xpath = "//a[@aria-label='Created By']")private WebElement CreatedBy;
	@FindBy(xpath = "//p[@aria-label='Creation Date']]")private WebElement CreationDate;
	@FindBy(xpath = "//p[@aria-label='Modified Date']]")private WebElement ModifiedDate;
	@FindBy(xpath = "//p[@aria-label='Status']]")private WebElement Status;
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//p[text()='Package Creation Form']") private WebElement PackageCreationFormTab;
	@FindBy(xpath="//p[text()='Eligibility Account Type-Sub Type']") private WebElement EligibilityAccountTab;
	@FindBy(xpath="//p[text()='Charging Account Type-Sub Type']") private WebElement ChargingAccountTab;
	@FindBy(xpath="//p[text()='Alerts Bills Descriptions']") private WebElement AlertsBillsTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	@FindBy(xpath="//p[text()='Business Review']") private WebElement BusinessReviewTab;
	@FindBy(xpath="//p[text()='IT Review']") private WebElement ITReviewTab;
	@FindBy(xpath="//*[@data-testid='KeyboardBackspaceIcon']") private WebElement BackFromUtility;
	@FindBy(xpath="//textarea[@aria-label='Description of Charge']") private WebElement Textarea;
	@FindBy(xpath="//*[@aria-label='Refresh']") private WebElement Refresh;
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement SearchBox;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[20]//div[@aria-type='select']")})private List<WebElement>TwentySectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[20]//input[@type='number' or @type='Text']")})private List<WebElement> TwentySectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[19]//input[@type='number' or @type='Text']")})private List<WebElement> NinetSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[18]//textarea[@type='textarea']")})private List<WebElement> EightSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[18]//input[@type='number' or @type='Text']")})private List<WebElement> EightSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[17]//textarea[@type='textarea']")})private List<WebElement> SeventSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[17]//input[@type='number' or @type='Text']")})private List<WebElement> SeventSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[17]//div[@aria-type='select']")})private List<WebElement>SeventSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[17]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> SeventSectionDatePicker;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[16]//textarea[@type='textarea']")})private List<WebElement> SixtSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[16]//input[@type='number' or @type='Text']")})private List<WebElement> SixtSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[16]//div[@aria-type='select']")})private List<WebElement>SixtSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[15]//div[@aria-type='select']")})private List<WebElement>FiftSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[15]//input[@type='Text']")})private List<WebElement> FiftSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[15]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> FiftSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[15]//input[@type='checkbox']")})private List<WebElement> FiftSectionCheckBoxes;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[14]//input[@type='checkbox']")})private List<WebElement> FourtSectionCheckBoxes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[14]//input[@type='number' or @type='Text']")})private List<WebElement> FourtSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[14]//div[@aria-type='select']")})private List<WebElement>FourtSectionDropdown;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[13]//input[@type='number' or @type='Text']")})private List<WebElement> ThirtSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[13]//div[@aria-type='select']")})private List<WebElement> ThirtSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[12]//input[@type='Text']")})private List<WebElement> TwelthSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[12]//input[@type='number']")})private List<WebElement> TwelthSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[12]//div[@aria-type='select']")})private List<WebElement> TwelthSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//div[@aria-type='select']")})private List<WebElement> EleventhSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//input[@type='checkbox']")})private List<WebElement> EleventhSectionCheckBoxes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//input[@type='number' or @type='Text']")})private List<WebElement> EleventhSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[10]//input[@type='Text']")})private List<WebElement> TenthSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[10]//input[@class='PrivateSwitchBase-input css-1m9pwf3']")})private List<WebElement> TenthSectionRedio;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[10]//div[@aria-type='select']")})private List<WebElement> TenthSectionDropdown;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[9]//div[@aria-type='select']")})private List<WebElement> NinethSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[9]//textarea[@type='textarea']")})private List<WebElement> NinethSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[9]//input[@type='number' or @type='Text']")})private List<WebElement> NinethSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[8]//textarea[@type='textarea']")})private List<WebElement> EighthSectionTextarea;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[7]//div[@aria-type='select']")})private List<WebElement> SeventhSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[7]//textarea[@type='textarea']")})private List<WebElement> SeventhSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[7]//input[@type='Text']")})private List<WebElement> SeventhSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[7]//input[@type='number']")})private List<WebElement> SeventhSectionNumbers;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[6]//textarea[@type='textarea']")})private List<WebElement> SixthSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[6]//input[@type='Text']")})private List<WebElement> SixthSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[6]//input[@type='checkbox']")})private List<WebElement> SixthSectionCheckBoxes;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[5]//textarea[@type='textarea']")})private List<WebElement> FifthSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[5]//input[@type='number' or @type='Text']")})private List<WebElement> FifthSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[5]//div[@aria-type='select']")})private List<WebElement> FifthSectionDropdown;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//input[@type='Text']")})private List<WebElement> FourthSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//input[@type='number']")})private List<WebElement> FourthSectionNumbers;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//textarea[@type='textarea']")})private List<WebElement> FourthSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//div[@aria-type='select']")})private List<WebElement> FourthSectionDropdown;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> ThirdSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@type='Text']")})private List<WebElement> ThirdSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@type='number']")})private List<WebElement> ThirdSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//div[@aria-type='select']")})private List<WebElement> ThirdSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//textarea[@type='textarea']")})private List<WebElement> ThirdSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@type='checkbox']")})private List<WebElement> ThirdSectionCheckBoxes;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//input[@type='Text']")})private List<WebElement> SecondSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//input[@type='number']")})private List<WebElement> SecondSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//a[@style='cursor: pointer;']")})private List<WebElement> SecondSectionLinks;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//input[@type='checkbox']")})private List<WebElement> SecondSectionCheckBoxes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//div[@aria-type='select']")})private List<WebElement> SecondSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> SecondSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//textarea[@type='textarea']")})private List<WebElement> SecondSectionTextarea;
	@FindAll({@FindBy(xpath = "//span[text()='+ Add']")})private List<WebElement> SecondSectionAddButton;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//textarea[@type='textarea']")})private List<WebElement> LinksTabExcelImport;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//textarea[@type='textarea']")})private List<WebElement> FirstSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> FirstSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//a")})private List<WebElement> FirstSectionLinks;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='Text']")})private List<WebElement> FirstSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='number']")})private List<WebElement> FirstSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//div[@aria-type='select']")})private List<WebElement> FirstSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='checkbox']")})private List<WebElement> FirstSectionCheckBoxes;
	@FindAll({@FindBy(xpath = "//input[@type='number' and @maxlength='10']")})private List<WebElement> AllPrices;

	String PCFName = "PCFGUI";
	String IntValue = "100";
	String StrValue ="ABC";
	String Date = "2024-06-13T18:12";
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	
	public PCF_GUIValidation() { 
		PageFactory.initElements(driver, this);
	}
	//Supporting Methods
	public void OpenCreatedPCF() throws Exception
	{
		SearchBox.sendKeys(PCFName);
		SearchBox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        // Switch to the new tab
		Thread.sleep(1000);
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String originalWindowHandle = iterator.next();
        String newWindowHandle = iterator.next();
        driver.switchTo().window(newWindowHandle);
	}
	public void PCFFormDetails() throws Exception
	{	
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@aria-label='Modified Date' and contains(text(),'2024')]"));
		driver.findElement(By.xpath("//p[@aria-label='Creation Date' and contains(text(),'2024')]"));
		driver.findElement(By.xpath("//a[@aria-label='Created By' and text()='"+readPropertyFile("user_id")+"']"));
		driver.findElement(By.xpath("//div[@aria-haspopup='listbox' and text()='Draft']"));
	}
	public void PCFPriceValues() throws Exception
	{
		for (WebElement element : AllPrices)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys("11.11905");
		}
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : AllPrices)
		{
			System.out.println(element.getAttribute("value"));
		}
	}
	public void RequesterDetailsSectionValidation() throws Exception
	{	 
		for (WebElement element : FirstSectionCheckBoxes)
		{
			 if (element.getAttribute("checked") != null) 
				{
					{element.click();}
				}
			element.click();
			Thread.sleep(500);
			SaveButton.click();
			Thread.sleep(500);
			Assert.assertTrue(element.isSelected());
		} 
		for (WebElement element : FirstSectionDatePicker)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		}
		for (WebElement element : FirstSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FirstSectionTexts)
		{
			if(element.getAttribute("name") != null && element.getAttribute("name").equals("2009")) {
				Assert.assertEquals(element.getAttribute("value"),readPropertyFile("user_id"),"IntValue is not Updating");
			}
			else{Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");}
		}
		for (WebElement element : FirstSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
			SaveButton.click();
			Thread.sleep(1000);
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		} 
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}  
	public void PackageDetailsSectionValidation() throws Exception
	{	 
		List<WebElement> StateAnsLanguge = driver.findElements(By.xpath("//input[@name='3090' or @name='3043']"));
		for (WebElement element2 : StateAnsLanguge)
		{
			if (element2.getAttribute("checked") != null) 
			{
				if(!element2.getAttribute("value").equals("All India"))
				{element2.click();}
			}
			if(!element2.getAttribute("value").equals("All India"))
			{element2.click();}
		}  
		
		for (WebElement element : SecondSectionCheckBoxes)
		{
			if (element.getAttribute("checked") != null) 
			{
				if(!element.getAttribute("value").equals("All India"))
				{element.click();}
			}
			if(!element.getAttribute("value").equals("All India"))
			{element.click();}
		} 
		SaveButton.click();
		Thread.sleep(500);
		for (WebElement element : SecondSectionCheckBoxes)
		{
			if(!element.getAttribute("value").equals("All India")&& !element.getAttribute("name").equals("2021")) {
				Assert.assertEquals(element.getAttribute("checked"),"true",element.getAttribute("value"));}
		}
		for (WebElement element : SecondSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SecondSectionTexts)
		{
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("2034", "2051", "2035"));
			String elementName = element.getAttribute("name");
			if (elementName != null && unwantedNames.contains(elementName)) {
				Assert.assertNotEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");
			}
			else {Assert.assertEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");}
		}
		for (WebElement element : SecondSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SecondSectionNumber)
		{
			Assert.assertNotEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" IntValue is not Updating");
		}
		for (WebElement element : SecondSectionDatePicker)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		}
		for (WebElement element : SecondSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SecondSectionTextarea)
		{
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("Pack Detail1 (Short Description)", "Pack Detail2 (Long Description)"));
			String elementName = element.getAttribute("aria-label");
			if (elementName != null && unwantedNames.contains(elementName)) {
				Assert.assertEquals(element.getText(),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");
			}
			else {Assert.assertNotEquals(element.getText(),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");}
		} 
		
	} 
	public void AddButtonsValidation() throws Exception
	{	
		for (WebElement dropdown : SecondSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
	        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
	        options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : SecondSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
	        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("Pack Variation","#Any Box Type (Best Box) Validation for Acquisition packs","Offer Type for Services","Unit Of Measure(UoM)","Retrofit Credit for Mega Pack","Retrofit Flag","Rental Flag","Payable Flag","DAS Level Validation","Channel to be part of FTA","PDM_Product Line"));
			String elementName = dropdown.getAttribute("aria-label");
			if (elementName != null && unwantedNames.contains(elementName)) {			
				Assert.assertNotEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(2).click();
				}
			else{Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(2).click();
			}
		}
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		 for (int i = 0; i < SecondSectionAddButton.size(); i++) {
	        WebElement element = SecondSectionAddButton.get(i);
	        switch (i) {
	            case 0:
	            	Thread.sleep(1000);
	            	element.click();
					driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
					driver.findElement(By.xpath("//button[text()='Ok']")).click();
					driver.findElement(By.xpath("//div[@id='2033']/preceding::div[1]")).click();
	                break;
	            case 1:
	            	element.click();
	            	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
					driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
					driver.findElement(By.xpath("(//span[text()='+ Add'])[2]/preceding::div[1]")).click();
					break;
	            case 2:
	            	element.click();
	            	driver.findElement(By.xpath("//span[@aria-label='Related CAID']"));
	            	break;
	            case 3:
	            	element.click();
	            	Thread.sleep(1000);
	            	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
	            	driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
	            	driver.findElement(By.xpath("(//span[text()='+ Add'])[4]/preceding::div[1]")).click();
	            	break;
	            case 4:
	            	element.click();
	            	Thread.sleep(1000);
	            	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
	            	driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
	            	driver.findElement(By.xpath("(//span[text()='+ Add'])[5]/preceding::div[1]")).click();
	            	break;
	            default:
	                System.out.println(element.getAttribute("aria-label")+" skiped");
	                break;
	        }
	    }
		SaveButton.click();
		Thread.sleep(1000);
	}
	public void ChargingSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : ThirdSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : ThirdSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
	        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("Is Trai Enable Flag","PDM UoM","Eligible for Multi TV Price Calculation"));
			String elementName = dropdown.getAttribute("aria-label");
			if (elementName != null && unwantedNames.contains(elementName)) {			
				Assert.assertNotEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(2).click();
				}
			else{Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(2).click();
			}
		}
		for (WebElement element : ThirdSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionTexts)
		{
			if(!element.getAttribute("name").equals("2075")){
			Assert.assertEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");}
			else {Assert.assertNotEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");}
		}
		for (WebElement element : ThirdSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionNumber)
		{			
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("2076","2337","2353","2354","2087"));
			String elementName = element.getAttribute("name");
			if (elementName != null && unwantedNames.contains(elementName)) {
			Assert.assertEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" StrValue is not Updating");}
			else {
			Assert.assertNotEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" StrValue is not Updating");}
		}
		
		for (WebElement element : ThirdSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		}
		SaveButton.click();
		Thread.sleep(1000);
		for(WebElement element : ThirdSectionTextarea)
		{
			if(!element.getAttribute("aria-label").equals("Remark-Price Detail (x days)")&&!element.getAttribute("aria-label").equals("GL Code")) {
			Assert.assertEquals(element.getText(),StrValue,element.getAttribute("aria-label")+"Date is not Updating");
				}
			else {Assert.assertNotEquals(element.getText(),StrValue,element.getAttribute("aria-label")+"Date is not Updating");}
		}
	} 
	public void Charging_AddSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : FourthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FourthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : FourthSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FourthSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"Date is not Updating");
		}
		for (WebElement element : FourthSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FourthSectionTexts)
		{
			if(element.getAttribute("name").equals("2119")) {
			Assert.assertNotEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");
			}
			else {Assert.assertEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");}

		}
		for (WebElement element : FourthSectionNumbers)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FourthSectionNumbers)
		{
			Assert.assertNotEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" IntValue is not Updating");
		}
	} 
	public void BingeCCFSectionValidation() throws Exception
	{	 
		for (WebElement element : FifthSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FifthSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement element : FifthSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		for (WebElement element : FifthSectionTextarea)
		{
			if(element.getAttribute("aria-label") != null && element.getAttribute("aria-label").equals("Description of Charge")) {
				Assert.assertNotEquals(element.getText(), "StrValue");
				}
			else{Assert.assertEquals(element.getText(),StrValue,"Date is not Updating");}
		} 
	} 
	public void CARelatedSectionValidation() throws Exception
	{	 
		WebElement dropdown =driver.findElement(By.xpath("//div[@aria-label='Amazon prime video Integration ID (Bundle ID)']"));
		dropdown.click();
        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
        for (WebElement option : options) {
            if ("APV_ADDON_ANN".equals(option.getText())) {
                option.click();
                break;
            }
        }
		SaveButton.click();
		Thread.sleep(1000);
		dropdown.click();
        List<WebElement> options2 = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		Assert.assertEquals(options2.get(2).getText(),"APV_ADDON_ANN","'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
		options2.get(2).click();
		for (WebElement element : SixthSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SixthSectionTexts)
		{
			if(element.getAttribute("name") != null && (element.getAttribute("name").equals("2318")||element.getAttribute("name").equals("2127")))
			{Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");}
			else {Assert.assertNotEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");}
		}
		for (WebElement element : SixthSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SixthSectionTextarea)
		{
			Assert.assertNotEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		} 
	} 
	public void SiebelCompSectonValidation() throws Exception
	{	 
		for (WebElement dropdown : SeventhSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : SeventhSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
	        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("Subscriber Type (New/Existing)","",""));
			String elementName = dropdown.getAttribute("aria-label");
			if (elementName != null && unwantedNames.contains(elementName)) {			
				Assert.assertNotEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(2).click();
				}
			else{Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(2).click();
			}
		}
		for (WebElement element : SeventhSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		for (WebElement element : SeventhSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"StrValue is not Updating");
		} 
		for (WebElement element : SeventhSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SeventhSectionTexts)
		{
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("2141", "00"));
			String elementName = element.getAttribute("name");
			if (elementName != null && unwantedNames.contains(elementName)) {
			Assert.assertNotEquals(element.getAttribute("value"), StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");
			}
			else{Assert.assertEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");}
		}
		for (WebElement element : SeventhSectionNumbers)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SeventhSectionNumbers)
		{
			if(element.getAttribute("name") != null && element.getAttribute("name").equals("2144")) {
				Assert.assertNotEquals(element.getAttribute("value"), IntValue,element.getAttribute("aria-label")+" IntValue is not Updating");
			}
			else{Assert.assertEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" IntValue is not Updating");}
		}
		
	} 
	public void AdditionalBusinessValidation() throws Exception
	{	 
		for (WebElement element : EighthSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : EighthSectionTextarea)
		{
			Assert.assertNotEquals(element.getText(),StrValue,"StrValue is not Updating");
		}
	} 
	public void SelfCareSectionValidation() throws Exception
	{	 
		for (WebElement element : NinethSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : NinethSectionTexts)
		{
			Assert.assertNotEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement dropdown : NinethSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(1).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : NinethSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
	        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("Source for OTT", "Web Enabled Flag with values","Renewal allowed on Selfcare",""));
			String elementName = dropdown.getAttribute("aria-label");
			if (elementName != null && unwantedNames.contains(elementName)) {			
				Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(1).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(1).click();
				}
			else{Assert.assertNotEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(1).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(1).click();
			}
		}

		for (WebElement element : NinethSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : NinethSectionTextarea)
		{
			Assert.assertNotEquals(element.getText(),StrValue,"StrValue is not Updating");
		} 
	} 
	public void SMSConfSectionValidation() throws Exception
	{	 
		WebElement Radio1 = driver.findElement(By.xpath("//input[@type='radio'and @value='Yes']"));
		WebElement Radio2 = driver.findElement(By.xpath("//input[@type='radio'and @value='No']"));
		Radio1.click();
		Assert.assertTrue(Radio1.isSelected());
		Assert.assertFalse(Radio2.isSelected());
		Radio2.click();
		SaveButton.click();
		Thread.sleep(1000);
		Assert.assertTrue(Radio2.isSelected());
		Assert.assertFalse(Radio1.isSelected());

		for (WebElement dropdown : TenthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : TenthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : TenthSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : TenthSectionTexts)
		{
			if(!element.getAttribute("name").equals("2162"))
			{Assert.assertEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");}
			else {Assert.assertNotEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+"StrValue is not Updating");}
		}
	} 
	public void CampaignConfigurations () throws Exception
	{	 
		WebElement dropdown = driver.findElement(By.xpath("//div[@aria-label='CAMPAIGN_TYPE']"));
		dropdown.click();
        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
        for (WebElement option : options) {
            if ("REMOVE_PARTIAL_OVERLAP".equals(option.getText())) {
                option.click();
                break;
            }
        }
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		dropdown.click();
        List<WebElement> options2 = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		Assert.assertEquals(options2.get(2).getText(),"REMOVE_PARTIAL_OVERLAP","'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
		options2.get(2).click();
		for (WebElement element : EleventhSectionCheckBoxes)
		{
		 if (element.getAttribute("checked") != null) 
			{
				element.click();
			}
			element.click();
		}
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : EleventhSectionCheckBoxes)
		{
			Assert.assertTrue(element.isSelected());
		}
		for (WebElement element : EleventhSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		}
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : EleventhSectionTexts)
		{
			Assert.assertNotEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+"StrValue is not Updating");
		}
	}
	public void NuanceConfigSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : TwelthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : TwelthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : TwelthSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
			SaveButton.click();
			Thread.sleep(1000);
			Assert.assertNotEquals(element.getAttribute("value"),"StrValue",element.getAttribute("aria-label")+" StrValue is not Updating");
		}
		for (WebElement element : TwelthSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
			Assert.assertNotEquals(element.getAttribute("value"),"IntValue",element.getAttribute("aria-label")+" StrValue is not Updating");
		}
	} 
	public void PRMSalesSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : ThirtSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : ThirtSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : ThirtSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirtSectionTexts)
		{
			if(element.getAttribute("name") != null && element.getAttribute("name").equals("2173")) {
				Assert.assertEquals(element.getAttribute("value"), StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");
				}
			else{Assert.assertNotEquals(element.getAttribute("value"),StrValue,element.getAttribute("aria-label")+" StrValue is not Updating");}	
		}
	} 
	public void mSalesSectionValidation() throws Exception
	{	 
		for (WebElement element : FourtSectionCheckBoxes)
		{
			if (element.getAttribute("checked") != null) 
			{
				element.click();
			}
			element.click();
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FourtSectionCheckBoxes)
		{
			Assert.assertTrue(element.isSelected());
		}
		for (WebElement dropdown : FourtSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(1).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FourtSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
	        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Set<String> unwantedNames = new HashSet<>(Arrays.asList("Box Validation on mSales","To be made available for dealers in mSales"));
			String elementName = dropdown.getAttribute("aria-label");
			if (elementName != null && unwantedNames.contains(elementName)) {			
				Assert.assertNotEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(1).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(1).click();
				}
			else{Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(1).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(1).click();
			}
		}
		for (WebElement element : FourtSectionTexts) 
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FourtSectionTexts)
		{
			if(element.getAttribute("name") != null && element.getAttribute("name").equals("2178")) {
				Assert.assertNotEquals(element.getAttribute("value"), IntValue,element.getAttribute("aria-label")+" StrValue is not Updating");
				}
			else{Assert.assertEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" StrValue is not Updating");}	
		}
	} 
	public void MissedCallSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : FifthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FifthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertNotEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : FiftSectionCheckBoxes)
		{
			if (element.getAttribute("checked") != null) 
			{
				element.click();
			}
			element.click();
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FiftSectionCheckBoxes)
		{
			Assert.assertTrue(element.isSelected());
		}
		
		for (WebElement element : FiftSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FiftSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement element : FiftSectionDatePicker)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		}
	} 
	public void BIRelatedSectionValidation() throws Exception
	{	
		for (WebElement dropdown : SixtSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : SixtSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            if(dropdown.getAttribute("aria-label").equals("Duration (Variant)")){
			Assert.assertNotEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();}
            else {Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
            options.get(2).click();
            }
		}
		for (WebElement element : SixtSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SixtSectionNumber)
		{
			Assert.assertNotEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement element : SixtSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SixtSectionTextarea)
		{
			Assert.assertNotEquals(element.getText(),StrValue,"StrValue is not Updating");
		}
	}
	public void CompatiblePacksSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : SeventSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : SeventSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : SeventSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SeventSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement element : SeventSectionDatePicker)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		}
		for (WebElement element : SeventSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SeventSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"IntValue is not Updating");
		}
	}
	public void ChargingApplicableNRCValidation() throws Exception
	{	 
		for (WebElement element : EightSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : EightSectionTexts)
		{
			if(element.getAttribute("name") != null && (element.getAttribute("name").equals("2203")||element.getAttribute("name").equals("2206"))) {
			Assert.assertNotEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
			}
			else {Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");}
		}
		for (WebElement element : EightSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : EightSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"IntValue is not Updating");
		}
	}
	public void ChargingApplicableRCValidation() throws Exception
	{	 
		for (WebElement element : NinetSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : NinetSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	}
	public void MissedCallSPMValidation() throws Exception
	{	 
		for (WebElement element : TwentySectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : TwentySectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement dropdown : TwentySectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : TwentySectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void EligibilityTradeValidation() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void EligibilityResidentialValidation() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement dropdown : SecondSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : SecondSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void EligibilityRuleValidation() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : ThirdSectionCheckBoxes)
		{
			if (element.getAttribute("checked") != null) 
			{
				element.click();
			}
			element.click();
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionCheckBoxes)
		{
			Assert.assertTrue(element.isSelected());
		} 
		for (WebElement element : ThirdSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"IntValue is not Updating");
		}
	}
	public void EligibilityCommercialValidation() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement dropdown : FourthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FourthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void EligibilityCorporateValidation() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement dropdown : FifthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FifthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void EligibilitySubCategoryValidation() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : SixthSectionCheckBoxes)
		{
			if (element.getAttribute("checked") != null) 
			{
				element.click();
			}
			element.click();
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SixthSectionCheckBoxes)
		{
			Assert.assertTrue(element.isSelected());
		}
	}
	public void ChargingTradeValidation() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void ChargingResidentialValidation() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement dropdown : SecondSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : SecondSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void ChargingRuleValidation() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : ThirdSectionCheckBoxes)
		{
			if (element.getAttribute("checked") != null) 
			{
				element.click();
			}
			element.click();
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionCheckBoxes)
		{
			Assert.assertTrue(element.isSelected());
		} 
		for (WebElement element : ThirdSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"IntValue is not Updating");
		}
	}
	public void ChargingCommercialValidation() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement dropdown : FourthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FourthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void ChargingCorporateValidation() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement dropdown : FifthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FifthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
	}
	public void ChargingSubCategoryValidation() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : SixthSectionCheckBoxes)
		{
			if (element.getAttribute("checked") != null) 
			{
				element.click();
			}
			element.click();
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionCheckBoxes)
		{
			Assert.assertTrue(element.isSelected());
		} 
	}
	public void B_MailSectionValidation() throws Exception
	{	 
		AlertsBillsTab.click();
		for (WebElement element : FirstSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FirstSectionTexts) {
			Assert.assertNotEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		}
	}
	public void BillDescriptionSectionValidation () throws Exception
	{	 
		AlertsBillsTab.click();
		for (WebElement element : SecondSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SecondSectionTexts) {
			Assert.assertNotEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		}
	}
	public void ReviewDetailsSectionValidation () throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            if(dropdown.getAttribute("aria-label").equals("EPG Review")) {
			Assert.assertNotEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();}
			else{Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
			}
		}
		for (WebElement element : FirstSectionDatePicker)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		}

	}
	public void BusinessReviewTabValidation () throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement element : SecondSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		Refresh.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[text()='"+StrValue+"']"));
		WebElement fileInputButton = driver.findElement(By.xpath("//span[@class='excelImportLink']"));
        fileInputButton.click();

        // Use Robot class to handle the native file dialog
        Robot robot = new Robot();
        robot.setAutoDelay(2000);

        // Prepare the file path
        String filePath = "C:\\Users\\Sopan.Gayake\\Downloads\\FA Report.docx";
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Simulate Ctrl+V to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate Enter key to close the file dialog
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
		 Thread.sleep(2000);
		 WebElement LastAttachment = driver.findElement(By.xpath("//div[@id='0']"));
		 actions.moveToElement(LastAttachment).perform();
		 Thread.sleep(300);
		 WebElement deleteElement = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M12 2C6.47')]"));
		 actions.moveToElement(deleteElement).click().perform();
		 driver.findElement(By.xpath("//button[text()='Ok']")).click();
		 driver.findElement(By.xpath("//div[text()='Attachment removed successfully.']"));
//        Not able to to see the Uploaded document.
//        Not able to find element success message.
	}
	public void ITReviewSectionValidation () throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : FirstSectionLinks)
		{
			element.click();
			System.out.println("Need to Validate User");
			
		}
		for (WebElement element : FirstSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FirstSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement element : FirstSectionDatePicker)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		}
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(PCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : FirstSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FirstSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"StrValue is not Updating");
		}
	}
	public void ITSolutionNoteFiles () throws Exception
	{	
		ITReviewTab.click();
		WebElement fileInputButton = driver.findElement(By.xpath("//span[@class='excelImportLink']"));
        fileInputButton.click();

        // Use Robot class to handle the native file dialog
        Robot robot = new Robot();
        robot.setAutoDelay(2000);

        // Prepare the file path
        String filePath = "C:\\Users\\Sopan.Gayake\\Downloads\\FA Report.docx";
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Simulate Ctrl+V to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate Enter key to close the file dialog
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
		 WebElement LastAttachment = driver.findElement(By.xpath("//div[@id='0']"));
		 actions.moveToElement(LastAttachment).perform();
		 Thread.sleep(300);
		 WebElement deleteElement = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M12 2C6.47')]"));
		 actions.moveToElement(deleteElement).click().perform();
		 driver.findElement(By.xpath("//button[text()='Ok']")).click();
		 driver.findElement(By.xpath("//div[text()='Attachment removed successfully.']"));
	}
	public void EffortEstimationValidation () throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : SecondSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SecondSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	}
	public void DiscussionSectionValidation() throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : ThirdSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(2000);
		for (WebElement element : ThirdSectionTextarea)
		{Assert.assertEquals(element.getText(),StrValue,"Date is not Updating");}
	}
	public void ChangeHistorySectionValidation() throws Exception
	{	 
		ChangeHistoryTab.click();
		driver.findElement(By.xpath("//p[text()='GL Code']"));
		driver.findElement(By.xpath("//p[text()='ABC']"));
		driver.findElement(By.xpath("//span[@style='margin-left: 5px; font-size: 13px; font-weight: 500; color: grey;']"));
		driver.findElement(By.xpath("//span[text()='"+readPropertyFile("user_id")+"']"));
		
	}
}
