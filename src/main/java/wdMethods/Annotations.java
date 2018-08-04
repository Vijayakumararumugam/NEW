package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Annotations extends SeMethods{
	
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	public void login (String url , String uname,String pwd)
	{
		startApp("chrome",url);
		WebElement username1 = locateElement("id","username");
		type(username1,uname);
	    WebElement password1 = locateElement("id","password");
	    type(password1,pwd);
	    WebElement submit = locateElement("class","decorativeSubmit");
	    click(submit);
		WebElement element4 = locateElement("linkText","CRM/SFA");
		click(element4);
		
	}
	
	@AfterMethod
	public void logout()
	{
		closeAllBrowsers();
		/*WebElement logout1 = locateElement("xpath","//a[text()='Logout']");
		click(logout1);*/
	}

}
