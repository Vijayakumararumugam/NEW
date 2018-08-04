package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods {
	RemoteWebDriver driver;
	int i = 1;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser " + browser + " is Launched Successfully");
		} catch (WebDriverException e) {
			
			System.out.println("Webdriver is not available");
		}
		// takeSnap();

	}

	public WebElement locateElement(String locator, String locValue) {
		switch (locator) {
		case "id":
			return driver.findElementById(locValue);
		case "class":
			return driver.findElementByClassName(locValue);
		case "xpath":
			return driver.findElementByXPath(locValue);
		case "linkText":
			return driver.findElementByLinkText(locValue);
		case "name":
			return driver.findElementByName(locValue);
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data " + data + " is Entered Successfully");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element " + ele + " is clicked Successfully");
		takeSnap();
	}

	public void clickNoSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element " + ele + " is clicked Successfully");

	}

	public String getText(WebElement ele) {

		String text = ele.getText();
		System.out.println(text);

		return text;
	}

	public String firstSelectedOption(WebElement ele) {
		Select text = new Select(ele);
		String text1 = text.getFirstSelectedOption().getText();
		return text1;
	}

	public String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}

	public void getUrl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

	public void selectDropDownUsingText(WebElement ele, String value) {

		Select text = new Select(ele);
		text.selectByVisibleText(value);

		System.out.println("The Dropdown value is " + value + "");

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select text1 = new Select(ele);
		text1.selectByIndex(index);

	}

	public boolean verifyTitle(String expectedTitle) {

		if (driver.getTitle().equals(expectedTitle)) {
			System.out.println("True");
			return true;
		} else {
			return false;
		}

	}

	public void verifyExactText(WebElement ele, String expectedText) {

		if (ele.getText().equals(expectedText)) {
			System.out.println("The Text is matching");
		} else {
			System.out.println("The text is not matching");
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {

		if (ele.getText().contains(expectedText)) {
			System.out.println("The Partialtext is matching");
		} else {
			System.out.println("The Partialtext is not matching");
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		if (ele.getAttribute(attribute).equals(value)) {
			System.out.println("The attribute text is matching");
		} else {
			System.out.println("The attribute text is not matching");
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {

		if (ele.getAttribute(attribute).contains(value)) {
			System.out.println("The partial Attribute value is " + value + "");
		} else {
			System.out.println("The Partial Attribute value is not available");
		}
	}

	public void verifySelected(WebElement ele) {

		if (ele.isSelected()) {
			System.out.println("The element is selected");
		} else {
			System.out.println("The element is not selected");
		}
	}

	public void verifyDisplayed(WebElement ele) {
		if (ele.isDisplayed()) {
			System.out.println("The element is displayed");
		} else {
			System.out.println("The element is not displayed");
		}

	}

	public void switchToWindow(int index) {

		Set<String> handles = driver.getWindowHandles();
		List<String> allwindows = new ArrayList<String>();
		allwindows.addAll(handles);
		String window = allwindows.get(index);
		System.out.println(window);
		driver.switchTo().window(window);
	}

	public void switchParentWindow() {
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		System.out.println(parentWindow);

	}

	public void switchToFrame(WebElement ele) {

		driver.switchTo().frame(ele);

	}

	/*
	 * public void switchToFrameByIndex(int index) { WebDriver frame =
	 * driver.switchTo().frame(index); System.out.println(frame); }
	 */
	public void exitFromFrame() {
		driver.switchTo().defaultContent();
	}

	public void acceptAlert() {
		Alert myAlert = driver.switchTo().alert();
		myAlert.accept();

	}

	public void dismissAlert() {
		Alert myAlert = driver.switchTo().alert();
		myAlert.dismiss();

	}

	public String getAlertText() {
		Alert myAlert = driver.switchTo().alert();
		String alerttext = myAlert.getText();
		return alerttext;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img" + i + ".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void advancedUserInteraction(WebElement ele) {
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).pause(2000).click().perform();
	}

	public void explicitWait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void closeBrowser() {

		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}

}
