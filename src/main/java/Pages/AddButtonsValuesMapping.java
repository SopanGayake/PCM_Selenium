package Pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.TestBase;

public class AddButtonsValuesMapping extends TestBase {
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
	
	String TestDataExcel = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFileCM.xlsx";
	public AddButtonsValuesMapping()
	{
	PageFactory.initElements(driver, this);
	}
	public void GetNameOfAddButtons() throws Exception
	{
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		SubscriberMarketingTeam.click();
		EPGTeamAtributs.click();
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='+ Add']/preceding::div[2]"));
		for (WebElement element : elements) {
			if( element.getText() != "" && element.getText() != " ") {
        	webSectionList.add(element.getText());
        	System.out.println(element.getText());
			}
        }
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(0); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void SecondaryGenreAB() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement SecondaryGenre = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[1]"));
		SecondaryGenre.click();
//		List<String> webSectionList = new ArrayList<>();
//		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
//		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
//        for (WebElement option : optionElements) {
//        	if( option.getText() != "" && option.getText() != " ") {
//				webSectionList.add(option.getText());
//			}
//        }
//        driver.findElement(By.xpath("//button[@class='btn-close']")).click();
//        ContentTeamSection.click();
//		ArrayList<String> ExcelTestData = new ArrayList<>();
//		FileInputStream excelFile = new FileInputStream(TestDataExcel);
//		Workbook workbook = new XSSFWorkbook(excelFile);
//		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
//		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
//			Row row = sheet.getRow(rowNum);
//			if (row != null) {
//				Cell cell = row.getCell(1); // Column 1
//				
//				if (cell != null) {
//					String cellValue = cell.getStringCellValue();
//					ExcelTestData.add(cellValue);
//				}
//			}
//		}
//		workbook.close();
//		if (webSectionList.equals(ExcelTestData)) {
//			System.out.println("Both lists of web elements are the same.");
//		} else {
//			throw new Exception("Failed because List are not Matching");
//		}
	} 
	public void SDMappingAB() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement SDMapping = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[2]"));
		SDMapping.click();
//		List<String> webSectionList = new ArrayList<>();
//		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
//		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
//		for (WebElement option : optionElements) {
//			if( option.getText() != "" && option.getText() != " ") {
//				webSectionList.add(option.getText());
//				System.out.println(option.getText());
//			}
//		}
//		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
//		ContentTeamSection.click();
//		ArrayList<String> ExcelTestData = new ArrayList<>();
//		FileInputStream excelFile = new FileInputStream(TestDataExcel);
//		Workbook workbook = new XSSFWorkbook(excelFile);
//		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
//		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
//			Row row = sheet.getRow(rowNum);
//			if (row != null) {
//				Cell cell = row.getCell(2); // Column 1
//				
//				if (cell != null) {
//					String cellValue = cell.getStringCellValue();
//					ExcelTestData.add(cellValue);
//				}
//			}
//		}
//		workbook.close();
//		if (webSectionList.equals(ExcelTestData)) {
//			System.out.println("Both lists of web elements are the same.");
//		} else {
//			throw new Exception("Failed because List are not Matching");
//		}
	} 
	public void BroadcasterFPMAB() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement BroadcasterFPM = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[3]"));
		BroadcasterFPM.click();
//		List<String> webSectionList = new ArrayList<>();
//		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
//		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
//		for (WebElement option : optionElements) {
//			if( option.getText() != "" && option.getText() != " ") {
//				webSectionList.add(option.getText());
//				System.out.println(option.getText());
//			}
//		}
//		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
//		ArrayList<String> ExcelTestData = new ArrayList<>();
//		FileInputStream excelFile = new FileInputStream(TestDataExcel);
//		Workbook workbook = new XSSFWorkbook(excelFile);
//		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
//		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
//			Row row = sheet.getRow(rowNum);
//			if (row != null) {
//				Cell cell = row.getCell(3); // Column 1
//				
//				if (cell != null) {
//					String cellValue = cell.getStringCellValue();
//					ExcelTestData.add(cellValue);
//				}
//			}
//		}
//		workbook.close();
//		if (webSectionList.equals(ExcelTestData)) {
//			System.out.println("Both lists of web elements are the same.");
//		} else {
//			throw new Exception("Failed because List are not Matching");
//		}
	} 
	public void AddBroadcasterFPMAB() throws Exception
	{
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement AddBroadcasterFPM = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[4]"));
		AddBroadcasterFPM.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(4); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void DropBroadcasterFPMAB() throws Exception
	{
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement DropBroadcasterFPM = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[5]"));
		DropBroadcasterFPM.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(5); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void ALCFPMinAB() throws Exception
	{
		SelectChannelMasterTab.click();
		SubscriberMarketingTeam.click();
		WebElement ALCFPMin = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[6]"));
		ALCFPMin.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(6); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void OTTComboFPMAB() throws Exception
	{
		SelectChannelMasterTab.click();
		SubscriberMarketingTeam.click();
		WebElement OTTComboFPM = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[7]"));
		OTTComboFPM.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(7); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void TPCuratedFPMAB() throws Exception
	{
		SelectChannelMasterTab.click();
		SubscriberMarketingTeam.click();
		WebElement TPCuratedFPM = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[8]"));
		TPCuratedFPM.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(8); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void AddTPFPMsAB() throws Exception
	{
		SelectChannelMasterTab.click();
		EPGTeamAtributs.click();
		WebElement AddTPFPMs = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[9]"));
		AddTPFPMs.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(9); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void DropTataPlayCuratedFPMAB() throws Exception
	{
		SelectChannelMasterTab.click();
		SubscriberMarketingTeam.click();
		WebElement DropTataPlayCuratedFPM = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[10]"));
		DropTataPlayCuratedFPM.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(10); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void FTAFPMinAB() throws Exception
	{
		SelectChannelMasterTab.click();
		SubscriberMarketingTeam.click();
		WebElement FTAFPMin = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[11]"));
		FTAFPMin.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(11); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void AddFTAFPMsAB() throws Exception
	{
		SelectChannelMasterTab.click();
		SubscriberMarketingTeam.click();
		WebElement AddFTAFPMs = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[12]"));
		AddFTAFPMs.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(12); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void BouquetAB() throws Exception
	{
		SelectChannelMasterTab.click();
		EPGTeamAtributs.click();
		WebElement Bouquet = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[13]"));
		Bouquet.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(13); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void BackendPacksinAB() throws Exception
	{
		SelectChannelMasterTab.click();
		EPGTeamAtributs.click();
		WebElement BackendPacksin = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[14]"));
		BackendPacksin.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(14); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 
	public void ALCBackendPacksAB() throws Exception
	{
		SelectChannelMasterTab.click();
		EPGTeamAtributs.click();
		WebElement ALCBackendPacks = driver.findElement(By.xpath("(//p[text()='Secondary Genre']/following::div/following::button)[15]"));
		ALCBackendPacks.click();
		List<String> webSectionList = new ArrayList<>();
		WebElement Dropdown = driver.findElement(By.xpath("//Select[@class='QueryResults']"));
		List<WebElement> optionElements = Dropdown.findElements(By.xpath("//Select[@class='QueryResults']//option"));
		for (WebElement option : optionElements) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMAddButtons"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(15); // Column 1
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	} 

}
