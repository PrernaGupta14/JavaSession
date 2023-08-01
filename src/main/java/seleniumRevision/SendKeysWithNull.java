package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendKeysWithNull {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		// launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementUtil eUtil = new ElementUtil(driver);
		
		By first_name = By.id("input-firstname");
		
//		passing null keyword in sendkeys method will throw IllegalArgumentException
//		eUtil.doSendKeys(first_name, null);
		
//		we can pass blank value or space in sendKeys
//		eUtil.doSendKeys(first_name, " ");
		
//		Concatenation in sendKeys method for CharSequence types
		String str = "Naveen";
		StringBuilder sBuilder = new StringBuilder("Automations");
		StringBuffer sBuffer = new StringBuffer("Labs");
		
		eUtil.doSendKeys(first_name, str+" "+sBuilder+" "+sBuffer);	
		
		
		
	}

}
