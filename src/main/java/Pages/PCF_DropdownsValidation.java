package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.TestBase;

public class PCF_DropdownsValidation extends TestBase {
	
	//Object Repository Attributes
	@FindBy(xpath="//p[text()='Package Creation Form']") private WebElement PackageCreationTab;
	@FindBy(xpath="//p[text()='Eligibility Account Type-Sub Type']") private WebElement EligibilityAccountTypeTab;
	@FindBy(xpath="//p[text()='Charging Account Type-Sub Type']") private WebElement ChargingAccountTypeTab;
	@FindBy(xpath="//p[text()='Alerts Bills Descriptions']") private WebElement AlertsBillsDescriptionsTab;
	@FindBy(xpath="//p[text()='Business Review']") private WebElement BusinessReviewTab;
	@FindBy(xpath="//p[text()='IT Review']") private WebElement ITReviewTab;
	@FindBy(xpath="//p[text()='UAT']") private WebElement UATTab;
	@FindBy(xpath="//p[text()='Links']") private WebElement LinksTab;
	@FindBy(xpath="//p[text()='Approvals']") private WebElement ApprovalsTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	
	@FindAll({@FindBy(xpath = "//div[@aria-type='select']")})private List<WebElement> DropdownsList;
	String TestDataExcel = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\PCF_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>(); 
	
