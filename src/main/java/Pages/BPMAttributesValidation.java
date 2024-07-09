package Pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import BasePackage.TestBase;

public class BPMAttributesValidation extends TestBase {

	//Object Repository Attributes
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChannelDetailsTab;
	@FindBy(xpath="//p[text()='Frontend Pack Mapping']") private WebElement FrontendPackMappingTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> SecondSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> FirstSectionAttributes;


	@FindAll({@FindBy(xpath = "//select[@class='form-control form-control-style']")})private List<WebElement> DropdownsList;
	@FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 tabSectionTitle css-hoiwr4-MuiTypography-root']")})private List<WebElement> TabsList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> AttributesList;
    @FindAll({@FindBy(xpath = "//div[@aria-controls='panel1-content']//p")})private List<WebElement> SectionList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-sf1wrq-MuiTypography-root']")})private List<WebElement> FormDetails;

	String TestDataExcel = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\BPM_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>();
	
	public BPMAttributesValidation() { 
		PageFactory.initElements(driver, this);
	}

	public void BPMformDetails() throws Exception
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
		Sheet sheet = workbook.getSheet("BPM_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void BPMTabList() throws Exception
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
		Sheet sheet = workbook.getSheet("BPM_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void backendPackAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("BPM_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void backendPackSections() throws Exception
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
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void backendPackSectionAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void bpmCommentsAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void channelDetailsAttributes() throws Exception
	{	 
		ChannelDetailsTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("BPM_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void channelDetailsSections() throws Exception
	{	 
		ChannelDetailsTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			} 
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void channelsDetailsAttributes() throws Exception
	{	 
		ChannelDetailsTab.click();
		for (WebElement element : SecondSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void channelsAddDropAttributes() throws Exception
	{	 
		ChannelDetailsTab.click();
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void frontendPackMappingTab() throws Exception
	{	 
		FrontendPackMappingTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("BPM_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void frontendPackSections() throws Exception
	{	 
		FrontendPackMappingTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void frontendPackSecAttributes() throws Exception
	{	 
		FrontendPackMappingTab.click();
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void changeHistoryTab() throws Exception
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
		Sheet sheet = workbook.getSheet("BPM_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void changeHistorySections() throws Exception
	{	 
		ChangeHistoryTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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
	public void changeHistorySecAttributes() throws Exception
	{	 
		ChangeHistoryTab.click();
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AllSectionsAttributes"); // Assuming you want to read data from sheet 2
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

}