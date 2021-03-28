package core_Java_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample6 {
	
	@Test(groups="smoke")
	public void testA() {
		
		Assert.assertEquals("Google", "Google");
	}	
	@Test (groups="sanity")
	public void testC() {
		
		Assert.assertEquals("Gmail", "gmail");
	}	
	@Test (dependsOnMethods="testC", alwaysRun=true)
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
	}


}
