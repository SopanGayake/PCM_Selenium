package Pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
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

public class CCF_GUIValidation extends TestBase {
	@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")private WebElement FormName;
	@FindBy(xpath = "//a[@aria-label='Created By']")private WebElement CreatedBy;
	@FindBy(xpath = "//p[@aria-label='Creation Date']]")private WebElement CreationDate;
	@FindBy(xpath = "//p[@aria-label='Modified Date']]")private WebElement ModifiedDate;
	@FindBy(xpath = "//p[@aria-label='Status']]")private WebElement Status;
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//p[text()='Additional Business Rules']") private WebElement AdditionalBusinessTab;
	@FindBy(xpath="//p[text()='Work Order Consumption Application']") private WebElement WorkOrderTab;
	@FindBy(xpath="//p[text()='IT Review']") private WebElement ITReviewTab;
	@FindBy(xpath="//p[text()='UAT']") private WebElement UATTab;
	@FindBy(xpath="//p[text()='Links']") private WebElement LinksTab;
	@FindBy(xpath="//p[text()='Approvals']") private WebElement ApprovalTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	@FindBy(xpath="//p[text()='Business Review']") private WebElement BusinessReviewTab;
	@FindBy(xpath="(//select[@aria-label='Status']//option)[1]") private WebElement SelectedOption ;
	@FindBy(xpath="//*[@data-testid='KeyboardBackspaceIcon']") private WebElement BackFromUtility;
	@FindBy(xpath="//*[@aria-label='Refresh']") private WebElement Refresh;
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement SearchBox;
	
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//div[@aria-type='select']")})private List<WebElement> FourthSectionDropdown;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> ThirdSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//input[@type='number' or @type='Text']")})private List<WebElement> ThirdSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//input[@type='number' or @type='Text']")})private List<WebElement> SecondSectionTexts;
	@FindAll({@FindBy(xpath = "//span[@class='excelImportLink']")})private List<WebElement> SecondSectionLinks;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//textarea[@type='textarea']")})private List<WebElement> LinksTabExcelImport;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//textarea[@type='textarea']")})private List<WebElement> FirstSectionTextarea;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@class='tpDatePicker form-control form-control-style']")})private List<WebElement> FirstSectionDatePicker;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//a")})private List<WebElement> FirstSectionLinks;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//input[@type='number' or @type='Text']")})private List<WebElement> FirstSectionTexts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//div[@aria-type='select']")})private List<WebElement> FirstSectionDropdown;
	
	String CCFName = "CCFGUI";
	String IntValue = "100";
	String StrValue ="ABC";
	String Date = "2024-06-13T18:12";
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

