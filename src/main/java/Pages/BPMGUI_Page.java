package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For .xlsx files
import org.apache.poi.ss.usermodel.*;

import BasePackage.TestBase;


public class BPMGUI_Page extends TestBase{
	
	//Object Repository GUI
	@FindBy(xpath="//div[@class='col-sm-3']/h2") private WebElement PageHeading;
	@FindBy(xpath="//div[@class='mb-2 p-0 col-sm-5']") private WebElement WorkItemID;
	@FindBy(xpath="//label[text()='Title']/parent::div/..") private WebElement TitleTextBox;
	@FindBy(xpath="//label[text()='Status']/parent::div/..") private WebElement StatusDropdown;
	@FindBy(xpath="//button [text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//label[text()='Created By']/parent::div/..") private WebElement CreatedByLink;
	@FindBy(xpath="//label[text()='Old PCF Reference WI ID']/parent::div/..") private WebElement OldPCFReferenceWIID;
	@FindBy(xpath="//label[text()='Creation Date']/parent::div/..") private WebElement CreationDate;
	@FindBy(xpath="//label[text()='Last Modified Date']/parent::div/..") private WebElement LastModifiedDate;
	@FindBy(xpath="//button [text()='Cancel']") private WebElement CancelButtone;
	@FindBy(xpath="//button[@id='Frontend Pack Master']") private WebElement FrontendPackMasterTab;
	@FindBy(xpath="//button [text()='Pack Master Details']") private WebElement FrontendPackMasterDetailsSection;
	
		
		//Constructor for element initialization
		public BPMGUI_Page() {
			PageFactory.initElements(driver, this);
		}

		public void verifyTitle() {
			System.out.println(driver.getTitle());
		}
		
		public void verifyPageHeader() {
			System.out.println(PageHeading.getText());
			System.out.println(PageHeading.getTagName());
			System.out.println(PageHeading.getSize());
		}
		public void verifyWorkItemID() {
			System.out.println(WorkItemID.getText());
		}
		public void verifyTitleTextBox() {
			System.out.println(TitleTextBox.getText());
		}
		public void verifyStatusDropdown() {
			System.out.println(StatusDropdown.getText());
		} 
		public void verifySaveButton() {
			System.out.println(SaveButton.getSize());
		} 
		public void verifyCreatedByLink() {
			System.out.println(CreatedByLink.getText());
		} 
		public void verifyOldPCFReferenceWIID() {
			System.out.println(OldPCFReferenceWIID.getText());
		} 
		public void verifyCreationDate() {
			System.out.println(CreationDate.getText());
		} 
		public void verifyLastModifiedDate() {
			System.out.println(LastModifiedDate.getText());
		}
		public void verifyCancelButtone() {
			System.out.println(CancelButtone.getSize());
		}
		public void verifyFPMDetails1() {
			
		}
		
		//List of Tabs
		public void verifygetAllDetailsButton()
		{
			List<WebElement> elements = driver.findElements(By.xpath("//button[@class='btn btn-light w-100']"));
			for (WebElement element : elements)
			{
	            System.out.println(element.getText());
			} 
		}
		//List of Label
		public void VerifyAllLabel()
		{
			List<WebElement> elements = driver.findElements(By.xpath("//label[@style='font-weight: bold;']"));
			for (WebElement element : elements)
			{
	            System.out.println(element.getText());
			} 
		}
		
