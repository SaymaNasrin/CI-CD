package testBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class baseclass {
	
	public AppiumDriver<MobileElement>driver;
	
	
	public void setup() throws MalformedURLException {
	
			DesiredCapabilities caps = new DesiredCapabilities();
	
			caps.setCapability("platformName", "android");
			caps.setCapability("platformVersion", "10");
			caps.setCapability("deviceName", "emulator-5554");
			caps.setCapability("appPackage", "com.jayway.contacts");
			caps.setCapability("appActivity", "com.jayway.contacts.MainActivity");
			caps.setCapability("app", "C:\\Users\\User\\Documents\\appium\\Contacts.apk");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			caps.setCapability("fullReset", false);
			caps.setCapability("noReset", true);
		
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
		    driver = new AppiumDriver<MobileElement>(url,caps);
		
	
		
	}

}
