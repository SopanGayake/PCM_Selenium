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
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.TestBase;

public class BPM_DropdownsValidation extends TestBase{
	@FindBy(xpath="//p[text()='Backend Pack Master']") private WebElement BackendPackMasterTab;
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChannelDetailsTab;
	@FindBy(xpath="//p[text()='Frontend Pack Mapping']") private WebElement FrontendPackMappingTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
		
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//div[@aria-type='select']")})private List<WebElement> DropdownsList;
	String BPMExcelTestData = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\BPM_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>();
	
	//Constructor for element initialization
	public BPM_DropdownsValidation() {
		PageFactory.initElements(driver, this);
	}
	public void BackendMasterDropdownList() throws Exception
	{
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		}
		FileInputStream excelFile = new FileInputStream(BPMExcelTestData);
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
	
	public void AllowExpiredPackDD() throws Exception
	{

		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Allow Expired Pack CA ID']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		
		FileInputStream excelFile = new FileInputStream(BPMExcelTestData);
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
	public void TypeofPackDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Type of Pack']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(BPMExcelTestData);
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
	public void PackGenreDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Genre']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(BPMExcelTestData);
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
	public void PackStatusDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Pack Status ']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(BPMExcelTestData);
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
	public void ChannelDetailsDropdownList() throws Exception
	{
		ChannelDetailsTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		
		FileInputStream excelFile = new FileInputStream(BPMExcelTestData);
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
	public void FrontendPackDropdownList() throws Exception
	{
		FrontendPackMappingTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(BPMExcelTestData);
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
	public void ChangeHistoryDDList() throws Exception
	{
		ChangeHistoryTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		
		FileInputStream excelFile = new FileInputStream(BPMExcelTestData);
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
	
}