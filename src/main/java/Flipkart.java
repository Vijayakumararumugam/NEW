
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Flipkart extends SeMethods {
	
	@Test
	public void flipkart() throws InterruptedException
	{
	startApp("chrome","https://www.flipkart.com/");
	WebElement close = locateElement("xpath","//button[text()='✕']");
	click(close);
	WebElement appliance = locateElement("xpath","//span[text()='TVs & Appliances']");
	advancedUserInteraction(appliance);
	WebElement title = locateElement("xpath","(//a[@title='Samsung'])[2]");
	click(title);
	WebElement min = locateElement("xpath","(//select[@class='fPjUPw'])[1]");
	selectDropDownUsingText(min,"₹25000");
	WebElement max = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
	selectDropDownUsingText(max,"₹60000");
	Thread.sleep(2000);
	WebElement screensize = locateElement("xpath","//div[text()='Screen Size']");
	click(screensize);
	explicitWait(screensize);
	WebElement size = locateElement("xpath","(//input[@type='checkbox']/following::div[1])[11]");
	click(size);
	WebElement firstprod = locateElement("xpath","(//div[text()='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV'])[1]");
	click(firstprod);
	switchToWindow(1);
	String text = locateElement("xpath","(//div[text()='₹54,999'])[1]").getText();
	System.out.println(text);
	WebElement checkbox = locateElement("xpath","(//input[@type='checkbox']/following::div)[1]");
	checkbox.click();
	closeBrowser();
	switchToWindow(0);
	WebElement secondprod = locateElement("xpath","//div[text()='Samsung Series 5 123cm (49 inch) Full HD LED TV']");
	click(secondprod);
	switchToWindow(1);
	String text1 = locateElement("xpath","(//div[text()='₹44,999'])[1]").getText();
	System.out.println(text1);
	WebElement checkbox1 = locateElement("xpath","(//input[@type='checkbox']/following::div)[1]");
	checkbox1.click();
	closeBrowser();
	switchToWindow(0);
	WebElement compare = locateElement("xpath","//span[text()='COMPARE']");
	click(compare);
	String text3 = locateElement("xpath","(//div[text()='₹54,999'])[1]").getText();
	String text4 = locateElement("xpath","(//div[text()='₹44,999'])[1]").getText();
	String text5 = text3.replaceAll("₹54,999","54999");
	String text6=  text4.replaceAll("₹44,999","44999");
	 int conv1 = Integer.parseInt(text5);
	 int conv2 = Integer.parseInt(text6);
	 System.out.println(conv1);
	 System.out.println(conv2);
	 if(conv1>conv2)
	 {
		 System.out.println("The Value is greater " +conv1);
	 }
	 else
	 {
		 System.out.println("The Value is lesser " +conv2);
	 }
		 
	 closeBrowser();
	}
	
}
