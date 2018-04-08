package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class NewTest
{
  @Test
  public void f() 
  {
	     System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.co.in");
		 Scerrenshort.handeleScreenShort(driver, "Browserlunch");
  }
}
