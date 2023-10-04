package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		Thread.sleep(5000);
		
		//frame1
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("first crush");
		
		//frame2
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("second crush");
		
		//frame3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("third crush");
		
		//back to parent frame : glaf to jex
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("jex")).sendKeys("second crush2");
	
	}

}
