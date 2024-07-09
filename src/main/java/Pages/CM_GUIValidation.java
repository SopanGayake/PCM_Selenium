package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.TestBase;

public class CM_GUIValidation extends TestBase {
	@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")private WebElement FormName;
	@FindBy(xpath = "//a[@aria-label='Created By']")private WebElement CreatedBy;
	@FindBy(xpath = "//p[@aria-label='Creation Date']]")private WebElement CreationDate;
	@FindBy(xpath = "//p[@aria-label='Modified Date']]")private WebElement ModifiedDate;
	@FindBy(xpath = "//select[@aria-label='Status']")private WebElement CMStatus;
	@FindBy(xpath = "//div[@aria-label='Name Of Broadcaster']")private WebElement NameOfBroadcaster;
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//p[text()='Logos Platform']") private WebElement logoPlatformTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	@FindBy(xpath="//*[@data-testid='KeyboardBackspaceIcon']") private WebElement BackFromUtility;
	@FindBy(xpath="//input[@name='5013']") private WebElement CheckBox;
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement SearchBox;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[12]//textarea[@type='textarea']")})private List<WebElement> TwelthSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//select[@class='form-control form-control-style']")})private List<WebElement> EleventhSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//textarea[@type='textarea']")})private List<WebElement> EleventhSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//input[@type='number']")})private List<WebElement> EleventhSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[10]//input[@type='number']")})private List<WebElement> ThenthSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[9]//input[@type='number']")})private List<WebElement> NinethSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[8]//input[@type='number']")})private List<WebElement> EighthSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[7]//input[@type='number']")})private List<WebElement> SeventhSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//input[@type='Text']")})private List<WebElement> EleventhSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[10]//input[@type='Text']")})private List<WebElement> ThenthSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[9]//input[@type='Text']")})private List<WebElement> NinethSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[8]//input[@type='Text']")})private List<WebElement> EighthSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[7]//input[@type='Text']")})private List<WebElement> SeventhSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[6]//input[@type='Text'or @type='number']")})private List<WebElement> SixthSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[5]//input[@type='Text'or @type='number']")})private List<WebElement> FifthSectionTexts;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> FourthSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//input[@type='number' or @type='Text']")})private List<WebElement> FourthSectionTexts;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> ThirdSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//a[@aria-label]")})private List<WebElement> ThirdSectionLinks;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@type='Text']")})private List<WebElement> ThirdSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@type='number']")})private List<WebElement> ThirdSectionNumbers;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//span[text()='+ Add']")})private List<WebElement> ThirdSectionAddButton;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> SecondSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//a[@aria-label]")})private List<WebElement> SecondSectionLinks;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//input[@type='number' or @type='Text']")})private List<WebElement> SecondSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//span[text()='+ Add']")})private List<WebElement> SecondSectionAddButton;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//select[@class='form-control form-control-style']")})private List<WebElement> SecondSectionDropdown;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='datetime-local']")})private List<WebElement> FirstSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//a[@aria-label]")})private List<WebElement> FirstSectionLinks;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='checkbox']")})private List<WebElement> FirstSectionCheckBoxes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='Text']")})private List<WebElement> FirstSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='number']")})private List<WebElement> FirstSectionNumbers;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//span[text()='+ Add']")})private List<WebElement> FirstSectionAddButton;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//div[@aria-type='select']")})private List<WebElement> FirstSectionDropdown;
		
