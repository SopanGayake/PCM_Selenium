package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BasePackage.TestBase;


public class Dashboard_GUI_Validation extends TestBase{

	@FindBy(xpath="//img[@alt='Tata Play Logo']") private WebElement TataPlayLogo;
	@FindBy(xpath="//*[@data-testid='MenuIcon']") private WebElement MenuIcon;
	
	@FindBy(xpath="//button[@aria-label='Change Project Area']") private WebElement ChangeProjectIcon;
	@FindBy(xpath="//li[@role='menuitem' and @tabindex='0']") private WebElement firstProject;
	@FindBy(xpath="//li[@role='menuitem' and @tabindex='-1']") private WebElement SecondProject;
	@FindBy(xpath="//h6[@class='MuiTypography-root MuiTypography-h6 css-10ll70-MuiTypography-root']") private WebElement defaltProjectArea;
	@FindBy(xpath="//h6[ text()='Tata Play Business IT Requirement Management']") private WebElement ChangedProjectArea;
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement UniversalSearchBox;
	@FindBy(xpath="//span[text()='CAID Recommendation']") private WebElement CAIDRecommendation;
	@FindBy(xpath="//span[text()='CAID Utility']") private WebElement CAIDUtility;
	@FindBy(xpath="//span[text()='Dashboard']") private WebElement Dashboard;
	@FindBy(xpath="//span[text()='Reports']") private WebElement Reports;
	@FindBy(xpath="//span[text()='TP Pack Launch']") private WebElement TPPackLaunch;
	
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement SearchBox;
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//button[text()='Cancel']") private WebElement CancelButton;
	@FindBy(xpath="//*[@data-testid='AccountCircleIcon']") private WebElement UserProfile;
	@FindBy(xpath="//li[text()='Logout']") private WebElement LogoutUser;
	@FindBy(xpath="//*[@data-testid='ChevronLeftIcon']") private WebElement ClosePannelIcone;
	@FindBy(xpath="//span[@class='menu-button' and text()='CM']") private WebElement CreateCMButton;
	@FindBy(xpath="//span[@class='menu-button' and text()='FPM']") private WebElement CreateFPMButton;
	@FindBy(xpath="//span[@class='menu-button' and text()='PCF']") private WebElement CreatePCFButton;
	@FindBy(xpath="//span[@class='menu-button' and text()='CCF']") private WebElement CreateCCFButton;
	@FindBy(xpath="//span[@class='menu-button' and text()='BPM']") private WebElement CreateBPMButton;
	@FindBy(xpath="//span[text()='Create CM']") private WebElement ChooseCM;
	@FindBy(xpath="//span[text()='Create FPM']") private WebElement ChooseFPM;
	@FindBy(xpath="//span[text()='Create PCF']") private WebElement ChoosePCF;
	@FindBy(xpath="//span[text()='Create CCF']") private WebElement ChooseCCF;
	@FindBy(xpath="//span[text()='Create BPM']") private WebElement ChooseBPM;
	@FindBy(xpath="//div[@id='mui-component-select-Status']") private WebElement WIStatus;

	
	@FindAll({@FindBy(xpath = "//div[@class='MuiListItemIcon-root css-1qnrdj-MuiListItemIcon-root']")})private List<WebElement> Utilities;

	String WorkItemName = "Sopan";
	
