package core_Java_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(groups="sanity")
	public void testA() {
		
		Assert.assertEquals("Google", "Google");
	}	
	@Test (groups="smoke")
	public void testC() {
		
		Assert.assertEquals("Gmail", "Gmail");
	}	
	@Test
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
