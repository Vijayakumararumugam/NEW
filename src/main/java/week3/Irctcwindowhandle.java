package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Irctcwindowhandle {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		driver.findElementByXPath("//a[text()='Compatible Browser']").click();
		Set<String> allwindowHandles = driver.getWindowHandles();
		List<String> allItems= new ArrayList<String>();
		allItems.addAll(allwindowHandles);
		int size = allItems.size();
		System.out.println(size);
		
		for(String Items:allItems)
		{
			System.out.println();
		}
		
		
		/*driver.switchTo().window(allItems.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.switchTo().window(allItems.get(2));
		String title2 = driver.getTitle();
		System.out.println(title2);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		driver.close();
		driver.switchTo().window(allItems.get(0));
		driver.close();
		*///driver.switchTo().window(allItems.get(1));
		//driver.close();	*/
		//System.out.println(driver.findElementByXPath("//div[@class='content_12']/ul/li").getText());
  
	}

}	
