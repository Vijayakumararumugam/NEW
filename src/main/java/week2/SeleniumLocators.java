package week2;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class SeleniumLocators {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Mindtree");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vijayakumar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Arumugam");   
		//driver.findElementById("ext-gen627").click(); -- should not use id if it has numbers.
		//driver.findElementByName("submitButton").click();
		WebElement source =driver.findElementById("createLeadForm_industryEnumId");
		Select select = new Select(source);
		List<WebElement> ss = select.getOptions();
		int alloptions = ss.size();
		select.selectByIndex(alloptions-9);
		System.out.println("Execution is successful");
	}


}	





/*for(WebElement se : ss)
		{
	       String Text=se.getText();

		}


	}

 */
