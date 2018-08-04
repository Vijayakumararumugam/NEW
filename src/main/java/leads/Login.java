package leads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void loginAccesss()
	{
	startApp("chrome","http://leaftaps.com/opentaps/control/main");
	WebElement userName = locateElement("id","username");
	type(userName,"DemoSalesManager");
	WebElement passWord = locateElement("id","password");
	type(passWord,"crmsfa");
	WebElement submit = locateElement("class","decorativeSubmit");
	click(submit);
	WebElement crmLink = locateElement("xpath","(//div[@id='label']//a)[1]");
	click(crmLink);
	}
	
}
