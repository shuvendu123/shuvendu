package testNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsOnTest
{
	 @Test
	  public void login()
	  {
		  System.out.println("hello");
		 // Assert.assertTrue(true);
	  }
	  @Test(dependsOnMethods={"login","logout"})
	  public void test2()
	  {
		  System.out.println("world");
	  }
	  @Test(dependsOnMethods={"login"})
	  public void logout()
	  {
		  System.out.println("java");
		  Assert.assertTrue(false);
	  }
}
