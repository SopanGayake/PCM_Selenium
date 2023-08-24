package Pages;

import java.io.FileInputStream;
import java.io.IOException;
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
import org.openqa.selenium.support.ui.Select;

import BasePackage.TestBase;

public class PCF_DropdownsValidation extends TestBase {
	
	//Object Repository Attributes
	@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
	@FindBy(xpath="//span[text()='PCF']") private WebElement SelectPCFWI;
	@FindBy(xpath="//p[text()='PACKAGE CREATION FORM']") private WebElement PACKAGECREATIONFORMTab;
	@FindBy(xpath="//p[text()='Requester Details ']") private WebElement RequesterDetailsSection;
	@FindBy(xpath="//p[text()='Package Details ']") private WebElement PackageDetailsSection;
	@FindBy(xpath="//p[text()='Charging ']") private WebElement ChargingSection;
	@FindBy(xpath="//p[text()='Charging-Additional Details ']") private WebElement ChargingAdditionalDetailsSection;
	@FindBy(xpath="//p[text()='Siebel - Compatibility/Restrictions ']") private WebElement SiebelCompatibilityRestrictionsSection;
	@FindBy(xpath="//p[text()='Self-Care Configurations ']") private WebElement SelfCareConfigurationsSection;
	@FindBy(xpath="//p[text()='SMS Configurations ']") private WebElement SMSConfigurationsSection;
	@FindBy(xpath="//p[text()='Nuance Configurations ']") private WebElement NuanceConfigurationsSection;
	@FindBy(xpath="//p[text()='PRM Sales Configurations ']") private WebElement PRMSalesConfigurationsSection;
	@FindBy(xpath="//p[text()='Msales  ']") private WebElement MsalesSection;
	@FindBy(xpath="//p[text()='BI Related Configurations ']") private WebElement BIRelatedConfigurationsSection;
	@FindBy(xpath="//p[text()='Compatible Packs to be expired with the launch of new pack ']") private WebElement CompatiblePackstobeexpiredwithlaunch;
	@FindBy(xpath="//p[text()='Missed Call to SPM Campaign Configuration ']") private WebElement MissedCallSPMCampaignConfiguration;
	
String TestDataExcel = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFilePCF.xlsx";
	
