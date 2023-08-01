package seleniumRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyClosevsQuit {

	public static void main(String[] args) {


				WebDriver driver = new ChromeDriver();
				
				//Suppose generated Session ID: 123 while driver establish the connection with browser
				driver.get("https://www.google.com");          
				
				//Session ID: 123
				System.out.println( driver.getCurrentUrl());			
				
				 //Here Session ID will be: null as calling quit will close the connection with browser
				//driver.quit();               
				
				//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
				//System.out.println(driver.getTitle());
				
				//Session ID: 123 -> expired
				driver.close();
				
				//new session id will generate
				driver= new ChromeDriver();      
				
				//Session ID: 456
				driver.get("https://www.google.com");
				System.out.println(driver.getTitle());
				
				
				
				
								
			}

		

	}
	


