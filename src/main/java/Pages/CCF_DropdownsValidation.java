package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.stream.Collectors;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import BasePackage.TestBase;

public class CCF_DropdownsValidation extends TestBase{
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChannelDetailsTab;
	@FindBy(xpath="//p[text()='Additional Business Rules']") private WebElement AdditionalBusinessRulesTab;
	@FindBy(xpath="//p[text()='Work Order Consumption Application']") private WebElement WorkOrderApplicationTab;
	@FindBy(xpath="//p[text()='IT Review']") private WebElement ITReviewTab;
	@FindBy(xpath="//p[text()='UAT']") private WebElement UATTab;
	@FindBy(xpath="//p[text()='Links']") private WebElement LinksTab;
	@FindBy(xpath="//p[text()='Approvals']") private WebElement ApprovalTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	@FindBy(xpath="//p[text()='Business Review']") private WebElement BusinessReviewTab;
		
	@FindAll({@FindBy(xpath = "//div[@aria-type='select']")})private List<WebElement> DropdownsList;
	String FPMExcelTestData = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\CFF_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>();
	
	//Constructor for element initialization
	public CCF_DropdownsValidation() {
		PageFactory.initElements(driver, this);
	}
	public void ChargeCreationFormDropdownList() throws Exception
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
	
	public void FunctionDepartmentDD() throws Exception
	{

		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Function/Department']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void MaterialCategoryDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Material Category']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void InventoryFlagDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Inventory Flag (To be enabled in PRM)']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void OrderableFlagDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Orderable Flag (Product available for indenting)']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void MaterialToMaterial() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Material to Material Transfer Applicable']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void AdditionalBusinessRulesDDList() throws Exception
	{
		AdditionalBusinessRulesTab.click();
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
	public void WorkOrderApplicationDDList() throws Exception
	{
		WorkOrderApplicationTab.click();
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
	public void ITReviewDDList() throws Exception
	{
		ITReviewTab.click();
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
	
	public void PlannedForDD() throws Exception
	{
		ITReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Planned For']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void FoundInDD() throws Exception
	{
		ITReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Found In']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void ReleaseDependencyDD() throws Exception
	{
		ITReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Release Dependency']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	
	public void UATTabDDList() throws Exception
	{
		UATTab.click();
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
	public void LinksTabDDList() throws Exception
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
	public void ApprovalDDList() throws Exception
	{
		ApprovalTab.click();
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
	public void ChangeHistoryTabDDList() throws Exception
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
	public void BusinessReviewTabDDList() throws Exception
	{
		BusinessReviewTab.click();
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
	public void MarketingReviewDD() throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Marketing Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void FinanceReviewDD() throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Finance Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void SalesReviewDD() throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Sales Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void RAReviewDD() throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='RA Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void FieldServicesReview() throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Field Services Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
	public void CustomerReviewDD() throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Customer Operations Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
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
	public void TechReviewDD() throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Tech Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
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
	public void ITReviewDD() throws Exception
	{
		BusinessReviewTab.click();
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='IT Review']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
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
}