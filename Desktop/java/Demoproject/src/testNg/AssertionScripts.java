package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionScripts
{
	@Test
	public void test2()
	{
    SoftAssert assertion= new SoftAssert();
    System.out.println("this is my test of softassertion");
    assertion.assertEquals(12, 13);
    System.out.println("Assertion complete");
    assertion.assertAll();
	}
	
	@Test
	public void test1()
	{
		 System.out.println("Assertion test1 start");
	 Assert.assertEquals(12, 13,"it is not found");
	}
	
}
