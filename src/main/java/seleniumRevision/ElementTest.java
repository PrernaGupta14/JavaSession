package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementTest {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		//launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementUtil eUtil = new ElementUtil(driver);

		By registerHeader = By.tagName("h1");
		By forgetPswdLink = By.linkText("Forgotten Password");

		//----> verify that registerHeader element is available on the page by using isDisplayed method
		if (eUtil. checkElementDisplayed(registerHeader)) {
			System.out.println("Register Header displayed");
			System.out.println(eUtil.getLinkText(registerHeader));
		}
		
		System.out.println(eUtil.getLinkText(forgetPswdLink));

	}

	
	//--------> methods
	public static boolean checkElementDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String getLinkText(By locator) {
		String string = getElement(locator).getText();
		return string;
	}
}
