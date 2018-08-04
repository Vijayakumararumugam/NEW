package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) 
	{
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	    driver.findElementById("userRegistrationForm:userName").sendKeys("vijayrgce");
	    driver.findElementById("userRegistrationForm:password").sendKeys("Reebok@123");
	    driver.findElementById("userRegistrationForm:confpasword").sendKeys("Reebok@123");
	    WebElement element = driver.findElementById("userRegistrationForm:securityQ");
	    Select select = new Select(element);
	    select.selectByValue("2");
	    driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("vijay");
	    WebElement element1=driver.findElementById("userRegistrationForm:prelan");
	    Select select1 = new Select(element1);
	    select1.selectByValue("en");
	    driver.findElementById("userRegistrationForm:firstName").sendKeys("vijay");	
	    driver.findElementById("userRegistrationForm:middleName").sendKeys("A");
	    driver.findElementById("userRegistrationForm:lastName").sendKeys("kumar");
	    driver.findElementByLinkText(" Male").click();
	    //driver.findElementByLinkText(using)
	}

}
