package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;


public class CreateLead extends Annotations{

    @Test(invocationCount=2)
	public void createLead() {
		
		/*startApp("chrome","http://leaftaps.com/opentaps/control/main");
		WebElement element1 = locateElement("id","username");
		type(element1,"Demosalesmanager");
		WebElement element2 = locateElement("id","password");
		type(element2,"crmsfa");
		WebElement element3 =locateElement("class","decorativeSubmit");
		click(element3);
		WebElement element4 = locateElement("linkText","CRM/SFA");
		click(element4);*/
		WebElement element5 =locateElement("linkText","Create Lead");
		click(element5);
		WebElement element6 =locateElement("id","createLeadForm_companyName");
		type(element6,"Mindtree");
		WebElement element7 = locateElement("id","createLeadForm_firstName");
		type(element7,"vijay");
		WebElement element8 = locateElement("id","createLeadForm_lastName");
		type(element8,"kumar");
		WebElement submit = locateElement("class","smallSubmit");
		click(submit);
		
	  /*  WebElement element10 = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(element10,"Existing Customer");
		WebElement element9 = locateElement("name","submitButton");
		click(element9);
		WebElement element11 = locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingText(element11,"AOK - Angolan Kwanza");
		
		
		
		

		WebElement element = locateElement("linktext","CRM/SFA");
		click(element);
		System.out.println(element);*/
	}
}
