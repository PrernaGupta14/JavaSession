package seleniumRevision;

import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// This line only open one browser
		
		// ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		EdgeDriver driver= new EdgeDriver();
		

		driver.get("https://www.google.com");

		// Print Title
		String title = driver.getTitle();
		System.out.println("Actual Title: " + title);

		// Verify Title
		if (title.equals("Google")) {
			System.out.println("Correct Title");
		} else {
			{
				System.out.println("Title not correct");
			}
		}
		
		//return current page url
		System.out.println(driver.getCurrentUrl());
		
		//retrun all the js/html code of the page. we can use contains() method with this to serach the important thing about the page
		System.out.println(driver.getPageSource());

		driver.quit();

	}

}
