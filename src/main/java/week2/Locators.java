package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	ChromeDriver driver = new ChromeDriver();


	public void login()
	{

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	public void createLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Test");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vijayakumar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Arumugam");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("vijay");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("kum");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("AR");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select select = new Select(source);
		select.selectByVisibleText("Self Generated");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("10000");
		WebElement source1 = driver.findElementById("createLeadForm_industryEnumId");
		Select select1 = new Select(source1);
		select1.selectByVisibleText("Distribution");
		WebElement source2 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select select2 = new Select(source2);
		select2.selectByVisibleText("S-Corporation");
		driver.findElementById("createLeadForm_sicCode").sendKeys("12345");
		driver.findElementById("createLeadForm_description").sendKeys("Test Lead Welcomes You");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Nice Message");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("23");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("12");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("12345");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
		WebElement source3 = driver.findElementById("createLeadForm_currencyUomId");
		Select select3 = new Select(source3);
		select3.selectByVisibleText("INR - Indian Rupee");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("symbol");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("vijay");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("TestLeaf.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Joshith");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Address1");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Address2");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		WebElement source4 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select select4 = new Select(source4);
		select4.selectByVisibleText("India");
		WebElement source5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select select5 = new Select(source5);
		select5.selectByVisibleText("TAMILNADU");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("631209");
		WebElement source6=driver.findElementById("createLeadForm_marketingCampaignId");
		Select select6 = new Select(source6);
		select6.selectByVisibleText("Road and Track");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9036574946");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("vijaycse@gmail.com");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByClassName("inputBox").sendKeys("123");
		String firstname = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(firstname);

	}

	public void editLead()
	{
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//div[@class='frameSectionHeader']/following::a").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name ='firstName'])[3]").sendKeys("Vijayakumar");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> path1 = driver.findElementsByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		WebElement element1 = path1.get(0);
		element1.click();

		//driver.findElementByXPath("//table/tbody/tr/td/div/a[1]").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByXPath("(//div[@class='frameSectionExtra']/following::a[3])[1]").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementById("updateLeadForm_companyName").sendKeys("Practice");
		driver.findElementByClassName("smallSubmit").click();
		String updateText=driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(updateText);
		driver.close();
	}


	public void deleteLead()
	{

		driver.findElementByXPath("//div[@class='frameSectionHeader'] /following::a[1]").click();
		driver.findElementByLinkText("Find Leads").click();
		//driver.findElementByName("phoneCountryCode").sendKeys(keysToSend);
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneNumber").sendKeys("9036574946");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElementByXPath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a[1])[1]").click();
		List<WebElement> path = driver.findElementsByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		WebElement element = path.get(0);
		element.click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys("10041");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		driver.close();
	}

	public void duplicateLead()
	{
		driver.findElementByXPath("//div[@class='frameSectionHeader'] /following::a[1]").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElementByName("emailAddress"	).sendKeys("vijaycse@gmail.com");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> path2 = driver.findElementsByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		WebElement element2 = path2.get(0);
		element2.click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String text = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		System.out.println(text);

	}
	public static void main(String[] args) 
	{

		Locators locate = new Locators();
		locate.login();
		locate.createLead();
		//locate.editLead();
		locate.deleteLead();
		locate.duplicateLead();
	}

}


/*
	List<WebElement> tagName = driver.findElementsByTagName("select");
    WebElement element1 = tagName.get(1);
    Select select = new Select(element1);
    select.selectByVisibleText("Distribution");*/


