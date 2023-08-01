package seleniumRevision;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CricInfoScoreTest {

	public static void main(String[] args) {

		BrowserUtil bUtil = new BrowserUtil();

		// launch chrome browser
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-east-asia-pacific-qlf-2023-1383050/papua-new-guinea-vs-japan-12th-match-1383100/full-scorecard");

		ElementUtil eUtil = new ElementUtil(driver);
		
		By cricketer_name= By.xpath("//span[text()='Declan Suzuki']/ancestor::td[contains(@class, 'ds-w-0')]");		
		System.out.println(eUtil.getElementText(cricketer_name));
		
		By battingInfo=	By.xpath("//span[text()='Declan Suzuki']/ancestor::td[contains(@class, 'ds-w-0')]/following-sibling::td");
		List<WebElement> infoElements= eUtil.getElements(battingInfo);
		List<String> row_details = new ArrayList<String>();

		for (WebElement e : infoElements) {
			String text= e.getText();
			row_details.add(text);
			}
		System.out.println(row_details);
	}

}
