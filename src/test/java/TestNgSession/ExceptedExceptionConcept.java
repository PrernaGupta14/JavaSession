package TestNgSession;

import org.testng.annotations.Test;

public class ExceptedExceptionConcept {
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void searchTest()
	{
		System.out.println("Search Test");
		int i=9/0;
		System.out.println(i);
		
		
	}

}
