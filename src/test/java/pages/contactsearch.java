package pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class contactsearch {
	public contactsearch(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

@CacheLookup
@AndroidFindBy (id = "main_search")
MobileElement searchField;

public void search(String name) {
	searchField.clear();
	searchField.sendKeys(name);
}

@AndroidFindBy (id = "name")
MobileElement validsearchresult;

public String searchresult() {
	String name = validsearchresult.getText();
	return name;
}

@AndroidFindBy (id ="main_text")
MobileElement invalidsearchresult;

public String invalidsearchresult() {
	System.out.println("invalid result");
	String name = invalidsearchresult.getText();
	return name;
}
}
