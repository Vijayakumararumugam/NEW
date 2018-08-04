package facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {

    @Test
	public void facebook1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement contentInfo = driver.findElementByXPath("//div[@role='contentinfo']");
		//contentInfo.findElements(By.tagName("a"));
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> listOfAllWinHandle = new ArrayList<String>();
		 listOfAllWinHandle.addAll(windowHandles);
		 System.out.println(listOfAllWinHandle.size());
		 for(String hand:listOfAllWinHandle)
		 {
			 System.out.println(hand);
		 }
	}
}
		
		/*List<WebElement> tagName = driver.findElementsByTagName("a");
		int size = tagName.size();
		
		for(int i=13;i<=size;i++)
		{
			
			contentInfo = driver.findElementByXPath("//div[@role='contentinfo']");
			contentInfo.findElements(By.tagName("a"));
			contentInfo.findElements(By.tagName("a")).get(i).click();
			driver.switchTo().window(listOfAllWinHandle.get(1));
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
			Thread.sleep(3000);
			if(windowHandle.equals(handle))
				{
				
				driver.close();
				driver.switchTo().window(windowHandle);
			}
			else if(windowHandle.equals(handle))
			{
			driver.navigate().back();
		}
		}
		Thread.sleep(2000);
	
	}


}*/