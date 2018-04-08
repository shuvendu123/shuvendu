package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecuation 
{
	WebDriver driver;
	@Test
	@Parameters("Browser")
	public void TestParallel(String Browsername )
	{
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\Automations\\Selenium_Automations\\Driver\\chromedriver.exe");
		    driver =new ChromeDriver();	
		}
		else if(Browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\Automations\\Selenium_Automations\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(Browsername.equalsIgnoreCase("InternetExplore"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Automations\\Selenium_Automations\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("https://www.google.co.in");
		String title = driver.getTitle();
		Reporter.log(title);
		driver.close();
	}
	
	
	
	
}
