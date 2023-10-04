package seleniumRevision;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchDriverToChildWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//get window handle
		Set<String> handle = driver.getWindowHandles();	
		Iterator<String> setIterator=  handle.iterator();
		
		//iterate window handles
		String parentwindowid= setIterator.next();
		System.out.println("Parent windowid is: "+parentwindowid);
		
		//pointing to the window handle
		String childwindowid = setIterator.next();
		System.out.println("Child windowid is: "+childwindowid);
		
		//switch to child window by using window handle parameter which we clicked/opened recently
		driver.switchTo().window(childwindowid);
		System.out.println("Child url is: "+driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);
		
		//again switching to parent window 
		driver.switchTo().window(parentwindowid);
		System.out.println("Parent url is: "+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
		
		
		
	
	}
	

}