	private WebDriverWait wait;
	public Dashboard_GUI_Validation()
	{ 
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(4));	
	} 
	
	public void verifyVerticalPannel() throws Exception
	{
		MenuIcon.click();
		Assert.assertEquals(Utilities.size(),5);
		CAIDRecommendation.click();
		driver.findElement(By.xpath("//span[@class='header-text' and text()='CAID Recommendation']"));
		TataPlayLogo.click();
		CAIDUtility.click();
		driver.findElement(By.xpath("//h4[text()='CAID Utility']"));
		TataPlayLogo.click();
		TPPackLaunch.click();
		driver.findElement(By.xpath("//h4[text()='Tata Play Pack Launch Details']")).click();
		Dashboard.click();
		Reports.click();
		driver.findElement(By.xpath("(//span[text()='Reports'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='FPM Reports']"));
		ClosePannelIcone.click();
	} 
	public void verifyHeaderMenus() throws Exception
	{
		String DefaultProjectName = defaltProjectArea.getText();
		ChangeProjectIcon.click();
		String SecondProjectName = SecondProject.getText();
		Assert.assertEquals(SecondProjectName,DefaultProjectName,"second project should be Default project");
		String FirstProjectName = firstProject.getText();
		Assert.assertEquals(FirstProjectName,"Tata Play Business IT Requirement Management");
		firstProject.click();
		ChangedProjectArea.isDisplayed();
		ChangeProjectIcon.click();
		Assert.assertEquals(SecondProjectName,"NTO 3 Project Area");
		firstProject.click();
		Thread.sleep(1500);
		UniversalSearchBox.sendKeys("star");
		driver.findElement(By.xpath("//*[contains(text(),'39253')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//h6[text()='39253 : CM -STAR Maa']"));
		UserProfile.click();
		LogoutUser.click();
		driver.findElement(By.xpath("//span[text()='Welcome to Channel and Pack Management']"));
		
	}
	
	public void formValidation() throws InterruptedException
	{
		CreateCMButton.click();
		ChooseCM.click();
		driver.findElement(By.xpath("//h6[text()='CM : Creation']"));
		CancelButton.click();
		CreateFPMButton.click(); 
		ChooseFPM.click();
		driver.findElement(By.xpath("//h6[text()='FPM : Creation']"));
		CancelButton.click();
		CreateBPMButton.click();
		ChooseBPM.click();
		driver.findElement(By.xpath("//h6[text()='BPM : Creation']"));
		CancelButton.click();
		CreatePCFButton.click();
		ChoosePCF.click();
		driver.findElement(By.xpath("//h6[text()='PCF : Creation']"));
		CancelButton.click();
		CreateCCFButton.click();
		ChooseCCF.click();
		driver.findElement(By.xpath("//h6[text()='CCF : Creation']"));
		CancelButton.click();
	} 
	
	public void verifiTables() throws Exception
	{	
		List<WebElement> Tables = driver.findElements(By.xpath("//table[@aria-label='a dense table']"));
		int count= Tables.size();
		Assert.assertEquals(count,6,"tables count Should be 6");
		List<WebElement> DownloadIcons = driver.findElements(By.xpath("//*[@data-testid='DownloadIcon']"));
		int count2= DownloadIcons.size();
		Assert.assertEquals(count2,count,"DownloadIcons count Should be 6");
//		for (WebElement Icon : DownloadIcons)
//		{
//			Icon.click();
//			driver.findElement(By.xpath("//div[contains(text(),'Excel Export For ')]"));
//			Thread.sleep(3000);
//		} 
		List<WebElement> Filters = driver.findElements(By.xpath("//*[@data-testid='FilterAltOutlinedIcon']"));
		int count3= Filters.size();
		Assert.assertEquals(count3,count+1,"Filters count Should be 6");
		
		driver.findElement(By.xpath("//th[contains(text(),'Channel Master - Draft')]"));
		driver.findElement(By.xpath("//th[contains(text(),'Backend Pack Master - Draft')]"));
		driver.findElement(By.xpath("//th[contains(text(),'Package Creation Form - Draft')]"));
		driver.findElement(By.xpath("//th[contains(text(),'Frontend Pack Master - Draft')]"));
//		driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowRightIcon'])[1]")).click();
		driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowRightIcon'])[2]")).click();
		driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowRightIcon'])[3]")).click();
		driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowRightIcon'])[4]")).click();
		List<WebElement> ScecondPage = driver.findElements(By.xpath("//p[contains(text(),'7–12 of ')]"));
		int count4= ScecondPage.size();
//		Assert.assertEquals(count4,4,"SecondPage count Should be 4");
//		driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowLeftIcon'])[1]")).click();
		driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowLeftIcon'])[2]")).click();
		driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowLeftIcon'])[3]")).click();
		driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowLeftIcon'])[4]")).click();
		List<WebElement> FirstPage = driver.findElements(By.xpath("//p[contains(text(),'1–6 of ')]"));
		int count5= FirstPage.size();
//		Assert.assertEquals(count5,count,"FirstPage count Should be 6");
//		driver.findElement(By.xpath("//th[text()='CCF']"));
		
	} 
