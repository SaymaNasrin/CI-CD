package testBase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.contactsearch;

public class searchname1 extends baseclass{

	contactsearch contactsearch;
	
	@Test(priority =1,enabled=true)
	public void SearchNadia1() throws InterruptedException {
		Thread.sleep(5000);
		contactsearch = new contactsearch(driver);
		
	}
	@Test(priority =2, enabled=true)
	public void SearchNiha1() throws InterruptedException {
		contactsearch = new contactsearch(driver);
	}
}
