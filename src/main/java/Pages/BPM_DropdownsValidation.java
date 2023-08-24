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

public class BPM_DropdownsValidation extends TestBase {
	
	//Object Repository Attributes
	@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
	@FindBy(xpath="//span[text()='BPM']") private WebElement SelectBPMWI;
	@FindBy(xpath="//p[text()='Pack Master']") private WebElement PackMasterTab;
	@FindBy(xpath="//p[text()='Backend Pack Master ']") private WebElement BackendPackMasterSection;
	@FindBy(xpath="//p[text()='Subscriber Marketing Team ']") private WebElement SubscriberMarketingTeam;
	@FindBy(xpath="//p[text()='EPG Team ']") private WebElement EPGTeamAtributs;
	@FindBy(xpath="//p[text()='Technology Team ']") private WebElement TechnologyTeamAtributes;
	@FindBy(xpath="//p[text()='Video Details ']") private WebElement VideoDetailsAtributes;
	@FindBy(xpath="//p[text()='Content & Technology ']") private WebElement ContentTechnologyAtributes;
	@FindBy(xpath="//p[text()='Audio Details ']") private WebElement AudioDetailsAtributes;
	@FindBy(xpath="//p[text()='Technical Contact Details - Broadcaster ']") private WebElement TechnicalContactDetailsBroadcasterAtributes;
	@FindBy(xpath="//p[text()='Distribution Contact Details  ']") private WebElement DistributionContactDetailsAtributes;
	@FindBy(xpath="//p[text()='Distribution Contact Details - EPG ']") private WebElement DistributionContactDetailsEPG;
	@FindBy(xpath="//p[text()='Satellite Details ']") private WebElement SatelliteDetailsAtributes;
	@FindBy(xpath="//p[text()='logo platform']") private WebElement logoPlatformTab;
	@FindBy(xpath="//p[text()='logos platform ']") private WebElement logoPlatformSection;
	@FindBy(xpath="//p[text()='Approval']") private WebElement ApprovalAtributesTab;
	@FindBy(xpath="//p[text()='Approval ']") private WebElement ApprovalAtributesSection;
	
		
	String TestDataExcel = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFileBPM.xlsx";
	
	//Constructor for element initialization
	public BPM_DropdownsValidation() {
		PageFactory.initElements(driver, this);
	}
	public void AllowExpiredPackCAIDDD() throws Exception {
		openDrawerMenu.click();
		SelectBPMWI.click();
		PackMasterTab.click();
		BackendPackMasterSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='AllowExpiredPackCAID']"));
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
		try (FileInputStream excelFile = new FileInputStream(TestDataExcel);
			Workbook workbook = new XSSFWorkbook(excelFile)) {
			Sheet sheet = workbook.getSheet("BPM Dropdowns5"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(1); // Column 1

				if (ColumnNumber != null) {
					String cell = ColumnNumber.getStringCellValue();
					ExcelTestData.add(cell);
					}
				}
			if (webSectionList.equals(ExcelTestData)) {
		        System.out.println("Both lists of web elements are the same.");
		    } else {
    			throw new Exception("Faild because List are not mtching");
	 		}
		} catch (IOException e) {
		 e.printStackTrace();
		}
	}
	public void TypeOfPackDD() throws Exception {
		openDrawerMenu.click();
		SelectBPMWI.click();
		PackMasterTab.click();
		BackendPackMasterSection.click();
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
		try (FileInputStream excelFile = new FileInputStream(TestDataExcel);
				Workbook workbook = new XSSFWorkbook(excelFile)) {
			Sheet sheet = workbook.getSheet("BPM Dropdowns5"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(2); // Column 1
				
				if (ColumnNumber != null) {
					String cell = ColumnNumber.getStringCellValue();
					ExcelTestData.add(cell);
				}
			}
			if (webSectionList.equals(ExcelTestData)) {
				System.out.println("Both lists of web elements are the same.");
			} else {
				throw new Exception("Faild because List are not mtching");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void IsEncryptedPackDD() throws Exception {
		openDrawerMenu.click();
		SelectBPMWI.click();
		PackMasterTab.click();
		BackendPackMasterSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Is Encrypted Pack']"));
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
		try (FileInputStream excelFile = new FileInputStream(TestDataExcel);
				Workbook workbook = new XSSFWorkbook(excelFile)) {
			Sheet sheet = workbook.getSheet("BPM Dropdowns5"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(3); // Column 1
				
				if (ColumnNumber != null) {
					String cell = ColumnNumber.getStringCellValue();
					ExcelTestData.add(cell);
				}
			}
			if (webSectionList.equals(ExcelTestData)) {
				System.out.println("Both lists of web elements are the same.");
			} else {
				throw new Exception("Faild because List are not mtching");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void PackGenreDD() throws Exception {
		openDrawerMenu.click();
		SelectBPMWI.click();
		PackMasterTab.click();
		BackendPackMasterSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Genre']"));
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
		try (FileInputStream excelFile = new FileInputStream(TestDataExcel);
				Workbook workbook = new XSSFWorkbook(excelFile)) {
			Sheet sheet = workbook.getSheet("BPM Dropdowns5"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(4); // Column 1
				
				if (ColumnNumber != null) {
					String cell = ColumnNumber.getStringCellValue();
					ExcelTestData.add(cell);
				}
			}
			if (webSectionList.equals(ExcelTestData)) {
				System.out.println("Both lists of web elements are the same.");
			} else {
				throw new Exception("Faild because List are not mtching");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void PackStatusDD() throws Exception {
		openDrawerMenu.click();
		SelectBPMWI.click();
		PackMasterTab.click();
		BackendPackMasterSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Status']"));
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
		try (FileInputStream excelFile = new FileInputStream(TestDataExcel);
				Workbook workbook = new XSSFWorkbook(excelFile)) {
			Sheet sheet = workbook.getSheet("BPM Dropdowns5"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(5); // Column 1
				
				if (ColumnNumber != null) {
					String cell = ColumnNumber.getStringCellValue();
					ExcelTestData.add(cell);
				}
			}
			if (webSectionList.equals(ExcelTestData)) {
				System.out.println("Both lists of web elements are the same.");
			} else {
				throw new Exception("Faild because List are not mtching");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}