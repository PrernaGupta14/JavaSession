package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrameHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		
		WebElement element = driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
		
		Actions actions = new Actions(driver);
		actions.sendKeys(element, "prerna")
		.sendKeys(Keys.TAB)
		.sendKeys("Delhi")
		.sendKeys(Keys.TAB)
		.sendKeys("09/08/2023")
		.sendKeys(Keys.TAB)
		.sendKeys("Hello")
		.sendKeys(Keys.TAB)
		.build().perform();
			
		//upload file
		driver.findElement(By.name("RESULT_FileUpload-6")).sendKeys("C:\\Users\\PRERNA GUPTA\\Documents\\Doc1.docx");
	
		actions
		.sendKeys(Keys.TAB)
		.sendKeys("mahi")
		.sendKeys(Keys.TAB)
		.sendKeys("sharma")
		.sendKeys(Keys.TAB)
		.sendKeys("saket")
		.sendKeys(Keys.TAB)
		.sendKeys("south")
		.sendKeys(Keys.TAB)
		.sendKeys("delhi")
		.sendKeys(Keys.TAB)
		.sendKeys("Indiana")
		.sendKeys(Keys.TAB)
		.sendKeys("242309")
		.sendKeys(Keys.TAB)
		.sendKeys("1234567890")
		.sendKeys(Keys.TAB)
		.sendKeys("abygjhgc@gmail.com")
		.build().perform();	
		
		// coming back to the main page
		driver.switchTo().defaultContent();
	}

}
