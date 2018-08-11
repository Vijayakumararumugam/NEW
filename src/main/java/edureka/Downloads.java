package edureka;


import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.api.robot.KeyModifier;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Downloads {
	
	static RemoteWebDriver driver;
	
	@Test
	public void downLoads() throws InterruptedException, FindFailed, AWTException
	{
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		Screen screen = new Screen();
		driver.get("https://www.last.fm/music/+free-music-downloads");
		//Thread.sleep(3000);	  
		driver.findElementByClassName("chartlist-download-button").sendKeys(Keys.ENTER);
	    screen.click("C:\\Users\\VIJAY\\Pictures\\Skuli-Images\\Image1.png");
        screen.click("C:\\Users\\VIJAY\\Pictures\\Skuli-Images\\saveas.png");
        screen.click("C:\\Users\\VIJAY\\Pictures\\Skuli-Images\\Text.png");
       
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        //robot.keyPress(KeyEvent.KEY_PRESSED);
        screen.click();
        //Thread.sleep(3000);
        screen.type(" C:\\Assignment\\song");
        screen.click("C:\\Users\\VIJAY\\Pictures\\Skuli-Images\\save.png");
        screen.click();
        	}

} 