		public void verifygetAlllabelsValue()
		{
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='col-sm-5']"));
			for (WebElement element : elements)
			{
	            System.out.println(element.getText());
			} 
		}
		
		//List of all Tab in FPM
		public void verifyAllTabs()
		{
			List<WebElement> elements = driver.findElements(By.xpath("//button[@class='tataB ClorWhite btn btn-light w-100 brdrR0']"));
			for (WebElement element : elements)
			{
	            System.out.println(element.getText());
			} 
		}
		public void verifyAllSections()
		{
			FrontendPackMasterTab.click();
			List<WebElement> elements = driver.findElements(By.xpath("//button[@class='tataB ClorWhite text-left brdrR0 btn btn-light btn-sectionborder w-100']"));
			for (WebElement element : elements)
			{
	            System.out.println(element.getText());
			} 
		}
		public void allAtributes()
		{
			FrontendPackMasterTab.click();
			FrontendPackMasterDetailsSection.click();
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='col-5']"));
			for (WebElement element : elements)
			{
	            System.out.println(element.getText());
			} 
		}
		public void verifyAllAtributesAndValues()
		{
			FrontendPackMasterTab.click();
			FrontendPackMasterDetailsSection.click();
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='col-6']"));
			for (WebElement element : elements)
			{
	            System.out.println(element.getText());
			} 
		}
			//Step 1: going to the attribute location 
		public void pageAtributesList() throws Exception {
			FrontendPackMasterTab.click();
			FrontendPackMasterDetailsSection.click();
			
			//Step 2: first list of web elements
			List<String> webPageAttributesList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='col-5']"));
			for (WebElement element : elements) {
			webPageAttributesList.add(element.getText());
			}
			
			// Step 3: Read the list of attributes from Excel
			List<String> excelAttributesList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream("C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFile1.xlsx");
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Sheet2");

			for (Row row : sheet) {
				Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
				excelAttributesList.add(cell.getStringCellValue());
			}
			workbook.close();
			excelFile.close();
			
			// Step 4: comparing both the list
			 if (webPageAttributesList.equals(excelAttributesList)) {
		            System.out.println("Both lists of web elements are the same.");
			 	} else {
		    			throw new Exception("Faild because List are not mtching");
			 		}
		}
		public void allSectionsList() throws Exception
		{
			FrontendPackMasterTab.click();
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//button[@class='tataB ClorWhite text-left brdrR0 btn btn-light btn-sectionborder w-100']"));
			for (WebElement element : elements)
			{
				webSectionList.add(element.getText());
			} 
			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream("C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFile1.xlsx");
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Sheet1");

			for (Row row : sheet) {
				Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
				excelSectionList.add(cell.getStringCellValue());
			}
			workbook.close();
			excelFile.close();
			
			if (webSectionList.equals(excelSectionList)) {
	            System.out.println("Both lists of jweb elements are the same.");
	        } else {
    			throw new Exception("Faild because List are not mtching");
	 		}
		}
		
	       
		    public void readDataFromExcel() {
		        List<String> data = new ArrayList<>();
		        String filePath = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFile1.xlsx";
		        String sheetName = "Sheet3"; // Replace with the name of your sheet
		        try (FileInputStream fis = new FileInputStream(filePath);
		        		Workbook workbook = new XSSFWorkbook(fis)) {
		        		Sheet sheet = workbook.getSheet(sheetName);
		        		
		            if (sheet == null) {
		                throw new IllegalArgumentException("Sheet '" + sheetName + "' not found.");
		            }

		            // Starting row index (zero-based) for reading data
		            
		            int startRow = 2; // Assuming data starts from the third row (index 2)
		            Iterator<Row> rowIterator = sheet.iterator();
		            while (rowIterator.hasNext()) {
		                Row row = rowIterator.next();
		                if (row.getRowNum() >= startRow) {
		                    Cell cell = row.getCell(5); // Column D (index 3)
		                    if (cell != null) {
		                        data.add(cell.getStringCellValue());
		                    }
		                }
		            }

		        } catch (IOException e) {
		            e.printStackTrace();
		        }

				System.out.println(data);
			}

			public String readExcelData1(String filePath, String sheetName, int rowNumber, int columnNumber)
					throws IOException {
				FileInputStream fileInputStream = new FileInputStream(filePath);
				Workbook workbook = WorkbookFactory.create(fileInputStream);
				Sheet sheet = workbook.getSheet(sheetName);
				Row row = sheet.getRow(rowNumber);
				Cell cell = row.getCell(columnNumber);

				String cellValue = cell.getStringCellValue();
				workbook.close();
				fileInputStream.close();

				return cellValue;
			}

			public void readExcelData() throws IOException  {
				List<String> excelSectionList = new ArrayList<>();
				FileInputStream excelFile = new FileInputStream("C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFile1.xlsx");
				Workbook workbook = new XSSFWorkbook(excelFile);
				Sheet sheet = workbook.getSheet("Sheet3");

				for (Row row : sheet) {
					Cell cell = row.getCell(1); // Assuming the attributes are in the first column (index 0)
					excelSectionList.add(cell.getStringCellValue());
				}
				workbook.close();
				excelFile.close();
				System.out.println(excelSectionList);
			}

		public void verifytabList() throws Exception
		{
			List<String> webSectionList = new ArrayList<>();
			List<WebElement> elements = driver.findElements(By.xpath("//button[@class='tataB ClorWhite btn btn-light w-100 brdrR0']"));
			for (WebElement element : elements)
			{
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			} 
			
			List<String> excelSectionList = new ArrayList<>();
			FileInputStream excelFile = new FileInputStream("C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFile1.xlsx");
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("Sheet1");
		
			for (Row row : sheet) {
				Cell cell = row.getCell(1); // Assuming the attributes are in the first column (index 0)
				excelSectionList.add(cell.getStringCellValue());
			}
			workbook.close();
			excelFile.close();
			
			if (webSectionList.equals(excelSectionList)) {
		        System.out.println("Both lists of web elements are the same.");
		    } else {
    			throw new Exception("Faild because List are not mtching");
	 		}
			System.out.println(excelSectionList);
		}
}	
				// Encapsulation = data (private) + method (public)
