package seleniumRevision;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class SelectDropdownWithoutSelectClass {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil browserUtil = new BrowserUtil();
		WebDriver driver = browserUtil.launchBrowser("chrome");
		browserUtil.enterUrl("https://www.orangehrm.com/30-day-free-trial/");
		Thread.sleep(4000);

		ElementUtil elementUtil = new ElementUtil(driver);
		
		//using xpath or css selector we can select dropdown option
		By options = By.xpath("//select[@id='Form_getForm_Country']/option");
//		List<WebElement> opList =  driver.findElements(options);
//		for (WebElement e : opList) {
//			String text= e.getText();
//			if (text.contains("India")) {
//				e.click();
//				break;
//			}	
//		}
		
		elementUtil.SelectOptionWithoutSelectClass(options, "India");
	}

}
