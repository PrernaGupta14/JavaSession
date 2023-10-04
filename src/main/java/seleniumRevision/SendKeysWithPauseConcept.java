package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPauseConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		 WebElement email_id = driver.findElement(By.id("input-firstname"));
		
		Actions actions = new Actions(driver);
		
		String value = "NaveenAutomation";
		
		//conveted the string in char array
		char ch[]= value.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			actions.sendKeys(email_id, String.valueOf(ch[i])).pause(1000).perform();
			
		}
		
		
	}

}
