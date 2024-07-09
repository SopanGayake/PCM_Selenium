package Pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import BasePackage.TestBase;

public class PCFAttributesValidation extends TestBase {
	@FindBy(xpath="//p[text()='Eligibility Account Type-Sub Type']") private WebElement EligibilityAccountTab;
	@FindBy(xpath="//p[text()='Charging Account Type-Sub Type']") private WebElement ChargingAccountTab;
	@FindBy(xpath="//p[text()='Alerts Bills Descriptions']") private WebElement AlertsBillsTab;
	@FindBy(xpath="//p[text()='Business Review']") private WebElement BusinessReviewTab;
	@FindBy(xpath="//p[text()='IT Review']") private WebElement ITReviewTab;
	@FindBy(xpath="//p[text()='Change History']") private WebElement ChangeHistoryTab;

	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[20]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>TwentythSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[19]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>NineteenthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[18]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>EighteenthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[17]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>SeventeenthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[16]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>SixteenthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[15]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>FifteenthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[14]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>FourteenthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[13]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>ThirteenSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[12]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>TwelveSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[11]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>EleventhSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[10]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement>TenthSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[9]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> NineSectionAttributes;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1-content'])[8]//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']")})private List<WebElement> EighthSectionAttributes;
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
    @FindAll({@FindBy(xpath = "//div[@aria-controls='panel1-content']//p")})private List<WebElement> SectionList;
    @FindAll({@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-sf1wrq-MuiTypography-root']")})private List<WebElement> FormDetails;

    String TestDataExcel = "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\PCF_ui_table.xlsx";
	ArrayList<String> ExcelTestData = new ArrayList<>();
	List<String> webSectionList = new ArrayList<>();
	
	public PCFAttributesValidation() { 
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
		Sheet sheet = workbook.getSheet("PCF_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void tabsList() throws Exception
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
		Sheet sheet = workbook.getSheet("PCF_All_Attributes");
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
	public void pacageCreationAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PCF_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void sectionNameList() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void requesterDetailsAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void packageDetailsAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void chargingAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void chargingAdditionalAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void bingeCCFAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void caRelatedConfigAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void siebelCompatibilityAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void additionalBusinessAttributes() throws Exception
	{	 
		for (WebElement element : EighthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void selfCareConfigAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void SMSConfigAttribute() throws Exception
	{	 
		for (WebElement element : TenthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void CampaignConfigurations () throws Exception
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
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void nuanceConfigAttributes() throws Exception
	{	 
		for (WebElement element : TwelveSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void PRMSalesConfigAttribute() throws Exception
	{	 
		for (WebElement element : ThirteenSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
		System.out.println("e"+ExcelTestData);
		System.out.println("w"+webSectionList);
		if (webSectionList.equals(ExcelTestData)) {
			System.out.println("Both lists of web elements are the same.");
		} else {
			throw new Exception("Failed because List are not Matching");
		}
	}
	public void mSalesAttributes() throws Exception
	{	 
		for (WebElement element : FourteenthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void missedCallConfigAttributes() throws Exception
	{	 
		for (WebElement element : FifteenthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void BIRelatedConfigurations () throws Exception
	{	 
		for (WebElement element : SixteenthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void CompatiblePacksTobe() throws Exception
	{	 
		for (WebElement element : SeventeenthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void Charging_Applicable_NRC() throws Exception
	{	 
		for (WebElement element : EighteenthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void Charging_Applicable_RC() throws Exception
	{	 
		for (WebElement element : NineteenthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void MissedCalltoSPM() throws Exception
	{	 
		for (WebElement element : TwentythSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PackageCreationSections"); // Assuming you want to read data from sheet 2
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
	public void eligibilityAttributes() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PCF_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void eligibilitySections() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("EligibilityTabSections"); // Assuming you want to read data from sheet 2
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
	
	public void elTradeAttributes() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("EligibilityTabSections"); // Assuming you want to read data from sheet 2
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
	public void elResidentialAtributes() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : SecondSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("EligibilityTabSections"); // Assuming you want to read data from sheet 2
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
	public void elRuleOnAccountAtributes() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : ThirdSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("EligibilityTabSections"); // Assuming you want to read data from sheet 2
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
	public void elCommercialAttributes() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : FourthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("EligibilityTabSections"); // Assuming you want to read data from sheet 2
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
	public void corporateAttributes() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : FifthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("EligibilityTabSections"); // Assuming you want to read data from sheet 2
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
	public void subCategoryAttributes() throws Exception
	{	 
		EligibilityAccountTab.click();
		for (WebElement element : SixthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("EligibilityTabSections"); // Assuming you want to read data from sheet 2
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
	public void chargingAccountAttributes() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PCF_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void chargingTabSections() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingTabSections"); // Assuming you want to read data from sheet 2
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
	public void chTradeAttributes() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingTabSections"); // Assuming you want to read data from sheet 2
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
	public void chResidentialAtributes() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : SecondSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingTabSections"); // Assuming you want to read data from sheet 2
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
	public void chRuleOnAccountAtributes() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : ThirdSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingTabSections"); // Assuming you want to read data from sheet 2
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
	public void chCommercialAttributes() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : FourthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingTabSections"); // Assuming you want to read data from sheet 2
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
	public void chCorporateAttributes() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : FifthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingTabSections"); // Assuming you want to read data from sheet 2
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
	public void chSubCategoryAttributes() throws Exception
	{	 
		ChargingAccountTab.click();
		for (WebElement element : SixthSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ChargingTabSections"); // Assuming you want to read data from sheet 2
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
	public void AlertsBillsAttributes() throws Exception
	{	 
		AlertsBillsTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PCF_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void AlertsBillsSections() throws Exception
	{	 
		AlertsBillsTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AlertsBillsTabSections"); // Assuming you want to read data from sheet 2
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
	public void b_MailAttributes() throws Exception
	{	 
		AlertsBillsTab.click();
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AlertsBillsTabSections"); // Assuming you want to read data from sheet 2
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
	public void billDescriptionAttributes() throws Exception
	{	 
		AlertsBillsTab.click();
		for (WebElement element : SecondSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("AlertsBillsTabSections"); // Assuming you want to read data from sheet 2
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
	public void BusinessReviewAttributes() throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PCF_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void businessReviewSections() throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("BusinessReviewSections"); // Assuming you want to read data from sheet 2
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
	public void reviewDetailsAttributes() throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("BusinessReviewSections"); // Assuming you want to read data from sheet 2
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
	public void brCommentsAttributes() throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement element : SecondSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("BusinessReviewSections"); // Assuming you want to read data from sheet 2
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
	public void reviewArtifactsAttributes() throws Exception
	{	 
		BusinessReviewTab.click();
		for (WebElement element : ThirdSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("BusinessReviewSections"); // Assuming you want to read data from sheet 2
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
	public void ITReviewAttributes() throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : AttributesList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("PCF_All_Attributes"); // Assuming you want to read data from sheet 2
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
	public void ITReviewTabSections() throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : SectionList)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ITReviewSections"); // Assuming you want to read data from sheet 2
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
	public void itReviewAttributes() throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : FirstSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ITReviewSections"); // Assuming you want to read data from sheet 2
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
	public void effortEstimAttributes() throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : SecondSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ITReviewSections"); // Assuming you want to read data from sheet 2
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
	public void discussionAttributes() throws Exception
	{	 
		ITReviewTab.click();
		for (WebElement element : ThirdSectionAttributes)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("ITReviewSections"); // Assuming you want to read data from sheet 2
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
	public void ChangeHistoryAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("PCF_All_Attributes"); // Assuming you want to read data from sheet 2
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
		Sheet sheet = workbook.getSheet("ChangeHistory"); // Assuming you want to read data from sheet 2
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
	public void changeHistoryAttributes() throws Exception
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
		Sheet sheet = workbook.getSheet("ChangeHistory"); // Assuming you want to read data from sheet 2
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

}