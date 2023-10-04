package myTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class GoogleTest extends BaseTest {
//	WebDriver driver;
//	@BeforeTest
//	private void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}

	@Test(priority = 1)
	public void TiltleTest() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", "Google");
	}

	@Test(priority = 2)
	public void urlTest() {
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}

	@Test(priority = 3)
	public void searchTest() {
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.id("APjFqb")).submit();
		Assert.assertTrue(driver.getCurrentUrl().contains("selenium"));
}

//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

}
