import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Contact {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Create Contact']").click();
		driver.findElementById("firstNameField").sendKeys("Test");
		driver.findElementById("lastNameField").sendKeys("leaf", Keys.TAB);
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("tes");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("le");
		driver.findElementById("createContactForm_personalTitle").sendKeys("test");
		driver.findElementById("createContactForm_generalProfTitle").sendKeys("sir");
		driver.findElementById("createContactForm_departmentName").sendKeys("test");
		WebElement prefercurrency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select currency = new Select(prefercurrency);
		currency.selectByVisibleText("INR - Indian Rupee");
		driver.findElementById("createContactForm_description").sendKeys("description");
		driver.findElementById("createContactForm_importantNote").sendKeys("Importantnote");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("1002");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("1000");	
		driver.findElementById("createContactForm_primaryEmail").sendKeys("Test@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("12345667889");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("12343434");
		String capturename = driver.findElementById("generalToNameField").getAttribute("value");
		System.out.println(capturename);
		driver.findElementById("createContactForm_generalAddress1").sendKeys("Address1");
		driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("600091");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("100");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("testattention");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("address2");
		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select countryname =new Select(country);
		countryname.selectByVisibleText("India");
		WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select statedropdown = new Select(state);
		statedropdown.selectByVisibleText("TAMILNADU");
		driver.findElementByClassName("smallSubmit").click();
		String text = driver.findElementById("viewContact_firstName_sp").getText();
		//System.out.println(text);
		if(capturename.equals(text))
		{
			System.out.println("First name is same as To Field");
		}
		else
		{
			System.out.println("First name is not same as To Field");


		}
		driver.findElementByXPath("//a[text()='Edit']").click();
		WebElement marketing = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
		Select market = new Select(marketing);
		market.selectByVisibleText("Car and Driver");
         String text3 = market.getFirstSelectedOption().getText();
		driver.findElementByXPath("(//input[@class='smallSubmit'])[2]").click();
		//driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		String text2 = driver.findElementById("viewContact_marketingCampaigns_sp").getText();
		//System.out.println("Marketing Campaigns" +text2);
		if(text3.equals(text2))
		{
			System.out.println("The dropdown text is " + text2);

		}
		else
		{
			System.out.println("Some mismatch");
		}

	}

}
