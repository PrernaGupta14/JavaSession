package seleniumRevision;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithOptions {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil browserUtil = new BrowserUtil();
		WebDriver driver = browserUtil.launchBrowser("chrome");
		browserUtil.enterUrl("https://www.orangehrm.com/30-day-free-trial/");
		Thread.sleep(4000);

		ElementUtil elementUtil = new ElementUtil(driver);

		By country = By.id("Form_getForm_Country");

		List<String> actList = elementUtil.getOptionsListText(country);
		List<String> exList = Arrays.asList("India", "Brazil");

		if (actList.containsAll(exList)) {
			System.out.println(exList + " is available - PASS ");
		}
		
		System.out.println(elementUtil.optionsListCount(country));

	}

}
