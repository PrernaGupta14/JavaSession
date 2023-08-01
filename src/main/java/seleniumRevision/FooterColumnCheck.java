package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterColumnCheck {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver= bUtil.launchBrowser("chrome");
		
		bUtil.enterUrl("https://www.amazon.com/");
		
		ElementUtil eUtil = new ElementUtil(driver);
		By FooterHeaderText = By.xpath("//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']//div");
		
		String text=  eUtil.getElementText(FooterHeaderText);
		System.out.println(text);
	}

}



