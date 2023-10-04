package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownWithSelectClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

		WebElement cars = driver.findElement(By.id("cars"));

		Select select = new Select(cars);
		Boolean multi = select.isMultiple();
		System.out.println(multi);

		if (multi.equals(true)) {
			select.selectByVisibleText("Volvo");
			select.selectByVisibleText("Saab");
			select.selectByVisibleText("Audi");

		}
		
		Thread.sleep(4000);
		select.deselectByVisibleText("Audi");
		Thread.sleep(4000);
		select.deselectAll();
	}

}
