package Pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import BasePackage.TestBase;

public class CMAtributsValidation extends TestBase {
	@FindBy(xpath="//p[text()='Logos Platform']") private WebElement logoPlatformTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;
	@FindBy(xpath="//p[text()='Approvals']") private WebElement ApprovalsTab;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[12]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> TwelthectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> EleventhSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[10]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> ThenthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[9]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> NineSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[8]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> EightSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[7]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> SeventhSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[6]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> SixthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[5]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> FifthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> FourthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> ThirdSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> SecondSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> FirstSectionAttributes;
	@FindAll({@FindBy(xpath = "//select[@class='form-control form-control-style']")})private List<WebElement> DropdownsList;
	@FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 tabSectionTitle css-hoiwr4-MuiTypography-root']")})private List<WebElement> TabsList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> AttributesList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1d3njat-MuiTypography-root']")})private List<WebElement> SectionList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-sf1wrq-MuiTypography-root']")})private List<WebElement> FormDetails;

    String TestDataExcel = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\CM_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>();
	public CMAtributsValidation() { 
		PageFactory.initElements(driver, this);
	}
	public void formDetails() throws Exception
	{	 
		for (WebElement element : FormDetails)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChannelMasterAtributes"); // Assuming you want to read data from sheet 2
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
	public void TabsOfCMPage() throws Exception
	{	 
		for (WebElement element : TabsList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("ChannelMasterAtributes"); // Assuming you want to read data from sheet 2
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
	public void ChannelMasterAtributes() throws Exception
	{
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChannelMasterAtributes"); // Assuming you want to read data from sheet 2
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
		System.out.println("e"+ExcelTestData);
		System.out.println("w"+webSectionList);
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void LogoPlatformTab() throws Exception
	{
		logoPlatformTab.click();
		Thread.sleep(2000);
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChannelMasterAtributes"); // Assuming you want to read data from sheet 2
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
		System.out.println("e"+ExcelTestData);
		System.out.println("w"+webSectionList);
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void HistoryTab() throws Exception
	{
		ChangeHistoryTab.click();
		Thread.sleep(2000);
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChannelMasterAtributes"); // Assuming you want to read data from sheet 2
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
	public void sectionListName() throws Exception
	{
	
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void contentTeamAtributes() throws Exception
	{
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
		System.out.println("e"+ExcelTestData);
		System.out.println("w"+webSectionList);
		workbook.close();
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void smSectionAttributes() throws Exception
	{
		for (WebElement element : SecondSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void epgSectionAttributes() throws Exception
	{
		for (WebElement element : ThirdSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void technologlySectionAttributes() throws Exception
	{
		for (WebElement element : FourthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void videoSectionAttributes() throws Exception
	{
		for (WebElement element : FifthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void contentTechAttributes() throws Exception
	{
		for (WebElement element : SixthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void audioAttributes() throws Exception
	{
		for (WebElement element : SeventhSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void technicalContactAttributes() throws Exception
	{
		for (WebElement element : EightSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void distributionAttributes() throws Exception
	{
		for (WebElement element : NineSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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

	public void distributionEPGAttributes() throws Exception
	{
		for (WebElement element : ThenthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void satelliteAttributes() throws Exception
	{
		for (WebElement element : EleventhSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void commentsAttributes() throws Exception
	{
		for (WebElement element : TwelthectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void logoPlatformTabAtributes() throws Exception
	{
		logoPlatformTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
	public void ApprovalsTabSection() throws Exception
	{
		ApprovalsTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
		;
	}
	public void ChangeHistoryTabAtributes() throws Exception
	{
		ChangeHistoryTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("SectionsAttribute"); // Assuming you want to read data from sheet 2
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
}