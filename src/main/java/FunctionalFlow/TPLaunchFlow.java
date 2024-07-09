package FunctionalFlow;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

public class TPLaunchFlow extends TestBase{
	
    private String FPMName;
    private String FPM_WIID;
    private String UnitofMeasure;
    private String TypeofPack;
    private String genre;
    private String RentalFlag;
    private String NameOfBroadcaster;
    private String NewBrdPrice;
    private String ALCFPM1;
    private String ALCFPM2;
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
	@FindBy(xpath="//div[@aria-label='Pack Name']//input") private WebElement FPMNameField;
	@FindBy(xpath="//select[@aria-label='Status']") private WebElement FPMstatus;
	@FindBy(xpath="//select[@aria-label='Unit of Measure (UoM)']") private WebElement UOM;
	@FindBy(xpath="//select[@aria-label='Unit Of Measure(UoM)']") private WebElement UOM2;
	@FindBy(xpath="//select[@aria-label='Type of Pack']") private WebElement TypeOfPack ;
	@FindBy(xpath="(//select[@aria-label='Type of Pack'])[2]") private WebElement PCFTypeOfPack ;
	@FindBy(xpath="//a[contains(text(),'41211')]") private WebElement ALC_FPM1 ;
	@FindBy(xpath="//a[contains(text(),'49694')]") private WebElement ALC_FPM2 ;
	@FindBy(xpath="//a[contains(text(),'51331')]") private WebElement FPM_1 ;
	@FindBy(xpath="//a[contains(text(),'51332')]") private WebElement FPM_2 ;
	@FindBy(xpath="//a[contains(text(),'51333')]") private WebElement FPM_3 ;
	
	@FindAll({@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1n4twyu-MuiInputBase-input-MuiOutlinedInput-input']")})private List<WebElement> Discounts;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1a-content'])[3]//div[@class='link-wrapper MuiBox-root css-bivkl']")})private List<WebElement> ThirdSectionChannels;
//	@FindAll({@FindBy(xpath = "(//div[@id='panel1a-content'])[2]//div[@class='link-wrapper MuiBox-root css-bivkl']")})private List<WebElement> SecondSectionChannels;

	
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//a[@aria-label='TP Pack Launch Approval']") private WebElement TPPackLaunchUtility;
	@FindBy(xpath="//*[@aria-label='Refresh']") private WebElement RefreshButton ;
	@FindBy(xpath="(//button[text()='Save'])[2]") private WebElement SaveModulButton;
	@FindBy(xpath="//a[@aria-label='Broadcaster Approval']") private WebElement BroadcasterUtility;
	@FindBy(xpath="//a[@aria-label='TP Curated Approval']") private WebElement TPPackUtility;
	@FindBy(xpath="//*[@data-testid='KeyboardBackspaceIcon']") private WebElement BackFromUtility;
	@FindBy(xpath="//div[@aria-label='Link to PCF']/child::div") private WebElement LinkedPCF ;
	@FindBy(xpath="//p[text()='Frontend Pack Master']") private WebElement FrontendPackTab ;
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChanneldetailsTab ;
	@FindBy(xpath="//*[@data-testid='CloseIcon']") private WebElement CloseModule;
	@FindBy(xpath="//textarea[@aria-label='Channel Name List']") private WebElement ChannelNameList ;

