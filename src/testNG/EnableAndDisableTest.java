package testNG;

import org.testng.annotations.Test;

public class EnableAndDisableTest {
	@Test(enabled = true,description="I AN LOGIN TEST WITH VALID DATA")
	public void test() {
     System.out.println("test()");
	}
	@Test(enabled = false,description="I AN LOGIN TEST WITH VALID DATA")
	public void test1() {
     System.out.println("test1()");
	}
}
