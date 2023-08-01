package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	// initialize Web driver globally so we can access it anywhere in this class and
	// it's static so that we can directly call it inside main method by creating
	// it's object constructor
	static WebDriver driver;

	public static void main(String[] args) {

		// initialized locally, can access only inside main() method
		// WebDriver driver =new ChromeDriver();

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Approaches to create WebElement

//		1. Through driver
//		driver.findElement(By.id("input-email")).sendKeys("raashigupta1402@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("1234");
//		
//		2. Through WebElement interface
//	 	WebElement email_idElement = driver.findElement(By.id("input-email"));
//	 	WebElement pswdElement = driver.findElement(By.id("input-password"));
//	 	
//	 	email_idElement.sendKeys("raashigupta1402@gmail.com");
//	 	pswdElement.sendKeys("1234");
//	 	
//	 	3. Through By locator class
//	 	By emailBy= By.id("input-email");
//	 	By pswdBy = By.id("input-password");
//	 	
//	 	WebElement eWebElement= driver.findElement(emailBy);
//	 	WebElement pswdWebElement = driver.findElement(pswdBy);
//	 	
//	 	eWebElement.sendKeys("raashigupta1402@gmail.com");
//	 	pswdWebElement.sendKeys("1234");

//	 	4. Through By locator with web element generic method
//	 	 ---------->first  initialize WebElement globally(outside main method)
//	 	By email= By.id("input-email");
//	 	By pswd = By.id("input-password");
//	 	
//	 	getElement(email).sendKeys("raashigupta1402@gmail.com");
//	 	getElement(pswd).sendKeys("1234");

//		5.  Through By locator with web element and sendkeys generic method
//		By email= By.id("input-email");
//		By pswd = By.id("input-password");
//				
//		doSendKeys(email, "raashigupta1402@gmail.com");
//		doSendKeys(pswd, "1234");

//		6. Through By locator with web element and sendkeys generic method in Utility class
		By email = By.id("input-email");
		By pswd = By.id("input-password");

//		---> In ElementUtil.java class, Methods are non-static so we have to create the  object of that class to call the methods in this class
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(email, "raashigupta1402@gmail.com");
		eUtil.doSendKeys(pswd, "1234");

//		7. Through By locator with web element and sendkeys generic method in Utility class and use it's methods in test class 
//		Check LoginTest.java class

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	// ----> we can directly call static method inside main class
	public static WebElement getElement(By locator) {
		// ----> return of findElement method is Web element so method type will be
		// WebElement in place of void
		return driver.findElement(locator);
	}

}
