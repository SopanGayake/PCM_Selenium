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

public class PCFAttributesValidation extends TestBase {
	@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
	@FindBy(xpath="//span[text()='PCF']") private WebElement SelectPCFWI;
	@FindBy(xpath="//p[text()='PACKAGE CREATION FORM']") private WebElement SelectPACKAGECREATIONFORMTab;
	@FindBy(xpath="//p[text()='Requester Details ']") private WebElement RequesterDetailsSection;
	@FindBy(xpath="//p[text()='Package Details ']") private WebElement PackageDetailsSection;
	@FindBy(xpath="//p[text()='Charging ']") private WebElement ChargingSection;
	@FindBy(xpath="//p[text()='Charging-Additional Details ']") private WebElement ChargingAdditionalDetailsSection;
	@FindBy(xpath="//p[text()='Binge CCF ']") private WebElement BingeCCFSection;
	@FindBy(xpath="//p[text()='CA Related Configurations ']") private WebElement CARelatedConfigurationsSection;
	@FindBy(xpath="//p[text()='Siebel - Compatibility/Restrictions ']") private WebElement SiebelCompatibilityRestrictionsSection;
	@FindBy(xpath="//p[text()='Additional Business Rules ']") private WebElement AdditionalBusinessRules;
	@FindBy(xpath="//p[text()='Self-Care Configurations ']") private WebElement SelfCareConfigurationsSection;
	@FindBy(xpath="//p[text()='SMS Configurations ']") private WebElement SMSConfigurationsSection;
	@FindBy(xpath="//p[text()='Nuance Configurations ']") private WebElement NuanceConfigurationsSection;
	@FindBy(xpath="//p[text()='PRM Sales Configurations ']") private WebElement PRMSalesConfigurationsSection;
	@FindBy(xpath="//p[text()='Msales  ']") private WebElement MsalesSection;
	@FindBy(xpath="//p[text()='Missed Call Configurations ']") private WebElement MissedCallConfigurationsSection;
	@FindBy(xpath="//p[text()='BI Related Configurations ']") private WebElement BIRelatedConfigurationsSection;
	@FindBy(xpath="//p[text()='Compatible Packs to be expired with the launch of new pack ']") private WebElement CompatiblePackstobeexpired;
	@FindBy(xpath="//p[text()='Charging-Applicable for NRC Packs ']") private WebElement ChargingApplicableforNRCPacks;
	@FindBy(xpath="//p[text()='Charging-Applicable for RC Packs ']") private WebElement ChargingApplicableforRCPacks;
	@FindBy(xpath="//p[text()='Missed Call to SPM Campaign Configuration ']") private WebElement MissedCalltoSPMCampaignConfiguration;
	
	String TestDataExcel = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFilePCF.xlsx";
	public PCFAttributesValidation() {
		PageFactory.initElements(driver, this);
	}
	
	public void allPCFRequesterDetailsAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		RequesterDetailsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
			}
		} 
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Requester Details");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	public void allPackageDetailsSectionAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		PackageDetailsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Package Details");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	public void AllChargingSectionAtributs() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		ChargingSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingSection");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        }else {
			throw new Exception("Failed because List are not matching");
        }
	}

		public void AllChargingAdditionalDetailsSection() throws Exception {
			openDrawerMenu.click();
			SelectPCFWI.click();
			SelectPACKAGECREATIONFORMTab.click();
			Thread.sleep(2000);
			ChargingAdditionalDetailsSection.click();
	
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements) {
				
				if( element.getText() != "") {
					webSectionList.add(element.getText());
				}
			}
	
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcel);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("ChargingAdditionalDetailsSectio");
	
			for (Row row : sheet) {
				Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
				excelSectionList.add(cell.getStringCellValue());
			}
			workbook.close();
			excelFile.close();
	
			if (webSectionList.equals(excelSectionList)) {
				System.out.println("Both lists of web elements are the same.");
			} else {
				throw new Exception("Failed because List are not matching");
	        }
		}
	public void allBingeCCFSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		BingeCCFSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
				
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Binge CCF");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());

		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void allCARelatedConfigurationsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		CARelatedConfigurationsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CA Related Configurations");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void allSiebelCompatibilityRestrictionsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		SiebelCompatibilityRestrictionsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SiebelCompatibilityRestrictions");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	public void allAdditionalBusinessRules() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		AdditionalBusinessRules.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AdditionalBusinessRules");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
			
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	public void allSelfCareConfigurationsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		SelfCareConfigurationsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SelfCareConfigurationsSection");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void allSMSConfigurationsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		SMSConfigurationsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SMSConfigurationsSection");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void allNuanceConfigurationsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		NuanceConfigurationsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Nuance Configurations");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void PRMSalesConfigurationsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		PRMSalesConfigurationsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PRMSalesConfigurationsSection");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	public void allMsalesSectionAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		MsalesSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("MsalesSection");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	public void allMissedCallConfigurationsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		MissedCallConfigurationsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Missed Call Configurations");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}

	public void allBIRelatedConfigurationsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		BIRelatedConfigurationsSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("BI Related Configurations");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void allCompatiblePackstobeexpired() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		CompatiblePackstobeexpired.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CompatiblePackstobeexpired");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void allChargingApplicableforNRCPacks() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		ChargingApplicableforNRCPacks.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingApplicableforNRCPacks");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void allChargingApplicableforRCPacks() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		ChargingApplicableforRCPacks.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingApplicableforRCPacks");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
	
	public void allMissedCalltoSPMCampaignConfiguration() throws Exception
	{
		openDrawerMenu.click();
		SelectPCFWI.click();
		SelectPACKAGECREATIONFORMTab.click();
		Thread.sleep(2000);
		MissedCalltoSPMCampaignConfiguration.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Missed Call to SPM Campaign");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } else {
			throw new Exception("Failed because List are not matching");
        }
	}
}