package myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest{
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setup()
//	{
//		driver= new ChromeDriver();
//		driver.get("https://www.orangehrm.com/30-day-free-trial/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
	
	@Test
	public void titleTest()
	{
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}
	
	@Test
	public void urlTest()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("30-day-free-trial"));
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

}
