package testBase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.contactsearch;

public class searchname extends baseclass {

	@Test(priority = 1,enabled=true)
	
	public void SearchNadia() throws InterruptedException {
		contactsearch contactsearchpage = new contactsearch(driver);
		contactsearchpage.search("Nadia Patten");
		String name = contactsearchpage.searchresult();
		AssertJUnit.assertEquals(name, "Nadia Patten");
	}
	@Test(priority = 2,enabled=true, dependsOnMethods= {"SearchSara"})
	
	public void SearchNiha() throws InterruptedException {
		contactsearch contactsearchpage = new contactsearch(driver);
		contactsearchpage.search("Niha");
		String expected_text;
		expected_text = "No contacts found with Niha in the name";
		
		String actual_text = contactsearchpage.invalidsearchresult();
		AssertJUnit.assertEquals(actual_text, expected_text);
	}
	
}
