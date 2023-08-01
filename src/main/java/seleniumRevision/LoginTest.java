package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		
		// created object of BrowserUtil.java class to utilies it's method in this class
		BrowserUtil browserUtil = new BrowserUtil();
		
		//---> stored in Webdriver object because launchBrowser returning driver so we don't need to definr chrome driver again here
		WebDriver driver= browserUtil.launchBrowser("chrome");
		browserUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email= By.id("input-email");
		By pswd = By.id("input-password");
		
		ElementUtil elementUtil = new ElementUtil(driver);
		elementUtil.doSendKeys(email, "raashigupta1402@gmail.com");
		elementUtil.doSendKeys(pswd, "1234");
		
		browserUtil.quitBrowser();
		
		
		
		
		
		
		
		
		

		
	}

}
