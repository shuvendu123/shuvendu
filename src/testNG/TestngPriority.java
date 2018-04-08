package testNG;

import org.testng.annotations.Test;

public class TestngPriority
{
@Test(priority=3,description="This test case will verify the functionality")
public void test1()
{
	System.out.println("Login to the Applications");
}
@Test(priority=1,description="this test case will certain iteam")
public void test2()
{
	System.out.println("Iteam select");
}
@Test(priority=2,description="This test case will perform checkout applications")
public void test3()
{
	System.out.println("Check out Complited ");
}
}
