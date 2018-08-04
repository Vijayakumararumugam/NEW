package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Droppable']").click();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement drop = driver.findElementById("droppable");
		//System.out.println(drop.getLocation());
		WebElement drag = driver.findElementByXPath("//p[text()='Drag me to my target']");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, drop.getLocation().getX(),drop.getLocation().getY()).perform();
	}
	
}
