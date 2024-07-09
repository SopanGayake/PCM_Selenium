package FunctionalFlow;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class FPMtoPCFAutomation extends TestBase{
	
	public static String FPMName = "FPM TO PCF3";
	String Price = "100";
	String IntValue = "ABC";
	public static String  CM_WIID = "58928";
	String WI_ID;
	private WebDriverWait wait;
	
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement UniversalSearchBox;
	@FindBy(xpath="//div[@aria-label='Pack Name']//input") private WebElement FormName;
	@FindBy(xpath="//button[text()='Save']") private WebElement SaveButton;
	@FindBy(xpath="//*[@aria-label='Refresh']") private WebElement RefreshButton ;
	@FindBy(xpath="//button[text()='Cancel']") private WebElement CancelButton;
	@FindBy(xpath="(//button[text()='Save'])[2]") private WebElement SaveModulButton;
	@FindBy(xpath="//select[@aria-label='Type of Pack'and @name='3011']") private WebElement TypeOfPack;
	@FindBy(xpath="//select[@aria-label='Unit of Measure (UoM)']") private WebElement UnitOfMeasureFPM;
	@FindBy(xpath="//select[@aria-label='Unit Of Measure(UoM)']") private WebElement UnitOfMeasurePCF;
	@FindBy(xpath="(//a[contains(@href,'/cpm/form/PCF')])[2]") private WebElement LinkedPCF;
	@FindBy(xpath="//div[@aria-label='Link to FPM']//div[@class='MuiBox-root css-70qvj9']") private WebElement LinkedFPM;
	@FindBy(xpath="//select[@aria-label='Package Charge Type']") private WebElement PackageChargeDD;
	@FindBy(xpath="//textarea[@aria-label='GL Code']") private WebElement GLCode;
	@FindBy(xpath="//input[@aria-label='Total Channel Count']") private WebElement ChannelCount;
	@FindBy(xpath="(//input[@aria-label='LDP Pack Price'])[2]") private WebElement LDPPackPrice2;
	@FindBy(xpath="//input[@aria-label='LDP Pack Price']") private WebElement LDPPackPrice;
	@FindBy(xpath="//input[@aria-label='Box Price']") private WebElement BoxPrice;
	@FindBy(xpath="//input[@aria-label='Combo Price']") private WebElement ComboPrice;
	@FindBy(xpath="//textarea[@aria-label='Remark-Price Detail (x days)']") private WebElement RemarkPrice;

	@FindBy(xpath="//a[@aria-label='Broadcaster Approval']") private WebElement BroadcasterUtility;
	@FindBy(xpath="//a[@aria-label='TP Curated Approval']") private WebElement TPPackUtility;
	@FindBy(xpath="//a[@aria-label='EPG Approval']") private WebElement EPGUtility;
	@FindBy(xpath="//*[@data-testid='KeyboardBackspaceIcon']") private WebElement BackFromUtility;
	@FindBy(xpath="//*[@data-testid='CloseIcon']") private WebElement CloseModule;
	@FindBy(xpath="//*[@aria-label='Scroll To Top']") private WebElement ScrollToTop;
	@FindBy(xpath="//button[text()='Ok']") private WebElement OKButton;
	@FindBy(xpath="//a[@aria-label='EPG Approval']") private WebElement CAIDUtiliti;
	@FindBy(xpath="//textarea[@aria-label='Comments']") private WebElement CMComment;
	@FindBy(xpath="(//textarea[@aria-label='Comments'])[2]") private WebElement BPMComment;
	@FindBy(xpath="//*[@aria-label='Scroll To Top']") private WebElement GotoTop;
	@FindBy(xpath="//p[text()='Channel Details']") private WebElement ChanneldetailsTab ;
	@FindBy(xpath="//p[text()='Frontend Pack Master']") private WebElement FrontendPackTab ;
	@FindBy(xpath="//p[text()='Eligibility Account Type-Sub Type']") private WebElement EligibilityAccountTab;
	@FindBy(xpath="//p[text()='Charging Account Type-Sub Type']") private WebElement ChargingAccountTab;
	@FindBy(xpath="//div[@aria-label='ALC FPM in which channel available']/child::div") private WebElement ALCFPM ;
	@FindBy(xpath="//div[@aria-label='ALC Backend Packs in which Channel available']/child::div") private WebElement ALCBPM ;
	@FindBy(xpath="//textarea[@aria-label='Channel Name List']") private WebElement ChannelNameList ;
	@FindBy(xpath="//input[@placeholder='Search ...']") private WebElement SearchBox;
	@FindBy(xpath="//select[@aria-label='Eligible for Multi TV Price Calculation']") private WebElement EligibleMultiTVPriceCalculation;
	@FindAll({@FindBy(xpath = "(//div[@id='panel1a-content'])[2]//div[@class='link-wrapper MuiBox-root css-bivkl']")})private List<WebElement> SecondSectionChannels;
	@FindAll({@FindBy(xpath = "//input[contains(@aria-label,'Friendly')]")})private List<WebElement> FriendlyNames;

	public FPMtoPCFAutomation()
	{  
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(4));	
	} 

	public void HandelWindow() throws Exception
	{
		Thread.sleep(2000);
		SearchBox.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String originalWindowHandle = iterator.next();
        String newWindowHandle = iterator.next();
        driver.switchTo().window(newWindowHandle);
	}
	public void CreatedFPM() throws Exception
	{
		Thread.sleep(3000);
		SearchBox.sendKeys(FPMName);
		HandelWindow();
		FrontendPackTab.click();
		driver.findElement(By.xpath("//div[text()='Draft']"));
		
	}
	public void CreatedPCF() throws Exception
	{
		Thread.sleep(3000);
		SearchBox.sendKeys(FPMName+" ");
		HandelWindow();
		driver.findElement(By.xpath("//div[text()='Draft']"));
	
	}
	public void OpenReports() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@d='M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z']")).click();		
		driver.findElement(By.xpath("//span[text()='Reports']")).click();
		driver.findElement(By.xpath("//button[text()='IT Config Reports']")).click();		
	}
	//Test Methods
	public void CreateNewFPM() throws InterruptedException  //If Type of Pack: ALC Then Unit Of Measure (UoM):=Monthly

	{
		Thread.sleep(2000);
		FormName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
//		FPMName += System.currentTimeMillis();
		FormName.sendKeys(FPMName);
		Select dropdown = new Select(TypeOfPack);
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("ALC");
		
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click(); 
		Thread.sleep(1000);
		
		String selectedOption = dropdown.getFirstSelectedOption().getText();
		System.out.println(selectedOption);
		Assert.assertEquals(selectedOption,"ALC","ALC- Unexpected Status");
		RefreshButton.click();
		
		Select dropdown2 = new Select(UnitOfMeasureFPM);
		String selectedOption2 = dropdown2.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption2,"Monthly","UOM- Unexpected Status");
		driver.findElement(By.xpath("(//input[@aria-label='Duration (In Days)'and @value='30'])[1]"));
	}
	public void FPMDefaultValuesYes() throws Exception
	{
        List<String> YesLabels = new ArrayList<>(Arrays.asList(
        		"Residential",
                "Regular",
                "Cat A",
                "Employee1",
                "Technology",
                "Bulk SL",
                "EDI Regular",
                "Associate Paying",
                "Cat B1",
                "Cat B2",
                "Cat B3",
                "Tata Play Employee",
                "Star Group",
                "Tata Play",
                "Business Associates",
                "Tata Group"));
		EligibilityAccountTab.click();
        for (String label : YesLabels) {
        	Select element = new Select(driver.findElement(By.xpath("//select[@aria-label='"+label+"']")));
        	String value = element.getFirstSelectedOption().getText();
            if (!"Yes".equals(value)) {
            System.out.println("The value for label '" +element.getFirstSelectedOption().getText()+ "'");            }else {System.out.println("The value for label '" +element.getFirstSelectedOption().getText()+ "'");}
        }
        ChargingAccountTab.click();
        for (String label : YesLabels) {
        	Select element = new Select(driver.findElement(By.xpath("//select[@aria-label='"+label+"']")));
        	String value = element.getFirstSelectedOption().getText();
        	if (!"Yes".equals(value)) {
        		System.out.println("The value for label '" +element.getFirstSelectedOption().getText()+ "'");            }else {System.out.println("The value for label '" +element.getFirstSelectedOption().getText()+ "'");}
        }
	}
	public void FPMDefaultValuesNo() throws Exception
	{
		List<String> NoLabels = new ArrayList<>(Arrays.asList(
            "VVIP Paying",
            "Promotional",
            "Distributor",
            "ISP Demo",
            "Modern Trade",
            "VVIP Non-Paying",
            "Promotional School",
            "Associate Non-Paying",
            "Dealer"));
		EligibilityAccountTab.click();
		for (String label : NoLabels) {
			Select element = new Select(driver.findElement(By.xpath("//select[@aria-label='"+label+"']")));
			String value = element.getFirstSelectedOption().getText();
			if (!"No".equals(value)) {
				System.out.println("The value for label "+element.getFirstSelectedOption().getText());}       
		}
		ChargingAccountTab.click();
		for (String label : NoLabels) {
			Select element = new Select(driver.findElement(By.xpath("//select[@aria-label='"+label+"']")));
			String value = element.getFirstSelectedOption().getText();
			if (!"No".equals(value)) {
			System.out.println("The value for label "+element.getFirstSelectedOption().getText());}       
		}
	}
	public void FPMDefaultValuesZero() throws Exception
	{
		List<String> ZeroLabels = new ArrayList<>(Arrays.asList(
            "Missed Call No.",
            "Binge OTT Price",
            "Box Price charged",
            "DBR",
            "Annual Price",
            "Sum of Component",
            "Box Price",
            "Binge Equivalent MRP (1 Month)",
            "PRODUCT_MRP",
            "Netflix Discounting GL",
            "Final NCF Value",
            "APV Offer ID",
            "Multi TV Content MBR",
            "HD Count",
            "Finance OTT Price",
            "Finance Netflix OTT Price",
            "Quarterly Price",
            "Eligible Accounts",
            "Total Channel Count",
            "Discount Value",
            "Finance NCF Price",
            "Finance Services Price",
            "Free for 1st X days (duration)",
            "LDP Pack Price",
            "Biennial Price",
            "Post free period duration",
            "Monthly NRC pack Price",
			"Semi-Annual/TSS NRC : Price",
            "Finance Linear Content Price" ));
		for (String label : ZeroLabels) {
			WebElement element = driver.findElement(By.xpath("//input[@aria-label='"+label+"']"));
			Assert.assertEquals(element.getAttribute("value"),"0","The value for label '"+element.getAttribute("value")+"'");
		}
	}
	public void DefaultValuesForFPMandPCF() throws Exception
	{
		FrontendPackTab.click();
		Select IsTraiEnable = new Select(driver.findElement(By.xpath("//select[@aria-label='Is Trai Enable Flag']")));
		Assert.assertEquals(IsTraiEnable.getFirstSelectedOption().getText(),"No","The value for label '"+IsTraiEnable.getFirstSelectedOption().getText()+"'");
		IsTraiEnable.selectByVisibleText("Yes");
		SaveButton.click();
		Thread.sleep(1000);
		String selectedOption2 = IsTraiEnable.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption2,"Yes","Is Trai Enable- Unexpected Status");
		IsTraiEnable.selectByVisibleText("No");
		SaveButton.click();
		Thread.sleep(1000);
		Select PackVariation = new Select(driver.findElement(By.xpath("//select[@aria-label='Pack Variation']")));
		Assert.assertEquals(PackVariation.getFirstSelectedOption().getText(),"New Price Variation+New Content Variation","The value for label '"+PackVariation.getFirstSelectedOption().getText()+"'");
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Ala carte' and @checked]"));
		CreatedPCF();
		Select dropdown6 = new Select(driver.findElement(By.xpath("//select[@aria-label='Is Trai Enable Flag']")));
		String selectedOption6 = dropdown6.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption6,"No","Is Trai Enable- Unexpected Status");
		driver.findElement(By.xpath("//textarea[text()='As per FPM ID']"));
		driver.findElement(By.xpath("//textarea[@aria-label='Package Contents (Channel Names)' and text()='As per FPM ID']"));
	}
	public void PCFDefaultValuesZero() throws Exception
	{
		CreatedPCF();
		List<String> ZeroLabels = new ArrayList<>(Arrays.asList(
            "Mobile No.",
            "No Of Channels in the package(Count)",
            "Duration(In Days)",
            "Charging Price for RC Pack New",
            "#New Daily Burn Date (DBR)",
            "#Rev New DBR after x days",
            "Discount Value",
            "Daily Burn Date (DBR Roundoff Reference)",
            "LDP Pack Price",
            "Price",
            "Finance Linear Content Price",
            "Finance NCF Price",
            "Finance OTT Price",
            "Finance Netflix OTT Price",
            "Netflix Discounting GL",
            "Binge OTT price",
            "Discounted Box Price",
            "Combo Price",
            "Box Price",
            "Discount on Box",
            "Selfcare display Price",
            "#Duration to be played at Nuance",
            "#NRC Price to be displayed",
            "Durationa(In Days)",
            "Impact Analysis and Approach",
            "Design",
            "Dev and Unit Testing",
            "Support for E2E/UAT",
            "E2E Testing",
            "Functional Walkthrough",
            "Deployment",
            "User Training",
            "Training Environment",
            "Total",
            "Discussion"
	        ));
		for (String label : ZeroLabels) {
			System.out.println(label);
			WebElement element = driver.findElement(By.xpath("//input[@aria-label='"+label+"']"));
			Assert.assertEquals(element.getAttribute("value"),"0","The value for label '"+element.getAttribute("value")+"'");
		}
	}
	public void AttachedPCF()
	{
		driver.findElement(By.xpath("//input[@value='"+FPMName+"']"));
		
		Select dropdown = new Select(driver.findElement(By.xpath("(//select[@aria-label='Type of Pack'])[1]")));
		String selectedOption = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption,"A-la-carte","Type of Pack- Unexpected Status");
		
		Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@aria-label='Retrofit Credit for Mega Pack']")));
		String selectedOption2 = dropdown2.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption2,"No","Retrofit Credit- Unexpected Status");
		
		Select dropdown3 = new Select(driver.findElement(By.xpath("//select[@aria-label='Unit Of Measure(UoM)']")));
		String selectedOption3 = dropdown3.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption3,"Monthly","UOM- Unexpected Status");
		
		Select dropdown4 = new Select(driver.findElement(By.xpath("//select[@aria-label='Retrofit Flag']")));
		String selectedOption4 = dropdown4.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption4,"No","Retrofit Flag- Unexpected Status");
		
