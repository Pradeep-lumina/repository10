package core_Java_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample5 {
	@Test
	public void testA() {
		
		Assert.assertEquals("Google", "Google");
	}	
	@Test (groups="smoke")
	public void testC() {
		
		Assert.assertEquals("Gmail", "gmail");
	}	
	@Test (groups="sanity")
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
