package TestNgSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test (priority = 0)
	public void orderTest()
	{
		System.out.println("Order Test");
		Assert.assertEquals("Mac", "Mac");
	}

	@Test (priority = 2)
	public void cartTest()
	{
		System.out.println("Cart Test");
		Assert.assertEquals("Debit", "Debit");
	}
	
	@Test (priority = 3)
	public void searchTest()
	{
		System.out.println("Search Test");
		Assert.assertEquals("Google", "Google");
	}
	
	@Test (priority = -1)
	public void paymentTest()
	{
		System.out.println("Payment Test");
		Assert.assertEquals(100, 100);
	}
	
}