	// Constructor
	public TPLaunchFlow()
	{ 
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(4));	
	} 
	
	//Supporting methods 
	 public void readExcelAndAssignValues() {
		 String excelFilePath = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\InputExcel.xlsx";
		 try (Workbook workbook = new XSSFWorkbook(excelFilePath)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 0; i < 15; i++) {
                Row row = sheet.getRow(i);
                Cell cell = row.getCell(3); // Assuming the values are in the second column (index 3)
                String cellValue = cell.getStringCellValue();
                switch (i) {
	                case 1:
	                	FPMName = cellValue;
	                    break;
	                case 2:
	                	FPM_WIID = cellValue; 
	                    break;
	                case 3:
	                	UnitofMeasure = cellValue;
	                	break;
	                case 4:
	                	TypeofPack = cellValue;
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
	                	ALCFPM1 = cellValue;
	                	break;
	                case 10:
	                	ALCFPM2 = cellValue;
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
        System.out.println("FPMname: " + FPMName);
        System.out.println("CM_WIID: " + FPM_WIID);
        System.out.println("Unit of Measure: " + UnitofMeasure);
        System.out.println("Type of Pack: " + TypeofPack);
        System.out.println("genre: " + genre);
        System.out.println("RentalFlag: " + RentalFlag);
        System.out.println("NameOfBroadcaster: " + NameOfBroadcaster);
        System.out.println("NewBrdPrice: " + NewBrdPrice);
        System.out.println("ALC FPM1: " + ALCFPM1);
        System.out.println("ALC FPM2: " + ALCFPM2);
        System.out.println("broadcasterCount: " + broadcasterCount);
        System.out.println("FPM1: " + FPM1);
        System.out.println("FPM2: " + FPM2);
        System.out.println("FPM3: " + FPM3);
	    }

	 public void OpenTPFPMBySearch() throws Exception
	 {
		 Thread.sleep(3000); 
		 UniversalSearchBox.sendKeys("FPM - "+FPMName);
		 Thread.sleep(1000);
		 UniversalSearchBox.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(500);
		 UniversalSearchBox.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//h6[contains(text(),': FPM -')]"));
	 }
	public void OpenCreatedFPM() throws Exception
	{
		Thread.sleep(3000); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'"+FPMName+"')])[2]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': FPM -')]"));
