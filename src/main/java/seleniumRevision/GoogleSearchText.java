package seleniumRevision;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

//import seleniumRevision.BrowserUtil;
//import seleniumRevision.ElementUtil;

public class GoogleSearchText {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil bUtil = new BrowserUtil();

		// launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://www.google.com/");

		ElementUtil eUtil = new ElementUtil(driver);	
		By search = By.name("q");
//		eUtil.doSendKeys(search, "naveen automation labs");

//		Thread.sleep(4000);
		
		By sugg_list=By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d' and @role='presentation']/span");
//		List<WebElement> searchList= eUtil.getElements(sugg_list);
//		System.out.println(searchList.size());
		
//		eUtil.getElementsListText(sugg_list);
//		for (WebElement e : searchList) {
//			String text = e.getText();
//			System.out.println(text);
//			
//		}
		
//		eUtil.clickOnListElement(sugg_list, "naveen automation labs youtube");
		
		
		//using utility method
		eUtil.SearchText(search, "naveen automation labs", sugg_list, "youtube");
		
	}

}
