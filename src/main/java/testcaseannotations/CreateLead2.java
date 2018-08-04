package testcaseannotations;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLead2 extends Annotations{
	
	@Parameters({"cname","fname","lname"})
	@Test
	public void createLead(String cname,String fname,String lname) //parameters needs to be passed from get data and variable is userdefined.
	{
	WebElement createlead = locateElement("xpath","//a[text()='Create Lead']");
	click(createlead);
	WebElement companyname = locateElement("id","createLeadForm_companyName");
	type(companyname,cname);
	click(companyname);
	WebElement firstname = locateElement("id","createLeadForm_firstName");
	type(firstname,fname);
	click(firstname);
	WebElement lastname = locateElement("id","createLeadForm_lastName");
	type(lastname,lname);
    click(lastname);
    WebElement submit = locateElement("class","smallSubmit");
    click(submit);
	}
	
	
	
	
	
}


