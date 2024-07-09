package FunctionalFlow;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
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

public class ChannelAddDropFromFPM extends TestBase{
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
	public static String Combination;
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
	@FindBy(xpath="(//select[@aria-label='Status']//option)[1]") private WebElement SelectedOption ;
	@FindBy(xpath="//div[@aria-label='ALC FPM in which channel available']/child::div") private WebElement ALCFPM ;
	@FindBy(xpath="//div[@aria-label='ALC Backend Packs in which Channel available']/child::div") private WebElement ALCBPM ;
	@FindBy(xpath="//textarea[@aria-label='Channel Name List']") private WebElement ChannelNameList ;

	// Constructor
	
	public ChannelAddDropFromFPM()
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

	            // Assuming values are in the second column (index 1) and there are 10 rows
	            for (int i = 0; i < 14; i++) {
	                Row row = sheet.getRow(i);
	                Cell cell = row.getCell(1); // Assuming the values are in the second column (index 1)

	                // Assuming the values are strings. Adjust as per your data type.
	                String cellValue = cell.getStringCellValue();

	                // Assign values to instance variables based on the iteration
	                switch (i) {
	                    case 0:
	                    	CMname = cellValue;
	                        break;
	                    case 1:
	                    	CM_WIID = cellValue; 
	                        break;
	                    case 2:
	                    	String strDTH = cellValue;
	                    	DHTPrice = Integer.parseInt(strDTH) ;
	                    	break;
	                    case 3:
	                    	type = cellValue;
	                    	break;
	                    case 4:
	                    	genre = cellValue;
	                    	break;
	                    case 5:
	                    	RentalFlag = cellValue;
	                    	break;
	                    case 6:
	                    	NameOfBroadcaster = cellValue;
	                    	break;
	                    case 7:
	                    	NewBrdPrice = cellValue;
	                    	break;
	                    case 8:
	                    	CAID = cellValue;
	                    	break;
	                    case 9:
	                    	Irdetto_ID = cellValue;
	                    	break;
	                    case 10:
	                    	String brdCount = cellValue;
	                    	broadcasterCount = Integer.parseInt(brdCount);
	                    	break;
	                    case 11:
	                    	FPM1 = cellValue;
	                    	break;
	                    case 12:
	                    	FPM2 = cellValue;
	                    	break;
	                    case 13:
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
	public void CreatedCM() throws Exception
	{
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
		driver.findElement(By.xpath("//h6[contains(text(),'5')]"));
		String status = SelectedOption.getText();
		Assert.assertEquals("Draft",status,"Draft- Unexpected Status");
	}
	public void OpenCreatedCM() throws Exception
	{
		Thread.sleep(3000); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
		driver.findElement(By.xpath("//h6[contains(text(),'5')]"));
		String status = SelectedOption.getText();
		Assert.assertEquals("Draft",status,"Draft- Unexpected Status");
	}
	public void OpenCreatedCMForSM() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Pending with Subscriber Marketing(Linear)']")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
		driver.findElement(By.xpath("//h6[contains(text(),'5')]"));
		String status = SelectedOption.getText();
		Assert.assertEquals("Pending with Subscriber Marketing(Linear)",status,"Pending with Subscriber Marketing(Linear)- Unexpected Status");
	}
	public void OpenCreatedCMForEPG() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Pending with EPG (Linear)']")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
		driver.findElement(By.xpath("//h6[contains(text(),'5')]"));
		driver.findElement(By.xpath("//option[@value='Pending with EPG (Linear)']"));
		String status = SelectedOption.getText();
		Assert.assertEquals("Pending with EPG (Linear)",status,"Pending with EPG (Linear)- Unexpected Status");

	}
	public void OpenCompletedCM() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Completed']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'"+CMname+"')]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
		driver.findElement(By.xpath("//h6[contains(text(),'5')]"));
		String status = SelectedOption.getText();
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
		Select select = new Select(CMstatus);
		WebElement selectedOption = select.getFirstSelectedOption();
		String selectedText = selectedOption.getText();
		Assert.assertEquals("Draft",selectedText,"Draft- Unexpected Status");
		// getting CM_WIID
		WebElement element = driver.findElement(By.xpath("//h6[contains(text(),': CM -')]"));
		String fullNumber = element.getText();
		CM_WIID = fullNumber.substring(0, 5);
		System.out.println(CM_WIID);
	}
	public void VerifyCMAttachments()
	{
		BroadcasterUtility.click();
		String Title = driver.findElement(By.xpath("//h4[text()='BROADCASTER PACK DETAILS']")).getText();
		Assert.assertEquals("BROADCASTER PACK DETAILS",Title,"BR-Utility Title mismatch");
		List<WebElement> AddTPFPMs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertTrue(AddTPFPMs.isEmpty(),"Broadcasters count Should be Zero");
		BackFromUtility.click();
		
		TPPackUtility.click(); 
		String Title2 = driver.findElement(By.xpath("//h4[text()='TATA PLAY CURATED IMPACTED PACKS']")).getText();
		Assert.assertEquals("TATA PLAY CURATED IMPACTED PACKS",Title2,"TP-Utility Title mismatch");
		List<WebElement> TPPacksList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertTrue(TPPacksList.isEmpty(),"Broadcasters count Should be Zero");
		BackFromUtility.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ALCFPM)).click();
		driver.findElement(By.xpath("//h6[contains(text(), ' : FPM - "+CMname+"')]"));
		wait.until(ExpectedConditions.elementToBeClickable(CloseModule)).click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
		
		wait.until(ExpectedConditions.elementToBeClickable(ALCBPM)).click();
		driver.findElement(By.xpath("//h6[contains(text(), ' : BPM - "+CMname+"')]"));
		wait.until(ExpectedConditions.elementToBeClickable(CloseModule)).click();
	}
	public void fillTheDetails()
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
		WebElement DHTPriceInput= driver.findElement(By.xpath("//input[@aria-label='DTH Rio Rate(without tax)']"));
		DHTPriceInput.sendKeys(Keys.CONTROL+"a");
		DHTPriceInput.sendKeys(Keys.BACK_SPACE);
		DHTPriceInput.sendKeys(String.valueOf(DHTPrice)); 
		driver.findElement(By.xpath("//span[@aria-label='Add Broadcaster FPM']")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM1+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM2+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM3+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
	}
}