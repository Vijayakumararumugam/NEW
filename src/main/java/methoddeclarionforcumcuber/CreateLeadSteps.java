package methoddeclarionforcumcuber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {

	ChromeDriver driver;
	
	@Given("Open the browser")
	public void  Openthebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@And("Maximize the window")
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
	}
	@And("Load the URL")
	public void loadUrl()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@And("Set the Timeout")
	public void setTimeOut()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("Enter the UserName as (.*)")
	public void Username(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("Enter the Password as (.*)")
	public void Password(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}
	@When("Click on Login button")
	public void login()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("verify login is success")
	public void verifylogin()
	{
		System.out.println(driver.getTitle());
	}
	
	
	@And("click on crmfaLink")
	public void clickcrmsfa() {
		
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@Given("click on createLead")
	public void clickcreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter the companyName as (.*)")
	public void companyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		
	}
	
	@And("Enter the FirstName as (.*)")
	public void firstName(String fName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("Enter the LastName as (.*)")
	public void LastName(String lName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	@And("Click on create Lead button")
	public void createLeadButton()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("verify create lead is success")
	public void verifyTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	
}





















