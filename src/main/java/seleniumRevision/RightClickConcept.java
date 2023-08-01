package seleniumRevision;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		By contextBy= By.xpath("//span[text()='right click me']");
//		By contextListBy= By.xpath("//ul[contains(@class, 'context-menu-list')]//span");
		
//		WebElement context_menu = driver.findElement(contextBy);
//		List<WebElement> contextmenu_list = driver.findElements(contextListBy);

//		Actions actions = new Actions(driver);
//		actions.contextClick(context_menu).perform();
//		System.out.println(contextmenu_list.size());
//
//		for (WebElement e : contextmenu_list) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
		
		//--->through the xpath also we can click on the menu option
		//driver.findElement(By.xpath("//span[text()='Quit']")).click();
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.selectRightClickOption(contextBy, "Copy");
	}
}
