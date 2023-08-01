package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(4000);

		WebElement drag_ele = driver.findElement(By.id("draggable"));
		WebElement drop_ele = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
//		actions.clickAndHold(drag_ele).moveToElement(drop_ele).release();     //not valid nothing will happen
//		actions.clickAndHold(drag_ele).moveToElement(drop_ele).release().build();     //not valid nothing will happen

		actions.clickAndHold(drag_ele).moveToElement(drop_ele).release().perform();
		
		//can use this method also drag and drop
		actions.dragAndDrop(drag_ele, drop_ele);

	}

}
