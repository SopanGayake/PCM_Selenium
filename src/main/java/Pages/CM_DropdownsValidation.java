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

public class CM_DropdownsValidation extends TestBase{
	@FindBy(xpath="//p[text()='Channel Master']") private WebElement ChannelMasterTab;
	@FindBy(xpath="//p[text()='Logos Platform']") private WebElement LogosPlatformTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	
	@FindAll({@FindBy(xpath = "//div[@aria-type='select']")})private List<WebElement> DropdownsList;
	String CMExcelTestData = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\CM_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	//Constructor for element initialization
	public CM_DropdownsValidation() {
		PageFactory.initElements(driver, this);
	}
	public void ChannelMasterDropdownList() throws Exception
	{
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void NameOfBroadcasterDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Name Of Broadcaster']"));
		element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiAutocomplete-listbox li")));
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		System.out.println(option.getText());
		webSectionList.add(option.getText());
		}		
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void PrimaryGenreDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Primary Genre']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void TypeofChannelDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='SD/ HD/4K']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void SDMappingYesNoDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='SD Mapping: Yes/No']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void RentalFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Rental Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void PayableFlagDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Payable Flag']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void TypePlayServicesDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Type Of Tata Play Services']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void ReaddchannelDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Re-add Channel']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void ChannelStatusDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Channel Status']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void ChannelModelDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Channel Type']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void PackagingGenreDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Packaging Genre']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void RecommendedGenreDD() throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Recommended Genre']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void EncryptedDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Encrypted']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void ServiceTypeDD() throws Exception
	{
		
		WebElement element = driver.findElement(By.xpath("//div[@aria-label='Service Type']"));
		element.click();
		List<WebElement> optionElements = driver.findElements(By.cssSelector(".MuiAutocomplete-listbox li"));
		for (WebElement option : optionElements) {
		webSectionList.add(option.getText());
		}
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void LogosPlatformTabDropdownList() throws Exception
	{
		LogosPlatformTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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
	public void ChangeHistoryTabDropdownList() throws Exception
	{
		ChangeHistoryTab.click();
		for (WebElement element : DropdownsList)
		{
			webSectionList.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		} 
		FileInputStream excelFile = new FileInputStream(CMExcelTestData);
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

}