package projectmethods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class CreateContact extends ProjectMethods{

	@Test
	public void createContact()
	{
	startApp("chrome","http://leaftaps.com/opentaps/control/main");
	WebElement linktext1 = locateElement("linkText","CRM/SFA");
    click(linktext1);
    WebElement create = locateElement("xpath","//a[text()='Create Contact']");
    click(create);
    WebElement firstname = locateElement("id","firstNameField");
    firstname.sendKeys("Test");
    WebElement lastname = locateElement("id","lastNameField");
	lastname.sendKeys("leaf");
	WebElement firstnamelocal = locateElement("id","createContactForm_firstNameLocal");
	firstnamelocal.sendKeys("Test1");
	WebElement lastnamelocal = locateElement("id","createContactForm_lastNameLocal");
	lastnamelocal.sendKeys("leaf2");
	WebElement personal = locateElement("id","createContactForm_personalTitle");
	personal.sendKeys("test");
	WebElement title = locateElement("id","createContactForm_generalProfTitle");
	title.sendKeys("sir");
	WebElement dname = locateElement("id","createContactForm_departmentName");
	dname.sendKeys("test");
	WebElement currency = locateElement("id","createContactForm_preferredCurrencyUomId");
	selectDropDownUsingText(currency,"INR - Indian Rupee");
	WebElement desc = locateElement("id","createContactForm_description");
	desc.sendKeys("description");
	WebElement imp = locateElement("id","createContactForm_importantNote");
	imp.sendKeys("important");
	WebElement imp1 = locateElement("id","createContactForm_primaryPhoneAreaCode");
	imp1.sendKeys("10034534");
	WebElement imp2 = locateElement("id","createContactForm_primaryPhoneExtension");
	imp2.sendKeys("100");
	WebElement imp3 = locateElement("id","createContactForm_primaryEmail");
	imp3.sendKeys("test@gmail.com");
	WebElement imp4 = locateElement("id","createContactForm_primaryPhoneNumber");
	imp4.sendKeys("345343453453");
	WebElement imp5 = locateElement("id","createContactForm_primaryPhoneAskForName");
	imp5.sendKeys("important");
	WebElement tonamefield = locateElement("id","generalToNameField");
	//verifyExactAttribute("tonamefield","id","");
	WebElement addr = locateElement("id","createContactForm_generalAddress1");
	addr.sendKeys("address1");
	WebElement city = locateElement("id","createContactForm_generalCity");
	city.sendKeys("chennai");
	WebElement postal = locateElement("createContactForm_generalPostalCode");
	postal.sendKeys("600091");
	WebElement postalcodetext = locateElement("id","createContactForm_generalPostalCodeExt");
	postalcodetext.sendKeys("100");
	WebElement attname = locateElement("id","createContactForm_generalAttnName");
	attname.sendKeys("testattn");
	WebElement addr2 = locateElement("id","createContactForm_generalAddress2");
	addr2.sendKeys("addr2");
	WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
	selectDropDownUsingText(country,"India");
	WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
	selectDropDownUsingText(state,"TAMILNADU");
	WebElement submit = locateElement("class","smallSubmit");
	click(submit);
	WebElement contactfirstname = locateElement("id","viewContact_firstName_sp");
	getText(contactfirstname);
	 WebElement edit = locateElement("xpath","//a[text()='Edit']");
	click(edit);
	WebElement marketcam = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
	selectDropDownUsingText(marketcam,"Car and Driver");
	String text2 = firstSelectedOption(marketcam);
	WebElement submit1= locateElement("xpath","(//input[@class='smallSubmit'])[2]");
	click(submit1);
	WebElement submit2 = locateElement("xpath","(//input[@class='smallSubmit'])[1]");
	click(submit2);
	WebElement marcam = locateElement("id","viewContact_marketingCampaigns_sp");
	String text1 = marcam.getText();
    if(text2.equals(text1))
    		{
    	
    	       System.out.println("The title is matching");
    		}

    else
    {
    	System.out.println("Title is not matching");
    }
    closeBrowser();
	}	
}
	