package core_Java_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 {	
	@Test (groups={"smoke", "sanity"})
	public void testA() {
		
		Assert.assertEquals("Google", "google");
	}	
	@Test(groups="sanity")
	public void testC() {
		
		Assert.assertEquals("Gmail", "Gmail");
	}	
	@Test
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