//	public void verifyUser() throws InterruptedException
//	{
//		WebElement icone = driver.findElement(By.xpath("//button[@aria-label='open user profile']"));
//		icone.isDisplayed();
//	} 
//	public void verifyProjectAreaName() throws Exception
//	{
//		WebElement projrctArea = driver.findElement(By.xpath("//h6[@class='MuiTypography-root MuiTypography-h6 css-10ll70-MuiTypography-root']"));
//		String name = projrctArea.getText();
//		boolean isEqual = name.equals("Project Area Name"); 
//        // Print the result
//        if (isEqual) {
//            System.out.println("The result is equal.");
//        } else {
//        	throw new Exception("Failed because result is not equal.");
//        }
//		
//	} 
	public void openCMForm() throws Exception 
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreateCMButton)).click();
//		wait.until(ExpectedConditions.elementToBeClickable(ChooseCM)).click();
		ChooseCM.click();
		driver.findElement(By.xpath("//h6[text()='CM : Creation']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Created By']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Creation Date']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Modified Date']"));
	} 
	public void openFPMForm() throws Exception
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreateFPMButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(ChooseFPM)).click();
		driver.findElement(By.xpath("//h6[text()='FPM : Creation']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Created By']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Creation Date']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Modified Date']"));
//		Select Options = new Select(WIStatus);
//		String status = Options.getFirstSelectedOption().getText();
//		Assert.assertEquals(status,"Uninitialized","Uninitialized- Unexpected Status");
	} 
	public void openBPMForm() throws Exception
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreateBPMButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(ChooseBPM)).click();
		driver.findElement(By.xpath("//h6[text()='BPM : Creation']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Created By']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Creation Date']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Modified Date']"));
//		Select Options = new Select(WIStatus);
//		String status = Options.getFirstSelectedOption().getText();
//		Assert.assertEquals(status,"Uninitialized","Uninitialized- Unexpected Status");
	} 
	public void openPCFForm() throws Exception
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreatePCFButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(ChoosePCF)).click();
		driver.findElement(By.xpath("//div[@aria-label='Package Name/EAI Reference Name']//input"));
		SaveButton.isEnabled();
		driver.findElement(By.xpath("//h6[text()='PCF : Creation']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Created By']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Creation Date']"));
		driver.findElement(By.xpath("//p[ text() =' - ' and @aria-label='Modified Date']"));
//		Select Options = new Select(WIStatus);
//		String status = Options.getFirstSelectedOption().getText();
//		Assert.assertEquals(status,"Uninitialized","Uninitialized- Unexpected Status");
	} 
	public void openCCFForm() throws Exception
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreateCCFButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(ChooseCCF)).click();
		List<WebElement> CCFDetails = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-sf1wrq-MuiTypography-root']"));
		int count= CCFDetails.size();
		Assert.assertEquals(count,2,"CCFDetails count Should be 2");
		driver.findElement(By.xpath("//h6[text()='CCF : Creation']"));
		driver.findElement(By.xpath("//input[@placeholder='Search ...']"));
	} 
	public void OpenCMwithName() throws Exception
	{
		Thread.sleep(3000);
		SearchBox.sendKeys("CM - "+WorkItemName+"");
		SearchBox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
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
