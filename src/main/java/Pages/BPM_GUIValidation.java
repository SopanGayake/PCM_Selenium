package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.TestBase;

public class BPM_GUIValidation extends TestBase {
	@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")private WebElement FormName;
	@FindBy(xpath = "//a[@aria-label='Created By']")private WebElement CreatedBy;
	@FindBy(xpath = "//p[@aria-label='Creation Date']]")private WebElement CreationDate;
	@FindBy(xpath = "//p[@aria-label='Modified Date']]")private WebElement ModifiedDate;
	@FindBy(xpath = "//p[@aria-label='Status']]")private WebElement Status;
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//div[@aria-label='Type of Pack']") private WebElement TypeOfPack;
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChannelDetailsTab;
	@FindBy(xpath="//p[text()='Frontend Pack Mapping']") private WebElement FrontendPackMappingTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	@FindBy(xpath="//*[@data-testid='KeyboardBackspaceIcon']") private WebElement BackFromUtility;
	@FindBy(xpath="//input[@name='4019']") private WebElement CheckBox;
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement SearchBox;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1a-content'])[2]//textarea[@type='textarea']")})private List<WebElement> SecondSectionTextarea;
	@FindAll({@FindBy(xpath = "//textarea[@type='textarea']")})private List<WebElement> FirstSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> FirstSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='Text']")})private List<WebElement> FirstSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='number']")})private List<WebElement> FirstSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//div[@aria-type='select']")})private List<WebElement> FirstSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@class='PrivateSwitchBase-input css-1m9pwf3']")})private List<WebElement> FirstSectionRedio;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='checkbox']")})private List<WebElement> FirstSectionCheckBoxes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//span[text()='+ Add']")})private List<WebElement> FirstSectionAddButton;

	String BPMName = "BPMGUI";
	String IntValue = "100";
	String StrValue ="ABC";
	String Date = "2024-05-17T15:25";
	Select dropdown;
	Random random = new Random();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

	public BPM_GUIValidation() { 
		PageFactory.initElements(driver, this);
	}
	//Supporting Methods
	public void OpenCreatedBPM() throws Exception
	{		
		SearchBox.sendKeys(BPMName);
		Thread.sleep(500);
		SearchBox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        // Switch to the new tab
		Thread.sleep(1000);
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String originalWindowHandle = iterator.next();
        String newWindowHandle = iterator.next();
        driver.switchTo().window(newWindowHandle);
        //go back to the Original window
//        driver.switchTo().window(originalWindowHandle);
	}
	public void BPMFormDetails() throws Exception
	{	
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(BPMName);
		TypeOfPack.click();
        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
        for (WebElement option : options) {
            if ("Multiroom".equals(option.getText())) {
                option.click();
                break;
            }
        }
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@aria-label='Modified Date' and contains(text(),'2024')]"));
		driver.findElement(By.xpath("//p[@aria-label='Creation Date' and contains(text(),'2024')]"));
		driver.findElement(By.xpath("//a[@aria-label='Created By' and text()='"+readPropertyFile("user_id")+"']"));
		driver.findElement(By.xpath("//div[@aria-haspopup='listbox' and text()='Draft']"));
	}
	public void BackendPackMasterValidation() throws Exception
	{	 
		int randomNumber = random.nextInt(90000) + 1000;
		for (WebElement element : FirstSectionTexts)
		{
			if(element.getAttribute("name").equals("4010")||element.getAttribute("name").equals("4011"))
			{
				element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
				element.sendKeys(String.valueOf(randomNumber));
			}
			else {
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
			}
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FirstSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),String.valueOf(randomNumber),"randomNumber is not Updating");
		}
		for (WebElement element : FirstSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FirstSectionNumber)
		{
			if(element.getAttribute("name") != null && (element.getAttribute("name").equals("4020")||element.getAttribute("name").equals("4021"))) {
				Assert.assertEquals(element.getAttribute("value"),"100",element.getAttribute("aria-label"));
			}
			else {Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");}
		}
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		CheckBox.click();
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : FirstSectionCheckBoxes)
		{
			if (element.getAttribute("checked") != null) 
			{
				element.click();
				Thread.sleep(500); 
			}
			element.click();
			Thread.sleep(500); 
			SaveButton.click();
			Thread.sleep(1000);
		}  
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@value='Ala carte' and @checked]"));
		driver.findElement(By.xpath("//input[@value='TraiPack' and @checked]"));
		
		for (WebElement element : FirstSectionRedio)
		{
			element.click();
			if (element.isSelected()) {
	            System.out.println("Radio button is selected.");
	        } else {
	            System.out.println("Radio button is NOT selected.");
	        }

		} 	
		for (WebElement element : FirstSectionDatePicker)
		{
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		}
		for (WebElement element : FirstSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		for (WebElement element : FirstSectionTextarea)
		{
			if(element.getAttribute("aria-label") != null && (element.getAttribute("aria-label").equals("Channel Name List"))) {
				Assert.assertEquals(element.getText(), StrValue ,"should not equal");
				}
			else {
			driver.findElement(By.xpath("//p[text()='"+StrValue+"']"));}
		}
	} 
	public void ChannelsAddDropValidation() throws Exception
	{	 			
		ChannelDetailsTab.click();
		driver.findElement(By.xpath("//span[@aria-label='Add New Channels']")).click();
		driver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]")).sendKeys("49565");
		driver.findElement(By.xpath("//h6[text()='CM - Star Jalsha']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'49565')]"));
		driver.findElement(By.xpath("//span[@aria-label='Drop Existing Channel ']")).click();
		driver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]")).sendKeys("49565");
		driver.findElement(By.xpath("//h6[text()='CM - Star Jalsha']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
		Thread.sleep(1000);
		 try {driver.findElement(By.xpath("//a[text()='49565:CM - Star Jalsha']"));
	            Assert.fail("Element is present on the page.");
	        } catch (Exception e) {System.out.println("Element is not present on the page."); }
	} 
	public void FrontendPackValidation() throws Exception
	{	 
		FrontendPackMappingTab.click();
		for (WebElement element : FirstSectionAddButton)
		{
			element.click();
			if (driver.findElement(By.xpath("//h2[@id='alert-dialog-title']")).isDisplayed()){
				driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				SaveButton.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='MuiBox-root css-z246w2']")).isDisplayed();
				driver.findElement(By.xpath("//span[text()='x']")).click();
				SaveButton.click();
				Thread.sleep(1000);
			}
			else if (driver.findElement(By.xpath("//div[@class='MuiAlert-message css-1pxa9xg-MuiAlert-message'and text()='No data found.']")).isDisplayed()) {
				System.out.println("No data found");
			}
			else {Assert.fail("Unable to click");}
		}
	} 
	public void ChangeHistorySectionValidation() throws Exception
	{	 
		ChangeHistoryTab.click();
		driver.findElement(By.xpath("//p[text()='Comments']"));
		driver.findElement(By.xpath("//p[text()='"+StrValue+"']"));
		driver.findElement(By.xpath("//span[@style='margin-left: 5px; font-size: 13px; font-weight: 500; color: grey;']"));
		driver.findElement(By.xpath("//span[text()='"+readPropertyFile("user_id")+"']"));
		
	}
	
}