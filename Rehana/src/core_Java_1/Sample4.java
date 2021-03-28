package core_Java_1;

import org.testng.annotations.Test;

public class Sample4 {
	
	@Test(groups="smoke")
	public void login() {
		System.out.println("Login successful");
	}
	
	@Test(groups="sanity")
	public void search() {
		System.out.println("Search successful");
	}
	
	@Test(dependsOnMethods="search")
	public void Advancesearch() {
		System.out.println("Advancesearch successful");
	}
	
	@Test(dependsOnMethods="Advancesearch")
	public void logout() {
		System.out.println("Logout successful");
	}

}
