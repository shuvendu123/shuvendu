package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionScript
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}	
@Test
public void test()
{
	driver.get("https://www.google.co.in");
	SoftAssert assertions=new SoftAssert();
	System.out.println("Test is started");
	assertions.assertEquals("Google", "Google");
	System.out.println("Test complited");
	assertions.assertAll();
	String ActualTitle = driver.getTitle();
	String Excepted_Title="Google";
	System.out.println(ActualTitle);
	Assert.assertEquals(ActualTitle,Excepted_Title);
	Assert.assertTrue(ActualTitle.contains("Google"));
	System.out.println("Test complited_Page Title is verify");
	//Assert.assertEquals(Title, "Google","hello selenium");
	String Excepted_Pagesource = driver.getPageSource();
	Assert.assertTrue(Excepted_Pagesource.contains("Google")); 
}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
