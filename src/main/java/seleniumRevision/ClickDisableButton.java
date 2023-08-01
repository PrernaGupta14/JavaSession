package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickDisableButton {

	public static void main(String[] args) {

		BrowserUtil browserUtil= new BrowserUtil();
		WebDriver driver=	browserUtil.launchBrowser("chrome");
		
		browserUtil.enterUrl("https://mcdonline.nic.in/miscedmc/web/citizen/registration");
		
		ElementUtil elementUtil = new ElementUtil(driver);
		
		System.out.println("hello");
		
		By verify_btn = By.xpath("//*[@id=\"verifyCitRegOtpBtnId\"]");
		
//		When we try to click on disabled button then selenium gives 'ElementClickInterceptedException': element click intercepted: Element is not clickable 
		elementUtil.doClick(verify_btn);
		
		 String btn_name= elementUtil.getAttributeValue(verify_btn, "name");
		 System.out.println(btn_name);
	}

}
