package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNG.TestNGListener.class)(class level we can use)
public class MyFirstTestcase 
{
@Test
public void GoogleTitleVerify()
{
	System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("");
	System.out.println(driver.getTitle());
	driver.quit();	
}
@Test
public void Titlematch()
{
System.out.println("Test 2 Dummay");
Assert.assertTrue(false);
}
}
