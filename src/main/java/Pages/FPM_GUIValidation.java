package Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.TestBase;

public class FPM_GUIValidation extends TestBase {
	@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")private WebElement FormName;
	@FindBy(xpath = "//a[@aria-label='Created By']")private WebElement CreatedBy;
	@FindBy(xpath = "//p[@aria-label='Creation Date']]")private WebElement CreationDate;
	@FindBy(xpath = "//p[@aria-label='Modified Date']]")private WebElement ModifiedDate;
	@FindBy(xpath = "//p[@aria-label='Status']")private WebElement Status;
	@FindBy(xpath = "//div[@aria-label='Type of Pack']")private WebElement TypeOfPack;
	@FindBy(xpath = "//div[@aria-label='Unit of Measure (UoM)']")private WebElement UOM;
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChannelDetailsTab;
	@FindBy(xpath="//p[text()='Backend Pack Mapping']") private WebElement BackendPackMappingTab;
	@FindBy(xpath="//p[text()='Links']") private WebElement LinksTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	@FindBy(xpath="//div[@aria-label='Name of Broadcaster']") private WebElement NameOfBroadcaster;
	@FindBy(xpath="//*[@aria-label='Refresh']") private WebElement Refresh;
	@FindBy(xpath="//input[@name='3018']") private WebElement CheckBox;
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement SearchBox;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[5]//textarea[@type='textarea']")})private List<WebElement> FifthSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//span[text()='+ Add']")})private List<WebElement> FourthSectionAddButton;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@type='number' or @type='Text']")})private List<WebElement> ThirdSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//textarea[@type='textarea']")})private List<WebElement> ThirdSectionTextarea;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//div[@class='link-wrapper MuiBox-root css-bivkl']")})private List<WebElement> ThirdSectionChannels;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//input[@type='number']")})private List<WebElement> SecondSectionNumbers;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//textarea[@type='textarea']")})private List<WebElement> FirstSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> FirstSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='Text']")})private List<WebElement> FirstSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='number']")})private List<WebElement> FirstSectionNumber;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//div[@aria-type='select']")})private List<WebElement> FirstSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='checkbox']")})private List<WebElement> FirstSectionCheckBoxes;
	@FindAll({@FindBy(xpath = "//span[text()='+ Add']")})private List<WebElement> FirstSectionAddButton;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//a[@style='cursor: pointer;']")})private List<WebElement> FirstSectionLinks;
	@FindAll({@FindBy(xpath = "//input[@type='number' and @maxlength='10']")})private List<WebElement> AllPrices;


	public static String FPMName = "FPMGUI2";
	
	String IntValue = "100";
	String StrValue ="ABC";
	String Date = "2024-06-13T18:12";
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

	
	public FPM_GUIValidation() { 
		PageFactory.initElements(driver, this);
	}
	//Supporting Methods
	public void OpenCreatedFPM() throws Exception
	{
		SearchBox.sendKeys(FPMName);
		SearchBox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        // Switch to the new tab
		Thread.sleep(1000);
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String originalWindowHandle = iterator.next();
        String newWindowHandle = iterator.next();
        driver.switchTo().window(newWindowHandle);
	}
	public void FPMFormDetails() throws Exception
	{	
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
//		FPMName += System.currentTimeMillis();
		FormName.sendKeys(FPMName);
		TypeOfPack.click();
        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
        for (WebElement option : options) {
            if ("Broadcaster Bouquet".equals(option.getText())) {
                option.click();
                break;
            }
        }
        UOM.click();
        List<WebElement> options2 = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
        for (WebElement option : options2) {
        	if ("1 week".equals(option.getText())) {
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
	public void FPMPriceValues() throws Exception
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
	public void FrontendMasterCheckBOXes() throws Exception
	{	 
		for (WebElement element : FirstSectionCheckBoxes)
		{
		  if (element.getAttribute("checked") != null) 
			{

			if(!element.getAttribute("value").equals("Andaman Nicobar"))
				{element.click();}
			else {SaveButton.click();Thread.sleep(1000);break;}
			}
		if(!element.getAttribute("value").equals("Andaman Nicobar"))
		{element.click();}
		else {SaveButton.click();Thread.sleep(1000);break;}
		}  
	}
	public void FrontendMasterCheckBOXes2() throws Exception
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
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='All India' and not(@checked)]"));
		for (WebElement element : FirstSectionCheckBoxes)
		{
			if(!element.getAttribute("value").equals("All India")&&(!element.getAttribute("name").equals("3043"))) {
			Assert.assertTrue(element.getAttribute("checked") != null);
			}
		}
		 try {driver.findElement(By.xpath("//input[@name='3043'and @checked]"));
         Assert.fail("Element is present on the page.");
		 } catch (Exception e) {System.out.println("Element is not present on the page."); }
	}  
	public void FrontendMasterInputs() throws Exception
	{	 
		driver.findElement(By.xpath("//a[@aria-label='ALC/Broadcaster Approval']")).click();
		driver.findElement(By.xpath("//h4[text()='Broadcaster Pack Details']"));
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@aria-label='TP Curated Approval']")).click();
		driver.findElement(By.xpath("//h4[text()='Tata Play Curated / Impacted Packs']"));
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@aria-label='TP Pack Launch Approval']")).click();
		driver.findElement(By.xpath("//h4[contains(text(),'Tata Play Pack Launch Details')]"));
		driver.navigate().back();
		
