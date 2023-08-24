package BasePackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	// Reading Property file for credential 
	public String readPropertyFile(String value) throws IOException 
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Sopan Gayake\\eclipse-workspace\\PCMTestingFramework\\src\\main\\java\\ConfigPackage\\config.properties");
		prop.load(file);
		return prop.getProperty(value); 
	}
	
	public void initalization() throws IOException, InterruptedException
	// Navigate to the login page
	{
		String browserName = readPropertyFile("browser");  //edge
		if(browserName.equalsIgnoreCase("edge"))
		{	
			EdgeOptions o = new EdgeOptions();
		    o.setAcceptInsecureCerts(true);
		    System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		    driver = new EdgeDriver(o);
		    driver.get(readPropertyFile("fpmurl"));
		    Thread.sleep(2000);
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions o = new ChromeOptions();
			o.setAcceptInsecureCerts(true);
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver(o);
		    driver.get(readPropertyFile("fpmurl"));
		    Thread.sleep(2000);
		}  
		else if (browserName.equalsIgnoreCase("firefox")) {
		    FirefoxOptions o = new FirefoxOptions();
		    o.setAcceptInsecureCerts(true);
		    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		    driver = new FirefoxDriver(o);
		    driver.get(readPropertyFile("fpmurl"));
		    Thread.sleep(2000);
		}
		
	}	
}
//		else if(browserName.equalsIgnoreCase("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", "geckodriver");
//			driver = new FirefoxDriver();
//		}
//		else if(browserName.equalsIgnoreCase("opera")) 
//		{
//			OperaOptions o = new OperaOptions();
//			o.addArguments("--disable-notifications");
//			System.setProperty("webdriver.opera.driver", "operadriver");
//			driver = new OperaDriver(o);
//		}
//		else if(browserName.equalsIgnoreCase("edge"))
//		{
//			System.setProperty("webdriver.edge.driver", "msedgedriver");
//			driver = new EdgeDriver();
//		}
//		else
//		{
//			driver = new SafariDriver();
//		}
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get(readPropertyFile("url"));
//	}
	
//	public static void readExcelFile() throws IOException
//	{
//		String filePath = "C:\\Users\\Sopan Gayake.DTPLLPT70\\workspace\\TataPlay\\src\\main\\java\\Config\\User names.xlsx";
//		FileInputStream inputStream = new FileInputStream(filePath);
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheetAt(0); //getSheetAt(sheet1);
//		
//		int rows = sheet.getLastRowNum();
//		int cols = sheet.getRow(1).getLastCellNum();
//		
//		for (int r=0;r<rows;r++)
//		{
//			XSSFRow row = sheet.getRow(r);
//			for(int c=0;c<cols;c++)
//			{
//				XSSFCell cell=row.getCell(c);
//				
//				switch(cell.getCellType())
//				{
//				case STRING: System.out.println(cell.getStringCellValue());break;
//				case NUMERIC: System.out.println(cell.getNumericCellValue());break;
//				case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
//				}
//			}
//			System.out.println();
	
