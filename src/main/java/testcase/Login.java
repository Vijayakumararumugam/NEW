package testcase;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		getText(eleUserName);
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement element4 = locateElement("linkText","CRM/SFA");
		click(element4);
		WebElement element5 =locateElement("linkText","Create Lead");
		click(element5);
		WebElement element10 = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingIndex(element10,20);
		closeBrowser();
	}
	
}






