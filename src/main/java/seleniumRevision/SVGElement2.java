package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("Mackbook pro");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(
				"//*[local-name()='svg' ]//*[name()='path' and @d='M10.5 18C14.6421 18 18 14.6421 18 10.5C18 6.35786 14.6421 3 10.5 3C6.35786 3 3 6.35786 3 10.5C3 14.6421 6.35786 18 10.5 18Z']")))
				.click().build().perform();
		

	}

}