	String CMName = "CMGUI";
	String IntValue = "100";
	String StrValue ="ABC";
	String Date = "2024-06-13T12:00";
	String dateValue = "2024-06-13T12:00";
	Select dropdown;
	Random random = new Random();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	public CM_GUIValidation() { 
		PageFactory.initElements(driver, this);
	}
	//Supporting Methods
	public void OpenCMForPage() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'CM') and contains(text(),'Sopan')]"));
		Thread.sleep(1000);
	}
	public void OpenCreatedCM() throws InterruptedException
	{
		SearchBox.sendKeys("CM - "+CMName);
		Thread.sleep(500);
		SearchBox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        // Switch to the new tab
		Thread.sleep(1000);
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String originalWindowHandle = iterator.next();
        String newWindowHandle = iterator.next();
        driver.switchTo().window(newWindowHandle);
	}
	public void CMFormDetails() throws Exception
	{	
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(CMName);
		wait.until(ExpectedConditions.elementToBeClickable(NameOfBroadcaster)).click();
        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
        for (WebElement option : options) {
            if ("Star".equals(option.getText())) {
                option.click();
                break;
            }
        }
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[contains(text(), '2024')])[1]")).click();
		driver.findElement(By.xpath("(//p[contains(text(), '2024')])[2]")).click();
		driver.findElement(By.xpath("//div[@id='mui-component-select-Status' and text()='Draft']"));
		driver.findElement(By.xpath("//a[@aria-label='Created By'and text()='"+readPropertyFile("user_id")+"']"));
	}
   
	public void contentSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
        FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        FormName.sendKeys(CMName);
		SaveButton.click();
		Thread.sleep(2000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			System.out.println(dropdown.getAttribute("aria-label"));
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
        FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        FormName.sendKeys(CMName);
		for (WebElement element : FirstSectionCheckBoxes) {
			if (element.getAttribute("value").toString().equals("true")||element.getAttribute("checked") != null) 
			{
				element.click();
				Thread.sleep(200);
			}
			element.click();
			Thread.sleep(200);
			Assert.assertTrue(element.getAttribute("value").toString().equals("true")||element.getAttribute("checked") != null);
		}
		for (WebElement element : FirstSectionDatePicker)
			{
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
			Assert.assertEquals(element.getAttribute("value"),StrValue,"IntValue is not Updating");
		}
		 for (int i = 0; i < FirstSectionNumbers.size(); i++) {
            WebElement element = FirstSectionNumbers.get(i);
            switch (i) {
                case 0:
                    // Perform action for the first element
                	int randomNumber = random.nextInt(90000) + 1000;
                	element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
					element.sendKeys(String.valueOf(randomNumber));
                    break;
                case 1:
                	element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
                	element.sendKeys(IntValue);
        			Assert.assertTrue(element.getAttribute("value").equals("0"));
					break;
                case 2:
                	element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
                	element.sendKeys(IntValue);
        			Assert.assertTrue(element.getAttribute("value").equals(IntValue));
					break;
                default:
                    System.out.println(element.getAttribute("aria-label")+" skiped");
                    break;
            }
        }
		for (WebElement element : FirstSectionLinks)
		{
			element.click();
			Thread.sleep(2000);
			String Title = driver.findElement(By.xpath("//h4[text()='Broadcaster Pack Details']")).getText();
			Assert.assertEquals("Broadcaster Pack Details",Title,"BR-Utility Title mismatch");
			driver.navigate().back();
		}  

	} 

	public void AttachedFPMandBPM() throws Exception {	 
		driver.findElement(By.xpath("//div[@aria-label='ALC Backend Packs in which Channel available']//div[@class='MuiBox-root css-70qvj9']")).click();
		driver.findElement(By.xpath("//p[text()='Frontend Pack Mapping']"));
		driver.findElement(By.xpath("//input[@id='outlined-basic'and  @value='"+CMName+"']"));
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@aria-label='ALC FPM in which channel available']//div[@class='MuiBox-root css-70qvj9']")).click();
		driver.findElement(By.xpath("//p[text()='Frontend Pack Master']"));
		driver.findElement(By.xpath("//input[@id='outlined-basic'and  @value='"+CMName+"']"));
	
	}
    public void FirstSectionAddButtons() throws Exception {	 
        for (int i = 0; i < FirstSectionAddButton.size(); i++) {
            WebElement element = FirstSectionAddButton.get(i);
            switch (i) {
                case 1:
            		Thread.sleep(1000);
                	element.click();
					driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
					driver.findElement(By.xpath("//button[text()='Ok']")).click();
					driver.findElement(By.xpath("(//span[text()='+ Add'])[2]/preceding::div[1]")).click();
                    break;
                case 2:
                	element.click();
					driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
					driver.findElement(By.xpath("(//span[text()='+ Add'])[3]/preceding::div[1]")).click();
					break;
                case 3:
                	element.click();
					driver.findElement(By.xpath("//div[text()='No data found.']"));
					driver.findElement(By.xpath("(//span[text()='+ Add'])[4]/preceding::div[1]")).click();
					break;
                default:
                    System.out.println(element.getAttribute("aria-label")+" skiped");
                    break;
            }
        }
		SaveButton.click();
		Thread.sleep(1000);
    }
	public void SMSectionValidation() throws Exception
	{	 
		for (WebElement element : SecondSectionDatePicker)
		{
			js.executeScript("arguments[0].value = '"+Date+"';", element);
			Assert.assertEquals(element.getAttribute("value"),Date);
		} 
		for (int i = 0; i < SecondSectionTexts.size(); i++) {
	        WebElement element = SecondSectionTexts.get(i);
	        switch (i) {
	            case 0:
	            	element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
					element.sendKeys(IntValue);
					SaveButton.click();
					Thread.sleep(4000);
	//        		Assert.assertFalse(element.getAttribute("value").equals(IntValue));   *** this should not be change
	                break;
	            default:
	                System.out.println(element.getAttribute("aria-label")+" skiped");
	                break;
	        	}
	        }
		for (WebElement element : SecondSectionLinks)
		{
			element.click();
			Thread.sleep(2000);
			String Title = driver.findElement(By.xpath("//h4[text()=' Tata Play Curated / Impacted Packs']")).getText();
			Assert.assertEquals("Tata Play Curated / Impacted Packs",Title,"BR-Utility Title mismatch");
			driver.navigate().back();
		} 
		for (int i = 0; i < SecondSectionAddButton.size(); i++) {
			WebElement element = SecondSectionAddButton.get(i);
			switch (i) {
			case 0:
				element.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[5]/preceding::div[1]")).click();
				break;
			case 1:
				element.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[6]/preceding::div[1]")).click();
				break;
			case 2:
				element.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[7]/preceding::div[1]")).click();
				break;
			case 3:
				
				element.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[text()='+ Add'])[8]/preceding::div[1]")).click();
				break;
			case 4:
				element.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[9]/preceding::div[1]")).click();
				break;
			case 5:
				element.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[10]/preceding::div[1]")).click();
				break;
			default:
				System.out.println(element.getAttribute("aria-label") + " skiped");
				break;
			}
		}
		for (WebElement dropdown : SecondSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
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
	public void EPGSectionValidation() throws Exception
	{	 
		for (WebElement element : ThirdSectionDatePicker)
		{
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		} 
		for (int i = 0; i < ThirdSectionNumbers.size(); i++) {
			WebElement element = ThirdSectionNumbers.get(i);
			switch (i) {
			case 0:
				element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
				element.sendKeys(IntValue);
//    			Assert.assertTrue(element.getAttribute("value").equals(IntValue));    ****** this should not be editable 
				break;
			case 1:
				element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
				element.sendKeys(IntValue);
    			Assert.assertTrue(element.getAttribute("value").equals(IntValue));
				break;
			default:
				System.out.println(element.getAttribute("aria-label") + " skiped");
				break;
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
			Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		}
		for (WebElement element : ThirdSectionLinks)
		{
			element.click();
			String Title = driver.findElement(By.xpath("(//span[text()='CAID Recommendation'])[2]")).getText();
			Assert.assertEquals("CAID Recommendation",Title,"BR-Utility Title mismatch");
			driver.navigate().back();
		} 
		for (int i = 0; i < ThirdSectionAddButton.size(); i++) {
			WebElement element = ThirdSectionAddButton.get(i);
			switch (i) {
			case 0:
				element.click();
				driver.findElement(By.xpath("//h6[text()='6100-Welcome Bouquet']")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[11]/preceding::div[1]")).click();
				break;
			case 1:
				element.click();
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.navigate().refresh();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[12]/preceding::div[1]")).click();
				break;
			case 2:
				element.click();
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[13]/preceding::div[1]")).click();
				break;
			case 3:
				element.click();
				driver.findElement(By.xpath("//h6[text()='Entertainment - Bengali']")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				driver.findElement(By.xpath("(//span[text()='+ Add'])[14]/preceding::div[1]")).click();
				break;
			default:
				System.out.println(element.getAttribute("aria-label") + " skiped");
				break;
			}
		}
	} 
	public void TechSectionValidation() throws Exception
	{	  
		for (WebElement element : FourthSectionDatePicker)
		{
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		} 
		for (WebElement element : FourthSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FourthSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	} 
	public void VideoSectionValidation() throws Exception
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
	} 
	public void ConTechSectionValidation() throws Exception
	{	 
		
		for (WebElement element : SixthSectionTexts) 
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SixthSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	} 
	public void AudioSectionValidation() throws Exception
	{	 
		for (WebElement element : SeventhSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SeventhSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		}
	for (WebElement element : SeventhSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
	for (WebElement element : SeventhSectionNumber)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	} 
	public void TechConSectionValidation() throws Exception
	{	 
		for (WebElement element : EighthSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : EighthSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		}
		for (WebElement element : EighthSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
	for (WebElement element : EighthSectionNumber)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"x is not Updating");
		}
	} 
	public void DistributionContactDetails () throws Exception
	{	 
		for (WebElement element : NinethSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : NinethSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		}
		for (WebElement element : NinethSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : NinethSectionNumber)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"x is not Updating");
		}
	} 
	public void DestEPGSectionValidation() throws Exception
	{	 
		for (WebElement element : ThenthSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThenthSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		}
		for (WebElement element : ThenthSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThenthSectionNumber)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	} 
	public void SatelliteSectionValidation() throws Exception
	{	 
		for (WebElement element : EleventhSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : EleventhSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating");
		}
		for (WebElement element : EleventhSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : EleventhSectionNumber)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement dropdown : EleventhSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(CMName);
		Thread.sleep(1000);
		for (WebElement dropdown : EleventhSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : EleventhSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		for (WebElement element : EleventhSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"Date is not Updating");
		} 
	} 
	public void CommentsSectionValidation() throws Exception
	{	 
		for (WebElement element : TwelthSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		driver.findElement(By.xpath("//p[text()='ABC']"));
		driver.findElement(By.xpath("//p[@style='padding-left: 1rem; font-weight: bold;']"));
		driver.findElement(By.xpath("//p[@style='padding-left: 2rem; opacity: 0.7; font-size: 13px;']"));

	}
}