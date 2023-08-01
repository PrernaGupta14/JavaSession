package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterValueInDisableTextField {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		//launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		ElementUtil eUtil = new ElementUtil(driver);
		
		By first_name= By.id("fname");
		By password = By.id("pass");
		
//		this locator  is editable
		eUtil.doSendKeys(first_name, "Prerna");
		
//		We can check the element is editable or not by using isEnabled() method
//		 System.out.println(eUtil.elementIsEnable(password));
		
//		locator is not editable so selenium will give ElementNotInteractableException
//		 eUtil.doSendKeys(password, "1234");
		
// 	we can check the disable property for any text field by retuning the dsisbaled attribute value
		eUtil.elementIsDisable(password);
		
	}

}