//		Select dropdown5 = new Select(driver.findElement(By.xpath("//select[@aria-label='Eligible for Multi TV Price Calculation']")));
//		String selectedOption5 = dropdown5.getFirstSelectedOption().getText();
//		Assert.assertEquals(selectedOption5,"Y","Eligible for Multi- Unexpected Status");
		
		Select dropdown6 = new Select(driver.findElement(By.xpath("//select[@aria-label='PDM UoM']")));
		String selectedOption6 = dropdown6.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption6,"Monthly","PDM UoM- Unexpected Status");
		
		Select dropdown7 = new Select(driver.findElement(By.xpath("//select[@aria-label='Discount Type']")));
		String selectedOption7 = dropdown7.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption7,"FLAT","Discount Type- Unexpected Status");
		
		Select dropdown8 = new Select(driver.findElement(By.xpath("//select[@aria-label='Is Trai Enable Flag']")));
		String selectedOption8 = dropdown8.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption8,"N","Is Trai Enable Flag- Unexpected Status");
		
		Select dropdown9 = new Select(driver.findElement(By.xpath("//select[@aria-label='Subscription allowed via SMS']")));
		String selectedOption9 = dropdown9.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption9,"Yes","Subscription allowed- Unexpected Status");
		
		Select dropdown10 = new Select(driver.findElement(By.xpath("//select[@aria-label='Subscription changes for Missed Call']")));
		String selectedOption10 = dropdown10.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption10,"Yes","Subscription changes- Unexpected Status");
		
		LinkedFPM.isDisplayed();
		driver.findElement(By.xpath("(//input[@aria-label='Duration (In Days)'and @value='30'])[1]"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("(//input[@aria-label='Duration (In Days)'and @value='30'])[2]"));
		driver.findElement(By.xpath("//input[@aria-label='Lock-in period (in days)' and @value='0']"));
		driver.findElement(By.xpath("//input[@aria-label='Alignable Pack' and @value='No']"));
		driver.findElement(By.xpath("//input[@aria-label='#Package Dashboard Category' and @value='"+FPMName+" alc pack']"));
		driver.findElement(By.xpath("//textarea[@aria-label='Pack Name to be displayed in SC' and text()='"+FPMName+"']"));
		driver.findElement(By.xpath("//input[@class='PrivateSwitchBase-input css-1m9pwf3' and @value='Yes' and @checked]"));
		driver.findElement(By.xpath("//input[@aria-label='#Pack Display Name' and @value='"+FPMName+"']"));

	}
	public void FriendlyValuesMapping() throws Exception
	{
		for (WebElement element : FriendlyNames)
		{
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			element.sendKeys(element.getAttribute("aria-label"));
		}
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='ALC WhatsApp No.']")).sendKeys("1");
		LinkedPCF.click();
		Thread.sleep(1000);
		for (WebElement element : FriendlyNames)
		{
			Assert.assertEquals(element.getAttribute("value"),element.getAttribute("aria-label"),"StrValue is not Updating");
		}
	}
	public void FPMtoPCFDirectValue() throws Exception
	{
		WebElement MonthlyPriceFiled = driver.findElement(By.xpath("//input[@aria-label='Monthly Pack Price']"));
		MonthlyPriceFiled.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		MonthlyPriceFiled.sendKeys(Price);
		
		WebElement DasLevelDD = driver.findElement(By.xpath("//select[@aria-label='DAS Level Validation']"));
		Select DasValue = new Select(DasLevelDD);
		DasValue.selectByVisibleText("Unassigned");
		DasValue.selectByVisibleText("DAS 4");
				
		WebElement PremiumChannel= driver.findElement(By.xpath("//input[@name='3018']"));
		if (PremiumChannel.getAttribute("value").toString().equals("true")) 
		{
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			Thread.sleep(500);
			PremiumChannel.click();
		}
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(500);
		PremiumChannel.click();
		
		WebElement RentalFlagDD = driver.findElement(By.xpath("//select[@aria-label='Rental Flag']"));
		Select RentalFlagValue = new Select(RentalFlagDD);
		RentalFlagValue.selectByVisibleText("No");
		RentalFlagValue.selectByVisibleText("Yes");
		
		WebElement PayableFlagDD = driver.findElement(By.xpath("//select[@aria-label='Payable Flag']"));
		Select PayableFlagvalue = new Select(PayableFlagDD); 
		PayableFlagvalue.selectByVisibleText("Yes");
		PayableFlagvalue.selectByVisibleText("No");
		
		WebElement TobemSalesDD = driver.findElement(By.xpath("//select[@aria-label='To be made available for Dealers in mSales']"));
		Select TobemSalesDDvalue = new Select(TobemSalesDD);
		TobemSalesDDvalue.selectByVisibleText("Yes"); 
		TobemSalesDDvalue.selectByVisibleText("No");
		
		WebElement SubscriberTypeDD = driver.findElement(By.xpath("//select[@aria-label='Subscriber Type (New/Existing)']"));
		Select SubscriberTypeValue = new Select(SubscriberTypeDD);
		SubscriberTypeValue.selectByVisibleText("Unassigned");
		SubscriberTypeValue.selectByVisibleText("For New Customers (Acquistion)");
		
		WebElement PackVariationDD = driver.findElement(By.xpath("//select[@aria-label='Pack Variation']"));
		Select PackVariationvalue = new Select(PackVariationDD);
		PackVariationvalue.selectByVisibleText("Unassigned");
		PackVariationvalue.selectByVisibleText("New Content Variation");

		WebElement ChannelPartFTADD = driver.findElement(By.xpath("//select[@aria-label='Channel to be part of FTA']"));
		Select ChannelPartFTAValue = new Select(ChannelPartFTADD);
		ChannelPartFTAValue.selectByVisibleText("No");
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@aria-label='FTA Packs' and not(text())]")).getText();
		
		ChannelPartFTAValue.selectByVisibleText("Yes");
		SaveButton.click();
		Thread.sleep(1000);
		String FTAPacksFieldTxt = driver.findElement(By.xpath("//textarea[@aria-label='FTA Packs']")).getText();
		String subString = FTAPacksFieldTxt.substring(0,28);
		Assert.assertEquals(subString,"FTA Complimentary Feb19 Pack","FTA Packs- Unexpected Status");

		WebElement BingeIntegrationID = driver.findElement(By.xpath("//input[@aria-label='Binge Integration ID']"));
		BingeIntegrationID.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		BingeIntegrationID.sendKeys("2323");
		
		WebElement NetflixIntegration = driver.findElement(By.xpath("//input[@aria-label='Netflix Integration ID (Bundle ID)']"));
		NetflixIntegration.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		NetflixIntegration.sendKeys("3232");
		driver.findElement(By.xpath("//input[@aria-label='Multi TV Content MBR' and @value='"+Price+"']"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveButton.click();
		Thread.sleep(1000);
		CancelButton.click();

		CreatedPCF();
		driver.findElement(By.xpath("//input[@aria-label='Old MBR'and @value='"+Price+"']"));
		driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC OTT Pack' and @value='"+Price+"']"));
		
		WebElement DASLevelValidationPCF = driver.findElement(By.xpath("//select[@aria-label='DAS Level Validation']"));
		Select DasLevelValue = new Select(DASLevelValidationPCF);
		String selectedOption = DasLevelValue.getFirstSelectedOption().getText();
		Assert.assertEquals("DAS 4",selectedOption,"DAS 4- Unexpected Status");
		
		
		WebElement RentalFlagDD2 = driver.findElement(By.xpath("//select[@aria-label='Rental Flag']"));
		Select RentalFlagDD2Value = new Select(RentalFlagDD2);
		String selectedOption14 = RentalFlagDD2Value.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption14,"Yes","Rental Flag- Unexpected Status");
		
		WebElement PayableFlagDD2 = driver.findElement(By.xpath("//select[@aria-label='Payable Flag']"));
		Select PayableFlagDD2Value = new Select(PayableFlagDD2);
		String selectedOption5 = PayableFlagDD2Value.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption5,"No","Payable Flag- Unexpected Status");
		
		WebElement TobemademSales = driver.findElement(By.xpath("//select[@aria-label='To be made available for dealers in mSales']"));
		Select TobemademSalesValue = new Select(TobemademSales);
		String selectedOption6 = TobemademSalesValue.getFirstSelectedOption().getText(); 
