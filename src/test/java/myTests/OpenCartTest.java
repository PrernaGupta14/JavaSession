package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
//	WebDriver driver;
	
//	@BeforeTest
//	public void setup()
//	{
//		driver= new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
	
	@Test
	public void titleTest()
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}
	
	@Test
	public void urlTest()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

}
