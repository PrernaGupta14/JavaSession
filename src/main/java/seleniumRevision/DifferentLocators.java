package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

//		1. id locator
		driver.findElement(By.id("")).sendKeys("");;
		
//		2. name locator
		driver.findElement(By.name("")).sendKeys("");;
		
//		3. className locator
		driver.findElement(By.className("")).sendKeys("");;
		
//		4.	 xpath
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("");
		
//		5. css selector
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("");
		
//		6. LinkText 		
		driver.findElement(By.linkText("")).click();
		
// 	7. Partial LinkText
		driver.findElement(By.partialLinkText(""));
		
//		8. tagName
//		---> getText() method return header name of that element
		driver.findElement(By.tagName("input")).getText();
	}

}
