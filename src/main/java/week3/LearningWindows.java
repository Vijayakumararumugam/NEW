package week3;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindows {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text() ='Try it']").click();
		Alert myAlert = driver.switchTo().alert();		
		String text = myAlert.getText();
		System.out.println(text);
		myAlert.sendKeys("Vijayakumar");
		myAlert.accept();
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
	//	String handle = driver.getWindowHandle();
		Set<String> allwindowhandle = driver.getWindowHandles();
		
		List<String> list = new ArrayList<String>();
		list.addAll(allwindowhandle);
		
		driver.switchTo().window(list.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getTitle());
		//driver.close();

	}

}