	//Constructor for element initialization
	public PCF_DropdownsValidation() {
		PageFactory.initElements(driver, this);
	}
	public void packageCreationFormDropdownList() throws Exception
	{
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
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
	public void functionDepartmentDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Function/Department']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void severityDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Severity']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void priorityDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Priority']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PackStructureDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Structure']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void TypeofPackDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Type of Pack']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void OfferTypeDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Offer Type for Services']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PackGradeTypeDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Grade Type']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void BoxCompatibilityDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Box Compatibility']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void UnitOfMeasureDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Unit Of Measure(UoM)']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PackVariationDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Variation']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PackageChargeTypeDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Package Charge Type']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void LDPCommunicationDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='LDP Communication']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PackageDashboardDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Package Dashboard Category']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void RetrofitCreditPackDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Retrofit Credit for Mega Pack']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void UnitofMeasureDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Unit of Measure (UoM) for Non-ODU Packs']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void RetrofitFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Retrofit Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void RentalFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Rental Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PayableFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Payable Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void DASLevelValidationDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='DAS Level Validation']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PDMProductLineDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='PDM_Product Line']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void ChanneltobeDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Channel to be part of FTA']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void EligibleforMultiDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Eligible for Multi TV Price Calculation']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void EligibleforMultiTVDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Eligible for Multi TV Price Calculation Exception']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PDMUoMDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='PDM UoM']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void PackTypePDMDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Type PDM']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void AllignableFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Allignable Flag (If LDP)']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void NCFdiscountApplicableDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='NCF discount Applicable']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void DiscountTypeDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Discount Type']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void EligibleforRoundDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Eligible for RoundOff Calculation']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
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
	public void IsTraiEnableFlag() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Is Trai Enable Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(30);
				
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
	public void OTTComboFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='OTT Combo Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(31);
				
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
	public void SpecialNCFFlag() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Special NCF Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(32);
				
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
	
	public void DunningExclusionDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Dunning Exclusion']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(33);
				
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
	public void ShouldthisPackDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Should this Pack be Enabled under FT Credits']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(34);
				
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
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(35);
				
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
	public void ISBingePlusFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='IS Binge Plus Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(36);
				
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
	public void ATVSourceDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='ATV Source (R-Attribute7)']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(37);
				
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
	public void FreePackFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Free Pack Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(38);
				
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
	public void SubscriptionallowedDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Subscription allowed from SC']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(39);
				
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
	public void TypeofPackDD2() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("(//div[@aria-label='Type of Pack'])[2]"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(40);
				
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
	public void DurationMonthlyDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Duration (Monthly = Regular DBR Pack ** 1 Month = For all NRC Packs)']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(41);
				
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
	public void RenewalallowedDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Renewal allowed on Selfcare']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(42);
				
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
	public void ChannelCategoryDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Channel Category for Display']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(43);
				
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
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(44);
				
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
	public void TataPlayPacksCategoryDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tata Play Packs Category for Display']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(45);
				
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
	public void SourceforOTT() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Source for OTT']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(46);
				
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
	public void WebEnabledFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Web Enabled Flag with values']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(47);
				
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
	public void AppEnabledFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='App Enabled Flag with values']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(48);
				
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
	public void SubscriptionAllowedDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Subscription allowed via SMS']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(49);
				
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
	public void SubscriptionNuanceDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Subscription allowed via Nuance']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(50);
				
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
	public void TypeofOfferDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Type of Offer']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(51);
				
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
	public void SubscriptionallowedPRMDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Subscription allowed via PRM']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(52);
				
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
	public void ToMadeAvailableDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='To be made available for dealers in mSales']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(53);
				
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
	public void TomadeavailableDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='To be made available for Dealers in M-Sales for Mod Pack']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(54);
				
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
	public void AvailableforDealersDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='To be made available for Dealers in M-Sales for Mod Pack']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(55);
				
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
	public void BoxValidationmSalesDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Box Validation on mSales']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(56);
				
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
	public void ActionDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Action']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(57);
				
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
	public void SubscriptionChangesDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Subscription changes for Missed Call']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(58);
				
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
	public void DurationVariantDD () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Duration (Variant)']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(59);
				
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
	public void PacksToExpired () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Packs to be Expired or Not']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(60);
				
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
	public void PackAdditionSPM () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Addition via SPM from SMS Source']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(61);
				
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
	public void PackAddictionSPM () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Addition via SPM from SMS Source']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(61);
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		
		if (webSectionList.equals(ExcelTestData)) {
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void AmazonPrimePideo () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Amazon prime video Integration ID (Bundle ID)']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(62);
				
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
	public void AnyBoxTypeValidation () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='#Any Box Type (Best Box) Validation for Acquisition packs']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(63);
				
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
	public void EligibleMultiTVPackAddition () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Eligible for MultiTV Pack addition']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(133);
				
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
	public void CAMPAIGN_TYPEDDList () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='CAMPAIGN_TYPE']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(134);
				
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
	public void PackageDashboardBOConfigDDList () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Package Dashboard Category for BO Config']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(135);
				
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
	public void EligibilityAccountTypeDDList() throws Exception
	{
		EligibilityAccountTypeTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(64); // Column 1
				
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
	public void DealerDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Dealer']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(65);
				
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
	public void DistributorDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Distributor']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(66);
				
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
	public void PromotionalSchoolDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Promotional School']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(67);
				
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
	public void PromotionalDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Promotional']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(89);
				
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
	public void ISPDemoDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='ISP Demo']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(68);
				
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
	public void ModernTradeDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Modern Trade']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(69);
				
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
	public void RegularDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Regular']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(70);
				
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
	public void EDIRegularDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='EDI Regular']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(71);
				
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
	public void VVIPNonPayingDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='VVIP Non-Paying']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(72);
				
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
	public void VVIPPayingDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='VVIP Paying']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(73);
				
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
	public void Employee1DD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Employee1']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(74);
				
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
	public void TataPlayEmployeeDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tata Play Employee']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(75);
				
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
	public void BulkSLDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Bulk SL']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(76);
				
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
	public void CatADD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Cat A']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(77);
				
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
	public void CatB1DD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Cat B1']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(78);
				
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
	public void CatB2DD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Cat B2']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(79);
				
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
	public void CatB3DD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Cat B3']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(80);
				
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
	public void ResidentialDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Residential']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(81);
				
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
	public void AssociateNonPayingDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Associate Non-Paying']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(82);
				
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
	public void AssociatePayingDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Associate Paying']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(83);
				
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
	public void StarGroupDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Star Group']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(84);
				
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
	public void TataGroupDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tata Group']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(85);
				
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
	public void TataPlayDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tata Play']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(86);
				
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
	public void TechnologyDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Technology']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(87);
				
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
	public void BusinessAssociatesDD1 () throws Exception
	{
		EligibilityAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Business Associates']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(88);
				
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
	public void ChargingAccountTypeDDList() throws Exception
	{
		ChargingAccountTypeTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(115); // Column 1
				
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
	public void DealerDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Dealer']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(90);
				
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
	public void DistributorDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Distributor']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(91);
				
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
	public void PromotionalSchoolDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Promotional School']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(92);
				
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
	public void PromotionalDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Promotional']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(93);
				
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
	public void ISPDemoDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='ISP Demo']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(94);
				
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
	public void ModernTradeDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Modern Trade']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(95);
				
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
	public void RegularDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Regular']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(96);
				
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
	public void EDIRegularDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='EDI Regular']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(97);
				
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
	public void VVIPNonPayingDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='VVIP Non-Paying']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(98);
				
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
	public void VVIPPayingDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='VVIP Paying']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(99);
				
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
	public void Employee1DD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Employee1']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(100);
				
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
	public void TataPlayEmployeeDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tata Play Employee']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(101);
				
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
	public void BulkSLDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Bulk SL']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(102);
				
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
	public void CatADD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Cat A']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(103);
				
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
	public void CatB1DD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Cat B1']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(104);
				
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
	public void CatB2DD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Cat B2']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(105);
				
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
	public void CatB3DD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Cat B3']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(106);
				
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
	public void ResidentialDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Residential']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(107);
				
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
	public void AssociateNonPayingDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Associate Non-Paying']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(108);
				
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
	public void AssociatePayingDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Associate Paying']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(109);
				
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
	public void StarGroupDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Star Group']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(110);
				
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
	public void TataGroupDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tata Group']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(111);
				
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
	public void TataPlayDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tata Play']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(112);
				
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
	public void TechnologyDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Technology']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(113);
				
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
	public void BusinessAssociatesDD2 () throws Exception
	{
		ChargingAccountTypeTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Business Associates']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(114);
				
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
	public void AlertsBillsDescriptionsDDList() throws Exception
	{
		AlertsBillsDescriptionsTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(116); // Column 1
				
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
	public void BusinessReviewTabDDList() throws Exception
	{
		BusinessReviewTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(117); // Column 1
				
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
	public void GTMReviewDD () throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='GTM Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(118);
				
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
	public void CustomerOperationsReviewDD () throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Customer Operations Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(119);
				
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
	public void RAReviewDD () throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='RA Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(120);
				
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
	public void FieldServicesReviewDD () throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Field Services Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(121);
				
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
	public void FinanceReviewDD () throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Finance Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(122);
				
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
	public void SalesReviewDD () throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Sales Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(123);
				
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
	public void EPGReviewDD () throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='EPG Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(124);
				
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
	public void ITReviewTabDDList() throws Exception
	{
		ITReviewTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(125); // Column 1
				
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
	public void OfferFlagDD () throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Offer Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(126);
				
				if (cell != null) {
					String cellValue = cell.getStringCellValue();
					ExcelTestData.add(cellValue);
				}
			}
		}
		workbook.close();
		System.out.println("e"+ExcelTestData);
		System.out.println("w"+webSectionList);
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void FoundInDD () throws Exception
	{
		ITReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Found In']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(127);
				
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
	public void ReleaseDependencyDD () throws Exception
	{
		ITReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Release Dependency']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation");
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(128);
				
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
	public void UATDDList() throws Exception
	{
		UATTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(129); // Column 1
				
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
	public void LinksDDList() throws Exception
	{
		LinksTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(130); // Column 1
				
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
	public void ApprovalsDDList() throws Exception
	{
		ApprovalsTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(131); // Column 1
				
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
	public void ChangeHistoryTabDDList() throws Exception
	{
		ChangeHistoryTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("DropdownValidation"); 
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(132); // Column 1
				
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
