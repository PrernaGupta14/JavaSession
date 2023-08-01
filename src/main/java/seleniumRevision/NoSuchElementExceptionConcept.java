package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NoSuchElementExceptionConcept {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		// launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementUtil eUtil = new ElementUtil(driver);
		
		By forgt_pswdLink = By.linkText("Forgotten Password11");
		
		//findElement method throw NoSuchElementException: no such element: Unable to locate element exception in selenium
		//we can handle this exception
		System.out.println(bUtil.getPageTitle());

		eUtil.doClick(forgt_pswdLink);
		
		
	//not printed discuss with naveen
		System.out.println(bUtil.getPageTitle());
		
		
		}

}
