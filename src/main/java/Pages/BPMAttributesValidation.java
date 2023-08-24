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

public class BPMAttributesValidation extends TestBase {
	
	//Object Repository Attributes
		@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
		@FindBy(xpath="//span[text()='BPM']") private WebElement SelectBPMWI;
		@FindBy(xpath="//p[text()='Pack Master']") private WebElement SelectPackMasterTab;
		@FindBy(xpath="//p[text()='Backend Pack Master ']") private WebElement BackendPackMasterSection;
		@FindBy(xpath="//p[text()='Comments ']") private WebElement CommentsSection;
		@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChannelDetailsTab;
		@FindBy(xpath="//p[text()='Channels Add/Drop ']") private WebElement ChannelsAddDropSection;
		@FindBy(xpath="//p[text()='Frontend pack mapping']") private WebElement FrontendPackMappingTab;
		@FindBy(xpath="//p[text()='Frontend pack mapping ']") private WebElement FrontendPackMappingSection;
	
		
	String TestDataExcelFPM = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFileBPM.xlsx";
	
	//Constructor for element initialization
	public BPMAttributesValidation() {
		PageFactory.initElements(driver, this);
	}
	
	public void allBackendPackMasterSection() throws Exception
	{
		openDrawerMenu.click();
		SelectBPMWI.click();
		SelectPackMasterTab.click();
		BackendPackMasterSection.click();
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 			
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Backend Pack Master");
	
		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
			System.out.println(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
	        System.out.println("Both lists of web elements are the same.");
	    } else {
			throw new Exception("Failed because List are not matching");
 		}
	}
	public void allCommentsSection() throws Exception
	{
		openDrawerMenu.click();
		SelectBPMWI.click();
		SelectPackMasterTab.click();
		CommentsSection.click();
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 			
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Comments");
	
		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
			System.out.println(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
	        System.out.println("Both lists of web elements are the same.");
	    } else {
			throw new Exception("Failed because List are not matching");
 		}
	}
	public void allChannelsAddDropSection() throws Exception
	{
		openDrawerMenu.click();
		SelectBPMWI.click();
		ChannelDetailsTab.click();
		ChannelsAddDropSection.click();
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 			
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Channels Add Drop");
	
		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
			System.out.println(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
	        System.out.println("Both lists of web elements are the same.");
	    } else {
			throw new Exception("Failed because List are not matching");
 		}
	}
	public void allFrontendPackMappingSection() throws Exception
	{
		openDrawerMenu.click();
		SelectBPMWI.click();
		FrontendPackMappingTab.click();
		FrontendPackMappingSection.click();
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "") {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 			
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Frontend pack mapping");
	
		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
			System.out.println(cell.getStringCellValue());
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
