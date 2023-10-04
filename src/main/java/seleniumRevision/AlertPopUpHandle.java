package seleniumRevision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(4000);
//		Alert alert= driver.switchTo().alert();
//		String text= alert.getText();
//		System.out.println(text);
//		alert.accept();
//		alert.dismiss();
		
		//2. confirm
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(4000);
//		Alert alert= driver.switchTo().alert();
//		String text= alert.getText();
//		System.out.println(text);
//		alert.dismiss();
		
		//3. prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		Alert alert= driver.switchTo().alert();
		String text= alert.getText();
		System.out.println(text);
		alert.sendKeys("hi");
		alert.accept();
		
		//print entered input text
		String msg = driver.findElement(By.id("result")).getText();
		System.out.println(msg);
		
		String actText = msg.split(":")[1].trim();
		System.out.println(actText);
	}

}
