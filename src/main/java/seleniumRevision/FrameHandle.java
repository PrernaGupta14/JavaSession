package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/");

		// 1. find frame element by index
//		driver.switchTo().frame(2);
//		String headerString = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(headerString);
		
		
		// 2. find frame elemeny by name or id
//		driver.switchTo().frame("main");
//		String headerString = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(headerString);
		
		// 3. find frame element by element
		WebElement headElement = driver.findElement(By.xpath("//frame[@src='top.html']"));
		driver.switchTo().frame(headElement);
		String headerString = driver.findElement(By.tagName("h2")).getText();
		System.out.println(headerString);
		
		
		//come back on the main page from Frame
		driver.switchTo().defaultContent();
		
		
	}

}
