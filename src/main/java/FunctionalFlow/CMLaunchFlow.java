package FunctionalFlow;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import BasePackage.TestBase;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CMLaunchFlow extends TestBase{
//	String CMname = "SopanATM6";
//	public static String  CM_WIID = "58928";
//	int DHTPrice = 10;
//	String type = "HD";
//	String genre = "Marathi Regional";
//	String RentalFlag = "Yes";
//	String NameOfBroadcaster = "TV18";
//	String NewBrdPrice = "74";
//	String CAID = "58928";
//	String Irdetto_ID = "58928";
//	int FPM1 = 51334;
//	int FPM2 = 51335;
//	int FPM3 = 51336;
//	public static int broadcasterCount = 3;
	
    private String CMname;
    private String CM_WIID;
    private int DHTPrice;
    private String type;
    private String genre;
    private String RentalFlag;
    private String NameOfBroadcaster;
    private String NewBrdPrice;
    private String CAID;
    private String Irdetto_ID;
    private int broadcasterCount;
    private String FPM1;
    private String FPM2;
    private String FPM3;
	
	public static int TPPackCount;
//	public static String Combination;
	String Combination = "1523-1526-2452-3262-58931-58932(1)";
	public static int ChannelCount;
	String WI_ID;
	
	private WebDriverWait wait;
	
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement UniversalSearchBox;
	@FindBy(xpath="//div[@aria-label='Channel Name']//input") private WebElement ChannelName;
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//*[@aria-label='Refresh']") private WebElement RefreshButton ;
	@FindBy(xpath="//button[text()='Cancel']") private WebElement CancelButton;
	@FindBy(xpath="(//button[text()='Save'])[2]") private WebElement SaveModulButton;
	@FindBy(xpath="//a[@aria-label='Broadcaster Approval']") private WebElement BroadcasterUtility;
	@FindBy(xpath="//a[@aria-label='TP Curated Approval']") private WebElement TPPackUtility;
	@FindBy(xpath="//a[@aria-label='EPG Approval']") private WebElement EPGUtility;
	@FindBy(xpath="//*[@data-testid='KeyboardBackspaceIcon']") private WebElement BackFromUtility;
	@FindBy(xpath="//*[@data-testid='CloseIcon']") private WebElement CloseModule;
	@FindBy(xpath="//a[@aria-label='EPG Approval']") private WebElement CAIDUtiliti;
	@FindBy(xpath="//textarea[@aria-label='Comments']") private WebElement CMComment;
	@FindBy(xpath="(//textarea[@aria-label='Comments'])[2]") private WebElement BPMComment;
	@FindBy(xpath="//*[@aria-label='Scroll To Top']") private WebElement GotoTop;
	@FindBy(xpath="(//input[@id='outlined-basic'])[3]") private WebElement OldReference ;
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChanneldetailsTab ;
	@FindBy(xpath="//p[text()='Frontend Pack Master']") private WebElement FrontendPackTab ;
	@FindBy(xpath="//select[@aria-label='Status']") private WebElement CMstatus ;
	@FindBy(xpath="//div[@aria-label='ALC FPM in which channel available']/child::div") private WebElement ALCFPM ;
	@FindBy(xpath="//div[@aria-label='ALC Backend Packs in which Channel available']/child::div") private WebElement ALCBPM ;
	@FindBy(xpath="//textarea[@aria-label='Channel Name List']") private WebElement ChannelNameList ;

	// Constructor
	
	
	public CMLaunchFlow()
	{ 
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(4));	
	} 
	
	//Supporting methods 
	public void readExcelAndAssignValues() {
	    // Set the path to your Excel file
	    String excelFilePath = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\InputExcel.xlsx";

	    try (Workbook workbook = new XSSFWorkbook(excelFilePath)) {
	        // Assuming data is present in the first sheet (index 0)
	        Sheet sheet = workbook.getSheetAt(0);

	        // Assuming values are in the fourth column (index 3) and there are 15 rows
	        for (int i = 1; i < 15; i++) {
	            Row row = sheet.getRow(i);
	            Cell cell = row.getCell(1); // Assuming the values are in the fourth column (index 3)

	            // Assuming the values are strings. Adjust as per your data type.
	            String cellValue = cell.getStringCellValue();

	            // Assign values to instance variables based on the iteration
	            switch (i) {
	                case 1:
	                    CMname = cellValue;
	                    break;
	                case 2:
	                    CM_WIID = cellValue;
	                    break;
	                case 3:
	                    String strDTH = cellValue;
	                    DHTPrice = Integer.parseInt(strDTH);
	                    break;
	                case 4:
	                    type = cellValue;
	                    break;
	                case 5:
	                    genre = cellValue;
	                    break;
	                case 6:
	                    RentalFlag = cellValue;
	                    break;
	                case 7:
	                    NameOfBroadcaster = cellValue;
	                    break;
	                case 8:
	                    NewBrdPrice = cellValue;
	                    break;
	                case 9:
	                    CAID = cellValue;
	                    break;
	                case 10:
	                    Irdetto_ID = cellValue;
	                    break;
	                case 11:
	                    String brdCount = cellValue;
	                    broadcasterCount = Integer.parseInt(brdCount);
	                    break;
	                case 12:
	                    FPM1 = cellValue;
	                    break;
	                case 13:
	                    FPM2 = cellValue;
	                    break;
	                case 14:
	                    FPM3 = cellValue;
	                    break;
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		}
	 public void printAssignedValues() {
        System.out.println("CMname: " + CMname);
        System.out.println("CM_WIID: " + CM_WIID);
        System.out.println("DHTPrice: " + DHTPrice);
        System.out.println("type: " + type);
        System.out.println("genre: " + genre);
        System.out.println("RentalFlag: " + RentalFlag);
        System.out.println("NameOfBroadcaster: " + NameOfBroadcaster);
        System.out.println("NewBrdPrice: " + NewBrdPrice);
        System.out.println("CAID: " + CAID);
        System.out.println("Irdetto_ID: " + Irdetto_ID);
        System.out.println("broadcasterCount: " + broadcasterCount);
        System.out.println("FPM1: " + FPM1);
        System.out.println("FPM2: " + FPM2);
        System.out.println("FPM3: " + FPM3);
	 }
	 
	public void OpenCreatedCM() throws Exception
	{
		Thread.sleep(3000); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
//		driver.findElement(By.xpath("//h6[contains(text(),'6')]"));
		Select Options = new Select(CMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Draft",status,"Draft- Unexpected Status");
	}
	public void OpenCreatedCMForSM() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Pending with Subscriber Marketing(Linear)']")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
//		driver.findElement(By.xpath("//h6[contains(text(),'6')]")); 
		Select Options = new Select(CMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Pending with Subscriber Marketing(Linear)",status,"Pending with Subscriber Marketing(Linear)- Unexpected Status");
	}
	public void OpenCreatedCMForEPG() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Pending with EPG (Linear)']")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
//		driver.findElement(By.xpath("//h6[contains(text(),'5')]"));
		driver.findElement(By.xpath("//option[@value='Pending with EPG (Linear)']"));
		Select Options = new Select(CMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Pending with EPG (Linear)",status,"Pending with EPG (Linear)- Unexpected Status");

	}
	public void OpenCreatedCMForTechnology() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Pending with Technology (Linear)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[contains(text(),'"+CMname+"')]")).click();

//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
//		driver.findElement(By.xpath("//h6[contains(text(),'5')]"));
		driver.findElement(By.xpath("//option[@value='Pending with Technology (Linear)']"));
		Select Options = new Select(CMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Pending with Technology (Linear)",status,"Pending with Technology (Linear)- Unexpected Status");
		
	}
	public void OpenCompletedCM() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Completed']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
//		driver.findElement(By.xpath("//h6[contains(text(),'5')]"));
		Select Options = new Select(CMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Completed",status,"Completed- Unexpected Status");
		driver.findElement(By.xpath("//option[@value='Completed']"));
	}
	public void OpenWorkItem()
	{
		UniversalSearchBox.sendKeys(WI_ID);	
		driver.findElement(By.xpath("//*[contains(text(),'"+WI_ID+"')]")).click();
		driver.findElement(By.xpath("//h6[contains(text(),'"+WI_ID+" : ')]"));
	}
	//Test Methods
	public void CreateNewCM()
	{
		ChannelName.sendKeys(CMname); 
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Created By']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Creation Date']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Modified Date']"));
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click(); 
//		driver.findElement(By.xpath("//p[contains(text(),'SOPAN') and @aria-label='Created By']"));
		driver.findElement(By.xpath("//p[contains(text(),'2024') and @aria-label='Creation Date']"));
		driver.findElement(By.xpath("//p[contains(text(),'2024') and @aria-label='Modified Date']"));
		
		//Checking status
		Select Options = new Select(CMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Draft",status,"Draft- Unexpected Status");
		// getting CM_WIID
		WebElement element = driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
		String fullNumber = element.getText();
		CM_WIID = fullNumber.substring(0, 5);
		System.out.println(CM_WIID);
	}
	public void VerifyCMAttachments()
	{
		BroadcasterUtility.click();
		driver.findElement(By.xpath("//h4[text()='BROADCASTER PACK DETAILS']")).getText();
//		List<WebElement> AddTPFPMs = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		Assert.assertTrue(AddTPFPMs.isEmpty(),"Broadcasters count Should be Zero");
		BackFromUtility.click();
		
		TPPackUtility.click(); 
		driver.findElement(By.xpath("//h4[text()='TATA PLAY CURATED IMPACTED PACKS']")).getText();
//		List<WebElement> TPPacksList = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		Assert.assertTrue(TPPacksList.isEmpty(),"Broadcasters count Should be Zero");
		BackFromUtility.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		wait.until(ExpectedConditions.elementToBeClickable(ALCFPM)).click();
		driver.findElement(By.xpath("//h6[contains(text(), ' : FPM - "+CMname+"')]"));
		wait.until(ExpectedConditions.elementToBeClickable(CloseModule)).click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		
		wait.until(ExpectedConditions.elementToBeClickable(ALCBPM)).click();
		driver.findElement(By.xpath("//h6[contains(text(), ' : BPM - "+CMname+"')]"));
		wait.until(ExpectedConditions.elementToBeClickable(CloseModule)).click();
	}
	public void fillTheDetails() throws InterruptedException
	{
		WebElement Dropdown= driver.findElement(By.xpath("//select[@aria-label='Name Of Broadcaster']"));
		Select select = new Select(Dropdown);
		select.selectByVisibleText(NameOfBroadcaster);
		WebElement Dropdown2= driver.findElement(By.xpath("//Select[@aria-label='Type of Channel']"));
		Select select2 = new Select(Dropdown2);
		select2.selectByVisibleText(type);
		WebElement Dropdown3= driver.findElement(By.xpath("//Select[@aria-label='Rental Flag']"));
		Select select3 = new Select(Dropdown3);
		select3.selectByVisibleText(RentalFlag); 
		WebElement Dropdown4= driver.findElement(By.xpath("//Select[@aria-label='Payable Flag']"));
		Select select4 = new Select(Dropdown4);
		select4.selectByVisibleText("Yes");
		WebElement DHTPriceInput= driver.findElement(By.xpath("//input[@aria-label='DTH Rio Rate (Without tax)']"));
		DHTPriceInput.sendKeys(Keys.CONTROL+"a");
		DHTPriceInput.sendKeys(Keys.BACK_SPACE);
		DHTPriceInput.sendKeys(String.valueOf(DHTPrice)); 
		driver.findElement(By.xpath("//span[@aria-label='Add Broadcaster FPM']")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM1+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM2+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM3+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
		Thread.sleep(1000);

	} 
	public void VerifyCMChanges() {
		WebElement priceWithTax = driver.findElement(By.xpath("//input[@aria-label='Price (Incl. of tax)']"));
		BigDecimal webPrice = new BigDecimal(priceWithTax.getAttribute("value"));
		BigDecimal expectedPrice = BigDecimal.valueOf(DHTPrice* 1.18).setScale(1, RoundingMode.UP);
		Assert.assertEquals(expectedPrice, webPrice, "DTH Calculation mismatch");
		
			
		WebElement priceWithoutTax = driver.findElement(By.xpath("//input[@aria-label='Price (Exclude of tax)']"));
		int priceInt = Integer.parseInt(priceWithoutTax.getAttribute("value"));
		Assert.assertEquals(DHTPrice, priceInt, "DTH without tax Calculation mismatch");
				
		WebElement ncfValue = driver.findElement(By.xpath("//input[@aria-label='NCF Value']"));
		int ncfInt = Integer.parseInt(ncfValue.getAttribute("value"));
		int expectedNcf = 0;
		if (type.equals("HD")) {
		    expectedNcf = 2;
		} else if (type.equals("SD")) { 
		    expectedNcf = 1;
		}
		Assert.assertEquals(expectedNcf, ncfInt, "NCF Calculation mismatch");
	}
	public void ContentTeamApproval() throws Exception
	{
		BroadcasterUtility.click();
		List<WebElement> BroadcasterList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int broadcasterCount1= BroadcasterList.size();
		Assert.assertEquals(broadcasterCount1,broadcasterCount+1,"Broadcasters count mismatch");
		
		WebElement NewPrice1 = driver.findElement(By.xpath("(//input[@aria-invalid='false'and @type='text'])[2]"));
		NewPrice1.sendKeys(Keys.CONTROL+"a");
		NewPrice1.sendKeys(Keys.BACK_SPACE);
		NewPrice1.sendKeys(NewBrdPrice);
		WebElement NewPrice2 = driver.findElement(By.xpath("(//input[@aria-invalid='false'and @type='text'])[3]"));
		NewPrice2.sendKeys(Keys.CONTROL+"a");
		NewPrice2.sendKeys(Keys.BACK_SPACE); 
		NewPrice2.sendKeys(NewBrdPrice);
		WebElement NewPrice3 = driver.findElement(By.xpath("(//input[@aria-invalid='false'and @type='text'])[4]"));
		NewPrice3.sendKeys(Keys.CONTROL+"a");
		NewPrice3.sendKeys(Keys.BACK_SPACE);	
		NewPrice3.sendKeys(NewBrdPrice);
		driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Content Team Approval']")).click();
		Thread.sleep(2000);
		
	}
	public void VerifyCTChnages() throws Exception {
		
		List<WebElement> BrdFPM = driver.findElements(By.xpath("//div[@aria-label='Add Broadcaster FPM']/child::div"));
		int BrdCount = BrdFPM.size();
		Assert.assertEquals(BrdCount,broadcasterCount,"Brd count count is not matching");
		WebElement firstBrd = BrdFPM.get(0);
		firstBrd.click();
		driver.findElement(By.xpath("//input[@aria-label='New Price' and @value='"+NewBrdPrice+"']")).click();
		CloseModule.click();	
		// need to add test cases for TPpacks
	}
	public void SMTeamApproval() throws Exception
	{
		WebElement Dropdown = driver.findElement(By.xpath("//select[@aria-label='Packaging Genre']"));
		Select select = new Select(Dropdown);
		select.selectByVisibleText(genre);
		CMComment.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", BroadcasterUtility);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='SM Approval']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='See TP impacted Packs']")).click();
		List<WebElement> TPPacksList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		TPPackCount = TPPacksList.size() - 1;
		BackFromUtility.click();
		System.out.println("TP Packs are = "+ TPPackCount);
		
		if(TPPackCount>0) {
			
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", TPPackUtility);
			WebElement NewPrice1 = driver.findElement(By.xpath("(//input[@aria-invalid='false'and @type='text'])[2]"));
			NewPrice1.sendKeys(Keys.CONTROL+"a");
			NewPrice1.sendKeys(Keys.BACK_SPACE);
			NewPrice1.sendKeys(NewBrdPrice);
			driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
			driver.findElement(By.xpath("//button[text()='Update With Price']")).click();
			driver.findElement(By.xpath("//button[text()='SM Approval']")).click();
		}
		
		Select Options = new Select(CMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Pending with EPG (Linear)",status,"EPG-Unexpected Status");
	}
	public void EPGTeamApproval() throws Exception
	{
		ALCBPM.click();
		WebElement IrdetoID = driver.findElement(By.xpath("//input[@id='4011']"));
		WebElement Caid=driver.findElement(By.xpath("//input[@id='4010']"));
		Caid.sendKeys(Keys.CONTROL+"a");
		Caid.sendKeys(Keys.BACK_SPACE);
		Caid.sendKeys(String.valueOf(CAID));
		IrdetoID.sendKeys(Keys.CONTROL+"a"); 
		IrdetoID.sendKeys(Keys.BACK_SPACE); 
		IrdetoID.sendKeys(String.valueOf(Irdetto_ID));
		BPMComment.sendKeys("Saving BPM");
		wait.until(ExpectedConditions.elementToBeClickable((SaveModulButton))).click();
		Thread.sleep(2000);
		CloseModule.click();
		CMComment.sendKeys("Saving CM");
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click();
		driver.findElement(By.xpath("//input[@aria-label='CA ID' and @value='"+CAID+"']"));
		driver.findElement(By.xpath("//input[@aria-label='Irdeto ID' and @value='"+Irdetto_ID+"']"));
		
	}
	public void VerifyFPMStatus() throws Exception
	{
		String[] xpathArray = {FPM1, FPM2, FPM3};
		for (int i = 0; i < xpathArray.length; i++) {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			WebElement FPM = driver.findElement(By.xpath("//a[contains(text(),'" + xpathArray[i] + "')]"));
			wait.until(ExpectedConditions.elementToBeClickable(FPM)).click();
			WebElement FPMstatus = driver.findElement(By.xpath("//select[@name='3008']"));
			Select dropdown = new Select(FPMstatus);
			String selectedOption = dropdown.getFirstSelectedOption().getText();
			if (selectedOption.equals("Completed")) {
				FPMstatus.click();
				FPMstatus.sendKeys(Keys.ARROW_DOWN);
				FPMstatus.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//textarea[@aria-label='Comments'])[2]")).sendKeys("XYZ");
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
				OldReference.sendKeys("1");
				wait.until(ExpectedConditions.elementToBeClickable(SaveModulButton)).click();
				FPMstatus.click();
				FPMstatus.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
				Thread.sleep(2000);
				FPMstatus.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				wait.until(ExpectedConditions.elementToBeClickable(SaveModulButton)).click();
			}
			Thread.sleep(2000);
			CloseModule.click();
			
		}
		
	}
	public void GetCAIDCombination1() throws Exception

	{
		
//		WebElement element = driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
//		String fullNumber = element.getText();
//		CM_WIID = fullNumber.substring(0, 5);
//		System.out.println(CM_WIID);
		
//		WebElement Dropdown1 = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]"));
//		Dropdown1.click();
//		WebElement Dropdown= driver.findElement(By.xpath("//li[text()='CM']"));
//		Dropdown.click();
//		WebElement SearchBox = driver.findElement(By.xpath("(//input[@placeholder='Search ...'])[2]"));
//		SearchBox.sendKeys(CM_WIID);
//		Thread.sleep(1000);
//		SearchBox.sendKeys(Keys.ARROW_DOWN);
//		SearchBox.sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(CAIDUtiliti)).click();
		driver.findElement(By.xpath("//button[text()='Load']")).click();
		WebElement Dropdown2 = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]"));
		
		for(int i=1;i<=broadcasterCount;i++)
		{
			Dropdown2.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.findElement(By.xpath("//button[text()='Get CAID Combination']")).click();
			Thread.sleep(5000);
			WebElement CheckBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
			WebElement getComb = driver.findElement(By.xpath("(//input[@type='checkbox']//following::th)[1]"));
			Combination = getComb.getText();
			CheckBox.click(); 
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.findElement(By.xpath("//button[text()='Update FPM']")).click();
			Thread.sleep(2000);
		}
		
	}
	public void CMChanges() throws Exception
	{

		Select Options = new Select(CMstatus);
		String SelectedStatus = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Pending with Technology (Linear)",SelectedStatus,"Pending with Technology (Linear)- Unexpected Status");
				
        List<WebElement> BRDFPM = driver.findElements(By.xpath("//div[@aria-label='Add Broadcaster FPM']/child::div"));
        Assert.assertTrue(BRDFPM.isEmpty(),"Broadcaster FPM should be cleare");
        
		List<WebElement> approvedFPMs = driver.findElements(By.xpath("//div[@aria-label='Broadcaster FPM in which Channel available']/child::div"));
		int count2= approvedFPMs.size();
		Assert.assertEquals(count2,broadcasterCount,"Broadcasters count mismatch");
		
		CMstatus.click();
		CMstatus.sendKeys(Keys.ARROW_DOWN);
		CMstatus.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click();
		Thread.sleep(2000);
		
		List<WebElement> TPPackFPMs = driver.findElements(By.xpath("//div[@aria-label='TP Curated FPM in which Channel available']/child::div"));
		int count3 = TPPackFPMs.size();
		Assert.assertEquals(count3,TPPackCount,"TPPackFPMs count mismatch");
		
		List<WebElement> AddTPFPMs = driver.findElements(By.xpath("//div[@aria-label='Add TP FPMs']/child::div"));
		Assert.assertTrue(AddTPFPMs.isEmpty(),"AddTPFPMs should not be on CM"); 
		Thread.sleep(2000);
	  
	}
	public void  BrdFPMChanges() throws Exception
	{
		for(int i=0;i<broadcasterCount;i++){
		if(i==0)
		{
			WI_ID=FPM1;
		}
		else if(i==1)
		{
			WI_ID=FPM2;
		}
		else if(i==2)
		{
			WI_ID=FPM3;
		}
		OpenWorkItem();
		Select Options = new Select(CMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Pending with EPG",status,"Completed- Unexpected Status");
		driver.findElement(By.xpath("//input[@aria-label='Multi TV Content MBR' and @value='74']"));
		driver.findElement(By.xpath("//input[@aria-label='Monthly Pack Price' and @value='74']"));
		driver.findElement(By.xpath("//input[@aria-label='New Price' and @value='0']"));
//		driver.findElement(By.xpath("//textarea[@aria-label='Backend CA ID Mapping' and text()='"+Combination+"']"));
//		driver.findElement(By.xpath("//textarea[@aria-label='Change Mapping Combo CA ID' and text()='"+Combination+"']"));
		driver.findElement(By.xpath("//textarea[contains(text(),'"+CMname+"') and @aria-label='Channel Name List']"));
		WebElement BrdCMCount = driver.findElement(By.xpath("//input[@aria-label='Total Channel Count']"));
		String TotalCount = BrdCMCount.getAttribute("value");
		ChanneldetailsTab.click();
		List<WebElement> AllChannels = driver.findElements(By.xpath("(//div[@class='MuiAccordionDetails-root css-15v22id-MuiAccordionDetails-root'])[2]//div[@class='link-wrapper MuiBox-root css-bivkl']"));
		int BrdChannels = AllChannels.size();
		Assert.assertEquals(BrdChannels,Integer.parseInt(TotalCount),"Channels are not matching with count");
		FrontendPackTab.click();
		}
	} 
	public void TPPackChanges() throws Exception
	{
		System.out.println("ok");
		for(int i=1;i<7;i++){
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			driver.findElement(By.xpath("(//div[@aria-label='TP Curated FPM in which Channel available']//div[@class='MuiBox-root css-70qvj9'])["+i+"]")).click();
			Thread.sleep(1000);
	
			driver.findElement(By.xpath("//input[@aria-label='New Price' and @value='0']"));
			driver.findElement(By.xpath("//textarea[contains(text(),'"+CMname+"') and @aria-label='Channel Name List']"));
			WebElement BrdCMCount = driver.findElement(By.xpath("//input[@aria-label='Total Channel Count']"));
			String TotalCount = BrdCMCount.getAttribute("value");
			ChanneldetailsTab.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),':CM - "+CMname+"')]"));
//			List<WebElement> AllChannels = driver.findElements(By.xpath("(//div[@class='MuiAccordionDetails-root css-15v22id-MuiAccordionDetails-root'])[2]//div[@class='link-wrapper MuiBox-root css-bivkl']"));
//			int BrdChannels = AllChannels.size();
//			Assert.assertEquals(BrdChannels,Integer.parseInt(TotalCount),"Channels are not matching with count");
			CloseModule.click();
		}
	}
	public void ALCFPMChanges() throws Exception
	{
		ALCFPM.click();
		driver.findElement(By.xpath("//input[@aria-label='Final NCF Value' and @value='2']"));
		driver.findElement(By.xpath("//input[@aria-label='Total Channel Count' and @value='1']"));
		driver.findElement(By.xpath("//textarea[@aria-label='Channel Name List' and text()='"+CMname+"']"));
		ChanneldetailsTab.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),':CM - "+CMname+"')]"));

	}
	public void ALCBPMChanges() throws Exception
	{
		ALCBPM.click();
		WebElement Dropdown2 =driver.findElement(By.xpath("//select[@aria-label='Type of Pack']"));
		Select select2 = new Select(Dropdown2);
		WebElement selectedOption = select2.getFirstSelectedOption();
		String selectedText = selectedOption.getText();
		System.out.println(selectedText);
		Assert.assertEquals(selectedText,"ALC","EPG-Unexpected Status");
		
		driver.findElement(By.xpath("(//input[@aria-label='CA ID' and @value='"+CAID+"'])[2]"));
		driver.findElement(By.xpath("(//input[@aria-label='Irdeto ID' and @value='"+Irdetto_ID+"'])[2]"));
		driver.findElement(By.xpath("//textarea[@aria-label='Channel Name List' and text()='"+CMname+"']"));
		ChanneldetailsTab.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),':CM - "+CMname+"')]"));
	}

}


