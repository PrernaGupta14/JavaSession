package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		 driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		Thread.sleep(4000);
		
		By parentBy = By.className("menulink");
		By childBy = By.xpath("//ul[@class='submenu']//a[text()='Courses']");
//		
//		WebElement parent_menu = driver.findElement(parentBy);
//		
//		Actions action = new Actions(driver);
		
//		if we'll use only moveToElement() method then nothing will happen on the page
//		action.moveToElement(parent_menu);

//		---> both syntax are valid to perform action		
//		action.moveToElement(parent_menu).perform();
//		action.moveToElement(parent_menu).build().perform();
		
		//---> not valid syntax
		//action.moveToElement(parent_menu).build();

		//driver.findElement(childBy).click();
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.multiLevelMenuHandling(parentBy, childBy);	
		}

}
