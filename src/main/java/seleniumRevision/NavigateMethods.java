package seleniumRevision;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver= new ChromeDriver();
		
		//get() & to() method are synonyms of each other bcz to() method internally call get() method
		driver.navigate().to("https://www.amazon.com");
		
		//another way to navigate the url
		driver.navigate().to(new URL("https://www.amazon.com"));
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();
		System.out.println(driver.getTitle());

	}

}
