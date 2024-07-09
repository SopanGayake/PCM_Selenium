package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.stream.Collectors;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import BasePackage.TestBase;

public class FPM_DropdownsValidation extends TestBase{
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChannelDetailsTab;
	@FindBy(xpath="//p[text()='Backend Pack Mapping']") private WebElement BackendPackMappingTab;
	@FindBy(xpath="//p[text()='Links']") private WebElement LinksTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	
	@FindAll({@FindBy(xpath = "//div[@aria-type='select']")})private List<WebElement> DropdownsList;
	String FPMExcelTestData = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\FPM_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

	
	//Constructor for element initialization
	public FPM_DropdownsValidation() {
		PageFactory.initElements(driver, this);
	}
	public void FrontendPackMasterDropdownList() throws Exception
	{
		for (WebElement element : DropdownsList) 
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(0);
				
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
	public void TypeofPackDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Type of Pack']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(1);
				
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
	public void NameofBroadcasterDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Name of Broadcaster']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(2);
				
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
	public void PackageDashboardDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Package Dashboard Category for services']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(3);
				
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
	public void OfferTypeServicesDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Offer Type for Services']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(4);
				
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
	public void PackGradeTypeDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Grade Type']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(5);
				
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
	public void PackStatusDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Status ']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(6);
				
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
	public void UnitofMeasureDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Unit of Measure (UoM)']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(7);
				
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
	public void SDHDDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='SD/HD']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(8);
				
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
	public void BroadcasterCategoryDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Broadcaster Category for Display']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(9);
				
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
	public void TataPlayPacks() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tata Play Packs Category for Display']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(10);
				
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
	public void ChannelCategoryDisplayDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Channel Category for Display']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(11);
				
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
	public void DASLevelValidation() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='DAS Level Validation']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(12);
				
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
	public void AnyBoxTypeDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Any Box Type (Primary/Best Box) Validation']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(13);
				
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
	public void UnitOfMeasure2DD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Unit of Measure (UoM) for Non-ODU Packs']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(14);
				
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
	public void RentalFlagDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Rental Flag']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(15);
				
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
	public void PayableFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Payable Flag']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(16);
				
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
	public void IsTraiEnableDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Is Trai Enable Flag']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(17);
				
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
	public void ToMadeinMSalesDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='To be made available for Dealers in mSales']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(18);
				
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
	public void SubscriberTypeDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Subscriber Type (New/Existing)']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(19);
				
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
	public void PackVariationDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Variation']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(20);
				
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
	public void ChannelofFTADD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Channel to be part of FTA']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(21);
				
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
	public void ChannelDetailsDropdownList() throws Exception
	{
		ChannelDetailsTab.click();
		for (WebElement element : DropdownsList) 
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(22);
				
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
	public void BackendPackMappingTabDropdownList() throws Exception
	{
		BackendPackMappingTab.click();
		for (WebElement element : DropdownsList) 
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(23);
				
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
	public void SinglePackDD() throws Exception
	{
		BackendPackMappingTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Single Pack/Combo Pack']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(24);
				
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
	public void LinksTabDropdownList() throws Exception
	{
		LinksTab.click();
		for (WebElement element : DropdownsList) 
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(25);
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		System.out.println("e"+ExcelTestData);
		System.out.println("w"+webSectionList);
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void ChangeHistoryTabDropdownList() throws Exception
	{
		ChangeHistoryTab.click();
		for (WebElement element : DropdownsList) 
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(26);
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		System.out.println("e"+ExcelTestData);
		System.out.println("w"+webSectionList);
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void PDMProductLineDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='PDM_Product Line']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(27);
				
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
	public void AnyBoxTypeValidationDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='#Any Box Type (Best Box) Validation for Acquisition packs']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(28);
				
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
	public void AmazonPrimeVideoDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Amazon prime video Integration ID (Bundle ID)']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}	
		FileInputStream excelFile = new FileInputStream(FPMExcelTestData);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(29);
				
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