package seleniumRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		String parentWindowHandle = driver.getWindowHandle();
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
//		----> opens fresh window
//		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getCurrentUrl());

		
		
		
	}

}
