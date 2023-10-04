package seleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\PRERNA GUPTA\\Documents\\Doc1.docx");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		
		//---------> file upload will not work with action class
			
		//------> file upload in iframe element
//		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
//		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		//----->switch to frame
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
//		driver.findElement(By.name("RESULT_FileUpload-6")).sendKeys("C:\\Users\\PRERNA GUPTA\\Documents\\Doc1.docx");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		
		
		
	
		
	
	}

}
