package week2;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {

      ChromeDriver driver = new ChromeDriver();
      driver.get("http://leafground.com/pages/table.html");
      System.out.println("Count of Rows");
      System.out.println(driver.findElementsByXPath("//div[@id='contentblock']//table//tr[4]").size());
      System.out.println("Count of Columns");
      //System.out.println(driver.findElementsByXPath("//div[@id='contentblock']//table//tr[2]/td").size());
      System.out.println(driver.findElementsByXPath("//div[@id='contentblock']/following::div").size());
      System.out.println(driver.findElementByXPath("//div[@id='contentblock']//table//tr[3]/td[2]").getText());
      //System.out.println(name);
	}

}
