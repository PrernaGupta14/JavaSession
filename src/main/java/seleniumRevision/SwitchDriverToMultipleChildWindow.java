package seleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchDriverToMultipleChildWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//get only parent window handle by using getWindowHandle() method
		String parentWindowHandle= driver.getWindowHandle();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div/a[@target='_blank']"));
		
//		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		
//		Set<String> windowSet =  driver.getWindowHandles();
//		Iterator<String> windowIterator= windowSet.iterator();
		
		Actions actions = new Actions(driver);
		System.out.println(elements.size());
		
		for (WebElement e : elements) {
			
		
//			System.out.println(elements.get(i).getAttribute("href"));
//			System.out.println(i);
			
//			elements.get(i).click();
			 String childWindowHandle = driver.getWindowHandle();
			 actions.moveToElement(e).click().build().perform();
			driver.switchTo().window(childWindowHandle);
			System.out.println("Child Window Url is : "+driver.getCurrentUrl());
			Thread.sleep(1000);
			if (!childWindowHandle.equals(parentWindowHandle)) {
				driver.close();
				break;
			}	
	}

		driver.switchTo().window(parentWindowHandle);
		System.out.println("Parent Window Url is : "+driver.getCurrentUrl());
		
//		while (windowIterator.hasNext()) {
//			String windowHandle =  windowIterator.next();
//			driver.switchTo().window(windowHandle);
//			if (!windowHandle.equals(parentWindowHandle)) {
//				System.out.println("Url is : "+driver.getCurrentUrl());
//				Thread.sleep(1000);
//				driver.close();
//			}
//		}
		// switch to parent window
//		driver.switchTo().window(parentWindowHandle);
//		System.out.println("Parent window url is : "+driver.getCurrentUrl());	
	}

}
