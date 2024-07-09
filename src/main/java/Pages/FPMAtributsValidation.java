package Pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import BasePackage.TestBase;

public class FPMAtributsValidation extends TestBase {
	@FindBy(xpath="//p[text()='Frontend Pack Master']") private WebElement FrontendPackTab;
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChannelDetailsTab;
	@FindBy(xpath="//p[text()='Backend Pack Mapping']") private WebElement BackendPackTab;
	@FindBy(xpath="//p[text()='Links']") private WebElement LinksTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[6]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> SixthPackDetails ;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[5]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> FifthPackDetails ;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[4]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> FourthPackDetails ;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[3]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> ThirdPackDetails ;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[2]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> SecondPackDetails ;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[1]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> FristPackDetails ;
	

	@FindAll({@FindBy(xpath = "//select[@class='form-control form-control-style']")})private List<WebElement> DropdownsList;
	@FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 tabSectionTitle css-hoiwr4-MuiTypography-root']")})private List<WebElement> TabsList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> AttributesList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1d3njat-MuiTypography-root']")})private List<WebElement> SectionList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-sf1wrq-MuiTypography-root']")})private List<WebElement> FormDetails;

    String TestDataExcel = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\FPM_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>();
	
	public FPMAtributsValidation() { 
		PageFactory.initElements(driver, this);
	}

	public void FPMformDetails() throws Exception
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
		Sheet sheet = workbook.getSheet("FPM_All_Atributes"); // Assuming you want to read data from sheet 2
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
	public void FPMTabList() throws Exception
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
		Sheet sheet = workbook.getSheet("FPM_All_Atributes"); // Assuming you want to read data from sheet 2
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
	public void frontendPackTabAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("FPM_All_Atributes"); // Assuming you want to read data from sheet 2
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
	public void frontendPackSections() throws Exception
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
	public void frontendPackDetailsAttributes() throws Exception
	{	 
		for (WebElement element : FristPackDetails)
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
	public void packAvailableAttributes() throws Exception
	{	 
		for (WebElement element : SecondPackDetails)
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
	public void cAIDDetailsAttributes() throws Exception
	{	 
		for (WebElement element : ThirdPackDetails)
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
	public void compatiblePacksAttributes() throws Exception
	{	 
		for (WebElement element : FourthPackDetails)
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
	public void additionalBusinessAttributes() throws Exception
	{	 
		for (WebElement element : FifthPackDetails)
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
	public void commentsAttributes() throws Exception
	{	 
		for (WebElement element : SixthPackDetails)
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
	public void channelDetailsTab() throws Exception
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
		Sheet sheet = workbook.getSheet("FPM_All_Atributes"); // Assuming you want to read data from sheet 2
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
	public void AddNewChannels() throws Exception
	{	 
		ChannelDetailsTab.click();
		for (WebElement element : FristPackDetails)
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
	public void ChannelDetailsSection() throws Exception
	{	 
		ChannelDetailsTab.click();
		for (WebElement element : SecondPackDetails)
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
	public void ChannelAddDropDetails() throws Exception
	{	 
		ChannelDetailsTab.click();
		for (WebElement element : ThirdPackDetails)
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
	public void backendPackTab() throws Exception
	{	 
		BackendPackTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("FPM_All_Atributes"); // Assuming you want to read data from sheet 2
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
	public void backendPackSections() throws Exception
	{	 
		BackendPackTab.click();
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
	public void backendPackAttributes() throws Exception
	{	 
		BackendPackTab.click();
		for (WebElement element : FristPackDetails)
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
	public void linksTab() throws Exception
	{	 
		LinksTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("FPM_All_Atributes"); // Assuming you want to read data from sheet 2
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
	public void linksSections() throws Exception
	{	 
		LinksTab.click();
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
	public void attachmentsAttributes() throws Exception
	{	 
		LinksTab.click();
		for (WebElement element : FristPackDetails)
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
	public void linksAttributes() throws Exception
	{	 
		LinksTab.click();
		for (WebElement element : SecondPackDetails)
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
		Sheet sheet = workbook.getSheet("FPM_All_Atributes"); // Assuming you want to read data from sheet 2
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
	public void changeHistoryAttributes() throws Exception
	{	 
		ChangeHistoryTab.click();
		for (WebElement element : FristPackDetails)
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
}