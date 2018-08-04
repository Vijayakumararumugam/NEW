package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableClass {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Sortable']").click();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement item1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement item4 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
		Actions builder = new Actions(driver);
		//builder.dragAndDropBy(item1, item4.getLocation().getX(), item4.getLocation().getY()).perform();
        builder.clickAndHold(item1).pause(5000).dragAndDropBy(item1, item4.getLocation().getX(), item4.getLocation().getY()).perform();
        driver.close();
        
	}
	
}
