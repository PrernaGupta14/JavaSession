package seleniumRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {
	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement element = driver.findElement(By.linkText("Cranbrook, Canada"));
		
		String string1= driver.findElement(with(By.tagName("p")).toRightOf(element)).getText();
		System.out.println(string1);
		
		String string2= driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
		System.out.println(string2);
		
		String string3= driver.findElement(with(By.tagName("p")).below(element)).getText();
		System.out.println(string3);
		
		String string4= driver.findElement(with(By.tagName("p")).above(element)).getText();
		System.out.println(string4);
		
		String string5= driver.findElement(with(By.tagName("p")).near(element)).getText();
		System.out.println(string5);
		
		
		
		
		
		
	}

}
