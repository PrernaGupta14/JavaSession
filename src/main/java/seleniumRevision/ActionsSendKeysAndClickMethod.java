package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClickMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email_id = By.id("input-email");
		By pswd = By.id("input-password");
		By btn = By.xpath("//input[@value='Login']");
		
//		Actions actions = new Actions(driver);
//		 actions.sendKeys(driver.findElement(email_id), "raashigupta1402@gmail.com").perform();
//		 actions.sendKeys(driver.findElement(pswd), "Alpha1234").perform();
//		 
//		 actions.click(driver.findElement(btn)).perform();
		 
		 ElementUtil eUtil = new ElementUtil(driver);
		 
		 //-----> using methods
		 eUtil.doActionsSendKeys(email_id, "raashigupta1402@gmail.com");
		 eUtil.doActionsSendKeys(pswd, "Alpha1234");
		 eUtil.doActionsClick(btn);
		 
	
		 
		 
		 
		 
	}

}
