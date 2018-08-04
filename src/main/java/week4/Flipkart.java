package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement applicance = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement sandwich = driver.findElementByXPath("//span[text()='Sandwich Makers']");
		Actions builder = new Actions(driver);
		builder.moveToElement(applicance).pause(2000).click(sandwich).perform();
		//driver.close();
        
	}
	
}
