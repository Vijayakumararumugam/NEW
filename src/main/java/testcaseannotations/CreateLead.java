package testcaseannotations;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreateLead extends Annotations {

	@Test(dataProvider = "fetchdata")

	public void createLead(String cname, String fname, int lname) // parameters needs to be passed from get data and
																	// variable is userdefined.
	{
		WebElement createlead = locateElement("xpath", "//a[text()='Create Lead']");
		click(createlead);
		WebElement companyname = locateElement("id", "createLeadForm_companyName");
		type(companyname, cname);
		click(companyname);
		WebElement firstname = locateElement("id", "createLeadForm_firstName");
		type(firstname, fname);
		click(firstname);
		WebElement lastname = locateElement("id", "createLeadForm_lastName");
		type(lastname, "" + lname);
		click(lastname);
		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);
	}

	// fetch data is userdefined.
	@DataProvider(name = "fetchdata", indices = { 1 })

	// indices will executes only the first data

	// Object is super class of integer and string
	public Object[][] getdata() {
		// Object is Super class of integer and string
		Object[][] data = new Object[2][3];
		data[0][0] = "Mindtree";
		data[0][1] = "Vijay";
		data[0][2] = 1; // integer data passed via object.

		data[1][0] = "test";
		data[1][1] = "bhuvanesh";
		data[1][2] = 2;

		return data;
	}

}
