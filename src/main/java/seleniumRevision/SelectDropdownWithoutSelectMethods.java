package seleniumRevision;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSelectMethods {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil browserUtil = new BrowserUtil();
		WebDriver driver = browserUtil.launchBrowser("chrome");
		browserUtil.enterUrl("https://www.orangehrm.com/30-day-free-trial/");
		Thread.sleep(4000);

		ElementUtil elementUtil = new ElementUtil(driver);

		By country = By.id("Form_getForm_Country");

//		Select select = new Select(elementUtil.getElement(country));
//		List<WebElement> optList = select.getOptions();
//		for (WebElement e : optList) {
//			String text = e.getText();
//			if (text.contains("India")) {
//				e.click();
//				break;
//			}
//		}
		
		//using utility method
		elementUtil.SelectOptionWithoutSelectMethods(country, "Brazil");
	}
}