	//Constructor for element initialization
	public PCF_DropdownsValidation() {
		PageFactory.initElements(driver, this);
	}
	public void GetID() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		RequesterDetailsSection.click();
        List<WebElement> elements = driver.findElements(By.xpath("//select[@class='form-control form-control-style']"));
        List<String> webSectionList = new ArrayList<>();
        for (WebElement element : elements) {
//          String elementId = element.getAttribute("id");
        	webSectionList.add(element.getAttribute("id"));
        	System.out.println(element.getAttribute("id"));
        }
    	ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void FunctionDepartmentDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		RequesterDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Function/Department']"));
		Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();
        List<String> webSectionList = new ArrayList<>();
        for (WebElement option : options) {
        	if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
        }
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
			    for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			        Row row = sheet.getRow(rowNum);
			        if (row != null) {
			            Cell cell = row.getCell(1); // Column 1

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
	public void SeverityDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		RequesterDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Severity']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(2); // Column 1
				
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
	public void PriorityDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		RequesterDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Priority']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(3); // Column 1
				
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
	public void PackStructureDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Structure']"));
		Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();
        List<String> webSectionList = new ArrayList<>();
        for (WebElement option : options) {
        	if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
        }
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void TypeOfPackDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Type Of Pack']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void OfferTypeforServicesDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Offer Type for Services']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void PackGradeTypeDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Grade Type']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void BoxCompatibilityDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Box Compatibility']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void UnitOfMeasureUoMDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Unit Of Measure(UoM)']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void PackVariationDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Variation']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void PackageChargeTypeDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Package Charge Type']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void LDPCommunicationDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='LDP Communication']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void PackageDashboardCategoryDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Package Dashboard Category']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void RetrofitCreditforMegaPackDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Retrofit Credit for Mega Pack']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void UnitofMeasureUoMforNonODUPacksDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Unit of Measure (UoM) for Non-ODU Packs']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
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
	public void RetrofitFlagDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Retrofit Flag']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(16); // Column 1
				
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
	public void RENTAL_FLAG_DD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='RENTAL_FLAG']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(17); // Column 1
				
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
	public void PAYABLE_FLAG_DD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='PAYABLE_FLAG']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(18); // Column 1
				
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
	public void DASLevelValidation() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='DAS Level Validation']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(19); // Column 1
				
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
	public void PDM_ProductLineDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PackageDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='PDM_Product Line']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(20); // Column 1
				
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
	public void EligibleforMultiTVPriceCalculationDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Eligible for MultiTV Price Calculation']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(21); // Column 1
				
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
	public void EligibleforMultiTVPriceCalculationExceptionDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Eligible for MultiTV Price Calculation Exception']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(22); // Column 1
				
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
	public void PDMUoMDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='PDM UoM']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(23); // Column 1
				
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
	public void PackType_PDMDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Type_PDM']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(24); // Column 1
				
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
	public void AllignableFlagIfDPDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Allignable Flag (If LDP)']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(25); // Column 1
				
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
	public void NCFdiscountApplicableDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='NCF discount Applicable']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(26); // Column 1
				
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
	public void DiscountTypeDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Discount Type']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(27); // Column 1
				
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
	public void EligibleforRoundOffCalculationDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Eligible for RoundOff Calculation']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(28); // Column 1
				
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
	public void IS_Trai_Enable_flagDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='IS_Trai_Enable_flag']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(29); // Column 1
				
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
	public void OTTComboFlagDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='OTT Combo Flag']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(30); // Column 1
				
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
	public void SpecialNCFFlagDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Special NCF Flag']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(31); // Column 1
				
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
	public void DunningExclusionDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Dunning Exclusion']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(32); // Column 1
				
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
	public void ShouldthispackbeenabledunderFTCreditsDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		ChargingAdditionalDetailsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Should this pack be enabled under FT Credits']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(33); // Column 1
				
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
	public void SubscriberTypeNewExistingDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SiebelCompatibilityRestrictionsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Subscriber Type(New/Existing)']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(34); // Column 1
				
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
	public void IS_Binge_Plus_flagDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SiebelCompatibilityRestrictionsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='IS_Binge_Plus_flag']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(35); // Column 1
				
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
	public void ATVSourceRAttribute7DD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SiebelCompatibilityRestrictionsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='ATV Source(R-Attribute7)']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(36); // Column 1
				
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
	public void FreepackFlagDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SiebelCompatibilityRestrictionsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Free pack Flag']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(37); // Column 1
				
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
	public void SubscriptionallowedfromSCDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Subscription allowed from SC']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(38); // Column 1
				
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
	public void TypeOfPackDD2() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("(//select[@name='Type Of Pack'])[2]"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(39); // Column 1
				
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
	public void DurationMonthlyNRCpacksDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Duration (Monthly = Regular DBR pack ** 1 Month = For all NRC packs)']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(40); // Column 1
				
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
	public void RenewalallowedonSelfCareDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Renewal allowed on SelfCare']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(41); // Column 1
				
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
	public void ChannelCategoryforDisplayDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Channel Category for Display']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(42); // Column 1
				
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
	public void BroadcasterCategoryforDisplaysDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Broadcaster Category for Displays']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(43); // Column 1
				
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
	public void TataPlayPacksCategoryforDisplaysDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='TataPlay Packs Category for Displays']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(44); // Column 1
				
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
	public void sourceforOTTDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='source for OTT']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(45); // Column 1
				
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
	public void WebenabledFlagwithvaluesDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Web enabled Flag with values']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(46); // Column 1
				
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
	public void AppenabledFlagwithvaluesDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SelfCareConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='App enabled Flag with values']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(47); // Column 1
				
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
	public void SubscriptionallowdviaSMSDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SMSConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Subscription allowd via SMS']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(48); // Column 1
				
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
	public void ProvisioningBasedOnChannelPackDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		SMSConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Provisioning Based On Channel Pack']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
				
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(49); // Column 1
				
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
	public void SubscriptionallowedviaNuanceDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		NuanceConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Subscription allowed via Nuance']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(50); // Column 1
				
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
	public void TypeofOfferDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		NuanceConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Type of Offer']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(51); // Column 1
				
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
	public void SubscriptionallowdviaPRMDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		PRMSalesConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Subscription allowd via PRM']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(52); // Column 1
				
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
	public void TobemadeavailablefordealersinmSalesDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		MsalesSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='To be made available for dealers in mSales']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(53); // Column 1
				
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
	public void PackdropthroughMsalesDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		MsalesSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack drop through Msales']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(54); // Column 1
				
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
	public void TobemadeavailableforDealersinMSalesforModPackDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		MsalesSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='To be made available for Dealers in M-Sales for Mod Pack']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(55); // Column 1
				
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
	public void BoxvalidationonMsalesDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		MsalesSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Box validation on Msales']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(56); // Column 1
				
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
	public void ActionDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		MsalesSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Action']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(57); // Column 1
				
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
	public void DurationVariantDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		BIRelatedConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Duration(Variant)']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(58); // Column 1
				
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
	public void PackageDashboardCategoryforBOConfigDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		BIRelatedConfigurationsSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Package Dashboard Category for BO Config']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(59); // Column 1
				
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
	public void PackstobeexpiredornotDD() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		CompatiblePackstobeexpiredwithlaunch.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Packs to be expired or not']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(60); // Column 1
				
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
	public void PackAdditionviaSPMfromSMSSource() throws Exception {
		openDrawerMenu.click();
		SelectPCFWI.click();
		PACKAGECREATIONFORMTab.click();
		MissedCallSPMCampaignConfiguration.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Addition via SPM from SMS Source']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> webSectionList = new ArrayList<>();
		for (WebElement option : options) {
			if( option.getText() != "" && option.getText() != " ") {
				webSectionList.add(option.getText());
				System.out.println(option.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("All Dropdowns61"); // Assuming you want to read data from sheet 2
		for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			Row row = sheet.getRow(rowNum);
			if (row != null) {
				Cell cell = row.getCell(61); // Column 1
				
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