	Select dropdown;
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public CCF_GUIValidation() { 
		PageFactory.initElements(driver, this);
	}
	//Supporting Methods
	public void OpenCreatedCCF() throws Exception
	{
		SearchBox.sendKeys(CCFName);
		WebElement FirstResult = driver.findElement(By.xpath("//li[@id='selected-option-0']"));
		wait.until(ExpectedConditions.elementToBeClickable(FirstResult)).click(); 
		
        // Switch to the new tab
		Thread.sleep(1000);
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String originalWindowHandle = iterator.next();
        String newWindowHandle = iterator.next();
        driver.switchTo().window(newWindowHandle);
	}
	public void CCFFormDetails() throws Exception
	{	
		Thread.sleep(2000);
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(CCFName);
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-haspopup='listbox' and text()='Draft']"));
	}
	
	public void ChargeSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(CCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(2).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(2).click();
		}
		for (WebElement element : FirstSectionLinks)
		{
			element.click();
			System.out.println("Need to Validate User");
		} 
		for (WebElement element : FirstSectionDatePicker)
		{
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
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
			element.getText();
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
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
			Assert.assertEquals(element.getText(),StrValue,"Date is not Updating");
		} 
		
	} 
	public void AlertsSectionValidation() throws Exception
	{	 
		for (WebElement element : SecondSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SecondSectionTexts)
		{
			element.getText();
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	} 
	public void PriceListSectionValidation() throws Exception
	{	 
		for (WebElement element : ThirdSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : ThirdSectionTexts)
		{
			element.getText();
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	} 
	public void PRMSectionValidation() throws Exception
	{	 
		for (WebElement dropdown : FourthSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(CCFName);
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
	public void AdditionalBusinessSectionValidation() throws Exception
	{	 
		AdditionalBusinessTab.click();
		for (WebElement element : FirstSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		for (WebElement element : FirstSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"Date is not Updating");
		} 
	} 
	public void WorkOrderSectionValidation() throws Exception
	{	 
		WorkOrderTab.click();
		for (WebElement element : FirstSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		SaveButton.click();
		for (WebElement element : FirstSectionTextarea)
		{
			Assert.assertEquals(element.getText(),StrValue,"Date is not Updating");
		} 
	} 
	public void ITReviewSectionValidation() throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(0).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(CCFName);
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
			Assert.assertEquals(dropdown.findElement(By.tagName("input")).getAttribute("value"),options.get(0).getText(),"'"+dropdown.getAttribute("aria-label")+"'Dropdown is not Updating");
			options.get(0).click();
		}
		for (WebElement element : FirstSectionLinks)
		{
			element.getAttribute("aria-label");
			System.out.println("Need to Validate User");
		} 
		for (WebElement element : FirstSectionDatePicker)
		{
			Thread.sleep(100);
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
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
			element.getText();
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
		
		for (WebElement element : FirstSectionTextarea)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(StrValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : FirstSectionTextarea)
		{
			element.getText();
			Assert.assertEquals(element.getText(),StrValue,"IntValue is not Updating");
		}
	} 
	public void EffortEstimationSectionValidation() throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : SecondSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		Thread.sleep(1000);
		SaveButton.click();
		for (WebElement element : SecondSectionTexts)
		{
			element.getText();
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	} 
	public void UATSectionValidation() throws Exception
	{	 
		UATTab.click();
		 WebElement fileInputButton = driver.findElement(By.xpath("//span[@class='excelImportLink']"));
		 Thread.sleep(1000);
		 fileInputButton.click();
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
		 
		 // Need to Integrate Defect filed here

         
	} 
	public void LinksectionValidation() throws Exception
	{	 
		LinksTab.click();
		 WebElement fileInputButton = driver.findElement(By.xpath("//span[@class='excelImportLink']"));
		 Thread.sleep(1000);
		 fileInputButton.click();
         Robot robot = new Robot();
         robot.setAutoDelay(2000);
         
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
	public void ApprovalSectionValidation() throws Exception
	{	 
		ApprovalTab.click();
		for (WebElement element : FirstSectionLinks) 
		{
			element.click();
			System.out.println("Need to Validate User");
		} 
	} 
	public void ChangeHistorySectionValidation() throws Exception
	{	 
		ChangeHistoryTab.click();
		driver.findElement(By.xpath("(//p[text()='Additional Business Rules'])[2]"));
		driver.findElement(By.xpath("//p[text()='ABC']"));
		driver.findElement(By.xpath("//span[@style='margin-left: 5px; font-size: 13px; font-weight: 500; color: grey;']"));
		driver.findElement(By.xpath("//span[text()='"+readPropertyFile("user_id")+"']"));
	} 
	public void ReviewDetailsSectionValidation() throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement dropdown : FirstSectionDropdown)
		{
			wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
            List<WebElement> options = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
            options.get(2).click();
		} 
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		FormName.sendKeys(CCFName);
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
	public void ReviewerNamesSectionValidation() throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement element : SecondSectionTexts)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(IntValue);
		} 
		SaveButton.click();
		Thread.sleep(1000);
		for (WebElement element : SecondSectionTexts)
		{
			element.getText();
			Assert.assertEquals(element.getAttribute("value"),IntValue,"IntValue is not Updating");
		}
	} 
	public void ReviewedSignoffValidation() throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement element : ThirdSectionDatePicker)
		{
			js.executeScript("arguments[0].value = '"+Date+"';", element);
		    Assert.assertEquals(element.getAttribute("value"),Date);
		}
	} 
	
}