//		Assert.assertEquals(selectedOption6,"No","To be made available- Unexpected Status");
		
		WebElement SubscriberTypeDD2 = driver.findElement(By.xpath("//select[@aria-label='Subscriber Type (New/Existing)']"));
		Select SubscriberTypeDD2Value = new Select(SubscriberTypeDD2);
		String selectedOption7 = SubscriberTypeDD2Value.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption7,"For New Customers (Acquistion)","Subscriber Type- Unexpected Status");
		
		WebElement PackVariationDD2 = driver.findElement(By.xpath("//select[@aria-label='Pack Variation']"));
		Select PackVariationDD2Value = new Select(PackVariationDD2);
		String selectedOption8 = PackVariationDD2Value.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption8,"New Content Variation","Pack Variation- Unexpected Status");
		
		WebElement ChannelFTADD = driver.findElement(By.xpath("//select[@aria-label='Channel to be part of FTA']"));
		Select ChannelFTADDValue = new Select(ChannelFTADD);
		String selectedOption9 = ChannelFTADDValue.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption9,"Yes","Channel to be part of FTA- Unexpected Status");
		
		WebElement FTAPacksField2 = driver.findElement(By.xpath("//textarea[@aria-label='FTA Packs']"));
		String fullString = FTAPacksField2.getAttribute("value");
		String subString2 = fullString.substring(0,28);
		Assert.assertEquals(subString2,subString,"FTA Packs- Unexpected Status");
		
	    driver.findElement(By.xpath("//input[@aria-label='Binge Integration ID' and @value='2323']"));
		driver.findElement(By.xpath("//input[@aria-label='Netflix Integration ID (Bundle ID)' and @value='3232']"));
		driver.findElement(By.xpath("//input[@name='2021' and @value='true']"));

	}
	public void MultiTVContentDBR() throws Exception
	{
		//......... multi TV MBR /30 = multi TV DBR
		WebElement MultiTVContent = driver.findElement(By.xpath("//input[@aria-label='Multi TV Content DBR']"));
		MultiTVContent.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		MultiTVContent.sendKeys("6.67");
		
		Select PackageCarges = new Select(PackageChargeDD);
		PackageCarges.selectByVisibleText("Unassigned");
		PackageCarges.selectByVisibleText("NRC based");
		
		WebElement DailyBurnDate = driver.findElement(By.xpath("//input[@aria-label='Daily Burn Date (DBR Roundoff Reference)']"));
		DailyBurnDate.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		DailyBurnDate.sendKeys("2");
		
		WebElement NewChargingPrice = driver.findElement(By.xpath("//input[@aria-label='New Charging Price after x days']"));
		NewChargingPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		NewChargingPrice.sendKeys("23");
				
		SaveButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Daily Burn Date (DBR Roundoff Reference)'and @value='2']"));
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		WebElement SemmiAnnual = driver.findElement(By.xpath("//input[@aria-label='Semi-Annual/TSS NRC : Price']"));
		SemmiAnnual.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		SemmiAnnual.sendKeys("22");
		
		Thread.sleep(1000);
		Select TOP = new Select(TypeOfPack);
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Services");
		
		Select FPMUOM = new Select(UnitOfMeasureFPM);
		FPMUOM.selectByVisibleText("Monthly");
		SaveModulButton.click();
		Thread.sleep(3000);
		CloseModule.click();
		Thread.sleep(1000);

		WebElement ChargingPriceforNRC = driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack']"));
		ChargingPriceforNRC.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		ChargingPriceforNRC.sendKeys("32");
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack' and @value = '22']"));
		PackageCarges.selectByVisibleText("DBR based");
		ChargingPriceforNRC.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		ChargingPriceforNRC.sendKeys("32");
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Multi TV Content DBR'and @value='0']"));
		driver.findElement(By.xpath("//input[@aria-label='Daily Burn Date (DBR Roundoff Reference)'and @value='0']"));
		driver.findElement(By.xpath("//input[@aria-label='Bal Adj. for LDP Packs' and @value ='Yes']"));
		driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack' and @value = '32']"));
		driver.findElement(By.xpath("//input[@aria-label='NRC Price to be displayed' and @value = '32']"));
		driver.findElement(By.xpath("//input[@aria-label='New Charging Price after x days'and @value='23']"));

	}
	public void AnyStateValidation01() throws Exception
	{
		WebElement Field1= driver.findElement(By.xpath("//input[@name='3090' and @value='Goa']"));
		System.out.println(Field1.getAttribute("checked"));
		if (Field1.getAttribute("checked") != null) 
		{
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			Thread.sleep(500); 
			Field1.click();
		}
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(500);
		Field1.click();
		
		WebElement Field2= driver.findElement(By.xpath("//input[@name='3090' and @value='Maharashtra']"));
		if (Field2.getAttribute("checked") != null) 

		{
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			Thread.sleep(500);
			Field2.click();
		}
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(500);
		Field2.click();
		SaveButton.click();
		driver.findElement(By.xpath("//textarea[@aria-label='States Selected' and text()='Goa, Maharashtra']"));
		driver.findElement(By.xpath("//textarea[@aria-label='Any District Level Validation' and contains(text(),'Hingoli') and contains(text(),'North Goa')]"));
		
		LinkedPCF.click();
		driver.findElement(By.xpath("//input[@name='2066' and @value='Maharashtra' and @checked]"));
		driver.findElement(By.xpath("//input[@name='2066' and @value='Goa' and @checked]"));
		driver.findElement(By.xpath("(//textarea[@aria-label='Any District Level Validation' and contains(text(),'Hingoli') and contains(text(),'North Goa')])[2]"));
		driver.findElement(By.xpath("//textarea[@aria-label='Any State Level Validation' and text()='As per Update']"));

	}
	public void SDHDField() throws Exception
	{
		WebElement Dropdown = driver.findElement(By.xpath("//select[@aria-label='SD/HD']"));
		Select Field = new Select(Dropdown);
		Field.selectByVisibleText("HD");
		Field.selectByVisibleText("SD");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		WebElement AnyBox = driver.findElement(By.xpath("//select[@aria-label='Any Box Type (Primary/Best Box) Validation']"));
		Select Values = new Select(AnyBox);
		Values.selectByVisibleText("PVR");
		SaveButton.click();
		Thread.sleep(1000);
		String selectedOption4 = Values.getFirstSelectedOption().getText();
		Assert.assertEquals("All",selectedOption4,"AnyBox All- Unexpected Status");
		
		Field.selectByVisibleText("SD");
		Field.selectByVisibleText("HD");
		Values.selectByVisibleText("HD4K");
		SaveButton.click();
		Thread.sleep(1000);
		String selectedOption5 = Values.getFirstSelectedOption().getText();
		Assert.assertEquals("HD4K",selectedOption5,"AnyBox All- Unexpected Status");
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedPCF.click();
		Thread.sleep(1000);
		WebElement BoxmSalesDD = driver.findElement(By.xpath("//select[@aria-label='Box Validation on mSales']"));
		Select BoxmSalesValue = new Select(BoxmSalesDD);
		String selectedOption3 = BoxmSalesValue.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption3,"HD4K","HD4K- Unexpected Status");
		driver.findElement(By.xpath("//input[@aria-label='Any Box Type (Primary/Best Box) Validation' and @value='HD4K']"));


	}
	public void FreindlyNames() throws Exception
	{
		WebElement Field = driver.findElement(By.xpath("//input[@aria-label='Friendly Name']"));
		Field.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field.sendKeys(FPMName);
		WebElement Field2 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Hindi']"));
		Field2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field2.sendKeys("Hindi");
		WebElement Field3 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Marathi']"));
		Field3.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field3.sendKeys("Marathi");
		WebElement Field4 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Gujarati']"));
		Field4.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field4.sendKeys("Gujarati");
		WebElement Field5 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Bengali']"));
		Field5.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field5.sendKeys("Bengali");
		WebElement Field6 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Odia']"));
		Field6.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field6.sendKeys("Odia");
		WebElement Field7 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Tamil']"));
		Field7.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field7.sendKeys("Tamil");
		WebElement Field8 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Telugu']"));
		Field8.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field8.sendKeys("Telugu");
		WebElement Field9 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Kannada']"));
		Field9.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field9.sendKeys("Kannada");
		WebElement Field10 = driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Malayalam']"));
		Field10.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field10.sendKeys("Malayalam");
		CancelButton.click();

		CreatedPCF();
		driver.findElement(By.xpath("//textarea[@aria-label='Description of Package'and text()='"+FPMName+"']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name'and @value='"+FPMName+"']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Hindi'and @value='Hindi']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Marathi'and @value='Marathi']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Gujarati'and @value='Gujarati']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Bengali'and @value='Bengali']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Odia'and @value='Odia']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Tamil'and @value='Tamil']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Telugu'and @value='Telugu']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Kannada'and @value='Kannada']"));
		driver.findElement(By.xpath("//input[@aria-label='Friendly Name in Malayalam'and @value='Malayalam']"));
		
	}
	public void AnyStateValidation02() throws Exception
	{
		WebElement Field1= driver.findElement(By.xpath("//input[@name='3090' and @value='All India']"));
		if (Field1.getAttribute("checked") != null)  
		{
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			Thread.sleep(500);
			Field1.click();
		}
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(500);
		Field1.click();
		SaveButton.click();
		driver.findElement(By.xpath("//textarea[@aria-label='States Selected' and text()='All India']"));
		driver.findElement(By.xpath("//textarea[@aria-label='Any District Level Validation' and contains(text(),'Dinajpur') and contains(text(),'Nicobars')]"));
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedPCF.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='2066' and @value='All India' and @checked]"));
		driver.findElement(By.xpath("(//textarea[@aria-label='Any District Level Validation' and contains(text(),'Dinajpur') and contains(text(),'Nicobars')])[2]"));
		driver.findElement(By.xpath("//textarea[@aria-label='Any State Level Validation' and text()='All India']"));
		
	}
	public void ChannelCountValidation() throws Exception
	{
		Select dropdown = new Select(TypeOfPack);
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("Broadcaster Bouquet");
		
		WebElement Field1 = driver.findElement(By.xpath("//input[@aria-label='Total Channel Count']"));
		Field1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		Field1.sendKeys(IntValue);
		try {
		    WebElement element = driver.findElement(By.xpath("//span[@id='#40615:FPM - Sun Marathi']"));
		    element.click();
		    SaveButton.click();
			Thread.sleep(2000);
		}catch (Exception e) {	}		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		ChanneldetailsTab.click();
		Thread.sleep(1000);
		
//		List<WebElement> elements = driver.findElements(By.xpath("//span[text()='x']"));
//		for (WebElement element : elements) {
//		    element.click();
//		    Thread.sleep(1000);
//		}
		driver.findElement(By.xpath("//span[@aria-label='Add New Channel']")).click();
		WebElement SearchWI = driver.findElement(By.xpath("(//input[@id='outlined-basic'])[3]"));
		SearchWI.sendKeys("38794");
		driver.findElement(By.xpath("//h6[text()='CM - STAR Plus']")).click();
		SearchWI.clear();
		SearchWI.sendKeys("49596");
		driver.findElement(By.xpath("//h6[text()='CM - Colors']")).click();
		SearchWI.clear();
		SearchWI.sendKeys("49597");
		driver.findElement(By.xpath("//h6[text()='CM - Zee TV']")).click();
		SearchWI.clear();
		SearchWI.sendKeys("39841");
		driver.findElement(By.xpath("//h6[text()='CM -ETV Plus']")).click();
		OKButton.click();
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		FrontendPackTab.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveButton.click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@aria-label='Total Channel Count'and @value='4']"));
//		LinkedPCF.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@aria-label='No. of Channels in the Package (Count)'and @value='4']"));
	}
	public void AddBrdAndALC() throws Exception
	{
		Select dropdown = new Select(TypeOfPack);
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("Tata Play OTT Combo");
		try {
		    WebElement element = driver.findElement(By.xpath("//span[@id='#40615:FPM - Sun Marathi']"));
		    element.click();
		    SaveButton.click();
			Thread.sleep(2000);
		}catch (Exception e) {	}
		try {
			WebElement element = driver.findElement(By.xpath("//span[@id='#51121:FPM - Star Premium Pack Marathi Hindi']"));
			element.click();
			SaveButton.click();
			Thread.sleep(2000);
		}catch (Exception e) {	}
		int count = Integer.parseInt(ChannelCount.getAttribute("value"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//span[@aria-label='ALC FPMs']")).click();
		WebElement SerchBox = driver.findElement(By.xpath("(//input[@id='outlined-basic'])[3]"));
		SerchBox.clear();
		SerchBox.sendKeys("40615");
		Thread.sleep(500);
		driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
		OKButton.click();
		Thread.sleep(1000);
		SaveButton.click();
		Thread.sleep(2000);
		System.out.println(ChannelCount.getAttribute("value"));
		count++;
		String expectedCount = String.valueOf(count);
		Assert.assertEquals(ChannelCount.getAttribute("value"), expectedCount, "Count did not increase by 1");
		driver.findElement(By.xpath("//textarea[@aria-label='Channel Name List' and contains (text(),'Sun Marathi')]"));
		driver.findElement(By.xpath("//textarea[@aria-label='Channel Name List' and contains (text(),'Sun Marathi')]"));
		int count2 = Integer.parseInt(ChannelCount.getAttribute("value"));
		driver.findElement(By.xpath("//span[@aria-label='Broadcaster FPMs']")).click();
		WebElement SerchBox2 = driver.findElement(By.xpath("(//input[@id='outlined-basic'])[3]"));
		SerchBox2.clear();
		SerchBox2.sendKeys("51121");
		Thread.sleep(500);
		driver.findElement(By.xpath("//h6[text()=' : ']/preceding-sibling::span[1]")).click();
		OKButton.click();
		Thread.sleep(1000);
		SaveButton.click();
		Thread.sleep(2000);
		int expectedCount2 = Integer.parseInt(ChannelCount.getAttribute("value"));
		Assert.assertTrue(count2 < expectedCount2, "Actual count is not greater than expected count");
		
		
		List<WebElement> ALCFPMs = driver.findElements(By.xpath("//div[@aria-label='ALC FPMs']//div[@class='MuiBox-root css-70qvj9']"));
		for (WebElement element : ALCFPMs) {
			element.click();
		    Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@aria-label='Impacted TP Packs']//a[contains(text(),'"+FPMName+"')]"));
			 Thread.sleep(1000);
			 CloseModule.click();
		}
		List<WebElement> BRDFPMs = driver.findElements(By.xpath("//div[@aria-label='Broadcaster FPMs']//div[@class='MuiBox-root css-70qvj9']"));
		for (WebElement element : BRDFPMs) {
			element.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@aria-label='Impacted TP Packs']//a[contains(text(),'"+FPMName+"')]"));
			 Thread.sleep(1000);
			 CloseModule.click();
		}
		
	}
	public void PackageDashboardCategory() throws Exception
	{
		Select dropdown = new Select(TypeOfPack);
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("Tata Play Bouquet");
		SaveButton.click();
		Thread.sleep(1000);
		LinkedPCF.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='#Package Dashboard Category for BO Config'and @value='"+FPMName+" TP pack']")).click();
		CloseModule.click();
		
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("ALC");
		SaveButton.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedPCF.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='#Package Dashboard Category for BO Config'and @value='"+FPMName+" alc pack']")).click();
		CloseModule.click();
		
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("Broadcaster Bouquet");
		SaveButton.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedPCF.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='#Package Dashboard Category for BO Config'and @value='"+FPMName+" pack']")).click();
		CloseModule.click();
		
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("Tata Play OTT Soft Bundle");
		SaveButton.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedPCF.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='#Package Dashboard Category for BO Config'and @value='"+FPMName+" Flexi Pack']")).click();
		CloseModule.click();
		
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("ALC_OTT");
		SaveButton.click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedPCF.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='#Package Dashboard Category for BO Config'and @value='"+FPMName+" ALC OTT Pack']")).click();
		CloseModule.click();
	}
	public void SelfcaredisplayPrice() throws Exception
	{
		LinkedFPM.click();
		Thread.sleep(3000);
		Select FPMUOM = new Select(UnitOfMeasureFPM);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("2 Months");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveModulButton.click(); 
		Thread.sleep(2200);
		CloseModule.click();
		
		RefreshButton.click();
		Thread.sleep(2000);
		Select PCFUOM = new Select(UnitOfMeasurePCF);
		String selectedOption2 = PCFUOM.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption2,"2 Months","UOM- Unexpected Status");
		
