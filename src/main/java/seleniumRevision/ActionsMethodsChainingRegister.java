package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodsChainingRegister {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By email_id = By.id("input-firstname");
		
		Actions actions = new Actions(driver);
		ElementUtil eUtil= new ElementUtil(driver);
		
		//called builder pattern also
		actions.sendKeys(eUtil.getElement(email_id), "Prerna")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("sharma")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("hghvh@5678")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("34567")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("12")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("12")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.SPACE)
		.pause(1000)
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys(Keys.SPACE)
		.perform();			
	}

}
