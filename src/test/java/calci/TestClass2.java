package calci;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

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
	@Test
	public void testcal3()
	{
		Assert.assertEquals(5+2, 13);
	}
	@Test
	public void testcal4()
	{
		Assert.assertEquals(7-3, 13);
	}
	@Test
	public void testcal5()
	{
		Assert.assertEquals(7+3, 12);
	}
	@Test
	public void testcal6()
	{
		Assert.assertEquals(7+3, 11);
	}
	@Test
	public void testcal7()
	{
		Assert.assertEquals(7+3, 11);
	}
	@Test
	public void testcal8()
	{
		Assert.assertEquals(7+3, 10);
	}
	
	@Test
	public void testcal9()
	{
		Assert.assertEquals(7+3, 10);
	}
	
	@Test
	public void testca20()
	{
		Assert.assertEquals(7+3, 10);
	}
	
	
	@Test
	public void testcal21()
	{
		Assert.assertEquals(7+3, 110);
	}
	
}
