package projectmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods{
	
	@Test
	public void login() 
	{
		startApp("chrome","http://leaftaps.com/opentaps/control/main");
		WebElement username1 = locateElement("id","username");
		type(username1,"Demosalesmanager");
	    WebElement password1 = locateElement("id","password");
	    type(password1,"crmsfa");
	    WebElement submit = locateElement("class","decorativeSubmit");
	    click(submit);
	    
	}
	
	/*public void logout()
	{
		WebElement logout = locateElement("xpath","//a[text()='Logout']");
		click(logout);
	}
*/
}
