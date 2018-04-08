package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations {
	@Test
	public void test() 
	{
		System.out.println("test()<5>");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("beforeMethod()<4>");
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("afterMethod()<6>");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass()<3>");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass()<7>");
	}
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("beforeTest()<2>");
	}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("afterTest()<8>");
	}
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("beforeSuite()<1>");
	}
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("afterSuite()<9>");
	}
}
