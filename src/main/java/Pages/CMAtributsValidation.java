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

public class CMAtributsValidation extends TestBase {
	@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
	@FindBy(xpath="//span[text()='CM']") private WebElement SelectCMWI;
	@FindBy(xpath="//p[text()='Channel Master']") private WebElement SelectChannelMasterTab;
	@FindBy(xpath="//p[text()='Content Team ']") private WebElement ContentTeamSection;
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
	
	String TestDataExcel = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFileCM.xlsx";
	public CMAtributsValidation() {
		PageFactory.initElements(driver, this);
	}
	public void TabsOfCMPage() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		Thread.sleep(2000);
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 tabSectionTitle css-hoiwr4-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet sheet = workbook.getSheet("CMTabs"); // Assuming you want to read data from sheet 2
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
	public void SectionsChannelMaster() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-1f3fto2-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMTabs"); // Assuming you want to read data from sheet 2
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
	public void SectionslogoPlatformTab() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		logoPlatformTab.click();
		Thread.sleep(2000);
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-1f3fto2-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMTabs"); // Assuming you want to read data from sheet 2
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

	public void SectionsApproval() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		ApprovalAtributesTab.click();
		Thread.sleep(2000);

		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(
				By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-1f3fto2-MuiTypography-root']"));
		for (WebElement element : elements) {
			if (element.getText() != "" && element.getText() != " ") {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		}
		ArrayList<String> ExcelTestData = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("CMTabs"); // Assuming you want to read data from sheet 2
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
	public void ContentTeamAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		ContentTeamSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Content Team");

		for (Row row : sheet) {
			Cell cell = row.getCell(0); // Assuming the attributes are in the first column (index 0)
			excelSectionList.add(cell.getStringCellValue());
		}
		workbook.close();
		excelFile.close();
		
		if (webSectionList.equals(excelSectionList)) {
            System.out.println("Both lists of web elements are the same.");
        } 
		else {
			throw new Exception("Failed because List are not matching");
        }
	}
	public void SubscriberMarketingTeamAtributs() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		SubscriberMarketingTeam.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Subscriber Marketing Team");

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
	public void EPGTeamAtributs() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		EPGTeamAtributs.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("EPG Team");

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
	public void TechnologyTeamAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		TechnologyTeamAtributes.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("TechnologyTeam");

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
	public void VideoDetailsAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		VideoDetailsAtributes.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Video Details");

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
	
	public void ContentTechnologyAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		ContentTechnologyAtributes.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Content & Technology");

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
	
	public void AudioDetailsAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		AudioDetailsAtributes.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Audio Details");

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
	public void TechnicalContactDetailsBroadcasterAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		TechnicalContactDetailsBroadcasterAtributes.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Technical Contact Details - Bro");

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
	public void DistributionContactDetailsAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		DistributionContactDetailsAtributes.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Distribution Contact Details");

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
	
	public void DistributionContactDetailsEPG() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		DistributionContactDetailsEPG.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Distribution Contact Details EP");

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
	
	public void SatelliteDetailsAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		Thread.sleep(2000);
		SatelliteDetailsAtributes.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Satellite Details");

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
	public void logoPlatformTab() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		logoPlatformTab.click();
		Thread.sleep(2000);
		logoPlatformSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("logo platform");

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
	public void ApprovalAtributes() throws Exception
	{
		openDrawerMenu.click();
		SelectCMWI.click();
		ApprovalAtributesTab.click();
		Thread.sleep(2000);
		ApprovalAtributesSection.click();
		
		List<String> webSectionList = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-e784if-MuiTypography-root']"));
		for (WebElement element : elements)
		{
			if( element.getText() != "" && element.getText() != " " ) {
				webSectionList.add(element.getText());
				System.out.println(element.getText());
			}
		} 
		
		List<String> excelSectionList = new ArrayList<>();
		FileInputStream excelFile = new FileInputStream(TestDataExcel);
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheet("Approval");

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