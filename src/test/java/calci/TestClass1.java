package calci;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void testCalc1()
	{
		Assert.assertEquals(2+3, 5);
	}
	
	@Test
	public void testcal2()
	{
		Assert.assertEquals(5+8, 13);
	}

}
