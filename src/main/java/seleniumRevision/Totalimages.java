package seleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Totalimages {

	public static void main(String[] args) {


		BrowserUtil bUtil = new BrowserUtil();

		// launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://www.amazon.com/");

		ElementUtil eUtil = new ElementUtil(driver);	
		By images = By.tagName("img");
		
		// storing the list of locators in dynamic list of WebElements
		List<WebElement> images_list = eUtil.getElements(images);
		
		//print links count, page links count can be dynamic
		int list_count = eUtil.getElementsListCount(images);
		System.out.println("Total Links  : " +list_count);
		
		System.out.println("Source link of images ------------------------------");
		for (WebElement e : images_list) {
			String images_link= e.getAttribute("src");
			System.out.println(images_link);
			}		
	}

}
