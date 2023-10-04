package myTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTestUsingDDA {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

	@DataProvider
	public Object[][] data() {
		return new Object[][] { { "Alpha", "Beta", "hgvhgvh@jhgjh.com", "456789", "ghgj" },
				{ "Parrty", "Hfyf", "jhbj@jgjhb.com", "908765", "nbjb" } };
	}

	@Test(dataProvider = "data")
	public void register(String fname, String lname, String email, String number, String pswd) {
		driver.findElement(By.id("input-firstname")).sendKeys(fname);
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lname);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(number);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pswd);
		driver.findElement(By.id("input-password")).clear();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
