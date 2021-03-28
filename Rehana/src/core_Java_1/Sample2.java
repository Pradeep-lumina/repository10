package core_Java_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Test (priority=1)
	public void testA() {
		
		Assert.assertEquals("Google", "Google");
	}	
	@Test (groups="sanity")
	public void testC() {
		
		Assert.assertEquals("Gmail", "Gmail");
	}	
	@Test(groups="smoke")
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
