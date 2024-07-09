package BasePackage;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	@BeforeTest
	public static void setUp() throws IOException
	{
		if(driver==null) {
		FileReader fr= new FileReader("C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\src\\main\\java\\ConfigPackage\\config.properties");
		prop.load(fr);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			ChromeOptions o = new ChromeOptions();
			o.setAcceptInsecureCerts(true);
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver(o);
			driver.manage().window().maximize();
		    driver.get(readPropertyFile("CPMURL")); 
		    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		    driver.get(prop.getProperty("CPMURL")); 
		}
		if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			EdgeOptions o = new EdgeOptions();
		    o.setAcceptInsecureCerts(true);
		    System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		    o.addArguments("--disable-notifications");
		    o.addArguments ("--disable-popup-blocking");
		    driver = new EdgeDriver(o);
		    driver.manage().window().maximize();
		    driver.get(readPropertyFile("CPMURL"));
		    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}
		
	}

	public static String readPropertyFile(String value) throws IOException 
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\src\\main\\java\\ConfigPackage\\config.properties");
		prop.load(file);
		return prop.getProperty(value); 
	}
public static void click(String Locator) throws IOException {
		
		if(Locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(readPropertyFile(Locator))).click();
		}else if(Locator.endsWith("_ID")) {
			driver.findElement(By.id(readPropertyFile(Locator))).click();
		}
	}
	
	public static void SendKey(String Locator, String Value) throws IOException {
		if(Locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(readPropertyFile(Locator))).sendKeys(Value);
		}else if(Locator.endsWith("_ID")) {
			driver.findElement(By.id(readPropertyFile(Locator))).sendKeys(Value);
		}
	}

}
