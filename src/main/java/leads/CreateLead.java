package leads;

import org.junit.Test;
import org.openqa.selenium.WebElement;



public class CreateLead extends Login{

	@Test
	public void createLead()
																	
	{
		loginAccesss();
		WebElement createlead = locateElement("xpath", "//a[text()='Create Lead']");
		click(createlead);
		WebElement companyname = locateElement("id", "createLeadForm_companyName");
		type(companyname,"Mtree");
		click(companyname);
		WebElement firstname = locateElement("id", "createLeadForm_firstName");
		type(firstname,"vijay");
		click(firstname);
		WebElement lastname = locateElement("id", "createLeadForm_lastName");
		type(lastname,"kumar");
		click(lastname);
		WebElement phone = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(phone,"9036574946");
		WebElement email = locateElement("id","createLeadForm_primaryEmail");
		type(email,"vijaycse2004@yahoo.co.in");
		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);
		
	}

}