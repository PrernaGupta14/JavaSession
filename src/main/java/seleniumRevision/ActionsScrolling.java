package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		actions.sendKeys(Keys.PAGE_UP).perform();	
		
		//-----> completey scroll down page
//		actions.sendKeys(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(2000);
		
		//-----> completey scroll up  page
//		actions.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		//---> scroll to specific element
		actions.scrollToElement(driver.findElement(By.linkText("Help"))).click(driver.findElement(By.linkText("Help"))).build().perform();
		
		//---> normal click will not work for scrollToElement method
//		actions.scrollToElement(driver.findElement(By.linkText("Help"))).click().build().perform();
		
		Thread.sleep(2000);
		
		//--> 	Currently this method not working in selenium so to refresh we can use navigation method also
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		



		
	}

}
