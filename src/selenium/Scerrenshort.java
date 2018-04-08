package selenium;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Scerrenshort 
{
	
 public static void handeleScreenShort(WebDriver driver,String screenshortname)
 {
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 try {
		org.apache.commons.io.FileUtils.copyFile(source, new File(".\\Screenshort\\"+screenshortname+".png"));
		
	     } 
	 catch (IOException e) 
	 {
		System.out.println(e.getMessage());
	 } 
 }
}
