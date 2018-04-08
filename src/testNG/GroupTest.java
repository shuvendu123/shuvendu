package testNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupTest 
{
	@BeforeClass(groups={"sanity","Regression","dataBase"})
	public void setUP()
	{
		System.out.println("setUP()");
	}
  @Test(groups={"sanity","Regression"})
  public void test1()
  {
	  System.out.println("groups={sanity,Regression}");
  }
  @Test(groups={"sanity","dataBase"})
  public void test2()
  {
	  System.out.println("(groups={sanity,dataBase})");
  }
  @Test(groups={"sanity"})
  public void test3()
  {
	  System.out.println("(groups={sanity})");
  }
  @Test(groups={"Regression"})
  public void test4()
  {
	  System.out.println("(groups={Regression})");
  }
 
}
