package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil browserUtil= new BrowserUtil();
		WebDriver driver= browserUtil.launchBrowser("chrome");
		browserUtil.enterUrl("https://www.orangehrm.com/30-day-free-trial/");
		Thread.sleep(4000);
		
		ElementUtil elementUtil = new ElementUtil(driver);
		
		By country = By.id("Form_getForm_Country");
		//WebElement country_ele = elementUtil.getElement(country);
		
		//Select select = new Select(country_ele);
		
		//select 5th index from dropdown
		//select.selectByIndex(0);
		
		//select by option tag text
		//select.selectByVisibleText("India");
		
		//select by option tag attribute 'value' name
		//select.selectByValue("Aruba");
		
		elementUtil.SelectDropdownOptionByIndex(country, 8);
		
		
	}

}
