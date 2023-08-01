package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomxPath {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		// launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://app.hubspot.com/login/beta");

		ElementUtil eUtil = new ElementUtil(driver);	
		
		//----> valid xpath
//		By login_email = By.xpath("//input[@class='form-control private-form__control login-email']");
//		eUtil.doSendKeys(login_email, "abc@gmail.com");
		
		//----> NoSuchElementException: no such element: Unable to locate element
		
		//----> valid with className with as we can use only one unique class anme
//		By login_email = By.className("login-email");
//		eUtil.doSendKeys(login_email, "test@gmail.com");
		
		//----> InvalidSelectorException: Compound class names not permitted, this exception coming while used multiple class names
//		By login_email = By.className("form-control private-form__control login-email");
//		eUtil.doSendKeys(login_email, "zxy@gmail,com");
		
		//---> xpath with contains() method
//		By button = By.xpath("//button[@data-test-id='password-login-button' and contains(@class, 'uiButton')]");
//		eUtil.doClick(button);
		
		bUtil.enterUrl("https://www.freshworks.com/");
		
		//----> text() method in xpath
//		By text_xpath = By.xpath("//span[text()='Trusted by 60,000+ businesses of all sizes']");
//		System.out.println(eUtil.getElementText(text_xpath));
		
		//----> contains method with text method in xpath
		By text_xpath = By.xpath("//span[contains(text(), 'Trusted by ')]");
		System.out.println(eUtil.getElementText(text_xpath));
			
	}

}
