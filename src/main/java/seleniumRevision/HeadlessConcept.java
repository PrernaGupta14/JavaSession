package seleniumRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {

		//headless: No browser or invisble browser or without UI
		
		ChromeOptions co =new ChromeOptions();
		
		//The method setHeadless(boolean) from the type ChromiumOptions<ChromeOptions> is deprecated
		//co.setHeadless(true);
		
		co.addArguments("--headless=new");
		//co.addArguments("--headless=chrome");

		//if we''ll not pass the options object as a parameter in wedriver constructor then headless mode will not work
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.amazon.com");
		System.out.println( driver.getTitle());
	}

}