		for (WebElement element : FirstSectionNumber)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FirstSectionNumber)
		{
			String elementID = element.getAttribute("name");
			if (elementID != null && (elementID.equals("3040") || elementID.equals("3063")|| elementID.equals("3036")|| elementID.equals("3037")|| elementID.equals("3038")|| elementID.equals("3084"))) {
				Assert.assertNotEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" IntValue is not Updating");
			}
			else {Assert.assertEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" IntValue is not Updating");}
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
			String elementID = element.getAttribute("name");
			if (elementID != null && (elementID.equals("3081"))) {
			    System.out.println(element.getAttribute("aria-label")+" Unchecnged");
			}
			else {Assert.assertEquals(element.getAttribute("value"),StrValue,"StrValue is not Updating "+element.getAttribute("aria-label"));}
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
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		for (WebElement element : FirstSectionTextarea)
		{
			if(element.getAttribute("aria-label") != null && (element.getAttribute("aria-label").equals("Channel Name List") || element.getAttribute("aria-label").equals("FTA Packs"))) {
				System.out.println(element.getAttribute("aria-label"));
				}
				else {Assert.assertEquals(element.getText(),StrValue,"StrValue is not Updating");}
		}
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(FPMName);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            if(dropdown.getAttribute("aria-label").equals("Type of Pack")) {
            	options.get(7).click();			
            }else {options.get(2).click();}
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(FPMName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			if(dropdown.getAttribute("aria-label").equals("Type of Pack")) {
				Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(7).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
				options.get(7).click();
				}
			else{Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
			}	
		}
	}
	public void FrontendMasterAddLinkbox() throws Exception{
		 for (int i = 0; i < FirstSectionAddButton.size(); i++) {
	            WebElement element = FirstSectionAddButton.get(i);
	            switch (i) {
	                case 0:
	            		Thread.sleep(1000);
	                	element.click();
						driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
						driver.findElement(By.xpath("//button[text()='Ok']")).click();
						driver.findElement(By.xpath("(//span[text()='+ Add'])[1]/preceding::div[1]")).click();
	                    break;
	                case 1:
	                	element.click();
	                	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
						driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
						driver.findElement(By.xpath("(//span[text()='+ Add'])[2]/preceding::div[1]")).click();
						break;
	                case 2:
	                	element.click();
	                	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
	                	driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
						driver.findElement(By.xpath("(//span[text()='+ Add'])[3]/preceding::div[1]")).click();
						break;
	                case 3:
	                	element.click();
	                	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
	                	driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
	                	driver.findElement(By.xpath("(//span[text()='+ Add'])[4]/preceding::div[1]")).click();
	                	break;
	                case 4:
	                	element.click();
	                	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
	                	driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
	                	driver.findElement(By.xpath("(//span[text()='+ Add'])[5]/preceding::div[1]")).click();
	                	break;
	                case 5:
	                	element.click();
	                	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
	                	driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
	                	driver.findElement(By.xpath("(//span[text()='+ Add'])[6]/preceding::div[1]")).click();
	                	break;
	                case 6:
	                	element.click();
	                	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
	                	driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
	                	driver.findElement(By.xpath("(//span[text()='+ Add'])[7]/preceding::div[1]")).click();
	                	break;
	                case 7:
	                	element.click();
	                	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
	                	driver.findElement(By.xpath("//button[text()='Ok']")).click(); 
	                	driver.findElement(By.xpath("(//span[text()='+ Add'])[8]/preceding::div[1]")).click();
	                	break;
	                default:
	                    System.out.println(element.getAttribute("aria-label")+" skiped");
	                    break;
	            }
	        }
			SaveButton.click();
			Thread.sleep(1000);
	}
	public void PackAvailableSectionValidation() throws Exception
	{
		for (WebElement element : SecondSectionNumbers)
		{
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SecondSectionNumbers)
		{
			if(element.getAttribute("name") != null && (element.getAttribute("name").equals("3193"))) {
				Assert.assertNotEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" IntValue is not Updating");
			}
			else {Assert.assertEquals(element.getAttribute("value"),IntValue,element.getAttribute("aria-label")+" IntValue is not Updating");}
			
		}
	} 
	public void CAIDDetailsSectionValidation() throws Exception
	{	 
		WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Existing FPM']"));
		WebElement Radio2 = driver.findElement(By.xpath("//input[@value='New FPM']"));
		Radio1.click();
		Assert.assertTrue(Radio1.isSelected());
		Assert.assertFalse(Radio2.isSelected());
		Radio2.click();
		Assert.assertTrue(Radio2.isSelected());
		Assert.assertFalse(Radio1.isSelected());
		SaveButton.click();
		Thread.sleep(1000);
		
		for (WebElement element : ThirdSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionTexts)
		{
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		for (WebElement element : ThirdSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"StrValue is not Updating");
		}
		
	}
	public void CompatiblePacksValidation() throws Exception
	{	 
		driver.findElement(By.xpath("//span[@aria-label='Compatible Packs to be Expired with the Launch of New Pack']")).click();
		driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@aria-label='Compatible Packs to be Expired with the Launch of New Pack']/preceding::div[1]")).click();
		SaveButton.click();
	}

	public void AdditionalBusinessValidation() throws Exception
	{	 
		for (WebElement element : FifthSectionTextarea)
		{
			{
				element.sendKeys(Keys.CONTROL+"a");
				element.sendKeys(Keys.BACK_SPACE);
				element.sendKeys(StrValue);
			} 
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
			SaveButton.click();
			Thread.sleep(1000);
		}
		for (WebElement element : FifthSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"StrValue is not Updating");
		}
	}
	public void CommentsValidation() throws Exception
	{	 
		driver.findElement(By.xpath("//textarea[@aria-label='Comments']")).sendKeys(StrValue);
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='"+StrValue+"']"));
	}
	public void AddChannelValidation() throws Exception
	{	 
//		TypeOfPack.click();
//        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
//        for (WebElement option : options) {
//            if ("Zee".equals(option.getText())) {
//                option.click();
//                break;
//            }
//        }
		ChannelDetailsTab.click();
        WebElement AddNewChannel = driver.findElement(By.xpath("//span[@aria-label='Add New Channel']")); 
        AddNewChannel.click();
    	WebElement SerchBox = driver.findElement(By.xpath("(//input[@id='outlined-basic'])[3]"));
    	SerchBox.sendKeys("STAR BHARAT");
    	Thread.sleep(500);
    	driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@id,'STAR BHARAT')])[1]"));
		driver.findElement(By.xpath("(//div[contains(@id,'STAR BHARAT')])[2]"));
		
	} 
	public void DropChannelValidation() throws Exception
	{	 
		ChannelDetailsTab.click();
		WebElement DropExistingChannel = driver.findElement(By.xpath("//span[@aria-label='Drop Existing Channel']")); 
		DropExistingChannel.click();
		WebElement SerchBox = driver.findElement(By.xpath("(//input[@id='outlined-basic'])[3]"));
		SerchBox.sendKeys("STAR BHARAT");
		Thread.sleep(500);
		driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
		Thread.sleep(1000);
        WebElement DropChannels = driver.findElement(By.xpath("//div[@aria-label='Drop Channels']"));
        List<WebElement> DropingChannels = DropChannels.findElements(By.xpath("./*"));
		Assert.assertEquals(DropingChannels.size(),1,"StrValue is not Updating");
		 
	}
	public void backendPackMappingTab() throws Exception
	{	 
		BackendPackMappingTab.click();
		WebElement DDElement = driver.findElement(By.xpath("//div[@aria-label='Single Pack/Combo Pack']"));
		DDElement.click();
        List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
        String SecondOption = options.get(2).getText();
		options.get(2).click();
		Assert.assertEquals(DDElement.findElement(By.tagName("input")).getAttribute("value"),SecondOption,"'"+DDElement.getAttribute("aria-label")+"'Dropdown is not Updating");
//		options.get(2).click();
//        for (WebElement option : options) {
//            if ("Combo Pack".equals(option.getText())) {
//                option.click();
//                DDElement.click();
//                break;
//            }
//        }
		WebElement Element2 = driver.findElement(By.xpath("//textarea[@aria-label='CA ID']"));
		Element2.clear();
		Element2.sendKeys(IntValue);
		Assert.assertTrue(Element2.getAttribute("value").equals(IntValue));
	}
}
