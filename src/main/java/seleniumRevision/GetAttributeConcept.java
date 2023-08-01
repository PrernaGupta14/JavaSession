package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		//launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementUtil eUtil = new ElementUtil(driver);
		
		By forgetPswdLink = By.linkText("Forgotten Password");
		
//		we can get any attribute value for the locators using getAttribute() method
//		String string = eUtil.getElement(forgetPswdLink).getAttribute("href");
//		System.out.println(string);
		
		System.out.println(eUtil.getAttributeValue(forgetPswdLink, "href"));
	}
	
	
	//-----------> methods
	public static String getAttributeValue(By locator, String name)
	{
		String  attrValue = getElement(locator).getAttribute(name);
		return attrValue;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