//		driver.findElement(By.xpath("//h6[contains(text(),'6')]"));
		Select Options2 = new Select(FPMstatus);
		String status2 = Options2.getFirstSelectedOption().getText();
		Assert.assertEquals("Draft",status2,"Draft- Unexpected Status");

	}
	public void OpenCreatedFPMForSM() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[6]")).click();
		driver.findElement(By.xpath("//li[text()='Pending With Subscriber Marketing']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'"+FPMName+"')])[2]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': FPM -')]"));
		Select Options = new Select(FPMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Pending with Subscriber Marketing",status,"Pending With Subscriber Marketing- Unexpected Status");
	}
	public void OpenCreatedFPMForEPG() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[6]")).click();
		driver.findElement(By.xpath("//li[text()='Pending with EPG']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'"+FPMName+"')])[2]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': FPM -')]"));
		Select Options = new Select(FPMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Pending with EPG",status,"Pending with EPG- Unexpected Status");
	}
	public void OpenCompletedFPM() throws Exception
	{
		driver.findElement(By.xpath("(//button[@id='basic-button'])[6]")).click();
		driver.findElement(By.xpath("//li[text()='Completed']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[contains(text(),'"+FPMName+"')])[2]"))).click();
		driver.findElement(By.xpath("//h6[contains(text(),': FPM -')]"));
		Select Options = new Select(FPMstatus);
		String status = Options.getFirstSelectedOption().getText();
		Assert.assertEquals("Completed",status,"Completed- Unexpected Status");
	}
	private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
	public void CreateNewFPM()
	{
		FPMNameField.sendKeys(FPMName); 
		Select select = new Select(TypeOfPack);
		select.selectByVisibleText(TypeofPack);
		Select select2 = new Select(UOM);
		select2.selectByVisibleText(UnitofMeasure);
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click(); 
//		driver.findElement(By.xpath("//p[contains(text(),'SOPAN') and @aria-label='Created By']"));
		driver.findElement(By.xpath("//p[contains(text(),'2024') and @aria-label='Creation Date']"));
		driver.findElement(By.xpath("//p[contains(text(),'2024') and @aria-label='Modified Date']"));
		
		// getting CM_WIID
		WebElement element = driver.findElement(By.xpath("//h6[contains(text(),': FPM -')]"));
		String fullNumber = element.getText();
		FPM_WIID = fullNumber.substring(0, 5);
		System.out.println(FPM_WIID);
	}
	public void VerifyFPMttachments()
	{
		BroadcasterUtility.click();
		driver.findElement(By.xpath("//h4[text()='BROADCASTER PACK DETAILS']")).getText();
		driver.findElement(By.xpath("//p[text()='No Broadcaster Packs Data Found !!!']")).getText();
		List<WebElement> AddTPFPMs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertTrue(AddTPFPMs.isEmpty(),"Broadcasters count Should be Zero");
		BackFromUtility.click();
		
		TPPackUtility.click(); 
		driver.findElement(By.xpath("//h4[text()='TATA PLAY CURATED IMPACTED PACKS']")).getText();
		driver.findElement(By.xpath("//p[text()='No Impacted Packs Data Found !!!']")).getText();
		List<WebElement> TPPacksList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Assert.assertTrue(TPPacksList.isEmpty(),"Broadcasters count Should be Zero");
		BackFromUtility.click();
		
		TPPackLaunchUtility.click(); 
		driver.findElement(By.xpath("//h4[contains(text(),'TATA PLAY PACK LAUNCH DETAIL')]")).getText();
		BackFromUtility.click();
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		wait.until(ExpectedConditions.elementToBeClickable(LinkedPCF)).click();
		driver.findElement(By.xpath("//h6[contains(text(), ' : "+FPMName+" ')]"));
		wait.until(ExpectedConditions.elementToBeClickable(CloseModule)).click();
	}
	public void fillTheDetails()
	{
		driver.findElement(By.xpath("//span[@aria-label='ALC FPMs']")).click();
		driver.findElement(By.xpath("//h6[text()='"+ALCFPM1+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//h6[text()='"+ALCFPM2+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
		driver.findElement(By.xpath("//span[@aria-label='Broadcaster FPMs']")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM1+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM2+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//h6[text()='"+FPM3+"']/preceding-sibling::span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		SaveButton.click();
		
	}
	public void VerifyTPFPMChanges()
	{
		String extractedText = null;
		String FullText = ALC_FPM1.getText();
		String[] parts = FullText.split("-"); 
        if (parts.length > 1) {
            extractedText = parts[1].trim();
        } else {System.out.println("No text found after hyphen.");}
        ChanneldetailsTab.click();
		driver.findElement(By.xpath("//a[contains(text(),'"+extractedText+"')]"));
		FrontendPackTab.click();
		
		String FullText2 = ALC_FPM2.getText();
		String[] parts2 = FullText2.split("-"); 
		if (parts2.length > 1) {
			extractedText = parts2[1].trim();
			System.out.println(extractedText);
		} else {System.out.println("No text found after hyphen.");}
		ChanneldetailsTab.click();
		driver.findElement(By.xpath("//a[contains(text(),'"+extractedText+"')]"));
		driver.findElement(By.xpath("//a[contains(text(),'39484')]"));
		driver.findElement(By.xpath("//a[contains(text(),'39476')]"));
		driver.findElement(By.xpath("//a[contains(text(),'49419')]"));
		Assert.assertFalse(ThirdSectionChannels.isEmpty());
		
		FrontendPackTab.click();
		driver.findElement(By.xpath("//textarea[contains(text(),'Colors Cineplex')]"));
		driver.findElement(By.xpath("//textarea[contains(text(),'Colors Cineplex HD')]"));
//		driver.findElement(By.xpath("//textarea[contains(text(),'Colors Cineplex Superhits')]"));
		
		
//		51331   -   39484:CM -Colors Cineplex
//		51332   -   39476:CM -Colors Cineplex HD
//		51333   -   49419:CM - Colors Cineplex Superhits
		
	}
	public void VerifyFPMChanges() throws Exception
	{
		String[] xpathArray = {FPM1, FPM2, FPM3, ALCFPM1, ALCFPM2};
		for (int i = 0; i < xpathArray.length; i++) {
			WebElement FPM = driver.findElement(By.xpath("//a[contains(text(),'" + xpathArray[i] + "')]"));
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			wait.until(ExpectedConditions.elementToBeClickable(FPM)).click();
			driver.findElement(By.xpath("//a[contains(text(),'60947:FPM - Selenium7')]"));
			CloseModule.click();
			Thread.sleep(3000);
		}
	}
	public void VerifyPCFChanges()
	{
		LinkedPCF.click();
		Select Options2 = new Select(PCFTypeOfPack);
		String status2 = Options2.getFirstSelectedOption().getText();
		Assert.assertEquals("Tata Play Bouquet",status2,"Tata Play Bouquet- Unexpected Status");
		Select Options3 = new Select(UOM2);
		String status3 = Options3.getFirstSelectedOption().getText();
		Assert.assertEquals("Monthly",status3,"Monthly- Unexpected Status");
		driver.findElement(By.xpath("(//input[@aria-label='Duration (In Days)' and @value='30'])[2]"));
		
	}
	public void CalculationValidation()
	{
		TPPackLaunchUtility.click();
	    List<WebElement> Discount = driver.findElements(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1n4twyu-MuiInputBase-input-MuiOutlinedInput-input']"));
	    int Inputs = Discount.size();
		if(Inputs == 7)
		{
			for (WebElement element : Discounts)
			{
				element.sendKeys("1");
			} 
		}
		driver.findElement(By.xpath("//button[text()='Calculate MBR']")).click();
        List<WebElement> cellElements = driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignCenter MuiTableCell-sizeSmall css-vtdehq-MuiTableCell-root']"));
       int Cellscount = cellElements.size();
       System.out.println(Cellscount);
		if(Cellscount == 70) {
			for (int i = 0; i < cellElements.size(); i++) {
				WebElement element = cellElements.get(i);
				String text = element.getText();
				System.out.println("Index: " + i + ", Text: " + text);
        	}
        }
         int[] indices = {6,13, 20, 27, 34};
         double sum = 0.0;
         for (int index : indices) {
             String text = cellElements.get(index).getText();
             sum += Double.parseDouble(text);
         }
         WebElement cellElement = cellElements.get(47);
         String NetPrice = cellElement.getText();
 		 Assert.assertEquals(sum,Double.parseDouble(NetPrice),"Total- Unexpected Status");
 		 
 		 WebElement DicTotalcell = cellElements.get(46);
         String DicTotal = DicTotalcell.getText();
         
         WebElement TotalPricecell = cellElements.get(45);
         String TotalPric = TotalPricecell.getText();
 		 Assert.assertEquals(sum+Double.parseDouble(DicTotal),Double.parseDouble(TotalPric),"Total2- Unexpected Status");

 		int[] indices2 = {4,11, 18, 25, 32};
        double sum2 = 0.0;
        for (int index : indices2) {
            String text = cellElements.get(index).getText();
            sum2 += Double.parseDouble(text);
        }
		Assert.assertEquals(sum2,Double.parseDouble(TotalPric),"Total3- Unexpected Status");
		
        WebElement NCFTotalcell = cellElements.get(54);
        String NCFTotal = NCFTotalcell.getText();
		Assert.assertEquals(152.40,Double.parseDouble(NCFTotal),"NCFTotal- Unexpected Status");
		
		WebElement MonthlyPriceCell = cellElements.get(61);
		String MonthlyPrice = MonthlyPriceCell.getText();
		double roundedMonthlyPrice = round(sum+Double.parseDouble(NCFTotal), 2);
		Assert.assertEquals(roundedMonthlyPrice,Double.parseDouble(MonthlyPrice),"MonthlyPrice- Unexpected Status");
		driver.findElement(By.xpath("//button[text()='Update with change ']")).click();
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		BackFromUtility.click();
		WebElement DBRElement = driver.findElement(By.xpath("//input[@aria-label='DBR']"));
		double DBRValue = Double.parseDouble(DBRElement.getAttribute("value"));
		Assert.assertEquals(round(roundedMonthlyPrice/30,2),DBRValue,"DBRValue- Unexpected Status");
		
		WebElement MonthlyPackPrice = driver.findElement(By.xpath("//input[@aria-label='Monthly Pack Price']"));
		double MonthlyPriceValue = Double.parseDouble(MonthlyPackPrice.getAttribute("value"));
		Assert.assertEquals(MonthlyPriceValue,roundedMonthlyPrice,"MonthlyPackPrice- Unexpected Status");
		
		WebElement NetNCF = driver.findElement(By.xpath("//input[@aria-label='Net NCF']"));
		double NetNCFValue = Double.parseDouble(NetNCF.getAttribute("value"));
		Assert.assertEquals(NetNCFValue,152.40,"NetNCF- Unexpected Status");
		
		WebElement NCFDiscount = driver.findElement(By.xpath("//input[@aria-label='NCF Discount']"));
		double NCFDiscountValue = Double.parseDouble(NCFDiscount.getAttribute("value"));
		Assert.assertEquals(NCFDiscountValue,1,"NCFDiscount- Unexpected Status");
		
		WebElement MultiTVMBR = driver.findElement(By.xpath("//input[@aria-label='Multi TV Content MBR']"));
		double MultiTVMBRValue = Double.parseDouble(MultiTVMBR.getAttribute("value"));
		Assert.assertEquals(MultiTVMBRValue,round(MonthlyPriceValue-NetNCFValue-0.01,2),"MultiTVMBRValue- Unexpected Status");
		driver.findElement(By.xpath("//textarea[@aria-label='Broadcaster and ALC Discounts' and contains(text(),':1.00,')]"));
	}
	public void EPGTeamApproval() throws Exception
	{
		driver.findElement(By.xpath("//p[text()='Backend Pack Mapping']")).click();
		driver.findElement(By.xpath("//a[text()='EPG Approval']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("//button[text()='Get CAID Combination']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		WebElement getComb = driver.findElement(By.xpath("(//input[@type='checkbox']//following::th)[1]"));
		Combination = getComb.getText();
		System.out.println(Combination);
		driver.findElement(By.xpath("//button[text()='Update CAID']")).click();
		Thread.sleep(2000);

	}
	public void VerifyCompletedFPM()
	{
		driver.findElement(By.xpath("//textarea[@aria-label='Backend CA ID Mapping' and text()='"+Combination+"']")).click();
		driver.findElement(By.xpath("//textarea[@aria-label='Change Mapping Combo CA ID' and text()='"+Combination+"']")).click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//p[text()='Backend Pack Mapping']")).click();
		driver.findElement(By.xpath("//textarea[@aria-label='CA ID' and text()='"+Combination+"']")).click();
	    List<WebElement> BPMs = driver.findElements(By.xpath("//div[@class='link-wrapper MuiBox-root css-bivkl']"));
	    int Count = BPMs.size();
	    Assert.assertTrue(Count>6);
	    ChanneldetailsTab.click();
	    Assert.assertTrue(ThirdSectionChannels.isEmpty());
	    FrontendPackTab.click();
	}
	public void TPAttachedToChannels() throws Exception {
		ChanneldetailsTab.click();
		driver.findElement(By.xpath("(//div[@class='link-wrapper MuiBox-root css-bivkl'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+FPMName+"')]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-lw08pq-MuiSvgIcon-root']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[@class='link-wrapper MuiBox-root css-bivkl'])[2]")).click();
//	    Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(),'Selenium8')]"));
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-lw08pq-MuiSvgIcon-root']")).click();
//		Thread.sleep(2000);
//		ChanneldetailsTab.click();
//		driver.findElement(By.xpath("(//div[@class='link-wrapper MuiBox-root css-bivkl'])[3]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Selenium8')]"));
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-lw08pq-MuiSvgIcon-root']"));
//		Thread.sleep(2000);
//		ChanneldetailsTab.click();
//		driver.findElement(By.xpath("(//div[@aria-label='Music']//div)[1]")).click();
//		driver.findElement(By.xpath("(//a[contains(text(),'Selenium8')]"));
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		
	   }
	public void ChangesInBPMs () throws Exception
	{
		driver.findElement(By.xpath("//p[text()='Backend Pack Mapping']")).click();
//	    List<WebElement> BPMs = driver.findElements(By.xpath("//div[@class='link-wrapper MuiBox-root css-bivkl']"));
//	    for(WebElement BPM:BPMs) {
	    driver.findElement(By.xpath("(//div[@class='link-wrapper MuiBox-root css-bivkl'])[1]")).click();
	    	driver.findElement(By.xpath("//p[text()='Frontend Pack Mapping']")).click();
	    	driver.findElement(By.xpath("//a[contains(text(),'"+FPMName+"')]"));
			driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-lw08pq-MuiSvgIcon-root']")).click();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("(//div[@class='link-wrapper MuiBox-root css-bivkl'])[2]")).click();

//	    }
	
	}
}