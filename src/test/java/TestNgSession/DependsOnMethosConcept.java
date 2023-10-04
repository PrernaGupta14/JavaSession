package TestNgSession;

import org.testng.annotations.Test;

public class DependsOnMethosConcept {

	@Test
	public void loginTest() {
		System.out.println("Login Test");
	//	int i=9/0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("Search Test");
	}

	@Test(dependsOnMethods = "searchTest")
	public void selectProductTest() {
		System.out.println("Select Product Test");
	}
}
