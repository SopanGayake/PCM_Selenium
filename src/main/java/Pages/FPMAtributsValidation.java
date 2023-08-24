package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For .xlsx files
import org.apache.poi.ss.usermodel.*;

import BasePackage.TestBase;


public class FPMAtributsValidation extends TestBase{
	 
	//Object Repository Attributes
	@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
	@FindBy(xpath="//span[text()='FPM']") private WebElement SelectFPMWI;
	@FindBy(xpath="//p[text()='Frontend Pack Master']") private WebElement SelectfrontendPackMasterTab;
	@FindBy(xpath="//p[text()='Pack Master Details ']") private WebElement PackMasterDetailsSection;
	@FindBy(xpath="//p[text()='Pack Available for ']") private WebElement PackAvailableforSection;
	@FindBy(xpath="//p[text()='CA ID Details ']") private WebElement CAIDDetails;
	@FindBy(xpath="//p[text()='Compatible Packs to be expired with the launch of new pack ']") private WebElement CompatiblePacksSection;
	@FindBy(xpath="//p[text()='Additional Business Rules ']") private WebElement AdditionalBusinessRulesSection;
	@FindBy(xpath="//p[text()='Comments ']") private WebElement CommentsSection;
	@FindBy(xpath="//p[text()='Channel details']") private WebElement ChanneldetailsTab;
	@FindBy(xpath="//p[text()='Channel add/drop ']") private WebElement ChannelAddropSection;
	@FindBy(xpath="//p[text()='Backend Pack Mapping']") private WebElement BackendPackMappingTab;
	@FindBy(xpath="//p[text()='UNKNOWN 1 ']") private WebElement BackendPackMappingSection;
	@FindBy(xpath="//p[text()='Approval']") private WebElement ApprovalTab;
	@FindBy(xpath="//p[text()='Approvals ']") private WebElement ApprovalsSection;
	
	
		String TestDataExcelFPM = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFileFPM.xlsx";
		//Constructor for element initialization
		public FPMAtributsValidation() {
			PageFactory.initElements(driver, this);
		}

		public void allPackMasterDetailsSection() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
					
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Frontend Pack Master");
		
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
		public void allPackAvailableforSection() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackAvailableforSection.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
					
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Pack Available for");
		
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
		public void allCAIDDetails() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			CAIDDetails.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
					
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("CA ID Details");
		
			for (Row row : sheet) {
				Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
				excelSectionList.add(cell.getStringCellValue());
				
			}
			workbook.close();
			excelFile.close();
			
			if (webSectionList.equals(excelSectionList)) {
		        System.out.println("Both lists of web elements are the same.");
		    } else {
    			throw new Exception("Faild because List are not mtching");
	 		}
		}
		public void allCompatiblePacksSection() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			CompatiblePacksSection.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
					
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Compatible Packs");
		
			for (Row row : sheet) {
				Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
				excelSectionList.add(cell.getStringCellValue());
				
			}
			workbook.close();
			excelFile.close();
			
			if (webSectionList.equals(excelSectionList)) {
		        System.out.println("Both lists of web elements are the same.");
		    } else {
    			throw new Exception("Faild because List are not mtching");
	 		}
		}
		public void allAdditionalBusinessRulesSection() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			AdditionalBusinessRulesSection.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
					
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Additional Business Rules");
		
			for (Row row : sheet) {
				Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
				excelSectionList.add(cell.getStringCellValue());
				
			}
			workbook.close();
			excelFile.close();
			
			if (webSectionList.equals(excelSectionList)) {
		        System.out.println("Both lists of web elements are the same.");
		    } else {
    			throw new Exception("Faild because List are not mtching");
	 		}
		}
		public void allCommentsSection() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			CommentsSection.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
					
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Comments");
		
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
		public void allChannelAddrop() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			ChanneldetailsTab.click();
			ChannelAddropSection.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
					
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Channels Add Drop");
		
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
		public void allBackendPackMappingSection() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			BackendPackMappingTab.click();
			BackendPackMappingSection.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Backend Pack Mapping");
		
			for (Row row : sheet) {
				Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
				excelSectionList.add(cell.getStringCellValue());

			}
			workbook.close();
			excelFile.close();
			
			if (webSectionList.equals(excelSectionList)) {
		        System.out.println("Both lists of web elements are the same");
		    } else {
		    	throw new Exception("Failed because List are not matching");
	 		}
		}
		public void allApprovalsSection() throws Exception
		{
			openDrawerMenu.click();
			SelectFPMWI.click();
			ApprovalTab.click();
			ApprovalsSection.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
			for (WebElement element : elements)
			{
				if( element.getText() != "") {
					webSectionList.add(element.getText());
				}
			} 			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Approvals");
		
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
