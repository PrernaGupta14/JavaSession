package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleLangLinks {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("chrome");

		bUtil.enterUrl("https://www.google.com/");
		
		ElementUtil eUtil = new ElementUtil(driver);
		By lang_text = By.xpath("//div[@id='SIvCob']/a");

		System.out.println(eUtil.getElementsListCount(lang_text));

		eUtil.getElementsListText(lang_text);
		
		eUtil.clickOnListElement(lang_text, "मराठी");
		
		eUtil.getElementsListAttribute(lang_text, "href");

	}

}
