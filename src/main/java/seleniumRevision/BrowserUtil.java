package seleniumRevision;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import CustomException.BrowserException;

public class BrowserUtil {

	// Default value of driver is pointing to NULL so make it private for unnecssary  access in other class
	private WebDriver driver;

	public WebDriver launchBrowser(String browserName) {
		System.out.println("Browser Name is: " + browserName);

		if (browserName == null) {
			System.out.println("Browser name can not be NULL");
			throw new BrowserException("BROWSERCANNOTBENULL");
		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver(); // using private driver inside the public method is an example of Encapsulation
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please enter correct browser name: " + browserName);
			throw new BrowserException("NOTVALIDBROWSER");
		}
		
		//---> returning driver so when we'll use it in Test class then we don't need to define chrome driver again in that class
		return driver;

	}

	public void enterUrl(String url) {
		if (url.contains("http")) {
			driver.get(url);
		} else {
			throw new BrowserException("InvalidBrowserUrlProtocol");
		}
	}
	
	//example of method overloading in framework
	public void enterUrl(URL  url) {
		if (String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		} else {
			throw new BrowserException("InvalidBrowserUrlProtocol");
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}

//used this utility class in AmzaonTest.java class


