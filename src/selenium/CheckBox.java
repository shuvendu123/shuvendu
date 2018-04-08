package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBox 
{
	WebDriver driver;
@BeforeClass
public void SetUp()
{
	System.setProperty("webdriver.chrome.driver", "F:\\Automations\\Selenium_Automations\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
@Test
public void Test1()
{
	driver.get("https://www.facebook.com");
    String xp="//input[@name='sex']";
    List<WebElement> allcheckbox = driver.findElements(By.xpath(xp));
    for(int i=0;i<allcheckbox.size();i++)
    {
    	 WebElement checkbox = allcheckbox.get(i);
    	 String stringvalue = checkbox.getText();
    	 System.out.println(stringvalue);
    	 checkbox.click();
    }
}
@AfterClass
public void close()
{
	driver.quit();
}
}
