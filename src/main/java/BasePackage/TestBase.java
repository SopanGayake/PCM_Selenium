package BasePackage;

import java.io.FileInputStream;
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
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	// Reading Property file for credential 
	public static String readPropertyFile(String value) throws IOException 
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\src\\main\\java\\ConfigPackage\\config.properties");
		prop.load(file);
		return prop.getProperty(value); 
	}
//	@BeforeMethod
	public void initalization() throws IOException, InterruptedException {
        String browserName = readPropertyFile("browser");
        switch (browserName.toLowerCase()) {
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.setAcceptInsecureCerts(true);
                edgeOptions.addArguments("--disable-notifications", "--disable-popup-blocking");
                System.setProperty("webdriver.edge.driver", "C:\\path\\to\\msedgedriver.exe");
                driver = new EdgeDriver(edgeOptions);
                break;
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setAcceptInsecureCerts(true);
                chromeOptions.addArguments("--disable-notifications", "--disable-popup-blocking");
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sopan.Gayake\\eclipse-workspace\\PCMTestingFramework\\chromedriver.exe");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setAcceptInsecureCerts(true);
                System.setProperty("webdriver.gecko.driver", "C:\\path\\to\\geckodriver.exe");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new IllegalArgumentException("Browser " + browserName + " not supported");
        }
        
        driver.manage().window().maximize();
        driver.get(readPropertyFile("CPMURL"));
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
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
