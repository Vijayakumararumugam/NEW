package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

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
		
		String text2 = driver.findElementByXPath("//p[text()='Hello Vijayakumar! How are you today?']").getText();
		if(text==text2)
		{
			System.out.println("Title is matching");
			
		}
		else
		{
			System.out.println("Title is not mathcing");
		}
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		//driver.close();

	}

}
