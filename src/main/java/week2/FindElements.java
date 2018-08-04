package week2;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class FindElements {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Mindtree");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vijayakumar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Arumugam"); 
	    List<WebElement> tagName = driver.findElementsByTagName("select");
	    WebElement element = tagName.get(2);
	  
	   // int size = tagName.size();
		//System.out.println(size);
		
	}


}	





/*for(WebElement se : ss)
		{
	       String Text=se.getText();

		}


	}

 */
