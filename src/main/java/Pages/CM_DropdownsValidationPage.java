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

public class CM_DropdownsValidationPage extends TestBase {
	
	//Object Repository Attributes
	@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
	@FindBy(xpath="//span[text()='CM']") private WebElement SelectCMWI;
	@FindBy(xpath="//p[text()='Channel Master']") private WebElement SelectChannelMasterTab;
	@FindBy(xpath="//p[text()='Content Team ']") private WebElement ContentTeamSection;
	@FindBy(xpath="//p[text()='Subscriber Marketing Team ']") private WebElement SubscriberMarketingTeam;
	@FindBy(xpath="//p[text()='Satellite Details ']") private WebElement SatelliteDetailsAtributes;
	
		
	String TestDataExcel = "C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\TestData\\TestDataFileCM.xlsx";
	
	//Constructor for element initialization
	public CM_DropdownsValidationPage() {
		PageFactory.initElements(driver, this);
	}
	public void NameOfBroadcasterDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Name Of Broadcaster']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
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
	public void PrimaryGenreDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Primary Genre']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
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
	public void AudioLanguageDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Audio Language']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
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
	public void TypeofChannelDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Type of Channel']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
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
	public void SDMappingYesNo() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='SD Mapping: Yes/No']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
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
	public void RENTAL_FLAG_DD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='RENTAL_FLAG']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(6); // Column 1
				
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
	public void PAYABLE_FLAG_DD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='PAYABLE_FLAG']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(7); // Column 1
				
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
	public void TypeOfTataPlayServicesDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Type Of Tata Play Services']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(8); // Column 1
				
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
	public void ReaddchannelDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Re-add channel']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(9); // Column 1
				
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
	public void ChannelStatusDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Channel Status']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(10); // Column 1
				
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
	public void ChannelModelDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		ContentTeamSection.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Channel Model']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(11); // Column 1
				
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
	public void PackagingGenreDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		SubscriberMarketingTeam.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Packaging Genre']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(12); // Column 1
				
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
	public void RecommendedGenreDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		SubscriberMarketingTeam.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Recommended Genre']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(13); // Column 1
				
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
	public void EncryptedDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		SatelliteDetailsAtributes.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Encrypted']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(14); // Column 1
				
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
	public void ServiceTypeDD() throws Exception {
		openDrawerMenu.click();
		SelectCMWI.click();
		SelectChannelMasterTab.click();
		SatelliteDetailsAtributes.click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Service Type']"));
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
			Sheet sheet = workbook.getSheet("CM All Dropdowns15"); // Assuming you want to read data from sheet 2
			for (Row row : sheet) {
				Cell ColumnNumber = row.getCell(15); // Column 1
				
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