//		WebElement Dropdown3 = driver.findElement(By.xpath("//select[@aria-label='Package Charge Type']"));
		Select PackageCharge = new Select(PackageChargeDD);
		PackageCharge.selectByVisibleText("Unassigned");
		PackageCharge.selectByVisibleText("DBR based");
		SaveButton.click();
		Thread.sleep(1000);
		String selectedOption3 = PackageCharge.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption3,"DBR based","DBR based- Unexpected Status");
		WebElement Dropdown4 = driver.findElement(By.xpath("//select[@aria-label='Eligible for RoundOff Calculation']"));
		Select Options = new Select(Dropdown4);
		String selectedOption4 = Options.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption4,"Yes","Eligible for RoundOff - Unexpected Status");

		PackageCharge.selectByVisibleText("Unassigned");
		PackageCharge.selectByVisibleText("NRC based");
		SaveButton.click();
		Thread.sleep(1000); 
		String selectedOption5 = PackageCharge.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption5,"NRC based","NRC based- Unexpected Status");
		String selectedOption6 = Options.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption6,"No","Eligible for RoundOff - Unexpected Status");
		
		WebElement ChargingNRC = driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack']"));
		ChargingNRC.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		ChargingNRC.sendKeys(IntValue);
		SaveButton.click();
		Thread.sleep(1000);
		String value = ChargingNRC.getAttribute("value");
		Assert.assertEquals(value,IntValue,"NRC based- Unexpected Status");
		driver.findElement(By.xpath("//input[@aria-label='Selfcare Display Price' and @value='"+value+"']"));
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(3000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Monthly");
		SaveModulButton.click();
		Thread.sleep(2500);
		CloseModule.click();
		RefreshButton.click();
		Thread.sleep(1000);
		
		String selectedOption7 = PCFUOM.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption7,"Monthly","UOM- Unexpected Status");
		
		WebElement ChargingRC = driver.findElement(By.xpath("//input[@aria-label='Charging Price for RC Pack New']"));
		String value2 = ChargingRC.getAttribute("value");
		driver.findElement(By.xpath("//input[@aria-label='Selfcare Display Price' and @value='"+value2+"']"));
		Thread.sleep(1000);
	}
	public void PackagePlacementCatalogue() throws Exception
	{
		LinkedFPM.click();
		Thread.sleep(2000);		
		Select dropdown = new Select(TypeOfPack);
		dropdown.selectByVisibleText("Unassigned");
		dropdown.selectByVisibleText("Tata Play Bouquet");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveModulButton.click();
		Thread.sleep(3000);
		CloseModule.click();
		Thread.sleep(1000);
		WebElement SiebleConfTAB = driver.findElement(By.xpath("//input[@aria-label='Siebel Configurator TAB']"));
		SiebleConfTAB.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		SiebleConfTAB.sendKeys("Pick Pack>xyz");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Package Placement (Catalogue)' and @value='Pick Pack>xyz']"));
		SiebleConfTAB.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		SiebleConfTAB.sendKeys("Pick Package>xyz");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Package Placement (Catalogue)' and @value='Pick Package>xyz']"));
	}
	public void PRODUCT_MRP() throws Exception
	{
		BoxPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		BoxPrice.sendKeys("12");
		LDPPackPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		LDPPackPrice.sendKeys("2");
		ComboPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		ComboPrice.sendKeys("6");
		SaveButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='PRODUCT_MRP'and @value='8']"));
		driver.findElement(By.xpath("//input[@aria-label='PRODUCT_NAME'and @value='Credit towards Rental FeeSplOfr Rs.8.0']"));
		driver.findElement(By.xpath("//input[@aria-label='Box Price charged'and @value='4']"));
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		CancelButton.click();
		
		CreatedPCF();
		driver.findElement(By.xpath("//input[@aria-label='PRODUCT_MRP'and @value='8']"));
		driver.findElement(By.xpath("//input[@aria-label='PRODUCT_NAME'and @value='Credit towards Rental FeeSplOfr Rs.8.0']"));
		driver.findElement(By.xpath("//input[@aria-label='Box Price charged'and @value='4']"));
		driver.findElement(By.xpath("//input[@aria-label='LDP mSales Pack Price'and @value='-6']"));
		
	}
	public void TotalPricePoint() throws Exception
	{
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(1000);
//		List<String> UOMs = List.of("Monthly","Quarterly","Annual","Semi Annual","Biennial");
		Select FPMUOM = new Select(UnitOfMeasureFPM);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Monthly");
		SaveModulButton.click();
		Thread.sleep(2000);
		CloseModule.click();
		Thread.sleep(1000);
		
		WebElement ChargingPriceforRC= driver.findElement(By.xpath("//input[@aria-label='Charging Price for RC Pack New']"));
//		ChargingPriceforRC.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
//		ChargingPriceforRC.sendKeys("36");
//		
//		WebElement field1 =driver.findElement(By.xpath("//input[@aria-label='Siebel Configurator TAB']"));
//		field1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
//		field1.sendKeys("16");
//		SaveButton.click();
//		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//input[@aria-label='Charging Price for RC Pack New'and @value='16']]"));
//		driver.findElement(By.xpath("//input[@aria-label='Package Placement (Catalogue)'and @value='16']"));
//		driver.findElement(By.xpath("//input[@aria-label='Total Price Point'and @value='"+Price+"']"));
		
		ChargingPriceforRC.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		ChargingPriceforRC.sendKeys("36");
		SaveButton.click();
		Thread.sleep(1000);
		String Value = ChargingPriceforRC.getAttribute("value");
		Assert.assertEquals(Value,Price, "ChargingPriceforRC should be Price");

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(1000);
		LinkedFPM.click();
		Thread.sleep(2000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Quarterly");
		
		WebElement field3 =driver.findElement(By.xpath("//input[@aria-label='Quarterly Price']"));
		field3.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		field3.sendKeys("18");
		WebElement field4 =driver.findElement(By.xpath("(//input[@aria-label='PRODUCT_MRP'])[2]"));
		field4.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		field4.sendKeys("10");
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveModulButton.click();
		Thread.sleep(2000);
		CloseModule.click();
		Thread.sleep(1000);
		
		RefreshButton.click();
		driver.findElement(By.xpath("//input[@aria-label='Total Price Point' and @value='8']"));
		ChargingPriceforRC.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		ChargingPriceforRC.sendKeys("36");
		String Value2 = ChargingPriceforRC.getAttribute("value");
		Assert.assertEquals(Value2,"36", "ChargingPriceforRC should be Price");
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(1000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Annual");
		LDPPackPrice2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		LDPPackPrice2.sendKeys("15");
		SaveModulButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Annual Price' and @value='15']"));
		CloseModule.click();
		Thread.sleep(1000);
		
		RefreshButton.click();
		driver.findElement(By.xpath("//input[@aria-label='Total Price Point' and @value='5']"));
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(2000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Semi Annual");
		LDPPackPrice2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		LDPPackPrice2.sendKeys("20");
		SaveModulButton.click();
		driver.findElement(By.xpath("//input[@aria-label='Semi-Annual/TSS NRC : Price' and @value='20']"));
		Thread.sleep(2000);
		CloseModule.click();
		Thread.sleep(1000);
		
		RefreshButton.click();
		driver.findElement(By.xpath("//input[@aria-label='Total Price Point' and @value='10']"));
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(1000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Biennial");
		WebElement field6 =driver.findElement(By.xpath("//input[@aria-label='Biennial Price']"));
		field6.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		field6.sendKeys("21");
		SaveModulButton.click();
		Thread.sleep(2000);
		CloseModule.click();
		Thread.sleep(1000);
		
		RefreshButton.click();
		driver.findElement(By.xpath("//input[@aria-label='Total Price Point' and @value='11']"));
	}
	public void ChargingPriceforNRCPack() throws Exception
	{
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Select FPMUOM = new Select(UnitOfMeasureFPM);
		Thread.sleep(3000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Biennial");
		
		WebElement BiennialPrice = driver.findElement(By.xpath("//input[@aria-label='Biennial Price']"));
		BiennialPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		BiennialPrice.sendKeys("44");
		SaveModulButton.click();
		Thread.sleep(2000);
		CloseModule.click();
		
		RefreshButton.click();
		Thread.sleep(1000);
		Select PCFUOM = new Select(UnitOfMeasurePCF);
		String selectedOption5 = PCFUOM.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption5,"Biennial","UOM- Unexpected Status");
		driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack' and @value = '44']"));
		Thread.sleep(1000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(3000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Annual");
		
		LDPPackPrice2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		LDPPackPrice2.sendKeys("55");
		SaveModulButton.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@aria-label='Annual Price' and @value = '55']"));
		CloseModule.click();
		
		RefreshButton.click();
		Thread.sleep(1000);
		String selectedOption6 = PCFUOM.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption6,"Annual","UOM- Unexpected Status");
		driver.findElement(By.xpath("//input[@aria-label='LDP Pack Price' and @value ='55']"));
		driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack' and @value='55']"));
		Thread.sleep(1000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(3000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Semi Annual");
		
		LDPPackPrice2.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		LDPPackPrice2.sendKeys("66");
		SaveModulButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Semi-Annual/TSS NRC : Price' and @value = '66']"));
		CloseModule.click();
		
		RefreshButton.click();
		Thread.sleep(1000);
		String selectedOption7 = PCFUOM.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption7,"Semi Annual","UOM- Unexpected Status");
		driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack' and @value='66']"));
	
		driver.findElement(By.xpath("//input[@aria-label='LDP Pack Price' and @value ='66']"));
		WebElement LDPmSales = driver.findElement(By.xpath("//input[@aria-label='LDP mSales Pack Price']"));
		WebElement PRODUCTMRP = driver.findElement(By.xpath("//input[@aria-label='PRODUCT_MRP']"));
		int PRODUCTMRPValue = Integer.parseInt(PRODUCTMRP.getAttribute("value"));
		int LDPPackPriceValue = Integer.parseInt(LDPPackPrice.getAttribute("value"));
		Assert.assertEquals(LDPPackPriceValue-PRODUCTMRPValue,Integer.parseInt(LDPmSales.getAttribute("value")));
		Thread.sleep(1000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(3000);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Quarterly");
		
		WebElement QuarterlyPrice = driver.findElement(By.xpath("//input[@aria-label='Quarterly Price']"));
		QuarterlyPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		QuarterlyPrice.sendKeys("77");
		SaveModulButton.click();
		Thread.sleep(2000);
		CloseModule.click();
		
		RefreshButton.click();
		Thread.sleep(1000);
		String selectedOption8 = PCFUOM.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption8,"Quarterly","UOM- Unexpected Status");
		driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack'and @value='77']"));
		Thread.sleep(1000);
	}
	public void ApplicableSources() throws Exception
	{
		String[] ApplicationResources = {"mSales","PRM","Self-Care","App","Nuance"};
		for(String appResource : ApplicationResources) {
			WebElement AppReurces = driver.findElement(By.xpath("//input[@name='3035'and @value='"+appResource+"']"));
			if (AppReurces.getAttribute("checked")!= null)  
			{
				Thread.sleep(300);
				AppReurces.click();
			}
			Thread.sleep(300);
			AppReurces.click();
		}
		SaveButton.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedPCF.click();
		Thread.sleep(3000);
		
		String[] ResourcesFlags = {"To be made available for dealers in mSales","Subscription allowed via PRM","Subscription allowed from SC","App Enabled Flag with values","Subscription allowed via Nuance"};
		for(String ResourcesFlag : ResourcesFlags) {
		WebElement Flags = driver.findElement(By.xpath("//select[@aria-label='"+ResourcesFlag+"']"));	
		Select Options1 = new Select(Flags);
		String selectedOption1 = Options1.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption1,"Yes","ResourcesFlags- Unexpected Status");
		}
		CloseModule.click();
		Thread.sleep(2000);
		for(String appResource2 : ApplicationResources) {
		WebElement AppReurces = driver.findElement(By.xpath("//input[@name='3035'and @value='"+appResource2+"']"));
		Thread.sleep(300);
		AppReurces.click();
		}
		SaveButton.click();
		Thread.sleep(2000);
		
		LinkedPCF.click();
		Thread.sleep(3000);
		for(String ResourcesFlag : ResourcesFlags) {
			WebElement Flags = driver.findElement(By.xpath("//select[@aria-label='"+ResourcesFlag+"']"));	
			Select Options1 = new Select(Flags);
			String selectedOption1 = Options1.getFirstSelectedOption().getText();
			Assert.assertEquals(selectedOption1,"No","ResourcesFlags- Unexpected Status");
		}

	}
	public void EligibleMultiTVCalculation() throws Exception
	{
		Select TOP = new Select(TypeOfPack);
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Services");
		
		Select FPMUOM1 = new Select(UnitOfMeasureFPM);
		FPMUOM1.selectByVisibleText("Unassigned");
		FPMUOM1.selectByVisibleText("Monthly");
		SaveButton.click();
		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedPCF.click();
		Select Options1 = new Select(EligibleMultiTVPriceCalculation);
		String selectedOption1 = Options1.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption1,"N","EligibleMultiTVPriceCalculation- Unexpected Status");
		CloseModule.click();
		Thread.sleep(2000);
		
		String[] UOMs = {"2 Months", "3 Months","4 Months","5 Months","Semi Annual","7 Months","Annual","Biennial","Quarterly","1 week","Other"};
		for(String UOM : UOMs)
		{
			Select FPMUOM = new Select(UnitOfMeasureFPM);
			FPMUOM.selectByVisibleText("Unassigned");
			FPMUOM.selectByVisibleText(UOM);
			SaveButton.click();
			
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			Thread.sleep(3000);
			LinkedPCF.click();
			Select Options = new Select(EligibleMultiTVPriceCalculation);
			String selectedOption = Options.getFirstSelectedOption().getText();
			Assert.assertEquals(selectedOption,"Unassigned","EligibleMultiTVPriceCalculation- Unexpected Status");
			CloseModule.click();
			Thread.sleep(2000);
		}
		String[] TOPs = {"ALC", "ALC_OTT","Tata Play OTT Combo","Tata Play Soft Bundle","Tata Play OTT Soft Bundle","Broadcaster Bouquet","Tata Play Bouquet","DD Bouquet","Multiroom","NCF_TRAI"};
		for(String Top : TOPs)
		{
			Select FPMUOM = new Select(TypeOfPack);
			FPMUOM.selectByVisibleText("Unassigned");
			FPMUOM.selectByVisibleText(Top);
			SaveButton.click();
			
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			Thread.sleep(3000);
			LinkedPCF.click();
			Select Options = new Select(EligibleMultiTVPriceCalculation);
			String selectedOption = Options.getFirstSelectedOption().getText();
			Assert.assertEquals(selectedOption,"Y","EligibleMultiTVPriceCalculation- Unexpected Status");
			CloseModule.click();
			Thread.sleep(2000);
		}
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Bouquet");
		SaveButton.click();
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(3000);
		LinkedPCF.click();
		Select EligibleMultiTVValues = new Select(EligibleMultiTVPriceCalculation);
		String EligibleMultiTVValue = EligibleMultiTVValues.getFirstSelectedOption().getText();
		Assert.assertEquals(EligibleMultiTVValue,"Y","EligibleMultiTVPriceCalculation- Unexpected Status");
		CloseModule.click();
		Thread.sleep(2000);
	}

	public void TataPlayOTTcombo() throws Exception
	{
		Select TOP = new Select(TypeOfPack);
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play OTT Combo");
		
	}
	public void TataPlayBouquet() throws Exception
	{
		Select TOP = new Select(TypeOfPack);
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Bouquet");
		
		Select FPMUOM = new Select(UnitOfMeasureFPM);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("2 Months");
		SaveButton.click();
		Thread.sleep(2500);
		
		
		driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC Pack'and @value='33']"));
		driver.findElement(By.xpath("//input[@aria-label='Multi TV Content DBR'and @value='0']"));
		driver.findElement(By.xpath("//input[@aria-label='Bal Adj. for LDP Packs' and @value ='Yes']"));
		driver.findElement(By.xpath("//input[@aria-label='NRC_DBR after x days'and @value='22']"));
		
		
	}
	public void GLCodeUpdation() throws Exception
	{
		Select TOP = new Select(TypeOfPack);
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Services");
		
		Select FPMUOM = new Select(UnitOfMeasureFPM);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Monthly");
		SaveButton.click();
		Thread.sleep(1000);
		
		LinkedPCF.click();
		Thread.sleep(3000);
		Select PackageCarges = new Select(PackageChargeDD);
		PackageCarges.selectByVisibleText("Unassigned");
		PackageCarges.selectByVisibleText("NRC based");
		SaveModulButton.click();
		Thread.sleep(1000);
		String StringLine = GLCode.getText();
		Assert.assertEquals(StringLine,"NRC component to be mapped to GL 24000004 and RC component to be mapped to GL 43030009.Similarly Credit components towards charging NRC to be mapped to GL 24000004.Daily Charges debit RC component to be mapped to GL 24000004. (“_DB – 43030009” & “_CR – 24000004)");
	
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		Thread.sleep(1000);
		PackageCarges.selectByVisibleText("Unassigned");
		PackageCarges.selectByVisibleText("DBR based");
		SaveModulButton.click();
		Thread.sleep(1000);
		String StringLine1 = GLCode.getText();
		Assert.assertEquals(StringLine1,"RC charging component for DBR to be mapped to 43050000.");
		Thread.sleep(1000);
		CloseModule.click();
		
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play OTT Combo");
		SaveButton.click();
		Thread.sleep(1000);
				
		LinkedPCF.click();
		Thread.sleep(3000);
		PackageCarges.selectByVisibleText("Unassigned");
		PackageCarges.selectByVisibleText("OTT NRC");
		SaveModulButton.click();
		Thread.sleep(1000);
		String StringLine2 = GLCode.getText();
		Assert.assertEquals(StringLine2,"NRC component to be mapped to GL 24000004 and RC component to be mapped to GL 43000017.Similarly Credit components towards charging NRC to be mapped to GL");
		Thread.sleep(1000);
		CloseModule.click();
		
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("ALC_OTT");
		SaveButton.click();
		Thread.sleep(1000);
		
		LinkedPCF.click();
		Thread.sleep(3000);
		PackageCarges.selectByVisibleText("Unassigned");
		PackageCarges.selectByVisibleText("DBR based");
		SaveModulButton.click();
		Thread.sleep(1000);
		String selectedOption2 = PackageCarges.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedOption2,"DBR based","DBR based- Unexpected Status");
		
		String StringLine3 = GLCode.getText();
		Assert.assertEquals(StringLine3,"RC charging component for DBR to be mapped to 43000017","GLCode - Unexpected Status");
		Thread.sleep(1000);
		CloseModule.click();
		
        List<String> UOMs = List.of("Monthly","Quarterly","Annual","Semi Annual");
        for (String UOM : UOMs) {
    		FPMUOM.selectByVisibleText("Unassigned");
    		FPMUOM.selectByVisibleText(UOM);
    		SaveButton.click();
			Thread.sleep(1000);
			
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			LinkedPCF.click();
			Thread.sleep(2000);	
			PackageCarges.selectByVisibleText("Unassigned");
			PackageCarges.selectByVisibleText("NRC based");
			SaveModulButton.click();
			Thread.sleep(1000);
			String StringLine4 = GLCode.getText();
			Assert.assertEquals(StringLine4,"NRC component to be mapped to GL 24000004 and RC component to be mapped to GL 43050000.Similarly Credit components towards charging NRC to be mapped to GL");
			
			driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC OTT Pack' and @value='"+Price+"']"));
			Thread.sleep(1000);
			CloseModule.click();
        }
	}
	public void PackageChageTypeAutomation() throws Exception
	{   
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		LinkedFPM.click();
		Thread.sleep(1000);
		WebElement DBRField = driver.findElement(By.xpath("//input[@aria-label='DBR']"));
		DBRField.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		DBRField.sendKeys("5.6");
		SaveModulButton.click();
		Thread.sleep(2500);
		CloseModule.click();
		
		Select PackageCarges = new Select(PackageChargeDD);
		PackageCarges.selectByVisibleText("Unassigned");
		PackageCarges.selectByVisibleText("NRC based");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='#Credit NRC Component Name' and @value='Credit Towards "+FPMName+"']"));
		driver.findElement(By.xpath("//input[@aria-label='#Debit NRC Description (IT to create every time) This is for forwarding charges' and @value='"+FPMName+" Daily Charges']"));
		WebElement NRCDBR = driver.findElement(By.xpath("//input[@aria-label='NRC_DBR after x days']"));
		NRCDBR.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		NRCDBR.sendKeys("11");
		SaveButton.click();
		Thread.sleep(1000);
		String NRCDBRValue = NRCDBR.getAttribute("value");
		Assert.assertEquals(NRCDBRValue,"5.6","NRCDBRValue- Unexpected Status");
		PackageCarges.selectByVisibleText("DBR based");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveButton.click();
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//input[@aria-label='#Credit NRC Component Name' and @value='Credit Towards "+FPMName+"']"));
		driver.findElement(By.xpath("//input[@aria-label='#Debit NRC Description (IT to create every time) This is for forwarding charges' and @value='"+FPMName+"']"));
		NRCDBR.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		NRCDBR.sendKeys("11");
		SaveButton.click();
		Thread.sleep(1000);
		String NRCDBRValue2 = NRCDBR.getAttribute("value");
		Assert.assertEquals(NRCDBRValue2,"11","NRCDBRValue- Unexpected Status");
		PackageCarges.selectByVisibleText("OTT NRC");
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		SaveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='#Credit NRC Component Name' and @value='']"));
		driver.findElement(By.xpath("//input[@aria-label='#Debit NRC Description (IT to create every time) This is for forwarding charges' and @value='']"));
		NRCDBR.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		NRCDBR.sendKeys("22");
		SaveButton.click();
		Thread.sleep(1000);
		String NRCDBRValue3 = NRCDBR.getAttribute("value");
		Assert.assertEquals(NRCDBRValue3,"22","NRCDBRValue- Unexpected Status");

	}
	public void RemarkPriceXdays() throws Exception
	{   

//		Select FPMUOM = new Select(UnitOfMeasureFPM);
//		FPMUOM.selectByVisibleText("Unassigned");
//		FPMUOM.selectByVisibleText("Monthly");
//		
//		String[] TOPs = {"ALC", "Tata Play Bouquet","Broadcaster Bouquet","Tata Play Services","Tata Play Soft Bundle"};
//		for(String Option:TOPs){
//			Select TOP = new Select(TypeOfPack);
//			TOP.selectByVisibleText("Unassigned");
//			TOP.selectByVisibleText(Option);
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			SaveButton.click();
//			Thread.sleep(1000);
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			LinkedPCF.click();
//			WebElement RCPackNew = driver.findElement(By.xpath("//input[@aria-label='Charging Price for RC Pack New']"));
//			driver.findElement(By.xpath("(//input[@name='2018'])[1]")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("//textarea[@aria-label='Remark-Price Detail (x days)']")).sendKeys("XYZ");
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			SaveModulButton.click();
//			Thread.sleep(2000);
//			String RCPackNewValue = RCPackNew.getAttribute("value");
//			driver.findElement(By.xpath("//textarea[@aria-label='Remark-Price Detail (x days)' and text()='RS"+RCPackNewValue+"PM']"));
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			CloseModule.click();
//		}
		String[] TOPs2 = {"Tata Play OTT Soft Bundle","Tata Play OTT Combo"};
		for(String Option2:TOPs2){
			Select TOP = new Select(TypeOfPack);
			TOP.selectByVisibleText("Unassigned");
			TOP.selectByVisibleText(Option2);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			SaveButton.click();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			LinkedPCF.click();
			WebElement NRCOTTPack = driver.findElement(By.xpath("//input[@aria-label='Charging Price for NRC OTT Pack']"));
			driver.findElement(By.xpath("(//input[@name='2018'])[1]")).click();
			RemarkPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			RemarkPrice.sendKeys("XYZ");
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
			SaveModulButton.click();
			Thread.sleep(2000);	
			String NRCOTTPackValue = NRCOTTPack.getAttribute("value");
			driver.findElement(By.xpath("//textarea[@aria-label='Remark-Price Detail (x days)' and text()='RS"+NRCOTTPackValue+"PM']"));
			CloseModule.click();
		}
//		String[] UOMs = {"Quarterly","Annual","Semi Annual","Biennial","3 Months"};
//		for(String UOM:UOMs){
//			Select FPMUOM2 = new Select(UnitOfMeasureFPM);
//			FPMUOM2.selectByVisibleText("Unassigned");
//			FPMUOM2.selectByVisibleText(UOM);
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			SaveButton.click();
//			Thread.sleep(1000);
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			LinkedPCF.click();
//			driver.findElement(By.xpath("(//input[@name='2018'])[1]")).click();
//			RemarkPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
//			RemarkPrice.sendKeys("XYZ");
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			SaveModulButton.click();
//			Thread.sleep(2000);	
//			driver.findElement(By.xpath("//textarea[@aria-label='Remark-Price Detail (x days)' and contains(text(),'XYZ')]"));
//			CloseModule.click();
//		}
//		// remaining TOPs
//		String[] TOPs3 = {"NCF_TRAI", "Multiroom","DD Bouquet","FTA Bouquet","ALC_OTT"};
//		for(String Option3:TOPs3){
//			Select TOP = new Select(TypeOfPack);
//			TOP.selectByVisibleText("Unassigned");
//			TOP.selectByVisibleText(Option3);
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			SaveButton.click();
//			Thread.sleep(1000);
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			LinkedPCF.click();
//			driver.findElement(By.xpath("(//input[@name='2018'])[1]")).click();
//			RemarkPrice.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
//			RemarkPrice.sendKeys("XYZ");
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			SaveModulButton.click();
//			Thread.sleep(2000);	
//			driver.findElement(By.xpath("//textarea[@aria-label='Remark-Price Detail (x days)' and text()='XYZ']"));
//			CloseModule.click();
//		}
//		Select TOP4 = new Select(TypeOfPack);
//		TOP4.selectByVisibleText("Unassigned");
//		TOP4.selectByVisibleText("Tata Play Soft Bundle");
//		String[] UOMs = {"Quarterly","Annual","Semi Annual","Biennial","3 Months"};
//		for(String UOM:UOMs){
//			Select FPMUOM2 = new Select(UnitOfMeasureFPM);
//			FPMUOM2.selectByVisibleText("Unassigned");
//			FPMUOM2.selectByVisibleText(UOM);
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			SaveButton.click();
//			Thread.sleep(1000);
//			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
//			LinkedPCF.click();
//			WebElement NRCPack = driver.findElement(By.xpath("(//input[@aria-label='Charging Price for NRC Pack'])[2]"));
//			String NRCPackValue = NRCPack.getAttribute("value");
//			System.out.println(NRCPackValue);
//			WebElement DurationInDays = driver.findElement(By.xpath("//input[@aria-label='Duration (In Days)']"));
//			String Days = DurationInDays.getAttribute("value");
//			WebElement ChargingPrice = driver.findElement(By.xpath("//input[@aria-label='New Charging Price after x days']"));
//			String ChargingPriceValue = ChargingPrice.getAttribute("value");
//			driver.findElement(By.xpath("//textarea[@aria-label='Remark-Price Detail (x days)' and contains(text(),'RS"+NRCPackValue+" for "+Days+" days followed by "+ChargingPriceValue+"PM')]"));
//			CloseModule.click();
//		} 

	}
	public void BalAdjForLDPpacks() throws Exception
	{   
		Select TOP = new Select(TypeOfPack);
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Bouquet");
		
		Select FPMUOM = new Select(UnitOfMeasureFPM);
		FPMUOM.selectByVisibleText("Unassigned");
		FPMUOM.selectByVisibleText("Monthly");
		SaveButton.click();
		Thread.sleep(1000);
						
		LinkedPCF.click();
		Thread.sleep(2000);
		Select PackageCarges = new Select(PackageChargeDD);
		PackageCarges.selectByVisibleText("Unassigned");
		PackageCarges.selectByVisibleText("NRC based");
		SaveModulButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Bal Adj. for LDP Packs' and @value='Yes']"));
		Thread.sleep(1000);
		CloseModule.click();
		
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Soft Bundle");
		SaveButton.click();
		Thread.sleep(1000);
		
		LinkedPCF.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Bal Adj. for LDP Packs' and @value='No']"));
		Thread.sleep(1000);
		CloseModule.click();
		
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Services");
		SaveButton.click();
		Thread.sleep(1000);
		
		LinkedPCF.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
		PackageCarges.selectByVisibleText("Unassigned");
		PackageCarges.selectByVisibleText("DBR based");
		SaveModulButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Bal Adj. for LDP Packs' and @value='Yes']"));
		Thread.sleep(1000);
		CloseModule.click();
		
		TOP.selectByVisibleText("Unassigned");
		TOP.selectByVisibleText("Tata Play Bouquet");
		SaveButton.click();
		Thread.sleep(1000);
		
		LinkedPCF.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Bal Adj. for LDP Packs' and @value='No']"));
		Thread.sleep(1000);
		CloseModule.click();
		
		List<String> UOMs = List.of("Semi Annual","Annual","Biennial","Quarterly");
        for (String UOM : UOMs) {
        	FPMUOM.selectByVisibleText("Unassigned");
    		FPMUOM.selectByVisibleText(UOM);
    		SaveButton.click();
    		Thread.sleep(1200);
    		LinkedPCF.click();
    		Thread.sleep(2000);
	    	driver.findElement(By.xpath("//input[@aria-label='Bal Adj. for LDP Packs' and @value='Yes']"));
    		Thread.sleep(1000);
    		CloseModule.click();
        }
	}	
	public void GetReports() throws Exception
	{ 
		WebElement SearchPCF = driver.findElement(By.xpath("(//input[@id='selected'])[2]"));
		SearchPCF.sendKeys("39918");
		Thread.sleep(1000);
		SearchPCF.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		SearchPCF.sendKeys("49714");
		Thread.sleep(1000);
		SearchPCF.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		SearchPCF.sendKeys("49704");
		Thread.sleep(1000);
		SearchPCF.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='Get IT Config Report']")).click();
		driver.findElement(By.xpath("//button[@aria-label='page 1']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Go to page 2']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Go to page 3']")).click();
		driver.findElement(By.xpath("//button[text()='Missed Call Number Report']")).click();
	}
}