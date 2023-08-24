package Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For .xlsx files
import org.apache.poi.ss.usermodel.*;

import BasePackage.TestBase;


public class FPM_DropdownsValidation extends TestBase{
	
	//Object Repository for GUI
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
		public FPM_DropdownsValidation() {
			PageFactory.initElements(driver, this);
		}

		public void TypeOfPackDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
				Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void NameOfBroadcasterDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
				Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void PackageDashboardCategoryDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Package Dashboard Category']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void OfferTypeforServicesDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Offer Type for Services']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void PackGradeTypeDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Grade Type']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void PackStatusDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void UnitOfMeasureUoMDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Unit Of Measure(UoM)']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void SDHD_DD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='SD/HD']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void BroadcasterCategoryforDisplays() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Broadcaster Category for Displays']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void TataPlayPacksCategoryforDisplays() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='TataPlay Packs Category for Displays']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void ChannelCategoryforDisplay() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Channel Category for Display']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void DASLevelValidationDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='DAS Level Validation']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void AnyBoxTypePrimaryBestBoxValidationDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Any Box Type(Primary/Best Box) Validation']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void UnitofMeasureUoMforNonODUPacksDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Unit of Measure (UoM) for Non-ODU Packs']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void RENTAL_FLAG_DD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
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
		public void PAYABLE_FLAG_DD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
				for (Row row : sheet) {
					Cell ColumnNumber = row.getCell(16); // Column 1
					
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
		public void IS_Trai_Enable_flag_DD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='IS_Trai_Enable_flag']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
				for (Row row : sheet) {
					Cell ColumnNumber = row.getCell(17); // Column 1
					
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
		public void TobemadeavailablefordealersinmSalesDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='To be made available for dealers in mSales']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
				for (Row row : sheet) {
					Cell ColumnNumber = row.getCell(18); // Column 1
					
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
		public void SubscriberTypeNewExistingDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Subscriber Type(New/Existing)']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
				for (Row row : sheet) {
					Cell ColumnNumber = row.getCell(19); // Column 1
					
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
		public void PackVariationDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Pack Variation']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
				for (Row row : sheet) {
					Cell ColumnNumber = row.getCell(20); // Column 1
					
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
		public void AnyStatelevelvalidationDD() throws Exception {
			openDrawerMenu.click();
			SelectFPMWI.click();
			SelectfrontendPackMasterTab.click();
			PackMasterDetailsSection.click();
			WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='Any State level validation']"));
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
			try (FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
					Workbook workbook = new XSSFWorkbook(excelFile)) {
				Sheet sheet = workbook.getSheet("All FPM Dropdowns21"); // Assuming you want to read data from sheet 2
				for (Row row : sheet) {
					Cell ColumnNumber = row.getCell(21); // Column 1
					
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
		public void readExcelData1()throws IOException {
				
			FileInputStream excelFile = new FileInputStream(TestDataExcelFPM);
			Workbook workbook = WorkbookFactory.create(excelFile);
			Sheet sheet = workbook.getSheet("All FPM Dropdowns21");
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(2);
			String cellValue = cell.getStringCellValue();
			workbook.close();
			excelFile.close();
			System.out.println(cellValue);
		}
}	
				// Encapsulation = data (private) + method (public)
