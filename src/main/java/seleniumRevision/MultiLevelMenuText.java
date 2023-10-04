package seleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelMenuText {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
		By level1 = By.xpath("//*[@id=\"navBarMegaNav\"]/li/a");
		menuList(level1);
		Thread.sleep(1500);
		
		
	}

	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void menuList(By locator)
	{
		Actions actions = new Actions(driver);
		List<WebElement> list = getElements(locator);
		int count =list.size();
		
		for (WebElement e : list) {
			actions.moveToElement(list.get(count)).build().perform();
				String text= e.getText();
				System.out.println(text);		
		}
	}
}



//    //ul[@id='navBarMegaNav']//a    - left text
