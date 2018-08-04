package leads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class DeleteLead extends Login{

	@Test
	public void deleteLead()
	{
		
		//locateElement
		
		
		
		WebElement createlead = locateElement("xpath","//a[text()='Create Lead']");
		click(createlead);
		WebElement companyname = locateElement("id","createLeadForm_companyName");
		click(companyname);
		WebElement firstname = locateElement("id","createLeadForm_firstName");
		click(firstname);
		WebElement lastname = locateElement("id","createLeadForm_lastName");
	    click(lastname);
	    WebElement submit = locateElement("class","smallSubmit");
	    click(submit);
	    WebElement delete = locateElement("xpath","//a[text()='Delete']");
	    click(delete);
	}
	
}
