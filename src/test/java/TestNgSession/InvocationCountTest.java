package TestNgSession;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount = 4)
	public void searchTest()
	{
		System.out.println("Search Test");
		
		
	}


}
