package seleniumRevision;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class TotalLinksConcept {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		// launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://www.amazon.com/");

		ElementUtil eUtil = new ElementUtil(driver);	
		By links = By.tagName("a");
		
//		List<WebElement> links_list = eUtil.getElements(links);
		
		//print links count, page links count can be dynamic
		int count = eUtil.getElementsListCount(links);
		System.out.println("Total Links : " +count);

//		for(int i=0; i<count; i++)
//		{
//			 we can get spaces in o/p as may be on web page there's no text for links
//			String link_str = links_list.get(i).getText();
//			System.out.println(link_str);
//		}
			
// 	--->to ignore the blank spaces 
//		for(int i=0; i<count; i++)
//		{
//			String link_str = links_list.get(i).getText();
//			if (!link_str.isEmpty()) {
//				System.out.println(i +"  "+link_str);
//			}
//		}
		
// 	print list using for each loop	
//		int count1 =0;
//		for (WebElement e : links_list) {
//			String text = e.getText();
//			if (!text.isEmpty()) {
//				System.out.println(count1 +"  "+text);				
//			}
//			count1++;
//	}
		
// 	print using ElementUtil class method's
		eUtil.getElementsListText(links);
	}

}
