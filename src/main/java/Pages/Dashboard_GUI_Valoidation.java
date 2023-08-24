package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Arrays;
import BasePackage.TestBase;

public class Dashboard_GUI_Valoidation extends TestBase {
	@FindBy(xpath="//button[@aria-label='open drawer']") private WebElement openDrawerMenu;
	@FindBy(xpath="//*[@data-testid ='ChevronLeftIcon']") private WebElement closeDrawerMenu;
	@FindBy(xpath="//button[text()='Create']") private WebElement CreateButton;
	@FindBy(xpath="//input[@name='r1' and @value='CM']") private WebElement CreateCMRedio;
	@FindBy(xpath="//input[@name='r1' and @value='FPM']") private WebElement CreateFPMRedio;
	@FindBy(xpath="//input[@name='r1' and @value='BPM']") private WebElement CreateBPMRedio;
	@FindBy(xpath="//input[@name='r1' and @value='PCF']") private WebElement CreatePCFRedio;
	public Dashboard_GUI_Valoidation()
	{
	PageFactory.initElements(driver, this);
	}
	public void verifyUser() throws InterruptedException
	{
		WebElement Icone = driver.findElement(By.xpath("//button[@aria-label='open user profile']"));
		Icone.isDisplayed();
	} 
	public void verifyProjectAreaName() throws Exception
	{
		WebElement projrctArea = driver.findElement(By.xpath("//h6[@class='MuiTypography-root MuiTypography-h6 css-10ll70-MuiTypography-root']"));
		String name = projrctArea.getText();
		boolean isEqual = name.equals("Project Area Name");
        // Print the result
        if (isEqual) {
            System.out.println("The result is equal.");
        } else {
        	throw new Exception("Failed because result is not equal.");
        }
		
	} 
	public void verifyTataPlayLogo() throws Exception
	{
		WebElement Logo = driver.findElement(By.xpath("//img[@alt='Tata Play Logo']"));
		Logo.isDisplayed();
		Dimension Size = Logo.getSize();
		Dimension Expected = new Dimension(168, 20);
		boolean isEqual = Size.equals(Expected);
		 if (isEqual) {
	            System.out.println("The result is equal.");
	        } else {
	        	throw new Exception("Failed because result is not equal.");
	        }
	} 
	public void OpenCMPage() throws Exception
	{
		CreateCMRedio.click();
		Thread.sleep(2000);
		CreateButton.click();
		driver.findElement(By.xpath("//h6[contains(text(), 'CM')]"));
		
	} 
	public void OpenFPMPage() throws Exception
	{
		CreateFPMRedio.click();
		Thread.sleep(2000);
		CreateButton.click();
		driver.findElement(By.xpath("//h6[contains(text(), 'FPM')]"));
	
	} 
	public void OpenBPMPage() throws Exception
	{
		CreateBPMRedio.click();
		Thread.sleep(2000);
		CreateButton.click();
		driver.findElement(By.xpath("//h6[contains(text(), 'BPM')]"));
	} 
	public void OpenPCFPage() throws Exception
	{
		CreatePCFRedio.click();
		Thread.sleep(2000);
		CreateButton.click();
		driver.findElement(By.xpath("//h6[contains(text(), 'PCF')]"));
	} 
//	public void verifyMenudrawer() throws Exception
//	{
//		openDrawerMenu.click();
//		List<String> webSectionList = new ArrayList<>();
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='MuiListItemText-root css-tlelie-MuiListItemText-root']"));
//		for (WebElement element : elements)
//		{
//			if( element.getText() != "" && element.getText() != " " ) {
//				webSectionList.add(element.getText());
//				System.out.println(element.getText());
//			}
//		} 
//		
//		ArrayList<String> Expected = new ArrayList<>(Arrays.asList("FPM", "CM", "BPM", "PCF","Util Screen"));
//		if (webSectionList.equals(Expected)) {
//            System.out.println("Both lists of web elements are the same.");
//        } else {
//			throw new Exception("Failed because List are not matching");
//        }
//		
//	} 

}
