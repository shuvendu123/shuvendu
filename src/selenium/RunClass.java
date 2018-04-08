package selenium;
import static org.testng.Assert.assertEquals;
import java.util.logging.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class RunClass 
{
	@Test
	public void test()
	{
    Logger log=Logger.getLogger("RunClass");
    PropertyConfigurator.configure("Log4j.properties");
	System.setProperty("webdriver.chrome.driver", "F:\\Automations\\Selenium_Automations\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	log.info("Lunch Browser");
	driver.get("https://www.google.co.in");
	log.info("Enter Url");
	driver.manage().window().maximize();
	log.info("maximize the Browser");
	String actualTitle = driver.getTitle();
	String ExceptedTitle="Google";
	assertEquals(ExceptedTitle, actualTitle);
	log.info("Verify CurrentPage Title");
	driver.close();
	log.info("Close the Current Browser");
	}
}