package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetTextFieldValue {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		// launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementUtil eUtil = new ElementUtil(driver);
		
		By first_name = By.id("input-firstname");
		eUtil.doSendKeys(first_name, "Prerna");
		
//		This method will not print the value we have entered in first name because 'value' attribute holds the value we enter in the text field
//		String elementText = eUtil.getElementText(first_name);
//		System.out.println(elementText);
		
		System.out.println(eUtil.getAttributeValue(first_name, "value"));

	}

}
