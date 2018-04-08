package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HowToVerifyErrorMassage
{
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
@Test
public void test1()
{
	driver.get("http://www.Facebook.com");
//	String Actual_Error = driver.findElement(By.xpath("//input[@an='av1']")).getText();
	String Actual_Error = driver.findElement(By.xpath("//input[@an='av']")).getAttribute("innerHtml");
	String Excepted_Error="please enter your email.";
	//Type 1
	Assert.assertEquals(Actual_Error, Excepted_Error);
	//Type 2
	Assert.assertTrue(Actual_Error.contains("please enter your email."));
	System.out.println("Test complited ");
}
@AfterClass
public void tearDown()
{
	 
}
}
